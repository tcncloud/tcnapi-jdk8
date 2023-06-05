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
 * <pre>
 * Service for interacting with TCN's SMS API system.
 * Accessing all of the methods require an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/smsapi.proto")
public final class SmsApiGrpc {

  private SmsApiGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.SmsApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> getListSmsTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> getListSmsTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> getListSmsTemplatesMethod;
    if ((getListSmsTemplatesMethod = SmsApiGrpc.getListSmsTemplatesMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsTemplatesMethod = SmsApiGrpc.getListSmsTemplatesMethod) == null) {
          SmsApiGrpc.getListSmsTemplatesMethod = getListSmsTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsTemplates"))
                  .build();
          }
        }
     }
     return getListSmsTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> getCreateSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> getCreateSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> getCreateSmsTemplateMethod;
    if ((getCreateSmsTemplateMethod = SmsApiGrpc.getCreateSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsTemplateMethod = SmsApiGrpc.getCreateSmsTemplateMethod) == null) {
          SmsApiGrpc.getCreateSmsTemplateMethod = getCreateSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsTemplate"))
                  .build();
          }
        }
     }
     return getCreateSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> getUpdateSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> getUpdateSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> getUpdateSmsTemplateMethod;
    if ((getUpdateSmsTemplateMethod = SmsApiGrpc.getUpdateSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsTemplateMethod = SmsApiGrpc.getUpdateSmsTemplateMethod) == null) {
          SmsApiGrpc.getUpdateSmsTemplateMethod = getUpdateSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsTemplate"))
                  .build();
          }
        }
     }
     return getUpdateSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> getDeleteSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> getDeleteSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> getDeleteSmsTemplateMethod;
    if ((getDeleteSmsTemplateMethod = SmsApiGrpc.getDeleteSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteSmsTemplateMethod = SmsApiGrpc.getDeleteSmsTemplateMethod) == null) {
          SmsApiGrpc.getDeleteSmsTemplateMethod = getDeleteSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteSmsTemplate"))
                  .build();
          }
        }
     }
     return getDeleteSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> getGetSmsTemplateBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsTemplateBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> getGetSmsTemplateBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq, com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> getGetSmsTemplateBySidMethod;
    if ((getGetSmsTemplateBySidMethod = SmsApiGrpc.getGetSmsTemplateBySidMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsTemplateBySidMethod = SmsApiGrpc.getGetSmsTemplateBySidMethod) == null) {
          SmsApiGrpc.getGetSmsTemplateBySidMethod = getGetSmsTemplateBySidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq, com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsTemplateBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsTemplateBySid"))
                  .build();
          }
        }
     }
     return getGetSmsTemplateBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> getListSmsIntentTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsIntentTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> getListSmsIntentTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> getListSmsIntentTemplatesMethod;
    if ((getListSmsIntentTemplatesMethod = SmsApiGrpc.getListSmsIntentTemplatesMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsIntentTemplatesMethod = SmsApiGrpc.getListSmsIntentTemplatesMethod) == null) {
          SmsApiGrpc.getListSmsIntentTemplatesMethod = getListSmsIntentTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsIntentTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsIntentTemplates"))
                  .build();
          }
        }
     }
     return getListSmsIntentTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
      com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> getCreateSmsIntentTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsIntentTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
      com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> getCreateSmsIntentTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> getCreateSmsIntentTemplateMethod;
    if ((getCreateSmsIntentTemplateMethod = SmsApiGrpc.getCreateSmsIntentTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsIntentTemplateMethod = SmsApiGrpc.getCreateSmsIntentTemplateMethod) == null) {
          SmsApiGrpc.getCreateSmsIntentTemplateMethod = getCreateSmsIntentTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsIntentTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsIntentTemplate"))
                  .build();
          }
        }
     }
     return getCreateSmsIntentTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> getUpdateSmsIntentTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsIntentTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> getUpdateSmsIntentTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> getUpdateSmsIntentTemplateMethod;
    if ((getUpdateSmsIntentTemplateMethod = SmsApiGrpc.getUpdateSmsIntentTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsIntentTemplateMethod = SmsApiGrpc.getUpdateSmsIntentTemplateMethod) == null) {
          SmsApiGrpc.getUpdateSmsIntentTemplateMethod = getUpdateSmsIntentTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsIntentTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsIntentTemplate"))
                  .build();
          }
        }
     }
     return getUpdateSmsIntentTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> getDeleteSmsIntentTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSmsIntentTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> getDeleteSmsIntentTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> getDeleteSmsIntentTemplateMethod;
    if ((getDeleteSmsIntentTemplateMethod = SmsApiGrpc.getDeleteSmsIntentTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteSmsIntentTemplateMethod = SmsApiGrpc.getDeleteSmsIntentTemplateMethod) == null) {
          SmsApiGrpc.getDeleteSmsIntentTemplateMethod = getDeleteSmsIntentTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteSmsIntentTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteSmsIntentTemplate"))
                  .build();
          }
        }
     }
     return getDeleteSmsIntentTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq,
      com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getGetSmsIntentTemplateBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsIntentTemplateBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq,
      com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getGetSmsIntentTemplateBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getGetSmsIntentTemplateBySidMethod;
    if ((getGetSmsIntentTemplateBySidMethod = SmsApiGrpc.getGetSmsIntentTemplateBySidMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsIntentTemplateBySidMethod = SmsApiGrpc.getGetSmsIntentTemplateBySidMethod) == null) {
          SmsApiGrpc.getGetSmsIntentTemplateBySidMethod = getGetSmsIntentTemplateBySidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsIntentTemplateBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsIntentTemplateBySid"))
                  .build();
          }
        }
     }
     return getGetSmsIntentTemplateBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> getListSmsSourceNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsSourceNumbers",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> getListSmsSourceNumbersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq, com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> getListSmsSourceNumbersMethod;
    if ((getListSmsSourceNumbersMethod = SmsApiGrpc.getListSmsSourceNumbersMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsSourceNumbersMethod = SmsApiGrpc.getListSmsSourceNumbersMethod) == null) {
          SmsApiGrpc.getListSmsSourceNumbersMethod = getListSmsSourceNumbersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq, com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsSourceNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsSourceNumbers"))
                  .build();
          }
        }
     }
     return getListSmsSourceNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> getCreateSmsSourceNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsSourceNumber",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> getCreateSmsSourceNumberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> getCreateSmsSourceNumberMethod;
    if ((getCreateSmsSourceNumberMethod = SmsApiGrpc.getCreateSmsSourceNumberMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsSourceNumberMethod = SmsApiGrpc.getCreateSmsSourceNumberMethod) == null) {
          SmsApiGrpc.getCreateSmsSourceNumberMethod = getCreateSmsSourceNumberMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsSourceNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsSourceNumber"))
                  .build();
          }
        }
     }
     return getCreateSmsSourceNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> getUpdateSmsSourceNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsSourceNumber",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> getUpdateSmsSourceNumberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> getUpdateSmsSourceNumberMethod;
    if ((getUpdateSmsSourceNumberMethod = SmsApiGrpc.getUpdateSmsSourceNumberMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsSourceNumberMethod = SmsApiGrpc.getUpdateSmsSourceNumberMethod) == null) {
          SmsApiGrpc.getUpdateSmsSourceNumberMethod = getUpdateSmsSourceNumberMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsSourceNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsSourceNumber"))
                  .build();
          }
        }
     }
     return getUpdateSmsSourceNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> getDeleteSmsSourceNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSmsSourceNumber",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> getDeleteSmsSourceNumberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> getDeleteSmsSourceNumberMethod;
    if ((getDeleteSmsSourceNumberMethod = SmsApiGrpc.getDeleteSmsSourceNumberMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteSmsSourceNumberMethod = SmsApiGrpc.getDeleteSmsSourceNumberMethod) == null) {
          SmsApiGrpc.getDeleteSmsSourceNumberMethod = getDeleteSmsSourceNumberMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteSmsSourceNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteSmsSourceNumber"))
                  .build();
          }
        }
     }
     return getDeleteSmsSourceNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq,
      com.tcn.cloud.api.api.v0alpha.SmsNumbers> getGetSmsSourceNumberBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsSourceNumberBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SmsNumbers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq,
      com.tcn.cloud.api.api.v0alpha.SmsNumbers> getGetSmsSourceNumberBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq, com.tcn.cloud.api.api.v0alpha.SmsNumbers> getGetSmsSourceNumberBySidMethod;
    if ((getGetSmsSourceNumberBySidMethod = SmsApiGrpc.getGetSmsSourceNumberBySidMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsSourceNumberBySidMethod = SmsApiGrpc.getGetSmsSourceNumberBySidMethod) == null) {
          SmsApiGrpc.getGetSmsSourceNumberBySidMethod = getGetSmsSourceNumberBySidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq, com.tcn.cloud.api.api.v0alpha.SmsNumbers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsSourceNumberBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsNumbers.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsSourceNumberBySid"))
                  .build();
          }
        }
     }
     return getGetSmsSourceNumberBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq,
      com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> getSendSmsNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSmsNotification",
      requestType = com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq,
      com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> getSendSmsNotificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq, com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> getSendSmsNotificationMethod;
    if ((getSendSmsNotificationMethod = SmsApiGrpc.getSendSmsNotificationMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getSendSmsNotificationMethod = SmsApiGrpc.getSendSmsNotificationMethod) == null) {
          SmsApiGrpc.getSendSmsNotificationMethod = getSendSmsNotificationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq, com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "SendSmsNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("SendSmsNotification"))
                  .build();
          }
        }
     }
     return getSendSmsNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsGroupByFilters",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersMethod;
    if ((getListSmsGroupByFiltersMethod = SmsApiGrpc.getListSmsGroupByFiltersMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsGroupByFiltersMethod = SmsApiGrpc.getListSmsGroupByFiltersMethod) == null) {
          SmsApiGrpc.getListSmsGroupByFiltersMethod = getListSmsGroupByFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsGroupByFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsGroupByFilters"))
                  .build();
          }
        }
     }
     return getListSmsGroupByFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsGroupsByGroupSids",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsMethod;
    if ((getListSmsGroupsByGroupSidsMethod = SmsApiGrpc.getListSmsGroupsByGroupSidsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsGroupsByGroupSidsMethod = SmsApiGrpc.getListSmsGroupsByGroupSidsMethod) == null) {
          SmsApiGrpc.getListSmsGroupsByGroupSidsMethod = getListSmsGroupsByGroupSidsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsGroupsByGroupSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsGroupsByGroupSids"))
                  .build();
          }
        }
     }
     return getListSmsGroupsByGroupSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsTasksByGroupSids",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsMethod;
    if ((getListSmsTasksByGroupSidsMethod = SmsApiGrpc.getListSmsTasksByGroupSidsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsTasksByGroupSidsMethod = SmsApiGrpc.getListSmsTasksByGroupSidsMethod) == null) {
          SmsApiGrpc.getListSmsTasksByGroupSidsMethod = getListSmsTasksByGroupSidsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsTasksByGroupSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsTasksByGroupSids"))
                  .build();
          }
        }
     }
     return getListSmsTasksByGroupSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersForAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsGroupByFiltersForAudit",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersForAuditMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> getListSmsGroupByFiltersForAuditMethod;
    if ((getListSmsGroupByFiltersForAuditMethod = SmsApiGrpc.getListSmsGroupByFiltersForAuditMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsGroupByFiltersForAuditMethod = SmsApiGrpc.getListSmsGroupByFiltersForAuditMethod) == null) {
          SmsApiGrpc.getListSmsGroupByFiltersForAuditMethod = getListSmsGroupByFiltersForAuditMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsGroupByFiltersForAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsGroupByFiltersForAudit"))
                  .build();
          }
        }
     }
     return getListSmsGroupByFiltersForAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsForAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsGroupsByGroupSidsForAudit",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsForAuditMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> getListSmsGroupsByGroupSidsForAuditMethod;
    if ((getListSmsGroupsByGroupSidsForAuditMethod = SmsApiGrpc.getListSmsGroupsByGroupSidsForAuditMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsGroupsByGroupSidsForAuditMethod = SmsApiGrpc.getListSmsGroupsByGroupSidsForAuditMethod) == null) {
          SmsApiGrpc.getListSmsGroupsByGroupSidsForAuditMethod = getListSmsGroupsByGroupSidsForAuditMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsGroupsByGroupSidsForAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsGroupsByGroupSidsForAudit"))
                  .build();
          }
        }
     }
     return getListSmsGroupsByGroupSidsForAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsForAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsTasksByGroupSidsForAudit",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsForAuditMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> getListSmsTasksByGroupSidsForAuditMethod;
    if ((getListSmsTasksByGroupSidsForAuditMethod = SmsApiGrpc.getListSmsTasksByGroupSidsForAuditMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsTasksByGroupSidsForAuditMethod = SmsApiGrpc.getListSmsTasksByGroupSidsForAuditMethod) == null) {
          SmsApiGrpc.getListSmsTasksByGroupSidsForAuditMethod = getListSmsTasksByGroupSidsForAuditMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsTasksByGroupSidsForAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsTasksByGroupSidsForAudit"))
                  .build();
          }
        }
     }
     return getListSmsTasksByGroupSidsForAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> getListSmsTasksWithDetailedStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsTasksWithDetailedStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> getListSmsTasksWithDetailedStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> getListSmsTasksWithDetailedStatusMethod;
    if ((getListSmsTasksWithDetailedStatusMethod = SmsApiGrpc.getListSmsTasksWithDetailedStatusMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsTasksWithDetailedStatusMethod = SmsApiGrpc.getListSmsTasksWithDetailedStatusMethod) == null) {
          SmsApiGrpc.getListSmsTasksWithDetailedStatusMethod = getListSmsTasksWithDetailedStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq, com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsTasksWithDetailedStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsTasksWithDetailedStatus"))
                  .build();
          }
        }
     }
     return getListSmsTasksWithDetailedStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsGroupStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupStatusMethod;
    if ((getUpdateSmsGroupStatusMethod = SmsApiGrpc.getUpdateSmsGroupStatusMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsGroupStatusMethod = SmsApiGrpc.getUpdateSmsGroupStatusMethod) == null) {
          SmsApiGrpc.getUpdateSmsGroupStatusMethod = getUpdateSmsGroupStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsGroupStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsGroupStatus"))
                  .build();
          }
        }
     }
     return getUpdateSmsGroupStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupSendsPerMinuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsGroupSendsPerMinute",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupSendsPerMinuteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupSendsPerMinuteMethod;
    if ((getUpdateSmsGroupSendsPerMinuteMethod = SmsApiGrpc.getUpdateSmsGroupSendsPerMinuteMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsGroupSendsPerMinuteMethod = SmsApiGrpc.getUpdateSmsGroupSendsPerMinuteMethod) == null) {
          SmsApiGrpc.getUpdateSmsGroupSendsPerMinuteMethod = getUpdateSmsGroupSendsPerMinuteMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsGroupSendsPerMinute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsGroupSendsPerMinute"))
                  .build();
          }
        }
     }
     return getUpdateSmsGroupSendsPerMinuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupScheduleTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsGroupScheduleTimes",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupScheduleTimesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> getUpdateSmsGroupScheduleTimesMethod;
    if ((getUpdateSmsGroupScheduleTimesMethod = SmsApiGrpc.getUpdateSmsGroupScheduleTimesMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsGroupScheduleTimesMethod = SmsApiGrpc.getUpdateSmsGroupScheduleTimesMethod) == null) {
          SmsApiGrpc.getUpdateSmsGroupScheduleTimesMethod = getUpdateSmsGroupScheduleTimesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsGroupInfo, com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsGroupScheduleTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsGroupInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsGroupScheduleTimes"))
                  .build();
          }
        }
     }
     return getUpdateSmsGroupScheduleTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> getScheduleSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleSms",
      requestType = com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> getScheduleSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq, com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> getScheduleSmsMethod;
    if ((getScheduleSmsMethod = SmsApiGrpc.getScheduleSmsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getScheduleSmsMethod = SmsApiGrpc.getScheduleSmsMethod) == null) {
          SmsApiGrpc.getScheduleSmsMethod = getScheduleSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq, com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ScheduleSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ScheduleSms"))
                  .build();
          }
        }
     }
     return getScheduleSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq,
      com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> getResendUnconnectedSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendUnconnectedSms",
      requestType = com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq,
      com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> getResendUnconnectedSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq, com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> getResendUnconnectedSmsMethod;
    if ((getResendUnconnectedSmsMethod = SmsApiGrpc.getResendUnconnectedSmsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getResendUnconnectedSmsMethod = SmsApiGrpc.getResendUnconnectedSmsMethod) == null) {
          SmsApiGrpc.getResendUnconnectedSmsMethod = getResendUnconnectedSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq, com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ResendUnconnectedSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ResendUnconnectedSms"))
                  .build();
          }
        }
     }
     return getResendUnconnectedSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq,
      com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> getSmsActivitySearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmsActivitySearch",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq,
      com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> getSmsActivitySearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq, com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> getSmsActivitySearchMethod;
    if ((getSmsActivitySearchMethod = SmsApiGrpc.getSmsActivitySearchMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getSmsActivitySearchMethod = SmsApiGrpc.getSmsActivitySearchMethod) == null) {
          SmsApiGrpc.getSmsActivitySearchMethod = getSmsActivitySearchMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq, com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "SmsActivitySearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("SmsActivitySearch"))
                  .build();
          }
        }
     }
     return getSmsActivitySearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> getCreateInboundSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInboundSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> getCreateInboundSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> getCreateInboundSmsTemplateMethod;
    if ((getCreateInboundSmsTemplateMethod = SmsApiGrpc.getCreateInboundSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateInboundSmsTemplateMethod = SmsApiGrpc.getCreateInboundSmsTemplateMethod) == null) {
          SmsApiGrpc.getCreateInboundSmsTemplateMethod = getCreateInboundSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateInboundSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateInboundSmsTemplate"))
                  .build();
          }
        }
     }
     return getCreateInboundSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> getUpdateInboundSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInboundSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> getUpdateInboundSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> getUpdateInboundSmsTemplateMethod;
    if ((getUpdateInboundSmsTemplateMethod = SmsApiGrpc.getUpdateInboundSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateInboundSmsTemplateMethod = SmsApiGrpc.getUpdateInboundSmsTemplateMethod) == null) {
          SmsApiGrpc.getUpdateInboundSmsTemplateMethod = getUpdateInboundSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateInboundSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateInboundSmsTemplate"))
                  .build();
          }
        }
     }
     return getUpdateInboundSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> getDeleteInboundSmsTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInboundSmsTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> getDeleteInboundSmsTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> getDeleteInboundSmsTemplateMethod;
    if ((getDeleteInboundSmsTemplateMethod = SmsApiGrpc.getDeleteInboundSmsTemplateMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteInboundSmsTemplateMethod = SmsApiGrpc.getDeleteInboundSmsTemplateMethod) == null) {
          SmsApiGrpc.getDeleteInboundSmsTemplateMethod = getDeleteInboundSmsTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteInboundSmsTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteInboundSmsTemplate"))
                  .build();
          }
        }
     }
     return getDeleteInboundSmsTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> getListInboundSmsTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundSmsTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> getListInboundSmsTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> getListInboundSmsTemplatesMethod;
    if ((getListInboundSmsTemplatesMethod = SmsApiGrpc.getListInboundSmsTemplatesMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListInboundSmsTemplatesMethod = SmsApiGrpc.getListInboundSmsTemplatesMethod) == null) {
          SmsApiGrpc.getListInboundSmsTemplatesMethod = getListInboundSmsTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListInboundSmsTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListInboundSmsTemplates"))
                  .build();
          }
        }
     }
     return getListInboundSmsTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> getGetInboundSmsTemplateByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInboundSmsTemplateById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> getGetInboundSmsTemplateByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> getGetInboundSmsTemplateByIdMethod;
    if ((getGetInboundSmsTemplateByIdMethod = SmsApiGrpc.getGetInboundSmsTemplateByIdMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetInboundSmsTemplateByIdMethod = SmsApiGrpc.getGetInboundSmsTemplateByIdMethod) == null) {
          SmsApiGrpc.getGetInboundSmsTemplateByIdMethod = getGetInboundSmsTemplateByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetInboundSmsTemplateById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetInboundSmsTemplateById"))
                  .build();
          }
        }
     }
     return getGetInboundSmsTemplateByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> getCreateInboundSmsGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInboundSmsGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> getCreateInboundSmsGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> getCreateInboundSmsGroupMethod;
    if ((getCreateInboundSmsGroupMethod = SmsApiGrpc.getCreateInboundSmsGroupMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateInboundSmsGroupMethod = SmsApiGrpc.getCreateInboundSmsGroupMethod) == null) {
          SmsApiGrpc.getCreateInboundSmsGroupMethod = getCreateInboundSmsGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateInboundSmsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateInboundSmsGroup"))
                  .build();
          }
        }
     }
     return getCreateInboundSmsGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> getUpdateInboundSmsGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInboundSmsGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> getUpdateInboundSmsGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> getUpdateInboundSmsGroupMethod;
    if ((getUpdateInboundSmsGroupMethod = SmsApiGrpc.getUpdateInboundSmsGroupMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateInboundSmsGroupMethod = SmsApiGrpc.getUpdateInboundSmsGroupMethod) == null) {
          SmsApiGrpc.getUpdateInboundSmsGroupMethod = getUpdateInboundSmsGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateInboundSmsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateInboundSmsGroup"))
                  .build();
          }
        }
     }
     return getUpdateInboundSmsGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> getDeleteInboundSmsGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInboundSmsGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> getDeleteInboundSmsGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> getDeleteInboundSmsGroupMethod;
    if ((getDeleteInboundSmsGroupMethod = SmsApiGrpc.getDeleteInboundSmsGroupMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteInboundSmsGroupMethod = SmsApiGrpc.getDeleteInboundSmsGroupMethod) == null) {
          SmsApiGrpc.getDeleteInboundSmsGroupMethod = getDeleteInboundSmsGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteInboundSmsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteInboundSmsGroup"))
                  .build();
          }
        }
     }
     return getDeleteInboundSmsGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> getListInboundSmsGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundSmsGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> getListInboundSmsGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> getListInboundSmsGroupsMethod;
    if ((getListInboundSmsGroupsMethod = SmsApiGrpc.getListInboundSmsGroupsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListInboundSmsGroupsMethod = SmsApiGrpc.getListInboundSmsGroupsMethod) == null) {
          SmsApiGrpc.getListInboundSmsGroupsMethod = getListInboundSmsGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListInboundSmsGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListInboundSmsGroups"))
                  .build();
          }
        }
     }
     return getListInboundSmsGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> getListActiveInboundSmsGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActiveInboundSmsGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> getListActiveInboundSmsGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> getListActiveInboundSmsGroupsMethod;
    if ((getListActiveInboundSmsGroupsMethod = SmsApiGrpc.getListActiveInboundSmsGroupsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListActiveInboundSmsGroupsMethod = SmsApiGrpc.getListActiveInboundSmsGroupsMethod) == null) {
          SmsApiGrpc.getListActiveInboundSmsGroupsMethod = getListActiveInboundSmsGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListActiveInboundSmsGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListActiveInboundSmsGroups"))
                  .build();
          }
        }
     }
     return getListActiveInboundSmsGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> getListInboundSmsGroupByFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundSmsGroupByFilters",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> getListInboundSmsGroupByFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> getListInboundSmsGroupByFiltersMethod;
    if ((getListInboundSmsGroupByFiltersMethod = SmsApiGrpc.getListInboundSmsGroupByFiltersMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListInboundSmsGroupByFiltersMethod = SmsApiGrpc.getListInboundSmsGroupByFiltersMethod) == null) {
          SmsApiGrpc.getListInboundSmsGroupByFiltersMethod = getListInboundSmsGroupByFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListInboundSmsGroupByFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListInboundSmsGroupByFilters"))
                  .build();
          }
        }
     }
     return getListInboundSmsGroupByFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> getGetInboundSmsGroupByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInboundSmsGroupById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> getGetInboundSmsGroupByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq, com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> getGetInboundSmsGroupByIdMethod;
    if ((getGetInboundSmsGroupByIdMethod = SmsApiGrpc.getGetInboundSmsGroupByIdMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetInboundSmsGroupByIdMethod = SmsApiGrpc.getGetInboundSmsGroupByIdMethod) == null) {
          SmsApiGrpc.getGetInboundSmsGroupByIdMethod = getGetInboundSmsGroupByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq, com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetInboundSmsGroupById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetInboundSmsGroupById"))
                  .build();
          }
        }
     }
     return getGetInboundSmsGroupByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> getListInboundSmsGroupsByGroupIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundSmsGroupsByGroupIds",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> getListInboundSmsGroupsByGroupIdsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> getListInboundSmsGroupsByGroupIdsMethod;
    if ((getListInboundSmsGroupsByGroupIdsMethod = SmsApiGrpc.getListInboundSmsGroupsByGroupIdsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListInboundSmsGroupsByGroupIdsMethod = SmsApiGrpc.getListInboundSmsGroupsByGroupIdsMethod) == null) {
          SmsApiGrpc.getListInboundSmsGroupsByGroupIdsMethod = getListInboundSmsGroupsByGroupIdsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListInboundSmsGroupsByGroupIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListInboundSmsGroupsByGroupIds"))
                  .build();
          }
        }
     }
     return getListInboundSmsGroupsByGroupIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> getStopInboundSmsGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopInboundSmsGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> getStopInboundSmsGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> getStopInboundSmsGroupMethod;
    if ((getStopInboundSmsGroupMethod = SmsApiGrpc.getStopInboundSmsGroupMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getStopInboundSmsGroupMethod = SmsApiGrpc.getStopInboundSmsGroupMethod) == null) {
          SmsApiGrpc.getStopInboundSmsGroupMethod = getStopInboundSmsGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq, com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "StopInboundSmsGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("StopInboundSmsGroup"))
                  .build();
          }
        }
     }
     return getStopInboundSmsGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> getScheduleInboundSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleInboundSms",
      requestType = com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> getScheduleInboundSmsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq, com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> getScheduleInboundSmsMethod;
    if ((getScheduleInboundSmsMethod = SmsApiGrpc.getScheduleInboundSmsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getScheduleInboundSmsMethod = SmsApiGrpc.getScheduleInboundSmsMethod) == null) {
          SmsApiGrpc.getScheduleInboundSmsMethod = getScheduleInboundSmsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq, com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ScheduleInboundSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ScheduleInboundSms"))
                  .build();
          }
        }
     }
     return getScheduleInboundSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> getCreateSmsConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> getCreateSmsConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> getCreateSmsConversationMethod;
    if ((getCreateSmsConversationMethod = SmsApiGrpc.getCreateSmsConversationMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsConversationMethod = SmsApiGrpc.getCreateSmsConversationMethod) == null) {
          SmsApiGrpc.getCreateSmsConversationMethod = getCreateSmsConversationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsConversation"))
                  .build();
          }
        }
     }
     return getCreateSmsConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> getUpdateSmsConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSmsConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> getUpdateSmsConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> getUpdateSmsConversationMethod;
    if ((getUpdateSmsConversationMethod = SmsApiGrpc.getUpdateSmsConversationMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getUpdateSmsConversationMethod = SmsApiGrpc.getUpdateSmsConversationMethod) == null) {
          SmsApiGrpc.getUpdateSmsConversationMethod = getUpdateSmsConversationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq, com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "UpdateSmsConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("UpdateSmsConversation"))
                  .build();
          }
        }
     }
     return getUpdateSmsConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> getDeleteSmsConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSmsConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> getDeleteSmsConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> getDeleteSmsConversationMethod;
    if ((getDeleteSmsConversationMethod = SmsApiGrpc.getDeleteSmsConversationMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getDeleteSmsConversationMethod = SmsApiGrpc.getDeleteSmsConversationMethod) == null) {
          SmsApiGrpc.getDeleteSmsConversationMethod = getDeleteSmsConversationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq, com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "DeleteSmsConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("DeleteSmsConversation"))
                  .build();
          }
        }
     }
     return getDeleteSmsConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> getListSmsConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsConversations",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> getListSmsConversationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> getListSmsConversationsMethod;
    if ((getListSmsConversationsMethod = SmsApiGrpc.getListSmsConversationsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsConversationsMethod = SmsApiGrpc.getListSmsConversationsMethod) == null) {
          SmsApiGrpc.getListSmsConversationsMethod = getListSmsConversationsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsConversations"))
                  .build();
          }
        }
     }
     return getListSmsConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> getGetSmsConversationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsConversationById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> getGetSmsConversationByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> getGetSmsConversationByIdMethod;
    if ((getGetSmsConversationByIdMethod = SmsApiGrpc.getGetSmsConversationByIdMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsConversationByIdMethod = SmsApiGrpc.getGetSmsConversationByIdMethod) == null) {
          SmsApiGrpc.getGetSmsConversationByIdMethod = getGetSmsConversationByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsConversationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsConversationById"))
                  .build();
          }
        }
     }
     return getGetSmsConversationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> getGetSmsMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> getGetSmsMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq, com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> getGetSmsMessageMethod;
    if ((getGetSmsMessageMethod = SmsApiGrpc.getGetSmsMessageMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsMessageMethod = SmsApiGrpc.getGetSmsMessageMethod) == null) {
          SmsApiGrpc.getGetSmsMessageMethod = getGetSmsMessageMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq, com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsMessage"))
                  .build();
          }
        }
     }
     return getGetSmsMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAudit,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> getCreateSmsConversationAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsConversationAudit",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAudit,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> getCreateSmsConversationAuditMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAudit, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> getCreateSmsConversationAuditMethod;
    if ((getCreateSmsConversationAuditMethod = SmsApiGrpc.getCreateSmsConversationAuditMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsConversationAuditMethod = SmsApiGrpc.getCreateSmsConversationAuditMethod) == null) {
          SmsApiGrpc.getCreateSmsConversationAuditMethod = getCreateSmsConversationAuditMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsConversationAudit, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsConversationAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsConversationAudit"))
                  .build();
          }
        }
     }
     return getCreateSmsConversationAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> getListSmsConversationAuditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsConversationAudits",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> getListSmsConversationAuditsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> getListSmsConversationAuditsMethod;
    if ((getListSmsConversationAuditsMethod = SmsApiGrpc.getListSmsConversationAuditsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsConversationAuditsMethod = SmsApiGrpc.getListSmsConversationAuditsMethod) == null) {
          SmsApiGrpc.getListSmsConversationAuditsMethod = getListSmsConversationAuditsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsConversationAudits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsConversationAudits"))
                  .build();
          }
        }
     }
     return getListSmsConversationAuditsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> getGetSmsConversationAuditByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsConversationAuditById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> getGetSmsConversationAuditByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> getGetSmsConversationAuditByIdMethod;
    if ((getGetSmsConversationAuditByIdMethod = SmsApiGrpc.getGetSmsConversationAuditByIdMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsConversationAuditByIdMethod = SmsApiGrpc.getGetSmsConversationAuditByIdMethod) == null) {
          SmsApiGrpc.getGetSmsConversationAuditByIdMethod = getGetSmsConversationAuditByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsConversationAuditById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsConversationAuditById"))
                  .build();
          }
        }
     }
     return getGetSmsConversationAuditByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> getCreateSmsConversationAssignedAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSmsConversationAssignedAgent",
      requestType = com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent,
      com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> getCreateSmsConversationAssignedAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> getCreateSmsConversationAssignedAgentMethod;
    if ((getCreateSmsConversationAssignedAgentMethod = SmsApiGrpc.getCreateSmsConversationAssignedAgentMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getCreateSmsConversationAssignedAgentMethod = SmsApiGrpc.getCreateSmsConversationAssignedAgentMethod) == null) {
          SmsApiGrpc.getCreateSmsConversationAssignedAgentMethod = getCreateSmsConversationAssignedAgentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent, com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "CreateSmsConversationAssignedAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("CreateSmsConversationAssignedAgent"))
                  .build();
          }
        }
     }
     return getCreateSmsConversationAssignedAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> getListSmsConversationAssignedAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsConversationAssignedAgents",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> getListSmsConversationAssignedAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> getListSmsConversationAssignedAgentsMethod;
    if ((getListSmsConversationAssignedAgentsMethod = SmsApiGrpc.getListSmsConversationAssignedAgentsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListSmsConversationAssignedAgentsMethod = SmsApiGrpc.getListSmsConversationAssignedAgentsMethod) == null) {
          SmsApiGrpc.getListSmsConversationAssignedAgentsMethod = getListSmsConversationAssignedAgentsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq, com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListSmsConversationAssignedAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListSmsConversationAssignedAgents"))
                  .build();
          }
        }
     }
     return getListSmsConversationAssignedAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> getGetSmsConversationAssignedAgentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSmsConversationAssignedAgentById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq,
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> getGetSmsConversationAssignedAgentByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> getGetSmsConversationAssignedAgentByIdMethod;
    if ((getGetSmsConversationAssignedAgentByIdMethod = SmsApiGrpc.getGetSmsConversationAssignedAgentByIdMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getGetSmsConversationAssignedAgentByIdMethod = SmsApiGrpc.getGetSmsConversationAssignedAgentByIdMethod) == null) {
          SmsApiGrpc.getGetSmsConversationAssignedAgentByIdMethod = getGetSmsConversationAssignedAgentByIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "GetSmsConversationAssignedAgentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("GetSmsConversationAssignedAgentById"))
                  .build();
          }
        }
     }
     return getGetSmsConversationAssignedAgentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> getListInboundSmsTasksByGroupIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundSmsTasksByGroupIds",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> getListInboundSmsTasksByGroupIdsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> getListInboundSmsTasksByGroupIdsMethod;
    if ((getListInboundSmsTasksByGroupIdsMethod = SmsApiGrpc.getListInboundSmsTasksByGroupIdsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getListInboundSmsTasksByGroupIdsMethod = SmsApiGrpc.getListInboundSmsTasksByGroupIdsMethod) == null) {
          SmsApiGrpc.getListInboundSmsTasksByGroupIdsMethod = getListInboundSmsTasksByGroupIdsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "ListInboundSmsTasksByGroupIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("ListInboundSmsTasksByGroupIds"))
                  .build();
          }
        }
     }
     return getListInboundSmsTasksByGroupIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> getStopAllOutboundSmsGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAllOutboundSmsGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> getStopAllOutboundSmsGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> getStopAllOutboundSmsGroupsMethod;
    if ((getStopAllOutboundSmsGroupsMethod = SmsApiGrpc.getStopAllOutboundSmsGroupsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getStopAllOutboundSmsGroupsMethod = SmsApiGrpc.getStopAllOutboundSmsGroupsMethod) == null) {
          SmsApiGrpc.getStopAllOutboundSmsGroupsMethod = getStopAllOutboundSmsGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "StopAllOutboundSmsGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("StopAllOutboundSmsGroups"))
                  .build();
          }
        }
     }
     return getStopAllOutboundSmsGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> getStopAllInboundSmsGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAllInboundSmsGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> getStopAllInboundSmsGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> getStopAllInboundSmsGroupsMethod;
    if ((getStopAllInboundSmsGroupsMethod = SmsApiGrpc.getStopAllInboundSmsGroupsMethod) == null) {
      synchronized (SmsApiGrpc.class) {
        if ((getStopAllInboundSmsGroupsMethod = SmsApiGrpc.getStopAllInboundSmsGroupsMethod) == null) {
          SmsApiGrpc.getStopAllInboundSmsGroupsMethod = getStopAllInboundSmsGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq, com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.SmsApi", "StopAllInboundSmsGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SmsApiMethodDescriptorSupplier("StopAllInboundSmsGroups"))
                  .build();
          }
        }
     }
     return getStopAllInboundSmsGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmsApiStub newStub(io.grpc.Channel channel) {
    return new SmsApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmsApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmsApiFutureStub(channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class SmsApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List Sms Templates  defined by ListSmsTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsTemplatesRes messages
     * containing SmsTemplates with SmsIntents
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsTemplate defined by CreateSmsTemplateReq message.
     * The method will return a CreateSmsTemplateRes message that will
     * contain the newly created values of the sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a SmsTemplate defined by UpdateSmsTemplateReq message for
     * the specified sms_template_sid
     * will update the following
     * sms template fields:
     *    MessageSid
     *    SmsTemplateIntentSid
     * The method will return a UpdateSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsTemplate defined by DeleteSmsTemplateReq message for
     * the specified sms_template_id
     * The method will return a DeleteSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsTemplate defined by GetSmsTemplateBySidReq message for the specified
     * sms_template_sid.
     * The method will return a SmsTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsTemplateBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms IntentTemplates  defined by ListSmsIntentTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsIntentTemplatesRes messages
     * containing ActionKey, ActionDetails, ActionTriggers, ActionPriority
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsIntentTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsIntentTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsIntentTemplate defined by SmsIntentTemplate message.
     * The method will return a CreateSmsIntentTemplateRes message that will
     * contain the newly created values of the sms_intent_template_sid
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsIntentTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a SmsIntentTemplate defined by SmsIntentTemplate message for
     * the specified sms_intent_template_sid
     * will update the following
     * sms intent template fields:
     *    ActionKey
     *    ActionDetails
     *    ActionTrigger
     * The method will return a UpdateSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsIntentTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsIntentTemplate defined by DeleteSmsIntentTemplateReq message for
     * the specified sms_intent_template_id
     * The method will return a DeleteSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSmsIntentTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsIntentTemplate group defined by GetSmsIntentTemplateBySidReq message for the specified
     * sms_intent_template_sid.
     * The method will return a SmsIntentTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsIntentTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsIntentTemplateBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms SourceNumbers  defined by ListSmsSourceNumbersReq message.
     * Gets all source numbers belong to the clientsid
     * The method will return a stream of ListSmsSourceNumbersRes messages
     * containing providername, providertype
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsSourceNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsSourceNumbersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsSourceNumber defined by CreateSmsSourceNumberReq message.
     * The method will return a CreateSmsSourceNumberRes message that will
     * contain the newly created values of the sms_number_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsSourceNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a SmsSourceNumber defined by UpdateSmsSourceNumberReq message for
     * the specified sms_number_sid
     * will update the following
     * sms number fields:
     *    CountrySid
     *    ProviderName
     *    NumberType
     * The method will return a UpdateSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsSourceNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsSourceNumber defined by DeleteSmsSourceNumberReq message for
     * the specified sms_number_id
     * The method will return a DeleteSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSmsSourceNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * get sms source number for the particular sid
     * Gets an SmsSource Number defined by GetSmsSourceNumberBySidReq message for the specified
     * sms_number_sid.
     * The method will return a SmsNumbers group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsSourceNumberBySid(com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsNumbers> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsSourceNumberBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send sms notification defined by SendSmsNotificationReq message for the specified
     * message and array of phone num.
     * The method will return a stream of SendSmsNotificationRes messages
     * containing result true/false after notified by sms for the client.
     * Required permissions:
     *      VIEW_SMS
     * </pre>
     */
    public void sendSmsNotification(com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSmsNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the clientsid  with filters
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsGroupByFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsGroupsByGroupSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsTasksByGroupSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the owner path with filters for audit
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupByFiltersForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsGroupByFiltersForAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupsByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsGroupsByGroupSidsForAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsTasksByGroupSidsForAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksWithDetailedStatusReq message.
     * Gets all details for the specified sms group sid.
     * The method will return a stream of ListSmsTasksWithDetailedStatusRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksWithDetailedStatus(com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsTasksWithDetailedStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * paused/unpaused/cancel status
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupStatus(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsGroupStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * pacing
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupSendsPerMinute(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsGroupSendsPerMinuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * schedule_time
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupScheduleTimes(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsGroupScheduleTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Sms group defined by ScheduleSmsReq message for the specified
     * sms_template_id with initialpace, sourcenumber, contactgroupsid
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleSms(com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Re-Schedule Sms group defined by ResendUnconnectedSmsReq message for the specified
     * sms_group_id and start/stop time.
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void resendUnconnectedSms(com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getResendUnconnectedSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search SMS activity defined by SmsActivitySearchReq message for
     * any of the following filters:
     * ClientSid, ToNumber and FromNumber, FromDate, ToDate, SentOnly
     * The method will return the Sms Group with Sms Task &amp; Sms Intent Info
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void smsActivitySearch(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSmsActivitySearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsTemplate defined by CreateInboundSmsTemplateReq message.
     * The method will return a CreateInboundSmsTemplateRes message that will
     * contain the newly created values of the inbound_sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInboundSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a InboundSmsTemplate defined by UpdateInboundSmsTemplateReq message for
     * the specified sms_template_id, region_id and org_id
     * will update the following
     * inbound sms template fields:
     *    TemplateId
     *    SmsTemplateIntentId
     * The method will return a UpdateInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInboundSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsTemplate defined by DeleteInboundSmsTemplateReq message for
     * the specified inbound_sms_template_id, region_id and org_id
     * The method will return a DeleteInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInboundSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsTemplate  defined by ListInboundSmsTemplatesReq message.
     * Gets all of the Inbound sms template specified according to the filters.
     * The method will return a stream of ListInboundSmsTemplatesRes messages
     * containing InboundSmsTemplate, and SMSIntent
     * belonging to the inbound smstemplate.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListInboundSmsTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSmsTemplate group defined by GetInboundSmsTemplateByIdReq message for the specified
     * inbound_sms_template_id, region_id and org_id.
     * The method will return a InboundTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getInboundSmsTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInboundSmsTemplateByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsGroup defined by CreateInboundSmsGroupReq message.
     * The method will return a CreateInboundSmsGroupRes message that will
     * contain the newly created values of the inbound_sms_group_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a InboundSmsGroup defined by UpdateInboundSmsGroupReq message for
     * the specified sms_group_id, region_id and org_id
     * will update the following
     * inbound sms group fields:
     *    TemplateId
     *    SmsNumber
     * The method will return a UpdateInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsGroup defined by DeleteInboundSmsGroupReq message for
     * the specified inbound_sms_group_id, region_id and org_id
     * The method will return a DeleteInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of ListInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListInboundSmsGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Active InboundSmsGroup  defined by ListActiveInboundSmsGroupsReq message.
     * Gets active Inbound sms group specified according to the filters.
     * The method will return a stream of ListActiveInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listActiveInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListActiveInboundSmsGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by InboundSmsGroupByFiltersReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of InboundSmsGroupByFiltersRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListInboundSmsGroupByFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSms group defined by GetInboundSmsGroupByIdReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will return a InboundSms group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getInboundSmsGroupById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInboundSmsGroupByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsByGroupIdsReq message.
     * Gets all of the Inbound sms group specified for the groupids array.
     * The method will return a stream of ListInboundSmsGroupsByGroupIdsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListInboundSmsGroupsByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop an InboundSms group defined by StopInboundSmsGroupReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will mark the InboundSms group completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStopInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule InboundSms group defined by ScheduleInboundSmsReq message for the specified
     * inbound_sms_template_id and sms_number_sid.
     * The method will return a InboundSms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleInboundSms(com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleInboundSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversation defined by CreateSmsConversationReq message.
     * The method will return a CreateSmsConversationRes message that will
     * contain the newly created values of the sms_conversation_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversation(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a SmsConversation defined by UpdateSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * will update the following
     * conversation fields:
     *    InboundSmsGroupId
     *    SmsTaskParent
     * The method will return a UpdateSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsConversation(com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSmsConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsConversation defined by DeleteSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * The method will return a DeleteSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsConversation(com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSmsConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List SmsConversation profiles defined by ListSmsConversationsReq message.
     * Gets all of the unique sms conversations.
     * The method will return a stream of ListSmsConversationsRes messages
     * containing InboundSmsGroupId, and SmsTaskParent
     * belonging to the smsconversations.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversations(com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversation defined by GetSmsConversationByIdReq message for the specified
     * sms_conversation_id, region_id and org_id.
     * The method will return a SmsConversation.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsConversationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets SmsMessage defined by GetSmsMessageReq message for the specified
     * sms_message_sid.
     * The method will return a SmsMessage.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsMessage(com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAudit defined by SmsConversationAudit message.
     * The method will return a CreateSmsConversationAuditRes message that will
     * contain the newly created values of the sms_conversation_audit_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsConversationAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * List SmsConversationAudit profiles defined by ListSmsConversationAuditsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAuditsRes messages
     * containing SmsTaskSid, SmsReceivedReplySid and AgentId
     * belonging to the smsconversationsaudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversationAudits(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsConversationAuditsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAudit defined by GetSmsConversationAuditByIdReq message for the specified
     * sms_conversation_audit_id.
     * The method will return a SmsConversationAudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationAuditById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsConversationAuditByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAssignedAgent defined by SmsConversationAssignedAgent message.
     * The method will return a CreateSmsConversationAssignedAgentRes message with true or false
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversationAssignedAgent(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSmsConversationAssignedAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List SmsConversationAssignedAgent profiles defined by ListSmsConversationAssignedAgentsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAssignedAgentsRes messages
     * containing Assigned AgentId, Primary Agent, and Notiify
     * belonging to the smsconversationassignedagent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversationAssignedAgents(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsConversationAssignedAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAssignedAgent defined by GetSmsConversationAssignedAgentByIdReq message for the specified
     * conversation_id &amp; assigned_agent_id
     * The method will return a SmsConversationAssignedAgent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationAssignedAgentById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmsConversationAssignedAgentByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsTasks defined by ListInboundSmsTasksByGroupIdsReq message.
     * Gets all of the Inbound sms tasks for the groupids.
     * The method will return a stream of ListInboundSmsTasksByGroupIdsRes messages
     * containing InboundSmsTask
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListInboundSmsTasksByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop all OutboundSms groups defined by StopAllOutboundSmsGroupsReq message for the specified
     * array of outbound groups and client_sid.
     * The method will mark the OutboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopAllOutboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStopAllOutboundSmsGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop all InboundSms groups defined by StopAllInboundSmsGroupsReq message for the specified
     * array of inbound groups, region_id and org_id.
     * The method will mark the InboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopAllInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStopAllInboundSmsGroupsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSmsTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes>(
                  this, METHODID_LIST_SMS_TEMPLATES)))
          .addMethod(
            getCreateSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes>(
                  this, METHODID_CREATE_SMS_TEMPLATE)))
          .addMethod(
            getUpdateSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes>(
                  this, METHODID_UPDATE_SMS_TEMPLATE)))
          .addMethod(
            getDeleteSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes>(
                  this, METHODID_DELETE_SMS_TEMPLATE)))
          .addMethod(
            getGetSmsTemplateBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq,
                com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes>(
                  this, METHODID_GET_SMS_TEMPLATE_BY_SID)))
          .addMethod(
            getListSmsIntentTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes>(
                  this, METHODID_LIST_SMS_INTENT_TEMPLATES)))
          .addMethod(
            getCreateSmsIntentTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
                com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes>(
                  this, METHODID_CREATE_SMS_INTENT_TEMPLATE)))
          .addMethod(
            getUpdateSmsIntentTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes>(
                  this, METHODID_UPDATE_SMS_INTENT_TEMPLATE)))
          .addMethod(
            getDeleteSmsIntentTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq,
                com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes>(
                  this, METHODID_DELETE_SMS_INTENT_TEMPLATE)))
          .addMethod(
            getGetSmsIntentTemplateBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq,
                com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate>(
                  this, METHODID_GET_SMS_INTENT_TEMPLATE_BY_SID)))
          .addMethod(
            getListSmsSourceNumbersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes>(
                  this, METHODID_LIST_SMS_SOURCE_NUMBERS)))
          .addMethod(
            getCreateSmsSourceNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq,
                com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes>(
                  this, METHODID_CREATE_SMS_SOURCE_NUMBER)))
          .addMethod(
            getUpdateSmsSourceNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes>(
                  this, METHODID_UPDATE_SMS_SOURCE_NUMBER)))
          .addMethod(
            getDeleteSmsSourceNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq,
                com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes>(
                  this, METHODID_DELETE_SMS_SOURCE_NUMBER)))
          .addMethod(
            getGetSmsSourceNumberBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq,
                com.tcn.cloud.api.api.v0alpha.SmsNumbers>(
                  this, METHODID_GET_SMS_SOURCE_NUMBER_BY_SID)))
          .addMethod(
            getSendSmsNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq,
                com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes>(
                  this, METHODID_SEND_SMS_NOTIFICATION)))
          .addMethod(
            getListSmsGroupByFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>(
                  this, METHODID_LIST_SMS_GROUP_BY_FILTERS)))
          .addMethod(
            getListSmsGroupsByGroupSidsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>(
                  this, METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS)))
          .addMethod(
            getListSmsTasksByGroupSidsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>(
                  this, METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS)))
          .addMethod(
            getListSmsGroupByFiltersForAuditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>(
                  this, METHODID_LIST_SMS_GROUP_BY_FILTERS_FOR_AUDIT)))
          .addMethod(
            getListSmsGroupsByGroupSidsForAuditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>(
                  this, METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS_FOR_AUDIT)))
          .addMethod(
            getListSmsTasksByGroupSidsForAuditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>(
                  this, METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS_FOR_AUDIT)))
          .addMethod(
            getListSmsTasksWithDetailedStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes>(
                  this, METHODID_LIST_SMS_TASKS_WITH_DETAILED_STATUS)))
          .addMethod(
            getUpdateSmsGroupStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                  this, METHODID_UPDATE_SMS_GROUP_STATUS)))
          .addMethod(
            getUpdateSmsGroupSendsPerMinuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                  this, METHODID_UPDATE_SMS_GROUP_SENDS_PER_MINUTE)))
          .addMethod(
            getUpdateSmsGroupScheduleTimesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                  this, METHODID_UPDATE_SMS_GROUP_SCHEDULE_TIMES)))
          .addMethod(
            getScheduleSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq,
                com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes>(
                  this, METHODID_SCHEDULE_SMS)))
          .addMethod(
            getResendUnconnectedSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq,
                com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes>(
                  this, METHODID_RESEND_UNCONNECTED_SMS)))
          .addMethod(
            getSmsActivitySearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq,
                com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes>(
                  this, METHODID_SMS_ACTIVITY_SEARCH)))
          .addMethod(
            getCreateInboundSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes>(
                  this, METHODID_CREATE_INBOUND_SMS_TEMPLATE)))
          .addMethod(
            getUpdateInboundSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes>(
                  this, METHODID_UPDATE_INBOUND_SMS_TEMPLATE)))
          .addMethod(
            getDeleteInboundSmsTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq,
                com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes>(
                  this, METHODID_DELETE_INBOUND_SMS_TEMPLATE)))
          .addMethod(
            getListInboundSmsTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes>(
                  this, METHODID_LIST_INBOUND_SMS_TEMPLATES)))
          .addMethod(
            getGetInboundSmsTemplateByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq,
                com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes>(
                  this, METHODID_GET_INBOUND_SMS_TEMPLATE_BY_ID)))
          .addMethod(
            getCreateInboundSmsGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq,
                com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes>(
                  this, METHODID_CREATE_INBOUND_SMS_GROUP)))
          .addMethod(
            getUpdateInboundSmsGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes>(
                  this, METHODID_UPDATE_INBOUND_SMS_GROUP)))
          .addMethod(
            getDeleteInboundSmsGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq,
                com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes>(
                  this, METHODID_DELETE_INBOUND_SMS_GROUP)))
          .addMethod(
            getListInboundSmsGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes>(
                  this, METHODID_LIST_INBOUND_SMS_GROUPS)))
          .addMethod(
            getListActiveInboundSmsGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes>(
                  this, METHODID_LIST_ACTIVE_INBOUND_SMS_GROUPS)))
          .addMethod(
            getListInboundSmsGroupByFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes>(
                  this, METHODID_LIST_INBOUND_SMS_GROUP_BY_FILTERS)))
          .addMethod(
            getGetInboundSmsGroupByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq,
                com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes>(
                  this, METHODID_GET_INBOUND_SMS_GROUP_BY_ID)))
          .addMethod(
            getListInboundSmsGroupsByGroupIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes>(
                  this, METHODID_LIST_INBOUND_SMS_GROUPS_BY_GROUP_IDS)))
          .addMethod(
            getStopInboundSmsGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq,
                com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes>(
                  this, METHODID_STOP_INBOUND_SMS_GROUP)))
          .addMethod(
            getScheduleInboundSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq,
                com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes>(
                  this, METHODID_SCHEDULE_INBOUND_SMS)))
          .addMethod(
            getCreateSmsConversationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq,
                com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes>(
                  this, METHODID_CREATE_SMS_CONVERSATION)))
          .addMethod(
            getUpdateSmsConversationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq,
                com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes>(
                  this, METHODID_UPDATE_SMS_CONVERSATION)))
          .addMethod(
            getDeleteSmsConversationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq,
                com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes>(
                  this, METHODID_DELETE_SMS_CONVERSATION)))
          .addMethod(
            getListSmsConversationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes>(
                  this, METHODID_LIST_SMS_CONVERSATIONS)))
          .addMethod(
            getGetSmsConversationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq,
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes>(
                  this, METHODID_GET_SMS_CONVERSATION_BY_ID)))
          .addMethod(
            getGetSmsMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq,
                com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes>(
                  this, METHODID_GET_SMS_MESSAGE)))
          .addMethod(
            getCreateSmsConversationAuditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsConversationAudit,
                com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes>(
                  this, METHODID_CREATE_SMS_CONVERSATION_AUDIT)))
          .addMethod(
            getListSmsConversationAuditsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes>(
                  this, METHODID_LIST_SMS_CONVERSATION_AUDITS)))
          .addMethod(
            getGetSmsConversationAuditByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq,
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes>(
                  this, METHODID_GET_SMS_CONVERSATION_AUDIT_BY_ID)))
          .addMethod(
            getCreateSmsConversationAssignedAgentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent,
                com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes>(
                  this, METHODID_CREATE_SMS_CONVERSATION_ASSIGNED_AGENT)))
          .addMethod(
            getListSmsConversationAssignedAgentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes>(
                  this, METHODID_LIST_SMS_CONVERSATION_ASSIGNED_AGENTS)))
          .addMethod(
            getGetSmsConversationAssignedAgentByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq,
                com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes>(
                  this, METHODID_GET_SMS_CONVERSATION_ASSIGNED_AGENT_BY_ID)))
          .addMethod(
            getListInboundSmsTasksByGroupIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes>(
                  this, METHODID_LIST_INBOUND_SMS_TASKS_BY_GROUP_IDS)))
          .addMethod(
            getStopAllOutboundSmsGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq,
                com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes>(
                  this, METHODID_STOP_ALL_OUTBOUND_SMS_GROUPS)))
          .addMethod(
            getStopAllInboundSmsGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq,
                com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes>(
                  this, METHODID_STOP_ALL_INBOUND_SMS_GROUPS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiStub extends io.grpc.stub.AbstractStub<SmsApiStub> {
    private SmsApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * List Sms Templates  defined by ListSmsTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsTemplatesRes messages
     * containing SmsTemplates with SmsIntents
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsTemplate defined by CreateSmsTemplateReq message.
     * The method will return a CreateSmsTemplateRes message that will
     * contain the newly created values of the sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a SmsTemplate defined by UpdateSmsTemplateReq message for
     * the specified sms_template_sid
     * will update the following
     * sms template fields:
     *    MessageSid
     *    SmsTemplateIntentSid
     * The method will return a UpdateSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsTemplate defined by DeleteSmsTemplateReq message for
     * the specified sms_template_id
     * The method will return a DeleteSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsTemplate defined by GetSmsTemplateBySidReq message for the specified
     * sms_template_sid.
     * The method will return a SmsTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsTemplateBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms IntentTemplates  defined by ListSmsIntentTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsIntentTemplatesRes messages
     * containing ActionKey, ActionDetails, ActionTriggers, ActionPriority
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsIntentTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsIntentTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsIntentTemplate defined by SmsIntentTemplate message.
     * The method will return a CreateSmsIntentTemplateRes message that will
     * contain the newly created values of the sms_intent_template_sid
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsIntentTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a SmsIntentTemplate defined by SmsIntentTemplate message for
     * the specified sms_intent_template_sid
     * will update the following
     * sms intent template fields:
     *    ActionKey
     *    ActionDetails
     *    ActionTrigger
     * The method will return a UpdateSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsIntentTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsIntentTemplate defined by DeleteSmsIntentTemplateReq message for
     * the specified sms_intent_template_id
     * The method will return a DeleteSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSmsIntentTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsIntentTemplate group defined by GetSmsIntentTemplateBySidReq message for the specified
     * sms_intent_template_sid.
     * The method will return a SmsIntentTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsIntentTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsIntentTemplateBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms SourceNumbers  defined by ListSmsSourceNumbersReq message.
     * Gets all source numbers belong to the clientsid
     * The method will return a stream of ListSmsSourceNumbersRes messages
     * containing providername, providertype
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsSourceNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsSourceNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsSourceNumber defined by CreateSmsSourceNumberReq message.
     * The method will return a CreateSmsSourceNumberRes message that will
     * contain the newly created values of the sms_number_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsSourceNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a SmsSourceNumber defined by UpdateSmsSourceNumberReq message for
     * the specified sms_number_sid
     * will update the following
     * sms number fields:
     *    CountrySid
     *    ProviderName
     *    NumberType
     * The method will return a UpdateSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsSourceNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsSourceNumber defined by DeleteSmsSourceNumberReq message for
     * the specified sms_number_id
     * The method will return a DeleteSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSmsSourceNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get sms source number for the particular sid
     * Gets an SmsSource Number defined by GetSmsSourceNumberBySidReq message for the specified
     * sms_number_sid.
     * The method will return a SmsNumbers group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsSourceNumberBySid(com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsNumbers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsSourceNumberBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send sms notification defined by SendSmsNotificationReq message for the specified
     * message and array of phone num.
     * The method will return a stream of SendSmsNotificationRes messages
     * containing result true/false after notified by sms for the client.
     * Required permissions:
     *      VIEW_SMS
     * </pre>
     */
    public void sendSmsNotification(com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSmsNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the clientsid  with filters
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsGroupByFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsGroupsByGroupSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsTasksByGroupSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the owner path with filters for audit
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupByFiltersForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsGroupByFiltersForAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsGroupsByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsGroupsByGroupSidsForAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsTasksByGroupSidsForAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksWithDetailedStatusReq message.
     * Gets all details for the specified sms group sid.
     * The method will return a stream of ListSmsTasksWithDetailedStatusRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsTasksWithDetailedStatus(com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsTasksWithDetailedStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * paused/unpaused/cancel status
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupStatus(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsGroupStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * pacing
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupSendsPerMinute(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsGroupSendsPerMinuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * schedule_time
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void updateSmsGroupScheduleTimes(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsGroupScheduleTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule Sms group defined by ScheduleSmsReq message for the specified
     * sms_template_id with initialpace, sourcenumber, contactgroupsid
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleSms(com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-Schedule Sms group defined by ResendUnconnectedSmsReq message for the specified
     * sms_group_id and start/stop time.
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void resendUnconnectedSms(com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResendUnconnectedSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search SMS activity defined by SmsActivitySearchReq message for
     * any of the following filters:
     * ClientSid, ToNumber and FromNumber, FromDate, ToDate, SentOnly
     * The method will return the Sms Group with Sms Task &amp; Sms Intent Info
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void smsActivitySearch(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSmsActivitySearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsTemplate defined by CreateInboundSmsTemplateReq message.
     * The method will return a CreateInboundSmsTemplateRes message that will
     * contain the newly created values of the inbound_sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInboundSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a InboundSmsTemplate defined by UpdateInboundSmsTemplateReq message for
     * the specified sms_template_id, region_id and org_id
     * will update the following
     * inbound sms template fields:
     *    TemplateId
     *    SmsTemplateIntentId
     * The method will return a UpdateInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInboundSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsTemplate defined by DeleteInboundSmsTemplateReq message for
     * the specified inbound_sms_template_id, region_id and org_id
     * The method will return a DeleteInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInboundSmsTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsTemplate  defined by ListInboundSmsTemplatesReq message.
     * Gets all of the Inbound sms template specified according to the filters.
     * The method will return a stream of ListInboundSmsTemplatesRes messages
     * containing InboundSmsTemplate, and SMSIntent
     * belonging to the inbound smstemplate.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInboundSmsTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSmsTemplate group defined by GetInboundSmsTemplateByIdReq message for the specified
     * inbound_sms_template_id, region_id and org_id.
     * The method will return a InboundTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getInboundSmsTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInboundSmsTemplateByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsGroup defined by CreateInboundSmsGroupReq message.
     * The method will return a CreateInboundSmsGroupRes message that will
     * contain the newly created values of the inbound_sms_group_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInboundSmsGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a InboundSmsGroup defined by UpdateInboundSmsGroupReq message for
     * the specified sms_group_id, region_id and org_id
     * will update the following
     * inbound sms group fields:
     *    TemplateId
     *    SmsNumber
     * The method will return a UpdateInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateInboundSmsGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsGroup defined by DeleteInboundSmsGroupReq message for
     * the specified inbound_sms_group_id, region_id and org_id
     * The method will return a DeleteInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInboundSmsGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of ListInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInboundSmsGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Active InboundSmsGroup  defined by ListActiveInboundSmsGroupsReq message.
     * Gets active Inbound sms group specified according to the filters.
     * The method will return a stream of ListActiveInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listActiveInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListActiveInboundSmsGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by InboundSmsGroupByFiltersReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of InboundSmsGroupByFiltersRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInboundSmsGroupByFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSms group defined by GetInboundSmsGroupByIdReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will return a InboundSms group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getInboundSmsGroupById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInboundSmsGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsByGroupIdsReq message.
     * Gets all of the Inbound sms group specified for the groupids array.
     * The method will return a stream of ListInboundSmsGroupsByGroupIdsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInboundSmsGroupsByGroupIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop an InboundSms group defined by StopInboundSmsGroupReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will mark the InboundSms group completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopInboundSmsGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule InboundSms group defined by ScheduleInboundSmsReq message for the specified
     * inbound_sms_template_id and sms_number_sid.
     * The method will return a InboundSms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleInboundSms(com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleInboundSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversation defined by CreateSmsConversationReq message.
     * The method will return a CreateSmsConversationRes message that will
     * contain the newly created values of the sms_conversation_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversation(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a SmsConversation defined by UpdateSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * will update the following
     * conversation fields:
     *    InboundSmsGroupId
     *    SmsTaskParent
     * The method will return a UpdateSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void updateSmsConversation(com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSmsConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsConversation defined by DeleteSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * The method will return a DeleteSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void deleteSmsConversation(com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSmsConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List SmsConversation profiles defined by ListSmsConversationsReq message.
     * Gets all of the unique sms conversations.
     * The method will return a stream of ListSmsConversationsRes messages
     * containing InboundSmsGroupId, and SmsTaskParent
     * belonging to the smsconversations.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversations(com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversation defined by GetSmsConversationByIdReq message for the specified
     * sms_conversation_id, region_id and org_id.
     * The method will return a SmsConversation.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsConversationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets SmsMessage defined by GetSmsMessageReq message for the specified
     * sms_message_sid.
     * The method will return a SmsMessage.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsMessage(com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAudit defined by SmsConversationAudit message.
     * The method will return a CreateSmsConversationAuditRes message that will
     * contain the newly created values of the sms_conversation_audit_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsConversationAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List SmsConversationAudit profiles defined by ListSmsConversationAuditsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAuditsRes messages
     * containing SmsTaskSid, SmsReceivedReplySid and AgentId
     * belonging to the smsconversationsaudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversationAudits(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsConversationAuditsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAudit defined by GetSmsConversationAuditByIdReq message for the specified
     * sms_conversation_audit_id.
     * The method will return a SmsConversationAudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationAuditById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsConversationAuditByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAssignedAgent defined by SmsConversationAssignedAgent message.
     * The method will return a CreateSmsConversationAssignedAgentRes message with true or false
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void createSmsConversationAssignedAgent(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSmsConversationAssignedAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List SmsConversationAssignedAgent profiles defined by ListSmsConversationAssignedAgentsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAssignedAgentsRes messages
     * containing Assigned AgentId, Primary Agent, and Notiify
     * belonging to the smsconversationassignedagent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listSmsConversationAssignedAgents(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsConversationAssignedAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAssignedAgent defined by GetSmsConversationAssignedAgentByIdReq message for the specified
     * conversation_id &amp; assigned_agent_id
     * The method will return a SmsConversationAssignedAgent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void getSmsConversationAssignedAgentById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmsConversationAssignedAgentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List InboundSmsTasks defined by ListInboundSmsTasksByGroupIdsReq message.
     * Gets all of the Inbound sms tasks for the groupids.
     * The method will return a stream of ListInboundSmsTasksByGroupIdsRes messages
     * containing InboundSmsTask
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void listInboundSmsTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInboundSmsTasksByGroupIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop all OutboundSms groups defined by StopAllOutboundSmsGroupsReq message for the specified
     * array of outbound groups and client_sid.
     * The method will mark the OutboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopAllOutboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopAllOutboundSmsGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop all InboundSms groups defined by StopAllInboundSmsGroupsReq message for the specified
     * array of inbound groups, region_id and org_id.
     * The method will mark the InboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public void stopAllInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopAllInboundSmsGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiBlockingStub extends io.grpc.stub.AbstractStub<SmsApiBlockingStub> {
    private SmsApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List Sms Templates  defined by ListSmsTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsTemplatesRes messages
     * containing SmsTemplates with SmsIntents
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes listSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsTemplate defined by CreateSmsTemplateReq message.
     * The method will return a CreateSmsTemplateRes message that will
     * contain the newly created values of the sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes createSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a SmsTemplate defined by UpdateSmsTemplateReq message for
     * the specified sms_template_sid
     * will update the following
     * sms template fields:
     *    MessageSid
     *    SmsTemplateIntentSid
     * The method will return a UpdateSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes updateSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a SmsTemplate defined by DeleteSmsTemplateReq message for
     * the specified sms_template_id
     * The method will return a DeleteSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes deleteSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an SmsTemplate defined by GetSmsTemplateBySidReq message for the specified
     * sms_template_sid.
     * The method will return a SmsTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes getSmsTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsTemplateBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms IntentTemplates  defined by ListSmsIntentTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsIntentTemplatesRes messages
     * containing ActionKey, ActionDetails, ActionTriggers, ActionPriority
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes listSmsIntentTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsIntentTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsIntentTemplate defined by SmsIntentTemplate message.
     * The method will return a CreateSmsIntentTemplateRes message that will
     * contain the newly created values of the sms_intent_template_sid
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes createSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsIntentTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a SmsIntentTemplate defined by SmsIntentTemplate message for
     * the specified sms_intent_template_sid
     * will update the following
     * sms intent template fields:
     *    ActionKey
     *    ActionDetails
     *    ActionTrigger
     * The method will return a UpdateSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes updateSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsIntentTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a SmsIntentTemplate defined by DeleteSmsIntentTemplateReq message for
     * the specified sms_intent_template_id
     * The method will return a DeleteSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes deleteSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSmsIntentTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an SmsIntentTemplate group defined by GetSmsIntentTemplateBySidReq message for the specified
     * sms_intent_template_sid.
     * The method will return a SmsIntentTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate getSmsIntentTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsIntentTemplateBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms SourceNumbers  defined by ListSmsSourceNumbersReq message.
     * Gets all source numbers belong to the clientsid
     * The method will return a stream of ListSmsSourceNumbersRes messages
     * containing providername, providertype
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes listSmsSourceNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsSourceNumbersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsSourceNumber defined by CreateSmsSourceNumberReq message.
     * The method will return a CreateSmsSourceNumberRes message that will
     * contain the newly created values of the sms_number_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes createSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsSourceNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a SmsSourceNumber defined by UpdateSmsSourceNumberReq message for
     * the specified sms_number_sid
     * will update the following
     * sms number fields:
     *    CountrySid
     *    ProviderName
     *    NumberType
     * The method will return a UpdateSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes updateSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsSourceNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a SmsSourceNumber defined by DeleteSmsSourceNumberReq message for
     * the specified sms_number_id
     * The method will return a DeleteSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes deleteSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSmsSourceNumberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get sms source number for the particular sid
     * Gets an SmsSource Number defined by GetSmsSourceNumberBySidReq message for the specified
     * sms_number_sid.
     * The method will return a SmsNumbers group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsNumbers getSmsSourceNumberBySid(com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsSourceNumberBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send sms notification defined by SendSmsNotificationReq message for the specified
     * message and array of phone num.
     * The method will return a stream of SendSmsNotificationRes messages
     * containing result true/false after notified by sms for the client.
     * Required permissions:
     *      VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes sendSmsNotification(com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq request) {
      return blockingUnaryCall(
          getChannel(), getSendSmsNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the clientsid  with filters
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes listSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsGroupByFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes listSmsGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsGroupsByGroupSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes listSmsTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsTasksByGroupSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the owner path with filters for audit
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes listSmsGroupByFiltersForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsGroupByFiltersForAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes listSmsGroupsByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsGroupsByGroupSidsForAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes listSmsTasksByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsTasksByGroupSidsForAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksWithDetailedStatusReq message.
     * Gets all details for the specified sms group sid.
     * The method will return a stream of ListSmsTasksWithDetailedStatusRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes listSmsTasksWithDetailedStatus(com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsTasksWithDetailedStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * paused/unpaused/cancel status
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes updateSmsGroupStatus(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsGroupStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * pacing
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes updateSmsGroupSendsPerMinute(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsGroupSendsPerMinuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * schedule_time
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes updateSmsGroupScheduleTimes(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsGroupScheduleTimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule Sms group defined by ScheduleSmsReq message for the specified
     * sms_template_id with initialpace, sourcenumber, contactgroupsid
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes scheduleSms(com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getScheduleSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-Schedule Sms group defined by ResendUnconnectedSmsReq message for the specified
     * sms_group_id and start/stop time.
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes resendUnconnectedSms(com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getResendUnconnectedSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search SMS activity defined by SmsActivitySearchReq message for
     * any of the following filters:
     * ClientSid, ToNumber and FromNumber, FromDate, ToDate, SentOnly
     * The method will return the Sms Group with Sms Task &amp; Sms Intent Info
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes smsActivitySearch(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq request) {
      return blockingUnaryCall(
          getChannel(), getSmsActivitySearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsTemplate defined by CreateInboundSmsTemplateReq message.
     * The method will return a CreateInboundSmsTemplateRes message that will
     * contain the newly created values of the inbound_sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes createInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateInboundSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a InboundSmsTemplate defined by UpdateInboundSmsTemplateReq message for
     * the specified sms_template_id, region_id and org_id
     * will update the following
     * inbound sms template fields:
     *    TemplateId
     *    SmsTemplateIntentId
     * The method will return a UpdateInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes updateInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInboundSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a InboundSmsTemplate defined by DeleteInboundSmsTemplateReq message for
     * the specified inbound_sms_template_id, region_id and org_id
     * The method will return a DeleteInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes deleteInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInboundSmsTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List InboundSmsTemplate  defined by ListInboundSmsTemplatesReq message.
     * Gets all of the Inbound sms template specified according to the filters.
     * The method will return a stream of ListInboundSmsTemplatesRes messages
     * containing InboundSmsTemplate, and SMSIntent
     * belonging to the inbound smstemplate.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes listInboundSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq request) {
      return blockingUnaryCall(
          getChannel(), getListInboundSmsTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an InboundSmsTemplate group defined by GetInboundSmsTemplateByIdReq message for the specified
     * inbound_sms_template_id, region_id and org_id.
     * The method will return a InboundTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes getInboundSmsTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetInboundSmsTemplateByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsGroup defined by CreateInboundSmsGroupReq message.
     * The method will return a CreateInboundSmsGroupRes message that will
     * contain the newly created values of the inbound_sms_group_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes createInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateInboundSmsGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a InboundSmsGroup defined by UpdateInboundSmsGroupReq message for
     * the specified sms_group_id, region_id and org_id
     * will update the following
     * inbound sms group fields:
     *    TemplateId
     *    SmsNumber
     * The method will return a UpdateInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes updateInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateInboundSmsGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a InboundSmsGroup defined by DeleteInboundSmsGroupReq message for
     * the specified inbound_sms_group_id, region_id and org_id
     * The method will return a DeleteInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes deleteInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInboundSmsGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of ListInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes listInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getListInboundSmsGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Active InboundSmsGroup  defined by ListActiveInboundSmsGroupsReq message.
     * Gets active Inbound sms group specified according to the filters.
     * The method will return a stream of ListActiveInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes listActiveInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getListActiveInboundSmsGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by InboundSmsGroupByFiltersReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of InboundSmsGroupByFiltersRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes listInboundSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq request) {
      return blockingUnaryCall(
          getChannel(), getListInboundSmsGroupByFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an InboundSms group defined by GetInboundSmsGroupByIdReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will return a InboundSms group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes getInboundSmsGroupById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetInboundSmsGroupByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsByGroupIdsReq message.
     * Gets all of the Inbound sms group specified for the groupids array.
     * The method will return a stream of ListInboundSmsGroupsByGroupIdsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes listInboundSmsGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq request) {
      return blockingUnaryCall(
          getChannel(), getListInboundSmsGroupsByGroupIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop an InboundSms group defined by StopInboundSmsGroupReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will mark the InboundSms group completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes stopInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getStopInboundSmsGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule InboundSms group defined by ScheduleInboundSmsReq message for the specified
     * inbound_sms_template_id and sms_number_sid.
     * The method will return a InboundSms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes scheduleInboundSms(com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getScheduleInboundSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversation defined by CreateSmsConversationReq message.
     * The method will return a CreateSmsConversationRes message that will
     * contain the newly created values of the sms_conversation_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes createSmsConversation(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a SmsConversation defined by UpdateSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * will update the following
     * conversation fields:
     *    InboundSmsGroupId
     *    SmsTaskParent
     * The method will return a UpdateSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes updateSmsConversation(com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSmsConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a SmsConversation defined by DeleteSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * The method will return a DeleteSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes deleteSmsConversation(com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSmsConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List SmsConversation profiles defined by ListSmsConversationsReq message.
     * Gets all of the unique sms conversations.
     * The method will return a stream of ListSmsConversationsRes messages
     * containing InboundSmsGroupId, and SmsTaskParent
     * belonging to the smsconversations.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes listSmsConversations(com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a SmsConversation defined by GetSmsConversationByIdReq message for the specified
     * sms_conversation_id, region_id and org_id.
     * The method will return a SmsConversation.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes getSmsConversationById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsConversationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets SmsMessage defined by GetSmsMessageReq message for the specified
     * sms_message_sid.
     * The method will return a SmsMessage.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes getSmsMessage(com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAudit defined by SmsConversationAudit message.
     * The method will return a CreateSmsConversationAuditRes message that will
     * contain the newly created values of the sms_conversation_audit_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes createSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsConversationAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List SmsConversationAudit profiles defined by ListSmsConversationAuditsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAuditsRes messages
     * containing SmsTaskSid, SmsReceivedReplySid and AgentId
     * belonging to the smsconversationsaudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes listSmsConversationAudits(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsConversationAuditsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a SmsConversationAudit defined by GetSmsConversationAuditByIdReq message for the specified
     * sms_conversation_audit_id.
     * The method will return a SmsConversationAudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes getSmsConversationAuditById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsConversationAuditByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAssignedAgent defined by SmsConversationAssignedAgent message.
     * The method will return a CreateSmsConversationAssignedAgentRes message with true or false
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes createSmsConversationAssignedAgent(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent request) {
      return blockingUnaryCall(
          getChannel(), getCreateSmsConversationAssignedAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List SmsConversationAssignedAgent profiles defined by ListSmsConversationAssignedAgentsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAssignedAgentsRes messages
     * containing Assigned AgentId, Primary Agent, and Notiify
     * belonging to the smsconversationassignedagent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes listSmsConversationAssignedAgents(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsConversationAssignedAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a SmsConversationAssignedAgent defined by GetSmsConversationAssignedAgentByIdReq message for the specified
     * conversation_id &amp; assigned_agent_id
     * The method will return a SmsConversationAssignedAgent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes getSmsConversationAssignedAgentById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetSmsConversationAssignedAgentByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List InboundSmsTasks defined by ListInboundSmsTasksByGroupIdsReq message.
     * Gets all of the Inbound sms tasks for the groupids.
     * The method will return a stream of ListInboundSmsTasksByGroupIdsRes messages
     * containing InboundSmsTask
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes listInboundSmsTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq request) {
      return blockingUnaryCall(
          getChannel(), getListInboundSmsTasksByGroupIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop all OutboundSms groups defined by StopAllOutboundSmsGroupsReq message for the specified
     * array of outbound groups and client_sid.
     * The method will mark the OutboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes stopAllOutboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getStopAllOutboundSmsGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop all InboundSms groups defined by StopAllInboundSmsGroupsReq message for the specified
     * array of inbound groups, region_id and org_id.
     * The method will mark the InboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes stopAllInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getStopAllInboundSmsGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiFutureStub extends io.grpc.stub.AbstractStub<SmsApiFutureStub> {
    private SmsApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmsApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmsApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List Sms Templates  defined by ListSmsTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsTemplatesRes messages
     * containing SmsTemplates with SmsIntents
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> listSmsTemplates(
        com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsTemplate defined by CreateSmsTemplateReq message.
     * The method will return a CreateSmsTemplateRes message that will
     * contain the newly created values of the sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> createSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a SmsTemplate defined by UpdateSmsTemplateReq message for
     * the specified sms_template_sid
     * will update the following
     * sms template fields:
     *    MessageSid
     *    SmsTemplateIntentSid
     * The method will return a UpdateSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> updateSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a SmsTemplate defined by DeleteSmsTemplateReq message for
     * the specified sms_template_id
     * The method will return a DeleteSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> deleteSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an SmsTemplate defined by GetSmsTemplateBySidReq message for the specified
     * sms_template_sid.
     * The method will return a SmsTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> getSmsTemplateBySid(
        com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsTemplateBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms IntentTemplates  defined by ListSmsIntentTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsIntentTemplatesRes messages
     * containing ActionKey, ActionDetails, ActionTriggers, ActionPriority
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> listSmsIntentTemplates(
        com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsIntentTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsIntentTemplate defined by SmsIntentTemplate message.
     * The method will return a CreateSmsIntentTemplateRes message that will
     * contain the newly created values of the sms_intent_template_sid
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> createSmsIntentTemplate(
        com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsIntentTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a SmsIntentTemplate defined by SmsIntentTemplate message for
     * the specified sms_intent_template_sid
     * will update the following
     * sms intent template fields:
     *    ActionKey
     *    ActionDetails
     *    ActionTrigger
     * The method will return a UpdateSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> updateSmsIntentTemplate(
        com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsIntentTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a SmsIntentTemplate defined by DeleteSmsIntentTemplateReq message for
     * the specified sms_intent_template_id
     * The method will return a DeleteSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> deleteSmsIntentTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSmsIntentTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an SmsIntentTemplate group defined by GetSmsIntentTemplateBySidReq message for the specified
     * sms_intent_template_sid.
     * The method will return a SmsIntentTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getSmsIntentTemplateBySid(
        com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsIntentTemplateBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms SourceNumbers  defined by ListSmsSourceNumbersReq message.
     * Gets all source numbers belong to the clientsid
     * The method will return a stream of ListSmsSourceNumbersRes messages
     * containing providername, providertype
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> listSmsSourceNumbers(
        com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsSourceNumbersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsSourceNumber defined by CreateSmsSourceNumberReq message.
     * The method will return a CreateSmsSourceNumberRes message that will
     * contain the newly created values of the sms_number_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> createSmsSourceNumber(
        com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsSourceNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a SmsSourceNumber defined by UpdateSmsSourceNumberReq message for
     * the specified sms_number_sid
     * will update the following
     * sms number fields:
     *    CountrySid
     *    ProviderName
     *    NumberType
     * The method will return a UpdateSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> updateSmsSourceNumber(
        com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsSourceNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a SmsSourceNumber defined by DeleteSmsSourceNumberReq message for
     * the specified sms_number_id
     * The method will return a DeleteSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> deleteSmsSourceNumber(
        com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSmsSourceNumberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get sms source number for the particular sid
     * Gets an SmsSource Number defined by GetSmsSourceNumberBySidReq message for the specified
     * sms_number_sid.
     * The method will return a SmsNumbers group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SmsNumbers> getSmsSourceNumberBySid(
        com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsSourceNumberBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send sms notification defined by SendSmsNotificationReq message for the specified
     * message and array of phone num.
     * The method will return a stream of SendSmsNotificationRes messages
     * containing result true/false after notified by sms for the client.
     * Required permissions:
     *      VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> sendSmsNotification(
        com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSmsNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the clientsid  with filters
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> listSmsGroupByFilters(
        com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsGroupByFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> listSmsGroupsByGroupSids(
        com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsGroupsByGroupSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> listSmsTasksByGroupSids(
        com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsTasksByGroupSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupByFiltersReq message.
     * Gets all details belong to the owner path with filters for audit
     * The method will return a stream of ListSmsGroupByFiltersRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> listSmsGroupByFiltersForAudit(
        com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsGroupByFiltersForAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Group defined by ListSmsGroupsByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsGroupsByGroupSidsRes messages
     * containing SmsGroup Info and SMSIntent
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> listSmsGroupsByGroupSidsForAudit(
        com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsGroupsByGroupSidsForAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksByGroupSidsReq message.
     * Gets all details for the array of group sids for audit
     * The method will return a stream of ListSmsTasksByGroupSidsRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> listSmsTasksByGroupSidsForAudit(
        com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsTasksByGroupSidsForAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Sms Task  defined by ListSmsTasksWithDetailedStatusReq message.
     * Gets all details for the specified sms group sid.
     * The method will return a stream of ListSmsTasksWithDetailedStatusRes messages
     * containing delivery status, msg_time, cost
     * belonging to the smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> listSmsTasksWithDetailedStatus(
        com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsTasksWithDetailedStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * paused/unpaused/cancel status
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> updateSmsGroupStatus(
        com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsGroupStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * pacing
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> updateSmsGroupSendsPerMinute(
        com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsGroupSendsPerMinuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * schedule_time
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> updateSmsGroupScheduleTimes(
        com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsGroupScheduleTimesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule Sms group defined by ScheduleSmsReq message for the specified
     * sms_template_id with initialpace, sourcenumber, contactgroupsid
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> scheduleSms(
        com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-Schedule Sms group defined by ResendUnconnectedSmsReq message for the specified
     * sms_group_id and start/stop time.
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> resendUnconnectedSms(
        com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getResendUnconnectedSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search SMS activity defined by SmsActivitySearchReq message for
     * any of the following filters:
     * ClientSid, ToNumber and FromNumber, FromDate, ToDate, SentOnly
     * The method will return the Sms Group with Sms Task &amp; Sms Intent Info
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> smsActivitySearch(
        com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSmsActivitySearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsTemplate defined by CreateInboundSmsTemplateReq message.
     * The method will return a CreateInboundSmsTemplateRes message that will
     * contain the newly created values of the inbound_sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> createInboundSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInboundSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a InboundSmsTemplate defined by UpdateInboundSmsTemplateReq message for
     * the specified sms_template_id, region_id and org_id
     * will update the following
     * inbound sms template fields:
     *    TemplateId
     *    SmsTemplateIntentId
     * The method will return a UpdateInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> updateInboundSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInboundSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a InboundSmsTemplate defined by DeleteInboundSmsTemplateReq message for
     * the specified inbound_sms_template_id, region_id and org_id
     * The method will return a DeleteInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> deleteInboundSmsTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInboundSmsTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List InboundSmsTemplate  defined by ListInboundSmsTemplatesReq message.
     * Gets all of the Inbound sms template specified according to the filters.
     * The method will return a stream of ListInboundSmsTemplatesRes messages
     * containing InboundSmsTemplate, and SMSIntent
     * belonging to the inbound smstemplate.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> listInboundSmsTemplates(
        com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListInboundSmsTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an InboundSmsTemplate group defined by GetInboundSmsTemplateByIdReq message for the specified
     * inbound_sms_template_id, region_id and org_id.
     * The method will return a InboundTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> getInboundSmsTemplateById(
        com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInboundSmsTemplateByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsGroup defined by CreateInboundSmsGroupReq message.
     * The method will return a CreateInboundSmsGroupRes message that will
     * contain the newly created values of the inbound_sms_group_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> createInboundSmsGroup(
        com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInboundSmsGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a InboundSmsGroup defined by UpdateInboundSmsGroupReq message for
     * the specified sms_group_id, region_id and org_id
     * will update the following
     * inbound sms group fields:
     *    TemplateId
     *    SmsNumber
     * The method will return a UpdateInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> updateInboundSmsGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateInboundSmsGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a InboundSmsGroup defined by DeleteInboundSmsGroupReq message for
     * the specified inbound_sms_group_id, region_id and org_id
     * The method will return a DeleteInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> deleteInboundSmsGroup(
        com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInboundSmsGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of ListInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> listInboundSmsGroups(
        com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListInboundSmsGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Active InboundSmsGroup  defined by ListActiveInboundSmsGroupsReq message.
     * Gets active Inbound sms group specified according to the filters.
     * The method will return a stream of ListActiveInboundSmsGroupsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> listActiveInboundSmsGroups(
        com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListActiveInboundSmsGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by InboundSmsGroupByFiltersReq message.
     * Gets all of the Inbound sms group specified according to the filters.
     * The method will return a stream of InboundSmsGroupByFiltersRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> listInboundSmsGroupByFilters(
        com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListInboundSmsGroupByFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an InboundSms group defined by GetInboundSmsGroupByIdReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will return a InboundSms group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> getInboundSmsGroupById(
        com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInboundSmsGroupByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List InboundSmsGroup  defined by ListInboundSmsGroupsByGroupIdsReq message.
     * Gets all of the Inbound sms group specified for the groupids array.
     * The method will return a stream of ListInboundSmsGroupsByGroupIdsRes messages
     * containing InboundSmsGroup, and SMSIntent
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> listInboundSmsGroupsByGroupIds(
        com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListInboundSmsGroupsByGroupIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop an InboundSms group defined by StopInboundSmsGroupReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will mark the InboundSms group completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> stopInboundSmsGroup(
        com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStopInboundSmsGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule InboundSms group defined by ScheduleInboundSmsReq message for the specified
     * inbound_sms_template_id and sms_number_sid.
     * The method will return a InboundSms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> scheduleInboundSms(
        com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleInboundSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversation defined by CreateSmsConversationReq message.
     * The method will return a CreateSmsConversationRes message that will
     * contain the newly created values of the sms_conversation_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> createSmsConversation(
        com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a SmsConversation defined by UpdateSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * will update the following
     * conversation fields:
     *    InboundSmsGroupId
     *    SmsTaskParent
     * The method will return a UpdateSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> updateSmsConversation(
        com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSmsConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a SmsConversation defined by DeleteSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * The method will return a DeleteSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> deleteSmsConversation(
        com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSmsConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List SmsConversation profiles defined by ListSmsConversationsReq message.
     * Gets all of the unique sms conversations.
     * The method will return a stream of ListSmsConversationsRes messages
     * containing InboundSmsGroupId, and SmsTaskParent
     * belonging to the smsconversations.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> listSmsConversations(
        com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a SmsConversation defined by GetSmsConversationByIdReq message for the specified
     * sms_conversation_id, region_id and org_id.
     * The method will return a SmsConversation.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> getSmsConversationById(
        com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsConversationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets SmsMessage defined by GetSmsMessageReq message for the specified
     * sms_message_sid.
     * The method will return a SmsMessage.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> getSmsMessage(
        com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAudit defined by SmsConversationAudit message.
     * The method will return a CreateSmsConversationAuditRes message that will
     * contain the newly created values of the sms_conversation_audit_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> createSmsConversationAudit(
        com.tcn.cloud.api.api.v0alpha.SmsConversationAudit request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsConversationAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List SmsConversationAudit profiles defined by ListSmsConversationAuditsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAuditsRes messages
     * containing SmsTaskSid, SmsReceivedReplySid and AgentId
     * belonging to the smsconversationsaudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> listSmsConversationAudits(
        com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsConversationAuditsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a SmsConversationAudit defined by GetSmsConversationAuditByIdReq message for the specified
     * sms_conversation_audit_id.
     * The method will return a SmsConversationAudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> getSmsConversationAuditById(
        com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsConversationAuditByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAssignedAgent defined by SmsConversationAssignedAgent message.
     * The method will return a CreateSmsConversationAssignedAgentRes message with true or false
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> createSmsConversationAssignedAgent(
        com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSmsConversationAssignedAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List SmsConversationAssignedAgent profiles defined by ListSmsConversationAssignedAgentsReq message.
     * Gets all of the values for sms conversations id.
     * The method will return a stream of ListSmsConversationAssignedAgentsRes messages
     * containing Assigned AgentId, Primary Agent, and Notiify
     * belonging to the smsconversationassignedagent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> listSmsConversationAssignedAgents(
        com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsConversationAssignedAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a SmsConversationAssignedAgent defined by GetSmsConversationAssignedAgentByIdReq message for the specified
     * conversation_id &amp; assigned_agent_id
     * The method will return a SmsConversationAssignedAgent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> getSmsConversationAssignedAgentById(
        com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmsConversationAssignedAgentByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List InboundSmsTasks defined by ListInboundSmsTasksByGroupIdsReq message.
     * Gets all of the Inbound sms tasks for the groupids.
     * The method will return a stream of ListInboundSmsTasksByGroupIdsRes messages
     * containing InboundSmsTask
     * belonging to the inbound smsgroup.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> listInboundSmsTasksByGroupIds(
        com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListInboundSmsTasksByGroupIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop all OutboundSms groups defined by StopAllOutboundSmsGroupsReq message for the specified
     * array of outbound groups and client_sid.
     * The method will mark the OutboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> stopAllOutboundSmsGroups(
        com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStopAllOutboundSmsGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop all InboundSms groups defined by StopAllInboundSmsGroupsReq message for the specified
     * array of inbound groups, region_id and org_id.
     * The method will mark the InboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> stopAllInboundSmsGroups(
        com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStopAllInboundSmsGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SMS_TEMPLATES = 0;
  private static final int METHODID_CREATE_SMS_TEMPLATE = 1;
  private static final int METHODID_UPDATE_SMS_TEMPLATE = 2;
  private static final int METHODID_DELETE_SMS_TEMPLATE = 3;
  private static final int METHODID_GET_SMS_TEMPLATE_BY_SID = 4;
  private static final int METHODID_LIST_SMS_INTENT_TEMPLATES = 5;
  private static final int METHODID_CREATE_SMS_INTENT_TEMPLATE = 6;
  private static final int METHODID_UPDATE_SMS_INTENT_TEMPLATE = 7;
  private static final int METHODID_DELETE_SMS_INTENT_TEMPLATE = 8;
  private static final int METHODID_GET_SMS_INTENT_TEMPLATE_BY_SID = 9;
  private static final int METHODID_LIST_SMS_SOURCE_NUMBERS = 10;
  private static final int METHODID_CREATE_SMS_SOURCE_NUMBER = 11;
  private static final int METHODID_UPDATE_SMS_SOURCE_NUMBER = 12;
  private static final int METHODID_DELETE_SMS_SOURCE_NUMBER = 13;
  private static final int METHODID_GET_SMS_SOURCE_NUMBER_BY_SID = 14;
  private static final int METHODID_SEND_SMS_NOTIFICATION = 15;
  private static final int METHODID_LIST_SMS_GROUP_BY_FILTERS = 16;
  private static final int METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS = 17;
  private static final int METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS = 18;
  private static final int METHODID_LIST_SMS_GROUP_BY_FILTERS_FOR_AUDIT = 19;
  private static final int METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS_FOR_AUDIT = 20;
  private static final int METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS_FOR_AUDIT = 21;
  private static final int METHODID_LIST_SMS_TASKS_WITH_DETAILED_STATUS = 22;
  private static final int METHODID_UPDATE_SMS_GROUP_STATUS = 23;
  private static final int METHODID_UPDATE_SMS_GROUP_SENDS_PER_MINUTE = 24;
  private static final int METHODID_UPDATE_SMS_GROUP_SCHEDULE_TIMES = 25;
  private static final int METHODID_SCHEDULE_SMS = 26;
  private static final int METHODID_RESEND_UNCONNECTED_SMS = 27;
  private static final int METHODID_SMS_ACTIVITY_SEARCH = 28;
  private static final int METHODID_CREATE_INBOUND_SMS_TEMPLATE = 29;
  private static final int METHODID_UPDATE_INBOUND_SMS_TEMPLATE = 30;
  private static final int METHODID_DELETE_INBOUND_SMS_TEMPLATE = 31;
  private static final int METHODID_LIST_INBOUND_SMS_TEMPLATES = 32;
  private static final int METHODID_GET_INBOUND_SMS_TEMPLATE_BY_ID = 33;
  private static final int METHODID_CREATE_INBOUND_SMS_GROUP = 34;
  private static final int METHODID_UPDATE_INBOUND_SMS_GROUP = 35;
  private static final int METHODID_DELETE_INBOUND_SMS_GROUP = 36;
  private static final int METHODID_LIST_INBOUND_SMS_GROUPS = 37;
  private static final int METHODID_LIST_ACTIVE_INBOUND_SMS_GROUPS = 38;
  private static final int METHODID_LIST_INBOUND_SMS_GROUP_BY_FILTERS = 39;
  private static final int METHODID_GET_INBOUND_SMS_GROUP_BY_ID = 40;
  private static final int METHODID_LIST_INBOUND_SMS_GROUPS_BY_GROUP_IDS = 41;
  private static final int METHODID_STOP_INBOUND_SMS_GROUP = 42;
  private static final int METHODID_SCHEDULE_INBOUND_SMS = 43;
  private static final int METHODID_CREATE_SMS_CONVERSATION = 44;
  private static final int METHODID_UPDATE_SMS_CONVERSATION = 45;
  private static final int METHODID_DELETE_SMS_CONVERSATION = 46;
  private static final int METHODID_LIST_SMS_CONVERSATIONS = 47;
  private static final int METHODID_GET_SMS_CONVERSATION_BY_ID = 48;
  private static final int METHODID_GET_SMS_MESSAGE = 49;
  private static final int METHODID_CREATE_SMS_CONVERSATION_AUDIT = 50;
  private static final int METHODID_LIST_SMS_CONVERSATION_AUDITS = 51;
  private static final int METHODID_GET_SMS_CONVERSATION_AUDIT_BY_ID = 52;
  private static final int METHODID_CREATE_SMS_CONVERSATION_ASSIGNED_AGENT = 53;
  private static final int METHODID_LIST_SMS_CONVERSATION_ASSIGNED_AGENTS = 54;
  private static final int METHODID_GET_SMS_CONVERSATION_ASSIGNED_AGENT_BY_ID = 55;
  private static final int METHODID_LIST_INBOUND_SMS_TASKS_BY_GROUP_IDS = 56;
  private static final int METHODID_STOP_ALL_OUTBOUND_SMS_GROUPS = 57;
  private static final int METHODID_STOP_ALL_INBOUND_SMS_GROUPS = 58;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmsApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmsApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SMS_TEMPLATES:
          serviceImpl.listSmsTemplates((com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_TEMPLATE:
          serviceImpl.createSmsTemplate((com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_TEMPLATE:
          serviceImpl.updateSmsTemplate((com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_SMS_TEMPLATE:
          serviceImpl.deleteSmsTemplate((com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes>) responseObserver);
          break;
        case METHODID_GET_SMS_TEMPLATE_BY_SID:
          serviceImpl.getSmsTemplateBySid((com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_INTENT_TEMPLATES:
          serviceImpl.listSmsIntentTemplates((com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_INTENT_TEMPLATE:
          serviceImpl.createSmsIntentTemplate((com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_INTENT_TEMPLATE:
          serviceImpl.updateSmsIntentTemplate((com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_SMS_INTENT_TEMPLATE:
          serviceImpl.deleteSmsIntentTemplate((com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes>) responseObserver);
          break;
        case METHODID_GET_SMS_INTENT_TEMPLATE_BY_SID:
          serviceImpl.getSmsIntentTemplateBySid((com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate>) responseObserver);
          break;
        case METHODID_LIST_SMS_SOURCE_NUMBERS:
          serviceImpl.listSmsSourceNumbers((com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_SOURCE_NUMBER:
          serviceImpl.createSmsSourceNumber((com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_SOURCE_NUMBER:
          serviceImpl.updateSmsSourceNumber((com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes>) responseObserver);
          break;
        case METHODID_DELETE_SMS_SOURCE_NUMBER:
          serviceImpl.deleteSmsSourceNumber((com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes>) responseObserver);
          break;
        case METHODID_GET_SMS_SOURCE_NUMBER_BY_SID:
          serviceImpl.getSmsSourceNumberBySid((com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsNumbers>) responseObserver);
          break;
        case METHODID_SEND_SMS_NOTIFICATION:
          serviceImpl.sendSmsNotification((com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_GROUP_BY_FILTERS:
          serviceImpl.listSmsGroupByFilters((com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS:
          serviceImpl.listSmsGroupsByGroupSids((com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS:
          serviceImpl.listSmsTasksByGroupSids((com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_GROUP_BY_FILTERS_FOR_AUDIT:
          serviceImpl.listSmsGroupByFiltersForAudit((com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS_FOR_AUDIT:
          serviceImpl.listSmsGroupsByGroupSidsForAudit((com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS_FOR_AUDIT:
          serviceImpl.listSmsTasksByGroupSidsForAudit((com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_TASKS_WITH_DETAILED_STATUS:
          serviceImpl.listSmsTasksWithDetailedStatus((com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_GROUP_STATUS:
          serviceImpl.updateSmsGroupStatus((com.tcn.cloud.api.api.v0alpha.SmsGroupInfo) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_GROUP_SENDS_PER_MINUTE:
          serviceImpl.updateSmsGroupSendsPerMinute((com.tcn.cloud.api.api.v0alpha.SmsGroupInfo) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_GROUP_SCHEDULE_TIMES:
          serviceImpl.updateSmsGroupScheduleTimes((com.tcn.cloud.api.api.v0alpha.SmsGroupInfo) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>) responseObserver);
          break;
        case METHODID_SCHEDULE_SMS:
          serviceImpl.scheduleSms((com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes>) responseObserver);
          break;
        case METHODID_RESEND_UNCONNECTED_SMS:
          serviceImpl.resendUnconnectedSms((com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes>) responseObserver);
          break;
        case METHODID_SMS_ACTIVITY_SEARCH:
          serviceImpl.smsActivitySearch((com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes>) responseObserver);
          break;
        case METHODID_CREATE_INBOUND_SMS_TEMPLATE:
          serviceImpl.createInboundSmsTemplate((com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_INBOUND_SMS_TEMPLATE:
          serviceImpl.updateInboundSmsTemplate((com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_INBOUND_SMS_TEMPLATE:
          serviceImpl.deleteInboundSmsTemplate((com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_SMS_TEMPLATES:
          serviceImpl.listInboundSmsTemplates((com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes>) responseObserver);
          break;
        case METHODID_GET_INBOUND_SMS_TEMPLATE_BY_ID:
          serviceImpl.getInboundSmsTemplateById((com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes>) responseObserver);
          break;
        case METHODID_CREATE_INBOUND_SMS_GROUP:
          serviceImpl.createInboundSmsGroup((com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_INBOUND_SMS_GROUP:
          serviceImpl.updateInboundSmsGroup((com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes>) responseObserver);
          break;
        case METHODID_DELETE_INBOUND_SMS_GROUP:
          serviceImpl.deleteInboundSmsGroup((com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_SMS_GROUPS:
          serviceImpl.listInboundSmsGroups((com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_INBOUND_SMS_GROUPS:
          serviceImpl.listActiveInboundSmsGroups((com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_SMS_GROUP_BY_FILTERS:
          serviceImpl.listInboundSmsGroupByFilters((com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes>) responseObserver);
          break;
        case METHODID_GET_INBOUND_SMS_GROUP_BY_ID:
          serviceImpl.getInboundSmsGroupById((com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_SMS_GROUPS_BY_GROUP_IDS:
          serviceImpl.listInboundSmsGroupsByGroupIds((com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes>) responseObserver);
          break;
        case METHODID_STOP_INBOUND_SMS_GROUP:
          serviceImpl.stopInboundSmsGroup((com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes>) responseObserver);
          break;
        case METHODID_SCHEDULE_INBOUND_SMS:
          serviceImpl.scheduleInboundSms((com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_CONVERSATION:
          serviceImpl.createSmsConversation((com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes>) responseObserver);
          break;
        case METHODID_UPDATE_SMS_CONVERSATION:
          serviceImpl.updateSmsConversation((com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes>) responseObserver);
          break;
        case METHODID_DELETE_SMS_CONVERSATION:
          serviceImpl.deleteSmsConversation((com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_CONVERSATIONS:
          serviceImpl.listSmsConversations((com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes>) responseObserver);
          break;
        case METHODID_GET_SMS_CONVERSATION_BY_ID:
          serviceImpl.getSmsConversationById((com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes>) responseObserver);
          break;
        case METHODID_GET_SMS_MESSAGE:
          serviceImpl.getSmsMessage((com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_CONVERSATION_AUDIT:
          serviceImpl.createSmsConversationAudit((com.tcn.cloud.api.api.v0alpha.SmsConversationAudit) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_CONVERSATION_AUDITS:
          serviceImpl.listSmsConversationAudits((com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes>) responseObserver);
          break;
        case METHODID_GET_SMS_CONVERSATION_AUDIT_BY_ID:
          serviceImpl.getSmsConversationAuditById((com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes>) responseObserver);
          break;
        case METHODID_CREATE_SMS_CONVERSATION_ASSIGNED_AGENT:
          serviceImpl.createSmsConversationAssignedAgent((com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_CONVERSATION_ASSIGNED_AGENTS:
          serviceImpl.listSmsConversationAssignedAgents((com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes>) responseObserver);
          break;
        case METHODID_GET_SMS_CONVERSATION_ASSIGNED_AGENT_BY_ID:
          serviceImpl.getSmsConversationAssignedAgentById((com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_SMS_TASKS_BY_GROUP_IDS:
          serviceImpl.listInboundSmsTasksByGroupIds((com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes>) responseObserver);
          break;
        case METHODID_STOP_ALL_OUTBOUND_SMS_GROUPS:
          serviceImpl.stopAllOutboundSmsGroups((com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes>) responseObserver);
          break;
        case METHODID_STOP_ALL_INBOUND_SMS_GROUPS:
          serviceImpl.stopAllInboundSmsGroups((com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes>) responseObserver);
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

  private static abstract class SmsApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmsApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmsApi");
    }
  }

  private static final class SmsApiFileDescriptorSupplier
      extends SmsApiBaseDescriptorSupplier {
    SmsApiFileDescriptorSupplier() {}
  }

  private static final class SmsApiMethodDescriptorSupplier
      extends SmsApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmsApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmsApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmsApiFileDescriptorSupplier())
              .addMethod(getListSmsTemplatesMethod())
              .addMethod(getCreateSmsTemplateMethod())
              .addMethod(getUpdateSmsTemplateMethod())
              .addMethod(getDeleteSmsTemplateMethod())
              .addMethod(getGetSmsTemplateBySidMethod())
              .addMethod(getListSmsIntentTemplatesMethod())
              .addMethod(getCreateSmsIntentTemplateMethod())
              .addMethod(getUpdateSmsIntentTemplateMethod())
              .addMethod(getDeleteSmsIntentTemplateMethod())
              .addMethod(getGetSmsIntentTemplateBySidMethod())
              .addMethod(getListSmsSourceNumbersMethod())
              .addMethod(getCreateSmsSourceNumberMethod())
              .addMethod(getUpdateSmsSourceNumberMethod())
              .addMethod(getDeleteSmsSourceNumberMethod())
              .addMethod(getGetSmsSourceNumberBySidMethod())
              .addMethod(getSendSmsNotificationMethod())
              .addMethod(getListSmsGroupByFiltersMethod())
              .addMethod(getListSmsGroupsByGroupSidsMethod())
              .addMethod(getListSmsTasksByGroupSidsMethod())
              .addMethod(getListSmsGroupByFiltersForAuditMethod())
              .addMethod(getListSmsGroupsByGroupSidsForAuditMethod())
              .addMethod(getListSmsTasksByGroupSidsForAuditMethod())
              .addMethod(getListSmsTasksWithDetailedStatusMethod())
              .addMethod(getUpdateSmsGroupStatusMethod())
              .addMethod(getUpdateSmsGroupSendsPerMinuteMethod())
              .addMethod(getUpdateSmsGroupScheduleTimesMethod())
              .addMethod(getScheduleSmsMethod())
              .addMethod(getResendUnconnectedSmsMethod())
              .addMethod(getSmsActivitySearchMethod())
              .addMethod(getCreateInboundSmsTemplateMethod())
              .addMethod(getUpdateInboundSmsTemplateMethod())
              .addMethod(getDeleteInboundSmsTemplateMethod())
              .addMethod(getListInboundSmsTemplatesMethod())
              .addMethod(getGetInboundSmsTemplateByIdMethod())
              .addMethod(getCreateInboundSmsGroupMethod())
              .addMethod(getUpdateInboundSmsGroupMethod())
              .addMethod(getDeleteInboundSmsGroupMethod())
              .addMethod(getListInboundSmsGroupsMethod())
              .addMethod(getListActiveInboundSmsGroupsMethod())
              .addMethod(getListInboundSmsGroupByFiltersMethod())
              .addMethod(getGetInboundSmsGroupByIdMethod())
              .addMethod(getListInboundSmsGroupsByGroupIdsMethod())
              .addMethod(getStopInboundSmsGroupMethod())
              .addMethod(getScheduleInboundSmsMethod())
              .addMethod(getCreateSmsConversationMethod())
              .addMethod(getUpdateSmsConversationMethod())
              .addMethod(getDeleteSmsConversationMethod())
              .addMethod(getListSmsConversationsMethod())
              .addMethod(getGetSmsConversationByIdMethod())
              .addMethod(getGetSmsMessageMethod())
              .addMethod(getCreateSmsConversationAuditMethod())
              .addMethod(getListSmsConversationAuditsMethod())
              .addMethod(getGetSmsConversationAuditByIdMethod())
              .addMethod(getCreateSmsConversationAssignedAgentMethod())
              .addMethod(getListSmsConversationAssignedAgentsMethod())
              .addMethod(getGetSmsConversationAssignedAgentByIdMethod())
              .addMethod(getListInboundSmsTasksByGroupIdsMethod())
              .addMethod(getStopAllOutboundSmsGroupsMethod())
              .addMethod(getStopAllInboundSmsGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
