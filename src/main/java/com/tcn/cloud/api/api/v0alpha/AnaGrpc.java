package com.tcn.cloud.api.api.v0alpha;

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
    comments = "Source: api/v0alpha/ana.proto")
public final class AnaGrpc {

  private AnaGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Ana";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq,
      com.tcn.cloud.api.api.v0alpha.Visualizations> getGetSpecifiedVisualizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpecifiedVisualizations",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Visualizations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq,
      com.tcn.cloud.api.api.v0alpha.Visualizations> getGetSpecifiedVisualizationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq, com.tcn.cloud.api.api.v0alpha.Visualizations> getGetSpecifiedVisualizationsMethod;
    if ((getGetSpecifiedVisualizationsMethod = AnaGrpc.getGetSpecifiedVisualizationsMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetSpecifiedVisualizationsMethod = AnaGrpc.getGetSpecifiedVisualizationsMethod) == null) {
          AnaGrpc.getGetSpecifiedVisualizationsMethod = getGetSpecifiedVisualizationsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq, com.tcn.cloud.api.api.v0alpha.Visualizations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetSpecifiedVisualizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Visualizations.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetSpecifiedVisualizations"))
                  .build();
          }
        }
     }
     return getGetSpecifiedVisualizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAccount",
      requestType = com.tcn.cloud.api.api.v0alpha.RegisterAccountReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AnaAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RegisterAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = AnaGrpc.getRegisterAccountMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getRegisterAccountMethod = AnaGrpc.getRegisterAccountMethod) == null) {
          AnaGrpc.getRegisterAccountMethod = getRegisterAccountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RegisterAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "RegisterAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RegisterAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AnaAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("RegisterAccount"))
                  .build();
          }
        }
     }
     return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetWeeksReq,
      com.tcn.cloud.api.api.v0alpha.SetWeeksRes> getSetWeeksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWeeks",
      requestType = com.tcn.cloud.api.api.v0alpha.SetWeeksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetWeeksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetWeeksReq,
      com.tcn.cloud.api.api.v0alpha.SetWeeksRes> getSetWeeksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetWeeksReq, com.tcn.cloud.api.api.v0alpha.SetWeeksRes> getSetWeeksMethod;
    if ((getSetWeeksMethod = AnaGrpc.getSetWeeksMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getSetWeeksMethod = AnaGrpc.getSetWeeksMethod) == null) {
          AnaGrpc.getSetWeeksMethod = getSetWeeksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetWeeksReq, com.tcn.cloud.api.api.v0alpha.SetWeeksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "SetWeeks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetWeeksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetWeeksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("SetWeeks"))
                  .build();
          }
        }
     }
     return getSetWeeksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq,
      com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> getSetDefaultTimeFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDefaultTimeFilter",
      requestType = com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq,
      com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> getSetDefaultTimeFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq, com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> getSetDefaultTimeFilterMethod;
    if ((getSetDefaultTimeFilterMethod = AnaGrpc.getSetDefaultTimeFilterMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getSetDefaultTimeFilterMethod = AnaGrpc.getSetDefaultTimeFilterMethod) == null) {
          AnaGrpc.getSetDefaultTimeFilterMethod = getSetDefaultTimeFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq, com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "SetDefaultTimeFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("SetDefaultTimeFilter"))
                  .build();
          }
        }
     }
     return getSetDefaultTimeFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq,
      com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> getSetDefaultDashboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDefaultDashboard",
      requestType = com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq,
      com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> getSetDefaultDashboardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq, com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> getSetDefaultDashboardMethod;
    if ((getSetDefaultDashboardMethod = AnaGrpc.getSetDefaultDashboardMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getSetDefaultDashboardMethod = AnaGrpc.getSetDefaultDashboardMethod) == null) {
          AnaGrpc.getSetDefaultDashboardMethod = getSetDefaultDashboardMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq, com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "SetDefaultDashboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("SetDefaultDashboard"))
                  .build();
          }
        }
     }
     return getSetDefaultDashboardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAccountReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AnaAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetAccountMethod;
    if ((getGetAccountMethod = AnaGrpc.getGetAccountMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetAccountMethod = AnaGrpc.getGetAccountMethod) == null) {
          AnaGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AnaAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetSpecifiedAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpecifiedAccount",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AnaAccount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq,
      com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetSpecifiedAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount> getGetSpecifiedAccountMethod;
    if ((getGetSpecifiedAccountMethod = AnaGrpc.getGetSpecifiedAccountMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetSpecifiedAccountMethod = AnaGrpc.getGetSpecifiedAccountMethod) == null) {
          AnaGrpc.getGetSpecifiedAccountMethod = getGetSpecifiedAccountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq, com.tcn.cloud.api.api.v0alpha.AnaAccount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetSpecifiedAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AnaAccount.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetSpecifiedAccount"))
                  .build();
          }
        }
     }
     return getGetSpecifiedAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq,
      com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> getGetAuthorizedAnalyticsLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthorizedAnalyticsLink",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq,
      com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> getGetAuthorizedAnalyticsLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq, com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> getGetAuthorizedAnalyticsLinkMethod;
    if ((getGetAuthorizedAnalyticsLinkMethod = AnaGrpc.getGetAuthorizedAnalyticsLinkMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetAuthorizedAnalyticsLinkMethod = AnaGrpc.getGetAuthorizedAnalyticsLinkMethod) == null) {
          AnaGrpc.getGetAuthorizedAnalyticsLinkMethod = getGetAuthorizedAnalyticsLinkMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq, com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetAuthorizedAnalyticsLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetAuthorizedAnalyticsLink"))
                  .build();
          }
        }
     }
     return getGetAuthorizedAnalyticsLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq,
      com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> getGenerateMonthlyBillingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateMonthlyBilling",
      requestType = com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq,
      com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> getGenerateMonthlyBillingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq, com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> getGenerateMonthlyBillingMethod;
    if ((getGenerateMonthlyBillingMethod = AnaGrpc.getGenerateMonthlyBillingMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGenerateMonthlyBillingMethod = AnaGrpc.getGenerateMonthlyBillingMethod) == null) {
          AnaGrpc.getGenerateMonthlyBillingMethod = getGenerateMonthlyBillingMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq, com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GenerateMonthlyBilling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GenerateMonthlyBilling"))
                  .build();
          }
        }
     }
     return getGenerateMonthlyBillingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq,
      com.tcn.cloud.api.api.v0alpha.TimeZone> getGetTimeZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTimeZone",
      requestType = com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TimeZone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq,
      com.tcn.cloud.api.api.v0alpha.TimeZone> getGetTimeZoneMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq, com.tcn.cloud.api.api.v0alpha.TimeZone> getGetTimeZoneMethod;
    if ((getGetTimeZoneMethod = AnaGrpc.getGetTimeZoneMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetTimeZoneMethod = AnaGrpc.getGetTimeZoneMethod) == null) {
          AnaGrpc.getGetTimeZoneMethod = getGetTimeZoneMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq, com.tcn.cloud.api.api.v0alpha.TimeZone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetTimeZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TimeZone.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetTimeZone"))
                  .build();
          }
        }
     }
     return getGetTimeZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq,
      com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> getSetTimeZoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTimeZone",
      requestType = com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq,
      com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> getSetTimeZoneMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq, com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> getSetTimeZoneMethod;
    if ((getSetTimeZoneMethod = AnaGrpc.getSetTimeZoneMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getSetTimeZoneMethod = AnaGrpc.getSetTimeZoneMethod) == null) {
          AnaGrpc.getSetTimeZoneMethod = getSetTimeZoneMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq, com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "SetTimeZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("SetTimeZone"))
                  .build();
          }
        }
     }
     return getSetTimeZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyDashVizReq,
      com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> getCopyDashVizMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyDashViz",
      requestType = com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CopyDashVizRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyDashVizReq,
      com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> getCopyDashVizMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyDashVizReq, com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> getCopyDashVizMethod;
    if ((getCopyDashVizMethod = AnaGrpc.getCopyDashVizMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getCopyDashVizMethod = AnaGrpc.getCopyDashVizMethod) == null) {
          AnaGrpc.getCopyDashVizMethod = getCopyDashVizMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CopyDashVizReq, com.tcn.cloud.api.api.v0alpha.CopyDashVizRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "CopyDashViz"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyDashVizRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("CopyDashViz"))
                  .build();
          }
        }
     }
     return getCopyDashVizMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq,
      com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetSpecifiedBillingSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpecifiedBillingSummary",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.BillingSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq,
      com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetSpecifiedBillingSummaryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq, com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetSpecifiedBillingSummaryMethod;
    if ((getGetSpecifiedBillingSummaryMethod = AnaGrpc.getGetSpecifiedBillingSummaryMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetSpecifiedBillingSummaryMethod = AnaGrpc.getGetSpecifiedBillingSummaryMethod) == null) {
          AnaGrpc.getGetSpecifiedBillingSummaryMethod = getGetSpecifiedBillingSummaryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq, com.tcn.cloud.api.api.v0alpha.BillingSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetSpecifiedBillingSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.BillingSummary.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetSpecifiedBillingSummary"))
                  .build();
          }
        }
     }
     return getGetSpecifiedBillingSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq,
      com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetBillingSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingSummary",
      requestType = com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.BillingSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq,
      com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetBillingSummaryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq, com.tcn.cloud.api.api.v0alpha.BillingSummary> getGetBillingSummaryMethod;
    if ((getGetBillingSummaryMethod = AnaGrpc.getGetBillingSummaryMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetBillingSummaryMethod = AnaGrpc.getGetBillingSummaryMethod) == null) {
          AnaGrpc.getGetBillingSummaryMethod = getGetBillingSummaryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq, com.tcn.cloud.api.api.v0alpha.BillingSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetBillingSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.BillingSummary.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetBillingSummary"))
                  .build();
          }
        }
     }
     return getGetBillingSummaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
      com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getEnableCustomReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableCustomReports",
      requestType = com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
      com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getEnableCustomReportsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq, com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getEnableCustomReportsMethod;
    if ((getEnableCustomReportsMethod = AnaGrpc.getEnableCustomReportsMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getEnableCustomReportsMethod = AnaGrpc.getEnableCustomReportsMethod) == null) {
          AnaGrpc.getEnableCustomReportsMethod = getEnableCustomReportsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq, com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "EnableCustomReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("EnableCustomReports"))
                  .build();
          }
        }
     }
     return getEnableCustomReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
      com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getDisableCustomReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableCustomReports",
      requestType = com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
      com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getDisableCustomReportsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq, com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> getDisableCustomReportsMethod;
    if ((getDisableCustomReportsMethod = AnaGrpc.getDisableCustomReportsMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getDisableCustomReportsMethod = AnaGrpc.getDisableCustomReportsMethod) == null) {
          AnaGrpc.getDisableCustomReportsMethod = getDisableCustomReportsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq, com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "DisableCustomReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("DisableCustomReports"))
                  .build();
          }
        }
     }
     return getDisableCustomReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
      com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeAdoptableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeAdoptable",
      requestType = com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
      com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeAdoptableMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq, com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeAdoptableMethod;
    if ((getMakeAdoptableMethod = AnaGrpc.getMakeAdoptableMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getMakeAdoptableMethod = AnaGrpc.getMakeAdoptableMethod) == null) {
          AnaGrpc.getMakeAdoptableMethod = getMakeAdoptableMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq, com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "MakeAdoptable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("MakeAdoptable"))
                  .build();
          }
        }
     }
     return getMakeAdoptableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
      com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeUnadoptableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeUnadoptable",
      requestType = com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
      com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeUnadoptableMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq, com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> getMakeUnadoptableMethod;
    if ((getMakeUnadoptableMethod = AnaGrpc.getMakeUnadoptableMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getMakeUnadoptableMethod = AnaGrpc.getMakeUnadoptableMethod) == null) {
          AnaGrpc.getMakeUnadoptableMethod = getMakeUnadoptableMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq, com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "MakeUnadoptable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("MakeUnadoptable"))
                  .build();
          }
        }
     }
     return getMakeUnadoptableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getAdoptAnaAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdoptAnaAccount",
      requestType = com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getAdoptAnaAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getAdoptAnaAccountMethod;
    if ((getAdoptAnaAccountMethod = AnaGrpc.getAdoptAnaAccountMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getAdoptAnaAccountMethod = AnaGrpc.getAdoptAnaAccountMethod) == null) {
          AnaGrpc.getAdoptAnaAccountMethod = getAdoptAnaAccountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "AdoptAnaAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("AdoptAnaAccount"))
                  .build();
          }
        }
     }
     return getAdoptAnaAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getDisownAnaAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisownAnaAccount",
      requestType = com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getDisownAnaAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> getDisownAnaAccountMethod;
    if ((getDisownAnaAccountMethod = AnaGrpc.getDisownAnaAccountMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getDisownAnaAccountMethod = AnaGrpc.getDisownAnaAccountMethod) == null) {
          AnaGrpc.getDisownAnaAccountMethod = getDisownAnaAccountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "DisownAnaAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("DisownAnaAccount"))
                  .build();
          }
        }
     }
     return getDisownAnaAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq,
      com.tcn.cloud.api.api.v0alpha.SimpleRelations> getGetAccessibleClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccessibleClients",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SimpleRelations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq,
      com.tcn.cloud.api.api.v0alpha.SimpleRelations> getGetAccessibleClientsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq, com.tcn.cloud.api.api.v0alpha.SimpleRelations> getGetAccessibleClientsMethod;
    if ((getGetAccessibleClientsMethod = AnaGrpc.getGetAccessibleClientsMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetAccessibleClientsMethod = AnaGrpc.getGetAccessibleClientsMethod) == null) {
          AnaGrpc.getGetAccessibleClientsMethod = getGetAccessibleClientsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq, com.tcn.cloud.api.api.v0alpha.SimpleRelations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetAccessibleClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SimpleRelations.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetAccessibleClients"))
                  .build();
          }
        }
     }
     return getGetAccessibleClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFamilyReq,
      com.tcn.cloud.api.api.v0alpha.Family> getGetFamilyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFamily",
      requestType = com.tcn.cloud.api.api.v0alpha.GetFamilyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Family.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFamilyReq,
      com.tcn.cloud.api.api.v0alpha.Family> getGetFamilyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFamilyReq, com.tcn.cloud.api.api.v0alpha.Family> getGetFamilyMethod;
    if ((getGetFamilyMethod = AnaGrpc.getGetFamilyMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetFamilyMethod = AnaGrpc.getGetFamilyMethod) == null) {
          AnaGrpc.getGetFamilyMethod = getGetFamilyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetFamilyReq, com.tcn.cloud.api.api.v0alpha.Family>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetFamily"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetFamilyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Family.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetFamily"))
                  .build();
          }
        }
     }
     return getGetFamilyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAllowedDataVisibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllowedDataVisibility",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DataVisibility.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAllowedDataVisibilityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAllowedDataVisibilityMethod;
    if ((getGetAllowedDataVisibilityMethod = AnaGrpc.getGetAllowedDataVisibilityMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetAllowedDataVisibilityMethod = AnaGrpc.getGetAllowedDataVisibilityMethod) == null) {
          AnaGrpc.getGetAllowedDataVisibilityMethod = getGetAllowedDataVisibilityMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetAllowedDataVisibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DataVisibility.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetAllowedDataVisibility"))
                  .build();
          }
        }
     }
     return getGetAllowedDataVisibilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetCurrentDataVisibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentDataVisibility",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DataVisibility.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetCurrentDataVisibilityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetCurrentDataVisibilityMethod;
    if ((getGetCurrentDataVisibilityMethod = AnaGrpc.getGetCurrentDataVisibilityMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetCurrentDataVisibilityMethod = AnaGrpc.getGetCurrentDataVisibilityMethod) == null) {
          AnaGrpc.getGetCurrentDataVisibilityMethod = getGetCurrentDataVisibilityMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetCurrentDataVisibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DataVisibility.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetCurrentDataVisibility"))
                  .build();
          }
        }
     }
     return getGetCurrentDataVisibilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.IndicesVisibility> getGetIndicesVisibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIndicesVisibility",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.IndicesVisibility.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.IndicesVisibility> getGetIndicesVisibilityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.IndicesVisibility> getGetIndicesVisibilityMethod;
    if ((getGetIndicesVisibilityMethod = AnaGrpc.getGetIndicesVisibilityMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetIndicesVisibilityMethod = AnaGrpc.getGetIndicesVisibilityMethod) == null) {
          AnaGrpc.getGetIndicesVisibilityMethod = getGetIndicesVisibilityMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.IndicesVisibility>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetIndicesVisibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.IndicesVisibility.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetIndicesVisibility"))
                  .build();
          }
        }
     }
     return getGetIndicesVisibilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAuditableDataVisibilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuditableDataVisibility",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DataVisibility.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
      com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAuditableDataVisibilityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility> getGetAuditableDataVisibilityMethod;
    if ((getGetAuditableDataVisibilityMethod = AnaGrpc.getGetAuditableDataVisibilityMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetAuditableDataVisibilityMethod = AnaGrpc.getGetAuditableDataVisibilityMethod) == null) {
          AnaGrpc.getGetAuditableDataVisibilityMethod = getGetAuditableDataVisibilityMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVisibilityReq, com.tcn.cloud.api.api.v0alpha.DataVisibility>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetAuditableDataVisibility"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVisibilityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DataVisibility.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetAuditableDataVisibility"))
                  .build();
          }
        }
     }
     return getGetAuditableDataVisibilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> getGetOrganizationNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationNames",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq,
      com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> getGetOrganizationNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq, com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> getGetOrganizationNamesMethod;
    if ((getGetOrganizationNamesMethod = AnaGrpc.getGetOrganizationNamesMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetOrganizationNamesMethod = AnaGrpc.getGetOrganizationNamesMethod) == null) {
          AnaGrpc.getGetOrganizationNamesMethod = getGetOrganizationNamesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq, com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetOrganizationNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetOrganizationNames"))
                  .build();
          }
        }
     }
     return getGetOrganizationNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq,
      com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> getGenerateVizDataByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateVizDataById",
      requestType = com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq,
      com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> getGenerateVizDataByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq, com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> getGenerateVizDataByIdMethod;
    if ((getGenerateVizDataByIdMethod = AnaGrpc.getGenerateVizDataByIdMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGenerateVizDataByIdMethod = AnaGrpc.getGenerateVizDataByIdMethod) == null) {
          AnaGrpc.getGenerateVizDataByIdMethod = getGenerateVizDataByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq, com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GenerateVizDataById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GenerateVizDataById"))
                  .build();
          }
        }
     }
     return getGenerateVizDataByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientStatusReq,
      com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> getGetClientStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.GetClientStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetClientStatusResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientStatusReq,
      com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> getGetClientStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientStatusReq, com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> getGetClientStatusMethod;
    if ((getGetClientStatusMethod = AnaGrpc.getGetClientStatusMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getGetClientStatusMethod = AnaGrpc.getGetClientStatusMethod) == null) {
          AnaGrpc.getGetClientStatusMethod = getGetClientStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetClientStatusReq, com.tcn.cloud.api.api.v0alpha.GetClientStatusResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "GetClientStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientStatusResp.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("GetClientStatus"))
                  .build();
          }
        }
     }
     return getGetClientStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq,
      com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> getReloadClientDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReloadClientData",
      requestType = com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq,
      com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> getReloadClientDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq, com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> getReloadClientDataMethod;
    if ((getReloadClientDataMethod = AnaGrpc.getReloadClientDataMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getReloadClientDataMethod = AnaGrpc.getReloadClientDataMethod) == null) {
          AnaGrpc.getReloadClientDataMethod = getReloadClientDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq, com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "ReloadClientData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("ReloadClientData"))
                  .build();
          }
        }
     }
     return getReloadClientDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq,
      com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> getListVisualizationsLegacyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVisualizationsLegacy",
      requestType = com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq,
      com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> getListVisualizationsLegacyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq, com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> getListVisualizationsLegacyMethod;
    if ((getListVisualizationsLegacyMethod = AnaGrpc.getListVisualizationsLegacyMethod) == null) {
      synchronized (AnaGrpc.class) {
        if ((getListVisualizationsLegacyMethod = AnaGrpc.getListVisualizationsLegacyMethod) == null) {
          AnaGrpc.getListVisualizationsLegacyMethod = getListVisualizationsLegacyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq, com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Ana", "ListVisualizationsLegacy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AnaMethodDescriptorSupplier("ListVisualizationsLegacy"))
                  .build();
          }
        }
     }
     return getListVisualizationsLegacyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnaStub newStub(io.grpc.Channel channel) {
    return new AnaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnaFutureStub(channel);
  }

  /**
   */
  public static abstract class AnaImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * gets all visualizations for a specific client
     * </pre>
     */
    public void getSpecifiedVisualizations(com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Visualizations> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpecifiedVisualizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Registers a new AnaAccoun based on org_id
     * The method will return the newly create AnaAccount
     * on the response message AnaAccount.
     * Required Permissions:
     *  EDIT_ADMIN_CLIENT_PREFERENCES
     * </pre>
     */
    public void registerAccount(com.tcn.cloud.api.api.v0alpha.RegisterAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * sets the length of analytics history the client can view
     * </pre>
     */
    public void setWeeks(com.tcn.cloud.api.api.v0alpha.SetWeeksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetWeeksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWeeksMethod(), responseObserver);
    }

    /**
     * <pre>
     * set default time filter for given ana account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void setDefaultTimeFilter(com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDefaultTimeFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * sets the dashboard that is shown by default for neo
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDefaultDashboardMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets account details for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void getAccount(com.tcn.cloud.api.api.v0alpha.GetAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets account details using the org_id provided
     * </pre>
     */
    public void getSpecifiedAccount(com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpecifiedAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an authorized url for the clients BI analytics page
     * </pre>
     */
    public void getAuthorizedAnalyticsLink(com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthorizedAnalyticsLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * creates and returns a url to download billing for the month provided or the previous month if none is provided
     * org.Permission_VIEW_BILLING
     * </pre>
     */
    public void generateMonthlyBilling(com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateMonthlyBillingMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the ana_account timezone for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void getTimeZone(com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TimeZone> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTimeZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates the timezone for the account
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void setTimeZone(com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTimeZoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * copies the reports (dashboards legacy and visualizations legacy)
     * corresponding with the ids provided
     * </pre>
     */
    public void copyDashViz(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyDashVizMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the specified client, whether client is pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public void getSpecifiedBillingSummary(com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpecifiedBillingSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the client, whether client is
     * pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public void getBillingSummary(com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBillingSummaryMethod(), responseObserver);
    }

    /**
     * <pre>
     * enable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void enableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableCustomReportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * disable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void disableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableCustomReportsMethod(), responseObserver);
    }

    /**
     * <pre>
     * allow the client to be adopted by another account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void makeAdoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeAdoptableMethod(), responseObserver);
    }

    /**
     * <pre>
     * disallow other accounts from adopting the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void makeUnadoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeUnadoptableMethod(), responseObserver);
    }

    /**
     * <pre>
     * allow the parent to view the data of the adoptable child
     * </pre>
     */
    public void adoptAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAdoptAnaAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * disallow the parent from viewing the data of the child
     * </pre>
     */
    public void disownAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDisownAnaAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets all clients that can be viewed by the client including the client
     * </pre>
     */
    public void getAccessibleClients(com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SimpleRelations> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccessibleClientsMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets all relations in which the client is involved grouped by whether the
     * client is the parent or child account
     * </pre>
     */
    public void getFamily(com.tcn.cloud.api.api.v0alpha.GetFamilyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Family> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFamilyMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as defined in the database (source of
     * truth); internal use only
     * </pre>
     */
    public void getAllowedDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllowedDataVisibilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as is evident from the elasticsearch
     * indices structure; internal use only
     * </pre>
     */
    public void getCurrentDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentDataVisibilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets a visibility summary from the perspective of the elasticsearch
     * indices; internal use only
     * </pre>
     */
    public void getIndicesVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.IndicesVisibility> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIndicesVisibilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as exists in the elasticsearch data;
     * internal use only
     * </pre>
     */
    public void getAuditableDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuditableDataVisibilityMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets a map of client sids to organization names
     * </pre>
     */
    public void getOrganizationNames(com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * generate visualization data for the id
     * </pre>
     */
    public void generateVizDataById(com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateVizDataByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets client's data status
     * Data status is the status of calls loaded in elasticsearch
     * against all calls in the database that are within the clients weeks of data setting
     * This method requires a client sid
     * Required permissions:
     *      CUSTOMER_SUPPORT
     * </pre>
     */
    public void getClientStatus(com.tcn.cloud.api.api.v0alpha.GetClientStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reloads client's data
     * This loads calls from the database into elasticsearch
     * This method requires a client sid
     * Required permissions:
     *      WIP - DEV_OPS
     * </pre>
     */
    public void reloadClientData(com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> responseObserver) {
      asyncUnimplementedUnaryCall(getReloadClientDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * list all clients visualizations id and title
     * </pre>
     */
    public void listVisualizationsLegacy(com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListVisualizationsLegacyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSpecifiedVisualizationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq,
                com.tcn.cloud.api.api.v0alpha.Visualizations>(
                  this, METHODID_GET_SPECIFIED_VISUALIZATIONS)))
          .addMethod(
            getRegisterAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RegisterAccountReq,
                com.tcn.cloud.api.api.v0alpha.AnaAccount>(
                  this, METHODID_REGISTER_ACCOUNT)))
          .addMethod(
            getSetWeeksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetWeeksReq,
                com.tcn.cloud.api.api.v0alpha.SetWeeksRes>(
                  this, METHODID_SET_WEEKS)))
          .addMethod(
            getSetDefaultTimeFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq,
                com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes>(
                  this, METHODID_SET_DEFAULT_TIME_FILTER)))
          .addMethod(
            getSetDefaultDashboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq,
                com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes>(
                  this, METHODID_SET_DEFAULT_DASHBOARD)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAccountReq,
                com.tcn.cloud.api.api.v0alpha.AnaAccount>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetSpecifiedAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq,
                com.tcn.cloud.api.api.v0alpha.AnaAccount>(
                  this, METHODID_GET_SPECIFIED_ACCOUNT)))
          .addMethod(
            getGetAuthorizedAnalyticsLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq,
                com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes>(
                  this, METHODID_GET_AUTHORIZED_ANALYTICS_LINK)))
          .addMethod(
            getGenerateMonthlyBillingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq,
                com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes>(
                  this, METHODID_GENERATE_MONTHLY_BILLING)))
          .addMethod(
            getGetTimeZoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq,
                com.tcn.cloud.api.api.v0alpha.TimeZone>(
                  this, METHODID_GET_TIME_ZONE)))
          .addMethod(
            getSetTimeZoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq,
                com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes>(
                  this, METHODID_SET_TIME_ZONE)))
          .addMethod(
            getCopyDashVizMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CopyDashVizReq,
                com.tcn.cloud.api.api.v0alpha.CopyDashVizRes>(
                  this, METHODID_COPY_DASH_VIZ)))
          .addMethod(
            getGetSpecifiedBillingSummaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq,
                com.tcn.cloud.api.api.v0alpha.BillingSummary>(
                  this, METHODID_GET_SPECIFIED_BILLING_SUMMARY)))
          .addMethod(
            getGetBillingSummaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq,
                com.tcn.cloud.api.api.v0alpha.BillingSummary>(
                  this, METHODID_GET_BILLING_SUMMARY)))
          .addMethod(
            getEnableCustomReportsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
                com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>(
                  this, METHODID_ENABLE_CUSTOM_REPORTS)))
          .addMethod(
            getDisableCustomReportsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq,
                com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>(
                  this, METHODID_DISABLE_CUSTOM_REPORTS)))
          .addMethod(
            getMakeAdoptableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
                com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>(
                  this, METHODID_MAKE_ADOPTABLE)))
          .addMethod(
            getMakeUnadoptableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq,
                com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>(
                  this, METHODID_MAKE_UNADOPTABLE)))
          .addMethod(
            getAdoptAnaAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
                com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>(
                  this, METHODID_ADOPT_ANA_ACCOUNT)))
          .addMethod(
            getDisownAnaAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq,
                com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>(
                  this, METHODID_DISOWN_ANA_ACCOUNT)))
          .addMethod(
            getGetAccessibleClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq,
                com.tcn.cloud.api.api.v0alpha.SimpleRelations>(
                  this, METHODID_GET_ACCESSIBLE_CLIENTS)))
          .addMethod(
            getGetFamilyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetFamilyReq,
                com.tcn.cloud.api.api.v0alpha.Family>(
                  this, METHODID_GET_FAMILY)))
          .addMethod(
            getGetAllowedDataVisibilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
                com.tcn.cloud.api.api.v0alpha.DataVisibility>(
                  this, METHODID_GET_ALLOWED_DATA_VISIBILITY)))
          .addMethod(
            getGetCurrentDataVisibilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
                com.tcn.cloud.api.api.v0alpha.DataVisibility>(
                  this, METHODID_GET_CURRENT_DATA_VISIBILITY)))
          .addMethod(
            getGetIndicesVisibilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
                com.tcn.cloud.api.api.v0alpha.IndicesVisibility>(
                  this, METHODID_GET_INDICES_VISIBILITY)))
          .addMethod(
            getGetAuditableDataVisibilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVisibilityReq,
                com.tcn.cloud.api.api.v0alpha.DataVisibility>(
                  this, METHODID_GET_AUDITABLE_DATA_VISIBILITY)))
          .addMethod(
            getGetOrganizationNamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq,
                com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes>(
                  this, METHODID_GET_ORGANIZATION_NAMES)))
          .addMethod(
            getGenerateVizDataByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq,
                com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes>(
                  this, METHODID_GENERATE_VIZ_DATA_BY_ID)))
          .addMethod(
            getGetClientStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetClientStatusReq,
                com.tcn.cloud.api.api.v0alpha.GetClientStatusResp>(
                  this, METHODID_GET_CLIENT_STATUS)))
          .addMethod(
            getReloadClientDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq,
                com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp>(
                  this, METHODID_RELOAD_CLIENT_DATA)))
          .addMethod(
            getListVisualizationsLegacyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq,
                com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes>(
                  this, METHODID_LIST_VISUALIZATIONS_LEGACY)))
          .build();
    }
  }

  /**
   */
  public static final class AnaStub extends io.grpc.stub.AbstractStub<AnaStub> {
    private AnaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnaStub(channel, callOptions);
    }

    /**
     * <pre>
     * gets all visualizations for a specific client
     * </pre>
     */
    public void getSpecifiedVisualizations(com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Visualizations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpecifiedVisualizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Registers a new AnaAccoun based on org_id
     * The method will return the newly create AnaAccount
     * on the response message AnaAccount.
     * Required Permissions:
     *  EDIT_ADMIN_CLIENT_PREFERENCES
     * </pre>
     */
    public void registerAccount(com.tcn.cloud.api.api.v0alpha.RegisterAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sets the length of analytics history the client can view
     * </pre>
     */
    public void setWeeks(com.tcn.cloud.api.api.v0alpha.SetWeeksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetWeeksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWeeksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set default time filter for given ana account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void setDefaultTimeFilter(com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDefaultTimeFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * sets the dashboard that is shown by default for neo
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDefaultDashboardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets account details for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void getAccount(com.tcn.cloud.api.api.v0alpha.GetAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets account details using the org_id provided
     * </pre>
     */
    public void getSpecifiedAccount(com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpecifiedAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an authorized url for the clients BI analytics page
     * </pre>
     */
    public void getAuthorizedAnalyticsLink(com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthorizedAnalyticsLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * creates and returns a url to download billing for the month provided or the previous month if none is provided
     * org.Permission_VIEW_BILLING
     * </pre>
     */
    public void generateMonthlyBilling(com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateMonthlyBillingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the ana_account timezone for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void getTimeZone(com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TimeZone> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTimeZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates the timezone for the account
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public void setTimeZone(com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTimeZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * copies the reports (dashboards legacy and visualizations legacy)
     * corresponding with the ids provided
     * </pre>
     */
    public void copyDashViz(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyDashVizMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the specified client, whether client is pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public void getSpecifiedBillingSummary(com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpecifiedBillingSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the client, whether client is
     * pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public void getBillingSummary(com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBillingSummaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * enable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void enableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableCustomReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * disable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void disableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableCustomReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * allow the client to be adopted by another account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void makeAdoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeAdoptableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * disallow other accounts from adopting the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public void makeUnadoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeUnadoptableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * allow the parent to view the data of the adoptable child
     * </pre>
     */
    public void adoptAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdoptAnaAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * disallow the parent from viewing the data of the child
     * </pre>
     */
    public void disownAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisownAnaAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets all clients that can be viewed by the client including the client
     * </pre>
     */
    public void getAccessibleClients(com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SimpleRelations> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccessibleClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets all relations in which the client is involved grouped by whether the
     * client is the parent or child account
     * </pre>
     */
    public void getFamily(com.tcn.cloud.api.api.v0alpha.GetFamilyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Family> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFamilyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as defined in the database (source of
     * truth); internal use only
     * </pre>
     */
    public void getAllowedDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllowedDataVisibilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as is evident from the elasticsearch
     * indices structure; internal use only
     * </pre>
     */
    public void getCurrentDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentDataVisibilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets a visibility summary from the perspective of the elasticsearch
     * indices; internal use only
     * </pre>
     */
    public void getIndicesVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.IndicesVisibility> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIndicesVisibilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the client's data visibility as exists in the elasticsearch data;
     * internal use only
     * </pre>
     */
    public void getAuditableDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuditableDataVisibilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets a map of client sids to organization names
     * </pre>
     */
    public void getOrganizationNames(com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * generate visualization data for the id
     * </pre>
     */
    public void generateVizDataById(com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateVizDataByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets client's data status
     * Data status is the status of calls loaded in elasticsearch
     * against all calls in the database that are within the clients weeks of data setting
     * This method requires a client sid
     * Required permissions:
     *      CUSTOMER_SUPPORT
     * </pre>
     */
    public void getClientStatus(com.tcn.cloud.api.api.v0alpha.GetClientStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reloads client's data
     * This loads calls from the database into elasticsearch
     * This method requires a client sid
     * Required permissions:
     *      WIP - DEV_OPS
     * </pre>
     */
    public void reloadClientData(com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReloadClientDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list all clients visualizations id and title
     * </pre>
     */
    public void listVisualizationsLegacy(com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVisualizationsLegacyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnaBlockingStub extends io.grpc.stub.AbstractStub<AnaBlockingStub> {
    private AnaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * gets all visualizations for a specific client
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Visualizations getSpecifiedVisualizations(com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSpecifiedVisualizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Registers a new AnaAccoun based on org_id
     * The method will return the newly create AnaAccount
     * on the response message AnaAccount.
     * Required Permissions:
     *  EDIT_ADMIN_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AnaAccount registerAccount(com.tcn.cloud.api.api.v0alpha.RegisterAccountReq request) {
      return blockingUnaryCall(
          getChannel(), getRegisterAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sets the length of analytics history the client can view
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetWeeksRes setWeeks(com.tcn.cloud.api.api.v0alpha.SetWeeksReq request) {
      return blockingUnaryCall(
          getChannel(), getSetWeeksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set default time filter for given ana account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes setDefaultTimeFilter(com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq request) {
      return blockingUnaryCall(
          getChannel(), getSetDefaultTimeFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * sets the dashboard that is shown by default for neo
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes setDefaultDashboard(com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq request) {
      return blockingUnaryCall(
          getChannel(), getSetDefaultDashboardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets account details for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AnaAccount getAccount(com.tcn.cloud.api.api.v0alpha.GetAccountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets account details using the org_id provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AnaAccount getSpecifiedAccount(com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSpecifiedAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an authorized url for the clients BI analytics page
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes getAuthorizedAnalyticsLink(com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthorizedAnalyticsLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * creates and returns a url to download billing for the month provided or the previous month if none is provided
     * org.Permission_VIEW_BILLING
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes generateMonthlyBilling(com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq request) {
      return blockingUnaryCall(
          getChannel(), getGenerateMonthlyBillingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the ana_account timezone for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.TimeZone getTimeZone(com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq request) {
      return blockingUnaryCall(
          getChannel(), getGetTimeZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates the timezone for the account
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes setTimeZone(com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq request) {
      return blockingUnaryCall(
          getChannel(), getSetTimeZoneMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * copies the reports (dashboards legacy and visualizations legacy)
     * corresponding with the ids provided
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CopyDashVizRes copyDashViz(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq request) {
      return blockingUnaryCall(
          getChannel(), getCopyDashVizMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the specified client, whether client is pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.BillingSummary getSpecifiedBillingSummary(com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSpecifiedBillingSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the client, whether client is
     * pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.BillingSummary getBillingSummary(com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq request) {
      return blockingUnaryCall(
          getChannel(), getGetBillingSummaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * enable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes enableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request) {
      return blockingUnaryCall(
          getChannel(), getEnableCustomReportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * disable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes disableCustomReports(com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request) {
      return blockingUnaryCall(
          getChannel(), getDisableCustomReportsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * allow the client to be adopted by another account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes makeAdoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request) {
      return blockingUnaryCall(
          getChannel(), getMakeAdoptableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * disallow other accounts from adopting the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes makeUnadoptable(com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request) {
      return blockingUnaryCall(
          getChannel(), getMakeUnadoptableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * allow the parent to view the data of the adoptable child
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes adoptAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request) {
      return blockingUnaryCall(
          getChannel(), getAdoptAnaAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * disallow the parent from viewing the data of the child
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes disownAnaAccount(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request) {
      return blockingUnaryCall(
          getChannel(), getDisownAnaAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets all clients that can be viewed by the client including the client
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleRelations getAccessibleClients(com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAccessibleClientsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets all relations in which the client is involved grouped by whether the
     * client is the parent or child account
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Family getFamily(com.tcn.cloud.api.api.v0alpha.GetFamilyReq request) {
      return blockingUnaryCall(
          getChannel(), getGetFamilyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as defined in the database (source of
     * truth); internal use only
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DataVisibility getAllowedDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAllowedDataVisibilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as is evident from the elasticsearch
     * indices structure; internal use only
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DataVisibility getCurrentDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentDataVisibilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets a visibility summary from the perspective of the elasticsearch
     * indices; internal use only
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.IndicesVisibility getIndicesVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIndicesVisibilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as exists in the elasticsearch data;
     * internal use only
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DataVisibility getAuditableDataVisibility(com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAuditableDataVisibilityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets a map of client sids to organization names
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes getOrganizationNames(com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * generate visualization data for the id
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes generateVizDataById(com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGenerateVizDataByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets client's data status
     * Data status is the status of calls loaded in elasticsearch
     * against all calls in the database that are within the clients weeks of data setting
     * This method requires a client sid
     * Required permissions:
     *      CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetClientStatusResp getClientStatus(com.tcn.cloud.api.api.v0alpha.GetClientStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getGetClientStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reloads client's data
     * This loads calls from the database into elasticsearch
     * This method requires a client sid
     * Required permissions:
     *      WIP - DEV_OPS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp reloadClientData(com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq request) {
      return blockingUnaryCall(
          getChannel(), getReloadClientDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list all clients visualizations id and title
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes listVisualizationsLegacy(com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq request) {
      return blockingUnaryCall(
          getChannel(), getListVisualizationsLegacyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnaFutureStub extends io.grpc.stub.AbstractStub<AnaFutureStub> {
    private AnaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * gets all visualizations for a specific client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Visualizations> getSpecifiedVisualizations(
        com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpecifiedVisualizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Registers a new AnaAccoun based on org_id
     * The method will return the newly create AnaAccount
     * on the response message AnaAccount.
     * Required Permissions:
     *  EDIT_ADMIN_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AnaAccount> registerAccount(
        com.tcn.cloud.api.api.v0alpha.RegisterAccountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sets the length of analytics history the client can view
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetWeeksRes> setWeeks(
        com.tcn.cloud.api.api.v0alpha.SetWeeksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWeeksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set default time filter for given ana account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes> setDefaultTimeFilter(
        com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDefaultTimeFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * sets the dashboard that is shown by default for neo
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes> setDefaultDashboard(
        com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDefaultDashboardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets account details for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AnaAccount> getAccount(
        com.tcn.cloud.api.api.v0alpha.GetAccountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets account details using the org_id provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AnaAccount> getSpecifiedAccount(
        com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpecifiedAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an authorized url for the clients BI analytics page
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes> getAuthorizedAnalyticsLink(
        com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthorizedAnalyticsLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * creates and returns a url to download billing for the month provided or the previous month if none is provided
     * org.Permission_VIEW_BILLING
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes> generateMonthlyBilling(
        com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateMonthlyBillingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the ana_account timezone for the client
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TimeZone> getTimeZone(
        com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTimeZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates the timezone for the account
     * org.Permission_VIEW_REPORTS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes> setTimeZone(
        com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTimeZoneMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * copies the reports (dashboards legacy and visualizations legacy)
     * corresponding with the ids provided
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CopyDashVizRes> copyDashViz(
        com.tcn.cloud.api.api.v0alpha.CopyDashVizReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyDashVizMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the specified client, whether client is pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.BillingSummary> getSpecifiedBillingSummary(
        com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpecifiedBillingSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns a summary of all billing factors for the client, whether client is
     * pro, and which of those features contribute to making the client pro
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.BillingSummary> getBillingSummary(
        com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBillingSummaryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * enable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> enableCustomReports(
        com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableCustomReportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * disable custom report usage for the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes> disableCustomReports(
        com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableCustomReportsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * allow the client to be adopted by another account
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> makeAdoptable(
        com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeAdoptableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * disallow other accounts from adopting the client
     * org.Permission_EDIT_CLIENT_PREFERENCES
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes> makeUnadoptable(
        com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeUnadoptableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * allow the parent to view the data of the adoptable child
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> adoptAnaAccount(
        com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAdoptAnaAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * disallow the parent from viewing the data of the child
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes> disownAnaAccount(
        com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDisownAnaAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets all clients that can be viewed by the client including the client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SimpleRelations> getAccessibleClients(
        com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccessibleClientsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets all relations in which the client is involved grouped by whether the
     * client is the parent or child account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Family> getFamily(
        com.tcn.cloud.api.api.v0alpha.GetFamilyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFamilyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as defined in the database (source of
     * truth); internal use only
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DataVisibility> getAllowedDataVisibility(
        com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllowedDataVisibilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as is evident from the elasticsearch
     * indices structure; internal use only
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DataVisibility> getCurrentDataVisibility(
        com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentDataVisibilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets a visibility summary from the perspective of the elasticsearch
     * indices; internal use only
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.IndicesVisibility> getIndicesVisibility(
        com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIndicesVisibilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the client's data visibility as exists in the elasticsearch data;
     * internal use only
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DataVisibility> getAuditableDataVisibility(
        com.tcn.cloud.api.api.v0alpha.GetVisibilityReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuditableDataVisibilityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets a map of client sids to organization names
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes> getOrganizationNames(
        com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * generate visualization data for the id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes> generateVizDataById(
        com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateVizDataByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets client's data status
     * Data status is the status of calls loaded in elasticsearch
     * against all calls in the database that are within the clients weeks of data setting
     * This method requires a client sid
     * Required permissions:
     *      CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetClientStatusResp> getClientStatus(
        com.tcn.cloud.api.api.v0alpha.GetClientStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reloads client's data
     * This loads calls from the database into elasticsearch
     * This method requires a client sid
     * Required permissions:
     *      WIP - DEV_OPS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp> reloadClientData(
        com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getReloadClientDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list all clients visualizations id and title
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes> listVisualizationsLegacy(
        com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListVisualizationsLegacyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SPECIFIED_VISUALIZATIONS = 0;
  private static final int METHODID_REGISTER_ACCOUNT = 1;
  private static final int METHODID_SET_WEEKS = 2;
  private static final int METHODID_SET_DEFAULT_TIME_FILTER = 3;
  private static final int METHODID_SET_DEFAULT_DASHBOARD = 4;
  private static final int METHODID_GET_ACCOUNT = 5;
  private static final int METHODID_GET_SPECIFIED_ACCOUNT = 6;
  private static final int METHODID_GET_AUTHORIZED_ANALYTICS_LINK = 7;
  private static final int METHODID_GENERATE_MONTHLY_BILLING = 8;
  private static final int METHODID_GET_TIME_ZONE = 9;
  private static final int METHODID_SET_TIME_ZONE = 10;
  private static final int METHODID_COPY_DASH_VIZ = 11;
  private static final int METHODID_GET_SPECIFIED_BILLING_SUMMARY = 12;
  private static final int METHODID_GET_BILLING_SUMMARY = 13;
  private static final int METHODID_ENABLE_CUSTOM_REPORTS = 14;
  private static final int METHODID_DISABLE_CUSTOM_REPORTS = 15;
  private static final int METHODID_MAKE_ADOPTABLE = 16;
  private static final int METHODID_MAKE_UNADOPTABLE = 17;
  private static final int METHODID_ADOPT_ANA_ACCOUNT = 18;
  private static final int METHODID_DISOWN_ANA_ACCOUNT = 19;
  private static final int METHODID_GET_ACCESSIBLE_CLIENTS = 20;
  private static final int METHODID_GET_FAMILY = 21;
  private static final int METHODID_GET_ALLOWED_DATA_VISIBILITY = 22;
  private static final int METHODID_GET_CURRENT_DATA_VISIBILITY = 23;
  private static final int METHODID_GET_INDICES_VISIBILITY = 24;
  private static final int METHODID_GET_AUDITABLE_DATA_VISIBILITY = 25;
  private static final int METHODID_GET_ORGANIZATION_NAMES = 26;
  private static final int METHODID_GENERATE_VIZ_DATA_BY_ID = 27;
  private static final int METHODID_GET_CLIENT_STATUS = 28;
  private static final int METHODID_RELOAD_CLIENT_DATA = 29;
  private static final int METHODID_LIST_VISUALIZATIONS_LEGACY = 30;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SPECIFIED_VISUALIZATIONS:
          serviceImpl.getSpecifiedVisualizations((com.tcn.cloud.api.api.v0alpha.GetSpecifiedVisualizationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Visualizations>) responseObserver);
          break;
        case METHODID_REGISTER_ACCOUNT:
          serviceImpl.registerAccount((com.tcn.cloud.api.api.v0alpha.RegisterAccountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount>) responseObserver);
          break;
        case METHODID_SET_WEEKS:
          serviceImpl.setWeeks((com.tcn.cloud.api.api.v0alpha.SetWeeksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetWeeksRes>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_TIME_FILTER:
          serviceImpl.setDefaultTimeFilter((com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultTimeFilterRes>) responseObserver);
          break;
        case METHODID_SET_DEFAULT_DASHBOARD:
          serviceImpl.setDefaultDashboard((com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetDefaultDashboardRes>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.tcn.cloud.api.api.v0alpha.GetAccountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount>) responseObserver);
          break;
        case METHODID_GET_SPECIFIED_ACCOUNT:
          serviceImpl.getSpecifiedAccount((com.tcn.cloud.api.api.v0alpha.GetSpecifiedAccountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AnaAccount>) responseObserver);
          break;
        case METHODID_GET_AUTHORIZED_ANALYTICS_LINK:
          serviceImpl.getAuthorizedAnalyticsLink((com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAuthorizedAnalyticsLinkRes>) responseObserver);
          break;
        case METHODID_GENERATE_MONTHLY_BILLING:
          serviceImpl.generateMonthlyBilling((com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateMonthlyBillingRes>) responseObserver);
          break;
        case METHODID_GET_TIME_ZONE:
          serviceImpl.getTimeZone((com.tcn.cloud.api.api.v0alpha.GetTimeZoneReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TimeZone>) responseObserver);
          break;
        case METHODID_SET_TIME_ZONE:
          serviceImpl.setTimeZone((com.tcn.cloud.api.api.v0alpha.SetTimeZoneReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetTimeZoneRes>) responseObserver);
          break;
        case METHODID_COPY_DASH_VIZ:
          serviceImpl.copyDashViz((com.tcn.cloud.api.api.v0alpha.CopyDashVizReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyDashVizRes>) responseObserver);
          break;
        case METHODID_GET_SPECIFIED_BILLING_SUMMARY:
          serviceImpl.getSpecifiedBillingSummary((com.tcn.cloud.api.api.v0alpha.GetSpecifiedBillingSummaryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary>) responseObserver);
          break;
        case METHODID_GET_BILLING_SUMMARY:
          serviceImpl.getBillingSummary((com.tcn.cloud.api.api.v0alpha.GetBillingSummaryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.BillingSummary>) responseObserver);
          break;
        case METHODID_ENABLE_CUSTOM_REPORTS:
          serviceImpl.enableCustomReports((com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>) responseObserver);
          break;
        case METHODID_DISABLE_CUSTOM_REPORTS:
          serviceImpl.disableCustomReports((com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetCustomReportsEnabledRes>) responseObserver);
          break;
        case METHODID_MAKE_ADOPTABLE:
          serviceImpl.makeAdoptable((com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>) responseObserver);
          break;
        case METHODID_MAKE_UNADOPTABLE:
          serviceImpl.makeUnadoptable((com.tcn.cloud.api.api.v0alpha.MakeAdoptableReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MakeAdoptableRes>) responseObserver);
          break;
        case METHODID_ADOPT_ANA_ACCOUNT:
          serviceImpl.adoptAnaAccount((com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>) responseObserver);
          break;
        case METHODID_DISOWN_ANA_ACCOUNT:
          serviceImpl.disownAnaAccount((com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationRes>) responseObserver);
          break;
        case METHODID_GET_ACCESSIBLE_CLIENTS:
          serviceImpl.getAccessibleClients((com.tcn.cloud.api.api.v0alpha.GetAccessibleClientsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SimpleRelations>) responseObserver);
          break;
        case METHODID_GET_FAMILY:
          serviceImpl.getFamily((com.tcn.cloud.api.api.v0alpha.GetFamilyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Family>) responseObserver);
          break;
        case METHODID_GET_ALLOWED_DATA_VISIBILITY:
          serviceImpl.getAllowedDataVisibility((com.tcn.cloud.api.api.v0alpha.GetVisibilityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility>) responseObserver);
          break;
        case METHODID_GET_CURRENT_DATA_VISIBILITY:
          serviceImpl.getCurrentDataVisibility((com.tcn.cloud.api.api.v0alpha.GetVisibilityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility>) responseObserver);
          break;
        case METHODID_GET_INDICES_VISIBILITY:
          serviceImpl.getIndicesVisibility((com.tcn.cloud.api.api.v0alpha.GetVisibilityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.IndicesVisibility>) responseObserver);
          break;
        case METHODID_GET_AUDITABLE_DATA_VISIBILITY:
          serviceImpl.getAuditableDataVisibility((com.tcn.cloud.api.api.v0alpha.GetVisibilityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DataVisibility>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION_NAMES:
          serviceImpl.getOrganizationNames((com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrganizationNamesRes>) responseObserver);
          break;
        case METHODID_GENERATE_VIZ_DATA_BY_ID:
          serviceImpl.generateVizDataById((com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GenerateVizDataByIdRes>) responseObserver);
          break;
        case METHODID_GET_CLIENT_STATUS:
          serviceImpl.getClientStatus((com.tcn.cloud.api.api.v0alpha.GetClientStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientStatusResp>) responseObserver);
          break;
        case METHODID_RELOAD_CLIENT_DATA:
          serviceImpl.reloadClientData((com.tcn.cloud.api.api.v0alpha.ReloadClientDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReloadClientDataResp>) responseObserver);
          break;
        case METHODID_LIST_VISUALIZATIONS_LEGACY:
          serviceImpl.listVisualizationsLegacy((com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVisualizationsLegacyRes>) responseObserver);
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

  private static abstract class AnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ana");
    }
  }

  private static final class AnaFileDescriptorSupplier
      extends AnaBaseDescriptorSupplier {
    AnaFileDescriptorSupplier() {}
  }

  private static final class AnaMethodDescriptorSupplier
      extends AnaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnaMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnaFileDescriptorSupplier())
              .addMethod(getGetSpecifiedVisualizationsMethod())
              .addMethod(getRegisterAccountMethod())
              .addMethod(getSetWeeksMethod())
              .addMethod(getSetDefaultTimeFilterMethod())
              .addMethod(getSetDefaultDashboardMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetSpecifiedAccountMethod())
              .addMethod(getGetAuthorizedAnalyticsLinkMethod())
              .addMethod(getGenerateMonthlyBillingMethod())
              .addMethod(getGetTimeZoneMethod())
              .addMethod(getSetTimeZoneMethod())
              .addMethod(getCopyDashVizMethod())
              .addMethod(getGetSpecifiedBillingSummaryMethod())
              .addMethod(getGetBillingSummaryMethod())
              .addMethod(getEnableCustomReportsMethod())
              .addMethod(getDisableCustomReportsMethod())
              .addMethod(getMakeAdoptableMethod())
              .addMethod(getMakeUnadoptableMethod())
              .addMethod(getAdoptAnaAccountMethod())
              .addMethod(getDisownAnaAccountMethod())
              .addMethod(getGetAccessibleClientsMethod())
              .addMethod(getGetFamilyMethod())
              .addMethod(getGetAllowedDataVisibilityMethod())
              .addMethod(getGetCurrentDataVisibilityMethod())
              .addMethod(getGetIndicesVisibilityMethod())
              .addMethod(getGetAuditableDataVisibilityMethod())
              .addMethod(getGetOrganizationNamesMethod())
              .addMethod(getGenerateVizDataByIdMethod())
              .addMethod(getGetClientStatusMethod())
              .addMethod(getReloadClientDataMethod())
              .addMethod(getListVisualizationsLegacyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
