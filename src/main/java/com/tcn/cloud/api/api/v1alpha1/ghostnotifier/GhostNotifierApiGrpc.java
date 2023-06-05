package com.tcn.cloud.api.api.v1alpha1.ghostnotifier;

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
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/ghostnotifier/service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.ghostnotifier.GhostNotifierApi", "ListNotifications"))
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
    return new GhostNotifierApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GhostNotifierApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GhostNotifierApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GhostNotifierApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GhostNotifierApiFutureStub(channel);
  }

  /**
   */
  public static abstract class GhostNotifierApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    public void listNotifications(com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GhostNotification> responseObserver) {
      asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNotificationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq,
                com.tcn.cloud.api.api.commons.GhostNotification>(
                  this, METHODID_LIST_NOTIFICATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class GhostNotifierApiStub extends io.grpc.stub.AbstractStub<GhostNotifierApiStub> {
    private GhostNotifierApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GhostNotifierApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    public void listNotifications(com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GhostNotification> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GhostNotifierApiBlockingStub extends io.grpc.stub.AbstractStub<GhostNotifierApiBlockingStub> {
    private GhostNotifierApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GhostNotifierApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a server side stream that will forward and ghost notifications to the client for the given user
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.GhostNotification> listNotifications(
        com.tcn.cloud.api.api.v1alpha1.ghostnotifier.ListNotificationsReq request) {
      return blockingServerStreamingCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GhostNotifierApiFutureStub extends io.grpc.stub.AbstractStub<GhostNotifierApiFutureStub> {
    private GhostNotifierApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GhostNotifierApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GhostNotifierApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GhostNotifierApiFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIST_NOTIFICATIONS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GhostNotifierApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GhostNotifierApiImplBase serviceImpl, int methodId) {
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
