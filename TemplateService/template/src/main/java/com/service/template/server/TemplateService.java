package com.service.template.server;

import com.google.gson.Gson;
import com.service.template.util.FeatureData;
import com.service.template.util.TemplateData;
import com.sun.tools.javac.Main;
import com.templateService.ErrorHeader;
import com.templateService.Feature;
import com.templateService.ResponseHeader;
import com.templateService.Template;
import com.templateService.TemplateRequest;
import com.templateService.TemplateResponse;
import com.templateService.TemplateResponseList;
import com.templateService.TemplateServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;

@GrpcService
public class TemplateService extends TemplateServiceGrpc.TemplateServiceImplBase {

    private final Gson gson = new Gson(); // Create a Gson instance

    @Override
    public void fetchTemplate(TemplateRequest request, StreamObserver<TemplateResponseList> responseObserver) {
        System.out.println("\nTemplate Service is started...\n");
        System.out.println("Template Request : \n" + request);

        TemplateResponseList.Builder responseListBuilder = TemplateResponseList.newBuilder();

        for (Template template : request.getTemplatesList()) {
            String templateId = template.getTemplateID();
            String jsonFileName = templateId + ".json";

            // Attempt to access the resource as an InputStream
            try (Reader reader = new InputStreamReader(Objects.requireNonNull(Main.class.getClassLoader().getResourceAsStream(jsonFileName)))) {
                if (reader != null) {
                    // Use Gson to parse the JSON content into an object
                    TemplateData templateData = gson.fromJson(reader, TemplateData.class);

                    // Build the response for each template
                    TemplateResponse.Builder templateResponseBuilder = TemplateResponse.newBuilder();
                    templateResponseBuilder.setTemplateID(templateData.getTemplateID());
                    templateResponseBuilder.setTemplateName(templateData.getTemplateName());

                    // Assuming your TemplateData contains a List of features
                    for (FeatureData featureData : templateData.getFeatureList()) {
                        Feature.Builder featureBuilder = Feature.newBuilder();
                        featureBuilder.setSeqID(featureData.getSeqID());
                        featureBuilder.setFeatureName(featureData.getFeatureName());
                        featureBuilder.setAttributeName(featureData.getAttributeName());
                        templateResponseBuilder.addFeatureList(featureBuilder.build());
                    }

                    // Add the response for this template to the list
                    responseListBuilder.addTemplateResponses(templateResponseBuilder.build());
                } else {
                    System.err.println("Resource not found: " + jsonFileName);
                }
            } catch (Exception e) {
                System.err.println("Error processing JSON: " + e.getMessage());
            }
        }

        if (responseListBuilder.getTemplateResponsesCount() == 0) {
            ErrorHeader.Builder errorHeaderBuilder = ErrorHeader.newBuilder();
            errorHeaderBuilder.setErrorCode("500");
            errorHeaderBuilder.setErrorDesc("Internal Server Error");
            responseListBuilder.setErrorHeader(errorHeaderBuilder);
        } else {
            ResponseHeader.Builder responseHeaderBuilder = ResponseHeader.newBuilder();
            responseHeaderBuilder.setResponseCode("200");
            responseHeaderBuilder.setResponseDesc("OK");
            responseListBuilder.setResponseHeader(responseHeaderBuilder);
        }

        System.out.println("......................Template Response.................\n" + responseListBuilder);

        // Send the response list to the client
        responseObserver.onNext(responseListBuilder.build());
        responseObserver.onCompleted();
    }
}
