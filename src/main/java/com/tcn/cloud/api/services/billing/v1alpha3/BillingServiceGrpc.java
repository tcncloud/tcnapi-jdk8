package com.tcn.cloud.api.services.billing.v1alpha3;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * --------------------------------------------------------------------------
 * Rating Module
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
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> getListRatingModulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRatingModules",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> getListRatingModulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> getListRatingModulesMethod;
    if ((getListRatingModulesMethod = BillingServiceGrpc.getListRatingModulesMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListRatingModulesMethod = BillingServiceGrpc.getListRatingModulesMethod) == null) {
          BillingServiceGrpc.getListRatingModulesMethod = getListRatingModulesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRatingModules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListRatingModules"))
              .build();
        }
      }
    }
    return getListRatingModulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> getCreateSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSku",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> getCreateSkuMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> getCreateSkuMethod;
    if ((getCreateSkuMethod = BillingServiceGrpc.getCreateSkuMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateSkuMethod = BillingServiceGrpc.getCreateSkuMethod) == null) {
          BillingServiceGrpc.getCreateSkuMethod = getCreateSkuMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateSku"))
              .build();
        }
      }
    }
    return getCreateSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> getDeleteSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSku",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> getDeleteSkuMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> getDeleteSkuMethod;
    if ((getDeleteSkuMethod = BillingServiceGrpc.getDeleteSkuMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteSkuMethod = BillingServiceGrpc.getDeleteSkuMethod) == null) {
          BillingServiceGrpc.getDeleteSkuMethod = getDeleteSkuMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteSku"))
              .build();
        }
      }
    }
    return getDeleteSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> getGetSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSku",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> getGetSkuMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> getGetSkuMethod;
    if ((getGetSkuMethod = BillingServiceGrpc.getGetSkuMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetSkuMethod = BillingServiceGrpc.getGetSkuMethod) == null) {
          BillingServiceGrpc.getGetSkuMethod = getGetSkuMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetSku"))
              .build();
        }
      }
    }
    return getGetSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> getListSkusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkus",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> getListSkusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> getListSkusMethod;
    if ((getListSkusMethod = BillingServiceGrpc.getListSkusMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListSkusMethod = BillingServiceGrpc.getListSkusMethod) == null) {
          BillingServiceGrpc.getListSkusMethod = getListSkusMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListSkus"))
              .build();
        }
      }
    }
    return getListSkusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> getUpdateSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSku",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> getUpdateSkuMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> getUpdateSkuMethod;
    if ((getUpdateSkuMethod = BillingServiceGrpc.getUpdateSkuMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateSkuMethod = BillingServiceGrpc.getUpdateSkuMethod) == null) {
          BillingServiceGrpc.getUpdateSkuMethod = getUpdateSkuMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateSku"))
              .build();
        }
      }
    }
    return getUpdateSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> getCreatePlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> getCreatePlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> getCreatePlanMethod;
    if ((getCreatePlanMethod = BillingServiceGrpc.getCreatePlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreatePlanMethod = BillingServiceGrpc.getCreatePlanMethod) == null) {
          BillingServiceGrpc.getCreatePlanMethod = getCreatePlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreatePlan"))
              .build();
        }
      }
    }
    return getCreatePlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> getGetPlanChangelogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlanChangelog",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> getGetPlanChangelogMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> getGetPlanChangelogMethod;
    if ((getGetPlanChangelogMethod = BillingServiceGrpc.getGetPlanChangelogMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetPlanChangelogMethod = BillingServiceGrpc.getGetPlanChangelogMethod) == null) {
          BillingServiceGrpc.getGetPlanChangelogMethod = getGetPlanChangelogMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlanChangelog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetPlanChangelog"))
              .build();
        }
      }
    }
    return getGetPlanChangelogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> getListPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPlans",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> getListPlansMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> getListPlansMethod;
    if ((getListPlansMethod = BillingServiceGrpc.getListPlansMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListPlansMethod = BillingServiceGrpc.getListPlansMethod) == null) {
          BillingServiceGrpc.getListPlansMethod = getListPlansMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListPlans"))
              .build();
        }
      }
    }
    return getListPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> getApplyDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> getApplyDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> getApplyDraftMethod;
    if ((getApplyDraftMethod = BillingServiceGrpc.getApplyDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getApplyDraftMethod = BillingServiceGrpc.getApplyDraftMethod) == null) {
          BillingServiceGrpc.getApplyDraftMethod = getApplyDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ApplyDraft"))
              .build();
        }
      }
    }
    return getApplyDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> getApplyTemplateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyTemplateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> getApplyTemplateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> getApplyTemplateDraftMethod;
    if ((getApplyTemplateDraftMethod = BillingServiceGrpc.getApplyTemplateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getApplyTemplateDraftMethod = BillingServiceGrpc.getApplyTemplateDraftMethod) == null) {
          BillingServiceGrpc.getApplyTemplateDraftMethod = getApplyTemplateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyTemplateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ApplyTemplateDraft"))
              .build();
        }
      }
    }
    return getApplyTemplateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> getCreateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> getCreateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> getCreateDraftMethod;
    if ((getCreateDraftMethod = BillingServiceGrpc.getCreateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDraftMethod = BillingServiceGrpc.getCreateDraftMethod) == null) {
          BillingServiceGrpc.getCreateDraftMethod = getCreateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDraft"))
              .build();
        }
      }
    }
    return getCreateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> getCreateTemplateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTemplateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> getCreateTemplateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> getCreateTemplateDraftMethod;
    if ((getCreateTemplateDraftMethod = BillingServiceGrpc.getCreateTemplateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateTemplateDraftMethod = BillingServiceGrpc.getCreateTemplateDraftMethod) == null) {
          BillingServiceGrpc.getCreateTemplateDraftMethod = getCreateTemplateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTemplateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateTemplateDraft"))
              .build();
        }
      }
    }
    return getCreateTemplateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> getDeleteDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> getDeleteDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> getDeleteDraftMethod;
    if ((getDeleteDraftMethod = BillingServiceGrpc.getDeleteDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDraftMethod = BillingServiceGrpc.getDeleteDraftMethod) == null) {
          BillingServiceGrpc.getDeleteDraftMethod = getDeleteDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDraft"))
              .build();
        }
      }
    }
    return getDeleteDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> getDeleteTemplateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTemplateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> getDeleteTemplateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> getDeleteTemplateDraftMethod;
    if ((getDeleteTemplateDraftMethod = BillingServiceGrpc.getDeleteTemplateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteTemplateDraftMethod = BillingServiceGrpc.getDeleteTemplateDraftMethod) == null) {
          BillingServiceGrpc.getDeleteTemplateDraftMethod = getDeleteTemplateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTemplateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteTemplateDraft"))
              .build();
        }
      }
    }
    return getDeleteTemplateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> getGetDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> getGetDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> getGetDraftMethod;
    if ((getGetDraftMethod = BillingServiceGrpc.getGetDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetDraftMethod = BillingServiceGrpc.getGetDraftMethod) == null) {
          BillingServiceGrpc.getGetDraftMethod = getGetDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetDraft"))
              .build();
        }
      }
    }
    return getGetDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> getGetTemplateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemplateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> getGetTemplateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> getGetTemplateDraftMethod;
    if ((getGetTemplateDraftMethod = BillingServiceGrpc.getGetTemplateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetTemplateDraftMethod = BillingServiceGrpc.getGetTemplateDraftMethod) == null) {
          BillingServiceGrpc.getGetTemplateDraftMethod = getGetTemplateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTemplateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetTemplateDraft"))
              .build();
        }
      }
    }
    return getGetTemplateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> getListDraftsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDrafts",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> getListDraftsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> getListDraftsMethod;
    if ((getListDraftsMethod = BillingServiceGrpc.getListDraftsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListDraftsMethod = BillingServiceGrpc.getListDraftsMethod) == null) {
          BillingServiceGrpc.getListDraftsMethod = getListDraftsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDrafts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListDrafts"))
              .build();
        }
      }
    }
    return getListDraftsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> getListTemplateDraftsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTemplateDrafts",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> getListTemplateDraftsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> getListTemplateDraftsMethod;
    if ((getListTemplateDraftsMethod = BillingServiceGrpc.getListTemplateDraftsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListTemplateDraftsMethod = BillingServiceGrpc.getListTemplateDraftsMethod) == null) {
          BillingServiceGrpc.getListTemplateDraftsMethod = getListTemplateDraftsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest, com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTemplateDrafts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListTemplateDrafts"))
              .build();
        }
      }
    }
    return getListTemplateDraftsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> getUpdateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> getUpdateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> getUpdateDraftMethod;
    if ((getUpdateDraftMethod = BillingServiceGrpc.getUpdateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDraftMethod = BillingServiceGrpc.getUpdateDraftMethod) == null) {
          BillingServiceGrpc.getUpdateDraftMethod = getUpdateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDraft"))
              .build();
        }
      }
    }
    return getUpdateDraftMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> getUpdateTemplateDraftMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTemplateDraft",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> getUpdateTemplateDraftMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> getUpdateTemplateDraftMethod;
    if ((getUpdateTemplateDraftMethod = BillingServiceGrpc.getUpdateTemplateDraftMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateTemplateDraftMethod = BillingServiceGrpc.getUpdateTemplateDraftMethod) == null) {
          BillingServiceGrpc.getUpdateTemplateDraftMethod = getUpdateTemplateDraftMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTemplateDraft"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateTemplateDraft"))
              .build();
        }
      }
    }
    return getUpdateTemplateDraftMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> getCreateTemplateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTemplateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> getCreateTemplateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> getCreateTemplateRateDefinitionMethod;
    if ((getCreateTemplateRateDefinitionMethod = BillingServiceGrpc.getCreateTemplateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateTemplateRateDefinitionMethod = BillingServiceGrpc.getCreateTemplateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateTemplateRateDefinitionMethod = getCreateTemplateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTemplateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateTemplateRateDefinition"))
              .build();
        }
      }
    }
    return getCreateTemplateRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> getDeleteTemplateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTemplateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> getDeleteTemplateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> getDeleteTemplateRateDefinitionMethod;
    if ((getDeleteTemplateRateDefinitionMethod = BillingServiceGrpc.getDeleteTemplateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteTemplateRateDefinitionMethod = BillingServiceGrpc.getDeleteTemplateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteTemplateRateDefinitionMethod = getDeleteTemplateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTemplateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteTemplateRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteTemplateRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> getUpdateTemplateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTemplateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> getUpdateTemplateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> getUpdateTemplateRateDefinitionMethod;
    if ((getUpdateTemplateRateDefinitionMethod = BillingServiceGrpc.getUpdateTemplateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateTemplateRateDefinitionMethod = BillingServiceGrpc.getUpdateTemplateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateTemplateRateDefinitionMethod = getUpdateTemplateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTemplateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateTemplateRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateTemplateRateDefinitionMethod;
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
   * Rating Module
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists the rating modules.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listRatingModules(com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRatingModulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createSku(com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSkuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The SKU is in use.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteSku(com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSkuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getSku(com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists SKUs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listSkus(com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateSku(com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new billing plan for an org. This will create a new billing plan
     * based off of the template for the given cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The template was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the edit history for a given billing cycle.
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
    default void getPlanChangelog(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlanChangelogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPlansMethod(), responseObserver);
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
    default void applyDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Applies a draft billing plan for modifying the template.
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
    default void applyTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyTemplateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new draft billing plan for modifying the template.
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
    default void createTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTemplateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft billing plan.
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
    default void deleteDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft billing plan for modifying the template.
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
    default void deleteTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTemplateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a draft billing plan.
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
    default void getDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a draft billing plan for modifying the template.
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
    default void getTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTemplateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists draft billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDraftsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists draft billing plans for modifying the template.
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
    default void listTemplateDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplateDraftsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a draft billing plan.
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
    default void updateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a draft billing plan for modifying the template.
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
    default void updateTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTemplateDraftMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition.
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
    default void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition for a template draft.
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
    default void createTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTemplateRateDefinitionMethod(), responseObserver);
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
     * Deletes a rate definition for a template draft.
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
    default void deleteTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTemplateRateDefinitionMethod(), responseObserver);
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
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRateDefinitionsMethod(), responseObserver);
    }

    /**
     */
    default void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition for a template draft.
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
    default void updateTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTemplateRateDefinitionMethod(), responseObserver);
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
   * Rating Module
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
   * Rating Module
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
     * Lists the rating modules.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listRatingModules(com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRatingModulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createSku(com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The SKU is in use.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteSku(com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getSku(com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists SKUs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listSkus(com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateSku(com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new billing plan for an org. This will create a new billing plan
     * based off of the template for the given cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The template was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the edit history for a given billing cycle.
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
    public void getPlanChangelog(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlanChangelogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPlansMethod(), getCallOptions()), request, responseObserver);
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
    public void applyDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Applies a draft billing plan for modifying the template.
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
    public void applyTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyTemplateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new draft billing plan for modifying the template.
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
    public void createTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTemplateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft billing plan.
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
    public void deleteDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft billing plan for modifying the template.
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
    public void deleteTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTemplateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a draft billing plan.
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
    public void getDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a draft billing plan for modifying the template.
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
    public void getTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTemplateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists draft billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDraftsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists draft billing plans for modifying the template.
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
    public void listTemplateDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTemplateDraftsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a draft billing plan.
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
    public void updateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a draft billing plan for modifying the template.
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
    public void updateTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTemplateDraftMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition.
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
    public void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new rate definition for a template draft.
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
    public void createTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTemplateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
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
     * Deletes a rate definition for a template draft.
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
    public void deleteTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTemplateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
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
     *   - grpc.NotFound: The billing plan was not found.
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
     */
    public void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition for a template draft.
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
    public void updateTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTemplateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
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
   * Rating Module
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
     * Lists the rating modules.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse listRatingModules(com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRatingModulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse createSku(com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSkuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The SKU is in use.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse deleteSku(com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSkuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse getSku(com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists SKUs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse listSkus(com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse updateSku(com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new billing plan for an org. This will create a new billing plan
     * based off of the template for the given cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The template was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse createPlan(com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the edit history for a given billing cycle.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse getPlanChangelog(com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlanChangelogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists billing plans
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse listPlans(com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPlansMethod(), getCallOptions(), request);
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
    public com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse applyDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Applies a draft billing plan for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse applyTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyTemplateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse createDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new draft billing plan for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse createTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTemplateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a draft billing plan.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse deleteDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a draft billing plan for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse deleteTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTemplateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a draft billing plan.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse getDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a draft billing plan for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse getTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTemplateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists draft billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse listDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDraftsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists draft billing plans for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse listTemplateDrafts(com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTemplateDraftsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a draft billing plan.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse updateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a draft billing plan for modifying the template.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse updateTemplateDraft(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTemplateDraftMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new rate definition.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new rate definition for a template draft.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse createTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTemplateRateDefinitionMethod(), getCallOptions(), request);
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
     * Deletes a rate definition for a template draft.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse deleteTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTemplateRateDefinitionMethod(), getCallOptions(), request);
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
     *   - grpc.NotFound: The billing plan was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsResponse listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha3.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRateDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a rate definition for a template draft.
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
    public com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse updateTemplateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTemplateRateDefinitionMethod(), getCallOptions(), request);
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
   * Rating Module
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
     * Lists the rating modules.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse> listRatingModules(
        com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRatingModulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse> createSku(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSkuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The SKU is in use.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse> deleteSku(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSkuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse> getSku(
        com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists SKUs.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse> listSkus(
        com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a SKU.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: The SKU already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The SKU was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse> updateSku(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new billing plan for an org. This will create a new billing plan
     * based off of the template for the given cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The template was not found.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse> createPlan(
        com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the edit history for a given billing cycle.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse> getPlanChangelog(
        com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlanChangelogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists billing plans
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse> listPlans(
        com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPlansMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse> applyDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Applies a draft billing plan for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse> applyTemplateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyTemplateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new draft billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse> createDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new draft billing plan for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse> createTemplateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTemplateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a draft billing plan.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse> deleteDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a draft billing plan for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse> deleteTemplateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTemplateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a draft billing plan.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse> getDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a draft billing plan for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse> getTemplateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTemplateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists draft billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: The caller does not have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse> listDrafts(
        com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDraftsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists draft billing plans for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse> listTemplateDrafts(
        com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTemplateDraftsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a draft billing plan.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse> updateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a draft billing plan for modifying the template.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse> updateTemplateDraft(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTemplateDraftMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new rate definition.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse> createRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new rate definition for a template draft.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse> createTemplateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTemplateRateDefinitionMethod(), getCallOptions()), request);
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
     * Deletes a rate definition for a template draft.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse> deleteTemplateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTemplateRateDefinitionMethod(), getCallOptions()), request);
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
     *   - grpc.NotFound: The billing plan was not found.
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionResponse> updateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a rate definition for a template draft.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse> updateTemplateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTemplateRateDefinitionMethod(), getCallOptions()), request);
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

  private static final int METHODID_LIST_RATING_MODULES = 0;
  private static final int METHODID_CREATE_SKU = 1;
  private static final int METHODID_DELETE_SKU = 2;
  private static final int METHODID_GET_SKU = 3;
  private static final int METHODID_LIST_SKUS = 4;
  private static final int METHODID_UPDATE_SKU = 5;
  private static final int METHODID_CREATE_PLAN = 6;
  private static final int METHODID_GET_PLAN_CHANGELOG = 7;
  private static final int METHODID_LIST_PLANS = 8;
  private static final int METHODID_APPLY_DRAFT = 9;
  private static final int METHODID_APPLY_TEMPLATE_DRAFT = 10;
  private static final int METHODID_CREATE_DRAFT = 11;
  private static final int METHODID_CREATE_TEMPLATE_DRAFT = 12;
  private static final int METHODID_DELETE_DRAFT = 13;
  private static final int METHODID_DELETE_TEMPLATE_DRAFT = 14;
  private static final int METHODID_GET_DRAFT = 15;
  private static final int METHODID_GET_TEMPLATE_DRAFT = 16;
  private static final int METHODID_LIST_DRAFTS = 17;
  private static final int METHODID_LIST_TEMPLATE_DRAFTS = 18;
  private static final int METHODID_UPDATE_DRAFT = 19;
  private static final int METHODID_UPDATE_TEMPLATE_DRAFT = 20;
  private static final int METHODID_CREATE_RATE_DEFINITION = 21;
  private static final int METHODID_CREATE_TEMPLATE_RATE_DEFINITION = 22;
  private static final int METHODID_DELETE_RATE_DEFINITION = 23;
  private static final int METHODID_DELETE_TEMPLATE_RATE_DEFINITION = 24;
  private static final int METHODID_GET_RATE_DEFINITION = 25;
  private static final int METHODID_LIST_RATE_DEFINITIONS = 26;
  private static final int METHODID_UPDATE_RATE_DEFINITION = 27;
  private static final int METHODID_UPDATE_TEMPLATE_RATE_DEFINITION = 28;
  private static final int METHODID_EXPORT_INVOICE = 29;

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
        case METHODID_LIST_RATING_MODULES:
          serviceImpl.listRatingModules((com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse>) responseObserver);
          break;
        case METHODID_CREATE_SKU:
          serviceImpl.createSku((com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse>) responseObserver);
          break;
        case METHODID_DELETE_SKU:
          serviceImpl.deleteSku((com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse>) responseObserver);
          break;
        case METHODID_GET_SKU:
          serviceImpl.getSku((com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse>) responseObserver);
          break;
        case METHODID_LIST_SKUS:
          serviceImpl.listSkus((com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SKU:
          serviceImpl.updateSku((com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse>) responseObserver);
          break;
        case METHODID_CREATE_PLAN:
          serviceImpl.createPlan((com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse>) responseObserver);
          break;
        case METHODID_GET_PLAN_CHANGELOG:
          serviceImpl.getPlanChangelog((com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse>) responseObserver);
          break;
        case METHODID_LIST_PLANS:
          serviceImpl.listPlans((com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse>) responseObserver);
          break;
        case METHODID_APPLY_DRAFT:
          serviceImpl.applyDraft((com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse>) responseObserver);
          break;
        case METHODID_APPLY_TEMPLATE_DRAFT:
          serviceImpl.applyTemplateDraft((com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse>) responseObserver);
          break;
        case METHODID_CREATE_DRAFT:
          serviceImpl.createDraft((com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEMPLATE_DRAFT:
          serviceImpl.createTemplateDraft((com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse>) responseObserver);
          break;
        case METHODID_DELETE_DRAFT:
          serviceImpl.deleteDraft((com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEMPLATE_DRAFT:
          serviceImpl.deleteTemplateDraft((com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse>) responseObserver);
          break;
        case METHODID_GET_DRAFT:
          serviceImpl.getDraft((com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse>) responseObserver);
          break;
        case METHODID_GET_TEMPLATE_DRAFT:
          serviceImpl.getTemplateDraft((com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse>) responseObserver);
          break;
        case METHODID_LIST_DRAFTS:
          serviceImpl.listDrafts((com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATE_DRAFTS:
          serviceImpl.listTemplateDrafts((com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DRAFT:
          serviceImpl.updateDraft((com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TEMPLATE_DRAFT:
          serviceImpl.updateTemplateDraft((com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse>) responseObserver);
          break;
        case METHODID_CREATE_RATE_DEFINITION:
          serviceImpl.createRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEMPLATE_RATE_DEFINITION:
          serviceImpl.createTemplateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_RATE_DEFINITION:
          serviceImpl.deleteRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEMPLATE_RATE_DEFINITION:
          serviceImpl.deleteTemplateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse>) responseObserver);
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
        case METHODID_UPDATE_TEMPLATE_RATE_DEFINITION:
          serviceImpl.updateTemplateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse>) responseObserver);
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
          getListRatingModulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListRatingModulesResponse>(
                service, METHODID_LIST_RATING_MODULES)))
        .addMethod(
          getCreateSkuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateSkuResponse>(
                service, METHODID_CREATE_SKU)))
        .addMethod(
          getDeleteSkuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteSkuResponse>(
                service, METHODID_DELETE_SKU)))
        .addMethod(
          getGetSkuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetSkuRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetSkuResponse>(
                service, METHODID_GET_SKU)))
        .addMethod(
          getListSkusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListSkusRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListSkusResponse>(
                service, METHODID_LIST_SKUS)))
        .addMethod(
          getUpdateSkuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateSkuResponse>(
                service, METHODID_UPDATE_SKU)))
        .addMethod(
          getCreatePlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreatePlanResponse>(
                service, METHODID_CREATE_PLAN)))
        .addMethod(
          getGetPlanChangelogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetPlanChangelogResponse>(
                service, METHODID_GET_PLAN_CHANGELOG)))
        .addMethod(
          getListPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListPlansRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListPlansResponse>(
                service, METHODID_LIST_PLANS)))
        .addMethod(
          getApplyDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyDraftResponse>(
                service, METHODID_APPLY_DRAFT)))
        .addMethod(
          getApplyTemplateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ApplyTemplateDraftResponse>(
                service, METHODID_APPLY_TEMPLATE_DRAFT)))
        .addMethod(
          getCreateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateDraftResponse>(
                service, METHODID_CREATE_DRAFT)))
        .addMethod(
          getCreateTemplateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateDraftResponse>(
                service, METHODID_CREATE_TEMPLATE_DRAFT)))
        .addMethod(
          getDeleteDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteDraftResponse>(
                service, METHODID_DELETE_DRAFT)))
        .addMethod(
          getDeleteTemplateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateDraftResponse>(
                service, METHODID_DELETE_TEMPLATE_DRAFT)))
        .addMethod(
          getGetDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetDraftResponse>(
                service, METHODID_GET_DRAFT)))
        .addMethod(
          getGetTemplateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.GetTemplateDraftResponse>(
                service, METHODID_GET_TEMPLATE_DRAFT)))
        .addMethod(
          getListDraftsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListDraftsResponse>(
                service, METHODID_LIST_DRAFTS)))
        .addMethod(
          getListTemplateDraftsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.ListTemplateDraftsResponse>(
                service, METHODID_LIST_TEMPLATE_DRAFTS)))
        .addMethod(
          getUpdateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateDraftResponse>(
                service, METHODID_UPDATE_DRAFT)))
        .addMethod(
          getUpdateTemplateDraftMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateDraftResponse>(
                service, METHODID_UPDATE_TEMPLATE_DRAFT)))
        .addMethod(
          getCreateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateRateDefinitionResponse>(
                service, METHODID_CREATE_RATE_DEFINITION)))
        .addMethod(
          getCreateTemplateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.CreateTemplateRateDefinitionResponse>(
                service, METHODID_CREATE_TEMPLATE_RATE_DEFINITION)))
        .addMethod(
          getDeleteRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteRateDefinitionResponse>(
                service, METHODID_DELETE_RATE_DEFINITION)))
        .addMethod(
          getDeleteTemplateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.DeleteTemplateRateDefinitionResponse>(
                service, METHODID_DELETE_TEMPLATE_RATE_DEFINITION)))
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
          getUpdateTemplateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha3.UpdateTemplateRateDefinitionResponse>(
                service, METHODID_UPDATE_TEMPLATE_RATE_DEFINITION)))
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
              .addMethod(getListRatingModulesMethod())
              .addMethod(getCreateSkuMethod())
              .addMethod(getDeleteSkuMethod())
              .addMethod(getGetSkuMethod())
              .addMethod(getListSkusMethod())
              .addMethod(getUpdateSkuMethod())
              .addMethod(getCreatePlanMethod())
              .addMethod(getGetPlanChangelogMethod())
              .addMethod(getListPlansMethod())
              .addMethod(getApplyDraftMethod())
              .addMethod(getApplyTemplateDraftMethod())
              .addMethod(getCreateDraftMethod())
              .addMethod(getCreateTemplateDraftMethod())
              .addMethod(getDeleteDraftMethod())
              .addMethod(getDeleteTemplateDraftMethod())
              .addMethod(getGetDraftMethod())
              .addMethod(getGetTemplateDraftMethod())
              .addMethod(getListDraftsMethod())
              .addMethod(getListTemplateDraftsMethod())
              .addMethod(getUpdateDraftMethod())
              .addMethod(getUpdateTemplateDraftMethod())
              .addMethod(getCreateRateDefinitionMethod())
              .addMethod(getCreateTemplateRateDefinitionMethod())
              .addMethod(getDeleteRateDefinitionMethod())
              .addMethod(getDeleteTemplateRateDefinitionMethod())
              .addMethod(getGetRateDefinitionMethod())
              .addMethod(getListRateDefinitionsMethod())
              .addMethod(getUpdateRateDefinitionMethod())
              .addMethod(getUpdateTemplateRateDefinitionMethod())
              .addMethod(getExportInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
