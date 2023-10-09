package com.bootcamp.orchestrator.auth;

import com.grpcauth.auth.AuthServiceGrpc;
import com.grpcauth.auth.AuthStruct;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TokenRequester {

    public String getTokenFromAuthenticationServer(String username, String password) throws EmptyTokenException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009)
                .usePlaintext()
                .build();

        AuthServiceGrpc.AuthServiceBlockingStub stub = AuthServiceGrpc.newBlockingStub(channel);
        AuthStruct.AuthRequest request = AuthStruct.AuthRequest.newBuilder().setUsername(username).setPassword(password).build();
        AuthStruct.AuthResponse response = stub.authenticate(request);
        if (response.getToken().equals("")) {
            throw new EmptyTokenException(response.getError());
        }
        return response.getToken();
    }
}