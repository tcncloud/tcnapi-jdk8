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
 * Service for interacting with TCN's Omni API system.
 * Accessing all of the methods require an authenticated user with the correct
 * permissions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/omniapi.proto")
public final class OmniApiGrpc {

  private OmniApiGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.OmniApi";

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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ArchiveCampaign"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateCampaign"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetCampaignById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "PauseCampaign"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ResumeCampaign"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateCampaign"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateCampaignPacingSpeed"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "SendOmniMessage"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ManagerSendOmniMessage"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateDisposition"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteDisposition"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListDispositions"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateDisposition"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListCustomUnsubscribeLinks"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateCustomUnsubscribeLink"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateCustomUnsubscribeLink"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteCustomUnsubscribeLink"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListCampaigns"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ManagerListMessages"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListMessages"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ManagerListConversations"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListContactLists"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetAvailableHeaders"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetTask"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListTasks"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateConnectedInbox"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteConnectedInboxBySid"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetConnectedInboxBySid"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "PerformSendgridAccountChecks"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListConnectedInboxes"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "TestConnectedInbox"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateConnectedInbox"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateVerifiedEmail"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteVerifiedEmail"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetVerifiedEmailBySid"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListVerifiedEmails"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ResendVerifiedEmail"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateVerifiedEmail"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetPendingGoogleXOAuth2Data"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "SendEmailNotification"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "SendFeedbackEmail"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetOmniAttachment"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateTasks"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateSignature"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteSignature"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListSignatures"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateSignature"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "SuggestResponse"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateProject"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListProjects"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "EditProjectById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CloseProjectById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetProjectById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateCannedMessage"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListCannedMessages"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateCannedMessage"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetCannedMessageById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteCannedMessageById"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "CreateCannedMessageGroup"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListCannedMessageGroups"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "UpdateCannedMessageGroup"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "DeleteCannedMessageGroup"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "ListCannedMessagesByGroupId"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.OmniApi", "GetCannedMessageGroupById"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OmniApiStub newStub(io.grpc.Channel channel) {
    return new OmniApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OmniApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OmniApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OmniApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OmniApiFutureStub(channel);
  }

  /**
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static abstract class OmniApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public void archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> responseObserver) {
      asyncUnimplementedUnaryCall(getArchiveCampaignMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public void getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public void pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public void resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> responseObserver) {
      asyncUnimplementedUnaryCall(getResumeCampaignMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public void updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCampaignPacingSpeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOmniMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getManagerSendOmniMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public void createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public void deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public void listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListDispositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public void updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDispositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public void listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCustomUnsubscribeLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public void createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomUnsubscribeLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public void updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCustomUnsubscribeLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public void deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCustomUnsubscribeLinkMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a stream of new conversation message for a given conversation. Used
     * only for managers. It is not for customers.
     * </pre>
     */
    public void managerListMessages(com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getManagerListMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a stream of conversation message for a given conversation. Used
     * only for agents/users. It is not for customers.
     * </pre>
     */
    public void listMessages(com.tcn.cloud.api.api.v0alpha.ListMessagesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getListMessagesMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getManagerListConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public void listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListContactListsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetAvailableHeadersMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetTaskMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListTasksMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateConnectedInboxMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteConnectedInboxBySidMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetConnectedInboxBySidMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getPerformSendgridAccountChecksMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListConnectedInboxesMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getTestConnectedInboxMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateConnectedInboxMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateVerifiedEmailMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteVerifiedEmailMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetVerifiedEmailBySidMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListVerifiedEmailsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getResendVerifiedEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public void updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVerifiedEmailMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetPendingGoogleXOAuth2DataMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getSendEmailNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public void sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSendFeedbackEmailMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetOmniAttachmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public void createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTasksMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateSignatureMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteSignatureMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListSignaturesMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateSignatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public void suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSuggestResponseMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListProjectsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getEditProjectByIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCloseProjectByIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetProjectByIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateCannedMessageMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListCannedMessagesMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateCannedMessageMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetCannedMessageByIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteCannedMessageByIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getCreateCannedMessageGroupMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListCannedMessageGroupsMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getUpdateCannedMessageGroupMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getDeleteCannedMessageGroupMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getListCannedMessagesByGroupIdMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getGetCannedMessageGroupByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getArchiveCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq,
                com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes>(
                  this, METHODID_ARCHIVE_CAMPAIGN)))
          .addMethod(
            getCreateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateCampaignReq,
                com.tcn.cloud.api.api.commons.OmniCampaign>(
                  this, METHODID_CREATE_CAMPAIGN)))
          .addMethod(
            getGetCampaignByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq,
                com.tcn.cloud.api.api.commons.OmniCampaign>(
                  this, METHODID_GET_CAMPAIGN_BY_ID)))
          .addMethod(
            getPauseCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.PauseCampaignReq,
                com.tcn.cloud.api.api.v0alpha.PauseCampaignRes>(
                  this, METHODID_PAUSE_CAMPAIGN)))
          .addMethod(
            getResumeCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq,
                com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes>(
                  this, METHODID_RESUME_CAMPAIGN)))
          .addMethod(
            getUpdateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCampaignReq,
                com.tcn.cloud.api.api.v0alpha.UpdateCampaignRes>(
                  this, METHODID_UPDATE_CAMPAIGN)))
          .addMethod(
            getUpdateCampaignPacingSpeedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq,
                com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes>(
                  this, METHODID_UPDATE_CAMPAIGN_PACING_SPEED)))
          .addMethod(
            getSendOmniMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_SEND_OMNI_MESSAGE)))
          .addMethod(
            getManagerSendOmniMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_MANAGER_SEND_OMNI_MESSAGE)))
          .addMethod(
            getCreateDispositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateDispositionReq,
                com.tcn.cloud.api.api.v0alpha.CreateDispositionRes>(
                  this, METHODID_CREATE_DISPOSITION)))
          .addMethod(
            getDeleteDispositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_DELETE_DISPOSITION)))
          .addMethod(
            getListDispositionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListDispositionsReq,
                com.tcn.cloud.api.api.v0alpha.ListDispositionsRes>(
                  this, METHODID_LIST_DISPOSITIONS)))
          .addMethod(
            getUpdateDispositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_UPDATE_DISPOSITION)))
          .addMethod(
            getListCustomUnsubscribeLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.commons.Empty,
                com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes>(
                  this, METHODID_LIST_CUSTOM_UNSUBSCRIBE_LINKS)))
          .addMethod(
            getCreateCustomUnsubscribeLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink,
                com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes>(
                  this, METHODID_CREATE_CUSTOM_UNSUBSCRIBE_LINK)))
          .addMethod(
            getUpdateCustomUnsubscribeLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq,
                com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes>(
                  this, METHODID_UPDATE_CUSTOM_UNSUBSCRIBE_LINK)))
          .addMethod(
            getDeleteCustomUnsubscribeLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_DELETE_CUSTOM_UNSUBSCRIBE_LINK)))
          .addMethod(
            getListCampaignsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCampaignsReq,
                com.tcn.cloud.api.api.v0alpha.ListCampaignsRes>(
                  this, METHODID_LIST_CAMPAIGNS)))
          .addMethod(
            getManagerListMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ManagerListMessagesReq,
                com.tcn.cloud.api.api.commons.OmniMessage>(
                  this, METHODID_MANAGER_LIST_MESSAGES)))
          .addMethod(
            getListMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListMessagesReq,
                com.tcn.cloud.api.api.commons.OmniMessage>(
                  this, METHODID_LIST_MESSAGES)))
          .addMethod(
            getManagerListConversationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListConversationsReq,
                com.tcn.cloud.api.api.v0alpha.ListConversationsRes>(
                  this, METHODID_MANAGER_LIST_CONVERSATIONS)))
          .addMethod(
            getListContactListsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListContactListsReq,
                com.tcn.cloud.api.api.v0alpha.ListContactListsRes>(
                  this, METHODID_LIST_CONTACT_LISTS)))
          .addMethod(
            getGetAvailableHeadersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersReq,
                com.tcn.cloud.api.api.v0alpha.GetAvailableHeadersRes>(
                  this, METHODID_GET_AVAILABLE_HEADERS)))
          .addMethod(
            getGetTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetTaskReq,
                com.tcn.cloud.api.api.commons.OmniTask>(
                  this, METHODID_GET_TASK)))
          .addMethod(
            getListTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListTasksReq,
                com.tcn.cloud.api.api.v0alpha.ListTasksRes>(
                  this, METHODID_LIST_TASKS)))
          .addMethod(
            getCreateConnectedInboxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.commons.ConnectedInbox,
                com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes>(
                  this, METHODID_CREATE_CONNECTED_INBOX)))
          .addMethod(
            getDeleteConnectedInboxBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteConnectedInboxBySidReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_DELETE_CONNECTED_INBOX_BY_SID)))
          .addMethod(
            getGetConnectedInboxBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConnectedInboxBySidReq,
                com.tcn.cloud.api.api.commons.ConnectedInbox>(
                  this, METHODID_GET_CONNECTED_INBOX_BY_SID)))
          .addMethod(
            getPerformSendgridAccountChecksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientReq,
                com.tcn.cloud.api.api.v0alpha.SendgridAccountByClientRes>(
                  this, METHODID_PERFORM_SENDGRID_ACCOUNT_CHECKS)))
          .addMethod(
            getListConnectedInboxesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesReq,
                com.tcn.cloud.api.api.v0alpha.ListConnectedInboxesRes>(
                  this, METHODID_LIST_CONNECTED_INBOXES)))
          .addMethod(
            getTestConnectedInboxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.commons.ConnectedInbox,
                com.tcn.cloud.api.api.v0alpha.TestConnectedInboxRes>(
                  this, METHODID_TEST_CONNECTED_INBOX)))
          .addMethod(
            getUpdateConnectedInboxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateConnectedInboxReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_UPDATE_CONNECTED_INBOX)))
          .addMethod(
            getCreateVerifiedEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.commons.VerifiedEmail,
                com.tcn.cloud.api.api.v0alpha.CreateVerifiedEmailRes>(
                  this, METHODID_CREATE_VERIFIED_EMAIL)))
          .addMethod(
            getDeleteVerifiedEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteVerifiedEmailReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_DELETE_VERIFIED_EMAIL)))
          .addMethod(
            getGetVerifiedEmailBySidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetVerifiedEmailBySidReq,
                com.tcn.cloud.api.api.commons.VerifiedEmail>(
                  this, METHODID_GET_VERIFIED_EMAIL_BY_SID)))
          .addMethod(
            getListVerifiedEmailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsReq,
                com.tcn.cloud.api.api.v0alpha.ListVerifiedEmailsRes>(
                  this, METHODID_LIST_VERIFIED_EMAILS)))
          .addMethod(
            getResendVerifiedEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailReq,
                com.tcn.cloud.api.api.v0alpha.ResendVerifiedEmailRes>(
                  this, METHODID_RESEND_VERIFIED_EMAIL)))
          .addMethod(
            getUpdateVerifiedEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq,
                com.tcn.cloud.api.api.commons.Empty>(
                  this, METHODID_UPDATE_VERIFIED_EMAIL)))
          .addMethod(
            getGetPendingGoogleXOAuth2DataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataReq,
                com.tcn.cloud.api.api.v0alpha.GetPendingGoogleXOAuth2DataRes>(
                  this, METHODID_GET_PENDING_GOOGLE_XOAUTH2DATA)))
          .addMethod(
            getSendEmailNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendEmailNotificationReq,
                com.tcn.cloud.api.api.v0alpha.SendEmailNotificationRes>(
                  this, METHODID_SEND_EMAIL_NOTIFICATION)))
          .addMethod(
            getSendFeedbackEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq,
                com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes>(
                  this, METHODID_SEND_FEEDBACK_EMAIL)))
          .addMethod(
            getGetOmniAttachmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq,
                com.tcn.cloud.api.api.commons.OmniAttachment>(
                  this, METHODID_GET_OMNI_ATTACHMENT)))
          .addMethod(
            getCreateTasksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateTasksReq,
                com.tcn.cloud.api.api.v0alpha.CreateTasksRes>(
                  this, METHODID_CREATE_TASKS)))
          .addMethod(
            getCreateSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateSignatureReq,
                com.tcn.cloud.api.api.v0alpha.CreateSignatureRes>(
                  this, METHODID_CREATE_SIGNATURE)))
          .addMethod(
            getDeleteSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteSignatureReq,
                com.tcn.cloud.api.api.v0alpha.DeleteSignatureRes>(
                  this, METHODID_DELETE_SIGNATURE)))
          .addMethod(
            getListSignaturesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSignaturesReq,
                com.tcn.cloud.api.api.v0alpha.ListSignaturesRes>(
                  this, METHODID_LIST_SIGNATURES)))
          .addMethod(
            getUpdateSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateSignatureReq,
                com.tcn.cloud.api.api.v0alpha.UpdateSignatureRes>(
                  this, METHODID_UPDATE_SIGNATURE)))
          .addMethod(
            getSuggestResponseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SuggestResponseReq,
                com.tcn.cloud.api.api.v0alpha.SuggestResponseRes>(
                  this, METHODID_SUGGEST_RESPONSE)))
          .addMethod(
            getCreateProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateProjectReq,
                com.tcn.cloud.api.api.v0alpha.CreateProjectRes>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getListProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListProjectsReq,
                com.tcn.cloud.api.api.v0alpha.ListProjectsRes>(
                  this, METHODID_LIST_PROJECTS)))
          .addMethod(
            getEditProjectByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.EditProjectByIdReq,
                com.tcn.cloud.api.api.v0alpha.EditProjectByIdRes>(
                  this, METHODID_EDIT_PROJECT_BY_ID)))
          .addMethod(
            getCloseProjectByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CloseProjectByIdReq,
                com.tcn.cloud.api.api.v0alpha.CloseProjectByIdRes>(
                  this, METHODID_CLOSE_PROJECT_BY_ID)))
          .addMethod(
            getGetProjectByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetProjectByIdReq,
                com.tcn.cloud.api.api.v0alpha.Project>(
                  this, METHODID_GET_PROJECT_BY_ID)))
          .addMethod(
            getCreateCannedMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateCannedMessageReq,
                com.tcn.cloud.api.api.v0alpha.CannedMessage>(
                  this, METHODID_CREATE_CANNED_MESSAGE)))
          .addMethod(
            getListCannedMessagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCannedMessagesReq,
                com.tcn.cloud.api.api.v0alpha.ListCannedMessagesRes>(
                  this, METHODID_LIST_CANNED_MESSAGES)))
          .addMethod(
            getUpdateCannedMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageReq,
                com.tcn.cloud.api.api.v0alpha.CannedMessage>(
                  this, METHODID_UPDATE_CANNED_MESSAGE)))
          .addMethod(
            getGetCannedMessageByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCannedMessageByIdReq,
                com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup>(
                  this, METHODID_GET_CANNED_MESSAGE_BY_ID)))
          .addMethod(
            getDeleteCannedMessageByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdReq,
                com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageByIdRes>(
                  this, METHODID_DELETE_CANNED_MESSAGE_BY_ID)))
          .addMethod(
            getCreateCannedMessageGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateCannedMessageGroupReq,
                com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>(
                  this, METHODID_CREATE_CANNED_MESSAGE_GROUP)))
          .addMethod(
            getListCannedMessageGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListCannedMessageGroupsRes>(
                  this, METHODID_LIST_CANNED_MESSAGE_GROUPS)))
          .addMethod(
            getUpdateCannedMessageGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateCannedMessageGroupRes>(
                  this, METHODID_UPDATE_CANNED_MESSAGE_GROUP)))
          .addMethod(
            getDeleteCannedMessageGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupReq,
                com.tcn.cloud.api.api.v0alpha.DeleteCannedMessageGroupRes>(
                  this, METHODID_DELETE_CANNED_MESSAGE_GROUP)))
          .addMethod(
            getListCannedMessagesByGroupIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdReq,
                com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes>(
                  this, METHODID_LIST_CANNED_MESSAGES_BY_GROUP_ID)))
          .addMethod(
            getGetCannedMessageGroupByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCannedMessageGroupByIdReq,
                com.tcn.cloud.api.api.v0alpha.CannedMessageGroup>(
                  this, METHODID_GET_CANNED_MESSAGE_GROUP_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiStub extends io.grpc.stub.AbstractStub<OmniApiStub> {
    private OmniApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmniApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmniApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public void archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public void getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniCampaign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public void pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public void resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public void updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignPacingSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOmniMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public void managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getManagerSendOmniMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public void createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public void deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public void listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDispositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public void updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDispositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public void listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCustomUnsubscribeLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public void createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomUnsubscribeLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public void updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCustomUnsubscribeLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public void deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncServerStreamingCall(
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
      asyncServerStreamingCall(
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
      asyncUnaryCall(
          getChannel().newCall(getManagerListConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public void listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getGetAvailableHeadersMethod(), getCallOptions()), request, responseObserver);
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request, responseObserver);
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getResendVerifiedEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public void updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Empty> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public void sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getGetOmniAttachmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public void createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public void suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> responseObserver) {
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
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
      asyncUnaryCall(
          getChannel().newCall(getGetCannedMessageGroupByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiBlockingStub extends io.grpc.stub.AbstractStub<OmniApiBlockingStub> {
    private OmniApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmniApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmniApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes archiveCampaign(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign getCampaignById(com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.PauseCampaignRes pauseCampaign(com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request) {
      return blockingUnaryCall(
          getChannel(), getPauseCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes resumeCampaign(com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getUpdateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes updateCampaignPacingSpeed(com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCampaignPacingSpeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty sendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getSendOmniMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty managerSendOmniMessage(com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getManagerSendOmniMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateDispositionRes createDisposition(com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteDisposition(com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListDispositionsRes listDispositions(com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListDispositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty updateDisposition(com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDispositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes listCustomUnsubscribeLinks(com.tcn.cloud.api.api.commons.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListCustomUnsubscribeLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes createCustomUnsubscribeLink(com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomUnsubscribeLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes updateCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCustomUnsubscribeLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty deleteCustomUnsubscribeLink(com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingServerStreamingCall(
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
      return blockingServerStreamingCall(
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
      return blockingUnaryCall(
          getChannel(), getManagerListConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactListsRes listContactLists(com.tcn.cloud.api.api.v0alpha.ListContactListsReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getGetAvailableHeadersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTask - retrieves a task using the provided criteria
     * Required permissions:
     *    OMNI_AGENT
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.OmniTask getTask(com.tcn.cloud.api.api.v0alpha.GetTaskReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getListTasksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateConnectedInbox - create a new connected inbox
     * Required permissions:
     *    OMNI_BOSS
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateConnectedInboxRes createConnectedInbox(com.tcn.cloud.api.api.commons.ConnectedInbox request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getResendVerifiedEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Empty updateVerifiedEmail(com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getSendEmailNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes sendFeedbackEmail(com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getGetOmniAttachmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateTasksRes createTasks(com.tcn.cloud.api.api.v0alpha.CreateTasksReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getUpdateSignatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SuggestResponseRes suggestResponse(com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request) {
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
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
      return blockingUnaryCall(
          getChannel(), getGetCannedMessageGroupByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service for interacting with TCN's Omni API system.
   * Accessing all of the methods require an authenticated user with the correct
   * permissions.
   * </pre>
   */
  public static final class OmniApiFutureStub extends io.grpc.stub.AbstractStub<OmniApiFutureStub> {
    private OmniApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OmniApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OmniApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OmniApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * archive a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ArchiveCampaignRes> archiveCampaign(
        com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get campaign defined by GetChatCampaignById.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.OmniCampaign> getCampaignById(
        com.tcn.cloud.api.api.v0alpha.GetCampaignByIdReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * pause a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PauseCampaignRes> pauseCampaign(
        com.tcn.cloud.api.api.v0alpha.PauseCampaignReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * resume a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ResumeCampaignRes> resumeCampaign(
        com.tcn.cloud.api.api.v0alpha.ResumeCampaignReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update campaign pacing - speed up/slow down a campaign
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedRes> updateCampaignPacingSpeed(
        com.tcn.cloud.api.api.v0alpha.UpdateCampaignPacingSpeedReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCampaignPacingSpeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> sendOmniMessage(
        com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOmniMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send a chat message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> managerSendOmniMessage(
        com.tcn.cloud.api.api.v0alpha.SendOmniMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getManagerSendOmniMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateDispositionRes> createDisposition(
        com.tcn.cloud.api.api.v0alpha.CreateDispositionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteDisposition - delete an existing disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteDisposition(
        com.tcn.cloud.api.api.v0alpha.DeleteDispositionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDispositions - lists all dispositions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListDispositionsRes> listDispositions(
        com.tcn.cloud.api.api.v0alpha.ListDispositionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListDispositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateDisposition - update an existing disposition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> updateDisposition(
        com.tcn.cloud.api.api.v0alpha.UpdateDispositionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDispositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCustomUnsubscribeLinks - retrieves all the custom unsubscribe links
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCustomUnsubscribeLinksRes> listCustomUnsubscribeLinks(
        com.tcn.cloud.api.api.commons.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListCustomUnsubscribeLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateUnsubscribeLink - creates a new unsubscribe link
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes> createCustomUnsubscribeLink(
        com.tcn.cloud.api.api.commons.OmniCustomUnsubscribeLink request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomUnsubscribeLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCustomUnsubscribeLink - update custom unsubscribe link details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkRes> updateCustomUnsubscribeLink(
        com.tcn.cloud.api.api.v0alpha.UpdateCustomUnsubscribeLinkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCustomUnsubscribeLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCustomUnsubscribeLink - deletes custom unsubscribe link details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> deleteCustomUnsubscribeLink(
        com.tcn.cloud.api.api.v0alpha.DeleteCustomUnsubscribeLinkReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getManagerListConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListContactLists - retrieves all the contact lists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactListsRes> listContactLists(
        com.tcn.cloud.api.api.v0alpha.ListContactListsReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getGetAvailableHeadersMethod(), getCallOptions()), request);
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getListTasksMethod(), getCallOptions()), request);
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getResendVerifiedEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates verified email description
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Empty> updateVerifiedEmail(
        com.tcn.cloud.api.api.v0alpha.UpdateVerifiedEmailReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send an email to our feedback system. The users email will be populated as the from address to open an email thread with our support.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailRes> sendFeedbackEmail(
        com.tcn.cloud.api.api.v0alpha.SendFeedbackEmailReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getGetOmniAttachmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a task with a given contat list .
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateTasksRes> createTasks(
        com.tcn.cloud.api.api.v0alpha.CreateTasksReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getUpdateSignatureMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SuggestResponse
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SuggestResponseRes> suggestResponse(
        com.tcn.cloud.api.api.v0alpha.SuggestResponseReq request) {
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
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
      return futureUnaryCall(
          getChannel().newCall(getGetCannedMessageGroupByIdMethod(), getCallOptions()), request);
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
  private static final int METHODID_GET_TASK = 23;
  private static final int METHODID_LIST_TASKS = 24;
  private static final int METHODID_CREATE_CONNECTED_INBOX = 25;
  private static final int METHODID_DELETE_CONNECTED_INBOX_BY_SID = 26;
  private static final int METHODID_GET_CONNECTED_INBOX_BY_SID = 27;
  private static final int METHODID_PERFORM_SENDGRID_ACCOUNT_CHECKS = 28;
  private static final int METHODID_LIST_CONNECTED_INBOXES = 29;
  private static final int METHODID_TEST_CONNECTED_INBOX = 30;
  private static final int METHODID_UPDATE_CONNECTED_INBOX = 31;
  private static final int METHODID_CREATE_VERIFIED_EMAIL = 32;
  private static final int METHODID_DELETE_VERIFIED_EMAIL = 33;
  private static final int METHODID_GET_VERIFIED_EMAIL_BY_SID = 34;
  private static final int METHODID_LIST_VERIFIED_EMAILS = 35;
  private static final int METHODID_RESEND_VERIFIED_EMAIL = 36;
  private static final int METHODID_UPDATE_VERIFIED_EMAIL = 37;
  private static final int METHODID_GET_PENDING_GOOGLE_XOAUTH2DATA = 38;
  private static final int METHODID_SEND_EMAIL_NOTIFICATION = 39;
  private static final int METHODID_SEND_FEEDBACK_EMAIL = 40;
  private static final int METHODID_GET_OMNI_ATTACHMENT = 41;
  private static final int METHODID_CREATE_TASKS = 42;
  private static final int METHODID_CREATE_SIGNATURE = 43;
  private static final int METHODID_DELETE_SIGNATURE = 44;
  private static final int METHODID_LIST_SIGNATURES = 45;
  private static final int METHODID_UPDATE_SIGNATURE = 46;
  private static final int METHODID_SUGGEST_RESPONSE = 47;
  private static final int METHODID_CREATE_PROJECT = 48;
  private static final int METHODID_LIST_PROJECTS = 49;
  private static final int METHODID_EDIT_PROJECT_BY_ID = 50;
  private static final int METHODID_CLOSE_PROJECT_BY_ID = 51;
  private static final int METHODID_GET_PROJECT_BY_ID = 52;
  private static final int METHODID_CREATE_CANNED_MESSAGE = 53;
  private static final int METHODID_LIST_CANNED_MESSAGES = 54;
  private static final int METHODID_UPDATE_CANNED_MESSAGE = 55;
  private static final int METHODID_GET_CANNED_MESSAGE_BY_ID = 56;
  private static final int METHODID_DELETE_CANNED_MESSAGE_BY_ID = 57;
  private static final int METHODID_CREATE_CANNED_MESSAGE_GROUP = 58;
  private static final int METHODID_LIST_CANNED_MESSAGE_GROUPS = 59;
  private static final int METHODID_UPDATE_CANNED_MESSAGE_GROUP = 60;
  private static final int METHODID_DELETE_CANNED_MESSAGE_GROUP = 61;
  private static final int METHODID_LIST_CANNED_MESSAGES_BY_GROUP_ID = 62;
  private static final int METHODID_GET_CANNED_MESSAGE_GROUP_BY_ID = 63;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OmniApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OmniApiImplBase serviceImpl, int methodId) {
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
        case METHODID_GET_TASK:
          serviceImpl.getTask((com.tcn.cloud.api.api.v0alpha.GetTaskReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.OmniTask>) responseObserver);
          break;
        case METHODID_LIST_TASKS:
          serviceImpl.listTasks((com.tcn.cloud.api.api.v0alpha.ListTasksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTasksRes>) responseObserver);
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
    private final String methodName;

    OmniApiMethodDescriptorSupplier(String methodName) {
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
              .addMethod(getGetTaskMethod())
              .addMethod(getListTasksMethod())
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
              .build();
        }
      }
    }
    return result;
  }
}
