package com.tcn.cloud.api.services.billing.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/billing/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.billing.v1alpha1.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> getCommitBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> getCommitBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> getCommitBillingPlanMethod;
    if ((getCommitBillingPlanMethod = BillingServiceGrpc.getCommitBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCommitBillingPlanMethod = BillingServiceGrpc.getCommitBillingPlanMethod) == null) {
          BillingServiceGrpc.getCommitBillingPlanMethod = getCommitBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommitBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CommitBillingPlan"))
              .build();
        }
      }
    }
    return getCommitBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> getCommitDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> getCommitDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> getCommitDefaultBillingPlanMethod;
    if ((getCommitDefaultBillingPlanMethod = BillingServiceGrpc.getCommitDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCommitDefaultBillingPlanMethod = BillingServiceGrpc.getCommitDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getCommitDefaultBillingPlanMethod = getCommitDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommitDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CommitDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getCommitDefaultBillingPlanMethod;
  }

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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> getCreateDefaultBillingPlanMethod;
    if ((getCreateDefaultBillingPlanMethod = BillingServiceGrpc.getCreateDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDefaultBillingPlanMethod = BillingServiceGrpc.getCreateDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getCreateDefaultBillingPlanMethod = getCreateDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getCreateDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;
    if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateDefaultRateDefinitionMethod = getCreateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getCreateDefaultRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> getCreateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;
    if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateRateDefinitionMethod = getCreateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateRateDefinition"))
              .build();
        }
      }
    }
    return getCreateRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> getDeleteDefaultBillingPlanMethod;
    if ((getDeleteDefaultBillingPlanMethod = BillingServiceGrpc.getDeleteDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDefaultBillingPlanMethod = BillingServiceGrpc.getDeleteDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getDeleteDefaultBillingPlanMethod = getDeleteDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getDeleteDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;
    if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod = getDeleteDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteDefaultRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;
    if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteRateDefinitionMethod = getDeleteRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> getDuplicateBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DuplicateBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> getDuplicateBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> getDuplicateBillingPlanMethod;
    if ((getDuplicateBillingPlanMethod = BillingServiceGrpc.getDuplicateBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDuplicateBillingPlanMethod = BillingServiceGrpc.getDuplicateBillingPlanMethod) == null) {
          BillingServiceGrpc.getDuplicateBillingPlanMethod = getDuplicateBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DuplicateBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DuplicateBillingPlan"))
              .build();
        }
      }
    }
    return getDuplicateBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> getDuplicateDefaultBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DuplicateDefaultBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> getDuplicateDefaultBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> getDuplicateDefaultBillingPlanMethod;
    if ((getDuplicateDefaultBillingPlanMethod = BillingServiceGrpc.getDuplicateDefaultBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDuplicateDefaultBillingPlanMethod = BillingServiceGrpc.getDuplicateDefaultBillingPlanMethod) == null) {
          BillingServiceGrpc.getDuplicateDefaultBillingPlanMethod = getDuplicateDefaultBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DuplicateDefaultBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DuplicateDefaultBillingPlan"))
              .build();
        }
      }
    }
    return getDuplicateDefaultBillingPlanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> getExportInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> getExportInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> getExportInvoiceMethod;
    if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
          BillingServiceGrpc.getExportInvoiceMethod = getExportInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ExportInvoice"))
              .build();
        }
      }
    }
    return getExportInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> getGetActiveBillingPlanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActiveBillingPlan",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> getGetActiveBillingPlanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> getGetActiveBillingPlanMethod;
    if ((getGetActiveBillingPlanMethod = BillingServiceGrpc.getGetActiveBillingPlanMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetActiveBillingPlanMethod = BillingServiceGrpc.getGetActiveBillingPlanMethod) == null) {
          BillingServiceGrpc.getGetActiveBillingPlanMethod = getGetActiveBillingPlanMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetActiveBillingPlan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetActiveBillingPlan"))
              .build();
        }
      }
    }
    return getGetActiveBillingPlanMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> getGetBillingPlanHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPlanHistory",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> getGetBillingPlanHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> getGetBillingPlanHistoryMethod;
    if ((getGetBillingPlanHistoryMethod = BillingServiceGrpc.getGetBillingPlanHistoryMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetBillingPlanHistoryMethod = BillingServiceGrpc.getGetBillingPlanHistoryMethod) == null) {
          BillingServiceGrpc.getGetBillingPlanHistoryMethod = getGetBillingPlanHistoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPlanHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetBillingPlanHistory"))
              .build();
        }
      }
    }
    return getGetBillingPlanHistoryMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> getGetRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> getGetRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> getGetRateDefinitionMethod;
    if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
          BillingServiceGrpc.getGetRateDefinitionMethod = getGetRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetRateDefinition"))
              .build();
        }
      }
    }
    return getGetRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBillingPlans",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> getListBillingPlansMethod;
    if ((getListBillingPlansMethod = BillingServiceGrpc.getListBillingPlansMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListBillingPlansMethod = BillingServiceGrpc.getListBillingPlansMethod) == null) {
          BillingServiceGrpc.getListBillingPlansMethod = getListBillingPlansMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
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
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> getListInvoicesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = BillingServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListInvoicesMethod = BillingServiceGrpc.getListInvoicesMethod) == null) {
          BillingServiceGrpc.getListInvoicesMethod = getListInvoicesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> getListRateDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRateDefinitions",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> getListRateDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> getListRateDefinitionsMethod;
    if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
          BillingServiceGrpc.getListRateDefinitionsMethod = getListRateDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRateDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListRateDefinitions"))
              .build();
        }
      }
    }
    return getListRateDefinitionsMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;
    if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod = getUpdateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateDefaultRateDefinitionMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;
    if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateRateDefinitionMethod = getUpdateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateRateDefinitionMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * Commits a billing plan for the ORG, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void commitBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Commits a default billing plan for the REGION, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The default billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void commitDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a billing plan for the ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a default rate definition for a default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an invoice for the ORG for the specified billing cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: An invoice already exists for the specified billing cycle.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    default void createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a rate definition for a Billing Plan in an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from the default billing plan for the REGION.
     *   - The default billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    default void deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from a Billing Plan in an ORG.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Duplicates a billing plan. This copies the billing plan and all of its rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void duplicateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDuplicateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Duplicates a default billing plan. This copies the billing plan, all of its rate definitions,
     * and all of its rate definition groups and features.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void duplicateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDuplicateDefaultBillingPlanMethod(), responseObserver);
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
    default void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the active billing plan for the ORG or REGION. The active billing plan is a billing plan
     * whose start_time has passed and end_time has not passed. If multiple satisfy that requirement, the
     * newest one is considered active. If no plan is active, it indicates the ORG is using REGION defaults,
     * or that the REGION has not been set up for billing yet.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: There isn't an active billing plan.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getActiveBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the billing plan history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getBillingPlanHistory(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPlanHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    default void getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the specified rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listBillingPlans(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBillingPlansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists invoices.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    default void listInvoices(com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInvoicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRateDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultBillingPlanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a default rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    default void updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInvoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRateDefinitionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BillingService.
   */
  public static abstract class BillingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BillingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BillingService.
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
     * Commits a billing plan for the ORG, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void commitBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commits a default billing plan for the REGION, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The default billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void commitDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a billing plan for the ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a default rate definition for a default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an invoice for the ORG for the specified billing cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: An invoice already exists for the specified billing cycle.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public void createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a rate definition for a Billing Plan in an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from the default billing plan for the REGION.
     *   - The default billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public void deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from a Billing Plan in an ORG.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Duplicates a billing plan. This copies the billing plan and all of its rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void duplicateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDuplicateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Duplicates a default billing plan. This copies the billing plan, all of its rate definitions,
     * and all of its rate definition groups and features.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void duplicateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDuplicateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
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
    public void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the active billing plan for the ORG or REGION. The active billing plan is a billing plan
     * whose start_time has passed and end_time has not passed. If multiple satisfy that requirement, the
     * newest one is considered active. If no plan is active, it indicates the ORG is using REGION defaults,
     * or that the REGION has not been set up for billing yet.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: There isn't an active billing plan.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getActiveBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActiveBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the billing plan history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getBillingPlanHistory(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPlanHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public void getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the specified rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listBillingPlans(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBillingPlansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists invoices.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public void listInvoices(com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a default rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public void updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BillingService.
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
     * Commits a billing plan for the ORG, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse commitBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Commits a default billing plan for the REGION, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The default billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse commitDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a billing plan for the ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse createBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse createDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a default rate definition for a default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an invoice for the ORG for the specified billing cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: An invoice already exists for the specified billing cycle.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse createInvoice(com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a rate definition for a Billing Plan in an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse deleteBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse deleteDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from the default billing plan for the REGION.
     *   - The default billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse deleteInvoice(com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from a Billing Plan in an ORG.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Duplicates a billing plan. This copies the billing plan and all of its rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse duplicateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDuplicateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Duplicates a default billing plan. This copies the billing plan, all of its rate definitions,
     * and all of its rate definition groups and features.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse duplicateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDuplicateDefaultBillingPlanMethod(), getCallOptions(), request);
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
    public com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse exportInvoice(com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the active billing plan for the ORG or REGION. The active billing plan is a billing plan
     * whose start_time has passed and end_time has not passed. If multiple satisfy that requirement, the
     * newest one is considered active. If no plan is active, it indicates the ORG is using REGION defaults,
     * or that the REGION has not been set up for billing yet.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: There isn't an active billing plan.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse getActiveBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActiveBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse getBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the billing plan history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse getBillingPlanHistory(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPlanHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse getInvoice(com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the specified rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse listBillingPlans(com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBillingPlansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists invoices.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse listInvoices(com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRateDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse updateBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse updateDefaultBillingPlan(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultBillingPlanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a default rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse updateInvoice(com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInvoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRateDefinitionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BillingService.
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
     * Commits a billing plan for the ORG, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse> commitBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Commits a default billing plan for the REGION, finalizing it's creation and allowing it
     * to become active.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The default billing plan is already committed.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse> commitDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a billing plan for the ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse> createBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse> createDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a default rate definition for a default billing plan for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse> createDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an invoice for the ORG for the specified billing cycle.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: An invoice already exists for the specified billing cycle.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse> createInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a rate definition for a Billing Plan in an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse> createRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse> deleteBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The default billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse> deleteDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from the default billing plan for the REGION.
     *   - The default billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse> deleteDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse> deleteInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from a Billing Plan in an ORG.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan or rate definition group doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse> deleteRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Duplicates a billing plan. This copies the billing plan and all of its rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse> duplicateBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDuplicateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Duplicates a default billing plan. This copies the billing plan, all of its rate definitions,
     * and all of its rate definition groups and features.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse> duplicateDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDuplicateDefaultBillingPlanMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse> exportInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the active billing plan for the ORG or REGION. The active billing plan is a billing plan
     * whose start_time has passed and end_time has not passed. If multiple satisfy that requirement, the
     * newest one is considered active. If no plan is active, it indicates the ORG is using REGION defaults,
     * or that the REGION has not been set up for billing yet.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: There isn't an active billing plan.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse> getActiveBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActiveBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified billing plan.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse> getBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the billing plan history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse> getBillingPlanHistory(
        com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPlanHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse> getInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the specified rate definition.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse> getRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists billing plans.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse> listBillingPlans(
        com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBillingPlansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists invoices.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse> listInvoices(
        com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse> listRateDefinitions(
        com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an inactive billing plan. A billing plan is inactive if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified billing plan doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse> updateBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an inactive default billing plan for the REGION. A billing plan is inactive
     * if it hasn't started.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse> updateDefaultBillingPlan(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultBillingPlanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a default rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse> updateDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the specified invoice.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified invoice doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse> updateInvoice(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInvoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
     *   - The billing plan must be inactive.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.FailedPrecondition: The billing plan is active.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse> updateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COMMIT_BILLING_PLAN = 0;
  private static final int METHODID_COMMIT_DEFAULT_BILLING_PLAN = 1;
  private static final int METHODID_CREATE_BILLING_PLAN = 2;
  private static final int METHODID_CREATE_DEFAULT_BILLING_PLAN = 3;
  private static final int METHODID_CREATE_DEFAULT_RATE_DEFINITION = 4;
  private static final int METHODID_CREATE_INVOICE = 5;
  private static final int METHODID_CREATE_RATE_DEFINITION = 6;
  private static final int METHODID_DELETE_BILLING_PLAN = 7;
  private static final int METHODID_DELETE_DEFAULT_BILLING_PLAN = 8;
  private static final int METHODID_DELETE_DEFAULT_RATE_DEFINITION = 9;
  private static final int METHODID_DELETE_INVOICE = 10;
  private static final int METHODID_DELETE_RATE_DEFINITION = 11;
  private static final int METHODID_DUPLICATE_BILLING_PLAN = 12;
  private static final int METHODID_DUPLICATE_DEFAULT_BILLING_PLAN = 13;
  private static final int METHODID_EXPORT_INVOICE = 14;
  private static final int METHODID_GET_ACTIVE_BILLING_PLAN = 15;
  private static final int METHODID_GET_BILLING_PLAN = 16;
  private static final int METHODID_GET_BILLING_PLAN_HISTORY = 17;
  private static final int METHODID_GET_INVOICE = 18;
  private static final int METHODID_GET_RATE_DEFINITION = 19;
  private static final int METHODID_LIST_BILLING_PLANS = 20;
  private static final int METHODID_LIST_INVOICES = 21;
  private static final int METHODID_LIST_RATE_DEFINITIONS = 22;
  private static final int METHODID_UPDATE_BILLING_PLAN = 23;
  private static final int METHODID_UPDATE_DEFAULT_BILLING_PLAN = 24;
  private static final int METHODID_UPDATE_DEFAULT_RATE_DEFINITION = 25;
  private static final int METHODID_UPDATE_INVOICE = 26;
  private static final int METHODID_UPDATE_RATE_DEFINITION = 27;

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
        case METHODID_COMMIT_BILLING_PLAN:
          serviceImpl.commitBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse>) responseObserver);
          break;
        case METHODID_COMMIT_DEFAULT_BILLING_PLAN:
          serviceImpl.commitDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_BILLING_PLAN:
          serviceImpl.createBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEFAULT_BILLING_PLAN:
          serviceImpl.createDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_CREATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.createDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_CREATE_INVOICE:
          serviceImpl.createInvoice((com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse>) responseObserver);
          break;
        case METHODID_CREATE_RATE_DEFINITION:
          serviceImpl.createRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_BILLING_PLAN:
          serviceImpl.deleteBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEFAULT_BILLING_PLAN:
          serviceImpl.deleteDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEFAULT_RATE_DEFINITION:
          serviceImpl.deleteDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_INVOICE:
          serviceImpl.deleteInvoice((com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse>) responseObserver);
          break;
        case METHODID_DELETE_RATE_DEFINITION:
          serviceImpl.deleteRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DUPLICATE_BILLING_PLAN:
          serviceImpl.duplicateBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_DUPLICATE_DEFAULT_BILLING_PLAN:
          serviceImpl.duplicateDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_EXPORT_INVOICE:
          serviceImpl.exportInvoice((com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_BILLING_PLAN:
          serviceImpl.getActiveBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_PLAN:
          serviceImpl.getBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse>) responseObserver);
          break;
        case METHODID_GET_BILLING_PLAN_HISTORY:
          serviceImpl.getBillingPlanHistory((com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICE:
          serviceImpl.getInvoice((com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_DEFINITION:
          serviceImpl.getRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_LIST_BILLING_PLANS:
          serviceImpl.listBillingPlans((com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>) responseObserver);
          break;
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>) responseObserver);
          break;
        case METHODID_LIST_RATE_DEFINITIONS:
          serviceImpl.listRateDefinitions((com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BILLING_PLAN:
          serviceImpl.updateBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateBillingPlanResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_BILLING_PLAN:
          serviceImpl.updateDefaultBillingPlan((com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultBillingPlanResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.updateDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_INVOICE:
          serviceImpl.updateInvoice((com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RATE_DEFINITION:
          serviceImpl.updateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse>) responseObserver);
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
          getCommitBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CommitBillingPlanResponse>(
                service, METHODID_COMMIT_BILLING_PLAN)))
        .addMethod(
          getCommitDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CommitDefaultBillingPlanResponse>(
                service, METHODID_COMMIT_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getCreateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateBillingPlanResponse>(
                service, METHODID_CREATE_BILLING_PLAN)))
        .addMethod(
          getCreateDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultBillingPlanResponse>(
                service, METHODID_CREATE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getCreateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateDefaultRateDefinitionResponse>(
                service, METHODID_CREATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getCreateInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateInvoiceResponse>(
                service, METHODID_CREATE_INVOICE)))
        .addMethod(
          getCreateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionResponse>(
                service, METHODID_CREATE_RATE_DEFINITION)))
        .addMethod(
          getDeleteBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteBillingPlanResponse>(
                service, METHODID_DELETE_BILLING_PLAN)))
        .addMethod(
          getDeleteDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultBillingPlanResponse>(
                service, METHODID_DELETE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getDeleteDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteDefaultRateDefinitionResponse>(
                service, METHODID_DELETE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getDeleteInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteInvoiceResponse>(
                service, METHODID_DELETE_INVOICE)))
        .addMethod(
          getDeleteRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DeleteRateDefinitionResponse>(
                service, METHODID_DELETE_RATE_DEFINITION)))
        .addMethod(
          getDuplicateBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DuplicateBillingPlanResponse>(
                service, METHODID_DUPLICATE_BILLING_PLAN)))
        .addMethod(
          getDuplicateDefaultBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.DuplicateDefaultBillingPlanResponse>(
                service, METHODID_DUPLICATE_DEFAULT_BILLING_PLAN)))
        .addMethod(
          getExportInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ExportInvoiceResponse>(
                service, METHODID_EXPORT_INVOICE)))
        .addMethod(
          getGetActiveBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetActiveBillingPlanResponse>(
                service, METHODID_GET_ACTIVE_BILLING_PLAN)))
        .addMethod(
          getGetBillingPlanMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanResponse>(
                service, METHODID_GET_BILLING_PLAN)))
        .addMethod(
          getGetBillingPlanHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse>(
                service, METHODID_GET_BILLING_PLAN_HISTORY)))
        .addMethod(
          getGetInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetInvoiceResponse>(
                service, METHODID_GET_INVOICE)))
        .addMethod(
          getGetRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.GetRateDefinitionResponse>(
                service, METHODID_GET_RATE_DEFINITION)))
        .addMethod(
          getListBillingPlansMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ListBillingPlansResponse>(
                service, METHODID_LIST_BILLING_PLANS)))
        .addMethod(
          getListInvoicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ListInvoicesResponse>(
                service, METHODID_LIST_INVOICES)))
        .addMethod(
          getListRateDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.ListRateDefinitionsResponse>(
                service, METHODID_LIST_RATE_DEFINITIONS)))
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
          getUpdateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateDefaultRateDefinitionResponse>(
                service, METHODID_UPDATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getUpdateInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateInvoiceResponse>(
                service, METHODID_UPDATE_INVOICE)))
        .addMethod(
          getUpdateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha1.UpdateRateDefinitionResponse>(
                service, METHODID_UPDATE_RATE_DEFINITION)))
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
              .addMethod(getCommitBillingPlanMethod())
              .addMethod(getCommitDefaultBillingPlanMethod())
              .addMethod(getCreateBillingPlanMethod())
              .addMethod(getCreateDefaultBillingPlanMethod())
              .addMethod(getCreateDefaultRateDefinitionMethod())
              .addMethod(getCreateInvoiceMethod())
              .addMethod(getCreateRateDefinitionMethod())
              .addMethod(getDeleteBillingPlanMethod())
              .addMethod(getDeleteDefaultBillingPlanMethod())
              .addMethod(getDeleteDefaultRateDefinitionMethod())
              .addMethod(getDeleteInvoiceMethod())
              .addMethod(getDeleteRateDefinitionMethod())
              .addMethod(getDuplicateBillingPlanMethod())
              .addMethod(getDuplicateDefaultBillingPlanMethod())
              .addMethod(getExportInvoiceMethod())
              .addMethod(getGetActiveBillingPlanMethod())
              .addMethod(getGetBillingPlanMethod())
              .addMethod(getGetBillingPlanHistoryMethod())
              .addMethod(getGetInvoiceMethod())
              .addMethod(getGetRateDefinitionMethod())
              .addMethod(getListBillingPlansMethod())
              .addMethod(getListInvoicesMethod())
              .addMethod(getListRateDefinitionsMethod())
              .addMethod(getUpdateBillingPlanMethod())
              .addMethod(getUpdateDefaultBillingPlanMethod())
              .addMethod(getUpdateDefaultRateDefinitionMethod())
              .addMethod(getUpdateInvoiceMethod())
              .addMethod(getUpdateRateDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
