package com.tcn.cloud.api.api.v1alpha1.delivery;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/delivery/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeliveryApiGrpc {

  private DeliveryApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.delivery.DeliveryApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> getCreateTransferConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTransferConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> getCreateTransferConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> getCreateTransferConfigMethod;
    if ((getCreateTransferConfigMethod = DeliveryApiGrpc.getCreateTransferConfigMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getCreateTransferConfigMethod = DeliveryApiGrpc.getCreateTransferConfigMethod) == null) {
          DeliveryApiGrpc.getCreateTransferConfigMethod = getCreateTransferConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTransferConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("CreateTransferConfig"))
              .build();
        }
      }
    }
    return getCreateTransferConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> getListTransferConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransferConfigs",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> getListTransferConfigsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> getListTransferConfigsMethod;
    if ((getListTransferConfigsMethod = DeliveryApiGrpc.getListTransferConfigsMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListTransferConfigsMethod = DeliveryApiGrpc.getListTransferConfigsMethod) == null) {
          DeliveryApiGrpc.getListTransferConfigsMethod = getListTransferConfigsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransferConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListTransferConfigs"))
              .build();
        }
      }
    }
    return getListTransferConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> getListTransferConfigsByCredentialIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTransferConfigsByCredentialID",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> getListTransferConfigsByCredentialIDMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> getListTransferConfigsByCredentialIDMethod;
    if ((getListTransferConfigsByCredentialIDMethod = DeliveryApiGrpc.getListTransferConfigsByCredentialIDMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListTransferConfigsByCredentialIDMethod = DeliveryApiGrpc.getListTransferConfigsByCredentialIDMethod) == null) {
          DeliveryApiGrpc.getListTransferConfigsByCredentialIDMethod = getListTransferConfigsByCredentialIDMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTransferConfigsByCredentialID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListTransferConfigsByCredentialID"))
              .build();
        }
      }
    }
    return getListTransferConfigsByCredentialIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> getUpdateTransferConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransferConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> getUpdateTransferConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> getUpdateTransferConfigMethod;
    if ((getUpdateTransferConfigMethod = DeliveryApiGrpc.getUpdateTransferConfigMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getUpdateTransferConfigMethod = DeliveryApiGrpc.getUpdateTransferConfigMethod) == null) {
          DeliveryApiGrpc.getUpdateTransferConfigMethod = getUpdateTransferConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransferConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("UpdateTransferConfig"))
              .build();
        }
      }
    }
    return getUpdateTransferConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> getDeleteTransferConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTransferConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> getDeleteTransferConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> getDeleteTransferConfigMethod;
    if ((getDeleteTransferConfigMethod = DeliveryApiGrpc.getDeleteTransferConfigMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getDeleteTransferConfigMethod = DeliveryApiGrpc.getDeleteTransferConfigMethod) == null) {
          DeliveryApiGrpc.getDeleteTransferConfigMethod = getDeleteTransferConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTransferConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("DeleteTransferConfig"))
              .build();
        }
      }
    }
    return getDeleteTransferConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> getGetTransferConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransferConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> getGetTransferConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> getGetTransferConfigMethod;
    if ((getGetTransferConfigMethod = DeliveryApiGrpc.getGetTransferConfigMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetTransferConfigMethod = DeliveryApiGrpc.getGetTransferConfigMethod) == null) {
          DeliveryApiGrpc.getGetTransferConfigMethod = getGetTransferConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransferConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetTransferConfig"))
              .build();
        }
      }
    }
    return getGetTransferConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> getGetTransferConfigByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransferConfigByName",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> getGetTransferConfigByNameMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> getGetTransferConfigByNameMethod;
    if ((getGetTransferConfigByNameMethod = DeliveryApiGrpc.getGetTransferConfigByNameMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetTransferConfigByNameMethod = DeliveryApiGrpc.getGetTransferConfigByNameMethod) == null) {
          DeliveryApiGrpc.getGetTransferConfigByNameMethod = getGetTransferConfigByNameMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransferConfigByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetTransferConfigByName"))
              .build();
        }
      }
    }
    return getGetTransferConfigByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> getListHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistory",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> getListHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> getListHistoryMethod;
    if ((getListHistoryMethod = DeliveryApiGrpc.getListHistoryMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListHistoryMethod = DeliveryApiGrpc.getListHistoryMethod) == null) {
          DeliveryApiGrpc.getListHistoryMethod = getListHistoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListHistory"))
              .build();
        }
      }
    }
    return getListHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> getListHistoryByTransferConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistoryByTransferConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> getListHistoryByTransferConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> getListHistoryByTransferConfigMethod;
    if ((getListHistoryByTransferConfigMethod = DeliveryApiGrpc.getListHistoryByTransferConfigMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListHistoryByTransferConfigMethod = DeliveryApiGrpc.getListHistoryByTransferConfigMethod) == null) {
          DeliveryApiGrpc.getListHistoryByTransferConfigMethod = getListHistoryByTransferConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistoryByTransferConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListHistoryByTransferConfig"))
              .build();
        }
      }
    }
    return getListHistoryByTransferConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> getListCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCredentials",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> getListCredentialsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> getListCredentialsMethod;
    if ((getListCredentialsMethod = DeliveryApiGrpc.getListCredentialsMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListCredentialsMethod = DeliveryApiGrpc.getListCredentialsMethod) == null) {
          DeliveryApiGrpc.getListCredentialsMethod = getListCredentialsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListCredentials"))
              .build();
        }
      }
    }
    return getListCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> getGetCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCredential",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> getGetCredentialMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> getGetCredentialMethod;
    if ((getGetCredentialMethod = DeliveryApiGrpc.getGetCredentialMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetCredentialMethod = DeliveryApiGrpc.getGetCredentialMethod) == null) {
          DeliveryApiGrpc.getGetCredentialMethod = getGetCredentialMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetCredential"))
              .build();
        }
      }
    }
    return getGetCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> getCreateCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCredential",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> getCreateCredentialMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> getCreateCredentialMethod;
    if ((getCreateCredentialMethod = DeliveryApiGrpc.getCreateCredentialMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getCreateCredentialMethod = DeliveryApiGrpc.getCreateCredentialMethod) == null) {
          DeliveryApiGrpc.getCreateCredentialMethod = getCreateCredentialMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("CreateCredential"))
              .build();
        }
      }
    }
    return getCreateCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> getDeleteCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCredential",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> getDeleteCredentialMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> getDeleteCredentialMethod;
    if ((getDeleteCredentialMethod = DeliveryApiGrpc.getDeleteCredentialMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getDeleteCredentialMethod = DeliveryApiGrpc.getDeleteCredentialMethod) == null) {
          DeliveryApiGrpc.getDeleteCredentialMethod = getDeleteCredentialMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("DeleteCredential"))
              .build();
        }
      }
    }
    return getDeleteCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> getUpdateCredentialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCredential",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> getUpdateCredentialMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> getUpdateCredentialMethod;
    if ((getUpdateCredentialMethod = DeliveryApiGrpc.getUpdateCredentialMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getUpdateCredentialMethod = DeliveryApiGrpc.getUpdateCredentialMethod) == null) {
          DeliveryApiGrpc.getUpdateCredentialMethod = getUpdateCredentialMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCredential"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("UpdateCredential"))
              .build();
        }
      }
    }
    return getUpdateCredentialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> getCreateDeliveryDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDeliveryDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> getCreateDeliveryDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> getCreateDeliveryDefinitionMethod;
    if ((getCreateDeliveryDefinitionMethod = DeliveryApiGrpc.getCreateDeliveryDefinitionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getCreateDeliveryDefinitionMethod = DeliveryApiGrpc.getCreateDeliveryDefinitionMethod) == null) {
          DeliveryApiGrpc.getCreateDeliveryDefinitionMethod = getCreateDeliveryDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDeliveryDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("CreateDeliveryDefinition"))
              .build();
        }
      }
    }
    return getCreateDeliveryDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> getDeleteDeliveryDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDeliveryDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> getDeleteDeliveryDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> getDeleteDeliveryDefinitionMethod;
    if ((getDeleteDeliveryDefinitionMethod = DeliveryApiGrpc.getDeleteDeliveryDefinitionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getDeleteDeliveryDefinitionMethod = DeliveryApiGrpc.getDeleteDeliveryDefinitionMethod) == null) {
          DeliveryApiGrpc.getDeleteDeliveryDefinitionMethod = getDeleteDeliveryDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDeliveryDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("DeleteDeliveryDefinition"))
              .build();
        }
      }
    }
    return getDeleteDeliveryDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> getGetDeliveryDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeliveryDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> getGetDeliveryDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> getGetDeliveryDefinitionMethod;
    if ((getGetDeliveryDefinitionMethod = DeliveryApiGrpc.getGetDeliveryDefinitionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetDeliveryDefinitionMethod = DeliveryApiGrpc.getGetDeliveryDefinitionMethod) == null) {
          DeliveryApiGrpc.getGetDeliveryDefinitionMethod = getGetDeliveryDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeliveryDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetDeliveryDefinition"))
              .build();
        }
      }
    }
    return getGetDeliveryDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> getGetDeliveryDefinitionByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeliveryDefinitionByName",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> getGetDeliveryDefinitionByNameMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> getGetDeliveryDefinitionByNameMethod;
    if ((getGetDeliveryDefinitionByNameMethod = DeliveryApiGrpc.getGetDeliveryDefinitionByNameMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetDeliveryDefinitionByNameMethod = DeliveryApiGrpc.getGetDeliveryDefinitionByNameMethod) == null) {
          DeliveryApiGrpc.getGetDeliveryDefinitionByNameMethod = getGetDeliveryDefinitionByNameMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeliveryDefinitionByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetDeliveryDefinitionByName"))
              .build();
        }
      }
    }
    return getGetDeliveryDefinitionByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> getListDeliveryDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeliveryDefinitions",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> getListDeliveryDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> getListDeliveryDefinitionsMethod;
    if ((getListDeliveryDefinitionsMethod = DeliveryApiGrpc.getListDeliveryDefinitionsMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListDeliveryDefinitionsMethod = DeliveryApiGrpc.getListDeliveryDefinitionsMethod) == null) {
          DeliveryApiGrpc.getListDeliveryDefinitionsMethod = getListDeliveryDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeliveryDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListDeliveryDefinitions"))
              .build();
        }
      }
    }
    return getListDeliveryDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> getListDeliveryDefinitionsByCredentialIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeliveryDefinitionsByCredentialID",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> getListDeliveryDefinitionsByCredentialIDMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> getListDeliveryDefinitionsByCredentialIDMethod;
    if ((getListDeliveryDefinitionsByCredentialIDMethod = DeliveryApiGrpc.getListDeliveryDefinitionsByCredentialIDMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListDeliveryDefinitionsByCredentialIDMethod = DeliveryApiGrpc.getListDeliveryDefinitionsByCredentialIDMethod) == null) {
          DeliveryApiGrpc.getListDeliveryDefinitionsByCredentialIDMethod = getListDeliveryDefinitionsByCredentialIDMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeliveryDefinitionsByCredentialID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListDeliveryDefinitionsByCredentialID"))
              .build();
        }
      }
    }
    return getListDeliveryDefinitionsByCredentialIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> getUpdateDeliveryDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDeliveryDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> getUpdateDeliveryDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> getUpdateDeliveryDefinitionMethod;
    if ((getUpdateDeliveryDefinitionMethod = DeliveryApiGrpc.getUpdateDeliveryDefinitionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getUpdateDeliveryDefinitionMethod = DeliveryApiGrpc.getUpdateDeliveryDefinitionMethod) == null) {
          DeliveryApiGrpc.getUpdateDeliveryDefinitionMethod = getUpdateDeliveryDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDeliveryDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("UpdateDeliveryDefinition"))
              .build();
        }
      }
    }
    return getUpdateDeliveryDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> getCreateEncryptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEncryption",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> getCreateEncryptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> getCreateEncryptionMethod;
    if ((getCreateEncryptionMethod = DeliveryApiGrpc.getCreateEncryptionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getCreateEncryptionMethod = DeliveryApiGrpc.getCreateEncryptionMethod) == null) {
          DeliveryApiGrpc.getCreateEncryptionMethod = getCreateEncryptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEncryption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("CreateEncryption"))
              .build();
        }
      }
    }
    return getCreateEncryptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> getDeleteEncryptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEncryption",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> getDeleteEncryptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> getDeleteEncryptionMethod;
    if ((getDeleteEncryptionMethod = DeliveryApiGrpc.getDeleteEncryptionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getDeleteEncryptionMethod = DeliveryApiGrpc.getDeleteEncryptionMethod) == null) {
          DeliveryApiGrpc.getDeleteEncryptionMethod = getDeleteEncryptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEncryption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("DeleteEncryption"))
              .build();
        }
      }
    }
    return getDeleteEncryptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> getGetEncryptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEncryption",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> getGetEncryptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> getGetEncryptionMethod;
    if ((getGetEncryptionMethod = DeliveryApiGrpc.getGetEncryptionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getGetEncryptionMethod = DeliveryApiGrpc.getGetEncryptionMethod) == null) {
          DeliveryApiGrpc.getGetEncryptionMethod = getGetEncryptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEncryption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("GetEncryption"))
              .build();
        }
      }
    }
    return getGetEncryptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> getListEncryptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEncryptions",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> getListEncryptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> getListEncryptionsMethod;
    if ((getListEncryptionsMethod = DeliveryApiGrpc.getListEncryptionsMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getListEncryptionsMethod = DeliveryApiGrpc.getListEncryptionsMethod) == null) {
          DeliveryApiGrpc.getListEncryptionsMethod = getListEncryptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq, com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEncryptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("ListEncryptions"))
              .build();
        }
      }
    }
    return getListEncryptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> getUpdateEncryptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEncryption",
      requestType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq,
      com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> getUpdateEncryptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> getUpdateEncryptionMethod;
    if ((getUpdateEncryptionMethod = DeliveryApiGrpc.getUpdateEncryptionMethod) == null) {
      synchronized (DeliveryApiGrpc.class) {
        if ((getUpdateEncryptionMethod = DeliveryApiGrpc.getUpdateEncryptionMethod) == null) {
          DeliveryApiGrpc.getUpdateEncryptionMethod = getUpdateEncryptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq, com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEncryption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryApiMethodDescriptorSupplier("UpdateEncryption"))
              .build();
        }
      }
    }
    return getUpdateEncryptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryApiStub>() {
        @java.lang.Override
        public DeliveryApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryApiStub(channel, callOptions);
        }
      };
    return DeliveryApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryApiBlockingStub>() {
        @java.lang.Override
        public DeliveryApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryApiBlockingStub(channel, callOptions);
        }
      };
    return DeliveryApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryApiFutureStub>() {
        @java.lang.Override
        public DeliveryApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryApiFutureStub(channel, callOptions);
        }
      };
    return DeliveryApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTransferConfigMethod(), responseObserver);
    }

    /**
     */
    default void listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransferConfigsMethod(), responseObserver);
    }

    /**
     */
    default void listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTransferConfigsByCredentialIDMethod(), responseObserver);
    }

    /**
     */
    default void updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTransferConfigMethod(), responseObserver);
    }

    /**
     */
    default void deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTransferConfigMethod(), responseObserver);
    }

    /**
     */
    default void getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransferConfigMethod(), responseObserver);
    }

    /**
     */
    default void getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransferConfigByNameMethod(), responseObserver);
    }

    /**
     */
    default void listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoryMethod(), responseObserver);
    }

    /**
     */
    default void listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoryByTransferConfigMethod(), responseObserver);
    }

    /**
     */
    default void listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCredentialsMethod(), responseObserver);
    }

    /**
     */
    default void getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCredentialMethod(), responseObserver);
    }

    /**
     */
    default void createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCredentialMethod(), responseObserver);
    }

    /**
     */
    default void deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCredentialMethod(), responseObserver);
    }

    /**
     */
    default void updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCredentialMethod(), responseObserver);
    }

    /**
     */
    default void createDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeliveryDefinitionMethod(), responseObserver);
    }

    /**
     */
    default void deleteDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDeliveryDefinitionMethod(), responseObserver);
    }

    /**
     */
    default void getDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeliveryDefinitionMethod(), responseObserver);
    }

    /**
     */
    default void getDeliveryDefinitionByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeliveryDefinitionByNameMethod(), responseObserver);
    }

    /**
     */
    default void listDeliveryDefinitions(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeliveryDefinitionsMethod(), responseObserver);
    }

    /**
     */
    default void listDeliveryDefinitionsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeliveryDefinitionsByCredentialIDMethod(), responseObserver);
    }

    /**
     */
    default void updateDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeliveryDefinitionMethod(), responseObserver);
    }

    /**
     */
    default void createEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEncryptionMethod(), responseObserver);
    }

    /**
     */
    default void deleteEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEncryptionMethod(), responseObserver);
    }

    /**
     */
    default void getEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEncryptionMethod(), responseObserver);
    }

    /**
     */
    default void listEncryptions(com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEncryptionsMethod(), responseObserver);
    }

    /**
     */
    default void updateEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEncryptionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeliveryApi.
   */
  public static abstract class DeliveryApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeliveryApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeliveryApi.
   */
  public static final class DeliveryApiStub
      extends io.grpc.stub.AbstractAsyncStub<DeliveryApiStub> {
    private DeliveryApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryApiStub(channel, callOptions);
    }

    /**
     */
    public void createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransferConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTransferConfigsByCredentialIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransferConfigByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoryByTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeliveryDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeliveryDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeliveryDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeliveryDefinitionByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeliveryDefinitionByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDeliveryDefinitions(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeliveryDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDeliveryDefinitionsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeliveryDefinitionsByCredentialIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeliveryDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEncryptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEncryptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEncryptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEncryptions(com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEncryptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEncryptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeliveryApi.
   */
  public static final class DeliveryApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeliveryApiBlockingStub> {
    private DeliveryApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransferConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTransferConfigsByCredentialIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransferConfigByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoryByTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCredentialsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes createDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeliveryDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes deleteDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeliveryDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes getDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeliveryDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes getDeliveryDefinitionByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeliveryDefinitionByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes listDeliveryDefinitions(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveryDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes listDeliveryDefinitionsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveryDefinitionsByCredentialIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes updateDeliveryDefinition(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeliveryDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes createEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEncryptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes deleteEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEncryptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes getEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEncryptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes listEncryptions(com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEncryptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes updateEncryption(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEncryptionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeliveryApi.
   */
  public static final class DeliveryApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeliveryApiFutureStub> {
    private DeliveryApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> createTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> listTransferConfigs(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransferConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> listTransferConfigsByCredentialID(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTransferConfigsByCredentialIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> updateTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> deleteTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> getTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> getTransferConfigByName(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransferConfigByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> listHistory(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> listHistoryByTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoryByTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> listCredentials(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> getCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> createCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> deleteCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> updateCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes> createDeliveryDefinition(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeliveryDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes> deleteDeliveryDefinition(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeliveryDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes> getDeliveryDefinition(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeliveryDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes> getDeliveryDefinitionByName(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeliveryDefinitionByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes> listDeliveryDefinitions(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeliveryDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes> listDeliveryDefinitionsByCredentialID(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeliveryDefinitionsByCredentialIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes> updateDeliveryDefinition(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeliveryDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes> createEncryption(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEncryptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes> deleteEncryption(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEncryptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes> getEncryption(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEncryptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes> listEncryptions(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEncryptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes> updateEncryption(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEncryptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRANSFER_CONFIG = 0;
  private static final int METHODID_LIST_TRANSFER_CONFIGS = 1;
  private static final int METHODID_LIST_TRANSFER_CONFIGS_BY_CREDENTIAL_ID = 2;
  private static final int METHODID_UPDATE_TRANSFER_CONFIG = 3;
  private static final int METHODID_DELETE_TRANSFER_CONFIG = 4;
  private static final int METHODID_GET_TRANSFER_CONFIG = 5;
  private static final int METHODID_GET_TRANSFER_CONFIG_BY_NAME = 6;
  private static final int METHODID_LIST_HISTORY = 7;
  private static final int METHODID_LIST_HISTORY_BY_TRANSFER_CONFIG = 8;
  private static final int METHODID_LIST_CREDENTIALS = 9;
  private static final int METHODID_GET_CREDENTIAL = 10;
  private static final int METHODID_CREATE_CREDENTIAL = 11;
  private static final int METHODID_DELETE_CREDENTIAL = 12;
  private static final int METHODID_UPDATE_CREDENTIAL = 13;
  private static final int METHODID_CREATE_DELIVERY_DEFINITION = 14;
  private static final int METHODID_DELETE_DELIVERY_DEFINITION = 15;
  private static final int METHODID_GET_DELIVERY_DEFINITION = 16;
  private static final int METHODID_GET_DELIVERY_DEFINITION_BY_NAME = 17;
  private static final int METHODID_LIST_DELIVERY_DEFINITIONS = 18;
  private static final int METHODID_LIST_DELIVERY_DEFINITIONS_BY_CREDENTIAL_ID = 19;
  private static final int METHODID_UPDATE_DELIVERY_DEFINITION = 20;
  private static final int METHODID_CREATE_ENCRYPTION = 21;
  private static final int METHODID_DELETE_ENCRYPTION = 22;
  private static final int METHODID_GET_ENCRYPTION = 23;
  private static final int METHODID_LIST_ENCRYPTIONS = 24;
  private static final int METHODID_UPDATE_ENCRYPTION = 25;

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
        case METHODID_CREATE_TRANSFER_CONFIG:
          serviceImpl.createTransferConfig((com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_CONFIGS:
          serviceImpl.listTransferConfigs((com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes>) responseObserver);
          break;
        case METHODID_LIST_TRANSFER_CONFIGS_BY_CREDENTIAL_ID:
          serviceImpl.listTransferConfigsByCredentialID((com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSFER_CONFIG:
          serviceImpl.updateTransferConfig((com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes>) responseObserver);
          break;
        case METHODID_DELETE_TRANSFER_CONFIG:
          serviceImpl.deleteTransferConfig((com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_CONFIG:
          serviceImpl.getTransferConfig((com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes>) responseObserver);
          break;
        case METHODID_GET_TRANSFER_CONFIG_BY_NAME:
          serviceImpl.getTransferConfigByName((com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes>) responseObserver);
          break;
        case METHODID_LIST_HISTORY:
          serviceImpl.listHistory((com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes>) responseObserver);
          break;
        case METHODID_LIST_HISTORY_BY_TRANSFER_CONFIG:
          serviceImpl.listHistoryByTransferConfig((com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes>) responseObserver);
          break;
        case METHODID_LIST_CREDENTIALS:
          serviceImpl.listCredentials((com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes>) responseObserver);
          break;
        case METHODID_GET_CREDENTIAL:
          serviceImpl.getCredential((com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes>) responseObserver);
          break;
        case METHODID_CREATE_CREDENTIAL:
          serviceImpl.createCredential((com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes>) responseObserver);
          break;
        case METHODID_DELETE_CREDENTIAL:
          serviceImpl.deleteCredential((com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes>) responseObserver);
          break;
        case METHODID_UPDATE_CREDENTIAL:
          serviceImpl.updateCredential((com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes>) responseObserver);
          break;
        case METHODID_CREATE_DELIVERY_DEFINITION:
          serviceImpl.createDeliveryDefinition((com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes>) responseObserver);
          break;
        case METHODID_DELETE_DELIVERY_DEFINITION:
          serviceImpl.deleteDeliveryDefinition((com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes>) responseObserver);
          break;
        case METHODID_GET_DELIVERY_DEFINITION:
          serviceImpl.getDeliveryDefinition((com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes>) responseObserver);
          break;
        case METHODID_GET_DELIVERY_DEFINITION_BY_NAME:
          serviceImpl.getDeliveryDefinitionByName((com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes>) responseObserver);
          break;
        case METHODID_LIST_DELIVERY_DEFINITIONS:
          serviceImpl.listDeliveryDefinitions((com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes>) responseObserver);
          break;
        case METHODID_LIST_DELIVERY_DEFINITIONS_BY_CREDENTIAL_ID:
          serviceImpl.listDeliveryDefinitionsByCredentialID((com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes>) responseObserver);
          break;
        case METHODID_UPDATE_DELIVERY_DEFINITION:
          serviceImpl.updateDeliveryDefinition((com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes>) responseObserver);
          break;
        case METHODID_CREATE_ENCRYPTION:
          serviceImpl.createEncryption((com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes>) responseObserver);
          break;
        case METHODID_DELETE_ENCRYPTION:
          serviceImpl.deleteEncryption((com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes>) responseObserver);
          break;
        case METHODID_GET_ENCRYPTION:
          serviceImpl.getEncryption((com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes>) responseObserver);
          break;
        case METHODID_LIST_ENCRYPTIONS:
          serviceImpl.listEncryptions((com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes>) responseObserver);
          break;
        case METHODID_UPDATE_ENCRYPTION:
          serviceImpl.updateEncryption((com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes>) responseObserver);
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
          getCreateTransferConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes>(
                service, METHODID_CREATE_TRANSFER_CONFIG)))
        .addMethod(
          getListTransferConfigsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes>(
                service, METHODID_LIST_TRANSFER_CONFIGS)))
        .addMethod(
          getListTransferConfigsByCredentialIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes>(
                service, METHODID_LIST_TRANSFER_CONFIGS_BY_CREDENTIAL_ID)))
        .addMethod(
          getUpdateTransferConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes>(
                service, METHODID_UPDATE_TRANSFER_CONFIG)))
        .addMethod(
          getDeleteTransferConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes>(
                service, METHODID_DELETE_TRANSFER_CONFIG)))
        .addMethod(
          getGetTransferConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes>(
                service, METHODID_GET_TRANSFER_CONFIG)))
        .addMethod(
          getGetTransferConfigByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes>(
                service, METHODID_GET_TRANSFER_CONFIG_BY_NAME)))
        .addMethod(
          getListHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes>(
                service, METHODID_LIST_HISTORY)))
        .addMethod(
          getListHistoryByTransferConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes>(
                service, METHODID_LIST_HISTORY_BY_TRANSFER_CONFIG)))
        .addMethod(
          getListCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes>(
                service, METHODID_LIST_CREDENTIALS)))
        .addMethod(
          getGetCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes>(
                service, METHODID_GET_CREDENTIAL)))
        .addMethod(
          getCreateCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes>(
                service, METHODID_CREATE_CREDENTIAL)))
        .addMethod(
          getDeleteCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes>(
                service, METHODID_DELETE_CREDENTIAL)))
        .addMethod(
          getUpdateCredentialMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes>(
                service, METHODID_UPDATE_CREDENTIAL)))
        .addMethod(
          getCreateDeliveryDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateDeliveryDefinitionRes>(
                service, METHODID_CREATE_DELIVERY_DEFINITION)))
        .addMethod(
          getDeleteDeliveryDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteDeliveryDefinitionRes>(
                service, METHODID_DELETE_DELIVERY_DEFINITION)))
        .addMethod(
          getGetDeliveryDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionRes>(
                service, METHODID_GET_DELIVERY_DEFINITION)))
        .addMethod(
          getGetDeliveryDefinitionByNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameRes>(
                service, METHODID_GET_DELIVERY_DEFINITION_BY_NAME)))
        .addMethod(
          getListDeliveryDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsRes>(
                service, METHODID_LIST_DELIVERY_DEFINITIONS)))
        .addMethod(
          getListDeliveryDefinitionsByCredentialIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListDeliveryDefinitionsByCredentialIDRes>(
                service, METHODID_LIST_DELIVERY_DEFINITIONS_BY_CREDENTIAL_ID)))
        .addMethod(
          getUpdateDeliveryDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateDeliveryDefinitionRes>(
                service, METHODID_UPDATE_DELIVERY_DEFINITION)))
        .addMethod(
          getCreateEncryptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.CreateEncryptionRes>(
                service, METHODID_CREATE_ENCRYPTION)))
        .addMethod(
          getDeleteEncryptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.DeleteEncryptionRes>(
                service, METHODID_DELETE_ENCRYPTION)))
        .addMethod(
          getGetEncryptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.GetEncryptionRes>(
                service, METHODID_GET_ENCRYPTION)))
        .addMethod(
          getListEncryptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.ListEncryptionsRes>(
                service, METHODID_LIST_ENCRYPTIONS)))
        .addMethod(
          getUpdateEncryptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionReq,
              com.tcn.cloud.api.api.v1alpha1.delivery.UpdateEncryptionRes>(
                service, METHODID_UPDATE_ENCRYPTION)))
        .build();
  }

  private static abstract class DeliveryApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeliveryApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeliveryApi");
    }
  }

  private static final class DeliveryApiFileDescriptorSupplier
      extends DeliveryApiBaseDescriptorSupplier {
    DeliveryApiFileDescriptorSupplier() {}
  }

  private static final class DeliveryApiMethodDescriptorSupplier
      extends DeliveryApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DeliveryApiMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DeliveryApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeliveryApiFileDescriptorSupplier())
              .addMethod(getCreateTransferConfigMethod())
              .addMethod(getListTransferConfigsMethod())
              .addMethod(getListTransferConfigsByCredentialIDMethod())
              .addMethod(getUpdateTransferConfigMethod())
              .addMethod(getDeleteTransferConfigMethod())
              .addMethod(getGetTransferConfigMethod())
              .addMethod(getGetTransferConfigByNameMethod())
              .addMethod(getListHistoryMethod())
              .addMethod(getListHistoryByTransferConfigMethod())
              .addMethod(getListCredentialsMethod())
              .addMethod(getGetCredentialMethod())
              .addMethod(getCreateCredentialMethod())
              .addMethod(getDeleteCredentialMethod())
              .addMethod(getUpdateCredentialMethod())
              .addMethod(getCreateDeliveryDefinitionMethod())
              .addMethod(getDeleteDeliveryDefinitionMethod())
              .addMethod(getGetDeliveryDefinitionMethod())
              .addMethod(getGetDeliveryDefinitionByNameMethod())
              .addMethod(getListDeliveryDefinitionsMethod())
              .addMethod(getListDeliveryDefinitionsByCredentialIDMethod())
              .addMethod(getUpdateDeliveryDefinitionMethod())
              .addMethod(getCreateEncryptionMethod())
              .addMethod(getDeleteEncryptionMethod())
              .addMethod(getGetEncryptionMethod())
              .addMethod(getListEncryptionsMethod())
              .addMethod(getUpdateEncryptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
