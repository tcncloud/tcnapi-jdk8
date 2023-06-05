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
    comments = "Source: api/v0alpha/lms.proto")
public final class LMSGrpc {

  private LMSGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.LMS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq,
      com.tcn.cloud.api.api.v0alpha.PublicKey> getGetPublicKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicKey",
      requestType = com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PublicKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq,
      com.tcn.cloud.api.api.v0alpha.PublicKey> getGetPublicKeyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq, com.tcn.cloud.api.api.v0alpha.PublicKey> getGetPublicKeyMethod;
    if ((getGetPublicKeyMethod = LMSGrpc.getGetPublicKeyMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetPublicKeyMethod = LMSGrpc.getGetPublicKeyMethod) == null) {
          LMSGrpc.getGetPublicKeyMethod = getGetPublicKeyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq, com.tcn.cloud.api.api.v0alpha.PublicKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetPublicKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PublicKey.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetPublicKey"))
                  .build();
          }
        }
     }
     return getGetPublicKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getCreateFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFileTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getCreateFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate> getCreateFileTemplateMethod;
    if ((getCreateFileTemplateMethod = LMSGrpc.getCreateFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateFileTemplateMethod = LMSGrpc.getCreateFileTemplateMethod) == null) {
          LMSGrpc.getCreateFileTemplateMethod = getCreateFileTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateFileTemplate"))
                  .build();
          }
        }
     }
     return getCreateFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getListFileTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getListFileTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq, com.tcn.cloud.api.api.v0alpha.FileTemplate> getListFileTemplatesMethod;
    if ((getListFileTemplatesMethod = LMSGrpc.getListFileTemplatesMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListFileTemplatesMethod = LMSGrpc.getListFileTemplatesMethod) == null) {
          LMSGrpc.getListFileTemplatesMethod = getListFileTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq, com.tcn.cloud.api.api.v0alpha.FileTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListFileTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListFileTemplates"))
                  .build();
          }
        }
     }
     return getListFileTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getUpdateFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFileTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getUpdateFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate> getUpdateFileTemplateMethod;
    if ((getUpdateFileTemplateMethod = LMSGrpc.getUpdateFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateFileTemplateMethod = LMSGrpc.getUpdateFileTemplateMethod) == null) {
          LMSGrpc.getUpdateFileTemplateMethod = getUpdateFileTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateFileTemplate"))
                  .build();
          }
        }
     }
     return getUpdateFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getDeleteFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getDeleteFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate> getDeleteFileTemplateMethod;
    if ((getDeleteFileTemplateMethod = LMSGrpc.getDeleteFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteFileTemplateMethod = LMSGrpc.getDeleteFileTemplateMethod) == null) {
          LMSGrpc.getDeleteFileTemplateMethod = getDeleteFileTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteFileTemplate"))
                  .build();
          }
        }
     }
     return getDeleteFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getGetFileTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FileTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate,
      com.tcn.cloud.api.api.v0alpha.FileTemplate> getGetFileTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate> getGetFileTemplateMethod;
    if ((getGetFileTemplateMethod = LMSGrpc.getGetFileTemplateMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetFileTemplateMethod = LMSGrpc.getGetFileTemplateMethod) == null) {
          LMSGrpc.getGetFileTemplateMethod = getGetFileTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FileTemplate, com.tcn.cloud.api.api.v0alpha.FileTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetFileTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FileTemplate.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetFileTemplate"))
                  .build();
          }
        }
     }
     return getGetFileTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getCreateFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateField",
      requestType = com.tcn.cloud.api.api.v0alpha.Field.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Field.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getCreateFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field> getCreateFieldMethod;
    if ((getCreateFieldMethod = LMSGrpc.getCreateFieldMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateFieldMethod = LMSGrpc.getCreateFieldMethod) == null) {
          LMSGrpc.getCreateFieldMethod = getCreateFieldMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateField"))
                  .build();
          }
        }
     }
     return getCreateFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListFieldsReq,
      com.tcn.cloud.api.api.v0alpha.Fields> getListFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFields",
      requestType = com.tcn.cloud.api.api.v0alpha.ListFieldsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Fields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListFieldsReq,
      com.tcn.cloud.api.api.v0alpha.Fields> getListFieldsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListFieldsReq, com.tcn.cloud.api.api.v0alpha.Fields> getListFieldsMethod;
    if ((getListFieldsMethod = LMSGrpc.getListFieldsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListFieldsMethod = LMSGrpc.getListFieldsMethod) == null) {
          LMSGrpc.getListFieldsMethod = getListFieldsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListFieldsReq, com.tcn.cloud.api.api.v0alpha.Fields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListFieldsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Fields.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListFields"))
                  .build();
          }
        }
     }
     return getListFieldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getGetFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetField",
      requestType = com.tcn.cloud.api.api.v0alpha.Field.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Field.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getGetFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field> getGetFieldMethod;
    if ((getGetFieldMethod = LMSGrpc.getGetFieldMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetFieldMethod = LMSGrpc.getGetFieldMethod) == null) {
          LMSGrpc.getGetFieldMethod = getGetFieldMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetField"))
                  .build();
          }
        }
     }
     return getGetFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFieldReq,
      com.tcn.cloud.api.api.v0alpha.Field> getUpdateFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateField",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateFieldReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Field.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFieldReq,
      com.tcn.cloud.api.api.v0alpha.Field> getUpdateFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateFieldReq, com.tcn.cloud.api.api.v0alpha.Field> getUpdateFieldMethod;
    if ((getUpdateFieldMethod = LMSGrpc.getUpdateFieldMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateFieldMethod = LMSGrpc.getUpdateFieldMethod) == null) {
          LMSGrpc.getUpdateFieldMethod = getUpdateFieldMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateFieldReq, com.tcn.cloud.api.api.v0alpha.Field>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateFieldReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateField"))
                  .build();
          }
        }
     }
     return getUpdateFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getDeleteFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteField",
      requestType = com.tcn.cloud.api.api.v0alpha.Field.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Field.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field,
      com.tcn.cloud.api.api.v0alpha.Field> getDeleteFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field> getDeleteFieldMethod;
    if ((getDeleteFieldMethod = LMSGrpc.getDeleteFieldMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteFieldMethod = LMSGrpc.getDeleteFieldMethod) == null) {
          LMSGrpc.getDeleteFieldMethod = getDeleteFieldMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Field, com.tcn.cloud.api.api.v0alpha.Field>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Field.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteField"))
                  .build();
          }
        }
     }
     return getDeleteFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq,
      com.tcn.cloud.api.api.v0alpha.ProcessFields> getListAvailableFieldsByElementIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableFieldsByElementId",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ProcessFields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq,
      com.tcn.cloud.api.api.v0alpha.ProcessFields> getListAvailableFieldsByElementIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq, com.tcn.cloud.api.api.v0alpha.ProcessFields> getListAvailableFieldsByElementIdMethod;
    if ((getListAvailableFieldsByElementIdMethod = LMSGrpc.getListAvailableFieldsByElementIdMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListAvailableFieldsByElementIdMethod = LMSGrpc.getListAvailableFieldsByElementIdMethod) == null) {
          LMSGrpc.getListAvailableFieldsByElementIdMethod = getListAvailableFieldsByElementIdMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq, com.tcn.cloud.api.api.v0alpha.ProcessFields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListAvailableFieldsByElementId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessFields.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListAvailableFieldsByElementId"))
                  .build();
          }
        }
     }
     return getListAvailableFieldsByElementIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> getListCampaignLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaignLinks",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> getListCampaignLinksMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> getListCampaignLinksMethod;
    if ((getListCampaignLinksMethod = LMSGrpc.getListCampaignLinksMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListCampaignLinksMethod = LMSGrpc.getListCampaignLinksMethod) == null) {
          LMSGrpc.getListCampaignLinksMethod = getListCampaignLinksMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListCampaignLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListCampaignLinks"))
                  .build();
          }
        }
     }
     return getListCampaignLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeekListReq,
      com.tcn.cloud.api.api.v0alpha.PeekListRes> getPeekListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PeekList",
      requestType = com.tcn.cloud.api.api.v0alpha.PeekListReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PeekListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeekListReq,
      com.tcn.cloud.api.api.v0alpha.PeekListRes> getPeekListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PeekListReq, com.tcn.cloud.api.api.v0alpha.PeekListRes> getPeekListMethod;
    if ((getPeekListMethod = LMSGrpc.getPeekListMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getPeekListMethod = LMSGrpc.getPeekListMethod) == null) {
          LMSGrpc.getPeekListMethod = getPeekListMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PeekListReq, com.tcn.cloud.api.api.v0alpha.PeekListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "PeekList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PeekListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PeekListRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("PeekList"))
                  .build();
          }
        }
     }
     return getPeekListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHistoryReq,
      com.tcn.cloud.api.api.v0alpha.GetHistoryRes> getGetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHistory",
      requestType = com.tcn.cloud.api.api.v0alpha.GetHistoryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHistoryReq,
      com.tcn.cloud.api.api.v0alpha.GetHistoryRes> getGetHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHistoryReq, com.tcn.cloud.api.api.v0alpha.GetHistoryRes> getGetHistoryMethod;
    if ((getGetHistoryMethod = LMSGrpc.getGetHistoryMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetHistoryMethod = LMSGrpc.getGetHistoryMethod) == null) {
          LMSGrpc.getGetHistoryMethod = getGetHistoryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetHistoryReq, com.tcn.cloud.api.api.v0alpha.GetHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetHistoryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetHistory"))
                  .build();
          }
        }
     }
     return getGetHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCreateElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElement",
      requestType = com.tcn.cloud.api.api.v0alpha.Element.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCreateElementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element> getCreateElementMethod;
    if ((getCreateElementMethod = LMSGrpc.getCreateElementMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateElementMethod = LMSGrpc.getCreateElementMethod) == null) {
          LMSGrpc.getCreateElementMethod = getCreateElementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateElement"))
                  .build();
          }
        }
     }
     return getCreateElementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListElementsReq,
      com.tcn.cloud.api.api.v0alpha.Element> getListElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListElements",
      requestType = com.tcn.cloud.api.api.v0alpha.ListElementsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListElementsReq,
      com.tcn.cloud.api.api.v0alpha.Element> getListElementsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListElementsReq, com.tcn.cloud.api.api.v0alpha.Element> getListElementsMethod;
    if ((getListElementsMethod = LMSGrpc.getListElementsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListElementsMethod = LMSGrpc.getListElementsMethod) == null) {
          LMSGrpc.getListElementsMethod = getListElementsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListElementsReq, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListElements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListElementsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListElements"))
                  .build();
          }
        }
     }
     return getListElementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getUpdateElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElement",
      requestType = com.tcn.cloud.api.api.v0alpha.Element.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getUpdateElementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element> getUpdateElementMethod;
    if ((getUpdateElementMethod = LMSGrpc.getUpdateElementMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateElementMethod = LMSGrpc.getUpdateElementMethod) == null) {
          LMSGrpc.getUpdateElementMethod = getUpdateElementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateElement"))
                  .build();
          }
        }
     }
     return getUpdateElementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getDeleteElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElement",
      requestType = com.tcn.cloud.api.api.v0alpha.Element.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getDeleteElementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element> getDeleteElementMethod;
    if ((getDeleteElementMethod = LMSGrpc.getDeleteElementMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteElementMethod = LMSGrpc.getDeleteElementMethod) == null) {
          LMSGrpc.getDeleteElementMethod = getDeleteElementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteElement"))
                  .build();
          }
        }
     }
     return getDeleteElementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineUpstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyPipelineUpstream",
      requestType = com.tcn.cloud.api.api.v0alpha.Element.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineUpstreamMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineUpstreamMethod;
    if ((getCopyPipelineUpstreamMethod = LMSGrpc.getCopyPipelineUpstreamMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCopyPipelineUpstreamMethod = LMSGrpc.getCopyPipelineUpstreamMethod) == null) {
          LMSGrpc.getCopyPipelineUpstreamMethod = getCopyPipelineUpstreamMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CopyPipelineUpstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CopyPipelineUpstream"))
                  .build();
          }
        }
     }
     return getCopyPipelineUpstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineDownstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyPipelineDownstream",
      requestType = com.tcn.cloud.api.api.v0alpha.Element.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Element.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element,
      com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineDownstreamMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element> getCopyPipelineDownstreamMethod;
    if ((getCopyPipelineDownstreamMethod = LMSGrpc.getCopyPipelineDownstreamMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCopyPipelineDownstreamMethod = LMSGrpc.getCopyPipelineDownstreamMethod) == null) {
          LMSGrpc.getCopyPipelineDownstreamMethod = getCopyPipelineDownstreamMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.Element, com.tcn.cloud.api.api.v0alpha.Element>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CopyPipelineDownstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Element.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CopyPipelineDownstream"))
                  .build();
          }
        }
     }
     return getCopyPipelineDownstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessElementReq,
      com.google.protobuf.Empty> getProcessElementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessElement",
      requestType = com.tcn.cloud.api.api.v0alpha.ProcessElementReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessElementReq,
      com.google.protobuf.Empty> getProcessElementMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ProcessElementReq, com.google.protobuf.Empty> getProcessElementMethod;
    if ((getProcessElementMethod = LMSGrpc.getProcessElementMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getProcessElementMethod = LMSGrpc.getProcessElementMethod) == null) {
          LMSGrpc.getProcessElementMethod = getProcessElementMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ProcessElementReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ProcessElement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessElementReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ProcessElement"))
                  .build();
          }
        }
     }
     return getProcessElementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.ProcessFields> getGetAvailableFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableFields",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ProcessFields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.ProcessFields> getGetAvailableFieldsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.ProcessFields> getGetAvailableFieldsMethod;
    if ((getGetAvailableFieldsMethod = LMSGrpc.getGetAvailableFieldsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetAvailableFieldsMethod = LMSGrpc.getGetAvailableFieldsMethod) == null) {
          LMSGrpc.getGetAvailableFieldsMethod = getGetAvailableFieldsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.ProcessFields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetAvailableFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ProcessFields.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetAvailableFields"))
                  .build();
          }
        }
     }
     return getGetAvailableFieldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.Events> getListNewEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNewEvents",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Events.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.tcn.cloud.api.api.v0alpha.Events> getListNewEventsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.Events> getListNewEventsMethod;
    if ((getListNewEventsMethod = LMSGrpc.getListNewEventsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListNewEventsMethod = LMSGrpc.getListNewEventsMethod) == null) {
          LMSGrpc.getListNewEventsMethod = getListNewEventsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.tcn.cloud.api.api.v0alpha.Events>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListNewEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Events.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListNewEvents"))
                  .build();
          }
        }
     }
     return getListNewEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ViewQueueReq,
      com.tcn.cloud.api.api.v0alpha.Events> getViewQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewQueue",
      requestType = com.tcn.cloud.api.api.v0alpha.ViewQueueReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Events.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ViewQueueReq,
      com.tcn.cloud.api.api.v0alpha.Events> getViewQueueMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ViewQueueReq, com.tcn.cloud.api.api.v0alpha.Events> getViewQueueMethod;
    if ((getViewQueueMethod = LMSGrpc.getViewQueueMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getViewQueueMethod = LMSGrpc.getViewQueueMethod) == null) {
          LMSGrpc.getViewQueueMethod = getViewQueueMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ViewQueueReq, com.tcn.cloud.api.api.v0alpha.Events>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ViewQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ViewQueueReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Events.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ViewQueue"))
                  .build();
          }
        }
     }
     return getViewQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ParseReq,
      com.tcn.cloud.api.api.v0alpha.ParseRes> getAutocompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Autocomplete",
      requestType = com.tcn.cloud.api.api.v0alpha.ParseReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ParseRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ParseReq,
      com.tcn.cloud.api.api.v0alpha.ParseRes> getAutocompleteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ParseReq, com.tcn.cloud.api.api.v0alpha.ParseRes> getAutocompleteMethod;
    if ((getAutocompleteMethod = LMSGrpc.getAutocompleteMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getAutocompleteMethod = LMSGrpc.getAutocompleteMethod) == null) {
          LMSGrpc.getAutocompleteMethod = getAutocompleteMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ParseReq, com.tcn.cloud.api.api.v0alpha.ParseRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "Autocomplete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ParseReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ParseRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("Autocomplete"))
                  .build();
          }
        }
     }
     return getAutocompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq,
      com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> getGetComplianceScrubListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComplianceScrubLists",
      requestType = com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq,
      com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> getGetComplianceScrubListsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq, com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> getGetComplianceScrubListsMethod;
    if ((getGetComplianceScrubListsMethod = LMSGrpc.getGetComplianceScrubListsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetComplianceScrubListsMethod = LMSGrpc.getGetComplianceScrubListsMethod) == null) {
          LMSGrpc.getGetComplianceScrubListsMethod = getGetComplianceScrubListsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq, com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetComplianceScrubLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetComplianceScrubLists"))
                  .build();
          }
        }
     }
     return getGetComplianceScrubListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq,
      com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> getFindFieldUsagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindFieldUsages",
      requestType = com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq,
      com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> getFindFieldUsagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq, com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> getFindFieldUsagesMethod;
    if ((getFindFieldUsagesMethod = LMSGrpc.getFindFieldUsagesMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getFindFieldUsagesMethod = LMSGrpc.getFindFieldUsagesMethod) == null) {
          LMSGrpc.getFindFieldUsagesMethod = getFindFieldUsagesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq, com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "FindFieldUsages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("FindFieldUsages"))
                  .build();
          }
        }
     }
     return getFindFieldUsagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq,
      com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> getFindInvalidElementsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInvalidElements",
      requestType = com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq,
      com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> getFindInvalidElementsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq, com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> getFindInvalidElementsMethod;
    if ((getFindInvalidElementsMethod = LMSGrpc.getFindInvalidElementsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getFindInvalidElementsMethod = LMSGrpc.getFindInvalidElementsMethod) == null) {
          LMSGrpc.getFindInvalidElementsMethod = getFindInvalidElementsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq, com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "FindInvalidElements"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("FindInvalidElements"))
                  .build();
          }
        }
     }
     return getFindInvalidElementsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
      com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCreateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.CollectionMetadata.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CollectionMetadata.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
      com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCreateCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCreateCollectionMethod;
    if ((getCreateCollectionMethod = LMSGrpc.getCreateCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateCollectionMethod = LMSGrpc.getCreateCollectionMethod) == null) {
          LMSGrpc.getCreateCollectionMethod = getCreateCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateCollection"))
                  .build();
          }
        }
     }
     return getCreateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionReq,
      com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getGetCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCollectionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CollectionMetadata.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionReq,
      com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getGetCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionReq, com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getGetCollectionMethod;
    if ((getGetCollectionMethod = LMSGrpc.getGetCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetCollectionMethod = LMSGrpc.getGetCollectionMethod) == null) {
          LMSGrpc.getGetCollectionMethod = getGetCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCollectionReq, com.tcn.cloud.api.api.v0alpha.CollectionMetadata>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCollectionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetCollection"))
                  .build();
          }
        }
     }
     return getGetCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
      com.google.protobuf.Empty> getUpdateCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.CollectionMetadata.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
      com.google.protobuf.Empty> getUpdateCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.google.protobuf.Empty> getUpdateCollectionMethod;
    if ((getUpdateCollectionMethod = LMSGrpc.getUpdateCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateCollectionMethod = LMSGrpc.getUpdateCollectionMethod) == null) {
          LMSGrpc.getUpdateCollectionMethod = getUpdateCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateCollection"))
                  .build();
          }
        }
     }
     return getUpdateCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq,
      com.google.protobuf.Empty> getDeleteCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq,
      com.google.protobuf.Empty> getDeleteCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq, com.google.protobuf.Empty> getDeleteCollectionMethod;
    if ((getDeleteCollectionMethod = LMSGrpc.getDeleteCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteCollectionMethod = LMSGrpc.getDeleteCollectionMethod) == null) {
          LMSGrpc.getDeleteCollectionMethod = getDeleteCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteCollection"))
                  .build();
          }
        }
     }
     return getDeleteCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCollectionsReq,
      com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> getListCollectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCollections",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCollectionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCollectionsReq,
      com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> getListCollectionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCollectionsReq, com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> getListCollectionsMethod;
    if ((getListCollectionsMethod = LMSGrpc.getListCollectionsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListCollectionsMethod = LMSGrpc.getListCollectionsMethod) == null) {
          LMSGrpc.getListCollectionsMethod = getListCollectionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCollectionsReq, com.tcn.cloud.api.api.v0alpha.ListCollectionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListCollections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCollectionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListCollections"))
                  .build();
          }
        }
     }
     return getListCollectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetCollectionReq,
      com.google.protobuf.Empty> getResetCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.ResetCollectionReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetCollectionReq,
      com.google.protobuf.Empty> getResetCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResetCollectionReq, com.google.protobuf.Empty> getResetCollectionMethod;
    if ((getResetCollectionMethod = LMSGrpc.getResetCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getResetCollectionMethod = LMSGrpc.getResetCollectionMethod) == null) {
          LMSGrpc.getResetCollectionMethod = getResetCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ResetCollectionReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ResetCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResetCollectionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ResetCollection"))
                  .build();
          }
        }
     }
     return getResetCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getAddCollectionEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCollectionEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.CollectionEntry.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CollectionEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getAddCollectionEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry> getAddCollectionEntryMethod;
    if ((getAddCollectionEntryMethod = LMSGrpc.getAddCollectionEntryMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getAddCollectionEntryMethod = LMSGrpc.getAddCollectionEntryMethod) == null) {
          LMSGrpc.getAddCollectionEntryMethod = getAddCollectionEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "AddCollectionEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("AddCollectionEntry"))
                  .build();
          }
        }
     }
     return getAddCollectionEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq,
      com.google.protobuf.Empty> getDeleteCollectionEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCollectionEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq,
      com.google.protobuf.Empty> getDeleteCollectionEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq, com.google.protobuf.Empty> getDeleteCollectionEntryMethod;
    if ((getDeleteCollectionEntryMethod = LMSGrpc.getDeleteCollectionEntryMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteCollectionEntryMethod = LMSGrpc.getDeleteCollectionEntryMethod) == null) {
          LMSGrpc.getDeleteCollectionEntryMethod = getDeleteCollectionEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteCollectionEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteCollectionEntry"))
                  .build();
          }
        }
     }
     return getDeleteCollectionEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getUpdateCollectionEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCollectionEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.CollectionEntry.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CollectionEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getUpdateCollectionEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry> getUpdateCollectionEntryMethod;
    if ((getUpdateCollectionEntryMethod = LMSGrpc.getUpdateCollectionEntryMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateCollectionEntryMethod = LMSGrpc.getUpdateCollectionEntryMethod) == null) {
          LMSGrpc.getUpdateCollectionEntryMethod = getUpdateCollectionEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateCollectionEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateCollectionEntry"))
                  .build();
          }
        }
     }
     return getUpdateCollectionEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StreamCollectionReq,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getStreamCollectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamCollection",
      requestType = com.tcn.cloud.api.api.v0alpha.StreamCollectionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CollectionEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StreamCollectionReq,
      com.tcn.cloud.api.api.v0alpha.CollectionEntry> getStreamCollectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StreamCollectionReq, com.tcn.cloud.api.api.v0alpha.CollectionEntry> getStreamCollectionMethod;
    if ((getStreamCollectionMethod = LMSGrpc.getStreamCollectionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getStreamCollectionMethod = LMSGrpc.getStreamCollectionMethod) == null) {
          LMSGrpc.getStreamCollectionMethod = getStreamCollectionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StreamCollectionReq, com.tcn.cloud.api.api.v0alpha.CollectionEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "StreamCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StreamCollectionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("StreamCollection"))
                  .build();
          }
        }
     }
     return getStreamCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq,
      com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> getSearchCollectionsPaginatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchCollectionsPaginated",
      requestType = com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq,
      com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> getSearchCollectionsPaginatedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq, com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> getSearchCollectionsPaginatedMethod;
    if ((getSearchCollectionsPaginatedMethod = LMSGrpc.getSearchCollectionsPaginatedMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getSearchCollectionsPaginatedMethod = LMSGrpc.getSearchCollectionsPaginatedMethod) == null) {
          LMSGrpc.getSearchCollectionsPaginatedMethod = getSearchCollectionsPaginatedMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq, com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "SearchCollectionsPaginated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("SearchCollectionsPaginated"))
                  .build();
          }
        }
     }
     return getSearchCollectionsPaginatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq,
      com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> getGetCollectionEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollectionEntries",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq,
      com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> getGetCollectionEntriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq, com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> getGetCollectionEntriesMethod;
    if ((getGetCollectionEntriesMethod = LMSGrpc.getGetCollectionEntriesMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetCollectionEntriesMethod = LMSGrpc.getGetCollectionEntriesMethod) == null) {
          LMSGrpc.getGetCollectionEntriesMethod = getGetCollectionEntriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq, com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetCollectionEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetCollectionEntries"))
                  .build();
          }
        }
     }
     return getGetCollectionEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
      com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getCreateCjsSearchDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCjsSearchDefinition",
      requestType = com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
      com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getCreateCjsSearchDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition, com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getCreateCjsSearchDefinitionMethod;
    if ((getCreateCjsSearchDefinitionMethod = LMSGrpc.getCreateCjsSearchDefinitionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateCjsSearchDefinitionMethod = LMSGrpc.getCreateCjsSearchDefinitionMethod) == null) {
          LMSGrpc.getCreateCjsSearchDefinitionMethod = getCreateCjsSearchDefinitionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition, com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateCjsSearchDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateCjsSearchDefinition"))
                  .build();
          }
        }
     }
     return getCreateCjsSearchDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq,
      com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getGetCjsSearchDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCjsSearchDefinition",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq,
      com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getGetCjsSearchDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq, com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getGetCjsSearchDefinitionMethod;
    if ((getGetCjsSearchDefinitionMethod = LMSGrpc.getGetCjsSearchDefinitionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetCjsSearchDefinitionMethod = LMSGrpc.getGetCjsSearchDefinitionMethod) == null) {
          LMSGrpc.getGetCjsSearchDefinitionMethod = getGetCjsSearchDefinitionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq, com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetCjsSearchDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetCjsSearchDefinition"))
                  .build();
          }
        }
     }
     return getGetCjsSearchDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
      com.google.protobuf.Empty> getUpdateCjsSearchDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCjsSearchDefinition",
      requestType = com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
      com.google.protobuf.Empty> getUpdateCjsSearchDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition, com.google.protobuf.Empty> getUpdateCjsSearchDefinitionMethod;
    if ((getUpdateCjsSearchDefinitionMethod = LMSGrpc.getUpdateCjsSearchDefinitionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateCjsSearchDefinitionMethod = LMSGrpc.getUpdateCjsSearchDefinitionMethod) == null) {
          LMSGrpc.getUpdateCjsSearchDefinitionMethod = getUpdateCjsSearchDefinitionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateCjsSearchDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateCjsSearchDefinition"))
                  .build();
          }
        }
     }
     return getUpdateCjsSearchDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq,
      com.google.protobuf.Empty> getDeleteCjsSearchDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCjsSearchDefinition",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq,
      com.google.protobuf.Empty> getDeleteCjsSearchDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq, com.google.protobuf.Empty> getDeleteCjsSearchDefinitionMethod;
    if ((getDeleteCjsSearchDefinitionMethod = LMSGrpc.getDeleteCjsSearchDefinitionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getDeleteCjsSearchDefinitionMethod = LMSGrpc.getDeleteCjsSearchDefinitionMethod) == null) {
          LMSGrpc.getDeleteCjsSearchDefinitionMethod = getDeleteCjsSearchDefinitionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "DeleteCjsSearchDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("DeleteCjsSearchDefinition"))
                  .build();
          }
        }
     }
     return getDeleteCjsSearchDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq,
      com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> getListCjsSearchDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCjsSearchDefinitions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq,
      com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> getListCjsSearchDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq, com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> getListCjsSearchDefinitionsMethod;
    if ((getListCjsSearchDefinitionsMethod = LMSGrpc.getListCjsSearchDefinitionsMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getListCjsSearchDefinitionsMethod = LMSGrpc.getListCjsSearchDefinitionsMethod) == null) {
          LMSGrpc.getListCjsSearchDefinitionsMethod = getListCjsSearchDefinitionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq, com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ListCjsSearchDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ListCjsSearchDefinitions"))
                  .build();
          }
        }
     }
     return getListCjsSearchDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq,
      com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> getExecuteCjsSearchDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteCjsSearchDefinition",
      requestType = com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq,
      com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> getExecuteCjsSearchDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq, com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> getExecuteCjsSearchDefinitionMethod;
    if ((getExecuteCjsSearchDefinitionMethod = LMSGrpc.getExecuteCjsSearchDefinitionMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getExecuteCjsSearchDefinitionMethod = LMSGrpc.getExecuteCjsSearchDefinitionMethod) == null) {
          LMSGrpc.getExecuteCjsSearchDefinitionMethod = getExecuteCjsSearchDefinitionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq, com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "ExecuteCjsSearchDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("ExecuteCjsSearchDefinition"))
                  .build();
          }
        }
     }
     return getExecuteCjsSearchDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq,
      com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getGetCjsSecureSearchCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCjsSecureSearchCriteria",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq,
      com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getGetCjsSecureSearchCriteriaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq, com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getGetCjsSecureSearchCriteriaMethod;
    if ((getGetCjsSecureSearchCriteriaMethod = LMSGrpc.getGetCjsSecureSearchCriteriaMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getGetCjsSecureSearchCriteriaMethod = LMSGrpc.getGetCjsSecureSearchCriteriaMethod) == null) {
          LMSGrpc.getGetCjsSecureSearchCriteriaMethod = getGetCjsSecureSearchCriteriaMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq, com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "GetCjsSecureSearchCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("GetCjsSecureSearchCriteria"))
                  .build();
          }
        }
     }
     return getGetCjsSecureSearchCriteriaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
      com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getCreateCjsSecureSearchCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCjsSecureSearchCriteria",
      requestType = com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
      com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getCreateCjsSecureSearchCriteriaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria, com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getCreateCjsSecureSearchCriteriaMethod;
    if ((getCreateCjsSecureSearchCriteriaMethod = LMSGrpc.getCreateCjsSecureSearchCriteriaMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getCreateCjsSecureSearchCriteriaMethod = LMSGrpc.getCreateCjsSecureSearchCriteriaMethod) == null) {
          LMSGrpc.getCreateCjsSecureSearchCriteriaMethod = getCreateCjsSecureSearchCriteriaMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria, com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "CreateCjsSecureSearchCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("CreateCjsSecureSearchCriteria"))
                  .build();
          }
        }
     }
     return getCreateCjsSecureSearchCriteriaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
      com.google.protobuf.Empty> getUpdateCjsSecureSearchCriteriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCjsSecureSearchCriteria",
      requestType = com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
      com.google.protobuf.Empty> getUpdateCjsSecureSearchCriteriaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria, com.google.protobuf.Empty> getUpdateCjsSecureSearchCriteriaMethod;
    if ((getUpdateCjsSecureSearchCriteriaMethod = LMSGrpc.getUpdateCjsSecureSearchCriteriaMethod) == null) {
      synchronized (LMSGrpc.class) {
        if ((getUpdateCjsSecureSearchCriteriaMethod = LMSGrpc.getUpdateCjsSecureSearchCriteriaMethod) == null) {
          LMSGrpc.getUpdateCjsSecureSearchCriteriaMethod = getUpdateCjsSecureSearchCriteriaMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.LMS", "UpdateCjsSecureSearchCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new LMSMethodDescriptorSupplier("UpdateCjsSecureSearchCriteria"))
                  .build();
          }
        }
     }
     return getUpdateCjsSecureSearchCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LMSStub newStub(io.grpc.Channel channel) {
    return new LMSStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LMSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LMSBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LMSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LMSFutureStub(channel);
  }

  /**
   */
  public static abstract class LMSImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPublicKey(com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PublicKey> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPublicKeyMethod(), responseObserver);
    }

    /**
     */
    public void createFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFileTemplateMethod(), responseObserver);
    }

    /**
     */
    public void listFileTemplates(com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getListFileTemplatesMethod(), responseObserver);
    }

    /**
     */
    public void updateFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFileTemplateMethod(), responseObserver);
    }

    /**
     */
    public void deleteFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFileTemplateMethod(), responseObserver);
    }

    /**
     */
    public void getFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileTemplateMethod(), responseObserver);
    }

    /**
     */
    public void createField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFieldMethod(), responseObserver);
    }

    /**
     */
    public void listFields(com.tcn.cloud.api.api.v0alpha.ListFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Fields> responseObserver) {
      asyncUnimplementedUnaryCall(getListFieldsMethod(), responseObserver);
    }

    /**
     */
    public void getField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFieldMethod(), responseObserver);
    }

    /**
     */
    public void updateField(com.tcn.cloud.api.api.v0alpha.UpdateFieldReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFieldMethod(), responseObserver);
    }

    /**
     */
    public void deleteField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFieldMethod(), responseObserver);
    }

    /**
     */
    public void listAvailableFieldsByElementId(com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailableFieldsByElementIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * list campaign links and descriptions
     * </pre>
     */
    public void listCampaignLinks(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCampaignLinksMethod(), responseObserver);
    }

    /**
     */
    public void peekList(com.tcn.cloud.api.api.v0alpha.PeekListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeekListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPeekListMethod(), responseObserver);
    }

    /**
     */
    public void getHistory(com.tcn.cloud.api.api.v0alpha.GetHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHistoryMethod(), responseObserver);
    }

    /**
     */
    public void createElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateElementMethod(), responseObserver);
    }

    /**
     */
    public void listElements(com.tcn.cloud.api.api.v0alpha.ListElementsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getListElementsMethod(), responseObserver);
    }

    /**
     */
    public void updateElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateElementMethod(), responseObserver);
    }

    /**
     */
    public void deleteElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteElementMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyPipelineUpstream copies an Element and all of its' parents
     * </pre>
     */
    public void copyPipelineUpstream(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyPipelineUpstreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyPipelineDownstream copies an Element and all of its' children
     * </pre>
     */
    public void copyPipelineDownstream(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyPipelineDownstreamMethod(), responseObserver);
    }

    /**
     */
    public void processElement(com.tcn.cloud.api.api.v0alpha.ProcessElementReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessElementMethod(), responseObserver);
    }

    /**
     */
    public void getAvailableFields(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvailableFieldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns queue events for the last 30 minutes
     * </pre>
     */
    public void listNewEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events> responseObserver) {
      asyncUnimplementedUnaryCall(getListNewEventsMethod(), responseObserver);
    }

    /**
     */
    public void viewQueue(com.tcn.cloud.api.api.v0alpha.ViewQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events> responseObserver) {
      asyncUnimplementedUnaryCall(getViewQueueMethod(), responseObserver);
    }

    /**
     */
    public void autocomplete(com.tcn.cloud.api.api.v0alpha.ParseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ParseRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAutocompleteMethod(), responseObserver);
    }

    /**
     */
    public void getComplianceScrubLists(com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetComplianceScrubListsMethod(), responseObserver);
    }

    /**
     */
    public void findFieldUsages(com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindFieldUsagesMethod(), responseObserver);
    }

    /**
     */
    public void findInvalidElements(com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindInvalidElementsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CJS calls 
     * </pre>
     */
    public void createCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCollectionMethod(), responseObserver);
    }

    /**
     */
    public void getCollection(com.tcn.cloud.api.api.v0alpha.GetCollectionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCollectionMethod(), responseObserver);
    }

    /**
     */
    public void updateCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCollectionMethod(), responseObserver);
    }

    /**
     */
    public void deleteCollection(com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCollectionMethod(), responseObserver);
    }

    /**
     */
    public void listCollections(com.tcn.cloud.api.api.v0alpha.ListCollectionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCollectionsMethod(), responseObserver);
    }

    /**
     */
    public void resetCollection(com.tcn.cloud.api.api.v0alpha.ResetCollectionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResetCollectionMethod(), responseObserver);
    }

    /**
     */
    public void addCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCollectionEntryMethod(), responseObserver);
    }

    /**
     */
    public void deleteCollectionEntry(com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCollectionEntryMethod(), responseObserver);
    }

    /**
     */
    public void updateCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCollectionEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamCollection needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public void streamCollection(com.tcn.cloud.api.api.v0alpha.StreamCollectionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamCollectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SearchCollectionsWithQueryPaginated needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public void searchCollectionsPaginated(com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchCollectionsPaginatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCollectionEntries fetches a page (size specified by the page_size param) of entries for
     * the specified collection_id, org_id, region_id starting at location specified by from
     * </pre>
     */
    public void getCollectionEntries(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCollectionEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCjsSearchDefinition creates a search definition
     * </pre>
     */
    public void createCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCjsSearchDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCjsSearchDefinition gets the search definition specified by search_definition_id
     * </pre>
     */
    public void getCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCjsSearchDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCjsSearchDefinition updates the search definition specified by search_definition_id
     * </pre>
     */
    public void updateCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCjsSearchDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCjsSearchDefinition deletes the search definition specified by search_definition_id
     * </pre>
     */
    public void deleteCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCjsSearchDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCjsSearchDefinitions lists the search definitions
     * </pre>
     */
    public void listCjsSearchDefinitions(com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCjsSearchDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ExecuteCjsSearchDefinition executes the search definition specified by search_definition_id
     * </pre>
     */
    public void executeCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteCjsSearchDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCjsSecureSearchCriteria gets the secure search criteria
     * </pre>
     */
    public void getCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCjsSecureSearchCriteriaMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCjsSecureSearchCriteria creates a secure search criteria
     * </pre>
     */
    public void createCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCjsSecureSearchCriteriaMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCjsSecureSearchCriteria updates the secure search criteria
     * </pre>
     */
    public void updateCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCjsSecureSearchCriteriaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPublicKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq,
                com.tcn.cloud.api.api.v0alpha.PublicKey>(
                  this, METHODID_GET_PUBLIC_KEY)))
          .addMethod(
            getCreateFileTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FileTemplate,
                com.tcn.cloud.api.api.v0alpha.FileTemplate>(
                  this, METHODID_CREATE_FILE_TEMPLATE)))
          .addMethod(
            getListFileTemplatesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.FileTemplate>(
                  this, METHODID_LIST_FILE_TEMPLATES)))
          .addMethod(
            getUpdateFileTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FileTemplate,
                com.tcn.cloud.api.api.v0alpha.FileTemplate>(
                  this, METHODID_UPDATE_FILE_TEMPLATE)))
          .addMethod(
            getDeleteFileTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FileTemplate,
                com.tcn.cloud.api.api.v0alpha.FileTemplate>(
                  this, METHODID_DELETE_FILE_TEMPLATE)))
          .addMethod(
            getGetFileTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FileTemplate,
                com.tcn.cloud.api.api.v0alpha.FileTemplate>(
                  this, METHODID_GET_FILE_TEMPLATE)))
          .addMethod(
            getCreateFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Field,
                com.tcn.cloud.api.api.v0alpha.Field>(
                  this, METHODID_CREATE_FIELD)))
          .addMethod(
            getListFieldsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListFieldsReq,
                com.tcn.cloud.api.api.v0alpha.Fields>(
                  this, METHODID_LIST_FIELDS)))
          .addMethod(
            getGetFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Field,
                com.tcn.cloud.api.api.v0alpha.Field>(
                  this, METHODID_GET_FIELD)))
          .addMethod(
            getUpdateFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateFieldReq,
                com.tcn.cloud.api.api.v0alpha.Field>(
                  this, METHODID_UPDATE_FIELD)))
          .addMethod(
            getDeleteFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Field,
                com.tcn.cloud.api.api.v0alpha.Field>(
                  this, METHODID_DELETE_FIELD)))
          .addMethod(
            getListAvailableFieldsByElementIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq,
                com.tcn.cloud.api.api.v0alpha.ProcessFields>(
                  this, METHODID_LIST_AVAILABLE_FIELDS_BY_ELEMENT_ID)))
          .addMethod(
            getListCampaignLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes>(
                  this, METHODID_LIST_CAMPAIGN_LINKS)))
          .addMethod(
            getPeekListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.PeekListReq,
                com.tcn.cloud.api.api.v0alpha.PeekListRes>(
                  this, METHODID_PEEK_LIST)))
          .addMethod(
            getGetHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetHistoryReq,
                com.tcn.cloud.api.api.v0alpha.GetHistoryRes>(
                  this, METHODID_GET_HISTORY)))
          .addMethod(
            getCreateElementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Element,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_CREATE_ELEMENT)))
          .addMethod(
            getListElementsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListElementsReq,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_LIST_ELEMENTS)))
          .addMethod(
            getUpdateElementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Element,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_UPDATE_ELEMENT)))
          .addMethod(
            getDeleteElementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Element,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_DELETE_ELEMENT)))
          .addMethod(
            getCopyPipelineUpstreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Element,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_COPY_PIPELINE_UPSTREAM)))
          .addMethod(
            getCopyPipelineDownstreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.Element,
                com.tcn.cloud.api.api.v0alpha.Element>(
                  this, METHODID_COPY_PIPELINE_DOWNSTREAM)))
          .addMethod(
            getProcessElementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ProcessElementReq,
                com.google.protobuf.Empty>(
                  this, METHODID_PROCESS_ELEMENT)))
          .addMethod(
            getGetAvailableFieldsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.tcn.cloud.api.api.v0alpha.ProcessFields>(
                  this, METHODID_GET_AVAILABLE_FIELDS)))
          .addMethod(
            getListNewEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.tcn.cloud.api.api.v0alpha.Events>(
                  this, METHODID_LIST_NEW_EVENTS)))
          .addMethod(
            getViewQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ViewQueueReq,
                com.tcn.cloud.api.api.v0alpha.Events>(
                  this, METHODID_VIEW_QUEUE)))
          .addMethod(
            getAutocompleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ParseReq,
                com.tcn.cloud.api.api.v0alpha.ParseRes>(
                  this, METHODID_AUTOCOMPLETE)))
          .addMethod(
            getGetComplianceScrubListsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq,
                com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes>(
                  this, METHODID_GET_COMPLIANCE_SCRUB_LISTS)))
          .addMethod(
            getFindFieldUsagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq,
                com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes>(
                  this, METHODID_FIND_FIELD_USAGES)))
          .addMethod(
            getFindInvalidElementsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq,
                com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes>(
                  this, METHODID_FIND_INVALID_ELEMENTS)))
          .addMethod(
            getCreateCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
                com.tcn.cloud.api.api.v0alpha.CollectionMetadata>(
                  this, METHODID_CREATE_COLLECTION)))
          .addMethod(
            getGetCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCollectionReq,
                com.tcn.cloud.api.api.v0alpha.CollectionMetadata>(
                  this, METHODID_GET_COLLECTION)))
          .addMethod(
            getUpdateCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CollectionMetadata,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_COLLECTION)))
          .addMethod(
            getDeleteCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COLLECTION)))
          .addMethod(
            getListCollectionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCollectionsReq,
                com.tcn.cloud.api.api.v0alpha.ListCollectionsRes>(
                  this, METHODID_LIST_COLLECTIONS)))
          .addMethod(
            getResetCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ResetCollectionReq,
                com.google.protobuf.Empty>(
                  this, METHODID_RESET_COLLECTION)))
          .addMethod(
            getAddCollectionEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CollectionEntry,
                com.tcn.cloud.api.api.v0alpha.CollectionEntry>(
                  this, METHODID_ADD_COLLECTION_ENTRY)))
          .addMethod(
            getDeleteCollectionEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COLLECTION_ENTRY)))
          .addMethod(
            getUpdateCollectionEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CollectionEntry,
                com.tcn.cloud.api.api.v0alpha.CollectionEntry>(
                  this, METHODID_UPDATE_COLLECTION_ENTRY)))
          .addMethod(
            getStreamCollectionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StreamCollectionReq,
                com.tcn.cloud.api.api.v0alpha.CollectionEntry>(
                  this, METHODID_STREAM_COLLECTION)))
          .addMethod(
            getSearchCollectionsPaginatedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq,
                com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes>(
                  this, METHODID_SEARCH_COLLECTIONS_PAGINATED)))
          .addMethod(
            getGetCollectionEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq,
                com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes>(
                  this, METHODID_GET_COLLECTION_ENTRIES)))
          .addMethod(
            getCreateCjsSearchDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
                com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>(
                  this, METHODID_CREATE_CJS_SEARCH_DEFINITION)))
          .addMethod(
            getGetCjsSearchDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq,
                com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>(
                  this, METHODID_GET_CJS_SEARCH_DEFINITION)))
          .addMethod(
            getUpdateCjsSearchDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CJS_SEARCH_DEFINITION)))
          .addMethod(
            getDeleteCjsSearchDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CJS_SEARCH_DEFINITION)))
          .addMethod(
            getListCjsSearchDefinitionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq,
                com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes>(
                  this, METHODID_LIST_CJS_SEARCH_DEFINITIONS)))
          .addMethod(
            getExecuteCjsSearchDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq,
                com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes>(
                  this, METHODID_EXECUTE_CJS_SEARCH_DEFINITION)))
          .addMethod(
            getGetCjsSecureSearchCriteriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq,
                com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>(
                  this, METHODID_GET_CJS_SECURE_SEARCH_CRITERIA)))
          .addMethod(
            getCreateCjsSecureSearchCriteriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
                com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>(
                  this, METHODID_CREATE_CJS_SECURE_SEARCH_CRITERIA)))
          .addMethod(
            getUpdateCjsSecureSearchCriteriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CJS_SECURE_SEARCH_CRITERIA)))
          .build();
    }
  }

  /**
   */
  public static final class LMSStub extends io.grpc.stub.AbstractStub<LMSStub> {
    private LMSStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LMSStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LMSStub(channel, callOptions);
    }

    /**
     */
    public void getPublicKey(com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PublicKey> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFileTemplates(com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListFileTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFields(com.tcn.cloud.api.api.v0alpha.ListFieldsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Fields> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateField(com.tcn.cloud.api.api.v0alpha.UpdateFieldReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteField(com.tcn.cloud.api.api.v0alpha.Field request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAvailableFieldsByElementId(com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAvailableFieldsByElementIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list campaign links and descriptions
     * </pre>
     */
    public void listCampaignLinks(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCampaignLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void peekList(com.tcn.cloud.api.api.v0alpha.PeekListReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeekListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPeekListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHistory(com.tcn.cloud.api.api.v0alpha.GetHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHistoryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateElementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listElements(com.tcn.cloud.api.api.v0alpha.ListElementsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListElementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateElementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteElement(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteElementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyPipelineUpstream copies an Element and all of its' parents
     * </pre>
     */
    public void copyPipelineUpstream(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCopyPipelineUpstreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyPipelineDownstream copies an Element and all of its' children
     * </pre>
     */
    public void copyPipelineDownstream(com.tcn.cloud.api.api.v0alpha.Element request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCopyPipelineDownstreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processElement(com.tcn.cloud.api.api.v0alpha.ProcessElementReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessElementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAvailableFields(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAvailableFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns queue events for the last 30 minutes
     * </pre>
     */
    public void listNewEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNewEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewQueue(com.tcn.cloud.api.api.v0alpha.ViewQueueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void autocomplete(com.tcn.cloud.api.api.v0alpha.ParseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ParseRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAutocompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComplianceScrubLists(com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetComplianceScrubListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findFieldUsages(com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindFieldUsagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findInvalidElements(com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindInvalidElementsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CJS calls 
     * </pre>
     */
    public void createCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCollection(com.tcn.cloud.api.api.v0alpha.GetCollectionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCollection(com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCollections(com.tcn.cloud.api.api.v0alpha.ListCollectionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCollectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetCollection(com.tcn.cloud.api.api.v0alpha.ResetCollectionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCollectionEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCollectionEntry(com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCollectionEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCollectionEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamCollection needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public void streamCollection(com.tcn.cloud.api.api.v0alpha.StreamCollectionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SearchCollectionsWithQueryPaginated needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public void searchCollectionsPaginated(com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchCollectionsPaginatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCollectionEntries fetches a page (size specified by the page_size param) of entries for
     * the specified collection_id, org_id, region_id starting at location specified by from
     * </pre>
     */
    public void getCollectionEntries(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCollectionEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCjsSearchDefinition creates a search definition
     * </pre>
     */
    public void createCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCjsSearchDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCjsSearchDefinition gets the search definition specified by search_definition_id
     * </pre>
     */
    public void getCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCjsSearchDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCjsSearchDefinition updates the search definition specified by search_definition_id
     * </pre>
     */
    public void updateCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCjsSearchDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCjsSearchDefinition deletes the search definition specified by search_definition_id
     * </pre>
     */
    public void deleteCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCjsSearchDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCjsSearchDefinitions lists the search definitions
     * </pre>
     */
    public void listCjsSearchDefinitions(com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCjsSearchDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ExecuteCjsSearchDefinition executes the search definition specified by search_definition_id
     * </pre>
     */
    public void executeCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteCjsSearchDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCjsSecureSearchCriteria gets the secure search criteria
     * </pre>
     */
    public void getCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCjsSecureSearchCriteriaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCjsSecureSearchCriteria creates a secure search criteria
     * </pre>
     */
    public void createCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCjsSecureSearchCriteriaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCjsSecureSearchCriteria updates the secure search criteria
     * </pre>
     */
    public void updateCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCjsSecureSearchCriteriaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LMSBlockingStub extends io.grpc.stub.AbstractStub<LMSBlockingStub> {
    private LMSBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LMSBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LMSBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.PublicKey getPublicKey(com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq request) {
      return blockingUnaryCall(
          getChannel(), getGetPublicKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplate createFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return blockingUnaryCall(
          getChannel(), getCreateFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.FileTemplate> listFileTemplates(
        com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq request) {
      return blockingServerStreamingCall(
          getChannel(), getListFileTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplate updateFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplate deleteFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplate getFileTemplate(com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return blockingUnaryCall(
          getChannel(), getGetFileTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Field createField(com.tcn.cloud.api.api.v0alpha.Field request) {
      return blockingUnaryCall(
          getChannel(), getCreateFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Fields listFields(com.tcn.cloud.api.api.v0alpha.ListFieldsReq request) {
      return blockingUnaryCall(
          getChannel(), getListFieldsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Field getField(com.tcn.cloud.api.api.v0alpha.Field request) {
      return blockingUnaryCall(
          getChannel(), getGetFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Field updateField(com.tcn.cloud.api.api.v0alpha.UpdateFieldReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Field deleteField(com.tcn.cloud.api.api.v0alpha.Field request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFieldMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ProcessFields listAvailableFieldsByElementId(com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq request) {
      return blockingUnaryCall(
          getChannel(), getListAvailableFieldsByElementIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list campaign links and descriptions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes listCampaignLinks(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListCampaignLinksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.PeekListRes peekList(com.tcn.cloud.api.api.v0alpha.PeekListReq request) {
      return blockingUnaryCall(
          getChannel(), getPeekListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetHistoryRes getHistory(com.tcn.cloud.api.api.v0alpha.GetHistoryReq request) {
      return blockingUnaryCall(
          getChannel(), getGetHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Element createElement(com.tcn.cloud.api.api.v0alpha.Element request) {
      return blockingUnaryCall(
          getChannel(), getCreateElementMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.Element> listElements(
        com.tcn.cloud.api.api.v0alpha.ListElementsReq request) {
      return blockingServerStreamingCall(
          getChannel(), getListElementsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Element updateElement(com.tcn.cloud.api.api.v0alpha.Element request) {
      return blockingUnaryCall(
          getChannel(), getUpdateElementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Element deleteElement(com.tcn.cloud.api.api.v0alpha.Element request) {
      return blockingUnaryCall(
          getChannel(), getDeleteElementMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyPipelineUpstream copies an Element and all of its' parents
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.Element> copyPipelineUpstream(
        com.tcn.cloud.api.api.v0alpha.Element request) {
      return blockingServerStreamingCall(
          getChannel(), getCopyPipelineUpstreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyPipelineDownstream copies an Element and all of its' children
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.Element> copyPipelineDownstream(
        com.tcn.cloud.api.api.v0alpha.Element request) {
      return blockingServerStreamingCall(
          getChannel(), getCopyPipelineDownstreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty processElement(com.tcn.cloud.api.api.v0alpha.ProcessElementReq request) {
      return blockingUnaryCall(
          getChannel(), getProcessElementMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ProcessFields getAvailableFields(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAvailableFieldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns queue events for the last 30 minutes
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Events listNewEvents(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListNewEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Events viewQueue(com.tcn.cloud.api.api.v0alpha.ViewQueueReq request) {
      return blockingUnaryCall(
          getChannel(), getViewQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ParseRes autocomplete(com.tcn.cloud.api.api.v0alpha.ParseReq request) {
      return blockingUnaryCall(
          getChannel(), getAutocompleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes getComplianceScrubLists(com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetComplianceScrubListsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes findFieldUsages(com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq request) {
      return blockingUnaryCall(
          getChannel(), getFindFieldUsagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes findInvalidElements(com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq request) {
      return blockingUnaryCall(
          getChannel(), getFindInvalidElementsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CJS calls 
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata createCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request) {
      return blockingUnaryCall(
          getChannel(), getCreateCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata getCollection(com.tcn.cloud.api.api.v0alpha.GetCollectionReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateCollection(com.tcn.cloud.api.api.v0alpha.CollectionMetadata request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCollection(com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListCollectionsRes listCollections(com.tcn.cloud.api.api.v0alpha.ListCollectionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListCollectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetCollection(com.tcn.cloud.api.api.v0alpha.ResetCollectionReq request) {
      return blockingUnaryCall(
          getChannel(), getResetCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry addCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request) {
      return blockingUnaryCall(
          getChannel(), getAddCollectionEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCollectionEntry(com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCollectionEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry updateCollectionEntry(com.tcn.cloud.api.api.v0alpha.CollectionEntry request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCollectionEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamCollection needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.CollectionEntry> streamCollection(
        com.tcn.cloud.api.api.v0alpha.StreamCollectionReq request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamCollectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SearchCollectionsWithQueryPaginated needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes searchCollectionsPaginated(com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq request) {
      return blockingUnaryCall(
          getChannel(), getSearchCollectionsPaginatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCollectionEntries fetches a page (size specified by the page_size param) of entries for
     * the specified collection_id, org_id, region_id starting at location specified by from
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes getCollectionEntries(com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCollectionEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCjsSearchDefinition creates a search definition
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition createCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request) {
      return blockingUnaryCall(
          getChannel(), getCreateCjsSearchDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCjsSearchDefinition gets the search definition specified by search_definition_id
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition getCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCjsSearchDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCjsSearchDefinition updates the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.protobuf.Empty updateCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCjsSearchDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCjsSearchDefinition deletes the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.protobuf.Empty deleteCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCjsSearchDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCjsSearchDefinitions lists the search definitions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes listCjsSearchDefinitions(com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListCjsSearchDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ExecuteCjsSearchDefinition executes the search definition specified by search_definition_id
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes executeCjsSearchDefinition(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq request) {
      return blockingUnaryCall(
          getChannel(), getExecuteCjsSearchDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCjsSecureSearchCriteria gets the secure search criteria
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria getCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCjsSecureSearchCriteriaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCjsSecureSearchCriteria creates a secure search criteria
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria createCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request) {
      return blockingUnaryCall(
          getChannel(), getCreateCjsSecureSearchCriteriaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCjsSecureSearchCriteria updates the secure search criteria
     * </pre>
     */
    public com.google.protobuf.Empty updateCjsSecureSearchCriteria(com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCjsSecureSearchCriteriaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LMSFutureStub extends io.grpc.stub.AbstractStub<LMSFutureStub> {
    private LMSFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LMSFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LMSFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LMSFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PublicKey> getPublicKey(
        com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPublicKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FileTemplate> createFileTemplate(
        com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FileTemplate> updateFileTemplate(
        com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FileTemplate> deleteFileTemplate(
        com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FileTemplate> getFileTemplate(
        com.tcn.cloud.api.api.v0alpha.FileTemplate request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Field> createField(
        com.tcn.cloud.api.api.v0alpha.Field request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Fields> listFields(
        com.tcn.cloud.api.api.v0alpha.ListFieldsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListFieldsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Field> getField(
        com.tcn.cloud.api.api.v0alpha.Field request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Field> updateField(
        com.tcn.cloud.api.api.v0alpha.UpdateFieldReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Field> deleteField(
        com.tcn.cloud.api.api.v0alpha.Field request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFieldMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ProcessFields> listAvailableFieldsByElementId(
        com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAvailableFieldsByElementIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list campaign links and descriptions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes> listCampaignLinks(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListCampaignLinksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PeekListRes> peekList(
        com.tcn.cloud.api.api.v0alpha.PeekListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPeekListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetHistoryRes> getHistory(
        com.tcn.cloud.api.api.v0alpha.GetHistoryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Element> createElement(
        com.tcn.cloud.api.api.v0alpha.Element request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateElementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Element> updateElement(
        com.tcn.cloud.api.api.v0alpha.Element request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateElementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Element> deleteElement(
        com.tcn.cloud.api.api.v0alpha.Element request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteElementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> processElement(
        com.tcn.cloud.api.api.v0alpha.ProcessElementReq request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessElementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ProcessFields> getAvailableFields(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAvailableFieldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns queue events for the last 30 minutes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Events> listNewEvents(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListNewEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Events> viewQueue(
        com.tcn.cloud.api.api.v0alpha.ViewQueueReq request) {
      return futureUnaryCall(
          getChannel().newCall(getViewQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ParseRes> autocomplete(
        com.tcn.cloud.api.api.v0alpha.ParseReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAutocompleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes> getComplianceScrubLists(
        com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetComplianceScrubListsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes> findFieldUsages(
        com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindFieldUsagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes> findInvalidElements(
        com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindInvalidElementsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CJS calls 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> createCollection(
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCollection(
        com.tcn.cloud.api.api.v0alpha.GetCollectionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCollection(
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCollection(
        com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCollectionsRes> listCollections(
        com.tcn.cloud.api.api.v0alpha.ListCollectionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCollectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetCollection(
        com.tcn.cloud.api.api.v0alpha.ResetCollectionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getResetCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CollectionEntry> addCollectionEntry(
        com.tcn.cloud.api.api.v0alpha.CollectionEntry request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCollectionEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCollectionEntry(
        com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCollectionEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CollectionEntry> updateCollectionEntry(
        com.tcn.cloud.api.api.v0alpha.CollectionEntry request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCollectionEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SearchCollectionsWithQueryPaginated needs to be used in conjunction with GetCollection
     * to have the metadata associated with it
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes> searchCollectionsPaginated(
        com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchCollectionsPaginatedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCollectionEntries fetches a page (size specified by the page_size param) of entries for
     * the specified collection_id, org_id, region_id starting at location specified by from
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes> getCollectionEntries(
        com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCollectionEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCjsSearchDefinition creates a search definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> createCjsSearchDefinition(
        com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCjsSearchDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCjsSearchDefinition gets the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition> getCjsSearchDefinition(
        com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCjsSearchDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCjsSearchDefinition updates the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCjsSearchDefinition(
        com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCjsSearchDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCjsSearchDefinition deletes the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCjsSearchDefinition(
        com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCjsSearchDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCjsSearchDefinitions lists the search definitions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes> listCjsSearchDefinitions(
        com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCjsSearchDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ExecuteCjsSearchDefinition executes the search definition specified by search_definition_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes> executeCjsSearchDefinition(
        com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteCjsSearchDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCjsSecureSearchCriteria gets the secure search criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> getCjsSecureSearchCriteria(
        com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCjsSecureSearchCriteriaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCjsSecureSearchCriteria creates a secure search criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria> createCjsSecureSearchCriteria(
        com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCjsSecureSearchCriteriaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCjsSecureSearchCriteria updates the secure search criteria
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCjsSecureSearchCriteria(
        com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCjsSecureSearchCriteriaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PUBLIC_KEY = 0;
  private static final int METHODID_CREATE_FILE_TEMPLATE = 1;
  private static final int METHODID_LIST_FILE_TEMPLATES = 2;
  private static final int METHODID_UPDATE_FILE_TEMPLATE = 3;
  private static final int METHODID_DELETE_FILE_TEMPLATE = 4;
  private static final int METHODID_GET_FILE_TEMPLATE = 5;
  private static final int METHODID_CREATE_FIELD = 6;
  private static final int METHODID_LIST_FIELDS = 7;
  private static final int METHODID_GET_FIELD = 8;
  private static final int METHODID_UPDATE_FIELD = 9;
  private static final int METHODID_DELETE_FIELD = 10;
  private static final int METHODID_LIST_AVAILABLE_FIELDS_BY_ELEMENT_ID = 11;
  private static final int METHODID_LIST_CAMPAIGN_LINKS = 12;
  private static final int METHODID_PEEK_LIST = 13;
  private static final int METHODID_GET_HISTORY = 14;
  private static final int METHODID_CREATE_ELEMENT = 15;
  private static final int METHODID_LIST_ELEMENTS = 16;
  private static final int METHODID_UPDATE_ELEMENT = 17;
  private static final int METHODID_DELETE_ELEMENT = 18;
  private static final int METHODID_COPY_PIPELINE_UPSTREAM = 19;
  private static final int METHODID_COPY_PIPELINE_DOWNSTREAM = 20;
  private static final int METHODID_PROCESS_ELEMENT = 21;
  private static final int METHODID_GET_AVAILABLE_FIELDS = 22;
  private static final int METHODID_LIST_NEW_EVENTS = 23;
  private static final int METHODID_VIEW_QUEUE = 24;
  private static final int METHODID_AUTOCOMPLETE = 25;
  private static final int METHODID_GET_COMPLIANCE_SCRUB_LISTS = 26;
  private static final int METHODID_FIND_FIELD_USAGES = 27;
  private static final int METHODID_FIND_INVALID_ELEMENTS = 28;
  private static final int METHODID_CREATE_COLLECTION = 29;
  private static final int METHODID_GET_COLLECTION = 30;
  private static final int METHODID_UPDATE_COLLECTION = 31;
  private static final int METHODID_DELETE_COLLECTION = 32;
  private static final int METHODID_LIST_COLLECTIONS = 33;
  private static final int METHODID_RESET_COLLECTION = 34;
  private static final int METHODID_ADD_COLLECTION_ENTRY = 35;
  private static final int METHODID_DELETE_COLLECTION_ENTRY = 36;
  private static final int METHODID_UPDATE_COLLECTION_ENTRY = 37;
  private static final int METHODID_STREAM_COLLECTION = 38;
  private static final int METHODID_SEARCH_COLLECTIONS_PAGINATED = 39;
  private static final int METHODID_GET_COLLECTION_ENTRIES = 40;
  private static final int METHODID_CREATE_CJS_SEARCH_DEFINITION = 41;
  private static final int METHODID_GET_CJS_SEARCH_DEFINITION = 42;
  private static final int METHODID_UPDATE_CJS_SEARCH_DEFINITION = 43;
  private static final int METHODID_DELETE_CJS_SEARCH_DEFINITION = 44;
  private static final int METHODID_LIST_CJS_SEARCH_DEFINITIONS = 45;
  private static final int METHODID_EXECUTE_CJS_SEARCH_DEFINITION = 46;
  private static final int METHODID_GET_CJS_SECURE_SEARCH_CRITERIA = 47;
  private static final int METHODID_CREATE_CJS_SECURE_SEARCH_CRITERIA = 48;
  private static final int METHODID_UPDATE_CJS_SECURE_SEARCH_CRITERIA = 49;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LMSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LMSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PUBLIC_KEY:
          serviceImpl.getPublicKey((com.tcn.cloud.api.api.v0alpha.GetPublicKeyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PublicKey>) responseObserver);
          break;
        case METHODID_CREATE_FILE_TEMPLATE:
          serviceImpl.createFileTemplate((com.tcn.cloud.api.api.v0alpha.FileTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate>) responseObserver);
          break;
        case METHODID_LIST_FILE_TEMPLATES:
          serviceImpl.listFileTemplates((com.tcn.cloud.api.api.v0alpha.GetFileTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate>) responseObserver);
          break;
        case METHODID_UPDATE_FILE_TEMPLATE:
          serviceImpl.updateFileTemplate((com.tcn.cloud.api.api.v0alpha.FileTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate>) responseObserver);
          break;
        case METHODID_DELETE_FILE_TEMPLATE:
          serviceImpl.deleteFileTemplate((com.tcn.cloud.api.api.v0alpha.FileTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate>) responseObserver);
          break;
        case METHODID_GET_FILE_TEMPLATE:
          serviceImpl.getFileTemplate((com.tcn.cloud.api.api.v0alpha.FileTemplate) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FileTemplate>) responseObserver);
          break;
        case METHODID_CREATE_FIELD:
          serviceImpl.createField((com.tcn.cloud.api.api.v0alpha.Field) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field>) responseObserver);
          break;
        case METHODID_LIST_FIELDS:
          serviceImpl.listFields((com.tcn.cloud.api.api.v0alpha.ListFieldsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Fields>) responseObserver);
          break;
        case METHODID_GET_FIELD:
          serviceImpl.getField((com.tcn.cloud.api.api.v0alpha.Field) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field>) responseObserver);
          break;
        case METHODID_UPDATE_FIELD:
          serviceImpl.updateField((com.tcn.cloud.api.api.v0alpha.UpdateFieldReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field>) responseObserver);
          break;
        case METHODID_DELETE_FIELD:
          serviceImpl.deleteField((com.tcn.cloud.api.api.v0alpha.Field) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Field>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_FIELDS_BY_ELEMENT_ID:
          serviceImpl.listAvailableFieldsByElementId((com.tcn.cloud.api.api.v0alpha.ListAvailableFieldsByElementIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGN_LINKS:
          serviceImpl.listCampaignLinks((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignLinksRes>) responseObserver);
          break;
        case METHODID_PEEK_LIST:
          serviceImpl.peekList((com.tcn.cloud.api.api.v0alpha.PeekListReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PeekListRes>) responseObserver);
          break;
        case METHODID_GET_HISTORY:
          serviceImpl.getHistory((com.tcn.cloud.api.api.v0alpha.GetHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHistoryRes>) responseObserver);
          break;
        case METHODID_CREATE_ELEMENT:
          serviceImpl.createElement((com.tcn.cloud.api.api.v0alpha.Element) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_LIST_ELEMENTS:
          serviceImpl.listElements((com.tcn.cloud.api.api.v0alpha.ListElementsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_UPDATE_ELEMENT:
          serviceImpl.updateElement((com.tcn.cloud.api.api.v0alpha.Element) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_DELETE_ELEMENT:
          serviceImpl.deleteElement((com.tcn.cloud.api.api.v0alpha.Element) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_COPY_PIPELINE_UPSTREAM:
          serviceImpl.copyPipelineUpstream((com.tcn.cloud.api.api.v0alpha.Element) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_COPY_PIPELINE_DOWNSTREAM:
          serviceImpl.copyPipelineDownstream((com.tcn.cloud.api.api.v0alpha.Element) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Element>) responseObserver);
          break;
        case METHODID_PROCESS_ELEMENT:
          serviceImpl.processElement((com.tcn.cloud.api.api.v0alpha.ProcessElementReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_FIELDS:
          serviceImpl.getAvailableFields((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ProcessFields>) responseObserver);
          break;
        case METHODID_LIST_NEW_EVENTS:
          serviceImpl.listNewEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events>) responseObserver);
          break;
        case METHODID_VIEW_QUEUE:
          serviceImpl.viewQueue((com.tcn.cloud.api.api.v0alpha.ViewQueueReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Events>) responseObserver);
          break;
        case METHODID_AUTOCOMPLETE:
          serviceImpl.autocomplete((com.tcn.cloud.api.api.v0alpha.ParseReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ParseRes>) responseObserver);
          break;
        case METHODID_GET_COMPLIANCE_SCRUB_LISTS:
          serviceImpl.getComplianceScrubLists((com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetComplianceScrubListsRes>) responseObserver);
          break;
        case METHODID_FIND_FIELD_USAGES:
          serviceImpl.findFieldUsages((com.tcn.cloud.api.api.v0alpha.FindFieldUsagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindFieldUsagesRes>) responseObserver);
          break;
        case METHODID_FIND_INVALID_ELEMENTS:
          serviceImpl.findInvalidElements((com.tcn.cloud.api.api.v0alpha.FindInvalidElementsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.FindInvalidElementsRes>) responseObserver);
          break;
        case METHODID_CREATE_COLLECTION:
          serviceImpl.createCollection((com.tcn.cloud.api.api.v0alpha.CollectionMetadata) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata>) responseObserver);
          break;
        case METHODID_GET_COLLECTION:
          serviceImpl.getCollection((com.tcn.cloud.api.api.v0alpha.GetCollectionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionMetadata>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION:
          serviceImpl.updateCollection((com.tcn.cloud.api.api.v0alpha.CollectionMetadata) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_COLLECTION:
          serviceImpl.deleteCollection((com.tcn.cloud.api.api.v0alpha.DeleteCollectionReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COLLECTIONS:
          serviceImpl.listCollections((com.tcn.cloud.api.api.v0alpha.ListCollectionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCollectionsRes>) responseObserver);
          break;
        case METHODID_RESET_COLLECTION:
          serviceImpl.resetCollection((com.tcn.cloud.api.api.v0alpha.ResetCollectionReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADD_COLLECTION_ENTRY:
          serviceImpl.addCollectionEntry((com.tcn.cloud.api.api.v0alpha.CollectionEntry) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry>) responseObserver);
          break;
        case METHODID_DELETE_COLLECTION_ENTRY:
          serviceImpl.deleteCollectionEntry((com.tcn.cloud.api.api.v0alpha.DeleteCollectionEntryReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_COLLECTION_ENTRY:
          serviceImpl.updateCollectionEntry((com.tcn.cloud.api.api.v0alpha.CollectionEntry) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry>) responseObserver);
          break;
        case METHODID_STREAM_COLLECTION:
          serviceImpl.streamCollection((com.tcn.cloud.api.api.v0alpha.StreamCollectionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CollectionEntry>) responseObserver);
          break;
        case METHODID_SEARCH_COLLECTIONS_PAGINATED:
          serviceImpl.searchCollectionsPaginated((com.tcn.cloud.api.api.v0alpha.SearchCollectionsPaginatedReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PaginatedSearchRes>) responseObserver);
          break;
        case METHODID_GET_COLLECTION_ENTRIES:
          serviceImpl.getCollectionEntries((com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCollectionEntriesRes>) responseObserver);
          break;
        case METHODID_CREATE_CJS_SEARCH_DEFINITION:
          serviceImpl.createCjsSearchDefinition((com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>) responseObserver);
          break;
        case METHODID_GET_CJS_SEARCH_DEFINITION:
          serviceImpl.getCjsSearchDefinition((com.tcn.cloud.api.api.v0alpha.GetCjsSearchDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition>) responseObserver);
          break;
        case METHODID_UPDATE_CJS_SEARCH_DEFINITION:
          serviceImpl.updateCjsSearchDefinition((com.tcn.cloud.api.api.v0alpha.CjsSearchDefinition) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CJS_SEARCH_DEFINITION:
          serviceImpl.deleteCjsSearchDefinition((com.tcn.cloud.api.api.v0alpha.DeleteCjsSearchDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_CJS_SEARCH_DEFINITIONS:
          serviceImpl.listCjsSearchDefinitions((com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCjsSearchDefinitionsRes>) responseObserver);
          break;
        case METHODID_EXECUTE_CJS_SEARCH_DEFINITION:
          serviceImpl.executeCjsSearchDefinition((com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes>) responseObserver);
          break;
        case METHODID_GET_CJS_SECURE_SEARCH_CRITERIA:
          serviceImpl.getCjsSecureSearchCriteria((com.tcn.cloud.api.api.v0alpha.GetCjsSecureSearchCriteriaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>) responseObserver);
          break;
        case METHODID_CREATE_CJS_SECURE_SEARCH_CRITERIA:
          serviceImpl.createCjsSecureSearchCriteria((com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria>) responseObserver);
          break;
        case METHODID_UPDATE_CJS_SECURE_SEARCH_CRITERIA:
          serviceImpl.updateCjsSecureSearchCriteria((com.tcn.cloud.api.api.v0alpha.CjsSecureSearchCriteria) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class LMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LMSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LMS");
    }
  }

  private static final class LMSFileDescriptorSupplier
      extends LMSBaseDescriptorSupplier {
    LMSFileDescriptorSupplier() {}
  }

  private static final class LMSMethodDescriptorSupplier
      extends LMSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LMSMethodDescriptorSupplier(String methodName) {
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
      synchronized (LMSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LMSFileDescriptorSupplier())
              .addMethod(getGetPublicKeyMethod())
              .addMethod(getCreateFileTemplateMethod())
              .addMethod(getListFileTemplatesMethod())
              .addMethod(getUpdateFileTemplateMethod())
              .addMethod(getDeleteFileTemplateMethod())
              .addMethod(getGetFileTemplateMethod())
              .addMethod(getCreateFieldMethod())
              .addMethod(getListFieldsMethod())
              .addMethod(getGetFieldMethod())
              .addMethod(getUpdateFieldMethod())
              .addMethod(getDeleteFieldMethod())
              .addMethod(getListAvailableFieldsByElementIdMethod())
              .addMethod(getListCampaignLinksMethod())
              .addMethod(getPeekListMethod())
              .addMethod(getGetHistoryMethod())
              .addMethod(getCreateElementMethod())
              .addMethod(getListElementsMethod())
              .addMethod(getUpdateElementMethod())
              .addMethod(getDeleteElementMethod())
              .addMethod(getCopyPipelineUpstreamMethod())
              .addMethod(getCopyPipelineDownstreamMethod())
              .addMethod(getProcessElementMethod())
              .addMethod(getGetAvailableFieldsMethod())
              .addMethod(getListNewEventsMethod())
              .addMethod(getViewQueueMethod())
              .addMethod(getAutocompleteMethod())
              .addMethod(getGetComplianceScrubListsMethod())
              .addMethod(getFindFieldUsagesMethod())
              .addMethod(getFindInvalidElementsMethod())
              .addMethod(getCreateCollectionMethod())
              .addMethod(getGetCollectionMethod())
              .addMethod(getUpdateCollectionMethod())
              .addMethod(getDeleteCollectionMethod())
              .addMethod(getListCollectionsMethod())
              .addMethod(getResetCollectionMethod())
              .addMethod(getAddCollectionEntryMethod())
              .addMethod(getDeleteCollectionEntryMethod())
              .addMethod(getUpdateCollectionEntryMethod())
              .addMethod(getStreamCollectionMethod())
              .addMethod(getSearchCollectionsPaginatedMethod())
              .addMethod(getGetCollectionEntriesMethod())
              .addMethod(getCreateCjsSearchDefinitionMethod())
              .addMethod(getGetCjsSearchDefinitionMethod())
              .addMethod(getUpdateCjsSearchDefinitionMethod())
              .addMethod(getDeleteCjsSearchDefinitionMethod())
              .addMethod(getListCjsSearchDefinitionsMethod())
              .addMethod(getExecuteCjsSearchDefinitionMethod())
              .addMethod(getGetCjsSecureSearchCriteriaMethod())
              .addMethod(getCreateCjsSecureSearchCriteriaMethod())
              .addMethod(getUpdateCjsSecureSearchCriteriaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
