package com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier;

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
    comments = "Source: api/v1alpha1/vanalytics/notifier/service.proto")
public final class NotifierGrpc {

  private NotifierGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.vanalytics.notifier.Notifier";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> getGetNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotify",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> getGetNotifyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> getGetNotifyMethod;
    if ((getGetNotifyMethod = NotifierGrpc.getGetNotifyMethod) == null) {
      synchronized (NotifierGrpc.class) {
        if ((getGetNotifyMethod = NotifierGrpc.getGetNotifyMethod) == null) {
          NotifierGrpc.getGetNotifyMethod = getGetNotifyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.notifier.Notifier", "GetNotify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifierMethodDescriptorSupplier("GetNotify"))
                  .build();
          }
        }
     }
     return getGetNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifierStub newStub(io.grpc.Channel channel) {
    return new NotifierStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifierBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotifierBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotifierFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotifierFutureStub(channel);
  }

  /**
   */
  public static abstract class NotifierImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GetNotify returns a notify.
     * </pre>
     */
    public void getNotify(com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify>(
                  this, METHODID_GET_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class NotifierStub extends io.grpc.stub.AbstractStub<NotifierStub> {
    private NotifierStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNotify returns a notify.
     * </pre>
     */
    public void getNotify(com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotifierBlockingStub extends io.grpc.stub.AbstractStub<NotifierBlockingStub> {
    private NotifierBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNotify returns a notify.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify getNotify(com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotifierFutureStub extends io.grpc.stub.AbstractStub<NotifierFutureStub> {
    private NotifierFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifierFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifierFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetNotify returns a notify.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify> getNotify(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NOTIFY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotifierImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotifierImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NOTIFY:
          serviceImpl.getNotify((com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.GetNotifyRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.Notify>) responseObserver);
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

  private static abstract class NotifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotifierBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.notifier.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notifier");
    }
  }

  private static final class NotifierFileDescriptorSupplier
      extends NotifierBaseDescriptorSupplier {
    NotifierFileDescriptorSupplier() {}
  }

  private static final class NotifierMethodDescriptorSupplier
      extends NotifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotifierMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotifierGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotifierFileDescriptorSupplier())
              .addMethod(getGetNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
