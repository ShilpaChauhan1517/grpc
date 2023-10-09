package com.grpcAssignment;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: get_data.proto")
public final class GetDataServiceGrpc {

  private GetDataServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpcAssignment.GetDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcAssignment.GetDataRequest,
      com.grpcAssignment.GetDataResponse> getGetPanDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPanData",
      requestType = com.grpcAssignment.GetDataRequest.class,
      responseType = com.grpcAssignment.GetDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcAssignment.GetDataRequest,
      com.grpcAssignment.GetDataResponse> getGetPanDataMethod() {
    io.grpc.MethodDescriptor<com.grpcAssignment.GetDataRequest, com.grpcAssignment.GetDataResponse> getGetPanDataMethod;
    if ((getGetPanDataMethod = GetDataServiceGrpc.getGetPanDataMethod) == null) {
      synchronized (GetDataServiceGrpc.class) {
        if ((getGetPanDataMethod = GetDataServiceGrpc.getGetPanDataMethod) == null) {
          GetDataServiceGrpc.getGetPanDataMethod = getGetPanDataMethod = 
              io.grpc.MethodDescriptor.<com.grpcAssignment.GetDataRequest, com.grpcAssignment.GetDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcAssignment.GetDataService", "getPanData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcAssignment.GetDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcAssignment.GetDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new GetDataServiceMethodDescriptorSupplier("getPanData"))
                  .build();
          }
        }
     }
     return getGetPanDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetDataServiceStub newStub(io.grpc.Channel channel) {
    return new GetDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetDataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetDataServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPanData(com.grpcAssignment.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.grpcAssignment.GetDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPanDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPanDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcAssignment.GetDataRequest,
                com.grpcAssignment.GetDataResponse>(
                  this, METHODID_GET_PAN_DATA)))
          .build();
    }
  }

  /**
   */
  public static final class GetDataServiceStub extends io.grpc.stub.AbstractStub<GetDataServiceStub> {
    private GetDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPanData(com.grpcAssignment.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.grpcAssignment.GetDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPanDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetDataServiceBlockingStub extends io.grpc.stub.AbstractStub<GetDataServiceBlockingStub> {
    private GetDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcAssignment.GetDataResponse getPanData(com.grpcAssignment.GetDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPanDataMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetDataServiceFutureStub extends io.grpc.stub.AbstractStub<GetDataServiceFutureStub> {
    private GetDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcAssignment.GetDataResponse> getPanData(
        com.grpcAssignment.GetDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPanDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PAN_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PAN_DATA:
          serviceImpl.getPanData((com.grpcAssignment.GetDataRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcAssignment.GetDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GetDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcAssignment.GetData.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetDataService");
    }
  }

  private static final class GetDataServiceFileDescriptorSupplier
      extends GetDataServiceBaseDescriptorSupplier {
    GetDataServiceFileDescriptorSupplier() {}
  }

  private static final class GetDataServiceMethodDescriptorSupplier
      extends GetDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetDataServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GetDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetDataServiceFileDescriptorSupplier())
              .addMethod(getGetPanDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
