package com.tcn.cloud.api.api.v1alpha1.newsroom;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/newsroom/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NewsroomAPIGrpc {

  private NewsroomAPIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.newsroom.NewsroomAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq,
      com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq,
      com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> getPingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq, com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> getPingMethod;
    if ((getPingMethod = NewsroomAPIGrpc.getPingMethod) == null) {
      synchronized (NewsroomAPIGrpc.class) {
        if ((getPingMethod = NewsroomAPIGrpc.getPingMethod) == null) {
          NewsroomAPIGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq, com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes.getDefaultInstance()))
              .setSchemaDescriptor(new NewsroomAPIMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewsroomAPIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIStub>() {
        @java.lang.Override
        public NewsroomAPIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIStub(channel, callOptions);
        }
      };
    return NewsroomAPIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewsroomAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIBlockingStub>() {
        @java.lang.Override
        public NewsroomAPIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIBlockingStub(channel, callOptions);
        }
      };
    return NewsroomAPIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewsroomAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NewsroomAPIFutureStub>() {
        @java.lang.Override
        public NewsroomAPIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NewsroomAPIFutureStub(channel, callOptions);
        }
      };
    return NewsroomAPIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * This is here to ensure things are connected correctly
     * </pre>
     */
    default void ping(com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NewsroomAPI.
   */
  public static abstract class NewsroomAPIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NewsroomAPIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NewsroomAPI.
   */
  public static final class NewsroomAPIStub
      extends io.grpc.stub.AbstractAsyncStub<NewsroomAPIStub> {
    private NewsroomAPIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIStub(channel, callOptions);
    }

    /**
     * <pre>
     * This is here to ensure things are connected correctly
     * </pre>
     */
    public void ping(com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NewsroomAPI.
   */
  public static final class NewsroomAPIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NewsroomAPIBlockingStub> {
    private NewsroomAPIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * This is here to ensure things are connected correctly
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes ping(com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NewsroomAPI.
   */
  public static final class NewsroomAPIFutureStub
      extends io.grpc.stub.AbstractFutureStub<NewsroomAPIFutureStub> {
    private NewsroomAPIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewsroomAPIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NewsroomAPIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * This is here to ensure things are connected correctly
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes> ping(
        com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

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
        case METHODID_PING:
          serviceImpl.ping((com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes>) responseObserver);
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
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.newsroom.PingReq,
              com.tcn.cloud.api.api.v1alpha1.newsroom.PingRes>(
                service, METHODID_PING)))
        .build();
  }

  private static abstract class NewsroomAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewsroomAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.newsroom.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewsroomAPI");
    }
  }

  private static final class NewsroomAPIFileDescriptorSupplier
      extends NewsroomAPIBaseDescriptorSupplier {
    NewsroomAPIFileDescriptorSupplier() {}
  }

  private static final class NewsroomAPIMethodDescriptorSupplier
      extends NewsroomAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NewsroomAPIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NewsroomAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewsroomAPIFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
