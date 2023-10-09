package com.bootcamp.orchestrator.server;

import com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest;
import com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse;
import com.bootcamp.grpc.orchestrator.proto.OrchestratorServiceGrpc;
import com.bootcamp.orchestrator.client.CalculationEngineClient;
import com.bootcamp.orchestrator.client.GetDataClient;
import com.bootcamp.orchestrator.requestbuilder.CalculationEngineRequestBuilder;
import com.bootcamp.orchestrator.requestbuilder.GetDataRequestBuilder;
import com.bootcamp.orchestrator.responsebuilder.OrchestratorResponseBuilder;
import com.bootcamp.orchestrator.util.JsonToByteArrayConverter;
import com.bootcamp.orchestrator.util.OrchestratorRequestProcessor;
import com.calculationService.CalculationEngineRequest;
import com.calculationService.CalculationEngineResponseList;
import com.grpcAssignment.GetDataRequest;
import com.grpcAssignment.GetDataResponse;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.Getter;
import lombok.Setter;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

@Setter
@Getter
@GrpcService
public class OrchestratorService extends OrchestratorServiceGrpc.OrchestratorServiceImplBase {

    @Autowired
    GetDataClient getDataClient;
    @Autowired
    CalculationEngineClient calculationEngineClient;
    @Autowired
    JsonToByteArrayConverter getDataResponseConverter;
    private String byteArraySubjectJson;

    private String subjectId;

    @Override
    public void calculateParameters(OrchestratorRequest request, StreamObserver<OrchestratorResponse> responseObserver) {

        try {
            // Request coming from Client
            System.out.println("..............................Client Request..............................\n " + request);

            // OrchestratorRequest processing to extract templateIds and products
            Map<String, String> productMap = OrchestratorRequestProcessor.extractTemplateIdsAndProducts(request);

            // Building GetDataRequest using the builder
            GetDataRequest getDataRequest = GetDataRequestBuilder.buildGetDataRequest(request);
            System.out.println("..............................GetData Request..............................\n " + getDataRequest);

            // Make a gRPC call to the GetDataService using the client
            GetDataResponse getDataResponse = getDataClient.callGetDataService(getDataRequest);
            subjectId = getDataResponse.getLoansList().get(0).getSubjectId();
            System.out.println("..............................Full GetDataResponse..............................\n " + getDataResponse);

            // Converting JSON Response into SubjectByteArray
            byteArraySubjectJson = getDataResponseConverter.convertToBase64Json(getDataResponse);
            System.out.println("ByteArray : " + byteArraySubjectJson);

            // Building CalculationEngineRequest using the builder
            CalculationEngineRequest calculationRequest = CalculationEngineRequestBuilder.buildCalculationEngineRequest(request, byteArraySubjectJson);
            System.out.println("\n..............................CalculationEngine Request..............................\n " + calculationRequest);

            // Make a gRPC call to the CalculationEngineService using client
            CalculationEngineResponseList calculationResponses = calculationEngineClient.callCalculationEngineService(calculationRequest);
            System.out.println("..............................CalculationEngine Response..............................\n " + calculationResponses);

            // Generate OrchestratorResponse based on the processed calculationEngineResponse
            OrchestratorResponse orchestratorResponse = OrchestratorResponseBuilder.buildOrchestratorResponse(calculationResponses,productMap, subjectId);
            System.out.println("..............................Final Response..............................\n " + orchestratorResponse);

            // Send the response
            responseObserver.onNext(orchestratorResponse);
            responseObserver.onCompleted();


        } catch (StatusRuntimeException e) {
            System.err.println("gRPC client is unable to establish a connection with the remote service : " + e.getMessage());

        } catch (Exception e) {
            System.err.println("An error occurred : " + e.getMessage());
            e.printStackTrace();
        }

    }
}

