package com.tcn.cloud.api.api.v1alpha1.integrations;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/integrations/portals.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PortalManagerApiGrpc {

  private PortalManagerApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.integrations.PortalManagerApi";

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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertPortalConfig"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPortalConfigs"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalConfig"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortalConfig"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePortalConfigLogo"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalConfigLogo"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPortalLinks"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortalLink"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortalLink"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePortalLinks"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertPortal"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortal"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePortal"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPortals"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDetailedPortals"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDetailedPortal"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertPluginInstance"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPluginInstance"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePluginInstance"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPluginInstance"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlowFieldNames"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableVerificationFields"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailablePaymentFields"))
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> getListPortalTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPortalTypes",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> getListPortalTypesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> getListPortalTypesMethod;
    if ((getListPortalTypesMethod = PortalManagerApiGrpc.getListPortalTypesMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListPortalTypesMethod = PortalManagerApiGrpc.getListPortalTypesMethod) == null) {
          PortalManagerApiGrpc.getListPortalTypesMethod = getListPortalTypesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPortalTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListPortalTypes"))
              .build();
        }
      }
    }
    return getListPortalTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> getListFlowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlows",
      requestType = com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq,
      com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> getListFlowsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> getListFlowsMethod;
    if ((getListFlowsMethod = PortalManagerApiGrpc.getListFlowsMethod) == null) {
      synchronized (PortalManagerApiGrpc.class) {
        if ((getListFlowsMethod = PortalManagerApiGrpc.getListFlowsMethod) == null) {
          PortalManagerApiGrpc.getListFlowsMethod = getListFlowsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq, com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PortalManagerApiMethodDescriptorSupplier("ListFlows"))
              .build();
        }
      }
    }
    return getListFlowsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortalManagerApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiStub>() {
        @java.lang.Override
        public PortalManagerApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortalManagerApiStub(channel, callOptions);
        }
      };
    return PortalManagerApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortalManagerApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiBlockingStub>() {
        @java.lang.Override
        public PortalManagerApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortalManagerApiBlockingStub(channel, callOptions);
        }
      };
    return PortalManagerApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortalManagerApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PortalManagerApiFutureStub>() {
        @java.lang.Override
        public PortalManagerApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PortalManagerApiFutureStub(channel, callOptions);
        }
      };
    return PortalManagerApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertPortalConfigMethod(), responseObserver);
    }

    /**
     */
    default void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortalConfigsMethod(), responseObserver);
    }

    /**
     */
    default void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalConfigMethod(), responseObserver);
    }

    /**
     */
    default void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalConfigMethod(), responseObserver);
    }

    /**
     */
    default void updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortalConfigLogoMethod(), responseObserver);
    }

    /**
     */
    default void getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalConfigLogoMethod(), responseObserver);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    default void listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortalLinksMethod(), responseObserver);
    }

    /**
     */
    default void getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalLinkMethod(), responseObserver);
    }

    /**
     */
    default void deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalLinkMethod(), responseObserver);
    }

    /**
     */
    default void createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePortalLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    default void upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertPortalMethod(), responseObserver);
    }

    /**
     */
    default void getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortalMethod(), responseObserver);
    }

    /**
     */
    default void deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortalMethod(), responseObserver);
    }

    /**
     */
    default void listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortalsMethod(), responseObserver);
    }

    /**
     */
    default void listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDetailedPortalsMethod(), responseObserver);
    }

    /**
     */
    default void getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDetailedPortalMethod(), responseObserver);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    default void upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    default void getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    default void deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePluginInstanceMethod(), responseObserver);
    }

    /**
     */
    default void listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPluginInstanceMethod(), responseObserver);
    }

    /**
     */
    default void listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlowFieldNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    default void listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableVerificationFieldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    default void listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailablePaymentFieldsMethod(), responseObserver);
    }

    /**
     */
    default void listPortalTypes(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortalTypesMethod(), responseObserver);
    }

    /**
     */
    default void listFlows(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlowsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PortalManagerApi.
   */
  public static abstract class PortalManagerApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PortalManagerApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PortalManagerApi.
   */
  public static final class PortalManagerApiStub
      extends io.grpc.stub.AbstractAsyncStub<PortalManagerApiStub> {
    private PortalManagerApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortalManagerApiStub(channel, callOptions);
    }

    /**
     */
    public void upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertPortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortalConfigLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalConfigLogoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public void listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePortalLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public void upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDetailedPortalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDetailedPortalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public void upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPluginInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlowFieldNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public void listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableVerificationFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public void listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailablePaymentFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPortalTypes(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortalTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlows(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlowsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PortalManagerApi.
   */
  public static final class PortalManagerApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PortalManagerApiBlockingStub> {
    private PortalManagerApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortalManagerApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes upsertPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes listPortalConfigs(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortalConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes getPortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes deletePortalConfig(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes updatePortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortalConfigLogoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes getPortalConfigLogo(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalConfigLogoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes listPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortalLinksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes getPortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes deletePortalLink(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes createPortalLinks(com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePortalLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes upsertPortal(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertPortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes getPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes deletePortal(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortalMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes listPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes listDetailedPortals(com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDetailedPortalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes getDetailedPortal(com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDetailedPortalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes upsertPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes getPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes deletePluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes listPluginInstance(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPluginInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes listFlowFieldNames(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlowFieldNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes listAvailableVerificationFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableVerificationFieldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes listAvailablePaymentFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailablePaymentFieldsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse listPortalTypes(com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortalTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse listFlows(com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlowsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PortalManagerApi.
   */
  public static final class PortalManagerApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<PortalManagerApiFutureStub> {
    private PortalManagerApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortalManagerApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PortalManagerApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes> upsertPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertPortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes> listPortalConfigs(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortalConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes> getPortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes> deletePortalConfig(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes> updatePortalConfigLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortalConfigLogoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes> getPortalConfigLogo(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalConfigLogoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * portal links
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes> listPortalLinks(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortalLinksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes> getPortalLink(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes> deletePortalLink(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes> createPortalLinks(
        com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePortalLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * portals
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes> upsertPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertPortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes> getPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes> deletePortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes> listPortals(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes> listDetailedPortals(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDetailedPortalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes> getDetailedPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDetailedPortalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PluginInstances
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes> upsertPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes> getPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes> deletePluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes> listPluginInstance(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPluginInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes> listFlowFieldNames(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlowFieldNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns the default form fields for verification flow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes> listAvailableVerificationFields(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableVerificationFieldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns the default form fields for payment flow
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes> listAvailablePaymentFields(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailablePaymentFieldsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse> listPortalTypes(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortalTypesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse> listFlows(
        com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlowsMethod(), getCallOptions()), request);
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
  private static final int METHODID_LIST_PORTAL_TYPES = 23;
  private static final int METHODID_LIST_FLOWS = 24;

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
        case METHODID_LIST_PORTAL_TYPES:
          serviceImpl.listPortalTypes((com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse>) responseObserver);
          break;
        case METHODID_LIST_FLOWS:
          serviceImpl.listFlows((com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse>) responseObserver);
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
          getUpsertPortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalConfigRes>(
                service, METHODID_UPSERT_PORTAL_CONFIG)))
        .addMethod(
          getListPortalConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalConfigsRes>(
                service, METHODID_LIST_PORTAL_CONFIGS)))
        .addMethod(
          getGetPortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes>(
                service, METHODID_GET_PORTAL_CONFIG)))
        .addMethod(
          getDeletePortalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalConfigRes>(
                service, METHODID_DELETE_PORTAL_CONFIG)))
        .addMethod(
          getUpdatePortalConfigLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.UpdatePortalConfigLogoRes>(
                service, METHODID_UPDATE_PORTAL_CONFIG_LOGO)))
        .addMethod(
          getGetPortalConfigLogoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigLogoRes>(
                service, METHODID_GET_PORTAL_CONFIG_LOGO)))
        .addMethod(
          getListPortalLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalLinksRes>(
                service, METHODID_LIST_PORTAL_LINKS)))
        .addMethod(
          getGetPortalLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalLinkRes>(
                service, METHODID_GET_PORTAL_LINK)))
        .addMethod(
          getDeletePortalLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalLinkRes>(
                service, METHODID_DELETE_PORTAL_LINK)))
        .addMethod(
          getCreatePortalLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.CreatePortalLinksRes>(
                service, METHODID_CREATE_PORTAL_LINKS)))
        .addMethod(
          getUpsertPortalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPortalRes>(
                service, METHODID_UPSERT_PORTAL)))
        .addMethod(
          getGetPortalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalRes>(
                service, METHODID_GET_PORTAL)))
        .addMethod(
          getDeletePortalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePortalRes>(
                service, METHODID_DELETE_PORTAL)))
        .addMethod(
          getListPortalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalsRes>(
                service, METHODID_LIST_PORTALS)))
        .addMethod(
          getListDetailedPortalsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListDetailedPortalsRes>(
                service, METHODID_LIST_DETAILED_PORTALS)))
        .addMethod(
          getGetDetailedPortalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetDetailedPortalRes>(
                service, METHODID_GET_DETAILED_PORTAL)))
        .addMethod(
          getUpsertPluginInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.UpsertPluginInstanceRes>(
                service, METHODID_UPSERT_PLUGIN_INSTANCE)))
        .addMethod(
          getGetPluginInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPluginInstanceRes>(
                service, METHODID_GET_PLUGIN_INSTANCE)))
        .addMethod(
          getDeletePluginInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.DeletePluginInstanceRes>(
                service, METHODID_DELETE_PLUGIN_INSTANCE)))
        .addMethod(
          getListPluginInstanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginInstanceRes>(
                service, METHODID_LIST_PLUGIN_INSTANCE)))
        .addMethod(
          getListFlowFieldNamesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowFieldNamesRes>(
                service, METHODID_LIST_FLOW_FIELD_NAMES)))
        .addMethod(
          getListAvailableVerificationFieldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes>(
                service, METHODID_LIST_AVAILABLE_VERIFICATION_FIELDS)))
        .addMethod(
          getListAvailablePaymentFieldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailablePaymentFieldsRes>(
                service, METHODID_LIST_AVAILABLE_PAYMENT_FIELDS)))
        .addMethod(
          getListPortalTypesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPortalTypesResponse>(
                service, METHODID_LIST_PORTAL_TYPES)))
        .addMethod(
          getListFlowsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsReq,
              com.tcn.cloud.api.api.v1alpha1.integrations.ListFlowsResponse>(
                service, METHODID_LIST_FLOWS)))
        .build();
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
    private final java.lang.String methodName;

    PortalManagerApiMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getListPortalTypesMethod())
              .addMethod(getListFlowsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
