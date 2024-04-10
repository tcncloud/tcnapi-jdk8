package com.tcn.cloud.api.services.billing.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/billing/v1alpha2/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingServiceGrpc {

  private BillingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.billing.v1alpha2.BillingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> getCreateDefaultRateDefinitionMethod;
    if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateDefaultRateDefinitionMethod = BillingServiceGrpc.getCreateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateDefaultRateDefinitionMethod = getCreateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getCreateDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> getCreateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> getCreateRateDefinitionMethod;
    if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getCreateRateDefinitionMethod = BillingServiceGrpc.getCreateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getCreateRateDefinitionMethod = getCreateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("CreateRateDefinition"))
              .build();
        }
      }
    }
    return getCreateRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> getDeleteDefaultRateDefinitionMethod;
    if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteDefaultRateDefinitionMethod = BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteDefaultRateDefinitionMethod = getDeleteDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> getDeleteRateDefinitionMethod;
    if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getDeleteRateDefinitionMethod = BillingServiceGrpc.getDeleteRateDefinitionMethod) == null) {
          BillingServiceGrpc.getDeleteRateDefinitionMethod = getDeleteRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("DeleteRateDefinition"))
              .build();
        }
      }
    }
    return getDeleteRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> getExportInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportInvoice",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> getExportInvoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> getExportInvoiceMethod;
    if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getExportInvoiceMethod = BillingServiceGrpc.getExportInvoiceMethod) == null) {
          BillingServiceGrpc.getExportInvoiceMethod = getExportInvoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest, com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ExportInvoice"))
              .build();
        }
      }
    }
    return getExportInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> getGetRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> getGetRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> getGetRateDefinitionMethod;
    if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetRateDefinitionMethod = BillingServiceGrpc.getGetRateDefinitionMethod) == null) {
          BillingServiceGrpc.getGetRateDefinitionMethod = getGetRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetRateDefinition"))
              .build();
        }
      }
    }
    return getGetRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> getGetRateHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRateHistory",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> getGetRateHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest, com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> getGetRateHistoryMethod;
    if ((getGetRateHistoryMethod = BillingServiceGrpc.getGetRateHistoryMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getGetRateHistoryMethod = BillingServiceGrpc.getGetRateHistoryMethod) == null) {
          BillingServiceGrpc.getGetRateHistoryMethod = getGetRateHistoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest, com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRateHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("GetRateHistory"))
              .build();
        }
      }
    }
    return getGetRateHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> getListActiveRateDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActiveRateDefinitions",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> getListActiveRateDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> getListActiveRateDefinitionsMethod;
    if ((getListActiveRateDefinitionsMethod = BillingServiceGrpc.getListActiveRateDefinitionsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListActiveRateDefinitionsMethod = BillingServiceGrpc.getListActiveRateDefinitionsMethod) == null) {
          BillingServiceGrpc.getListActiveRateDefinitionsMethod = getListActiveRateDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActiveRateDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListActiveRateDefinitions"))
              .build();
        }
      }
    }
    return getListActiveRateDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> getListRateDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRateDefinitions",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> getListRateDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> getListRateDefinitionsMethod;
    if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getListRateDefinitionsMethod = BillingServiceGrpc.getListRateDefinitionsMethod) == null) {
          BillingServiceGrpc.getListRateDefinitionsMethod = getListRateDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest, com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRateDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("ListRateDefinitions"))
              .build();
        }
      }
    }
    return getListRateDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDefaultRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> getUpdateDefaultRateDefinitionMethod;
    if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateDefaultRateDefinitionMethod = BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateDefaultRateDefinitionMethod = getUpdateDefaultRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDefaultRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BillingServiceMethodDescriptorSupplier("UpdateDefaultRateDefinition"))
              .build();
        }
      }
    }
    return getUpdateDefaultRateDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRateDefinition",
      requestType = com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest.class,
      responseType = com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest,
      com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> getUpdateRateDefinitionMethod;
    if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
      synchronized (BillingServiceGrpc.class) {
        if ((getUpdateRateDefinitionMethod = BillingServiceGrpc.getUpdateRateDefinitionMethod) == null) {
          BillingServiceGrpc.getUpdateRateDefinitionMethod = getUpdateRateDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest, com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRateDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse.getDefaultInstance()))
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
     * Creates a rate definition for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a rate definition for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRateDefinitionMethod(), responseObserver);
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
    default void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportInvoiceMethod(), responseObserver);
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
    default void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the rate history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void getRateHistory(com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRateHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists active rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    default void listActiveRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActiveRateDefinitionsMethod(), responseObserver);
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
    default void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRateDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a default rate definition.
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
    default void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDefaultRateDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
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
    default void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> responseObserver) {
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
     * Creates a rate definition for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a rate definition for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a rate definition from an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request, responseObserver);
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
    public void exportInvoice(com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request, responseObserver);
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
    public void getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the rate history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void getRateHistory(com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRateHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists active rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public void listActiveRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListActiveRateDefinitionsMethod(), getCallOptions()), request, responseObserver);
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
    public void listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a default rate definition.
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
    public void updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a rate definition.
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
    public void updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> responseObserver) {
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
     * Creates a rate definition for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse createDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a rate definition for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse createRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse deleteDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse deleteRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRateDefinitionMethod(), getCallOptions(), request);
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
    public com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse exportInvoice(com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportInvoiceMethod(), getCallOptions(), request);
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
    public com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse getRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the rate history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse getRateHistory(com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRateHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists active rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse listActiveRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListActiveRateDefinitionsMethod(), getCallOptions(), request);
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
    public com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse listRateDefinitions(com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRateDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a default rate definition.
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
    public com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse updateDefaultRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDefaultRateDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
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
    public com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse updateRateDefinition(com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest request) {
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
     * Creates a rate definition for the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse> createDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a rate definition for an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.AlreadyExists: A rate definition with the same feature id already exists.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse> createRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from the REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     *   TCN_BILLING_ADMIN
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse> deleteDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a rate definition from an ORG.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.NotFound: The specified rate definition doesn't exist.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse> deleteRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRateDefinitionMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse> exportInvoice(
        com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportInvoiceMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse> getRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the rate history for the ORG or REGION.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse> getRateHistory(
        com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRateHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists active rate definitions.
     * Required permissions:
     *   CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Unavailable: The operation is currently unavailable.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse> listActiveRateDefinitions(
        com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListActiveRateDefinitionsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse> listRateDefinitions(
        com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRateDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a default rate definition.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse> updateDefaultRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDefaultRateDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a rate definition.
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse> updateRateDefinition(
        com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRateDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEFAULT_RATE_DEFINITION = 0;
  private static final int METHODID_CREATE_RATE_DEFINITION = 1;
  private static final int METHODID_DELETE_DEFAULT_RATE_DEFINITION = 2;
  private static final int METHODID_DELETE_RATE_DEFINITION = 3;
  private static final int METHODID_EXPORT_INVOICE = 4;
  private static final int METHODID_GET_RATE_DEFINITION = 5;
  private static final int METHODID_GET_RATE_HISTORY = 6;
  private static final int METHODID_LIST_ACTIVE_RATE_DEFINITIONS = 7;
  private static final int METHODID_LIST_RATE_DEFINITIONS = 8;
  private static final int METHODID_UPDATE_DEFAULT_RATE_DEFINITION = 9;
  private static final int METHODID_UPDATE_RATE_DEFINITION = 10;

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
        case METHODID_CREATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.createDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_CREATE_RATE_DEFINITION:
          serviceImpl.createRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_DEFAULT_RATE_DEFINITION:
          serviceImpl.deleteDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_RATE_DEFINITION:
          serviceImpl.deleteRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_EXPORT_INVOICE:
          serviceImpl.exportInvoice((com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_DEFINITION:
          serviceImpl.getRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_RATE_HISTORY:
          serviceImpl.getRateHistory((com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_RATE_DEFINITIONS:
          serviceImpl.listActiveRateDefinitions((com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse>) responseObserver);
          break;
        case METHODID_LIST_RATE_DEFINITIONS:
          serviceImpl.listRateDefinitions((com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DEFAULT_RATE_DEFINITION:
          serviceImpl.updateDefaultRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RATE_DEFINITION:
          serviceImpl.updateRateDefinition((com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse>) responseObserver);
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
          getCreateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.CreateDefaultRateDefinitionResponse>(
                service, METHODID_CREATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getCreateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.CreateRateDefinitionResponse>(
                service, METHODID_CREATE_RATE_DEFINITION)))
        .addMethod(
          getDeleteDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.DeleteDefaultRateDefinitionResponse>(
                service, METHODID_DELETE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getDeleteRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.DeleteRateDefinitionResponse>(
                service, METHODID_DELETE_RATE_DEFINITION)))
        .addMethod(
          getExportInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.ExportInvoiceResponse>(
                service, METHODID_EXPORT_INVOICE)))
        .addMethod(
          getGetRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.GetRateDefinitionResponse>(
                service, METHODID_GET_RATE_DEFINITION)))
        .addMethod(
          getGetRateHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.GetRateHistoryResponse>(
                service, METHODID_GET_RATE_HISTORY)))
        .addMethod(
          getListActiveRateDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.ListActiveRateDefinitionsResponse>(
                service, METHODID_LIST_ACTIVE_RATE_DEFINITIONS)))
        .addMethod(
          getListRateDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.ListRateDefinitionsResponse>(
                service, METHODID_LIST_RATE_DEFINITIONS)))
        .addMethod(
          getUpdateDefaultRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.UpdateDefaultRateDefinitionResponse>(
                service, METHODID_UPDATE_DEFAULT_RATE_DEFINITION)))
        .addMethod(
          getUpdateRateDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionRequest,
              com.tcn.cloud.api.services.billing.v1alpha2.UpdateRateDefinitionResponse>(
                service, METHODID_UPDATE_RATE_DEFINITION)))
        .build();
  }

  private static abstract class BillingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha2.ServiceProto.getDescriptor();
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
              .addMethod(getCreateDefaultRateDefinitionMethod())
              .addMethod(getCreateRateDefinitionMethod())
              .addMethod(getDeleteDefaultRateDefinitionMethod())
              .addMethod(getDeleteRateDefinitionMethod())
              .addMethod(getExportInvoiceMethod())
              .addMethod(getGetRateDefinitionMethod())
              .addMethod(getGetRateHistoryMethod())
              .addMethod(getListActiveRateDefinitionsMethod())
              .addMethod(getListRateDefinitionsMethod())
              .addMethod(getUpdateDefaultRateDefinitionMethod())
              .addMethod(getUpdateRateDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
