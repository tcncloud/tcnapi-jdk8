package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.0)",
    comments = "Source: api/v0alpha/emailapi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmailApiGrpc {

  private EmailApiGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.EmailApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> getCreateEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> getCreateEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> getCreateEmailTemplateMethod;
    if ((getCreateEmailTemplateMethod = EmailApiGrpc.getCreateEmailTemplateMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateEmailTemplateMethod = EmailApiGrpc.getCreateEmailTemplateMethod) == null) {
          EmailApiGrpc.getCreateEmailTemplateMethod = getCreateEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateEmailTemplate"))
              .build();
        }
      }
    }
    return getCreateEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> getUpdateEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> getUpdateEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> getUpdateEmailTemplateMethod;
    if ((getUpdateEmailTemplateMethod = EmailApiGrpc.getUpdateEmailTemplateMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateEmailTemplateMethod = EmailApiGrpc.getUpdateEmailTemplateMethod) == null) {
          EmailApiGrpc.getUpdateEmailTemplateMethod = getUpdateEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateEmailTemplate"))
              .build();
        }
      }
    }
    return getUpdateEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> getCreateEmailTemplateAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailTemplateAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> getCreateEmailTemplateAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> getCreateEmailTemplateAttachmentMethod;
    if ((getCreateEmailTemplateAttachmentMethod = EmailApiGrpc.getCreateEmailTemplateAttachmentMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateEmailTemplateAttachmentMethod = EmailApiGrpc.getCreateEmailTemplateAttachmentMethod) == null) {
          EmailApiGrpc.getCreateEmailTemplateAttachmentMethod = getCreateEmailTemplateAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailTemplateAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateEmailTemplateAttachment"))
              .build();
        }
      }
    }
    return getCreateEmailTemplateAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq,
      com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> getCopyEmailTemplateWithAttachmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyEmailTemplateWithAttachments",
      requestType = com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq,
      com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> getCopyEmailTemplateWithAttachmentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq, com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> getCopyEmailTemplateWithAttachmentsMethod;
    if ((getCopyEmailTemplateWithAttachmentsMethod = EmailApiGrpc.getCopyEmailTemplateWithAttachmentsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCopyEmailTemplateWithAttachmentsMethod = EmailApiGrpc.getCopyEmailTemplateWithAttachmentsMethod) == null) {
          EmailApiGrpc.getCopyEmailTemplateWithAttachmentsMethod = getCopyEmailTemplateWithAttachmentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq, com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyEmailTemplateWithAttachments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CopyEmailTemplateWithAttachments"))
              .build();
        }
      }
    }
    return getCopyEmailTemplateWithAttachmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> getUpdateEmailTemplateAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailTemplateAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> getUpdateEmailTemplateAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> getUpdateEmailTemplateAttachmentMethod;
    if ((getUpdateEmailTemplateAttachmentMethod = EmailApiGrpc.getUpdateEmailTemplateAttachmentMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateEmailTemplateAttachmentMethod = EmailApiGrpc.getUpdateEmailTemplateAttachmentMethod) == null) {
          EmailApiGrpc.getUpdateEmailTemplateAttachmentMethod = getUpdateEmailTemplateAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq, com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailTemplateAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateEmailTemplateAttachment"))
              .build();
        }
      }
    }
    return getUpdateEmailTemplateAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq,
      com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> getGetEmailTemplateByTemplateSidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailTemplateByTemplateSid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq,
      com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> getGetEmailTemplateByTemplateSidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq, com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> getGetEmailTemplateByTemplateSidMethod;
    if ((getGetEmailTemplateByTemplateSidMethod = EmailApiGrpc.getGetEmailTemplateByTemplateSidMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailTemplateByTemplateSidMethod = EmailApiGrpc.getGetEmailTemplateByTemplateSidMethod) == null) {
          EmailApiGrpc.getGetEmailTemplateByTemplateSidMethod = getGetEmailTemplateByTemplateSidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq, com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailTemplateByTemplateSid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailTemplateByTemplateSid"))
              .build();
        }
      }
    }
    return getGetEmailTemplateByTemplateSidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> getGetAllEmailTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllEmailTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> getGetAllEmailTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq, com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> getGetAllEmailTemplatesMethod;
    if ((getGetAllEmailTemplatesMethod = EmailApiGrpc.getGetAllEmailTemplatesMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetAllEmailTemplatesMethod = EmailApiGrpc.getGetAllEmailTemplatesMethod) == null) {
          EmailApiGrpc.getGetAllEmailTemplatesMethod = getGetAllEmailTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq, com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllEmailTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetAllEmailTemplates"))
              .build();
        }
      }
    }
    return getGetAllEmailTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> getDeleteEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmailTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> getDeleteEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> getDeleteEmailTemplateMethod;
    if ((getDeleteEmailTemplateMethod = EmailApiGrpc.getDeleteEmailTemplateMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getDeleteEmailTemplateMethod = EmailApiGrpc.getDeleteEmailTemplateMethod) == null) {
          EmailApiGrpc.getDeleteEmailTemplateMethod = getDeleteEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("DeleteEmailTemplate"))
              .build();
        }
      }
    }
    return getDeleteEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> getDeleteEmailTemplateAttachmentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmailTemplateAttachmentById",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> getDeleteEmailTemplateAttachmentByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> getDeleteEmailTemplateAttachmentByIdMethod;
    if ((getDeleteEmailTemplateAttachmentByIdMethod = EmailApiGrpc.getDeleteEmailTemplateAttachmentByIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getDeleteEmailTemplateAttachmentByIdMethod = EmailApiGrpc.getDeleteEmailTemplateAttachmentByIdMethod) == null) {
          EmailApiGrpc.getDeleteEmailTemplateAttachmentByIdMethod = getDeleteEmailTemplateAttachmentByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmailTemplateAttachmentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("DeleteEmailTemplateAttachmentById"))
              .build();
        }
      }
    }
    return getDeleteEmailTemplateAttachmentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> getDownloadInboundEmailAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadInboundEmailAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> getDownloadInboundEmailAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq, com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> getDownloadInboundEmailAttachmentMethod;
    if ((getDownloadInboundEmailAttachmentMethod = EmailApiGrpc.getDownloadInboundEmailAttachmentMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getDownloadInboundEmailAttachmentMethod = EmailApiGrpc.getDownloadInboundEmailAttachmentMethod) == null) {
          EmailApiGrpc.getDownloadInboundEmailAttachmentMethod = getDownloadInboundEmailAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq, com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadInboundEmailAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("DownloadInboundEmailAttachment"))
              .build();
        }
      }
    }
    return getDownloadInboundEmailAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> getPureEmailGroupSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PureEmailGroupSearch",
      requestType = com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> getPureEmailGroupSearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> getPureEmailGroupSearchMethod;
    if ((getPureEmailGroupSearchMethod = EmailApiGrpc.getPureEmailGroupSearchMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getPureEmailGroupSearchMethod = EmailApiGrpc.getPureEmailGroupSearchMethod) == null) {
          EmailApiGrpc.getPureEmailGroupSearchMethod = getPureEmailGroupSearchMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PureEmailGroupSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("PureEmailGroupSearch"))
              .build();
        }
      }
    }
    return getPureEmailGroupSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
      com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getManagerListNewEmailMessageRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerListNewEmailMessageReplies",
      requestType = com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
      com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getManagerListNewEmailMessageRepliesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq, com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getManagerListNewEmailMessageRepliesMethod;
    if ((getManagerListNewEmailMessageRepliesMethod = EmailApiGrpc.getManagerListNewEmailMessageRepliesMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getManagerListNewEmailMessageRepliesMethod = EmailApiGrpc.getManagerListNewEmailMessageRepliesMethod) == null) {
          EmailApiGrpc.getManagerListNewEmailMessageRepliesMethod = getManagerListNewEmailMessageRepliesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq, com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerListNewEmailMessageReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ManagerListNewEmailMessageReplies"))
              .build();
        }
      }
    }
    return getManagerListNewEmailMessageRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
      com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getListNewEmailMessageRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNewEmailMessageReplies",
      requestType = com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
      com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getListNewEmailMessageRepliesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq, com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> getListNewEmailMessageRepliesMethod;
    if ((getListNewEmailMessageRepliesMethod = EmailApiGrpc.getListNewEmailMessageRepliesMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListNewEmailMessageRepliesMethod = EmailApiGrpc.getListNewEmailMessageRepliesMethod) == null) {
          EmailApiGrpc.getListNewEmailMessageRepliesMethod = getListNewEmailMessageRepliesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq, com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNewEmailMessageReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListNewEmailMessageReplies"))
              .build();
        }
      }
    }
    return getListNewEmailMessageRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> getGetEmailTasksByGroupSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailTasksByGroupSids",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> getGetEmailTasksByGroupSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> getGetEmailTasksByGroupSidsMethod;
    if ((getGetEmailTasksByGroupSidsMethod = EmailApiGrpc.getGetEmailTasksByGroupSidsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailTasksByGroupSidsMethod = EmailApiGrpc.getGetEmailTasksByGroupSidsMethod) == null) {
          EmailApiGrpc.getGetEmailTasksByGroupSidsMethod = getGetEmailTasksByGroupSidsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailTasksByGroupSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailTasksByGroupSids"))
              .build();
        }
      }
    }
    return getGetEmailTasksByGroupSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> getUpdateEmailGroupStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailGroupStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> getUpdateEmailGroupStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq, com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> getUpdateEmailGroupStatusMethod;
    if ((getUpdateEmailGroupStatusMethod = EmailApiGrpc.getUpdateEmailGroupStatusMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateEmailGroupStatusMethod = EmailApiGrpc.getUpdateEmailGroupStatusMethod) == null) {
          EmailApiGrpc.getUpdateEmailGroupStatusMethod = getUpdateEmailGroupStatusMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq, com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailGroupStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateEmailGroupStatus"))
              .build();
        }
      }
    }
    return getUpdateEmailGroupStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> getGetEmailMessageDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailMessageDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> getGetEmailMessageDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq, com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> getGetEmailMessageDetailsMethod;
    if ((getGetEmailMessageDetailsMethod = EmailApiGrpc.getGetEmailMessageDetailsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailMessageDetailsMethod = EmailApiGrpc.getGetEmailMessageDetailsMethod) == null) {
          EmailApiGrpc.getGetEmailMessageDetailsMethod = getGetEmailMessageDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq, com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailMessageDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailMessageDetails"))
              .build();
        }
      }
    }
    return getGetEmailMessageDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> getCreateInboundEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInboundEmailTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> getCreateInboundEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> getCreateInboundEmailTemplateMethod;
    if ((getCreateInboundEmailTemplateMethod = EmailApiGrpc.getCreateInboundEmailTemplateMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateInboundEmailTemplateMethod = EmailApiGrpc.getCreateInboundEmailTemplateMethod) == null) {
          EmailApiGrpc.getCreateInboundEmailTemplateMethod = getCreateInboundEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInboundEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateInboundEmailTemplate"))
              .build();
        }
      }
    }
    return getCreateInboundEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> getUpdateInboundEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInboundEmailTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> getUpdateInboundEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> getUpdateInboundEmailTemplateMethod;
    if ((getUpdateInboundEmailTemplateMethod = EmailApiGrpc.getUpdateInboundEmailTemplateMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateInboundEmailTemplateMethod = EmailApiGrpc.getUpdateInboundEmailTemplateMethod) == null) {
          EmailApiGrpc.getUpdateInboundEmailTemplateMethod = getUpdateInboundEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInboundEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateInboundEmailTemplate"))
              .build();
        }
      }
    }
    return getUpdateInboundEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> getDeleteInboundEmailTemplateByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInboundEmailTemplateById",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> getDeleteInboundEmailTemplateByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> getDeleteInboundEmailTemplateByIdMethod;
    if ((getDeleteInboundEmailTemplateByIdMethod = EmailApiGrpc.getDeleteInboundEmailTemplateByIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getDeleteInboundEmailTemplateByIdMethod = EmailApiGrpc.getDeleteInboundEmailTemplateByIdMethod) == null) {
          EmailApiGrpc.getDeleteInboundEmailTemplateByIdMethod = getDeleteInboundEmailTemplateByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInboundEmailTemplateById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("DeleteInboundEmailTemplateById"))
              .build();
        }
      }
    }
    return getDeleteInboundEmailTemplateByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> getListInboundEmailTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundEmailTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> getListInboundEmailTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> getListInboundEmailTemplatesMethod;
    if ((getListInboundEmailTemplatesMethod = EmailApiGrpc.getListInboundEmailTemplatesMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListInboundEmailTemplatesMethod = EmailApiGrpc.getListInboundEmailTemplatesMethod) == null) {
          EmailApiGrpc.getListInboundEmailTemplatesMethod = getListInboundEmailTemplatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundEmailTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListInboundEmailTemplates"))
              .build();
        }
      }
    }
    return getListInboundEmailTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> getGetInboundEmailTemplateByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInboundEmailTemplateById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> getGetInboundEmailTemplateByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> getGetInboundEmailTemplateByIdMethod;
    if ((getGetInboundEmailTemplateByIdMethod = EmailApiGrpc.getGetInboundEmailTemplateByIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetInboundEmailTemplateByIdMethod = EmailApiGrpc.getGetInboundEmailTemplateByIdMethod) == null) {
          EmailApiGrpc.getGetInboundEmailTemplateByIdMethod = getGetInboundEmailTemplateByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq, com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInboundEmailTemplateById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetInboundEmailTemplateById"))
              .build();
        }
      }
    }
    return getGetInboundEmailTemplateByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> getUpdateInboundEmailGroupStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInboundEmailGroupStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> getUpdateInboundEmailGroupStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> getUpdateInboundEmailGroupStatusMethod;
    if ((getUpdateInboundEmailGroupStatusMethod = EmailApiGrpc.getUpdateInboundEmailGroupStatusMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateInboundEmailGroupStatusMethod = EmailApiGrpc.getUpdateInboundEmailGroupStatusMethod) == null) {
          EmailApiGrpc.getUpdateInboundEmailGroupStatusMethod = getUpdateInboundEmailGroupStatusMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInboundEmailGroupStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateInboundEmailGroupStatus"))
              .build();
        }
      }
    }
    return getUpdateInboundEmailGroupStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopInboundEmailGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopInboundEmailGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopInboundEmailGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopInboundEmailGroupMethod;
    if ((getStopInboundEmailGroupMethod = EmailApiGrpc.getStopInboundEmailGroupMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getStopInboundEmailGroupMethod = EmailApiGrpc.getStopInboundEmailGroupMethod) == null) {
          EmailApiGrpc.getStopInboundEmailGroupMethod = getStopInboundEmailGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopInboundEmailGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("StopInboundEmailGroup"))
              .build();
        }
      }
    }
    return getStopInboundEmailGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopAllInboundEmailGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopAllInboundEmailGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq,
      com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopAllInboundEmailGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq, com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> getStopAllInboundEmailGroupsMethod;
    if ((getStopAllInboundEmailGroupsMethod = EmailApiGrpc.getStopAllInboundEmailGroupsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getStopAllInboundEmailGroupsMethod = EmailApiGrpc.getStopAllInboundEmailGroupsMethod) == null) {
          EmailApiGrpc.getStopAllInboundEmailGroupsMethod = getStopAllInboundEmailGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq, com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopAllInboundEmailGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("StopAllInboundEmailGroups"))
              .build();
        }
      }
    }
    return getStopAllInboundEmailGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> getPureInboundEmailGroupSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PureInboundEmailGroupSearch",
      requestType = com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> getPureInboundEmailGroupSearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> getPureInboundEmailGroupSearchMethod;
    if ((getPureInboundEmailGroupSearchMethod = EmailApiGrpc.getPureInboundEmailGroupSearchMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getPureInboundEmailGroupSearchMethod = EmailApiGrpc.getPureInboundEmailGroupSearchMethod) == null) {
          EmailApiGrpc.getPureInboundEmailGroupSearchMethod = getPureInboundEmailGroupSearchMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PureInboundEmailGroupSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("PureInboundEmailGroupSearch"))
              .build();
        }
      }
    }
    return getPureInboundEmailGroupSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> getInboundEmailGroupSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InboundEmailGroupSearch",
      requestType = com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> getInboundEmailGroupSearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> getInboundEmailGroupSearchMethod;
    if ((getInboundEmailGroupSearchMethod = EmailApiGrpc.getInboundEmailGroupSearchMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getInboundEmailGroupSearchMethod = EmailApiGrpc.getInboundEmailGroupSearchMethod) == null) {
          EmailApiGrpc.getInboundEmailGroupSearchMethod = getInboundEmailGroupSearchMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq, com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InboundEmailGroupSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("InboundEmailGroupSearch"))
              .build();
        }
      }
    }
    return getInboundEmailGroupSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> getListInboundEmailGroupsByGroupIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundEmailGroupsByGroupIds",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> getListInboundEmailGroupsByGroupIdsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> getListInboundEmailGroupsByGroupIdsMethod;
    if ((getListInboundEmailGroupsByGroupIdsMethod = EmailApiGrpc.getListInboundEmailGroupsByGroupIdsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListInboundEmailGroupsByGroupIdsMethod = EmailApiGrpc.getListInboundEmailGroupsByGroupIdsMethod) == null) {
          EmailApiGrpc.getListInboundEmailGroupsByGroupIdsMethod = getListInboundEmailGroupsByGroupIdsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundEmailGroupsByGroupIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListInboundEmailGroupsByGroupIds"))
              .build();
        }
      }
    }
    return getListInboundEmailGroupsByGroupIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> getListInboundEmailTasksByGroupIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInboundEmailTasksByGroupIds",
      requestType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq,
      com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> getListInboundEmailTasksByGroupIdsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> getListInboundEmailTasksByGroupIdsMethod;
    if ((getListInboundEmailTasksByGroupIdsMethod = EmailApiGrpc.getListInboundEmailTasksByGroupIdsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListInboundEmailTasksByGroupIdsMethod = EmailApiGrpc.getListInboundEmailTasksByGroupIdsMethod) == null) {
          EmailApiGrpc.getListInboundEmailTasksByGroupIdsMethod = getListInboundEmailTasksByGroupIdsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq, com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInboundEmailTasksByGroupIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListInboundEmailTasksByGroupIds"))
              .build();
        }
      }
    }
    return getListInboundEmailTasksByGroupIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> getListActiveInboundEmailGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActiveInboundEmailGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> getListActiveInboundEmailGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq, com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> getListActiveInboundEmailGroupsMethod;
    if ((getListActiveInboundEmailGroupsMethod = EmailApiGrpc.getListActiveInboundEmailGroupsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListActiveInboundEmailGroupsMethod = EmailApiGrpc.getListActiveInboundEmailGroupsMethod) == null) {
          EmailApiGrpc.getListActiveInboundEmailGroupsMethod = getListActiveInboundEmailGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq, com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActiveInboundEmailGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListActiveInboundEmailGroups"))
              .build();
        }
      }
    }
    return getListActiveInboundEmailGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleRes> getScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schedule",
      requestType = com.tcn.cloud.api.api.v0alpha.ScheduleReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScheduleRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleRes> getScheduleMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleReq, com.tcn.cloud.api.api.v0alpha.ScheduleRes> getScheduleMethod;
    if ((getScheduleMethod = EmailApiGrpc.getScheduleMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getScheduleMethod = EmailApiGrpc.getScheduleMethod) == null) {
          EmailApiGrpc.getScheduleMethod = getScheduleMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ScheduleReq, com.tcn.cloud.api.api.v0alpha.ScheduleRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("Schedule"))
              .build();
        }
      }
    }
    return getScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> getScheduleOutboundEmailGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScheduleOutboundEmailGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> getScheduleOutboundEmailGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> getScheduleOutboundEmailGroupMethod;
    if ((getScheduleOutboundEmailGroupMethod = EmailApiGrpc.getScheduleOutboundEmailGroupMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getScheduleOutboundEmailGroupMethod = EmailApiGrpc.getScheduleOutboundEmailGroupMethod) == null) {
          EmailApiGrpc.getScheduleOutboundEmailGroupMethod = getScheduleOutboundEmailGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScheduleOutboundEmailGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ScheduleOutboundEmailGroup"))
              .build();
        }
      }
    }
    return getScheduleOutboundEmailGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq,
      com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> getSchedulePureInboundEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SchedulePureInboundEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq,
      com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> getSchedulePureInboundEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq, com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> getSchedulePureInboundEmailMethod;
    if ((getSchedulePureInboundEmailMethod = EmailApiGrpc.getSchedulePureInboundEmailMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getSchedulePureInboundEmailMethod = EmailApiGrpc.getSchedulePureInboundEmailMethod) == null) {
          EmailApiGrpc.getSchedulePureInboundEmailMethod = getSchedulePureInboundEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq, com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SchedulePureInboundEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("SchedulePureInboundEmail"))
              .build();
        }
      }
    }
    return getSchedulePureInboundEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq,
      com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getCreateEmailMessageAgentReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailMessageAgentReply",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq,
      com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getCreateEmailMessageAgentReplyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq, com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getCreateEmailMessageAgentReplyMethod;
    if ((getCreateEmailMessageAgentReplyMethod = EmailApiGrpc.getCreateEmailMessageAgentReplyMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateEmailMessageAgentReplyMethod = EmailApiGrpc.getCreateEmailMessageAgentReplyMethod) == null) {
          EmailApiGrpc.getCreateEmailMessageAgentReplyMethod = getCreateEmailMessageAgentReplyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq, com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailMessageAgentReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateEmailMessageAgentReply"))
              .build();
        }
      }
    }
    return getCreateEmailMessageAgentReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> getCreateEmailMessageAgentReplyAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailMessageAgentReplyAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> getCreateEmailMessageAgentReplyAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> getCreateEmailMessageAgentReplyAttachmentMethod;
    if ((getCreateEmailMessageAgentReplyAttachmentMethod = EmailApiGrpc.getCreateEmailMessageAgentReplyAttachmentMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateEmailMessageAgentReplyAttachmentMethod = EmailApiGrpc.getCreateEmailMessageAgentReplyAttachmentMethod) == null) {
          EmailApiGrpc.getCreateEmailMessageAgentReplyAttachmentMethod = getCreateEmailMessageAgentReplyAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailMessageAgentReplyAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateEmailMessageAgentReplyAttachment"))
              .build();
        }
      }
    }
    return getCreateEmailMessageAgentReplyAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendReplyReq,
      com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getSendReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendReply",
      requestType = com.tcn.cloud.api.api.v0alpha.SendReplyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendReplyReq,
      com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getSendReplyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendReplyReq, com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> getSendReplyMethod;
    if ((getSendReplyMethod = EmailApiGrpc.getSendReplyMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getSendReplyMethod = EmailApiGrpc.getSendReplyMethod) == null) {
          EmailApiGrpc.getSendReplyMethod = getSendReplyMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendReplyReq, com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendReplyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("SendReply"))
              .build();
        }
      }
    }
    return getSendReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> getGetEmailGroupsByGroupSidsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailGroupsByGroupSids",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq,
      com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> getGetEmailGroupsByGroupSidsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> getGetEmailGroupsByGroupSidsMethod;
    if ((getGetEmailGroupsByGroupSidsMethod = EmailApiGrpc.getGetEmailGroupsByGroupSidsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailGroupsByGroupSidsMethod = EmailApiGrpc.getGetEmailGroupsByGroupSidsMethod) == null) {
          EmailApiGrpc.getGetEmailGroupsByGroupSidsMethod = getGetEmailGroupsByGroupSidsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq, com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailGroupsByGroupSids"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailGroupsByGroupSids"))
              .build();
        }
      }
    }
    return getGetEmailGroupsByGroupSidsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupSidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailGroupByGroupSid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupSidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq, com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupSidMethod;
    if ((getGetEmailGroupByGroupSidMethod = EmailApiGrpc.getGetEmailGroupByGroupSidMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailGroupByGroupSidMethod = EmailApiGrpc.getGetEmailGroupByGroupSidMethod) == null) {
          EmailApiGrpc.getGetEmailGroupByGroupSidMethod = getGetEmailGroupByGroupSidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq, com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailGroupByGroupSid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailGroupByGroupSid"))
              .build();
        }
      }
    }
    return getGetEmailGroupByGroupSidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailGroupByGroupId",
      requestType = com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq, com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getGetEmailGroupByGroupIdMethod;
    if ((getGetEmailGroupByGroupIdMethod = EmailApiGrpc.getGetEmailGroupByGroupIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetEmailGroupByGroupIdMethod = EmailApiGrpc.getGetEmailGroupByGroupIdMethod) == null) {
          EmailApiGrpc.getGetEmailGroupByGroupIdMethod = getGetEmailGroupByGroupIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq, com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailGroupByGroupId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetEmailGroupByGroupId"))
              .build();
        }
      }
    }
    return getGetEmailGroupByGroupIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq,
      com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> getSchedulePureOmniLinkInboundEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SchedulePureOmniLinkInboundEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq,
      com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> getSchedulePureOmniLinkInboundEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq, com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> getSchedulePureOmniLinkInboundEmailMethod;
    if ((getSchedulePureOmniLinkInboundEmailMethod = EmailApiGrpc.getSchedulePureOmniLinkInboundEmailMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getSchedulePureOmniLinkInboundEmailMethod = EmailApiGrpc.getSchedulePureOmniLinkInboundEmailMethod) == null) {
          EmailApiGrpc.getSchedulePureOmniLinkInboundEmailMethod = getSchedulePureOmniLinkInboundEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq, com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SchedulePureOmniLinkInboundEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("SchedulePureOmniLinkInboundEmail"))
              .build();
        }
      }
    }
    return getSchedulePureOmniLinkInboundEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> getUpdateInboundEmailGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInboundEmailGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> getUpdateInboundEmailGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> getUpdateInboundEmailGroupMethod;
    if ((getUpdateInboundEmailGroupMethod = EmailApiGrpc.getUpdateInboundEmailGroupMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateInboundEmailGroupMethod = EmailApiGrpc.getUpdateInboundEmailGroupMethod) == null) {
          EmailApiGrpc.getUpdateInboundEmailGroupMethod = getUpdateInboundEmailGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInboundEmailGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateInboundEmailGroup"))
              .build();
        }
      }
    }
    return getUpdateInboundEmailGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> getUpdateEmailGroupMstrSendsPerMinuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmailGroupMstrSendsPerMinute",
      requestType = com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq,
      com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> getUpdateEmailGroupMstrSendsPerMinuteMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq, com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> getUpdateEmailGroupMstrSendsPerMinuteMethod;
    if ((getUpdateEmailGroupMstrSendsPerMinuteMethod = EmailApiGrpc.getUpdateEmailGroupMstrSendsPerMinuteMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateEmailGroupMstrSendsPerMinuteMethod = EmailApiGrpc.getUpdateEmailGroupMstrSendsPerMinuteMethod) == null) {
          EmailApiGrpc.getUpdateEmailGroupMstrSendsPerMinuteMethod = getUpdateEmailGroupMstrSendsPerMinuteMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq, com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmailGroupMstrSendsPerMinute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateEmailGroupMstrSendsPerMinute"))
              .build();
        }
      }
    }
    return getUpdateEmailGroupMstrSendsPerMinuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> getUpdateOutboundEmailGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOutboundEmailGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> getUpdateOutboundEmailGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> getUpdateOutboundEmailGroupMethod;
    if ((getUpdateOutboundEmailGroupMethod = EmailApiGrpc.getUpdateOutboundEmailGroupMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUpdateOutboundEmailGroupMethod = EmailApiGrpc.getUpdateOutboundEmailGroupMethod) == null) {
          EmailApiGrpc.getUpdateOutboundEmailGroupMethod = getUpdateOutboundEmailGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOutboundEmailGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UpdateOutboundEmailGroup"))
              .build();
        }
      }
    }
    return getUpdateOutboundEmailGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> getGetInboundEmailGroupByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInboundEmailGroupById",
      requestType = com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.InboundEmailGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> getGetInboundEmailGroupByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq, com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> getGetInboundEmailGroupByIdMethod;
    if ((getGetInboundEmailGroupByIdMethod = EmailApiGrpc.getGetInboundEmailGroupByIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getGetInboundEmailGroupByIdMethod = EmailApiGrpc.getGetInboundEmailGroupByIdMethod) == null) {
          EmailApiGrpc.getGetInboundEmailGroupByIdMethod = getGetInboundEmailGroupByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq, com.tcn.cloud.api.api.v0alpha.InboundEmailGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInboundEmailGroupById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.InboundEmailGroup.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("GetInboundEmailGroupById"))
              .build();
        }
      }
    }
    return getGetInboundEmailGroupByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> getCreateEmailMessageAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmailMessageAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq,
      com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> getCreateEmailMessageAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> getCreateEmailMessageAttachmentMethod;
    if ((getCreateEmailMessageAttachmentMethod = EmailApiGrpc.getCreateEmailMessageAttachmentMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCreateEmailMessageAttachmentMethod = EmailApiGrpc.getCreateEmailMessageAttachmentMethod) == null) {
          EmailApiGrpc.getCreateEmailMessageAttachmentMethod = getCreateEmailMessageAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq, com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmailMessageAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CreateEmailMessageAttachment"))
              .build();
        }
      }
    }
    return getCreateEmailMessageAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq,
      com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> getListEmailMessageAttachmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEmailMessageAttachments",
      requestType = com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq,
      com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> getListEmailMessageAttachmentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq, com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> getListEmailMessageAttachmentsMethod;
    if ((getListEmailMessageAttachmentsMethod = EmailApiGrpc.getListEmailMessageAttachmentsMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListEmailMessageAttachmentsMethod = EmailApiGrpc.getListEmailMessageAttachmentsMethod) == null) {
          EmailApiGrpc.getListEmailMessageAttachmentsMethod = getListEmailMessageAttachmentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq, com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEmailMessageAttachments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListEmailMessageAttachments"))
              .build();
        }
      }
    }
    return getListEmailMessageAttachmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> getUnassignCurrentUserFromEmailConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignCurrentUserFromEmailConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> getUnassignCurrentUserFromEmailConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq, com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> getUnassignCurrentUserFromEmailConversationMethod;
    if ((getUnassignCurrentUserFromEmailConversationMethod = EmailApiGrpc.getUnassignCurrentUserFromEmailConversationMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getUnassignCurrentUserFromEmailConversationMethod = EmailApiGrpc.getUnassignCurrentUserFromEmailConversationMethod) == null) {
          EmailApiGrpc.getUnassignCurrentUserFromEmailConversationMethod = getUnassignCurrentUserFromEmailConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq, com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignCurrentUserFromEmailConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("UnassignCurrentUserFromEmailConversation"))
              .build();
        }
      }
    }
    return getUnassignCurrentUserFromEmailConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq,
      com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> getDashboardEmailConversationSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DashboardEmailConversationSearch",
      requestType = com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq,
      com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> getDashboardEmailConversationSearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq, com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> getDashboardEmailConversationSearchMethod;
    if ((getDashboardEmailConversationSearchMethod = EmailApiGrpc.getDashboardEmailConversationSearchMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getDashboardEmailConversationSearchMethod = EmailApiGrpc.getDashboardEmailConversationSearchMethod) == null) {
          EmailApiGrpc.getDashboardEmailConversationSearchMethod = getDashboardEmailConversationSearchMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq, com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DashboardEmailConversationSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("DashboardEmailConversationSearch"))
              .build();
        }
      }
    }
    return getDashboardEmailConversationSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> getReassignEmailConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReassignEmailConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> getReassignEmailConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq, com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> getReassignEmailConversationMethod;
    if ((getReassignEmailConversationMethod = EmailApiGrpc.getReassignEmailConversationMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getReassignEmailConversationMethod = EmailApiGrpc.getReassignEmailConversationMethod) == null) {
          EmailApiGrpc.getReassignEmailConversationMethod = getReassignEmailConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq, com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReassignEmailConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ReassignEmailConversation"))
              .build();
        }
      }
    }
    return getReassignEmailConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> getAssignEmailConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignEmailConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> getAssignEmailConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq, com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> getAssignEmailConversationMethod;
    if ((getAssignEmailConversationMethod = EmailApiGrpc.getAssignEmailConversationMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getAssignEmailConversationMethod = EmailApiGrpc.getAssignEmailConversationMethod) == null) {
          EmailApiGrpc.getAssignEmailConversationMethod = getAssignEmailConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq, com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignEmailConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("AssignEmailConversation"))
              .build();
        }
      }
    }
    return getAssignEmailConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> getSuspendEmailConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendEmailConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> getSuspendEmailConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq, com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> getSuspendEmailConversationMethod;
    if ((getSuspendEmailConversationMethod = EmailApiGrpc.getSuspendEmailConversationMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getSuspendEmailConversationMethod = EmailApiGrpc.getSuspendEmailConversationMethod) == null) {
          EmailApiGrpc.getSuspendEmailConversationMethod = getSuspendEmailConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq, com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendEmailConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("SuspendEmailConversation"))
              .build();
        }
      }
    }
    return getSuspendEmailConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq,
      com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> getListCampaignsByConnectedInboxIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaignsByConnectedInboxId",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq,
      com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> getListCampaignsByConnectedInboxIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq, com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> getListCampaignsByConnectedInboxIdMethod;
    if ((getListCampaignsByConnectedInboxIdMethod = EmailApiGrpc.getListCampaignsByConnectedInboxIdMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getListCampaignsByConnectedInboxIdMethod = EmailApiGrpc.getListCampaignsByConnectedInboxIdMethod) == null) {
          EmailApiGrpc.getListCampaignsByConnectedInboxIdMethod = getListCampaignsByConnectedInboxIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq, com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCampaignsByConnectedInboxId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("ListCampaignsByConnectedInboxId"))
              .build();
        }
      }
    }
    return getListCampaignsByConnectedInboxIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> getCloseEmailConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseEmailConversation",
      requestType = com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq,
      com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> getCloseEmailConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq, com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> getCloseEmailConversationMethod;
    if ((getCloseEmailConversationMethod = EmailApiGrpc.getCloseEmailConversationMethod) == null) {
      synchronized (EmailApiGrpc.class) {
        if ((getCloseEmailConversationMethod = EmailApiGrpc.getCloseEmailConversationMethod) == null) {
          EmailApiGrpc.getCloseEmailConversationMethod = getCloseEmailConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq, com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseEmailConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new EmailApiMethodDescriptorSupplier("CloseEmailConversation"))
              .build();
        }
      }
    }
    return getCloseEmailConversationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailApiStub>() {
        @java.lang.Override
        public EmailApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailApiStub(channel, callOptions);
        }
      };
    return EmailApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailApiBlockingStub>() {
        @java.lang.Override
        public EmailApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailApiBlockingStub(channel, callOptions);
        }
      };
    return EmailApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmailApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmailApiFutureStub>() {
        @java.lang.Override
        public EmailApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmailApiFutureStub(channel, callOptions);
        }
      };
    return EmailApiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EmailApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create/Record email template details defined by CreateEmailTemplateReq message for a specified
     * email_subject, email_body.
     * The method will return a CreateEmailTemplateRes message/entity that will
     * contain the newly created email_template_sid value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update email template details defined by UpdateEmailTemplateReq message for a specified
     * email_template_sid, email_subject, email_body.
     * The method will return a UpdateEmailTemplateRes message/entity that will
     * contain the true/false after updating template details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record email template attachment details defined by CreateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, file_name, file_size, content_type, hash.
     * The method will return a CreateEmailTemplateAttachmentRes message/entity that will
     * contain the newly created email_template_attachment_sid, fts storage url and gs_path  for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailTemplateAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Copy/Record email template with attachment details defined by CopyEmailTemplateWithAttachmentsReq message for a specified
     * email_template_sid and email_body.
     * The method will return a CopyEmailTemplateWithAttachmentsRes message/entity that will
     * contain the newly copied email_template_sid value for this client along with attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void copyEmailTemplateWithAttachments(com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyEmailTemplateWithAttachmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update email template attachment details defined by UpdateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, email_template_attachment_sid, file_name, file_size, content_type, hash.
     * The method will return a UpdateEmailTemplateAttachmentRes message/entity that will
     * contain the true/false after updating template attachment details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailTemplateAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets email template along with attachment details defined by GetEmailTemplateByTemplateSidReq message for a specified
     * email_template_sid.
     * The method will return a EmailTemplateWithAttachments message/entity that will
     * contain the email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailTemplateByTemplateSid(com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailTemplateByTemplateSidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of email template along with attachment details defined by GetAllEmailTemplatesReq message.
     * The method will return a GetAllEmailTemplatesRes message/entity that will
     * contain the stream of email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getAllEmailTemplates(com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEmailTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete email template details defined by DeleteEmailTemplateReq message for a specified
     * email_template_sid.
     * The method will return a DeleteEmailTemplateRes message/entity that will
     * contain the true/false after deleting template details for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteEmailTemplate(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete email template attachments defined by DeleteEmailTemplateAttachmentByIdReq message for a specified
     * email_template_attachment_sid.
     * The method will return a DeleteEmailTemplateAttachmentByIdRes message/entity that will
     * contain the true/false after deleting template attachments for this client_sid and email_template_attachment_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteEmailTemplateAttachmentById(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmailTemplateAttachmentByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download local inbound file attachment file contents using FTS bucket
     * defined by DownloadInboundEmailAttachmentReq message for a specified
     * email_message_reply_id and email_message_reply_attachment_id.
     * The method will return a DownloadInboundEmailAttachmentRes message/entity that will
     * contain the url where attachment contents are stored
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void downloadInboundEmailAttachment(com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadInboundEmailAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of pure email groups based on search criteria defined by EmailGroupSearchReq message for a specified
     * by search_from and search_to or by status or by name and any of these combinations
     * The method will return a EmailGroupSearchRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void pureEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPureEmailGroupSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp. Can set a user_id to get conversations for any user.
     * Required permissions:
     *    ??????
     * </pre>
     */
    public void managerListNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerListNewEmailMessageRepliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp
     * Required permissions:
     *    ??????
     * </pre>
     */
    public void listNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNewEmailMessageRepliesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of email tasks defined by GetEmailTasksByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailTasksByGroupSidsRes message/entity that will
     * contain the stream of EmailTaskMstrDetails results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailTasksByGroupSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update email group status value defined by EmailGroupStatusReq message for a specified
     * email_group_sid and status_id.
     * The method will return a EmailGroupStatusRes message/entity that will
     * contain the true/false after updating status for this clients email_group_sid and status_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailGroupStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets email message details defined by GetEmailMessageReq message for a specified
     * email_message_sid.
     * The method will return a GetEmailMessageRes message/entity that will
     * contains email_subject and email_body for the email_message_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailMessageDetails(com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailMessageDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound email template defined by CreateInboundEmailTemplateReq message for a specified
     *  connected_inbox_id, name.
     * The method will return a CreateInboundEmailTemplateRes message/entity that will
     * contain the newly created inbound_email_template_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInboundEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update inbound email template details defined by UpdateInboundEmailTemplateReq message for a specified
     *  inbound_email_template_id, connected_inbox_id, name.
     * The method will return a UpdateInboundEmailTemplateRes message/entity that will
     * contain the true/false after updating inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInboundEmailTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete inbound email template details defined by DeleteInboundEmailTemplateByIdReq message for a specified
     *  inbound_email_template_id.
     * The method will return a DeleteInboundEmailTemplateByIdRes message/entity that will
     * contain the true/false after deleting inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInboundEmailTemplateByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email template details defined by ListInboundEmailTemplatesReq message
     * The method will return a ListInboundEmailTemplatesRes message/entity that will
     * contain the stream of inbound_email_template_id, connected_inbox_id, name.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundEmailTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets inbound email template details defined by GetInboundEmailTemplateByIdReq message for a specified
     * inbound_email_template_id.
     * The method will return a InboundEmailTemplate message/entity that will
     * contain the inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInboundEmailTemplateByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update inbound email group status details defined by UpdateInboundEmailGroupStatusReq
     * status. The method will return a UpdateInboundEmailGroupStatusRes message/entity
     * that will contain the true/false after updating inbound email group details
     * for this org_id, region_id and inbound_email_group_id Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInboundEmailGroupStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop inbound email group defined by StopInboundEmailGroupReq message for a specified
     *  inbound_email_group_id.
     * The method will return a StopInboundEmailGroupRes message/entity that will
     * contain the true/false after updating inbound email group details for inbound_email_group_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void stopInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopInboundEmailGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop all InboundEmail groups defined by StopAllInboundEmailGroupsReq message for the specified
     * array of inbound_email_group_ids
     * The method will mark the InboundEmail groups as completed.
     * Required permissions: VIEW_EMAIL
     * </pre>
     */
    public void stopAllInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopAllInboundEmailGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of pure inbound email groups based on search criteria defined by PureInboundEmailGroupSearchReq message for a specified
     *  by search_from and search_to or by status or by name and any of these combinations
     * The method will return a PureInboundEmailGroupSearchRes message/entity that will
     * contain the stream of InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void pureInboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPureInboundEmailGroupSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email groups based on search criteria defined by
     * InboundEmailGroupSearchReq message for a specified by
     * search_from and search_to or by status or by name and any of these
     * combinations The method will return a InboundEmailGroupSearchRes
     * message/entity that will contain the stream of InboundEmailGroups Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void inboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInboundEmailGroupSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email groups defined by ListInboundEmailGroupsByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailGroupsByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailGroup
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundEmailGroupsByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email tasks defined by ListInboundEmailTasksByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailTasksByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailTaskDetails along with any file attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInboundEmailTasksByGroupIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of active/running inbound email groups defined by ListActiveInboundEmailGroupsReq message
     * The method will return a ListActiveInboundEmailGroupsRes message/entity that will
     * contain the stream of active/running InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listActiveInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActiveInboundEmailGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleReq message for the specified
     * email_template_sid, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedule(com.tcn.cloud.api.api.v0alpha.ScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleOutboundEmailGroupReq message for the specified
     * subject, email message, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleOutboundEmailGroupRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScheduleOutboundEmailGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Pure Inbound email campaign defined by SchedulePureInboundEmailReq message for the specified
     * inbound_email_template_sid
     * The method will return SchedulePureInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedulePureInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulePureInboundEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply defined by CreateEmailMessageAgentReplyReq message for a specified
     * inbound_email_group_id, to_address, subject, email_conversation_id, agent_sid .
     * The method will return a EmailMessageReply message/entity that will
     * contain the newly created email_message_reply data
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAgentReply(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailMessageAgentReplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply attachment defined by CreateEmailMessageAgentReplyAttachmentReq message for a specified
     * file_name, file_size and file_type.
     * The method will return a CreateEmailMessageAgentReplyAttachmentRes message/entity that will
     * contain the newly created email_message_reply_attachment_id, url_path and gs_path for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAgentReplyAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailMessageAgentReplyAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends email message based on email details defined in SendReplyReq specified by
     * in_reply_to and email_reply_id
     * The method will return a EmailMessageReplyWithAttachments message/entity that will
     * contain the email_message_reply data
     * along with along with attachment details
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void sendReply(com.tcn.cloud.api.api.v0alpha.SendReplyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendReplyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of email groups defined by GetEmailGroupsByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailGroupsByGroupSidsRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailGroupsByGroupSidsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupSidReq message for a specified
     * email_group_sid
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupByGroupSid(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailGroupByGroupSidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupIdReq message for a specified
     * email_group_id
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupByGroupId(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailGroupByGroupIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schedule Pure OmniLink Inbound email campaign defined by SchedulePureOmniLinkInboundEmailReq message for the specified
     * connectedInbox and skills
     * The method will return SchedulePureOmniLinkInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedulePureOmniLinkInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchedulePureOmniLinkInboundEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the name, skills, stop time for the inbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInboundEmailGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update email group sendsperminute defined by EmailGroupSendsPerMinuteReq
     * message for a specified email_group_sid and sends_per_minute.
     * The method will return a EmailGroupSendsPerMinuteRes message/entity that
     * will contain the true/false after updating sends_per_minute value for this
     * clients email_group_sid and sends_per_minute Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailGroupMstrSendsPerMinute(com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmailGroupMstrSendsPerMinuteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the name, start and stop time for the outbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOutboundEmailGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a inbound email group details defined by InboundEmailGroupByIdReq
     * message for the specified inbound_email_group_id, org_id and region_id. The
     * method will return a InboundEmailGroup message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getInboundEmailGroupById(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInboundEmailGroupByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Add email message attachment details defined by CreateEmailMessageAttachmentReq
     * message for the specified client.
     * This method will return a CreateEmailMessageAttachmentRes message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmailMessageAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the email message attachments and their details defined by
     * ListEmailMessageAttachmentsReq for the specified client.
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listEmailMessageAttachments(com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEmailMessageAttachmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unassigns a conversation from the current user and puts it back into the matching pool
     * Required permissions:
     *    OMNI_LINK
     * </pre>
     */
    public void unassignCurrentUserFromEmailConversation(com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignCurrentUserFromEmailConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Listing all email conversations for the dashboard
     * Required Permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void dashboardEmailConversationSearch(com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDashboardEmailConversationSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReassignEmailConversation.  unassign current user and assign
     * new user.
     * This method will return a ReassignEmailConversationRes
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void reassignEmailConversation(com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReassignEmailConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignEmailConversation - allowing the manager from the dashboard to assing a email conversation
     * before the matcher assigns it.
     * </pre>
     */
    public void assignEmailConversation(com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignEmailConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suspends an email conversation
     * </pre>
     */
    public void suspendEmailConversation(com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendEmailConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound and outbound campaigns defined by ListCampaignsByConnectedInboxIdReq message
     * The method will return a ListCampaignsByConnectedInboxIdRes message/entity that will
     * contain the stream of all campaigns along with project details.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listCampaignsByConnectedInboxId(com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCampaignsByConnectedInboxIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close email conversation defined by CloseEmailConversationReq message
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void closeEmailConversation(com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseEmailConversationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEmailTemplateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq,
                com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes>(
                  this, METHODID_CREATE_EMAIL_TEMPLATE)))
          .addMethod(
            getUpdateEmailTemplateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq,
                com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes>(
                  this, METHODID_UPDATE_EMAIL_TEMPLATE)))
          .addMethod(
            getCreateEmailTemplateAttachmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq,
                com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes>(
                  this, METHODID_CREATE_EMAIL_TEMPLATE_ATTACHMENT)))
          .addMethod(
            getCopyEmailTemplateWithAttachmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq,
                com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes>(
                  this, METHODID_COPY_EMAIL_TEMPLATE_WITH_ATTACHMENTS)))
          .addMethod(
            getUpdateEmailTemplateAttachmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq,
                com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes>(
                  this, METHODID_UPDATE_EMAIL_TEMPLATE_ATTACHMENT)))
          .addMethod(
            getGetEmailTemplateByTemplateSidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq,
                com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments>(
                  this, METHODID_GET_EMAIL_TEMPLATE_BY_TEMPLATE_SID)))
          .addMethod(
            getGetAllEmailTemplatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes>(
                  this, METHODID_GET_ALL_EMAIL_TEMPLATES)))
          .addMethod(
            getDeleteEmailTemplateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq,
                com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes>(
                  this, METHODID_DELETE_EMAIL_TEMPLATE)))
          .addMethod(
            getDeleteEmailTemplateAttachmentByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq,
                com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes>(
                  this, METHODID_DELETE_EMAIL_TEMPLATE_ATTACHMENT_BY_ID)))
          .addMethod(
            getDownloadInboundEmailAttachmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq,
                com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes>(
                  this, METHODID_DOWNLOAD_INBOUND_EMAIL_ATTACHMENT)))
          .addMethod(
            getPureEmailGroupSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq,
                com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes>(
                  this, METHODID_PURE_EMAIL_GROUP_SEARCH)))
          .addMethod(
            getManagerListNewEmailMessageRepliesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
                com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>(
                  this, METHODID_MANAGER_LIST_NEW_EMAIL_MESSAGE_REPLIES)))
          .addMethod(
            getListNewEmailMessageRepliesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq,
                com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>(
                  this, METHODID_LIST_NEW_EMAIL_MESSAGE_REPLIES)))
          .addMethod(
            getGetEmailTasksByGroupSidsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes>(
                  this, METHODID_GET_EMAIL_TASKS_BY_GROUP_SIDS)))
          .addMethod(
            getUpdateEmailGroupStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq,
                com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes>(
                  this, METHODID_UPDATE_EMAIL_GROUP_STATUS)))
          .addMethod(
            getGetEmailMessageDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq,
                com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes>(
                  this, METHODID_GET_EMAIL_MESSAGE_DETAILS)))
          .addMethod(
            getCreateInboundEmailTemplateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq,
                com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes>(
                  this, METHODID_CREATE_INBOUND_EMAIL_TEMPLATE)))
          .addMethod(
            getUpdateInboundEmailTemplateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq,
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes>(
                  this, METHODID_UPDATE_INBOUND_EMAIL_TEMPLATE)))
          .addMethod(
            getDeleteInboundEmailTemplateByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq,
                com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes>(
                  this, METHODID_DELETE_INBOUND_EMAIL_TEMPLATE_BY_ID)))
          .addMethod(
            getListInboundEmailTemplatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes>(
                  this, METHODID_LIST_INBOUND_EMAIL_TEMPLATES)))
          .addMethod(
            getGetInboundEmailTemplateByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq,
                com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate>(
                  this, METHODID_GET_INBOUND_EMAIL_TEMPLATE_BY_ID)))
          .addMethod(
            getUpdateInboundEmailGroupStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq,
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes>(
                  this, METHODID_UPDATE_INBOUND_EMAIL_GROUP_STATUS)))
          .addMethod(
            getStopInboundEmailGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq,
                com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>(
                  this, METHODID_STOP_INBOUND_EMAIL_GROUP)))
          .addMethod(
            getStopAllInboundEmailGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq,
                com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>(
                  this, METHODID_STOP_ALL_INBOUND_EMAIL_GROUPS)))
          .addMethod(
            getPureInboundEmailGroupSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq,
                com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes>(
                  this, METHODID_PURE_INBOUND_EMAIL_GROUP_SEARCH)))
          .addMethod(
            getInboundEmailGroupSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq,
                com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes>(
                  this, METHODID_INBOUND_EMAIL_GROUP_SEARCH)))
          .addMethod(
            getListInboundEmailGroupsByGroupIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes>(
                  this, METHODID_LIST_INBOUND_EMAIL_GROUPS_BY_GROUP_IDS)))
          .addMethod(
            getListInboundEmailTasksByGroupIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq,
                com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes>(
                  this, METHODID_LIST_INBOUND_EMAIL_TASKS_BY_GROUP_IDS)))
          .addMethod(
            getListActiveInboundEmailGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes>(
                  this, METHODID_LIST_ACTIVE_INBOUND_EMAIL_GROUPS)))
          .addMethod(
            getScheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ScheduleReq,
                com.tcn.cloud.api.api.v0alpha.ScheduleRes>(
                  this, METHODID_SCHEDULE)))
          .addMethod(
            getScheduleOutboundEmailGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq,
                com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes>(
                  this, METHODID_SCHEDULE_OUTBOUND_EMAIL_GROUP)))
          .addMethod(
            getSchedulePureInboundEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq,
                com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes>(
                  this, METHODID_SCHEDULE_PURE_INBOUND_EMAIL)))
          .addMethod(
            getCreateEmailMessageAgentReplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq,
                com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>(
                  this, METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY)))
          .addMethod(
            getCreateEmailMessageAgentReplyAttachmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq,
                com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes>(
                  this, METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY_ATTACHMENT)))
          .addMethod(
            getSendReplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendReplyReq,
                com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>(
                  this, METHODID_SEND_REPLY)))
          .addMethod(
            getGetEmailGroupsByGroupSidsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq,
                com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes>(
                  this, METHODID_GET_EMAIL_GROUPS_BY_GROUP_SIDS)))
          .addMethod(
            getGetEmailGroupByGroupSidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq,
                com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>(
                  this, METHODID_GET_EMAIL_GROUP_BY_GROUP_SID)))
          .addMethod(
            getGetEmailGroupByGroupIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq,
                com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>(
                  this, METHODID_GET_EMAIL_GROUP_BY_GROUP_ID)))
          .addMethod(
            getSchedulePureOmniLinkInboundEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq,
                com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes>(
                  this, METHODID_SCHEDULE_PURE_OMNI_LINK_INBOUND_EMAIL)))
          .addMethod(
            getUpdateInboundEmailGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes>(
                  this, METHODID_UPDATE_INBOUND_EMAIL_GROUP)))
          .addMethod(
            getUpdateEmailGroupMstrSendsPerMinuteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq,
                com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes>(
                  this, METHODID_UPDATE_EMAIL_GROUP_MSTR_SENDS_PER_MINUTE)))
          .addMethod(
            getUpdateOutboundEmailGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes>(
                  this, METHODID_UPDATE_OUTBOUND_EMAIL_GROUP)))
          .addMethod(
            getGetInboundEmailGroupByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq,
                com.tcn.cloud.api.api.v0alpha.InboundEmailGroup>(
                  this, METHODID_GET_INBOUND_EMAIL_GROUP_BY_ID)))
          .addMethod(
            getCreateEmailMessageAttachmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq,
                com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes>(
                  this, METHODID_CREATE_EMAIL_MESSAGE_ATTACHMENT)))
          .addMethod(
            getListEmailMessageAttachmentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq,
                com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes>(
                  this, METHODID_LIST_EMAIL_MESSAGE_ATTACHMENTS)))
          .addMethod(
            getUnassignCurrentUserFromEmailConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq,
                com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes>(
                  this, METHODID_UNASSIGN_CURRENT_USER_FROM_EMAIL_CONVERSATION)))
          .addMethod(
            getDashboardEmailConversationSearchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq,
                com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes>(
                  this, METHODID_DASHBOARD_EMAIL_CONVERSATION_SEARCH)))
          .addMethod(
            getReassignEmailConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq,
                com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes>(
                  this, METHODID_REASSIGN_EMAIL_CONVERSATION)))
          .addMethod(
            getAssignEmailConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq,
                com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes>(
                  this, METHODID_ASSIGN_EMAIL_CONVERSATION)))
          .addMethod(
            getSuspendEmailConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq,
                com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes>(
                  this, METHODID_SUSPEND_EMAIL_CONVERSATION)))
          .addMethod(
            getListCampaignsByConnectedInboxIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq,
                com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes>(
                  this, METHODID_LIST_CAMPAIGNS_BY_CONNECTED_INBOX_ID)))
          .addMethod(
            getCloseEmailConversationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq,
                com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes>(
                  this, METHODID_CLOSE_EMAIL_CONVERSATION)))
          .build();
    }
  }

  /**
   */
  public static final class EmailApiStub extends io.grpc.stub.AbstractAsyncStub<EmailApiStub> {
    private EmailApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create/Record email template details defined by CreateEmailTemplateReq message for a specified
     * email_subject, email_body.
     * The method will return a CreateEmailTemplateRes message/entity that will
     * contain the newly created email_template_sid value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update email template details defined by UpdateEmailTemplateReq message for a specified
     * email_template_sid, email_subject, email_body.
     * The method will return a UpdateEmailTemplateRes message/entity that will
     * contain the true/false after updating template details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record email template attachment details defined by CreateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, file_name, file_size, content_type, hash.
     * The method will return a CreateEmailTemplateAttachmentRes message/entity that will
     * contain the newly created email_template_attachment_sid, fts storage url and gs_path  for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailTemplateAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Copy/Record email template with attachment details defined by CopyEmailTemplateWithAttachmentsReq message for a specified
     * email_template_sid and email_body.
     * The method will return a CopyEmailTemplateWithAttachmentsRes message/entity that will
     * contain the newly copied email_template_sid value for this client along with attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void copyEmailTemplateWithAttachments(com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyEmailTemplateWithAttachmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update email template attachment details defined by UpdateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, email_template_attachment_sid, file_name, file_size, content_type, hash.
     * The method will return a UpdateEmailTemplateAttachmentRes message/entity that will
     * contain the true/false after updating template attachment details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets email template along with attachment details defined by GetEmailTemplateByTemplateSidReq message for a specified
     * email_template_sid.
     * The method will return a EmailTemplateWithAttachments message/entity that will
     * contain the email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailTemplateByTemplateSid(com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailTemplateByTemplateSidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of email template along with attachment details defined by GetAllEmailTemplatesReq message.
     * The method will return a GetAllEmailTemplatesRes message/entity that will
     * contain the stream of email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getAllEmailTemplates(com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEmailTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete email template details defined by DeleteEmailTemplateReq message for a specified
     * email_template_sid.
     * The method will return a DeleteEmailTemplateRes message/entity that will
     * contain the true/false after deleting template details for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteEmailTemplate(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete email template attachments defined by DeleteEmailTemplateAttachmentByIdReq message for a specified
     * email_template_attachment_sid.
     * The method will return a DeleteEmailTemplateAttachmentByIdRes message/entity that will
     * contain the true/false after deleting template attachments for this client_sid and email_template_attachment_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteEmailTemplateAttachmentById(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateAttachmentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download local inbound file attachment file contents using FTS bucket
     * defined by DownloadInboundEmailAttachmentReq message for a specified
     * email_message_reply_id and email_message_reply_attachment_id.
     * The method will return a DownloadInboundEmailAttachmentRes message/entity that will
     * contain the url where attachment contents are stored
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void downloadInboundEmailAttachment(com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadInboundEmailAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of pure email groups based on search criteria defined by EmailGroupSearchReq message for a specified
     * by search_from and search_to or by status or by name and any of these combinations
     * The method will return a EmailGroupSearchRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void pureEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPureEmailGroupSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp. Can set a user_id to get conversations for any user.
     * Required permissions:
     *    ??????
     * </pre>
     */
    public void managerListNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getManagerListNewEmailMessageRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp
     * Required permissions:
     *    ??????
     * </pre>
     */
    public void listNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNewEmailMessageRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of email tasks defined by GetEmailTasksByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailTasksByGroupSidsRes message/entity that will
     * contain the stream of EmailTaskMstrDetails results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailTasksByGroupSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update email group status value defined by EmailGroupStatusReq message for a specified
     * email_group_sid and status_id.
     * The method will return a EmailGroupStatusRes message/entity that will
     * contain the true/false after updating status for this clients email_group_sid and status_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailGroupStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets email message details defined by GetEmailMessageReq message for a specified
     * email_message_sid.
     * The method will return a GetEmailMessageRes message/entity that will
     * contains email_subject and email_body for the email_message_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailMessageDetails(com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailMessageDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound email template defined by CreateInboundEmailTemplateReq message for a specified
     *  connected_inbox_id, name.
     * The method will return a CreateInboundEmailTemplateRes message/entity that will
     * contain the newly created inbound_email_template_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInboundEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update inbound email template details defined by UpdateInboundEmailTemplateReq message for a specified
     *  inbound_email_template_id, connected_inbox_id, name.
     * The method will return a UpdateInboundEmailTemplateRes message/entity that will
     * contain the true/false after updating inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInboundEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete inbound email template details defined by DeleteInboundEmailTemplateByIdReq message for a specified
     *  inbound_email_template_id.
     * The method will return a DeleteInboundEmailTemplateByIdRes message/entity that will
     * contain the true/false after deleting inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInboundEmailTemplateByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email template details defined by ListInboundEmailTemplatesReq message
     * The method will return a ListInboundEmailTemplatesRes message/entity that will
     * contain the stream of inbound_email_template_id, connected_inbox_id, name.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInboundEmailTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets inbound email template details defined by GetInboundEmailTemplateByIdReq message for a specified
     * inbound_email_template_id.
     * The method will return a InboundEmailTemplate message/entity that will
     * contain the inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInboundEmailTemplateByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update inbound email group status details defined by UpdateInboundEmailGroupStatusReq
     * status. The method will return a UpdateInboundEmailGroupStatusRes message/entity
     * that will contain the true/false after updating inbound email group details
     * for this org_id, region_id and inbound_email_group_id Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInboundEmailGroupStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop inbound email group defined by StopInboundEmailGroupReq message for a specified
     *  inbound_email_group_id.
     * The method will return a StopInboundEmailGroupRes message/entity that will
     * contain the true/false after updating inbound email group details for inbound_email_group_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void stopInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopInboundEmailGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop all InboundEmail groups defined by StopAllInboundEmailGroupsReq message for the specified
     * array of inbound_email_group_ids
     * The method will mark the InboundEmail groups as completed.
     * Required permissions: VIEW_EMAIL
     * </pre>
     */
    public void stopAllInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopAllInboundEmailGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of pure inbound email groups based on search criteria defined by PureInboundEmailGroupSearchReq message for a specified
     *  by search_from and search_to or by status or by name and any of these combinations
     * The method will return a PureInboundEmailGroupSearchRes message/entity that will
     * contain the stream of InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void pureInboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPureInboundEmailGroupSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email groups based on search criteria defined by
     * InboundEmailGroupSearchReq message for a specified by
     * search_from and search_to or by status or by name and any of these
     * combinations The method will return a InboundEmailGroupSearchRes
     * message/entity that will contain the stream of InboundEmailGroups Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void inboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInboundEmailGroupSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email groups defined by ListInboundEmailGroupsByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailGroupsByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailGroup
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInboundEmailGroupsByGroupIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound email tasks defined by ListInboundEmailTasksByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailTasksByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailTaskDetails along with any file attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listInboundEmailTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInboundEmailTasksByGroupIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of active/running inbound email groups defined by ListActiveInboundEmailGroupsReq message
     * The method will return a ListActiveInboundEmailGroupsRes message/entity that will
     * contain the stream of active/running InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listActiveInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListActiveInboundEmailGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleReq message for the specified
     * email_template_sid, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedule(com.tcn.cloud.api.api.v0alpha.ScheduleReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleOutboundEmailGroupReq message for the specified
     * subject, email message, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleOutboundEmailGroupRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void scheduleOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScheduleOutboundEmailGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule Pure Inbound email campaign defined by SchedulePureInboundEmailReq message for the specified
     * inbound_email_template_sid
     * The method will return SchedulePureInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedulePureInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulePureInboundEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply defined by CreateEmailMessageAgentReplyReq message for a specified
     * inbound_email_group_id, to_address, subject, email_conversation_id, agent_sid .
     * The method will return a EmailMessageReply message/entity that will
     * contain the newly created email_message_reply data
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAgentReply(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailMessageAgentReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply attachment defined by CreateEmailMessageAgentReplyAttachmentReq message for a specified
     * file_name, file_size and file_type.
     * The method will return a CreateEmailMessageAgentReplyAttachmentRes message/entity that will
     * contain the newly created email_message_reply_attachment_id, url_path and gs_path for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAgentReplyAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailMessageAgentReplyAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends email message based on email details defined in SendReplyReq specified by
     * in_reply_to and email_reply_id
     * The method will return a EmailMessageReplyWithAttachments message/entity that will
     * contain the email_message_reply data
     * along with along with attachment details
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void sendReply(com.tcn.cloud.api.api.v0alpha.SendReplyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of email groups defined by GetEmailGroupsByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailGroupsByGroupSidsRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailGroupsByGroupSidsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupSidReq message for a specified
     * email_group_sid
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupByGroupSid(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailGroupByGroupSidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupIdReq message for a specified
     * email_group_id
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getEmailGroupByGroupId(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailGroupByGroupIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schedule Pure OmniLink Inbound email campaign defined by SchedulePureOmniLinkInboundEmailReq message for the specified
     * connectedInbox and skills
     * The method will return SchedulePureOmniLinkInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public void schedulePureOmniLinkInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchedulePureOmniLinkInboundEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the name, skills, stop time for the inbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInboundEmailGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update email group sendsperminute defined by EmailGroupSendsPerMinuteReq
     * message for a specified email_group_sid and sends_per_minute.
     * The method will return a EmailGroupSendsPerMinuteRes message/entity that
     * will contain the true/false after updating sends_per_minute value for this
     * clients email_group_sid and sends_per_minute Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateEmailGroupMstrSendsPerMinute(com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmailGroupMstrSendsPerMinuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the name, start and stop time for the outbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOutboundEmailGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a inbound email group details defined by InboundEmailGroupByIdReq
     * message for the specified inbound_email_group_id, org_id and region_id. The
     * method will return a InboundEmailGroup message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getInboundEmailGroupById(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInboundEmailGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Add email message attachment details defined by CreateEmailMessageAttachmentReq
     * message for the specified client.
     * This method will return a CreateEmailMessageAttachmentRes message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createEmailMessageAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmailMessageAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the email message attachments and their details defined by
     * ListEmailMessageAttachmentsReq for the specified client.
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listEmailMessageAttachments(com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEmailMessageAttachmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unassigns a conversation from the current user and puts it back into the matching pool
     * Required permissions:
     *    OMNI_LINK
     * </pre>
     */
    public void unassignCurrentUserFromEmailConversation(com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignCurrentUserFromEmailConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Listing all email conversations for the dashboard
     * Required Permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void dashboardEmailConversationSearch(com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDashboardEmailConversationSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReassignEmailConversation.  unassign current user and assign
     * new user.
     * This method will return a ReassignEmailConversationRes
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void reassignEmailConversation(com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReassignEmailConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignEmailConversation - allowing the manager from the dashboard to assing a email conversation
     * before the matcher assigns it.
     * </pre>
     */
    public void assignEmailConversation(com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignEmailConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suspends an email conversation
     * </pre>
     */
    public void suspendEmailConversation(com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendEmailConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List stream of inbound and outbound campaigns defined by ListCampaignsByConnectedInboxIdReq message
     * The method will return a ListCampaignsByConnectedInboxIdRes message/entity that will
     * contain the stream of all campaigns along with project details.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listCampaignsByConnectedInboxId(com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCampaignsByConnectedInboxIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close email conversation defined by CloseEmailConversationReq message
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void closeEmailConversation(com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseEmailConversationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmailApiBlockingStub extends io.grpc.stub.AbstractBlockingStub<EmailApiBlockingStub> {
    private EmailApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create/Record email template details defined by CreateEmailTemplateReq message for a specified
     * email_subject, email_body.
     * The method will return a CreateEmailTemplateRes message/entity that will
     * contain the newly created email_template_sid value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes createEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update email template details defined by UpdateEmailTemplateReq message for a specified
     * email_template_sid, email_subject, email_body.
     * The method will return a UpdateEmailTemplateRes message/entity that will
     * contain the true/false after updating template details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes updateEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record email template attachment details defined by CreateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, file_name, file_size, content_type, hash.
     * The method will return a CreateEmailTemplateAttachmentRes message/entity that will
     * contain the newly created email_template_attachment_sid, fts storage url and gs_path  for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes createEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailTemplateAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Copy/Record email template with attachment details defined by CopyEmailTemplateWithAttachmentsReq message for a specified
     * email_template_sid and email_body.
     * The method will return a CopyEmailTemplateWithAttachmentsRes message/entity that will
     * contain the newly copied email_template_sid value for this client along with attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes copyEmailTemplateWithAttachments(com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyEmailTemplateWithAttachmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update email template attachment details defined by UpdateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, email_template_attachment_sid, file_name, file_size, content_type, hash.
     * The method will return a UpdateEmailTemplateAttachmentRes message/entity that will
     * contain the true/false after updating template attachment details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes updateEmailTemplateAttachment(com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailTemplateAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets email template along with attachment details defined by GetEmailTemplateByTemplateSidReq message for a specified
     * email_template_sid.
     * The method will return a EmailTemplateWithAttachments message/entity that will
     * contain the email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments getEmailTemplateByTemplateSid(com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailTemplateByTemplateSidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of email template along with attachment details defined by GetAllEmailTemplatesReq message.
     * The method will return a GetAllEmailTemplatesRes message/entity that will
     * contain the stream of email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes getAllEmailTemplates(com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmailTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete email template details defined by DeleteEmailTemplateReq message for a specified
     * email_template_sid.
     * The method will return a DeleteEmailTemplateRes message/entity that will
     * contain the true/false after deleting template details for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes deleteEmailTemplate(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete email template attachments defined by DeleteEmailTemplateAttachmentByIdReq message for a specified
     * email_template_attachment_sid.
     * The method will return a DeleteEmailTemplateAttachmentByIdRes message/entity that will
     * contain the true/false after deleting template attachments for this client_sid and email_template_attachment_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes deleteEmailTemplateAttachmentById(com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmailTemplateAttachmentByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download local inbound file attachment file contents using FTS bucket
     * defined by DownloadInboundEmailAttachmentReq message for a specified
     * email_message_reply_id and email_message_reply_attachment_id.
     * The method will return a DownloadInboundEmailAttachmentRes message/entity that will
     * contain the url where attachment contents are stored
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes downloadInboundEmailAttachment(com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadInboundEmailAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of pure email groups based on search criteria defined by EmailGroupSearchReq message for a specified
     * by search_from and search_to or by status or by name and any of these combinations
     * The method will return a EmailGroupSearchRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes pureEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPureEmailGroupSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp. Can set a user_id to get conversations for any user.
     * Required permissions:
     *    ??????
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes managerListNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getManagerListNewEmailMessageRepliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp
     * Required permissions:
     *    ??????
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes listNewEmailMessageReplies(com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNewEmailMessageRepliesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of email tasks defined by GetEmailTasksByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailTasksByGroupSidsRes message/entity that will
     * contain the stream of EmailTaskMstrDetails results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes getEmailTasksByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailTasksByGroupSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update email group status value defined by EmailGroupStatusReq message for a specified
     * email_group_sid and status_id.
     * The method will return a EmailGroupStatusRes message/entity that will
     * contain the true/false after updating status for this clients email_group_sid and status_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes updateEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailGroupStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets email message details defined by GetEmailMessageReq message for a specified
     * email_message_sid.
     * The method will return a GetEmailMessageRes message/entity that will
     * contains email_subject and email_body for the email_message_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes getEmailMessageDetails(com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailMessageDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record inbound email template defined by CreateInboundEmailTemplateReq message for a specified
     *  connected_inbox_id, name.
     * The method will return a CreateInboundEmailTemplateRes message/entity that will
     * contain the newly created inbound_email_template_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes createInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInboundEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update inbound email template details defined by UpdateInboundEmailTemplateReq message for a specified
     *  inbound_email_template_id, connected_inbox_id, name.
     * The method will return a UpdateInboundEmailTemplateRes message/entity that will
     * contain the true/false after updating inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes updateInboundEmailTemplate(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInboundEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete inbound email template details defined by DeleteInboundEmailTemplateByIdReq message for a specified
     *  inbound_email_template_id.
     * The method will return a DeleteInboundEmailTemplateByIdRes message/entity that will
     * contain the true/false after deleting inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes deleteInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInboundEmailTemplateByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of inbound email template details defined by ListInboundEmailTemplatesReq message
     * The method will return a ListInboundEmailTemplatesRes message/entity that will
     * contain the stream of inbound_email_template_id, connected_inbox_id, name.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes listInboundEmailTemplates(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInboundEmailTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets inbound email template details defined by GetInboundEmailTemplateByIdReq message for a specified
     * inbound_email_template_id.
     * The method will return a InboundEmailTemplate message/entity that will
     * contain the inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate getInboundEmailTemplateById(com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInboundEmailTemplateByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update inbound email group status details defined by UpdateInboundEmailGroupStatusReq
     * status. The method will return a UpdateInboundEmailGroupStatusRes message/entity
     * that will contain the true/false after updating inbound email group details
     * for this org_id, region_id and inbound_email_group_id Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes updateInboundEmailGroupStatus(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInboundEmailGroupStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop inbound email group defined by StopInboundEmailGroupReq message for a specified
     *  inbound_email_group_id.
     * The method will return a StopInboundEmailGroupRes message/entity that will
     * contain the true/false after updating inbound email group details for inbound_email_group_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes stopInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopInboundEmailGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop all InboundEmail groups defined by StopAllInboundEmailGroupsReq message for the specified
     * array of inbound_email_group_ids
     * The method will mark the InboundEmail groups as completed.
     * Required permissions: VIEW_EMAIL
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes stopAllInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopAllInboundEmailGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of pure inbound email groups based on search criteria defined by PureInboundEmailGroupSearchReq message for a specified
     *  by search_from and search_to or by status or by name and any of these combinations
     * The method will return a PureInboundEmailGroupSearchRes message/entity that will
     * contain the stream of InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes pureInboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPureInboundEmailGroupSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of inbound email groups based on search criteria defined by
     * InboundEmailGroupSearchReq message for a specified by
     * search_from and search_to or by status or by name and any of these
     * combinations The method will return a InboundEmailGroupSearchRes
     * message/entity that will contain the stream of InboundEmailGroups Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes inboundEmailGroupSearch(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInboundEmailGroupSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of inbound email groups defined by ListInboundEmailGroupsByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailGroupsByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailGroup
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes listInboundEmailGroupsByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInboundEmailGroupsByGroupIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of inbound email tasks defined by ListInboundEmailTasksByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailTasksByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailTaskDetails along with any file attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes listInboundEmailTasksByGroupIds(com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInboundEmailTasksByGroupIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of active/running inbound email groups defined by ListActiveInboundEmailGroupsReq message
     * The method will return a ListActiveInboundEmailGroupsRes message/entity that will
     * contain the stream of active/running InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes listActiveInboundEmailGroups(com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListActiveInboundEmailGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleReq message for the specified
     * email_template_sid, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduleRes schedule(com.tcn.cloud.api.api.v0alpha.ScheduleReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleOutboundEmailGroupReq message for the specified
     * subject, email message, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleOutboundEmailGroupRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes scheduleOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScheduleOutboundEmailGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule Pure Inbound email campaign defined by SchedulePureInboundEmailReq message for the specified
     * inbound_email_template_sid
     * The method will return SchedulePureInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes schedulePureInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulePureInboundEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply defined by CreateEmailMessageAgentReplyReq message for a specified
     * inbound_email_group_id, to_address, subject, email_conversation_id, agent_sid .
     * The method will return a EmailMessageReply message/entity that will
     * contain the newly created email_message_reply data
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments createEmailMessageAgentReply(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailMessageAgentReplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply attachment defined by CreateEmailMessageAgentReplyAttachmentReq message for a specified
     * file_name, file_size and file_type.
     * The method will return a CreateEmailMessageAgentReplyAttachmentRes message/entity that will
     * contain the newly created email_message_reply_attachment_id, url_path and gs_path for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes createEmailMessageAgentReplyAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailMessageAgentReplyAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends email message based on email details defined in SendReplyReq specified by
     * in_reply_to and email_reply_id
     * The method will return a EmailMessageReplyWithAttachments message/entity that will
     * contain the email_message_reply data
     * along with along with attachment details
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments sendReply(com.tcn.cloud.api.api.v0alpha.SendReplyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendReplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of email groups defined by GetEmailGroupsByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailGroupsByGroupSidsRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes getEmailGroupsByGroupSids(com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailGroupsByGroupSidsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupSidReq message for a specified
     * email_group_sid
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments getEmailGroupByGroupSid(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailGroupByGroupSidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupIdReq message for a specified
     * email_group_id
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments getEmailGroupByGroupId(com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailGroupByGroupIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schedule Pure OmniLink Inbound email campaign defined by SchedulePureOmniLinkInboundEmailReq message for the specified
     * connectedInbox and skills
     * The method will return SchedulePureOmniLinkInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes schedulePureOmniLinkInboundEmail(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchedulePureOmniLinkInboundEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the name, skills, stop time for the inbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes updateInboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInboundEmailGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update email group sendsperminute defined by EmailGroupSendsPerMinuteReq
     * message for a specified email_group_sid and sends_per_minute.
     * The method will return a EmailGroupSendsPerMinuteRes message/entity that
     * will contain the true/false after updating sends_per_minute value for this
     * clients email_group_sid and sends_per_minute Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes updateEmailGroupMstrSendsPerMinute(com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmailGroupMstrSendsPerMinuteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the name, start and stop time for the outbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes updateOutboundEmailGroup(com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOutboundEmailGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a inbound email group details defined by InboundEmailGroupByIdReq
     * message for the specified inbound_email_group_id, org_id and region_id. The
     * method will return a InboundEmailGroup message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundEmailGroup getInboundEmailGroupById(com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInboundEmailGroupByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Add email message attachment details defined by CreateEmailMessageAttachmentReq
     * message for the specified client.
     * This method will return a CreateEmailMessageAttachmentRes message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes createEmailMessageAttachment(com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmailMessageAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the email message attachments and their details defined by
     * ListEmailMessageAttachmentsReq for the specified client.
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes listEmailMessageAttachments(com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEmailMessageAttachmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unassigns a conversation from the current user and puts it back into the matching pool
     * Required permissions:
     *    OMNI_LINK
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes unassignCurrentUserFromEmailConversation(com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignCurrentUserFromEmailConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Listing all email conversations for the dashboard
     * Required Permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes dashboardEmailConversationSearch(com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDashboardEmailConversationSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReassignEmailConversation.  unassign current user and assign
     * new user.
     * This method will return a ReassignEmailConversationRes
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes reassignEmailConversation(com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReassignEmailConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignEmailConversation - allowing the manager from the dashboard to assing a email conversation
     * before the matcher assigns it.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes assignEmailConversation(com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignEmailConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Suspends an email conversation
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes suspendEmailConversation(com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendEmailConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List stream of inbound and outbound campaigns defined by ListCampaignsByConnectedInboxIdReq message
     * The method will return a ListCampaignsByConnectedInboxIdRes message/entity that will
     * contain the stream of all campaigns along with project details.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes listCampaignsByConnectedInboxId(com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCampaignsByConnectedInboxIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close email conversation defined by CloseEmailConversationReq message
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes closeEmailConversation(com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseEmailConversationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmailApiFutureStub extends io.grpc.stub.AbstractFutureStub<EmailApiFutureStub> {
    private EmailApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmailApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create/Record email template details defined by CreateEmailTemplateReq message for a specified
     * email_subject, email_body.
     * The method will return a CreateEmailTemplateRes message/entity that will
     * contain the newly created email_template_sid value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes> createEmailTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update email template details defined by UpdateEmailTemplateReq message for a specified
     * email_template_sid, email_subject, email_body.
     * The method will return a UpdateEmailTemplateRes message/entity that will
     * contain the true/false after updating template details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes> updateEmailTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record email template attachment details defined by CreateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, file_name, file_size, content_type, hash.
     * The method will return a CreateEmailTemplateAttachmentRes message/entity that will
     * contain the newly created email_template_attachment_sid, fts storage url and gs_path  for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes> createEmailTemplateAttachment(
        com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailTemplateAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Copy/Record email template with attachment details defined by CopyEmailTemplateWithAttachmentsReq message for a specified
     * email_template_sid and email_body.
     * The method will return a CopyEmailTemplateWithAttachmentsRes message/entity that will
     * contain the newly copied email_template_sid value for this client along with attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes> copyEmailTemplateWithAttachments(
        com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyEmailTemplateWithAttachmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update email template attachment details defined by UpdateEmailTemplateAttachmentReq message for a specified
     * email_template_sid, email_template_attachment_sid, file_name, file_size, content_type, hash.
     * The method will return a UpdateEmailTemplateAttachmentRes message/entity that will
     * contain the true/false after updating template attachment details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes> updateEmailTemplateAttachment(
        com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailTemplateAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets email template along with attachment details defined by GetEmailTemplateByTemplateSidReq message for a specified
     * email_template_sid.
     * The method will return a EmailTemplateWithAttachments message/entity that will
     * contain the email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments> getEmailTemplateByTemplateSid(
        com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailTemplateByTemplateSidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of email template along with attachment details defined by GetAllEmailTemplatesReq message.
     * The method will return a GetAllEmailTemplatesRes message/entity that will
     * contain the stream of email_template_sid, email_subject, email_body, EmailTemplateAttachmentDetails for this client_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes> getAllEmailTemplates(
        com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEmailTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete email template details defined by DeleteEmailTemplateReq message for a specified
     * email_template_sid.
     * The method will return a DeleteEmailTemplateRes message/entity that will
     * contain the true/false after deleting template details for this client_sid and email_template_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes> deleteEmailTemplate(
        com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete email template attachments defined by DeleteEmailTemplateAttachmentByIdReq message for a specified
     * email_template_attachment_sid.
     * The method will return a DeleteEmailTemplateAttachmentByIdRes message/entity that will
     * contain the true/false after deleting template attachments for this client_sid and email_template_attachment_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes> deleteEmailTemplateAttachmentById(
        com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmailTemplateAttachmentByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download local inbound file attachment file contents using FTS bucket
     * defined by DownloadInboundEmailAttachmentReq message for a specified
     * email_message_reply_id and email_message_reply_attachment_id.
     * The method will return a DownloadInboundEmailAttachmentRes message/entity that will
     * contain the url where attachment contents are stored
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes> downloadInboundEmailAttachment(
        com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadInboundEmailAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of pure email groups based on search criteria defined by EmailGroupSearchReq message for a specified
     * by search_from and search_to or by status or by name and any of these combinations
     * The method will return a EmailGroupSearchRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes> pureEmailGroupSearch(
        com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPureEmailGroupSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp. Can set a user_id to get conversations for any user.
     * Required permissions:
     *    ??????
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> managerListNewEmailMessageReplies(
        com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getManagerListNewEmailMessageRepliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retreives a list of email replies for a conversation that come after the given
     * timestamp
     * Required permissions:
     *    ??????
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes> listNewEmailMessageReplies(
        com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNewEmailMessageRepliesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of email tasks defined by GetEmailTasksByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailTasksByGroupSidsRes message/entity that will
     * contain the stream of EmailTaskMstrDetails results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes> getEmailTasksByGroupSids(
        com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailTasksByGroupSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update email group status value defined by EmailGroupStatusReq message for a specified
     * email_group_sid and status_id.
     * The method will return a EmailGroupStatusRes message/entity that will
     * contain the true/false after updating status for this clients email_group_sid and status_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes> updateEmailGroupStatus(
        com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailGroupStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets email message details defined by GetEmailMessageReq message for a specified
     * email_message_sid.
     * The method will return a GetEmailMessageRes message/entity that will
     * contains email_subject and email_body for the email_message_sid
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes> getEmailMessageDetails(
        com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailMessageDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record inbound email template defined by CreateInboundEmailTemplateReq message for a specified
     *  connected_inbox_id, name.
     * The method will return a CreateInboundEmailTemplateRes message/entity that will
     * contain the newly created inbound_email_template_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes> createInboundEmailTemplate(
        com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInboundEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update inbound email template details defined by UpdateInboundEmailTemplateReq message for a specified
     *  inbound_email_template_id, connected_inbox_id, name.
     * The method will return a UpdateInboundEmailTemplateRes message/entity that will
     * contain the true/false after updating inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes> updateInboundEmailTemplate(
        com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInboundEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete inbound email template details defined by DeleteInboundEmailTemplateByIdReq message for a specified
     *  inbound_email_template_id.
     * The method will return a DeleteInboundEmailTemplateByIdRes message/entity that will
     * contain the true/false after deleting inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes> deleteInboundEmailTemplateById(
        com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInboundEmailTemplateByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of inbound email template details defined by ListInboundEmailTemplatesReq message
     * The method will return a ListInboundEmailTemplatesRes message/entity that will
     * contain the stream of inbound_email_template_id, connected_inbox_id, name.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes> listInboundEmailTemplates(
        com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInboundEmailTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets inbound email template details defined by GetInboundEmailTemplateByIdReq message for a specified
     * inbound_email_template_id.
     * The method will return a InboundEmailTemplate message/entity that will
     * contain the inbound email template details for inbound_email_template_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate> getInboundEmailTemplateById(
        com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInboundEmailTemplateByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update inbound email group status details defined by UpdateInboundEmailGroupStatusReq
     * status. The method will return a UpdateInboundEmailGroupStatusRes message/entity
     * that will contain the true/false after updating inbound email group details
     * for this org_id, region_id and inbound_email_group_id Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes> updateInboundEmailGroupStatus(
        com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInboundEmailGroupStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop inbound email group defined by StopInboundEmailGroupReq message for a specified
     *  inbound_email_group_id.
     * The method will return a StopInboundEmailGroupRes message/entity that will
     * contain the true/false after updating inbound email group details for inbound_email_group_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> stopInboundEmailGroup(
        com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopInboundEmailGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop all InboundEmail groups defined by StopAllInboundEmailGroupsReq message for the specified
     * array of inbound_email_group_ids
     * The method will mark the InboundEmail groups as completed.
     * Required permissions: VIEW_EMAIL
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes> stopAllInboundEmailGroups(
        com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopAllInboundEmailGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of pure inbound email groups based on search criteria defined by PureInboundEmailGroupSearchReq message for a specified
     *  by search_from and search_to or by status or by name and any of these combinations
     * The method will return a PureInboundEmailGroupSearchRes message/entity that will
     * contain the stream of InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes> pureInboundEmailGroupSearch(
        com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPureInboundEmailGroupSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of inbound email groups based on search criteria defined by
     * InboundEmailGroupSearchReq message for a specified by
     * search_from and search_to or by status or by name and any of these
     * combinations The method will return a InboundEmailGroupSearchRes
     * message/entity that will contain the stream of InboundEmailGroups Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes> inboundEmailGroupSearch(
        com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInboundEmailGroupSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of inbound email groups defined by ListInboundEmailGroupsByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailGroupsByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailGroup
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes> listInboundEmailGroupsByGroupIds(
        com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInboundEmailGroupsByGroupIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of inbound email tasks defined by ListInboundEmailTasksByGroupIdsReq message for a specified
     * array of inbound email groups
     * The method will return a ListInboundEmailTasksByGroupIdsRes message/entity that will
     * contain the stream of InboundEmailTaskDetails along with any file attachments
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes> listInboundEmailTasksByGroupIds(
        com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInboundEmailTasksByGroupIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of active/running inbound email groups defined by ListActiveInboundEmailGroupsReq message
     * The method will return a ListActiveInboundEmailGroupsRes message/entity that will
     * contain the stream of active/running InboundEmailGroups
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes> listActiveInboundEmailGroups(
        com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListActiveInboundEmailGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleReq message for the specified
     * email_template_sid, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScheduleRes> schedule(
        com.tcn.cloud.api.api.v0alpha.ScheduleReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule Outbound email campaign defined by ScheduleOutboundEmailGroupReq message for the specified
     * subject, email message, initial_pace, selected_email_col, from_address,
     * allow_duplicates, group_name, contact_group_sid, start_time, stop_time
     * The method will return ScheduleOutboundEmailGroupRes message/entity that will
     * contain newly scheduled email_group_sid and email_group_id for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes> scheduleOutboundEmailGroup(
        com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScheduleOutboundEmailGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule Pure Inbound email campaign defined by SchedulePureInboundEmailReq message for the specified
     * inbound_email_template_sid
     * The method will return SchedulePureInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes> schedulePureInboundEmail(
        com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulePureInboundEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply defined by CreateEmailMessageAgentReplyReq message for a specified
     * inbound_email_group_id, to_address, subject, email_conversation_id, agent_sid .
     * The method will return a EmailMessageReply message/entity that will
     * contain the newly created email_message_reply data
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> createEmailMessageAgentReply(
        com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailMessageAgentReplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record inbound agent email reply attachment defined by CreateEmailMessageAgentReplyAttachmentReq message for a specified
     * file_name, file_size and file_type.
     * The method will return a CreateEmailMessageAgentReplyAttachmentRes message/entity that will
     * contain the newly created email_message_reply_attachment_id, url_path and gs_path for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes> createEmailMessageAgentReplyAttachment(
        com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailMessageAgentReplyAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends email message based on email details defined in SendReplyReq specified by
     * in_reply_to and email_reply_id
     * The method will return a EmailMessageReplyWithAttachments message/entity that will
     * contain the email_message_reply data
     * along with along with attachment details
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments> sendReply(
        com.tcn.cloud.api.api.v0alpha.SendReplyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendReplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of email groups defined by GetEmailGroupsByGroupSidsReq message for a specified
     * array of email_group_sids
     * The method will return a GetEmailGroupsByGroupSidsRes message/entity that will
     * contain the stream of EmailGroupSearchDetailsRes results
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes> getEmailGroupsByGroupSids(
        com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailGroupsByGroupSidsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupSidReq message for a specified
     * email_group_sid
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getEmailGroupByGroupSid(
        com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailGroupByGroupSidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get outbound email group details defined by GetEmailGroupByGroupIdReq message for a specified
     * email_group_id
     * The method will return a EmailGroupDetailsWithAttachments message/entity that will
     * contain the outbound email group details
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments> getEmailGroupByGroupId(
        com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailGroupByGroupIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schedule Pure OmniLink Inbound email campaign defined by SchedulePureOmniLinkInboundEmailReq message for the specified
     * connectedInbox and skills
     * The method will return SchedulePureOmniLinkInboundEmailRes message/entity that will
     * contain newly scheduled inbound_email_group_sid for this client
     * Required permissions:
     *      EXECUTE_SEND_BROADCAST
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes> schedulePureOmniLinkInboundEmail(
        com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchedulePureOmniLinkInboundEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the name, skills, stop time for the inbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes> updateInboundEmailGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInboundEmailGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update email group sendsperminute defined by EmailGroupSendsPerMinuteReq
     * message for a specified email_group_sid and sends_per_minute.
     * The method will return a EmailGroupSendsPerMinuteRes message/entity that
     * will contain the true/false after updating sends_per_minute value for this
     * clients email_group_sid and sends_per_minute Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes> updateEmailGroupMstrSendsPerMinute(
        com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmailGroupMstrSendsPerMinuteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the name, start and stop time for the outbound email group
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes> updateOutboundEmailGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOutboundEmailGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a inbound email group details defined by InboundEmailGroupByIdReq
     * message for the specified inbound_email_group_id, org_id and region_id. The
     * method will return a InboundEmailGroup message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.InboundEmailGroup> getInboundEmailGroupById(
        com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInboundEmailGroupByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Add email message attachment details defined by CreateEmailMessageAttachmentReq
     * message for the specified client.
     * This method will return a CreateEmailMessageAttachmentRes message/entity. Required
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes> createEmailMessageAttachment(
        com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmailMessageAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the email message attachments and their details defined by
     * ListEmailMessageAttachmentsReq for the specified client.
     * permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes> listEmailMessageAttachments(
        com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEmailMessageAttachmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unassigns a conversation from the current user and puts it back into the matching pool
     * Required permissions:
     *    OMNI_LINK
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes> unassignCurrentUserFromEmailConversation(
        com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignCurrentUserFromEmailConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Listing all email conversations for the dashboard
     * Required Permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes> dashboardEmailConversationSearch(
        com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDashboardEmailConversationSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReassignEmailConversation.  unassign current user and assign
     * new user.
     * This method will return a ReassignEmailConversationRes
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes> reassignEmailConversation(
        com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReassignEmailConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignEmailConversation - allowing the manager from the dashboard to assing a email conversation
     * before the matcher assigns it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes> assignEmailConversation(
        com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignEmailConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Suspends an email conversation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes> suspendEmailConversation(
        com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendEmailConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List stream of inbound and outbound campaigns defined by ListCampaignsByConnectedInboxIdReq message
     * The method will return a ListCampaignsByConnectedInboxIdRes message/entity that will
     * contain the stream of all campaigns along with project details.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes> listCampaignsByConnectedInboxId(
        com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCampaignsByConnectedInboxIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close email conversation defined by CloseEmailConversationReq message
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes> closeEmailConversation(
        com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseEmailConversationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EMAIL_TEMPLATE = 0;
  private static final int METHODID_UPDATE_EMAIL_TEMPLATE = 1;
  private static final int METHODID_CREATE_EMAIL_TEMPLATE_ATTACHMENT = 2;
  private static final int METHODID_COPY_EMAIL_TEMPLATE_WITH_ATTACHMENTS = 3;
  private static final int METHODID_UPDATE_EMAIL_TEMPLATE_ATTACHMENT = 4;
  private static final int METHODID_GET_EMAIL_TEMPLATE_BY_TEMPLATE_SID = 5;
  private static final int METHODID_GET_ALL_EMAIL_TEMPLATES = 6;
  private static final int METHODID_DELETE_EMAIL_TEMPLATE = 7;
  private static final int METHODID_DELETE_EMAIL_TEMPLATE_ATTACHMENT_BY_ID = 8;
  private static final int METHODID_DOWNLOAD_INBOUND_EMAIL_ATTACHMENT = 9;
  private static final int METHODID_PURE_EMAIL_GROUP_SEARCH = 10;
  private static final int METHODID_MANAGER_LIST_NEW_EMAIL_MESSAGE_REPLIES = 11;
  private static final int METHODID_LIST_NEW_EMAIL_MESSAGE_REPLIES = 12;
  private static final int METHODID_GET_EMAIL_TASKS_BY_GROUP_SIDS = 13;
  private static final int METHODID_UPDATE_EMAIL_GROUP_STATUS = 14;
  private static final int METHODID_GET_EMAIL_MESSAGE_DETAILS = 15;
  private static final int METHODID_CREATE_INBOUND_EMAIL_TEMPLATE = 16;
  private static final int METHODID_UPDATE_INBOUND_EMAIL_TEMPLATE = 17;
  private static final int METHODID_DELETE_INBOUND_EMAIL_TEMPLATE_BY_ID = 18;
  private static final int METHODID_LIST_INBOUND_EMAIL_TEMPLATES = 19;
  private static final int METHODID_GET_INBOUND_EMAIL_TEMPLATE_BY_ID = 20;
  private static final int METHODID_UPDATE_INBOUND_EMAIL_GROUP_STATUS = 21;
  private static final int METHODID_STOP_INBOUND_EMAIL_GROUP = 22;
  private static final int METHODID_STOP_ALL_INBOUND_EMAIL_GROUPS = 23;
  private static final int METHODID_PURE_INBOUND_EMAIL_GROUP_SEARCH = 24;
  private static final int METHODID_INBOUND_EMAIL_GROUP_SEARCH = 25;
  private static final int METHODID_LIST_INBOUND_EMAIL_GROUPS_BY_GROUP_IDS = 26;
  private static final int METHODID_LIST_INBOUND_EMAIL_TASKS_BY_GROUP_IDS = 27;
  private static final int METHODID_LIST_ACTIVE_INBOUND_EMAIL_GROUPS = 28;
  private static final int METHODID_SCHEDULE = 29;
  private static final int METHODID_SCHEDULE_OUTBOUND_EMAIL_GROUP = 30;
  private static final int METHODID_SCHEDULE_PURE_INBOUND_EMAIL = 31;
  private static final int METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY = 32;
  private static final int METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY_ATTACHMENT = 33;
  private static final int METHODID_SEND_REPLY = 34;
  private static final int METHODID_GET_EMAIL_GROUPS_BY_GROUP_SIDS = 35;
  private static final int METHODID_GET_EMAIL_GROUP_BY_GROUP_SID = 36;
  private static final int METHODID_GET_EMAIL_GROUP_BY_GROUP_ID = 37;
  private static final int METHODID_SCHEDULE_PURE_OMNI_LINK_INBOUND_EMAIL = 38;
  private static final int METHODID_UPDATE_INBOUND_EMAIL_GROUP = 39;
  private static final int METHODID_UPDATE_EMAIL_GROUP_MSTR_SENDS_PER_MINUTE = 40;
  private static final int METHODID_UPDATE_OUTBOUND_EMAIL_GROUP = 41;
  private static final int METHODID_GET_INBOUND_EMAIL_GROUP_BY_ID = 42;
  private static final int METHODID_CREATE_EMAIL_MESSAGE_ATTACHMENT = 43;
  private static final int METHODID_LIST_EMAIL_MESSAGE_ATTACHMENTS = 44;
  private static final int METHODID_UNASSIGN_CURRENT_USER_FROM_EMAIL_CONVERSATION = 45;
  private static final int METHODID_DASHBOARD_EMAIL_CONVERSATION_SEARCH = 46;
  private static final int METHODID_REASSIGN_EMAIL_CONVERSATION = 47;
  private static final int METHODID_ASSIGN_EMAIL_CONVERSATION = 48;
  private static final int METHODID_SUSPEND_EMAIL_CONVERSATION = 49;
  private static final int METHODID_LIST_CAMPAIGNS_BY_CONNECTED_INBOX_ID = 50;
  private static final int METHODID_CLOSE_EMAIL_CONVERSATION = 51;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmailApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmailApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EMAIL_TEMPLATE:
          serviceImpl.createEmailTemplate((com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_TEMPLATE:
          serviceImpl.updateEmailTemplate((com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateRes>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_TEMPLATE_ATTACHMENT:
          serviceImpl.createEmailTemplateAttachment((com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailTemplateAttachmentRes>) responseObserver);
          break;
        case METHODID_COPY_EMAIL_TEMPLATE_WITH_ATTACHMENTS:
          serviceImpl.copyEmailTemplateWithAttachments((com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CopyEmailTemplateWithAttachmentsRes>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_TEMPLATE_ATTACHMENT:
          serviceImpl.updateEmailTemplateAttachment((com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateEmailTemplateAttachmentRes>) responseObserver);
          break;
        case METHODID_GET_EMAIL_TEMPLATE_BY_TEMPLATE_SID:
          serviceImpl.getEmailTemplateByTemplateSid((com.tcn.cloud.api.api.v0alpha.GetEmailTemplateByTemplateSidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailTemplateWithAttachments>) responseObserver);
          break;
        case METHODID_GET_ALL_EMAIL_TEMPLATES:
          serviceImpl.getAllEmailTemplates((com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAllEmailTemplatesRes>) responseObserver);
          break;
        case METHODID_DELETE_EMAIL_TEMPLATE:
          serviceImpl.deleteEmailTemplate((com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_EMAIL_TEMPLATE_ATTACHMENT_BY_ID:
          serviceImpl.deleteEmailTemplateAttachmentById((com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteEmailTemplateAttachmentByIdRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_INBOUND_EMAIL_ATTACHMENT:
          serviceImpl.downloadInboundEmailAttachment((com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadInboundEmailAttachmentRes>) responseObserver);
          break;
        case METHODID_PURE_EMAIL_GROUP_SEARCH:
          serviceImpl.pureEmailGroupSearch((com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSearchRes>) responseObserver);
          break;
        case METHODID_MANAGER_LIST_NEW_EMAIL_MESSAGE_REPLIES:
          serviceImpl.managerListNewEmailMessageReplies((com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>) responseObserver);
          break;
        case METHODID_LIST_NEW_EMAIL_MESSAGE_REPLIES:
          serviceImpl.listNewEmailMessageReplies((com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListNewEmailMessageRepliesRes>) responseObserver);
          break;
        case METHODID_GET_EMAIL_TASKS_BY_GROUP_SIDS:
          serviceImpl.getEmailTasksByGroupSids((com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailTasksByGroupSidsRes>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_GROUP_STATUS:
          serviceImpl.updateEmailGroupStatus((com.tcn.cloud.api.api.v0alpha.EmailGroupStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupStatusRes>) responseObserver);
          break;
        case METHODID_GET_EMAIL_MESSAGE_DETAILS:
          serviceImpl.getEmailMessageDetails((com.tcn.cloud.api.api.v0alpha.GetEmailMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailMessageRes>) responseObserver);
          break;
        case METHODID_CREATE_INBOUND_EMAIL_TEMPLATE:
          serviceImpl.createInboundEmailTemplate((com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateInboundEmailTemplateRes>) responseObserver);
          break;
        case METHODID_UPDATE_INBOUND_EMAIL_TEMPLATE:
          serviceImpl.updateInboundEmailTemplate((com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateRes>) responseObserver);
          break;
        case METHODID_DELETE_INBOUND_EMAIL_TEMPLATE_BY_ID:
          serviceImpl.deleteInboundEmailTemplateById((com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteInboundEmailTemplateByIdRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_EMAIL_TEMPLATES:
          serviceImpl.listInboundEmailTemplates((com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTemplatesRes>) responseObserver);
          break;
        case METHODID_GET_INBOUND_EMAIL_TEMPLATE_BY_ID:
          serviceImpl.getInboundEmailTemplateById((com.tcn.cloud.api.api.v0alpha.GetInboundEmailTemplateByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailTemplate>) responseObserver);
          break;
        case METHODID_UPDATE_INBOUND_EMAIL_GROUP_STATUS:
          serviceImpl.updateInboundEmailGroupStatus((com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupStatusRes>) responseObserver);
          break;
        case METHODID_STOP_INBOUND_EMAIL_GROUP:
          serviceImpl.stopInboundEmailGroup((com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>) responseObserver);
          break;
        case METHODID_STOP_ALL_INBOUND_EMAIL_GROUPS:
          serviceImpl.stopAllInboundEmailGroups((com.tcn.cloud.api.api.v0alpha.StopAllInboundEmailGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.StopInboundEmailGroupRes>) responseObserver);
          break;
        case METHODID_PURE_INBOUND_EMAIL_GROUP_SEARCH:
          serviceImpl.pureInboundEmailGroupSearch((com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PureInboundEmailGroupSearchRes>) responseObserver);
          break;
        case METHODID_INBOUND_EMAIL_GROUP_SEARCH:
          serviceImpl.inboundEmailGroupSearch((com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroupSearchRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_EMAIL_GROUPS_BY_GROUP_IDS:
          serviceImpl.listInboundEmailGroupsByGroupIds((com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailGroupsByGroupIdsRes>) responseObserver);
          break;
        case METHODID_LIST_INBOUND_EMAIL_TASKS_BY_GROUP_IDS:
          serviceImpl.listInboundEmailTasksByGroupIds((com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListInboundEmailTasksByGroupIdsRes>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_INBOUND_EMAIL_GROUPS:
          serviceImpl.listActiveInboundEmailGroups((com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListActiveInboundEmailGroupsRes>) responseObserver);
          break;
        case METHODID_SCHEDULE:
          serviceImpl.schedule((com.tcn.cloud.api.api.v0alpha.ScheduleReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleRes>) responseObserver);
          break;
        case METHODID_SCHEDULE_OUTBOUND_EMAIL_GROUP:
          serviceImpl.scheduleOutboundEmailGroup((com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes>) responseObserver);
          break;
        case METHODID_SCHEDULE_PURE_INBOUND_EMAIL:
          serviceImpl.schedulePureInboundEmail((com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureInboundEmailRes>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY:
          serviceImpl.createEmailMessageAgentReply((com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_MESSAGE_AGENT_REPLY_ATTACHMENT:
          serviceImpl.createEmailMessageAgentReplyAttachment((com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAgentReplyAttachmentRes>) responseObserver);
          break;
        case METHODID_SEND_REPLY:
          serviceImpl.sendReply((com.tcn.cloud.api.api.v0alpha.SendReplyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyWithAttachments>) responseObserver);
          break;
        case METHODID_GET_EMAIL_GROUPS_BY_GROUP_SIDS:
          serviceImpl.getEmailGroupsByGroupSids((com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetEmailGroupsByGroupSidsRes>) responseObserver);
          break;
        case METHODID_GET_EMAIL_GROUP_BY_GROUP_SID:
          serviceImpl.getEmailGroupByGroupSid((com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupSidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>) responseObserver);
          break;
        case METHODID_GET_EMAIL_GROUP_BY_GROUP_ID:
          serviceImpl.getEmailGroupByGroupId((com.tcn.cloud.api.api.v0alpha.GetEmailGroupByGroupIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupDetailsWithAttachments>) responseObserver);
          break;
        case METHODID_SCHEDULE_PURE_OMNI_LINK_INBOUND_EMAIL:
          serviceImpl.schedulePureOmniLinkInboundEmail((com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes>) responseObserver);
          break;
        case METHODID_UPDATE_INBOUND_EMAIL_GROUP:
          serviceImpl.updateInboundEmailGroup((com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailGroupRes>) responseObserver);
          break;
        case METHODID_UPDATE_EMAIL_GROUP_MSTR_SENDS_PER_MINUTE:
          serviceImpl.updateEmailGroupMstrSendsPerMinute((com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EmailGroupSendsPerMinuteRes>) responseObserver);
          break;
        case METHODID_UPDATE_OUTBOUND_EMAIL_GROUP:
          serviceImpl.updateOutboundEmailGroup((com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateOutboundEmailGroupRes>) responseObserver);
          break;
        case METHODID_GET_INBOUND_EMAIL_GROUP_BY_ID:
          serviceImpl.getInboundEmailGroupById((com.tcn.cloud.api.api.v0alpha.InboundEmailGroupByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.InboundEmailGroup>) responseObserver);
          break;
        case METHODID_CREATE_EMAIL_MESSAGE_ATTACHMENT:
          serviceImpl.createEmailMessageAttachment((com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateEmailMessageAttachmentRes>) responseObserver);
          break;
        case METHODID_LIST_EMAIL_MESSAGE_ATTACHMENTS:
          serviceImpl.listEmailMessageAttachments((com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListEmailMessageAttachmentsRes>) responseObserver);
          break;
        case METHODID_UNASSIGN_CURRENT_USER_FROM_EMAIL_CONVERSATION:
          serviceImpl.unassignCurrentUserFromEmailConversation((com.tcn.cloud.api.api.v0alpha.UnassignCurrentUserFromEmailConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UnassignUserFromEmailConversationRes>) responseObserver);
          break;
        case METHODID_DASHBOARD_EMAIL_CONVERSATION_SEARCH:
          serviceImpl.dashboardEmailConversationSearch((com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DashboardEmailConversationSearchRes>) responseObserver);
          break;
        case METHODID_REASSIGN_EMAIL_CONVERSATION:
          serviceImpl.reassignEmailConversation((com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ReassignEmailConversationRes>) responseObserver);
          break;
        case METHODID_ASSIGN_EMAIL_CONVERSATION:
          serviceImpl.assignEmailConversation((com.tcn.cloud.api.api.v0alpha.AssignEmailConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AssignEmailConversationRes>) responseObserver);
          break;
        case METHODID_SUSPEND_EMAIL_CONVERSATION:
          serviceImpl.suspendEmailConversation((com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuspendEmailConversationRes>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGNS_BY_CONNECTED_INBOX_ID:
          serviceImpl.listCampaignsByConnectedInboxId((com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsByConnectedInboxIdRes>) responseObserver);
          break;
        case METHODID_CLOSE_EMAIL_CONVERSATION:
          serviceImpl.closeEmailConversation((com.tcn.cloud.api.api.v0alpha.CloseEmailConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseEmailConversationRes>) responseObserver);
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

  private static abstract class EmailApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmailApi");
    }
  }

  private static final class EmailApiFileDescriptorSupplier
      extends EmailApiBaseDescriptorSupplier {
    EmailApiFileDescriptorSupplier() {}
  }

  private static final class EmailApiMethodDescriptorSupplier
      extends EmailApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmailApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmailApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailApiFileDescriptorSupplier())
              .addMethod(getCreateEmailTemplateMethod())
              .addMethod(getUpdateEmailTemplateMethod())
              .addMethod(getCreateEmailTemplateAttachmentMethod())
              .addMethod(getCopyEmailTemplateWithAttachmentsMethod())
              .addMethod(getUpdateEmailTemplateAttachmentMethod())
              .addMethod(getGetEmailTemplateByTemplateSidMethod())
              .addMethod(getGetAllEmailTemplatesMethod())
              .addMethod(getDeleteEmailTemplateMethod())
              .addMethod(getDeleteEmailTemplateAttachmentByIdMethod())
              .addMethod(getDownloadInboundEmailAttachmentMethod())
              .addMethod(getPureEmailGroupSearchMethod())
              .addMethod(getManagerListNewEmailMessageRepliesMethod())
              .addMethod(getListNewEmailMessageRepliesMethod())
              .addMethod(getGetEmailTasksByGroupSidsMethod())
              .addMethod(getUpdateEmailGroupStatusMethod())
              .addMethod(getGetEmailMessageDetailsMethod())
              .addMethod(getCreateInboundEmailTemplateMethod())
              .addMethod(getUpdateInboundEmailTemplateMethod())
              .addMethod(getDeleteInboundEmailTemplateByIdMethod())
              .addMethod(getListInboundEmailTemplatesMethod())
              .addMethod(getGetInboundEmailTemplateByIdMethod())
              .addMethod(getUpdateInboundEmailGroupStatusMethod())
              .addMethod(getStopInboundEmailGroupMethod())
              .addMethod(getStopAllInboundEmailGroupsMethod())
              .addMethod(getPureInboundEmailGroupSearchMethod())
              .addMethod(getInboundEmailGroupSearchMethod())
              .addMethod(getListInboundEmailGroupsByGroupIdsMethod())
              .addMethod(getListInboundEmailTasksByGroupIdsMethod())
              .addMethod(getListActiveInboundEmailGroupsMethod())
              .addMethod(getScheduleMethod())
              .addMethod(getScheduleOutboundEmailGroupMethod())
              .addMethod(getSchedulePureInboundEmailMethod())
              .addMethod(getCreateEmailMessageAgentReplyMethod())
              .addMethod(getCreateEmailMessageAgentReplyAttachmentMethod())
              .addMethod(getSendReplyMethod())
              .addMethod(getGetEmailGroupsByGroupSidsMethod())
              .addMethod(getGetEmailGroupByGroupSidMethod())
              .addMethod(getGetEmailGroupByGroupIdMethod())
              .addMethod(getSchedulePureOmniLinkInboundEmailMethod())
              .addMethod(getUpdateInboundEmailGroupMethod())
              .addMethod(getUpdateEmailGroupMstrSendsPerMinuteMethod())
              .addMethod(getUpdateOutboundEmailGroupMethod())
              .addMethod(getGetInboundEmailGroupByIdMethod())
              .addMethod(getCreateEmailMessageAttachmentMethod())
              .addMethod(getListEmailMessageAttachmentsMethod())
              .addMethod(getUnassignCurrentUserFromEmailConversationMethod())
              .addMethod(getDashboardEmailConversationSearchMethod())
              .addMethod(getReassignEmailConversationMethod())
              .addMethod(getAssignEmailConversationMethod())
              .addMethod(getSuspendEmailConversationMethod())
              .addMethod(getListCampaignsByConnectedInboxIdMethod())
              .addMethod(getCloseEmailConversationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
