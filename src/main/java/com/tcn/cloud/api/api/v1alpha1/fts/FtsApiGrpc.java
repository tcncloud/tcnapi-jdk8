package com.tcn.cloud.api.api.v1alpha1.fts;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/fts/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FtsApiGrpc {

  private FtsApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.fts.FtsApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq,
      com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> getGetUploadFileUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadFileUrl",
      requestType = com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq,
      com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> getGetUploadFileUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq, com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> getGetUploadFileUrlMethod;
    if ((getGetUploadFileUrlMethod = FtsApiGrpc.getGetUploadFileUrlMethod) == null) {
      synchronized (FtsApiGrpc.class) {
        if ((getGetUploadFileUrlMethod = FtsApiGrpc.getGetUploadFileUrlMethod) == null) {
          FtsApiGrpc.getGetUploadFileUrlMethod = getGetUploadFileUrlMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq, com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadFileUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes.getDefaultInstance()))
              .setSchemaDescriptor(new FtsApiMethodDescriptorSupplier("GetUploadFileUrl"))
              .build();
        }
      }
    }
    return getGetUploadFileUrlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FtsApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtsApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtsApiStub>() {
        @java.lang.Override
        public FtsApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtsApiStub(channel, callOptions);
        }
      };
    return FtsApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FtsApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtsApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtsApiBlockingStub>() {
        @java.lang.Override
        public FtsApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtsApiBlockingStub(channel, callOptions);
        }
      };
    return FtsApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FtsApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtsApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtsApiFutureStub>() {
        @java.lang.Override
        public FtsApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtsApiFutureStub(channel, callOptions);
        }
      };
    return FtsApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadFileUrlMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FtsApi.
   */
  public static abstract class FtsApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FtsApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FtsApi.
   */
  public static final class FtsApiStub
      extends io.grpc.stub.AbstractAsyncStub<FtsApiStub> {
    private FtsApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtsApiStub(channel, callOptions);
    }

    /**
     */
    public void getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadFileUrlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FtsApi.
   */
  public static final class FtsApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FtsApiBlockingStub> {
    private FtsApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtsApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadFileUrlMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FtsApi.
   */
  public static final class FtsApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<FtsApiFutureStub> {
    private FtsApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtsApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> getUploadFileUrl(
        com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request) {
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
          serviceImpl.getUploadFileUrl((com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes>) responseObserver);
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
              com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq,
              com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes>(
                service, METHODID_GET_UPLOAD_FILE_URL)))
        .build();
  }

  private static abstract class FtsApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FtsApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.fts.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FtsApi");
    }
  }

  private static final class FtsApiFileDescriptorSupplier
      extends FtsApiBaseDescriptorSupplier {
    FtsApiFileDescriptorSupplier() {}
  }

  private static final class FtsApiMethodDescriptorSupplier
      extends FtsApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FtsApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (FtsApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FtsApiFileDescriptorSupplier())
              .addMethod(getGetUploadFileUrlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
