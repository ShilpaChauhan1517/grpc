package com.bootcamp.orchestrator.client;

import com.bootcamp.orchestrator.config.CalculationEngineProperties;
import com.calculationService.CalculationEngineRequest;
import com.calculationService.CalculationEngineResponse;
import com.calculationService.CalculationEngineResponseList;
import com.calculationService.CalculationEngineServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;

@Component
public class CalculationEngineClient {
    private final ManagedChannel channel;
    private final CalculationEngineServiceGrpc.CalculationEngineServiceBlockingStub calculationEngineServiceStub;

    public CalculationEngineClient(CalculationEngineProperties properties) {

        // Use properties.getHost() and properties.getPort() to create a ManagedChannel that connect to the gRPC server
        channel = ManagedChannelBuilder.forAddress(properties.getHost(), properties.getPort())
                .usePlaintext() // Use plaintext connection for simplicity
                .build();

        // Create the calculationEngineServiceStub
        calculationEngineServiceStub = CalculationEngineServiceGrpc.newBlockingStub(channel);
    }

    public CalculationEngineResponseList callCalculationEngineService(CalculationEngineRequest calculationEngineRequest) {

        // Make a gRPC call to the Calculation Engine service
        CalculationEngineResponseList responseList = calculationEngineServiceStub.performCalculation(calculationEngineRequest);

        //channel.shutdown();
        return responseList;
    }
}