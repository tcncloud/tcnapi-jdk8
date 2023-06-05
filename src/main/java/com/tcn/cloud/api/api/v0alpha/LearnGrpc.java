package com.tcn.cloud.api.api.v0alpha;

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
 * <pre>
 * A service for creating and reading learning material
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/learn.proto")
public final class LearnGrpc {

  private LearnGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Learn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExistReq,
      com.tcn.cloud.api.api.v0alpha.ExistRes> getExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exist",
      requestType = com.tcn.cloud.api.api.v0alpha.ExistReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ExistRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExistReq,
      com.tcn.cloud.api.api.v0alpha.ExistRes> getExistMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExistReq, com.tcn.cloud.api.api.v0alpha.ExistRes> getExistMethod;
    if ((getExistMethod = LearnGrpc.getExistMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getExistMethod = LearnGrpc.getExistMethod) == null) {
          LearnGrpc.getExistMethod = getExistMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ExistReq, com.tcn.cloud.api.api.v0alpha.ExistRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "Exist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExistReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExistRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("Exist"))
                  .build();
          }
        }
     }
     return getExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentReq,
      com.tcn.cloud.api.api.v0alpha.ContentRes> getContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Content",
      requestType = com.tcn.cloud.api.api.v0alpha.ContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ContentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentReq,
      com.tcn.cloud.api.api.v0alpha.ContentRes> getContentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentReq, com.tcn.cloud.api.api.v0alpha.ContentRes> getContentMethod;
    if ((getContentMethod = LearnGrpc.getContentMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getContentMethod = LearnGrpc.getContentMethod) == null) {
          LearnGrpc.getContentMethod = getContentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ContentReq, com.tcn.cloud.api.api.v0alpha.ContentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "Content"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("Content"))
                  .build();
          }
        }
     }
     return getContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq,
      com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> getContentEditorDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContentEditorData",
      requestType = com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq,
      com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> getContentEditorDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq, com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> getContentEditorDataMethod;
    if ((getContentEditorDataMethod = LearnGrpc.getContentEditorDataMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getContentEditorDataMethod = LearnGrpc.getContentEditorDataMethod) == null) {
          LearnGrpc.getContentEditorDataMethod = getContentEditorDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq, com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "ContentEditorData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("ContentEditorData"))
                  .build();
          }
        }
     }
     return getContentEditorDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateRes> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateRes> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateReq, com.tcn.cloud.api.api.v0alpha.UpdateRes> getUpdateMethod;
    if ((getUpdateMethod = LearnGrpc.getUpdateMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getUpdateMethod = LearnGrpc.getUpdateMethod) == null) {
          LearnGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateReq, com.tcn.cloud.api.api.v0alpha.UpdateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("Update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportManyReq,
      com.tcn.cloud.api.api.v0alpha.ExportRes> getExportManyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportMany",
      requestType = com.tcn.cloud.api.api.v0alpha.ExportManyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ExportRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportManyReq,
      com.tcn.cloud.api.api.v0alpha.ExportRes> getExportManyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExportManyReq, com.tcn.cloud.api.api.v0alpha.ExportRes> getExportManyMethod;
    if ((getExportManyMethod = LearnGrpc.getExportManyMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getExportManyMethod = LearnGrpc.getExportManyMethod) == null) {
          LearnGrpc.getExportManyMethod = getExportManyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ExportManyReq, com.tcn.cloud.api.api.v0alpha.ExportRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "ExportMany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExportManyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExportRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("ExportMany"))
                  .build();
          }
        }
     }
     return getExportManyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq,
      com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> getStoreStaticImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreStaticImage",
      requestType = com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq,
      com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> getStoreStaticImageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq, com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> getStoreStaticImageMethod;
    if ((getStoreStaticImageMethod = LearnGrpc.getStoreStaticImageMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getStoreStaticImageMethod = LearnGrpc.getStoreStaticImageMethod) == null) {
          LearnGrpc.getStoreStaticImageMethod = getStoreStaticImageMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq, com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "StoreStaticImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("StoreStaticImage"))
                  .build();
          }
        }
     }
     return getStoreStaticImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchRes> getSearchContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchContent",
      requestType = com.tcn.cloud.api.api.v0alpha.SearchContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchRes> getSearchContentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq, com.tcn.cloud.api.api.v0alpha.SearchRes> getSearchContentMethod;
    if ((getSearchContentMethod = LearnGrpc.getSearchContentMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getSearchContentMethod = LearnGrpc.getSearchContentMethod) == null) {
          LearnGrpc.getSearchContentMethod = getSearchContentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SearchContentReq, com.tcn.cloud.api.api.v0alpha.SearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "SearchContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("SearchContent"))
                  .build();
          }
        }
     }
     return getSearchContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq,
      com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> getUploadDynamicScreenshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadDynamicScreenshot",
      requestType = com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq,
      com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> getUploadDynamicScreenshotMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq, com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> getUploadDynamicScreenshotMethod;
    if ((getUploadDynamicScreenshotMethod = LearnGrpc.getUploadDynamicScreenshotMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getUploadDynamicScreenshotMethod = LearnGrpc.getUploadDynamicScreenshotMethod) == null) {
          LearnGrpc.getUploadDynamicScreenshotMethod = getUploadDynamicScreenshotMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq, com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "UploadDynamicScreenshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("UploadDynamicScreenshot"))
                  .build();
          }
        }
     }
     return getUploadDynamicScreenshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StandaloneReq,
      com.tcn.cloud.api.api.v0alpha.StandaloneRes> getStandaloneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Standalone",
      requestType = com.tcn.cloud.api.api.v0alpha.StandaloneReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StandaloneRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StandaloneReq,
      com.tcn.cloud.api.api.v0alpha.StandaloneRes> getStandaloneMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StandaloneReq, com.tcn.cloud.api.api.v0alpha.StandaloneRes> getStandaloneMethod;
    if ((getStandaloneMethod = LearnGrpc.getStandaloneMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getStandaloneMethod = LearnGrpc.getStandaloneMethod) == null) {
          LearnGrpc.getStandaloneMethod = getStandaloneMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StandaloneReq, com.tcn.cloud.api.api.v0alpha.StandaloneRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Learn", "Standalone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StandaloneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StandaloneRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LearnMethodDescriptorSupplier("Standalone"))
                  .build();
          }
        }
     }
     return getStandaloneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LearnStub newStub(io.grpc.Channel channel) {
    return new LearnStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LearnBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LearnBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LearnFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LearnFutureStub(channel);
  }

  /**
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static abstract class LearnImplBase implements io.grpc.BindableService {

    /**
     */
    public void exist(com.tcn.cloud.api.api.v0alpha.ExistReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes> responseObserver) {
      asyncUnimplementedUnaryCall(getExistMethod(), responseObserver);
    }

    /**
     */
    public void content(com.tcn.cloud.api.api.v0alpha.ContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getContentMethod(), responseObserver);
    }

    /**
     */
    public void contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getContentEditorDataMethod(), responseObserver);
    }

    /**
     */
    public void update(com.tcn.cloud.api.api.v0alpha.UpdateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public void exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes> responseObserver) {
      asyncUnimplementedUnaryCall(getExportManyMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public void storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * search content in learning pages
     * </pre>
     */
    public void searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public void uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadDynamicScreenshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * </pre>
     */
    public void standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStandaloneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ExistReq,
                com.tcn.cloud.api.api.v0alpha.ExistRes>(
                  this, METHODID_EXIST)))
          .addMethod(
            getContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ContentReq,
                com.tcn.cloud.api.api.v0alpha.ContentRes>(
                  this, METHODID_CONTENT)))
          .addMethod(
            getContentEditorDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq,
                com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes>(
                  this, METHODID_CONTENT_EDITOR_DATA)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateReq,
                com.tcn.cloud.api.api.v0alpha.UpdateRes>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getExportManyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ExportManyReq,
                com.tcn.cloud.api.api.v0alpha.ExportRes>(
                  this, METHODID_EXPORT_MANY)))
          .addMethod(
            getStoreStaticImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq,
                com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes>(
                  this, METHODID_STORE_STATIC_IMAGE)))
          .addMethod(
            getSearchContentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SearchContentReq,
                com.tcn.cloud.api.api.v0alpha.SearchRes>(
                  this, METHODID_SEARCH_CONTENT)))
          .addMethod(
            getUploadDynamicScreenshotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq,
                com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes>(
                  this, METHODID_UPLOAD_DYNAMIC_SCREENSHOT)))
          .addMethod(
            getStandaloneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StandaloneReq,
                com.tcn.cloud.api.api.v0alpha.StandaloneRes>(
                  this, METHODID_STANDALONE)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnStub extends io.grpc.stub.AbstractStub<LearnStub> {
    private LearnStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearnStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearnStub(channel, callOptions);
    }

    /**
     */
    public void exist(com.tcn.cloud.api.api.v0alpha.ExistReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void content(com.tcn.cloud.api.api.v0alpha.ContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContentEditorDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.tcn.cloud.api.api.v0alpha.UpdateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public void exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportManyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public void storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * search content in learning pages
     * </pre>
     */
    public void searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public void uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadDynamicScreenshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * </pre>
     */
    public void standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStandaloneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnBlockingStub extends io.grpc.stub.AbstractStub<LearnBlockingStub> {
    private LearnBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearnBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearnBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ExistRes exist(com.tcn.cloud.api.api.v0alpha.ExistReq request) {
      return blockingUnaryCall(
          getChannel(), getExistMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ContentRes content(com.tcn.cloud.api.api.v0alpha.ContentReq request) {
      return blockingUnaryCall(
          getChannel(), getContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request) {
      return blockingUnaryCall(
          getChannel(), getContentEditorDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateRes update(com.tcn.cloud.api.api.v0alpha.UpdateReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportRes exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request) {
      return blockingUnaryCall(
          getChannel(), getExportManyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request) {
      return blockingUnaryCall(
          getChannel(), getStoreStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * search content in learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SearchRes searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request) {
      return blockingUnaryCall(
          getChannel(), getSearchContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request) {
      return blockingUnaryCall(
          getChannel(), getUploadDynamicScreenshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StandaloneRes standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request) {
      return blockingUnaryCall(
          getChannel(), getStandaloneMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnFutureStub extends io.grpc.stub.AbstractStub<LearnFutureStub> {
    private LearnFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LearnFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LearnFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExistRes> exist(
        com.tcn.cloud.api.api.v0alpha.ExistReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContentRes> content(
        com.tcn.cloud.api.api.v0alpha.ContentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> contentEditorData(
        com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getContentEditorDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateRes> update(
        com.tcn.cloud.api.api.v0alpha.UpdateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExportRes> exportMany(
        com.tcn.cloud.api.api.v0alpha.ExportManyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExportManyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> storeStaticImage(
        com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * search content in learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SearchRes> searchContent(
        com.tcn.cloud.api.api.v0alpha.SearchContentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> uploadDynamicScreenshot(
        com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadDynamicScreenshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StandaloneRes> standalone(
        com.tcn.cloud.api.api.v0alpha.StandaloneReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStandaloneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXIST = 0;
  private static final int METHODID_CONTENT = 1;
  private static final int METHODID_CONTENT_EDITOR_DATA = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_EXPORT_MANY = 4;
  private static final int METHODID_STORE_STATIC_IMAGE = 5;
  private static final int METHODID_SEARCH_CONTENT = 6;
  private static final int METHODID_UPLOAD_DYNAMIC_SCREENSHOT = 7;
  private static final int METHODID_STANDALONE = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LearnImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LearnImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXIST:
          serviceImpl.exist((com.tcn.cloud.api.api.v0alpha.ExistReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes>) responseObserver);
          break;
        case METHODID_CONTENT:
          serviceImpl.content((com.tcn.cloud.api.api.v0alpha.ContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes>) responseObserver);
          break;
        case METHODID_CONTENT_EDITOR_DATA:
          serviceImpl.contentEditorData((com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.tcn.cloud.api.api.v0alpha.UpdateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes>) responseObserver);
          break;
        case METHODID_EXPORT_MANY:
          serviceImpl.exportMany((com.tcn.cloud.api.api.v0alpha.ExportManyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes>) responseObserver);
          break;
        case METHODID_STORE_STATIC_IMAGE:
          serviceImpl.storeStaticImage((com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes>) responseObserver);
          break;
        case METHODID_SEARCH_CONTENT:
          serviceImpl.searchContent((com.tcn.cloud.api.api.v0alpha.SearchContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes>) responseObserver);
          break;
        case METHODID_UPLOAD_DYNAMIC_SCREENSHOT:
          serviceImpl.uploadDynamicScreenshot((com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes>) responseObserver);
          break;
        case METHODID_STANDALONE:
          serviceImpl.standalone((com.tcn.cloud.api.api.v0alpha.StandaloneReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes>) responseObserver);
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

  private static abstract class LearnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LearnBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Learn");
    }
  }

  private static final class LearnFileDescriptorSupplier
      extends LearnBaseDescriptorSupplier {
    LearnFileDescriptorSupplier() {}
  }

  private static final class LearnMethodDescriptorSupplier
      extends LearnBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LearnMethodDescriptorSupplier(String methodName) {
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
      synchronized (LearnGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LearnFileDescriptorSupplier())
              .addMethod(getExistMethod())
              .addMethod(getContentMethod())
              .addMethod(getContentEditorDataMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getExportManyMethod())
              .addMethod(getStoreStaticImageMethod())
              .addMethod(getSearchContentMethod())
              .addMethod(getUploadDynamicScreenshotMethod())
              .addMethod(getStandaloneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
