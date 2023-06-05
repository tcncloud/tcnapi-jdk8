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
    comments = "Source: api/v1alpha1/integrations/portals.proto")
public final class PortalManagerApiGrpc {

  private PortalManagerApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.integrations.PortalManagerApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> getUpsertPortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertPortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> getUpsertPortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> getUpsertPortalConfigMethod;
    if ((getUpsertPortalConfigMethod = PortalManagerApiGrpc.getUpsertPortalConfigMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getUpsertPortalConfigMethod = PortalManagerApiGrpc.getUpsertPortalConfigMethod) == null) {
          PortalManagerApiGrpc.getUpsertPortalConfigMethod = getUpsertPortalConfigMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "UpsertPortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("UpsertPortalConfig"))
                  .build();
          }
        }
     }
     return getUpsertPortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> getListPortalConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPortalConfigs",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> getListPortalConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> getListPortalConfigsMethod;
    if ((getListPortalConfigsMethod = PortalManagerApiGrpc.getListPortalConfigsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListPortalConfigsMethod = PortalManagerApiGrpc.getListPortalConfigsMethod) == null) {
          PortalManagerApiGrpc.getListPortalConfigsMethod = getListPortalConfigsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListPortalConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListPortalConfigs"))
                  .build();
          }
        }
     }
     return getListPortalConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> getGetPortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> getGetPortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> getGetPortalConfigMethod;
    if ((getGetPortalConfigMethod = PortalManagerApiGrpc.getGetPortalConfigMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetPortalConfigMethod = PortalManagerApiGrpc.getGetPortalConfigMethod) == null) {
          PortalManagerApiGrpc.getGetPortalConfigMethod = getGetPortalConfigMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetPortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetPortalConfig"))
                  .build();
          }
        }
     }
     return getGetPortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> getDeletePortalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> getDeletePortalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> getDeletePortalConfigMethod;
    if ((getDeletePortalConfigMethod = PortalManagerApiGrpc.getDeletePortalConfigMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getDeletePortalConfigMethod = PortalManagerApiGrpc.getDeletePortalConfigMethod) == null) {
          PortalManagerApiGrpc.getDeletePortalConfigMethod = getDeletePortalConfigMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "DeletePortalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("DeletePortalConfig"))
                  .build();
          }
        }
     }
     return getDeletePortalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> getUpdatePortalConfigLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePortalConfigLogo",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> getUpdatePortalConfigLogoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> getUpdatePortalConfigLogoMethod;
    if ((getUpdatePortalConfigLogoMethod = PortalManagerApiGrpc.getUpdatePortalConfigLogoMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getUpdatePortalConfigLogoMethod = PortalManagerApiGrpc.getUpdatePortalConfigLogoMethod) == null) {
          PortalManagerApiGrpc.getUpdatePortalConfigLogoMethod = getUpdatePortalConfigLogoMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "UpdatePortalConfigLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("UpdatePortalConfigLogo"))
                  .build();
          }
        }
     }
     return getUpdatePortalConfigLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> getGetPortalConfigLogoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalConfigLogo",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> getGetPortalConfigLogoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> getGetPortalConfigLogoMethod;
    if ((getGetPortalConfigLogoMethod = PortalManagerApiGrpc.getGetPortalConfigLogoMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetPortalConfigLogoMethod = PortalManagerApiGrpc.getGetPortalConfigLogoMethod) == null) {
          PortalManagerApiGrpc.getGetPortalConfigLogoMethod = getGetPortalConfigLogoMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetPortalConfigLogo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetPortalConfigLogo"))
                  .build();
          }
        }
     }
     return getGetPortalConfigLogoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> getListPortalLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPortalLinks",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> getListPortalLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> getListPortalLinksMethod;
    if ((getListPortalLinksMethod = PortalManagerApiGrpc.getListPortalLinksMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListPortalLinksMethod = PortalManagerApiGrpc.getListPortalLinksMethod) == null) {
          PortalManagerApiGrpc.getListPortalLinksMethod = getListPortalLinksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListPortalLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListPortalLinks"))
                  .build();
          }
        }
     }
     return getListPortalLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> getGetPortalLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortalLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> getGetPortalLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> getGetPortalLinkMethod;
    if ((getGetPortalLinkMethod = PortalManagerApiGrpc.getGetPortalLinkMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetPortalLinkMethod = PortalManagerApiGrpc.getGetPortalLinkMethod) == null) {
          PortalManagerApiGrpc.getGetPortalLinkMethod = getGetPortalLinkMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetPortalLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetPortalLink"))
                  .build();
          }
        }
     }
     return getGetPortalLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> getDeletePortalLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortalLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> getDeletePortalLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> getDeletePortalLinkMethod;
    if ((getDeletePortalLinkMethod = PortalManagerApiGrpc.getDeletePortalLinkMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getDeletePortalLinkMethod = PortalManagerApiGrpc.getDeletePortalLinkMethod) == null) {
          PortalManagerApiGrpc.getDeletePortalLinkMethod = getDeletePortalLinkMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "DeletePortalLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("DeletePortalLink"))
                  .build();
          }
        }
     }
     return getDeletePortalLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> getCreatePortalLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePortalLinks",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> getCreatePortalLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> getCreatePortalLinksMethod;
    if ((getCreatePortalLinksMethod = PortalManagerApiGrpc.getCreatePortalLinksMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getCreatePortalLinksMethod = PortalManagerApiGrpc.getCreatePortalLinksMethod) == null) {
          PortalManagerApiGrpc.getCreatePortalLinksMethod = getCreatePortalLinksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq, com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "CreatePortalLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("CreatePortalLinks"))
                  .build();
          }
        }
     }
     return getCreatePortalLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> getUpsertPortalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertPortal",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> getUpsertPortalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> getUpsertPortalMethod;
    if ((getUpsertPortalMethod = PortalManagerApiGrpc.getUpsertPortalMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getUpsertPortalMethod = PortalManagerApiGrpc.getUpsertPortalMethod) == null) {
          PortalManagerApiGrpc.getUpsertPortalMethod = getUpsertPortalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "UpsertPortal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("UpsertPortal"))
                  .build();
          }
        }
     }
     return getUpsertPortalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> getGetPortalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortal",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> getGetPortalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> getGetPortalMethod;
    if ((getGetPortalMethod = PortalManagerApiGrpc.getGetPortalMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetPortalMethod = PortalManagerApiGrpc.getGetPortalMethod) == null) {
          PortalManagerApiGrpc.getGetPortalMethod = getGetPortalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetPortal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetPortal"))
                  .build();
          }
        }
     }
     return getGetPortalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> getDeletePortalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePortal",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> getDeletePortalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> getDeletePortalMethod;
    if ((getDeletePortalMethod = PortalManagerApiGrpc.getDeletePortalMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getDeletePortalMethod = PortalManagerApiGrpc.getDeletePortalMethod) == null) {
          PortalManagerApiGrpc.getDeletePortalMethod = getDeletePortalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "DeletePortal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("DeletePortal"))
                  .build();
          }
        }
     }
     return getDeletePortalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> getListPortalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPortals",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> getListPortalsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> getListPortalsMethod;
    if ((getListPortalsMethod = PortalManagerApiGrpc.getListPortalsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListPortalsMethod = PortalManagerApiGrpc.getListPortalsMethod) == null) {
          PortalManagerApiGrpc.getListPortalsMethod = getListPortalsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListPortals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListPortals"))
                  .build();
          }
        }
     }
     return getListPortalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> getListDetailedPortalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDetailedPortals",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> getListDetailedPortalsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> getListDetailedPortalsMethod;
    if ((getListDetailedPortalsMethod = PortalManagerApiGrpc.getListDetailedPortalsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListDetailedPortalsMethod = PortalManagerApiGrpc.getListDetailedPortalsMethod) == null) {
          PortalManagerApiGrpc.getListDetailedPortalsMethod = getListDetailedPortalsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListDetailedPortals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListDetailedPortals"))
                  .build();
          }
        }
     }
     return getListDetailedPortalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> getGetDetailedPortalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDetailedPortal",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> getGetDetailedPortalMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> getGetDetailedPortalMethod;
    if ((getGetDetailedPortalMethod = PortalManagerApiGrpc.getGetDetailedPortalMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetDetailedPortalMethod = PortalManagerApiGrpc.getGetDetailedPortalMethod) == null) {
          PortalManagerApiGrpc.getGetDetailedPortalMethod = getGetDetailedPortalMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetDetailedPortal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetDetailedPortal"))
                  .build();
          }
        }
     }
     return getGetDetailedPortalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> getUpsertPluginInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertPluginInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> getUpsertPluginInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> getUpsertPluginInstanceMethod;
    if ((getUpsertPluginInstanceMethod = PortalManagerApiGrpc.getUpsertPluginInstanceMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getUpsertPluginInstanceMethod = PortalManagerApiGrpc.getUpsertPluginInstanceMethod) == null) {
          PortalManagerApiGrpc.getUpsertPluginInstanceMethod = getUpsertPluginInstanceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "UpsertPluginInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("UpsertPluginInstance"))
                  .build();
          }
        }
     }
     return getUpsertPluginInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> getGetPluginInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPluginInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> getGetPluginInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> getGetPluginInstanceMethod;
    if ((getGetPluginInstanceMethod = PortalManagerApiGrpc.getGetPluginInstanceMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getGetPluginInstanceMethod = PortalManagerApiGrpc.getGetPluginInstanceMethod) == null) {
          PortalManagerApiGrpc.getGetPluginInstanceMethod = getGetPluginInstanceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "GetPluginInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("GetPluginInstance"))
                  .build();
          }
        }
     }
     return getGetPluginInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> getDeletePluginInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePluginInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> getDeletePluginInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> getDeletePluginInstanceMethod;
    if ((getDeletePluginInstanceMethod = PortalManagerApiGrpc.getDeletePluginInstanceMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getDeletePluginInstanceMethod = PortalManagerApiGrpc.getDeletePluginInstanceMethod) == null) {
          PortalManagerApiGrpc.getDeletePluginInstanceMethod = getDeletePluginInstanceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "DeletePluginInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("DeletePluginInstance"))
                  .build();
          }
        }
     }
     return getDeletePluginInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> getListPluginInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPluginInstance",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> getListPluginInstanceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> getListPluginInstanceMethod;
    if ((getListPluginInstanceMethod = PortalManagerApiGrpc.getListPluginInstanceMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListPluginInstanceMethod = PortalManagerApiGrpc.getListPluginInstanceMethod) == null) {
          PortalManagerApiGrpc.getListPluginInstanceMethod = getListPluginInstanceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListPluginInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListPluginInstance"))
                  .build();
          }
        }
     }
     return getListPluginInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> getListFlowFieldNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlowFieldNames",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> getListFlowFieldNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> getListFlowFieldNamesMethod;
    if ((getListFlowFieldNamesMethod = PortalManagerApiGrpc.getListFlowFieldNamesMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListFlowFieldNamesMethod = PortalManagerApiGrpc.getListFlowFieldNamesMethod) == null) {
          PortalManagerApiGrpc.getListFlowFieldNamesMethod = getListFlowFieldNamesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListFlowFieldNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListFlowFieldNames"))
                  .build();
          }
        }
     }
     return getListFlowFieldNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> getListAvailableVerificationFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableVerificationFields",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> getListAvailableVerificationFieldsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> getListAvailableVerificationFieldsMethod;
    if ((getListAvailableVerificationFieldsMethod = PortalManagerApiGrpc.getListAvailableVerificationFieldsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListAvailableVerificationFieldsMethod = PortalManagerApiGrpc.getListAvailableVerificationFieldsMethod) == null) {
          PortalManagerApiGrpc.getListAvailableVerificationFieldsMethod = getListAvailableVerificationFieldsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListAvailableVerificationFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListAvailableVerificationFields"))
                  .build();
          }
        }
     }
     return getListAvailableVerificationFieldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> getListAvailablePaymentFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailablePaymentFields",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> getListAvailablePaymentFieldsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> getListAvailablePaymentFieldsMethod;
    if ((getListAvailablePaymentFieldsMethod = PortalManagerApiGrpc.getListAvailablePaymentFieldsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListAvailablePaymentFieldsMethod = PortalManagerApiGrpc.getListAvailablePaymentFieldsMethod) == null) {
          PortalManagerApiGrpc.getListAvailablePaymentFieldsMethod = getListAvailablePaymentFieldsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.integrations.PortalManagerApi", "ListAvailablePaymentFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListAvailablePaymentFields"))
                  .build();
          }
        }
     }
     return getListAvailablePaymentFieldsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortalManagerApiStub newStub(io.grpc.Channel channel) {
    return new PortalManagerApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortalManagerApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PortalManagerApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortalManagerApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PortalManagerApiFutureStub(channel);
  }

  /**
   */
  public static abstract class PortalManagerApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertPortalConfigMethod(), responseObserver);
    }

    /**
     */
    public void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPortalConfigsMethod(), responseObserver);
    }

    /**
     */
    public void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalConfigMethod(), responseObserver);
    }

    /**
     */
    public void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortalConfigMethod(), responseObserver);
    }

    /**
     */
    public void updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePortalConfigLogoMethod(), responseObserver);
    }

    /**
     */
    public void getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalConfigLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public void listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPortalLinksMethod(), responseObserver);
    }

    /**
     */
    public void getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalLinkMethod(), responseObserver);
    }

    /**
     */
    public void deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortalLinkMethod(), responseObserver);
    }

    /**
     */
    public void createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePortalLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public void upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertPortalMethod(), responseObserver);
    }

    /**
     */
    public void getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortalMethod(), responseObserver);
    }

    /**
     */
    public void deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortalMethod(), responseObserver);
    }

    /**
     */
    public void listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPortalsMethod(), responseObserver);
    }

    /**
     */
    public void listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListDetailedPortalsMethod(), responseObserver);
    }

    /**
     */
    public void getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetailedPortalMethod(), responseObserver);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public void upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpsertPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    public void getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    public void deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePluginInstanceMethod(), responseObserver);
    }

    /**
     */
    public void listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    public void listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlowFieldNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public void listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailableVerificationFieldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public void listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailablePaymentFieldsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpsertPortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes>(
                  this, METHODID_UPSERT_PORTAL_CONFIG)))
          .addMethod(
            getListPortalConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes>(
                  this, METHODID_LIST_PORTAL_CONFIGS)))
          .addMethod(
            getGetPortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes>(
                  this, METHODID_GET_PORTAL_CONFIG)))
          .addMethod(
            getDeletePortalConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes>(
                  this, METHODID_DELETE_PORTAL_CONFIG)))
          .addMethod(
            getUpdatePortalConfigLogoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes>(
                  this, METHODID_UPDATE_PORTAL_CONFIG_LOGO)))
          .addMethod(
            getGetPortalConfigLogoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes>(
                  this, METHODID_GET_PORTAL_CONFIG_LOGO)))
          .addMethod(
            getListPortalLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes>(
                  this, METHODID_LIST_PORTAL_LINKS)))
          .addMethod(
            getGetPortalLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes>(
                  this, METHODID_GET_PORTAL_LINK)))
          .addMethod(
            getDeletePortalLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes>(
                  this, METHODID_DELETE_PORTAL_LINK)))
          .addMethod(
            getCreatePortalLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes>(
                  this, METHODID_CREATE_PORTAL_LINKS)))
          .addMethod(
            getUpsertPortalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes>(
                  this, METHODID_UPSERT_PORTAL)))
          .addMethod(
            getGetPortalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes>(
                  this, METHODID_GET_PORTAL)))
          .addMethod(
            getDeletePortalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes>(
                  this, METHODID_DELETE_PORTAL)))
          .addMethod(
            getListPortalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes>(
                  this, METHODID_LIST_PORTALS)))
          .addMethod(
            getListDetailedPortalsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes>(
                  this, METHODID_LIST_DETAILED_PORTALS)))
          .addMethod(
            getGetDetailedPortalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes>(
                  this, METHODID_GET_DETAILED_PORTAL)))
          .addMethod(
            getUpsertPluginInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes>(
                  this, METHODID_UPSERT_PLUGIN_INSTANCE)))
          .addMethod(
            getGetPluginInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes>(
                  this, METHODID_GET_PLUGIN_INSTANCE)))
          .addMethod(
            getDeletePluginInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes>(
                  this, METHODID_DELETE_PLUGIN_INSTANCE)))
          .addMethod(
            getListPluginInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes>(
                  this, METHODID_LIST_PLUGIN_INSTANCE)))
          .addMethod(
            getListFlowFieldNamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes>(
                  this, METHODID_LIST_FLOW_FIELD_NAMES)))
          .addMethod(
            getListAvailableVerificationFieldsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes>(
                  this, METHODID_LIST_AVAILABLE_VERIFICATION_FIELDS)))
          .addMethod(
            getListAvailablePaymentFieldsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq,
                com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes>(
                  this, METHODID_LIST_AVAILABLE_PAYMENT_FIELDS)))
          .build();
    }
  }

  /**
   */
  public static final class PortalManagerApiStub extends io.grpc.stub.AbstractStub<PortalManagerApiStub> {
    private PortalManagerApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortalManagerApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortalManagerApiStub(channel, callOptions);
    }

    /**
     */
    public void upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertPortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePortalConfigLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortalConfigLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public void listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public void upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPortalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDetailedPortalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDetailedPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public void upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpsertPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlowFieldNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public void listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAvailableVerificationFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public void listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAvailablePaymentFieldsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PortalManagerApiBlockingStub extends io.grpc.stub.AbstractStub<PortalManagerApiBlockingStub> {
    private PortalManagerApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortalManagerApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortalManagerApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getUpsertPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return blockingUnaryCall(
          getChannel(), getListPortalConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePortalConfigLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalConfigLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request) {
      return blockingUnaryCall(
          getChannel(), getListPortalLinksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request) {
      return blockingUnaryCall(
          getChannel(), getCreatePortalLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request) {
      return blockingUnaryCall(
          getChannel(), getUpsertPortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request) {
      return blockingUnaryCall(
          getChannel(), getListPortalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request) {
      return blockingUnaryCall(
          getChannel(), getListDetailedPortalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request) {
      return blockingUnaryCall(
          getChannel(), getGetDetailedPortalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request) {
      return blockingUnaryCall(
          getChannel(), getUpsertPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request) {
      return blockingUnaryCall(
          getChannel(), getListPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request) {
      return blockingUnaryCall(
          getChannel(), getListFlowFieldNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAvailableVerificationFieldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAvailablePaymentFieldsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PortalManagerApiFutureStub extends io.grpc.stub.AbstractStub<PortalManagerApiFutureStub> {
    private PortalManagerApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortalManagerApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortalManagerApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> upsertPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertPortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> listPortalConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> getPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> deletePortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> updatePortalConfigLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePortalConfigLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> getPortalConfigLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortalConfigLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> listPortalLinks(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPortalLinksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> getPortalLink(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> deletePortalLink(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> createPortalLinks(
        com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePortalLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> upsertPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertPortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> getPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> deletePortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> listPortals(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPortalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> listDetailedPortals(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListDetailedPortalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> getDetailedPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDetailedPortalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> upsertPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpsertPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> getPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> deletePluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> listPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> listFlowFieldNames(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlowFieldNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> listAvailableVerificationFields(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAvailableVerificationFieldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> listAvailablePaymentFields(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAvailablePaymentFieldsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPSERT_PORTAL_CONFIG = 0;
  private static final int METHODID_LIST_PORTAL_CONFIGS = 1;
  private static final int METHODID_GET_PORTAL_CONFIG = 2;
  private static final int METHODID_DELETE_PORTAL_CONFIG = 3;
  private static final int METHODID_UPDATE_PORTAL_CONFIG_LOGO = 4;
  private static final int METHODID_GET_PORTAL_CONFIG_LOGO = 5;
  private static final int METHODID_LIST_PORTAL_LINKS = 6;
  private static final int METHODID_GET_PORTAL_LINK = 7;
  private static final int METHODID_DELETE_PORTAL_LINK = 8;
  private static final int METHODID_CREATE_PORTAL_LINKS = 9;
  private static final int METHODID_UPSERT_PORTAL = 10;
  private static final int METHODID_GET_PORTAL = 11;
  private static final int METHODID_DELETE_PORTAL = 12;
  private static final int METHODID_LIST_PORTALS = 13;
  private static final int METHODID_LIST_DETAILED_PORTALS = 14;
  private static final int METHODID_GET_DETAILED_PORTAL = 15;
  private static final int METHODID_UPSERT_PLUGIN_INSTANCE = 16;
  private static final int METHODID_GET_PLUGIN_INSTANCE = 17;
  private static final int METHODID_DELETE_PLUGIN_INSTANCE = 18;
  private static final int METHODID_LIST_PLUGIN_INSTANCE = 19;
  private static final int METHODID_LIST_FLOW_FIELD_NAMES = 20;
  private static final int METHODID_LIST_AVAILABLE_VERIFICATION_FIELDS = 21;
  private static final int METHODID_LIST_AVAILABLE_PAYMENT_FIELDS = 22;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PortalManagerApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PortalManagerApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPSERT_PORTAL_CONFIG:
          serviceImpl.upsertPortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes>) responseObserver);
          break;
        case METHODID_LIST_PORTAL_CONFIGS:
          serviceImpl.listPortalConfigs((com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes>) responseObserver);
          break;
        case METHODID_GET_PORTAL_CONFIG:
          serviceImpl.getPortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL_CONFIG:
          serviceImpl.deletePortalConfig((com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes>) responseObserver);
          break;
        case METHODID_UPDATE_PORTAL_CONFIG_LOGO:
          serviceImpl.updatePortalConfigLogo((com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes>) responseObserver);
          break;
        case METHODID_GET_PORTAL_CONFIG_LOGO:
          serviceImpl.getPortalConfigLogo((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes>) responseObserver);
          break;
        case METHODID_LIST_PORTAL_LINKS:
          serviceImpl.listPortalLinks((com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes>) responseObserver);
          break;
        case METHODID_GET_PORTAL_LINK:
          serviceImpl.getPortalLink((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL_LINK:
          serviceImpl.deletePortalLink((com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes>) responseObserver);
          break;
        case METHODID_CREATE_PORTAL_LINKS:
          serviceImpl.createPortalLinks((com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes>) responseObserver);
          break;
        case METHODID_UPSERT_PORTAL:
          serviceImpl.upsertPortal((com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes>) responseObserver);
          break;
        case METHODID_GET_PORTAL:
          serviceImpl.getPortal((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes>) responseObserver);
          break;
        case METHODID_DELETE_PORTAL:
          serviceImpl.deletePortal((com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes>) responseObserver);
          break;
        case METHODID_LIST_PORTALS:
          serviceImpl.listPortals((com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes>) responseObserver);
          break;
        case METHODID_LIST_DETAILED_PORTALS:
          serviceImpl.listDetailedPortals((com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes>) responseObserver);
          break;
        case METHODID_GET_DETAILED_PORTAL:
          serviceImpl.getDetailedPortal((com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes>) responseObserver);
          break;
        case METHODID_UPSERT_PLUGIN_INSTANCE:
          serviceImpl.upsertPluginInstance((com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes>) responseObserver);
          break;
        case METHODID_GET_PLUGIN_INSTANCE:
          serviceImpl.getPluginInstance((com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes>) responseObserver);
          break;
        case METHODID_DELETE_PLUGIN_INSTANCE:
          serviceImpl.deletePluginInstance((com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes>) responseObserver);
          break;
        case METHODID_LIST_PLUGIN_INSTANCE:
          serviceImpl.listPluginInstance((com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes>) responseObserver);
          break;
        case METHODID_LIST_FLOW_FIELD_NAMES:
          serviceImpl.listFlowFieldNames((com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_VERIFICATION_FIELDS:
          serviceImpl.listAvailableVerificationFields((com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_PAYMENT_FIELDS:
          serviceImpl.listAvailablePaymentFields((com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes>) responseObserver);
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

  private static abstract class PortalManagerApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PortalManagerApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PortalManagerApi");
    }
  }

  private static final class PortalManagerApiFileDescriptorSupplier
      extends PortalManagerApiBaseDescriptorSupplier {
    PortalManagerApiFileDescriptorSupplier() {}
  }

  private static final class PortalManagerApiMethodDescriptorSupplier
      extends PortalManagerApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PortalManagerApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (PortalManagerApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PortalManagerApiFileDescriptorSupplier())
              .addMethod(getUpsertPortalConfigMethod())
              .addMethod(getListPortalConfigsMethod())
              .addMethod(getGetPortalConfigMethod())
              .addMethod(getDeletePortalConfigMethod())
              .addMethod(getUpdatePortalConfigLogoMethod())
              .addMethod(getGetPortalConfigLogoMethod())
              .addMethod(getListPortalLinksMethod())
              .addMethod(getGetPortalLinkMethod())
              .addMethod(getDeletePortalLinkMethod())
              .addMethod(getCreatePortalLinksMethod())
              .addMethod(getUpsertPortalMethod())
              .addMethod(getGetPortalMethod())
              .addMethod(getDeletePortalMethod())
              .addMethod(getListPortalsMethod())
              .addMethod(getListDetailedPortalsMethod())
              .addMethod(getGetDetailedPortalMethod())
              .addMethod(getUpsertPluginInstanceMethod())
              .addMethod(getGetPluginInstanceMethod())
              .addMethod(getDeletePluginInstanceMethod())
              .addMethod(getListPluginInstanceMethod())
              .addMethod(getListFlowFieldNamesMethod())
              .addMethod(getListAvailableVerificationFieldsMethod())
              .addMethod(getListAvailablePaymentFieldsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
