package com.tcn.cloud.api.wfo.vanalytics.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: wfo/vanalytics/v2/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VanalyticsGrpc {

  private VanalyticsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "wfo.vanalytics.v2.Vanalytics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchTranscripts",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> getSearchTranscriptsMethod;
    if ((getSearchTranscriptsMethod = VanalyticsGrpc.getSearchTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getSearchTranscriptsMethod = VanalyticsGrpc.getSearchTranscriptsMethod) == null) {
          VanalyticsGrpc.getSearchTranscriptsMethod = getSearchTranscriptsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("SearchTranscripts"))
              .build();
        }
      }
    }
    return getSearchTranscriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getGetFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlag",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getGetFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getGetFlagMethod;
    if ((getGetFlagMethod = VanalyticsGrpc.getGetFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetFlagMethod = VanalyticsGrpc.getGetFlagMethod) == null) {
          VanalyticsGrpc.getGetFlagMethod = getGetFlagMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Flag.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetFlag"))
              .build();
        }
      }
    }
    return getGetFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getCreateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlag",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getCreateFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getCreateFlagMethod;
    if ((getCreateFlagMethod = VanalyticsGrpc.getCreateFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagMethod = VanalyticsGrpc.getCreateFlagMethod) == null) {
          VanalyticsGrpc.getCreateFlagMethod = getCreateFlagMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Flag.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlag"))
              .build();
        }
      }
    }
    return getCreateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> getListFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlags",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> getListFlagsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> getListFlagsMethod;
    if ((getListFlagsMethod = VanalyticsGrpc.getListFlagsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagsMethod = VanalyticsGrpc.getListFlagsMethod) == null) {
          VanalyticsGrpc.getListFlagsMethod = getListFlagsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlags"))
              .build();
        }
      }
    }
    return getListFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getUpdateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlag",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getUpdateFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getUpdateFlagMethod;
    if ((getUpdateFlagMethod = VanalyticsGrpc.getUpdateFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getUpdateFlagMethod = VanalyticsGrpc.getUpdateFlagMethod) == null) {
          VanalyticsGrpc.getUpdateFlagMethod = getUpdateFlagMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Flag.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("UpdateFlag"))
              .build();
        }
      }
    }
    return getUpdateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> getDeleteFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlag",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> getDeleteFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> getDeleteFlagMethod;
    if ((getDeleteFlagMethod = VanalyticsGrpc.getDeleteFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteFlagMethod = VanalyticsGrpc.getDeleteFlagMethod) == null) {
          VanalyticsGrpc.getDeleteFlagMethod = getDeleteFlagMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteFlag"))
              .build();
        }
      }
    }
    return getDeleteFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> getCreateFlagReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlagReview",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> getCreateFlagReviewMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> getCreateFlagReviewMethod;
    if ((getCreateFlagReviewMethod = VanalyticsGrpc.getCreateFlagReviewMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagReviewMethod = VanalyticsGrpc.getCreateFlagReviewMethod) == null) {
          VanalyticsGrpc.getCreateFlagReviewMethod = getCreateFlagReviewMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlagReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlagReview"))
              .build();
        }
      }
    }
    return getCreateFlagReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkCreateFlagReview",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest, com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod;
    if ((getBulkCreateFlagReviewMethod = VanalyticsGrpc.getBulkCreateFlagReviewMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getBulkCreateFlagReviewMethod = VanalyticsGrpc.getBulkCreateFlagReviewMethod) == null) {
          VanalyticsGrpc.getBulkCreateFlagReviewMethod = getBulkCreateFlagReviewMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest, com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkCreateFlagReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("BulkCreateFlagReview"))
              .build();
        }
      }
    }
    return getBulkCreateFlagReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> getListFlagReviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagReviews",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> getListFlagReviewsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> getListFlagReviewsMethod;
    if ((getListFlagReviewsMethod = VanalyticsGrpc.getListFlagReviewsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagReviewsMethod = VanalyticsGrpc.getListFlagReviewsMethod) == null) {
          VanalyticsGrpc.getListFlagReviewsMethod = getListFlagReviewsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlagReviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagReviews"))
              .build();
        }
      }
    }
    return getListFlagReviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlagTranscript",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod;
    if ((getCreateFlagTranscriptMethod = VanalyticsGrpc.getCreateFlagTranscriptMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagTranscriptMethod = VanalyticsGrpc.getCreateFlagTranscriptMethod) == null) {
          VanalyticsGrpc.getCreateFlagTranscriptMethod = getCreateFlagTranscriptMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlagTranscript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlagTranscript"))
              .build();
        }
      }
    }
    return getCreateFlagTranscriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchFlagTranscripts",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod;
    if ((getSearchFlagTranscriptsMethod = VanalyticsGrpc.getSearchFlagTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getSearchFlagTranscriptsMethod = VanalyticsGrpc.getSearchFlagTranscriptsMethod) == null) {
          VanalyticsGrpc.getSearchFlagTranscriptsMethod = getSearchFlagTranscriptsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchFlagTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("SearchFlagTranscripts"))
              .build();
        }
      }
    }
    return getSearchFlagTranscriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagSnapshots",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod;
    if ((getListFlagSnapshotsMethod = VanalyticsGrpc.getListFlagSnapshotsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagSnapshotsMethod = VanalyticsGrpc.getListFlagSnapshotsMethod) == null) {
          VanalyticsGrpc.getListFlagSnapshotsMethod = getListFlagSnapshotsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlagSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagSnapshots"))
              .build();
        }
      }
    }
    return getListFlagSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> getCreateCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCorrection",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> getCreateCorrectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> getCreateCorrectionMethod;
    if ((getCreateCorrectionMethod = VanalyticsGrpc.getCreateCorrectionMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateCorrectionMethod = VanalyticsGrpc.getCreateCorrectionMethod) == null) {
          VanalyticsGrpc.getCreateCorrectionMethod = getCreateCorrectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCorrection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateCorrection"))
              .build();
        }
      }
    }
    return getCreateCorrectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Correction> getGetCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCorrection",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.Correction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.Correction> getGetCorrectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Correction> getGetCorrectionMethod;
    if ((getGetCorrectionMethod = VanalyticsGrpc.getGetCorrectionMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetCorrectionMethod = VanalyticsGrpc.getGetCorrectionMethod) == null) {
          VanalyticsGrpc.getGetCorrectionMethod = getGetCorrectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.Correction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCorrection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.Correction.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetCorrection"))
              .build();
        }
      }
    }
    return getGetCorrectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> getDeleteCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCorrection",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> getDeleteCorrectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> getDeleteCorrectionMethod;
    if ((getDeleteCorrectionMethod = VanalyticsGrpc.getDeleteCorrectionMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteCorrectionMethod = VanalyticsGrpc.getDeleteCorrectionMethod) == null) {
          VanalyticsGrpc.getDeleteCorrectionMethod = getDeleteCorrectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCorrection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteCorrection"))
              .build();
        }
      }
    }
    return getDeleteCorrectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> getListCorrectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCorrections",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> getListCorrectionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> getListCorrectionsMethod;
    if ((getListCorrectionsMethod = VanalyticsGrpc.getListCorrectionsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListCorrectionsMethod = VanalyticsGrpc.getListCorrectionsMethod) == null) {
          VanalyticsGrpc.getListCorrectionsMethod = getListCorrectionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest, com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCorrections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListCorrections"))
              .build();
        }
      }
    }
    return getListCorrectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> getUpdateCorrectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCorrection",
      requestType = com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest.class,
      responseType = com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest,
      com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> getUpdateCorrectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> getUpdateCorrectionMethod;
    if ((getUpdateCorrectionMethod = VanalyticsGrpc.getUpdateCorrectionMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getUpdateCorrectionMethod = VanalyticsGrpc.getUpdateCorrectionMethod) == null) {
          VanalyticsGrpc.getUpdateCorrectionMethod = getUpdateCorrectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest, com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCorrection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("UpdateCorrection"))
              .build();
        }
      }
    }
    return getUpdateCorrectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VanalyticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsStub>() {
        @java.lang.Override
        public VanalyticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsStub(channel, callOptions);
        }
      };
    return VanalyticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VanalyticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsBlockingStub>() {
        @java.lang.Override
        public VanalyticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsBlockingStub(channel, callOptions);
        }
      };
    return VanalyticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VanalyticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VanalyticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VanalyticsFutureStub>() {
        @java.lang.Override
        public VanalyticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VanalyticsFutureStub(channel, callOptions);
        }
      };
    return VanalyticsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    default void searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchTranscriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    default void getFlag(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    default void createFlag(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    default void listFlags(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    default void updateFlag(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    default void deleteFlag(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    default void createFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlagReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    default void bulkCreateFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkCreateFlagReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    default void listFlagReviews(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlagReviewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    default void createFlagTranscript(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlagTranscriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    default void searchFlagTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchFlagTranscriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    default void listFlagSnapshots(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlagSnapshotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCorrection creates a correction.
     * </pre>
     */
    default void createCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCorrectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCorrection gets a correction.
     * </pre>
     */
    default void getCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Correction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCorrectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCorrection deletes a correction.
     * </pre>
     */
    default void deleteCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCorrectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCorrections lists corrections.
     * </pre>
     */
    default void listCorrections(com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCorrectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCorrection updates a correction.
     * </pre>
     */
    default void updateCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCorrectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Vanalytics.
   */
  public static abstract class VanalyticsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VanalyticsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Vanalytics.
   */
  public static final class VanalyticsStub
      extends io.grpc.stub.AbstractAsyncStub<VanalyticsStub> {
    private VanalyticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public void searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public void getFlag(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public void createFlag(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public void listFlags(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public void updateFlag(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public void deleteFlag(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public void createFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlagReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public void bulkCreateFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkCreateFlagReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public void listFlagReviews(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlagReviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public void createFlagTranscript(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlagTranscriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public void searchFlagTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchFlagTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public void listFlagSnapshots(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlagSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCorrection creates a correction.
     * </pre>
     */
    public void createCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCorrectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCorrection gets a correction.
     * </pre>
     */
    public void getCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Correction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCorrectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCorrection deletes a correction.
     * </pre>
     */
    public void deleteCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCorrectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCorrections lists corrections.
     * </pre>
     */
    public void listCorrections(com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCorrectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCorrection updates a correction.
     * </pre>
     */
    public void updateCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCorrectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Vanalytics.
   */
  public static final class VanalyticsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VanalyticsBlockingStub> {
    private VanalyticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse searchTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchTranscriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Flag getFlag(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Flag createFlag(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse listFlags(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Flag updateFlag(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse deleteFlag(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview createFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlagReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse bulkCreateFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkCreateFlagReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse listFlagReviews(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlagReviewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse createFlagTranscript(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlagTranscriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse searchFlagTranscripts(com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchFlagTranscriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse listFlagSnapshots(com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlagSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCorrection creates a correction.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse createCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCorrectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCorrection gets a correction.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Correction getCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCorrectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCorrection deletes a correction.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse deleteCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCorrectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCorrections lists corrections.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse listCorrections(com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCorrectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCorrection updates a correction.
     * </pre>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse updateCorrection(com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCorrectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Vanalytics.
   */
  public static final class VanalyticsFutureStub
      extends io.grpc.stub.AbstractFutureStub<VanalyticsFutureStub> {
    private VanalyticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VanalyticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SearchTranscripts searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved by making use of the given page token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse> searchTranscripts(
        com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchTranscriptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> getFlag(
        com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> createFlag(
        com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse> listFlags(
        com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Flag> updateFlag(
        com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse> deleteFlag(
        com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview> createFlagReview(
        com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlagReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse> bulkCreateFlagReview(
        com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkCreateFlagReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse> listFlagReviews(
        com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlagReviewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse> createFlagTranscript(
        com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlagTranscriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse> searchFlagTranscripts(
        com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchFlagTranscriptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse> listFlagSnapshots(
        com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlagSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCorrection creates a correction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse> createCorrection(
        com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCorrectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCorrection gets a correction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.Correction> getCorrection(
        com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCorrectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCorrection deletes a correction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse> deleteCorrection(
        com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCorrectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCorrections lists corrections.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse> listCorrections(
        com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCorrectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCorrection updates a correction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse> updateCorrection(
        com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCorrectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_TRANSCRIPTS = 0;
  private static final int METHODID_GET_FLAG = 1;
  private static final int METHODID_CREATE_FLAG = 2;
  private static final int METHODID_LIST_FLAGS = 3;
  private static final int METHODID_UPDATE_FLAG = 4;
  private static final int METHODID_DELETE_FLAG = 5;
  private static final int METHODID_CREATE_FLAG_REVIEW = 6;
  private static final int METHODID_BULK_CREATE_FLAG_REVIEW = 7;
  private static final int METHODID_LIST_FLAG_REVIEWS = 8;
  private static final int METHODID_CREATE_FLAG_TRANSCRIPT = 9;
  private static final int METHODID_SEARCH_FLAG_TRANSCRIPTS = 10;
  private static final int METHODID_LIST_FLAG_SNAPSHOTS = 11;
  private static final int METHODID_CREATE_CORRECTION = 12;
  private static final int METHODID_GET_CORRECTION = 13;
  private static final int METHODID_DELETE_CORRECTION = 14;
  private static final int METHODID_LIST_CORRECTIONS = 15;
  private static final int METHODID_UPDATE_CORRECTION = 16;

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
        case METHODID_SEARCH_TRANSCRIPTS:
          serviceImpl.searchTranscripts((com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>) responseObserver);
          break;
        case METHODID_GET_FLAG:
          serviceImpl.getFlag((com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag>) responseObserver);
          break;
        case METHODID_CREATE_FLAG:
          serviceImpl.createFlag((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag>) responseObserver);
          break;
        case METHODID_LIST_FLAGS:
          serviceImpl.listFlags((com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FLAG:
          serviceImpl.updateFlag((com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Flag>) responseObserver);
          break;
        case METHODID_DELETE_FLAG:
          serviceImpl.deleteFlag((com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG_REVIEW:
          serviceImpl.createFlagReview((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview>) responseObserver);
          break;
        case METHODID_BULK_CREATE_FLAG_REVIEW:
          serviceImpl.bulkCreateFlagReview((com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAG_REVIEWS:
          serviceImpl.listFlagReviews((com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG_TRANSCRIPT:
          serviceImpl.createFlagTranscript((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse>) responseObserver);
          break;
        case METHODID_SEARCH_FLAG_TRANSCRIPTS:
          serviceImpl.searchFlagTranscripts((com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAG_SNAPSHOTS:
          serviceImpl.listFlagSnapshots((com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CORRECTION:
          serviceImpl.createCorrection((com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse>) responseObserver);
          break;
        case METHODID_GET_CORRECTION:
          serviceImpl.getCorrection((com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.Correction>) responseObserver);
          break;
        case METHODID_DELETE_CORRECTION:
          serviceImpl.deleteCorrection((com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse>) responseObserver);
          break;
        case METHODID_LIST_CORRECTIONS:
          serviceImpl.listCorrections((com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CORRECTION:
          serviceImpl.updateCorrection((com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse>) responseObserver);
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
          getSearchTranscriptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchTranscriptsResponse>(
                service, METHODID_SEARCH_TRANSCRIPTS)))
        .addMethod(
          getGetFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Flag>(
                service, METHODID_GET_FLAG)))
        .addMethod(
          getCreateFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Flag>(
                service, METHODID_CREATE_FLAG)))
        .addMethod(
          getListFlagsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagsResponse>(
                service, METHODID_LIST_FLAGS)))
        .addMethod(
          getUpdateFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.UpdateFlagRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Flag>(
                service, METHODID_UPDATE_FLAG)))
        .addMethod(
          getDeleteFlagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteFlagResponse>(
                service, METHODID_DELETE_FLAG)))
        .addMethod(
          getCreateFlagReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview>(
                service, METHODID_CREATE_FLAG_REVIEW)))
        .addMethod(
          getBulkCreateFlagReviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.BulkCreateFlagReviewResponse>(
                service, METHODID_BULK_CREATE_FLAG_REVIEW)))
        .addMethod(
          getListFlagReviewsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagReviewsResponse>(
                service, METHODID_LIST_FLAG_REVIEWS)))
        .addMethod(
          getCreateFlagTranscriptMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagTranscriptResponse>(
                service, METHODID_CREATE_FLAG_TRANSCRIPT)))
        .addMethod(
          getSearchFlagTranscriptsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.SearchFlagTranscriptsResponse>(
                service, METHODID_SEARCH_FLAG_TRANSCRIPTS)))
        .addMethod(
          getListFlagSnapshotsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.ListFlagSnapshotsResponse>(
                service, METHODID_LIST_FLAG_SNAPSHOTS)))
        .addMethod(
          getCreateCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateCorrectionResponse>(
                service, METHODID_CREATE_CORRECTION)))
        .addMethod(
          getGetCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.GetCorrectionRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.Correction>(
                service, METHODID_GET_CORRECTION)))
        .addMethod(
          getDeleteCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.DeleteCorrectionResponse>(
                service, METHODID_DELETE_CORRECTION)))
        .addMethod(
          getListCorrectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.ListCorrectionsResponse>(
                service, METHODID_LIST_CORRECTIONS)))
        .addMethod(
          getUpdateCorrectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionRequest,
              com.tcn.cloud.api.wfo.vanalytics.v2.UpdateCorrectionResponse>(
                service, METHODID_UPDATE_CORRECTION)))
        .build();
  }

  private static abstract class VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VanalyticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vanalytics");
    }
  }

  private static final class VanalyticsFileDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier {
    VanalyticsFileDescriptorSupplier() {}
  }

  private static final class VanalyticsMethodDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VanalyticsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VanalyticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VanalyticsFileDescriptorSupplier())
              .addMethod(getSearchTranscriptsMethod())
              .addMethod(getGetFlagMethod())
              .addMethod(getCreateFlagMethod())
              .addMethod(getListFlagsMethod())
              .addMethod(getUpdateFlagMethod())
              .addMethod(getDeleteFlagMethod())
              .addMethod(getCreateFlagReviewMethod())
              .addMethod(getBulkCreateFlagReviewMethod())
              .addMethod(getListFlagReviewsMethod())
              .addMethod(getCreateFlagTranscriptMethod())
              .addMethod(getSearchFlagTranscriptsMethod())
              .addMethod(getListFlagSnapshotsMethod())
              .addMethod(getCreateCorrectionMethod())
              .addMethod(getGetCorrectionMethod())
              .addMethod(getDeleteCorrectionMethod())
              .addMethod(getListCorrectionsMethod())
              .addMethod(getUpdateCorrectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
