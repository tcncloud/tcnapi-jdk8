package com.tcn.cloud.api.api.v1alpha1.lms;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/lms/api.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LMSGrpc {

  private LMSGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.lms.LMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> getDeleteFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> getDeleteFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> getDeleteFileTemplateMethod;
    if ((getDeleteFileTemplateMethod = LMSGrpc.getDeleteFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteFileTemplateMethod = LMSGrpc.getDeleteFileTemplateMethod) == null) {
          LMSGrpc.getDeleteFileTemplateMethod = getDeleteFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteFileTemplate"))
              .build();
        }
      }
    }
    return getDeleteFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> getGetFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> getGetFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> getGetFileTemplateMethod;
    if ((getGetFileTemplateMethod = LMSGrpc.getGetFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetFileTemplateMethod = LMSGrpc.getGetFileTemplateMethod) == null) {
          LMSGrpc.getGetFileTemplateMethod = getGetFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetFileTemplate"))
              .build();
        }
      }
    }
    return getGetFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> getListFileTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> getListFileTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> getListFileTemplatesMethod;
    if ((getListFileTemplatesMethod = LMSGrpc.getListFileTemplatesMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListFileTemplatesMethod = LMSGrpc.getListFileTemplatesMethod) == null) {
          LMSGrpc.getListFileTemplatesMethod = getListFileTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFileTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListFileTemplates"))
              .build();
        }
      }
    }
    return getListFileTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> getParseFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> getParseFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> getParseFileTemplateMethod;
    if ((getParseFileTemplateMethod = LMSGrpc.getParseFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getParseFileTemplateMethod = LMSGrpc.getParseFileTemplateMethod) == null) {
          LMSGrpc.getParseFileTemplateMethod = getParseFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult.getDefaultInstance()))
              .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ParseFileTemplate"))
              .build();
        }
      }
    }
    return getParseFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> getUpdateFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> getUpdateFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> getUpdateFileTemplateMethod;
    if ((getUpdateFileTemplateMethod = LMSGrpc.getUpdateFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateFileTemplateMethod = LMSGrpc.getUpdateFileTemplateMethod) == null) {
          LMSGrpc.getUpdateFileTemplateMethod = getUpdateFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateFileTemplate"))
              .build();
        }
      }
    }
    return getUpdateFileTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LMSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LMSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LMSStub>() {
        @java.lang.Override
        public LMSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LMSStub(channel, callOptions);
        }
      };
    return LMSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LMSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LMSBlockingStub>() {
        @java.lang.Override
        public LMSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LMSBlockingStub(channel, callOptions);
        }
      };
    return LMSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LMSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LMSFutureStub>() {
        @java.lang.Override
        public LMSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LMSFutureStub(channel, callOptions);
        }
      };
    return LMSFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFileTemplateMethod(), responseObserver);
    }

    /**
     */
    default void listFileTemplates(com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFileTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void parseFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseFileTemplateMethod(), responseObserver);
    }

    /**
     */
    default void updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFileTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LMS.
   */
  public static abstract class LMSImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LMSGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LMS.
   */
  public static final class LMSStub
      extends io.grpc.stub.AbstractAsyncStub<LMSStub> {
    private LMSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LMSStub(channel, callOptions);
    }

    /**
     */
    public void deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFileTemplates(com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFileTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void parseFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LMS.
   */
  public static final class LMSBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LMSBlockingStub> {
    private LMSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LMSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse getFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse listFileTemplates(com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFileTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult parseFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFileTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LMS.
   */
  public static final class LMSFutureStub
      extends io.grpc.stub.AbstractFutureStub<LMSFutureStub> {
    private LMSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LMSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse> deleteFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse> getFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse> listFileTemplates(
        com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFileTemplatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult> parseFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse> updateFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_FILE_TEMPLATE = 0;
  private static final int METHODID_GET_FILE_TEMPLATE = 1;
  private static final int METHODID_LIST_FILE_TEMPLATES = 2;
  private static final int METHODID_PARSE_FILE_TEMPLATE = 3;
  private static final int METHODID_UPDATE_FILE_TEMPLATE = 4;

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
        case METHODID_DELETE_FILE_TEMPLATE:
          serviceImpl.deleteFileTemplate((com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_TEMPLATE:
          serviceImpl.getFileTemplate((com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_FILE_TEMPLATES:
          serviceImpl.listFileTemplates((com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse>) responseObserver);
          break;
        case METHODID_PARSE_FILE_TEMPLATE:
          serviceImpl.parseFileTemplate((com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult>) responseObserver);
          break;
        case METHODID_UPDATE_FILE_TEMPLATE:
          serviceImpl.updateFileTemplate((com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse>) responseObserver);
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
          getDeleteFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.lms.DeleteFileTemplateResponse>(
                service, METHODID_DELETE_FILE_TEMPLATE)))
        .addMethod(
          getGetFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.lms.GetFileTemplateResponse>(
                service, METHODID_GET_FILE_TEMPLATE)))
        .addMethod(
          getListFileTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesRequest,
              com.tcn.cloud.api.api.v1alpha1.lms.ListFileTemplatesResponse>(
                service, METHODID_LIST_FILE_TEMPLATES)))
        .addMethod(
          getParseFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.lms.ParseFileTemplateResult>(
                service, METHODID_PARSE_FILE_TEMPLATE)))
        .addMethod(
          getUpdateFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.lms.UpdateFileTemplateResponse>(
                service, METHODID_UPDATE_FILE_TEMPLATE)))
        .build();
  }

  private static abstract class LMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.lms.ApiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LMS");
    }
  }

  private static final class LMSFileDescriptorSupplier
      extends LMSBaseDescriptorSupplier {
    LMSFileDescriptorSupplier() {}
  }

  private static final class LMSMethodDescriptorSupplier
      extends LMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LMSMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LMSFileDescriptorSupplier())
              .addMethod(getDeleteFileTemplateMethod())
              .addMethod(getGetFileTemplateMethod())
              .addMethod(getListFileTemplatesMethod())
              .addMethod(getParseFileTemplateMethod())
              .addMethod(getUpdateFileTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
