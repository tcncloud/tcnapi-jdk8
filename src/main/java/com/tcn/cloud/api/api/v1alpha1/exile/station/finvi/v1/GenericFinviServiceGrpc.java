package com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/exile/station/finvi/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GenericFinviServiceGrpc {

  private GenericFinviServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.exile.station.finvi.v1.GenericFinviService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq,
      com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> getPopAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PopAccount",
      requestType = com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq,
      com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> getPopAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq, com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> getPopAccountMethod;
    if ((getPopAccountMethod = GenericFinviServiceGrpc.getPopAccountMethod) == null) {
      synchronized (GenericFinviServiceGrpc.class) {
        if ((getPopAccountMethod = GenericFinviServiceGrpc.getPopAccountMethod) == null) {
          GenericFinviServiceGrpc.getPopAccountMethod = getPopAccountMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq, com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PopAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes.getDefaultInstance()))
              .setSchemaDescriptor(new GenericFinviServiceMethodDescriptorSupplier("PopAccount"))
              .build();
        }
      }
    }
    return getPopAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GenericFinviServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceStub>() {
        @java.lang.Override
        public GenericFinviServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericFinviServiceStub(channel, callOptions);
        }
      };
    return GenericFinviServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GenericFinviServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceBlockingStub>() {
        @java.lang.Override
        public GenericFinviServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericFinviServiceBlockingStub(channel, callOptions);
        }
      };
    return GenericFinviServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GenericFinviServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GenericFinviServiceFutureStub>() {
        @java.lang.Override
        public GenericFinviServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GenericFinviServiceFutureStub(channel, callOptions);
        }
      };
    return GenericFinviServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Displays a given record from a pool to the specified user.
     * </pre>
     */
    default void popAccount(com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPopAccountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GenericFinviService.
   */
  public static abstract class GenericFinviServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GenericFinviServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GenericFinviService.
   */
  public static final class GenericFinviServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GenericFinviServiceStub> {
    private GenericFinviServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericFinviServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericFinviServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Displays a given record from a pool to the specified user.
     * </pre>
     */
    public void popAccount(com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPopAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GenericFinviService.
   */
  public static final class GenericFinviServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GenericFinviServiceBlockingStub> {
    private GenericFinviServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericFinviServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericFinviServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Displays a given record from a pool to the specified user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes popAccount(com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPopAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GenericFinviService.
   */
  public static final class GenericFinviServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GenericFinviServiceFutureStub> {
    private GenericFinviServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GenericFinviServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GenericFinviServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Displays a given record from a pool to the specified user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes> popAccount(
        com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPopAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POP_ACCOUNT = 0;

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
        case METHODID_POP_ACCOUNT:
          serviceImpl.popAccount((com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes>) responseObserver);
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
          getPopAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountReq,
              com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.PopAccountRes>(
                service, METHODID_POP_ACCOUNT)))
        .build();
  }

  private static abstract class GenericFinviServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GenericFinviServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GenericFinviService");
    }
  }

  private static final class GenericFinviServiceFileDescriptorSupplier
      extends GenericFinviServiceBaseDescriptorSupplier {
    GenericFinviServiceFileDescriptorSupplier() {}
  }

  private static final class GenericFinviServiceMethodDescriptorSupplier
      extends GenericFinviServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GenericFinviServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GenericFinviServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GenericFinviServiceFileDescriptorSupplier())
              .addMethod(getPopAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
