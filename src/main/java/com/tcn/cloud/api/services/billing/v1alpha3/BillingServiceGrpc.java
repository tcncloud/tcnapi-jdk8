package com.tcn.cloud.api.services.billing.v1alpha3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * --------------------------------------------------------------------------
 * Product
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/billing/v1alpha3/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.billing.v1alpha3.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> getListProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProducts",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> getListProductsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> getListProductsMethod;
    if ((getListProductsMethod = BillingServiceGrpc.getListProductsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListProductsMethod = BillingServiceGrpc.getListProductsMethod) == null) {
          BillingServiceGrpc.getListProductsMethod = getListProductsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListProducts"))
              .build();
        }
      }
    }
    return getListProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> getApplyBillingPlanDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyBillingPlanDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> getApplyBillingPlanDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> getApplyBillingPlanDraftMethod;
    if ((getApplyBillingPlanDraftMethod = BillingServiceGrpc.getApplyBillingPlanDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getApplyBillingPlanDraftMethod = BillingServiceGrpc.getApplyBillingPlanDraftMethod) == null) {
          BillingServiceGrpc.getApplyBillingPlanDraftMethod = getApplyBillingPlanDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyBillingPlanDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ApplyBillingPlanDraft"))
              .build();
        }
      }
    }
    return getApplyBillingPlanDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> getCreateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> getCreateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> getCreateBillingPlanMethod;
    if ((getCreateBillingPlanMethod = BillingServiceGrpc.getCreateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateBillingPlanMethod = BillingServiceGrpc.getCreateBillingPlanMethod) == null) {
          BillingServiceGrpc.getCreateBillingPlanMethod = getCreateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateBillingPlan"))
              .build();
        }
      }
    }
    return getCreateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> getDeleteBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> getDeleteBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> getDeleteBillingPlanMethod;
    if ((getDeleteBillingPlanMethod = BillingServiceGrpc.getDeleteBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteBillingPlanMethod = BillingServiceGrpc.getDeleteBillingPlanMethod) == null) {
          BillingServiceGrpc.getDeleteBillingPlanMethod = getDeleteBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteBillingPlan"))
              .build();
        }
      }
    }
    return getDeleteBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> getGetOrgBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> getGetOrgBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> getGetOrgBillingPlanMethod;
    if ((getGetOrgBillingPlanMethod = BillingServiceGrpc.getGetOrgBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetOrgBillingPlanMethod = BillingServiceGrpc.getGetOrgBillingPlanMethod) == null) {
          BillingServiceGrpc.getGetOrgBillingPlanMethod = getGetOrgBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrgBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetOrgBillingPlan"))
              .build();
        }
      }
    }
    return getGetOrgBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> getListOrgBillingPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgBillingPlans",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> getListOrgBillingPlansMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> getListOrgBillingPlansMethod;
    if ((getListOrgBillingPlansMethod = BillingServiceGrpc.getListOrgBillingPlansMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListOrgBillingPlansMethod = BillingServiceGrpc.getListOrgBillingPlansMethod) == null) {
          BillingServiceGrpc.getListOrgBillingPlansMethod = getListOrgBillingPlansMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrgBillingPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListOrgBillingPlans"))
              .build();
        }
      }
    }
    return getListOrgBillingPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> getUpdateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;
    if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
          BillingServiceGrpc.getUpdateBillingPlanMethod = getUpdateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> getApplyDefaultBillingPlanDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyDefaultBillingPlanDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> getApplyDefaultBillingPlanDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> getApplyDefaultBillingPlanDraftMethod;
    if ((getApplyDefaultBillingPlanDraftMethod = BillingServiceGrpc.getApplyDefaultBillingPlanDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getApplyDefaultBillingPlanDraftMethod = BillingServiceGrpc.getApplyDefaultBillingPlanDraftMethod) == null) {
          BillingServiceGrpc.getApplyDefaultBillingPlanDraftMethod = getApplyDefaultBillingPlanDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyDefaultBillingPlanDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ApplyDefaultBillingPlanDraft"))
              .build();
        }
      }
    }
    return getApplyDefaultBillingPlanDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod;
    if ((getCreateDefaultBillingPlanMethod = BillingServiceGrpc.getCreateDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDefaultBillingPlanMethod = BillingServiceGrpc.getCreateDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getCreateDefaultBillingPlanMethod = getCreateDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getCreateDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod;
    if ((getDeleteDefaultBillingPlanMethod = BillingServiceGrpc.getDeleteDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDefaultBillingPlanMethod = BillingServiceGrpc.getDeleteDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getDeleteDefaultBillingPlanMethod = getDeleteDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getDeleteDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod;
    if ((getGetDefaultBillingPlanMethod = BillingServiceGrpc.getGetDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetDefaultBillingPlanMethod = BillingServiceGrpc.getGetDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getGetDefaultBillingPlanMethod = getGetDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getGetDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> getListDefaultBillingPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDefaultBillingPlans",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> getListDefaultBillingPlansMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> getListDefaultBillingPlansMethod;
    if ((getListDefaultBillingPlansMethod = BillingServiceGrpc.getListDefaultBillingPlansMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListDefaultBillingPlansMethod = BillingServiceGrpc.getListDefaultBillingPlansMethod) == null) {
          BillingServiceGrpc.getListDefaultBillingPlansMethod = getListDefaultBillingPlansMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDefaultBillingPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListDefaultBillingPlans"))
              .build();
        }
      }
    }
    return getListDefaultBillingPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod;
    if ((getUpdateDefaultBillingPlanMethod = BillingServiceGrpc.getUpdateDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDefaultBillingPlanMethod = BillingServiceGrpc.getUpdateDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getUpdateDefaultBillingPlanMethod = getUpdateDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> getCreateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;
    if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateRateDefinitionMethod = getCreateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateRateDefinition"))
              .build();
        }
      }
    }
    return getCreateRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;
    if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteRateDefinitionMethod = getDeleteRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> getGetRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> getGetRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> getGetRateDefinitionMethod;
    if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
          BillingServiceGrpc.getGetRateDefinitionMethod = getGetRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetRateDefinition"))
              .build();
        }
      }
    }
    return getGetRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> getListRateDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRateDefinitions",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> getListRateDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> getListRateDefinitionsMethod;
    if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
          BillingServiceGrpc.getListRateDefinitionsMethod = getListRateDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRateDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListRateDefinitions"))
              .build();
        }
      }
    }
    return getListRateDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;
    if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateRateDefinitionMethod = getUpdateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;
    if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateDefaultRateDefinitionMethod = getCreateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getCreateDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;
    if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod = getDeleteDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> getGetDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> getGetDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> getGetDefaultRateDefinitionMethod;
    if ((getGetDefaultRateDefinitionMethod = BillingServiceGrpc.getGetDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetDefaultRateDefinitionMethod = BillingServiceGrpc.getGetDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getGetDefaultRateDefinitionMethod = getGetDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getGetDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> getListDefaultRateDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDefaultRateDefinitions",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> getListDefaultRateDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> getListDefaultRateDefinitionsMethod;
    if ((getListDefaultRateDefinitionsMethod = BillingServiceGrpc.getListDefaultRateDefinitionsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListDefaultRateDefinitionsMethod = BillingServiceGrpc.getListDefaultRateDefinitionsMethod) == null) {
          BillingServiceGrpc.getListDefaultRateDefinitionsMethod = getListDefaultRateDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDefaultRateDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListDefaultRateDefinitions"))
              .build();
        }
      }
    }
    return getListDefaultRateDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;
    if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod = getUpdateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> getExportInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> getExportInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> getExportInvoiceMethod;
    if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
          BillingServiceGrpc.getExportInvoiceMethod = getExportInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ExportInvoice"))
              .build();
        }
      }
    }
    return getExportInvoiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceStub>() {
        @java.lang.Override
        public BillingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceStub(channel, callOptions);
        }
      };
    return BillingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceBlockingStub>() {
        @java.lang.Override
        public BillingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceBlockingStub(channel, callOptions);
        }
      };
    return BillingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingServiceFutureStub>() {
        @java.lang.Override
        public BillingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingServiceFutureStub(channel, callOptions);
        }
      };
    return BillingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * --------------------------------------------------------------------------
   * Product
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the products.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listProducts(com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Applies a draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void applyBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyBillingPlanDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a billing plan for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getOrgBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrgBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans for ORGs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listOrgBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrgBillingPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Applies a default draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void applyDefaultBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyDefaultBillingPlanDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists default billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listDefaultBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDefaultBillingPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRateDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition for a default plan.
     *   - Creating a rate definition on an existing SKU: the sku_id must be provided.
     *   - Creating a rate definition on a new SKU: the product must be provided and the sku_id omitted.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listDefaultRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDefaultRateDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exports an invoice.
     * Required permissions:
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportInvoiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   * <pre>
   * --------------------------------------------------------------------------
   * Product
   * </pre>
   */
  public static abstract class BillingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BillingService.
   * <pre>
   * --------------------------------------------------------------------------
   * Product
   * </pre>
   */
  public static final class BillingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BillingServiceStub> {
    private BillingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the products.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listProducts(com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Applies a draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void applyBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyBillingPlanDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a billing plan for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getOrgBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrgBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans for ORGs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listOrgBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrgBillingPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Applies a default draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void applyDefaultBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyDefaultBillingPlanDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists default billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listDefaultBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDefaultBillingPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition for a default plan.
     *   - Creating a rate definition on an existing SKU: the sku_id must be provided.
     *   - Creating a rate definition on a new SKU: the product must be provided and the sku_id omitted.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listDefaultRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDefaultRateDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exports an invoice.
     * Required permissions:
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
   * <pre>
   * --------------------------------------------------------------------------
   * Product
   * </pre>
   */
  public static final class BillingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BillingServiceBlockingStub> {
    private BillingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the products.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse listProducts(com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies a draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse applyBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyBillingPlanDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a billing plan for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse getOrgBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrgBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists billing plans for ORGs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse listOrgBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrgBillingPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies a default draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse applyDefaultBillingPlanDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyDefaultBillingPlanDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists default billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse listDefaultBillingPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDefaultBillingPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRateDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new rate definition for a default plan.
     *   - Creating a rate definition on an existing SKU: the sku_id must be provided.
     *   - Creating a rate definition on a new SKU: the product must be provided and the sku_id omitted.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse getDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists rate definitions for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse listDefaultRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDefaultRateDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exports an invoice.
     * Required permissions:
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse exportInvoice(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportInvoiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
   * <pre>
   * --------------------------------------------------------------------------
   * Product
   * </pre>
   */
  public static final class BillingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BillingServiceFutureStub> {
    private BillingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists the products.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse> listProducts(
        com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Applies a draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse> applyBillingPlanDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyBillingPlanDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse> createBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse> deleteBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a billing plan for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse> getOrgBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrgBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists billing plans for ORGs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse> listOrgBillingPlans(
        com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrgBillingPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse> updateBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Applies a default draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The draft billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse> applyDefaultBillingPlanDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyDefaultBillingPlanDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse> createDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse> deleteDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse> getDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists default billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse> listDefaultBillingPlans(
        com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDefaultBillingPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse> updateDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> createRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse> deleteRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse> getRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> listRateDefinitions(
        com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> updateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new rate definition for a default plan.
     *   - Creating a rate definition on an existing SKU: the sku_id must be provided.
     *   - Creating a rate definition on a new SKU: the product must be provided and the sku_id omitted.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse> createDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse> deleteDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse> getDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists rate definitions for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse> listDefaultRateDefinitions(
        com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDefaultRateDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a rate definition for a default billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse> updateDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exports an invoice.
     * Required permissions:
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse> exportInvoice(
        com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PRODUCTS = 0;
  private static final int METHODID_APPLY_BILLING_PLAN_DRAFT = 1;
  private static final int METHODID_CREATE_BILLING_PLAN = 2;
  private static final int METHODID_DELETE_BILLING_PLAN = 3;
  private static final int METHODID_GET_ORG_BILLING_PLAN = 4;
  private static final int METHODID_LIST_ORG_BILLING_PLANS = 5;
  private static final int METHODID_UPDATE_BILLING_PLAN = 6;
  private static final int METHODID_APPLY_DEFAULT_BILLING_PLAN_DRAFT = 7;
  private static final int METHODID_CREATE_DEFAULT_BILLING_PLAN = 8;
  private static final int METHODID_DELETE_DEFAULT_BILLING_PLAN = 9;
  private static final int METHODID_GET_DEFAULT_BILLING_PLAN = 10;
  private static final int METHODID_LIST_DEFAULT_BILLING_PLANS = 11;
  private static final int METHODID_UPDATE_DEFAULT_BILLING_PLAN = 12;
  private static final int METHODID_CREATE_RATE_DEFINITION = 13;
  private static final int METHODID_DELETE_RATE_DEFINITION = 14;
  private static final int METHODID_GET_RATE_DEFINITION = 15;
  private static final int METHODID_LIST_RATE_DEFINITIONS = 16;
  private static final int METHODID_UPDATE_RATE_DEFINITION = 17;
  private static final int METHODID_CREATE_DEFAULT_RATE_DEFINITION = 18;
  private static final int METHODID_DELETE_DEFAULT_RATE_DEFINITION = 19;
  private static final int METHODID_GET_DEFAULT_RATE_DEFINITION = 20;
  private static final int METHODID_LIST_DEFAULT_RATE_DEFINITIONS = 21;
  private static final int METHODID_UPDATE_DEFAULT_RATE_DEFINITION = 22;
  private static final int METHODID_EXPORT_INVOICE = 23;

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
        case METHODID_LIST_PRODUCTS:
          serviceImpl.listProducts((com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse>) responseObserver);
          break;
        case METHODID_APPLY_BILLING_PLAN_DRAFT:
          serviceImpl.applyBillingPlanDraft((com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse>) responseObserver);
          break;
        case METHODID_CREATE_BILLING_PLAN:
          serviceImpl.createBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DELETE_BILLING_PLAN:
          serviceImpl.deleteBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_ORG_BILLING_PLAN:
          serviceImpl.getOrgBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse>) responseObserver);
          break;
        case METHODID_LIST_ORG_BILLING_PLANS:
          serviceImpl.listOrgBillingPlans((com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_PLAN:
          serviceImpl.updateBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_APPLY_DEFAULT_BILLING_PLAN_DRAFT:
          serviceImpl.applyDefaultBillingPlanDraft((com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEFAULT_BILLING_PLAN:
          serviceImpl.createDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEFAULT_BILLING_PLAN:
          serviceImpl.deleteDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_BILLING_PLAN:
          serviceImpl.getDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_LIST_DEFAULT_BILLING_PLANS:
          serviceImpl.listDefaultBillingPlans((com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_BILLING_PLAN:
          serviceImpl.updateDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_RATE_DEFINITION:
          serviceImpl.createRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_RATE_DEFINITION:
          serviceImpl.deleteRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_DEFINITION:
          serviceImpl.getRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_LIST_RATE_DEFINITIONS:
          serviceImpl.listRateDefinitions((com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RATE_DEFINITION:
          serviceImpl.updateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.createDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEFAULT_RATE_DEFINITION:
          serviceImpl.deleteDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_RATE_DEFINITION:
          serviceImpl.getDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_LIST_DEFAULT_RATE_DEFINITIONS:
          serviceImpl.listDefaultRateDefinitions((com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.updateDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_EXPORT_INVOICE:
          serviceImpl.exportInvoice((com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse>) responseObserver);
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
          getListProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListProductsRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListProductsResponse>(
                service, METHODID_LIST_PRODUCTS)))
        .addMethod(
          getApplyBillingPlanDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyBillingPlanDraftResponse>(
                service, METHODID_APPLY_BILLING_PLAN_DRAFT)))
        .addMethod(
          getCreateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateBillingPlanResponse>(
                service, METHODID_CREATE_BILLING_PLAN)))
        .addMethod(
          getDeleteBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteBillingPlanResponse>(
                service, METHODID_DELETE_BILLING_PLAN)))
        .addMethod(
          getGetOrgBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetOrgBillingPlanResponse>(
                service, METHODID_GET_ORG_BILLING_PLAN)))
        .addMethod(
          getListOrgBillingPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListOrgBillingPlansResponse>(
                service, METHODID_LIST_ORG_BILLING_PLANS)))
        .addMethod(
          getUpdateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateBillingPlanResponse>(
                service, METHODID_UPDATE_BILLING_PLAN)))
        .addMethod(
          getApplyDefaultBillingPlanDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyDefaultBillingPlanDraftResponse>(
                service, METHODID_APPLY_DEFAULT_BILLING_PLAN_DRAFT)))
        .addMethod(
          getCreateDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultBillingPlanResponse>(
                service, METHODID_CREATE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getDeleteDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultBillingPlanResponse>(
                service, METHODID_DELETE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getGetDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultBillingPlanResponse>(
                service, METHODID_GET_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getListDefaultBillingPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultBillingPlansResponse>(
                service, METHODID_LIST_DEFAULT_BILLING_PLANS)))
        .addMethod(
          getUpdateDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultBillingPlanResponse>(
                service, METHODID_UPDATE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getCreateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse>(
                service, METHODID_CREATE_RATE_DEFINITION)))
        .addMethod(
          getDeleteRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse>(
                service, METHODID_DELETE_RATE_DEFINITION)))
        .addMethod(
          getGetRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetRateDefinitionResponse>(
                service, METHODID_GET_RATE_DEFINITION)))
        .addMethod(
          getListRateDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse>(
                service, METHODID_LIST_RATE_DEFINITIONS)))
        .addMethod(
          getUpdateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse>(
                service, METHODID_UPDATE_RATE_DEFINITION)))
        .addMethod(
          getCreateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDefaultRateDefinitionResponse>(
                service, METHODID_CREATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getDeleteDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDefaultRateDefinitionResponse>(
                service, METHODID_DELETE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getGetDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetDefaultRateDefinitionResponse>(
                service, METHODID_GET_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getListDefaultRateDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListDefaultRateDefinitionsResponse>(
                service, METHODID_LIST_DEFAULT_RATE_DEFINITIONS)))
        .addMethod(
          getUpdateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDefaultRateDefinitionResponse>(
                service, METHODID_UPDATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getExportInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse>(
                service, METHODID_EXPORT_INVOICE)))
        .build();
  }

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha3.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingService");
    }
  }

  private static final class BillingServiceFileDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier {
    BillingServiceFileDescriptorSupplier() {}
  }

  private static final class BillingServiceMethodDescriptorSupplier
      extends BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BillingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BillingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingServiceFileDescriptorSupplier())
              .addMethod(getListProductsMethod())
              .addMethod(getApplyBillingPlanDraftMethod())
              .addMethod(getCreateBillingPlanMethod())
              .addMethod(getDeleteBillingPlanMethod())
              .addMethod(getGetOrgBillingPlanMethod())
              .addMethod(getListOrgBillingPlansMethod())
              .addMethod(getUpdateBillingPlanMethod())
              .addMethod(getApplyDefaultBillingPlanDraftMethod())
              .addMethod(getCreateDefaultBillingPlanMethod())
              .addMethod(getDeleteDefaultBillingPlanMethod())
              .addMethod(getGetDefaultBillingPlanMethod())
              .addMethod(getListDefaultBillingPlansMethod())
              .addMethod(getUpdateDefaultBillingPlanMethod())
              .addMethod(getCreateRateDefinitionMethod())
              .addMethod(getDeleteRateDefinitionMethod())
              .addMethod(getGetRateDefinitionMethod())
              .addMethod(getListRateDefinitionsMethod())
              .addMethod(getUpdateRateDefinitionMethod())
              .addMethod(getCreateDefaultRateDefinitionMethod())
              .addMethod(getDeleteDefaultRateDefinitionMethod())
              .addMethod(getGetDefaultRateDefinitionMethod())
              .addMethod(getListDefaultRateDefinitionsMethod())
              .addMethod(getUpdateDefaultRateDefinitionMethod())
              .addMethod(getExportInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
