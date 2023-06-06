package com.tcn.cloud.api.api.v1alpha1.srec;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: api/v1alpha1/srec/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SrecGrpc {

  private SrecGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.srec.Srec";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> getListScreenRecordingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScreenRecordings",
      requestType = com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> getListScreenRecordingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest, com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> getListScreenRecordingsMethod;
    if ((getListScreenRecordingsMethod = SrecGrpc.getListScreenRecordingsMethod) == null) {
      synchronized (SrecGrpc.class) {
        if ((getListScreenRecordingsMethod = SrecGrpc.getListScreenRecordingsMethod) == null) {
          SrecGrpc.getListScreenRecordingsMethod = getListScreenRecordingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest, com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScreenRecordings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SrecMethodDescriptorSupplier("ListScreenRecordings"))
              .build();
        }
      }
    }
    return getListScreenRecordingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> getGetScreenRecordingURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScreenRecordingURL",
      requestType = com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> getGetScreenRecordingURLMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest, com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> getGetScreenRecordingURLMethod;
    if ((getGetScreenRecordingURLMethod = SrecGrpc.getGetScreenRecordingURLMethod) == null) {
      synchronized (SrecGrpc.class) {
        if ((getGetScreenRecordingURLMethod = SrecGrpc.getGetScreenRecordingURLMethod) == null) {
          SrecGrpc.getGetScreenRecordingURLMethod = getGetScreenRecordingURLMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest, com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScreenRecordingURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SrecMethodDescriptorSupplier("GetScreenRecordingURL"))
              .build();
        }
      }
    }
    return getGetScreenRecordingURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> getDeleteScreenRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScreenRecording",
      requestType = com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest,
      com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> getDeleteScreenRecordingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest, com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> getDeleteScreenRecordingMethod;
    if ((getDeleteScreenRecordingMethod = SrecGrpc.getDeleteScreenRecordingMethod) == null) {
      synchronized (SrecGrpc.class) {
        if ((getDeleteScreenRecordingMethod = SrecGrpc.getDeleteScreenRecordingMethod) == null) {
          SrecGrpc.getDeleteScreenRecordingMethod = getDeleteScreenRecordingMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest, com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScreenRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SrecMethodDescriptorSupplier("DeleteScreenRecording"))
              .build();
        }
      }
    }
    return getDeleteScreenRecordingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SrecStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SrecStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SrecStub>() {
        @java.lang.Override
        public SrecStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SrecStub(channel, callOptions);
        }
      };
    return SrecStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SrecBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SrecBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SrecBlockingStub>() {
        @java.lang.Override
        public SrecBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SrecBlockingStub(channel, callOptions);
        }
      };
    return SrecBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SrecFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SrecFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SrecFutureStub>() {
        @java.lang.Override
        public SrecFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SrecFutureStub(channel, callOptions);
        }
      };
    return SrecFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    default void listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScreenRecordingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    default void getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScreenRecordingURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    default void deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScreenRecordingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Srec.
   */
  public static abstract class SrecImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SrecGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Srec.
   */
  public static final class SrecStub
      extends io.grpc.stub.AbstractAsyncStub<SrecStub> {
    private SrecStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SrecStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public void listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScreenRecordingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public void getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScreenRecordingURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public void deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScreenRecordingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Srec.
   */
  public static final class SrecBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SrecBlockingStub> {
    private SrecBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SrecBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScreenRecordingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScreenRecordingURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScreenRecordingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Srec.
   */
  public static final class SrecFutureStub
      extends io.grpc.stub.AbstractFutureStub<SrecFutureStub> {
    private SrecFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SrecFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> listScreenRecordings(
        com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScreenRecordingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> getScreenRecordingURL(
        com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScreenRecordingURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> deleteScreenRecording(
        com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScreenRecordingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SCREEN_RECORDINGS = 0;
  private static final int METHODID_GET_SCREEN_RECORDING_URL = 1;
  private static final int METHODID_DELETE_SCREEN_RECORDING = 2;

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
        case METHODID_LIST_SCREEN_RECORDINGS:
          serviceImpl.listScreenRecordings((com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse>) responseObserver);
          break;
        case METHODID_GET_SCREEN_RECORDING_URL:
          serviceImpl.getScreenRecordingURL((com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCREEN_RECORDING:
          serviceImpl.deleteScreenRecording((com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse>) responseObserver);
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
          getListScreenRecordingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest,
              com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse>(
                service, METHODID_LIST_SCREEN_RECORDINGS)))
        .addMethod(
          getGetScreenRecordingURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest,
              com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse>(
                service, METHODID_GET_SCREEN_RECORDING_URL)))
        .addMethod(
          getDeleteScreenRecordingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest,
              com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse>(
                service, METHODID_DELETE_SCREEN_RECORDING)))
        .build();
  }

  private static abstract class SrecBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SrecBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.srec.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Srec");
    }
  }

  private static final class SrecFileDescriptorSupplier
      extends SrecBaseDescriptorSupplier {
    SrecFileDescriptorSupplier() {}
  }

  private static final class SrecMethodDescriptorSupplier
      extends SrecBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SrecMethodDescriptorSupplier(String methodName) {
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
      synchronized (SrecGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SrecFileDescriptorSupplier())
              .addMethod(getListScreenRecordingsMethod())
              .addMethod(getGetScreenRecordingURLMethod())
              .addMethod(getDeleteScreenRecordingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
