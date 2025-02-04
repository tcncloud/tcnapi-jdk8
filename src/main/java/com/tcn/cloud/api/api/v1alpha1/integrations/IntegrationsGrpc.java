package com.tcn.cloud.api.api.v1alpha1.integrations;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/integrations/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntegrationsGrpc {

  private IntegrationsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.integrations.Integrations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Process",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> getProcessMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq, com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> getProcessMethod;
    if ((getProcessMethod = IntegrationsGrpc.getProcessMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getProcessMethod = IntegrationsGrpc.getProcessMethod) == null) {
          IntegrationsGrpc.getProcessMethod = getProcessMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq, com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("Process"))
              .build();
        }
      }
    }
    return getProcessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> getGetIntegrationTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntegrationTransaction",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> getGetIntegrationTransactionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> getGetIntegrationTransactionMethod;
    if ((getGetIntegrationTransactionMethod = IntegrationsGrpc.getGetIntegrationTransactionMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationTransactionMethod = IntegrationsGrpc.getGetIntegrationTransactionMethod) == null) {
          IntegrationsGrpc.getGetIntegrationTransactionMethod = getGetIntegrationTransactionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntegrationTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetIntegrationTransaction"))
              .build();
        }
      }
    }
    return getGetIntegrationTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> getGetIntegrationTransactionReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntegrationTransactionReport",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> getGetIntegrationTransactionReportMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> getGetIntegrationTransactionReportMethod;
    if ((getGetIntegrationTransactionReportMethod = IntegrationsGrpc.getGetIntegrationTransactionReportMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationTransactionReportMethod = IntegrationsGrpc.getGetIntegrationTransactionReportMethod) == null) {
          IntegrationsGrpc.getGetIntegrationTransactionReportMethod = getGetIntegrationTransactionReportMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntegrationTransactionReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetIntegrationTransactionReport"))
              .build();
        }
      }
    }
    return getGetIntegrationTransactionReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> getGetIntegrationTransactionReportDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntegrationTransactionReportData",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> getGetIntegrationTransactionReportDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> getGetIntegrationTransactionReportDataMethod;
    if ((getGetIntegrationTransactionReportDataMethod = IntegrationsGrpc.getGetIntegrationTransactionReportDataMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationTransactionReportDataMethod = IntegrationsGrpc.getGetIntegrationTransactionReportDataMethod) == null) {
          IntegrationsGrpc.getGetIntegrationTransactionReportDataMethod = getGetIntegrationTransactionReportDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntegrationTransactionReportData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetIntegrationTransactionReportData"))
              .build();
        }
      }
    }
    return getGetIntegrationTransactionReportDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest,
      com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> getSearchPastTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPastTransactions",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest,
      com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> getSearchPastTransactionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest, com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> getSearchPastTransactionsMethod;
    if ((getSearchPastTransactionsMethod = IntegrationsGrpc.getSearchPastTransactionsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getSearchPastTransactionsMethod = IntegrationsGrpc.getSearchPastTransactionsMethod) == null) {
          IntegrationsGrpc.getSearchPastTransactionsMethod = getSearchPastTransactionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest, com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchPastTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("SearchPastTransactions"))
              .build();
        }
      }
    }
    return getSearchPastTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> getGetAggregatedMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAggregatedMetadata",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> getGetAggregatedMetadataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> getGetAggregatedMetadataMethod;
    if ((getGetAggregatedMetadataMethod = IntegrationsGrpc.getGetAggregatedMetadataMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetAggregatedMetadataMethod = IntegrationsGrpc.getGetAggregatedMetadataMethod) == null) {
          IntegrationsGrpc.getGetAggregatedMetadataMethod = getGetAggregatedMetadataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAggregatedMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetAggregatedMetadata"))
              .build();
        }
      }
    }
    return getGetAggregatedMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> getGetPortalLinksByDateRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalLinksByDateRange",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> getGetPortalLinksByDateRangeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> getGetPortalLinksByDateRangeMethod;
    if ((getGetPortalLinksByDateRangeMethod = IntegrationsGrpc.getGetPortalLinksByDateRangeMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetPortalLinksByDateRangeMethod = IntegrationsGrpc.getGetPortalLinksByDateRangeMethod) == null) {
          IntegrationsGrpc.getGetPortalLinksByDateRangeMethod = getGetPortalLinksByDateRangeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalLinksByDateRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetPortalLinksByDateRange"))
              .build();
        }
      }
    }
    return getGetPortalLinksByDateRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreateIntegrationConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIntegrationConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreateIntegrationConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreateIntegrationConfigMethod;
    if ((getCreateIntegrationConfigMethod = IntegrationsGrpc.getCreateIntegrationConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCreateIntegrationConfigMethod = IntegrationsGrpc.getCreateIntegrationConfigMethod) == null) {
          IntegrationsGrpc.getCreateIntegrationConfigMethod = getCreateIntegrationConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIntegrationConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("CreateIntegrationConfig"))
              .build();
        }
      }
    }
    return getCreateIntegrationConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> getGetIntegrationConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntegrationConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> getGetIntegrationConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> getGetIntegrationConfigMethod;
    if ((getGetIntegrationConfigMethod = IntegrationsGrpc.getGetIntegrationConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationConfigMethod = IntegrationsGrpc.getGetIntegrationConfigMethod) == null) {
          IntegrationsGrpc.getGetIntegrationConfigMethod = getGetIntegrationConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIntegrationConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetIntegrationConfig"))
              .build();
        }
      }
    }
    return getGetIntegrationConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdateIntegrationConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIntegrationConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdateIntegrationConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdateIntegrationConfigMethod;
    if ((getUpdateIntegrationConfigMethod = IntegrationsGrpc.getUpdateIntegrationConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getUpdateIntegrationConfigMethod = IntegrationsGrpc.getUpdateIntegrationConfigMethod) == null) {
          IntegrationsGrpc.getUpdateIntegrationConfigMethod = getUpdateIntegrationConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateIntegrationConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("UpdateIntegrationConfig"))
              .build();
        }
      }
    }
    return getUpdateIntegrationConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeleteIntegrationConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteIntegrationConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeleteIntegrationConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeleteIntegrationConfigMethod;
    if ((getDeleteIntegrationConfigMethod = IntegrationsGrpc.getDeleteIntegrationConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getDeleteIntegrationConfigMethod = IntegrationsGrpc.getDeleteIntegrationConfigMethod) == null) {
          IntegrationsGrpc.getDeleteIntegrationConfigMethod = getDeleteIntegrationConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteIntegrationConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("DeleteIntegrationConfig"))
              .build();
        }
      }
    }
    return getDeleteIntegrationConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.Empty,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntegrations",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.Empty,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.Empty, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsMethod;
    if ((getListIntegrationsMethod = IntegrationsGrpc.getListIntegrationsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListIntegrationsMethod = IntegrationsGrpc.getListIntegrationsMethod) == null) {
          IntegrationsGrpc.getListIntegrationsMethod = getListIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.Empty, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListIntegrations"))
              .build();
        }
      }
    }
    return getListIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsForOrgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntegrationsForOrg",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsForOrgMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> getListIntegrationsForOrgMethod;
    if ((getListIntegrationsForOrgMethod = IntegrationsGrpc.getListIntegrationsForOrgMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListIntegrationsForOrgMethod = IntegrationsGrpc.getListIntegrationsForOrgMethod) == null) {
          IntegrationsGrpc.getListIntegrationsForOrgMethod = getListIntegrationsForOrgMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntegrationsForOrg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListIntegrationsForOrg"))
              .build();
        }
      }
    }
    return getListIntegrationsForOrgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> getListIntegrationConfigNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntegrationConfigNames",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> getListIntegrationConfigNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> getListIntegrationConfigNamesMethod;
    if ((getListIntegrationConfigNamesMethod = IntegrationsGrpc.getListIntegrationConfigNamesMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListIntegrationConfigNamesMethod = IntegrationsGrpc.getListIntegrationConfigNamesMethod) == null) {
          IntegrationsGrpc.getListIntegrationConfigNamesMethod = getListIntegrationConfigNamesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntegrationConfigNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListIntegrationConfigNames"))
              .build();
        }
      }
    }
    return getListIntegrationConfigNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListJourneyConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJourneyConfigs",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListJourneyConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListJourneyConfigsMethod;
    if ((getListJourneyConfigsMethod = IntegrationsGrpc.getListJourneyConfigsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListJourneyConfigsMethod = IntegrationsGrpc.getListJourneyConfigsMethod) == null) {
          IntegrationsGrpc.getListJourneyConfigsMethod = getListJourneyConfigsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJourneyConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListJourneyConfigs"))
              .build();
        }
      }
    }
    return getListJourneyConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListNonJourneyConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNonJourneyConfigs",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListNonJourneyConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> getListNonJourneyConfigsMethod;
    if ((getListNonJourneyConfigsMethod = IntegrationsGrpc.getListNonJourneyConfigsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListNonJourneyConfigsMethod = IntegrationsGrpc.getListNonJourneyConfigsMethod) == null) {
          IntegrationsGrpc.getListNonJourneyConfigsMethod = getListNonJourneyConfigsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNonJourneyConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListNonJourneyConfigs"))
              .build();
        }
      }
    }
    return getListNonJourneyConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreatePortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreatePortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getCreatePortalConfigMethod;
    if ((getCreatePortalConfigMethod = IntegrationsGrpc.getCreatePortalConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCreatePortalConfigMethod = IntegrationsGrpc.getCreatePortalConfigMethod) == null) {
          IntegrationsGrpc.getCreatePortalConfigMethod = getCreatePortalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("CreatePortalConfig"))
              .build();
        }
      }
    }
    return getCreatePortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> getListPortalConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPortalConfigs",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> getListPortalConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> getListPortalConfigsMethod;
    if ((getListPortalConfigsMethod = IntegrationsGrpc.getListPortalConfigsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListPortalConfigsMethod = IntegrationsGrpc.getListPortalConfigsMethod) == null) {
          IntegrationsGrpc.getListPortalConfigsMethod = getListPortalConfigsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPortalConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListPortalConfigs"))
              .build();
        }
      }
    }
    return getListPortalConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalConfigMethod;
    if ((getUpdatePortalConfigMethod = IntegrationsGrpc.getUpdatePortalConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getUpdatePortalConfigMethod = IntegrationsGrpc.getUpdatePortalConfigMethod) == null) {
          IntegrationsGrpc.getUpdatePortalConfigMethod = getUpdatePortalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("UpdatePortalConfig"))
              .build();
        }
      }
    }
    return getUpdatePortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> getGetPortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> getGetPortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> getGetPortalConfigMethod;
    if ((getGetPortalConfigMethod = IntegrationsGrpc.getGetPortalConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetPortalConfigMethod = IntegrationsGrpc.getGetPortalConfigMethod) == null) {
          IntegrationsGrpc.getGetPortalConfigMethod = getGetPortalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetPortalConfig"))
              .build();
        }
      }
    }
    return getGetPortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeletePortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeletePortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getDeletePortalConfigMethod;
    if ((getDeletePortalConfigMethod = IntegrationsGrpc.getDeletePortalConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getDeletePortalConfigMethod = IntegrationsGrpc.getDeletePortalConfigMethod) == null) {
          IntegrationsGrpc.getDeletePortalConfigMethod = getDeletePortalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("DeletePortalConfig"))
              .build();
        }
      }
    }
    return getDeletePortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePortalLogo",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalLogoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getUpdatePortalLogoMethod;
    if ((getUpdatePortalLogoMethod = IntegrationsGrpc.getUpdatePortalLogoMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getUpdatePortalLogoMethod = IntegrationsGrpc.getUpdatePortalLogoMethod) == null) {
          IntegrationsGrpc.getUpdatePortalLogoMethod = getUpdatePortalLogoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePortalLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("UpdatePortalLogo"))
              .build();
        }
      }
    }
    return getUpdatePortalLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Logo> getGetPortalLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalLogo",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Logo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Logo> getGetPortalLogoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.Logo> getGetPortalLogoMethod;
    if ((getGetPortalLogoMethod = IntegrationsGrpc.getGetPortalLogoMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetPortalLogoMethod = IntegrationsGrpc.getGetPortalLogoMethod) == null) {
          IntegrationsGrpc.getGetPortalLogoMethod = getGetPortalLogoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.Logo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Logo.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetPortalLogo"))
              .build();
        }
      }
    }
    return getGetPortalLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> getCreatePaymentPortalLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePaymentPortalLinks",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> getCreatePaymentPortalLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> getCreatePaymentPortalLinksMethod;
    if ((getCreatePaymentPortalLinksMethod = IntegrationsGrpc.getCreatePaymentPortalLinksMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCreatePaymentPortalLinksMethod = IntegrationsGrpc.getCreatePaymentPortalLinksMethod) == null) {
          IntegrationsGrpc.getCreatePaymentPortalLinksMethod = getCreatePaymentPortalLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePaymentPortalLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("CreatePaymentPortalLinks"))
              .build();
        }
      }
    }
    return getCreatePaymentPortalLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> getSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Summary",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> getSummaryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq, com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> getSummaryMethod;
    if ((getSummaryMethod = IntegrationsGrpc.getSummaryMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getSummaryMethod = IntegrationsGrpc.getSummaryMethod) == null) {
          IntegrationsGrpc.getSummaryMethod = getSummaryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq, com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Summary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("Summary"))
              .build();
        }
      }
    }
    return getSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> getListIntegrationTemplatesByConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIntegrationTemplatesByConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> getListIntegrationTemplatesByConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> getListIntegrationTemplatesByConfigMethod;
    if ((getListIntegrationTemplatesByConfigMethod = IntegrationsGrpc.getListIntegrationTemplatesByConfigMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListIntegrationTemplatesByConfigMethod = IntegrationsGrpc.getListIntegrationTemplatesByConfigMethod) == null) {
          IntegrationsGrpc.getListIntegrationTemplatesByConfigMethod = getListIntegrationTemplatesByConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIntegrationTemplatesByConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ListIntegrationTemplatesByConfig"))
              .build();
        }
      }
    }
    return getListIntegrationTemplatesByConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> getCallEpicPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallEpicPatient",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> getCallEpicPatientMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq, com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> getCallEpicPatientMethod;
    if ((getCallEpicPatientMethod = IntegrationsGrpc.getCallEpicPatientMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCallEpicPatientMethod = IntegrationsGrpc.getCallEpicPatientMethod) == null) {
          IntegrationsGrpc.getCallEpicPatientMethod = getCallEpicPatientMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq, com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallEpicPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("CallEpicPatient"))
              .build();
        }
      }
    }
    return getCallEpicPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getHangUpEpicPatientCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HangUpEpicPatientCall",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getHangUpEpicPatientCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty> getHangUpEpicPatientCallMethod;
    if ((getHangUpEpicPatientCallMethod = IntegrationsGrpc.getHangUpEpicPatientCallMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getHangUpEpicPatientCallMethod = IntegrationsGrpc.getHangUpEpicPatientCallMethod) == null) {
          IntegrationsGrpc.getHangUpEpicPatientCallMethod = getHangUpEpicPatientCallMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq, com.tcn.cloud.api.api.v1alpha1.integrations.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HangUpEpicPatientCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("HangUpEpicPatientCall"))
              .build();
        }
      }
    }
    return getHangUpEpicPatientCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> getGenerateEpicKeyPairsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateEpicKeyPairs",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> getGenerateEpicKeyPairsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq, com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> getGenerateEpicKeyPairsMethod;
    if ((getGenerateEpicKeyPairsMethod = IntegrationsGrpc.getGenerateEpicKeyPairsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGenerateEpicKeyPairsMethod = IntegrationsGrpc.getGenerateEpicKeyPairsMethod) == null) {
          IntegrationsGrpc.getGenerateEpicKeyPairsMethod = getGenerateEpicKeyPairsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq, com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateEpicKeyPairs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GenerateEpicKeyPairs"))
              .build();
        }
      }
    }
    return getGenerateEpicKeyPairsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> getPopulateIntegrationLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PopulateIntegrationLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> getPopulateIntegrationLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> getPopulateIntegrationLinkMethod;
    if ((getPopulateIntegrationLinkMethod = IntegrationsGrpc.getPopulateIntegrationLinkMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getPopulateIntegrationLinkMethod = IntegrationsGrpc.getPopulateIntegrationLinkMethod) == null) {
          IntegrationsGrpc.getPopulateIntegrationLinkMethod = getPopulateIntegrationLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PopulateIntegrationLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("PopulateIntegrationLink"))
              .build();
        }
      }
    }
    return getPopulateIntegrationLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> getProcessWorkflowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessWorkflow",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> getProcessWorkflowMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq, com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> getProcessWorkflowMethod;
    if ((getProcessWorkflowMethod = IntegrationsGrpc.getProcessWorkflowMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getProcessWorkflowMethod = IntegrationsGrpc.getProcessWorkflowMethod) == null) {
          IntegrationsGrpc.getProcessWorkflowMethod = getProcessWorkflowMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq, com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessWorkflow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("ProcessWorkflow"))
              .build();
        }
      }
    }
    return getProcessWorkflowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> getInsertPrivateFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPrivateField",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> getInsertPrivateFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq, com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> getInsertPrivateFieldMethod;
    if ((getInsertPrivateFieldMethod = IntegrationsGrpc.getInsertPrivateFieldMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getInsertPrivateFieldMethod = IntegrationsGrpc.getInsertPrivateFieldMethod) == null) {
          IntegrationsGrpc.getInsertPrivateFieldMethod = getInsertPrivateFieldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq, com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPrivateField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("InsertPrivateField"))
              .build();
        }
      }
    }
    return getInsertPrivateFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> getCalculateFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateFees",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> getCalculateFeesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq, com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> getCalculateFeesMethod;
    if ((getCalculateFeesMethod = IntegrationsGrpc.getCalculateFeesMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCalculateFeesMethod = IntegrationsGrpc.getCalculateFeesMethod) == null) {
          IntegrationsGrpc.getCalculateFeesMethod = getCalculateFeesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq, com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("CalculateFees"))
              .build();
        }
      }
    }
    return getCalculateFeesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsStub>() {
        @java.lang.Override
        public IntegrationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsStub(channel, callOptions);
        }
      };
    return IntegrationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsBlockingStub>() {
        @java.lang.Override
        public IntegrationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsBlockingStub(channel, callOptions);
        }
      };
    return IntegrationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsFutureStub>() {
        @java.lang.Override
        public IntegrationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsFutureStub(channel, callOptions);
        }
      };
    return IntegrationsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    default void process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    default void getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationTransactionMethod(), responseObserver);
    }

    /**
     */
    default void getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationTransactionReportMethod(), responseObserver);
    }

    /**
     */
    default void getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationTransactionReportDataMethod(), responseObserver);
    }

    /**
     */
    default void searchPastTransactions(com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchPastTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    default void getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAggregatedMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    default void getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalLinksByDateRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    default void createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    default void getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    default void updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    default void deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    default void listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void listIntegrationsForOrg(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntegrationsForOrgMethod(), responseObserver);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    default void listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntegrationConfigNamesMethod(), responseObserver);
    }

    /**
     */
    default void listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListJourneyConfigsMethod(), responseObserver);
    }

    /**
     */
    default void listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNonJourneyConfigsMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO all services looking for payment portal configs should be using the
     * PortalManagerApi service in this same packages
     * CLUDG for the payment portal configs
     * </pre>
     */
    default void createPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    default void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortalConfigsMethod(), responseObserver);
    }

    /**
     */
    default void updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    default void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    default void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    default void updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortalLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    default void getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate. use CreatePortalLinks on the PortalManagerApi
     * pulls the payment_link_config
     * creates an integration config for each set of data, and generates a url for the specific user
     * </pre>
     */
    default void createPaymentPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePaymentPortalLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    default void summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    default void listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIntegrationTemplatesByConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    default void callEpicPatient(com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallEpicPatientMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    default void hangUpEpicPatientCall(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHangUpEpicPatientCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * GenerateEpicKeyPairs creates 2 key pairs, stores the private keys, and returns the public keys
     * </pre>
     */
    default void generateEpicKeyPairs(com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateEpicKeyPairsMethod(), responseObserver);
    }

    /**
     */
    default void populateIntegrationLink(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPopulateIntegrationLinkMethod(), responseObserver);
    }

    /**
     */
    default void processWorkflow(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessWorkflowMethod(), responseObserver);
    }

    /**
     */
    default void insertPrivateField(com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPrivateFieldMethod(), responseObserver);
    }

    /**
     */
    default void calculateFees(com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateFeesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Integrations.
   */
  public static abstract class IntegrationsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntegrationsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Integrations.
   */
  public static final class IntegrationsStub
      extends io.grpc.stub.AbstractAsyncStub<IntegrationsStub> {
    private IntegrationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public void process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public void getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchPastTransactions(com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchPastTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public void getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAggregatedMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public void getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalLinksByDateRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public void createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public void getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public void updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public void deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public void listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listIntegrationsForOrg(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntegrationsForOrgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public void listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntegrationConfigNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListJourneyConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNonJourneyConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO all services looking for payment portal configs should be using the
     * PortalManagerApi service in this same packages
     * CLUDG for the payment portal configs
     * </pre>
     */
    public void createPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    public void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    public void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    public void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortalLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate. use CreatePortalLinks on the PortalManagerApi
     * pulls the payment_link_config
     * creates an integration config for each set of data, and generates a url for the specific user
     * </pre>
     */
    public void createPaymentPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePaymentPortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public void summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public void listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIntegrationTemplatesByConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public void callEpicPatient(com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallEpicPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public void hangUpEpicPatientCall(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHangUpEpicPatientCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GenerateEpicKeyPairs creates 2 key pairs, stores the private keys, and returns the public keys
     * </pre>
     */
    public void generateEpicKeyPairs(com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateEpicKeyPairsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void populateIntegrationLink(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPopulateIntegrationLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processWorkflow(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessWorkflowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPrivateField(com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPrivateFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateFees(com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateFeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Integrations.
   */
  public static final class IntegrationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntegrationsBlockingStub> {
    private IntegrationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionReportDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse searchPastTransactions(com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchPastTransactionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAggregatedMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalLinksByDateRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos listIntegrationsForOrg(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntegrationsForOrgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntegrationConfigNamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListJourneyConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNonJourneyConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO all services looking for payment portal configs should be using the
     * PortalManagerApi service in this same packages
     * CLUDG for the payment portal configs
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty createPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortalConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortalLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Logo getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO deprecate. use CreatePortalLinks on the PortalManagerApi
     * pulls the payment_link_config
     * creates an integration config for each set of data, and generates a url for the specific user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes createPaymentPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePaymentPortalLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIntegrationTemplatesByConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes callEpicPatient(com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallEpicPatientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty hangUpEpicPatientCall(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHangUpEpicPatientCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GenerateEpicKeyPairs creates 2 key pairs, stores the private keys, and returns the public keys
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes generateEpicKeyPairs(com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateEpicKeyPairsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes populateIntegrationLink(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPopulateIntegrationLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes processWorkflow(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessWorkflowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes insertPrivateField(com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPrivateFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes calculateFees(com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateFeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Integrations.
   */
  public static final class IntegrationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntegrationsFutureStub> {
    private IntegrationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> process(
        com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> getIntegrationTransaction(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> getIntegrationTransactionReport(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> getIntegrationTransactionReportData(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse> searchPastTransactions(
        com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchPastTransactionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> getAggregatedMetadata(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAggregatedMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> getPortalLinksByDateRange(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalLinksByDateRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> createIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> getIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updateIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> deleteIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> listIntegrations(
        com.tcn.cloud.api.api.v1alpha1.integrations.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> listIntegrationsForOrg(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntegrationsForOrgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> listIntegrationConfigNames(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntegrationConfigNamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> listJourneyConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListJourneyConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> listNonJourneyConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNonJourneyConfigsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO all services looking for payment portal configs should be using the
     * PortalManagerApi service in this same packages
     * CLUDG for the payment portal configs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> createPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> listPortalConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updatePortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> getPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> deletePortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updatePortalLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortalLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> getPortalLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO deprecate. use CreatePortalLinks on the PortalManagerApi
     * pulls the payment_link_config
     * creates an integration config for each set of data, and generates a url for the specific user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes> createPaymentPortalLinks(
        com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePaymentPortalLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> summary(
        com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> listIntegrationTemplatesByConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIntegrationTemplatesByConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes> callEpicPatient(
        com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallEpicPatientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CallEpicPatient initiates a call to the specified number from the agent using the click to call button within epic
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> hangUpEpicPatientCall(
        com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHangUpEpicPatientCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GenerateEpicKeyPairs creates 2 key pairs, stores the private keys, and returns the public keys
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes> generateEpicKeyPairs(
        com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateEpicKeyPairsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes> populateIntegrationLink(
        com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPopulateIntegrationLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes> processWorkflow(
        com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessWorkflowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes> insertPrivateField(
        com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPrivateFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes> calculateFees(
        com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS = 0;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION = 1;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION_REPORT = 2;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION_REPORT_DATA = 3;
  private static final int METHODID_SEARCH_PAST_TRANSACTIONS = 4;
  private static final int METHODID_GET_AGGREGATED_METADATA = 5;
  private static final int METHODID_GET_PORTAL_LINKS_BY_DATE_RANGE = 6;
  private static final int METHODID_CREATE_INTEGRATION_CONFIG = 7;
  private static final int METHODID_GET_INTEGRATION_CONFIG = 8;
  private static final int METHODID_UPDATE_INTEGRATION_CONFIG = 9;
  private static final int METHODID_DELETE_INTEGRATION_CONFIG = 10;
  private static final int METHODID_LIST_INTEGRATIONS = 11;
  private static final int METHODID_LIST_INTEGRATIONS_FOR_ORG = 12;
  private static final int METHODID_LIST_INTEGRATION_CONFIG_NAMES = 13;
  private static final int METHODID_LIST_JOURNEY_CONFIGS = 14;
  private static final int METHODID_LIST_NON_JOURNEY_CONFIGS = 15;
  private static final int METHODID_CREATE_PORTAL_CONFIG = 16;
  private static final int METHODID_LIST_PORTAL_CONFIGS = 17;
  private static final int METHODID_UPDATE_PORTAL_CONFIG = 18;
  private static final int METHODID_GET_PORTAL_CONFIG = 19;
  private static final int METHODID_DELETE_PORTAL_CONFIG = 20;
  private static final int METHODID_UPDATE_PORTAL_LOGO = 21;
  private static final int METHODID_GET_PORTAL_LOGO = 22;
  private static final int METHODID_CREATE_PAYMENT_PORTAL_LINKS = 23;
  private static final int METHODID_SUMMARY = 24;
  private static final int METHODID_LIST_INTEGRATION_TEMPLATES_BY_CONFIG = 25;
  private static final int METHODID_CALL_EPIC_PATIENT = 26;
  private static final int METHODID_HANG_UP_EPIC_PATIENT_CALL = 27;
  private static final int METHODID_GENERATE_EPIC_KEY_PAIRS = 28;
  private static final int METHODID_POPULATE_INTEGRATION_LINK = 29;
  private static final int METHODID_PROCESS_WORKFLOW = 30;
  private static final int METHODID_INSERT_PRIVATE_FIELD = 31;
  private static final int METHODID_CALCULATE_FEES = 32;

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
        case METHODID_PROCESS:
          serviceImpl.process((com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes>) responseObserver);
          break;
        case METHODID_GET_INTEGRATION_TRANSACTION:
          serviceImpl.getIntegrationTransaction((com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction>) responseObserver);
          break;
        case METHODID_GET_INTEGRATION_TRANSACTION_REPORT:
          serviceImpl.getIntegrationTransactionReport((com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes>) responseObserver);
          break;
        case METHODID_GET_INTEGRATION_TRANSACTION_REPORT_DATA:
          serviceImpl.getIntegrationTransactionReportData((com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes>) responseObserver);
          break;
        case METHODID_SEARCH_PAST_TRANSACTIONS:
          serviceImpl.searchPastTransactions((com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse>) responseObserver);
          break;
        case METHODID_GET_AGGREGATED_METADATA:
          serviceImpl.getAggregatedMetadata((com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes>) responseObserver);
          break;
        case METHODID_GET_PORTAL_LINKS_BY_DATE_RANGE:
          serviceImpl.getPortalLinksByDateRange((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes>) responseObserver);
          break;
        case METHODID_CREATE_INTEGRATION_CONFIG:
          serviceImpl.createIntegrationConfig((com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_GET_INTEGRATION_CONFIG:
          serviceImpl.getIntegrationConfig((com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig>) responseObserver);
          break;
        case METHODID_UPDATE_INTEGRATION_CONFIG:
          serviceImpl.updateIntegrationConfig((com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_DELETE_INTEGRATION_CONFIG:
          serviceImpl.deleteIntegrationConfig((com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_LIST_INTEGRATIONS:
          serviceImpl.listIntegrations((com.tcn.cloud.api.api.v1alpha1.integrations.Empty) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>) responseObserver);
          break;
        case METHODID_LIST_INTEGRATIONS_FOR_ORG:
          serviceImpl.listIntegrationsForOrg((com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>) responseObserver);
          break;
        case METHODID_LIST_INTEGRATION_CONFIG_NAMES:
          serviceImpl.listIntegrationConfigNames((com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes>) responseObserver);
          break;
        case METHODID_LIST_JOURNEY_CONFIGS:
          serviceImpl.listJourneyConfigs((com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>) responseObserver);
          break;
        case METHODID_LIST_NON_JOURNEY_CONFIGS:
          serviceImpl.listNonJourneyConfigs((com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>) responseObserver);
          break;
        case METHODID_CREATE_PORTAL_CONFIG:
          serviceImpl.createPortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_LIST_PORTAL_CONFIGS:
          serviceImpl.listPortalConfigs((com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs>) responseObserver);
          break;
        case METHODID_UPDATE_PORTAL_CONFIG:
          serviceImpl.updatePortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_GET_PORTAL_CONFIG:
          serviceImpl.getPortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL_CONFIG:
          serviceImpl.deletePortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PORTAL_LOGO:
          serviceImpl.updatePortalLogo((com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_GET_PORTAL_LOGO:
          serviceImpl.getPortalLogo((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Logo>) responseObserver);
          break;
        case METHODID_CREATE_PAYMENT_PORTAL_LINKS:
          serviceImpl.createPaymentPortalLinks((com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes>) responseObserver);
          break;
        case METHODID_SUMMARY:
          serviceImpl.summary((com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes>) responseObserver);
          break;
        case METHODID_LIST_INTEGRATION_TEMPLATES_BY_CONFIG:
          serviceImpl.listIntegrationTemplatesByConfig((com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes>) responseObserver);
          break;
        case METHODID_CALL_EPIC_PATIENT:
          serviceImpl.callEpicPatient((com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes>) responseObserver);
          break;
        case METHODID_HANG_UP_EPIC_PATIENT_CALL:
          serviceImpl.hangUpEpicPatientCall((com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty>) responseObserver);
          break;
        case METHODID_GENERATE_EPIC_KEY_PAIRS:
          serviceImpl.generateEpicKeyPairs((com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes>) responseObserver);
          break;
        case METHODID_POPULATE_INTEGRATION_LINK:
          serviceImpl.populateIntegrationLink((com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes>) responseObserver);
          break;
        case METHODID_PROCESS_WORKFLOW:
          serviceImpl.processWorkflow((com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes>) responseObserver);
          break;
        case METHODID_INSERT_PRIVATE_FIELD:
          serviceImpl.insertPrivateField((com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes>) responseObserver);
          break;
        case METHODID_CALCULATE_FEES:
          serviceImpl.calculateFees((com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes>) responseObserver);
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
          getProcessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes>(
                service, METHODID_PROCESS)))
        .addMethod(
          getGetIntegrationTransactionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction>(
                service, METHODID_GET_INTEGRATION_TRANSACTION)))
        .addMethod(
          getGetIntegrationTransactionReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes>(
                service, METHODID_GET_INTEGRATION_TRANSACTION_REPORT)))
        .addMethod(
          getGetIntegrationTransactionReportDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes>(
                service, METHODID_GET_INTEGRATION_TRANSACTION_REPORT_DATA)))
        .addMethod(
          getSearchPastTransactionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsRequest,
              com.tcn.cloud.api.api.v1alpha1.integrations.SearchPastTransactionsResponse>(
                service, METHODID_SEARCH_PAST_TRANSACTIONS)))
        .addMethod(
          getGetAggregatedMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes>(
                service, METHODID_GET_AGGREGATED_METADATA)))
        .addMethod(
          getGetPortalLinksByDateRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes>(
                service, METHODID_GET_PORTAL_LINKS_BY_DATE_RANGE)))
        .addMethod(
          getCreateIntegrationConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_CREATE_INTEGRATION_CONFIG)))
        .addMethod(
          getGetIntegrationConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig>(
                service, METHODID_GET_INTEGRATION_CONFIG)))
        .addMethod(
          getUpdateIntegrationConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_UPDATE_INTEGRATION_CONFIG)))
        .addMethod(
          getDeleteIntegrationConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_DELETE_INTEGRATION_CONFIG)))
        .addMethod(
          getListIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>(
                service, METHODID_LIST_INTEGRATIONS)))
        .addMethod(
          getListIntegrationsForOrgMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationsForOrgReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>(
                service, METHODID_LIST_INTEGRATIONS_FOR_ORG)))
        .addMethod(
          getListIntegrationConfigNamesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes>(
                service, METHODID_LIST_INTEGRATION_CONFIG_NAMES)))
        .addMethod(
          getListJourneyConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>(
                service, METHODID_LIST_JOURNEY_CONFIGS)))
        .addMethod(
          getListNonJourneyConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>(
                service, METHODID_LIST_NON_JOURNEY_CONFIGS)))
        .addMethod(
          getCreatePortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_CREATE_PORTAL_CONFIG)))
        .addMethod(
          getListPortalConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs>(
                service, METHODID_LIST_PORTAL_CONFIGS)))
        .addMethod(
          getUpdatePortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_UPDATE_PORTAL_CONFIG)))
        .addMethod(
          getGetPortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig>(
                service, METHODID_GET_PORTAL_CONFIG)))
        .addMethod(
          getDeletePortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_DELETE_PORTAL_CONFIG)))
        .addMethod(
          getUpdatePortalLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_UPDATE_PORTAL_LOGO)))
        .addMethod(
          getGetPortalLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Logo>(
                service, METHODID_GET_PORTAL_LOGO)))
        .addMethod(
          getCreatePaymentPortalLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes>(
                service, METHODID_CREATE_PAYMENT_PORTAL_LINKS)))
        .addMethod(
          getSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes>(
                service, METHODID_SUMMARY)))
        .addMethod(
          getListIntegrationTemplatesByConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes>(
                service, METHODID_LIST_INTEGRATION_TEMPLATES_BY_CONFIG)))
        .addMethod(
          getCallEpicPatientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.CallEpicPatientRes>(
                service, METHODID_CALL_EPIC_PATIENT)))
        .addMethod(
          getHangUpEpicPatientCallMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                service, METHODID_HANG_UP_EPIC_PATIENT_CALL)))
        .addMethod(
          getGenerateEpicKeyPairsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GenerateEpicKeyPairRes>(
                service, METHODID_GENERATE_EPIC_KEY_PAIRS)))
        .addMethod(
          getPopulateIntegrationLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes>(
                service, METHODID_POPULATE_INTEGRATION_LINK)))
        .addMethod(
          getProcessWorkflowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ProcessWorkflowRes>(
                service, METHODID_PROCESS_WORKFLOW)))
        .addMethod(
          getInsertPrivateFieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.InsertPrivateFieldRes>(
                service, METHODID_INSERT_PRIVATE_FIELD)))
        .addMethod(
          getCalculateFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.CalculateFeesRes>(
                service, METHODID_CALCULATE_FEES)))
        .build();
  }

  private static abstract class IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegrationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Integrations");
    }
  }

  private static final class IntegrationsFileDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier {
    IntegrationsFileDescriptorSupplier() {}
  }

  private static final class IntegrationsMethodDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntegrationsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntegrationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegrationsFileDescriptorSupplier())
              .addMethod(getProcessMethod())
              .addMethod(getGetIntegrationTransactionMethod())
              .addMethod(getGetIntegrationTransactionReportMethod())
              .addMethod(getGetIntegrationTransactionReportDataMethod())
              .addMethod(getSearchPastTransactionsMethod())
              .addMethod(getGetAggregatedMetadataMethod())
              .addMethod(getGetPortalLinksByDateRangeMethod())
              .addMethod(getCreateIntegrationConfigMethod())
              .addMethod(getGetIntegrationConfigMethod())
              .addMethod(getUpdateIntegrationConfigMethod())
              .addMethod(getDeleteIntegrationConfigMethod())
              .addMethod(getListIntegrationsMethod())
              .addMethod(getListIntegrationsForOrgMethod())
              .addMethod(getListIntegrationConfigNamesMethod())
              .addMethod(getListJourneyConfigsMethod())
              .addMethod(getListNonJourneyConfigsMethod())
              .addMethod(getCreatePortalConfigMethod())
              .addMethod(getListPortalConfigsMethod())
              .addMethod(getUpdatePortalConfigMethod())
              .addMethod(getGetPortalConfigMethod())
              .addMethod(getDeletePortalConfigMethod())
              .addMethod(getUpdatePortalLogoMethod())
              .addMethod(getGetPortalLogoMethod())
              .addMethod(getCreatePaymentPortalLinksMethod())
              .addMethod(getSummaryMethod())
              .addMethod(getListIntegrationTemplatesByConfigMethod())
              .addMethod(getCallEpicPatientMethod())
              .addMethod(getHangUpEpicPatientCallMethod())
              .addMethod(getGenerateEpicKeyPairsMethod())
              .addMethod(getPopulateIntegrationLinkMethod())
              .addMethod(getProcessWorkflowMethod())
              .addMethod(getInsertPrivateFieldMethod())
              .addMethod(getCalculateFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
