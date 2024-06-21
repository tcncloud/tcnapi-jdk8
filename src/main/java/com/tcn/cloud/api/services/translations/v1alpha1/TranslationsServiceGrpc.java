package com.tcn.cloud.api.services.translations.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/translations/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TranslationsServiceGrpc {

  private TranslationsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.translations.v1alpha1.TranslationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranslateTemplate",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;
    if ((getTranslateTemplateMethod = TranslationsServiceGrpc.getTranslateTemplateMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getTranslateTemplateMethod = TranslationsServiceGrpc.getTranslateTemplateMethod) == null) {
          TranslationsServiceGrpc.getTranslateTemplateMethod = getTranslateTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranslateTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("TranslateTemplate"))
              .build();
        }
      }
    }
    return getTranslateTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceStub>() {
        @java.lang.Override
        public TranslationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceStub(channel, callOptions);
        }
      };
    return TranslationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceBlockingStub>() {
        @java.lang.Override
        public TranslationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceBlockingStub(channel, callOptions);
        }
      };
    return TranslationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceFutureStub>() {
        @java.lang.Override
        public TranslationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceFutureStub(channel, callOptions);
        }
      };
    return TranslationsServiceFutureStub.newStub(factory, channel);
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
    default void translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranslateTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TranslationsService.
   */
  public static abstract class TranslationsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TranslationsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TranslationsServiceStub> {
    private TranslationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceStub(channel, callOptions);
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
    public void translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranslateTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TranslationsServiceBlockingStub> {
    private TranslationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceBlockingStub(channel, callOptions);
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
    public com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TranslationsServiceFutureStub> {
    private TranslationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> translateTemplate(
        com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request) {
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
          serviceImpl.translateTemplate((com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>) responseObserver);
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
              com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>(
                service, METHODID_TRANSLATE_TEMPLATE)))
        .build();
  }

  private static abstract class TranslationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.translations.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationsService");
    }
  }

  private static final class TranslationsServiceFileDescriptorSupplier
      extends TranslationsServiceBaseDescriptorSupplier {
    TranslationsServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationsServiceMethodDescriptorSupplier
      extends TranslationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TranslationsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TranslationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslationsServiceFileDescriptorSupplier())
              .addMethod(getTranslateTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
