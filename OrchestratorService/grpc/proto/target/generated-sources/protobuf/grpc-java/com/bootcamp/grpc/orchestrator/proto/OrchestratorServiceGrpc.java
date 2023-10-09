package com.bootcamp.grpc.orchestrator.proto;

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
    comments = "Source: orchestrator.proto")
public final class OrchestratorServiceGrpc {

  private OrchestratorServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.OrchestratorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest,
      com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> getCalculateParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateParameters",
      requestType = com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest.class,
      responseType = com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest,
      com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> getCalculateParametersMethod() {
    io.grpc.MethodDescriptor<com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest, com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> getCalculateParametersMethod;
    if ((getCalculateParametersMethod = OrchestratorServiceGrpc.getCalculateParametersMethod) == null) {
      synchronized (OrchestratorServiceGrpc.class) {
        if ((getCalculateParametersMethod = OrchestratorServiceGrpc.getCalculateParametersMethod) == null) {
          OrchestratorServiceGrpc.getCalculateParametersMethod = getCalculateParametersMethod = 
              io.grpc.MethodDescriptor.<com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest, com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.OrchestratorService", "calculateParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrchestratorServiceMethodDescriptorSupplier("calculateParameters"))
                  .build();
          }
        }
     }
     return getCalculateParametersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrchestratorServiceStub newStub(io.grpc.Channel channel) {
    return new OrchestratorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrchestratorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrchestratorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrchestratorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrchestratorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OrchestratorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateParameters(com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest request,
        io.grpc.stub.StreamObserver<com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCalculateParametersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest,
                com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse>(
                  this, METHODID_CALCULATE_PARAMETERS)))
          .build();
    }
  }

  /**
   */
  public static final class OrchestratorServiceStub extends io.grpc.stub.AbstractStub<OrchestratorServiceStub> {
    private OrchestratorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrchestratorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrchestratorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrchestratorServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculateParameters(com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest request,
        io.grpc.stub.StreamObserver<com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCalculateParametersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrchestratorServiceBlockingStub extends io.grpc.stub.AbstractStub<OrchestratorServiceBlockingStub> {
    private OrchestratorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrchestratorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrchestratorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrchestratorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse calculateParameters(com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest request) {
      return blockingUnaryCall(
          getChannel(), getCalculateParametersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrchestratorServiceFutureStub extends io.grpc.stub.AbstractStub<OrchestratorServiceFutureStub> {
    private OrchestratorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrchestratorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrchestratorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrchestratorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse> calculateParameters(
        com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCalculateParametersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_PARAMETERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrchestratorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrchestratorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_PARAMETERS:
          serviceImpl.calculateParameters((com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest) request,
              (io.grpc.stub.StreamObserver<com.bootcamp.grpc.orchestrator.proto.OrchestratorResponse>) responseObserver);
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

  private static abstract class OrchestratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrchestratorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrchestratorService");
    }
  }

  private static final class OrchestratorServiceFileDescriptorSupplier
      extends OrchestratorServiceBaseDescriptorSupplier {
    OrchestratorServiceFileDescriptorSupplier() {}
  }

  private static final class OrchestratorServiceMethodDescriptorSupplier
      extends OrchestratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrchestratorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrchestratorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrchestratorServiceFileDescriptorSupplier())
              .addMethod(getCalculateParametersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
