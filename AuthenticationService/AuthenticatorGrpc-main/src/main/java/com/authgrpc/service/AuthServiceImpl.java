package com.authgrpc.service;

import com.grpcauth.auth.AuthStruct;
import net.devh.boot.grpc.server.service.GrpcService;
import com.grpcauth.auth.AuthServiceGrpc.AuthServiceImplBase;

@GrpcService
public class AuthServiceImpl extends AuthServiceImplBase {

    @Override
    public void authenticate(com.grpcauth.auth.AuthStruct.AuthRequest request,
            io.grpc.stub.StreamObserver<com.grpcauth.auth.AuthStruct.AuthResponse> responseObserver) {
          
        String username = request.getUsername();
        String password = request.getPassword();
        UserAuthenticator userAuthenticator = new UserAuthenticator();
        // Replace this with your actual authentication logic
        boolean isAuthenticated = userAuthenticator.authenticateUser(username, password);
        
        if (isAuthenticated) {
            JwtUtilService JUS = new JwtUtilService();
            String token = JUS.generateToken(username);
            
            responseObserver.onNext(AuthStruct.AuthResponse.newBuilder().setToken(token).build());
            responseObserver.onCompleted();
        } else {
            // If authentication fails, you can return an error response
            responseObserver.onNext(AuthStruct.AuthResponse.newBuilder()
                    .setError("Authentication failed: Invalid username or password.")
                    .build());
            responseObserver.onCompleted();
        }
    }
    
    }

