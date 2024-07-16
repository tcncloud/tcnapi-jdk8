package com.tcn.cloud.api.api.v1alpha1.insights;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/insights/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InsightsGrpc {

  private InsightsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.insights.Insights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateInsightMethod;
    if ((getCreateInsightMethod = InsightsGrpc.getCreateInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getCreateInsightMethod = InsightsGrpc.getCreateInsightMethod) == null) {
          InsightsGrpc.getCreateInsightMethod = getCreateInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("CreateInsight"))
              .build();
        }
      }
    }
    return getCreateInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInsights",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> getListInsightsMethod;
    if ((getListInsightsMethod = InsightsGrpc.getListInsightsMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListInsightsMethod = InsightsGrpc.getListInsightsMethod) == null) {
          InsightsGrpc.getListInsightsMethod = getListInsightsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListInsights"))
              .build();
        }
      }
    }
    return getListInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> getListOrgInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgInsights",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> getListOrgInsightsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> getListOrgInsightsMethod;
    if ((getListOrgInsightsMethod = InsightsGrpc.getListOrgInsightsMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListOrgInsightsMethod = InsightsGrpc.getListOrgInsightsMethod) == null) {
          InsightsGrpc.getListOrgInsightsMethod = getListOrgInsightsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrgInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListOrgInsights"))
              .build();
        }
      }
    }
    return getListOrgInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateInsightMethod;
    if ((getUpdateInsightMethod = InsightsGrpc.getUpdateInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getUpdateInsightMethod = InsightsGrpc.getUpdateInsightMethod) == null) {
          InsightsGrpc.getUpdateInsightMethod = getUpdateInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("UpdateInsight"))
              .build();
        }
      }
    }
    return getUpdateInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteInsightMethod;
    if ((getDeleteInsightMethod = InsightsGrpc.getDeleteInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getDeleteInsightMethod = InsightsGrpc.getDeleteInsightMethod) == null) {
          InsightsGrpc.getDeleteInsightMethod = getDeleteInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("DeleteInsight"))
              .build();
        }
      }
    }
    return getDeleteInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getGetInsightMethod;
    if ((getGetInsightMethod = InsightsGrpc.getGetInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getGetInsightMethod = InsightsGrpc.getGetInsightMethod) == null) {
          InsightsGrpc.getGetInsightMethod = getGetInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("GetInsight"))
              .build();
        }
      }
    }
    return getGetInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> getCreateCommonsInsightMethod;
    if ((getCreateCommonsInsightMethod = InsightsGrpc.getCreateCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getCreateCommonsInsightMethod = InsightsGrpc.getCreateCommonsInsightMethod) == null) {
          InsightsGrpc.getCreateCommonsInsightMethod = getCreateCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("CreateCommonsInsight"))
              .build();
        }
      }
    }
    return getCreateCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> getUpdateCommonsInsightMethod;
    if ((getUpdateCommonsInsightMethod = InsightsGrpc.getUpdateCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getUpdateCommonsInsightMethod = InsightsGrpc.getUpdateCommonsInsightMethod) == null) {
          InsightsGrpc.getUpdateCommonsInsightMethod = getUpdateCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("UpdateCommonsInsight"))
              .build();
        }
      }
    }
    return getUpdateCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCommonsInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> getDeleteCommonsInsightMethod;
    if ((getDeleteCommonsInsightMethod = InsightsGrpc.getDeleteCommonsInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getDeleteCommonsInsightMethod = InsightsGrpc.getDeleteCommonsInsightMethod) == null) {
          InsightsGrpc.getDeleteCommonsInsightMethod = getDeleteCommonsInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCommonsInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("DeleteCommonsInsight"))
              .build();
        }
      }
    }
    return getDeleteCommonsInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVfsSchema",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getGetVfsSchemaMethod;
    if ((getGetVfsSchemaMethod = InsightsGrpc.getGetVfsSchemaMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getGetVfsSchemaMethod = InsightsGrpc.getGetVfsSchemaMethod) == null) {
          InsightsGrpc.getGetVfsSchemaMethod = getGetVfsSchemaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVfsSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("GetVfsSchema"))
              .build();
        }
      }
    }
    return getGetVfsSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVfses",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> getListVfsesMethod;
    if ((getListVfsesMethod = InsightsGrpc.getListVfsesMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListVfsesMethod = InsightsGrpc.getListVfsesMethod) == null) {
          InsightsGrpc.getListVfsesMethod = getListVfsesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVfses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListVfses"))
              .build();
        }
      }
    }
    return getListVfsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> getListVfsSchemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVfsSchemas",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> getListVfsSchemasMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> getListVfsSchemasMethod;
    if ((getListVfsSchemasMethod = InsightsGrpc.getListVfsSchemasMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListVfsSchemasMethod = InsightsGrpc.getListVfsSchemasMethod) == null) {
          InsightsGrpc.getListVfsSchemasMethod = getListVfsSchemasMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVfsSchemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListVfsSchemas"))
              .build();
        }
      }
    }
    return getListVfsSchemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> getPublishInsightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishInsight",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> getPublishInsightMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> getPublishInsightMethod;
    if ((getPublishInsightMethod = InsightsGrpc.getPublishInsightMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getPublishInsightMethod = InsightsGrpc.getPublishInsightMethod) == null) {
          InsightsGrpc.getPublishInsightMethod = getPublishInsightMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest, com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishInsight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("PublishInsight"))
              .build();
        }
      }
    }
    return getPublishInsightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> getListOutputConfigurationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOutputConfigurations",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> getListOutputConfigurationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> getListOutputConfigurationsMethod;
    if ((getListOutputConfigurationsMethod = InsightsGrpc.getListOutputConfigurationsMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getListOutputConfigurationsMethod = InsightsGrpc.getListOutputConfigurationsMethod) == null) {
          InsightsGrpc.getListOutputConfigurationsMethod = getListOutputConfigurationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest, com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOutputConfigurations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("ListOutputConfigurations"))
              .build();
        }
      }
    }
    return getListOutputConfigurationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> getGetOutputConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOutputConfiguration",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> getGetOutputConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> getGetOutputConfigurationMethod;
    if ((getGetOutputConfigurationMethod = InsightsGrpc.getGetOutputConfigurationMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getGetOutputConfigurationMethod = InsightsGrpc.getGetOutputConfigurationMethod) == null) {
          InsightsGrpc.getGetOutputConfigurationMethod = getGetOutputConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOutputConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("GetOutputConfiguration"))
              .build();
        }
      }
    }
    return getGetOutputConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> getCreateOutputConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOutputConfiguration",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> getCreateOutputConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> getCreateOutputConfigurationMethod;
    if ((getCreateOutputConfigurationMethod = InsightsGrpc.getCreateOutputConfigurationMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getCreateOutputConfigurationMethod = InsightsGrpc.getCreateOutputConfigurationMethod) == null) {
          InsightsGrpc.getCreateOutputConfigurationMethod = getCreateOutputConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOutputConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("CreateOutputConfiguration"))
              .build();
        }
      }
    }
    return getCreateOutputConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> getUpdateOutputConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOutputConfiguration",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> getUpdateOutputConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> getUpdateOutputConfigurationMethod;
    if ((getUpdateOutputConfigurationMethod = InsightsGrpc.getUpdateOutputConfigurationMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getUpdateOutputConfigurationMethod = InsightsGrpc.getUpdateOutputConfigurationMethod) == null) {
          InsightsGrpc.getUpdateOutputConfigurationMethod = getUpdateOutputConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOutputConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("UpdateOutputConfiguration"))
              .build();
        }
      }
    }
    return getUpdateOutputConfigurationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> getDeleteOutputConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOutputConfiguration",
      requestType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest,
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> getDeleteOutputConfigurationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> getDeleteOutputConfigurationMethod;
    if ((getDeleteOutputConfigurationMethod = InsightsGrpc.getDeleteOutputConfigurationMethod) == null) {
      synchronized (InsightsGrpc.class) {
        if ((getDeleteOutputConfigurationMethod = InsightsGrpc.getDeleteOutputConfigurationMethod) == null) {
          InsightsGrpc.getDeleteOutputConfigurationMethod = getDeleteOutputConfigurationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest, com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOutputConfiguration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InsightsMethodDescriptorSupplier("DeleteOutputConfiguration"))
              .build();
        }
      }
    }
    return getDeleteOutputConfigurationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InsightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsStub>() {
        @java.lang.Override
        public InsightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsStub(channel, callOptions);
        }
      };
    return InsightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InsightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsBlockingStub>() {
        @java.lang.Override
        public InsightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsBlockingStub(channel, callOptions);
        }
      };
    return InsightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InsightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InsightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InsightsFutureStub>() {
        @java.lang.Override
        public InsightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InsightsFutureStub(channel, callOptions);
        }
      };
    return InsightsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    default void createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    default void listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListOrgInsights lists insights for an org. Used for support app.
     * </pre>
     */
    default void listOrgInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrgInsightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    default void updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    default void deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    default void getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCommonsInsight is deprecated.
     * </pre>
     */
    default void createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCommonsInsight is deprecated.
     * </pre>
     */
    default void updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCommonsInsight is deprecated.
     * </pre>
     */
    default void deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommonsInsightMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    default void getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVfsSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    default void listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVfsesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    default void listVfsSchemas(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVfsSchemasMethod(), responseObserver);
    }

    /**
     * <pre>
     * PublishInsight publishes an insight
     * </pre>
     */
    default void publishInsight(com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishInsightMethod(), responseObserver);
    }

    /**
     */
    default void listOutputConfigurations(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOutputConfigurationsMethod(), responseObserver);
    }

    /**
     */
    default void getOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOutputConfigurationMethod(), responseObserver);
    }

    /**
     */
    default void createOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOutputConfigurationMethod(), responseObserver);
    }

    /**
     */
    default void updateOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOutputConfigurationMethod(), responseObserver);
    }

    /**
     */
    default void deleteOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOutputConfigurationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Insights.
   */
  public static abstract class InsightsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InsightsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Insights.
   */
  public static final class InsightsStub
      extends io.grpc.stub.AbstractAsyncStub<InsightsStub> {
    private InsightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public void createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public void listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListOrgInsights lists insights for an org. Used for support app.
     * </pre>
     */
    public void listOrgInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrgInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public void updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public void deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public void getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCommonsInsight is deprecated.
     * </pre>
     */
    public void createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCommonsInsight is deprecated.
     * </pre>
     */
    public void updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCommonsInsight is deprecated.
     * </pre>
     */
    public void deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommonsInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public void getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVfsSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public void listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVfsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public void listVfsSchemas(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVfsSchemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PublishInsight publishes an insight
     * </pre>
     */
    public void publishInsight(com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishInsightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOutputConfigurations(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOutputConfigurationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOutputConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOutputConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOutputConfigurationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOutputConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Insights.
   */
  public static final class InsightsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InsightsBlockingStub> {
    private InsightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse createInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse listInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListOrgInsights lists insights for an org. Used for support app.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse listOrgInsights(com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrgInsightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse updateInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse deleteInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse getInsight(com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCommonsInsight is deprecated.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse createCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCommonsInsight is deprecated.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse updateCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCommonsInsight is deprecated.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse deleteCommonsInsight(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommonsInsightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse getVfsSchema(com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVfsSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse listVfses(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVfsesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse listVfsSchemas(com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVfsSchemasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PublishInsight publishes an insight
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse publishInsight(com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishInsightMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse listOutputConfigurations(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOutputConfigurationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse getOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOutputConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse createOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOutputConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse updateOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOutputConfigurationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse deleteOutputConfiguration(com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOutputConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Insights.
   */
  public static final class InsightsFutureStub
      extends io.grpc.stub.AbstractFutureStub<InsightsFutureStub> {
    private InsightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InsightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InsightsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateInsight creates a new insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> createInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListInsights lists insights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse> listInsights(
        com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListOrgInsights lists insights for an org. Used for support app.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse> listOrgInsights(
        com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrgInsightsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateInsight updates an existing insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> updateInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteInsight deletes a insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> deleteInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetInsight gets a insight by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse> getInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCommonsInsight is deprecated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse> createCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCommonsInsight is deprecated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse> updateCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCommonsInsight is deprecated.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse> deleteCommonsInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommonsInsightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetVfsSchema gets schema for a vfs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse> getVfsSchema(
        com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVfsSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse> listVfses(
        com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVfsesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListVfses lists exported vfs aliases
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse> listVfsSchemas(
        com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVfsSchemasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PublishInsight publishes an insight
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse> publishInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishInsightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse> listOutputConfigurations(
        com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOutputConfigurationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse> getOutputConfiguration(
        com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOutputConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse> createOutputConfiguration(
        com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOutputConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse> updateOutputConfiguration(
        com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOutputConfigurationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse> deleteOutputConfiguration(
        com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOutputConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INSIGHT = 0;
  private static final int METHODID_LIST_INSIGHTS = 1;
  private static final int METHODID_LIST_ORG_INSIGHTS = 2;
  private static final int METHODID_UPDATE_INSIGHT = 3;
  private static final int METHODID_DELETE_INSIGHT = 4;
  private static final int METHODID_GET_INSIGHT = 5;
  private static final int METHODID_CREATE_COMMONS_INSIGHT = 6;
  private static final int METHODID_UPDATE_COMMONS_INSIGHT = 7;
  private static final int METHODID_DELETE_COMMONS_INSIGHT = 8;
  private static final int METHODID_GET_VFS_SCHEMA = 9;
  private static final int METHODID_LIST_VFSES = 10;
  private static final int METHODID_LIST_VFS_SCHEMAS = 11;
  private static final int METHODID_PUBLISH_INSIGHT = 12;
  private static final int METHODID_LIST_OUTPUT_CONFIGURATIONS = 13;
  private static final int METHODID_GET_OUTPUT_CONFIGURATION = 14;
  private static final int METHODID_CREATE_OUTPUT_CONFIGURATION = 15;
  private static final int METHODID_UPDATE_OUTPUT_CONFIGURATION = 16;
  private static final int METHODID_DELETE_OUTPUT_CONFIGURATION = 17;

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
        case METHODID_CREATE_INSIGHT:
          serviceImpl.createInsight((com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>) responseObserver);
          break;
        case METHODID_LIST_INSIGHTS:
          serviceImpl.listInsights((com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>) responseObserver);
          break;
        case METHODID_LIST_ORG_INSIGHTS:
          serviceImpl.listOrgInsights((com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INSIGHT:
          serviceImpl.updateInsight((com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>) responseObserver);
          break;
        case METHODID_DELETE_INSIGHT:
          serviceImpl.deleteInsight((com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>) responseObserver);
          break;
        case METHODID_GET_INSIGHT:
          serviceImpl.getInsight((com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMONS_INSIGHT:
          serviceImpl.createCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMMONS_INSIGHT:
          serviceImpl.updateCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>) responseObserver);
          break;
        case METHODID_DELETE_COMMONS_INSIGHT:
          serviceImpl.deleteCommonsInsight((com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>) responseObserver);
          break;
        case METHODID_GET_VFS_SCHEMA:
          serviceImpl.getVfsSchema((com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>) responseObserver);
          break;
        case METHODID_LIST_VFSES:
          serviceImpl.listVfses((com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>) responseObserver);
          break;
        case METHODID_LIST_VFS_SCHEMAS:
          serviceImpl.listVfsSchemas((com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_INSIGHT:
          serviceImpl.publishInsight((com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse>) responseObserver);
          break;
        case METHODID_LIST_OUTPUT_CONFIGURATIONS:
          serviceImpl.listOutputConfigurations((com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse>) responseObserver);
          break;
        case METHODID_GET_OUTPUT_CONFIGURATION:
          serviceImpl.getOutputConfiguration((com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse>) responseObserver);
          break;
        case METHODID_CREATE_OUTPUT_CONFIGURATION:
          serviceImpl.createOutputConfiguration((com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OUTPUT_CONFIGURATION:
          serviceImpl.updateOutputConfiguration((com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse>) responseObserver);
          break;
        case METHODID_DELETE_OUTPUT_CONFIGURATION:
          serviceImpl.deleteOutputConfiguration((com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse>) responseObserver);
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
          getCreateInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>(
                service, METHODID_CREATE_INSIGHT)))
        .addMethod(
          getListInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsResponse>(
                service, METHODID_LIST_INSIGHTS)))
        .addMethod(
          getListOrgInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.ListOrgInsightsResponse>(
                service, METHODID_LIST_ORG_INSIGHTS)))
        .addMethod(
          getUpdateInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>(
                service, METHODID_UPDATE_INSIGHT)))
        .addMethod(
          getDeleteInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>(
                service, METHODID_DELETE_INSIGHT)))
        .addMethod(
          getGetInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.GetInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.GetInsightResponse>(
                service, METHODID_GET_INSIGHT)))
        .addMethod(
          getCreateCommonsInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse>(
                service, METHODID_CREATE_COMMONS_INSIGHT)))
        .addMethod(
          getUpdateCommonsInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateInsightResponse>(
                service, METHODID_UPDATE_COMMONS_INSIGHT)))
        .addMethod(
          getDeleteCommonsInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightResponse>(
                service, METHODID_DELETE_COMMONS_INSIGHT)))
        .addMethod(
          getGetVfsSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.GetVfsSchemaResponse>(
                service, METHODID_GET_VFS_SCHEMA)))
        .addMethod(
          getListVfsesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.ListVfsesResponse>(
                service, METHODID_LIST_VFSES)))
        .addMethod(
          getListVfsSchemasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.ListVfsSchemasResponse>(
                service, METHODID_LIST_VFS_SCHEMAS)))
        .addMethod(
          getPublishInsightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.PublishInsightResponse>(
                service, METHODID_PUBLISH_INSIGHT)))
        .addMethod(
          getListOutputConfigurationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse>(
                service, METHODID_LIST_OUTPUT_CONFIGURATIONS)))
        .addMethod(
          getGetOutputConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.GetOutputConfigurationResponse>(
                service, METHODID_GET_OUTPUT_CONFIGURATION)))
        .addMethod(
          getCreateOutputConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.CreateOutputConfigurationResponse>(
                service, METHODID_CREATE_OUTPUT_CONFIGURATION)))
        .addMethod(
          getUpdateOutputConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.UpdateOutputConfigurationResponse>(
                service, METHODID_UPDATE_OUTPUT_CONFIGURATION)))
        .addMethod(
          getDeleteOutputConfigurationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationRequest,
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteOutputConfigurationResponse>(
                service, METHODID_DELETE_OUTPUT_CONFIGURATION)))
        .build();
  }

  private static abstract class InsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InsightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Insights");
    }
  }

  private static final class InsightsFileDescriptorSupplier
      extends InsightsBaseDescriptorSupplier {
    InsightsFileDescriptorSupplier() {}
  }

  private static final class InsightsMethodDescriptorSupplier
      extends InsightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InsightsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InsightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InsightsFileDescriptorSupplier())
              .addMethod(getCreateInsightMethod())
              .addMethod(getListInsightsMethod())
              .addMethod(getListOrgInsightsMethod())
              .addMethod(getUpdateInsightMethod())
              .addMethod(getDeleteInsightMethod())
              .addMethod(getGetInsightMethod())
              .addMethod(getCreateCommonsInsightMethod())
              .addMethod(getUpdateCommonsInsightMethod())
              .addMethod(getDeleteCommonsInsightMethod())
              .addMethod(getGetVfsSchemaMethod())
              .addMethod(getListVfsesMethod())
              .addMethod(getListVfsSchemasMethod())
              .addMethod(getPublishInsightMethod())
              .addMethod(getListOutputConfigurationsMethod())
              .addMethod(getGetOutputConfigurationMethod())
              .addMethod(getCreateOutputConfigurationMethod())
              .addMethod(getUpdateOutputConfigurationMethod())
              .addMethod(getDeleteOutputConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
