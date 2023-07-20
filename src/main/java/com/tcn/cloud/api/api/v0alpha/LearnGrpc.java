package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * A service for creating and reading learning material
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: api/v0alpha/learn.proto")
@io.grpc.stub.annotations.GrpcGenerated
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exist"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Content"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportMany"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchContent"))
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchRes> getListSearchResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSearchResults",
      requestType = com.tcn.cloud.api.api.v0alpha.SearchContentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq,
      com.tcn.cloud.api.api.v0alpha.SearchRes> getListSearchResultsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchContentReq, com.tcn.cloud.api.api.v0alpha.SearchRes> getListSearchResultsMethod;
    if ((getListSearchResultsMethod = LearnGrpc.getListSearchResultsMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getListSearchResultsMethod = LearnGrpc.getListSearchResultsMethod) == null) {
          LearnGrpc.getListSearchResultsMethod = getListSearchResultsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SearchContentReq, com.tcn.cloud.api.api.v0alpha.SearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSearchResults"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchContentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new LearnMethodDescriptorSupplier("ListSearchResults"))
              .build();
        }
      }
    }
    return getListSearchResultsMethod;
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Standalone"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContentEditorData"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreStaticImage"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadDynamicScreenshot"))
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq,
      com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> getDeleteStandaloneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStandalone",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq,
      com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> getDeleteStandaloneMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq, com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> getDeleteStandaloneMethod;
    if ((getDeleteStandaloneMethod = LearnGrpc.getDeleteStandaloneMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getDeleteStandaloneMethod = LearnGrpc.getDeleteStandaloneMethod) == null) {
          LearnGrpc.getDeleteStandaloneMethod = getDeleteStandaloneMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq, com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStandalone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes.getDefaultInstance()))
              .setSchemaDescriptor(new LearnMethodDescriptorSupplier("DeleteStandalone"))
              .build();
        }
      }
    }
    return getDeleteStandaloneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SnippetReq,
      com.tcn.cloud.api.api.v0alpha.SnippetRes> getSnippetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Snippet",
      requestType = com.tcn.cloud.api.api.v0alpha.SnippetReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SnippetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SnippetReq,
      com.tcn.cloud.api.api.v0alpha.SnippetRes> getSnippetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SnippetReq, com.tcn.cloud.api.api.v0alpha.SnippetRes> getSnippetMethod;
    if ((getSnippetMethod = LearnGrpc.getSnippetMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getSnippetMethod = LearnGrpc.getSnippetMethod) == null) {
          LearnGrpc.getSnippetMethod = getSnippetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SnippetReq, com.tcn.cloud.api.api.v0alpha.SnippetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Snippet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SnippetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SnippetRes.getDefaultInstance()))
              .setSchemaDescriptor(new LearnMethodDescriptorSupplier("Snippet"))
              .build();
        }
      }
    }
    return getSnippetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq,
      com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> getDeleteLearnPagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLearnPages",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq,
      com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> getDeleteLearnPagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq, com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> getDeleteLearnPagesMethod;
    if ((getDeleteLearnPagesMethod = LearnGrpc.getDeleteLearnPagesMethod) == null) {
      synchronized (LearnGrpc.class) {
        if ((getDeleteLearnPagesMethod = LearnGrpc.getDeleteLearnPagesMethod) == null) {
          LearnGrpc.getDeleteLearnPagesMethod = getDeleteLearnPagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq, com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLearnPages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes.getDefaultInstance()))
              .setSchemaDescriptor(new LearnMethodDescriptorSupplier("DeleteLearnPages"))
              .build();
        }
      }
    }
    return getDeleteLearnPagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LearnStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LearnStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LearnStub>() {
        @java.lang.Override
        public LearnStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LearnStub(channel, callOptions);
        }
      };
    return LearnStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LearnBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LearnBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LearnBlockingStub>() {
        @java.lang.Override
        public LearnBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LearnBlockingStub(channel, callOptions);
        }
      };
    return LearnBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LearnFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LearnFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LearnFutureStub>() {
        @java.lang.Override
        public LearnFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LearnFutureStub(channel, callOptions);
        }
      };
    return LearnFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * check if learning page already exists
     * </pre>
     */
    default void exist(com.tcn.cloud.api.api.v0alpha.ExistReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExistMethod(), responseObserver);
    }

    /**
     * <pre>
     * retreive content from learning pages
     * </pre>
     */
    default void content(com.tcn.cloud.api.api.v0alpha.ContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    default void exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportManyMethod(), responseObserver);
    }

    /**
     * <pre>
     * search content in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    default void searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchContentMethod(), responseObserver);
    }

    /**
     * <pre>
     * stream search content results in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    default void listSearchResults(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSearchResultsMethod(), responseObserver);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * we allow all the logged in agents/admins to view standalone articles
     * </pre>
     */
    default void standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStandaloneMethod(), responseObserver);
    }

    /**
     * <pre>
     * retrieve user who edited the content last
     * </pre>
     */
    default void contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContentEditorDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * update contents for learning pages
     * </pre>
     */
    default void update(com.tcn.cloud.api.api.v0alpha.UpdateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    default void storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreStaticImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    default void uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadDynamicScreenshotMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete standalone articles from learning pages
     * </pre>
     */
    default void deleteStandalone(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStandaloneMethod(), responseObserver);
    }

    /**
     * <pre>
     * get snippet content from learning pages
     * we allow all the logged in agents/admins to view snippet content
     * </pre>
     */
    default void snippet(com.tcn.cloud.api.api.v0alpha.SnippetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SnippetRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSnippetMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete learning pages
     * </pre>
     */
    default void deleteLearnPages(com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLearnPagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Learn.
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static abstract class LearnImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LearnGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Learn.
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnStub
      extends io.grpc.stub.AbstractAsyncStub<LearnStub> {
    private LearnStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LearnStub(channel, callOptions);
    }

    /**
     * <pre>
     * check if learning page already exists
     * </pre>
     */
    public void exist(com.tcn.cloud.api.api.v0alpha.ExistReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * retreive content from learning pages
     * </pre>
     */
    public void content(com.tcn.cloud.api.api.v0alpha.ContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public void exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportManyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * search content in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    public void searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * stream search content results in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    public void listSearchResults(com.tcn.cloud.api.api.v0alpha.SearchContentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListSearchResultsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * we allow all the logged in agents/admins to view standalone articles
     * </pre>
     */
    public void standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStandaloneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * retrieve user who edited the content last
     * </pre>
     */
    public void contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContentEditorDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update contents for learning pages
     * </pre>
     */
    public void update(com.tcn.cloud.api.api.v0alpha.UpdateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public void storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreStaticImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public void uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadDynamicScreenshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete standalone articles from learning pages
     * </pre>
     */
    public void deleteStandalone(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStandaloneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get snippet content from learning pages
     * we allow all the logged in agents/admins to view snippet content
     * </pre>
     */
    public void snippet(com.tcn.cloud.api.api.v0alpha.SnippetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SnippetRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSnippetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete learning pages
     * </pre>
     */
    public void deleteLearnPages(com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLearnPagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Learn.
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LearnBlockingStub> {
    private LearnBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LearnBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * check if learning page already exists
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ExistRes exist(com.tcn.cloud.api.api.v0alpha.ExistReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * retreive content from learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ContentRes content(com.tcn.cloud.api.api.v0alpha.ContentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportRes exportMany(com.tcn.cloud.api.api.v0alpha.ExportManyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportManyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * search content in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SearchRes searchContent(com.tcn.cloud.api.api.v0alpha.SearchContentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchContentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * stream search content results in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.SearchRes> listSearchResults(
        com.tcn.cloud.api.api.v0alpha.SearchContentReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListSearchResultsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * we allow all the logged in agents/admins to view standalone articles
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StandaloneRes standalone(com.tcn.cloud.api.api.v0alpha.StandaloneReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStandaloneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * retrieve user who edited the content last
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes contentEditorData(com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContentEditorDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update contents for learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateRes update(com.tcn.cloud.api.api.v0alpha.UpdateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes storeStaticImage(com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreStaticImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes uploadDynamicScreenshot(com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadDynamicScreenshotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete standalone articles from learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes deleteStandalone(com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStandaloneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get snippet content from learning pages
     * we allow all the logged in agents/admins to view snippet content
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SnippetRes snippet(com.tcn.cloud.api.api.v0alpha.SnippetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSnippetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete learning pages
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes deleteLearnPages(com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLearnPagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Learn.
   * <pre>
   * A service for creating and reading learning material
   * </pre>
   */
  public static final class LearnFutureStub
      extends io.grpc.stub.AbstractFutureStub<LearnFutureStub> {
    private LearnFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LearnFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LearnFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * check if learning page already exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExistRes> exist(
        com.tcn.cloud.api.api.v0alpha.ExistReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * retreive content from learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContentRes> content(
        com.tcn.cloud.api.api.v0alpha.ContentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * exports multiple pages of the learning center markdown as PDF
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExportRes> exportMany(
        com.tcn.cloud.api.api.v0alpha.ExportManyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportManyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * search content in learning pages
     * we allow all the logged in agents/admins to view search content
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SearchRes> searchContent(
        com.tcn.cloud.api.api.v0alpha.SearchContentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchContentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get standalone articles from learning pages
     * we allow all the logged in agents/admins to view standalone articles
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StandaloneRes> standalone(
        com.tcn.cloud.api.api.v0alpha.StandaloneReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStandaloneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * retrieve user who edited the content last
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes> contentEditorData(
        com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContentEditorDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update contents for learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateRes> update(
        com.tcn.cloud.api.api.v0alpha.UpdateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload url for static images
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes> storeStaticImage(
        com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreStaticImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * upload dynamic learning image screenshot
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes> uploadDynamicScreenshot(
        com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadDynamicScreenshotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete standalone articles from learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes> deleteStandalone(
        com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStandaloneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get snippet content from learning pages
     * we allow all the logged in agents/admins to view snippet content
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SnippetRes> snippet(
        com.tcn.cloud.api.api.v0alpha.SnippetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSnippetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete learning pages
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes> deleteLearnPages(
        com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLearnPagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXIST = 0;
  private static final int METHODID_CONTENT = 1;
  private static final int METHODID_EXPORT_MANY = 2;
  private static final int METHODID_SEARCH_CONTENT = 3;
  private static final int METHODID_LIST_SEARCH_RESULTS = 4;
  private static final int METHODID_STANDALONE = 5;
  private static final int METHODID_CONTENT_EDITOR_DATA = 6;
  private static final int METHODID_UPDATE = 7;
  private static final int METHODID_STORE_STATIC_IMAGE = 8;
  private static final int METHODID_UPLOAD_DYNAMIC_SCREENSHOT = 9;
  private static final int METHODID_DELETE_STANDALONE = 10;
  private static final int METHODID_SNIPPET = 11;
  private static final int METHODID_DELETE_LEARN_PAGES = 12;

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
        case METHODID_EXIST:
          serviceImpl.exist((com.tcn.cloud.api.api.v0alpha.ExistReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExistRes>) responseObserver);
          break;
        case METHODID_CONTENT:
          serviceImpl.content((com.tcn.cloud.api.api.v0alpha.ContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentRes>) responseObserver);
          break;
        case METHODID_EXPORT_MANY:
          serviceImpl.exportMany((com.tcn.cloud.api.api.v0alpha.ExportManyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExportRes>) responseObserver);
          break;
        case METHODID_SEARCH_CONTENT:
          serviceImpl.searchContent((com.tcn.cloud.api.api.v0alpha.SearchContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes>) responseObserver);
          break;
        case METHODID_LIST_SEARCH_RESULTS:
          serviceImpl.listSearchResults((com.tcn.cloud.api.api.v0alpha.SearchContentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SearchRes>) responseObserver);
          break;
        case METHODID_STANDALONE:
          serviceImpl.standalone((com.tcn.cloud.api.api.v0alpha.StandaloneReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StandaloneRes>) responseObserver);
          break;
        case METHODID_CONTENT_EDITOR_DATA:
          serviceImpl.contentEditorData((com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.tcn.cloud.api.api.v0alpha.UpdateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateRes>) responseObserver);
          break;
        case METHODID_STORE_STATIC_IMAGE:
          serviceImpl.storeStaticImage((com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes>) responseObserver);
          break;
        case METHODID_UPLOAD_DYNAMIC_SCREENSHOT:
          serviceImpl.uploadDynamicScreenshot((com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes>) responseObserver);
          break;
        case METHODID_DELETE_STANDALONE:
          serviceImpl.deleteStandalone((com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes>) responseObserver);
          break;
        case METHODID_SNIPPET:
          serviceImpl.snippet((com.tcn.cloud.api.api.v0alpha.SnippetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SnippetRes>) responseObserver);
          break;
        case METHODID_DELETE_LEARN_PAGES:
          serviceImpl.deleteLearnPages((com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes>) responseObserver);
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
          getExistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ExistReq,
              com.tcn.cloud.api.api.v0alpha.ExistRes>(
                service, METHODID_EXIST)))
        .addMethod(
          getContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ContentReq,
              com.tcn.cloud.api.api.v0alpha.ContentRes>(
                service, METHODID_CONTENT)))
        .addMethod(
          getExportManyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ExportManyReq,
              com.tcn.cloud.api.api.v0alpha.ExportRes>(
                service, METHODID_EXPORT_MANY)))
        .addMethod(
          getSearchContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SearchContentReq,
              com.tcn.cloud.api.api.v0alpha.SearchRes>(
                service, METHODID_SEARCH_CONTENT)))
        .addMethod(
          getListSearchResultsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SearchContentReq,
              com.tcn.cloud.api.api.v0alpha.SearchRes>(
                service, METHODID_LIST_SEARCH_RESULTS)))
        .addMethod(
          getStandaloneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StandaloneReq,
              com.tcn.cloud.api.api.v0alpha.StandaloneRes>(
                service, METHODID_STANDALONE)))
        .addMethod(
          getContentEditorDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ContentEditorDataReq,
              com.tcn.cloud.api.api.v0alpha.ContentEditorDataRes>(
                service, METHODID_CONTENT_EDITOR_DATA)))
        .addMethod(
          getUpdateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateReq,
              com.tcn.cloud.api.api.v0alpha.UpdateRes>(
                service, METHODID_UPDATE)))
        .addMethod(
          getStoreStaticImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StoreStaticImageReq,
              com.tcn.cloud.api.api.v0alpha.StoreStaticImageRes>(
                service, METHODID_STORE_STATIC_IMAGE)))
        .addMethod(
          getUploadDynamicScreenshotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotReq,
              com.tcn.cloud.api.api.v0alpha.UploadDynamicScreenshotRes>(
                service, METHODID_UPLOAD_DYNAMIC_SCREENSHOT)))
        .addMethod(
          getDeleteStandaloneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteStandaloneReq,
              com.tcn.cloud.api.api.v0alpha.DeleteStandaloneRes>(
                service, METHODID_DELETE_STANDALONE)))
        .addMethod(
          getSnippetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SnippetReq,
              com.tcn.cloud.api.api.v0alpha.SnippetRes>(
                service, METHODID_SNIPPET)))
        .addMethod(
          getDeleteLearnPagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesReq,
              com.tcn.cloud.api.api.v0alpha.DeleteLearnPagesRes>(
                service, METHODID_DELETE_LEARN_PAGES)))
        .build();
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
              .addMethod(getExportManyMethod())
              .addMethod(getSearchContentMethod())
              .addMethod(getListSearchResultsMethod())
              .addMethod(getStandaloneMethod())
              .addMethod(getContentEditorDataMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getStoreStaticImageMethod())
              .addMethod(getUploadDynamicScreenshotMethod())
              .addMethod(getDeleteStandaloneMethod())
              .addMethod(getSnippetMethod())
              .addMethod(getDeleteLearnPagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
