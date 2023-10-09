package com.service.client;

import com.calculationService.CalculationEngineResponseList;
import com.service.config.TemplateProperties;
import com.templateService.TemplateRequest;
import com.templateService.TemplateResponseList;
import com.templateService.TemplateServiceGrpc;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Component;


@Component
public class TemplateClient {

    private String userName = "user1";
    private String password = "123456";
    private final ManagedChannel channel;
    private TemplateServiceGrpc.TemplateServiceBlockingStub templateServiceStub;

    public TemplateClient(TemplateProperties properties) {

        // Create a ManagedChannel to connect to the gRPC server
        channel = ManagedChannelBuilder.forAddress(properties.getHost(), properties.getPort())
                .usePlaintext() // Use plaintext connection for simplicity
                .build();

        // Create the TemplateServiceStub
        templateServiceStub = TemplateServiceGrpc.newBlockingStub(channel);
    }
    public TemplateResponseList callTemplateService(TemplateRequest request) {

        TemplateResponseList responseList = templateServiceStub.fetchTemplate(request);
        //channel.shutdown();
        return responseList;
    }
}