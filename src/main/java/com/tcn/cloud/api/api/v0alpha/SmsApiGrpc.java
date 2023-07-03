package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for interacting with TCN's SMS API system.
 * Accessing all of the methods require an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: api/v0alpha/smsapi.proto")
@io.grpc.stub.annotations.GrpcGenerated
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsTemplates"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsTemplateBySid"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsIntentTemplates"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsIntentTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsIntentTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSmsIntentTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsIntentTemplateBySid"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsSourceNumbers"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsSourceNumber"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsSourceNumber"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSmsSourceNumber"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsSourceNumberBySid"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendSmsNotification"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsGroupByFilters"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsGroupsByGroupSids"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsTasksByGroupSids"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsGroupByFiltersForAudit"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsGroupsByGroupSidsForAudit"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsTasksByGroupSidsForAudit"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsTasksWithDetailedStatus"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsGroupStatus"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsGroupSendsPerMinute"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsGroupScheduleTimes"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleSms"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendUnconnectedSms"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmsActivitySearch"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInboundSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInboundSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInboundSmsTemplate"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundSmsTemplates"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInboundSmsTemplateById"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInboundSmsGroup"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInboundSmsGroup"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInboundSmsGroup"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundSmsGroups"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActiveInboundSmsGroups"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundSmsGroupByFilters"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInboundSmsGroupById"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundSmsGroupsByGroupIds"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopInboundSmsGroup"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleInboundSms"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsConversation"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSmsConversation"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSmsConversation"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsConversations"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsConversationById"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsMessage"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsConversationAudit"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsConversationAudits"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsConversationAuditById"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSmsConversationAssignedAgent"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSmsConversationAssignedAgents"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSmsConversationAssignedAgentById"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundSmsTasksByGroupIds"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAllOutboundSmsGroups"))
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAllInboundSmsGroups"))
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
    io.grpc.stub.AbstractStub.StubFactory<SmsApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsApiStub>() {
        @java.lang.Override
        public SmsApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsApiStub(channel, callOptions);
        }
      };
    return SmsApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsApiBlockingStub>() {
        @java.lang.Override
        public SmsApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsApiBlockingStub(channel, callOptions);
        }
      };
    return SmsApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsApiFutureStub>() {
        @java.lang.Override
        public SmsApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsApiFutureStub(channel, callOptions);
        }
      };
    return SmsApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * List Sms Templates  defined by ListSmsTemplatesReq message.
     * Gets all details belong to the clientsid
     * The method will return a stream of ListSmsTemplatesRes messages
     * containing SmsTemplates with SmsIntents
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void listSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsTemplate defined by CreateSmsTemplateReq message.
     * The method will return a CreateSmsTemplateRes message that will
     * contain the newly created values of the sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsTemplateMethod(), responseObserver);
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
    default void updateSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsTemplate defined by DeleteSmsTemplateReq message for
     * the specified sms_template_id
     * The method will return a DeleteSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsTemplate defined by GetSmsTemplateBySidReq message for the specified
     * sms_template_sid.
     * The method will return a SmsTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsTemplateBySidMethod(), responseObserver);
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
    default void listSmsIntentTemplates(com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsIntentTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsIntentTemplate defined by SmsIntentTemplate message.
     * The method will return a CreateSmsIntentTemplateRes message that will
     * contain the newly created values of the sms_intent_template_sid
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsIntentTemplateMethod(), responseObserver);
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
    default void updateSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsIntentTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsIntentTemplate defined by DeleteSmsIntentTemplateReq message for
     * the specified sms_intent_template_id
     * The method will return a DeleteSmsIntentTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteSmsIntentTemplate(com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSmsIntentTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an SmsIntentTemplate group defined by GetSmsIntentTemplateBySidReq message for the specified
     * sms_intent_template_sid.
     * The method will return a SmsIntentTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsIntentTemplateBySid(com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsIntentTemplateBySidMethod(), responseObserver);
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
    default void listSmsSourceNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsSourceNumbersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsSourceNumber defined by CreateSmsSourceNumberReq message.
     * The method will return a CreateSmsSourceNumberRes message that will
     * contain the newly created values of the sms_number_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsSourceNumberMethod(), responseObserver);
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
    default void updateSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsSourceNumberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsSourceNumber defined by DeleteSmsSourceNumberReq message for
     * the specified sms_number_id
     * The method will return a DeleteSmsSourceNumberRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteSmsSourceNumber(com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSmsSourceNumberMethod(), responseObserver);
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
    default void getSmsSourceNumberBySid(com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsNumbers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsSourceNumberBySidMethod(), responseObserver);
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
    default void sendSmsNotification(com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendSmsNotificationMethod(), responseObserver);
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
    default void listSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsGroupByFiltersMethod(), responseObserver);
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
    default void listSmsGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsGroupsByGroupSidsMethod(), responseObserver);
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
    default void listSmsTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsTasksByGroupSidsMethod(), responseObserver);
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
    default void listSmsGroupByFiltersForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsGroupByFiltersForAuditMethod(), responseObserver);
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
    default void listSmsGroupsByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsGroupsByGroupSidsForAuditMethod(), responseObserver);
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
    default void listSmsTasksByGroupSidsForAudit(com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsTasksByGroupSidsForAuditMethod(), responseObserver);
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
    default void listSmsTasksWithDetailedStatus(com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsTasksWithDetailedStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * paused/unpaused/cancel status
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void updateSmsGroupStatus(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsGroupStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * pacing
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void updateSmsGroupSendsPerMinute(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsGroupSendsPerMinuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the Scheduled Sms group defined by SmsGroupInfo message for the specified
     * schedule_time
     * The method will return a UpdateSmsGroupRes message with true or false .
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void updateSmsGroupScheduleTimes(com.tcn.cloud.api.api.v0alpha.SmsGroupInfo request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsGroupScheduleTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Sms group defined by ScheduleSmsReq message for the specified
     * sms_template_id with initialpace, sourcenumber, contactgroupsid
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void scheduleSms(com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Re-Schedule Sms group defined by ResendUnconnectedSmsReq message for the specified
     * sms_group_id and start/stop time.
     * The method will return a Sms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void resendUnconnectedSms(com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendUnconnectedSmsMethod(), responseObserver);
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
    default void smsActivitySearch(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmsActivitySearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsTemplate defined by CreateInboundSmsTemplateReq message.
     * The method will return a CreateInboundSmsTemplateRes message that will
     * contain the newly created values of the inbound_sms_template_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInboundSmsTemplateMethod(), responseObserver);
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
    default void updateInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInboundSmsTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsTemplate defined by DeleteInboundSmsTemplateReq message for
     * the specified inbound_sms_template_id, region_id and org_id
     * The method will return a DeleteInboundSmsTemplateRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteInboundSmsTemplate(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInboundSmsTemplateMethod(), responseObserver);
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
    default void listInboundSmsTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundSmsTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSmsTemplate group defined by GetInboundSmsTemplateByIdReq message for the specified
     * inbound_sms_template_id, region_id and org_id.
     * The method will return a InboundTemplate group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getInboundSmsTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInboundSmsTemplateByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a InboundSmsGroup defined by CreateInboundSmsGroupReq message.
     * The method will return a CreateInboundSmsGroupRes message that will
     * contain the newly created values of the inbound_sms_group_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInboundSmsGroupMethod(), responseObserver);
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
    default void updateInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a InboundSmsGroup defined by DeleteInboundSmsGroupReq message for
     * the specified inbound_sms_group_id, region_id and org_id
     * The method will return a DeleteInboundSmsGroupRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInboundSmsGroupMethod(), responseObserver);
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
    default void listInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundSmsGroupsMethod(), responseObserver);
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
    default void listActiveInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActiveInboundSmsGroupsMethod(), responseObserver);
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
    default void listInboundSmsGroupByFilters(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundSmsGroupByFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an InboundSms group defined by GetInboundSmsGroupByIdReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will return a InboundSms group.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getInboundSmsGroupById(com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInboundSmsGroupByIdMethod(), responseObserver);
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
    default void listInboundSmsGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundSmsGroupsByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop an InboundSms group defined by StopInboundSmsGroupReq message for the specified
     * inbound_sms_group_id, region_id and org_id.
     * The method will mark the InboundSms group completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void stopInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopInboundSmsGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule InboundSms group defined by ScheduleInboundSmsReq message for the specified
     * inbound_sms_template_id and sms_number_sid.
     * The method will return a InboundSms group.
     * Required permissions: EXECUTE_SEND_BROADCAST
     * </pre>
     */
    default void scheduleInboundSms(com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleInboundSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversation defined by CreateSmsConversationReq message.
     * The method will return a CreateSmsConversationRes message that will
     * contain the newly created values of the sms_conversation_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsConversation(com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsConversationMethod(), responseObserver);
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
    default void updateSmsConversation(com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSmsConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a SmsConversation defined by DeleteSmsConversationReq message for
     * the specified sms_conversation_id, region_id and org_id
     * The method will return a DeleteSmsConversationRes message with true or false .
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void deleteSmsConversation(com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSmsConversationMethod(), responseObserver);
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
    default void listSmsConversations(com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversation defined by GetSmsConversationByIdReq message for the specified
     * sms_conversation_id, region_id and org_id.
     * The method will return a SmsConversation.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsConversationById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsConversationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets SmsMessage defined by GetSmsMessageReq message for the specified
     * sms_message_sid.
     * The method will return a SmsMessage.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsMessage(com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAudit defined by SmsConversationAudit message.
     * The method will return a CreateSmsConversationAuditRes message that will
     * contain the newly created values of the sms_conversation_audit_id
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsConversationAuditMethod(), responseObserver);
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
    default void listSmsConversationAudits(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsConversationAuditsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAudit defined by GetSmsConversationAuditByIdReq message for the specified
     * sms_conversation_audit_id.
     * The method will return a SmsConversationAudit.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsConversationAuditById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsConversationAuditByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record a SmsConversationAssignedAgent defined by SmsConversationAssignedAgent message.
     * The method will return a CreateSmsConversationAssignedAgentRes message with true or false
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void createSmsConversationAssignedAgent(com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSmsConversationAssignedAgentMethod(), responseObserver);
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
    default void listSmsConversationAssignedAgents(com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSmsConversationAssignedAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a SmsConversationAssignedAgent defined by GetSmsConversationAssignedAgentByIdReq message for the specified
     * conversation_id &amp; assigned_agent_id
     * The method will return a SmsConversationAssignedAgent.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void getSmsConversationAssignedAgentById(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmsConversationAssignedAgentByIdMethod(), responseObserver);
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
    default void listInboundSmsTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundSmsTasksByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop all OutboundSms groups defined by StopAllOutboundSmsGroupsReq message for the specified
     * array of outbound groups and client_sid.
     * The method will mark the OutboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void stopAllOutboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAllOutboundSmsGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop all InboundSms groups defined by StopAllInboundSmsGroupsReq message for the specified
     * array of inbound groups, region_id and org_id.
     * The method will mark the InboundSms groups as completed.
     * Required permissions: VIEW_SMS
     * </pre>
     */
    default void stopAllInboundSmsGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAllInboundSmsGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmsApi.
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class SmsApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmsApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmsApi.
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiStub
      extends io.grpc.stub.AbstractAsyncStub<SmsApiStub> {
    private SmsApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAllInboundSmsGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmsApi.
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmsApiBlockingStub> {
    private SmsApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAllInboundSmsGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmsApi.
   * <pre>
   * Service for interacting with TCN's SMS API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class SmsApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmsApiFutureStub> {
    private SmsApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getListSmsTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsTemplatesRes>(
                service, METHODID_LIST_SMS_TEMPLATES)))
        .addMethod(
          getCreateSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateRes>(
                service, METHODID_CREATE_SMS_TEMPLATE)))
        .addMethod(
          getUpdateSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateRes>(
                service, METHODID_UPDATE_SMS_TEMPLATE)))
        .addMethod(
          getDeleteSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.DeleteSmsTemplateRes>(
                service, METHODID_DELETE_SMS_TEMPLATE)))
        .addMethod(
          getGetSmsTemplateBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidReq,
              com.tcn.cloud.api.api.v0alpha.GetSmsTemplateBySidRes>(
                service, METHODID_GET_SMS_TEMPLATE_BY_SID)))
        .addMethod(
          getListSmsIntentTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsIntentTemplatesRes>(
                service, METHODID_LIST_SMS_INTENT_TEMPLATES)))
        .addMethod(
          getCreateSmsIntentTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
              com.tcn.cloud.api.api.v0alpha.CreateSmsIntentTemplateRes>(
                service, METHODID_CREATE_SMS_INTENT_TEMPLATE)))
        .addMethod(
          getUpdateSmsIntentTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsIntentTemplateRes>(
                service, METHODID_UPDATE_SMS_INTENT_TEMPLATE)))
        .addMethod(
          getDeleteSmsIntentTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateReq,
              com.tcn.cloud.api.api.v0alpha.DeleteSmsIntentTemplateRes>(
                service, METHODID_DELETE_SMS_INTENT_TEMPLATE)))
        .addMethod(
          getGetSmsIntentTemplateBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsIntentTemplateBySidReq,
              com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate>(
                service, METHODID_GET_SMS_INTENT_TEMPLATE_BY_SID)))
        .addMethod(
          getListSmsSourceNumbersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsSourceNumbersRes>(
                service, METHODID_LIST_SMS_SOURCE_NUMBERS)))
        .addMethod(
          getCreateSmsSourceNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberReq,
              com.tcn.cloud.api.api.v0alpha.CreateSmsSourceNumberRes>(
                service, METHODID_CREATE_SMS_SOURCE_NUMBER)))
        .addMethod(
          getUpdateSmsSourceNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberReq,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsSourceNumberRes>(
                service, METHODID_UPDATE_SMS_SOURCE_NUMBER)))
        .addMethod(
          getDeleteSmsSourceNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberReq,
              com.tcn.cloud.api.api.v0alpha.DeleteSmsSourceNumberRes>(
                service, METHODID_DELETE_SMS_SOURCE_NUMBER)))
        .addMethod(
          getGetSmsSourceNumberBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsSourceNumberBySidReq,
              com.tcn.cloud.api.api.v0alpha.SmsNumbers>(
                service, METHODID_GET_SMS_SOURCE_NUMBER_BY_SID)))
        .addMethod(
          getSendSmsNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendSmsNotificationReq,
              com.tcn.cloud.api.api.v0alpha.SendSmsNotificationRes>(
                service, METHODID_SEND_SMS_NOTIFICATION)))
        .addMethod(
          getListSmsGroupByFiltersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>(
                service, METHODID_LIST_SMS_GROUP_BY_FILTERS)))
        .addMethod(
          getListSmsGroupsByGroupSidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>(
                service, METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS)))
        .addMethod(
          getListSmsTasksByGroupSidsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>(
                service, METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS)))
        .addMethod(
          getListSmsGroupByFiltersForAuditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes>(
                service, METHODID_LIST_SMS_GROUP_BY_FILTERS_FOR_AUDIT)))
        .addMethod(
          getListSmsGroupsByGroupSidsForAuditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupsByGroupSidsRes>(
                service, METHODID_LIST_SMS_GROUPS_BY_GROUP_SIDS_FOR_AUDIT)))
        .addMethod(
          getListSmsTasksByGroupSidsForAuditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksByGroupSidsRes>(
                service, METHODID_LIST_SMS_TASKS_BY_GROUP_SIDS_FOR_AUDIT)))
        .addMethod(
          getListSmsTasksWithDetailedStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsTasksWithDetailedStatusRes>(
                service, METHODID_LIST_SMS_TASKS_WITH_DETAILED_STATUS)))
        .addMethod(
          getUpdateSmsGroupStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                service, METHODID_UPDATE_SMS_GROUP_STATUS)))
        .addMethod(
          getUpdateSmsGroupSendsPerMinuteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                service, METHODID_UPDATE_SMS_GROUP_SENDS_PER_MINUTE)))
        .addMethod(
          getUpdateSmsGroupScheduleTimesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsGroupInfo,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsGroupRes>(
                service, METHODID_UPDATE_SMS_GROUP_SCHEDULE_TIMES)))
        .addMethod(
          getScheduleSmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ScheduleSmsReq,
              com.tcn.cloud.api.api.v0alpha.ScheduleSmsRes>(
                service, METHODID_SCHEDULE_SMS)))
        .addMethod(
          getResendUnconnectedSmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsReq,
              com.tcn.cloud.api.api.v0alpha.ResendUnconnectedSmsRes>(
                service, METHODID_RESEND_UNCONNECTED_SMS)))
        .addMethod(
          getSmsActivitySearchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq,
              com.tcn.cloud.api.api.v0alpha.SmsActivitySearchRes>(
                service, METHODID_SMS_ACTIVITY_SEARCH)))
        .addMethod(
          getCreateInboundSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateRes>(
                service, METHODID_CREATE_INBOUND_SMS_TEMPLATE)))
        .addMethod(
          getUpdateInboundSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsTemplateRes>(
                service, METHODID_UPDATE_INBOUND_SMS_TEMPLATE)))
        .addMethod(
          getDeleteInboundSmsTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateReq,
              com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsTemplateRes>(
                service, METHODID_DELETE_INBOUND_SMS_TEMPLATE)))
        .addMethod(
          getListInboundSmsTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesReq,
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsTemplatesRes>(
                service, METHODID_LIST_INBOUND_SMS_TEMPLATES)))
        .addMethod(
          getGetInboundSmsTemplateByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdReq,
              com.tcn.cloud.api.api.v0alpha.GetInboundSmsTemplateByIdRes>(
                service, METHODID_GET_INBOUND_SMS_TEMPLATE_BY_ID)))
        .addMethod(
          getCreateInboundSmsGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupReq,
              com.tcn.cloud.api.api.v0alpha.CreateInboundSmsGroupRes>(
                service, METHODID_CREATE_INBOUND_SMS_GROUP)))
        .addMethod(
          getUpdateInboundSmsGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupReq,
              com.tcn.cloud.api.api.v0alpha.UpdateInboundSmsGroupRes>(
                service, METHODID_UPDATE_INBOUND_SMS_GROUP)))
        .addMethod(
          getDeleteInboundSmsGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupReq,
              com.tcn.cloud.api.api.v0alpha.DeleteInboundSmsGroupRes>(
                service, METHODID_DELETE_INBOUND_SMS_GROUP)))
        .addMethod(
          getListInboundSmsGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsReq,
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsRes>(
                service, METHODID_LIST_INBOUND_SMS_GROUPS)))
        .addMethod(
          getListActiveInboundSmsGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsReq,
              com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes>(
                service, METHODID_LIST_ACTIVE_INBOUND_SMS_GROUPS)))
        .addMethod(
          getListInboundSmsGroupByFiltersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersReq,
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupByFiltersRes>(
                service, METHODID_LIST_INBOUND_SMS_GROUP_BY_FILTERS)))
        .addMethod(
          getGetInboundSmsGroupByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdReq,
              com.tcn.cloud.api.api.v0alpha.GetInboundSmsGroupByIdRes>(
                service, METHODID_GET_INBOUND_SMS_GROUP_BY_ID)))
        .addMethod(
          getListInboundSmsGroupsByGroupIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsReq,
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsGroupsByGroupIdsRes>(
                service, METHODID_LIST_INBOUND_SMS_GROUPS_BY_GROUP_IDS)))
        .addMethod(
          getStopInboundSmsGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupReq,
              com.tcn.cloud.api.api.v0alpha.StopInboundSmsGroupRes>(
                service, METHODID_STOP_INBOUND_SMS_GROUP)))
        .addMethod(
          getScheduleInboundSmsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsReq,
              com.tcn.cloud.api.api.v0alpha.ScheduleInboundSmsRes>(
                service, METHODID_SCHEDULE_INBOUND_SMS)))
        .addMethod(
          getCreateSmsConversationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateSmsConversationReq,
              com.tcn.cloud.api.api.v0alpha.CreateSmsConversationRes>(
                service, METHODID_CREATE_SMS_CONVERSATION)))
        .addMethod(
          getUpdateSmsConversationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationReq,
              com.tcn.cloud.api.api.v0alpha.UpdateSmsConversationRes>(
                service, METHODID_UPDATE_SMS_CONVERSATION)))
        .addMethod(
          getDeleteSmsConversationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationReq,
              com.tcn.cloud.api.api.v0alpha.DeleteSmsConversationRes>(
                service, METHODID_DELETE_SMS_CONVERSATION)))
        .addMethod(
          getListSmsConversationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationsRes>(
                service, METHODID_LIST_SMS_CONVERSATIONS)))
        .addMethod(
          getGetSmsConversationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdReq,
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationByIdRes>(
                service, METHODID_GET_SMS_CONVERSATION_BY_ID)))
        .addMethod(
          getGetSmsMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsMessageReq,
              com.tcn.cloud.api.api.v0alpha.GetSmsMessageRes>(
                service, METHODID_GET_SMS_MESSAGE)))
        .addMethod(
          getCreateSmsConversationAuditMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsConversationAudit,
              com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAuditRes>(
                service, METHODID_CREATE_SMS_CONVERSATION_AUDIT)))
        .addMethod(
          getListSmsConversationAuditsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationAuditsRes>(
                service, METHODID_LIST_SMS_CONVERSATION_AUDITS)))
        .addMethod(
          getGetSmsConversationAuditByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdReq,
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes>(
                service, METHODID_GET_SMS_CONVERSATION_AUDIT_BY_ID)))
        .addMethod(
          getCreateSmsConversationAssignedAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SmsConversationAssignedAgent,
              com.tcn.cloud.api.api.v0alpha.CreateSmsConversationAssignedAgentRes>(
                service, METHODID_CREATE_SMS_CONVERSATION_ASSIGNED_AGENT)))
        .addMethod(
          getListSmsConversationAssignedAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsReq,
              com.tcn.cloud.api.api.v0alpha.ListSmsConversationAssignedAgentsRes>(
                service, METHODID_LIST_SMS_CONVERSATION_ASSIGNED_AGENTS)))
        .addMethod(
          getGetSmsConversationAssignedAgentByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdReq,
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAssignedAgentByIdRes>(
                service, METHODID_GET_SMS_CONVERSATION_ASSIGNED_AGENT_BY_ID)))
        .addMethod(
          getListInboundSmsTasksByGroupIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsReq,
              com.tcn.cloud.api.api.v0alpha.ListInboundSmsTasksByGroupIdsRes>(
                service, METHODID_LIST_INBOUND_SMS_TASKS_BY_GROUP_IDS)))
        .addMethod(
          getStopAllOutboundSmsGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsReq,
              com.tcn.cloud.api.api.v0alpha.StopAllOutboundSmsGroupsRes>(
                service, METHODID_STOP_ALL_OUTBOUND_SMS_GROUPS)))
        .addMethod(
          getStopAllInboundSmsGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsReq,
              com.tcn.cloud.api.api.v0alpha.StopAllInboundSmsGroupsRes>(
                service, METHODID_STOP_ALL_INBOUND_SMS_GROUPS)))
        .build();
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
