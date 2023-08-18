package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: api/v0alpha/fts.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FTSGrpc {

  private FTSGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v0alpha.FTS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> getGetUploadFileUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadFileUrl",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> getGetUploadFileUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq, com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> getGetUploadFileUrlMethod;
    if ((getGetUploadFileUrlMethod = FTSGrpc.getGetUploadFileUrlMethod) == null) {
      synchronized (FTSGrpc.class) {
        if ((getGetUploadFileUrlMethod = FTSGrpc.getGetUploadFileUrlMethod) == null) {
          FTSGrpc.getGetUploadFileUrlMethod = getGetUploadFileUrlMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq, com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadFileUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes.getDefaultInstance()))
              .setSchemaDescriptor(new FTSMethodDescriptorSupplier("GetUploadFileUrl"))
              .build();
        }
      }
    }
    return getGetUploadFileUrlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FTSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FTSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FTSStub>() {
        @java.lang.Override
        public FTSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FTSStub(channel, callOptions);
        }
      };
    return FTSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FTSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FTSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FTSBlockingStub>() {
        @java.lang.Override
        public FTSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FTSBlockingStub(channel, callOptions);
        }
      };
    return FTSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FTSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FTSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FTSFutureStub>() {
        @java.lang.Override
        public FTSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FTSFutureStub(channel, callOptions);
        }
      };
    return FTSFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUploadFileUrl(com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadFileUrlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FTS.
   */
  public static abstract class FTSImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FTSGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FTS.
   */
  public static final class FTSStub
      extends io.grpc.stub.AbstractAsyncStub<FTSStub> {
    private FTSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FTSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FTSStub(channel, callOptions);
    }

    /**
     */
    public void getUploadFileUrl(com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadFileUrlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FTS.
   */
  public static final class FTSBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FTSBlockingStub> {
    private FTSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FTSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FTSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes getUploadFileUrl(com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadFileUrlMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FTS.
   */
  public static final class FTSFutureStub
      extends io.grpc.stub.AbstractFutureStub<FTSFutureStub> {
    private FTSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FTSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FTSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes> getUploadFileUrl(
        com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadFileUrlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_UPLOAD_FILE_URL = 0;

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
        case METHODID_GET_UPLOAD_FILE_URL:
          serviceImpl.getUploadFileUrl((com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes>) responseObserver);
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
          getGetUploadFileUrlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlReq,
              com.tcn.cloud.api.api.v0alpha.GetUploadFileUrlRes>(
                service, METHODID_GET_UPLOAD_FILE_URL)))
        .build();
  }

  private static abstract class FTSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FTSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.FtsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FTS");
    }
  }

  private static final class FTSFileDescriptorSupplier
      extends FTSBaseDescriptorSupplier {
    FTSFileDescriptorSupplier() {}
  }

  private static final class FTSMethodDescriptorSupplier
      extends FTSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FTSMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FTSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FTSFileDescriptorSupplier())
              .addMethod(getGetUploadFileUrlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
