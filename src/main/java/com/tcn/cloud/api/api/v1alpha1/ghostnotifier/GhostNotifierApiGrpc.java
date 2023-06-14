package com.tcn.cloud.api.api.v1alpha1.ghostnotifier;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/ghostnotifier/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GhostNotifierApiGrpc {

  private GhostNotifierApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.ghostnotifier.GhostNotifierApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq,
      com.tcn.cloud.api.api.commons.GhostNotification> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq.class,
      responseType = com.tcn.cloud.api.api.commons.GhostNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq,
      com.tcn.cloud.api.api.commons.GhostNotification> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq, com.tcn.cloud.api.api.commons.GhostNotification> getListNotificationsMethod;
    if ((getListNotificationsMethod = GhostNotifierApiGrpc.getListNotificationsMethod) == null) {
      synchronized (GhostNotifierApiGrpc.class) {
        if ((getListNotificationsMethod = GhostNotifierApiGrpc.getListNotificationsMethod) == null) {
          GhostNotifierApiGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq, com.tcn.cloud.api.api.commons.GhostNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.GhostNotification.getDefaultInstance()))
              .setSchemaDescriptor(new GhostNotifierApiMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GhostNotifierApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiStub>() {
        @java.lang.Override
        public GhostNotifierApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GhostNotifierApiStub(channel, callOptions);
        }
      };
    return GhostNotifierApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GhostNotifierApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiBlockingStub>() {
        @java.lang.Override
        public GhostNotifierApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GhostNotifierApiBlockingStub(channel, callOptions);
        }
      };
    return GhostNotifierApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GhostNotifierApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GhostNotifierApiFutureStub>() {
        @java.lang.Override
        public GhostNotifierApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GhostNotifierApiFutureStub(channel, callOptions);
        }
      };
    return GhostNotifierApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    default void listNotifications(com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GhostNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GhostNotifierApi.
   */
  public static abstract class GhostNotifierApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GhostNotifierApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GhostNotifierApi.
   */
  public static final class GhostNotifierApiStub
      extends io.grpc.stub.AbstractAsyncStub<GhostNotifierApiStub> {
    private GhostNotifierApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    public void listNotifications(com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GhostNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GhostNotifierApi.
   */
  public static final class GhostNotifierApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GhostNotifierApiBlockingStub> {
    private GhostNotifierApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.GhostNotification> listNotifications(
        com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GhostNotifierApi.
   */
  public static final class GhostNotifierApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<GhostNotifierApiFutureStub> {
    private GhostNotifierApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIST_NOTIFICATIONS = 0;

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
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GhostNotification>) responseObserver);
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
          getListNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq,
              com.tcn.cloud.api.api.commons.GhostNotification>(
                service, METHODID_LIST_NOTIFICATIONS)))
        .build();
  }

  private static abstract class GhostNotifierApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GhostNotifierApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GhostNotifierApi");
    }
  }

  private static final class GhostNotifierApiFileDescriptorSupplier
      extends GhostNotifierApiBaseDescriptorSupplier {
    GhostNotifierApiFileDescriptorSupplier() {}
  }

  private static final class GhostNotifierApiMethodDescriptorSupplier
      extends GhostNotifierApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GhostNotifierApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (GhostNotifierApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GhostNotifierApiFileDescriptorSupplier())
              .addMethod(getListNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
