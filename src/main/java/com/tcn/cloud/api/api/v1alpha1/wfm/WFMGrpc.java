package com.tcn.cloud.api.api.v1alpha1.wfm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/wfm/wfm.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WFMGrpc {

  private WFMGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.wfm.WFM";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> getListSkillProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkillProfiles",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> getListSkillProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> getListSkillProfilesMethod;
    if ((getListSkillProfilesMethod = WFMGrpc.getListSkillProfilesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListSkillProfilesMethod = WFMGrpc.getListSkillProfilesMethod) == null) {
          WFMGrpc.getListSkillProfilesMethod = getListSkillProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkillProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListSkillProfiles"))
              .build();
        }
      }
    }
    return getListSkillProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> getUpdateSkillProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkillProfile",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> getUpdateSkillProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> getUpdateSkillProfileMethod;
    if ((getUpdateSkillProfileMethod = WFMGrpc.getUpdateSkillProfileMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateSkillProfileMethod = WFMGrpc.getUpdateSkillProfileMethod) == null) {
          WFMGrpc.getUpdateSkillProfileMethod = getUpdateSkillProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkillProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateSkillProfile"))
              .build();
        }
      }
    }
    return getUpdateSkillProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> getUpdateSkillProfileProficienciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkillProfileProficiencies",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> getUpdateSkillProfileProficienciesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> getUpdateSkillProfileProficienciesMethod;
    if ((getUpdateSkillProfileProficienciesMethod = WFMGrpc.getUpdateSkillProfileProficienciesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateSkillProfileProficienciesMethod = WFMGrpc.getUpdateSkillProfileProficienciesMethod) == null) {
          WFMGrpc.getUpdateSkillProfileProficienciesMethod = getUpdateSkillProfileProficienciesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkillProfileProficiencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateSkillProfileProficiencies"))
              .build();
        }
      }
    }
    return getUpdateSkillProfileProficienciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> getGetSkillProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkillProfile",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> getGetSkillProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> getGetSkillProfileMethod;
    if ((getGetSkillProfileMethod = WFMGrpc.getGetSkillProfileMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetSkillProfileMethod = WFMGrpc.getGetSkillProfileMethod) == null) {
          WFMGrpc.getGetSkillProfileMethod = getGetSkillProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkillProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetSkillProfile"))
              .build();
        }
      }
    }
    return getGetSkillProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> getResyncSkillProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResyncSkillProfiles",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> getResyncSkillProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> getResyncSkillProfilesMethod;
    if ((getResyncSkillProfilesMethod = WFMGrpc.getResyncSkillProfilesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getResyncSkillProfilesMethod = WFMGrpc.getResyncSkillProfilesMethod) == null) {
          WFMGrpc.getResyncSkillProfilesMethod = getResyncSkillProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResyncSkillProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ResyncSkillProfiles"))
              .build();
        }
      }
    }
    return getResyncSkillProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> getGetLastSkillProfileResyncDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastSkillProfileResyncDate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> getGetLastSkillProfileResyncDateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> getGetLastSkillProfileResyncDateMethod;
    if ((getGetLastSkillProfileResyncDateMethod = WFMGrpc.getGetLastSkillProfileResyncDateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetLastSkillProfileResyncDateMethod = WFMGrpc.getGetLastSkillProfileResyncDateMethod) == null) {
          WFMGrpc.getGetLastSkillProfileResyncDateMethod = getGetLastSkillProfileResyncDateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastSkillProfileResyncDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetLastSkillProfileResyncDate"))
              .build();
        }
      }
    }
    return getGetLastSkillProfileResyncDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> getUpsertForecastingParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertForecastingParameters",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> getUpsertForecastingParametersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> getUpsertForecastingParametersMethod;
    if ((getUpsertForecastingParametersMethod = WFMGrpc.getUpsertForecastingParametersMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertForecastingParametersMethod = WFMGrpc.getUpsertForecastingParametersMethod) == null) {
          WFMGrpc.getUpsertForecastingParametersMethod = getUpsertForecastingParametersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertForecastingParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertForecastingParameters"))
              .build();
        }
      }
    }
    return getUpsertForecastingParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> getGetForecastingParametersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetForecastingParameters",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> getGetForecastingParametersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> getGetForecastingParametersMethod;
    if ((getGetForecastingParametersMethod = WFMGrpc.getGetForecastingParametersMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetForecastingParametersMethod = WFMGrpc.getGetForecastingParametersMethod) == null) {
          WFMGrpc.getGetForecastingParametersMethod = getGetForecastingParametersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetForecastingParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetForecastingParameters"))
              .build();
        }
      }
    }
    return getGetForecastingParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> getListHistoricalDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistoricalData",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> getListHistoricalDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> getListHistoricalDataMethod;
    if ((getListHistoricalDataMethod = WFMGrpc.getListHistoricalDataMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListHistoricalDataMethod = WFMGrpc.getListHistoricalDataMethod) == null) {
          WFMGrpc.getListHistoricalDataMethod = getListHistoricalDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistoricalData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListHistoricalData"))
              .build();
        }
      }
    }
    return getListHistoricalDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> getUpsertHistoricalDataDeltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertHistoricalDataDelta",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> getUpsertHistoricalDataDeltaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> getUpsertHistoricalDataDeltaMethod;
    if ((getUpsertHistoricalDataDeltaMethod = WFMGrpc.getUpsertHistoricalDataDeltaMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertHistoricalDataDeltaMethod = WFMGrpc.getUpsertHistoricalDataDeltaMethod) == null) {
          WFMGrpc.getUpsertHistoricalDataDeltaMethod = getUpsertHistoricalDataDeltaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertHistoricalDataDelta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertHistoricalDataDelta"))
              .build();
        }
      }
    }
    return getUpsertHistoricalDataDeltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> getUpsertHistoricalDataDeltasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertHistoricalDataDeltas",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> getUpsertHistoricalDataDeltasMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> getUpsertHistoricalDataDeltasMethod;
    if ((getUpsertHistoricalDataDeltasMethod = WFMGrpc.getUpsertHistoricalDataDeltasMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertHistoricalDataDeltasMethod = WFMGrpc.getUpsertHistoricalDataDeltasMethod) == null) {
          WFMGrpc.getUpsertHistoricalDataDeltasMethod = getUpsertHistoricalDataDeltasMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertHistoricalDataDeltas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertHistoricalDataDeltas"))
              .build();
        }
      }
    }
    return getUpsertHistoricalDataDeltasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> getListSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkills",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> getListSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> getListSkillsMethod;
    if ((getListSkillsMethod = WFMGrpc.getListSkillsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListSkillsMethod = WFMGrpc.getListSkillsMethod) == null) {
          WFMGrpc.getListSkillsMethod = getListSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListSkills"))
              .build();
        }
      }
    }
    return getListSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> getBuildCallProfileTemplateForSkillProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildCallProfileTemplateForSkillProfile",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> getBuildCallProfileTemplateForSkillProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> getBuildCallProfileTemplateForSkillProfileMethod;
    if ((getBuildCallProfileTemplateForSkillProfileMethod = WFMGrpc.getBuildCallProfileTemplateForSkillProfileMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildCallProfileTemplateForSkillProfileMethod = WFMGrpc.getBuildCallProfileTemplateForSkillProfileMethod) == null) {
          WFMGrpc.getBuildCallProfileTemplateForSkillProfileMethod = getBuildCallProfileTemplateForSkillProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildCallProfileTemplateForSkillProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildCallProfileTemplateForSkillProfile"))
              .build();
        }
      }
    }
    return getBuildCallProfileTemplateForSkillProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> getCreateInactiveSkillProfileMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInactiveSkillProfileMapping",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> getCreateInactiveSkillProfileMappingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> getCreateInactiveSkillProfileMappingMethod;
    if ((getCreateInactiveSkillProfileMappingMethod = WFMGrpc.getCreateInactiveSkillProfileMappingMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateInactiveSkillProfileMappingMethod = WFMGrpc.getCreateInactiveSkillProfileMappingMethod) == null) {
          WFMGrpc.getCreateInactiveSkillProfileMappingMethod = getCreateInactiveSkillProfileMappingMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInactiveSkillProfileMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateInactiveSkillProfileMapping"))
              .build();
        }
      }
    }
    return getCreateInactiveSkillProfileMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> getGetAvailableRegressionForecasterModelTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableRegressionForecasterModelTypes",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> getGetAvailableRegressionForecasterModelTypesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> getGetAvailableRegressionForecasterModelTypesMethod;
    if ((getGetAvailableRegressionForecasterModelTypesMethod = WFMGrpc.getGetAvailableRegressionForecasterModelTypesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetAvailableRegressionForecasterModelTypesMethod = WFMGrpc.getGetAvailableRegressionForecasterModelTypesMethod) == null) {
          WFMGrpc.getGetAvailableRegressionForecasterModelTypesMethod = getGetAvailableRegressionForecasterModelTypesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableRegressionForecasterModelTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetAvailableRegressionForecasterModelTypes"))
              .build();
        }
      }
    }
    return getGetAvailableRegressionForecasterModelTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> getDisconnectInactiveSkillProfileMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisconnectInactiveSkillProfileMapping",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> getDisconnectInactiveSkillProfileMappingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq, com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> getDisconnectInactiveSkillProfileMappingMethod;
    if ((getDisconnectInactiveSkillProfileMappingMethod = WFMGrpc.getDisconnectInactiveSkillProfileMappingMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDisconnectInactiveSkillProfileMappingMethod = WFMGrpc.getDisconnectInactiveSkillProfileMappingMethod) == null) {
          WFMGrpc.getDisconnectInactiveSkillProfileMappingMethod = getDisconnectInactiveSkillProfileMappingMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq, com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisconnectInactiveSkillProfileMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DisconnectInactiveSkillProfileMapping"))
              .build();
        }
      }
    }
    return getDisconnectInactiveSkillProfileMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> getDeleteHistoricalDataDeltasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHistoricalDataDeltas",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> getDeleteHistoricalDataDeltasMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> getDeleteHistoricalDataDeltasMethod;
    if ((getDeleteHistoricalDataDeltasMethod = WFMGrpc.getDeleteHistoricalDataDeltasMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteHistoricalDataDeltasMethod = WFMGrpc.getDeleteHistoricalDataDeltasMethod) == null) {
          WFMGrpc.getDeleteHistoricalDataDeltasMethod = getDeleteHistoricalDataDeltasMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHistoricalDataDeltas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteHistoricalDataDeltas"))
              .build();
        }
      }
    }
    return getDeleteHistoricalDataDeltasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> getListTopSkillProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTopSkillProfiles",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> getListTopSkillProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> getListTopSkillProfilesMethod;
    if ((getListTopSkillProfilesMethod = WFMGrpc.getListTopSkillProfilesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListTopSkillProfilesMethod = WFMGrpc.getListTopSkillProfilesMethod) == null) {
          WFMGrpc.getListTopSkillProfilesMethod = getListTopSkillProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTopSkillProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListTopSkillProfiles"))
              .build();
        }
      }
    }
    return getListTopSkillProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> getGetSkillProfilesCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkillProfilesCount",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> getGetSkillProfilesCountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> getGetSkillProfilesCountMethod;
    if ((getGetSkillProfilesCountMethod = WFMGrpc.getGetSkillProfilesCountMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetSkillProfilesCountMethod = WFMGrpc.getGetSkillProfilesCountMethod) == null) {
          WFMGrpc.getGetSkillProfilesCountMethod = getGetSkillProfilesCountMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkillProfilesCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetSkillProfilesCount"))
              .build();
        }
      }
    }
    return getGetSkillProfilesCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildProfileForecastByIntervalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildProfileForecastByInterval",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildProfileForecastByIntervalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildProfileForecastByIntervalMethod;
    if ((getBuildProfileForecastByIntervalMethod = WFMGrpc.getBuildProfileForecastByIntervalMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildProfileForecastByIntervalMethod = WFMGrpc.getBuildProfileForecastByIntervalMethod) == null) {
          WFMGrpc.getBuildProfileForecastByIntervalMethod = getBuildProfileForecastByIntervalMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildProfileForecastByInterval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildProfileForecastByInterval"))
              .build();
        }
      }
    }
    return getBuildProfileForecastByIntervalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> getBuildProfileForecastByIntervalWithStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildProfileForecastByIntervalWithStats",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> getBuildProfileForecastByIntervalWithStatsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> getBuildProfileForecastByIntervalWithStatsMethod;
    if ((getBuildProfileForecastByIntervalWithStatsMethod = WFMGrpc.getBuildProfileForecastByIntervalWithStatsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildProfileForecastByIntervalWithStatsMethod = WFMGrpc.getBuildProfileForecastByIntervalWithStatsMethod) == null) {
          WFMGrpc.getBuildProfileForecastByIntervalWithStatsMethod = getBuildProfileForecastByIntervalWithStatsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildProfileForecastByIntervalWithStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildProfileForecastByIntervalWithStats"))
              .build();
        }
      }
    }
    return getBuildProfileForecastByIntervalWithStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> getUpsertProfileForecastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertProfileForecast",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> getUpsertProfileForecastMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> getUpsertProfileForecastMethod;
    if ((getUpsertProfileForecastMethod = WFMGrpc.getUpsertProfileForecastMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertProfileForecastMethod = WFMGrpc.getUpsertProfileForecastMethod) == null) {
          WFMGrpc.getUpsertProfileForecastMethod = getUpsertProfileForecastMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertProfileForecast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertProfileForecast"))
              .build();
        }
      }
    }
    return getUpsertProfileForecastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> getCreateCallProfileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCallProfileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> getCreateCallProfileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> getCreateCallProfileTemplateMethod;
    if ((getCreateCallProfileTemplateMethod = WFMGrpc.getCreateCallProfileTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateCallProfileTemplateMethod = WFMGrpc.getCreateCallProfileTemplateMethod) == null) {
          WFMGrpc.getCreateCallProfileTemplateMethod = getCreateCallProfileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCallProfileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateCallProfileTemplate"))
              .build();
        }
      }
    }
    return getCreateCallProfileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> getDeleteCallProfileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCallProfileTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> getDeleteCallProfileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> getDeleteCallProfileTemplateMethod;
    if ((getDeleteCallProfileTemplateMethod = WFMGrpc.getDeleteCallProfileTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteCallProfileTemplateMethod = WFMGrpc.getDeleteCallProfileTemplateMethod) == null) {
          WFMGrpc.getDeleteCallProfileTemplateMethod = getDeleteCallProfileTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCallProfileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteCallProfileTemplate"))
              .build();
        }
      }
    }
    return getDeleteCallProfileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> getCreateRegressionTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRegressionTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> getCreateRegressionTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> getCreateRegressionTemplateMethod;
    if ((getCreateRegressionTemplateMethod = WFMGrpc.getCreateRegressionTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateRegressionTemplateMethod = WFMGrpc.getCreateRegressionTemplateMethod) == null) {
          WFMGrpc.getCreateRegressionTemplateMethod = getCreateRegressionTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRegressionTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateRegressionTemplate"))
              .build();
        }
      }
    }
    return getCreateRegressionTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> getDeleteRegressionTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRegressionTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> getDeleteRegressionTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> getDeleteRegressionTemplateMethod;
    if ((getDeleteRegressionTemplateMethod = WFMGrpc.getDeleteRegressionTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteRegressionTemplateMethod = WFMGrpc.getDeleteRegressionTemplateMethod) == null) {
          WFMGrpc.getDeleteRegressionTemplateMethod = getDeleteRegressionTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRegressionTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteRegressionTemplate"))
              .build();
        }
      }
    }
    return getDeleteRegressionTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> getListRegressionTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegressionTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> getListRegressionTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> getListRegressionTemplatesMethod;
    if ((getListRegressionTemplatesMethod = WFMGrpc.getListRegressionTemplatesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListRegressionTemplatesMethod = WFMGrpc.getListRegressionTemplatesMethod) == null) {
          WFMGrpc.getListRegressionTemplatesMethod = getListRegressionTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegressionTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListRegressionTemplates"))
              .build();
        }
      }
    }
    return getListRegressionTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getListForecastIntervalsForSkillProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListForecastIntervalsForSkillProfile",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getListForecastIntervalsForSkillProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getListForecastIntervalsForSkillProfileMethod;
    if ((getListForecastIntervalsForSkillProfileMethod = WFMGrpc.getListForecastIntervalsForSkillProfileMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListForecastIntervalsForSkillProfileMethod = WFMGrpc.getListForecastIntervalsForSkillProfileMethod) == null) {
          WFMGrpc.getListForecastIntervalsForSkillProfileMethod = getListForecastIntervalsForSkillProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListForecastIntervalsForSkillProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListForecastIntervalsForSkillProfile"))
              .build();
        }
      }
    }
    return getListForecastIntervalsForSkillProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildRegressionForecastByIntervalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildRegressionForecastByInterval",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildRegressionForecastByIntervalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> getBuildRegressionForecastByIntervalMethod;
    if ((getBuildRegressionForecastByIntervalMethod = WFMGrpc.getBuildRegressionForecastByIntervalMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildRegressionForecastByIntervalMethod = WFMGrpc.getBuildRegressionForecastByIntervalMethod) == null) {
          WFMGrpc.getBuildRegressionForecastByIntervalMethod = getBuildRegressionForecastByIntervalMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq, com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildRegressionForecastByInterval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildRegressionForecastByInterval"))
              .build();
        }
      }
    }
    return getBuildRegressionForecastByIntervalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> getBuildRegressionForecastByIntervalWithStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildRegressionForecastByIntervalWithStats",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> getBuildRegressionForecastByIntervalWithStatsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> getBuildRegressionForecastByIntervalWithStatsMethod;
    if ((getBuildRegressionForecastByIntervalWithStatsMethod = WFMGrpc.getBuildRegressionForecastByIntervalWithStatsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildRegressionForecastByIntervalWithStatsMethod = WFMGrpc.getBuildRegressionForecastByIntervalWithStatsMethod) == null) {
          WFMGrpc.getBuildRegressionForecastByIntervalWithStatsMethod = getBuildRegressionForecastByIntervalWithStatsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildRegressionForecastByIntervalWithStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildRegressionForecastByIntervalWithStats"))
              .build();
        }
      }
    }
    return getBuildRegressionForecastByIntervalWithStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> getListCallProfileTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallProfileTemplates",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> getListCallProfileTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> getListCallProfileTemplatesMethod;
    if ((getListCallProfileTemplatesMethod = WFMGrpc.getListCallProfileTemplatesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListCallProfileTemplatesMethod = WFMGrpc.getListCallProfileTemplatesMethod) == null) {
          WFMGrpc.getListCallProfileTemplatesMethod = getListCallProfileTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCallProfileTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListCallProfileTemplates"))
              .build();
        }
      }
    }
    return getListCallProfileTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> getUpsertRegressionForecastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertRegressionForecast",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> getUpsertRegressionForecastMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> getUpsertRegressionForecastMethod;
    if ((getUpsertRegressionForecastMethod = WFMGrpc.getUpsertRegressionForecastMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertRegressionForecastMethod = WFMGrpc.getUpsertRegressionForecastMethod) == null) {
          WFMGrpc.getUpsertRegressionForecastMethod = getUpsertRegressionForecastMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertRegressionForecast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertRegressionForecast"))
              .build();
        }
      }
    }
    return getUpsertRegressionForecastMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> getUpsertForecastDataDeltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertForecastDataDelta",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> getUpsertForecastDataDeltaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> getUpsertForecastDataDeltaMethod;
    if ((getUpsertForecastDataDeltaMethod = WFMGrpc.getUpsertForecastDataDeltaMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertForecastDataDeltaMethod = WFMGrpc.getUpsertForecastDataDeltaMethod) == null) {
          WFMGrpc.getUpsertForecastDataDeltaMethod = getUpsertForecastDataDeltaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertForecastDataDelta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertForecastDataDelta"))
              .build();
        }
      }
    }
    return getUpsertForecastDataDeltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> getUpsertForecastDataDeltasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertForecastDataDeltas",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> getUpsertForecastDataDeltasMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> getUpsertForecastDataDeltasMethod;
    if ((getUpsertForecastDataDeltasMethod = WFMGrpc.getUpsertForecastDataDeltasMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertForecastDataDeltasMethod = WFMGrpc.getUpsertForecastDataDeltasMethod) == null) {
          WFMGrpc.getUpsertForecastDataDeltasMethod = getUpsertForecastDataDeltasMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertForecastDataDeltas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertForecastDataDeltas"))
              .build();
        }
      }
    }
    return getUpsertForecastDataDeltasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> getDeleteForecastIntervalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteForecastIntervals",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> getDeleteForecastIntervalsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> getDeleteForecastIntervalsMethod;
    if ((getDeleteForecastIntervalsMethod = WFMGrpc.getDeleteForecastIntervalsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteForecastIntervalsMethod = WFMGrpc.getDeleteForecastIntervalsMethod) == null) {
          WFMGrpc.getDeleteForecastIntervalsMethod = getDeleteForecastIntervalsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteForecastIntervals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteForecastIntervals"))
              .build();
        }
      }
    }
    return getDeleteForecastIntervalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> getListHistoricalDataForAllSkillProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistoricalDataForAllSkillProfiles",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> getListHistoricalDataForAllSkillProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> getListHistoricalDataForAllSkillProfilesMethod;
    if ((getListHistoricalDataForAllSkillProfilesMethod = WFMGrpc.getListHistoricalDataForAllSkillProfilesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListHistoricalDataForAllSkillProfilesMethod = WFMGrpc.getListHistoricalDataForAllSkillProfilesMethod) == null) {
          WFMGrpc.getListHistoricalDataForAllSkillProfilesMethod = getListHistoricalDataForAllSkillProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistoricalDataForAllSkillProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListHistoricalDataForAllSkillProfiles"))
              .build();
        }
      }
    }
    return getListHistoricalDataForAllSkillProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> getBuildDOWAndMOYProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildDOWAndMOYProfiles",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> getBuildDOWAndMOYProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> getBuildDOWAndMOYProfilesMethod;
    if ((getBuildDOWAndMOYProfilesMethod = WFMGrpc.getBuildDOWAndMOYProfilesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildDOWAndMOYProfilesMethod = WFMGrpc.getBuildDOWAndMOYProfilesMethod) == null) {
          WFMGrpc.getBuildDOWAndMOYProfilesMethod = getBuildDOWAndMOYProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildDOWAndMOYProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildDOWAndMOYProfiles"))
              .build();
        }
      }
    }
    return getBuildDOWAndMOYProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> getCalculateTrainingDataAveragesForSkillProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateTrainingDataAveragesForSkillProfile",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> getCalculateTrainingDataAveragesForSkillProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> getCalculateTrainingDataAveragesForSkillProfileMethod;
    if ((getCalculateTrainingDataAveragesForSkillProfileMethod = WFMGrpc.getCalculateTrainingDataAveragesForSkillProfileMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCalculateTrainingDataAveragesForSkillProfileMethod = WFMGrpc.getCalculateTrainingDataAveragesForSkillProfileMethod) == null) {
          WFMGrpc.getCalculateTrainingDataAveragesForSkillProfileMethod = getCalculateTrainingDataAveragesForSkillProfileMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq, com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateTrainingDataAveragesForSkillProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CalculateTrainingDataAveragesForSkillProfile"))
              .build();
        }
      }
    }
    return getCalculateTrainingDataAveragesForSkillProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> getUpdateSkillProfileAveragesUsingHistoricalDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkillProfileAveragesUsingHistoricalData",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> getUpdateSkillProfileAveragesUsingHistoricalDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> getUpdateSkillProfileAveragesUsingHistoricalDataMethod;
    if ((getUpdateSkillProfileAveragesUsingHistoricalDataMethod = WFMGrpc.getUpdateSkillProfileAveragesUsingHistoricalDataMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateSkillProfileAveragesUsingHistoricalDataMethod = WFMGrpc.getUpdateSkillProfileAveragesUsingHistoricalDataMethod) == null) {
          WFMGrpc.getUpdateSkillProfileAveragesUsingHistoricalDataMethod = getUpdateSkillProfileAveragesUsingHistoricalDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkillProfileAveragesUsingHistoricalData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateSkillProfileAveragesUsingHistoricalData"))
              .build();
        }
      }
    }
    return getUpdateSkillProfileAveragesUsingHistoricalDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> getUpdateCallCenterNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCallCenterNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> getUpdateCallCenterNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> getUpdateCallCenterNodeMethod;
    if ((getUpdateCallCenterNodeMethod = WFMGrpc.getUpdateCallCenterNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateCallCenterNodeMethod = WFMGrpc.getUpdateCallCenterNodeMethod) == null) {
          WFMGrpc.getUpdateCallCenterNodeMethod = getUpdateCallCenterNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCallCenterNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateCallCenterNode"))
              .build();
        }
      }
    }
    return getUpdateCallCenterNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> getCreateClientNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClientNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> getCreateClientNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> getCreateClientNodeMethod;
    if ((getCreateClientNodeMethod = WFMGrpc.getCreateClientNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateClientNodeMethod = WFMGrpc.getCreateClientNodeMethod) == null) {
          WFMGrpc.getCreateClientNodeMethod = getCreateClientNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateClientNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateClientNode"))
              .build();
        }
      }
    }
    return getCreateClientNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> getUpdateClientNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClientNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> getUpdateClientNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> getUpdateClientNodeMethod;
    if ((getUpdateClientNodeMethod = WFMGrpc.getUpdateClientNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateClientNodeMethod = WFMGrpc.getUpdateClientNodeMethod) == null) {
          WFMGrpc.getUpdateClientNodeMethod = getUpdateClientNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateClientNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateClientNode"))
              .build();
        }
      }
    }
    return getUpdateClientNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> getCreateLocationNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLocationNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> getCreateLocationNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> getCreateLocationNodeMethod;
    if ((getCreateLocationNodeMethod = WFMGrpc.getCreateLocationNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateLocationNodeMethod = WFMGrpc.getCreateLocationNodeMethod) == null) {
          WFMGrpc.getCreateLocationNodeMethod = getCreateLocationNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLocationNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateLocationNode"))
              .build();
        }
      }
    }
    return getCreateLocationNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> getUpdateLocationNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLocationNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> getUpdateLocationNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> getUpdateLocationNodeMethod;
    if ((getUpdateLocationNodeMethod = WFMGrpc.getUpdateLocationNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateLocationNodeMethod = WFMGrpc.getUpdateLocationNodeMethod) == null) {
          WFMGrpc.getUpdateLocationNodeMethod = getUpdateLocationNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLocationNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateLocationNode"))
              .build();
        }
      }
    }
    return getUpdateLocationNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> getCreateProgramNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProgramNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> getCreateProgramNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> getCreateProgramNodeMethod;
    if ((getCreateProgramNodeMethod = WFMGrpc.getCreateProgramNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateProgramNodeMethod = WFMGrpc.getCreateProgramNodeMethod) == null) {
          WFMGrpc.getCreateProgramNodeMethod = getCreateProgramNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProgramNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateProgramNode"))
              .build();
        }
      }
    }
    return getCreateProgramNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> getUpdateProgramNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProgramNode",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> getUpdateProgramNodeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> getUpdateProgramNodeMethod;
    if ((getUpdateProgramNodeMethod = WFMGrpc.getUpdateProgramNodeMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateProgramNodeMethod = WFMGrpc.getUpdateProgramNodeMethod) == null) {
          WFMGrpc.getUpdateProgramNodeMethod = getUpdateProgramNodeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProgramNode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateProgramNode"))
              .build();
        }
      }
    }
    return getUpdateProgramNodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> getCreateConstraintRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConstraintRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> getCreateConstraintRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> getCreateConstraintRuleMethod;
    if ((getCreateConstraintRuleMethod = WFMGrpc.getCreateConstraintRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateConstraintRuleMethod = WFMGrpc.getCreateConstraintRuleMethod) == null) {
          WFMGrpc.getCreateConstraintRuleMethod = getCreateConstraintRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConstraintRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateConstraintRule"))
              .build();
        }
      }
    }
    return getCreateConstraintRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> getUpdateConstraintRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConstraintRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> getUpdateConstraintRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> getUpdateConstraintRuleMethod;
    if ((getUpdateConstraintRuleMethod = WFMGrpc.getUpdateConstraintRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateConstraintRuleMethod = WFMGrpc.getUpdateConstraintRuleMethod) == null) {
          WFMGrpc.getUpdateConstraintRuleMethod = getUpdateConstraintRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConstraintRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateConstraintRule"))
              .build();
        }
      }
    }
    return getUpdateConstraintRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> getDeleteConstraintRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConstraintRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> getDeleteConstraintRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> getDeleteConstraintRuleMethod;
    if ((getDeleteConstraintRuleMethod = WFMGrpc.getDeleteConstraintRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteConstraintRuleMethod = WFMGrpc.getDeleteConstraintRuleMethod) == null) {
          WFMGrpc.getDeleteConstraintRuleMethod = getDeleteConstraintRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConstraintRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteConstraintRule"))
              .build();
        }
      }
    }
    return getDeleteConstraintRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> getCreateNonSkillActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNonSkillActivity",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> getCreateNonSkillActivityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> getCreateNonSkillActivityMethod;
    if ((getCreateNonSkillActivityMethod = WFMGrpc.getCreateNonSkillActivityMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateNonSkillActivityMethod = WFMGrpc.getCreateNonSkillActivityMethod) == null) {
          WFMGrpc.getCreateNonSkillActivityMethod = getCreateNonSkillActivityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNonSkillActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateNonSkillActivity"))
              .build();
        }
      }
    }
    return getCreateNonSkillActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> getUpdateNonSkillActivityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNonSkillActivity",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> getUpdateNonSkillActivityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> getUpdateNonSkillActivityMethod;
    if ((getUpdateNonSkillActivityMethod = WFMGrpc.getUpdateNonSkillActivityMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateNonSkillActivityMethod = WFMGrpc.getUpdateNonSkillActivityMethod) == null) {
          WFMGrpc.getUpdateNonSkillActivityMethod = getUpdateNonSkillActivityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNonSkillActivity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateNonSkillActivity"))
              .build();
        }
      }
    }
    return getUpdateNonSkillActivityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> getListNonSkillActivitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNonSkillActivities",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> getListNonSkillActivitiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> getListNonSkillActivitiesMethod;
    if ((getListNonSkillActivitiesMethod = WFMGrpc.getListNonSkillActivitiesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListNonSkillActivitiesMethod = WFMGrpc.getListNonSkillActivitiesMethod) == null) {
          WFMGrpc.getListNonSkillActivitiesMethod = getListNonSkillActivitiesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNonSkillActivities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListNonSkillActivities"))
              .build();
        }
      }
    }
    return getListNonSkillActivitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> getListNonSkillActivityAssociationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNonSkillActivityAssociations",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> getListNonSkillActivityAssociationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> getListNonSkillActivityAssociationsMethod;
    if ((getListNonSkillActivityAssociationsMethod = WFMGrpc.getListNonSkillActivityAssociationsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListNonSkillActivityAssociationsMethod = WFMGrpc.getListNonSkillActivityAssociationsMethod) == null) {
          WFMGrpc.getListNonSkillActivityAssociationsMethod = getListNonSkillActivityAssociationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNonSkillActivityAssociations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListNonSkillActivityAssociations"))
              .build();
        }
      }
    }
    return getListNonSkillActivityAssociationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> getListCandidateSchedulingActivitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCandidateSchedulingActivities",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> getListCandidateSchedulingActivitiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> getListCandidateSchedulingActivitiesMethod;
    if ((getListCandidateSchedulingActivitiesMethod = WFMGrpc.getListCandidateSchedulingActivitiesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListCandidateSchedulingActivitiesMethod = WFMGrpc.getListCandidateSchedulingActivitiesMethod) == null) {
          WFMGrpc.getListCandidateSchedulingActivitiesMethod = getListCandidateSchedulingActivitiesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCandidateSchedulingActivities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListCandidateSchedulingActivities"))
              .build();
        }
      }
    }
    return getListCandidateSchedulingActivitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> getCreateAgentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> getCreateAgentGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> getCreateAgentGroupMethod;
    if ((getCreateAgentGroupMethod = WFMGrpc.getCreateAgentGroupMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateAgentGroupMethod = WFMGrpc.getCreateAgentGroupMethod) == null) {
          WFMGrpc.getCreateAgentGroupMethod = getCreateAgentGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateAgentGroup"))
              .build();
        }
      }
    }
    return getCreateAgentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> getUpdateAgentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> getUpdateAgentGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> getUpdateAgentGroupMethod;
    if ((getUpdateAgentGroupMethod = WFMGrpc.getUpdateAgentGroupMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateAgentGroupMethod = WFMGrpc.getUpdateAgentGroupMethod) == null) {
          WFMGrpc.getUpdateAgentGroupMethod = getUpdateAgentGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateAgentGroup"))
              .build();
        }
      }
    }
    return getUpdateAgentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> getUpdateWFMAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWFMAgent",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> getUpdateWFMAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> getUpdateWFMAgentMethod;
    if ((getUpdateWFMAgentMethod = WFMGrpc.getUpdateWFMAgentMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateWFMAgentMethod = WFMGrpc.getUpdateWFMAgentMethod) == null) {
          WFMGrpc.getUpdateWFMAgentMethod = getUpdateWFMAgentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWFMAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateWFMAgent"))
              .build();
        }
      }
    }
    return getUpdateWFMAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> getListAllWFMAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllWFMAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> getListAllWFMAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> getListAllWFMAgentsMethod;
    if ((getListAllWFMAgentsMethod = WFMGrpc.getListAllWFMAgentsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListAllWFMAgentsMethod = WFMGrpc.getListAllWFMAgentsMethod) == null) {
          WFMGrpc.getListAllWFMAgentsMethod = getListAllWFMAgentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllWFMAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListAllWFMAgents"))
              .build();
        }
      }
    }
    return getListAllWFMAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> getListCandidateWFMAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCandidateWFMAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> getListCandidateWFMAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> getListCandidateWFMAgentsMethod;
    if ((getListCandidateWFMAgentsMethod = WFMGrpc.getListCandidateWFMAgentsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListCandidateWFMAgentsMethod = WFMGrpc.getListCandidateWFMAgentsMethod) == null) {
          WFMGrpc.getListCandidateWFMAgentsMethod = getListCandidateWFMAgentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCandidateWFMAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListCandidateWFMAgents"))
              .build();
        }
      }
    }
    return getListCandidateWFMAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> getListUngroupedWFMAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUngroupedWFMAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> getListUngroupedWFMAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> getListUngroupedWFMAgentsMethod;
    if ((getListUngroupedWFMAgentsMethod = WFMGrpc.getListUngroupedWFMAgentsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListUngroupedWFMAgentsMethod = WFMGrpc.getListUngroupedWFMAgentsMethod) == null) {
          WFMGrpc.getListUngroupedWFMAgentsMethod = getListUngroupedWFMAgentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUngroupedWFMAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListUngroupedWFMAgents"))
              .build();
        }
      }
    }
    return getListUngroupedWFMAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> getListWFMAgentsAssociatedWithAgentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWFMAgentsAssociatedWithAgentGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> getListWFMAgentsAssociatedWithAgentGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> getListWFMAgentsAssociatedWithAgentGroupMethod;
    if ((getListWFMAgentsAssociatedWithAgentGroupMethod = WFMGrpc.getListWFMAgentsAssociatedWithAgentGroupMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListWFMAgentsAssociatedWithAgentGroupMethod = WFMGrpc.getListWFMAgentsAssociatedWithAgentGroupMethod) == null) {
          WFMGrpc.getListWFMAgentsAssociatedWithAgentGroupMethod = getListWFMAgentsAssociatedWithAgentGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWFMAgentsAssociatedWithAgentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListWFMAgentsAssociatedWithAgentGroup"))
              .build();
        }
      }
    }
    return getListWFMAgentsAssociatedWithAgentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> getCreateWFMAgentMembershipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWFMAgentMemberships",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> getCreateWFMAgentMembershipsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> getCreateWFMAgentMembershipsMethod;
    if ((getCreateWFMAgentMembershipsMethod = WFMGrpc.getCreateWFMAgentMembershipsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateWFMAgentMembershipsMethod = WFMGrpc.getCreateWFMAgentMembershipsMethod) == null) {
          WFMGrpc.getCreateWFMAgentMembershipsMethod = getCreateWFMAgentMembershipsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWFMAgentMemberships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateWFMAgentMemberships"))
              .build();
        }
      }
    }
    return getCreateWFMAgentMembershipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> getDeleteWFMAgentMembershipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWFMAgentMemberships",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> getDeleteWFMAgentMembershipsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> getDeleteWFMAgentMembershipsMethod;
    if ((getDeleteWFMAgentMembershipsMethod = WFMGrpc.getDeleteWFMAgentMembershipsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteWFMAgentMembershipsMethod = WFMGrpc.getDeleteWFMAgentMembershipsMethod) == null) {
          WFMGrpc.getDeleteWFMAgentMembershipsMethod = getDeleteWFMAgentMembershipsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWFMAgentMemberships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteWFMAgentMemberships"))
              .build();
        }
      }
    }
    return getDeleteWFMAgentMembershipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> getDeleteWFMAgentsMembershipsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWFMAgentsMemberships",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> getDeleteWFMAgentsMembershipsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> getDeleteWFMAgentsMembershipsMethod;
    if ((getDeleteWFMAgentsMembershipsMethod = WFMGrpc.getDeleteWFMAgentsMembershipsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteWFMAgentsMembershipsMethod = WFMGrpc.getDeleteWFMAgentsMembershipsMethod) == null) {
          WFMGrpc.getDeleteWFMAgentsMembershipsMethod = getDeleteWFMAgentsMembershipsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWFMAgentsMemberships"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteWFMAgentsMemberships"))
              .build();
        }
      }
    }
    return getDeleteWFMAgentsMembershipsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> getBuildAgentDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildAgentDiagnostics",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> getBuildAgentDiagnosticsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> getBuildAgentDiagnosticsMethod;
    if ((getBuildAgentDiagnosticsMethod = WFMGrpc.getBuildAgentDiagnosticsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildAgentDiagnosticsMethod = WFMGrpc.getBuildAgentDiagnosticsMethod) == null) {
          WFMGrpc.getBuildAgentDiagnosticsMethod = getBuildAgentDiagnosticsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildAgentDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildAgentDiagnostics"))
              .build();
        }
      }
    }
    return getBuildAgentDiagnosticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> getCreateShiftTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShiftTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> getCreateShiftTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> getCreateShiftTemplateMethod;
    if ((getCreateShiftTemplateMethod = WFMGrpc.getCreateShiftTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateShiftTemplateMethod = WFMGrpc.getCreateShiftTemplateMethod) == null) {
          WFMGrpc.getCreateShiftTemplateMethod = getCreateShiftTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShiftTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateShiftTemplate"))
              .build();
        }
      }
    }
    return getCreateShiftTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> getUpdateShiftTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShiftTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> getUpdateShiftTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> getUpdateShiftTemplateMethod;
    if ((getUpdateShiftTemplateMethod = WFMGrpc.getUpdateShiftTemplateMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateShiftTemplateMethod = WFMGrpc.getUpdateShiftTemplateMethod) == null) {
          WFMGrpc.getUpdateShiftTemplateMethod = getUpdateShiftTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateShiftTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateShiftTemplate"))
              .build();
        }
      }
    }
    return getUpdateShiftTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> getListShiftTemplatesBySidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShiftTemplatesBySids",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> getListShiftTemplatesBySidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> getListShiftTemplatesBySidsMethod;
    if ((getListShiftTemplatesBySidsMethod = WFMGrpc.getListShiftTemplatesBySidsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListShiftTemplatesBySidsMethod = WFMGrpc.getListShiftTemplatesBySidsMethod) == null) {
          WFMGrpc.getListShiftTemplatesBySidsMethod = getListShiftTemplatesBySidsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShiftTemplatesBySids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListShiftTemplatesBySids"))
              .build();
        }
      }
    }
    return getListShiftTemplatesBySidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> getBuildShiftTemplateDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildShiftTemplateDiagnostics",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> getBuildShiftTemplateDiagnosticsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> getBuildShiftTemplateDiagnosticsMethod;
    if ((getBuildShiftTemplateDiagnosticsMethod = WFMGrpc.getBuildShiftTemplateDiagnosticsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildShiftTemplateDiagnosticsMethod = WFMGrpc.getBuildShiftTemplateDiagnosticsMethod) == null) {
          WFMGrpc.getBuildShiftTemplateDiagnosticsMethod = getBuildShiftTemplateDiagnosticsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildShiftTemplateDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildShiftTemplateDiagnostics"))
              .build();
        }
      }
    }
    return getBuildShiftTemplateDiagnosticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> getCreatePlacementRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlacementRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> getCreatePlacementRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> getCreatePlacementRuleMethod;
    if ((getCreatePlacementRuleMethod = WFMGrpc.getCreatePlacementRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreatePlacementRuleMethod = WFMGrpc.getCreatePlacementRuleMethod) == null) {
          WFMGrpc.getCreatePlacementRuleMethod = getCreatePlacementRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlacementRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreatePlacementRule"))
              .build();
        }
      }
    }
    return getCreatePlacementRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> getUpdatePlacementRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlacementRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> getUpdatePlacementRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> getUpdatePlacementRuleMethod;
    if ((getUpdatePlacementRuleMethod = WFMGrpc.getUpdatePlacementRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdatePlacementRuleMethod = WFMGrpc.getUpdatePlacementRuleMethod) == null) {
          WFMGrpc.getUpdatePlacementRuleMethod = getUpdatePlacementRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlacementRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdatePlacementRule"))
              .build();
        }
      }
    }
    return getUpdatePlacementRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> getDeletePlacementRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlacementRule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> getDeletePlacementRuleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> getDeletePlacementRuleMethod;
    if ((getDeletePlacementRuleMethod = WFMGrpc.getDeletePlacementRuleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeletePlacementRuleMethod = WFMGrpc.getDeletePlacementRuleMethod) == null) {
          WFMGrpc.getDeletePlacementRuleMethod = getDeletePlacementRuleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlacementRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeletePlacementRule"))
              .build();
        }
      }
    }
    return getDeletePlacementRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> getCreateOpenTimesPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOpenTimesPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> getCreateOpenTimesPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> getCreateOpenTimesPatternMethod;
    if ((getCreateOpenTimesPatternMethod = WFMGrpc.getCreateOpenTimesPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateOpenTimesPatternMethod = WFMGrpc.getCreateOpenTimesPatternMethod) == null) {
          WFMGrpc.getCreateOpenTimesPatternMethod = getCreateOpenTimesPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOpenTimesPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateOpenTimesPattern"))
              .build();
        }
      }
    }
    return getCreateOpenTimesPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> getUpdateOpenTimesPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOpenTimesPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> getUpdateOpenTimesPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> getUpdateOpenTimesPatternMethod;
    if ((getUpdateOpenTimesPatternMethod = WFMGrpc.getUpdateOpenTimesPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateOpenTimesPatternMethod = WFMGrpc.getUpdateOpenTimesPatternMethod) == null) {
          WFMGrpc.getUpdateOpenTimesPatternMethod = getUpdateOpenTimesPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOpenTimesPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateOpenTimesPattern"))
              .build();
        }
      }
    }
    return getUpdateOpenTimesPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> getDeleteOpenTimesPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOpenTimesPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> getDeleteOpenTimesPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> getDeleteOpenTimesPatternMethod;
    if ((getDeleteOpenTimesPatternMethod = WFMGrpc.getDeleteOpenTimesPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteOpenTimesPatternMethod = WFMGrpc.getDeleteOpenTimesPatternMethod) == null) {
          WFMGrpc.getDeleteOpenTimesPatternMethod = getDeleteOpenTimesPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOpenTimesPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteOpenTimesPattern"))
              .build();
        }
      }
    }
    return getDeleteOpenTimesPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> getGetOpenTimesBitmapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOpenTimesBitmaps",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> getGetOpenTimesBitmapsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> getGetOpenTimesBitmapsMethod;
    if ((getGetOpenTimesBitmapsMethod = WFMGrpc.getGetOpenTimesBitmapsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetOpenTimesBitmapsMethod = WFMGrpc.getGetOpenTimesBitmapsMethod) == null) {
          WFMGrpc.getGetOpenTimesBitmapsMethod = getGetOpenTimesBitmapsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOpenTimesBitmaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetOpenTimesBitmaps"))
              .build();
        }
      }
    }
    return getGetOpenTimesBitmapsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> getCreateAgentAvailabilityPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentAvailabilityPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> getCreateAgentAvailabilityPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> getCreateAgentAvailabilityPatternMethod;
    if ((getCreateAgentAvailabilityPatternMethod = WFMGrpc.getCreateAgentAvailabilityPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateAgentAvailabilityPatternMethod = WFMGrpc.getCreateAgentAvailabilityPatternMethod) == null) {
          WFMGrpc.getCreateAgentAvailabilityPatternMethod = getCreateAgentAvailabilityPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentAvailabilityPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateAgentAvailabilityPattern"))
              .build();
        }
      }
    }
    return getCreateAgentAvailabilityPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> getUpdateAgentAvailabilityPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentAvailabilityPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> getUpdateAgentAvailabilityPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> getUpdateAgentAvailabilityPatternMethod;
    if ((getUpdateAgentAvailabilityPatternMethod = WFMGrpc.getUpdateAgentAvailabilityPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateAgentAvailabilityPatternMethod = WFMGrpc.getUpdateAgentAvailabilityPatternMethod) == null) {
          WFMGrpc.getUpdateAgentAvailabilityPatternMethod = getUpdateAgentAvailabilityPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentAvailabilityPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateAgentAvailabilityPattern"))
              .build();
        }
      }
    }
    return getUpdateAgentAvailabilityPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> getDeleteAgentAvailabilityPatternMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentAvailabilityPattern",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> getDeleteAgentAvailabilityPatternMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> getDeleteAgentAvailabilityPatternMethod;
    if ((getDeleteAgentAvailabilityPatternMethod = WFMGrpc.getDeleteAgentAvailabilityPatternMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteAgentAvailabilityPatternMethod = WFMGrpc.getDeleteAgentAvailabilityPatternMethod) == null) {
          WFMGrpc.getDeleteAgentAvailabilityPatternMethod = getDeleteAgentAvailabilityPatternMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentAvailabilityPattern"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteAgentAvailabilityPattern"))
              .build();
        }
      }
    }
    return getDeleteAgentAvailabilityPatternMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> getGetAvailabilityBitmapsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailabilityBitmaps",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> getGetAvailabilityBitmapsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> getGetAvailabilityBitmapsMethod;
    if ((getGetAvailabilityBitmapsMethod = WFMGrpc.getGetAvailabilityBitmapsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetAvailabilityBitmapsMethod = WFMGrpc.getGetAvailabilityBitmapsMethod) == null) {
          WFMGrpc.getGetAvailabilityBitmapsMethod = getGetAvailabilityBitmapsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailabilityBitmaps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetAvailabilityBitmaps"))
              .build();
        }
      }
    }
    return getGetAvailabilityBitmapsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> getUpsertNonSkillActivityAssociationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertNonSkillActivityAssociation",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> getUpsertNonSkillActivityAssociationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> getUpsertNonSkillActivityAssociationMethod;
    if ((getUpsertNonSkillActivityAssociationMethod = WFMGrpc.getUpsertNonSkillActivityAssociationMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpsertNonSkillActivityAssociationMethod = WFMGrpc.getUpsertNonSkillActivityAssociationMethod) == null) {
          WFMGrpc.getUpsertNonSkillActivityAssociationMethod = getUpsertNonSkillActivityAssociationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertNonSkillActivityAssociation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpsertNonSkillActivityAssociation"))
              .build();
        }
      }
    }
    return getUpsertNonSkillActivityAssociationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> getCreateSkillProficienciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSkillProficiencies",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> getCreateSkillProficienciesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> getCreateSkillProficienciesMethod;
    if ((getCreateSkillProficienciesMethod = WFMGrpc.getCreateSkillProficienciesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateSkillProficienciesMethod = WFMGrpc.getCreateSkillProficienciesMethod) == null) {
          WFMGrpc.getCreateSkillProficienciesMethod = getCreateSkillProficienciesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSkillProficiencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateSkillProficiencies"))
              .build();
        }
      }
    }
    return getCreateSkillProficienciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> getUpdateSkillProficienciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkillProficiencies",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> getUpdateSkillProficienciesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> getUpdateSkillProficienciesMethod;
    if ((getUpdateSkillProficienciesMethod = WFMGrpc.getUpdateSkillProficienciesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateSkillProficienciesMethod = WFMGrpc.getUpdateSkillProficienciesMethod) == null) {
          WFMGrpc.getUpdateSkillProficienciesMethod = getUpdateSkillProficienciesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkillProficiencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateSkillProficiencies"))
              .build();
        }
      }
    }
    return getUpdateSkillProficienciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> getDeleteSkillProficiencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSkillProficiency",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> getDeleteSkillProficiencyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> getDeleteSkillProficiencyMethod;
    if ((getDeleteSkillProficiencyMethod = WFMGrpc.getDeleteSkillProficiencyMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteSkillProficiencyMethod = WFMGrpc.getDeleteSkillProficiencyMethod) == null) {
          WFMGrpc.getDeleteSkillProficiencyMethod = getDeleteSkillProficiencyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSkillProficiency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteSkillProficiency"))
              .build();
        }
      }
    }
    return getDeleteSkillProficiencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> getCopyScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyScenario",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> getCopyScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> getCopyScenarioMethod;
    if ((getCopyScenarioMethod = WFMGrpc.getCopyScenarioMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCopyScenarioMethod = WFMGrpc.getCopyScenarioMethod) == null) {
          WFMGrpc.getCopyScenarioMethod = getCopyScenarioMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CopyScenario"))
              .build();
        }
      }
    }
    return getCopyScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> getCreateScheduleScenarioWithNodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScheduleScenarioWithNodes",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> getCreateScheduleScenarioWithNodesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> getCreateScheduleScenarioWithNodesMethod;
    if ((getCreateScheduleScenarioWithNodesMethod = WFMGrpc.getCreateScheduleScenarioWithNodesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateScheduleScenarioWithNodesMethod = WFMGrpc.getCreateScheduleScenarioWithNodesMethod) == null) {
          WFMGrpc.getCreateScheduleScenarioWithNodesMethod = getCreateScheduleScenarioWithNodesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScheduleScenarioWithNodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateScheduleScenarioWithNodes"))
              .build();
        }
      }
    }
    return getCreateScheduleScenarioWithNodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> getUpdateScheduleScenarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScheduleScenario",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> getUpdateScheduleScenarioMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> getUpdateScheduleScenarioMethod;
    if ((getUpdateScheduleScenarioMethod = WFMGrpc.getUpdateScheduleScenarioMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateScheduleScenarioMethod = WFMGrpc.getUpdateScheduleScenarioMethod) == null) {
          WFMGrpc.getUpdateScheduleScenarioMethod = getUpdateScheduleScenarioMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScheduleScenario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateScheduleScenario"))
              .build();
        }
      }
    }
    return getUpdateScheduleScenarioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> getListConfigEntitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConfigEntities",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> getListConfigEntitiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> getListConfigEntitiesMethod;
    if ((getListConfigEntitiesMethod = WFMGrpc.getListConfigEntitiesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListConfigEntitiesMethod = WFMGrpc.getListConfigEntitiesMethod) == null) {
          WFMGrpc.getListConfigEntitiesMethod = getListConfigEntitiesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConfigEntities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListConfigEntities"))
              .build();
        }
      }
    }
    return getListConfigEntitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> getDeleteShiftInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteShiftInstances",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> getDeleteShiftInstancesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> getDeleteShiftInstancesMethod;
    if ((getDeleteShiftInstancesMethod = WFMGrpc.getDeleteShiftInstancesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteShiftInstancesMethod = WFMGrpc.getDeleteShiftInstancesMethod) == null) {
          WFMGrpc.getDeleteShiftInstancesMethod = getDeleteShiftInstancesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteShiftInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteShiftInstances"))
              .build();
        }
      }
    }
    return getDeleteShiftInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> getBuildNodeDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildNodeDiagnostics",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> getBuildNodeDiagnosticsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> getBuildNodeDiagnosticsMethod;
    if ((getBuildNodeDiagnosticsMethod = WFMGrpc.getBuildNodeDiagnosticsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildNodeDiagnosticsMethod = WFMGrpc.getBuildNodeDiagnosticsMethod) == null) {
          WFMGrpc.getBuildNodeDiagnosticsMethod = getBuildNodeDiagnosticsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildNodeDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildNodeDiagnostics"))
              .build();
        }
      }
    }
    return getBuildNodeDiagnosticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> getBuildGlobalDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildGlobalDiagnostics",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> getBuildGlobalDiagnosticsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> getBuildGlobalDiagnosticsMethod;
    if ((getBuildGlobalDiagnosticsMethod = WFMGrpc.getBuildGlobalDiagnosticsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildGlobalDiagnosticsMethod = WFMGrpc.getBuildGlobalDiagnosticsMethod) == null) {
          WFMGrpc.getBuildGlobalDiagnosticsMethod = getBuildGlobalDiagnosticsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildGlobalDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildGlobalDiagnostics"))
              .build();
        }
      }
    }
    return getBuildGlobalDiagnosticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> getGetPublishedScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublishedSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> getGetPublishedScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> getGetPublishedScheduleMethod;
    if ((getGetPublishedScheduleMethod = WFMGrpc.getGetPublishedScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetPublishedScheduleMethod = WFMGrpc.getGetPublishedScheduleMethod) == null) {
          WFMGrpc.getGetPublishedScheduleMethod = getGetPublishedScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublishedSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetPublishedSchedule"))
              .build();
        }
      }
    }
    return getGetPublishedScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> getGetPublishedScheduleRequiredCallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublishedScheduleRequiredCalls",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> getGetPublishedScheduleRequiredCallsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> getGetPublishedScheduleRequiredCallsMethod;
    if ((getGetPublishedScheduleRequiredCallsMethod = WFMGrpc.getGetPublishedScheduleRequiredCallsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetPublishedScheduleRequiredCallsMethod = WFMGrpc.getGetPublishedScheduleRequiredCallsMethod) == null) {
          WFMGrpc.getGetPublishedScheduleRequiredCallsMethod = getGetPublishedScheduleRequiredCallsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublishedScheduleRequiredCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetPublishedScheduleRequiredCalls"))
              .build();
        }
      }
    }
    return getGetPublishedScheduleRequiredCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> getGetDraftScheduleRequiredCallsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDraftScheduleRequiredCalls",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> getGetDraftScheduleRequiredCallsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> getGetDraftScheduleRequiredCallsMethod;
    if ((getGetDraftScheduleRequiredCallsMethod = WFMGrpc.getGetDraftScheduleRequiredCallsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetDraftScheduleRequiredCallsMethod = WFMGrpc.getGetDraftScheduleRequiredCallsMethod) == null) {
          WFMGrpc.getGetDraftScheduleRequiredCallsMethod = getGetDraftScheduleRequiredCallsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDraftScheduleRequiredCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetDraftScheduleRequiredCalls"))
              .build();
        }
      }
    }
    return getGetDraftScheduleRequiredCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> getCreateDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> getCreateDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> getCreateDraftScheduleMethod;
    if ((getCreateDraftScheduleMethod = WFMGrpc.getCreateDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateDraftScheduleMethod = WFMGrpc.getCreateDraftScheduleMethod) == null) {
          WFMGrpc.getCreateDraftScheduleMethod = getCreateDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateDraftSchedule"))
              .build();
        }
      }
    }
    return getCreateDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> getUpdateDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> getUpdateDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> getUpdateDraftScheduleMethod;
    if ((getUpdateDraftScheduleMethod = WFMGrpc.getUpdateDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateDraftScheduleMethod = WFMGrpc.getUpdateDraftScheduleMethod) == null) {
          WFMGrpc.getUpdateDraftScheduleMethod = getUpdateDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateDraftSchedule"))
              .build();
        }
      }
    }
    return getUpdateDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> getBuildDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuildDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> getBuildDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> getBuildDraftScheduleMethod;
    if ((getBuildDraftScheduleMethod = WFMGrpc.getBuildDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getBuildDraftScheduleMethod = WFMGrpc.getBuildDraftScheduleMethod) == null) {
          WFMGrpc.getBuildDraftScheduleMethod = getBuildDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuildDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("BuildDraftSchedule"))
              .build();
        }
      }
    }
    return getBuildDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> getPublishDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> getPublishDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> getPublishDraftScheduleMethod;
    if ((getPublishDraftScheduleMethod = WFMGrpc.getPublishDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getPublishDraftScheduleMethod = WFMGrpc.getPublishDraftScheduleMethod) == null) {
          WFMGrpc.getPublishDraftScheduleMethod = getPublishDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("PublishDraftSchedule"))
              .build();
        }
      }
    }
    return getPublishDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> getResetDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> getResetDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> getResetDraftScheduleMethod;
    if ((getResetDraftScheduleMethod = WFMGrpc.getResetDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getResetDraftScheduleMethod = WFMGrpc.getResetDraftScheduleMethod) == null) {
          WFMGrpc.getResetDraftScheduleMethod = getResetDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ResetDraftSchedule"))
              .build();
        }
      }
    }
    return getResetDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> getGetDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> getGetDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> getGetDraftScheduleMethod;
    if ((getGetDraftScheduleMethod = WFMGrpc.getGetDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetDraftScheduleMethod = WFMGrpc.getGetDraftScheduleMethod) == null) {
          WFMGrpc.getGetDraftScheduleMethod = getGetDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetDraftSchedule"))
              .build();
        }
      }
    }
    return getGetDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> getListDraftSchedulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDraftSchedules",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> getListDraftSchedulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> getListDraftSchedulesMethod;
    if ((getListDraftSchedulesMethod = WFMGrpc.getListDraftSchedulesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListDraftSchedulesMethod = WFMGrpc.getListDraftSchedulesMethod) == null) {
          WFMGrpc.getListDraftSchedulesMethod = getListDraftSchedulesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDraftSchedules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListDraftSchedules"))
              .build();
        }
      }
    }
    return getListDraftSchedulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> getClearScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> getClearScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> getClearScheduleMethod;
    if ((getClearScheduleMethod = WFMGrpc.getClearScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getClearScheduleMethod = WFMGrpc.getClearScheduleMethod) == null) {
          WFMGrpc.getClearScheduleMethod = getClearScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ClearSchedule"))
              .build();
        }
      }
    }
    return getClearScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> getDeleteDraftScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDraftSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> getDeleteDraftScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> getDeleteDraftScheduleMethod;
    if ((getDeleteDraftScheduleMethod = WFMGrpc.getDeleteDraftScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteDraftScheduleMethod = WFMGrpc.getDeleteDraftScheduleMethod) == null) {
          WFMGrpc.getDeleteDraftScheduleMethod = getDeleteDraftScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDraftSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteDraftSchedule"))
              .build();
        }
      }
    }
    return getDeleteDraftScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> getListShiftInstancesBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShiftInstancesBySid",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> getListShiftInstancesBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> getListShiftInstancesBySidMethod;
    if ((getListShiftInstancesBySidMethod = WFMGrpc.getListShiftInstancesBySidMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListShiftInstancesBySidMethod = WFMGrpc.getListShiftInstancesBySidMethod) == null) {
          WFMGrpc.getListShiftInstancesBySidMethod = getListShiftInstancesBySidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShiftInstancesBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListShiftInstancesBySid"))
              .build();
        }
      }
    }
    return getListShiftInstancesBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> getCopyScheduleToScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyScheduleToSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> getCopyScheduleToScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> getCopyScheduleToScheduleMethod;
    if ((getCopyScheduleToScheduleMethod = WFMGrpc.getCopyScheduleToScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCopyScheduleToScheduleMethod = WFMGrpc.getCopyScheduleToScheduleMethod) == null) {
          WFMGrpc.getCopyScheduleToScheduleMethod = getCopyScheduleToScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyScheduleToSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CopyScheduleToSchedule"))
              .build();
        }
      }
    }
    return getCopyScheduleToScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> getCreateShiftInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShiftInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> getCreateShiftInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> getCreateShiftInstanceMethod;
    if ((getCreateShiftInstanceMethod = WFMGrpc.getCreateShiftInstanceMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateShiftInstanceMethod = WFMGrpc.getCreateShiftInstanceMethod) == null) {
          WFMGrpc.getCreateShiftInstanceMethod = getCreateShiftInstanceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShiftInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateShiftInstance"))
              .build();
        }
      }
    }
    return getCreateShiftInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> getCreateShiftInstanceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateShiftInstanceV2",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req,
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> getCreateShiftInstanceV2Method() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> getCreateShiftInstanceV2Method;
    if ((getCreateShiftInstanceV2Method = WFMGrpc.getCreateShiftInstanceV2Method) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCreateShiftInstanceV2Method = WFMGrpc.getCreateShiftInstanceV2Method) == null) {
          WFMGrpc.getCreateShiftInstanceV2Method = getCreateShiftInstanceV2Method =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateShiftInstanceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CreateShiftInstanceV2"))
              .build();
        }
      }
    }
    return getCreateShiftInstanceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> getSwapShiftInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwapShiftInstances",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> getSwapShiftInstancesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq, com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> getSwapShiftInstancesMethod;
    if ((getSwapShiftInstancesMethod = WFMGrpc.getSwapShiftInstancesMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getSwapShiftInstancesMethod = WFMGrpc.getSwapShiftInstancesMethod) == null) {
          WFMGrpc.getSwapShiftInstancesMethod = getSwapShiftInstancesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq, com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwapShiftInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("SwapShiftInstances"))
              .build();
        }
      }
    }
    return getSwapShiftInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> getUpdateShiftInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShiftInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> getUpdateShiftInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> getUpdateShiftInstanceMethod;
    if ((getUpdateShiftInstanceMethod = WFMGrpc.getUpdateShiftInstanceMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateShiftInstanceMethod = WFMGrpc.getUpdateShiftInstanceMethod) == null) {
          WFMGrpc.getUpdateShiftInstanceMethod = getUpdateShiftInstanceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateShiftInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateShiftInstance"))
              .build();
        }
      }
    }
    return getUpdateShiftInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> getUpdateShiftInstanceV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateShiftInstanceV2",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req,
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> getUpdateShiftInstanceV2Method() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> getUpdateShiftInstanceV2Method;
    if ((getUpdateShiftInstanceV2Method = WFMGrpc.getUpdateShiftInstanceV2Method) == null) {
      synchronized (WFMGrpc.class) {
        if ((getUpdateShiftInstanceV2Method = WFMGrpc.getUpdateShiftInstanceV2Method) == null) {
          WFMGrpc.getUpdateShiftInstanceV2Method = getUpdateShiftInstanceV2Method =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateShiftInstanceV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("UpdateShiftInstanceV2"))
              .build();
        }
      }
    }
    return getUpdateShiftInstanceV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> getCopyShiftInstancesToScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyShiftInstancesToSchedule",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> getCopyShiftInstancesToScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> getCopyShiftInstancesToScheduleMethod;
    if ((getCopyShiftInstancesToScheduleMethod = WFMGrpc.getCopyShiftInstancesToScheduleMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getCopyShiftInstancesToScheduleMethod = WFMGrpc.getCopyShiftInstancesToScheduleMethod) == null) {
          WFMGrpc.getCopyShiftInstancesToScheduleMethod = getCopyShiftInstancesToScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq, com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyShiftInstancesToSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("CopyShiftInstancesToSchedule"))
              .build();
        }
      }
    }
    return getCopyShiftInstancesToScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> getListShiftInstanceSidsForAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShiftInstanceSidsForAgent",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> getListShiftInstanceSidsForAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> getListShiftInstanceSidsForAgentMethod;
    if ((getListShiftInstanceSidsForAgentMethod = WFMGrpc.getListShiftInstanceSidsForAgentMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListShiftInstanceSidsForAgentMethod = WFMGrpc.getListShiftInstanceSidsForAgentMethod) == null) {
          WFMGrpc.getListShiftInstanceSidsForAgentMethod = getListShiftInstanceSidsForAgentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShiftInstanceSidsForAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListShiftInstanceSidsForAgent"))
              .build();
        }
      }
    }
    return getListShiftInstanceSidsForAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> getListShiftSegmentsByShiftInstanceSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListShiftSegmentsByShiftInstanceSids",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> getListShiftSegmentsByShiftInstanceSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> getListShiftSegmentsByShiftInstanceSidsMethod;
    if ((getListShiftSegmentsByShiftInstanceSidsMethod = WFMGrpc.getListShiftSegmentsByShiftInstanceSidsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListShiftSegmentsByShiftInstanceSidsMethod = WFMGrpc.getListShiftSegmentsByShiftInstanceSidsMethod) == null) {
          WFMGrpc.getListShiftSegmentsByShiftInstanceSidsMethod = getListShiftSegmentsByShiftInstanceSidsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListShiftSegmentsByShiftInstanceSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListShiftSegmentsByShiftInstanceSids"))
              .build();
        }
      }
    }
    return getListShiftSegmentsByShiftInstanceSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> getSetSchedulingTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSchedulingTarget",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> getSetSchedulingTargetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> getSetSchedulingTargetMethod;
    if ((getSetSchedulingTargetMethod = WFMGrpc.getSetSchedulingTargetMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getSetSchedulingTargetMethod = WFMGrpc.getSetSchedulingTargetMethod) == null) {
          WFMGrpc.getSetSchedulingTargetMethod = getSetSchedulingTargetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSchedulingTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("SetSchedulingTarget"))
              .build();
        }
      }
    }
    return getSetSchedulingTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> getGetSchedulingTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSchedulingTarget",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> getGetSchedulingTargetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> getGetSchedulingTargetMethod;
    if ((getGetSchedulingTargetMethod = WFMGrpc.getGetSchedulingTargetMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetSchedulingTargetMethod = WFMGrpc.getGetSchedulingTargetMethod) == null) {
          WFMGrpc.getGetSchedulingTargetMethod = getGetSchedulingTargetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSchedulingTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetSchedulingTarget"))
              .build();
        }
      }
    }
    return getGetSchedulingTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> getDeleteSchedulingTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSchedulingTarget",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> getDeleteSchedulingTargetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> getDeleteSchedulingTargetMethod;
    if ((getDeleteSchedulingTargetMethod = WFMGrpc.getDeleteSchedulingTargetMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getDeleteSchedulingTargetMethod = WFMGrpc.getDeleteSchedulingTargetMethod) == null) {
          WFMGrpc.getDeleteSchedulingTargetMethod = getDeleteSchedulingTargetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq, com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSchedulingTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("DeleteSchedulingTarget"))
              .build();
        }
      }
    }
    return getDeleteSchedulingTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> getGetPerformanceMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPerformanceMetrics",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> getGetPerformanceMetricsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> getGetPerformanceMetricsMethod;
    if ((getGetPerformanceMetricsMethod = WFMGrpc.getGetPerformanceMetricsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getGetPerformanceMetricsMethod = WFMGrpc.getGetPerformanceMetricsMethod) == null) {
          WFMGrpc.getGetPerformanceMetricsMethod = getGetPerformanceMetricsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq, com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPerformanceMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("GetPerformanceMetrics"))
              .build();
        }
      }
    }
    return getGetPerformanceMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> getListRequiredCallsIntervalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRequiredCallsIntervals",
      requestType = com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq,
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> getListRequiredCallsIntervalsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> getListRequiredCallsIntervalsMethod;
    if ((getListRequiredCallsIntervalsMethod = WFMGrpc.getListRequiredCallsIntervalsMethod) == null) {
      synchronized (WFMGrpc.class) {
        if ((getListRequiredCallsIntervalsMethod = WFMGrpc.getListRequiredCallsIntervalsMethod) == null) {
          WFMGrpc.getListRequiredCallsIntervalsMethod = getListRequiredCallsIntervalsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq, com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRequiredCallsIntervals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes.getDefaultInstance()))
              .setSchemaDescriptor(new WFMMethodDescriptorSupplier("ListRequiredCallsIntervals"))
              .build();
        }
      }
    }
    return getListRequiredCallsIntervalsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WFMStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WFMStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WFMStub>() {
        @java.lang.Override
        public WFMStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WFMStub(channel, callOptions);
        }
      };
    return WFMStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WFMBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WFMBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WFMBlockingStub>() {
        @java.lang.Override
        public WFMBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WFMBlockingStub(channel, callOptions);
        }
      };
    return WFMBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WFMFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WFMFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WFMFutureStub>() {
        @java.lang.Override
        public WFMFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WFMFutureStub(channel, callOptions);
        }
      };
    return WFMFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieves all the skill profiles of the org sending the request.
     * Also it can return the skills of each of the returned profiles.
     * Required permissions:
     *   NONE
     * Errors:
     * </pre>
     */
    default void listSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;name, and averages of a skill profile that has the given &#64;skill_profile_sid.
     * It also updates it to no longer be unnamed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, &#64;name or averages in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profile.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    default void updateSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkillProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;proficiencies for the given skill profile's skills that belong the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;proficiencies in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profiles proficiencies.
     * </pre>
     */
    default void updateSkillProfileProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkillProfileProficienciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a skill profile that has the given &#64;skill_profile_sid.
     * It also gets all the skills and the mappings associated with that profile.
     * If the &#64;inactive_as_of_date of the skill profile is nil then the mapping is of inactive profiles to this one,
     * otherwise the mapping is of this profile to an active one.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profile.
     *   - grpc.NotFound: skill profile doesn't exist.
     * </pre>
     */
    default void getSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkillProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resyncs the skill profiles of the org sending the request.
     * It will add skills and skill profiles based on that client's historical call data.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when creating the new skills and skill profiles.
     * </pre>
     */
    default void resyncSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResyncSkillProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the last date of a skill profile resync for the org seding the request.
     * If the org has never done a skill profile resync &#64;resync_date will not be set.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the resync date.
     * </pre>
     */
    default void getLastSkillProfileResyncDate(com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastSkillProfileResyncDateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given forecasting parameters for the org sending the request.
     * If the org already has an entry for them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;forecasting_parameters in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the parameters.
     * </pre>
     */
    default void upsertForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertForecastingParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the forecasting parameters for the org sending the request.
     * If the org hasn't created any parameters, it will return the default parameters.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the parameters.
     * </pre>
     */
    default void getForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetForecastingParametersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the historical data for the org sending the request and the given &#64;skill_profile_category.
     * It will look through the client's call history and generate the historical data by using their configured forecasting parameters (historical data period and interval width).
     * The duration of each interval will be the interval width of the org's forecasting parameters.
     * It also applies any deltas that the client has stored for the given &#64;skill_profile_category, if the category is a group it will use the deltas of the skill profiles part of that group.
     * If the client has no historical data, only the deltas will be applied to the returned intervals, all other intervals will have nil averages.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_category in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_category given is not found for the org.
     *   - grpc.Internal: error occurs when getting the historical data.
     * </pre>
     */
    default void listHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoricalDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the historical data interval.
     * </pre>
     */
    default void upsertHistoricalDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertHistoricalDataDeltaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the given org already has an entry for any of the deltas, it will replace the already existing entries.
     * This is made into a unary due to the UI's lack of support for client streams.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the historical data deltas.
     * </pre>
     */
    default void upsertHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertHistoricalDataDeltasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all the skills that the org sending the request has.
     * Skills returned will be sorted by &#64;skill_sid in ascending order.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skills.
     * </pre>
     */
    default void listSkills(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds and returns a call profile template for the org sending the request and the given &#64;skill_profile_sid.
     * The template will be generated using the training data for said skill profile using the &#64;training_data_range and &#64;averages_calculation_range_in_months
     * from the client's saved forecasting parameters.
     * The &#64;total_calls in the returned template be summed from the (&#64;training_data_start_datetime - &#64;averages_calculation_range_in_months) to &#64;training_data_end_datetime,
     * or from &#64;training_data_start_datetime to &#64;training_data_end_datetime if &#64;averages_calculation_range_in_months is 0.
     * The fixed averages fields in the call profile template, will be set to the averages that the skill profile has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found for the org.
     *   - grpc.Internal: error occurs when building the call profile template.
     * </pre>
     */
    default void buildCallProfileTemplateForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildCallProfileTemplateForSkillProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a mapping entry for the &#64;inactive_skill_profile_sid to the &#64;active_skill_profile_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid, or &#64;active_skill_profile_sid in the request are invalid.
     *                   the &#64;inactive_skill_profile_sid given is of an active skill profile.
     *                   the &#64;active_skill_profile_sid given is of an inactive skill profile.
     *   - grpc.Internal: error occurs when creating the inactive skill profile mapping.
     * </pre>
     */
    default void createInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInactiveSkillProfileMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a list of enums that represent all of the forecaster types that are currently available for use
     * Required permissions:
     *  NONE
     * Errors:
     *  -grpc.Internal: error occurs when contacting the forecaster to get the available forecaster types.
     * </pre>
     */
    default void getAvailableRegressionForecasterModelTypes(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableRegressionForecasterModelTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes the current mapping for the given &#64;inactive_skill_profile_sid to be disconnected.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the skill profile is not found for the org.
     *   - grpc.Internal: the current mapping for the given &#64;inactive_skill_profile_sid is already disconnected,
     *				            the given &#64;inactive_skill_profile_sid is of an active skill profile.
     * </pre>
     */
    default void disconnectInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisconnectInactiveSkillProfileMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes deltas whose dates match the given &#64;start_datetimes for the given &#64;skill_profile_sid.
     * If no &#64;start_datetimes are given, it will delete all the deltas that the given &#64;skill_profile_sid has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, or &#64;start_datetimes in the request are invalid.
     *   - grpc.NotFound: no matching deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the historical data interval.
     * </pre>
     */
    default void deleteHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHistoricalDataDeltasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the top N skill profiles with the highest calls_count for org sending the request where N is &#64;max_number_of_profiles.
     * It will also return the number of skills found for that profile.
     * Individual skills that each profile has will not be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;max_number_of_profiles in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profiles.
     * </pre>
     */
    default void listTopSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTopSkillProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the total number of skill profiles associated with the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skill profiles count.
     * </pre>
     */
    default void getSkillProfilesCount(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkillProfilesCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    default void buildProfileForecastByInterval(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildProfileForecastByIntervalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * It also returns the statistics of the produced forecast by using the test data of the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    default void buildProfileForecastByIntervalWithStats(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildProfileForecastByIntervalWithStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast for the given &#64;skill_profile_sid and org sending the request using the given &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * &#64;forecast_range_start_datetime to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The intervals produced will be saved in the database.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request are invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid doesn't exist.
     *   - grpc.Internal: error occurs when upserting the profile forecast.
     * </pre>
     */
    default void upsertProfileForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertProfileForecastMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;call_profile_template for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the creation of the call profile.
     * </pre>
     */
    default void createCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCallProfileTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a call profile template for the requesting org that has the given &#64;call_profile_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the call profile.
     * </pre>
     */
    default void deleteCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCallProfileTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an entry for the &#64;regression_template for the requesting org.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when creating the regression template.
     * </pre>
     */
    default void createRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRegressionTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a regression template for the requesting org that has the given &#64;regression_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the regression template.
     * </pre>
     */
    default void deleteRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRegressionTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all the regression templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the regression templates.
     * </pre>
     */
    default void listRegressionTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegressionTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the forecast data intervals for the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the forecast data intervals.
     * </pre>
     */
    default void listForecastIntervalsForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListForecastIntervalsForSkillProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a regression forecast using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the regression forecast.
     * </pre>
     */
    default void buildRegressionForecastByInterval(com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildRegressionForecastByIntervalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates a regression forecast and calculates forecast statistics using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * The first message received will be the forecast statistics while all subsequent ones will be the forecast intervals.
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs either during the when building the forecast or calculating the stats.
     * </pre>
     */
    default void buildRegressionForecastByIntervalWithStats(com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildRegressionForecastByIntervalWithStatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the call profile templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the templates.
     * </pre>
     */
    default void listCallProfileTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCallProfileTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds a regression forecast for the org using the given &#64;regression_template and saves the resulting intervals in the db.
     * It will generate forecast intervals for the skill profiles sids in &#64;save_forecasts_for_skill_profile_sids,
     * if the list is empty or has no valid skill profile sids, it will generate and save forecasts for all active skill profiles.
     * If any intervals produced already exist in the db, they will be replaced with the ones produced.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the regression forecast.
     * </pre>
     */
    default void upsertRegressionForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertRegressionForecastMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data delta.
     * </pre>
     */
    default void upsertForecastDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertForecastDataDeltaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the org already has entries for any of them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data deltas.
     * </pre>
     */
    default void upsertForecastDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertForecastDataDeltasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes forecast data intervals/deltas based on the parameters provided.
     * If &#64;delete_param is type skill_profile_sid, then the intervals/deltas to be deleted will be
     * associated with that id. If &#64;delete_param is type interval_sids, then the intervals/deltas to be
     * deleted will be contained in the list &#64;interval_sids. The &#64;delete_type field determines which
     * table(s) in the database the intervals/deltas will be deleted from.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one of the &#64;delete_params is invalid
     *   - grpc.NotFound: no matching intervals/deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the forecast data intervals/deltas.
     * </pre>
     */
    default void deleteForecastIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteForecastIntervalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the history for all the skill profiles of the requesting org.
     * Each value in every interval that has the same &#64;start_datetime of each skill profile will be summed then averaged and made into a single one.
     * When calculating the averages, each interval's values will be weighted by the number of &#64;total_calls it has.
     * History will be sorted by &#64;start_datetime in ascending order, and the range is determined by the client's historical range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when retriving the history.
     * </pre>
     */
    default void listHistoricalDataForAllSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoricalDataForAllSkillProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Converts the given &#64;profile_tod and &#64;profile_woms to a ProfileDOW and ProfileMOY.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;profile_tod or &#64;profile_woms in the request are invalid.
     *   - grpc.Internal: error occurs when building the ProfileDOW or ProfileMOY.
     * </pre>
     */
    default void buildDOWAndMOYProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildDOWAndMOYProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Calculates and returns the averages in the training data for the given &#64;skill_profile_sid.
     * Averages to be returned will be weighted by the number of calls that each training data interval has.
     * The start time that the training data will be averaged can be modified based on the forecasting parameter &#64;averages_calculation_range_in_months,
     * which will subtract that many months from the training data range end datetime and set it as the start time.
     * If &#64;averages_calculation_range_in_months is 0, it will use the training data range start datetime.
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found.
     *   - grpc.Internal: error occurs when calculating the averages from the training data.
     * </pre>
     */
    default void calculateTrainingDataAveragesForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateTrainingDataAveragesForSkillProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Calculates the averages for call characteristics using the historical data of the given &#64;skill_profile_sids and org sending the request.
     * If no &#64;skill_profile_sids are given, it will calculate the averages for all skill profiles for the org sending the request.
     * Averages will be weighted by the number of calls that each historical data interval has.
     * Once the averages are calculated, they will be updated in the db for those skill profiles.
     * If a nil &#64;datetime_range is given then the range used will be &#64;training_data_range_end_datetime - &#64;averages_calculation_range_in_months to the &#64;training_data_range_end_datetime from the forecasting parameters.
     * If &#64;averages_calculation_range_in_months is 0, it will use the &#64;training_data_range_start_datetime as the start datetime of the range.
     * If &#64;exclude_skill_profiles_with_manual_averages is true, it will exclude skill profiles that have manual averages from the calculation
     * even if those skill profiles are in &#64;skill_profile_sids.
     * Errors:
     *   - grpc.Internal: error occurs when calculating the averages from the historical data.
     * </pre>
     */
    default void updateSkillProfileAveragesUsingHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkillProfileAveragesUsingHistoricalDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the call center &#64;node that has the given &#64;call_center_node_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this call center node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the request are invalid.
     *   - grpc.Internal: error occurs when updating the call center node.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    default void updateCallCenterNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCallCenterNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given client &#64;node for the org sending the request and &#64;parent_sid in the node.
     * The &#64;client_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent call center node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;parent_sid, or &#64;time_zone_val is invalid.
     *   - grpc.NotFound: parent call center node doesn't exist, or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the client node.
     * </pre>
     */
    default void createClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateClientNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a client node for the org sending the request that has the given &#64;client_node_sid and &#64;schedule_scenario_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this client node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.Internal: error occurs when updating the client &#64;node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given &#64;parent_sid (call_center_node_sid) belongs to a different scenario than this &#64;node.
     * </pre>
     */
    default void updateClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateClientNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given location &#64;node for the org sending the request and parent &#64;client_node_sid.
     * The &#64;location_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent client node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent client node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the location node.
     * </pre>
     */
    default void createLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a location node corresponding to the given &#64;location_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this location node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;location_node have invalid values.
     *   - grpc.Internal: error occurs when updating the location node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;client_node_sid belongs to a different scenario than the node to update.
     * </pre>
     */
    default void updateLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given program &#64;node for the org sending the request and parent &#64;location_node_sid.
     * The &#64;program_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent location node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent location node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the program node.
     * </pre>
     */
    default void createProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProgramNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a program node for the given &#64;program_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this program node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;program_node have invalid values.
     *   - grpc.Internal: error occurs when updating the program node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;location_node_sid belongs to a different scenario than the program node to update.
     * </pre>
     */
    default void updateProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProgramNodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;constraint_rule for the org sending the request.
     * The &#64;constraint_rule_sid and &#64;skill_proficiency_sid (if one was created) of the new entities will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency and the &#64;constraint_rule.target_sid will be ignored.
     * If the &#64;member_target_entity is for a skill proficiency, that skill proficiency will be created with the given &#64;constraint_rule as parent.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when creating the constraint rule.
     * </pre>
     */
    default void createConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConstraintRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the constraint rule corresponding for given &#64;contraint_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this constraint rule since it cannot be changed.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency, otherwise it should not be set and field will be ignored.
     * If the &#64;target_sid is for a different skill proficiency than the current one the constraint rule has as a target,
     * the old one will be deleted and a new one will be created for the given &#64;member_target_entity.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the constraint rule.
     *                  : the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when updating the constraint rule.
     * </pre>
     */
    default void updateConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConstraintRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a constraint rule with the coresponding &#64;constraint_rule_sid for the org sending the request.
     * It also deletes the entity referenced by the &#64;target_sid and &#64;rule_type if said entity is not a member of any other entity or the on call scheduling activity.
     * Required permissions:
     *  NONE
     * Errors:
     *   - grpc.Invalid: the &#64;constraint_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;constraint_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the constraint rule.
     * </pre>
     */
    default void deleteConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConstraintRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;non_skill_activity for the org sending the request.
     * Will also create a scheduling activity wrapper for the non skill activity.
     * The &#64;non_skill_activity_sid and &#64;scheduling_activity_sid of the new entities will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;non_skill_activity have invalid values.
     *   - grpc.NotFound: the &#64;schedule_scenario_sid doesn't exist.
     *   - grpc.Internal: error occurs when creating the non skill activity or scheduling activity.
     * </pre>
     */
    default void createNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNonSkillActivityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a non skill activity that has the given &#64;non_skill_activity_sid with the given values.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;non_skill_activity fields have invalid values.
     *   - grpc.NotFound: non skill activity for the given &#64;non_skill_activity_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the non skill activity.
     * </pre>
     */
    default void updateNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNonSkillActivityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the non skill activities that belong to the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:.
     *   - grpc.Internal: error occurs when listing the activites.
     * </pre>
     */
    default void listNonSkillActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNonSkillActivitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the IDs of non skill activities that belong to the org sending the request which have the given &#64;relationship_type with the &#64;associated_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;associated_entity or &#64;relationship_type are invalid.
     *   - grpc.Internal: error occurs when listing the associations.
     * </pre>
     */
    default void listNonSkillActivityAssociations(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNonSkillActivityAssociationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the candidate scheduling activities for a constraint or placement rule, inherited through given &#64;parent_of_rule for &#64;schedule_scenario_sid for the org making the request.
     * &#64;parent_of_rule may be any type of node, agent group, or shift template which the rule will belong to.
     * If the rule will belong to a wfm agent, the agent group must be supplied instead to get a relevant set of candidate scheduling activities.
     * Member non skill activity of each scheduling activity will be included in the response.
     * The on call scheduling activity will always be included.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;parent_of_rule is invalid.
     *   - grpc.NotFound: &#64;parent_of_rule doesn't exist
     *   - grpc.Internal: error occurs when applying inheritance or getting the nodes from &#64;parent_of_rule.
     * </pre>
     */
    default void listCandidateSchedulingActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCandidateSchedulingActivitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an agent group with the provided parameters.
     * A successful response should contain the &#64;agent_group_sid of the newly created entity.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;parent_entity are invalid.
     *   - grpc.NotFound: &#64;parent_entity doesn't exist
     *   - grpc.Internal: error occurs when creating the agent group.
     * </pre>
     */
    default void createAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the agent group corresponding to the &#64;agent_group_sid, &#64;name, and &#64;parent_entity.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent group since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid, &#64;parent_entity, or &#64;name in the request are invalid.
     *   - grpc.Internal: error occurs when updating the agent group.
     *   - grpc.AlreadyExists: an agent group with the given &#64;name already exists.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent group.
     * </pre>
     */
    default void updateAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a wfm agent for the given &#64;wfm_agent_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * The &#64;tcn_agent_sid cannot be updated.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;wfm_agent have invalid values.
     *   - grpc.NotFound: WFM agent with the given &#64;wfm_agent_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the wfm agent.
     * </pre>
     */
    default void updateWFMAgent(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWFMAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all wfm agents for the org sending the request.
     * if &#64;include_inactive is true then inactive agents will also be included, otherwise only active agents will be returned.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * if &#64;include_agent_groups is true then the &#64;agent_groups_by_agent response field will be set with a list of agent groups correlating to each agents index in the &#64;wfm_agents field.
     * WFM agents with no associated agent_groups will have an empty slice in agent_groups_by_agent at their correlated index.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    default void listAllWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllWFMAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all candidate wfm agents for the org sending the request and given &#64;agent_group_sid.
     * A WFM agent is considered a candidate when it's active and it doesn't already belong to the given agent group.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;agent_group_sid has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    default void listCandidateWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCandidateWFMAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all wfm agents who are not grouped with any agent group for the given org sending the request that were created at or after the given &#64;created_after_datetime.
     * If &#64;schedule_scenario_sid is positive, it will filter further to get only agents who are not grouped with any agent group for that scenario.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;created_after_datetime has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    default void listUngroupedWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUngroupedWFMAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the IDs of wfm agents that belong to the org sending the request which are associated with the given &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid is invalid.
     *   - grpc.Internal: error occurs when listing the wfm agents.
     * </pre>
     */
    default void listWFMAgentsAssociatedWithAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWFMAgentsAssociatedWithAgentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid.
     * The &#64;schedule_scenario_sid must match the scenario of the agent group and wfm agents.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: the &#64;wfm_agent_sids or &#64;agent_group_sid don't exist for the org or given &#64;schedule_scenario_sid.
     *   - grpc.Internal: error occurs when creating the association.
     * </pre>
     */
    default void createWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWFMAgentMembershipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: any of the given memberships to delete do not exist.
     *   - grpc.Internal: error occurs when deleting the association.
     * </pre>
     */
    default void deleteWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWFMAgentMembershipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes all membership associations for the given &#64;wfm_agent_sids with the given &#64;agent_group_sids.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sids are invalid.
     *   - grpc.Internal: error occurs when deleting the associations.
     * </pre>
     */
    default void deleteWFMAgentsMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWFMAgentsMembershipsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the wfm agent associated with the given &#64;wfm_agent_sid or &#64;agent_group_sid for the org sending the request.
     * Response will only contain:
     *    one element if build for a single &#64;wfm_agent_sid.
     *    one element for each WFM agent if build for an &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;wfm_agent_sid, or &#64;agent_group_sid is invalid.
     *   - grpc.NotFound: the given &#64;wfm_agent_sid doesn't exist or the &#64;agent_group_sid has no agents.
     *   - grpc.Internal: error occurs building the diagnostics.
     * </pre>
     */
    default void buildAgentDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildAgentDiagnosticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a shift template for the org sending the request with the provided parameters
     * The &#64;shift_template_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent program node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the shift template.
     * </pre>
     */
    default void createShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShiftTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a shift template for the given &#64;shift_template_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this shift template since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sid, &#64;name, &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the shift template to update.
     *   - grpc.Internal: error occurs when updating the shift template.
     * </pre>
     */
    default void updateShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShiftTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the shift templates matching the specified &#64;shift_template_sids for the org sending the request.
     * If &#64;include_placement_rules is set to true, the &#64;shift_templates will be returned with their member placement rules.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sids are invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void listShiftTemplatesBySids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShiftTemplatesBySidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the shift template associated with the given &#64;shift_template_sid for the org sending the request.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;shift_template_sid is invalid.
     *   - grpc.NotFound: the given &#64;shift_template_sid doesn't exist for the org sending the request.
     *   - grpc.Internal: error occours building the diagnostics for the shift template.
     * </pre>
     */
    default void buildShiftTemplateDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildShiftTemplateDiagnosticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a placement rule for org sending the request with the provided parameters.
     * The &#64;placement_rule_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent shift template.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;placement_rule are invalid.
     *   - grpc.NotFound: the parent shift template doesn't exist or belongs to a different scenario than the one given.
     *                    the scheduling activity to associate with the placement rule doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the placement rule.
     * </pre>
     */
    default void createPlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlacementRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a placement rule corresponding with the given &#64;placement_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this placement rule since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the &#64;placement_rule are invalid.
     *   - grpc.Internal: error occurs when updating the placement rule.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     *                  : the parent shift template or related scheduling activity don't exist or belong to a different scenario than the placement rule to update.
     * </pre>
     */
    default void updatePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlacementRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a placement rule with the coresponding &#64;placement_rule_sid for the org sending the request.
     * It also deletes the scheduling activity referenced by the &#64;scheduling_activity_sid if said activity is not a member of any other entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;placement_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;placement_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the placement rule.
     * </pre>
     */
    default void deletePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePlacementRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an open times pattern for the org sending the request with the provided parameters.
     * The &#64;open_times_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;open_times_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the open times pattern.
     * </pre>
     */
    default void createOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOpenTimesPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an open times pattern for the given &#64;open_times_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this open times pattern since it cannot be changed.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;open_times_pattern have invalid values.
     *   - grpc.NotFound: the given &#64;open_times_pattern or it's &#64;parent_entity doesn't exist.
     *   - grpc.Internal: error occurs when updating the open times pattern.
     * </pre>
     */
    default void updateOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOpenTimesPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an open times pattern with the coresponding &#64;open_times_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;open_times_pattern_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;open_times_pattern doesn't exist.
     *   - grpc.Internal: error occurs when removing the open times pattern.
     * </pre>
     */
    default void deleteOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOpenTimesPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the open times patterns of &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the open times patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the open times patterns.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when getting the open times pattern bitmaps.
     * </pre>
     */
    default void getOpenTimesBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOpenTimesBitmapsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an agent availability pattern for the org sending the request with the provided parameters.
     * The &#64;agent_availability_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;agent_availability_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the agent availability pattern.
     * </pre>
     */
    default void createAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentAvailabilityPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an agent availability pattern for the given &#64;agent_availability_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent availability pattern since it cannot be changed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;agent_availability_pattern have invalid values.
     *   - grpc.Internal: error occurs when updating the agent avilability pattern.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent availability pattern.
     * </pre>
     */
    default void updateAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentAvailabilityPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an agent availability pattern with the coresponding &#64;agent_availability_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_availability_pattern_sid has an invalid value.
     *   - grpc.NotFound: the &#64;agent_availability_pattern with the given sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the agent availability pattern.
     * </pre>
     */
    default void deleteAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentAvailabilityPatternMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the agent availability patterns of &#64;entities_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;entities_to_check.
     * &#64;entities_to_check must have the entity_type field set with a wfm agent, agent group or a type of node.
     * If an availability bitmap is requested for an agent group, the bitmaps for all of it's member agents will be returned instead.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the availability patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the availability patterns.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entities_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;entities_to_check don't exist.
     *   - grpc.Internal: error occurs when getting the agent availability pattern bitmaps.
     * </pre>
     */
    default void getAvailabilityBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailabilityBitmapsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upserts an association for the given &#64;non_skill_activity_sid to the given &#64;node.
     * All downstream members of the entity will have their inheritance state cleared, and inherit the given association.
     * If an association already exists between the non skill activity and the &#64;node then their &#64;relationship_type will be updated.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If a NOT_ASSOCIATED_WITH relationship is being created, the tree will be checked for conflicting downstream effects.
     * If any member rules, are referencing the non skill activity and &#64;relationship_type is NOT_ASSOCIATED_WITH, then the upsert will not take effect, and the list of related entities to be updated/removed first will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;non_skill_activity_sid, &#64;node or &#64;association_type are invalid.
     *                 : the non skill activity and &#64;node belong to different scenarios.
     *   - grpc.NotFound: the &#64;non_skill_activity_sid or &#64;node don't exist.
     *   - grpc.Internal: error occurs when upserting the association.
     * </pre>
     */
    default void upsertNonSkillActivityAssociation(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertNonSkillActivityAssociationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates skill proficiencies for the org sending the request with the provided parameters.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entities.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in a &#64;proficiency, or the &#64;schedule_scenario_sid are invalid.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;parent_entity doesn't exist.
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the given &#64;skill_sid.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     *   - grpc.Internal: error occurs when creating the skill proficiencies.
     * </pre>
     */
    default void createSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSkillProficienciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates skill proficiencies corresponding to the given &#64;skill_proficiency_sids and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;skill_sid and &#64;parent_entity field of each proficiency will be ignored since it cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;skill_proficiencies have invalid values.
     *   - grpc.Internal: error occurs when updating the skill proficiencies.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the skill of the given skill proficiency.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     * </pre>
     */
    default void updateSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkillProficienciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a skill proficiency with the corresponding &#64;skill_proficiency_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;skill_proficiency_sid is invalid for the org making the request.
     *   -grpc.NotFound: the skill proficiency with the given &#64;skill_proficiency_sid doesn't exist.
     *   -grpc.Internal: error occurs when removing the skill proficiency.
     * </pre>
     */
    default void deleteSkillProficiency(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSkillProficiencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copies the existing scenario with the &#64;scenario_sid_to_copy for the org sending the request using the provided parameters.
     * Scheduling targets of entities in the scenario to copy will also be copied.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:gg
     *   - grpc.Invalid: the parameters &#64;scenario_sid_to_copy or any others are invalid.
     *   - grpc.NotFound: the scenario corresponding to the &#64;scenario_sid_to_copy doesn't exist.
     *   - grpc.Internal: error occurs when creating/coping the new scenario.
     * </pre>
     */
    default void copyScenario(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new schedule scenario for the org sending the request with the provided parameters.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * It also creates 1 of each of the following: call center, client, program, location node, and on call scheduling activity (if it doesn't exist already for the org).
     * The &#64;node_description fields may optionally be left blank.
     * The &#64;copied_from_scenario_sid field will be ignored, as it will be set to nil in the newly created scenario.
     * The &#64;creation_datetime and &#64;is_default fields will also be ignored and set as the current time and false respectively.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: parameters in the &#64;req are invalid for the org making the request.
     *   - grpc.Internal: error occurs when creating the new scenario, or any of the node entities.
     * </pre>
     */
    default void createScheduleScenarioWithNodes(com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScheduleScenarioWithNodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a schedule scenario corresponding to the given &#64;schedule_scenario_sid and org sending the request with the provided parameters.
     * Only the &#64;name, &#64;description and &#64;datetime_set_to_inactive fields may be updated, and must be filled in with current value if updating the field is not desired.
     * The &#64;schedule_scenario_sid must be the original for the schedule scenario since it cannot be updated.
     * All other fields will be ignored since they cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the &#64;scenario have invalid values.
     *   -grpc.NotFound: the scenario with the given &#64;schedule_scenario_sid doesn't exist.
     *   -grpc.Internal: error occurs when updating the scenario.
     * </pre>
     */
    default void updateScheduleScenario(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScheduleScenarioMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets config entities that match the org sending the request and given &#64;entity_type and that belong to the &#64;belongs_to_entity and &#64;schedule_scenario_sid parameters.
     * If &#64;include_member_lists is set to true the member lists of the entities retrieved will be included.
     * Any nodes in the returned set of entities will have inherited nonskill associations applied to the node's member_nonskill_activity fields.
     * Prior to listing the entities it will Resync TCN Agents and skill proficiencies.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entity_type, or &#64;belongs_to_entity have invalid values.
     *   - grpc.Internal: error occurs when getting the config entities.
     * </pre>
     */
    default void listConfigEntities(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConfigEntitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;shift_instance_sids are invalid for the org making the request.
     *   -grpc.NotFound: the shift instances with the given &#64;shift_instance_sids don't exist.
     *   -grpc.Internal: error occurs when removing the shift instances.
     * </pre>
     */
    default void deleteShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteShiftInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics and &#64;nodes_checked for the &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    default void buildNodeDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildNodeDiagnosticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the global diagnostics and &#64;nodes_checked for the &#64;schedule_scenario_sid and the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;schedule_scenario_sid has an invalid values.
     *   - grpc.NotFound: the given &#64;schedule_scenario_sid doesn't exist for the org making the request.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    default void buildGlobalDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildGlobalDiagnosticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the published schedule for the corresponding &#64;datetime_range for the org sending the request.
     * Will create a published schedule if it does not exist already for the org sending the request.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the published schedule will be returned in the published schedules shift_instances field.
     * if &#64;node_selector is set, then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range, &#64;metric_types are invalid.
     *   - grpc.NotFound: the &#64;node_selector doesn't exist.
     *   - grpc.Internal: error occurs when getting the published schedule.
     * </pre>
     */
    default void getPublishedSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublishedScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the published schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the published schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void getPublishedScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublishedScheduleRequiredCallsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the specified draft schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the draft schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void getDraftScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDraftScheduleRequiredCallsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a draft schedule for the org sending the request with the provided parameters.
     * The &#64;draft_schedule_sid of the new entity will be returned in the response.
     * The &#64;created_at and &#64;last_updated_at fields will be set to the current time and null respectively.
     * The draft schedule will include the published schedule's shift instances and shift segments.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;scheduling_range are invalid.
     *   - grpc.Internal: error occurs when creating the draft schedule.
     * </pre>
     */
    default void createDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;name, &#64;description, and &#64;datetime_range of the given &#64;draft_schedule_sid for the org sending the request.
     * The &#64;name, &#64;description, and &#64;datetime_range fields must all be set with their desired values.
     * If &#64;delete_shifts_not_in_range if true, then any instances outside of the &#64;datetime_range will be permenantly deleted with no recovery option.
     * If &#64;delete_shifts_not_in_range is false, instances outside of the new &#64;datetime_range will be retained, for use if the datetime range is expanded to cover the instances in the future.
     * If &#64;copy_shifts_into_new_range time is true, then new the portion of an expanded &#64;datetime_range which has no instances will copy the instances from the published schedule. If false, no instances will be created for an expanded &#64;scheduling_range.
     * If &#64;get_updated_shifts is true, then the returned draft schedule will also contain the shift instances and segments in the given &#64;datetime_range.
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;datetime_range are invalid.
     *   - grpc.Internal: error occurs when updating the schedule or its instances.
     * </pre>
     */
    default void updateDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Builds a draft schedule for the given &#64;node_selector in &#64;schedule_scenario_sid over &#64;schedule_scenario_scheduling_range for &#64;draft_schedule_sid and the org making the request.
     * The &#64;schedule_scenario_scheduling_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * &#64;include parameters are used when retrieving the resulting draft schedule, and work in the same way as for GetDraftSchedule.
     * Will return diagnostics for the newly built schedule, or just diagnostics if the schedule cannot be built successfully due to diagnostic error.
     * </pre>
     */
    default void buildDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBuildDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publishes the shift instances of the given &#64;draft_schedule_sid to the published schedule of the org sending the request.
     * Overlapping shift instances that aren't locked will be replaced with the instances from the draft schedule.
     * If &#64;ignore_diagnostics_errors is set to true, it will publish the schedule regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not publish the schedule.
     * &#64;include parameters are used when retrieving the resulting published schedule, and work in the same way as for GetDraftSchedule.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;req are invalid..
     *   - grpc.NotFound: &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when publishing the draft schedule.
     * </pre>
     */
    default void publishDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resets the shifts on the &#64;draft_schedule_sid for the org sending the request.
     * Shifts overlapping the &#64;datetime_range will be deleted, then that &#64;datetime_range will be populated with shifts from the published schedule.
     * If no &#64;datetime_range is provided, all shifts will be removed from the &#64;draft_schedule_sid, and published shifts will be copied across the draft's datetime range.
     * If &#64;unlocked_only is set to true, only unlocked shifts will be deleted, and the locked shift instances will remain.
     *   The published schedule will still be copied, so any newly overlapping shifts will result in an overlap warning.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid for the org sending the request.
     *   - grpc.NotFound: the &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when resetting the schedule.
     * </pre>
     */
    default void resetDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the draft schedule with &#64;draft_schedule_sid for the corresponding &#64;datetime_range for the org sending the request.
     * The &#64;datetime_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the draft schedule will be returned in the draft schedules shift_instances field.
     * if &#64;node_selector is set then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * &#64;node_selector must be for a node that belongs to the same schedule scenario as &#64;draft_schedule_sid.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid.
     *   - grpc.NotFound: the &#64;node_selector or &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when getting the draft schedule.
     * </pre>
     */
    default void getDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the draft schedules whose scheduling_range overlaps the given &#64;datetime_range for the org sending the request.
     * If &#64;datetime_range is not set, all draft schedules for the org will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range is invalid.
     *   - grpc.Internal: error occurs when listing the draft schedules.
     * </pre>
     */
    default void listDraftSchedules(com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDraftSchedulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clears shift instances from the &#64;schedule_selector for the org sending the request.
     * If &#64;node_selector is set, only shifts related to the given &#64;node_selector will be cleared.
     * If &#64;node_selector is not set, all shifts on the &#64;schedule_selector may be cleared, regardless of the shift template they are associated with.
     * If &#64;datetime_range is set, only the shifts overlapping the &#64;datetime_range will be cleared.
     * If &#64;datetime_range is not set, all shifts on the schedule will be considered in range to be deleted and &#64;invert_datetime_range and &#64;start_datetimes_only must be set to false.
     * If &#64;invert_datetime_range is set to true, the shifts overlapping the range before and after the provided &#64;datetime_range will be deleted.
     * If &#64;invert_datetime_range is set to false, the provided &#64;datetime_range will be used.
     * If &#64;start_datetimes_only is set to true, deletes the shifts that start within the &#64;datetime range, or start before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;start_datetimes_only is set to false, deletes the shifts that overlap with the &#64;datetime range, or overlap the range before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;delete_locked is set to true, both locked and unlocked shifts will be cleared.
     * If &#64;delete_locked is set to false, only shifts with &#64;is_locked set to false may be cleared.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector, &#64;schedule_selector, or &#64;datetime_range in the request are invalid.
     *   - grpc.NotFound: the draft schedule with the given &#64;schedule_selector doesn't exist.
     *   - grpc.Internal: error occurs when removing the shifts from the schedule.
     * </pre>
     */
    default void clearSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft schedule with the corresponding &#64;draft_schedule_sid for the org sending the request.
     * It also deletes all of its shift instances and segments.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;draft_schedule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the draft schedule with the given &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the draft schedule.
     * </pre>
     */
    default void deleteDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDraftScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * If &#64;include_shift_template is set to true then the related shift template for the shift instances will be returned in the shift template field.
     * If &#64;include_shift_segments is set to true then the related shift segments for the shift instances will be returned in the shift segments field.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * &#64;include_shift_segments must be true to take effect.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling
     * activities member non skill activity field. &#64;include_scheduling_activity must be true to take effect.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;org_id or &#64;shift_instance_sids in the request are invalid.
     *   - grpc.Internal: error occurs when listing the shift instances or their shift segments.
     * </pre>
     */
    default void listShiftInstancesBySid(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShiftInstancesBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copies the shifts from &#64;source_schedule_selector to &#64;destination_schedule_selector, constrained by the given parameters for the org sending the request.
     * If &#64;datetime_range is set, all shifts within the datetime range will be copied.
     * If &#64;datetime_range is not set, all shifts in the &#64;source_schedule_selector within the schedule range of the &#64;destination_schedule_selector will be copied. However if one of them is a published schedule, it will use the schedule range of the draft schedule.
     * If &#64;start_datetimes_only is set to false, then shifts are considered to be within the &#64;datetime range if any portion of them is within the range.
     * If &#64;start_datetimes_only is set to true, then only shifts with start times within the &#64;datetime range will be copied.
     * If &#64;overlap_as_warning is set to false, any overlapping shifts for a given agent will return a diagnostic error, and prevent any shifts from being copied.
     * If &#64;overlap_as_warning is set to true, the shifts will be copied regardless of overlap conflicts, and any conflicts will cause a diagnostic warning to be returned after.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the request have invalid values.
     *   -grpc.NotFound: the &#64;source_schedule_selector or &#64;destination_schedule_selector don't exist for the org sending the request.
     *   -grpc.Internal: error occurs when creating the copied shift instances.
     * </pre>
     */
    default void copyScheduleToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyScheduleToScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     * </pre>
     */
    default void createShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShiftInstanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * If &#64;wfm_agent_sids is empty, then the shift instance will be created for a newly created unassigned agent.
     * A shift instance will be created for each wfm agent sid provided.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     *   - grpc.NotFound: the &#64;draft_schedule_sid, &#64;shift_template_sid, or &#64;wfm_agent_sids do not exist for the org sending the request.
     * </pre>
     */
    default void createShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShiftInstanceV2Method(), responseObserver);
    }

    /**
     * <pre>
     * Swaps shift instances with the given &#64;shift_instance_sids that belong to &#64;wfm_agent_sid1 to belong to &#64;wfm_agent_sid2 (and viceversa).
     * Returns the swapped &#64;shift_instances after they are succesfully updated.
     * If there are other shifts for the given &#64;wfm_agent_sids with an overlap conflict, diagnostics will be returned instead.
     * All &#64;shift_instance_sids must belong to the same schedule, and be from a draft schedule.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: wfm_agent_sid_1, wfm_agent_sid_2, or shift_instance_sids do not exist for the org sending the request.
     *   - grpc.Internal: error occurs when swapping the shift instances.
     * </pre>
     */
    default void swapShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwapShiftInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    default void updateShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShiftInstanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    default void updateShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShiftInstanceV2Method(), responseObserver);
    }

    /**
     * <pre>
     * Copies the given &#64;shift_instance_sids to &#64;destination_schedule for the org sending the request.
     * If there are any overlap conflicts on &#64;destination_schedule and &#64;overlap_as_warning is set to false,
     *  then &#64;shift_instance_sids will not be copied, and a list of diagnostics detailing the overlaps will be returned.
     * If &#64;overlap_as_warning is set to true, overlap conflicts will not prevent the shifts from being copied, and the overlap diagnostics will be returned after as warning messages instead.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: the &#64;shift_instance_sids or &#64;destination_schedule does not exist for the org sending the request.
     *   - grpc.Internal: error occurs when copying the shift instances.
     * </pre>
     */
    default void copyShiftInstancesToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyShiftInstancesToScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the shift_instance_sids for the Shift Instances associated with &#64;wfm_agent_sid over the given &#64;datetime_range and &#64;schedule_selector.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void listShiftInstanceSidsForAgent(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShiftInstanceSidsForAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists shift segments for the specified shift instances for the org sending the request.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling activities member non skill activity field.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: a shift instance doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void listShiftSegmentsByShiftInstanceSids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListShiftSegmentsByShiftInstanceSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;scheduling_target for the org making the request.
     * The &#64;scheduling_target_sid of the new entity will be returned in the response.
     * Any preexisting scheduling target for &#64;node_entity will be removed upon creation of the new &#64;scheduling_target.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;scheduling_target is invalid.
     *   - grpc.NotFound: &#64;node_entity doesn't exist for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.Internal: error occours when setting the scheduling target.
     * </pre>
     */
    default void setSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSchedulingTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the &#64;own_scheduling_target, &#64;inherited_scheduling_target, and &#64;resulting_scheduling_target for the given &#64;node_selector and the org making the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector is invalid.
     *   - grpc.NotFound: the given &#64;node_selector doesn't exist for the org making the request.
     *   - grpc.Internal: error occours when getting the scheduling target.
     * </pre>
     */
    default void getSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulingTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the scheduling target of the corresponding &#64;node_selector for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;node_selector is invalid.
     *   -grpc.NotFound: the scheduling target for the given &#64;node_selector doesn't exist for the org making the request.
     *   -grpc.Internal: error occurs when removing the scheduling target.
     * </pre>
     */
    default void deleteSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSchedulingTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the performance metrics across &#64;datetime_range for shift instances in &#64;schedule_selector associated with &#64;node_selector for the org making the request.
     * Performance metrics will be generated for each of the given &#64;metric_params.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the &#64;node_selector, &#64;schedule_selector, or their shift instances doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void getPerformanceMetrics(com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPerformanceMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the required calls intervals for the given &#64;node_selector over the given &#64;datetime_range for the org making the request.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    default void listRequiredCallsIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRequiredCallsIntervalsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WFM.
   * <pre>
   * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
   * </pre>
   */
  public static abstract class WFMImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WFMGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WFM.
   * <pre>
   * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
   * </pre>
   */
  public static final class WFMStub
      extends io.grpc.stub.AbstractAsyncStub<WFMStub> {
    private WFMStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFMStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WFMStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves all the skill profiles of the org sending the request.
     * Also it can return the skills of each of the returned profiles.
     * Required permissions:
     *   NONE
     * Errors:
     * </pre>
     */
    public void listSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;name, and averages of a skill profile that has the given &#64;skill_profile_sid.
     * It also updates it to no longer be unnamed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, &#64;name or averages in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profile.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public void updateSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkillProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;proficiencies for the given skill profile's skills that belong the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;proficiencies in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profiles proficiencies.
     * </pre>
     */
    public void updateSkillProfileProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkillProfileProficienciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a skill profile that has the given &#64;skill_profile_sid.
     * It also gets all the skills and the mappings associated with that profile.
     * If the &#64;inactive_as_of_date of the skill profile is nil then the mapping is of inactive profiles to this one,
     * otherwise the mapping is of this profile to an active one.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profile.
     *   - grpc.NotFound: skill profile doesn't exist.
     * </pre>
     */
    public void getSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkillProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resyncs the skill profiles of the org sending the request.
     * It will add skills and skill profiles based on that client's historical call data.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when creating the new skills and skill profiles.
     * </pre>
     */
    public void resyncSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResyncSkillProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the last date of a skill profile resync for the org seding the request.
     * If the org has never done a skill profile resync &#64;resync_date will not be set.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the resync date.
     * </pre>
     */
    public void getLastSkillProfileResyncDate(com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastSkillProfileResyncDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given forecasting parameters for the org sending the request.
     * If the org already has an entry for them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;forecasting_parameters in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the parameters.
     * </pre>
     */
    public void upsertForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertForecastingParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the forecasting parameters for the org sending the request.
     * If the org hasn't created any parameters, it will return the default parameters.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the parameters.
     * </pre>
     */
    public void getForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetForecastingParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the historical data for the org sending the request and the given &#64;skill_profile_category.
     * It will look through the client's call history and generate the historical data by using their configured forecasting parameters (historical data period and interval width).
     * The duration of each interval will be the interval width of the org's forecasting parameters.
     * It also applies any deltas that the client has stored for the given &#64;skill_profile_category, if the category is a group it will use the deltas of the skill profiles part of that group.
     * If the client has no historical data, only the deltas will be applied to the returned intervals, all other intervals will have nil averages.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_category in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_category given is not found for the org.
     *   - grpc.Internal: error occurs when getting the historical data.
     * </pre>
     */
    public void listHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoricalDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the historical data interval.
     * </pre>
     */
    public void upsertHistoricalDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertHistoricalDataDeltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the given org already has an entry for any of the deltas, it will replace the already existing entries.
     * This is made into a unary due to the UI's lack of support for client streams.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the historical data deltas.
     * </pre>
     */
    public void upsertHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertHistoricalDataDeltasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all the skills that the org sending the request has.
     * Skills returned will be sorted by &#64;skill_sid in ascending order.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skills.
     * </pre>
     */
    public void listSkills(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds and returns a call profile template for the org sending the request and the given &#64;skill_profile_sid.
     * The template will be generated using the training data for said skill profile using the &#64;training_data_range and &#64;averages_calculation_range_in_months
     * from the client's saved forecasting parameters.
     * The &#64;total_calls in the returned template be summed from the (&#64;training_data_start_datetime - &#64;averages_calculation_range_in_months) to &#64;training_data_end_datetime,
     * or from &#64;training_data_start_datetime to &#64;training_data_end_datetime if &#64;averages_calculation_range_in_months is 0.
     * The fixed averages fields in the call profile template, will be set to the averages that the skill profile has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found for the org.
     *   - grpc.Internal: error occurs when building the call profile template.
     * </pre>
     */
    public void buildCallProfileTemplateForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildCallProfileTemplateForSkillProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a mapping entry for the &#64;inactive_skill_profile_sid to the &#64;active_skill_profile_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid, or &#64;active_skill_profile_sid in the request are invalid.
     *                   the &#64;inactive_skill_profile_sid given is of an active skill profile.
     *                   the &#64;active_skill_profile_sid given is of an inactive skill profile.
     *   - grpc.Internal: error occurs when creating the inactive skill profile mapping.
     * </pre>
     */
    public void createInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInactiveSkillProfileMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a list of enums that represent all of the forecaster types that are currently available for use
     * Required permissions:
     *  NONE
     * Errors:
     *  -grpc.Internal: error occurs when contacting the forecaster to get the available forecaster types.
     * </pre>
     */
    public void getAvailableRegressionForecasterModelTypes(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableRegressionForecasterModelTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes the current mapping for the given &#64;inactive_skill_profile_sid to be disconnected.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the skill profile is not found for the org.
     *   - grpc.Internal: the current mapping for the given &#64;inactive_skill_profile_sid is already disconnected,
     *				            the given &#64;inactive_skill_profile_sid is of an active skill profile.
     * </pre>
     */
    public void disconnectInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisconnectInactiveSkillProfileMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes deltas whose dates match the given &#64;start_datetimes for the given &#64;skill_profile_sid.
     * If no &#64;start_datetimes are given, it will delete all the deltas that the given &#64;skill_profile_sid has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, or &#64;start_datetimes in the request are invalid.
     *   - grpc.NotFound: no matching deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the historical data interval.
     * </pre>
     */
    public void deleteHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHistoricalDataDeltasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the top N skill profiles with the highest calls_count for org sending the request where N is &#64;max_number_of_profiles.
     * It will also return the number of skills found for that profile.
     * Individual skills that each profile has will not be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;max_number_of_profiles in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profiles.
     * </pre>
     */
    public void listTopSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTopSkillProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the total number of skill profiles associated with the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skill profiles count.
     * </pre>
     */
    public void getSkillProfilesCount(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkillProfilesCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    public void buildProfileForecastByInterval(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBuildProfileForecastByIntervalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * It also returns the statistics of the produced forecast by using the test data of the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    public void buildProfileForecastByIntervalWithStats(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBuildProfileForecastByIntervalWithStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds a profile forecast for the given &#64;skill_profile_sid and org sending the request using the given &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * &#64;forecast_range_start_datetime to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The intervals produced will be saved in the database.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request are invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid doesn't exist.
     *   - grpc.Internal: error occurs when upserting the profile forecast.
     * </pre>
     */
    public void upsertProfileForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertProfileForecastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;call_profile_template for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the creation of the call profile.
     * </pre>
     */
    public void createCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCallProfileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a call profile template for the requesting org that has the given &#64;call_profile_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the call profile.
     * </pre>
     */
    public void deleteCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCallProfileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an entry for the &#64;regression_template for the requesting org.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when creating the regression template.
     * </pre>
     */
    public void createRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRegressionTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a regression template for the requesting org that has the given &#64;regression_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the regression template.
     * </pre>
     */
    public void deleteRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRegressionTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all the regression templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the regression templates.
     * </pre>
     */
    public void listRegressionTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegressionTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the forecast data intervals for the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the forecast data intervals.
     * </pre>
     */
    public void listForecastIntervalsForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListForecastIntervalsForSkillProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a regression forecast using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the regression forecast.
     * </pre>
     */
    public void buildRegressionForecastByInterval(com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBuildRegressionForecastByIntervalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates a regression forecast and calculates forecast statistics using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * The first message received will be the forecast statistics while all subsequent ones will be the forecast intervals.
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs either during the when building the forecast or calculating the stats.
     * </pre>
     */
    public void buildRegressionForecastByIntervalWithStats(com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBuildRegressionForecastByIntervalWithStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the call profile templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the templates.
     * </pre>
     */
    public void listCallProfileTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCallProfileTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds a regression forecast for the org using the given &#64;regression_template and saves the resulting intervals in the db.
     * It will generate forecast intervals for the skill profiles sids in &#64;save_forecasts_for_skill_profile_sids,
     * if the list is empty or has no valid skill profile sids, it will generate and save forecasts for all active skill profiles.
     * If any intervals produced already exist in the db, they will be replaced with the ones produced.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the regression forecast.
     * </pre>
     */
    public void upsertRegressionForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertRegressionForecastMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data delta.
     * </pre>
     */
    public void upsertForecastDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertForecastDataDeltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the org already has entries for any of them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data deltas.
     * </pre>
     */
    public void upsertForecastDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertForecastDataDeltasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes forecast data intervals/deltas based on the parameters provided.
     * If &#64;delete_param is type skill_profile_sid, then the intervals/deltas to be deleted will be
     * associated with that id. If &#64;delete_param is type interval_sids, then the intervals/deltas to be
     * deleted will be contained in the list &#64;interval_sids. The &#64;delete_type field determines which
     * table(s) in the database the intervals/deltas will be deleted from.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one of the &#64;delete_params is invalid
     *   - grpc.NotFound: no matching intervals/deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the forecast data intervals/deltas.
     * </pre>
     */
    public void deleteForecastIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteForecastIntervalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the history for all the skill profiles of the requesting org.
     * Each value in every interval that has the same &#64;start_datetime of each skill profile will be summed then averaged and made into a single one.
     * When calculating the averages, each interval's values will be weighted by the number of &#64;total_calls it has.
     * History will be sorted by &#64;start_datetime in ascending order, and the range is determined by the client's historical range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when retriving the history.
     * </pre>
     */
    public void listHistoricalDataForAllSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoricalDataForAllSkillProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Converts the given &#64;profile_tod and &#64;profile_woms to a ProfileDOW and ProfileMOY.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;profile_tod or &#64;profile_woms in the request are invalid.
     *   - grpc.Internal: error occurs when building the ProfileDOW or ProfileMOY.
     * </pre>
     */
    public void buildDOWAndMOYProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildDOWAndMOYProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Calculates and returns the averages in the training data for the given &#64;skill_profile_sid.
     * Averages to be returned will be weighted by the number of calls that each training data interval has.
     * The start time that the training data will be averaged can be modified based on the forecasting parameter &#64;averages_calculation_range_in_months,
     * which will subtract that many months from the training data range end datetime and set it as the start time.
     * If &#64;averages_calculation_range_in_months is 0, it will use the training data range start datetime.
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found.
     *   - grpc.Internal: error occurs when calculating the averages from the training data.
     * </pre>
     */
    public void calculateTrainingDataAveragesForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateTrainingDataAveragesForSkillProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Calculates the averages for call characteristics using the historical data of the given &#64;skill_profile_sids and org sending the request.
     * If no &#64;skill_profile_sids are given, it will calculate the averages for all skill profiles for the org sending the request.
     * Averages will be weighted by the number of calls that each historical data interval has.
     * Once the averages are calculated, they will be updated in the db for those skill profiles.
     * If a nil &#64;datetime_range is given then the range used will be &#64;training_data_range_end_datetime - &#64;averages_calculation_range_in_months to the &#64;training_data_range_end_datetime from the forecasting parameters.
     * If &#64;averages_calculation_range_in_months is 0, it will use the &#64;training_data_range_start_datetime as the start datetime of the range.
     * If &#64;exclude_skill_profiles_with_manual_averages is true, it will exclude skill profiles that have manual averages from the calculation
     * even if those skill profiles are in &#64;skill_profile_sids.
     * Errors:
     *   - grpc.Internal: error occurs when calculating the averages from the historical data.
     * </pre>
     */
    public void updateSkillProfileAveragesUsingHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkillProfileAveragesUsingHistoricalDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the call center &#64;node that has the given &#64;call_center_node_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this call center node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the request are invalid.
     *   - grpc.Internal: error occurs when updating the call center node.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public void updateCallCenterNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCallCenterNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given client &#64;node for the org sending the request and &#64;parent_sid in the node.
     * The &#64;client_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent call center node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;parent_sid, or &#64;time_zone_val is invalid.
     *   - grpc.NotFound: parent call center node doesn't exist, or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the client node.
     * </pre>
     */
    public void createClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateClientNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a client node for the org sending the request that has the given &#64;client_node_sid and &#64;schedule_scenario_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this client node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.Internal: error occurs when updating the client &#64;node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given &#64;parent_sid (call_center_node_sid) belongs to a different scenario than this &#64;node.
     * </pre>
     */
    public void updateClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateClientNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given location &#64;node for the org sending the request and parent &#64;client_node_sid.
     * The &#64;location_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent client node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent client node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the location node.
     * </pre>
     */
    public void createLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a location node corresponding to the given &#64;location_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this location node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;location_node have invalid values.
     *   - grpc.Internal: error occurs when updating the location node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;client_node_sid belongs to a different scenario than the node to update.
     * </pre>
     */
    public void updateLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given program &#64;node for the org sending the request and parent &#64;location_node_sid.
     * The &#64;program_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent location node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent location node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the program node.
     * </pre>
     */
    public void createProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProgramNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a program node for the given &#64;program_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this program node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;program_node have invalid values.
     *   - grpc.Internal: error occurs when updating the program node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;location_node_sid belongs to a different scenario than the program node to update.
     * </pre>
     */
    public void updateProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProgramNodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;constraint_rule for the org sending the request.
     * The &#64;constraint_rule_sid and &#64;skill_proficiency_sid (if one was created) of the new entities will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency and the &#64;constraint_rule.target_sid will be ignored.
     * If the &#64;member_target_entity is for a skill proficiency, that skill proficiency will be created with the given &#64;constraint_rule as parent.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when creating the constraint rule.
     * </pre>
     */
    public void createConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConstraintRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the constraint rule corresponding for given &#64;contraint_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this constraint rule since it cannot be changed.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency, otherwise it should not be set and field will be ignored.
     * If the &#64;target_sid is for a different skill proficiency than the current one the constraint rule has as a target,
     * the old one will be deleted and a new one will be created for the given &#64;member_target_entity.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the constraint rule.
     *                  : the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when updating the constraint rule.
     * </pre>
     */
    public void updateConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConstraintRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a constraint rule with the coresponding &#64;constraint_rule_sid for the org sending the request.
     * It also deletes the entity referenced by the &#64;target_sid and &#64;rule_type if said entity is not a member of any other entity or the on call scheduling activity.
     * Required permissions:
     *  NONE
     * Errors:
     *   - grpc.Invalid: the &#64;constraint_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;constraint_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the constraint rule.
     * </pre>
     */
    public void deleteConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConstraintRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;non_skill_activity for the org sending the request.
     * Will also create a scheduling activity wrapper for the non skill activity.
     * The &#64;non_skill_activity_sid and &#64;scheduling_activity_sid of the new entities will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;non_skill_activity have invalid values.
     *   - grpc.NotFound: the &#64;schedule_scenario_sid doesn't exist.
     *   - grpc.Internal: error occurs when creating the non skill activity or scheduling activity.
     * </pre>
     */
    public void createNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNonSkillActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a non skill activity that has the given &#64;non_skill_activity_sid with the given values.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;non_skill_activity fields have invalid values.
     *   - grpc.NotFound: non skill activity for the given &#64;non_skill_activity_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the non skill activity.
     * </pre>
     */
    public void updateNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNonSkillActivityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the non skill activities that belong to the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:.
     *   - grpc.Internal: error occurs when listing the activites.
     * </pre>
     */
    public void listNonSkillActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNonSkillActivitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the IDs of non skill activities that belong to the org sending the request which have the given &#64;relationship_type with the &#64;associated_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;associated_entity or &#64;relationship_type are invalid.
     *   - grpc.Internal: error occurs when listing the associations.
     * </pre>
     */
    public void listNonSkillActivityAssociations(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNonSkillActivityAssociationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the candidate scheduling activities for a constraint or placement rule, inherited through given &#64;parent_of_rule for &#64;schedule_scenario_sid for the org making the request.
     * &#64;parent_of_rule may be any type of node, agent group, or shift template which the rule will belong to.
     * If the rule will belong to a wfm agent, the agent group must be supplied instead to get a relevant set of candidate scheduling activities.
     * Member non skill activity of each scheduling activity will be included in the response.
     * The on call scheduling activity will always be included.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;parent_of_rule is invalid.
     *   - grpc.NotFound: &#64;parent_of_rule doesn't exist
     *   - grpc.Internal: error occurs when applying inheritance or getting the nodes from &#64;parent_of_rule.
     * </pre>
     */
    public void listCandidateSchedulingActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCandidateSchedulingActivitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent group with the provided parameters.
     * A successful response should contain the &#64;agent_group_sid of the newly created entity.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;parent_entity are invalid.
     *   - grpc.NotFound: &#64;parent_entity doesn't exist
     *   - grpc.Internal: error occurs when creating the agent group.
     * </pre>
     */
    public void createAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the agent group corresponding to the &#64;agent_group_sid, &#64;name, and &#64;parent_entity.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent group since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid, &#64;parent_entity, or &#64;name in the request are invalid.
     *   - grpc.Internal: error occurs when updating the agent group.
     *   - grpc.AlreadyExists: an agent group with the given &#64;name already exists.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent group.
     * </pre>
     */
    public void updateAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a wfm agent for the given &#64;wfm_agent_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * The &#64;tcn_agent_sid cannot be updated.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;wfm_agent have invalid values.
     *   - grpc.NotFound: WFM agent with the given &#64;wfm_agent_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the wfm agent.
     * </pre>
     */
    public void updateWFMAgent(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWFMAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all wfm agents for the org sending the request.
     * if &#64;include_inactive is true then inactive agents will also be included, otherwise only active agents will be returned.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * if &#64;include_agent_groups is true then the &#64;agent_groups_by_agent response field will be set with a list of agent groups correlating to each agents index in the &#64;wfm_agents field.
     * WFM agents with no associated agent_groups will have an empty slice in agent_groups_by_agent at their correlated index.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public void listAllWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllWFMAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all candidate wfm agents for the org sending the request and given &#64;agent_group_sid.
     * A WFM agent is considered a candidate when it's active and it doesn't already belong to the given agent group.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;agent_group_sid has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public void listCandidateWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCandidateWFMAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all wfm agents who are not grouped with any agent group for the given org sending the request that were created at or after the given &#64;created_after_datetime.
     * If &#64;schedule_scenario_sid is positive, it will filter further to get only agents who are not grouped with any agent group for that scenario.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;created_after_datetime has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public void listUngroupedWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUngroupedWFMAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the IDs of wfm agents that belong to the org sending the request which are associated with the given &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid is invalid.
     *   - grpc.Internal: error occurs when listing the wfm agents.
     * </pre>
     */
    public void listWFMAgentsAssociatedWithAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWFMAgentsAssociatedWithAgentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid.
     * The &#64;schedule_scenario_sid must match the scenario of the agent group and wfm agents.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: the &#64;wfm_agent_sids or &#64;agent_group_sid don't exist for the org or given &#64;schedule_scenario_sid.
     *   - grpc.Internal: error occurs when creating the association.
     * </pre>
     */
    public void createWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWFMAgentMembershipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: any of the given memberships to delete do not exist.
     *   - grpc.Internal: error occurs when deleting the association.
     * </pre>
     */
    public void deleteWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWFMAgentMembershipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes all membership associations for the given &#64;wfm_agent_sids with the given &#64;agent_group_sids.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sids are invalid.
     *   - grpc.Internal: error occurs when deleting the associations.
     * </pre>
     */
    public void deleteWFMAgentsMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWFMAgentsMembershipsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the wfm agent associated with the given &#64;wfm_agent_sid or &#64;agent_group_sid for the org sending the request.
     * Response will only contain:
     *    one element if build for a single &#64;wfm_agent_sid.
     *    one element for each WFM agent if build for an &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;wfm_agent_sid, or &#64;agent_group_sid is invalid.
     *   - grpc.NotFound: the given &#64;wfm_agent_sid doesn't exist or the &#64;agent_group_sid has no agents.
     *   - grpc.Internal: error occurs building the diagnostics.
     * </pre>
     */
    public void buildAgentDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildAgentDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a shift template for the org sending the request with the provided parameters
     * The &#64;shift_template_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent program node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the shift template.
     * </pre>
     */
    public void createShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShiftTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a shift template for the given &#64;shift_template_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this shift template since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sid, &#64;name, &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the shift template to update.
     *   - grpc.Internal: error occurs when updating the shift template.
     * </pre>
     */
    public void updateShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShiftTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the shift templates matching the specified &#64;shift_template_sids for the org sending the request.
     * If &#64;include_placement_rules is set to true, the &#64;shift_templates will be returned with their member placement rules.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sids are invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void listShiftTemplatesBySids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShiftTemplatesBySidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the shift template associated with the given &#64;shift_template_sid for the org sending the request.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;shift_template_sid is invalid.
     *   - grpc.NotFound: the given &#64;shift_template_sid doesn't exist for the org sending the request.
     *   - grpc.Internal: error occours building the diagnostics for the shift template.
     * </pre>
     */
    public void buildShiftTemplateDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildShiftTemplateDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a placement rule for org sending the request with the provided parameters.
     * The &#64;placement_rule_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent shift template.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;placement_rule are invalid.
     *   - grpc.NotFound: the parent shift template doesn't exist or belongs to a different scenario than the one given.
     *                    the scheduling activity to associate with the placement rule doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the placement rule.
     * </pre>
     */
    public void createPlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlacementRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a placement rule corresponding with the given &#64;placement_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this placement rule since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the &#64;placement_rule are invalid.
     *   - grpc.Internal: error occurs when updating the placement rule.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     *                  : the parent shift template or related scheduling activity don't exist or belong to a different scenario than the placement rule to update.
     * </pre>
     */
    public void updatePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlacementRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a placement rule with the coresponding &#64;placement_rule_sid for the org sending the request.
     * It also deletes the scheduling activity referenced by the &#64;scheduling_activity_sid if said activity is not a member of any other entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;placement_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;placement_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the placement rule.
     * </pre>
     */
    public void deletePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePlacementRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an open times pattern for the org sending the request with the provided parameters.
     * The &#64;open_times_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;open_times_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the open times pattern.
     * </pre>
     */
    public void createOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOpenTimesPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an open times pattern for the given &#64;open_times_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this open times pattern since it cannot be changed.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;open_times_pattern have invalid values.
     *   - grpc.NotFound: the given &#64;open_times_pattern or it's &#64;parent_entity doesn't exist.
     *   - grpc.Internal: error occurs when updating the open times pattern.
     * </pre>
     */
    public void updateOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOpenTimesPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an open times pattern with the coresponding &#64;open_times_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;open_times_pattern_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;open_times_pattern doesn't exist.
     *   - grpc.Internal: error occurs when removing the open times pattern.
     * </pre>
     */
    public void deleteOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOpenTimesPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the open times patterns of &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the open times patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the open times patterns.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when getting the open times pattern bitmaps.
     * </pre>
     */
    public void getOpenTimesBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOpenTimesBitmapsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent availability pattern for the org sending the request with the provided parameters.
     * The &#64;agent_availability_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;agent_availability_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the agent availability pattern.
     * </pre>
     */
    public void createAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentAvailabilityPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an agent availability pattern for the given &#64;agent_availability_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent availability pattern since it cannot be changed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;agent_availability_pattern have invalid values.
     *   - grpc.Internal: error occurs when updating the agent avilability pattern.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent availability pattern.
     * </pre>
     */
    public void updateAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentAvailabilityPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an agent availability pattern with the coresponding &#64;agent_availability_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_availability_pattern_sid has an invalid value.
     *   - grpc.NotFound: the &#64;agent_availability_pattern with the given sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the agent availability pattern.
     * </pre>
     */
    public void deleteAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentAvailabilityPatternMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the agent availability patterns of &#64;entities_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;entities_to_check.
     * &#64;entities_to_check must have the entity_type field set with a wfm agent, agent group or a type of node.
     * If an availability bitmap is requested for an agent group, the bitmaps for all of it's member agents will be returned instead.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the availability patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the availability patterns.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entities_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;entities_to_check don't exist.
     *   - grpc.Internal: error occurs when getting the agent availability pattern bitmaps.
     * </pre>
     */
    public void getAvailabilityBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailabilityBitmapsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upserts an association for the given &#64;non_skill_activity_sid to the given &#64;node.
     * All downstream members of the entity will have their inheritance state cleared, and inherit the given association.
     * If an association already exists between the non skill activity and the &#64;node then their &#64;relationship_type will be updated.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If a NOT_ASSOCIATED_WITH relationship is being created, the tree will be checked for conflicting downstream effects.
     * If any member rules, are referencing the non skill activity and &#64;relationship_type is NOT_ASSOCIATED_WITH, then the upsert will not take effect, and the list of related entities to be updated/removed first will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;non_skill_activity_sid, &#64;node or &#64;association_type are invalid.
     *                 : the non skill activity and &#64;node belong to different scenarios.
     *   - grpc.NotFound: the &#64;non_skill_activity_sid or &#64;node don't exist.
     *   - grpc.Internal: error occurs when upserting the association.
     * </pre>
     */
    public void upsertNonSkillActivityAssociation(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertNonSkillActivityAssociationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates skill proficiencies for the org sending the request with the provided parameters.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entities.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in a &#64;proficiency, or the &#64;schedule_scenario_sid are invalid.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;parent_entity doesn't exist.
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the given &#64;skill_sid.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     *   - grpc.Internal: error occurs when creating the skill proficiencies.
     * </pre>
     */
    public void createSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSkillProficienciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates skill proficiencies corresponding to the given &#64;skill_proficiency_sids and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;skill_sid and &#64;parent_entity field of each proficiency will be ignored since it cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;skill_proficiencies have invalid values.
     *   - grpc.Internal: error occurs when updating the skill proficiencies.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the skill of the given skill proficiency.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     * </pre>
     */
    public void updateSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkillProficienciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a skill proficiency with the corresponding &#64;skill_proficiency_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;skill_proficiency_sid is invalid for the org making the request.
     *   -grpc.NotFound: the skill proficiency with the given &#64;skill_proficiency_sid doesn't exist.
     *   -grpc.Internal: error occurs when removing the skill proficiency.
     * </pre>
     */
    public void deleteSkillProficiency(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSkillProficiencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies the existing scenario with the &#64;scenario_sid_to_copy for the org sending the request using the provided parameters.
     * Scheduling targets of entities in the scenario to copy will also be copied.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:gg
     *   - grpc.Invalid: the parameters &#64;scenario_sid_to_copy or any others are invalid.
     *   - grpc.NotFound: the scenario corresponding to the &#64;scenario_sid_to_copy doesn't exist.
     *   - grpc.Internal: error occurs when creating/coping the new scenario.
     * </pre>
     */
    public void copyScenario(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new schedule scenario for the org sending the request with the provided parameters.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * It also creates 1 of each of the following: call center, client, program, location node, and on call scheduling activity (if it doesn't exist already for the org).
     * The &#64;node_description fields may optionally be left blank.
     * The &#64;copied_from_scenario_sid field will be ignored, as it will be set to nil in the newly created scenario.
     * The &#64;creation_datetime and &#64;is_default fields will also be ignored and set as the current time and false respectively.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: parameters in the &#64;req are invalid for the org making the request.
     *   - grpc.Internal: error occurs when creating the new scenario, or any of the node entities.
     * </pre>
     */
    public void createScheduleScenarioWithNodes(com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScheduleScenarioWithNodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a schedule scenario corresponding to the given &#64;schedule_scenario_sid and org sending the request with the provided parameters.
     * Only the &#64;name, &#64;description and &#64;datetime_set_to_inactive fields may be updated, and must be filled in with current value if updating the field is not desired.
     * The &#64;schedule_scenario_sid must be the original for the schedule scenario since it cannot be updated.
     * All other fields will be ignored since they cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the &#64;scenario have invalid values.
     *   -grpc.NotFound: the scenario with the given &#64;schedule_scenario_sid doesn't exist.
     *   -grpc.Internal: error occurs when updating the scenario.
     * </pre>
     */
    public void updateScheduleScenario(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScheduleScenarioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets config entities that match the org sending the request and given &#64;entity_type and that belong to the &#64;belongs_to_entity and &#64;schedule_scenario_sid parameters.
     * If &#64;include_member_lists is set to true the member lists of the entities retrieved will be included.
     * Any nodes in the returned set of entities will have inherited nonskill associations applied to the node's member_nonskill_activity fields.
     * Prior to listing the entities it will Resync TCN Agents and skill proficiencies.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entity_type, or &#64;belongs_to_entity have invalid values.
     *   - grpc.Internal: error occurs when getting the config entities.
     * </pre>
     */
    public void listConfigEntities(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConfigEntitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;shift_instance_sids are invalid for the org making the request.
     *   -grpc.NotFound: the shift instances with the given &#64;shift_instance_sids don't exist.
     *   -grpc.Internal: error occurs when removing the shift instances.
     * </pre>
     */
    public void deleteShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteShiftInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics and &#64;nodes_checked for the &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public void buildNodeDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildNodeDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds and returns the global diagnostics and &#64;nodes_checked for the &#64;schedule_scenario_sid and the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;schedule_scenario_sid has an invalid values.
     *   - grpc.NotFound: the given &#64;schedule_scenario_sid doesn't exist for the org making the request.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public void buildGlobalDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildGlobalDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the published schedule for the corresponding &#64;datetime_range for the org sending the request.
     * Will create a published schedule if it does not exist already for the org sending the request.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the published schedule will be returned in the published schedules shift_instances field.
     * if &#64;node_selector is set, then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range, &#64;metric_types are invalid.
     *   - grpc.NotFound: the &#64;node_selector doesn't exist.
     *   - grpc.Internal: error occurs when getting the published schedule.
     * </pre>
     */
    public void getPublishedSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublishedScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the published schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the published schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void getPublishedScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublishedScheduleRequiredCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the specified draft schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the draft schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void getDraftScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDraftScheduleRequiredCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a draft schedule for the org sending the request with the provided parameters.
     * The &#64;draft_schedule_sid of the new entity will be returned in the response.
     * The &#64;created_at and &#64;last_updated_at fields will be set to the current time and null respectively.
     * The draft schedule will include the published schedule's shift instances and shift segments.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;scheduling_range are invalid.
     *   - grpc.Internal: error occurs when creating the draft schedule.
     * </pre>
     */
    public void createDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the &#64;name, &#64;description, and &#64;datetime_range of the given &#64;draft_schedule_sid for the org sending the request.
     * The &#64;name, &#64;description, and &#64;datetime_range fields must all be set with their desired values.
     * If &#64;delete_shifts_not_in_range if true, then any instances outside of the &#64;datetime_range will be permenantly deleted with no recovery option.
     * If &#64;delete_shifts_not_in_range is false, instances outside of the new &#64;datetime_range will be retained, for use if the datetime range is expanded to cover the instances in the future.
     * If &#64;copy_shifts_into_new_range time is true, then new the portion of an expanded &#64;datetime_range which has no instances will copy the instances from the published schedule. If false, no instances will be created for an expanded &#64;scheduling_range.
     * If &#64;get_updated_shifts is true, then the returned draft schedule will also contain the shift instances and segments in the given &#64;datetime_range.
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;datetime_range are invalid.
     *   - grpc.Internal: error occurs when updating the schedule or its instances.
     * </pre>
     */
    public void updateDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Builds a draft schedule for the given &#64;node_selector in &#64;schedule_scenario_sid over &#64;schedule_scenario_scheduling_range for &#64;draft_schedule_sid and the org making the request.
     * The &#64;schedule_scenario_scheduling_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * &#64;include parameters are used when retrieving the resulting draft schedule, and work in the same way as for GetDraftSchedule.
     * Will return diagnostics for the newly built schedule, or just diagnostics if the schedule cannot be built successfully due to diagnostic error.
     * </pre>
     */
    public void buildDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBuildDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publishes the shift instances of the given &#64;draft_schedule_sid to the published schedule of the org sending the request.
     * Overlapping shift instances that aren't locked will be replaced with the instances from the draft schedule.
     * If &#64;ignore_diagnostics_errors is set to true, it will publish the schedule regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not publish the schedule.
     * &#64;include parameters are used when retrieving the resulting published schedule, and work in the same way as for GetDraftSchedule.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;req are invalid..
     *   - grpc.NotFound: &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when publishing the draft schedule.
     * </pre>
     */
    public void publishDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resets the shifts on the &#64;draft_schedule_sid for the org sending the request.
     * Shifts overlapping the &#64;datetime_range will be deleted, then that &#64;datetime_range will be populated with shifts from the published schedule.
     * If no &#64;datetime_range is provided, all shifts will be removed from the &#64;draft_schedule_sid, and published shifts will be copied across the draft's datetime range.
     * If &#64;unlocked_only is set to true, only unlocked shifts will be deleted, and the locked shift instances will remain.
     *   The published schedule will still be copied, so any newly overlapping shifts will result in an overlap warning.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid for the org sending the request.
     *   - grpc.NotFound: the &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when resetting the schedule.
     * </pre>
     */
    public void resetDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the draft schedule with &#64;draft_schedule_sid for the corresponding &#64;datetime_range for the org sending the request.
     * The &#64;datetime_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the draft schedule will be returned in the draft schedules shift_instances field.
     * if &#64;node_selector is set then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * &#64;node_selector must be for a node that belongs to the same schedule scenario as &#64;draft_schedule_sid.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid.
     *   - grpc.NotFound: the &#64;node_selector or &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when getting the draft schedule.
     * </pre>
     */
    public void getDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the draft schedules whose scheduling_range overlaps the given &#64;datetime_range for the org sending the request.
     * If &#64;datetime_range is not set, all draft schedules for the org will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range is invalid.
     *   - grpc.Internal: error occurs when listing the draft schedules.
     * </pre>
     */
    public void listDraftSchedules(com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDraftSchedulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clears shift instances from the &#64;schedule_selector for the org sending the request.
     * If &#64;node_selector is set, only shifts related to the given &#64;node_selector will be cleared.
     * If &#64;node_selector is not set, all shifts on the &#64;schedule_selector may be cleared, regardless of the shift template they are associated with.
     * If &#64;datetime_range is set, only the shifts overlapping the &#64;datetime_range will be cleared.
     * If &#64;datetime_range is not set, all shifts on the schedule will be considered in range to be deleted and &#64;invert_datetime_range and &#64;start_datetimes_only must be set to false.
     * If &#64;invert_datetime_range is set to true, the shifts overlapping the range before and after the provided &#64;datetime_range will be deleted.
     * If &#64;invert_datetime_range is set to false, the provided &#64;datetime_range will be used.
     * If &#64;start_datetimes_only is set to true, deletes the shifts that start within the &#64;datetime range, or start before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;start_datetimes_only is set to false, deletes the shifts that overlap with the &#64;datetime range, or overlap the range before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;delete_locked is set to true, both locked and unlocked shifts will be cleared.
     * If &#64;delete_locked is set to false, only shifts with &#64;is_locked set to false may be cleared.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector, &#64;schedule_selector, or &#64;datetime_range in the request are invalid.
     *   - grpc.NotFound: the draft schedule with the given &#64;schedule_selector doesn't exist.
     *   - grpc.Internal: error occurs when removing the shifts from the schedule.
     * </pre>
     */
    public void clearSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a draft schedule with the corresponding &#64;draft_schedule_sid for the org sending the request.
     * It also deletes all of its shift instances and segments.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;draft_schedule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the draft schedule with the given &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the draft schedule.
     * </pre>
     */
    public void deleteDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDraftScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * If &#64;include_shift_template is set to true then the related shift template for the shift instances will be returned in the shift template field.
     * If &#64;include_shift_segments is set to true then the related shift segments for the shift instances will be returned in the shift segments field.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * &#64;include_shift_segments must be true to take effect.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling
     * activities member non skill activity field. &#64;include_scheduling_activity must be true to take effect.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;org_id or &#64;shift_instance_sids in the request are invalid.
     *   - grpc.Internal: error occurs when listing the shift instances or their shift segments.
     * </pre>
     */
    public void listShiftInstancesBySid(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShiftInstancesBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies the shifts from &#64;source_schedule_selector to &#64;destination_schedule_selector, constrained by the given parameters for the org sending the request.
     * If &#64;datetime_range is set, all shifts within the datetime range will be copied.
     * If &#64;datetime_range is not set, all shifts in the &#64;source_schedule_selector within the schedule range of the &#64;destination_schedule_selector will be copied. However if one of them is a published schedule, it will use the schedule range of the draft schedule.
     * If &#64;start_datetimes_only is set to false, then shifts are considered to be within the &#64;datetime range if any portion of them is within the range.
     * If &#64;start_datetimes_only is set to true, then only shifts with start times within the &#64;datetime range will be copied.
     * If &#64;overlap_as_warning is set to false, any overlapping shifts for a given agent will return a diagnostic error, and prevent any shifts from being copied.
     * If &#64;overlap_as_warning is set to true, the shifts will be copied regardless of overlap conflicts, and any conflicts will cause a diagnostic warning to be returned after.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the request have invalid values.
     *   -grpc.NotFound: the &#64;source_schedule_selector or &#64;destination_schedule_selector don't exist for the org sending the request.
     *   -grpc.Internal: error occurs when creating the copied shift instances.
     * </pre>
     */
    public void copyScheduleToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyScheduleToScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     * </pre>
     */
    public void createShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShiftInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * If &#64;wfm_agent_sids is empty, then the shift instance will be created for a newly created unassigned agent.
     * A shift instance will be created for each wfm agent sid provided.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     *   - grpc.NotFound: the &#64;draft_schedule_sid, &#64;shift_template_sid, or &#64;wfm_agent_sids do not exist for the org sending the request.
     * </pre>
     */
    public void createShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShiftInstanceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Swaps shift instances with the given &#64;shift_instance_sids that belong to &#64;wfm_agent_sid1 to belong to &#64;wfm_agent_sid2 (and viceversa).
     * Returns the swapped &#64;shift_instances after they are succesfully updated.
     * If there are other shifts for the given &#64;wfm_agent_sids with an overlap conflict, diagnostics will be returned instead.
     * All &#64;shift_instance_sids must belong to the same schedule, and be from a draft schedule.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: wfm_agent_sid_1, wfm_agent_sid_2, or shift_instance_sids do not exist for the org sending the request.
     *   - grpc.Internal: error occurs when swapping the shift instances.
     * </pre>
     */
    public void swapShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwapShiftInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public void updateShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShiftInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public void updateShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShiftInstanceV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copies the given &#64;shift_instance_sids to &#64;destination_schedule for the org sending the request.
     * If there are any overlap conflicts on &#64;destination_schedule and &#64;overlap_as_warning is set to false,
     *  then &#64;shift_instance_sids will not be copied, and a list of diagnostics detailing the overlaps will be returned.
     * If &#64;overlap_as_warning is set to true, overlap conflicts will not prevent the shifts from being copied, and the overlap diagnostics will be returned after as warning messages instead.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: the &#64;shift_instance_sids or &#64;destination_schedule does not exist for the org sending the request.
     *   - grpc.Internal: error occurs when copying the shift instances.
     * </pre>
     */
    public void copyShiftInstancesToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyShiftInstancesToScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the shift_instance_sids for the Shift Instances associated with &#64;wfm_agent_sid over the given &#64;datetime_range and &#64;schedule_selector.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void listShiftInstanceSidsForAgent(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShiftInstanceSidsForAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists shift segments for the specified shift instances for the org sending the request.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling activities member non skill activity field.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: a shift instance doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void listShiftSegmentsByShiftInstanceSids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListShiftSegmentsByShiftInstanceSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates the given &#64;scheduling_target for the org making the request.
     * The &#64;scheduling_target_sid of the new entity will be returned in the response.
     * Any preexisting scheduling target for &#64;node_entity will be removed upon creation of the new &#64;scheduling_target.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;scheduling_target is invalid.
     *   - grpc.NotFound: &#64;node_entity doesn't exist for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.Internal: error occours when setting the scheduling target.
     * </pre>
     */
    public void setSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSchedulingTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the &#64;own_scheduling_target, &#64;inherited_scheduling_target, and &#64;resulting_scheduling_target for the given &#64;node_selector and the org making the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector is invalid.
     *   - grpc.NotFound: the given &#64;node_selector doesn't exist for the org making the request.
     *   - grpc.Internal: error occours when getting the scheduling target.
     * </pre>
     */
    public void getSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulingTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the scheduling target of the corresponding &#64;node_selector for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;node_selector is invalid.
     *   -grpc.NotFound: the scheduling target for the given &#64;node_selector doesn't exist for the org making the request.
     *   -grpc.Internal: error occurs when removing the scheduling target.
     * </pre>
     */
    public void deleteSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSchedulingTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the performance metrics across &#64;datetime_range for shift instances in &#64;schedule_selector associated with &#64;node_selector for the org making the request.
     * Performance metrics will be generated for each of the given &#64;metric_params.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the &#64;node_selector, &#64;schedule_selector, or their shift instances doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void getPerformanceMetrics(com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPerformanceMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the required calls intervals for the given &#64;node_selector over the given &#64;datetime_range for the org making the request.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public void listRequiredCallsIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRequiredCallsIntervalsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WFM.
   * <pre>
   * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
   * </pre>
   */
  public static final class WFMBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WFMBlockingStub> {
    private WFMBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFMBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WFMBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves all the skill profiles of the org sending the request.
     * Also it can return the skills of each of the returned profiles.
     * Required permissions:
     *   NONE
     * Errors:
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes listSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the &#64;name, and averages of a skill profile that has the given &#64;skill_profile_sid.
     * It also updates it to no longer be unnamed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, &#64;name or averages in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profile.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes updateSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkillProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the &#64;proficiencies for the given skill profile's skills that belong the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;proficiencies in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profiles proficiencies.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes updateSkillProfileProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkillProfileProficienciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a skill profile that has the given &#64;skill_profile_sid.
     * It also gets all the skills and the mappings associated with that profile.
     * If the &#64;inactive_as_of_date of the skill profile is nil then the mapping is of inactive profiles to this one,
     * otherwise the mapping is of this profile to an active one.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profile.
     *   - grpc.NotFound: skill profile doesn't exist.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes getSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkillProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resyncs the skill profiles of the org sending the request.
     * It will add skills and skill profiles based on that client's historical call data.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when creating the new skills and skill profiles.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes resyncSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResyncSkillProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the last date of a skill profile resync for the org seding the request.
     * If the org has never done a skill profile resync &#64;resync_date will not be set.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the resync date.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes getLastSkillProfileResyncDate(com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastSkillProfileResyncDateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given forecasting parameters for the org sending the request.
     * If the org already has an entry for them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;forecasting_parameters in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the parameters.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes upsertForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertForecastingParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the forecasting parameters for the org sending the request.
     * If the org hasn't created any parameters, it will return the default parameters.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the parameters.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes getForecastingParameters(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetForecastingParametersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the historical data for the org sending the request and the given &#64;skill_profile_category.
     * It will look through the client's call history and generate the historical data by using their configured forecasting parameters (historical data period and interval width).
     * The duration of each interval will be the interval width of the org's forecasting parameters.
     * It also applies any deltas that the client has stored for the given &#64;skill_profile_category, if the category is a group it will use the deltas of the skill profiles part of that group.
     * If the client has no historical data, only the deltas will be applied to the returned intervals, all other intervals will have nil averages.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_category in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_category given is not found for the org.
     *   - grpc.Internal: error occurs when getting the historical data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes listHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoricalDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the historical data interval.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes upsertHistoricalDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertHistoricalDataDeltaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the given org already has an entry for any of the deltas, it will replace the already existing entries.
     * This is made into a unary due to the UI's lack of support for client streams.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the historical data deltas.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes upsertHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertHistoricalDataDeltasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the skills that the org sending the request has.
     * Skills returned will be sorted by &#64;skill_sid in ascending order.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skills.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes listSkills(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds and returns a call profile template for the org sending the request and the given &#64;skill_profile_sid.
     * The template will be generated using the training data for said skill profile using the &#64;training_data_range and &#64;averages_calculation_range_in_months
     * from the client's saved forecasting parameters.
     * The &#64;total_calls in the returned template be summed from the (&#64;training_data_start_datetime - &#64;averages_calculation_range_in_months) to &#64;training_data_end_datetime,
     * or from &#64;training_data_start_datetime to &#64;training_data_end_datetime if &#64;averages_calculation_range_in_months is 0.
     * The fixed averages fields in the call profile template, will be set to the averages that the skill profile has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found for the org.
     *   - grpc.Internal: error occurs when building the call profile template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes buildCallProfileTemplateForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildCallProfileTemplateForSkillProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a mapping entry for the &#64;inactive_skill_profile_sid to the &#64;active_skill_profile_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid, or &#64;active_skill_profile_sid in the request are invalid.
     *                   the &#64;inactive_skill_profile_sid given is of an active skill profile.
     *                   the &#64;active_skill_profile_sid given is of an inactive skill profile.
     *   - grpc.Internal: error occurs when creating the inactive skill profile mapping.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes createInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInactiveSkillProfileMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a list of enums that represent all of the forecaster types that are currently available for use
     * Required permissions:
     *  NONE
     * Errors:
     *  -grpc.Internal: error occurs when contacting the forecaster to get the available forecaster types.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes getAvailableRegressionForecasterModelTypes(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableRegressionForecasterModelTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes the current mapping for the given &#64;inactive_skill_profile_sid to be disconnected.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the skill profile is not found for the org.
     *   - grpc.Internal: the current mapping for the given &#64;inactive_skill_profile_sid is already disconnected,
     *				            the given &#64;inactive_skill_profile_sid is of an active skill profile.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes disconnectInactiveSkillProfileMapping(com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisconnectInactiveSkillProfileMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes deltas whose dates match the given &#64;start_datetimes for the given &#64;skill_profile_sid.
     * If no &#64;start_datetimes are given, it will delete all the deltas that the given &#64;skill_profile_sid has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, or &#64;start_datetimes in the request are invalid.
     *   - grpc.NotFound: no matching deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the historical data interval.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes deleteHistoricalDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHistoricalDataDeltasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the top N skill profiles with the highest calls_count for org sending the request where N is &#64;max_number_of_profiles.
     * It will also return the number of skills found for that profile.
     * Individual skills that each profile has will not be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;max_number_of_profiles in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profiles.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes listTopSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTopSkillProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the total number of skill profiles associated with the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skill profiles count.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes getSkillProfilesCount(com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkillProfilesCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> buildProfileForecastByInterval(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBuildProfileForecastByIntervalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds a profile forecast using the provided &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * (&#64;training_data_range_end_datetime - &#64;forecast_test_range_in_weeks) to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * It also returns the statistics of the produced forecast by using the test data of the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the profile forecast.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes> buildProfileForecastByIntervalWithStats(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBuildProfileForecastByIntervalWithStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds a profile forecast for the given &#64;skill_profile_sid and org sending the request using the given &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * &#64;forecast_range_start_datetime to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The intervals produced will be saved in the database.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request are invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid doesn't exist.
     *   - grpc.Internal: error occurs when upserting the profile forecast.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes upsertProfileForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertProfileForecastMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given &#64;call_profile_template for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the creation of the call profile.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes createCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCallProfileTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a call profile template for the requesting org that has the given &#64;call_profile_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the call profile.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes deleteCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCallProfileTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an entry for the &#64;regression_template for the requesting org.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when creating the regression template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes createRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRegressionTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a regression template for the requesting org that has the given &#64;regression_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the regression template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes deleteRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRegressionTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the regression templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the regression templates.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes listRegressionTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegressionTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the forecast data intervals for the given &#64;skill_profile_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the forecast data intervals.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> listForecastIntervalsForSkillProfile(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListForecastIntervalsForSkillProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a regression forecast using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs during the building of the regression forecast.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval> buildRegressionForecastByInterval(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBuildRegressionForecastByIntervalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates a regression forecast and calculates forecast statistics using the provided &#64;regression_template.
     * It will generate forecast intervals for the skill profiles sids in &#64;skill_profile_sids_to_forecast.
     * It will use the client's saved forecasting test range as the start datetime and the forecast range as the end datetime of the forecasted data.
     * It will use the client's saved interval width to divide the resulting forecast intervals.
     * The first message received will be the forecast statistics while all subsequent ones will be the forecast intervals.
     * Errors:
     *   - grpc.Invalid: no &#64;skill_profile_sids_to_forecast are given or the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs either during the when building the forecast or calculating the stats.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes> buildRegressionForecastByIntervalWithStats(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBuildRegressionForecastByIntervalWithStatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the call profile templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the templates.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes listCallProfileTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCallProfileTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds a regression forecast for the org using the given &#64;regression_template and saves the resulting intervals in the db.
     * It will generate forecast intervals for the skill profiles sids in &#64;save_forecasts_for_skill_profile_sids,
     * if the list is empty or has no valid skill profile sids, it will generate and save forecasts for all active skill profiles.
     * If any intervals produced already exist in the db, they will be replaced with the ones produced.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the regression forecast.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes upsertRegressionForecast(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertRegressionForecastMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data delta.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes upsertForecastDataDelta(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertForecastDataDeltaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the org already has entries for any of them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data deltas.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes upsertForecastDataDeltas(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertForecastDataDeltasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes forecast data intervals/deltas based on the parameters provided.
     * If &#64;delete_param is type skill_profile_sid, then the intervals/deltas to be deleted will be
     * associated with that id. If &#64;delete_param is type interval_sids, then the intervals/deltas to be
     * deleted will be contained in the list &#64;interval_sids. The &#64;delete_type field determines which
     * table(s) in the database the intervals/deltas will be deleted from.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one of the &#64;delete_params is invalid
     *   - grpc.NotFound: no matching intervals/deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the forecast data intervals/deltas.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes deleteForecastIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteForecastIntervalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the history for all the skill profiles of the requesting org.
     * Each value in every interval that has the same &#64;start_datetime of each skill profile will be summed then averaged and made into a single one.
     * When calculating the averages, each interval's values will be weighted by the number of &#64;total_calls it has.
     * History will be sorted by &#64;start_datetime in ascending order, and the range is determined by the client's historical range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when retriving the history.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes listHistoricalDataForAllSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoricalDataForAllSkillProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Converts the given &#64;profile_tod and &#64;profile_woms to a ProfileDOW and ProfileMOY.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;profile_tod or &#64;profile_woms in the request are invalid.
     *   - grpc.Internal: error occurs when building the ProfileDOW or ProfileMOY.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes buildDOWAndMOYProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildDOWAndMOYProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Calculates and returns the averages in the training data for the given &#64;skill_profile_sid.
     * Averages to be returned will be weighted by the number of calls that each training data interval has.
     * The start time that the training data will be averaged can be modified based on the forecasting parameter &#64;averages_calculation_range_in_months,
     * which will subtract that many months from the training data range end datetime and set it as the start time.
     * If &#64;averages_calculation_range_in_months is 0, it will use the training data range start datetime.
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found.
     *   - grpc.Internal: error occurs when calculating the averages from the training data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes calculateTrainingDataAveragesForSkillProfile(com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateTrainingDataAveragesForSkillProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Calculates the averages for call characteristics using the historical data of the given &#64;skill_profile_sids and org sending the request.
     * If no &#64;skill_profile_sids are given, it will calculate the averages for all skill profiles for the org sending the request.
     * Averages will be weighted by the number of calls that each historical data interval has.
     * Once the averages are calculated, they will be updated in the db for those skill profiles.
     * If a nil &#64;datetime_range is given then the range used will be &#64;training_data_range_end_datetime - &#64;averages_calculation_range_in_months to the &#64;training_data_range_end_datetime from the forecasting parameters.
     * If &#64;averages_calculation_range_in_months is 0, it will use the &#64;training_data_range_start_datetime as the start datetime of the range.
     * If &#64;exclude_skill_profiles_with_manual_averages is true, it will exclude skill profiles that have manual averages from the calculation
     * even if those skill profiles are in &#64;skill_profile_sids.
     * Errors:
     *   - grpc.Internal: error occurs when calculating the averages from the historical data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes updateSkillProfileAveragesUsingHistoricalData(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkillProfileAveragesUsingHistoricalDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the call center &#64;node that has the given &#64;call_center_node_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this call center node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the request are invalid.
     *   - grpc.Internal: error occurs when updating the call center node.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes updateCallCenterNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCallCenterNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given client &#64;node for the org sending the request and &#64;parent_sid in the node.
     * The &#64;client_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent call center node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;parent_sid, or &#64;time_zone_val is invalid.
     *   - grpc.NotFound: parent call center node doesn't exist, or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the client node.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes createClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateClientNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a client node for the org sending the request that has the given &#64;client_node_sid and &#64;schedule_scenario_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this client node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.Internal: error occurs when updating the client &#64;node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given &#64;parent_sid (call_center_node_sid) belongs to a different scenario than this &#64;node.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes updateClientNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateClientNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given location &#64;node for the org sending the request and parent &#64;client_node_sid.
     * The &#64;location_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent client node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent client node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the location node.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes createLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a location node corresponding to the given &#64;location_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this location node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;location_node have invalid values.
     *   - grpc.Internal: error occurs when updating the location node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;client_node_sid belongs to a different scenario than the node to update.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes updateLocationNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given program &#64;node for the org sending the request and parent &#64;location_node_sid.
     * The &#64;program_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent location node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent location node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the program node.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes createProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProgramNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a program node for the given &#64;program_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this program node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;program_node have invalid values.
     *   - grpc.Internal: error occurs when updating the program node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;location_node_sid belongs to a different scenario than the program node to update.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes updateProgramNode(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProgramNodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given &#64;constraint_rule for the org sending the request.
     * The &#64;constraint_rule_sid and &#64;skill_proficiency_sid (if one was created) of the new entities will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency and the &#64;constraint_rule.target_sid will be ignored.
     * If the &#64;member_target_entity is for a skill proficiency, that skill proficiency will be created with the given &#64;constraint_rule as parent.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when creating the constraint rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes createConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConstraintRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the constraint rule corresponding for given &#64;contraint_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this constraint rule since it cannot be changed.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency, otherwise it should not be set and field will be ignored.
     * If the &#64;target_sid is for a different skill proficiency than the current one the constraint rule has as a target,
     * the old one will be deleted and a new one will be created for the given &#64;member_target_entity.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the constraint rule.
     *                  : the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when updating the constraint rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes updateConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConstraintRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a constraint rule with the coresponding &#64;constraint_rule_sid for the org sending the request.
     * It also deletes the entity referenced by the &#64;target_sid and &#64;rule_type if said entity is not a member of any other entity or the on call scheduling activity.
     * Required permissions:
     *  NONE
     * Errors:
     *   - grpc.Invalid: the &#64;constraint_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;constraint_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the constraint rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes deleteConstraintRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConstraintRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given &#64;non_skill_activity for the org sending the request.
     * Will also create a scheduling activity wrapper for the non skill activity.
     * The &#64;non_skill_activity_sid and &#64;scheduling_activity_sid of the new entities will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;non_skill_activity have invalid values.
     *   - grpc.NotFound: the &#64;schedule_scenario_sid doesn't exist.
     *   - grpc.Internal: error occurs when creating the non skill activity or scheduling activity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes createNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNonSkillActivityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a non skill activity that has the given &#64;non_skill_activity_sid with the given values.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;non_skill_activity fields have invalid values.
     *   - grpc.NotFound: non skill activity for the given &#64;non_skill_activity_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the non skill activity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes updateNonSkillActivity(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNonSkillActivityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the non skill activities that belong to the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:.
     *   - grpc.Internal: error occurs when listing the activites.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes listNonSkillActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNonSkillActivitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the IDs of non skill activities that belong to the org sending the request which have the given &#64;relationship_type with the &#64;associated_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;associated_entity or &#64;relationship_type are invalid.
     *   - grpc.Internal: error occurs when listing the associations.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes listNonSkillActivityAssociations(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNonSkillActivityAssociationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the candidate scheduling activities for a constraint or placement rule, inherited through given &#64;parent_of_rule for &#64;schedule_scenario_sid for the org making the request.
     * &#64;parent_of_rule may be any type of node, agent group, or shift template which the rule will belong to.
     * If the rule will belong to a wfm agent, the agent group must be supplied instead to get a relevant set of candidate scheduling activities.
     * Member non skill activity of each scheduling activity will be included in the response.
     * The on call scheduling activity will always be included.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;parent_of_rule is invalid.
     *   - grpc.NotFound: &#64;parent_of_rule doesn't exist
     *   - grpc.Internal: error occurs when applying inheritance or getting the nodes from &#64;parent_of_rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes listCandidateSchedulingActivities(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCandidateSchedulingActivitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an agent group with the provided parameters.
     * A successful response should contain the &#64;agent_group_sid of the newly created entity.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;parent_entity are invalid.
     *   - grpc.NotFound: &#64;parent_entity doesn't exist
     *   - grpc.Internal: error occurs when creating the agent group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes createAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the agent group corresponding to the &#64;agent_group_sid, &#64;name, and &#64;parent_entity.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent group since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid, &#64;parent_entity, or &#64;name in the request are invalid.
     *   - grpc.Internal: error occurs when updating the agent group.
     *   - grpc.AlreadyExists: an agent group with the given &#64;name already exists.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes updateAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a wfm agent for the given &#64;wfm_agent_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * The &#64;tcn_agent_sid cannot be updated.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;wfm_agent have invalid values.
     *   - grpc.NotFound: WFM agent with the given &#64;wfm_agent_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the wfm agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes updateWFMAgent(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWFMAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all wfm agents for the org sending the request.
     * if &#64;include_inactive is true then inactive agents will also be included, otherwise only active agents will be returned.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * if &#64;include_agent_groups is true then the &#64;agent_groups_by_agent response field will be set with a list of agent groups correlating to each agents index in the &#64;wfm_agents field.
     * WFM agents with no associated agent_groups will have an empty slice in agent_groups_by_agent at their correlated index.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes listAllWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllWFMAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all candidate wfm agents for the org sending the request and given &#64;agent_group_sid.
     * A WFM agent is considered a candidate when it's active and it doesn't already belong to the given agent group.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;agent_group_sid has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes listCandidateWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCandidateWFMAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all wfm agents who are not grouped with any agent group for the given org sending the request that were created at or after the given &#64;created_after_datetime.
     * If &#64;schedule_scenario_sid is positive, it will filter further to get only agents who are not grouped with any agent group for that scenario.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;created_after_datetime has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes listUngroupedWFMAgents(com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUngroupedWFMAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the IDs of wfm agents that belong to the org sending the request which are associated with the given &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid is invalid.
     *   - grpc.Internal: error occurs when listing the wfm agents.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes listWFMAgentsAssociatedWithAgentGroup(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWFMAgentsAssociatedWithAgentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid.
     * The &#64;schedule_scenario_sid must match the scenario of the agent group and wfm agents.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: the &#64;wfm_agent_sids or &#64;agent_group_sid don't exist for the org or given &#64;schedule_scenario_sid.
     *   - grpc.Internal: error occurs when creating the association.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes createWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWFMAgentMembershipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: any of the given memberships to delete do not exist.
     *   - grpc.Internal: error occurs when deleting the association.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes deleteWFMAgentMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWFMAgentMembershipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all membership associations for the given &#64;wfm_agent_sids with the given &#64;agent_group_sids.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sids are invalid.
     *   - grpc.Internal: error occurs when deleting the associations.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes deleteWFMAgentsMemberships(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWFMAgentsMembershipsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the wfm agent associated with the given &#64;wfm_agent_sid or &#64;agent_group_sid for the org sending the request.
     * Response will only contain:
     *    one element if build for a single &#64;wfm_agent_sid.
     *    one element for each WFM agent if build for an &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;wfm_agent_sid, or &#64;agent_group_sid is invalid.
     *   - grpc.NotFound: the given &#64;wfm_agent_sid doesn't exist or the &#64;agent_group_sid has no agents.
     *   - grpc.Internal: error occurs building the diagnostics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes buildAgentDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildAgentDiagnosticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a shift template for the org sending the request with the provided parameters
     * The &#64;shift_template_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent program node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the shift template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes createShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShiftTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a shift template for the given &#64;shift_template_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this shift template since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sid, &#64;name, &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the shift template to update.
     *   - grpc.Internal: error occurs when updating the shift template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes updateShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShiftTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the shift templates matching the specified &#64;shift_template_sids for the org sending the request.
     * If &#64;include_placement_rules is set to true, the &#64;shift_templates will be returned with their member placement rules.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sids are invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes listShiftTemplatesBySids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShiftTemplatesBySidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the shift template associated with the given &#64;shift_template_sid for the org sending the request.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;shift_template_sid is invalid.
     *   - grpc.NotFound: the given &#64;shift_template_sid doesn't exist for the org sending the request.
     *   - grpc.Internal: error occours building the diagnostics for the shift template.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes buildShiftTemplateDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildShiftTemplateDiagnosticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a placement rule for org sending the request with the provided parameters.
     * The &#64;placement_rule_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent shift template.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;placement_rule are invalid.
     *   - grpc.NotFound: the parent shift template doesn't exist or belongs to a different scenario than the one given.
     *                    the scheduling activity to associate with the placement rule doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the placement rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes createPlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlacementRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a placement rule corresponding with the given &#64;placement_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this placement rule since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the &#64;placement_rule are invalid.
     *   - grpc.Internal: error occurs when updating the placement rule.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     *                  : the parent shift template or related scheduling activity don't exist or belong to a different scenario than the placement rule to update.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes updatePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlacementRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a placement rule with the coresponding &#64;placement_rule_sid for the org sending the request.
     * It also deletes the scheduling activity referenced by the &#64;scheduling_activity_sid if said activity is not a member of any other entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;placement_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;placement_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the placement rule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes deletePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePlacementRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an open times pattern for the org sending the request with the provided parameters.
     * The &#64;open_times_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;open_times_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the open times pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes createOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOpenTimesPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an open times pattern for the given &#64;open_times_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this open times pattern since it cannot be changed.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;open_times_pattern have invalid values.
     *   - grpc.NotFound: the given &#64;open_times_pattern or it's &#64;parent_entity doesn't exist.
     *   - grpc.Internal: error occurs when updating the open times pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes updateOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOpenTimesPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an open times pattern with the coresponding &#64;open_times_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;open_times_pattern_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;open_times_pattern doesn't exist.
     *   - grpc.Internal: error occurs when removing the open times pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes deleteOpenTimesPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOpenTimesPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the open times patterns of &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the open times patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the open times patterns.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when getting the open times pattern bitmaps.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes getOpenTimesBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpenTimesBitmapsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an agent availability pattern for the org sending the request with the provided parameters.
     * The &#64;agent_availability_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;agent_availability_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the agent availability pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes createAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentAvailabilityPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an agent availability pattern for the given &#64;agent_availability_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent availability pattern since it cannot be changed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;agent_availability_pattern have invalid values.
     *   - grpc.Internal: error occurs when updating the agent avilability pattern.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent availability pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes updateAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentAvailabilityPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an agent availability pattern with the coresponding &#64;agent_availability_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_availability_pattern_sid has an invalid value.
     *   - grpc.NotFound: the &#64;agent_availability_pattern with the given sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the agent availability pattern.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes deleteAgentAvailabilityPattern(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentAvailabilityPatternMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the agent availability patterns of &#64;entities_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;entities_to_check.
     * &#64;entities_to_check must have the entity_type field set with a wfm agent, agent group or a type of node.
     * If an availability bitmap is requested for an agent group, the bitmaps for all of it's member agents will be returned instead.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the availability patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the availability patterns.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entities_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;entities_to_check don't exist.
     *   - grpc.Internal: error occurs when getting the agent availability pattern bitmaps.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes getAvailabilityBitmaps(com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailabilityBitmapsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upserts an association for the given &#64;non_skill_activity_sid to the given &#64;node.
     * All downstream members of the entity will have their inheritance state cleared, and inherit the given association.
     * If an association already exists between the non skill activity and the &#64;node then their &#64;relationship_type will be updated.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If a NOT_ASSOCIATED_WITH relationship is being created, the tree will be checked for conflicting downstream effects.
     * If any member rules, are referencing the non skill activity and &#64;relationship_type is NOT_ASSOCIATED_WITH, then the upsert will not take effect, and the list of related entities to be updated/removed first will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;non_skill_activity_sid, &#64;node or &#64;association_type are invalid.
     *                 : the non skill activity and &#64;node belong to different scenarios.
     *   - grpc.NotFound: the &#64;non_skill_activity_sid or &#64;node don't exist.
     *   - grpc.Internal: error occurs when upserting the association.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes upsertNonSkillActivityAssociation(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertNonSkillActivityAssociationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates skill proficiencies for the org sending the request with the provided parameters.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entities.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in a &#64;proficiency, or the &#64;schedule_scenario_sid are invalid.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;parent_entity doesn't exist.
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the given &#64;skill_sid.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     *   - grpc.Internal: error occurs when creating the skill proficiencies.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes createSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSkillProficienciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates skill proficiencies corresponding to the given &#64;skill_proficiency_sids and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;skill_sid and &#64;parent_entity field of each proficiency will be ignored since it cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;skill_proficiencies have invalid values.
     *   - grpc.Internal: error occurs when updating the skill proficiencies.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the skill of the given skill proficiency.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes updateSkillProficiencies(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkillProficienciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a skill proficiency with the corresponding &#64;skill_proficiency_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;skill_proficiency_sid is invalid for the org making the request.
     *   -grpc.NotFound: the skill proficiency with the given &#64;skill_proficiency_sid doesn't exist.
     *   -grpc.Internal: error occurs when removing the skill proficiency.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes deleteSkillProficiency(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSkillProficiencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies the existing scenario with the &#64;scenario_sid_to_copy for the org sending the request using the provided parameters.
     * Scheduling targets of entities in the scenario to copy will also be copied.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:gg
     *   - grpc.Invalid: the parameters &#64;scenario_sid_to_copy or any others are invalid.
     *   - grpc.NotFound: the scenario corresponding to the &#64;scenario_sid_to_copy doesn't exist.
     *   - grpc.Internal: error occurs when creating/coping the new scenario.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes copyScenario(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new schedule scenario for the org sending the request with the provided parameters.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * It also creates 1 of each of the following: call center, client, program, location node, and on call scheduling activity (if it doesn't exist already for the org).
     * The &#64;node_description fields may optionally be left blank.
     * The &#64;copied_from_scenario_sid field will be ignored, as it will be set to nil in the newly created scenario.
     * The &#64;creation_datetime and &#64;is_default fields will also be ignored and set as the current time and false respectively.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: parameters in the &#64;req are invalid for the org making the request.
     *   - grpc.Internal: error occurs when creating the new scenario, or any of the node entities.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes createScheduleScenarioWithNodes(com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScheduleScenarioWithNodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a schedule scenario corresponding to the given &#64;schedule_scenario_sid and org sending the request with the provided parameters.
     * Only the &#64;name, &#64;description and &#64;datetime_set_to_inactive fields may be updated, and must be filled in with current value if updating the field is not desired.
     * The &#64;schedule_scenario_sid must be the original for the schedule scenario since it cannot be updated.
     * All other fields will be ignored since they cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the &#64;scenario have invalid values.
     *   -grpc.NotFound: the scenario with the given &#64;schedule_scenario_sid doesn't exist.
     *   -grpc.Internal: error occurs when updating the scenario.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes updateScheduleScenario(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScheduleScenarioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets config entities that match the org sending the request and given &#64;entity_type and that belong to the &#64;belongs_to_entity and &#64;schedule_scenario_sid parameters.
     * If &#64;include_member_lists is set to true the member lists of the entities retrieved will be included.
     * Any nodes in the returned set of entities will have inherited nonskill associations applied to the node's member_nonskill_activity fields.
     * Prior to listing the entities it will Resync TCN Agents and skill proficiencies.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entity_type, or &#64;belongs_to_entity have invalid values.
     *   - grpc.Internal: error occurs when getting the config entities.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes listConfigEntities(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConfigEntitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;shift_instance_sids are invalid for the org making the request.
     *   -grpc.NotFound: the shift instances with the given &#64;shift_instance_sids don't exist.
     *   -grpc.Internal: error occurs when removing the shift instances.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes deleteShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteShiftInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics and &#64;nodes_checked for the &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes buildNodeDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildNodeDiagnosticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds and returns the global diagnostics and &#64;nodes_checked for the &#64;schedule_scenario_sid and the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;schedule_scenario_sid has an invalid values.
     *   - grpc.NotFound: the given &#64;schedule_scenario_sid doesn't exist for the org making the request.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes buildGlobalDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildGlobalDiagnosticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the published schedule for the corresponding &#64;datetime_range for the org sending the request.
     * Will create a published schedule if it does not exist already for the org sending the request.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the published schedule will be returned in the published schedules shift_instances field.
     * if &#64;node_selector is set, then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range, &#64;metric_types are invalid.
     *   - grpc.NotFound: the &#64;node_selector doesn't exist.
     *   - grpc.Internal: error occurs when getting the published schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes getPublishedSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublishedScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the published schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the published schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes getPublishedScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublishedScheduleRequiredCallsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the specified draft schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the draft schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes getDraftScheduleRequiredCalls(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDraftScheduleRequiredCallsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a draft schedule for the org sending the request with the provided parameters.
     * The &#64;draft_schedule_sid of the new entity will be returned in the response.
     * The &#64;created_at and &#64;last_updated_at fields will be set to the current time and null respectively.
     * The draft schedule will include the published schedule's shift instances and shift segments.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;scheduling_range are invalid.
     *   - grpc.Internal: error occurs when creating the draft schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes createDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the &#64;name, &#64;description, and &#64;datetime_range of the given &#64;draft_schedule_sid for the org sending the request.
     * The &#64;name, &#64;description, and &#64;datetime_range fields must all be set with their desired values.
     * If &#64;delete_shifts_not_in_range if true, then any instances outside of the &#64;datetime_range will be permenantly deleted with no recovery option.
     * If &#64;delete_shifts_not_in_range is false, instances outside of the new &#64;datetime_range will be retained, for use if the datetime range is expanded to cover the instances in the future.
     * If &#64;copy_shifts_into_new_range time is true, then new the portion of an expanded &#64;datetime_range which has no instances will copy the instances from the published schedule. If false, no instances will be created for an expanded &#64;scheduling_range.
     * If &#64;get_updated_shifts is true, then the returned draft schedule will also contain the shift instances and segments in the given &#64;datetime_range.
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;datetime_range are invalid.
     *   - grpc.Internal: error occurs when updating the schedule or its instances.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes updateDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Builds a draft schedule for the given &#64;node_selector in &#64;schedule_scenario_sid over &#64;schedule_scenario_scheduling_range for &#64;draft_schedule_sid and the org making the request.
     * The &#64;schedule_scenario_scheduling_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * &#64;include parameters are used when retrieving the resulting draft schedule, and work in the same way as for GetDraftSchedule.
     * Will return diagnostics for the newly built schedule, or just diagnostics if the schedule cannot be built successfully due to diagnostic error.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes buildDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBuildDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publishes the shift instances of the given &#64;draft_schedule_sid to the published schedule of the org sending the request.
     * Overlapping shift instances that aren't locked will be replaced with the instances from the draft schedule.
     * If &#64;ignore_diagnostics_errors is set to true, it will publish the schedule regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not publish the schedule.
     * &#64;include parameters are used when retrieving the resulting published schedule, and work in the same way as for GetDraftSchedule.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;req are invalid..
     *   - grpc.NotFound: &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when publishing the draft schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes publishDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resets the shifts on the &#64;draft_schedule_sid for the org sending the request.
     * Shifts overlapping the &#64;datetime_range will be deleted, then that &#64;datetime_range will be populated with shifts from the published schedule.
     * If no &#64;datetime_range is provided, all shifts will be removed from the &#64;draft_schedule_sid, and published shifts will be copied across the draft's datetime range.
     * If &#64;unlocked_only is set to true, only unlocked shifts will be deleted, and the locked shift instances will remain.
     *   The published schedule will still be copied, so any newly overlapping shifts will result in an overlap warning.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid for the org sending the request.
     *   - grpc.NotFound: the &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when resetting the schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes resetDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the draft schedule with &#64;draft_schedule_sid for the corresponding &#64;datetime_range for the org sending the request.
     * The &#64;datetime_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the draft schedule will be returned in the draft schedules shift_instances field.
     * if &#64;node_selector is set then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * &#64;node_selector must be for a node that belongs to the same schedule scenario as &#64;draft_schedule_sid.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid.
     *   - grpc.NotFound: the &#64;node_selector or &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when getting the draft schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes getDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the draft schedules whose scheduling_range overlaps the given &#64;datetime_range for the org sending the request.
     * If &#64;datetime_range is not set, all draft schedules for the org will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range is invalid.
     *   - grpc.Internal: error occurs when listing the draft schedules.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes listDraftSchedules(com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDraftSchedulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clears shift instances from the &#64;schedule_selector for the org sending the request.
     * If &#64;node_selector is set, only shifts related to the given &#64;node_selector will be cleared.
     * If &#64;node_selector is not set, all shifts on the &#64;schedule_selector may be cleared, regardless of the shift template they are associated with.
     * If &#64;datetime_range is set, only the shifts overlapping the &#64;datetime_range will be cleared.
     * If &#64;datetime_range is not set, all shifts on the schedule will be considered in range to be deleted and &#64;invert_datetime_range and &#64;start_datetimes_only must be set to false.
     * If &#64;invert_datetime_range is set to true, the shifts overlapping the range before and after the provided &#64;datetime_range will be deleted.
     * If &#64;invert_datetime_range is set to false, the provided &#64;datetime_range will be used.
     * If &#64;start_datetimes_only is set to true, deletes the shifts that start within the &#64;datetime range, or start before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;start_datetimes_only is set to false, deletes the shifts that overlap with the &#64;datetime range, or overlap the range before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;delete_locked is set to true, both locked and unlocked shifts will be cleared.
     * If &#64;delete_locked is set to false, only shifts with &#64;is_locked set to false may be cleared.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector, &#64;schedule_selector, or &#64;datetime_range in the request are invalid.
     *   - grpc.NotFound: the draft schedule with the given &#64;schedule_selector doesn't exist.
     *   - grpc.Internal: error occurs when removing the shifts from the schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes clearSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a draft schedule with the corresponding &#64;draft_schedule_sid for the org sending the request.
     * It also deletes all of its shift instances and segments.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;draft_schedule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the draft schedule with the given &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the draft schedule.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes deleteDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDraftScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * If &#64;include_shift_template is set to true then the related shift template for the shift instances will be returned in the shift template field.
     * If &#64;include_shift_segments is set to true then the related shift segments for the shift instances will be returned in the shift segments field.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * &#64;include_shift_segments must be true to take effect.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling
     * activities member non skill activity field. &#64;include_scheduling_activity must be true to take effect.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;org_id or &#64;shift_instance_sids in the request are invalid.
     *   - grpc.Internal: error occurs when listing the shift instances or their shift segments.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes listShiftInstancesBySid(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShiftInstancesBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies the shifts from &#64;source_schedule_selector to &#64;destination_schedule_selector, constrained by the given parameters for the org sending the request.
     * If &#64;datetime_range is set, all shifts within the datetime range will be copied.
     * If &#64;datetime_range is not set, all shifts in the &#64;source_schedule_selector within the schedule range of the &#64;destination_schedule_selector will be copied. However if one of them is a published schedule, it will use the schedule range of the draft schedule.
     * If &#64;start_datetimes_only is set to false, then shifts are considered to be within the &#64;datetime range if any portion of them is within the range.
     * If &#64;start_datetimes_only is set to true, then only shifts with start times within the &#64;datetime range will be copied.
     * If &#64;overlap_as_warning is set to false, any overlapping shifts for a given agent will return a diagnostic error, and prevent any shifts from being copied.
     * If &#64;overlap_as_warning is set to true, the shifts will be copied regardless of overlap conflicts, and any conflicts will cause a diagnostic warning to be returned after.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the request have invalid values.
     *   -grpc.NotFound: the &#64;source_schedule_selector or &#64;destination_schedule_selector don't exist for the org sending the request.
     *   -grpc.Internal: error occurs when creating the copied shift instances.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes copyScheduleToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyScheduleToScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes createShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShiftInstanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * If &#64;wfm_agent_sids is empty, then the shift instance will be created for a newly created unassigned agent.
     * A shift instance will be created for each wfm agent sid provided.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     *   - grpc.NotFound: the &#64;draft_schedule_sid, &#64;shift_template_sid, or &#64;wfm_agent_sids do not exist for the org sending the request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res createShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShiftInstanceV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Swaps shift instances with the given &#64;shift_instance_sids that belong to &#64;wfm_agent_sid1 to belong to &#64;wfm_agent_sid2 (and viceversa).
     * Returns the swapped &#64;shift_instances after they are succesfully updated.
     * If there are other shifts for the given &#64;wfm_agent_sids with an overlap conflict, diagnostics will be returned instead.
     * All &#64;shift_instance_sids must belong to the same schedule, and be from a draft schedule.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: wfm_agent_sid_1, wfm_agent_sid_2, or shift_instance_sids do not exist for the org sending the request.
     *   - grpc.Internal: error occurs when swapping the shift instances.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes swapShiftInstances(com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwapShiftInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes updateShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShiftInstanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res updateShiftInstanceV2(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShiftInstanceV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copies the given &#64;shift_instance_sids to &#64;destination_schedule for the org sending the request.
     * If there are any overlap conflicts on &#64;destination_schedule and &#64;overlap_as_warning is set to false,
     *  then &#64;shift_instance_sids will not be copied, and a list of diagnostics detailing the overlaps will be returned.
     * If &#64;overlap_as_warning is set to true, overlap conflicts will not prevent the shifts from being copied, and the overlap diagnostics will be returned after as warning messages instead.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: the &#64;shift_instance_sids or &#64;destination_schedule does not exist for the org sending the request.
     *   - grpc.Internal: error occurs when copying the shift instances.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes copyShiftInstancesToSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyShiftInstancesToScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the shift_instance_sids for the Shift Instances associated with &#64;wfm_agent_sid over the given &#64;datetime_range and &#64;schedule_selector.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes listShiftInstanceSidsForAgent(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShiftInstanceSidsForAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists shift segments for the specified shift instances for the org sending the request.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling activities member non skill activity field.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: a shift instance doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes listShiftSegmentsByShiftInstanceSids(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListShiftSegmentsByShiftInstanceSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates the given &#64;scheduling_target for the org making the request.
     * The &#64;scheduling_target_sid of the new entity will be returned in the response.
     * Any preexisting scheduling target for &#64;node_entity will be removed upon creation of the new &#64;scheduling_target.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;scheduling_target is invalid.
     *   - grpc.NotFound: &#64;node_entity doesn't exist for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.Internal: error occours when setting the scheduling target.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes setSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSchedulingTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the &#64;own_scheduling_target, &#64;inherited_scheduling_target, and &#64;resulting_scheduling_target for the given &#64;node_selector and the org making the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector is invalid.
     *   - grpc.NotFound: the given &#64;node_selector doesn't exist for the org making the request.
     *   - grpc.Internal: error occours when getting the scheduling target.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes getSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulingTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the scheduling target of the corresponding &#64;node_selector for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;node_selector is invalid.
     *   -grpc.NotFound: the scheduling target for the given &#64;node_selector doesn't exist for the org making the request.
     *   -grpc.Internal: error occurs when removing the scheduling target.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes deleteSchedulingTarget(com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSchedulingTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the performance metrics across &#64;datetime_range for shift instances in &#64;schedule_selector associated with &#64;node_selector for the org making the request.
     * Performance metrics will be generated for each of the given &#64;metric_params.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the &#64;node_selector, &#64;schedule_selector, or their shift instances doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes getPerformanceMetrics(com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPerformanceMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the required calls intervals for the given &#64;node_selector over the given &#64;datetime_range for the org making the request.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes listRequiredCallsIntervals(com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRequiredCallsIntervalsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WFM.
   * <pre>
   * WFM is responsible for call prediction and call volume calculations based on call skills and other parameters.
   * </pre>
   */
  public static final class WFMFutureStub
      extends io.grpc.stub.AbstractFutureStub<WFMFutureStub> {
    private WFMFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFMFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WFMFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves all the skill profiles of the org sending the request.
     * Also it can return the skills of each of the returned profiles.
     * Required permissions:
     *   NONE
     * Errors:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes> listSkillProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the &#64;name, and averages of a skill profile that has the given &#64;skill_profile_sid.
     * It also updates it to no longer be unnamed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, &#64;name or averages in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profile.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes> updateSkillProfile(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkillProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the &#64;proficiencies for the given skill profile's skills that belong the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;proficiencies in the request are invalid.
     *   - grpc.Internal: error occurs when updating the skill profiles proficiencies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes> updateSkillProfileProficiencies(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkillProfileProficienciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a skill profile that has the given &#64;skill_profile_sid.
     * It also gets all the skills and the mappings associated with that profile.
     * If the &#64;inactive_as_of_date of the skill profile is nil then the mapping is of inactive profiles to this one,
     * otherwise the mapping is of this profile to an active one.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profile.
     *   - grpc.NotFound: skill profile doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes> getSkillProfile(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkillProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resyncs the skill profiles of the org sending the request.
     * It will add skills and skill profiles based on that client's historical call data.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when creating the new skills and skill profiles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes> resyncSkillProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResyncSkillProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the last date of a skill profile resync for the org seding the request.
     * If the org has never done a skill profile resync &#64;resync_date will not be set.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the resync date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes> getLastSkillProfileResyncDate(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastSkillProfileResyncDateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given forecasting parameters for the org sending the request.
     * If the org already has an entry for them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;forecasting_parameters in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes> upsertForecastingParameters(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertForecastingParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the forecasting parameters for the org sending the request.
     * If the org hasn't created any parameters, it will return the default parameters.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes> getForecastingParameters(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetForecastingParametersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the historical data for the org sending the request and the given &#64;skill_profile_category.
     * It will look through the client's call history and generate the historical data by using their configured forecasting parameters (historical data period and interval width).
     * The duration of each interval will be the interval width of the org's forecasting parameters.
     * It also applies any deltas that the client has stored for the given &#64;skill_profile_category, if the category is a group it will use the deltas of the skill profiles part of that group.
     * If the client has no historical data, only the deltas will be applied to the returned intervals, all other intervals will have nil averages.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_category in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_category given is not found for the org.
     *   - grpc.Internal: error occurs when getting the historical data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes> listHistoricalData(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoricalDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the historical data interval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes> upsertHistoricalDataDelta(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertHistoricalDataDeltaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the given org already has an entry for any of the deltas, it will replace the already existing entries.
     * This is made into a unary due to the UI's lack of support for client streams.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the historical data deltas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes> upsertHistoricalDataDeltas(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertHistoricalDataDeltasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all the skills that the org sending the request has.
     * Skills returned will be sorted by &#64;skill_sid in ascending order.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skills.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes> listSkills(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds and returns a call profile template for the org sending the request and the given &#64;skill_profile_sid.
     * The template will be generated using the training data for said skill profile using the &#64;training_data_range and &#64;averages_calculation_range_in_months
     * from the client's saved forecasting parameters.
     * The &#64;total_calls in the returned template be summed from the (&#64;training_data_start_datetime - &#64;averages_calculation_range_in_months) to &#64;training_data_end_datetime,
     * or from &#64;training_data_start_datetime to &#64;training_data_end_datetime if &#64;averages_calculation_range_in_months is 0.
     * The fixed averages fields in the call profile template, will be set to the averages that the skill profile has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found for the org.
     *   - grpc.Internal: error occurs when building the call profile template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes> buildCallProfileTemplateForSkillProfile(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildCallProfileTemplateForSkillProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a mapping entry for the &#64;inactive_skill_profile_sid to the &#64;active_skill_profile_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid, or &#64;active_skill_profile_sid in the request are invalid.
     *                   the &#64;inactive_skill_profile_sid given is of an active skill profile.
     *                   the &#64;active_skill_profile_sid given is of an inactive skill profile.
     *   - grpc.Internal: error occurs when creating the inactive skill profile mapping.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes> createInactiveSkillProfileMapping(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInactiveSkillProfileMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a list of enums that represent all of the forecaster types that are currently available for use
     * Required permissions:
     *  NONE
     * Errors:
     *  -grpc.Internal: error occurs when contacting the forecaster to get the available forecaster types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes> getAvailableRegressionForecasterModelTypes(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableRegressionForecasterModelTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes the current mapping for the given &#64;inactive_skill_profile_sid to be disconnected.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;inactive_skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the skill profile is not found for the org.
     *   - grpc.Internal: the current mapping for the given &#64;inactive_skill_profile_sid is already disconnected,
     *				            the given &#64;inactive_skill_profile_sid is of an active skill profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes> disconnectInactiveSkillProfileMapping(
        com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisconnectInactiveSkillProfileMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes deltas whose dates match the given &#64;start_datetimes for the given &#64;skill_profile_sid.
     * If no &#64;start_datetimes are given, it will delete all the deltas that the given &#64;skill_profile_sid has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid, or &#64;start_datetimes in the request are invalid.
     *   - grpc.NotFound: no matching deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the historical data interval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes> deleteHistoricalDataDeltas(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHistoricalDataDeltasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the top N skill profiles with the highest calls_count for org sending the request where N is &#64;max_number_of_profiles.
     * It will also return the number of skills found for that profile.
     * Individual skills that each profile has will not be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;max_number_of_profiles in the request is invalid.
     *   - grpc.Internal: error occurs when getting the skill profiles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes> listTopSkillProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTopSkillProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the total number of skill profiles associated with the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the skill profiles count.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes> getSkillProfilesCount(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkillProfilesCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds a profile forecast for the given &#64;skill_profile_sid and org sending the request using the given &#64;call_profile_template.
     * The forecaster will produce intervals from the following range using the client's saved forecasting parameters:
     * &#64;forecast_range_start_datetime to &#64;forecast_range_end_datetime.
     * The &#64;total_calls in the &#64;call_profile_template will be scaled using the same ranges as BuildCallProfileTemplateForSkillProfile.
     * The intervals produced will be saved in the database.
     * The &#64;fixed_averages_forecast field indicates whether or not to do a fixed averages forecast.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid or &#64;call_profile_template in the request are invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid doesn't exist.
     *   - grpc.Internal: error occurs when upserting the profile forecast.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes> upsertProfileForecast(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertProfileForecastMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given &#64;call_profile_template for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template in the request is invalid.
     *   - grpc.Internal: error occurs during the creation of the call profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes> createCallProfileTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCallProfileTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a call profile template for the requesting org that has the given &#64;call_profile_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;call_profile_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the call profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes> deleteCallProfileTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCallProfileTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an entry for the &#64;regression_template for the requesting org.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when creating the regression template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes> createRegressionTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRegressionTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a regression template for the requesting org that has the given &#64;regression_template_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template_sid in the request is invalid.
     *   - grpc.Internal: error occurs during the deletion of the regression template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes> deleteRegressionTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRegressionTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all the regression templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the regression templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes> listRegressionTemplates(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegressionTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the call profile templates that the org sending the request has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the templates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes> listCallProfileTemplates(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCallProfileTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds a regression forecast for the org using the given &#64;regression_template and saves the resulting intervals in the db.
     * It will generate forecast intervals for the skill profiles sids in &#64;save_forecasts_for_skill_profile_sids,
     * if the list is empty or has no valid skill profile sids, it will generate and save forecasts for all active skill profiles.
     * If any intervals produced already exist in the db, they will be replaced with the ones produced.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;regression_template in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the regression forecast.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes> upsertRegressionForecast(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertRegressionForecastMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tries to create an entry for the given &#64;delta for the org sending the request.
     * If the org already has an entry for it, it will update the already exisiting entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;delta in the request is invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data delta.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes> upsertForecastDataDelta(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertForecastDataDeltaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Tries to create entries for the given &#64;deltas.
     * If the org already has entries for any of them, it will update the already existing entry.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;deltas in the request are invalid.
     *   - grpc.Internal: error occurs when upserting the forecast data deltas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes> upsertForecastDataDeltas(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertForecastDataDeltasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes forecast data intervals/deltas based on the parameters provided.
     * If &#64;delete_param is type skill_profile_sid, then the intervals/deltas to be deleted will be
     * associated with that id. If &#64;delete_param is type interval_sids, then the intervals/deltas to be
     * deleted will be contained in the list &#64;interval_sids. The &#64;delete_type field determines which
     * table(s) in the database the intervals/deltas will be deleted from.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one of the &#64;delete_params is invalid
     *   - grpc.NotFound: no matching intervals/deltas are found for deletion.
     *   - grpc.Internal: error occurs during the deletion of the forecast data intervals/deltas.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes> deleteForecastIntervals(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteForecastIntervalsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the history for all the skill profiles of the requesting org.
     * Each value in every interval that has the same &#64;start_datetime of each skill profile will be summed then averaged and made into a single one.
     * When calculating the averages, each interval's values will be weighted by the number of &#64;total_calls it has.
     * History will be sorted by &#64;start_datetime in ascending order, and the range is determined by the client's historical range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when retriving the history.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes> listHistoricalDataForAllSkillProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoricalDataForAllSkillProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Converts the given &#64;profile_tod and &#64;profile_woms to a ProfileDOW and ProfileMOY.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;profile_tod or &#64;profile_woms in the request are invalid.
     *   - grpc.Internal: error occurs when building the ProfileDOW or ProfileMOY.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes> buildDOWAndMOYProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildDOWAndMOYProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Calculates and returns the averages in the training data for the given &#64;skill_profile_sid.
     * Averages to be returned will be weighted by the number of calls that each training data interval has.
     * The start time that the training data will be averaged can be modified based on the forecasting parameter &#64;averages_calculation_range_in_months,
     * which will subtract that many months from the training data range end datetime and set it as the start time.
     * If &#64;averages_calculation_range_in_months is 0, it will use the training data range start datetime.
     * Errors:
     *   - grpc.Invalid: the &#64;skill_profile_sid in the request is invalid.
     *   - grpc.NotFound: the &#64;skill_profile_sid given is not found.
     *   - grpc.Internal: error occurs when calculating the averages from the training data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes> calculateTrainingDataAveragesForSkillProfile(
        com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateTrainingDataAveragesForSkillProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Calculates the averages for call characteristics using the historical data of the given &#64;skill_profile_sids and org sending the request.
     * If no &#64;skill_profile_sids are given, it will calculate the averages for all skill profiles for the org sending the request.
     * Averages will be weighted by the number of calls that each historical data interval has.
     * Once the averages are calculated, they will be updated in the db for those skill profiles.
     * If a nil &#64;datetime_range is given then the range used will be &#64;training_data_range_end_datetime - &#64;averages_calculation_range_in_months to the &#64;training_data_range_end_datetime from the forecasting parameters.
     * If &#64;averages_calculation_range_in_months is 0, it will use the &#64;training_data_range_start_datetime as the start datetime of the range.
     * If &#64;exclude_skill_profiles_with_manual_averages is true, it will exclude skill profiles that have manual averages from the calculation
     * even if those skill profiles are in &#64;skill_profile_sids.
     * Errors:
     *   - grpc.Internal: error occurs when calculating the averages from the historical data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes> updateSkillProfileAveragesUsingHistoricalData(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkillProfileAveragesUsingHistoricalDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the call center &#64;node that has the given &#64;call_center_node_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this call center node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the request are invalid.
     *   - grpc.Internal: error occurs when updating the call center node.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes> updateCallCenterNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCallCenterNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given client &#64;node for the org sending the request and &#64;parent_sid in the node.
     * The &#64;client_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent call center node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;parent_sid, or &#64;time_zone_val is invalid.
     *   - grpc.NotFound: parent call center node doesn't exist, or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the client node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes> createClientNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateClientNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a client node for the org sending the request that has the given &#64;client_node_sid and &#64;schedule_scenario_sid.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this client node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.Internal: error occurs when updating the client &#64;node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given &#64;parent_sid (call_center_node_sid) belongs to a different scenario than this &#64;node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes> updateClientNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateClientNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given location &#64;node for the org sending the request and parent &#64;client_node_sid.
     * The &#64;location_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent client node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent client node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the location node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes> createLocationNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a location node corresponding to the given &#64;location_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this location node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;location_node have invalid values.
     *   - grpc.Internal: error occurs when updating the location node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;client_node_sid belongs to a different scenario than the node to update.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes> updateLocationNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given program &#64;node for the org sending the request and parent &#64;location_node_sid.
     * The &#64;program_node_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent location node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * The &#64;origin_sid must be set to nil, since this method can only make an original node.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;node have invalid values.
     *   - grpc.NotFound: parent location node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the program node.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes> createProgramNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProgramNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a program node for the given &#64;program_node_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this program node since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;program_node have invalid values.
     *   - grpc.Internal: error occurs when updating the program node.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the given parent &#64;location_node_sid belongs to a different scenario than the program node to update.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes> updateProgramNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProgramNodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given &#64;constraint_rule for the org sending the request.
     * The &#64;constraint_rule_sid and &#64;skill_proficiency_sid (if one was created) of the new entities will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency and the &#64;constraint_rule.target_sid will be ignored.
     * If the &#64;member_target_entity is for a skill proficiency, that skill proficiency will be created with the given &#64;constraint_rule as parent.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when creating the constraint rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes> createConstraintRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConstraintRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the constraint rule corresponding for given &#64;contraint_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this constraint rule since it cannot be changed.
     * If &#64;rule_type is set to MIN_SKILL_LEVEL, the &#64;member_target_entity field must be set with a skill proficiency, otherwise it should not be set and field will be ignored.
     * If the &#64;target_sid is for a different skill proficiency than the current one the constraint rule has as a target,
     * the old one will be deleted and a new one will be created for the given &#64;member_target_entity.
     * If &#64;rule_type is NOT MIN_SKILL_LEVEL then the &#64;target_sid must be that of a scheduling activity.
     * The all other &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;constraint_rule have invalid values.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the constraint rule.
     *                  : the given &#64;target_sid for the given &#64;rule_type, or &#64;parent_entity don't exist.
     *   - grpc.Internal: error occurs when updating the constraint rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes> updateConstraintRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConstraintRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a constraint rule with the coresponding &#64;constraint_rule_sid for the org sending the request.
     * It also deletes the entity referenced by the &#64;target_sid and &#64;rule_type if said entity is not a member of any other entity or the on call scheduling activity.
     * Required permissions:
     *  NONE
     * Errors:
     *   - grpc.Invalid: the &#64;constraint_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;constraint_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the constraint rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes> deleteConstraintRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConstraintRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given &#64;non_skill_activity for the org sending the request.
     * Will also create a scheduling activity wrapper for the non skill activity.
     * The &#64;non_skill_activity_sid and &#64;scheduling_activity_sid of the new entities will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;non_skill_activity have invalid values.
     *   - grpc.NotFound: the &#64;schedule_scenario_sid doesn't exist.
     *   - grpc.Internal: error occurs when creating the non skill activity or scheduling activity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes> createNonSkillActivity(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNonSkillActivityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a non skill activity that has the given &#64;non_skill_activity_sid with the given values.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;non_skill_activity fields have invalid values.
     *   - grpc.NotFound: non skill activity for the given &#64;non_skill_activity_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the non skill activity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes> updateNonSkillActivity(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNonSkillActivityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the non skill activities that belong to the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:.
     *   - grpc.Internal: error occurs when listing the activites.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes> listNonSkillActivities(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNonSkillActivitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the IDs of non skill activities that belong to the org sending the request which have the given &#64;relationship_type with the &#64;associated_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;associated_entity or &#64;relationship_type are invalid.
     *   - grpc.Internal: error occurs when listing the associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes> listNonSkillActivityAssociations(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNonSkillActivityAssociationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the candidate scheduling activities for a constraint or placement rule, inherited through given &#64;parent_of_rule for &#64;schedule_scenario_sid for the org making the request.
     * &#64;parent_of_rule may be any type of node, agent group, or shift template which the rule will belong to.
     * If the rule will belong to a wfm agent, the agent group must be supplied instead to get a relevant set of candidate scheduling activities.
     * Member non skill activity of each scheduling activity will be included in the response.
     * The on call scheduling activity will always be included.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;parent_of_rule is invalid.
     *   - grpc.NotFound: &#64;parent_of_rule doesn't exist
     *   - grpc.Internal: error occurs when applying inheritance or getting the nodes from &#64;parent_of_rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes> listCandidateSchedulingActivities(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCandidateSchedulingActivitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an agent group with the provided parameters.
     * A successful response should contain the &#64;agent_group_sid of the newly created entity.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;parent_entity are invalid.
     *   - grpc.NotFound: &#64;parent_entity doesn't exist
     *   - grpc.Internal: error occurs when creating the agent group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes> createAgentGroup(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the agent group corresponding to the &#64;agent_group_sid, &#64;name, and &#64;parent_entity.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent group since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid, &#64;parent_entity, or &#64;name in the request are invalid.
     *   - grpc.Internal: error occurs when updating the agent group.
     *   - grpc.AlreadyExists: an agent group with the given &#64;name already exists.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes> updateAgentGroup(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a wfm agent for the given &#64;wfm_agent_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * The &#64;tcn_agent_sid cannot be updated.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;wfm_agent have invalid values.
     *   - grpc.NotFound: WFM agent with the given &#64;wfm_agent_sid doesn't exist.
     *   - grpc.Internal: error occurs when updating the wfm agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes> updateWFMAgent(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWFMAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all wfm agents for the org sending the request.
     * if &#64;include_inactive is true then inactive agents will also be included, otherwise only active agents will be returned.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * if &#64;include_agent_groups is true then the &#64;agent_groups_by_agent response field will be set with a list of agent groups correlating to each agents index in the &#64;wfm_agents field.
     * WFM agents with no associated agent_groups will have an empty slice in agent_groups_by_agent at their correlated index.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes> listAllWFMAgents(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllWFMAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all candidate wfm agents for the org sending the request and given &#64;agent_group_sid.
     * A WFM agent is considered a candidate when it's active and it doesn't already belong to the given agent group.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;agent_group_sid has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes> listCandidateWFMAgents(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCandidateWFMAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all wfm agents who are not grouped with any agent group for the given org sending the request that were created at or after the given &#64;created_after_datetime.
     * If &#64;schedule_scenario_sid is positive, it will filter further to get only agents who are not grouped with any agent group for that scenario.
     * if &#64;include_skill_proficiencies is true then agents returned will include their skill proficiencies.
     * Member entities will not be returned.
     * Required Permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: &#64;created_after_datetime has an invalid value.
     *   - grpc.Internal: error occurs when getting the wfm agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes> listUngroupedWFMAgents(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUngroupedWFMAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the IDs of wfm agents that belong to the org sending the request which are associated with the given &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_group_sid is invalid.
     *   - grpc.Internal: error occurs when listing the wfm agents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes> listWFMAgentsAssociatedWithAgentGroup(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWFMAgentsAssociatedWithAgentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid.
     * The &#64;schedule_scenario_sid must match the scenario of the agent group and wfm agents.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: the &#64;wfm_agent_sids or &#64;agent_group_sid don't exist for the org or given &#64;schedule_scenario_sid.
     *   - grpc.Internal: error occurs when creating the association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes> createWFMAgentMemberships(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWFMAgentMembershipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a membership association for each of the given &#64;wfm_agent_sids with the given &#64;agent_group_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sid are invalid.
     *   - grpc.NotFound: any of the given memberships to delete do not exist.
     *   - grpc.Internal: error occurs when deleting the association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes> deleteWFMAgentMemberships(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWFMAgentMembershipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes all membership associations for the given &#64;wfm_agent_sids with the given &#64;agent_group_sids.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;wfm_agent_sids, or &#64;agent_group_sids are invalid.
     *   - grpc.Internal: error occurs when deleting the associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes> deleteWFMAgentsMemberships(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWFMAgentsMembershipsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the wfm agent associated with the given &#64;wfm_agent_sid or &#64;agent_group_sid for the org sending the request.
     * Response will only contain:
     *    one element if build for a single &#64;wfm_agent_sid.
     *    one element for each WFM agent if build for an &#64;agent_group_sid.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;wfm_agent_sid, or &#64;agent_group_sid is invalid.
     *   - grpc.NotFound: the given &#64;wfm_agent_sid doesn't exist or the &#64;agent_group_sid has no agents.
     *   - grpc.Internal: error occurs building the diagnostics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes> buildAgentDiagnostics(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildAgentDiagnosticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a shift template for the org sending the request with the provided parameters
     * The &#64;shift_template_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent program node.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, or &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the shift template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes> createShiftTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShiftTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a shift template for the given &#64;shift_template_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this shift template since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sid, &#64;name, &#64;program_node_sid are invalid.
     *   - grpc.AlreadyExists: a shift template with the given &#64;name already exists.
     *   - grpc.NotFound: the parent program node doesn't exist or belongs to a different scenario than the shift template to update.
     *   - grpc.Internal: error occurs when updating the shift template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes> updateShiftTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShiftTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the shift templates matching the specified &#64;shift_template_sids for the org sending the request.
     * If &#64;include_placement_rules is set to true, the &#64;shift_templates will be returned with their member placement rules.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;shift_template_sids are invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes> listShiftTemplatesBySids(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShiftTemplatesBySidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics for the shift template associated with the given &#64;shift_template_sid for the org sending the request.
     * Required permissions:
     *   NONE
     *   - grpc.Invalid: the &#64;shift_template_sid is invalid.
     *   - grpc.NotFound: the given &#64;shift_template_sid doesn't exist for the org sending the request.
     *   - grpc.Internal: error occours building the diagnostics for the shift template.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes> buildShiftTemplateDiagnostics(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildShiftTemplateDiagnosticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a placement rule for org sending the request with the provided parameters.
     * The &#64;placement_rule_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the parent shift template.
     * The &#64;member fields will be ignored since those cannot be created by this method and must be created by their respective create methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;placement_rule are invalid.
     *   - grpc.NotFound: the parent shift template doesn't exist or belongs to a different scenario than the one given.
     *                    the scheduling activity to associate with the placement rule doesn't exist or belongs to a different scenario than the one given.
     *   - grpc.Internal: error occurs when creating the placement rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes> createPlacementRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlacementRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a placement rule corresponding with the given &#64;placement_rule_sid for the org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this placement rule since it cannot be changed.
     * The &#64;member fields will be ignored since those cannot be updated by this method and must be updated by their respective update methods.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the one or more of the fields in the &#64;placement_rule are invalid.
     *   - grpc.Internal: error occurs when updating the placement rule.
     *   - grpc.NotFound: entry to be updated doesn't exist.
     *                  : the parent shift template or related scheduling activity don't exist or belong to a different scenario than the placement rule to update.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes> updatePlacementRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlacementRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a placement rule with the coresponding &#64;placement_rule_sid for the org sending the request.
     * It also deletes the scheduling activity referenced by the &#64;scheduling_activity_sid if said activity is not a member of any other entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;placement_rule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;placement_rule doesn't exist.
     *   - grpc.Internal: error occurs when removing the placement rule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes> deletePlacementRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePlacementRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an open times pattern for the org sending the request with the provided parameters.
     * The &#64;open_times_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;open_times_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the open times pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes> createOpenTimesPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOpenTimesPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an open times pattern for the given &#64;open_times_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this open times pattern since it cannot be changed.
     * Required permission:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;open_times_pattern have invalid values.
     *   - grpc.NotFound: the given &#64;open_times_pattern or it's &#64;parent_entity doesn't exist.
     *   - grpc.Internal: error occurs when updating the open times pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes> updateOpenTimesPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOpenTimesPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an open times pattern with the coresponding &#64;open_times_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;open_times_pattern_sid is invalid for the org making the request.
     *   - grpc.NotFound: the given &#64;open_times_pattern doesn't exist.
     *   - grpc.Internal: error occurs when removing the open times pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes> deleteOpenTimesPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOpenTimesPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the open times patterns of &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the open times patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the open times patterns.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when getting the open times pattern bitmaps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes> getOpenTimesBitmaps(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOpenTimesBitmapsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an agent availability pattern for the org sending the request with the provided parameters.
     * The &#64;agent_availability_pattern_sid of the new entity will be returned in the response.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;agent_availability_pattern are invalid.
     *   - grpc.NotFound: the parent entity doesn't exist.
     *   - grpc.Internal: error occurs when creating the agent availability pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes> createAgentAvailabilityPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentAvailabilityPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an agent availability pattern for the given &#64;agent_availability_pattern_sid and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;schedule_scenario_sid must be the original for this agent availability pattern since it cannot be changed.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;agent_availability_pattern have invalid values.
     *   - grpc.Internal: error occurs when updating the agent avilability pattern.
     *   - grpc.NotFound: entry to be updated doesn't exist, or the &#64;parent_entity has a different &#64;schedule_scenario_sid than the agent availability pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes> updateAgentAvailabilityPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentAvailabilityPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an agent availability pattern with the coresponding &#64;agent_availability_pattern_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;agent_availability_pattern_sid has an invalid value.
     *   - grpc.NotFound: the &#64;agent_availability_pattern with the given sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the agent availability pattern.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes> deleteAgentAvailabilityPattern(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentAvailabilityPatternMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the inherited, own, and resulting bitmaps for the agent availability patterns of &#64;entities_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;entities_to_check.
     * &#64;entities_to_check must have the entity_type field set with a wfm agent, agent group or a type of node.
     * If an availability bitmap is requested for an agent group, the bitmaps for all of it's member agents will be returned instead.
     * The bitmaps will be generated for the span of &#64;datetime_range.
     * If &#64;bitmap_type is COMPLETE, the bitmaps will be generated using all relevant pattern data.
     * If &#64;bitmap_type is ONLY_WEEKMAPS, the bitmaps will be generated using only the weekmap data from the availability patterns.
     * If &#64;bitmap_type is ONLY_CALENDAR_ITEMS, the bitmaps will be generated using only the calendar item data from the availability patterns.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entities_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *                 : the &#64;datetime_range is invalid.
     *   - grpc.NotFound: the given &#64;entities_to_check don't exist.
     *   - grpc.Internal: error occurs when getting the agent availability pattern bitmaps.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes> getAvailabilityBitmaps(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailabilityBitmapsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upserts an association for the given &#64;non_skill_activity_sid to the given &#64;node.
     * All downstream members of the entity will have their inheritance state cleared, and inherit the given association.
     * If an association already exists between the non skill activity and the &#64;node then their &#64;relationship_type will be updated.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entity.
     * If a NOT_ASSOCIATED_WITH relationship is being created, the tree will be checked for conflicting downstream effects.
     * If any member rules, are referencing the non skill activity and &#64;relationship_type is NOT_ASSOCIATED_WITH, then the upsert will not take effect, and the list of related entities to be updated/removed first will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;non_skill_activity_sid, &#64;node or &#64;association_type are invalid.
     *                 : the non skill activity and &#64;node belong to different scenarios.
     *   - grpc.NotFound: the &#64;non_skill_activity_sid or &#64;node don't exist.
     *   - grpc.Internal: error occurs when upserting the association.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes> upsertNonSkillActivityAssociation(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertNonSkillActivityAssociationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates skill proficiencies for the org sending the request with the provided parameters.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;parent_entities.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in a &#64;proficiency, or the &#64;schedule_scenario_sid are invalid.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;parent_entity doesn't exist.
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the given &#64;skill_sid.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     *   - grpc.Internal: error occurs when creating the skill proficiencies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes> createSkillProficiencies(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSkillProficienciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates skill proficiencies corresponding to the given &#64;skill_proficiency_sids and org sending the request with the provided parameters.
     * All of the entity's parameters that are not desired to be updated must be filled with their current values.
     * The &#64;skill_sid and &#64;parent_entity field of each proficiency will be ignored since it cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the &#64;skill_proficiencies have invalid values.
     *   - grpc.Internal: error occurs when updating the skill proficiencies.
     *   - grpc.NotFound: for any of the given &#64;skill_proficiencies:
     *                    the &#64;skill_sid doesn't exist.
     *                    the skill profile with &#64;preferred_skill_profile_sid doesn't contain the skill of the given skill proficiency.
     *   - grpc.AlreadyExists: a skill proficiency with the given &#64;skill_sid and &#64;parent_entity already exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes> updateSkillProficiencies(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkillProficienciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a skill proficiency with the corresponding &#64;skill_proficiency_sid for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;skill_proficiency_sid is invalid for the org making the request.
     *   -grpc.NotFound: the skill proficiency with the given &#64;skill_proficiency_sid doesn't exist.
     *   -grpc.Internal: error occurs when removing the skill proficiency.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes> deleteSkillProficiency(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSkillProficiencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies the existing scenario with the &#64;scenario_sid_to_copy for the org sending the request using the provided parameters.
     * Scheduling targets of entities in the scenario to copy will also be copied.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * Required permissions:
     *   NONE
     * Errors:gg
     *   - grpc.Invalid: the parameters &#64;scenario_sid_to_copy or any others are invalid.
     *   - grpc.NotFound: the scenario corresponding to the &#64;scenario_sid_to_copy doesn't exist.
     *   - grpc.Internal: error occurs when creating/coping the new scenario.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes> copyScenario(
        com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new schedule scenario for the org sending the request with the provided parameters.
     * The new &#64;schedule_scenario_sid of the new entity will be returned in the response.
     * It also creates 1 of each of the following: call center, client, program, location node, and on call scheduling activity (if it doesn't exist already for the org).
     * The &#64;node_description fields may optionally be left blank.
     * The &#64;copied_from_scenario_sid field will be ignored, as it will be set to nil in the newly created scenario.
     * The &#64;creation_datetime and &#64;is_default fields will also be ignored and set as the current time and false respectively.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: parameters in the &#64;req are invalid for the org making the request.
     *   - grpc.Internal: error occurs when creating the new scenario, or any of the node entities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes> createScheduleScenarioWithNodes(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScheduleScenarioWithNodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a schedule scenario corresponding to the given &#64;schedule_scenario_sid and org sending the request with the provided parameters.
     * Only the &#64;name, &#64;description and &#64;datetime_set_to_inactive fields may be updated, and must be filled in with current value if updating the field is not desired.
     * The &#64;schedule_scenario_sid must be the original for the schedule scenario since it cannot be updated.
     * All other fields will be ignored since they cannot be updated.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the &#64;scenario have invalid values.
     *   -grpc.NotFound: the scenario with the given &#64;schedule_scenario_sid doesn't exist.
     *   -grpc.Internal: error occurs when updating the scenario.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes> updateScheduleScenario(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScheduleScenarioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets config entities that match the org sending the request and given &#64;entity_type and that belong to the &#64;belongs_to_entity and &#64;schedule_scenario_sid parameters.
     * If &#64;include_member_lists is set to true the member lists of the entities retrieved will be included.
     * Any nodes in the returned set of entities will have inherited nonskill associations applied to the node's member_nonskill_activity fields.
     * Prior to listing the entities it will Resync TCN Agents and skill proficiencies.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;entity_type, or &#64;belongs_to_entity have invalid values.
     *   - grpc.Internal: error occurs when getting the config entities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes> listConfigEntities(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConfigEntitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;shift_instance_sids are invalid for the org making the request.
     *   -grpc.NotFound: the shift instances with the given &#64;shift_instance_sids don't exist.
     *   -grpc.Internal: error occurs when removing the shift instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes> deleteShiftInstances(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteShiftInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds and returns the diagnostics and &#64;nodes_checked for the &#64;node_to_check for &#64;schedule_scenario_sid and the org sending the request.
     * The &#64;schedule_scenario_sid must match the scenario of the &#64;node_to_check.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_to_check is invalid for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.NotFound: the given &#64;node_to_check doesn't exist.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes> buildNodeDiagnostics(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildNodeDiagnosticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds and returns the global diagnostics and &#64;nodes_checked for the &#64;schedule_scenario_sid and the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;schedule_scenario_sid has an invalid values.
     *   - grpc.NotFound: the given &#64;schedule_scenario_sid doesn't exist for the org making the request.
     *   - grpc.Internal: error occurs when building the diagnostics.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes> buildGlobalDiagnostics(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildGlobalDiagnosticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the published schedule for the corresponding &#64;datetime_range for the org sending the request.
     * Will create a published schedule if it does not exist already for the org sending the request.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the published schedule will be returned in the published schedules shift_instances field.
     * if &#64;node_selector is set, then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range, &#64;metric_types are invalid.
     *   - grpc.NotFound: the &#64;node_selector doesn't exist.
     *   - grpc.Internal: error occurs when getting the published schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes> getPublishedSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublishedScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the published schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the published schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes> getPublishedScheduleRequiredCalls(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublishedScheduleRequiredCallsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the required calls intervals for the specified draft schedule for the corresponding &#64;viewing_range, for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the draft schedule doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes> getDraftScheduleRequiredCalls(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDraftScheduleRequiredCallsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a draft schedule for the org sending the request with the provided parameters.
     * The &#64;draft_schedule_sid of the new entity will be returned in the response.
     * The &#64;created_at and &#64;last_updated_at fields will be set to the current time and null respectively.
     * The draft schedule will include the published schedule's shift instances and shift segments.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;scheduling_range are invalid.
     *   - grpc.Internal: error occurs when creating the draft schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes> createDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the &#64;name, &#64;description, and &#64;datetime_range of the given &#64;draft_schedule_sid for the org sending the request.
     * The &#64;name, &#64;description, and &#64;datetime_range fields must all be set with their desired values.
     * If &#64;delete_shifts_not_in_range if true, then any instances outside of the &#64;datetime_range will be permenantly deleted with no recovery option.
     * If &#64;delete_shifts_not_in_range is false, instances outside of the new &#64;datetime_range will be retained, for use if the datetime range is expanded to cover the instances in the future.
     * If &#64;copy_shifts_into_new_range time is true, then new the portion of an expanded &#64;datetime_range which has no instances will copy the instances from the published schedule. If false, no instances will be created for an expanded &#64;scheduling_range.
     * If &#64;get_updated_shifts is true, then the returned draft schedule will also contain the shift instances and segments in the given &#64;datetime_range.
     * Errors:
     *   - grpc.Invalid: the &#64;name, &#64;description or &#64;datetime_range are invalid.
     *   - grpc.Internal: error occurs when updating the schedule or its instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes> updateDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Builds a draft schedule for the given &#64;node_selector in &#64;schedule_scenario_sid over &#64;schedule_scenario_scheduling_range for &#64;draft_schedule_sid and the org making the request.
     * The &#64;schedule_scenario_scheduling_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * &#64;include parameters are used when retrieving the resulting draft schedule, and work in the same way as for GetDraftSchedule.
     * Will return diagnostics for the newly built schedule, or just diagnostics if the schedule cannot be built successfully due to diagnostic error.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes> buildDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBuildDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publishes the shift instances of the given &#64;draft_schedule_sid to the published schedule of the org sending the request.
     * Overlapping shift instances that aren't locked will be replaced with the instances from the draft schedule.
     * If &#64;ignore_diagnostics_errors is set to true, it will publish the schedule regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not publish the schedule.
     * &#64;include parameters are used when retrieving the resulting published schedule, and work in the same way as for GetDraftSchedule.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the parameters in the &#64;req are invalid..
     *   - grpc.NotFound: &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when publishing the draft schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes> publishDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resets the shifts on the &#64;draft_schedule_sid for the org sending the request.
     * Shifts overlapping the &#64;datetime_range will be deleted, then that &#64;datetime_range will be populated with shifts from the published schedule.
     * If no &#64;datetime_range is provided, all shifts will be removed from the &#64;draft_schedule_sid, and published shifts will be copied across the draft's datetime range.
     * If &#64;unlocked_only is set to true, only unlocked shifts will be deleted, and the locked shift instances will remain.
     *   The published schedule will still be copied, so any newly overlapping shifts will result in an overlap warning.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid for the org sending the request.
     *   - grpc.NotFound: the &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when resetting the schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes> resetDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the draft schedule with &#64;draft_schedule_sid for the corresponding &#64;datetime_range for the org sending the request.
     * The &#64;datetime_range field is optional. If not set, the draft schedule will be obtained with it's default range from it's start to end time.
     * if &#64;include_shift_instances is true, the shift instances associated within &#64;datetime_range for the draft schedule will be returned in the draft schedules shift_instances field.
     * if &#64;node_selector is set then only instances belonging to the origin of &#64;node_selector and its children node will be returned, otherwise all matching shift instances will be included.
     * &#64;node_selector must be for a node that belongs to the same schedule scenario as &#64;draft_schedule_sid.
     * if &#64;include_shift_template is true, any returned shift instances will have their orginating shift template returned in their origin_shift_template field.
     * if &#64;include_shift_segments is true, any returned shift instances will have their shift_segments field set, otherwise the field will be left nil.
     * if &#64;include_scheduling_activity is true, any returned shift segments will have their scheduling_activity field set, otherwise the field will be left nil.
     * if &#64;include_activity is true, any returned scheduling activities will have their member_non_skill_activity field set, otherwise the field will be left nil.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range or &#64;draft_schedule_sid are invalid.
     *   - grpc.NotFound: the &#64;node_selector or &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when getting the draft schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes> getDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the draft schedules whose scheduling_range overlaps the given &#64;datetime_range for the org sending the request.
     * If &#64;datetime_range is not set, all draft schedules for the org will be returned.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;datetime_range is invalid.
     *   - grpc.Internal: error occurs when listing the draft schedules.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes> listDraftSchedules(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDraftSchedulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clears shift instances from the &#64;schedule_selector for the org sending the request.
     * If &#64;node_selector is set, only shifts related to the given &#64;node_selector will be cleared.
     * If &#64;node_selector is not set, all shifts on the &#64;schedule_selector may be cleared, regardless of the shift template they are associated with.
     * If &#64;datetime_range is set, only the shifts overlapping the &#64;datetime_range will be cleared.
     * If &#64;datetime_range is not set, all shifts on the schedule will be considered in range to be deleted and &#64;invert_datetime_range and &#64;start_datetimes_only must be set to false.
     * If &#64;invert_datetime_range is set to true, the shifts overlapping the range before and after the provided &#64;datetime_range will be deleted.
     * If &#64;invert_datetime_range is set to false, the provided &#64;datetime_range will be used.
     * If &#64;start_datetimes_only is set to true, deletes the shifts that start within the &#64;datetime range, or start before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;start_datetimes_only is set to false, deletes the shifts that overlap with the &#64;datetime range, or overlap the range before or after &#64;datetime_range if &#64;invert_datetime_range is true.
     * If &#64;delete_locked is set to true, both locked and unlocked shifts will be cleared.
     * If &#64;delete_locked is set to false, only shifts with &#64;is_locked set to false may be cleared.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector, &#64;schedule_selector, or &#64;datetime_range in the request are invalid.
     *   - grpc.NotFound: the draft schedule with the given &#64;schedule_selector doesn't exist.
     *   - grpc.Internal: error occurs when removing the shifts from the schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes> clearSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a draft schedule with the corresponding &#64;draft_schedule_sid for the org sending the request.
     * It also deletes all of its shift instances and segments.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;draft_schedule_sid is invalid for the org making the request.
     *   - grpc.NotFound: the draft schedule with the given &#64;draft_schedule_sid doesn't exist.
     *   - grpc.Internal: error occurs when removing the draft schedule.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes> deleteDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDraftScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the shift instances with the corresponding &#64;shift_instance_sids for the org sending the request.
     * If &#64;include_shift_template is set to true then the related shift template for the shift instances will be returned in the shift template field.
     * If &#64;include_shift_segments is set to true then the related shift segments for the shift instances will be returned in the shift segments field.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * &#64;include_shift_segments must be true to take effect.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling
     * activities member non skill activity field. &#64;include_scheduling_activity must be true to take effect.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;org_id or &#64;shift_instance_sids in the request are invalid.
     *   - grpc.Internal: error occurs when listing the shift instances or their shift segments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes> listShiftInstancesBySid(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShiftInstancesBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies the shifts from &#64;source_schedule_selector to &#64;destination_schedule_selector, constrained by the given parameters for the org sending the request.
     * If &#64;datetime_range is set, all shifts within the datetime range will be copied.
     * If &#64;datetime_range is not set, all shifts in the &#64;source_schedule_selector within the schedule range of the &#64;destination_schedule_selector will be copied. However if one of them is a published schedule, it will use the schedule range of the draft schedule.
     * If &#64;start_datetimes_only is set to false, then shifts are considered to be within the &#64;datetime range if any portion of them is within the range.
     * If &#64;start_datetimes_only is set to true, then only shifts with start times within the &#64;datetime range will be copied.
     * If &#64;overlap_as_warning is set to false, any overlapping shifts for a given agent will return a diagnostic error, and prevent any shifts from being copied.
     * If &#64;overlap_as_warning is set to true, the shifts will be copied regardless of overlap conflicts, and any conflicts will cause a diagnostic warning to be returned after.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: one or more fields in the request have invalid values.
     *   -grpc.NotFound: the &#64;source_schedule_selector or &#64;destination_schedule_selector don't exist for the org sending the request.
     *   -grpc.Internal: error occurs when creating the copied shift instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes> copyScheduleToSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyScheduleToScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes> createShiftInstance(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShiftInstanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a shift instance for the org sending the request with the provided parameters.
     * If &#64;wfm_agent_sids is empty, then the shift instance will be created for a newly created unassigned agent.
     * A shift instance will be created for each wfm agent sid provided.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when creating the shift instance.
     *   - grpc.NotFound: the &#64;draft_schedule_sid, &#64;shift_template_sid, or &#64;wfm_agent_sids do not exist for the org sending the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res> createShiftInstanceV2(
        com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShiftInstanceV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Swaps shift instances with the given &#64;shift_instance_sids that belong to &#64;wfm_agent_sid1 to belong to &#64;wfm_agent_sid2 (and viceversa).
     * Returns the swapped &#64;shift_instances after they are succesfully updated.
     * If there are other shifts for the given &#64;wfm_agent_sids with an overlap conflict, diagnostics will be returned instead.
     * All &#64;shift_instance_sids must belong to the same schedule, and be from a draft schedule.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: wfm_agent_sid_1, wfm_agent_sid_2, or shift_instance_sids do not exist for the org sending the request.
     *   - grpc.Internal: error occurs when swapping the shift instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes> swapShiftInstances(
        com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwapShiftInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * This method is not implemented. Do not use.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes> updateShiftInstance(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShiftInstanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a shift instance for the org sending the request with the provided parameters.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.Internal: error occurs when updating the shift instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res> updateShiftInstanceV2(
        com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShiftInstanceV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copies the given &#64;shift_instance_sids to &#64;destination_schedule for the org sending the request.
     * If there are any overlap conflicts on &#64;destination_schedule and &#64;overlap_as_warning is set to false,
     *  then &#64;shift_instance_sids will not be copied, and a list of diagnostics detailing the overlaps will be returned.
     * If &#64;overlap_as_warning is set to true, overlap conflicts will not prevent the shifts from being copied, and the overlap diagnostics will be returned after as warning messages instead.
     * Required permissions:
     * NONE
     * Errors:
     *   - grpc.Invalid: one or more fields in the request have invalid values.
     *   - grpc.NotFound: the &#64;shift_instance_sids or &#64;destination_schedule does not exist for the org sending the request.
     *   - grpc.Internal: error occurs when copying the shift instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes> copyShiftInstancesToSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyShiftInstancesToScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the shift_instance_sids for the Shift Instances associated with &#64;wfm_agent_sid over the given &#64;datetime_range and &#64;schedule_selector.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes> listShiftInstanceSidsForAgent(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShiftInstanceSidsForAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists shift segments for the specified shift instances for the org sending the request.
     * If &#64;include_scheduling_activity is set to true then the related scheduling activity for the shift segment will be returned in the scheduling activity field.
     * If &#64;include_activity is set to true then the related non skill activity for the scheduling activity will be returned in the scheduling activities member non skill activity field.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: a shift instance doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes> listShiftSegmentsByShiftInstanceSids(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListShiftSegmentsByShiftInstanceSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates the given &#64;scheduling_target for the org making the request.
     * The &#64;scheduling_target_sid of the new entity will be returned in the response.
     * Any preexisting scheduling target for &#64;node_entity will be removed upon creation of the new &#64;scheduling_target.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;scheduling_target is invalid.
     *   - grpc.NotFound: &#64;node_entity doesn't exist for &#64;schedule_scenario_sid and the org making the request.
     *   - grpc.Internal: error occours when setting the scheduling target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes> setSchedulingTarget(
        com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSchedulingTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the &#64;own_scheduling_target, &#64;inherited_scheduling_target, and &#64;resulting_scheduling_target for the given &#64;node_selector and the org making the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the &#64;node_selector is invalid.
     *   - grpc.NotFound: the given &#64;node_selector doesn't exist for the org making the request.
     *   - grpc.Internal: error occours when getting the scheduling target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes> getSchedulingTarget(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulingTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the scheduling target of the corresponding &#64;node_selector for the org sending the request.
     * Required permissions:
     *   NONE
     * Errors:
     *   -grpc.Invalid: the &#64;node_selector is invalid.
     *   -grpc.NotFound: the scheduling target for the given &#64;node_selector doesn't exist for the org making the request.
     *   -grpc.Internal: error occurs when removing the scheduling target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes> deleteSchedulingTarget(
        com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSchedulingTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the performance metrics across &#64;datetime_range for shift instances in &#64;schedule_selector associated with &#64;node_selector for the org making the request.
     * Performance metrics will be generated for each of the given &#64;metric_params.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.NotFound: the &#64;node_selector, &#64;schedule_selector, or their shift instances doesn't exist.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes> getPerformanceMetrics(
        com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPerformanceMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the required calls intervals for the given &#64;node_selector over the given &#64;datetime_range for the org making the request.
     * The &#64;interval_width_in_minutes must be a multiple of 5.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the request data is invalid.
     *   - grpc.Internal: error occurs when getting the data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes> listRequiredCallsIntervals(
        com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRequiredCallsIntervalsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SKILL_PROFILES = 0;
  private static final int METHODID_UPDATE_SKILL_PROFILE = 1;
  private static final int METHODID_UPDATE_SKILL_PROFILE_PROFICIENCIES = 2;
  private static final int METHODID_GET_SKILL_PROFILE = 3;
  private static final int METHODID_RESYNC_SKILL_PROFILES = 4;
  private static final int METHODID_GET_LAST_SKILL_PROFILE_RESYNC_DATE = 5;
  private static final int METHODID_UPSERT_FORECASTING_PARAMETERS = 6;
  private static final int METHODID_GET_FORECASTING_PARAMETERS = 7;
  private static final int METHODID_LIST_HISTORICAL_DATA = 8;
  private static final int METHODID_UPSERT_HISTORICAL_DATA_DELTA = 9;
  private static final int METHODID_UPSERT_HISTORICAL_DATA_DELTAS = 10;
  private static final int METHODID_LIST_SKILLS = 11;
  private static final int METHODID_BUILD_CALL_PROFILE_TEMPLATE_FOR_SKILL_PROFILE = 12;
  private static final int METHODID_CREATE_INACTIVE_SKILL_PROFILE_MAPPING = 13;
  private static final int METHODID_GET_AVAILABLE_REGRESSION_FORECASTER_MODEL_TYPES = 14;
  private static final int METHODID_DISCONNECT_INACTIVE_SKILL_PROFILE_MAPPING = 15;
  private static final int METHODID_DELETE_HISTORICAL_DATA_DELTAS = 16;
  private static final int METHODID_LIST_TOP_SKILL_PROFILES = 17;
  private static final int METHODID_GET_SKILL_PROFILES_COUNT = 18;
  private static final int METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL = 19;
  private static final int METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL_WITH_STATS = 20;
  private static final int METHODID_UPSERT_PROFILE_FORECAST = 21;
  private static final int METHODID_CREATE_CALL_PROFILE_TEMPLATE = 22;
  private static final int METHODID_DELETE_CALL_PROFILE_TEMPLATE = 23;
  private static final int METHODID_CREATE_REGRESSION_TEMPLATE = 24;
  private static final int METHODID_DELETE_REGRESSION_TEMPLATE = 25;
  private static final int METHODID_LIST_REGRESSION_TEMPLATES = 26;
  private static final int METHODID_LIST_FORECAST_INTERVALS_FOR_SKILL_PROFILE = 27;
  private static final int METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL = 28;
  private static final int METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL_WITH_STATS = 29;
  private static final int METHODID_LIST_CALL_PROFILE_TEMPLATES = 30;
  private static final int METHODID_UPSERT_REGRESSION_FORECAST = 31;
  private static final int METHODID_UPSERT_FORECAST_DATA_DELTA = 32;
  private static final int METHODID_UPSERT_FORECAST_DATA_DELTAS = 33;
  private static final int METHODID_DELETE_FORECAST_INTERVALS = 34;
  private static final int METHODID_LIST_HISTORICAL_DATA_FOR_ALL_SKILL_PROFILES = 35;
  private static final int METHODID_BUILD_DOWAND_MOYPROFILES = 36;
  private static final int METHODID_CALCULATE_TRAINING_DATA_AVERAGES_FOR_SKILL_PROFILE = 37;
  private static final int METHODID_UPDATE_SKILL_PROFILE_AVERAGES_USING_HISTORICAL_DATA = 38;
  private static final int METHODID_UPDATE_CALL_CENTER_NODE = 39;
  private static final int METHODID_CREATE_CLIENT_NODE = 40;
  private static final int METHODID_UPDATE_CLIENT_NODE = 41;
  private static final int METHODID_CREATE_LOCATION_NODE = 42;
  private static final int METHODID_UPDATE_LOCATION_NODE = 43;
  private static final int METHODID_CREATE_PROGRAM_NODE = 44;
  private static final int METHODID_UPDATE_PROGRAM_NODE = 45;
  private static final int METHODID_CREATE_CONSTRAINT_RULE = 46;
  private static final int METHODID_UPDATE_CONSTRAINT_RULE = 47;
  private static final int METHODID_DELETE_CONSTRAINT_RULE = 48;
  private static final int METHODID_CREATE_NON_SKILL_ACTIVITY = 49;
  private static final int METHODID_UPDATE_NON_SKILL_ACTIVITY = 50;
  private static final int METHODID_LIST_NON_SKILL_ACTIVITIES = 51;
  private static final int METHODID_LIST_NON_SKILL_ACTIVITY_ASSOCIATIONS = 52;
  private static final int METHODID_LIST_CANDIDATE_SCHEDULING_ACTIVITIES = 53;
  private static final int METHODID_CREATE_AGENT_GROUP = 54;
  private static final int METHODID_UPDATE_AGENT_GROUP = 55;
  private static final int METHODID_UPDATE_WFMAGENT = 56;
  private static final int METHODID_LIST_ALL_WFMAGENTS = 57;
  private static final int METHODID_LIST_CANDIDATE_WFMAGENTS = 58;
  private static final int METHODID_LIST_UNGROUPED_WFMAGENTS = 59;
  private static final int METHODID_LIST_WFMAGENTS_ASSOCIATED_WITH_AGENT_GROUP = 60;
  private static final int METHODID_CREATE_WFMAGENT_MEMBERSHIPS = 61;
  private static final int METHODID_DELETE_WFMAGENT_MEMBERSHIPS = 62;
  private static final int METHODID_DELETE_WFMAGENTS_MEMBERSHIPS = 63;
  private static final int METHODID_BUILD_AGENT_DIAGNOSTICS = 64;
  private static final int METHODID_CREATE_SHIFT_TEMPLATE = 65;
  private static final int METHODID_UPDATE_SHIFT_TEMPLATE = 66;
  private static final int METHODID_LIST_SHIFT_TEMPLATES_BY_SIDS = 67;
  private static final int METHODID_BUILD_SHIFT_TEMPLATE_DIAGNOSTICS = 68;
  private static final int METHODID_CREATE_PLACEMENT_RULE = 69;
  private static final int METHODID_UPDATE_PLACEMENT_RULE = 70;
  private static final int METHODID_DELETE_PLACEMENT_RULE = 71;
  private static final int METHODID_CREATE_OPEN_TIMES_PATTERN = 72;
  private static final int METHODID_UPDATE_OPEN_TIMES_PATTERN = 73;
  private static final int METHODID_DELETE_OPEN_TIMES_PATTERN = 74;
  private static final int METHODID_GET_OPEN_TIMES_BITMAPS = 75;
  private static final int METHODID_CREATE_AGENT_AVAILABILITY_PATTERN = 76;
  private static final int METHODID_UPDATE_AGENT_AVAILABILITY_PATTERN = 77;
  private static final int METHODID_DELETE_AGENT_AVAILABILITY_PATTERN = 78;
  private static final int METHODID_GET_AVAILABILITY_BITMAPS = 79;
  private static final int METHODID_UPSERT_NON_SKILL_ACTIVITY_ASSOCIATION = 80;
  private static final int METHODID_CREATE_SKILL_PROFICIENCIES = 81;
  private static final int METHODID_UPDATE_SKILL_PROFICIENCIES = 82;
  private static final int METHODID_DELETE_SKILL_PROFICIENCY = 83;
  private static final int METHODID_COPY_SCENARIO = 84;
  private static final int METHODID_CREATE_SCHEDULE_SCENARIO_WITH_NODES = 85;
  private static final int METHODID_UPDATE_SCHEDULE_SCENARIO = 86;
  private static final int METHODID_LIST_CONFIG_ENTITIES = 87;
  private static final int METHODID_DELETE_SHIFT_INSTANCES = 88;
  private static final int METHODID_BUILD_NODE_DIAGNOSTICS = 89;
  private static final int METHODID_BUILD_GLOBAL_DIAGNOSTICS = 90;
  private static final int METHODID_GET_PUBLISHED_SCHEDULE = 91;
  private static final int METHODID_GET_PUBLISHED_SCHEDULE_REQUIRED_CALLS = 92;
  private static final int METHODID_GET_DRAFT_SCHEDULE_REQUIRED_CALLS = 93;
  private static final int METHODID_CREATE_DRAFT_SCHEDULE = 94;
  private static final int METHODID_UPDATE_DRAFT_SCHEDULE = 95;
  private static final int METHODID_BUILD_DRAFT_SCHEDULE = 96;
  private static final int METHODID_PUBLISH_DRAFT_SCHEDULE = 97;
  private static final int METHODID_RESET_DRAFT_SCHEDULE = 98;
  private static final int METHODID_GET_DRAFT_SCHEDULE = 99;
  private static final int METHODID_LIST_DRAFT_SCHEDULES = 100;
  private static final int METHODID_CLEAR_SCHEDULE = 101;
  private static final int METHODID_DELETE_DRAFT_SCHEDULE = 102;
  private static final int METHODID_LIST_SHIFT_INSTANCES_BY_SID = 103;
  private static final int METHODID_COPY_SCHEDULE_TO_SCHEDULE = 104;
  private static final int METHODID_CREATE_SHIFT_INSTANCE = 105;
  private static final int METHODID_CREATE_SHIFT_INSTANCE_V2 = 106;
  private static final int METHODID_SWAP_SHIFT_INSTANCES = 107;
  private static final int METHODID_UPDATE_SHIFT_INSTANCE = 108;
  private static final int METHODID_UPDATE_SHIFT_INSTANCE_V2 = 109;
  private static final int METHODID_COPY_SHIFT_INSTANCES_TO_SCHEDULE = 110;
  private static final int METHODID_LIST_SHIFT_INSTANCE_SIDS_FOR_AGENT = 111;
  private static final int METHODID_LIST_SHIFT_SEGMENTS_BY_SHIFT_INSTANCE_SIDS = 112;
  private static final int METHODID_SET_SCHEDULING_TARGET = 113;
  private static final int METHODID_GET_SCHEDULING_TARGET = 114;
  private static final int METHODID_DELETE_SCHEDULING_TARGET = 115;
  private static final int METHODID_GET_PERFORMANCE_METRICS = 116;
  private static final int METHODID_LIST_REQUIRED_CALLS_INTERVALS = 117;

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
        case METHODID_LIST_SKILL_PROFILES:
          serviceImpl.listSkillProfiles((com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes>) responseObserver);
          break;
        case METHODID_UPDATE_SKILL_PROFILE:
          serviceImpl.updateSkillProfile((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes>) responseObserver);
          break;
        case METHODID_UPDATE_SKILL_PROFILE_PROFICIENCIES:
          serviceImpl.updateSkillProfileProficiencies((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes>) responseObserver);
          break;
        case METHODID_GET_SKILL_PROFILE:
          serviceImpl.getSkillProfile((com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes>) responseObserver);
          break;
        case METHODID_RESYNC_SKILL_PROFILES:
          serviceImpl.resyncSkillProfiles((com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes>) responseObserver);
          break;
        case METHODID_GET_LAST_SKILL_PROFILE_RESYNC_DATE:
          serviceImpl.getLastSkillProfileResyncDate((com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes>) responseObserver);
          break;
        case METHODID_UPSERT_FORECASTING_PARAMETERS:
          serviceImpl.upsertForecastingParameters((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes>) responseObserver);
          break;
        case METHODID_GET_FORECASTING_PARAMETERS:
          serviceImpl.getForecastingParameters((com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes>) responseObserver);
          break;
        case METHODID_LIST_HISTORICAL_DATA:
          serviceImpl.listHistoricalData((com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes>) responseObserver);
          break;
        case METHODID_UPSERT_HISTORICAL_DATA_DELTA:
          serviceImpl.upsertHistoricalDataDelta((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes>) responseObserver);
          break;
        case METHODID_UPSERT_HISTORICAL_DATA_DELTAS:
          serviceImpl.upsertHistoricalDataDeltas((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes>) responseObserver);
          break;
        case METHODID_LIST_SKILLS:
          serviceImpl.listSkills((com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes>) responseObserver);
          break;
        case METHODID_BUILD_CALL_PROFILE_TEMPLATE_FOR_SKILL_PROFILE:
          serviceImpl.buildCallProfileTemplateForSkillProfile((com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes>) responseObserver);
          break;
        case METHODID_CREATE_INACTIVE_SKILL_PROFILE_MAPPING:
          serviceImpl.createInactiveSkillProfileMapping((com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_REGRESSION_FORECASTER_MODEL_TYPES:
          serviceImpl.getAvailableRegressionForecasterModelTypes((com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes>) responseObserver);
          break;
        case METHODID_DISCONNECT_INACTIVE_SKILL_PROFILE_MAPPING:
          serviceImpl.disconnectInactiveSkillProfileMapping((com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes>) responseObserver);
          break;
        case METHODID_DELETE_HISTORICAL_DATA_DELTAS:
          serviceImpl.deleteHistoricalDataDeltas((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes>) responseObserver);
          break;
        case METHODID_LIST_TOP_SKILL_PROFILES:
          serviceImpl.listTopSkillProfiles((com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes>) responseObserver);
          break;
        case METHODID_GET_SKILL_PROFILES_COUNT:
          serviceImpl.getSkillProfilesCount((com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes>) responseObserver);
          break;
        case METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL:
          serviceImpl.buildProfileForecastByInterval((com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>) responseObserver);
          break;
        case METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL_WITH_STATS:
          serviceImpl.buildProfileForecastByIntervalWithStats((com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes>) responseObserver);
          break;
        case METHODID_UPSERT_PROFILE_FORECAST:
          serviceImpl.upsertProfileForecast((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes>) responseObserver);
          break;
        case METHODID_CREATE_CALL_PROFILE_TEMPLATE:
          serviceImpl.createCallProfileTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_CALL_PROFILE_TEMPLATE:
          serviceImpl.deleteCallProfileTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes>) responseObserver);
          break;
        case METHODID_CREATE_REGRESSION_TEMPLATE:
          serviceImpl.createRegressionTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_REGRESSION_TEMPLATE:
          serviceImpl.deleteRegressionTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes>) responseObserver);
          break;
        case METHODID_LIST_REGRESSION_TEMPLATES:
          serviceImpl.listRegressionTemplates((com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes>) responseObserver);
          break;
        case METHODID_LIST_FORECAST_INTERVALS_FOR_SKILL_PROFILE:
          serviceImpl.listForecastIntervalsForSkillProfile((com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>) responseObserver);
          break;
        case METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL:
          serviceImpl.buildRegressionForecastByInterval((com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>) responseObserver);
          break;
        case METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL_WITH_STATS:
          serviceImpl.buildRegressionForecastByIntervalWithStats((com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes>) responseObserver);
          break;
        case METHODID_LIST_CALL_PROFILE_TEMPLATES:
          serviceImpl.listCallProfileTemplates((com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes>) responseObserver);
          break;
        case METHODID_UPSERT_REGRESSION_FORECAST:
          serviceImpl.upsertRegressionForecast((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes>) responseObserver);
          break;
        case METHODID_UPSERT_FORECAST_DATA_DELTA:
          serviceImpl.upsertForecastDataDelta((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes>) responseObserver);
          break;
        case METHODID_UPSERT_FORECAST_DATA_DELTAS:
          serviceImpl.upsertForecastDataDeltas((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes>) responseObserver);
          break;
        case METHODID_DELETE_FORECAST_INTERVALS:
          serviceImpl.deleteForecastIntervals((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes>) responseObserver);
          break;
        case METHODID_LIST_HISTORICAL_DATA_FOR_ALL_SKILL_PROFILES:
          serviceImpl.listHistoricalDataForAllSkillProfiles((com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes>) responseObserver);
          break;
        case METHODID_BUILD_DOWAND_MOYPROFILES:
          serviceImpl.buildDOWAndMOYProfiles((com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes>) responseObserver);
          break;
        case METHODID_CALCULATE_TRAINING_DATA_AVERAGES_FOR_SKILL_PROFILE:
          serviceImpl.calculateTrainingDataAveragesForSkillProfile((com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes>) responseObserver);
          break;
        case METHODID_UPDATE_SKILL_PROFILE_AVERAGES_USING_HISTORICAL_DATA:
          serviceImpl.updateSkillProfileAveragesUsingHistoricalData((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes>) responseObserver);
          break;
        case METHODID_UPDATE_CALL_CENTER_NODE:
          serviceImpl.updateCallCenterNode((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT_NODE:
          serviceImpl.createClientNode((com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT_NODE:
          serviceImpl.updateClientNode((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION_NODE:
          serviceImpl.createLocationNode((com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION_NODE:
          serviceImpl.updateLocationNode((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes>) responseObserver);
          break;
        case METHODID_CREATE_PROGRAM_NODE:
          serviceImpl.createProgramNode((com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes>) responseObserver);
          break;
        case METHODID_UPDATE_PROGRAM_NODE:
          serviceImpl.updateProgramNode((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes>) responseObserver);
          break;
        case METHODID_CREATE_CONSTRAINT_RULE:
          serviceImpl.createConstraintRule((com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes>) responseObserver);
          break;
        case METHODID_UPDATE_CONSTRAINT_RULE:
          serviceImpl.updateConstraintRule((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes>) responseObserver);
          break;
        case METHODID_DELETE_CONSTRAINT_RULE:
          serviceImpl.deleteConstraintRule((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes>) responseObserver);
          break;
        case METHODID_CREATE_NON_SKILL_ACTIVITY:
          serviceImpl.createNonSkillActivity((com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes>) responseObserver);
          break;
        case METHODID_UPDATE_NON_SKILL_ACTIVITY:
          serviceImpl.updateNonSkillActivity((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes>) responseObserver);
          break;
        case METHODID_LIST_NON_SKILL_ACTIVITIES:
          serviceImpl.listNonSkillActivities((com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes>) responseObserver);
          break;
        case METHODID_LIST_NON_SKILL_ACTIVITY_ASSOCIATIONS:
          serviceImpl.listNonSkillActivityAssociations((com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes>) responseObserver);
          break;
        case METHODID_LIST_CANDIDATE_SCHEDULING_ACTIVITIES:
          serviceImpl.listCandidateSchedulingActivities((com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_GROUP:
          serviceImpl.createAgentGroup((com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_GROUP:
          serviceImpl.updateAgentGroup((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_WFMAGENT:
          serviceImpl.updateWFMAgent((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes>) responseObserver);
          break;
        case METHODID_LIST_ALL_WFMAGENTS:
          serviceImpl.listAllWFMAgents((com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes>) responseObserver);
          break;
        case METHODID_LIST_CANDIDATE_WFMAGENTS:
          serviceImpl.listCandidateWFMAgents((com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes>) responseObserver);
          break;
        case METHODID_LIST_UNGROUPED_WFMAGENTS:
          serviceImpl.listUngroupedWFMAgents((com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes>) responseObserver);
          break;
        case METHODID_LIST_WFMAGENTS_ASSOCIATED_WITH_AGENT_GROUP:
          serviceImpl.listWFMAgentsAssociatedWithAgentGroup((com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes>) responseObserver);
          break;
        case METHODID_CREATE_WFMAGENT_MEMBERSHIPS:
          serviceImpl.createWFMAgentMemberships((com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes>) responseObserver);
          break;
        case METHODID_DELETE_WFMAGENT_MEMBERSHIPS:
          serviceImpl.deleteWFMAgentMemberships((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes>) responseObserver);
          break;
        case METHODID_DELETE_WFMAGENTS_MEMBERSHIPS:
          serviceImpl.deleteWFMAgentsMemberships((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes>) responseObserver);
          break;
        case METHODID_BUILD_AGENT_DIAGNOSTICS:
          serviceImpl.buildAgentDiagnostics((com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes>) responseObserver);
          break;
        case METHODID_CREATE_SHIFT_TEMPLATE:
          serviceImpl.createShiftTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_SHIFT_TEMPLATE:
          serviceImpl.updateShiftTemplate((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes>) responseObserver);
          break;
        case METHODID_LIST_SHIFT_TEMPLATES_BY_SIDS:
          serviceImpl.listShiftTemplatesBySids((com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes>) responseObserver);
          break;
        case METHODID_BUILD_SHIFT_TEMPLATE_DIAGNOSTICS:
          serviceImpl.buildShiftTemplateDiagnostics((com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes>) responseObserver);
          break;
        case METHODID_CREATE_PLACEMENT_RULE:
          serviceImpl.createPlacementRule((com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes>) responseObserver);
          break;
        case METHODID_UPDATE_PLACEMENT_RULE:
          serviceImpl.updatePlacementRule((com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes>) responseObserver);
          break;
        case METHODID_DELETE_PLACEMENT_RULE:
          serviceImpl.deletePlacementRule((com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes>) responseObserver);
          break;
        case METHODID_CREATE_OPEN_TIMES_PATTERN:
          serviceImpl.createOpenTimesPattern((com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes>) responseObserver);
          break;
        case METHODID_UPDATE_OPEN_TIMES_PATTERN:
          serviceImpl.updateOpenTimesPattern((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes>) responseObserver);
          break;
        case METHODID_DELETE_OPEN_TIMES_PATTERN:
          serviceImpl.deleteOpenTimesPattern((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes>) responseObserver);
          break;
        case METHODID_GET_OPEN_TIMES_BITMAPS:
          serviceImpl.getOpenTimesBitmaps((com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_AVAILABILITY_PATTERN:
          serviceImpl.createAgentAvailabilityPattern((com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_AVAILABILITY_PATTERN:
          serviceImpl.updateAgentAvailabilityPattern((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_AVAILABILITY_PATTERN:
          serviceImpl.deleteAgentAvailabilityPattern((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes>) responseObserver);
          break;
        case METHODID_GET_AVAILABILITY_BITMAPS:
          serviceImpl.getAvailabilityBitmaps((com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes>) responseObserver);
          break;
        case METHODID_UPSERT_NON_SKILL_ACTIVITY_ASSOCIATION:
          serviceImpl.upsertNonSkillActivityAssociation((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes>) responseObserver);
          break;
        case METHODID_CREATE_SKILL_PROFICIENCIES:
          serviceImpl.createSkillProficiencies((com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes>) responseObserver);
          break;
        case METHODID_UPDATE_SKILL_PROFICIENCIES:
          serviceImpl.updateSkillProficiencies((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes>) responseObserver);
          break;
        case METHODID_DELETE_SKILL_PROFICIENCY:
          serviceImpl.deleteSkillProficiency((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes>) responseObserver);
          break;
        case METHODID_COPY_SCENARIO:
          serviceImpl.copyScenario((com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes>) responseObserver);
          break;
        case METHODID_CREATE_SCHEDULE_SCENARIO_WITH_NODES:
          serviceImpl.createScheduleScenarioWithNodes((com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULE_SCENARIO:
          serviceImpl.updateScheduleScenario((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes>) responseObserver);
          break;
        case METHODID_LIST_CONFIG_ENTITIES:
          serviceImpl.listConfigEntities((com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes>) responseObserver);
          break;
        case METHODID_DELETE_SHIFT_INSTANCES:
          serviceImpl.deleteShiftInstances((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes>) responseObserver);
          break;
        case METHODID_BUILD_NODE_DIAGNOSTICS:
          serviceImpl.buildNodeDiagnostics((com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes>) responseObserver);
          break;
        case METHODID_BUILD_GLOBAL_DIAGNOSTICS:
          serviceImpl.buildGlobalDiagnostics((com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes>) responseObserver);
          break;
        case METHODID_GET_PUBLISHED_SCHEDULE:
          serviceImpl.getPublishedSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes>) responseObserver);
          break;
        case METHODID_GET_PUBLISHED_SCHEDULE_REQUIRED_CALLS:
          serviceImpl.getPublishedScheduleRequiredCalls((com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes>) responseObserver);
          break;
        case METHODID_GET_DRAFT_SCHEDULE_REQUIRED_CALLS:
          serviceImpl.getDraftScheduleRequiredCalls((com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes>) responseObserver);
          break;
        case METHODID_CREATE_DRAFT_SCHEDULE:
          serviceImpl.createDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes>) responseObserver);
          break;
        case METHODID_UPDATE_DRAFT_SCHEDULE:
          serviceImpl.updateDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes>) responseObserver);
          break;
        case METHODID_BUILD_DRAFT_SCHEDULE:
          serviceImpl.buildDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes>) responseObserver);
          break;
        case METHODID_PUBLISH_DRAFT_SCHEDULE:
          serviceImpl.publishDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes>) responseObserver);
          break;
        case METHODID_RESET_DRAFT_SCHEDULE:
          serviceImpl.resetDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes>) responseObserver);
          break;
        case METHODID_GET_DRAFT_SCHEDULE:
          serviceImpl.getDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes>) responseObserver);
          break;
        case METHODID_LIST_DRAFT_SCHEDULES:
          serviceImpl.listDraftSchedules((com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes>) responseObserver);
          break;
        case METHODID_CLEAR_SCHEDULE:
          serviceImpl.clearSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes>) responseObserver);
          break;
        case METHODID_DELETE_DRAFT_SCHEDULE:
          serviceImpl.deleteDraftSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes>) responseObserver);
          break;
        case METHODID_LIST_SHIFT_INSTANCES_BY_SID:
          serviceImpl.listShiftInstancesBySid((com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes>) responseObserver);
          break;
        case METHODID_COPY_SCHEDULE_TO_SCHEDULE:
          serviceImpl.copyScheduleToSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes>) responseObserver);
          break;
        case METHODID_CREATE_SHIFT_INSTANCE:
          serviceImpl.createShiftInstance((com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes>) responseObserver);
          break;
        case METHODID_CREATE_SHIFT_INSTANCE_V2:
          serviceImpl.createShiftInstanceV2((com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res>) responseObserver);
          break;
        case METHODID_SWAP_SHIFT_INSTANCES:
          serviceImpl.swapShiftInstances((com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes>) responseObserver);
          break;
        case METHODID_UPDATE_SHIFT_INSTANCE:
          serviceImpl.updateShiftInstance((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes>) responseObserver);
          break;
        case METHODID_UPDATE_SHIFT_INSTANCE_V2:
          serviceImpl.updateShiftInstanceV2((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res>) responseObserver);
          break;
        case METHODID_COPY_SHIFT_INSTANCES_TO_SCHEDULE:
          serviceImpl.copyShiftInstancesToSchedule((com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes>) responseObserver);
          break;
        case METHODID_LIST_SHIFT_INSTANCE_SIDS_FOR_AGENT:
          serviceImpl.listShiftInstanceSidsForAgent((com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes>) responseObserver);
          break;
        case METHODID_LIST_SHIFT_SEGMENTS_BY_SHIFT_INSTANCE_SIDS:
          serviceImpl.listShiftSegmentsByShiftInstanceSids((com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes>) responseObserver);
          break;
        case METHODID_SET_SCHEDULING_TARGET:
          serviceImpl.setSchedulingTarget((com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes>) responseObserver);
          break;
        case METHODID_GET_SCHEDULING_TARGET:
          serviceImpl.getSchedulingTarget((com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes>) responseObserver);
          break;
        case METHODID_DELETE_SCHEDULING_TARGET:
          serviceImpl.deleteSchedulingTarget((com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes>) responseObserver);
          break;
        case METHODID_GET_PERFORMANCE_METRICS:
          serviceImpl.getPerformanceMetrics((com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes>) responseObserver);
          break;
        case METHODID_LIST_REQUIRED_CALLS_INTERVALS:
          serviceImpl.listRequiredCallsIntervals((com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes>) responseObserver);
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
          getListSkillProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes>(
                service, METHODID_LIST_SKILL_PROFILES)))
        .addMethod(
          getUpdateSkillProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileRes>(
                service, METHODID_UPDATE_SKILL_PROFILE)))
        .addMethod(
          getUpdateSkillProfileProficienciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileProficienciesRes>(
                service, METHODID_UPDATE_SKILL_PROFILE_PROFICIENCIES)))
        .addMethod(
          getGetSkillProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes>(
                service, METHODID_GET_SKILL_PROFILE)))
        .addMethod(
          getResyncSkillProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ResyncSkillProfilesRes>(
                service, METHODID_RESYNC_SKILL_PROFILES)))
        .addMethod(
          getGetLastSkillProfileResyncDateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetLastSkillProfileResyncDateRes>(
                service, METHODID_GET_LAST_SKILL_PROFILE_RESYNC_DATE)))
        .addMethod(
          getUpsertForecastingParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastingParametersRes>(
                service, METHODID_UPSERT_FORECASTING_PARAMETERS)))
        .addMethod(
          getGetForecastingParametersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes>(
                service, METHODID_GET_FORECASTING_PARAMETERS)))
        .addMethod(
          getListHistoricalDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataRes>(
                service, METHODID_LIST_HISTORICAL_DATA)))
        .addMethod(
          getUpsertHistoricalDataDeltaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaRes>(
                service, METHODID_UPSERT_HISTORICAL_DATA_DELTA)))
        .addMethod(
          getUpsertHistoricalDataDeltasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltasRes>(
                service, METHODID_UPSERT_HISTORICAL_DATA_DELTAS)))
        .addMethod(
          getListSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillsRes>(
                service, METHODID_LIST_SKILLS)))
        .addMethod(
          getBuildCallProfileTemplateForSkillProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes>(
                service, METHODID_BUILD_CALL_PROFILE_TEMPLATE_FOR_SKILL_PROFILE)))
        .addMethod(
          getCreateInactiveSkillProfileMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateInactiveSkillProfileMappingRes>(
                service, METHODID_CREATE_INACTIVE_SKILL_PROFILE_MAPPING)))
        .addMethod(
          getGetAvailableRegressionForecasterModelTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailableRegressionForecasterModelTypesRes>(
                service, METHODID_GET_AVAILABLE_REGRESSION_FORECASTER_MODEL_TYPES)))
        .addMethod(
          getDisconnectInactiveSkillProfileMappingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DisconnectInactiveSkillProfileMappingRes>(
                service, METHODID_DISCONNECT_INACTIVE_SKILL_PROFILE_MAPPING)))
        .addMethod(
          getDeleteHistoricalDataDeltasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteHistoricalDataDeltasRes>(
                service, METHODID_DELETE_HISTORICAL_DATA_DELTAS)))
        .addMethod(
          getListTopSkillProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListTopSkillProfilesRes>(
                service, METHODID_LIST_TOP_SKILL_PROFILES)))
        .addMethod(
          getGetSkillProfilesCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfilesCountRes>(
                service, METHODID_GET_SKILL_PROFILES_COUNT)))
        .addMethod(
          getBuildProfileForecastByIntervalMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>(
                service, METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL)))
        .addMethod(
          getBuildProfileForecastByIntervalWithStatsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsRes>(
                service, METHODID_BUILD_PROFILE_FORECAST_BY_INTERVAL_WITH_STATS)))
        .addMethod(
          getUpsertProfileForecastMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertProfileForecastRes>(
                service, METHODID_UPSERT_PROFILE_FORECAST)))
        .addMethod(
          getCreateCallProfileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateCallProfileTemplateRes>(
                service, METHODID_CREATE_CALL_PROFILE_TEMPLATE)))
        .addMethod(
          getDeleteCallProfileTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteCallProfileTemplateRes>(
                service, METHODID_DELETE_CALL_PROFILE_TEMPLATE)))
        .addMethod(
          getCreateRegressionTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateRes>(
                service, METHODID_CREATE_REGRESSION_TEMPLATE)))
        .addMethod(
          getDeleteRegressionTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteRegressionTemplateRes>(
                service, METHODID_DELETE_REGRESSION_TEMPLATE)))
        .addMethod(
          getListRegressionTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRegressionTemplatesRes>(
                service, METHODID_LIST_REGRESSION_TEMPLATES)))
        .addMethod(
          getListForecastIntervalsForSkillProfileMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListForecastIntervalsForSkillProfileReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>(
                service, METHODID_LIST_FORECAST_INTERVALS_FOR_SKILL_PROFILE)))
        .addMethod(
          getBuildRegressionForecastByIntervalMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CallDataByInterval>(
                service, METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL)))
        .addMethod(
          getBuildRegressionForecastByIntervalWithStatsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildRegressionForecastByIntervalWithStatsRes>(
                service, METHODID_BUILD_REGRESSION_FORECAST_BY_INTERVAL_WITH_STATS)))
        .addMethod(
          getListCallProfileTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCallProfileTemplatesRes>(
                service, METHODID_LIST_CALL_PROFILE_TEMPLATES)))
        .addMethod(
          getUpsertRegressionForecastMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRegressionForecastRes>(
                service, METHODID_UPSERT_REGRESSION_FORECAST)))
        .addMethod(
          getUpsertForecastDataDeltaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltaRes>(
                service, METHODID_UPSERT_FORECAST_DATA_DELTA)))
        .addMethod(
          getUpsertForecastDataDeltasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertForecastDataDeltasRes>(
                service, METHODID_UPSERT_FORECAST_DATA_DELTAS)))
        .addMethod(
          getDeleteForecastIntervalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsRes>(
                service, METHODID_DELETE_FORECAST_INTERVALS)))
        .addMethod(
          getListHistoricalDataForAllSkillProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataForAllSkillProfilesRes>(
                service, METHODID_LIST_HISTORICAL_DATA_FOR_ALL_SKILL_PROFILES)))
        .addMethod(
          getBuildDOWAndMOYProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes>(
                service, METHODID_BUILD_DOWAND_MOYPROFILES)))
        .addMethod(
          getCalculateTrainingDataAveragesForSkillProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CalculateTrainingDataAveragesForSkillProfileRes>(
                service, METHODID_CALCULATE_TRAINING_DATA_AVERAGES_FOR_SKILL_PROFILE)))
        .addMethod(
          getUpdateSkillProfileAveragesUsingHistoricalDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileAveragesUsingHistoricalDataRes>(
                service, METHODID_UPDATE_SKILL_PROFILE_AVERAGES_USING_HISTORICAL_DATA)))
        .addMethod(
          getUpdateCallCenterNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateCallCenterNodeRes>(
                service, METHODID_UPDATE_CALL_CENTER_NODE)))
        .addMethod(
          getCreateClientNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateClientNodeRes>(
                service, METHODID_CREATE_CLIENT_NODE)))
        .addMethod(
          getUpdateClientNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateClientNodeRes>(
                service, METHODID_UPDATE_CLIENT_NODE)))
        .addMethod(
          getCreateLocationNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeRes>(
                service, METHODID_CREATE_LOCATION_NODE)))
        .addMethod(
          getUpdateLocationNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateLocationNodeRes>(
                service, METHODID_UPDATE_LOCATION_NODE)))
        .addMethod(
          getCreateProgramNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateProgramNodeRes>(
                service, METHODID_CREATE_PROGRAM_NODE)))
        .addMethod(
          getUpdateProgramNodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateProgramNodeRes>(
                service, METHODID_UPDATE_PROGRAM_NODE)))
        .addMethod(
          getCreateConstraintRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateConstraintRuleRes>(
                service, METHODID_CREATE_CONSTRAINT_RULE)))
        .addMethod(
          getUpdateConstraintRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateConstraintRuleRes>(
                service, METHODID_UPDATE_CONSTRAINT_RULE)))
        .addMethod(
          getDeleteConstraintRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteConstraintRuleRes>(
                service, METHODID_DELETE_CONSTRAINT_RULE)))
        .addMethod(
          getCreateNonSkillActivityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateNonSkillActivityRes>(
                service, METHODID_CREATE_NON_SKILL_ACTIVITY)))
        .addMethod(
          getUpdateNonSkillActivityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateNonSkillActivityRes>(
                service, METHODID_UPDATE_NON_SKILL_ACTIVITY)))
        .addMethod(
          getListNonSkillActivitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivitiesRes>(
                service, METHODID_LIST_NON_SKILL_ACTIVITIES)))
        .addMethod(
          getListNonSkillActivityAssociationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes>(
                service, METHODID_LIST_NON_SKILL_ACTIVITY_ASSOCIATIONS)))
        .addMethod(
          getListCandidateSchedulingActivitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateSchedulingActivitiesRes>(
                service, METHODID_LIST_CANDIDATE_SCHEDULING_ACTIVITIES)))
        .addMethod(
          getCreateAgentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentGroupRes>(
                service, METHODID_CREATE_AGENT_GROUP)))
        .addMethod(
          getUpdateAgentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentGroupRes>(
                service, METHODID_UPDATE_AGENT_GROUP)))
        .addMethod(
          getUpdateWFMAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateWFMAgentRes>(
                service, METHODID_UPDATE_WFMAGENT)))
        .addMethod(
          getListAllWFMAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListAllWFMAgentsRes>(
                service, METHODID_LIST_ALL_WFMAGENTS)))
        .addMethod(
          getListCandidateWFMAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListCandidateWFMAgentsRes>(
                service, METHODID_LIST_CANDIDATE_WFMAGENTS)))
        .addMethod(
          getListUngroupedWFMAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListUngroupedWFMAgentsRes>(
                service, METHODID_LIST_UNGROUPED_WFMAGENTS)))
        .addMethod(
          getListWFMAgentsAssociatedWithAgentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentsAssociatedWithAgentGroupRes>(
                service, METHODID_LIST_WFMAGENTS_ASSOCIATED_WITH_AGENT_GROUP)))
        .addMethod(
          getCreateWFMAgentMembershipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateWFMAgentMembershipsRes>(
                service, METHODID_CREATE_WFMAGENT_MEMBERSHIPS)))
        .addMethod(
          getDeleteWFMAgentMembershipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentMembershipsRes>(
                service, METHODID_DELETE_WFMAGENT_MEMBERSHIPS)))
        .addMethod(
          getDeleteWFMAgentsMembershipsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteWFMAgentsMembershipsRes>(
                service, METHODID_DELETE_WFMAGENTS_MEMBERSHIPS)))
        .addMethod(
          getBuildAgentDiagnosticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildAgentDiagnosticsRes>(
                service, METHODID_BUILD_AGENT_DIAGNOSTICS)))
        .addMethod(
          getCreateShiftTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateRes>(
                service, METHODID_CREATE_SHIFT_TEMPLATE)))
        .addMethod(
          getUpdateShiftTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftTemplateRes>(
                service, METHODID_UPDATE_SHIFT_TEMPLATE)))
        .addMethod(
          getListShiftTemplatesBySidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes>(
                service, METHODID_LIST_SHIFT_TEMPLATES_BY_SIDS)))
        .addMethod(
          getBuildShiftTemplateDiagnosticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildShiftTemplateDiagnosticsRes>(
                service, METHODID_BUILD_SHIFT_TEMPLATE_DIAGNOSTICS)))
        .addMethod(
          getCreatePlacementRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleRes>(
                service, METHODID_CREATE_PLACEMENT_RULE)))
        .addMethod(
          getUpdatePlacementRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePlacementRuleRes>(
                service, METHODID_UPDATE_PLACEMENT_RULE)))
        .addMethod(
          getDeletePlacementRuleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeletePlacementRuleRes>(
                service, METHODID_DELETE_PLACEMENT_RULE)))
        .addMethod(
          getCreateOpenTimesPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateOpenTimesPatternRes>(
                service, METHODID_CREATE_OPEN_TIMES_PATTERN)))
        .addMethod(
          getUpdateOpenTimesPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateOpenTimesPatternRes>(
                service, METHODID_UPDATE_OPEN_TIMES_PATTERN)))
        .addMethod(
          getDeleteOpenTimesPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteOpenTimesPatternRes>(
                service, METHODID_DELETE_OPEN_TIMES_PATTERN)))
        .addMethod(
          getGetOpenTimesBitmapsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetOpenTimesBitmapsRes>(
                service, METHODID_GET_OPEN_TIMES_BITMAPS)))
        .addMethod(
          getCreateAgentAvailabilityPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateAgentAvailabilityPatternRes>(
                service, METHODID_CREATE_AGENT_AVAILABILITY_PATTERN)))
        .addMethod(
          getUpdateAgentAvailabilityPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateAgentAvailabilityPatternRes>(
                service, METHODID_UPDATE_AGENT_AVAILABILITY_PATTERN)))
        .addMethod(
          getDeleteAgentAvailabilityPatternMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteAgentAvailabilityPatternRes>(
                service, METHODID_DELETE_AGENT_AVAILABILITY_PATTERN)))
        .addMethod(
          getGetAvailabilityBitmapsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetAvailabilityBitmapsRes>(
                service, METHODID_GET_AVAILABILITY_BITMAPS)))
        .addMethod(
          getUpsertNonSkillActivityAssociationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertNonSkillActivityAssociationRes>(
                service, METHODID_UPSERT_NON_SKILL_ACTIVITY_ASSOCIATION)))
        .addMethod(
          getCreateSkillProficienciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateSkillProficienciesRes>(
                service, METHODID_CREATE_SKILL_PROFICIENCIES)))
        .addMethod(
          getUpdateSkillProficienciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProficienciesRes>(
                service, METHODID_UPDATE_SKILL_PROFICIENCIES)))
        .addMethod(
          getDeleteSkillProficiencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSkillProficiencyRes>(
                service, METHODID_DELETE_SKILL_PROFICIENCY)))
        .addMethod(
          getCopyScenarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyScenarioRes>(
                service, METHODID_COPY_SCENARIO)))
        .addMethod(
          getCreateScheduleScenarioWithNodesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateScheduleScenarioWithNodesRes>(
                service, METHODID_CREATE_SCHEDULE_SCENARIO_WITH_NODES)))
        .addMethod(
          getUpdateScheduleScenarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateScheduleScenarioRes>(
                service, METHODID_UPDATE_SCHEDULE_SCENARIO)))
        .addMethod(
          getListConfigEntitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesRes>(
                service, METHODID_LIST_CONFIG_ENTITIES)))
        .addMethod(
          getDeleteShiftInstancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteShiftInstancesRes>(
                service, METHODID_DELETE_SHIFT_INSTANCES)))
        .addMethod(
          getBuildNodeDiagnosticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildNodeDiagnosticsRes>(
                service, METHODID_BUILD_NODE_DIAGNOSTICS)))
        .addMethod(
          getBuildGlobalDiagnosticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildGlobalDiagnosticsRes>(
                service, METHODID_BUILD_GLOBAL_DIAGNOSTICS)))
        .addMethod(
          getGetPublishedScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRes>(
                service, METHODID_GET_PUBLISHED_SCHEDULE)))
        .addMethod(
          getGetPublishedScheduleRequiredCallsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPublishedScheduleRequiredCallsRes>(
                service, METHODID_GET_PUBLISHED_SCHEDULE_REQUIRED_CALLS)))
        .addMethod(
          getGetDraftScheduleRequiredCallsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRequiredCallsRes>(
                service, METHODID_GET_DRAFT_SCHEDULE_REQUIRED_CALLS)))
        .addMethod(
          getCreateDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateDraftScheduleRes>(
                service, METHODID_CREATE_DRAFT_SCHEDULE)))
        .addMethod(
          getUpdateDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateDraftScheduleRes>(
                service, METHODID_UPDATE_DRAFT_SCHEDULE)))
        .addMethod(
          getBuildDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDraftScheduleRes>(
                service, METHODID_BUILD_DRAFT_SCHEDULE)))
        .addMethod(
          getPublishDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.PublishDraftScheduleRes>(
                service, METHODID_PUBLISH_DRAFT_SCHEDULE)))
        .addMethod(
          getResetDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ResetDraftScheduleRes>(
                service, METHODID_RESET_DRAFT_SCHEDULE)))
        .addMethod(
          getGetDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes>(
                service, METHODID_GET_DRAFT_SCHEDULE)))
        .addMethod(
          getListDraftSchedulesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListDraftSchedulesRes>(
                service, METHODID_LIST_DRAFT_SCHEDULES)))
        .addMethod(
          getClearScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ClearScheduleRes>(
                service, METHODID_CLEAR_SCHEDULE)))
        .addMethod(
          getDeleteDraftScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteDraftScheduleRes>(
                service, METHODID_DELETE_DRAFT_SCHEDULE)))
        .addMethod(
          getListShiftInstancesBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstancesBySidRes>(
                service, METHODID_LIST_SHIFT_INSTANCES_BY_SID)))
        .addMethod(
          getCopyScheduleToScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyScheduleToScheduleRes>(
                service, METHODID_COPY_SCHEDULE_TO_SCHEDULE)))
        .addMethod(
          getCreateShiftInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceRes>(
                service, METHODID_CREATE_SHIFT_INSTANCE)))
        .addMethod(
          getCreateShiftInstanceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Req,
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceV2Res>(
                service, METHODID_CREATE_SHIFT_INSTANCE_V2)))
        .addMethod(
          getSwapShiftInstancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.SwapShiftInstancesRes>(
                service, METHODID_SWAP_SHIFT_INSTANCES)))
        .addMethod(
          getUpdateShiftInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceRes>(
                service, METHODID_UPDATE_SHIFT_INSTANCE)))
        .addMethod(
          getUpdateShiftInstanceV2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Req,
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateShiftInstanceV2Res>(
                service, METHODID_UPDATE_SHIFT_INSTANCE_V2)))
        .addMethod(
          getCopyShiftInstancesToScheduleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.CopyShiftInstancesToScheduleRes>(
                service, METHODID_COPY_SHIFT_INSTANCES_TO_SCHEDULE)))
        .addMethod(
          getListShiftInstanceSidsForAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftInstanceSidsForAgentRes>(
                service, METHODID_LIST_SHIFT_INSTANCE_SIDS_FOR_AGENT)))
        .addMethod(
          getListShiftSegmentsByShiftInstanceSidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsRes>(
                service, METHODID_LIST_SHIFT_SEGMENTS_BY_SHIFT_INSTANCE_SIDS)))
        .addMethod(
          getSetSchedulingTargetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.SetSchedulingTargetRes>(
                service, METHODID_SET_SCHEDULING_TARGET)))
        .addMethod(
          getGetSchedulingTargetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetSchedulingTargetRes>(
                service, METHODID_GET_SCHEDULING_TARGET)))
        .addMethod(
          getDeleteSchedulingTargetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.DeleteSchedulingTargetRes>(
                service, METHODID_DELETE_SCHEDULING_TARGET)))
        .addMethod(
          getGetPerformanceMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.GetPerformanceMetricsRes>(
                service, METHODID_GET_PERFORMANCE_METRICS)))
        .addMethod(
          getListRequiredCallsIntervalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsReq,
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRequiredCallsIntervalsRes>(
                service, METHODID_LIST_REQUIRED_CALLS_INTERVALS)))
        .build();
  }

  private static abstract class WFMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WFMBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WFM");
    }
  }

  private static final class WFMFileDescriptorSupplier
      extends WFMBaseDescriptorSupplier {
    WFMFileDescriptorSupplier() {}
  }

  private static final class WFMMethodDescriptorSupplier
      extends WFMBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WFMMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WFMGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WFMFileDescriptorSupplier())
              .addMethod(getListSkillProfilesMethod())
              .addMethod(getUpdateSkillProfileMethod())
              .addMethod(getUpdateSkillProfileProficienciesMethod())
              .addMethod(getGetSkillProfileMethod())
              .addMethod(getResyncSkillProfilesMethod())
              .addMethod(getGetLastSkillProfileResyncDateMethod())
              .addMethod(getUpsertForecastingParametersMethod())
              .addMethod(getGetForecastingParametersMethod())
              .addMethod(getListHistoricalDataMethod())
              .addMethod(getUpsertHistoricalDataDeltaMethod())
              .addMethod(getUpsertHistoricalDataDeltasMethod())
              .addMethod(getListSkillsMethod())
              .addMethod(getBuildCallProfileTemplateForSkillProfileMethod())
              .addMethod(getCreateInactiveSkillProfileMappingMethod())
              .addMethod(getGetAvailableRegressionForecasterModelTypesMethod())
              .addMethod(getDisconnectInactiveSkillProfileMappingMethod())
              .addMethod(getDeleteHistoricalDataDeltasMethod())
              .addMethod(getListTopSkillProfilesMethod())
              .addMethod(getGetSkillProfilesCountMethod())
              .addMethod(getBuildProfileForecastByIntervalMethod())
              .addMethod(getBuildProfileForecastByIntervalWithStatsMethod())
              .addMethod(getUpsertProfileForecastMethod())
              .addMethod(getCreateCallProfileTemplateMethod())
              .addMethod(getDeleteCallProfileTemplateMethod())
              .addMethod(getCreateRegressionTemplateMethod())
              .addMethod(getDeleteRegressionTemplateMethod())
              .addMethod(getListRegressionTemplatesMethod())
              .addMethod(getListForecastIntervalsForSkillProfileMethod())
              .addMethod(getBuildRegressionForecastByIntervalMethod())
              .addMethod(getBuildRegressionForecastByIntervalWithStatsMethod())
              .addMethod(getListCallProfileTemplatesMethod())
              .addMethod(getUpsertRegressionForecastMethod())
              .addMethod(getUpsertForecastDataDeltaMethod())
              .addMethod(getUpsertForecastDataDeltasMethod())
              .addMethod(getDeleteForecastIntervalsMethod())
              .addMethod(getListHistoricalDataForAllSkillProfilesMethod())
              .addMethod(getBuildDOWAndMOYProfilesMethod())
              .addMethod(getCalculateTrainingDataAveragesForSkillProfileMethod())
              .addMethod(getUpdateSkillProfileAveragesUsingHistoricalDataMethod())
              .addMethod(getUpdateCallCenterNodeMethod())
              .addMethod(getCreateClientNodeMethod())
              .addMethod(getUpdateClientNodeMethod())
              .addMethod(getCreateLocationNodeMethod())
              .addMethod(getUpdateLocationNodeMethod())
              .addMethod(getCreateProgramNodeMethod())
              .addMethod(getUpdateProgramNodeMethod())
              .addMethod(getCreateConstraintRuleMethod())
              .addMethod(getUpdateConstraintRuleMethod())
              .addMethod(getDeleteConstraintRuleMethod())
              .addMethod(getCreateNonSkillActivityMethod())
              .addMethod(getUpdateNonSkillActivityMethod())
              .addMethod(getListNonSkillActivitiesMethod())
              .addMethod(getListNonSkillActivityAssociationsMethod())
              .addMethod(getListCandidateSchedulingActivitiesMethod())
              .addMethod(getCreateAgentGroupMethod())
              .addMethod(getUpdateAgentGroupMethod())
              .addMethod(getUpdateWFMAgentMethod())
              .addMethod(getListAllWFMAgentsMethod())
              .addMethod(getListCandidateWFMAgentsMethod())
              .addMethod(getListUngroupedWFMAgentsMethod())
              .addMethod(getListWFMAgentsAssociatedWithAgentGroupMethod())
              .addMethod(getCreateWFMAgentMembershipsMethod())
              .addMethod(getDeleteWFMAgentMembershipsMethod())
              .addMethod(getDeleteWFMAgentsMembershipsMethod())
              .addMethod(getBuildAgentDiagnosticsMethod())
              .addMethod(getCreateShiftTemplateMethod())
              .addMethod(getUpdateShiftTemplateMethod())
              .addMethod(getListShiftTemplatesBySidsMethod())
              .addMethod(getBuildShiftTemplateDiagnosticsMethod())
              .addMethod(getCreatePlacementRuleMethod())
              .addMethod(getUpdatePlacementRuleMethod())
              .addMethod(getDeletePlacementRuleMethod())
              .addMethod(getCreateOpenTimesPatternMethod())
              .addMethod(getUpdateOpenTimesPatternMethod())
              .addMethod(getDeleteOpenTimesPatternMethod())
              .addMethod(getGetOpenTimesBitmapsMethod())
              .addMethod(getCreateAgentAvailabilityPatternMethod())
              .addMethod(getUpdateAgentAvailabilityPatternMethod())
              .addMethod(getDeleteAgentAvailabilityPatternMethod())
              .addMethod(getGetAvailabilityBitmapsMethod())
              .addMethod(getUpsertNonSkillActivityAssociationMethod())
              .addMethod(getCreateSkillProficienciesMethod())
              .addMethod(getUpdateSkillProficienciesMethod())
              .addMethod(getDeleteSkillProficiencyMethod())
              .addMethod(getCopyScenarioMethod())
              .addMethod(getCreateScheduleScenarioWithNodesMethod())
              .addMethod(getUpdateScheduleScenarioMethod())
              .addMethod(getListConfigEntitiesMethod())
              .addMethod(getDeleteShiftInstancesMethod())
              .addMethod(getBuildNodeDiagnosticsMethod())
              .addMethod(getBuildGlobalDiagnosticsMethod())
              .addMethod(getGetPublishedScheduleMethod())
              .addMethod(getGetPublishedScheduleRequiredCallsMethod())
              .addMethod(getGetDraftScheduleRequiredCallsMethod())
              .addMethod(getCreateDraftScheduleMethod())
              .addMethod(getUpdateDraftScheduleMethod())
              .addMethod(getBuildDraftScheduleMethod())
              .addMethod(getPublishDraftScheduleMethod())
              .addMethod(getResetDraftScheduleMethod())
              .addMethod(getGetDraftScheduleMethod())
              .addMethod(getListDraftSchedulesMethod())
              .addMethod(getClearScheduleMethod())
              .addMethod(getDeleteDraftScheduleMethod())
              .addMethod(getListShiftInstancesBySidMethod())
              .addMethod(getCopyScheduleToScheduleMethod())
              .addMethod(getCreateShiftInstanceMethod())
              .addMethod(getCreateShiftInstanceV2Method())
              .addMethod(getSwapShiftInstancesMethod())
              .addMethod(getUpdateShiftInstanceMethod())
              .addMethod(getUpdateShiftInstanceV2Method())
              .addMethod(getCopyShiftInstancesToScheduleMethod())
              .addMethod(getListShiftInstanceSidsForAgentMethod())
              .addMethod(getListShiftSegmentsByShiftInstanceSidsMethod())
              .addMethod(getSetSchedulingTargetMethod())
              .addMethod(getGetSchedulingTargetMethod())
              .addMethod(getDeleteSchedulingTargetMethod())
              .addMethod(getGetPerformanceMetricsMethod())
              .addMethod(getListRequiredCallsIntervalsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
