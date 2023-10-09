package com.authgrpc.client;

public class AuthServiceLocalClient {
//	public void callGrpcService() {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9003)
//            .usePlaintext()
//            .build();
//
//        SquareServiceGrpc.SquareServiceBlockingStub stub = SquareServiceGrpc.newBlockingStub(channel);
//
//        ConnectivityState state = channel.getState(true);
//        System.out.println("Channel state: " + state);
//
//        int number = 5; // The number you want to square
//        SquareStruct.SquareRequest request = SquareStruct.SquareRequest.newBuilder()
//            .setNumber(number)
//            .build();
//
//        SquareStruct.SquareResponse response = stub.square(request);
//        System.out.println("Square result: " + response.getResult());
//        ConnectivityState state2 = channel.getState(true);
//        System.out.println("Channel state: " + state2);
//
//        channel.shutdown();
//        System.out.println("channel shutting down......");
//        ConnectivityState state3 = channel.getState(true);
//        System.out.println("Channel state: " + state3);
//}
}
