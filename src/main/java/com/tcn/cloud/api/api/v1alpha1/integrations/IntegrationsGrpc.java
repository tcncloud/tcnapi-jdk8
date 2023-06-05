package com.tcn.cloud.api.api.v1alpha1.integrations;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/integrations/service.proto")
public final class IntegrationsGrpc {

  private IntegrationsGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.integrations.Integrations";

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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "Process"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetIntegrationTransaction"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetIntegrationTransactionReport"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetIntegrationTransactionReportData"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetAggregatedMetadata"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetPortalLinksByDateRange"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "CreateIntegrationConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetIntegrationConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "UpdateIntegrationConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "DeleteIntegrationConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListIntegrations"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListIntegrationConfigNames"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListJourneyConfigs"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListNonJourneyConfigs"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "CreatePortalConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListPortalConfigs"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "UpdatePortalConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetPortalConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "DeletePortalConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "UpdatePortalLogo"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "GetPortalLogo"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "CreatePaymentPortalLinks"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "Summary"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.Integrations", "ListIntegrationTemplatesByConfig"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationsStub newStub(io.grpc.Channel channel) {
    return new IntegrationsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegrationsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegrationsFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegrationsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public void process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public void getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntegrationTransactionMethod(), responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntegrationTransactionReportMethod(), responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntegrationTransactionReportDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public void getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAggregatedMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public void getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalLinksByDateRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public void createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public void getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public void updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public void deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteIntegrationConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public void listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      asyncUnimplementedUnaryCall(getListIntegrationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public void listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListIntegrationConfigNamesMethod(), responseObserver);
    }

    /**
     */
    public void listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      asyncUnimplementedUnaryCall(getListJourneyConfigsMethod(), responseObserver);
    }

    /**
     */
    public void listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      asyncUnimplementedUnaryCall(getListNonJourneyConfigsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreatePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    public void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs> responseObserver) {
      asyncUnimplementedUnaryCall(getListPortalConfigsMethod(), responseObserver);
    }

    /**
     */
    public void updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    public void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    public void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePortalLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalLogoMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreatePaymentPortalLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public void summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public void listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListIntegrationTemplatesByConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes>(
                  this, METHODID_PROCESS)))
          .addMethod(
            getGetIntegrationTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction>(
                  this, METHODID_GET_INTEGRATION_TRANSACTION)))
          .addMethod(
            getGetIntegrationTransactionReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes>(
                  this, METHODID_GET_INTEGRATION_TRANSACTION_REPORT)))
          .addMethod(
            getGetIntegrationTransactionReportDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes>(
                  this, METHODID_GET_INTEGRATION_TRANSACTION_REPORT_DATA)))
          .addMethod(
            getGetAggregatedMetadataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes>(
                  this, METHODID_GET_AGGREGATED_METADATA)))
          .addMethod(
            getGetPortalLinksByDateRangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes>(
                  this, METHODID_GET_PORTAL_LINKS_BY_DATE_RANGE)))
          .addMethod(
            getCreateIntegrationConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_CREATE_INTEGRATION_CONFIG)))
          .addMethod(
            getGetIntegrationConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig>(
                  this, METHODID_GET_INTEGRATION_CONFIG)))
          .addMethod(
            getUpdateIntegrationConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_UPDATE_INTEGRATION_CONFIG)))
          .addMethod(
            getDeleteIntegrationConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_DELETE_INTEGRATION_CONFIG)))
          .addMethod(
            getListIntegrationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty,
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos>(
                  this, METHODID_LIST_INTEGRATIONS)))
          .addMethod(
            getListIntegrationConfigNamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes>(
                  this, METHODID_LIST_INTEGRATION_CONFIG_NAMES)))
          .addMethod(
            getListJourneyConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>(
                  this, METHODID_LIST_JOURNEY_CONFIGS)))
          .addMethod(
            getListNonJourneyConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs>(
                  this, METHODID_LIST_NON_JOURNEY_CONFIGS)))
          .addMethod(
            getCreatePortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_CREATE_PORTAL_CONFIG)))
          .addMethod(
            getListPortalConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs>(
                  this, METHODID_LIST_PORTAL_CONFIGS)))
          .addMethod(
            getUpdatePortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_UPDATE_PORTAL_CONFIG)))
          .addMethod(
            getGetPortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig>(
                  this, METHODID_GET_PORTAL_CONFIG)))
          .addMethod(
            getDeletePortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_DELETE_PORTAL_CONFIG)))
          .addMethod(
            getUpdatePortalLogoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.Empty>(
                  this, METHODID_UPDATE_PORTAL_LOGO)))
          .addMethod(
            getGetPortalLogoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.Logo>(
                  this, METHODID_GET_PORTAL_LOGO)))
          .addMethod(
            getCreatePaymentPortalLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.CreatePaymentPortalLinksRes>(
                  this, METHODID_CREATE_PAYMENT_PORTAL_LINKS)))
          .addMethod(
            getSummaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes>(
                  this, METHODID_SUMMARY)))
          .addMethod(
            getListIntegrationTemplatesByConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes>(
                  this, METHODID_LIST_INTEGRATION_TEMPLATES_BY_CONFIG)))
          .build();
    }
  }

  /**
   */
  public static final class IntegrationsStub extends io.grpc.stub.AbstractStub<IntegrationsStub> {
    private IntegrationsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public void process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public void getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public void getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAggregatedMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public void getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortalLinksByDateRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public void createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public void getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public void updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public void deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteIntegrationConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public void listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public void listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIntegrationConfigNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListJourneyConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePortalLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public void getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getCreatePaymentPortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public void summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public void listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListIntegrationTemplatesByConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegrationsBlockingStub extends io.grpc.stub.AbstractStub<IntegrationsBlockingStub> {
    private IntegrationsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes process(com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction getIntegrationTransaction(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes getIntegrationTransactionReport(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes getIntegrationTransactionReportData(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIntegrationTransactionReportDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes getAggregatedMetadata(com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAggregatedMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes getPortalLinksByDateRange(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalLinksByDateRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty createIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request) {
      return blockingUnaryCall(
          getChannel(), getCreateIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig getIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updateIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty deleteIntegrationConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteIntegrationConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos listIntegrations(com.tcn.cloud.api.api.v1alpha1.integrations.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes listIntegrationConfigNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request) {
      return blockingUnaryCall(
          getChannel(), getListIntegrationConfigNamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs listJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request) {
      return blockingUnaryCall(
          getChannel(), getListJourneyConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs listNonJourneyConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getCreatePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc ListPortalConfigs(ListPortalConfigsReq) returns (ListPortalConfigsRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigs listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return blockingUnaryCall(
          getChannel(), getListPortalConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updatePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc GetPortalConfig(GetPortalConfigReq) returns (GetPortalConfigRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO better signature
     * rpc DeletePortalConfig(DeletePortalConfigReq) returns (DeletePortalConfigRes);
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Empty updatePortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePortalLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.Logo getPortalLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getCreatePaymentPortalLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes summary(com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request) {
      return blockingUnaryCall(
          getChannel(), getSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes listIntegrationTemplatesByConfig(com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getListIntegrationTemplatesByConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegrationsFutureStub extends io.grpc.stub.AbstractStub<IntegrationsFutureStub> {
    private IntegrationsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * combine rquest parameters with the config parameters and run the integration method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ProcessRes> process(
        com.tcn.cloud.api.api.v1alpha1.integrations.ProcessReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get an integration transaction
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTransaction> getIntegrationTransaction(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportRes> getIntegrationTransactionReport(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataRes> getIntegrationTransactionReportData(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationTransactionReportDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntegrationTransactionReportDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAggregatedMetadata returns the aggregated metrics about the portal links for a specified date range
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataRes> getAggregatedMetadata(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetAggregatedMetadataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAggregatedMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPortalLinksByDateRange returns portal link metrics and portal linnk data for specific range
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeRes> getPortalLinksByDateRange(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinksByDateRangeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortalLinksByDateRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * create a integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> createIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfig> getIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetIntegrationConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updateIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdateIntegrationConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * delete an integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> deleteIntegrationConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeleteIntegrationConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteIntegrationConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list all supported integrations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationInfos> listIntegrations(
        com.tcn.cloud.api.api.v1alpha1.integrations.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * lists all the names of the configs for an org's integration type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesRes> listIntegrationConfigNames(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationConfigNamesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListIntegrationConfigNamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> listJourneyConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListJourneyConfigsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListJourneyConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationConfigs> listNonJourneyConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListNonJourneyConfigsReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updatePortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Empty> updatePortalLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalLogoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePortalLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO deprecate
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.Logo> getPortalLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLogoReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getCreatePaymentPortalLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * takes a year in YYYY format and returns the summary of transaction for that year
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.SummaryRes> summary(
        com.tcn.cloud.api.api.v1alpha1.integrations.SummaryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists integration templates that use the passed in integration config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigRes> listIntegrationTemplatesByConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListIntegrationTemplatesByConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListIntegrationTemplatesByConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS = 0;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION = 1;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION_REPORT = 2;
  private static final int METHODID_GET_INTEGRATION_TRANSACTION_REPORT_DATA = 3;
  private static final int METHODID_GET_AGGREGATED_METADATA = 4;
  private static final int METHODID_GET_PORTAL_LINKS_BY_DATE_RANGE = 5;
  private static final int METHODID_CREATE_INTEGRATION_CONFIG = 6;
  private static final int METHODID_GET_INTEGRATION_CONFIG = 7;
  private static final int METHODID_UPDATE_INTEGRATION_CONFIG = 8;
  private static final int METHODID_DELETE_INTEGRATION_CONFIG = 9;
  private static final int METHODID_LIST_INTEGRATIONS = 10;
  private static final int METHODID_LIST_INTEGRATION_CONFIG_NAMES = 11;
  private static final int METHODID_LIST_JOURNEY_CONFIGS = 12;
  private static final int METHODID_LIST_NON_JOURNEY_CONFIGS = 13;
  private static final int METHODID_CREATE_PORTAL_CONFIG = 14;
  private static final int METHODID_LIST_PORTAL_CONFIGS = 15;
  private static final int METHODID_UPDATE_PORTAL_CONFIG = 16;
  private static final int METHODID_GET_PORTAL_CONFIG = 17;
  private static final int METHODID_DELETE_PORTAL_CONFIG = 18;
  private static final int METHODID_UPDATE_PORTAL_LOGO = 19;
  private static final int METHODID_GET_PORTAL_LOGO = 20;
  private static final int METHODID_CREATE_PAYMENT_PORTAL_LINKS = 21;
  private static final int METHODID_SUMMARY = 22;
  private static final int METHODID_LIST_INTEGRATION_TEMPLATES_BY_CONFIG = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegrationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegrationsImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    IntegrationsMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetAggregatedMetadataMethod())
              .addMethod(getGetPortalLinksByDateRangeMethod())
              .addMethod(getCreateIntegrationConfigMethod())
              .addMethod(getGetIntegrationConfigMethod())
              .addMethod(getUpdateIntegrationConfigMethod())
              .addMethod(getDeleteIntegrationConfigMethod())
              .addMethod(getListIntegrationsMethod())
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
              .build();
        }
      }
    }
    return result;
  }
}
