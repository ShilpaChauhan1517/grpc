package com.calculationService;

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
    comments = "Source: calculation_engine.proto")
public final class CalculationEngineServiceGrpc {

  private CalculationEngineServiceGrpc() {}

  public static final String SERVICE_NAME = "com.calculationService.CalculationEngineService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.calculationService.CalculationEngineRequest,
      com.calculationService.CalculationEngineResponseList> getPerformCalculationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performCalculation",
      requestType = com.calculationService.CalculationEngineRequest.class,
      responseType = com.calculationService.CalculationEngineResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.calculationService.CalculationEngineRequest,
      com.calculationService.CalculationEngineResponseList> getPerformCalculationMethod() {
    io.grpc.MethodDescriptor<com.calculationService.CalculationEngineRequest, com.calculationService.CalculationEngineResponseList> getPerformCalculationMethod;
    if ((getPerformCalculationMethod = CalculationEngineServiceGrpc.getPerformCalculationMethod) == null) {
      synchronized (CalculationEngineServiceGrpc.class) {
        if ((getPerformCalculationMethod = CalculationEngineServiceGrpc.getPerformCalculationMethod) == null) {
          CalculationEngineServiceGrpc.getPerformCalculationMethod = getPerformCalculationMethod = 
              io.grpc.MethodDescriptor.<com.calculationService.CalculationEngineRequest, com.calculationService.CalculationEngineResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.calculationService.CalculationEngineService", "performCalculation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calculationService.CalculationEngineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.calculationService.CalculationEngineResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculationEngineServiceMethodDescriptorSupplier("performCalculation"))
                  .build();
          }
        }
     }
     return getPerformCalculationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculationEngineServiceStub newStub(io.grpc.Channel channel) {
    return new CalculationEngineServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculationEngineServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculationEngineServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculationEngineServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculationEngineServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculationEngineServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void performCalculation(com.calculationService.CalculationEngineRequest request,
        io.grpc.stub.StreamObserver<com.calculationService.CalculationEngineResponseList> responseObserver) {
      asyncUnimplementedUnaryCall(getPerformCalculationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPerformCalculationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.calculationService.CalculationEngineRequest,
                com.calculationService.CalculationEngineResponseList>(
                  this, METHODID_PERFORM_CALCULATION)))
          .build();
    }
  }

  /**
   */
  public static final class CalculationEngineServiceStub extends io.grpc.stub.AbstractStub<CalculationEngineServiceStub> {
    private CalculationEngineServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationEngineServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationEngineServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationEngineServiceStub(channel, callOptions);
    }

    /**
     */
    public void performCalculation(com.calculationService.CalculationEngineRequest request,
        io.grpc.stub.StreamObserver<com.calculationService.CalculationEngineResponseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPerformCalculationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculationEngineServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculationEngineServiceBlockingStub> {
    private CalculationEngineServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationEngineServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationEngineServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationEngineServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.calculationService.CalculationEngineResponseList performCalculation(com.calculationService.CalculationEngineRequest request) {
      return blockingUnaryCall(
          getChannel(), getPerformCalculationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculationEngineServiceFutureStub extends io.grpc.stub.AbstractStub<CalculationEngineServiceFutureStub> {
    private CalculationEngineServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculationEngineServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculationEngineServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculationEngineServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.calculationService.CalculationEngineResponseList> performCalculation(
        com.calculationService.CalculationEngineRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPerformCalculationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PERFORM_CALCULATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculationEngineServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculationEngineServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_CALCULATION:
          serviceImpl.performCalculation((com.calculationService.CalculationEngineRequest) request,
              (io.grpc.stub.StreamObserver<com.calculationService.CalculationEngineResponseList>) responseObserver);
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

  private static abstract class CalculationEngineServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculationEngineServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.calculationService.CalculationEngine.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculationEngineService");
    }
  }

  private static final class CalculationEngineServiceFileDescriptorSupplier
      extends CalculationEngineServiceBaseDescriptorSupplier {
    CalculationEngineServiceFileDescriptorSupplier() {}
  }

  private static final class CalculationEngineServiceMethodDescriptorSupplier
      extends CalculationEngineServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculationEngineServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculationEngineServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculationEngineServiceFileDescriptorSupplier())
              .addMethod(getPerformCalculationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
