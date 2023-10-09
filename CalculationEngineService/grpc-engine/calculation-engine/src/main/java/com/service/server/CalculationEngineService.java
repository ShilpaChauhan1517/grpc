package com.service.server;

import com.calculationService.CalculationEngineRequest;
import com.calculationService.CalculationEngineResponse;
import com.calculationService.CalculationEngineResponseList;
import com.calculationService.CalculationEngineServiceGrpc;
import com.calculationService.ErrorHeader;
import com.calculationService.FeatureResponse;
import com.calculationService.ResponseHeader;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.service.client.TemplateClient;
import com.service.requestbuilder.TemplateRequestBuilder;
import com.service.util.ByteArrayToJsonConverter;
import com.service.util.FeatureCalculator;
import com.templateService.TemplateRequest;
import com.templateService.TemplateResponseList;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.service.util.FeatureCalculator.calculateTotalNumberOfClosedLoans;
import static com.service.util.FeatureCalculator.calculateTotalNumberOfLoans;
import static com.service.util.FeatureCalculator.calculateTotalNumberOfOpenLoans;

@GrpcService
public class CalculationEngineService extends CalculationEngineServiceGrpc.CalculationEngineServiceImplBase {

    @Autowired
    ByteArrayToJsonConverter byteArraySubjectJson;

    @Autowired
    TemplateClient templateClient;

    @Override
    public void performCalculation(CalculationEngineRequest request, StreamObserver<CalculationEngineResponseList> responseObserver) {

        // Fetching SubjectByteArray from CalculationEngine Request
        String subjectArray = request.getSubjectData(0).getSubject();

        // Converting SubjectArray into Json Object
        JsonObject jsonObject = byteArraySubjectJson.convertFromBase64Json(subjectArray);

        // Building TemplateRequest using the builder
        TemplateRequest templateRequest = TemplateRequestBuilder.buildTemplateRequest(request);

        // Make a gRPC call to the GetDataService using the client
        TemplateResponseList templateResponses = templateClient.callTemplateService(templateRequest);

        // Create a list of template IDs to assign to each response
        List<String> templateIds = request.getModelsList().stream().map(model -> model.getTemplateId()) .collect(Collectors.toList());

        // Create a list to hold CalculationEngineResponse objects
        List<CalculationEngineResponse> responseList = new ArrayList<>();

        for (int i = 0; i < request.getModelsList().size(); i++) {
            List<FeatureResponse> featureResponses = new ArrayList<>();

            for (int j = 0; j < templateResponses.getTemplateResponses(i).getFeatureListCount(); j++) {
                String featureName = templateResponses.getTemplateResponses(i).getFeatureList(j).getFeatureName();
                int featureValue = FeatureCalculator.calculateFeatureValue(jsonObject, featureName);

                FeatureResponse featureResponse = FeatureResponse.newBuilder()
                        .setFeatureName(featureName)
                        .setFeatureValue(String.valueOf(featureValue))
                        .build();

                featureResponses.add(featureResponse);
            }

            ResponseHeader responseHeader = ResponseHeader.newBuilder()
                    .setResponseCode("200")
                    .setResponseDesc("Calculation performed successfully")
                    .build();

            ErrorHeader errorHeader = ErrorHeader.newBuilder()
                    .setErrorCode("")
                    .setErrorDesc("")
                    .build();

            // Get the templateId from the list based on the loop index
            String templateId = templateIds.get(i);

            // Create a CalculationEngineResponse object
            CalculationEngineResponse response = CalculationEngineResponse.newBuilder()
                    .setResponseHeader(responseHeader)
                    .setErrors(errorHeader)
                    .setTemplateId(templateId)
                    .addAllFeatureResponses(featureResponses)
                    .build();

            responseList.add(response);
        }

        // Create a CalculationEngineResponseList containing all responses
        CalculationEngineResponseList responseListMessage = CalculationEngineResponseList.newBuilder()
                .addAllResponses(responseList)
                .build();

        System.out.println(".....................................................................");
        System.out.println("CalculationEngine Response : \n" + responseListMessage);

        // Send the response list to the client
        responseObserver.onNext(responseListMessage);
        responseObserver.onCompleted();
    }

}

