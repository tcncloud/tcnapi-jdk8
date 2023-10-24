package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service for interacting with TCN's Omni API system.
 * Accessing all of the methods require an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v0alpha/omniapi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OmniApiGrpc {

  private OmniApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v0alpha.OmniApi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq,
      com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> getArchiveCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveCampaign",
      requestType = com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq,
      com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> getArchiveCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq, com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> getArchiveCampaignMethod;
    if ((getArchiveCampaignMethod = OmniApiGrpc.getArchiveCampaignMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getArchiveCampaignMethod = OmniApiGrpc.getArchiveCampaignMethod) == null) {
          OmniApiGrpc.getArchiveCampaignMethod = getArchiveCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq, com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ArchiveCampaign"))
              .build();
        }
      }
    }
    return getArchiveCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCampaignReq,
      com.tcn.cloud.api.api.commons.OmniCampaign> getCreateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCampaign",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCampaignReq,
      com.tcn.cloud.api.api.commons.OmniCampaign> getCreateCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCampaignReq, com.tcn.cloud.api.api.commons.OmniCampaign> getCreateCampaignMethod;
    if ((getCreateCampaignMethod = OmniApiGrpc.getCreateCampaignMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateCampaignMethod = OmniApiGrpc.getCreateCampaignMethod) == null) {
          OmniApiGrpc.getCreateCampaignMethod = getCreateCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCampaignReq, com.tcn.cloud.api.api.commons.OmniCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateCampaign"))
              .build();
        }
      }
    }
    return getCreateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq,
      com.tcn.cloud.api.api.commons.OmniCampaign> getGetCampaignByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq,
      com.tcn.cloud.api.api.commons.OmniCampaign> getGetCampaignByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq, com.tcn.cloud.api.api.commons.OmniCampaign> getGetCampaignByIdMethod;
    if ((getGetCampaignByIdMethod = OmniApiGrpc.getGetCampaignByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetCampaignByIdMethod = OmniApiGrpc.getGetCampaignByIdMethod) == null) {
          OmniApiGrpc.getGetCampaignByIdMethod = getGetCampaignByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq, com.tcn.cloud.api.api.commons.OmniCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCampaignById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetCampaignById"))
              .build();
        }
      }
    }
    return getGetCampaignByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PauseCampaignReq,
      com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> getPauseCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseCampaign",
      requestType = com.tcn.cloud.api.api.v0alpha.PauseCampaignReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PauseCampaignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PauseCampaignReq,
      com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> getPauseCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PauseCampaignReq, com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> getPauseCampaignMethod;
    if ((getPauseCampaignMethod = OmniApiGrpc.getPauseCampaignMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getPauseCampaignMethod = OmniApiGrpc.getPauseCampaignMethod) == null) {
          OmniApiGrpc.getPauseCampaignMethod = getPauseCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PauseCampaignReq, com.tcn.cloud.api.api.v0alpha.PauseCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PauseCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PauseCampaignRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("PauseCampaign"))
              .build();
        }
      }
    }
    return getPauseCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq,
      com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> getResumeCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeCampaign",
      requestType = com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq,
      com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> getResumeCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq, com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> getResumeCampaignMethod;
    if ((getResumeCampaignMethod = OmniApiGrpc.getResumeCampaignMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getResumeCampaignMethod = OmniApiGrpc.getResumeCampaignMethod) == null) {
          OmniApiGrpc.getResumeCampaignMethod = getResumeCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq, com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ResumeCampaign"))
              .build();
        }
      }
    }
    return getResumeCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> getUpdateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCampaign",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> getUpdateCampaignMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq, com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> getUpdateCampaignMethod;
    if ((getUpdateCampaignMethod = OmniApiGrpc.getUpdateCampaignMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateCampaignMethod = OmniApiGrpc.getUpdateCampaignMethod) == null) {
          OmniApiGrpc.getUpdateCampaignMethod = getUpdateCampaignMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq, com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateCampaign"))
              .build();
        }
      }
    }
    return getUpdateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> getUpdateCampaignPacingSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCampaignPacingSpeed",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> getUpdateCampaignPacingSpeedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq, com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> getUpdateCampaignPacingSpeedMethod;
    if ((getUpdateCampaignPacingSpeedMethod = OmniApiGrpc.getUpdateCampaignPacingSpeedMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateCampaignPacingSpeedMethod = OmniApiGrpc.getUpdateCampaignPacingSpeedMethod) == null) {
          OmniApiGrpc.getUpdateCampaignPacingSpeedMethod = getUpdateCampaignPacingSpeedMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq, com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCampaignPacingSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateCampaignPacingSpeed"))
              .build();
        }
      }
    }
    return getUpdateCampaignPacingSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
      com.tcn.cloud.api.api.commons.Empty> getSendOmniMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendOmniMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
      com.tcn.cloud.api.api.commons.Empty> getSendOmniMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq, com.tcn.cloud.api.api.commons.Empty> getSendOmniMessageMethod;
    if ((getSendOmniMessageMethod = OmniApiGrpc.getSendOmniMessageMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getSendOmniMessageMethod = OmniApiGrpc.getSendOmniMessageMethod) == null) {
          OmniApiGrpc.getSendOmniMessageMethod = getSendOmniMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendOmniMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("SendOmniMessage"))
              .build();
        }
      }
    }
    return getSendOmniMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
      com.tcn.cloud.api.api.commons.Empty> getManagerSendOmniMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerSendOmniMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
      com.tcn.cloud.api.api.commons.Empty> getManagerSendOmniMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq, com.tcn.cloud.api.api.commons.Empty> getManagerSendOmniMessageMethod;
    if ((getManagerSendOmniMessageMethod = OmniApiGrpc.getManagerSendOmniMessageMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getManagerSendOmniMessageMethod = OmniApiGrpc.getManagerSendOmniMessageMethod) == null) {
          OmniApiGrpc.getManagerSendOmniMessageMethod = getManagerSendOmniMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerSendOmniMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ManagerSendOmniMessage"))
              .build();
        }
      }
    }
    return getManagerSendOmniMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDispositionReq,
      com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> getCreateDispositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDisposition",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateDispositionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateDispositionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDispositionReq,
      com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> getCreateDispositionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDispositionReq, com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> getCreateDispositionMethod;
    if ((getCreateDispositionMethod = OmniApiGrpc.getCreateDispositionMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateDispositionMethod = OmniApiGrpc.getCreateDispositionMethod) == null) {
          OmniApiGrpc.getCreateDispositionMethod = getCreateDispositionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateDispositionReq, com.tcn.cloud.api.api.v0alpha.CreateDispositionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDisposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDispositionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDispositionRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateDisposition"))
              .build();
        }
      }
    }
    return getCreateDispositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteDispositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDisposition",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteDispositionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq, com.tcn.cloud.api.api.commons.Empty> getDeleteDispositionMethod;
    if ((getDeleteDispositionMethod = OmniApiGrpc.getDeleteDispositionMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteDispositionMethod = OmniApiGrpc.getDeleteDispositionMethod) == null) {
          OmniApiGrpc.getDeleteDispositionMethod = getDeleteDispositionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDisposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteDisposition"))
              .build();
        }
      }
    }
    return getDeleteDispositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDispositionsReq,
      com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> getListDispositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDispositions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListDispositionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListDispositionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDispositionsReq,
      com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> getListDispositionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListDispositionsReq, com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> getListDispositionsMethod;
    if ((getListDispositionsMethod = OmniApiGrpc.getListDispositionsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListDispositionsMethod = OmniApiGrpc.getListDispositionsMethod) == null) {
          OmniApiGrpc.getListDispositionsMethod = getListDispositionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListDispositionsReq, com.tcn.cloud.api.api.v0alpha.ListDispositionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDispositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListDispositionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListDispositionsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListDispositions"))
              .build();
        }
      }
    }
    return getListDispositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateDispositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDisposition",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateDispositionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq, com.tcn.cloud.api.api.commons.Empty> getUpdateDispositionMethod;
    if ((getUpdateDispositionMethod = OmniApiGrpc.getUpdateDispositionMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateDispositionMethod = OmniApiGrpc.getUpdateDispositionMethod) == null) {
          OmniApiGrpc.getUpdateDispositionMethod = getUpdateDispositionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDisposition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateDisposition"))
              .build();
        }
      }
    }
    return getUpdateDispositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.Empty,
      com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> getListCustomUnsubscribeLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomUnsubscribeLinks",
      requestType = com.tcn.cloud.api.api.commons.Empty.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.Empty,
      com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> getListCustomUnsubscribeLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.Empty, com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> getListCustomUnsubscribeLinksMethod;
    if ((getListCustomUnsubscribeLinksMethod = OmniApiGrpc.getListCustomUnsubscribeLinksMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListCustomUnsubscribeLinksMethod = OmniApiGrpc.getListCustomUnsubscribeLinksMethod) == null) {
          OmniApiGrpc.getListCustomUnsubscribeLinksMethod = getListCustomUnsubscribeLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.Empty, com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomUnsubscribeLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListCustomUnsubscribeLinks"))
              .build();
        }
      }
    }
    return getListCustomUnsubscribeLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink,
      com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> getCreateCustomUnsubscribeLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomUnsubscribeLink",
      requestType = com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink,
      com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> getCreateCustomUnsubscribeLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink, com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> getCreateCustomUnsubscribeLinkMethod;
    if ((getCreateCustomUnsubscribeLinkMethod = OmniApiGrpc.getCreateCustomUnsubscribeLinkMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateCustomUnsubscribeLinkMethod = OmniApiGrpc.getCreateCustomUnsubscribeLinkMethod) == null) {
          OmniApiGrpc.getCreateCustomUnsubscribeLinkMethod = getCreateCustomUnsubscribeLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink, com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomUnsubscribeLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateCustomUnsubscribeLink"))
              .build();
        }
      }
    }
    return getCreateCustomUnsubscribeLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> getUpdateCustomUnsubscribeLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomUnsubscribeLink",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> getUpdateCustomUnsubscribeLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq, com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> getUpdateCustomUnsubscribeLinkMethod;
    if ((getUpdateCustomUnsubscribeLinkMethod = OmniApiGrpc.getUpdateCustomUnsubscribeLinkMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateCustomUnsubscribeLinkMethod = OmniApiGrpc.getUpdateCustomUnsubscribeLinkMethod) == null) {
          OmniApiGrpc.getUpdateCustomUnsubscribeLinkMethod = getUpdateCustomUnsubscribeLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq, com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCustomUnsubscribeLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateCustomUnsubscribeLink"))
              .build();
        }
      }
    }
    return getUpdateCustomUnsubscribeLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteCustomUnsubscribeLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomUnsubscribeLink",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteCustomUnsubscribeLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq, com.tcn.cloud.api.api.commons.Empty> getDeleteCustomUnsubscribeLinkMethod;
    if ((getDeleteCustomUnsubscribeLinkMethod = OmniApiGrpc.getDeleteCustomUnsubscribeLinkMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteCustomUnsubscribeLinkMethod = OmniApiGrpc.getDeleteCustomUnsubscribeLinkMethod) == null) {
          OmniApiGrpc.getDeleteCustomUnsubscribeLinkMethod = getDeleteCustomUnsubscribeLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomUnsubscribeLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteCustomUnsubscribeLink"))
              .build();
        }
      }
    }
    return getDeleteCustomUnsubscribeLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsReq,
      com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> getListCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaigns",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCampaignsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsReq,
      com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> getListCampaignsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCampaignsReq, com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> getListCampaignsMethod;
    if ((getListCampaignsMethod = OmniApiGrpc.getListCampaignsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListCampaignsMethod = OmniApiGrpc.getListCampaignsMethod) == null) {
          OmniApiGrpc.getListCampaignsMethod = getListCampaignsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCampaignsReq, com.tcn.cloud.api.api.v0alpha.ListCampaignsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCampaignsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListCampaigns"))
              .build();
        }
      }
    }
    return getListCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq,
      com.tcn.cloud.api.api.commons.OmniMessage> getManagerListMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerListMessages",
      requestType = com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq,
      com.tcn.cloud.api.api.commons.OmniMessage> getManagerListMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq, com.tcn.cloud.api.api.commons.OmniMessage> getManagerListMessagesMethod;
    if ((getManagerListMessagesMethod = OmniApiGrpc.getManagerListMessagesMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getManagerListMessagesMethod = OmniApiGrpc.getManagerListMessagesMethod) == null) {
          OmniApiGrpc.getManagerListMessagesMethod = getManagerListMessagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq, com.tcn.cloud.api.api.commons.OmniMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerListMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ManagerListMessages"))
              .build();
        }
      }
    }
    return getManagerListMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMessagesReq,
      com.tcn.cloud.api.api.commons.OmniMessage> getListMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMessages",
      requestType = com.tcn.cloud.api.api.v0alpha.ListMessagesReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMessagesReq,
      com.tcn.cloud.api.api.commons.OmniMessage> getListMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMessagesReq, com.tcn.cloud.api.api.commons.OmniMessage> getListMessagesMethod;
    if ((getListMessagesMethod = OmniApiGrpc.getListMessagesMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListMessagesMethod = OmniApiGrpc.getListMessagesMethod) == null) {
          OmniApiGrpc.getListMessagesMethod = getListMessagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListMessagesReq, com.tcn.cloud.api.api.commons.OmniMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListMessagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListMessages"))
              .build();
        }
      }
    }
    return getListMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConversationsReq,
      com.tcn.cloud.api.api.v0alpha.ListConversationsRes> getManagerListConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerListConversations",
      requestType = com.tcn.cloud.api.api.v0alpha.ListConversationsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListConversationsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConversationsReq,
      com.tcn.cloud.api.api.v0alpha.ListConversationsRes> getManagerListConversationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConversationsReq, com.tcn.cloud.api.api.v0alpha.ListConversationsRes> getManagerListConversationsMethod;
    if ((getManagerListConversationsMethod = OmniApiGrpc.getManagerListConversationsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getManagerListConversationsMethod = OmniApiGrpc.getManagerListConversationsMethod) == null) {
          OmniApiGrpc.getManagerListConversationsMethod = getManagerListConversationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListConversationsReq, com.tcn.cloud.api.api.v0alpha.ListConversationsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerListConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConversationsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ManagerListConversations"))
              .build();
        }
      }
    }
    return getManagerListConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactListsReq,
      com.tcn.cloud.api.api.v0alpha.ListContactListsRes> getListContactListsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactLists",
      requestType = com.tcn.cloud.api.api.v0alpha.ListContactListsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListContactListsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactListsReq,
      com.tcn.cloud.api.api.v0alpha.ListContactListsRes> getListContactListsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactListsReq, com.tcn.cloud.api.api.v0alpha.ListContactListsRes> getListContactListsMethod;
    if ((getListContactListsMethod = OmniApiGrpc.getListContactListsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListContactListsMethod = OmniApiGrpc.getListContactListsMethod) == null) {
          OmniApiGrpc.getListContactListsMethod = getListContactListsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListContactListsReq, com.tcn.cloud.api.api.v0alpha.ListContactListsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContactLists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactListsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactListsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListContactLists"))
              .build();
        }
      }
    }
    return getListContactListsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq,
      com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> getGetAvailableHeadersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableHeaders",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq,
      com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> getGetAvailableHeadersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq, com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> getGetAvailableHeadersMethod;
    if ((getGetAvailableHeadersMethod = OmniApiGrpc.getGetAvailableHeadersMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetAvailableHeadersMethod = OmniApiGrpc.getGetAvailableHeadersMethod) == null) {
          OmniApiGrpc.getGetAvailableHeadersMethod = getGetAvailableHeadersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq, com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableHeaders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetAvailableHeaders"))
              .build();
        }
      }
    }
    return getGetAvailableHeadersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest,
      com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> getApproveTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveTask",
      requestType = com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest,
      com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> getApproveTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest, com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> getApproveTaskMethod;
    if ((getApproveTaskMethod = OmniApiGrpc.getApproveTaskMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getApproveTaskMethod = OmniApiGrpc.getApproveTaskMethod) == null) {
          OmniApiGrpc.getApproveTaskMethod = getApproveTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest, com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ApproveTask"))
              .build();
        }
      }
    }
    return getApproveTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest,
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> getGetNextQueuedTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextQueuedTask",
      requestType = com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest,
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> getGetNextQueuedTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> getGetNextQueuedTaskMethod;
    if ((getGetNextQueuedTaskMethod = OmniApiGrpc.getGetNextQueuedTaskMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetNextQueuedTaskMethod = OmniApiGrpc.getGetNextQueuedTaskMethod) == null) {
          OmniApiGrpc.getGetNextQueuedTaskMethod = getGetNextQueuedTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextQueuedTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetNextQueuedTask"))
              .build();
        }
      }
    }
    return getGetNextQueuedTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTaskReq,
      com.tcn.cloud.api.api.commons.OmniTask> getGetTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTask",
      requestType = com.tcn.cloud.api.api.v0alpha.GetTaskReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniTask.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTaskReq,
      com.tcn.cloud.api.api.commons.OmniTask> getGetTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetTaskReq, com.tcn.cloud.api.api.commons.OmniTask> getGetTaskMethod;
    if ((getGetTaskMethod = OmniApiGrpc.getGetTaskMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetTaskMethod = OmniApiGrpc.getGetTaskMethod) == null) {
          OmniApiGrpc.getGetTaskMethod = getGetTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetTaskReq, com.tcn.cloud.api.api.commons.OmniTask>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetTaskReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniTask.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetTask"))
              .build();
        }
      }
    }
    return getGetTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTasksReq,
      com.tcn.cloud.api.api.v0alpha.ListTasksRes> getListTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTasks",
      requestType = com.tcn.cloud.api.api.v0alpha.ListTasksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListTasksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTasksReq,
      com.tcn.cloud.api.api.v0alpha.ListTasksRes> getListTasksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTasksReq, com.tcn.cloud.api.api.v0alpha.ListTasksRes> getListTasksMethod;
    if ((getListTasksMethod = OmniApiGrpc.getListTasksMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListTasksMethod = OmniApiGrpc.getListTasksMethod) == null) {
          OmniApiGrpc.getListTasksMethod = getListTasksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListTasksReq, com.tcn.cloud.api.api.v0alpha.ListTasksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTasksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTasksRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListTasks"))
              .build();
        }
      }
    }
    return getListTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RejectTaskRequest,
      com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> getRejectTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectTask",
      requestType = com.tcn.cloud.api.api.v0alpha.RejectTaskRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RejectTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RejectTaskRequest,
      com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> getRejectTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RejectTaskRequest, com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> getRejectTaskMethod;
    if ((getRejectTaskMethod = OmniApiGrpc.getRejectTaskMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getRejectTaskMethod = OmniApiGrpc.getRejectTaskMethod) == null) {
          OmniApiGrpc.getRejectTaskMethod = getRejectTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RejectTaskRequest, com.tcn.cloud.api.api.v0alpha.RejectTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RejectTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RejectTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("RejectTask"))
              .build();
        }
      }
    }
    return getRejectTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest,
      com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> getRequeueTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequeueTask",
      requestType = com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest,
      com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> getRequeueTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest, com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> getRequeueTaskMethod;
    if ((getRequeueTaskMethod = OmniApiGrpc.getRequeueTaskMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getRequeueTaskMethod = OmniApiGrpc.getRequeueTaskMethod) == null) {
          OmniApiGrpc.getRequeueTaskMethod = getRequeueTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest, com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequeueTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("RequeueTask"))
              .build();
        }
      }
    }
    return getRequeueTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox,
      com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> getCreateConnectedInboxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateConnectedInbox",
      requestType = com.tcn.cloud.api.api.commons.ConnectedInbox.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox,
      com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> getCreateConnectedInboxMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox, com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> getCreateConnectedInboxMethod;
    if ((getCreateConnectedInboxMethod = OmniApiGrpc.getCreateConnectedInboxMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateConnectedInboxMethod = OmniApiGrpc.getCreateConnectedInboxMethod) == null) {
          OmniApiGrpc.getCreateConnectedInboxMethod = getCreateConnectedInboxMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.ConnectedInbox, com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateConnectedInbox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.ConnectedInbox.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateConnectedInbox"))
              .build();
        }
      }
    }
    return getCreateConnectedInboxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteConnectedInboxBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteConnectedInboxBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteConnectedInboxBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq, com.tcn.cloud.api.api.commons.Empty> getDeleteConnectedInboxBySidMethod;
    if ((getDeleteConnectedInboxBySidMethod = OmniApiGrpc.getDeleteConnectedInboxBySidMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteConnectedInboxBySidMethod = OmniApiGrpc.getDeleteConnectedInboxBySidMethod) == null) {
          OmniApiGrpc.getDeleteConnectedInboxBySidMethod = getDeleteConnectedInboxBySidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteConnectedInboxBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteConnectedInboxBySid"))
              .build();
        }
      }
    }
    return getDeleteConnectedInboxBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq,
      com.tcn.cloud.api.api.commons.ConnectedInbox> getGetConnectedInboxBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConnectedInboxBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq.class,
      responseType = com.tcn.cloud.api.api.commons.ConnectedInbox.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq,
      com.tcn.cloud.api.api.commons.ConnectedInbox> getGetConnectedInboxBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq, com.tcn.cloud.api.api.commons.ConnectedInbox> getGetConnectedInboxBySidMethod;
    if ((getGetConnectedInboxBySidMethod = OmniApiGrpc.getGetConnectedInboxBySidMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetConnectedInboxBySidMethod = OmniApiGrpc.getGetConnectedInboxBySidMethod) == null) {
          OmniApiGrpc.getGetConnectedInboxBySidMethod = getGetConnectedInboxBySidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq, com.tcn.cloud.api.api.commons.ConnectedInbox>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConnectedInboxBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.ConnectedInbox.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetConnectedInboxBySid"))
              .build();
        }
      }
    }
    return getGetConnectedInboxBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq,
      com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> getPerformSendgridAccountChecksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PerformSendgridAccountChecks",
      requestType = com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq,
      com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> getPerformSendgridAccountChecksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq, com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> getPerformSendgridAccountChecksMethod;
    if ((getPerformSendgridAccountChecksMethod = OmniApiGrpc.getPerformSendgridAccountChecksMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getPerformSendgridAccountChecksMethod = OmniApiGrpc.getPerformSendgridAccountChecksMethod) == null) {
          OmniApiGrpc.getPerformSendgridAccountChecksMethod = getPerformSendgridAccountChecksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq, com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PerformSendgridAccountChecks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("PerformSendgridAccountChecks"))
              .build();
        }
      }
    }
    return getPerformSendgridAccountChecksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq,
      com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> getListConnectedInboxesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConnectedInboxes",
      requestType = com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq,
      com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> getListConnectedInboxesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq, com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> getListConnectedInboxesMethod;
    if ((getListConnectedInboxesMethod = OmniApiGrpc.getListConnectedInboxesMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListConnectedInboxesMethod = OmniApiGrpc.getListConnectedInboxesMethod) == null) {
          OmniApiGrpc.getListConnectedInboxesMethod = getListConnectedInboxesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq, com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConnectedInboxes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListConnectedInboxes"))
              .build();
        }
      }
    }
    return getListConnectedInboxesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox,
      com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> getTestConnectedInboxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestConnectedInbox",
      requestType = com.tcn.cloud.api.api.commons.ConnectedInbox.class,
      responseType = com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox,
      com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> getTestConnectedInboxMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.ConnectedInbox, com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> getTestConnectedInboxMethod;
    if ((getTestConnectedInboxMethod = OmniApiGrpc.getTestConnectedInboxMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getTestConnectedInboxMethod = OmniApiGrpc.getTestConnectedInboxMethod) == null) {
          OmniApiGrpc.getTestConnectedInboxMethod = getTestConnectedInboxMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.ConnectedInbox, com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestConnectedInbox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.ConnectedInbox.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("TestConnectedInbox"))
              .build();
        }
      }
    }
    return getTestConnectedInboxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateConnectedInboxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateConnectedInbox",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateConnectedInboxMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq, com.tcn.cloud.api.api.commons.Empty> getUpdateConnectedInboxMethod;
    if ((getUpdateConnectedInboxMethod = OmniApiGrpc.getUpdateConnectedInboxMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateConnectedInboxMethod = OmniApiGrpc.getUpdateConnectedInboxMethod) == null) {
          OmniApiGrpc.getUpdateConnectedInboxMethod = getUpdateConnectedInboxMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateConnectedInbox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateConnectedInbox"))
              .build();
        }
      }
    }
    return getUpdateConnectedInboxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.VerifiedEmail,
      com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> getCreateVerifiedEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVerifiedEmail",
      requestType = com.tcn.cloud.api.api.commons.VerifiedEmail.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.VerifiedEmail,
      com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> getCreateVerifiedEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.VerifiedEmail, com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> getCreateVerifiedEmailMethod;
    if ((getCreateVerifiedEmailMethod = OmniApiGrpc.getCreateVerifiedEmailMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateVerifiedEmailMethod = OmniApiGrpc.getCreateVerifiedEmailMethod) == null) {
          OmniApiGrpc.getCreateVerifiedEmailMethod = getCreateVerifiedEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.VerifiedEmail, com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVerifiedEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.VerifiedEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateVerifiedEmail"))
              .build();
        }
      }
    }
    return getCreateVerifiedEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteVerifiedEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVerifiedEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq,
      com.tcn.cloud.api.api.commons.Empty> getDeleteVerifiedEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq, com.tcn.cloud.api.api.commons.Empty> getDeleteVerifiedEmailMethod;
    if ((getDeleteVerifiedEmailMethod = OmniApiGrpc.getDeleteVerifiedEmailMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteVerifiedEmailMethod = OmniApiGrpc.getDeleteVerifiedEmailMethod) == null) {
          OmniApiGrpc.getDeleteVerifiedEmailMethod = getDeleteVerifiedEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVerifiedEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteVerifiedEmail"))
              .build();
        }
      }
    }
    return getDeleteVerifiedEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq,
      com.tcn.cloud.api.api.commons.VerifiedEmail> getGetVerifiedEmailBySidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVerifiedEmailBySid",
      requestType = com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq.class,
      responseType = com.tcn.cloud.api.api.commons.VerifiedEmail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq,
      com.tcn.cloud.api.api.commons.VerifiedEmail> getGetVerifiedEmailBySidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq, com.tcn.cloud.api.api.commons.VerifiedEmail> getGetVerifiedEmailBySidMethod;
    if ((getGetVerifiedEmailBySidMethod = OmniApiGrpc.getGetVerifiedEmailBySidMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetVerifiedEmailBySidMethod = OmniApiGrpc.getGetVerifiedEmailBySidMethod) == null) {
          OmniApiGrpc.getGetVerifiedEmailBySidMethod = getGetVerifiedEmailBySidMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq, com.tcn.cloud.api.api.commons.VerifiedEmail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVerifiedEmailBySid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.VerifiedEmail.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetVerifiedEmailBySid"))
              .build();
        }
      }
    }
    return getGetVerifiedEmailBySidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq,
      com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> getListVerifiedEmailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVerifiedEmails",
      requestType = com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq,
      com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> getListVerifiedEmailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq, com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> getListVerifiedEmailsMethod;
    if ((getListVerifiedEmailsMethod = OmniApiGrpc.getListVerifiedEmailsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListVerifiedEmailsMethod = OmniApiGrpc.getListVerifiedEmailsMethod) == null) {
          OmniApiGrpc.getListVerifiedEmailsMethod = getListVerifiedEmailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq, com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVerifiedEmails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListVerifiedEmails"))
              .build();
        }
      }
    }
    return getListVerifiedEmailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq,
      com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> getResendVerifiedEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendVerifiedEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq,
      com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> getResendVerifiedEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq, com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> getResendVerifiedEmailMethod;
    if ((getResendVerifiedEmailMethod = OmniApiGrpc.getResendVerifiedEmailMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getResendVerifiedEmailMethod = OmniApiGrpc.getResendVerifiedEmailMethod) == null) {
          OmniApiGrpc.getResendVerifiedEmailMethod = getResendVerifiedEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq, com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendVerifiedEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ResendVerifiedEmail"))
              .build();
        }
      }
    }
    return getResendVerifiedEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateVerifiedEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVerifiedEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq.class,
      responseType = com.tcn.cloud.api.api.commons.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq,
      com.tcn.cloud.api.api.commons.Empty> getUpdateVerifiedEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq, com.tcn.cloud.api.api.commons.Empty> getUpdateVerifiedEmailMethod;
    if ((getUpdateVerifiedEmailMethod = OmniApiGrpc.getUpdateVerifiedEmailMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateVerifiedEmailMethod = OmniApiGrpc.getUpdateVerifiedEmailMethod) == null) {
          OmniApiGrpc.getUpdateVerifiedEmailMethod = getUpdateVerifiedEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq, com.tcn.cloud.api.api.commons.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVerifiedEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateVerifiedEmail"))
              .build();
        }
      }
    }
    return getUpdateVerifiedEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq,
      com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> getGetPendingGoogleXOAuth2DataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPendingGoogleXOAuth2Data",
      requestType = com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq,
      com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> getGetPendingGoogleXOAuth2DataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq, com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> getGetPendingGoogleXOAuth2DataMethod;
    if ((getGetPendingGoogleXOAuth2DataMethod = OmniApiGrpc.getGetPendingGoogleXOAuth2DataMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetPendingGoogleXOAuth2DataMethod = OmniApiGrpc.getGetPendingGoogleXOAuth2DataMethod) == null) {
          OmniApiGrpc.getGetPendingGoogleXOAuth2DataMethod = getGetPendingGoogleXOAuth2DataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq, com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPendingGoogleXOAuth2Data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetPendingGoogleXOAuth2Data"))
              .build();
        }
      }
    }
    return getGetPendingGoogleXOAuth2DataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq,
      com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> getSendEmailNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmailNotification",
      requestType = com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq,
      com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> getSendEmailNotificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq, com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> getSendEmailNotificationMethod;
    if ((getSendEmailNotificationMethod = OmniApiGrpc.getSendEmailNotificationMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getSendEmailNotificationMethod = OmniApiGrpc.getSendEmailNotificationMethod) == null) {
          OmniApiGrpc.getSendEmailNotificationMethod = getSendEmailNotificationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq, com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("SendEmailNotification"))
              .build();
        }
      }
    }
    return getSendEmailNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq,
      com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> getSendFeedbackEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendFeedbackEmail",
      requestType = com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq,
      com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> getSendFeedbackEmailMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq, com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> getSendFeedbackEmailMethod;
    if ((getSendFeedbackEmailMethod = OmniApiGrpc.getSendFeedbackEmailMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getSendFeedbackEmailMethod = OmniApiGrpc.getSendFeedbackEmailMethod) == null) {
          OmniApiGrpc.getSendFeedbackEmailMethod = getSendFeedbackEmailMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq, com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendFeedbackEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("SendFeedbackEmail"))
              .build();
        }
      }
    }
    return getSendFeedbackEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq,
      com.tcn.cloud.api.api.commons.OmniAttachment> getGetOmniAttachmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOmniAttachment",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq.class,
      responseType = com.tcn.cloud.api.api.commons.OmniAttachment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq,
      com.tcn.cloud.api.api.commons.OmniAttachment> getGetOmniAttachmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq, com.tcn.cloud.api.api.commons.OmniAttachment> getGetOmniAttachmentMethod;
    if ((getGetOmniAttachmentMethod = OmniApiGrpc.getGetOmniAttachmentMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetOmniAttachmentMethod = OmniApiGrpc.getGetOmniAttachmentMethod) == null) {
          OmniApiGrpc.getGetOmniAttachmentMethod = getGetOmniAttachmentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq, com.tcn.cloud.api.api.commons.OmniAttachment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOmniAttachment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.OmniAttachment.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetOmniAttachment"))
              .build();
        }
      }
    }
    return getGetOmniAttachmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTasksReq,
      com.tcn.cloud.api.api.v0alpha.CreateTasksRes> getCreateTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTasks",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateTasksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateTasksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTasksReq,
      com.tcn.cloud.api.api.v0alpha.CreateTasksRes> getCreateTasksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTasksReq, com.tcn.cloud.api.api.v0alpha.CreateTasksRes> getCreateTasksMethod;
    if ((getCreateTasksMethod = OmniApiGrpc.getCreateTasksMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateTasksMethod = OmniApiGrpc.getCreateTasksMethod) == null) {
          OmniApiGrpc.getCreateTasksMethod = getCreateTasksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateTasksReq, com.tcn.cloud.api.api.v0alpha.CreateTasksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateTasksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateTasksRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateTasks"))
              .build();
        }
      }
    }
    return getCreateTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSignatureReq,
      com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> getCreateSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSignature",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateSignatureReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSignatureReq,
      com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> getCreateSignatureMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateSignatureReq, com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> getCreateSignatureMethod;
    if ((getCreateSignatureMethod = OmniApiGrpc.getCreateSignatureMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateSignatureMethod = OmniApiGrpc.getCreateSignatureMethod) == null) {
          OmniApiGrpc.getCreateSignatureMethod = getCreateSignatureMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateSignatureReq, com.tcn.cloud.api.api.v0alpha.CreateSignatureRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSignatureReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateSignatureRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateSignature"))
              .build();
        }
      }
    }
    return getCreateSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> getDeleteSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSignature",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq,
      com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> getDeleteSignatureMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq, com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> getDeleteSignatureMethod;
    if ((getDeleteSignatureMethod = OmniApiGrpc.getDeleteSignatureMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteSignatureMethod = OmniApiGrpc.getDeleteSignatureMethod) == null) {
          OmniApiGrpc.getDeleteSignatureMethod = getDeleteSignatureMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq, com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteSignature"))
              .build();
        }
      }
    }
    return getDeleteSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSignaturesReq,
      com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> getListSignaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSignatures",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSignaturesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSignaturesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSignaturesReq,
      com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> getListSignaturesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSignaturesReq, com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> getListSignaturesMethod;
    if ((getListSignaturesMethod = OmniApiGrpc.getListSignaturesMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListSignaturesMethod = OmniApiGrpc.getListSignaturesMethod) == null) {
          OmniApiGrpc.getListSignaturesMethod = getListSignaturesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSignaturesReq, com.tcn.cloud.api.api.v0alpha.ListSignaturesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSignatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSignaturesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSignaturesRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListSignatures"))
              .build();
        }
      }
    }
    return getListSignaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> getUpdateSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSignature",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq,
      com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> getUpdateSignatureMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq, com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> getUpdateSignatureMethod;
    if ((getUpdateSignatureMethod = OmniApiGrpc.getUpdateSignatureMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateSignatureMethod = OmniApiGrpc.getUpdateSignatureMethod) == null) {
          OmniApiGrpc.getUpdateSignatureMethod = getUpdateSignatureMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq, com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateSignature"))
              .build();
        }
      }
    }
    return getUpdateSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuggestResponseReq,
      com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> getSuggestResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestResponse",
      requestType = com.tcn.cloud.api.api.v0alpha.SuggestResponseReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SuggestResponseRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuggestResponseReq,
      com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> getSuggestResponseMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SuggestResponseReq, com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> getSuggestResponseMethod;
    if ((getSuggestResponseMethod = OmniApiGrpc.getSuggestResponseMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getSuggestResponseMethod = OmniApiGrpc.getSuggestResponseMethod) == null) {
          OmniApiGrpc.getSuggestResponseMethod = getSuggestResponseMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SuggestResponseReq, com.tcn.cloud.api.api.v0alpha.SuggestResponseRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuggestResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SuggestResponseReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SuggestResponseRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("SuggestResponse"))
              .build();
        }
      }
    }
    return getSuggestResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateProjectReq,
      com.tcn.cloud.api.api.v0alpha.CreateProjectRes> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProject",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateProjectReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateProjectRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateProjectReq,
      com.tcn.cloud.api.api.v0alpha.CreateProjectRes> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateProjectReq, com.tcn.cloud.api.api.v0alpha.CreateProjectRes> getCreateProjectMethod;
    if ((getCreateProjectMethod = OmniApiGrpc.getCreateProjectMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateProjectMethod = OmniApiGrpc.getCreateProjectMethod) == null) {
          OmniApiGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateProjectReq, com.tcn.cloud.api.api.v0alpha.CreateProjectRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateProjectRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProjectsReq,
      com.tcn.cloud.api.api.v0alpha.ListProjectsRes> getListProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListProjects",
      requestType = com.tcn.cloud.api.api.v0alpha.ListProjectsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListProjectsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProjectsReq,
      com.tcn.cloud.api.api.v0alpha.ListProjectsRes> getListProjectsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListProjectsReq, com.tcn.cloud.api.api.v0alpha.ListProjectsRes> getListProjectsMethod;
    if ((getListProjectsMethod = OmniApiGrpc.getListProjectsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListProjectsMethod = OmniApiGrpc.getListProjectsMethod) == null) {
          OmniApiGrpc.getListProjectsMethod = getListProjectsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListProjectsReq, com.tcn.cloud.api.api.v0alpha.ListProjectsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListProjectsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListProjectsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListProjects"))
              .build();
        }
      }
    }
    return getListProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> getEditProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditProjectById",
      requestType = com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> getEditProjectByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq, com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> getEditProjectByIdMethod;
    if ((getEditProjectByIdMethod = OmniApiGrpc.getEditProjectByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getEditProjectByIdMethod = OmniApiGrpc.getEditProjectByIdMethod) == null) {
          OmniApiGrpc.getEditProjectByIdMethod = getEditProjectByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq, com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("EditProjectById"))
              .build();
        }
      }
    }
    return getEditProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> getCloseProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseProjectById",
      requestType = com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> getCloseProjectByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq, com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> getCloseProjectByIdMethod;
    if ((getCloseProjectByIdMethod = OmniApiGrpc.getCloseProjectByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCloseProjectByIdMethod = OmniApiGrpc.getCloseProjectByIdMethod) == null) {
          OmniApiGrpc.getCloseProjectByIdMethod = getCloseProjectByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq, com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CloseProjectById"))
              .build();
        }
      }
    }
    return getCloseProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.Project> getGetProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjectById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq,
      com.tcn.cloud.api.api.v0alpha.Project> getGetProjectByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq, com.tcn.cloud.api.api.v0alpha.Project> getGetProjectByIdMethod;
    if ((getGetProjectByIdMethod = OmniApiGrpc.getGetProjectByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetProjectByIdMethod = OmniApiGrpc.getGetProjectByIdMethod) == null) {
          OmniApiGrpc.getGetProjectByIdMethod = getGetProjectByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq, com.tcn.cloud.api.api.v0alpha.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Project.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetProjectById"))
              .build();
        }
      }
    }
    return getGetProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessage> getCreateCannedMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCannedMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CannedMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessage> getCreateCannedMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq, com.tcn.cloud.api.api.v0alpha.CannedMessage> getCreateCannedMessageMethod;
    if ((getCreateCannedMessageMethod = OmniApiGrpc.getCreateCannedMessageMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateCannedMessageMethod = OmniApiGrpc.getCreateCannedMessageMethod) == null) {
          OmniApiGrpc.getCreateCannedMessageMethod = getCreateCannedMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq, com.tcn.cloud.api.api.v0alpha.CannedMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCannedMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CannedMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateCannedMessage"))
              .build();
        }
      }
    }
    return getCreateCannedMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> getListCannedMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCannedMessages",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> getListCannedMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> getListCannedMessagesMethod;
    if ((getListCannedMessagesMethod = OmniApiGrpc.getListCannedMessagesMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListCannedMessagesMethod = OmniApiGrpc.getListCannedMessagesMethod) == null) {
          OmniApiGrpc.getListCannedMessagesMethod = getListCannedMessagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCannedMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListCannedMessages"))
              .build();
        }
      }
    }
    return getListCannedMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessage> getUpdateCannedMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCannedMessage",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CannedMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessage> getUpdateCannedMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq, com.tcn.cloud.api.api.v0alpha.CannedMessage> getUpdateCannedMessageMethod;
    if ((getUpdateCannedMessageMethod = OmniApiGrpc.getUpdateCannedMessageMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateCannedMessageMethod = OmniApiGrpc.getUpdateCannedMessageMethod) == null) {
          OmniApiGrpc.getUpdateCannedMessageMethod = getUpdateCannedMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq, com.tcn.cloud.api.api.v0alpha.CannedMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCannedMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CannedMessage.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateCannedMessage"))
              .build();
        }
      }
    }
    return getUpdateCannedMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getGetCannedMessageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCannedMessageById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getGetCannedMessageByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getGetCannedMessageByIdMethod;
    if ((getGetCannedMessageByIdMethod = OmniApiGrpc.getGetCannedMessageByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetCannedMessageByIdMethod = OmniApiGrpc.getGetCannedMessageByIdMethod) == null) {
          OmniApiGrpc.getGetCannedMessageByIdMethod = getGetCannedMessageByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCannedMessageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetCannedMessageById"))
              .build();
        }
      }
    }
    return getGetCannedMessageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> getDeleteCannedMessageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCannedMessageById",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> getDeleteCannedMessageByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> getDeleteCannedMessageByIdMethod;
    if ((getDeleteCannedMessageByIdMethod = OmniApiGrpc.getDeleteCannedMessageByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteCannedMessageByIdMethod = OmniApiGrpc.getDeleteCannedMessageByIdMethod) == null) {
          OmniApiGrpc.getDeleteCannedMessageByIdMethod = getDeleteCannedMessageByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq, com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCannedMessageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteCannedMessageById"))
              .build();
        }
      }
    }
    return getDeleteCannedMessageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getCreateCannedMessageGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCannedMessageGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CannedMessageGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getCreateCannedMessageGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getCreateCannedMessageGroupMethod;
    if ((getCreateCannedMessageGroupMethod = OmniApiGrpc.getCreateCannedMessageGroupMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getCreateCannedMessageGroupMethod = OmniApiGrpc.getCreateCannedMessageGroupMethod) == null) {
          OmniApiGrpc.getCreateCannedMessageGroupMethod = getCreateCannedMessageGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCannedMessageGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CannedMessageGroup.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("CreateCannedMessageGroup"))
              .build();
        }
      }
    }
    return getCreateCannedMessageGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> getListCannedMessageGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCannedMessageGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> getListCannedMessageGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> getListCannedMessageGroupsMethod;
    if ((getListCannedMessageGroupsMethod = OmniApiGrpc.getListCannedMessageGroupsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListCannedMessageGroupsMethod = OmniApiGrpc.getListCannedMessageGroupsMethod) == null) {
          OmniApiGrpc.getListCannedMessageGroupsMethod = getListCannedMessageGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCannedMessageGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListCannedMessageGroups"))
              .build();
        }
      }
    }
    return getListCannedMessageGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> getUpdateCannedMessageGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCannedMessageGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> getUpdateCannedMessageGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> getUpdateCannedMessageGroupMethod;
    if ((getUpdateCannedMessageGroupMethod = OmniApiGrpc.getUpdateCannedMessageGroupMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getUpdateCannedMessageGroupMethod = OmniApiGrpc.getUpdateCannedMessageGroupMethod) == null) {
          OmniApiGrpc.getUpdateCannedMessageGroupMethod = getUpdateCannedMessageGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCannedMessageGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("UpdateCannedMessageGroup"))
              .build();
        }
      }
    }
    return getUpdateCannedMessageGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> getDeleteCannedMessageGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCannedMessageGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> getDeleteCannedMessageGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> getDeleteCannedMessageGroupMethod;
    if ((getDeleteCannedMessageGroupMethod = OmniApiGrpc.getDeleteCannedMessageGroupMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getDeleteCannedMessageGroupMethod = OmniApiGrpc.getDeleteCannedMessageGroupMethod) == null) {
          OmniApiGrpc.getDeleteCannedMessageGroupMethod = getDeleteCannedMessageGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq, com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCannedMessageGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("DeleteCannedMessageGroup"))
              .build();
        }
      }
    }
    return getDeleteCannedMessageGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> getListCannedMessagesByGroupIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCannedMessagesByGroupId",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq,
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> getListCannedMessagesByGroupIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> getListCannedMessagesByGroupIdMethod;
    if ((getListCannedMessagesByGroupIdMethod = OmniApiGrpc.getListCannedMessagesByGroupIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListCannedMessagesByGroupIdMethod = OmniApiGrpc.getListCannedMessagesByGroupIdMethod) == null) {
          OmniApiGrpc.getListCannedMessagesByGroupIdMethod = getListCannedMessagesByGroupIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCannedMessagesByGroupId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListCannedMessagesByGroupId"))
              .build();
        }
      }
    }
    return getListCannedMessagesByGroupIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getGetCannedMessageGroupByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCannedMessageGroupById",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CannedMessageGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq,
      com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getGetCannedMessageGroupByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq, com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getGetCannedMessageGroupByIdMethod;
    if ((getGetCannedMessageGroupByIdMethod = OmniApiGrpc.getGetCannedMessageGroupByIdMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getGetCannedMessageGroupByIdMethod = OmniApiGrpc.getGetCannedMessageGroupByIdMethod) == null) {
          OmniApiGrpc.getGetCannedMessageGroupByIdMethod = getGetCannedMessageGroupByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq, com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCannedMessageGroupById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CannedMessageGroup.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("GetCannedMessageGroupById"))
              .build();
        }
      }
    }
    return getGetCannedMessageGroupByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> getListUserSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> getListUserSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq, com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> getListUserSkillsMethod;
    if ((getListUserSkillsMethod = OmniApiGrpc.getListUserSkillsMethod) == null) {
      synchronized (OmniApiGrpc.class) {
        if ((getListUserSkillsMethod = OmniApiGrpc.getListUserSkillsMethod) == null) {
          OmniApiGrpc.getListUserSkillsMethod = getListUserSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq, com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes.getDefaultInstance()))
              .setSchemaDescriptor(new OmniApiMethodDescriptorSupplier("ListUserSkills"))
              .build();
        }
      }
    }
    return getListUserSkillsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OmniApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmniApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmniApiStub>() {
        @java.lang.Override
        public OmniApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmniApiStub(channel, callOptions);
        }
      };
    return OmniApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OmniApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmniApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmniApiBlockingStub>() {
        @java.lang.Override
        public OmniApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmniApiBlockingStub(channel, callOptions);
        }
      };
    return OmniApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OmniApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OmniApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OmniApiFutureStub>() {
        @java.lang.Override
        public OmniApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OmniApiFutureStub(channel, callOptions);
        }
      };
    return OmniApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    default void archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create Omni Campaign defined by CreateOmniCampaign message
     * for the name, skill, Hours of operations, and description.
     * the method will return newly created OmniCampaign for this client
     * Required Permission:
     *      OMNI_BOSS
     * </pre>
     */
    default void createCampaign(com.tcn.cloud.api.api.v0alpha.CreateCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    default void getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCampaignByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    default void pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    default void resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a campaign
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void updateCampaign(com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    default void updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCampaignPacingSpeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    default void sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendOmniMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    default void managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerSendOmniMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    default void createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    default void deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    default void listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDispositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    default void updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    default void listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCustomUnsubscribeLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    default void createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomUnsubscribeLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    default void updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCustomUnsubscribeLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    default void deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCustomUnsubscribeLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * List campaigns defined by ListCampaignsReq.
     * The method will return a ListCampaignsReq entity that will contain
     * all the campaigns within the specified filter.
     * </pre>
     */
    default void listCampaigns(com.tcn.cloud.api.api.v0alpha.ListCampaignsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a stream of new conversation message for a given conversation. Used
     * only for managers. It is not for customers.
     * </pre>
     */
    default void managerListMessages(com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerListMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a stream of conversation message for a given conversation. Used
     * only for agents/users. It is not for customers.
     * </pre>
     */
    default void listMessages(com.tcn.cloud.api.api.v0alpha.ListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * lists all conversation and assigned users for a given date range.
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void managerListConversations(com.tcn.cloud.api.api.v0alpha.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConversationsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerListConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    default void listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactListsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAvailableHeaders - retrieves all the available headers that could be present on a contact list
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void getAvailableHeaders(com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableHeadersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ApproveTask approves a task.
     * </pre>
     */
    default void approveTask(com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetNextQueuedTask retrieves the next queued task for the agent.
     * </pre>
     */
    default void getNextQueuedTask(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextQueuedTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTask - retrieves a task using the provided criteria
     * Required permissions:
     *    OMNI_AGENT
     * </pre>
     */
    default void getTask(com.tcn.cloud.api.api.v0alpha.GetTaskReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniTask> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListTasks - retrieves tasks using the provided criteria
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void listTasks(com.tcn.cloud.api.api.v0alpha.ListTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTasksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * RejectTask rejects a task.
     * </pre>
     */
    default void rejectTask(com.tcn.cloud.api.api.v0alpha.RejectTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequeueTask requeues a task.
     * </pre>
     */
    default void requeueTask(com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequeueTaskMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateConnectedInbox - create a new connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void createConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateConnectedInboxMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteConnectedInboxBySid - deletes a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void deleteConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteConnectedInboxBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetConnectedInboxBySid - retrieves a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void getConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.ConnectedInbox> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConnectedInboxBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     *Perform sendgrid account check to make sure all the account settings are valid defined by SendgridAccountByClientReq message.
     * The method will return a SendgridAccountByClientRes message/entity that will
     * contain the result true/false verifying account settings with sendgrid for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void performSendgridAccountChecks(com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPerformSendgridAccountChecksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListConnectedInboxes - retrieves all the connected inboxes for the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void listConnectedInboxes(com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConnectedInboxesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TestConnectedInbox - check if connected inbox login works for a specified email_address,
     * username, password, server_name, and server_port (other fields from ConnectedInbox are ignored).
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void testConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestConnectedInboxMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateConnectedInbox - update a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void updateConnectedInbox(com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateConnectedInboxMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateVerifiedEmail.  this will create a new verified email
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    default void createVerifiedEmail(com.tcn.cloud.api.api.commons.VerifiedEmail request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVerifiedEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete verify email record based on verified email id defined by
     * DeleteVerifiedEmailReq for the specified client.
     * This method will return a DeleteVerifiedEmailRes message/entity.
     * DeleteVerifiedEmail - deletes a verified email record using the given identifier
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    default void deleteVerifiedEmail(com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVerifiedEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the verified email details based on verified email id defined by
     * GetVerifiedEmailByIdReq for the specified client.
     * This method will return an OmniVerifiedEmail message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    default void getVerifiedEmailBySid(com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.VerifiedEmail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerifiedEmailBySidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all the verified emails and their details defined by
     * ListVerifiedEmailsReq for the specified client.
     * This method will return a ListVerifiedEmailsRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    default void listVerifiedEmails(com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVerifiedEmailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resend verify email record based on verified email id defined by
     * ResendVerifiedEmailReq for the specified client.
     * This method will return a ResendVerifiedEmailRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    default void resendVerifiedEmail(com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendVerifiedEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    default void updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVerifiedEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetPendingGoogleXOAuth2Data - retrieves the pending oauth data required to finish creating a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void getPendingGoogleXOAuth2Data(com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPendingGoogleXOAuth2DataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send email notification defined by SendEmailNotificationReq message for the specified
     * subject, message and array of to email addresses.
     * The method will return a stream of SendEmailNotificationRes messages
     * containing result true/false after notified by email for the client_sid.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void sendEmailNotification(com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    default void sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendFeedbackEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOmniAttachment - retrieves the omni attachment details based on the request
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void getOmniAttachment(com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniAttachment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOmniAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    default void createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTasksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSignature - creates a new message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void createSignature(com.tcn.cloud.api.api.v0alpha.CreateSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSignature - deletes a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void deleteSignature(com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSignatures - retrieves the signatures created by the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void listSignatures(com.tcn.cloud.api.api.v0alpha.ListSignaturesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSignaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSignature - updates a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    default void updateSignature(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    default void suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuggestResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record project defined by CreateProjectReq message for a specified
     * name, description and status.
     * The method will return a Project message/entity that will
     * contain the newly created project_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void createProject(com.tcn.cloud.api.api.v0alpha.CreateProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateProjectRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * list projects for the current org
     * The method will return a list of Project messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void listProjects(com.tcn.cloud.api.api.v0alpha.ListProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProjectsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update project defined by EditProjectByIdReq message for a specified
     * project id.
     * The method will return a Project message/entity that will
     * contain the updated details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void editProjectById(com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditProjectByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes project defined by CloseProjectByIdReq message for a specified
     * project id.
     * The method will stop all child campaigns and return a an empty response
     * if successful
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void closeProjectById(com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseProjectByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get project details defined by GetProjectByIdReq message for a specified
     * project id.
     * The method will return a GetProjectByIdRes message/entity that will
     * contain all the project details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void getProjectById(com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record canned message defined by CreateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the newly created canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void createCannedMessage(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCannedMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * list canned messages for the current org
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void listCannedMessages(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCannedMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update canned message defined by UpdateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the updated canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void updateCannedMessage(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCannedMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get canned message details for the canned_message_id
     * The method will return an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void getCannedMessageById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCannedMessageByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete canned message details for the canned_message_id
     * The method will delete an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void deleteCannedMessageById(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCannedMessageByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create/Record canned message group defined by CreateCannedMessageGroup Req message for a specified
     * name and description.
     * The method will return a CannedMessageGroup message/entity that will
     * contain the newly created canned message group details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void createCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCannedMessageGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * list canned message groups for the current org
     * The method will return a list of canned message groups/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void listCannedMessageGroups(com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCannedMessageGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update canned message group defined by UpdateCannedMessageGroupReq message for a specified
     * name and description.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void updateCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCannedMessageGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete canned message group and all the related messages for the canned_message_group_id
     * The method will delete an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void deleteCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCannedMessageGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * list canned messages for the group
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void listCannedMessagesByGroupId(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCannedMessagesByGroupIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get canned message group details for the canned_message_group_id
     * The method will return an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    default void getCannedMessageGroupById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCannedMessageGroupByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    default void listUserSkills(com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSkillsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OmniApi.
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class OmniApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OmniApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OmniApi.
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiStub
      extends io.grpc.stub.AbstractAsyncStub<OmniApiStub> {
    private OmniApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmniApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public void archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create Omni Campaign defined by CreateOmniCampaign message
     * for the name, skill, Hours of operations, and description.
     * the method will return newly created OmniCampaign for this client
     * Required Permission:
     *      OMNI_BOSS
     * </pre>
     */
    public void createCampaign(com.tcn.cloud.api.api.v0alpha.CreateCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public void getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCampaignByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public void pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public void resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a campaign
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateCampaign(com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public void updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignPacingSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendOmniMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getManagerSendOmniMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public void createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public void deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public void listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDispositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public void updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public void listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCustomUnsubscribeLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public void createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomUnsubscribeLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public void updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCustomUnsubscribeLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public void deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCustomUnsubscribeLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List campaigns defined by ListCampaignsReq.
     * The method will return a ListCampaignsReq entity that will contain
     * all the campaigns within the specified filter.
     * </pre>
     */
    public void listCampaigns(com.tcn.cloud.api.api.v0alpha.ListCampaignsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a stream of new conversation message for a given conversation. Used
     * only for managers. It is not for customers.
     * </pre>
     */
    public void managerListMessages(com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getManagerListMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a stream of conversation message for a given conversation. Used
     * only for agents/users. It is not for customers.
     * </pre>
     */
    public void listMessages(com.tcn.cloud.api.api.v0alpha.ListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * lists all conversation and assigned users for a given date range.
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void managerListConversations(com.tcn.cloud.api.api.v0alpha.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConversationsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getManagerListConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public void listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactListsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAvailableHeaders - retrieves all the available headers that could be present on a contact list
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void getAvailableHeaders(com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableHeadersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ApproveTask approves a task.
     * </pre>
     */
    public void approveTask(com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetNextQueuedTask retrieves the next queued task for the agent.
     * </pre>
     */
    public void getNextQueuedTask(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextQueuedTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTask - retrieves a task using the provided criteria
     * Required permissions:
     *    OMNI_AGENT
     * </pre>
     */
    public void getTask(com.tcn.cloud.api.api.v0alpha.GetTaskReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniTask> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListTasks - retrieves tasks using the provided criteria
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void listTasks(com.tcn.cloud.api.api.v0alpha.ListTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTasksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RejectTask rejects a task.
     * </pre>
     */
    public void rejectTask(com.tcn.cloud.api.api.v0alpha.RejectTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequeueTask requeues a task.
     * </pre>
     */
    public void requeueTask(com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequeueTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateConnectedInbox - create a new connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void createConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateConnectedInboxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteConnectedInboxBySid - deletes a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void deleteConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteConnectedInboxBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetConnectedInboxBySid - retrieves a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void getConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.ConnectedInbox> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConnectedInboxBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Perform sendgrid account check to make sure all the account settings are valid defined by SendgridAccountByClientReq message.
     * The method will return a SendgridAccountByClientRes message/entity that will
     * contain the result true/false verifying account settings with sendgrid for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void performSendgridAccountChecks(com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPerformSendgridAccountChecksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListConnectedInboxes - retrieves all the connected inboxes for the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void listConnectedInboxes(com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConnectedInboxesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TestConnectedInbox - check if connected inbox login works for a specified email_address,
     * username, password, server_name, and server_port (other fields from ConnectedInbox are ignored).
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void testConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestConnectedInboxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateConnectedInbox - update a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateConnectedInbox(com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateConnectedInboxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateVerifiedEmail.  this will create a new verified email
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void createVerifiedEmail(com.tcn.cloud.api.api.commons.VerifiedEmail request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVerifiedEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete verify email record based on verified email id defined by
     * DeleteVerifiedEmailReq for the specified client.
     * This method will return a DeleteVerifiedEmailRes message/entity.
     * DeleteVerifiedEmail - deletes a verified email record using the given identifier
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteVerifiedEmail(com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVerifiedEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the verified email details based on verified email id defined by
     * GetVerifiedEmailByIdReq for the specified client.
     * This method will return an OmniVerifiedEmail message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void getVerifiedEmailBySid(com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.VerifiedEmail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerifiedEmailBySidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all the verified emails and their details defined by
     * ListVerifiedEmailsReq for the specified client.
     * This method will return a ListVerifiedEmailsRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void listVerifiedEmails(com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVerifiedEmailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resend verify email record based on verified email id defined by
     * ResendVerifiedEmailReq for the specified client.
     * This method will return a ResendVerifiedEmailRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public void resendVerifiedEmail(com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendVerifiedEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public void updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVerifiedEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetPendingGoogleXOAuth2Data - retrieves the pending oauth data required to finish creating a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void getPendingGoogleXOAuth2Data(com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPendingGoogleXOAuth2DataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send email notification defined by SendEmailNotificationReq message for the specified
     * subject, message and array of to email addresses.
     * The method will return a stream of SendEmailNotificationRes messages
     * containing result true/false after notified by email for the client_sid.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void sendEmailNotification(com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public void sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendFeedbackEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOmniAttachment - retrieves the omni attachment details based on the request
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void getOmniAttachment(com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniAttachment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOmniAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public void createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSignature - creates a new message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void createSignature(com.tcn.cloud.api.api.v0alpha.CreateSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSignature - deletes a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void deleteSignature(com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSignatures - retrieves the signatures created by the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void listSignatures(com.tcn.cloud.api.api.v0alpha.ListSignaturesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSignaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSignature - updates a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public void updateSignature(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public void suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuggestResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record project defined by CreateProjectReq message for a specified
     * name, description and status.
     * The method will return a Project message/entity that will
     * contain the newly created project_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createProject(com.tcn.cloud.api.api.v0alpha.CreateProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateProjectRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list projects for the current org
     * The method will return a list of Project messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listProjects(com.tcn.cloud.api.api.v0alpha.ListProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProjectsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update project defined by EditProjectByIdReq message for a specified
     * project id.
     * The method will return a Project message/entity that will
     * contain the updated details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void editProjectById(com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes project defined by CloseProjectByIdReq message for a specified
     * project id.
     * The method will stop all child campaigns and return a an empty response
     * if successful
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void closeProjectById(com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get project details defined by GetProjectByIdReq message for a specified
     * project id.
     * The method will return a GetProjectByIdRes message/entity that will
     * contain all the project details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getProjectById(com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record canned message defined by CreateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the newly created canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createCannedMessage(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCannedMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list canned messages for the current org
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listCannedMessages(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCannedMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update canned message defined by UpdateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the updated canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateCannedMessage(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCannedMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get canned message details for the canned_message_id
     * The method will return an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getCannedMessageById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCannedMessageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete canned message details for the canned_message_id
     * The method will delete an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteCannedMessageById(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCannedMessageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create/Record canned message group defined by CreateCannedMessageGroup Req message for a specified
     * name and description.
     * The method will return a CannedMessageGroup message/entity that will
     * contain the newly created canned message group details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void createCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCannedMessageGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list canned message groups for the current org
     * The method will return a list of canned message groups/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listCannedMessageGroups(com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCannedMessageGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update canned message group defined by UpdateCannedMessageGroupReq message for a specified
     * name and description.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void updateCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCannedMessageGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete canned message group and all the related messages for the canned_message_group_id
     * The method will delete an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void deleteCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCannedMessageGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list canned messages for the group
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void listCannedMessagesByGroupId(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCannedMessagesByGroupIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get canned message group details for the canned_message_group_id
     * The method will return an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public void getCannedMessageGroupById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCannedMessageGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public void listUserSkills(com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSkillsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OmniApi.
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OmniApiBlockingStub> {
    private OmniApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmniApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create Omni Campaign defined by CreateOmniCampaign message
     * for the name, skill, Hours of operations, and description.
     * the method will return newly created OmniCampaign for this client
     * Required Permission:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign createCampaign(com.tcn.cloud.api.api.v0alpha.CreateCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCampaignByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PauseCampaignRes pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a campaign
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes updateCampaign(com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCampaignPacingSpeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendOmniMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getManagerSendOmniMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateDispositionRes createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListDispositionsRes listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDispositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCustomUnsubscribeLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomUnsubscribeLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCustomUnsubscribeLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCustomUnsubscribeLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List campaigns defined by ListCampaignsReq.
     * The method will return a ListCampaignsReq entity that will contain
     * all the campaigns within the specified filter.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCampaignsRes listCampaigns(com.tcn.cloud.api.api.v0alpha.ListCampaignsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a stream of new conversation message for a given conversation. Used
     * only for managers. It is not for customers.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.OmniMessage> managerListMessages(
        com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getManagerListMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a stream of conversation message for a given conversation. Used
     * only for agents/users. It is not for customers.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.OmniMessage> listMessages(
        com.tcn.cloud.api.api.v0alpha.ListMessagesReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * lists all conversation and assigned users for a given date range.
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListConversationsRes managerListConversations(com.tcn.cloud.api.api.v0alpha.ListConversationsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getManagerListConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactListsRes listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactListsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAvailableHeaders - retrieves all the available headers that could be present on a contact list
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes getAvailableHeaders(com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableHeadersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ApproveTask approves a task.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse approveTask(com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetNextQueuedTask retrieves the next queued task for the agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse getNextQueuedTask(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextQueuedTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTask - retrieves a task using the provided criteria
     * Required permissions:
     *    OMNI_AGENT
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniTask getTask(com.tcn.cloud.api.api.v0alpha.GetTaskReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListTasks - retrieves tasks using the provided criteria
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListTasksRes listTasks(com.tcn.cloud.api.api.v0alpha.ListTasksReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RejectTask rejects a task.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RejectTaskResponse rejectTask(com.tcn.cloud.api.api.v0alpha.RejectTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequeueTask requeues a task.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse requeueTask(com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequeueTaskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateConnectedInbox - create a new connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes createConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateConnectedInboxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteConnectedInboxBySid - deletes a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteConnectedInboxBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetConnectedInboxBySid - retrieves a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.ConnectedInbox getConnectedInboxBySid(com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConnectedInboxBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Perform sendgrid account check to make sure all the account settings are valid defined by SendgridAccountByClientReq message.
     * The method will return a SendgridAccountByClientRes message/entity that will
     * contain the result true/false verifying account settings with sendgrid for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes performSendgridAccountChecks(com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPerformSendgridAccountChecksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListConnectedInboxes - retrieves all the connected inboxes for the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes listConnectedInboxes(com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConnectedInboxesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TestConnectedInbox - check if connected inbox login works for a specified email_address,
     * username, password, server_name, and server_port (other fields from ConnectedInbox are ignored).
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes testConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestConnectedInboxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateConnectedInbox - update a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty updateConnectedInbox(com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateConnectedInboxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateVerifiedEmail.  this will create a new verified email
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes createVerifiedEmail(com.tcn.cloud.api.api.commons.VerifiedEmail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVerifiedEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete verify email record based on verified email id defined by
     * DeleteVerifiedEmailReq for the specified client.
     * This method will return a DeleteVerifiedEmailRes message/entity.
     * DeleteVerifiedEmail - deletes a verified email record using the given identifier
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteVerifiedEmail(com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVerifiedEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the verified email details based on verified email id defined by
     * GetVerifiedEmailByIdReq for the specified client.
     * This method will return an OmniVerifiedEmail message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.VerifiedEmail getVerifiedEmailBySid(com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerifiedEmailBySidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all the verified emails and their details defined by
     * ListVerifiedEmailsReq for the specified client.
     * This method will return a ListVerifiedEmailsRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes listVerifiedEmails(com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVerifiedEmailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resend verify email record based on verified email id defined by
     * ResendVerifiedEmailReq for the specified client.
     * This method will return a ResendVerifiedEmailRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes resendVerifiedEmail(com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendVerifiedEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVerifiedEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetPendingGoogleXOAuth2Data - retrieves the pending oauth data required to finish creating a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes getPendingGoogleXOAuth2Data(com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPendingGoogleXOAuth2DataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send email notification defined by SendEmailNotificationReq message for the specified
     * subject, message and array of to email addresses.
     * The method will return a stream of SendEmailNotificationRes messages
     * containing result true/false after notified by email for the client_sid.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes sendEmailNotification(com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendFeedbackEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOmniAttachment - retrieves the omni attachment details based on the request
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachment getOmniAttachment(com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOmniAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateTasksRes createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSignature - creates a new message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateSignatureRes createSignature(com.tcn.cloud.api.api.v0alpha.CreateSignatureReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSignature - deletes a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes deleteSignature(com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSignatures - retrieves the signatures created by the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSignaturesRes listSignatures(com.tcn.cloud.api.api.v0alpha.ListSignaturesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSignaturesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSignature - updates a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes updateSignature(com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SuggestResponseRes suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuggestResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record project defined by CreateProjectReq message for a specified
     * name, description and status.
     * The method will return a Project message/entity that will
     * contain the newly created project_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateProjectRes createProject(com.tcn.cloud.api.api.v0alpha.CreateProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list projects for the current org
     * The method will return a list of Project messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListProjectsRes listProjects(com.tcn.cloud.api.api.v0alpha.ListProjectsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update project defined by EditProjectByIdReq message for a specified
     * project id.
     * The method will return a Project message/entity that will
     * contain the updated details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes editProjectById(com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes project defined by CloseProjectByIdReq message for a specified
     * project id.
     * The method will stop all child campaigns and return a an empty response
     * if successful
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes closeProjectById(com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get project details defined by GetProjectByIdReq message for a specified
     * project id.
     * The method will return a GetProjectByIdRes message/entity that will
     * contain all the project details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.Project getProjectById(com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record canned message defined by CreateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the newly created canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessage createCannedMessage(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCannedMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list canned messages for the current org
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes listCannedMessages(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCannedMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update canned message defined by UpdateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the updated canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessage updateCannedMessage(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCannedMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get canned message details for the canned_message_id
     * The method will return an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup getCannedMessageById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCannedMessageByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete canned message details for the canned_message_id
     * The method will delete an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes deleteCannedMessageById(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCannedMessageByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create/Record canned message group defined by CreateCannedMessageGroup Req message for a specified
     * name and description.
     * The method will return a CannedMessageGroup message/entity that will
     * contain the newly created canned message group details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageGroup createCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCannedMessageGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list canned message groups for the current org
     * The method will return a list of canned message groups/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes listCannedMessageGroups(com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCannedMessageGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update canned message group defined by UpdateCannedMessageGroupReq message for a specified
     * name and description.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes updateCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCannedMessageGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete canned message group and all the related messages for the canned_message_group_id
     * The method will delete an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes deleteCannedMessageGroup(com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCannedMessageGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list canned messages for the group
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes listCannedMessagesByGroupId(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCannedMessagesByGroupIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get canned message group details for the canned_message_group_id
     * The method will return an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageGroup getCannedMessageGroupById(com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCannedMessageGroupByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes listUserSkills(com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSkillsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OmniApi.
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<OmniApiFutureStub> {
    private OmniApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OmniApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> archiveCampaign(
        com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create Omni Campaign defined by CreateOmniCampaign message
     * for the name, skill, Hours of operations, and description.
     * the method will return newly created OmniCampaign for this client
     * Required Permission:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.OmniCampaign> createCampaign(
        com.tcn.cloud.api.api.v0alpha.CreateCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.OmniCampaign> getCampaignById(
        com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCampaignByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> pauseCampaign(
        com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> resumeCampaign(
        com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a campaign
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes> updateCampaign(
        com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> updateCampaignPacingSpeed(
        com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCampaignPacingSpeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> sendOmniMessage(
        com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendOmniMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> managerSendOmniMessage(
        com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getManagerSendOmniMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> createDisposition(
        com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteDisposition(
        com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> listDispositions(
        com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDispositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> updateDisposition(
        com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> listCustomUnsubscribeLinks(
        com.tcn.cloud.api.api.commons.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCustomUnsubscribeLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> createCustomUnsubscribeLink(
        com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomUnsubscribeLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> updateCustomUnsubscribeLink(
        com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCustomUnsubscribeLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteCustomUnsubscribeLink(
        com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCustomUnsubscribeLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List campaigns defined by ListCampaignsReq.
     * The method will return a ListCampaignsReq entity that will contain
     * all the campaigns within the specified filter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCampaignsRes> listCampaigns(
        com.tcn.cloud.api.api.v0alpha.ListCampaignsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * lists all conversation and assigned users for a given date range.
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListConversationsRes> managerListConversations(
        com.tcn.cloud.api.api.v0alpha.ListConversationsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getManagerListConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> listContactLists(
        com.tcn.cloud.api.api.v0alpha.ListContactListsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactListsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAvailableHeaders - retrieves all the available headers that could be present on a contact list
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes> getAvailableHeaders(
        com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableHeadersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ApproveTask approves a task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse> approveTask(
        com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetNextQueuedTask retrieves the next queued task for the agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse> getNextQueuedTask(
        com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextQueuedTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTask - retrieves a task using the provided criteria
     * Required permissions:
     *    OMNI_AGENT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.OmniTask> getTask(
        com.tcn.cloud.api.api.v0alpha.GetTaskReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListTasks - retrieves tasks using the provided criteria
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListTasksRes> listTasks(
        com.tcn.cloud.api.api.v0alpha.ListTasksReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RejectTask rejects a task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RejectTaskResponse> rejectTask(
        com.tcn.cloud.api.api.v0alpha.RejectTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequeueTask requeues a task.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse> requeueTask(
        com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequeueTaskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateConnectedInbox - create a new connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes> createConnectedInbox(
        com.tcn.cloud.api.api.commons.ConnectedInbox request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateConnectedInboxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteConnectedInboxBySid - deletes a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteConnectedInboxBySid(
        com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteConnectedInboxBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetConnectedInboxBySid - retrieves a connected inbox given it's identifier
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.ConnectedInbox> getConnectedInboxBySid(
        com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConnectedInboxBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Perform sendgrid account check to make sure all the account settings are valid defined by SendgridAccountByClientReq message.
     * The method will return a SendgridAccountByClientRes message/entity that will
     * contain the result true/false verifying account settings with sendgrid for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes> performSendgridAccountChecks(
        com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPerformSendgridAccountChecksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListConnectedInboxes - retrieves all the connected inboxes for the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes> listConnectedInboxes(
        com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConnectedInboxesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TestConnectedInbox - check if connected inbox login works for a specified email_address,
     * username, password, server_name, and server_port (other fields from ConnectedInbox are ignored).
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes> testConnectedInbox(
        com.tcn.cloud.api.api.commons.ConnectedInbox request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestConnectedInboxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateConnectedInbox - update a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> updateConnectedInbox(
        com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateConnectedInboxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateVerifiedEmail.  this will create a new verified email
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes> createVerifiedEmail(
        com.tcn.cloud.api.api.commons.VerifiedEmail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVerifiedEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete verify email record based on verified email id defined by
     * DeleteVerifiedEmailReq for the specified client.
     * This method will return a DeleteVerifiedEmailRes message/entity.
     * DeleteVerifiedEmail - deletes a verified email record using the given identifier
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteVerifiedEmail(
        com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVerifiedEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the verified email details based on verified email id defined by
     * GetVerifiedEmailByIdReq for the specified client.
     * This method will return an OmniVerifiedEmail message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.VerifiedEmail> getVerifiedEmailBySid(
        com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerifiedEmailBySidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all the verified emails and their details defined by
     * ListVerifiedEmailsReq for the specified client.
     * This method will return a ListVerifiedEmailsRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes> listVerifiedEmails(
        com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVerifiedEmailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resend verify email record based on verified email id defined by
     * ResendVerifiedEmailReq for the specified client.
     * This method will return a ResendVerifiedEmailRes message/entity.
     * Required permissions
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes> resendVerifiedEmail(
        com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendVerifiedEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> updateVerifiedEmail(
        com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVerifiedEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetPendingGoogleXOAuth2Data - retrieves the pending oauth data required to finish creating a connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes> getPendingGoogleXOAuth2Data(
        com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPendingGoogleXOAuth2DataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send email notification defined by SendEmailNotificationReq message for the specified
     * subject, message and array of to email addresses.
     * The method will return a stream of SendEmailNotificationRes messages
     * containing result true/false after notified by email for the client_sid.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes> sendEmailNotification(
        com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> sendFeedbackEmail(
        com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendFeedbackEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOmniAttachment - retrieves the omni attachment details based on the request
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.OmniAttachment> getOmniAttachment(
        com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOmniAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> createTasks(
        com.tcn.cloud.api.api.v0alpha.CreateTasksReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTasksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSignature - creates a new message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateSignatureRes> createSignature(
        com.tcn.cloud.api.api.v0alpha.CreateSignatureReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSignature - deletes a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes> deleteSignature(
        com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSignatures - retrieves the signatures created by the organization
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSignaturesRes> listSignatures(
        com.tcn.cloud.api.api.v0alpha.ListSignaturesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSignaturesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSignature - updates a message signature
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes> updateSignature(
        com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> suggestResponse(
        com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuggestResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record project defined by CreateProjectReq message for a specified
     * name, description and status.
     * The method will return a Project message/entity that will
     * contain the newly created project_id value for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateProjectRes> createProject(
        com.tcn.cloud.api.api.v0alpha.CreateProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list projects for the current org
     * The method will return a list of Project messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListProjectsRes> listProjects(
        com.tcn.cloud.api.api.v0alpha.ListProjectsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update project defined by EditProjectByIdReq message for a specified
     * project id.
     * The method will return a Project message/entity that will
     * contain the updated details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes> editProjectById(
        com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes project defined by CloseProjectByIdReq message for a specified
     * project id.
     * The method will stop all child campaigns and return a an empty response
     * if successful
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes> closeProjectById(
        com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get project details defined by GetProjectByIdReq message for a specified
     * project id.
     * The method will return a GetProjectByIdRes message/entity that will
     * contain all the project details for the project_id
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Project> getProjectById(
        com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record canned message defined by CreateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the newly created canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CannedMessage> createCannedMessage(
        com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCannedMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list canned messages for the current org
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes> listCannedMessages(
        com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCannedMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update canned message defined by UpdateCannedMessageReq message for a specified
     * name, description and message_body.
     * The method will return a CannedMessage message/entity that will
     * contain the updated canned message details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CannedMessage> updateCannedMessage(
        com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCannedMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get canned message details for the canned_message_id
     * The method will return an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getCannedMessageById(
        com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCannedMessageByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete canned message details for the canned_message_id
     * The method will delete an canned message/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes> deleteCannedMessageById(
        com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCannedMessageByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create/Record canned message group defined by CreateCannedMessageGroup Req message for a specified
     * name and description.
     * The method will return a CannedMessageGroup message/entity that will
     * contain the newly created canned message group details for this client
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> createCannedMessageGroup(
        com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCannedMessageGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list canned message groups for the current org
     * The method will return a list of canned message groups/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes> listCannedMessageGroups(
        com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCannedMessageGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update canned message group defined by UpdateCannedMessageGroupReq message for a specified
     * name and description.
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes> updateCannedMessageGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCannedMessageGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete canned message group and all the related messages for the canned_message_group_id
     * The method will delete an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes> deleteCannedMessageGroup(
        com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCannedMessageGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list canned messages for the group
     * The method will return a list of canned messages/entities
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes> listCannedMessagesByGroupId(
        com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCannedMessagesByGroupIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get canned message group details for the canned_message_group_id
     * The method will return an canned message group/entity
     * Required permissions:
     *      OMNI_BOSS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup> getCannedMessageGroupById(
        com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCannedMessageGroupByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes> listUserSkills(
        com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSkillsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ARCHIVE_CAMPAIGN = 0;
  private static final int METHODID_CREATE_CAMPAIGN = 1;
  private static final int METHODID_GET_CAMPAIGN_BY_ID = 2;
  private static final int METHODID_PAUSE_CAMPAIGN = 3;
  private static final int METHODID_RESUME_CAMPAIGN = 4;
  private static final int METHODID_UPDATE_CAMPAIGN = 5;
  private static final int METHODID_UPDATE_CAMPAIGN_PACING_SPEED = 6;
  private static final int METHODID_SEND_OMNI_MESSAGE = 7;
  private static final int METHODID_MANAGER_SEND_OMNI_MESSAGE = 8;
  private static final int METHODID_CREATE_DISPOSITION = 9;
  private static final int METHODID_DELETE_DISPOSITION = 10;
  private static final int METHODID_LIST_DISPOSITIONS = 11;
  private static final int METHODID_UPDATE_DISPOSITION = 12;
  private static final int METHODID_LIST_CUSTOM_UNSUBSCRIBE_LINKS = 13;
  private static final int METHODID_CREATE_CUSTOM_UNSUBSCRIBE_LINK = 14;
  private static final int METHODID_UPDATE_CUSTOM_UNSUBSCRIBE_LINK = 15;
  private static final int METHODID_DELETE_CUSTOM_UNSUBSCRIBE_LINK = 16;
  private static final int METHODID_LIST_CAMPAIGNS = 17;
  private static final int METHODID_MANAGER_LIST_MESSAGES = 18;
  private static final int METHODID_LIST_MESSAGES = 19;
  private static final int METHODID_MANAGER_LIST_CONVERSATIONS = 20;
  private static final int METHODID_LIST_CONTACT_LISTS = 21;
  private static final int METHODID_GET_AVAILABLE_HEADERS = 22;
  private static final int METHODID_APPROVE_TASK = 23;
  private static final int METHODID_GET_NEXT_QUEUED_TASK = 24;
  private static final int METHODID_GET_TASK = 25;
  private static final int METHODID_LIST_TASKS = 26;
  private static final int METHODID_REJECT_TASK = 27;
  private static final int METHODID_REQUEUE_TASK = 28;
  private static final int METHODID_CREATE_CONNECTED_INBOX = 29;
  private static final int METHODID_DELETE_CONNECTED_INBOX_BY_SID = 30;
  private static final int METHODID_GET_CONNECTED_INBOX_BY_SID = 31;
  private static final int METHODID_PERFORM_SENDGRID_ACCOUNT_CHECKS = 32;
  private static final int METHODID_LIST_CONNECTED_INBOXES = 33;
  private static final int METHODID_TEST_CONNECTED_INBOX = 34;
  private static final int METHODID_UPDATE_CONNECTED_INBOX = 35;
  private static final int METHODID_CREATE_VERIFIED_EMAIL = 36;
  private static final int METHODID_DELETE_VERIFIED_EMAIL = 37;
  private static final int METHODID_GET_VERIFIED_EMAIL_BY_SID = 38;
  private static final int METHODID_LIST_VERIFIED_EMAILS = 39;
  private static final int METHODID_RESEND_VERIFIED_EMAIL = 40;
  private static final int METHODID_UPDATE_VERIFIED_EMAIL = 41;
  private static final int METHODID_GET_PENDING_GOOGLE_XOAUTH2DATA = 42;
  private static final int METHODID_SEND_EMAIL_NOTIFICATION = 43;
  private static final int METHODID_SEND_FEEDBACK_EMAIL = 44;
  private static final int METHODID_GET_OMNI_ATTACHMENT = 45;
  private static final int METHODID_CREATE_TASKS = 46;
  private static final int METHODID_CREATE_SIGNATURE = 47;
  private static final int METHODID_DELETE_SIGNATURE = 48;
  private static final int METHODID_LIST_SIGNATURES = 49;
  private static final int METHODID_UPDATE_SIGNATURE = 50;
  private static final int METHODID_SUGGEST_RESPONSE = 51;
  private static final int METHODID_CREATE_PROJECT = 52;
  private static final int METHODID_LIST_PROJECTS = 53;
  private static final int METHODID_EDIT_PROJECT_BY_ID = 54;
  private static final int METHODID_CLOSE_PROJECT_BY_ID = 55;
  private static final int METHODID_GET_PROJECT_BY_ID = 56;
  private static final int METHODID_CREATE_CANNED_MESSAGE = 57;
  private static final int METHODID_LIST_CANNED_MESSAGES = 58;
  private static final int METHODID_UPDATE_CANNED_MESSAGE = 59;
  private static final int METHODID_GET_CANNED_MESSAGE_BY_ID = 60;
  private static final int METHODID_DELETE_CANNED_MESSAGE_BY_ID = 61;
  private static final int METHODID_CREATE_CANNED_MESSAGE_GROUP = 62;
  private static final int METHODID_LIST_CANNED_MESSAGE_GROUPS = 63;
  private static final int METHODID_UPDATE_CANNED_MESSAGE_GROUP = 64;
  private static final int METHODID_DELETE_CANNED_MESSAGE_GROUP = 65;
  private static final int METHODID_LIST_CANNED_MESSAGES_BY_GROUP_ID = 66;
  private static final int METHODID_GET_CANNED_MESSAGE_GROUP_BY_ID = 67;
  private static final int METHODID_LIST_USER_SKILLS = 68;

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
        case METHODID_ARCHIVE_CAMPAIGN:
          serviceImpl.archiveCampaign((com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes>) responseObserver);
          break;
        case METHODID_CREATE_CAMPAIGN:
          serviceImpl.createCampaign((com.tcn.cloud.api.api.v0alpha.CreateCampaignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGN_BY_ID:
          serviceImpl.getCampaignById((com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign>) responseObserver);
          break;
        case METHODID_PAUSE_CAMPAIGN:
          serviceImpl.pauseCampaign((com.tcn.cloud.api.api.v0alpha.PauseCampaignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes>) responseObserver);
          break;
        case METHODID_RESUME_CAMPAIGN:
          serviceImpl.resumeCampaign((com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes>) responseObserver);
          break;
        case METHODID_UPDATE_CAMPAIGN:
          serviceImpl.updateCampaign((com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes>) responseObserver);
          break;
        case METHODID_UPDATE_CAMPAIGN_PACING_SPEED:
          serviceImpl.updateCampaignPacingSpeed((com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes>) responseObserver);
          break;
        case METHODID_SEND_OMNI_MESSAGE:
          serviceImpl.sendOmniMessage((com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_MANAGER_SEND_OMNI_MESSAGE:
          serviceImpl.managerSendOmniMessage((com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_CREATE_DISPOSITION:
          serviceImpl.createDisposition((com.tcn.cloud.api.api.v0alpha.CreateDispositionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes>) responseObserver);
          break;
        case METHODID_DELETE_DISPOSITION:
          serviceImpl.deleteDisposition((com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_LIST_DISPOSITIONS:
          serviceImpl.listDispositions((com.tcn.cloud.api.api.v0alpha.ListDispositionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes>) responseObserver);
          break;
        case METHODID_UPDATE_DISPOSITION:
          serviceImpl.updateDisposition((com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_UNSUBSCRIBE_LINKS:
          serviceImpl.listCustomUnsubscribeLinks((com.tcn.cloud.api.api.commons.Empty) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_UNSUBSCRIBE_LINK:
          serviceImpl.createCustomUnsubscribeLink((com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOM_UNSUBSCRIBE_LINK:
          serviceImpl.updateCustomUnsubscribeLink((com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOM_UNSUBSCRIBE_LINK:
          serviceImpl.deleteCustomUnsubscribeLink((com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGNS:
          serviceImpl.listCampaigns((com.tcn.cloud.api.api.v0alpha.ListCampaignsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCampaignsRes>) responseObserver);
          break;
        case METHODID_MANAGER_LIST_MESSAGES:
          serviceImpl.managerListMessages((com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage>) responseObserver);
          break;
        case METHODID_LIST_MESSAGES:
          serviceImpl.listMessages((com.tcn.cloud.api.api.v0alpha.ListMessagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage>) responseObserver);
          break;
        case METHODID_MANAGER_LIST_CONVERSATIONS:
          serviceImpl.managerListConversations((com.tcn.cloud.api.api.v0alpha.ListConversationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConversationsRes>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_LISTS:
          serviceImpl.listContactLists((com.tcn.cloud.api.api.v0alpha.ListContactListsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactListsRes>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_HEADERS:
          serviceImpl.getAvailableHeaders((com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes>) responseObserver);
          break;
        case METHODID_APPROVE_TASK:
          serviceImpl.approveTask((com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse>) responseObserver);
          break;
        case METHODID_GET_NEXT_QUEUED_TASK:
          serviceImpl.getNextQueuedTask((com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse>) responseObserver);
          break;
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.tcn.cloud.api.api.v0alpha.GetTaskReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniTask>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((com.tcn.cloud.api.api.v0alpha.ListTasksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTasksRes>) responseObserver);
          break;
        case METHODID_REJECT_TASK:
          serviceImpl.rejectTask((com.tcn.cloud.api.api.v0alpha.RejectTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RejectTaskResponse>) responseObserver);
          break;
        case METHODID_REQUEUE_TASK:
          serviceImpl.requeueTask((com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONNECTED_INBOX:
          serviceImpl.createConnectedInbox((com.tcn.cloud.api.api.commons.ConnectedInbox) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes>) responseObserver);
          break;
        case METHODID_DELETE_CONNECTED_INBOX_BY_SID:
          serviceImpl.deleteConnectedInboxBySid((com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_GET_CONNECTED_INBOX_BY_SID:
          serviceImpl.getConnectedInboxBySid((com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.ConnectedInbox>) responseObserver);
          break;
        case METHODID_PERFORM_SENDGRID_ACCOUNT_CHECKS:
          serviceImpl.performSendgridAccountChecks((com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes>) responseObserver);
          break;
        case METHODID_LIST_CONNECTED_INBOXES:
          serviceImpl.listConnectedInboxes((com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes>) responseObserver);
          break;
        case METHODID_TEST_CONNECTED_INBOX:
          serviceImpl.testConnectedInbox((com.tcn.cloud.api.api.commons.ConnectedInbox) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes>) responseObserver);
          break;
        case METHODID_UPDATE_CONNECTED_INBOX:
          serviceImpl.updateConnectedInbox((com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_CREATE_VERIFIED_EMAIL:
          serviceImpl.createVerifiedEmail((com.tcn.cloud.api.api.commons.VerifiedEmail) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes>) responseObserver);
          break;
        case METHODID_DELETE_VERIFIED_EMAIL:
          serviceImpl.deleteVerifiedEmail((com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_GET_VERIFIED_EMAIL_BY_SID:
          serviceImpl.getVerifiedEmailBySid((com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.VerifiedEmail>) responseObserver);
          break;
        case METHODID_LIST_VERIFIED_EMAILS:
          serviceImpl.listVerifiedEmails((com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes>) responseObserver);
          break;
        case METHODID_RESEND_VERIFIED_EMAIL:
          serviceImpl.resendVerifiedEmail((com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes>) responseObserver);
          break;
        case METHODID_UPDATE_VERIFIED_EMAIL:
          serviceImpl.updateVerifiedEmail((com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty>) responseObserver);
          break;
        case METHODID_GET_PENDING_GOOGLE_XOAUTH2DATA:
          serviceImpl.getPendingGoogleXOAuth2Data((com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_NOTIFICATION:
          serviceImpl.sendEmailNotification((com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes>) responseObserver);
          break;
        case METHODID_SEND_FEEDBACK_EMAIL:
          serviceImpl.sendFeedbackEmail((com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes>) responseObserver);
          break;
        case METHODID_GET_OMNI_ATTACHMENT:
          serviceImpl.getOmniAttachment((com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniAttachment>) responseObserver);
          break;
        case METHODID_CREATE_TASKS:
          serviceImpl.createTasks((com.tcn.cloud.api.api.v0alpha.CreateTasksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTasksRes>) responseObserver);
          break;
        case METHODID_CREATE_SIGNATURE:
          serviceImpl.createSignature((com.tcn.cloud.api.api.v0alpha.CreateSignatureReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateSignatureRes>) responseObserver);
          break;
        case METHODID_DELETE_SIGNATURE:
          serviceImpl.deleteSignature((com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes>) responseObserver);
          break;
        case METHODID_LIST_SIGNATURES:
          serviceImpl.listSignatures((com.tcn.cloud.api.api.v0alpha.ListSignaturesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSignaturesRes>) responseObserver);
          break;
        case METHODID_UPDATE_SIGNATURE:
          serviceImpl.updateSignature((com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes>) responseObserver);
          break;
        case METHODID_SUGGEST_RESPONSE:
          serviceImpl.suggestResponse((com.tcn.cloud.api.api.v0alpha.SuggestResponseReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((com.tcn.cloud.api.api.v0alpha.CreateProjectReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateProjectRes>) responseObserver);
          break;
        case METHODID_LIST_PROJECTS:
          serviceImpl.listProjects((com.tcn.cloud.api.api.v0alpha.ListProjectsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListProjectsRes>) responseObserver);
          break;
        case METHODID_EDIT_PROJECT_BY_ID:
          serviceImpl.editProjectById((com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes>) responseObserver);
          break;
        case METHODID_CLOSE_PROJECT_BY_ID:
          serviceImpl.closeProjectById((com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes>) responseObserver);
          break;
        case METHODID_GET_PROJECT_BY_ID:
          serviceImpl.getProjectById((com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Project>) responseObserver);
          break;
        case METHODID_CREATE_CANNED_MESSAGE:
          serviceImpl.createCannedMessage((com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage>) responseObserver);
          break;
        case METHODID_LIST_CANNED_MESSAGES:
          serviceImpl.listCannedMessages((com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes>) responseObserver);
          break;
        case METHODID_UPDATE_CANNED_MESSAGE:
          serviceImpl.updateCannedMessage((com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessage>) responseObserver);
          break;
        case METHODID_GET_CANNED_MESSAGE_BY_ID:
          serviceImpl.getCannedMessageById((com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup>) responseObserver);
          break;
        case METHODID_DELETE_CANNED_MESSAGE_BY_ID:
          serviceImpl.deleteCannedMessageById((com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes>) responseObserver);
          break;
        case METHODID_CREATE_CANNED_MESSAGE_GROUP:
          serviceImpl.createCannedMessageGroup((com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>) responseObserver);
          break;
        case METHODID_LIST_CANNED_MESSAGE_GROUPS:
          serviceImpl.listCannedMessageGroups((com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes>) responseObserver);
          break;
        case METHODID_UPDATE_CANNED_MESSAGE_GROUP:
          serviceImpl.updateCannedMessageGroup((com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes>) responseObserver);
          break;
        case METHODID_DELETE_CANNED_MESSAGE_GROUP:
          serviceImpl.deleteCannedMessageGroup((com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes>) responseObserver);
          break;
        case METHODID_LIST_CANNED_MESSAGES_BY_GROUP_ID:
          serviceImpl.listCannedMessagesByGroupId((com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes>) responseObserver);
          break;
        case METHODID_GET_CANNED_MESSAGE_GROUP_BY_ID:
          serviceImpl.getCannedMessageGroupById((com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>) responseObserver);
          break;
        case METHODID_LIST_USER_SKILLS:
          serviceImpl.listUserSkills((com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes>) responseObserver);
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
          getArchiveCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq,
              com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes>(
                service, METHODID_ARCHIVE_CAMPAIGN)))
        .addMethod(
          getCreateCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateCampaignReq,
              com.tcn.cloud.api.api.commons.OmniCampaign>(
                service, METHODID_CREATE_CAMPAIGN)))
        .addMethod(
          getGetCampaignByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq,
              com.tcn.cloud.api.api.commons.OmniCampaign>(
                service, METHODID_GET_CAMPAIGN_BY_ID)))
        .addMethod(
          getPauseCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.PauseCampaignReq,
              com.tcn.cloud.api.api.v0alpha.PauseCampaignRes>(
                service, METHODID_PAUSE_CAMPAIGN)))
        .addMethod(
          getResumeCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq,
              com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes>(
                service, METHODID_RESUME_CAMPAIGN)))
        .addMethod(
          getUpdateCampaignMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq,
              com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes>(
                service, METHODID_UPDATE_CAMPAIGN)))
        .addMethod(
          getUpdateCampaignPacingSpeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq,
              com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes>(
                service, METHODID_UPDATE_CAMPAIGN_PACING_SPEED)))
        .addMethod(
          getSendOmniMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_SEND_OMNI_MESSAGE)))
        .addMethod(
          getManagerSendOmniMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_MANAGER_SEND_OMNI_MESSAGE)))
        .addMethod(
          getCreateDispositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateDispositionReq,
              com.tcn.cloud.api.api.v0alpha.CreateDispositionRes>(
                service, METHODID_CREATE_DISPOSITION)))
        .addMethod(
          getDeleteDispositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_DELETE_DISPOSITION)))
        .addMethod(
          getListDispositionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListDispositionsReq,
              com.tcn.cloud.api.api.v0alpha.ListDispositionsRes>(
                service, METHODID_LIST_DISPOSITIONS)))
        .addMethod(
          getUpdateDispositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_UPDATE_DISPOSITION)))
        .addMethod(
          getListCustomUnsubscribeLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.Empty,
              com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes>(
                service, METHODID_LIST_CUSTOM_UNSUBSCRIBE_LINKS)))
        .addMethod(
          getCreateCustomUnsubscribeLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink,
              com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes>(
                service, METHODID_CREATE_CUSTOM_UNSUBSCRIBE_LINK)))
        .addMethod(
          getUpdateCustomUnsubscribeLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq,
              com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes>(
                service, METHODID_UPDATE_CUSTOM_UNSUBSCRIBE_LINK)))
        .addMethod(
          getDeleteCustomUnsubscribeLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_DELETE_CUSTOM_UNSUBSCRIBE_LINK)))
        .addMethod(
          getListCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListCampaignsReq,
              com.tcn.cloud.api.api.v0alpha.ListCampaignsRes>(
                service, METHODID_LIST_CAMPAIGNS)))
        .addMethod(
          getManagerListMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq,
              com.tcn.cloud.api.api.commons.OmniMessage>(
                service, METHODID_MANAGER_LIST_MESSAGES)))
        .addMethod(
          getListMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListMessagesReq,
              com.tcn.cloud.api.api.commons.OmniMessage>(
                service, METHODID_LIST_MESSAGES)))
        .addMethod(
          getManagerListConversationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListConversationsReq,
              com.tcn.cloud.api.api.v0alpha.ListConversationsRes>(
                service, METHODID_MANAGER_LIST_CONVERSATIONS)))
        .addMethod(
          getListContactListsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListContactListsReq,
              com.tcn.cloud.api.api.v0alpha.ListContactListsRes>(
                service, METHODID_LIST_CONTACT_LISTS)))
        .addMethod(
          getGetAvailableHeadersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq,
              com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes>(
                service, METHODID_GET_AVAILABLE_HEADERS)))
        .addMethod(
          getApproveTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ApproveTaskRequest,
              com.tcn.cloud.api.api.v0alpha.ApproveTaskResponse>(
                service, METHODID_APPROVE_TASK)))
        .addMethod(
          getGetNextQueuedTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest,
              com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskResponse>(
                service, METHODID_GET_NEXT_QUEUED_TASK)))
        .addMethod(
          getGetTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetTaskReq,
              com.tcn.cloud.api.api.commons.OmniTask>(
                service, METHODID_GET_TASK)))
        .addMethod(
          getListTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListTasksReq,
              com.tcn.cloud.api.api.v0alpha.ListTasksRes>(
                service, METHODID_LIST_TASKS)))
        .addMethod(
          getRejectTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RejectTaskRequest,
              com.tcn.cloud.api.api.v0alpha.RejectTaskResponse>(
                service, METHODID_REJECT_TASK)))
        .addMethod(
          getRequeueTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.RequeueTaskRequest,
              com.tcn.cloud.api.api.v0alpha.RequeueTaskResponse>(
                service, METHODID_REQUEUE_TASK)))
        .addMethod(
          getCreateConnectedInboxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.ConnectedInbox,
              com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes>(
                service, METHODID_CREATE_CONNECTED_INBOX)))
        .addMethod(
          getDeleteConnectedInboxBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_DELETE_CONNECTED_INBOX_BY_SID)))
        .addMethod(
          getGetConnectedInboxBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq,
              com.tcn.cloud.api.api.commons.ConnectedInbox>(
                service, METHODID_GET_CONNECTED_INBOX_BY_SID)))
        .addMethod(
          getPerformSendgridAccountChecksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq,
              com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes>(
                service, METHODID_PERFORM_SENDGRID_ACCOUNT_CHECKS)))
        .addMethod(
          getListConnectedInboxesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq,
              com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes>(
                service, METHODID_LIST_CONNECTED_INBOXES)))
        .addMethod(
          getTestConnectedInboxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.ConnectedInbox,
              com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes>(
                service, METHODID_TEST_CONNECTED_INBOX)))
        .addMethod(
          getUpdateConnectedInboxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_UPDATE_CONNECTED_INBOX)))
        .addMethod(
          getCreateVerifiedEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.VerifiedEmail,
              com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes>(
                service, METHODID_CREATE_VERIFIED_EMAIL)))
        .addMethod(
          getDeleteVerifiedEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_DELETE_VERIFIED_EMAIL)))
        .addMethod(
          getGetVerifiedEmailBySidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq,
              com.tcn.cloud.api.api.commons.VerifiedEmail>(
                service, METHODID_GET_VERIFIED_EMAIL_BY_SID)))
        .addMethod(
          getListVerifiedEmailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq,
              com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes>(
                service, METHODID_LIST_VERIFIED_EMAILS)))
        .addMethod(
          getResendVerifiedEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq,
              com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes>(
                service, METHODID_RESEND_VERIFIED_EMAIL)))
        .addMethod(
          getUpdateVerifiedEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq,
              com.tcn.cloud.api.api.commons.Empty>(
                service, METHODID_UPDATE_VERIFIED_EMAIL)))
        .addMethod(
          getGetPendingGoogleXOAuth2DataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq,
              com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes>(
                service, METHODID_GET_PENDING_GOOGLE_XOAUTH2DATA)))
        .addMethod(
          getSendEmailNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq,
              com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes>(
                service, METHODID_SEND_EMAIL_NOTIFICATION)))
        .addMethod(
          getSendFeedbackEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq,
              com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes>(
                service, METHODID_SEND_FEEDBACK_EMAIL)))
        .addMethod(
          getGetOmniAttachmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq,
              com.tcn.cloud.api.api.commons.OmniAttachment>(
                service, METHODID_GET_OMNI_ATTACHMENT)))
        .addMethod(
          getCreateTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateTasksReq,
              com.tcn.cloud.api.api.v0alpha.CreateTasksRes>(
                service, METHODID_CREATE_TASKS)))
        .addMethod(
          getCreateSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateSignatureReq,
              com.tcn.cloud.api.api.v0alpha.CreateSignatureRes>(
                service, METHODID_CREATE_SIGNATURE)))
        .addMethod(
          getDeleteSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq,
              com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes>(
                service, METHODID_DELETE_SIGNATURE)))
        .addMethod(
          getListSignaturesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListSignaturesReq,
              com.tcn.cloud.api.api.v0alpha.ListSignaturesRes>(
                service, METHODID_LIST_SIGNATURES)))
        .addMethod(
          getUpdateSignatureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq,
              com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes>(
                service, METHODID_UPDATE_SIGNATURE)))
        .addMethod(
          getSuggestResponseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.SuggestResponseReq,
              com.tcn.cloud.api.api.v0alpha.SuggestResponseRes>(
                service, METHODID_SUGGEST_RESPONSE)))
        .addMethod(
          getCreateProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateProjectReq,
              com.tcn.cloud.api.api.v0alpha.CreateProjectRes>(
                service, METHODID_CREATE_PROJECT)))
        .addMethod(
          getListProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListProjectsReq,
              com.tcn.cloud.api.api.v0alpha.ListProjectsRes>(
                service, METHODID_LIST_PROJECTS)))
        .addMethod(
          getEditProjectByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq,
              com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes>(
                service, METHODID_EDIT_PROJECT_BY_ID)))
        .addMethod(
          getCloseProjectByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq,
              com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes>(
                service, METHODID_CLOSE_PROJECT_BY_ID)))
        .addMethod(
          getGetProjectByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq,
              com.tcn.cloud.api.api.v0alpha.Project>(
                service, METHODID_GET_PROJECT_BY_ID)))
        .addMethod(
          getCreateCannedMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq,
              com.tcn.cloud.api.api.v0alpha.CannedMessage>(
                service, METHODID_CREATE_CANNED_MESSAGE)))
        .addMethod(
          getListCannedMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq,
              com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes>(
                service, METHODID_LIST_CANNED_MESSAGES)))
        .addMethod(
          getUpdateCannedMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq,
              com.tcn.cloud.api.api.v0alpha.CannedMessage>(
                service, METHODID_UPDATE_CANNED_MESSAGE)))
        .addMethod(
          getGetCannedMessageByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq,
              com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup>(
                service, METHODID_GET_CANNED_MESSAGE_BY_ID)))
        .addMethod(
          getDeleteCannedMessageByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq,
              com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes>(
                service, METHODID_DELETE_CANNED_MESSAGE_BY_ID)))
        .addMethod(
          getCreateCannedMessageGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq,
              com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>(
                service, METHODID_CREATE_CANNED_MESSAGE_GROUP)))
        .addMethod(
          getListCannedMessageGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq,
              com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes>(
                service, METHODID_LIST_CANNED_MESSAGE_GROUPS)))
        .addMethod(
          getUpdateCannedMessageGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq,
              com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes>(
                service, METHODID_UPDATE_CANNED_MESSAGE_GROUP)))
        .addMethod(
          getDeleteCannedMessageGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq,
              com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes>(
                service, METHODID_DELETE_CANNED_MESSAGE_GROUP)))
        .addMethod(
          getListCannedMessagesByGroupIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq,
              com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes>(
                service, METHODID_LIST_CANNED_MESSAGES_BY_GROUP_ID)))
        .addMethod(
          getGetCannedMessageGroupByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq,
              com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>(
                service, METHODID_GET_CANNED_MESSAGE_GROUP_BY_ID)))
        .addMethod(
          getListUserSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.ListUserSkillsReq,
              com.tcn.cloud.api.api.v0alpha.ListUserSkillsRes>(
                service, METHODID_LIST_USER_SKILLS)))
        .build();
  }

  private static abstract class OmniApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OmniApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OmniApi");
    }
  }

  private static final class OmniApiFileDescriptorSupplier
      extends OmniApiBaseDescriptorSupplier {
    OmniApiFileDescriptorSupplier() {}
  }

  private static final class OmniApiMethodDescriptorSupplier
      extends OmniApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OmniApiMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OmniApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OmniApiFileDescriptorSupplier())
              .addMethod(getArchiveCampaignMethod())
              .addMethod(getCreateCampaignMethod())
              .addMethod(getGetCampaignByIdMethod())
              .addMethod(getPauseCampaignMethod())
              .addMethod(getResumeCampaignMethod())
              .addMethod(getUpdateCampaignMethod())
              .addMethod(getUpdateCampaignPacingSpeedMethod())
              .addMethod(getSendOmniMessageMethod())
              .addMethod(getManagerSendOmniMessageMethod())
              .addMethod(getCreateDispositionMethod())
              .addMethod(getDeleteDispositionMethod())
              .addMethod(getListDispositionsMethod())
              .addMethod(getUpdateDispositionMethod())
              .addMethod(getListCustomUnsubscribeLinksMethod())
              .addMethod(getCreateCustomUnsubscribeLinkMethod())
              .addMethod(getUpdateCustomUnsubscribeLinkMethod())
              .addMethod(getDeleteCustomUnsubscribeLinkMethod())
              .addMethod(getListCampaignsMethod())
              .addMethod(getManagerListMessagesMethod())
              .addMethod(getListMessagesMethod())
              .addMethod(getManagerListConversationsMethod())
              .addMethod(getListContactListsMethod())
              .addMethod(getGetAvailableHeadersMethod())
              .addMethod(getApproveTaskMethod())
              .addMethod(getGetNextQueuedTaskMethod())
              .addMethod(getGetTaskMethod())
              .addMethod(getListTasksMethod())
              .addMethod(getRejectTaskMethod())
              .addMethod(getRequeueTaskMethod())
              .addMethod(getCreateConnectedInboxMethod())
              .addMethod(getDeleteConnectedInboxBySidMethod())
              .addMethod(getGetConnectedInboxBySidMethod())
              .addMethod(getPerformSendgridAccountChecksMethod())
              .addMethod(getListConnectedInboxesMethod())
              .addMethod(getTestConnectedInboxMethod())
              .addMethod(getUpdateConnectedInboxMethod())
              .addMethod(getCreateVerifiedEmailMethod())
              .addMethod(getDeleteVerifiedEmailMethod())
              .addMethod(getGetVerifiedEmailBySidMethod())
              .addMethod(getListVerifiedEmailsMethod())
              .addMethod(getResendVerifiedEmailMethod())
              .addMethod(getUpdateVerifiedEmailMethod())
              .addMethod(getGetPendingGoogleXOAuth2DataMethod())
              .addMethod(getSendEmailNotificationMethod())
              .addMethod(getSendFeedbackEmailMethod())
              .addMethod(getGetOmniAttachmentMethod())
              .addMethod(getCreateTasksMethod())
              .addMethod(getCreateSignatureMethod())
              .addMethod(getDeleteSignatureMethod())
              .addMethod(getListSignaturesMethod())
              .addMethod(getUpdateSignatureMethod())
              .addMethod(getSuggestResponseMethod())
              .addMethod(getCreateProjectMethod())
              .addMethod(getListProjectsMethod())
              .addMethod(getEditProjectByIdMethod())
              .addMethod(getCloseProjectByIdMethod())
              .addMethod(getGetProjectByIdMethod())
              .addMethod(getCreateCannedMessageMethod())
              .addMethod(getListCannedMessagesMethod())
              .addMethod(getUpdateCannedMessageMethod())
              .addMethod(getGetCannedMessageByIdMethod())
              .addMethod(getDeleteCannedMessageByIdMethod())
              .addMethod(getCreateCannedMessageGroupMethod())
              .addMethod(getListCannedMessageGroupsMethod())
              .addMethod(getUpdateCannedMessageGroupMethod())
              .addMethod(getDeleteCannedMessageGroupMethod())
              .addMethod(getListCannedMessagesByGroupIdMethod())
              .addMethod(getGetCannedMessageGroupByIdMethod())
              .addMethod(getListUserSkillsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
