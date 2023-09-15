package com.tcn.cloud.api.services.billing.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * BillingService handles billing requests.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/billing/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.billing.v1alpha1.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> getCreateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> getCreateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> getCreateBillingPlanMethod;
    if ((getCreateBillingPlanMethod = BillingServiceGrpc.getCreateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateBillingPlanMethod = BillingServiceGrpc.getCreateBillingPlanMethod) == null) {
          BillingServiceGrpc.getCreateBillingPlanMethod = getCreateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateBillingPlan"))
              .build();
        }
      }
    }
    return getCreateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> getCreateInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> getCreateInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> getCreateInvoiceMethod;
    if ((getCreateInvoiceMethod = BillingServiceGrpc.getCreateInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateInvoiceMethod = BillingServiceGrpc.getCreateInvoiceMethod) == null) {
          BillingServiceGrpc.getCreateInvoiceMethod = getCreateInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateInvoice"))
              .build();
        }
      }
    }
    return getCreateInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> getDeleteBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> getDeleteBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> getDeleteBillingPlanMethod;
    if ((getDeleteBillingPlanMethod = BillingServiceGrpc.getDeleteBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteBillingPlanMethod = BillingServiceGrpc.getDeleteBillingPlanMethod) == null) {
          BillingServiceGrpc.getDeleteBillingPlanMethod = getDeleteBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteBillingPlan"))
              .build();
        }
      }
    }
    return getDeleteBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> getDeleteInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> getDeleteInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> getDeleteInvoiceMethod;
    if ((getDeleteInvoiceMethod = BillingServiceGrpc.getDeleteInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteInvoiceMethod = BillingServiceGrpc.getDeleteInvoiceMethod) == null) {
          BillingServiceGrpc.getDeleteInvoiceMethod = getDeleteInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteInvoice"))
              .build();
        }
      }
    }
    return getDeleteInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> getGetBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> getGetBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> getGetBillingPlanMethod;
    if ((getGetBillingPlanMethod = BillingServiceGrpc.getGetBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingPlanMethod = BillingServiceGrpc.getGetBillingPlanMethod) == null) {
          BillingServiceGrpc.getGetBillingPlanMethod = getGetBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingPlan"))
              .build();
        }
      }
    }
    return getGetBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> getGetDefaultBillingPlanMethod;
    if ((getGetDefaultBillingPlanMethod = BillingServiceGrpc.getGetDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetDefaultBillingPlanMethod = BillingServiceGrpc.getGetDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getGetDefaultBillingPlanMethod = getGetDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getGetDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> getGetInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> getGetInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> getGetInvoiceMethod;
    if ((getGetInvoiceMethod = BillingServiceGrpc.getGetInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetInvoiceMethod = BillingServiceGrpc.getGetInvoiceMethod) == null) {
          BillingServiceGrpc.getGetInvoiceMethod = getGetInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetInvoice"))
              .build();
        }
      }
    }
    return getGetInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBillingPlans",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod;
    if ((getListBillingPlansMethod = BillingServiceGrpc.getListBillingPlansMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListBillingPlansMethod = BillingServiceGrpc.getListBillingPlansMethod) == null) {
          BillingServiceGrpc.getListBillingPlansMethod = getListBillingPlansMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBillingPlans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListBillingPlans"))
              .build();
        }
      }
    }
    return getListBillingPlansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> getListInvoicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInvoices",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> getListInvoicesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = BillingServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListInvoicesMethod = BillingServiceGrpc.getListInvoicesMethod) == null) {
          BillingServiceGrpc.getListInvoicesMethod = getListInvoicesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListInvoices"))
              .build();
        }
      }
    }
    return getListInvoicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> getUpdateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> getUpdateBillingPlanMethod;
    if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateBillingPlanMethod = BillingServiceGrpc.getUpdateBillingPlanMethod) == null) {
          BillingServiceGrpc.getUpdateBillingPlanMethod = getUpdateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> getUpdateDefaultBillingPlanMethod;
    if ((getUpdateDefaultBillingPlanMethod = BillingServiceGrpc.getUpdateDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDefaultBillingPlanMethod = BillingServiceGrpc.getUpdateDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getUpdateDefaultBillingPlanMethod = getUpdateDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getUpdateDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> getUpdateInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> getUpdateInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> getUpdateInvoiceMethod;
    if ((getUpdateInvoiceMethod = BillingServiceGrpc.getUpdateInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateInvoiceMethod = BillingServiceGrpc.getUpdateInvoiceMethod) == null) {
          BillingServiceGrpc.getUpdateInvoiceMethod = getUpdateInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateInvoice"))
              .build();
        }
      }
    }
    return getUpdateInvoiceMethod;
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
   * BillingService handles billing requests.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateBillingPlan creates a new billing plan for an organization.
     * </pre>
     */
    default void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateInvoice creates a new invoice for an organization for the specified
     * billing cycle. If one already exists, the old one will be deleted first.
     * </pre>
     */
    default void createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteBillingPlan deletes the specified inactive billing plan. This will fail
     * if the billing plan is in use, or already deleted.
     * </pre>
     */
    default void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteInvoice deletes the specified invoice.
     * </pre>
     */
    default void deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetBillingPlan returns the active billing plan for the organization.
     * </pre>
     */
    default void getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetDefaultBillingPlan returns the default billing plan for the region.
     * </pre>
     */
    default void getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetInvoice returns the specified invoice.
     * </pre>
     */
    default void getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListBillingPlans returns the specified list of billing plans.
     * </pre>
     */
    default void listBillingPlans(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBillingPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListInvoices returns the specified list of invoices.
     * </pre>
     */
    default void listInvoices(com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInvoicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan updates the specified billing plan. This is expected to provide
     * all the rate definitions for the billing plan if updating rates.
     * </pre>
     */
    default void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDefaultBillingPlan updates the default billing plan. This is expected to provide
     * all the rate definitions for the billing plan.
     * </pre>
     */
    default void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateInvoice updates the specified invoice.
     * </pre>
     */
    default void updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInvoiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   * <pre>
   * BillingService handles billing requests.
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
   * BillingService handles billing requests.
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
     * CreateBillingPlan creates a new billing plan for an organization.
     * </pre>
     */
    public void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateInvoice creates a new invoice for an organization for the specified
     * billing cycle. If one already exists, the old one will be deleted first.
     * </pre>
     */
    public void createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteBillingPlan deletes the specified inactive billing plan. This will fail
     * if the billing plan is in use, or already deleted.
     * </pre>
     */
    public void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteInvoice deletes the specified invoice.
     * </pre>
     */
    public void deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetBillingPlan returns the active billing plan for the organization.
     * </pre>
     */
    public void getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetDefaultBillingPlan returns the default billing plan for the region.
     * </pre>
     */
    public void getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetInvoice returns the specified invoice.
     * </pre>
     */
    public void getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListBillingPlans returns the specified list of billing plans.
     * </pre>
     */
    public void listBillingPlans(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListBillingPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListInvoices returns the specified list of invoices.
     * </pre>
     */
    public void listInvoices(com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateBillingPlan updates the specified billing plan. This is expected to provide
     * all the rate definitions for the billing plan if updating rates.
     * </pre>
     */
    public void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDefaultBillingPlan updates the default billing plan. This is expected to provide
     * all the rate definitions for the billing plan.
     * </pre>
     */
    public void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateInvoice updates the specified invoice.
     * </pre>
     */
    public void updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
   * <pre>
   * BillingService handles billing requests.
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
     * CreateBillingPlan creates a new billing plan for an organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateInvoice creates a new invoice for an organization for the specified
     * billing cycle. If one already exists, the old one will be deleted first.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteBillingPlan deletes the specified inactive billing plan. This will fail
     * if the billing plan is in use, or already deleted.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteInvoice deletes the specified invoice.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetBillingPlan returns the active billing plan for the organization.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetDefaultBillingPlan returns the default billing plan for the region.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse getDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetInvoice returns the specified invoice.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListBillingPlans returns the specified list of billing plans.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> listBillingPlans(
        com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListBillingPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListInvoices returns the specified list of invoices.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> listInvoices(
        com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan updates the specified billing plan. This is expected to provide
     * all the rate definitions for the billing plan if updating rates.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDefaultBillingPlan updates the default billing plan. This is expected to provide
     * all the rate definitions for the billing plan.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateInvoice updates the specified invoice.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInvoiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
   * <pre>
   * BillingService handles billing requests.
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
     * CreateBillingPlan creates a new billing plan for an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> createBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateInvoice creates a new invoice for an organization for the specified
     * billing cycle. If one already exists, the old one will be deleted first.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> createInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteBillingPlan deletes the specified inactive billing plan. This will fail
     * if the billing plan is in use, or already deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> deleteBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteInvoice deletes the specified invoice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> deleteInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetBillingPlan returns the active billing plan for the organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> getBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetDefaultBillingPlan returns the default billing plan for the region.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse> getDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetInvoice returns the specified invoice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> getInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateBillingPlan updates the specified billing plan. This is expected to provide
     * all the rate definitions for the billing plan if updating rates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> updateBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDefaultBillingPlan updates the default billing plan. This is expected to provide
     * all the rate definitions for the billing plan.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> updateDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateInvoice updates the specified invoice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> updateInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInvoiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BILLING_PLAN = 0;
  private static final int METHODID_CREATE_INVOICE = 1;
  private static final int METHODID_DELETE_BILLING_PLAN = 2;
  private static final int METHODID_DELETE_INVOICE = 3;
  private static final int METHODID_GET_BILLING_PLAN = 4;
  private static final int METHODID_GET_DEFAULT_BILLING_PLAN = 5;
  private static final int METHODID_GET_INVOICE = 6;
  private static final int METHODID_LIST_BILLING_PLANS = 7;
  private static final int METHODID_LIST_INVOICES = 8;
  private static final int METHODID_UPDATE_BILLING_PLAN = 9;
  private static final int METHODID_UPDATE_DEFAULT_BILLING_PLAN = 10;
  private static final int METHODID_UPDATE_INVOICE = 11;

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
        case METHODID_CREATE_BILLING_PLAN:
          serviceImpl.createBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_INVOICE:
          serviceImpl.createInvoice((com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse>) responseObserver);
          break;
        case METHODID_DELETE_BILLING_PLAN:
          serviceImpl.deleteBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DELETE_INVOICE:
          serviceImpl.deleteInvoice((com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_PLAN:
          serviceImpl.getBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_BILLING_PLAN:
          serviceImpl.getDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICE:
          serviceImpl.getInvoice((com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse>) responseObserver);
          break;
        case METHODID_LIST_BILLING_PLANS:
          serviceImpl.listBillingPlans((com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>) responseObserver);
          break;
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_PLAN:
          serviceImpl.updateBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_BILLING_PLAN:
          serviceImpl.updateDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INVOICE:
          serviceImpl.updateInvoice((com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse>) responseObserver);
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
          getCreateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse>(
                service, METHODID_CREATE_BILLING_PLAN)))
        .addMethod(
          getCreateInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse>(
                service, METHODID_CREATE_INVOICE)))
        .addMethod(
          getDeleteBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse>(
                service, METHODID_DELETE_BILLING_PLAN)))
        .addMethod(
          getDeleteInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse>(
                service, METHODID_DELETE_INVOICE)))
        .addMethod(
          getGetBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse>(
                service, METHODID_GET_BILLING_PLAN)))
        .addMethod(
          getGetDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetDefaultBillingPlanResponse>(
                service, METHODID_GET_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getGetInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse>(
                service, METHODID_GET_INVOICE)))
        .addMethod(
          getListBillingPlansMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>(
                service, METHODID_LIST_BILLING_PLANS)))
        .addMethod(
          getListInvoicesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>(
                service, METHODID_LIST_INVOICES)))
        .addMethod(
          getUpdateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse>(
                service, METHODID_UPDATE_BILLING_PLAN)))
        .addMethod(
          getUpdateDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse>(
                service, METHODID_UPDATE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getUpdateInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse>(
                service, METHODID_UPDATE_INVOICE)))
        .build();
  }

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha1.ServiceProto.getDescriptor();
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
              .addMethod(getCreateBillingPlanMethod())
              .addMethod(getCreateInvoiceMethod())
              .addMethod(getDeleteBillingPlanMethod())
              .addMethod(getDeleteInvoiceMethod())
              .addMethod(getGetBillingPlanMethod())
              .addMethod(getGetDefaultBillingPlanMethod())
              .addMethod(getGetInvoiceMethod())
              .addMethod(getListBillingPlansMethod())
              .addMethod(getListInvoicesMethod())
              .addMethod(getUpdateBillingPlanMethod())
              .addMethod(getUpdateDefaultBillingPlanMethod())
              .addMethod(getUpdateInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
