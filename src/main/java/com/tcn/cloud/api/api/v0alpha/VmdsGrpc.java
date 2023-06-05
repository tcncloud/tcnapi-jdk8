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
    comments = "Source: api/v0alpha/vmds.proto")
public final class VmdsGrpc {

  private VmdsGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Vmds";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq,
      com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> getGetVoicemailMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoicemailMetadata",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq,
      com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> getGetVoicemailMetadataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq, com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> getGetVoicemailMetadataMethod;
    if ((getGetVoicemailMetadataMethod = VmdsGrpc.getGetVoicemailMetadataMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getGetVoicemailMetadataMethod = VmdsGrpc.getGetVoicemailMetadataMethod) == null) {
          VmdsGrpc.getGetVoicemailMetadataMethod = getGetVoicemailMetadataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq, com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "GetVoicemailMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("GetVoicemailMetadata"))
                  .build();
          }
        }
     }
     return getGetVoicemailMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq,
      com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> getGetVoicemailMessageCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoicemailMessageCount",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq,
      com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> getGetVoicemailMessageCountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq, com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> getGetVoicemailMessageCountMethod;
    if ((getGetVoicemailMessageCountMethod = VmdsGrpc.getGetVoicemailMessageCountMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getGetVoicemailMessageCountMethod = VmdsGrpc.getGetVoicemailMessageCountMethod) == null) {
          VmdsGrpc.getGetVoicemailMessageCountMethod = getGetVoicemailMessageCountMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq, com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "GetVoicemailMessageCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("GetVoicemailMessageCount"))
                  .build();
          }
        }
     }
     return getGetVoicemailMessageCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq,
      com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> getDeleteVoicemailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVoicemail",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq,
      com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> getDeleteVoicemailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq, com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> getDeleteVoicemailMethod;
    if ((getDeleteVoicemailMethod = VmdsGrpc.getDeleteVoicemailMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDeleteVoicemailMethod = VmdsGrpc.getDeleteVoicemailMethod) == null) {
          VmdsGrpc.getDeleteVoicemailMethod = getDeleteVoicemailMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq, com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DeleteVoicemail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DeleteVoicemail"))
                  .build();
          }
        }
     }
     return getDeleteVoicemailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq,
      com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> getDeleteGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGreeting",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq,
      com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> getDeleteGreetingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq, com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> getDeleteGreetingMethod;
    if ((getDeleteGreetingMethod = VmdsGrpc.getDeleteGreetingMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDeleteGreetingMethod = VmdsGrpc.getDeleteGreetingMethod) == null) {
          VmdsGrpc.getDeleteGreetingMethod = getDeleteGreetingMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq, com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DeleteGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DeleteGreeting"))
                  .build();
          }
        }
     }
     return getDeleteGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq,
      com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> getUpdateUploadNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUploadName",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq,
      com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> getUpdateUploadNameMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq, com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> getUpdateUploadNameMethod;
    if ((getUpdateUploadNameMethod = VmdsGrpc.getUpdateUploadNameMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getUpdateUploadNameMethod = VmdsGrpc.getUpdateUploadNameMethod) == null) {
          VmdsGrpc.getUpdateUploadNameMethod = getUpdateUploadNameMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq, com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "UpdateUploadName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("UpdateUploadName"))
                  .build();
          }
        }
     }
     return getUpdateUploadNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq,
      com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> getUpdateVoicemailFlagReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVoicemailFlagRead",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq,
      com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> getUpdateVoicemailFlagReadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq, com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> getUpdateVoicemailFlagReadMethod;
    if ((getUpdateVoicemailFlagReadMethod = VmdsGrpc.getUpdateVoicemailFlagReadMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getUpdateVoicemailFlagReadMethod = VmdsGrpc.getUpdateVoicemailFlagReadMethod) == null) {
          VmdsGrpc.getUpdateVoicemailFlagReadMethod = getUpdateVoicemailFlagReadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq, com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "UpdateVoicemailFlagRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("UpdateVoicemailFlagRead"))
                  .build();
          }
        }
     }
     return getUpdateVoicemailFlagReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessageReq,
      com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> getDownloadMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadMessageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadMessageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessageReq,
      com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> getDownloadMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessageReq, com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> getDownloadMessageMethod;
    if ((getDownloadMessageMethod = VmdsGrpc.getDownloadMessageMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDownloadMessageMethod = VmdsGrpc.getDownloadMessageMethod) == null) {
          VmdsGrpc.getDownloadMessageMethod = getDownloadMessageMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadMessageReq, com.tcn.cloud.api.api.v0alpha.DownloadMessageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DownloadMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadMessageRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DownloadMessage"))
                  .build();
          }
        }
     }
     return getDownloadMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq,
      com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> getDownloadMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadMessages",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq,
      com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> getDownloadMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq, com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> getDownloadMessagesMethod;
    if ((getDownloadMessagesMethod = VmdsGrpc.getDownloadMessagesMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDownloadMessagesMethod = VmdsGrpc.getDownloadMessagesMethod) == null) {
          VmdsGrpc.getDownloadMessagesMethod = getDownloadMessagesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq, com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DownloadMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DownloadMessages"))
                  .build();
          }
        }
     }
     return getDownloadMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq,
      com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> getDownloadGreetingForExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadGreetingForExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq,
      com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> getDownloadGreetingForExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq, com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> getDownloadGreetingForExtensionMethod;
    if ((getDownloadGreetingForExtensionMethod = VmdsGrpc.getDownloadGreetingForExtensionMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDownloadGreetingForExtensionMethod = VmdsGrpc.getDownloadGreetingForExtensionMethod) == null) {
          VmdsGrpc.getDownloadGreetingForExtensionMethod = getDownloadGreetingForExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq, com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DownloadGreetingForExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DownloadGreetingForExtension"))
                  .build();
          }
        }
     }
     return getDownloadGreetingForExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq,
      com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> getDownloadGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadGreeting",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq,
      com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> getDownloadGreetingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq, com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> getDownloadGreetingMethod;
    if ((getDownloadGreetingMethod = VmdsGrpc.getDownloadGreetingMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getDownloadGreetingMethod = VmdsGrpc.getDownloadGreetingMethod) == null) {
          VmdsGrpc.getDownloadGreetingMethod = getDownloadGreetingMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq, com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "DownloadGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("DownloadGreeting"))
                  .build();
          }
        }
     }
     return getDownloadGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> getGetUploadGreetingUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadGreetingUrl",
      requestType = com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq,
      com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> getGetUploadGreetingUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq, com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> getGetUploadGreetingUrlMethod;
    if ((getGetUploadGreetingUrlMethod = VmdsGrpc.getGetUploadGreetingUrlMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getGetUploadGreetingUrlMethod = VmdsGrpc.getGetUploadGreetingUrlMethod) == null) {
          VmdsGrpc.getGetUploadGreetingUrlMethod = getGetUploadGreetingUrlMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq, com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "GetUploadGreetingUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("GetUploadGreetingUrl"))
                  .build();
          }
        }
     }
     return getGetUploadGreetingUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq,
      com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> getProcessGreetingUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessGreetingUpload",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq,
      com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> getProcessGreetingUploadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq, com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> getProcessGreetingUploadMethod;
    if ((getProcessGreetingUploadMethod = VmdsGrpc.getProcessGreetingUploadMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getProcessGreetingUploadMethod = VmdsGrpc.getProcessGreetingUploadMethod) == null) {
          VmdsGrpc.getProcessGreetingUploadMethod = getProcessGreetingUploadMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq, com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "ProcessGreetingUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("ProcessGreetingUpload"))
                  .build();
          }
        }
     }
     return getProcessGreetingUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> getUpdateGreetingForExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGreetingForExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> getUpdateGreetingForExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> getUpdateGreetingForExtensionMethod;
    if ((getUpdateGreetingForExtensionMethod = VmdsGrpc.getUpdateGreetingForExtensionMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getUpdateGreetingForExtensionMethod = VmdsGrpc.getUpdateGreetingForExtensionMethod) == null) {
          VmdsGrpc.getUpdateGreetingForExtensionMethod = getUpdateGreetingForExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "UpdateGreetingForExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("UpdateGreetingForExtension"))
                  .build();
          }
        }
     }
     return getUpdateGreetingForExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq,
      com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> getListAvailableGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableGreetings",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq,
      com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> getListAvailableGreetingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq, com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> getListAvailableGreetingsMethod;
    if ((getListAvailableGreetingsMethod = VmdsGrpc.getListAvailableGreetingsMethod) == null) {
      synchronized (VmdsGrpc.class) {
        if ((getListAvailableGreetingsMethod = VmdsGrpc.getListAvailableGreetingsMethod) == null) {
          VmdsGrpc.getListAvailableGreetingsMethod = getListAvailableGreetingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq, com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Vmds", "ListAvailableGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new VmdsMethodDescriptorSupplier("ListAvailableGreetings"))
                  .build();
          }
        }
     }
     return getListAvailableGreetingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VmdsStub newStub(io.grpc.Channel channel) {
    return new VmdsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VmdsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VmdsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VmdsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VmdsFutureStub(channel);
  }

  /**
   */
  public static abstract class VmdsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVoicemailMetadata(com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVoicemailMetadataMethod(), responseObserver);
    }

    /**
     */
    public void getVoicemailMessageCount(com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVoicemailMessageCountMethod(), responseObserver);
    }

    /**
     */
    public void deleteVoicemail(com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVoicemailMethod(), responseObserver);
    }

    /**
     */
    public void deleteGreeting(com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGreetingMethod(), responseObserver);
    }

    /**
     */
    public void updateUploadName(com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUploadNameMethod(), responseObserver);
    }

    /**
     */
    public void updateVoicemailFlagRead(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVoicemailFlagReadMethod(), responseObserver);
    }

    /**
     */
    public void downloadMessage(com.tcn.cloud.api.api.v0alpha.DownloadMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMessageMethod(), responseObserver);
    }

    /**
     */
    public void downloadMessages(com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadMessagesMethod(), responseObserver);
    }

    /**
     */
    public void downloadGreetingForExtension(com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadGreetingForExtensionMethod(), responseObserver);
    }

    /**
     */
    public void downloadGreeting(com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadGreetingMethod(), responseObserver);
    }

    /**
     */
    public void getUploadGreetingUrl(com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUploadGreetingUrlMethod(), responseObserver);
    }

    /**
     */
    public void processGreetingUpload(com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessGreetingUploadMethod(), responseObserver);
    }

    /**
     */
    public void updateGreetingForExtension(com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGreetingForExtensionMethod(), responseObserver);
    }

    /**
     */
    public void listAvailableGreetings(com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailableGreetingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVoicemailMetadataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq,
                com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes>(
                  this, METHODID_GET_VOICEMAIL_METADATA)))
          .addMethod(
            getGetVoicemailMessageCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq,
                com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes>(
                  this, METHODID_GET_VOICEMAIL_MESSAGE_COUNT)))
          .addMethod(
            getDeleteVoicemailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq,
                com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes>(
                  this, METHODID_DELETE_VOICEMAIL)))
          .addMethod(
            getDeleteGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq,
                com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes>(
                  this, METHODID_DELETE_GREETING)))
          .addMethod(
            getUpdateUploadNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq,
                com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes>(
                  this, METHODID_UPDATE_UPLOAD_NAME)))
          .addMethod(
            getUpdateVoicemailFlagReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq,
                com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes>(
                  this, METHODID_UPDATE_VOICEMAIL_FLAG_READ)))
          .addMethod(
            getDownloadMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadMessageReq,
                com.tcn.cloud.api.api.v0alpha.DownloadMessageRes>(
                  this, METHODID_DOWNLOAD_MESSAGE)))
          .addMethod(
            getDownloadMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq,
                com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes>(
                  this, METHODID_DOWNLOAD_MESSAGES)))
          .addMethod(
            getDownloadGreetingForExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq,
                com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes>(
                  this, METHODID_DOWNLOAD_GREETING_FOR_EXTENSION)))
          .addMethod(
            getDownloadGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq,
                com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes>(
                  this, METHODID_DOWNLOAD_GREETING)))
          .addMethod(
            getGetUploadGreetingUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq,
                com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes>(
                  this, METHODID_GET_UPLOAD_GREETING_URL)))
          .addMethod(
            getProcessGreetingUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq,
                com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes>(
                  this, METHODID_PROCESS_GREETING_UPLOAD)))
          .addMethod(
            getUpdateGreetingForExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq,
                com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes>(
                  this, METHODID_UPDATE_GREETING_FOR_EXTENSION)))
          .addMethod(
            getListAvailableGreetingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq,
                com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes>(
                  this, METHODID_LIST_AVAILABLE_GREETINGS)))
          .build();
    }
  }

  /**
   */
  public static final class VmdsStub extends io.grpc.stub.AbstractStub<VmdsStub> {
    private VmdsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VmdsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VmdsStub(channel, callOptions);
    }

    /**
     */
    public void getVoicemailMetadata(com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetVoicemailMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVoicemailMessageCount(com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVoicemailMessageCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVoicemail(com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVoicemailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGreeting(com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUploadName(com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUploadNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVoicemailFlagRead(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVoicemailFlagReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadMessage(com.tcn.cloud.api.api.v0alpha.DownloadMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadMessages(com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadGreetingForExtension(com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadGreetingForExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadGreeting(com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUploadGreetingUrl(com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUploadGreetingUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processGreetingUpload(com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessGreetingUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGreetingForExtension(com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGreetingForExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAvailableGreetings(com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAvailableGreetingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VmdsBlockingStub extends io.grpc.stub.AbstractStub<VmdsBlockingStub> {
    private VmdsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VmdsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VmdsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes> getVoicemailMetadata(
        com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetVoicemailMetadataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes getVoicemailMessageCount(com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetVoicemailMessageCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes deleteVoicemail(com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVoicemailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes deleteGreeting(com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes updateUploadName(com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUploadNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes updateVoicemailFlagRead(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVoicemailFlagReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadMessageRes downloadMessage(com.tcn.cloud.api.api.v0alpha.DownloadMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes downloadMessages(com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes downloadGreetingForExtension(com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadGreetingForExtensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes downloadGreeting(com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes getUploadGreetingUrl(com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUploadGreetingUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes processGreetingUpload(com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessGreetingUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes updateGreetingForExtension(com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGreetingForExtensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes listAvailableGreetings(com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAvailableGreetingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VmdsFutureStub extends io.grpc.stub.AbstractStub<VmdsFutureStub> {
    private VmdsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VmdsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VmdsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes> getVoicemailMessageCount(
        com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVoicemailMessageCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes> deleteVoicemail(
        com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVoicemailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes> deleteGreeting(
        com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes> updateUploadName(
        com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUploadNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes> updateVoicemailFlagRead(
        com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVoicemailFlagReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadMessageRes> downloadMessage(
        com.tcn.cloud.api.api.v0alpha.DownloadMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes> downloadMessages(
        com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadMessagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes> downloadGreetingForExtension(
        com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadGreetingForExtensionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes> downloadGreeting(
        com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes> getUploadGreetingUrl(
        com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUploadGreetingUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes> processGreetingUpload(
        com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessGreetingUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes> updateGreetingForExtension(
        com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGreetingForExtensionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes> listAvailableGreetings(
        com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAvailableGreetingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VOICEMAIL_METADATA = 0;
  private static final int METHODID_GET_VOICEMAIL_MESSAGE_COUNT = 1;
  private static final int METHODID_DELETE_VOICEMAIL = 2;
  private static final int METHODID_DELETE_GREETING = 3;
  private static final int METHODID_UPDATE_UPLOAD_NAME = 4;
  private static final int METHODID_UPDATE_VOICEMAIL_FLAG_READ = 5;
  private static final int METHODID_DOWNLOAD_MESSAGE = 6;
  private static final int METHODID_DOWNLOAD_MESSAGES = 7;
  private static final int METHODID_DOWNLOAD_GREETING_FOR_EXTENSION = 8;
  private static final int METHODID_DOWNLOAD_GREETING = 9;
  private static final int METHODID_GET_UPLOAD_GREETING_URL = 10;
  private static final int METHODID_PROCESS_GREETING_UPLOAD = 11;
  private static final int METHODID_UPDATE_GREETING_FOR_EXTENSION = 12;
  private static final int METHODID_LIST_AVAILABLE_GREETINGS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VmdsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VmdsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VOICEMAIL_METADATA:
          serviceImpl.getVoicemailMetadata((com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailMetadataRes>) responseObserver);
          break;
        case METHODID_GET_VOICEMAIL_MESSAGE_COUNT:
          serviceImpl.getVoicemailMessageCount((com.tcn.cloud.api.api.v0alpha.GetVoicemailCountReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetVoicemailCountRes>) responseObserver);
          break;
        case METHODID_DELETE_VOICEMAIL:
          serviceImpl.deleteVoicemail((com.tcn.cloud.api.api.v0alpha.DeleteVoicemailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteVoicemailRes>) responseObserver);
          break;
        case METHODID_DELETE_GREETING:
          serviceImpl.deleteGreeting((com.tcn.cloud.api.api.v0alpha.DeleteGreetingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteGreetingRes>) responseObserver);
          break;
        case METHODID_UPDATE_UPLOAD_NAME:
          serviceImpl.updateUploadName((com.tcn.cloud.api.api.v0alpha.UpdateUploadNameReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateUploadNameRes>) responseObserver);
          break;
        case METHODID_UPDATE_VOICEMAIL_FLAG_READ:
          serviceImpl.updateVoicemailFlagRead((com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailFlagReadRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_MESSAGE:
          serviceImpl.downloadMessage((com.tcn.cloud.api.api.v0alpha.DownloadMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessageRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_MESSAGES:
          serviceImpl.downloadMessages((com.tcn.cloud.api.api.v0alpha.DownloadMessagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadMessagesRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_GREETING_FOR_EXTENSION:
          serviceImpl.downloadGreetingForExtension((com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingForExtensionRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_GREETING:
          serviceImpl.downloadGreeting((com.tcn.cloud.api.api.v0alpha.DownloadGreetingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadGreetingRes>) responseObserver);
          break;
        case METHODID_GET_UPLOAD_GREETING_URL:
          serviceImpl.getUploadGreetingUrl((com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetUploadGreetingUrlRes>) responseObserver);
          break;
        case METHODID_PROCESS_GREETING_UPLOAD:
          serviceImpl.processGreetingUpload((com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessGreetingUploadRes>) responseObserver);
          break;
        case METHODID_UPDATE_GREETING_FOR_EXTENSION:
          serviceImpl.updateGreetingForExtension((com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateGreetingForExtensionRes>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_GREETINGS:
          serviceImpl.listAvailableGreetings((com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAvailableGreetingsRes>) responseObserver);
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

  private static abstract class VmdsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VmdsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.VmdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vmds");
    }
  }

  private static final class VmdsFileDescriptorSupplier
      extends VmdsBaseDescriptorSupplier {
    VmdsFileDescriptorSupplier() {}
  }

  private static final class VmdsMethodDescriptorSupplier
      extends VmdsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VmdsMethodDescriptorSupplier(String methodName) {
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
      synchronized (VmdsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VmdsFileDescriptorSupplier())
              .addMethod(getGetVoicemailMetadataMethod())
              .addMethod(getGetVoicemailMessageCountMethod())
              .addMethod(getDeleteVoicemailMethod())
              .addMethod(getDeleteGreetingMethod())
              .addMethod(getUpdateUploadNameMethod())
              .addMethod(getUpdateVoicemailFlagReadMethod())
              .addMethod(getDownloadMessageMethod())
              .addMethod(getDownloadMessagesMethod())
              .addMethod(getDownloadGreetingForExtensionMethod())
              .addMethod(getDownloadGreetingMethod())
              .addMethod(getGetUploadGreetingUrlMethod())
              .addMethod(getProcessGreetingUploadMethod())
              .addMethod(getUpdateGreetingForExtensionMethod())
              .addMethod(getListAvailableGreetingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
