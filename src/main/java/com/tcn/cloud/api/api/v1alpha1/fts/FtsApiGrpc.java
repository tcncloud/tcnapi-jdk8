package com.tcn.cloud.api.api.v1alpha1.fts;

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
    comments = "Source: api/v1alpha1/fts/service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.fts.FtsApi", "GetUploadFileUrl"))
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
    return new FtsApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FtsApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FtsApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FtsApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FtsApiFutureStub(channel);
  }

  /**
   */
  public static abstract class FtsApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUploadFileUrlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUploadFileUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq,
                com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes>(
                  this, METHODID_GET_UPLOAD_FILE_URL)))
          .build();
    }
  }

  /**
   */
  public static final class FtsApiStub extends io.grpc.stub.AbstractStub<FtsApiStub> {
    private FtsApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FtsApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FtsApiStub(channel, callOptions);
    }

    /**
     */
    public void getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUploadFileUrlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FtsApiBlockingStub extends io.grpc.stub.AbstractStub<FtsApiBlockingStub> {
    private FtsApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FtsApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FtsApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes getUploadFileUrl(com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUploadFileUrlMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FtsApiFutureStub extends io.grpc.stub.AbstractStub<FtsApiFutureStub> {
    private FtsApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FtsApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtsApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FtsApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlRes> getUploadFileUrl(
        com.tcn.cloud.api.api.v1alpha1.fts.GetUploadFileUrlReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUploadFileUrlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_UPLOAD_FILE_URL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FtsApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FtsApiImplBase serviceImpl, int methodId) {
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
