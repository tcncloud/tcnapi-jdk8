package com.tcn.cloud.api.services.omnichannel.instant.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/omnichannel/instant/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OauthServiceGrpc {

  private OauthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.omnichannel.instant.v1alpha1.OauthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> getStreamContantCenterSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamContantCenterSnapshot",
      requestType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest.class,
      responseType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> getStreamContantCenterSnapshotMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> getStreamContantCenterSnapshotMethod;
    if ((getStreamContantCenterSnapshotMethod = OauthServiceGrpc.getStreamContantCenterSnapshotMethod) == null) {
      synchronized (OauthServiceGrpc.class) {
        if ((getStreamContantCenterSnapshotMethod = OauthServiceGrpc.getStreamContantCenterSnapshotMethod) == null) {
          OauthServiceGrpc.getStreamContantCenterSnapshotMethod = getStreamContantCenterSnapshotMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamContantCenterSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OauthServiceMethodDescriptorSupplier("StreamContantCenterSnapshot"))
              .build();
        }
      }
    }
    return getStreamContantCenterSnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OauthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceStub>() {
        @java.lang.Override
        public OauthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceStub(channel, callOptions);
        }
      };
    return OauthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OauthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceBlockingStub>() {
        @java.lang.Override
        public OauthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceBlockingStub(channel, callOptions);
        }
      };
    return OauthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OauthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OauthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OauthServiceFutureStub>() {
        @java.lang.Override
        public OauthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OauthServiceFutureStub(channel, callOptions);
        }
      };
    return OauthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void streamContantCenterSnapshot(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamContantCenterSnapshotMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OauthService.
   */
  public static abstract class OauthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OauthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OauthService.
   */
  public static final class OauthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OauthServiceStub> {
    private OauthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamContantCenterSnapshot(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamContantCenterSnapshotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OauthService.
   */
  public static final class OauthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OauthServiceBlockingStub> {
    private OauthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse> streamContantCenterSnapshot(
        com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamContantCenterSnapshotMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OauthService.
   */
  public static final class OauthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OauthServiceFutureStub> {
    private OauthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OauthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OauthServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_CONTANT_CENTER_SNAPSHOT = 0;

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
        case METHODID_STREAM_CONTANT_CENTER_SNAPSHOT:
          serviceImpl.streamContantCenterSnapshot((com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse>) responseObserver);
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
          getStreamContantCenterSnapshotMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotRequest,
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamContantCenterSnapshotResponse>(
                service, METHODID_STREAM_CONTANT_CENTER_SNAPSHOT)))
        .build();
  }

  private static abstract class OauthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OauthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OauthService");
    }
  }

  private static final class OauthServiceFileDescriptorSupplier
      extends OauthServiceBaseDescriptorSupplier {
    OauthServiceFileDescriptorSupplier() {}
  }

  private static final class OauthServiceMethodDescriptorSupplier
      extends OauthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OauthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OauthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OauthServiceFileDescriptorSupplier())
              .addMethod(getStreamContantCenterSnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
