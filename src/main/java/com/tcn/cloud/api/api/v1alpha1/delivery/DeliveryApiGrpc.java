package com.tcn.cloud.api.api.v1alpha1.delivery;

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
    comments = "Source: api/v1alpha1/delivery/service.proto")
public final class DeliveryApiGrpc {

  private DeliveryApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.delivery.DeliveryApi";

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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "CreateTransferConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "ListTransferConfigs"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "ListTransferConfigsByCredentialID"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "UpdateTransferConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "DeleteTransferConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "GetTransferConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "GetTransferConfigByName"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "ListHistory"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "ListHistoryByTransferConfig"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "ListCredentials"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "GetCredential"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "CreateCredential"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "DeleteCredential"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.delivery.DeliveryApi", "UpdateCredential"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryApiStub newStub(io.grpc.Channel channel) {
    return new DeliveryApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeliveryApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeliveryApiFutureStub(channel);
  }

  /**
   */
  public static abstract class DeliveryApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTransferConfigMethod(), responseObserver);
    }

    /**
     */
    public void listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTransferConfigsMethod(), responseObserver);
    }

    /**
     */
    public void listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTransferConfigsByCredentialIDMethod(), responseObserver);
    }

    /**
     */
    public void updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTransferConfigMethod(), responseObserver);
    }

    /**
     */
    public void deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTransferConfigMethod(), responseObserver);
    }

    /**
     */
    public void getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransferConfigMethod(), responseObserver);
    }

    /**
     */
    public void getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransferConfigByNameMethod(), responseObserver);
    }

    /**
     */
    public void listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHistoryMethod(), responseObserver);
    }

    /**
     */
    public void listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHistoryByTransferConfigMethod(), responseObserver);
    }

    /**
     */
    public void listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCredentialsMethod(), responseObserver);
    }

    /**
     */
    public void getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCredentialMethod(), responseObserver);
    }

    /**
     */
    public void createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCredentialMethod(), responseObserver);
    }

    /**
     */
    public void deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCredentialMethod(), responseObserver);
    }

    /**
     */
    public void updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCredentialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTransferConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes>(
                  this, METHODID_CREATE_TRANSFER_CONFIG)))
          .addMethod(
            getListTransferConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes>(
                  this, METHODID_LIST_TRANSFER_CONFIGS)))
          .addMethod(
            getListTransferConfigsByCredentialIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes>(
                  this, METHODID_LIST_TRANSFER_CONFIGS_BY_CREDENTIAL_ID)))
          .addMethod(
            getUpdateTransferConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes>(
                  this, METHODID_UPDATE_TRANSFER_CONFIG)))
          .addMethod(
            getDeleteTransferConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes>(
                  this, METHODID_DELETE_TRANSFER_CONFIG)))
          .addMethod(
            getGetTransferConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes>(
                  this, METHODID_GET_TRANSFER_CONFIG)))
          .addMethod(
            getGetTransferConfigByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes>(
                  this, METHODID_GET_TRANSFER_CONFIG_BY_NAME)))
          .addMethod(
            getListHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes>(
                  this, METHODID_LIST_HISTORY)))
          .addMethod(
            getListHistoryByTransferConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes>(
                  this, METHODID_LIST_HISTORY_BY_TRANSFER_CONFIG)))
          .addMethod(
            getListCredentialsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes>(
                  this, METHODID_LIST_CREDENTIALS)))
          .addMethod(
            getGetCredentialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes>(
                  this, METHODID_GET_CREDENTIAL)))
          .addMethod(
            getCreateCredentialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes>(
                  this, METHODID_CREATE_CREDENTIAL)))
          .addMethod(
            getDeleteCredentialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes>(
                  this, METHODID_DELETE_CREDENTIAL)))
          .addMethod(
            getUpdateCredentialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq,
                com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes>(
                  this, METHODID_UPDATE_CREDENTIAL)))
          .build();
    }
  }

  /**
   */
  public static final class DeliveryApiStub extends io.grpc.stub.AbstractStub<DeliveryApiStub> {
    private DeliveryApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeliveryApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeliveryApiStub(channel, callOptions);
    }

    /**
     */
    public void createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTransferConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTransferConfigsByCredentialIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransferConfigByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHistoryByTransferConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeliveryApiBlockingStub extends io.grpc.stub.AbstractStub<DeliveryApiBlockingStub> {
    private DeliveryApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeliveryApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeliveryApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes createTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes listTransferConfigs(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request) {
      return blockingUnaryCall(
          getChannel(), getListTransferConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes listTransferConfigsByCredentialID(com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request) {
      return blockingUnaryCall(
          getChannel(), getListTransferConfigsByCredentialIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes updateTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes deleteTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes getTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getGetTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes getTransferConfigByName(com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request) {
      return blockingUnaryCall(
          getChannel(), getGetTransferConfigByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes listHistory(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request) {
      return blockingUnaryCall(
          getChannel(), getListHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes listHistoryByTransferConfig(com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request) {
      return blockingUnaryCall(
          getChannel(), getListHistoryByTransferConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes listCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request) {
      return blockingUnaryCall(
          getChannel(), getListCredentialsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes getCredential(com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes createCredential(com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes deleteCredential(com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCredentialMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes updateCredential(com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCredentialMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeliveryApiFutureStub extends io.grpc.stub.AbstractStub<DeliveryApiFutureStub> {
    private DeliveryApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeliveryApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeliveryApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigRes> createTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateTransferConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsRes> listTransferConfigs(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTransferConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDRes> listTransferConfigsByCredentialID(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListTransferConfigsByCredentialIDReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTransferConfigsByCredentialIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigRes> updateTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateTransferConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigRes> deleteTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteTransferConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigRes> getTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameRes> getTransferConfigByName(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetTransferConfigByNameReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransferConfigByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryRes> listHistory(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigRes> listHistoryByTransferConfig(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListHistoryByTransferConfigReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHistoryByTransferConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes> listCredentials(
        com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCredentialsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialRes> getCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.GetCredentialReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialRes> createCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.CreateCredentialReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialRes> deleteCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeleteCredentialReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialRes> updateCredential(
        com.tcn.cloud.api.api.v1alpha1.delivery.UpdateCredentialReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()), request);
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

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeliveryApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeliveryApiImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    DeliveryApiMethodDescriptorSupplier(String methodName) {
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
              .build();
        }
      }
    }
    return result;
  }
}
