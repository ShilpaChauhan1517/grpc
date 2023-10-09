package com.templateService;

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
    comments = "Source: template.proto")
public final class TemplateServiceGrpc {

  private TemplateServiceGrpc() {}

  public static final String SERVICE_NAME = "com.templateService.TemplateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.templateService.TemplateRequest,
      com.templateService.TemplateResponseList> getFetchTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fetchTemplate",
      requestType = com.templateService.TemplateRequest.class,
      responseType = com.templateService.TemplateResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.templateService.TemplateRequest,
      com.templateService.TemplateResponseList> getFetchTemplateMethod() {
    io.grpc.MethodDescriptor<com.templateService.TemplateRequest, com.templateService.TemplateResponseList> getFetchTemplateMethod;
    if ((getFetchTemplateMethod = TemplateServiceGrpc.getFetchTemplateMethod) == null) {
      synchronized (TemplateServiceGrpc.class) {
        if ((getFetchTemplateMethod = TemplateServiceGrpc.getFetchTemplateMethod) == null) {
          TemplateServiceGrpc.getFetchTemplateMethod = getFetchTemplateMethod = 
              io.grpc.MethodDescriptor.<com.templateService.TemplateRequest, com.templateService.TemplateResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.templateService.TemplateService", "fetchTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.templateService.TemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.templateService.TemplateResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new TemplateServiceMethodDescriptorSupplier("fetchTemplate"))
                  .build();
          }
        }
     }
     return getFetchTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemplateServiceStub newStub(io.grpc.Channel channel) {
    return new TemplateServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemplateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemplateServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemplateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemplateServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TemplateServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void fetchTemplate(com.templateService.TemplateRequest request,
        io.grpc.stub.StreamObserver<com.templateService.TemplateResponseList> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchTemplateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFetchTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.templateService.TemplateRequest,
                com.templateService.TemplateResponseList>(
                  this, METHODID_FETCH_TEMPLATE)))
          .build();
    }
  }

  /**
   */
  public static final class TemplateServiceStub extends io.grpc.stub.AbstractStub<TemplateServiceStub> {
    private TemplateServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemplateServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplateServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemplateServiceStub(channel, callOptions);
    }

    /**
     */
    public void fetchTemplate(com.templateService.TemplateRequest request,
        io.grpc.stub.StreamObserver<com.templateService.TemplateResponseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TemplateServiceBlockingStub extends io.grpc.stub.AbstractStub<TemplateServiceBlockingStub> {
    private TemplateServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemplateServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplateServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemplateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.templateService.TemplateResponseList fetchTemplate(com.templateService.TemplateRequest request) {
      return blockingUnaryCall(
          getChannel(), getFetchTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TemplateServiceFutureStub extends io.grpc.stub.AbstractStub<TemplateServiceFutureStub> {
    private TemplateServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemplateServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplateServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemplateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.templateService.TemplateResponseList> fetchTemplate(
        com.templateService.TemplateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchTemplateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FETCH_TEMPLATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemplateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemplateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FETCH_TEMPLATE:
          serviceImpl.fetchTemplate((com.templateService.TemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.templateService.TemplateResponseList>) responseObserver);
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

  private static abstract class TemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemplateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.templateService.TemplateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemplateService");
    }
  }

  private static final class TemplateServiceFileDescriptorSupplier
      extends TemplateServiceBaseDescriptorSupplier {
    TemplateServiceFileDescriptorSupplier() {}
  }

  private static final class TemplateServiceMethodDescriptorSupplier
      extends TemplateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemplateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemplateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemplateServiceFileDescriptorSupplier())
              .addMethod(getFetchTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
