package com.tcn.cloud.api.api.v1alpha1.srec;

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
    comments = "Source: api/v1alpha1/srec/service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.srec.Srec", "ListScreenRecordings"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.srec.Srec", "GetScreenRecordingURL"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.srec.Srec", "DeleteScreenRecording"))
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
    return new SrecStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SrecBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SrecBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SrecFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SrecFutureStub(channel);
  }

  /**
   */
  public static abstract class SrecImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public void listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListScreenRecordingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public void getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScreenRecordingURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public void deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteScreenRecordingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListScreenRecordingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest,
                com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse>(
                  this, METHODID_LIST_SCREEN_RECORDINGS)))
          .addMethod(
            getGetScreenRecordingURLMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest,
                com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse>(
                  this, METHODID_GET_SCREEN_RECORDING_URL)))
          .addMethod(
            getDeleteScreenRecordingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest,
                com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse>(
                  this, METHODID_DELETE_SCREEN_RECORDING)))
          .build();
    }
  }

  /**
   */
  public static final class SrecStub extends io.grpc.stub.AbstractStub<SrecStub> {
    private SrecStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SrecStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SrecStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public void listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListScreenRecordingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public void getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScreenRecordingURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public void deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteScreenRecordingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SrecBlockingStub extends io.grpc.stub.AbstractStub<SrecBlockingStub> {
    private SrecBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SrecBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SrecBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse listScreenRecordings(com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListScreenRecordingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse getScreenRecordingURL(com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetScreenRecordingURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse deleteScreenRecording(com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteScreenRecordingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SrecFutureStub extends io.grpc.stub.AbstractStub<SrecFutureStub> {
    private SrecFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SrecFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SrecFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SrecFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListScreenRecordings returns screen recordings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsResponse> listScreenRecordings(
        com.tcn.cloud.api.api.v1alpha1.srec.ListScreenRecordingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListScreenRecordingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScreenRecordingURL returns the screen recording url.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLResponse> getScreenRecordingURL(
        com.tcn.cloud.api.api.v1alpha1.srec.GetScreenRecordingURLRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScreenRecordingURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScreenRecording deletes a screen recording.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingResponse> deleteScreenRecording(
        com.tcn.cloud.api.api.v1alpha1.srec.DeleteScreenRecordingRequest request) {
      return futureUnaryCall(
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
    private final SrecImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SrecImplBase serviceImpl, int methodId) {
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
