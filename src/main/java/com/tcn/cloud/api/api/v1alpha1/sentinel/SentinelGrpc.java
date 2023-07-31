package com.tcn.cloud.api.api.v1alpha1.sentinel;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for internal observability utilities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: api/v1alpha1/sentinel/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SentinelGrpc {

  private SentinelGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.sentinel.Sentinel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq,
      com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> getSendEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEvents",
      requestType = com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq,
      com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> getSendEventsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq, com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> getSendEventsMethod;
    if ((getSendEventsMethod = SentinelGrpc.getSendEventsMethod) == null) {
      synchronized (SentinelGrpc.class) {
        if ((getSendEventsMethod = SentinelGrpc.getSendEventsMethod) == null) {
          SentinelGrpc.getSendEventsMethod = getSendEventsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq, com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes.getDefaultInstance()))
              .setSchemaDescriptor(new SentinelMethodDescriptorSupplier("SendEvents"))
              .build();
        }
      }
    }
    return getSendEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SentinelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SentinelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SentinelStub>() {
        @java.lang.Override
        public SentinelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SentinelStub(channel, callOptions);
        }
      };
    return SentinelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SentinelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SentinelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SentinelBlockingStub>() {
        @java.lang.Override
        public SentinelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SentinelBlockingStub(channel, callOptions);
        }
      };
    return SentinelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SentinelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SentinelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SentinelFutureStub>() {
        @java.lang.Override
        public SentinelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SentinelFutureStub(channel, callOptions);
        }
      };
    return SentinelFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for internal observability utilities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    default void sendEvents(com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Sentinel.
   * <pre>
   * A service for internal observability utilities.
   * </pre>
   */
  public static abstract class SentinelImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SentinelGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Sentinel.
   * <pre>
   * A service for internal observability utilities.
   * </pre>
   */
  public static final class SentinelStub
      extends io.grpc.stub.AbstractAsyncStub<SentinelStub> {
    private SentinelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SentinelStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public void sendEvents(com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Sentinel.
   * <pre>
   * A service for internal observability utilities.
   * </pre>
   */
  public static final class SentinelBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SentinelBlockingStub> {
    private SentinelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SentinelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes sendEvents(com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Sentinel.
   * <pre>
   * A service for internal observability utilities.
   * </pre>
   */
  public static final class SentinelFutureStub
      extends io.grpc.stub.AbstractFutureStub<SentinelFutureStub> {
    private SentinelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SentinelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes> sendEvents(
        com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EVENTS = 0;

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
        case METHODID_SEND_EVENTS:
          serviceImpl.sendEvents((com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes>) responseObserver);
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
          getSendEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsReq,
              com.tcn.cloud.api.api.v1alpha1.sentinel.SendEventsRes>(
                service, METHODID_SEND_EVENTS)))
        .build();
  }

  private static abstract class SentinelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SentinelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.sentinel.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sentinel");
    }
  }

  private static final class SentinelFileDescriptorSupplier
      extends SentinelBaseDescriptorSupplier {
    SentinelFileDescriptorSupplier() {}
  }

  private static final class SentinelMethodDescriptorSupplier
      extends SentinelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SentinelMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SentinelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SentinelFileDescriptorSupplier())
              .addMethod(getSendEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
