package com.bootcamp.orchestrator.client;

import com.bootcamp.orchestrator.auth.TokenRequester;
import com.bootcamp.orchestrator.config.GetDataProperties;
import com.grpcAssignment.GetDataRequest;
import com.grpcAssignment.GetDataResponse;
import com.grpcAssignment.GetDataServiceGrpc;
import io.grpc.ClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import org.springframework.stereotype.Component;

@Component
public class GetDataClient {

    private String userName = "user1";
    private String password = "123456";
    private final ManagedChannel channel;
    private GetDataServiceGrpc.GetDataServiceBlockingStub getDataServiceStub;

    public GetDataClient(GetDataProperties properties) {

        TokenRequester tokenRequester = new TokenRequester();
        String token = null;

        try {
            token = tokenRequester.getTokenFromAuthenticationServer(userName, password);
        } catch (Exception e) {
            e.getMessage();
        }

        // Create a ManagedChannel to connect to the gRPC server
        channel = ManagedChannelBuilder.forAddress(properties.getHost(), properties.getPort())
                .usePlaintext() // Use plaintext connection for simplicity
                .build();

        // Create the getDataServiceStub
        getDataServiceStub = GetDataServiceGrpc.newBlockingStub(channel);

        Metadata headers = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("Authorization", Metadata.ASCII_STRING_MARSHALLER);
        headers.put(key, "Bearer" + token);

        ClientInterceptor interceptor = MetadataUtils.newAttachHeadersInterceptor(headers);

        getDataServiceStub = getDataServiceStub.withInterceptors(interceptor);

    }
    public GetDataResponse callGetDataService(GetDataRequest request) {
        // Construct getDataRequest
        GetDataRequest getDataRequest = GetDataRequest.newBuilder()
                .setRequestHeader(request.getRequestHeader())
                .setPii(request.getPii())
                .build();

        // Make a gRPC call to the GetData service
        GetDataResponse response = getDataServiceStub.getPanData(getDataRequest);
        //channel.shutdown();

        return response;
    }
}