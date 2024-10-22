package com.tcn.cloud.api.api.v1alpha1.classifier;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/classifier/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClassifierFileTemplatesGrpc {

  private ClassifierFileTemplatesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.classifier.ClassifierFileTemplates";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> getParseFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseFile",
      requestType = com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> getParseFileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest, com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> getParseFileMethod;
    if ((getParseFileMethod = ClassifierFileTemplatesGrpc.getParseFileMethod) == null) {
      synchronized (ClassifierFileTemplatesGrpc.class) {
        if ((getParseFileMethod = ClassifierFileTemplatesGrpc.getParseFileMethod) == null) {
          ClassifierFileTemplatesGrpc.getParseFileMethod = getParseFileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest, com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifierFileTemplatesMethodDescriptorSupplier("ParseFile"))
              .build();
        }
      }
    }
    return getParseFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> getUpdateFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> getUpdateFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> getUpdateFileTemplateMethod;
    if ((getUpdateFileTemplateMethod = ClassifierFileTemplatesGrpc.getUpdateFileTemplateMethod) == null) {
      synchronized (ClassifierFileTemplatesGrpc.class) {
        if ((getUpdateFileTemplateMethod = ClassifierFileTemplatesGrpc.getUpdateFileTemplateMethod) == null) {
          ClassifierFileTemplatesGrpc.getUpdateFileTemplateMethod = getUpdateFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifierFileTemplatesMethodDescriptorSupplier("UpdateFileTemplate"))
              .build();
        }
      }
    }
    return getUpdateFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> getDeleteFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> getDeleteFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> getDeleteFileTemplateMethod;
    if ((getDeleteFileTemplateMethod = ClassifierFileTemplatesGrpc.getDeleteFileTemplateMethod) == null) {
      synchronized (ClassifierFileTemplatesGrpc.class) {
        if ((getDeleteFileTemplateMethod = ClassifierFileTemplatesGrpc.getDeleteFileTemplateMethod) == null) {
          ClassifierFileTemplatesGrpc.getDeleteFileTemplateMethod = getDeleteFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifierFileTemplatesMethodDescriptorSupplier("DeleteFileTemplate"))
              .build();
        }
      }
    }
    return getDeleteFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> getListFileTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> getListFileTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> getListFileTemplatesMethod;
    if ((getListFileTemplatesMethod = ClassifierFileTemplatesGrpc.getListFileTemplatesMethod) == null) {
      synchronized (ClassifierFileTemplatesGrpc.class) {
        if ((getListFileTemplatesMethod = ClassifierFileTemplatesGrpc.getListFileTemplatesMethod) == null) {
          ClassifierFileTemplatesGrpc.getListFileTemplatesMethod = getListFileTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest, com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFileTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifierFileTemplatesMethodDescriptorSupplier("ListFileTemplates"))
              .build();
        }
      }
    }
    return getListFileTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> getGetFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> getGetFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> getGetFileTemplateMethod;
    if ((getGetFileTemplateMethod = ClassifierFileTemplatesGrpc.getGetFileTemplateMethod) == null) {
      synchronized (ClassifierFileTemplatesGrpc.class) {
        if ((getGetFileTemplateMethod = ClassifierFileTemplatesGrpc.getGetFileTemplateMethod) == null) {
          ClassifierFileTemplatesGrpc.getGetFileTemplateMethod = getGetFileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest, com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ClassifierFileTemplatesMethodDescriptorSupplier("GetFileTemplate"))
              .build();
        }
      }
    }
    return getGetFileTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClassifierFileTemplatesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesStub>() {
        @java.lang.Override
        public ClassifierFileTemplatesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifierFileTemplatesStub(channel, callOptions);
        }
      };
    return ClassifierFileTemplatesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClassifierFileTemplatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesBlockingStub>() {
        @java.lang.Override
        public ClassifierFileTemplatesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifierFileTemplatesBlockingStub(channel, callOptions);
        }
      };
    return ClassifierFileTemplatesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClassifierFileTemplatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClassifierFileTemplatesFutureStub>() {
        @java.lang.Override
        public ClassifierFileTemplatesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClassifierFileTemplatesFutureStub(channel, callOptions);
        }
      };
    return ClassifierFileTemplatesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void parseFile(com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseFileMethod(), responseObserver);
    }

    /**
     */
    default void updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFileTemplateMethod(), responseObserver);
    }

    /**
     */
    default void deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileTemplateMethod(), responseObserver);
    }

    /**
     */
    default void listFileTemplates(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFileTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void getFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFileTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClassifierFileTemplates.
   */
  public static abstract class ClassifierFileTemplatesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClassifierFileTemplatesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClassifierFileTemplates.
   */
  public static final class ClassifierFileTemplatesStub
      extends io.grpc.stub.AbstractAsyncStub<ClassifierFileTemplatesStub> {
    private ClassifierFileTemplatesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifierFileTemplatesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifierFileTemplatesStub(channel, callOptions);
    }

    /**
     */
    public void parseFile(com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFileTemplates(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFileTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClassifierFileTemplates.
   */
  public static final class ClassifierFileTemplatesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClassifierFileTemplatesBlockingStub> {
    private ClassifierFileTemplatesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifierFileTemplatesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifierFileTemplatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse parseFile(com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse updateFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse deleteFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse listFileTemplates(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFileTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse getFileTemplate(com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFileTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClassifierFileTemplates.
   */
  public static final class ClassifierFileTemplatesFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClassifierFileTemplatesFutureStub> {
    private ClassifierFileTemplatesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClassifierFileTemplatesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClassifierFileTemplatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse> parseFile(
        com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse> updateFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse> deleteFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse> listFileTemplates(
        com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFileTemplatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse> getFileTemplate(
        com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARSE_FILE = 0;
  private static final int METHODID_UPDATE_FILE_TEMPLATE = 1;
  private static final int METHODID_DELETE_FILE_TEMPLATE = 2;
  private static final int METHODID_LIST_FILE_TEMPLATES = 3;
  private static final int METHODID_GET_FILE_TEMPLATE = 4;

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
        case METHODID_PARSE_FILE:
          serviceImpl.parseFile((com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FILE_TEMPLATE:
          serviceImpl.updateFileTemplate((com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_FILE_TEMPLATE:
          serviceImpl.deleteFileTemplate((com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_FILE_TEMPLATES:
          serviceImpl.listFileTemplates((com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_TEMPLATE:
          serviceImpl.getFileTemplate((com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse>) responseObserver);
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
          getParseFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileRequest,
              com.tcn.cloud.api.api.v1alpha1.classifier.ParseFileResponse>(
                service, METHODID_PARSE_FILE)))
        .addMethod(
          getUpdateFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.classifier.UpdateFileTemplateResponse>(
                service, METHODID_UPDATE_FILE_TEMPLATE)))
        .addMethod(
          getDeleteFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.classifier.DeleteFileTemplateResponse>(
                service, METHODID_DELETE_FILE_TEMPLATE)))
        .addMethod(
          getListFileTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesRequest,
              com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse>(
                service, METHODID_LIST_FILE_TEMPLATES)))
        .addMethod(
          getGetFileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.classifier.GetFileTemplateResponse>(
                service, METHODID_GET_FILE_TEMPLATE)))
        .build();
  }

  private static abstract class ClassifierFileTemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClassifierFileTemplatesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClassifierFileTemplates");
    }
  }

  private static final class ClassifierFileTemplatesFileDescriptorSupplier
      extends ClassifierFileTemplatesBaseDescriptorSupplier {
    ClassifierFileTemplatesFileDescriptorSupplier() {}
  }

  private static final class ClassifierFileTemplatesMethodDescriptorSupplier
      extends ClassifierFileTemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ClassifierFileTemplatesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ClassifierFileTemplatesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClassifierFileTemplatesFileDescriptorSupplier())
              .addMethod(getParseFileMethod())
              .addMethod(getUpdateFileTemplateMethod())
              .addMethod(getDeleteFileTemplateMethod())
              .addMethod(getListFileTemplatesMethod())
              .addMethod(getGetFileTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
