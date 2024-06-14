package com.tcn.cloud.api.services.translation.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/translation/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TranslationServiceGrpc {

  private TranslationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.translation.v1alpha1.TranslationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranslateTemplate",
      requestType = com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;
    if ((getTranslateTemplateMethod = TranslationServiceGrpc.getTranslateTemplateMethod) == null) {
      synchronized (TranslationServiceGrpc.class) {
        if ((getTranslateTemplateMethod = TranslationServiceGrpc.getTranslateTemplateMethod) == null) {
          TranslationServiceGrpc.getTranslateTemplateMethod = getTranslateTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranslateTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationServiceMethodDescriptorSupplier("TranslateTemplate"))
              .build();
        }
      }
    }
    return getTranslateTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceStub>() {
        @java.lang.Override
        public TranslationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceStub(channel, callOptions);
        }
      };
    return TranslationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceBlockingStub>() {
        @java.lang.Override
        public TranslationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceBlockingStub(channel, callOptions);
        }
      };
    return TranslationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationServiceFutureStub>() {
        @java.lang.Override
        public TranslationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationServiceFutureStub(channel, callOptions);
        }
      };
    return TranslationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Required permissions:
     *   Any Authenticated User (TODO: Validate this assumption)
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void translateTemplate(com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranslateTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TranslationService.
   */
  public static abstract class TranslationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TranslationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TranslationService.
   */
  public static final class TranslationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TranslationServiceStub> {
    private TranslationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Required permissions:
     *   Any Authenticated User (TODO: Validate this assumption)
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void translateTemplate(com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranslateTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TranslationService.
   */
  public static final class TranslationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TranslationServiceBlockingStub> {
    private TranslationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Required permissions:
     *   Any Authenticated User (TODO: Validate this assumption)
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse translateTemplate(com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TranslationService.
   */
  public static final class TranslationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TranslationServiceFutureStub> {
    private TranslationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Required permissions:
     *   Any Authenticated User (TODO: Validate this assumption)
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse> translateTemplate(
        com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranslateTemplateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE_TEMPLATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSLATE_TEMPLATE:
          serviceImpl.translateTemplate((com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getTranslateTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateRequest,
              com.tcn.cloud.api.services.translation.v1alpha1.TranslateTemplateResponse>(
                service, METHODID_TRANSLATE_TEMPLATE)))
        .build();
  }

  private static abstract class TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.translation.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationService");
    }
  }

  private static final class TranslationServiceFileDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier {
    TranslationServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationServiceMethodDescriptorSupplier
      extends TranslationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TranslationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TranslationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslationServiceFileDescriptorSupplier())
              .addMethod(getTranslateTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
