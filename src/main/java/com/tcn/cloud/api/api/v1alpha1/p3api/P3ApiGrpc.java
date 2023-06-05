package com.tcn.cloud.api.api.v1alpha1.p3api;

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
    comments = "Source: api/v1alpha1/p3api/service.proto")
public final class P3ApiGrpc {

  private P3ApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.p3api.P3Api";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.HuntGroup> getGetAgentHuntGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentHuntGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.HuntGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.HuntGroup> getGetAgentHuntGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq, com.tcn.cloud.api.api.v0alpha.HuntGroup> getGetAgentHuntGroupMethod;
    if ((getGetAgentHuntGroupMethod = P3ApiGrpc.getGetAgentHuntGroupMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetAgentHuntGroupMethod = P3ApiGrpc.getGetAgentHuntGroupMethod) == null) {
          P3ApiGrpc.getGetAgentHuntGroupMethod = getGetAgentHuntGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq, com.tcn.cloud.api.api.v0alpha.HuntGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetAgentHuntGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HuntGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetAgentHuntGroup"))
                  .build();
          }
        }
     }
     return getGetAgentHuntGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq,
      com.tcn.cloud.api.api.v0alpha.AgentSession> getGetAgentSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentSession",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentSession.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq,
      com.tcn.cloud.api.api.v0alpha.AgentSession> getGetAgentSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq, com.tcn.cloud.api.api.v0alpha.AgentSession> getGetAgentSessionMethod;
    if ((getGetAgentSessionMethod = P3ApiGrpc.getGetAgentSessionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetAgentSessionMethod = P3ApiGrpc.getGetAgentSessionMethod) == null) {
          P3ApiGrpc.getGetAgentSessionMethod = getGetAgentSessionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq, com.tcn.cloud.api.api.v0alpha.AgentSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetAgentSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentSession.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetAgentSession"))
                  .build();
          }
        }
     }
     return getGetAgentSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> getGetAgentSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> getGetAgentSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq, com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> getGetAgentSkillsMethod;
    if ((getGetAgentSkillsMethod = P3ApiGrpc.getGetAgentSkillsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetAgentSkillsMethod = P3ApiGrpc.getGetAgentSkillsMethod) == null) {
          P3ApiGrpc.getGetAgentSkillsMethod = getGetAgentSkillsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq, com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetAgentSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetAgentSkills"))
                  .build();
          }
        }
     }
     return getGetAgentSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> getCreateAgentSkillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentSkill",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> getCreateAgentSkillMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq, com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> getCreateAgentSkillMethod;
    if ((getCreateAgentSkillMethod = P3ApiGrpc.getCreateAgentSkillMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateAgentSkillMethod = P3ApiGrpc.getCreateAgentSkillMethod) == null) {
          P3ApiGrpc.getCreateAgentSkillMethod = getCreateAgentSkillMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq, com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateAgentSkill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateAgentSkill"))
                  .build();
          }
        }
     }
     return getCreateAgentSkillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> getUpdateAgentSkillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentSkill",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> getUpdateAgentSkillMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> getUpdateAgentSkillMethod;
    if ((getUpdateAgentSkillMethod = P3ApiGrpc.getUpdateAgentSkillMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateAgentSkillMethod = P3ApiGrpc.getUpdateAgentSkillMethod) == null) {
          P3ApiGrpc.getUpdateAgentSkillMethod = getUpdateAgentSkillMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateAgentSkill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateAgentSkill"))
                  .build();
          }
        }
     }
     return getUpdateAgentSkillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> getDeleteAgentSkillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentSkill",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq,
      com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> getDeleteAgentSkillMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq, com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> getDeleteAgentSkillMethod;
    if ((getDeleteAgentSkillMethod = P3ApiGrpc.getDeleteAgentSkillMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeleteAgentSkillMethod = P3ApiGrpc.getDeleteAgentSkillMethod) == null) {
          P3ApiGrpc.getDeleteAgentSkillMethod = getDeleteAgentSkillMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq, com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeleteAgentSkill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeleteAgentSkill"))
                  .build();
          }
        }
     }
     return getDeleteAgentSkillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq,
      com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> getListSkillsForCurrentAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkillsForCurrentAgent",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq,
      com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> getListSkillsForCurrentAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq, com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> getListSkillsForCurrentAgentMethod;
    if ((getListSkillsForCurrentAgentMethod = P3ApiGrpc.getListSkillsForCurrentAgentMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListSkillsForCurrentAgentMethod = P3ApiGrpc.getListSkillsForCurrentAgentMethod) == null) {
          P3ApiGrpc.getListSkillsForCurrentAgentMethod = getListSkillsForCurrentAgentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq, com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListSkillsForCurrentAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListSkillsForCurrentAgent"))
                  .build();
          }
        }
     }
     return getListSkillsForCurrentAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListSkillsRes> getListSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListSkillsRes> getListSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSkillsReq, com.tcn.cloud.api.api.v0alpha.ListSkillsRes> getListSkillsMethod;
    if ((getListSkillsMethod = P3ApiGrpc.getListSkillsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListSkillsMethod = P3ApiGrpc.getListSkillsMethod) == null) {
          P3ApiGrpc.getListSkillsMethod = getListSkillsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSkillsReq, com.tcn.cloud.api.api.v0alpha.ListSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSkillsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListSkills"))
                  .build();
          }
        }
     }
     return getListSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> getUpdateAgentSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> getUpdateAgentSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> getUpdateAgentSkillsMethod;
    if ((getUpdateAgentSkillsMethod = P3ApiGrpc.getUpdateAgentSkillsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateAgentSkillsMethod = P3ApiGrpc.getUpdateAgentSkillsMethod) == null) {
          P3ApiGrpc.getUpdateAgentSkillsMethod = getUpdateAgentSkillsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateAgentSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateAgentSkills"))
                  .build();
          }
        }
     }
     return getUpdateAgentSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq,
      com.tcn.cloud.api.api.v0alpha.Agent> getGetCurrentAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentAgent",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Agent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq,
      com.tcn.cloud.api.api.v0alpha.Agent> getGetCurrentAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq, com.tcn.cloud.api.api.v0alpha.Agent> getGetCurrentAgentMethod;
    if ((getGetCurrentAgentMethod = P3ApiGrpc.getGetCurrentAgentMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetCurrentAgentMethod = P3ApiGrpc.getGetCurrentAgentMethod) == null) {
          P3ApiGrpc.getGetCurrentAgentMethod = getGetCurrentAgentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq, com.tcn.cloud.api.api.v0alpha.Agent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetCurrentAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Agent.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetCurrentAgent"))
                  .build();
          }
        }
     }
     return getGetCurrentAgentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> getGetClientInfoDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientInfoData",
      requestType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> getGetClientInfoDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq, com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> getGetClientInfoDataMethod;
    if ((getGetClientInfoDataMethod = P3ApiGrpc.getGetClientInfoDataMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetClientInfoDataMethod = P3ApiGrpc.getGetClientInfoDataMethod) == null) {
          P3ApiGrpc.getGetClientInfoDataMethod = getGetClientInfoDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq, com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetClientInfoData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetClientInfoData"))
                  .build();
          }
        }
     }
     return getGetClientInfoDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> getGetClientInfoDisplayTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientInfoDisplayTemplate",
      requestType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq,
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> getGetClientInfoDisplayTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> getGetClientInfoDisplayTemplateMethod;
    if ((getGetClientInfoDisplayTemplateMethod = P3ApiGrpc.getGetClientInfoDisplayTemplateMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetClientInfoDisplayTemplateMethod = P3ApiGrpc.getGetClientInfoDisplayTemplateMethod) == null) {
          P3ApiGrpc.getGetClientInfoDisplayTemplateMethod = getGetClientInfoDisplayTemplateMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetClientInfoDisplayTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetClientInfoDisplayTemplate"))
                  .build();
          }
        }
     }
     return getGetClientInfoDisplayTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> getListAgentStatisticsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentStatisticsData",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> getListAgentStatisticsDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq, com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> getListAgentStatisticsDataMethod;
    if ((getListAgentStatisticsDataMethod = P3ApiGrpc.getListAgentStatisticsDataMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentStatisticsDataMethod = P3ApiGrpc.getListAgentStatisticsDataMethod) == null) {
          P3ApiGrpc.getListAgentStatisticsDataMethod = getListAgentStatisticsDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq, com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentStatisticsData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentStatisticsData"))
                  .build();
          }
        }
     }
     return getListAgentStatisticsDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> getListPBXExtensionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPBXExtensions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> getListPBXExtensionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> getListPBXExtensionsMethod;
    if ((getListPBXExtensionsMethod = P3ApiGrpc.getListPBXExtensionsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListPBXExtensionsMethod = P3ApiGrpc.getListPBXExtensionsMethod) == null) {
          P3ApiGrpc.getListPBXExtensionsMethod = getListPBXExtensionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListPBXExtensions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListPBXExtensions"))
                  .build();
          }
        }
     }
     return getListPBXExtensionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> getListAgentExtensionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentExtensions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> getListAgentExtensionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> getListAgentExtensionsMethod;
    if ((getListAgentExtensionsMethod = P3ApiGrpc.getListAgentExtensionsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentExtensionsMethod = P3ApiGrpc.getListAgentExtensionsMethod) == null) {
          P3ApiGrpc.getListAgentExtensionsMethod = getListAgentExtensionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentExtensions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentExtensions"))
                  .build();
          }
        }
     }
     return getListAgentExtensionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> getListHuntGroupExtensionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupExtensions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> getListHuntGroupExtensionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> getListHuntGroupExtensionsMethod;
    if ((getListHuntGroupExtensionsMethod = P3ApiGrpc.getListHuntGroupExtensionsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListHuntGroupExtensionsMethod = P3ApiGrpc.getListHuntGroupExtensionsMethod) == null) {
          P3ApiGrpc.getListHuntGroupExtensionsMethod = getListHuntGroupExtensionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListHuntGroupExtensions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListHuntGroupExtensions"))
                  .build();
          }
        }
     }
     return getListHuntGroupExtensionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateExtensionReq,
      com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> getCreateExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateExtensionReq,
      com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> getCreateExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateExtensionReq, com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> getCreateExtensionMethod;
    if ((getCreateExtensionMethod = P3ApiGrpc.getCreateExtensionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateExtensionMethod = P3ApiGrpc.getCreateExtensionMethod) == null) {
          P3ApiGrpc.getCreateExtensionMethod = getCreateExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateExtensionReq, com.tcn.cloud.api.api.v0alpha.CreateExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateExtension"))
                  .build();
          }
        }
     }
     return getCreateExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq,
      com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> getDeleteExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq,
      com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> getDeleteExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq, com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> getDeleteExtensionMethod;
    if ((getDeleteExtensionMethod = P3ApiGrpc.getDeleteExtensionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeleteExtensionMethod = P3ApiGrpc.getDeleteExtensionMethod) == null) {
          P3ApiGrpc.getDeleteExtensionMethod = getDeleteExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq, com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeleteExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeleteExtension"))
                  .build();
          }
        }
     }
     return getDeleteExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> getUpdateExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> getUpdateExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> getUpdateExtensionMethod;
    if ((getUpdateExtensionMethod = P3ApiGrpc.getUpdateExtensionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateExtensionMethod = P3ApiGrpc.getUpdateExtensionMethod) == null) {
          P3ApiGrpc.getUpdateExtensionMethod = getUpdateExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateExtension"))
                  .build();
          }
        }
     }
     return getUpdateExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> getUpdatePBXExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePBXExtension",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> getUpdatePBXExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> getUpdatePBXExtensionMethod;
    if ((getUpdatePBXExtensionMethod = P3ApiGrpc.getUpdatePBXExtensionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdatePBXExtensionMethod = P3ApiGrpc.getUpdatePBXExtensionMethod) == null) {
          P3ApiGrpc.getUpdatePBXExtensionMethod = getUpdatePBXExtensionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq, com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdatePBXExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdatePBXExtension"))
                  .build();
          }
        }
     }
     return getUpdatePBXExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq,
      com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> getCreateDNCLNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDNCLNumbers",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq,
      com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> getCreateDNCLNumbersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq, com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> getCreateDNCLNumbersMethod;
    if ((getCreateDNCLNumbersMethod = P3ApiGrpc.getCreateDNCLNumbersMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateDNCLNumbersMethod = P3ApiGrpc.getCreateDNCLNumbersMethod) == null) {
          P3ApiGrpc.getCreateDNCLNumbersMethod = getCreateDNCLNumbersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq, com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateDNCLNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateDNCLNumbers"))
                  .build();
          }
        }
     }
     return getCreateDNCLNumbersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq,
      com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> getGetScriptOrResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScriptOrResponses",
      requestType = com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq,
      com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> getGetScriptOrResponsesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq, com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> getGetScriptOrResponsesMethod;
    if ((getGetScriptOrResponsesMethod = P3ApiGrpc.getGetScriptOrResponsesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetScriptOrResponsesMethod = P3ApiGrpc.getGetScriptOrResponsesMethod) == null) {
          P3ApiGrpc.getGetScriptOrResponsesMethod = getGetScriptOrResponsesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq, com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetScriptOrResponses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetScriptOrResponses"))
                  .build();
          }
        }
     }
     return getGetScriptOrResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq,
      com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> getGetHuntGroupAgentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHuntGroupAgentSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq,
      com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> getGetHuntGroupAgentSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq, com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> getGetHuntGroupAgentSettingsMethod;
    if ((getGetHuntGroupAgentSettingsMethod = P3ApiGrpc.getGetHuntGroupAgentSettingsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetHuntGroupAgentSettingsMethod = P3ApiGrpc.getGetHuntGroupAgentSettingsMethod) == null) {
          P3ApiGrpc.getGetHuntGroupAgentSettingsMethod = getGetHuntGroupAgentSettingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq, com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetHuntGroupAgentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetHuntGroupAgentSettings"))
                  .build();
          }
        }
     }
     return getGetHuntGroupAgentSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> getListHuntGroupWebLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupWebLinks",
      requestType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> getListHuntGroupWebLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> getListHuntGroupWebLinksMethod;
    if ((getListHuntGroupWebLinksMethod = P3ApiGrpc.getListHuntGroupWebLinksMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListHuntGroupWebLinksMethod = P3ApiGrpc.getListHuntGroupWebLinksMethod) == null) {
          P3ApiGrpc.getListHuntGroupWebLinksMethod = getListHuntGroupWebLinksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListHuntGroupWebLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListHuntGroupWebLinks"))
                  .build();
          }
        }
     }
     return getListHuntGroupWebLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq,
      com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> getGetHuntGroupPauseCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHuntGroupPauseCodes",
      requestType = com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq,
      com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> getGetHuntGroupPauseCodesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq, com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> getGetHuntGroupPauseCodesMethod;
    if ((getGetHuntGroupPauseCodesMethod = P3ApiGrpc.getGetHuntGroupPauseCodesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetHuntGroupPauseCodesMethod = P3ApiGrpc.getGetHuntGroupPauseCodesMethod) == null) {
          P3ApiGrpc.getGetHuntGroupPauseCodesMethod = getGetHuntGroupPauseCodesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq, com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetHuntGroupPauseCodes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetHuntGroupPauseCodes"))
                  .build();
          }
        }
     }
     return getGetHuntGroupPauseCodesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> getListAgentCallHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentCallHistory",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> getListAgentCallHistoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> getListAgentCallHistoryMethod;
    if ((getListAgentCallHistoryMethod = P3ApiGrpc.getListAgentCallHistoryMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentCallHistoryMethod = P3ApiGrpc.getListAgentCallHistoryMethod) == null) {
          P3ApiGrpc.getListAgentCallHistoryMethod = getListAgentCallHistoryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentCallHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentCallHistory"))
                  .build();
          }
        }
     }
     return getListAgentCallHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> getListClientPhoneBookEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListClientPhoneBookEntries",
      requestType = com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> getListClientPhoneBookEntriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq, com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> getListClientPhoneBookEntriesMethod;
    if ((getListClientPhoneBookEntriesMethod = P3ApiGrpc.getListClientPhoneBookEntriesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListClientPhoneBookEntriesMethod = P3ApiGrpc.getListClientPhoneBookEntriesMethod) == null) {
          P3ApiGrpc.getListClientPhoneBookEntriesMethod = getListClientPhoneBookEntriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq, com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListClientPhoneBookEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListClientPhoneBookEntries"))
                  .build();
          }
        }
     }
     return getListClientPhoneBookEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> getListHuntGroupPhoneBookEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupPhoneBookEntries",
      requestType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> getListHuntGroupPhoneBookEntriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> getListHuntGroupPhoneBookEntriesMethod;
    if ((getListHuntGroupPhoneBookEntriesMethod = P3ApiGrpc.getListHuntGroupPhoneBookEntriesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListHuntGroupPhoneBookEntriesMethod = P3ApiGrpc.getListHuntGroupPhoneBookEntriesMethod) == null) {
          P3ApiGrpc.getListHuntGroupPhoneBookEntriesMethod = getListHuntGroupPhoneBookEntriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListHuntGroupPhoneBookEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListHuntGroupPhoneBookEntries"))
                  .build();
          }
        }
     }
     return getListHuntGroupPhoneBookEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> getCreatePhoneBookEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePhoneBookEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> getCreatePhoneBookEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> getCreatePhoneBookEntryMethod;
    if ((getCreatePhoneBookEntryMethod = P3ApiGrpc.getCreatePhoneBookEntryMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreatePhoneBookEntryMethod = P3ApiGrpc.getCreatePhoneBookEntryMethod) == null) {
          P3ApiGrpc.getCreatePhoneBookEntryMethod = getCreatePhoneBookEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreatePhoneBookEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreatePhoneBookEntry"))
                  .build();
          }
        }
     }
     return getCreatePhoneBookEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> getUpdatePhoneBookEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePhoneBookEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> getUpdatePhoneBookEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> getUpdatePhoneBookEntryMethod;
    if ((getUpdatePhoneBookEntryMethod = P3ApiGrpc.getUpdatePhoneBookEntryMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdatePhoneBookEntryMethod = P3ApiGrpc.getUpdatePhoneBookEntryMethod) == null) {
          P3ApiGrpc.getUpdatePhoneBookEntryMethod = getUpdatePhoneBookEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdatePhoneBookEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdatePhoneBookEntry"))
                  .build();
          }
        }
     }
     return getUpdatePhoneBookEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> getDeletePhoneBookEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePhoneBookEntry",
      requestType = com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq,
      com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> getDeletePhoneBookEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> getDeletePhoneBookEntryMethod;
    if ((getDeletePhoneBookEntryMethod = P3ApiGrpc.getDeletePhoneBookEntryMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeletePhoneBookEntryMethod = P3ApiGrpc.getDeletePhoneBookEntryMethod) == null) {
          P3ApiGrpc.getDeletePhoneBookEntryMethod = getDeletePhoneBookEntryMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq, com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeletePhoneBookEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeletePhoneBookEntry"))
                  .build();
          }
        }
     }
     return getDeletePhoneBookEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq,
      com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> getListPhoneBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPhoneBooks",
      requestType = com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq,
      com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> getListPhoneBooksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq, com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> getListPhoneBooksMethod;
    if ((getListPhoneBooksMethod = P3ApiGrpc.getListPhoneBooksMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListPhoneBooksMethod = P3ApiGrpc.getListPhoneBooksMethod) == null) {
          P3ApiGrpc.getListPhoneBooksMethod = getListPhoneBooksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq, com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListPhoneBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListPhoneBooks"))
                  .build();
          }
        }
     }
     return getListPhoneBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> getListAgentTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentTriggers",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> getListAgentTriggersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq, com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> getListAgentTriggersMethod;
    if ((getListAgentTriggersMethod = P3ApiGrpc.getListAgentTriggersMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentTriggersMethod = P3ApiGrpc.getListAgentTriggersMethod) == null) {
          P3ApiGrpc.getListAgentTriggersMethod = getListAgentTriggersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq, com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentTriggers"))
                  .build();
          }
        }
     }
     return getListAgentTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq,
      com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> getGetCampaignCompletionStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaignCompletionStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq,
      com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> getGetCampaignCompletionStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq, com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> getGetCampaignCompletionStatusMethod;
    if ((getGetCampaignCompletionStatusMethod = P3ApiGrpc.getGetCampaignCompletionStatusMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetCampaignCompletionStatusMethod = P3ApiGrpc.getGetCampaignCompletionStatusMethod) == null) {
          P3ApiGrpc.getGetCampaignCompletionStatusMethod = getGetCampaignCompletionStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq, com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetCampaignCompletionStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetCampaignCompletionStatus"))
                  .build();
          }
        }
     }
     return getGetCampaignCompletionStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq,
      com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> getGetLostPeerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLostPeerInfo",
      requestType = com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq,
      com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> getGetLostPeerInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq, com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> getGetLostPeerInfoMethod;
    if ((getGetLostPeerInfoMethod = P3ApiGrpc.getGetLostPeerInfoMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetLostPeerInfoMethod = P3ApiGrpc.getGetLostPeerInfoMethod) == null) {
          P3ApiGrpc.getGetLostPeerInfoMethod = getGetLostPeerInfoMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq, com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetLostPeerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetLostPeerInfo"))
                  .build();
          }
        }
     }
     return getGetLostPeerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq,
      com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> getGetDispositionKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDispositionKeys",
      requestType = com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq,
      com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> getGetDispositionKeysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq, com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> getGetDispositionKeysMethod;
    if ((getGetDispositionKeysMethod = P3ApiGrpc.getGetDispositionKeysMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetDispositionKeysMethod = P3ApiGrpc.getGetDispositionKeysMethod) == null) {
          P3ApiGrpc.getGetDispositionKeysMethod = getGetDispositionKeysMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq, com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetDispositionKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetDispositionKeys"))
                  .build();
          }
        }
     }
     return getGetDispositionKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq,
      com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> getGetReadyAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadyAgents",
      requestType = com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq,
      com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> getGetReadyAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq, com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> getGetReadyAgentsMethod;
    if ((getGetReadyAgentsMethod = P3ApiGrpc.getGetReadyAgentsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetReadyAgentsMethod = P3ApiGrpc.getGetReadyAgentsMethod) == null) {
          P3ApiGrpc.getGetReadyAgentsMethod = getGetReadyAgentsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq, com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetReadyAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetReadyAgents"))
                  .build();
          }
        }
     }
     return getGetReadyAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> getListAgentQueueAndOnHoldCallDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentQueueAndOnHoldCallData",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> getListAgentQueueAndOnHoldCallDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq, com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> getListAgentQueueAndOnHoldCallDataMethod;
    if ((getListAgentQueueAndOnHoldCallDataMethod = P3ApiGrpc.getListAgentQueueAndOnHoldCallDataMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentQueueAndOnHoldCallDataMethod = P3ApiGrpc.getListAgentQueueAndOnHoldCallDataMethod) == null) {
          P3ApiGrpc.getListAgentQueueAndOnHoldCallDataMethod = getListAgentQueueAndOnHoldCallDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq, com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentQueueAndOnHoldCallData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentQueueAndOnHoldCallData"))
                  .build();
          }
        }
     }
     return getListAgentQueueAndOnHoldCallDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq,
      com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> getSaveAgentCallResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAgentCallResponses",
      requestType = com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq,
      com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> getSaveAgentCallResponsesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq, com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> getSaveAgentCallResponsesMethod;
    if ((getSaveAgentCallResponsesMethod = P3ApiGrpc.getSaveAgentCallResponsesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getSaveAgentCallResponsesMethod = P3ApiGrpc.getSaveAgentCallResponsesMethod) == null) {
          P3ApiGrpc.getSaveAgentCallResponsesMethod = getSaveAgentCallResponsesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq, com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "SaveAgentCallResponses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("SaveAgentCallResponses"))
                  .build();
          }
        }
     }
     return getSaveAgentCallResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> getListAgentTransferOptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentTransferOptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> getListAgentTransferOptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq, com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> getListAgentTransferOptionsMethod;
    if ((getListAgentTransferOptionsMethod = P3ApiGrpc.getListAgentTransferOptionsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentTransferOptionsMethod = P3ApiGrpc.getListAgentTransferOptionsMethod) == null) {
          P3ApiGrpc.getListAgentTransferOptionsMethod = getListAgentTransferOptionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq, com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentTransferOptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentTransferOptions"))
                  .build();
          }
        }
     }
     return getListAgentTransferOptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> getUpdateAgentCallResponseValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentCallResponseValue",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> getUpdateAgentCallResponseValueMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> getUpdateAgentCallResponseValueMethod;
    if ((getUpdateAgentCallResponseValueMethod = P3ApiGrpc.getUpdateAgentCallResponseValueMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateAgentCallResponseValueMethod = P3ApiGrpc.getUpdateAgentCallResponseValueMethod) == null) {
          P3ApiGrpc.getUpdateAgentCallResponseValueMethod = getUpdateAgentCallResponseValueMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateAgentCallResponseValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateAgentCallResponseValue"))
                  .build();
          }
        }
     }
     return getUpdateAgentCallResponseValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq,
      com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> getGetIntercomPeerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIntercomPeerInfo",
      requestType = com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq,
      com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> getGetIntercomPeerInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq, com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> getGetIntercomPeerInfoMethod;
    if ((getGetIntercomPeerInfoMethod = P3ApiGrpc.getGetIntercomPeerInfoMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetIntercomPeerInfoMethod = P3ApiGrpc.getGetIntercomPeerInfoMethod) == null) {
          P3ApiGrpc.getGetIntercomPeerInfoMethod = getGetIntercomPeerInfoMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq, com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetIntercomPeerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetIntercomPeerInfo"))
                  .build();
          }
        }
     }
     return getGetIntercomPeerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq,
      com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> getListOrgResponseEvaluatorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgResponseEvaluators",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq,
      com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> getListOrgResponseEvaluatorsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq, com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> getListOrgResponseEvaluatorsMethod;
    if ((getListOrgResponseEvaluatorsMethod = P3ApiGrpc.getListOrgResponseEvaluatorsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListOrgResponseEvaluatorsMethod = P3ApiGrpc.getListOrgResponseEvaluatorsMethod) == null) {
          P3ApiGrpc.getListOrgResponseEvaluatorsMethod = getListOrgResponseEvaluatorsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq, com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListOrgResponseEvaluators"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListOrgResponseEvaluators"))
                  .build();
          }
        }
     }
     return getListOrgResponseEvaluatorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> getGetQueueConfigurationOptionsArrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueueConfigurationOptionsArray",
      requestType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq,
      com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> getGetQueueConfigurationOptionsArrayMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> getGetQueueConfigurationOptionsArrayMethod;
    if ((getGetQueueConfigurationOptionsArrayMethod = P3ApiGrpc.getGetQueueConfigurationOptionsArrayMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetQueueConfigurationOptionsArrayMethod = P3ApiGrpc.getGetQueueConfigurationOptionsArrayMethod) == null) {
          P3ApiGrpc.getGetQueueConfigurationOptionsArrayMethod = getGetQueueConfigurationOptionsArrayMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq, com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetQueueConfigurationOptionsArray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetQueueConfigurationOptionsArray"))
                  .build();
          }
        }
     }
     return getGetQueueConfigurationOptionsArrayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq,
      com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> getGetConditionalDNCLRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConditionalDNCLRules",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq,
      com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> getGetConditionalDNCLRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq, com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> getGetConditionalDNCLRulesMethod;
    if ((getGetConditionalDNCLRulesMethod = P3ApiGrpc.getGetConditionalDNCLRulesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetConditionalDNCLRulesMethod = P3ApiGrpc.getGetConditionalDNCLRulesMethod) == null) {
          P3ApiGrpc.getGetConditionalDNCLRulesMethod = getGetConditionalDNCLRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq, com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetConditionalDNCLRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetConditionalDNCLRules"))
                  .build();
          }
        }
     }
     return getGetConditionalDNCLRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualDialStartReq,
      com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> getManualDialStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManualDialStart",
      requestType = com.tcn.cloud.api.api.v0alpha.ManualDialStartReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ManualDialStartRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualDialStartReq,
      com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> getManualDialStartMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ManualDialStartReq, com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> getManualDialStartMethod;
    if ((getManualDialStartMethod = P3ApiGrpc.getManualDialStartMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getManualDialStartMethod = P3ApiGrpc.getManualDialStartMethod) == null) {
          P3ApiGrpc.getManualDialStartMethod = getManualDialStartMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ManualDialStartReq, com.tcn.cloud.api.api.v0alpha.ManualDialStartRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ManualDialStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManualDialStartReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ManualDialStartRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ManualDialStart"))
                  .build();
          }
        }
     }
     return getManualDialStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq,
      com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> getGetExtendedCallHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExtendedCallHistories",
      requestType = com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq,
      com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> getGetExtendedCallHistoriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq, com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> getGetExtendedCallHistoriesMethod;
    if ((getGetExtendedCallHistoriesMethod = P3ApiGrpc.getGetExtendedCallHistoriesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetExtendedCallHistoriesMethod = P3ApiGrpc.getGetExtendedCallHistoriesMethod) == null) {
          P3ApiGrpc.getGetExtendedCallHistoriesMethod = getGetExtendedCallHistoriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq, com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetExtendedCallHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetExtendedCallHistories"))
                  .build();
          }
        }
     }
     return getGetExtendedCallHistoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq,
      com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> getListWhiteListPhoneBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWhiteListPhoneBooks",
      requestType = com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq,
      com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> getListWhiteListPhoneBooksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq, com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> getListWhiteListPhoneBooksMethod;
    if ((getListWhiteListPhoneBooksMethod = P3ApiGrpc.getListWhiteListPhoneBooksMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListWhiteListPhoneBooksMethod = P3ApiGrpc.getListWhiteListPhoneBooksMethod) == null) {
          P3ApiGrpc.getListWhiteListPhoneBooksMethod = getListWhiteListPhoneBooksMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq, com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListWhiteListPhoneBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListWhiteListPhoneBooks"))
                  .build();
          }
        }
     }
     return getListWhiteListPhoneBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq,
      com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadCallRecording",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq,
      com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq, com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingMethod;
    if ((getDownloadCallRecordingMethod = P3ApiGrpc.getDownloadCallRecordingMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDownloadCallRecordingMethod = P3ApiGrpc.getDownloadCallRecordingMethod) == null) {
          P3ApiGrpc.getDownloadCallRecordingMethod = getDownloadCallRecordingMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq, com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DownloadCallRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DownloadCallRecording"))
                  .build();
          }
        }
     }
     return getDownloadCallRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq,
      com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadCallRecordings",
      requestType = com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq,
      com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq, com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> getDownloadCallRecordingsMethod;
    if ((getDownloadCallRecordingsMethod = P3ApiGrpc.getDownloadCallRecordingsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDownloadCallRecordingsMethod = P3ApiGrpc.getDownloadCallRecordingsMethod) == null) {
          P3ApiGrpc.getDownloadCallRecordingsMethod = getDownloadCallRecordingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq, com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DownloadCallRecordings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DownloadCallRecordings"))
                  .build();
          }
        }
     }
     return getDownloadCallRecordingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> getPlacePreviewDialCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlacePreviewDialCall",
      requestType = com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> getPlacePreviewDialCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> getPlacePreviewDialCallMethod;
    if ((getPlacePreviewDialCallMethod = P3ApiGrpc.getPlacePreviewDialCallMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getPlacePreviewDialCallMethod = P3ApiGrpc.getPlacePreviewDialCallMethod) == null) {
          P3ApiGrpc.getPlacePreviewDialCallMethod = getPlacePreviewDialCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "PlacePreviewDialCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("PlacePreviewDialCall"))
                  .build();
          }
        }
     }
     return getPlacePreviewDialCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> getCancelPreviewDialCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelPreviewDialCall",
      requestType = com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq,
      com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> getCancelPreviewDialCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> getCancelPreviewDialCallMethod;
    if ((getCancelPreviewDialCallMethod = P3ApiGrpc.getCancelPreviewDialCallMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCancelPreviewDialCallMethod = P3ApiGrpc.getCancelPreviewDialCallMethod) == null) {
          P3ApiGrpc.getCancelPreviewDialCallMethod = getCancelPreviewDialCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq, com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CancelPreviewDialCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CancelPreviewDialCall"))
                  .build();
          }
        }
     }
     return getCancelPreviewDialCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq,
      com.tcn.cloud.api.api.v0alpha.Nil> getUpdateTaskStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTaskStatus",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.Nil.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq,
      com.tcn.cloud.api.api.v0alpha.Nil> getUpdateTaskStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq, com.tcn.cloud.api.api.v0alpha.Nil> getUpdateTaskStatusMethod;
    if ((getUpdateTaskStatusMethod = P3ApiGrpc.getUpdateTaskStatusMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateTaskStatusMethod = P3ApiGrpc.getUpdateTaskStatusMethod) == null) {
          P3ApiGrpc.getUpdateTaskStatusMethod = getUpdateTaskStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq, com.tcn.cloud.api.api.v0alpha.Nil>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateTaskStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.Nil.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateTaskStatus"))
                  .build();
          }
        }
     }
     return getUpdateTaskStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq,
      com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> getListCallbackRoutingAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallbackRoutingAgents",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq,
      com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> getListCallbackRoutingAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq, com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> getListCallbackRoutingAgentsMethod;
    if ((getListCallbackRoutingAgentsMethod = P3ApiGrpc.getListCallbackRoutingAgentsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListCallbackRoutingAgentsMethod = P3ApiGrpc.getListCallbackRoutingAgentsMethod) == null) {
          P3ApiGrpc.getListCallbackRoutingAgentsMethod = getListCallbackRoutingAgentsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq, com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListCallbackRoutingAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListCallbackRoutingAgents"))
                  .build();
          }
        }
     }
     return getListCallbackRoutingAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> getListCallbackRoutingSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallbackRoutingSkills",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq,
      com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> getListCallbackRoutingSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq, com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> getListCallbackRoutingSkillsMethod;
    if ((getListCallbackRoutingSkillsMethod = P3ApiGrpc.getListCallbackRoutingSkillsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListCallbackRoutingSkillsMethod = P3ApiGrpc.getListCallbackRoutingSkillsMethod) == null) {
          P3ApiGrpc.getListCallbackRoutingSkillsMethod = getListCallbackRoutingSkillsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq, com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListCallbackRoutingSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListCallbackRoutingSkills"))
                  .build();
          }
        }
     }
     return getListCallbackRoutingSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq,
      com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> getHandleRecordingDelayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandleRecordingDelay",
      requestType = com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq,
      com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> getHandleRecordingDelayMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq, com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> getHandleRecordingDelayMethod;
    if ((getHandleRecordingDelayMethod = P3ApiGrpc.getHandleRecordingDelayMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getHandleRecordingDelayMethod = P3ApiGrpc.getHandleRecordingDelayMethod) == null) {
          P3ApiGrpc.getHandleRecordingDelayMethod = getHandleRecordingDelayMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq, com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "HandleRecordingDelay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("HandleRecordingDelay"))
                  .build();
          }
        }
     }
     return getHandleRecordingDelayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> getUpdateAgentAssignedHuntGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentAssignedHuntGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> getUpdateAgentAssignedHuntGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> getUpdateAgentAssignedHuntGroupMethod;
    if ((getUpdateAgentAssignedHuntGroupMethod = P3ApiGrpc.getUpdateAgentAssignedHuntGroupMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateAgentAssignedHuntGroupMethod = P3ApiGrpc.getUpdateAgentAssignedHuntGroupMethod) == null) {
          P3ApiGrpc.getUpdateAgentAssignedHuntGroupMethod = getUpdateAgentAssignedHuntGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateAgentAssignedHuntGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateAgentAssignedHuntGroup"))
                  .build();
          }
        }
     }
     return getUpdateAgentAssignedHuntGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallDataReq,
      com.tcn.cloud.api.api.v0alpha.GetCallDataRes> getGetCallDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCallData",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCallDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetCallDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallDataReq,
      com.tcn.cloud.api.api.v0alpha.GetCallDataRes> getGetCallDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallDataReq, com.tcn.cloud.api.api.v0alpha.GetCallDataRes> getGetCallDataMethod;
    if ((getGetCallDataMethod = P3ApiGrpc.getGetCallDataMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetCallDataMethod = P3ApiGrpc.getGetCallDataMethod) == null) {
          P3ApiGrpc.getGetCallDataMethod = getGetCallDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCallDataReq, com.tcn.cloud.api.api.v0alpha.GetCallDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetCallData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCallDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCallDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetCallData"))
                  .build();
          }
        }
     }
     return getGetCallDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> getListHuntGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> getListHuntGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> getListHuntGroupsMethod;
    if ((getListHuntGroupsMethod = P3ApiGrpc.getListHuntGroupsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListHuntGroupsMethod = P3ApiGrpc.getListHuntGroupsMethod) == null) {
          P3ApiGrpc.getListHuntGroupsMethod = getListHuntGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq, com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListHuntGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListHuntGroups"))
                  .build();
          }
        }
     }
     return getListHuntGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> getListReassignmentHuntGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReassignmentHuntGroups",
      requestType = com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq,
      com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> getListReassignmentHuntGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq, com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> getListReassignmentHuntGroupsMethod;
    if ((getListReassignmentHuntGroupsMethod = P3ApiGrpc.getListReassignmentHuntGroupsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListReassignmentHuntGroupsMethod = P3ApiGrpc.getListReassignmentHuntGroupsMethod) == null) {
          P3ApiGrpc.getListReassignmentHuntGroupsMethod = getListReassignmentHuntGroupsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq, com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListReassignmentHuntGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListReassignmentHuntGroups"))
                  .build();
          }
        }
     }
     return getListReassignmentHuntGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq,
      com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> getGetOrgAgentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrgAgentSettings",
      requestType = com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq,
      com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> getGetOrgAgentSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq, com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> getGetOrgAgentSettingsMethod;
    if ((getGetOrgAgentSettingsMethod = P3ApiGrpc.getGetOrgAgentSettingsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetOrgAgentSettingsMethod = P3ApiGrpc.getGetOrgAgentSettingsMethod) == null) {
          P3ApiGrpc.getGetOrgAgentSettingsMethod = getGetOrgAgentSettingsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq, com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetOrgAgentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetOrgAgentSettings"))
                  .build();
          }
        }
     }
     return getGetOrgAgentSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq,
      com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> getListCallerIdsFromBucketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCallerIdsFromBucket",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq,
      com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> getListCallerIdsFromBucketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq, com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> getListCallerIdsFromBucketMethod;
    if ((getListCallerIdsFromBucketMethod = P3ApiGrpc.getListCallerIdsFromBucketMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListCallerIdsFromBucketMethod = P3ApiGrpc.getListCallerIdsFromBucketMethod) == null) {
          P3ApiGrpc.getListCallerIdsFromBucketMethod = getListCallerIdsFromBucketMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq, com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListCallerIdsFromBucket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListCallerIdsFromBucket"))
                  .build();
          }
        }
     }
     return getListCallerIdsFromBucketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq,
      com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> getSaveLastCallResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveLastCallResponse",
      requestType = com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq,
      com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> getSaveLastCallResponseMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq, com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> getSaveLastCallResponseMethod;
    if ((getSaveLastCallResponseMethod = P3ApiGrpc.getSaveLastCallResponseMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getSaveLastCallResponseMethod = P3ApiGrpc.getSaveLastCallResponseMethod) == null) {
          P3ApiGrpc.getSaveLastCallResponseMethod = getSaveLastCallResponseMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq, com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "SaveLastCallResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("SaveLastCallResponse"))
                  .build();
          }
        }
     }
     return getSaveLastCallResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> getListAgentCallLogsByCallSidAndTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentCallLogsByCallSidAndType",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> getListAgentCallLogsByCallSidAndTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> getListAgentCallLogsByCallSidAndTypeMethod;
    if ((getListAgentCallLogsByCallSidAndTypeMethod = P3ApiGrpc.getListAgentCallLogsByCallSidAndTypeMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentCallLogsByCallSidAndTypeMethod = P3ApiGrpc.getListAgentCallLogsByCallSidAndTypeMethod) == null) {
          P3ApiGrpc.getListAgentCallLogsByCallSidAndTypeMethod = getListAgentCallLogsByCallSidAndTypeMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentCallLogsByCallSidAndType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentCallLogsByCallSidAndType"))
                  .build();
          }
        }
     }
     return getListAgentCallLogsByCallSidAndTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> getListAgentCallResponseValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentCallResponseValues",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> getListAgentCallResponseValuesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> getListAgentCallResponseValuesMethod;
    if ((getListAgentCallResponseValuesMethod = P3ApiGrpc.getListAgentCallResponseValuesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentCallResponseValuesMethod = P3ApiGrpc.getListAgentCallResponseValuesMethod) == null) {
          P3ApiGrpc.getListAgentCallResponseValuesMethod = getListAgentCallResponseValuesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq, com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentCallResponseValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentCallResponseValues"))
                  .build();
          }
        }
     }
     return getListAgentCallResponseValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.ContactSchema> getGetContactSchemaByContactGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactSchemaByContactGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ContactSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.ContactSchema> getGetContactSchemaByContactGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq, com.tcn.cloud.api.api.v0alpha.ContactSchema> getGetContactSchemaByContactGroupMethod;
    if ((getGetContactSchemaByContactGroupMethod = P3ApiGrpc.getGetContactSchemaByContactGroupMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetContactSchemaByContactGroupMethod = P3ApiGrpc.getGetContactSchemaByContactGroupMethod) == null) {
          P3ApiGrpc.getGetContactSchemaByContactGroupMethod = getGetContactSchemaByContactGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq, com.tcn.cloud.api.api.v0alpha.ContactSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetContactSchemaByContactGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContactSchema.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetContactSchemaByContactGroup"))
                  .build();
          }
        }
     }
     return getGetContactSchemaByContactGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq,
      com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> getListContactGroupDetailsByClientSidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactGroupDetailsByClientSid",
      requestType = com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq,
      com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> getListContactGroupDetailsByClientSidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq, com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> getListContactGroupDetailsByClientSidMethod;
    if ((getListContactGroupDetailsByClientSidMethod = P3ApiGrpc.getListContactGroupDetailsByClientSidMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListContactGroupDetailsByClientSidMethod = P3ApiGrpc.getListContactGroupDetailsByClientSidMethod) == null) {
          P3ApiGrpc.getListContactGroupDetailsByClientSidMethod = getListContactGroupDetailsByClientSidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq, com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListContactGroupDetailsByClientSid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListContactGroupDetailsByClientSid"))
                  .build();
          }
        }
     }
     return getListContactGroupDetailsByClientSidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.ContactGroup> getGetContactGroupDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactGroupDetails",
      requestType = com.tcn.cloud.api.api.v0alpha.GetContactGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ContactGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.ContactGroup> getGetContactGroupDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq, com.tcn.cloud.api.api.v0alpha.ContactGroup> getGetContactGroupDetailsMethod;
    if ((getGetContactGroupDetailsMethod = P3ApiGrpc.getGetContactGroupDetailsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetContactGroupDetailsMethod = P3ApiGrpc.getGetContactGroupDetailsMethod) == null) {
          P3ApiGrpc.getGetContactGroupDetailsMethod = getGetContactGroupDetailsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq, com.tcn.cloud.api.api.v0alpha.ContactGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetContactGroupDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ContactGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetContactGroupDetails"))
                  .build();
          }
        }
     }
     return getGetContactGroupDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> getGetContactGroupSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactGroupSize",
      requestType = com.tcn.cloud.api.api.v0alpha.GetContactGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
      com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> getGetContactGroupSizeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq, com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> getGetContactGroupSizeMethod;
    if ((getGetContactGroupSizeMethod = P3ApiGrpc.getGetContactGroupSizeMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetContactGroupSizeMethod = P3ApiGrpc.getGetContactGroupSizeMethod) == null) {
          P3ApiGrpc.getGetContactGroupSizeMethod = getGetContactGroupSizeMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetContactGroupReq, com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetContactGroupSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetContactGroupSize"))
                  .build();
          }
        }
     }
     return getGetContactGroupSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq,
      com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> getCreateContactFieldDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContactFieldDescription",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq,
      com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> getCreateContactFieldDescriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq, com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> getCreateContactFieldDescriptionMethod;
    if ((getCreateContactFieldDescriptionMethod = P3ApiGrpc.getCreateContactFieldDescriptionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateContactFieldDescriptionMethod = P3ApiGrpc.getCreateContactFieldDescriptionMethod) == null) {
          P3ApiGrpc.getCreateContactFieldDescriptionMethod = getCreateContactFieldDescriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq, com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateContactFieldDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateContactFieldDescription"))
                  .build();
          }
        }
     }
     return getCreateContactFieldDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq,
      com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> getDeleteContactFieldDescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContactFieldDescription",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq,
      com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> getDeleteContactFieldDescriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq, com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> getDeleteContactFieldDescriptionMethod;
    if ((getDeleteContactFieldDescriptionMethod = P3ApiGrpc.getDeleteContactFieldDescriptionMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeleteContactFieldDescriptionMethod = P3ApiGrpc.getDeleteContactFieldDescriptionMethod) == null) {
          P3ApiGrpc.getDeleteContactFieldDescriptionMethod = getDeleteContactFieldDescriptionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq, com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeleteContactFieldDescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeleteContactFieldDescription"))
                  .build();
          }
        }
     }
     return getDeleteContactFieldDescriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq,
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> getListContactFieldDescriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactFieldDescriptions",
      requestType = com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq,
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> getListContactFieldDescriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> getListContactFieldDescriptionsMethod;
    if ((getListContactFieldDescriptionsMethod = P3ApiGrpc.getListContactFieldDescriptionsMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListContactFieldDescriptionsMethod = P3ApiGrpc.getListContactFieldDescriptionsMethod) == null) {
          P3ApiGrpc.getListContactFieldDescriptionsMethod = getListContactFieldDescriptionsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListContactFieldDescriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListContactFieldDescriptions"))
                  .build();
          }
        }
     }
     return getListContactFieldDescriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq,
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> getListContactFieldDescriptionsByCGSidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactFieldDescriptionsByCGSid",
      requestType = com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq,
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> getListContactFieldDescriptionsByCGSidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> getListContactFieldDescriptionsByCGSidMethod;
    if ((getListContactFieldDescriptionsByCGSidMethod = P3ApiGrpc.getListContactFieldDescriptionsByCGSidMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListContactFieldDescriptionsByCGSidMethod = P3ApiGrpc.getListContactFieldDescriptionsByCGSidMethod) == null) {
          P3ApiGrpc.getListContactFieldDescriptionsByCGSidMethod = getListContactFieldDescriptionsByCGSidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListContactFieldDescriptionsByCGSid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListContactFieldDescriptionsByCGSid"))
                  .build();
          }
        }
     }
     return getListContactFieldDescriptionsByCGSidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> getListContactImportTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactImportTemplates",
      requestType = com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq,
      com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> getListContactImportTemplatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> getListContactImportTemplatesMethod;
    if ((getListContactImportTemplatesMethod = P3ApiGrpc.getListContactImportTemplatesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListContactImportTemplatesMethod = P3ApiGrpc.getListContactImportTemplatesMethod) == null) {
          P3ApiGrpc.getListContactImportTemplatesMethod = getListContactImportTemplatesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq, com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListContactImportTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListContactImportTemplates"))
                  .build();
          }
        }
     }
     return getListContactImportTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> getUpdatePreviewRecordToFinishedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePreviewRecordToFinished",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq,
      com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> getUpdatePreviewRecordToFinishedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq, com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> getUpdatePreviewRecordToFinishedMethod;
    if ((getUpdatePreviewRecordToFinishedMethod = P3ApiGrpc.getUpdatePreviewRecordToFinishedMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdatePreviewRecordToFinishedMethod = P3ApiGrpc.getUpdatePreviewRecordToFinishedMethod) == null) {
          P3ApiGrpc.getUpdatePreviewRecordToFinishedMethod = getUpdatePreviewRecordToFinishedMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq, com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdatePreviewRecordToFinished"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdatePreviewRecordToFinished"))
                  .build();
          }
        }
     }
     return getUpdatePreviewRecordToFinishedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> getUpdateAgentHuntGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentHuntGroup",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> getUpdateAgentHuntGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> getUpdateAgentHuntGroupMethod;
    if ((getUpdateAgentHuntGroupMethod = P3ApiGrpc.getUpdateAgentHuntGroupMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateAgentHuntGroupMethod = P3ApiGrpc.getUpdateAgentHuntGroupMethod) == null) {
          P3ApiGrpc.getUpdateAgentHuntGroupMethod = getUpdateAgentHuntGroupMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateAgentHuntGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateAgentHuntGroup"))
                  .build();
          }
        }
     }
     return getUpdateAgentHuntGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> getMultiAgentHuntGroupAssignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiAgentHuntGroupAssignment",
      requestType = com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> getMultiAgentHuntGroupAssignmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> getMultiAgentHuntGroupAssignmentMethod;
    if ((getMultiAgentHuntGroupAssignmentMethod = P3ApiGrpc.getMultiAgentHuntGroupAssignmentMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getMultiAgentHuntGroupAssignmentMethod = P3ApiGrpc.getMultiAgentHuntGroupAssignmentMethod) == null) {
          P3ApiGrpc.getMultiAgentHuntGroupAssignmentMethod = getMultiAgentHuntGroupAssignmentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "MultiAgentHuntGroupAssignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("MultiAgentHuntGroupAssignment"))
                  .build();
          }
        }
     }
     return getMultiAgentHuntGroupAssignmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq,
      com.tcn.cloud.api.api.v0alpha.AgentProfile> getGetAgentProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentProfile",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.AgentProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq,
      com.tcn.cloud.api.api.v0alpha.AgentProfile> getGetAgentProfileMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq, com.tcn.cloud.api.api.v0alpha.AgentProfile> getGetAgentProfileMethod;
    if ((getGetAgentProfileMethod = P3ApiGrpc.getGetAgentProfileMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetAgentProfileMethod = P3ApiGrpc.getGetAgentProfileMethod) == null) {
          P3ApiGrpc.getGetAgentProfileMethod = getGetAgentProfileMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq, com.tcn.cloud.api.api.v0alpha.AgentProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetAgentProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.AgentProfile.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetAgentProfile"))
                  .build();
          }
        }
     }
     return getGetAgentProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq,
      com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> getRecalculateBillingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecalculateBilling",
      requestType = com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq,
      com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> getRecalculateBillingMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq, com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> getRecalculateBillingMethod;
    if ((getRecalculateBillingMethod = P3ApiGrpc.getRecalculateBillingMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getRecalculateBillingMethod = P3ApiGrpc.getRecalculateBillingMethod) == null) {
          P3ApiGrpc.getRecalculateBillingMethod = getRecalculateBillingMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq, com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "RecalculateBilling"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("RecalculateBilling"))
                  .build();
          }
        }
     }
     return getRecalculateBillingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq,
      com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> getListOutboundBroadcastTemplateDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOutboundBroadcastTemplateData",
      requestType = com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq,
      com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> getListOutboundBroadcastTemplateDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq, com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> getListOutboundBroadcastTemplateDataMethod;
    if ((getListOutboundBroadcastTemplateDataMethod = P3ApiGrpc.getListOutboundBroadcastTemplateDataMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListOutboundBroadcastTemplateDataMethod = P3ApiGrpc.getListOutboundBroadcastTemplateDataMethod) == null) {
          P3ApiGrpc.getListOutboundBroadcastTemplateDataMethod = getListOutboundBroadcastTemplateDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq, com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListOutboundBroadcastTemplateData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListOutboundBroadcastTemplateData"))
                  .build();
          }
        }
     }
     return getListOutboundBroadcastTemplateDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> getMultiAgentSkillAssignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiAgentSkillAssignment",
      requestType = com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> getMultiAgentSkillAssignmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> getMultiAgentSkillAssignmentMethod;
    if ((getMultiAgentSkillAssignmentMethod = P3ApiGrpc.getMultiAgentSkillAssignmentMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getMultiAgentSkillAssignmentMethod = P3ApiGrpc.getMultiAgentSkillAssignmentMethod) == null) {
          P3ApiGrpc.getMultiAgentSkillAssignmentMethod = getMultiAgentSkillAssignmentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "MultiAgentSkillAssignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("MultiAgentSkillAssignment"))
                  .build();
          }
        }
     }
     return getMultiAgentSkillAssignmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> getMultiAgentSkillUnassignmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiAgentSkillUnassignment",
      requestType = com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq,
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> getMultiAgentSkillUnassignmentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> getMultiAgentSkillUnassignmentMethod;
    if ((getMultiAgentSkillUnassignmentMethod = P3ApiGrpc.getMultiAgentSkillUnassignmentMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getMultiAgentSkillUnassignmentMethod = P3ApiGrpc.getMultiAgentSkillUnassignmentMethod) == null) {
          P3ApiGrpc.getMultiAgentSkillUnassignmentMethod = getMultiAgentSkillUnassignmentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "MultiAgentSkillUnassignment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("MultiAgentSkillUnassignment"))
                  .build();
          }
        }
     }
     return getMultiAgentSkillUnassignmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq,
      com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> getListMAMAgentHuntGroupsByClientSidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMAMAgentHuntGroupsByClientSid",
      requestType = com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq,
      com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> getListMAMAgentHuntGroupsByClientSidMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq, com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> getListMAMAgentHuntGroupsByClientSidMethod;
    if ((getListMAMAgentHuntGroupsByClientSidMethod = P3ApiGrpc.getListMAMAgentHuntGroupsByClientSidMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListMAMAgentHuntGroupsByClientSidMethod = P3ApiGrpc.getListMAMAgentHuntGroupsByClientSidMethod) == null) {
          P3ApiGrpc.getListMAMAgentHuntGroupsByClientSidMethod = getListMAMAgentHuntGroupsByClientSidMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq, com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListMAMAgentHuntGroupsByClientSid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListMAMAgentHuntGroupsByClientSid"))
                  .build();
          }
        }
     }
     return getListMAMAgentHuntGroupsByClientSidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq,
      com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> getListTtsVoicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTtsVoices",
      requestType = com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq,
      com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> getListTtsVoicesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq, com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> getListTtsVoicesMethod;
    if ((getListTtsVoicesMethod = P3ApiGrpc.getListTtsVoicesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListTtsVoicesMethod = P3ApiGrpc.getListTtsVoicesMethod) == null) {
          P3ApiGrpc.getListTtsVoicesMethod = getListTtsVoicesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq, com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListTtsVoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListTtsVoices"))
                  .build();
          }
        }
     }
     return getListTtsVoicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq,
      com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> getCreateTtsVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTtsVoice",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq,
      com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> getCreateTtsVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq, com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> getCreateTtsVoiceMethod;
    if ((getCreateTtsVoiceMethod = P3ApiGrpc.getCreateTtsVoiceMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateTtsVoiceMethod = P3ApiGrpc.getCreateTtsVoiceMethod) == null) {
          P3ApiGrpc.getCreateTtsVoiceMethod = getCreateTtsVoiceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq, com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateTtsVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateTtsVoice"))
                  .build();
          }
        }
     }
     return getCreateTtsVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq,
      com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> getDeleteTtsVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTtsVoice",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq,
      com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> getDeleteTtsVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq, com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> getDeleteTtsVoiceMethod;
    if ((getDeleteTtsVoiceMethod = P3ApiGrpc.getDeleteTtsVoiceMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeleteTtsVoiceMethod = P3ApiGrpc.getDeleteTtsVoiceMethod) == null) {
          P3ApiGrpc.getDeleteTtsVoiceMethod = getDeleteTtsVoiceMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq, com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeleteTtsVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeleteTtsVoice"))
                  .build();
          }
        }
     }
     return getDeleteTtsVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq,
      com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> getListCustomDataKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomDataKeys",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq,
      com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> getListCustomDataKeysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq, com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> getListCustomDataKeysMethod;
    if ((getListCustomDataKeysMethod = P3ApiGrpc.getListCustomDataKeysMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListCustomDataKeysMethod = P3ApiGrpc.getListCustomDataKeysMethod) == null) {
          P3ApiGrpc.getListCustomDataKeysMethod = getListCustomDataKeysMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq, com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListCustomDataKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListCustomDataKeys"))
                  .build();
          }
        }
     }
     return getListCustomDataKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> getCreateCustomDataKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomDataKey",
      requestType = com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> getCreateCustomDataKeyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> getCreateCustomDataKeyMethod;
    if ((getCreateCustomDataKeyMethod = P3ApiGrpc.getCreateCustomDataKeyMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getCreateCustomDataKeyMethod = P3ApiGrpc.getCreateCustomDataKeyMethod) == null) {
          P3ApiGrpc.getCreateCustomDataKeyMethod = getCreateCustomDataKeyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "CreateCustomDataKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("CreateCustomDataKey"))
                  .build();
          }
        }
     }
     return getCreateCustomDataKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> getDeleteCustomDataKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomDataKey",
      requestType = com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> getDeleteCustomDataKeyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> getDeleteCustomDataKeyMethod;
    if ((getDeleteCustomDataKeyMethod = P3ApiGrpc.getDeleteCustomDataKeyMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getDeleteCustomDataKeyMethod = P3ApiGrpc.getDeleteCustomDataKeyMethod) == null) {
          P3ApiGrpc.getDeleteCustomDataKeyMethod = getDeleteCustomDataKeyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "DeleteCustomDataKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("DeleteCustomDataKey"))
                  .build();
          }
        }
     }
     return getDeleteCustomDataKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> getUpdateCustomDataKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomDataKey",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq,
      com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> getUpdateCustomDataKeyMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> getUpdateCustomDataKeyMethod;
    if ((getUpdateCustomDataKeyMethod = P3ApiGrpc.getUpdateCustomDataKeyMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getUpdateCustomDataKeyMethod = P3ApiGrpc.getUpdateCustomDataKeyMethod) == null) {
          P3ApiGrpc.getUpdateCustomDataKeyMethod = getUpdateCustomDataKeyMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq, com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "UpdateCustomDataKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("UpdateCustomDataKey"))
                  .build();
          }
        }
     }
     return getUpdateCustomDataKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq,
      com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> getGetActivityLogHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetActivityLogHistories",
      requestType = com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq,
      com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> getGetActivityLogHistoriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq, com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> getGetActivityLogHistoriesMethod;
    if ((getGetActivityLogHistoriesMethod = P3ApiGrpc.getGetActivityLogHistoriesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getGetActivityLogHistoriesMethod = P3ApiGrpc.getGetActivityLogHistoriesMethod) == null) {
          P3ApiGrpc.getGetActivityLogHistoriesMethod = getGetActivityLogHistoriesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq, com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "GetActivityLogHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("GetActivityLogHistories"))
                  .build();
          }
        }
     }
     return getGetActivityLogHistoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq,
      com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> getListTableTemplatePropertiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTableTemplateProperties",
      requestType = com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq,
      com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> getListTableTemplatePropertiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq, com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> getListTableTemplatePropertiesMethod;
    if ((getListTableTemplatePropertiesMethod = P3ApiGrpc.getListTableTemplatePropertiesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListTableTemplatePropertiesMethod = P3ApiGrpc.getListTableTemplatePropertiesMethod) == null) {
          P3ApiGrpc.getListTableTemplatePropertiesMethod = getListTableTemplatePropertiesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq, com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListTableTemplateProperties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListTableTemplateProperties"))
                  .build();
          }
        }
     }
     return getListTableTemplatePropertiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> getListAgentSkillsFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentSkillsFilters",
      requestType = com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> getListAgentSkillsFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq, com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> getListAgentSkillsFiltersMethod;
    if ((getListAgentSkillsFiltersMethod = P3ApiGrpc.getListAgentSkillsFiltersMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListAgentSkillsFiltersMethod = P3ApiGrpc.getListAgentSkillsFiltersMethod) == null) {
          P3ApiGrpc.getListAgentSkillsFiltersMethod = getListAgentSkillsFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq, com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListAgentSkillsFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListAgentSkillsFilters"))
                  .build();
          }
        }
     }
     return getListAgentSkillsFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest,
      com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> getListScheduleRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScheduleRules",
      requestType = com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest,
      com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> getListScheduleRulesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest, com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> getListScheduleRulesMethod;
    if ((getListScheduleRulesMethod = P3ApiGrpc.getListScheduleRulesMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListScheduleRulesMethod = P3ApiGrpc.getListScheduleRulesMethod) == null) {
          P3ApiGrpc.getListScheduleRulesMethod = getListScheduleRulesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest, com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListScheduleRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListScheduleRules"))
                  .build();
          }
        }
     }
     return getListScheduleRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> getListCustomReportFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomReportFilters",
      requestType = com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq,
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> getListCustomReportFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> getListCustomReportFiltersMethod;
    if ((getListCustomReportFiltersMethod = P3ApiGrpc.getListCustomReportFiltersMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListCustomReportFiltersMethod = P3ApiGrpc.getListCustomReportFiltersMethod) == null) {
          P3ApiGrpc.getListCustomReportFiltersMethod = getListCustomReportFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListCustomReportFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListCustomReportFilters"))
                  .build();
          }
        }
     }
     return getListCustomReportFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> getListSmsNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSmsNumbers",
      requestType = com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq,
      com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> getListSmsNumbersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq, com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> getListSmsNumbersMethod;
    if ((getListSmsNumbersMethod = P3ApiGrpc.getListSmsNumbersMethod) == null) {
      synchronized (P3ApiGrpc.class) {
        if ((getListSmsNumbersMethod = P3ApiGrpc.getListSmsNumbersMethod) == null) {
          P3ApiGrpc.getListSmsNumbersMethod = getListSmsNumbersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq, com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.p3api.P3Api", "ListSmsNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.getDefaultInstance()))
                  .setSchemaDescriptor(new P3ApiMethodDescriptorSupplier("ListSmsNumbers"))
                  .build();
          }
        }
     }
     return getListSmsNumbersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static P3ApiStub newStub(io.grpc.Channel channel) {
    return new P3ApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static P3ApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new P3ApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static P3ApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new P3ApiFutureStub(channel);
  }

  /**
   */
  public static abstract class P3ApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentHuntGroupMethod(), responseObserver);
    }

    /**
     */
    public void getAgentSession(com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSession> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public void getAgentSkills(com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the client_sid or name in the request is invalid.
     * </pre>
     */
    public void createAgentSkill(com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAgentSkillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid or name in the request is invalid.
     * </pre>
     */
    public void updateAgentSkill(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentSkillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the agent skill with the agent_skill_sid given on the request.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid in the request is invalid.
     * </pre>
     */
    public void deleteAgentSkill(com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAgentSkillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public void listSkillsForCurrentAgent(com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSkillsForCurrentAgentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public void listSkills(com.tcn.cloud.api.api.v0alpha.ListSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an agents assigned skills as defined by the skills list on
     * the request message.
     * Errors:
     *    - grpc.InvalidArgument: the user_id on the request is invalid.
     * </pre>
     */
    public void updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentSkillsMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentAgent(com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Agent> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentAgentMethod(), responseObserver);
    }

    /**
     */
    public void getClientInfoData(com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientInfoDataMethod(), responseObserver);
    }

    /**
     */
    public void getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientInfoDisplayTemplateMethod(), responseObserver);
    }

    /**
     */
    public void listAgentStatisticsData(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentStatisticsDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all agent and hunt group PBX extensions that the requested agent has.
     * </pre>
     */
    public void listPBXExtensions(com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPBXExtensionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists every agent extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public void listAgentExtensions(com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentExtensionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists every hunt group extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public void listHuntGroupExtensions(com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHuntGroupExtensionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new extension as defined by the request message
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request has missing or invalid fields.
     *    - grpc.Internal: An unexpected error occurred while saving the extension.
     * </pre>
     */
    public void createExtension(com.tcn.cloud.api.api.v0alpha.CreateExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateExtensionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a pbx_extension with the given pbx_extension_sid.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     * </pre>
     */
    public void deleteExtension(com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteExtensionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an extension as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     *    - grpc.Internal: An unexpected error occurred updating the extension.
     * </pre>
     */
    public void updateExtension(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateExtensionMethod(), responseObserver);
    }

    /**
     */
    public void updatePBXExtension(com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePBXExtensionMethod(), responseObserver);
    }

    /**
     */
    public void createDNCLNumbers(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDNCLNumbersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the campaign or huntgroup script for the given agent's current hunt
     * group. If no script is found, it gets the hunt group responses for the
     * agent's current hunt group. It also does a mail merge with the found script
     * or responses (if able).
     * </pre>
     */
    public void getScriptOrResponses(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScriptOrResponsesMethod(), responseObserver);
    }

    /**
     */
    public void getHuntGroupAgentSettings(com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHuntGroupAgentSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of weblinks for the hunt group in the request.
     * It replaces any parameters of a given weblink with the call data of the call sid and type from the request message or with the callback details (if a scheduled_callback_id is given).
     * </pre>
     */
    public void listHuntGroupWebLinks(com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHuntGroupWebLinksMethod(), responseObserver);
    }

    /**
     */
    public void getHuntGroupPauseCodes(com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHuntGroupPauseCodesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the call history of the requested agent for the past day or
     * session_sid, depending on the filter parameter.
     * </pre>
     */
    public void listAgentCallHistory(com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentCallHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all client phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public void listClientPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListClientPhoneBookEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all hunt group phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public void listHuntGroupPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHuntGroupPhoneBookEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public void createPhoneBookEntry(com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePhoneBookEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public void updatePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePhoneBookEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes the phone_book with the phone_book_sid given on the reques message.
     * Required Permissions:
     *    AGENT_MANAGER
     * </pre>
     */
    public void deletePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePhoneBookEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists caller_id, outbound and transfer phone books for the requesting client and given hunt group sid.
     * Entries will be ordered by entry_name and phone_number.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the client_sid or hunt_group_sid in the request are invalid.
     *   - grpc.Internal: unexpected error occurred when retrieving the phone books.
     * </pre>
     */
    public void listPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListPhoneBooksMethod(), responseObserver);
    }

    /**
     */
    public void listAgentTriggers(com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentTriggersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all running broadcasts (task groups) for the requesting agent and hunt_group_sid in the request.
     * Calculates the percentage of completed tasks for each of those task groups.
     * Calculates the overall task completion percentage of all matching task groups.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request is invalid.
     * </pre>
     */
    public void getCampaignCompletionStatus(com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignCompletionStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uses lost peer call sid and call type from the request to get information about lost call
     * gets the name and hunt group of the agent that was connected to that call and all types of skills the call has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the call_sid in the request in invalid.
     *   - grpc.NotFound: the call sid provided wasn't previously connected to any agent.
     * </pre>
     */
    public void getLostPeerInfo(com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLostPeerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all the available Disposition Keys
     * Required permissions:
     *   NONE
     * </pre>
     */
    public void getDispositionKeys(com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDispositionKeysMethod(), responseObserver);
    }

    /**
     */
    public void getReadyAgents(com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReadyAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns lists with call data of calls that were:
     * Placed on multihold by the requesting agent.
     * Queued, are ready to be handled and require a subset of the agent_skills provided.
     * Placed in the Hold Queue Monitor, haven't been picked up yet and require a subset of the agent_skills provided.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the agent_session_sid provided in the request is invalid.
     * </pre>
     */
    public void listAgentQueueAndOnHoldCallData(com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentQueueAndOnHoldCallDataMethod(), responseObserver);
    }

    /**
     */
    public void saveAgentCallResponses(com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAgentCallResponsesMethod(), responseObserver);
    }

    /**
     */
    public void listAgentTransferOptions(com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentTransferOptionsMethod(), responseObserver);
    }

    /**
     */
    public void updateAgentCallResponseValue(com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentCallResponseValueMethod(), responseObserver);
    }

    /**
     */
    public void getIntercomPeerInfo(com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntercomPeerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the requesting user's org response evaluators.
     * </pre>
     */
    public void listOrgResponseEvaluators(com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListOrgResponseEvaluatorsMethod(), responseObserver);
    }

    /**
     */
    public void getQueueConfigurationOptionsArray(com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueueConfigurationOptionsArrayMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the rules for conditionally adding a number to the DNCL depending on
     * responses or scripts
     * </pre>
     */
    public void getConditionalDNCLRules(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetConditionalDNCLRulesMethod(), responseObserver);
    }

    /**
     */
    public void manualDialStart(com.tcn.cloud.api.api.v0alpha.ManualDialStartReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> responseObserver) {
      asyncUnimplementedUnaryCall(getManualDialStartMethod(), responseObserver);
    }

    /**
     */
    public void getExtendedCallHistories(com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExtendedCallHistoriesMethod(), responseObserver);
    }

    /**
     */
    public void listWhiteListPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListWhiteListPhoneBooksMethod(), responseObserver);
    }

    /**
     */
    public void downloadCallRecording(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadCallRecordingMethod(), responseObserver);
    }

    /**
     */
    public void downloadCallRecordings(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadCallRecordingsMethod(), responseObserver);
    }

    /**
     */
    public void placePreviewDialCall(com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPlacePreviewDialCallMethod(), responseObserver);
    }

    /**
     */
    public void cancelPreviewDialCall(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelPreviewDialCallMethod(), responseObserver);
    }

    /**
     */
    public void updateTaskStatus(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Nil> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTaskStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCallbackRoutingAgents returns a list of agents that are allowed to make a callback.
     * </pre>
     */
    public void listCallbackRoutingAgents(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCallbackRoutingAgentsMethod(), responseObserver);
    }

    /**
     */
    public void listCallbackRoutingSkills(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCallbackRoutingSkillsMethod(), responseObserver);
    }

    /**
     */
    public void handleRecordingDelay(com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> responseObserver) {
      asyncUnimplementedUnaryCall(getHandleRecordingDelayMethod(), responseObserver);
    }

    /**
     */
    public void updateAgentAssignedHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentAssignedHuntGroupMethod(), responseObserver);
    }

    /**
     */
    public void getCallData(com.tcn.cloud.api.api.v0alpha.GetCallDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCallDataMethod(), responseObserver);
    }

    /**
     */
    public void listHuntGroups(com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListHuntGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the hunt groups an agent within a given hunt group can reassign
     * themselves to. The reassignment hunt groups can optionally be limited by a
     * hunt group setting. If a hunt group does not allow reassignment, the
     * returned list will be empty.
     * </pre>
     */
    public void listReassignmentHuntGroups(com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListReassignmentHuntGroupsMethod(), responseObserver);
    }

    /**
     */
    public void getOrgAgentSettings(com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrgAgentSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket
     * </pre>
     */
    public void listCallerIdsFromBucket(com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCallerIdsFromBucketMethod(), responseObserver);
    }

    /**
     */
    public void saveLastCallResponse(com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveLastCallResponseMethod(), responseObserver);
    }

    /**
     */
    public void listAgentCallLogsByCallSidAndType(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentCallLogsByCallSidAndTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the keys and values of the latest responses for the given call_sid,
     * call_type and agent_sid
     * </pre>
     */
    public void listAgentCallResponseValues(com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentCallResponseValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get contact schema details based on contact group sid
     * </pre>
     */
    public void getContactSchemaByContactGroup(com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactSchema> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactSchemaByContactGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * List contact group details based on client sid from contact_group table
     * </pre>
     */
    public void listContactGroupDetailsByClientSid(com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListContactGroupDetailsByClientSidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get contact group details based on contact group sid from contact_group
     * table
     * </pre>
     */
    public void getContactGroupDetails(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactGroupDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get contact group size based on contacts size
     * </pre>
     */
    public void getContactGroupSize(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactGroupSizeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create contact field description details
     * </pre>
     */
    public void createContactFieldDescription(com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateContactFieldDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete contact field description details
     * </pre>
     */
    public void deleteContactFieldDescription(com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteContactFieldDescriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List contact field desc details from contact_field_description table
     * </pre>
     */
    public void listContactFieldDescriptions(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListContactFieldDescriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List contact field description details based on contact group sid
     * </pre>
     */
    public void listContactFieldDescriptionsByCGSid(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListContactFieldDescriptionsByCGSidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List contactImportTemplates based on client_sid from
     * contact_import_template table
     * </pre>
     */
    public void listContactImportTemplates(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListContactImportTemplatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates task data for a preview record to finished and logs an agent
     * session event
     * </pre>
     */
    public void updatePreviewRecordToFinished(com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePreviewRecordToFinishedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the requesting agent's hunt_group_sid.
     * </pre>
     */
    public void updateAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentHuntGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates every given user's hunt_group_sid.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.Internal: an error occurred while interacting with the database.
     *    - grpc.InvalidArgument: the hunt_group_sid or the user id list is empty or contains an invalid value.
     * </pre>
     */
    public void multiAgentHuntGroupAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiAgentHuntGroupAssignmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfile returns an agent profile.
     * </pre>
     */
    public void getAgentProfile(com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * RecalculateBilling updates statuses for every billing type given on the
     * request message for either the current or previous month.
     * Only data that has already been summed for billing will have it's
     * status updated.
     * Required Permissions:
     *  EDIT_BILLING
     * </pre>
     */
    public void recalculateBilling(com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRecalculateBillingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets information of the requesting client's broadcast templates (template_number, name, type, modify_date)
     * It reports if each found template is either STANDARD or LAYERED.
     * Required permissions:
     *   NONE
     * Errors:
     *   NONE
     * </pre>
     */
    public void listOutboundBroadcastTemplateData(com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListOutboundBroadcastTemplateDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign every skill to every agent with the given aptitude.
     * Errors:
     *    - grpc.Invalid: the aptitude field is invalid.
     * </pre>
     */
    public void multiAgentSkillAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiAgentSkillAssignmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unassigns every given skill from every given user.
     * Errors:
     *    - grpc.InvalidArgument:
     *        - the user_ids list is empty or contains an empty string.
     *        - one or more of the user_ids does not belong to the client.
     *    - grpc.Internal: an error occurred while deleting the skill assignments.
     * </pre>
     */
    public void multiAgentSkillUnassignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiAgentSkillUnassignmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * List of agent hunt groups based on client sid
     * that have manually approved messages enabled
     * </pre>
     */
    public void listMAMAgentHuntGroupsByClientSid(com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListMAMAgentHuntGroupsByClientSidMethod(), responseObserver);
    }

    /**
     * <pre>
     * List every tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public void listTtsVoices(com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTtsVoicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the actual_name or port field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to insert the new tts voice.
     * </pre>
     */
    public void createTtsVoice(com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTtsVoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a tts voice with the given tts_voice_sid.
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the tts_voice_sid field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to remove the tts voice.
     * </pre>
     */
    public void deleteTtsVoice(com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTtsVoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * List of account custom data keys based on client sid
     * Required Permissions:
     *   ORG_VIEW
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public void listCustomDataKeys(com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCustomDataKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Data Key as defined by the request message
     * the client_properties_sid should not be set, this is assigned on the backend
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom_data_key field was not set
     *    - grpc.Internal: error creating custom data key
     * </pre>
     */
    public void createCustomDataKey(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomDataKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a Custom Data Key with the sid given on the request message.
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid field is invalid.
     *    - grpc.NotFound: no custom data key was deleted for the client_properties_sid.
     *    - grpc.Internal: an error occurred while trying to remove the custom data key.
     * </pre>
     */
    public void deleteCustomDataKey(com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCustomDataKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a custom data key with the client_properties_sid and data key
     * given on the request
     * Required Permissions;
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid was empty or the data key was not set
     *    - grpc.Internal: error updating custom data key, more than 1 custom data key records affected
     *    - grpc.NotFound: no matching custom data key found
     * </pre>
     */
    public void updateCustomDataKey(com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCustomDataKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Activity logs for given users and by specified time range
     * Required Permissions;
     *   CUSTOMER_SUPPORT
     * </pre>
     */
    public void getActivityLogHistories(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetActivityLogHistoriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List agent and queue table template properties by client sid
     * </pre>
     */
    public void listTableTemplateProperties(com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTableTemplatePropertiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List agent skills filters by client sid
     * </pre>
     */
    public void listAgentSkillsFilters(com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentSkillsFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List Schedule Rules
     * </pre>
     */
    public void listScheduleRules(com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> responseObserver) {
      asyncUnimplementedUnaryCall(getListScheduleRulesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List custom report filters by client sid
     * </pre>
     */
    public void listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListCustomReportFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List sms numbers by client sid
     * </pre>
     */
    public void listSmsNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSmsNumbersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgentHuntGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq,
                com.tcn.cloud.api.api.v0alpha.HuntGroup>(
                  this, METHODID_GET_AGENT_HUNT_GROUP)))
          .addMethod(
            getGetAgentSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq,
                com.tcn.cloud.api.api.v0alpha.AgentSession>(
                  this, METHODID_GET_AGENT_SESSION)))
          .addMethod(
            getGetAgentSkillsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq,
                com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes>(
                  this, METHODID_GET_AGENT_SKILLS)))
          .addMethod(
            getCreateAgentSkillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq,
                com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes>(
                  this, METHODID_CREATE_AGENT_SKILL)))
          .addMethod(
            getUpdateAgentSkillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes>(
                  this, METHODID_UPDATE_AGENT_SKILL)))
          .addMethod(
            getDeleteAgentSkillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq,
                com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes>(
                  this, METHODID_DELETE_AGENT_SKILL)))
          .addMethod(
            getListSkillsForCurrentAgentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq,
                com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes>(
                  this, METHODID_LIST_SKILLS_FOR_CURRENT_AGENT)))
          .addMethod(
            getListSkillsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSkillsReq,
                com.tcn.cloud.api.api.v0alpha.ListSkillsRes>(
                  this, METHODID_LIST_SKILLS)))
          .addMethod(
            getUpdateAgentSkillsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes>(
                  this, METHODID_UPDATE_AGENT_SKILLS)))
          .addMethod(
            getGetCurrentAgentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq,
                com.tcn.cloud.api.api.v0alpha.Agent>(
                  this, METHODID_GET_CURRENT_AGENT)))
          .addMethod(
            getGetClientInfoDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq,
                com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes>(
                  this, METHODID_GET_CLIENT_INFO_DATA)))
          .addMethod(
            getGetClientInfoDisplayTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq,
                com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes>(
                  this, METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE)))
          .addMethod(
            getListAgentStatisticsDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes>(
                  this, METHODID_LIST_AGENT_STATISTICS_DATA)))
          .addMethod(
            getListPBXExtensionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq,
                com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes>(
                  this, METHODID_LIST_PBXEXTENSIONS)))
          .addMethod(
            getListAgentExtensionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes>(
                  this, METHODID_LIST_AGENT_EXTENSIONS)))
          .addMethod(
            getListHuntGroupExtensionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq,
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes>(
                  this, METHODID_LIST_HUNT_GROUP_EXTENSIONS)))
          .addMethod(
            getCreateExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateExtensionReq,
                com.tcn.cloud.api.api.v0alpha.CreateExtensionRes>(
                  this, METHODID_CREATE_EXTENSION)))
          .addMethod(
            getDeleteExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq,
                com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes>(
                  this, METHODID_DELETE_EXTENSION)))
          .addMethod(
            getUpdateExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq,
                com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes>(
                  this, METHODID_UPDATE_EXTENSION)))
          .addMethod(
            getUpdatePBXExtensionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq,
                com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes>(
                  this, METHODID_UPDATE_PBXEXTENSION)))
          .addMethod(
            getCreateDNCLNumbersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq,
                com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes>(
                  this, METHODID_CREATE_DNCLNUMBERS)))
          .addMethod(
            getGetScriptOrResponsesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq,
                com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes>(
                  this, METHODID_GET_SCRIPT_OR_RESPONSES)))
          .addMethod(
            getGetHuntGroupAgentSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq,
                com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings>(
                  this, METHODID_GET_HUNT_GROUP_AGENT_SETTINGS)))
          .addMethod(
            getListHuntGroupWebLinksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq,
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes>(
                  this, METHODID_LIST_HUNT_GROUP_WEB_LINKS)))
          .addMethod(
            getGetHuntGroupPauseCodesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq,
                com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes>(
                  this, METHODID_GET_HUNT_GROUP_PAUSE_CODES)))
          .addMethod(
            getListAgentCallHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes>(
                  this, METHODID_LIST_AGENT_CALL_HISTORY)))
          .addMethod(
            getListClientPhoneBookEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq,
                com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes>(
                  this, METHODID_LIST_CLIENT_PHONE_BOOK_ENTRIES)))
          .addMethod(
            getListHuntGroupPhoneBookEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq,
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes>(
                  this, METHODID_LIST_HUNT_GROUP_PHONE_BOOK_ENTRIES)))
          .addMethod(
            getCreatePhoneBookEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq,
                com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes>(
                  this, METHODID_CREATE_PHONE_BOOK_ENTRY)))
          .addMethod(
            getUpdatePhoneBookEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq,
                com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes>(
                  this, METHODID_UPDATE_PHONE_BOOK_ENTRY)))
          .addMethod(
            getDeletePhoneBookEntryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq,
                com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes>(
                  this, METHODID_DELETE_PHONE_BOOK_ENTRY)))
          .addMethod(
            getListPhoneBooksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq,
                com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes>(
                  this, METHODID_LIST_PHONE_BOOKS)))
          .addMethod(
            getListAgentTriggersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes>(
                  this, METHODID_LIST_AGENT_TRIGGERS)))
          .addMethod(
            getGetCampaignCompletionStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq,
                com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes>(
                  this, METHODID_GET_CAMPAIGN_COMPLETION_STATUS)))
          .addMethod(
            getGetLostPeerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq,
                com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes>(
                  this, METHODID_GET_LOST_PEER_INFO)))
          .addMethod(
            getGetDispositionKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq,
                com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes>(
                  this, METHODID_GET_DISPOSITION_KEYS)))
          .addMethod(
            getGetReadyAgentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq,
                com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes>(
                  this, METHODID_GET_READY_AGENTS)))
          .addMethod(
            getListAgentQueueAndOnHoldCallDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes>(
                  this, METHODID_LIST_AGENT_QUEUE_AND_ON_HOLD_CALL_DATA)))
          .addMethod(
            getSaveAgentCallResponsesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq,
                com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes>(
                  this, METHODID_SAVE_AGENT_CALL_RESPONSES)))
          .addMethod(
            getListAgentTransferOptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes>(
                  this, METHODID_LIST_AGENT_TRANSFER_OPTIONS)))
          .addMethod(
            getUpdateAgentCallResponseValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes>(
                  this, METHODID_UPDATE_AGENT_CALL_RESPONSE_VALUE)))
          .addMethod(
            getGetIntercomPeerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq,
                com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes>(
                  this, METHODID_GET_INTERCOM_PEER_INFO)))
          .addMethod(
            getListOrgResponseEvaluatorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq,
                com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes>(
                  this, METHODID_LIST_ORG_RESPONSE_EVALUATORS)))
          .addMethod(
            getGetQueueConfigurationOptionsArrayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq,
                com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes>(
                  this, METHODID_GET_QUEUE_CONFIGURATION_OPTIONS_ARRAY)))
          .addMethod(
            getGetConditionalDNCLRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq,
                com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes>(
                  this, METHODID_GET_CONDITIONAL_DNCLRULES)))
          .addMethod(
            getManualDialStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ManualDialStartReq,
                com.tcn.cloud.api.api.v0alpha.ManualDialStartRes>(
                  this, METHODID_MANUAL_DIAL_START)))
          .addMethod(
            getGetExtendedCallHistoriesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq,
                com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes>(
                  this, METHODID_GET_EXTENDED_CALL_HISTORIES)))
          .addMethod(
            getListWhiteListPhoneBooksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq,
                com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes>(
                  this, METHODID_LIST_WHITE_LIST_PHONE_BOOKS)))
          .addMethod(
            getDownloadCallRecordingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq,
                com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>(
                  this, METHODID_DOWNLOAD_CALL_RECORDING)))
          .addMethod(
            getDownloadCallRecordingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq,
                com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>(
                  this, METHODID_DOWNLOAD_CALL_RECORDINGS)))
          .addMethod(
            getPlacePreviewDialCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq,
                com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes>(
                  this, METHODID_PLACE_PREVIEW_DIAL_CALL)))
          .addMethod(
            getCancelPreviewDialCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq,
                com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes>(
                  this, METHODID_CANCEL_PREVIEW_DIAL_CALL)))
          .addMethod(
            getUpdateTaskStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq,
                com.tcn.cloud.api.api.v0alpha.Nil>(
                  this, METHODID_UPDATE_TASK_STATUS)))
          .addMethod(
            getListCallbackRoutingAgentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq,
                com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes>(
                  this, METHODID_LIST_CALLBACK_ROUTING_AGENTS)))
          .addMethod(
            getListCallbackRoutingSkillsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq,
                com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes>(
                  this, METHODID_LIST_CALLBACK_ROUTING_SKILLS)))
          .addMethod(
            getHandleRecordingDelayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq,
                com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes>(
                  this, METHODID_HANDLE_RECORDING_DELAY)))
          .addMethod(
            getUpdateAgentAssignedHuntGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes>(
                  this, METHODID_UPDATE_AGENT_ASSIGNED_HUNT_GROUP)))
          .addMethod(
            getGetCallDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCallDataReq,
                com.tcn.cloud.api.api.v0alpha.GetCallDataRes>(
                  this, METHODID_GET_CALL_DATA)))
          .addMethod(
            getListHuntGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes>(
                  this, METHODID_LIST_HUNT_GROUPS)))
          .addMethod(
            getListReassignmentHuntGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq,
                com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes>(
                  this, METHODID_LIST_REASSIGNMENT_HUNT_GROUPS)))
          .addMethod(
            getGetOrgAgentSettingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq,
                com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes>(
                  this, METHODID_GET_ORG_AGENT_SETTINGS)))
          .addMethod(
            getListCallerIdsFromBucketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq,
                com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes>(
                  this, METHODID_LIST_CALLER_IDS_FROM_BUCKET)))
          .addMethod(
            getSaveLastCallResponseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq,
                com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes>(
                  this, METHODID_SAVE_LAST_CALL_RESPONSE)))
          .addMethod(
            getListAgentCallLogsByCallSidAndTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes>(
                  this, METHODID_LIST_AGENT_CALL_LOGS_BY_CALL_SID_AND_TYPE)))
          .addMethod(
            getListAgentCallResponseValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes>(
                  this, METHODID_LIST_AGENT_CALL_RESPONSE_VALUES)))
          .addMethod(
            getGetContactSchemaByContactGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq,
                com.tcn.cloud.api.api.v0alpha.ContactSchema>(
                  this, METHODID_GET_CONTACT_SCHEMA_BY_CONTACT_GROUP)))
          .addMethod(
            getListContactGroupDetailsByClientSidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq,
                com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes>(
                  this, METHODID_LIST_CONTACT_GROUP_DETAILS_BY_CLIENT_SID)))
          .addMethod(
            getGetContactGroupDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
                com.tcn.cloud.api.api.v0alpha.ContactGroup>(
                  this, METHODID_GET_CONTACT_GROUP_DETAILS)))
          .addMethod(
            getGetContactGroupSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetContactGroupReq,
                com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes>(
                  this, METHODID_GET_CONTACT_GROUP_SIZE)))
          .addMethod(
            getCreateContactFieldDescriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq,
                com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes>(
                  this, METHODID_CREATE_CONTACT_FIELD_DESCRIPTION)))
          .addMethod(
            getDeleteContactFieldDescriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq,
                com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes>(
                  this, METHODID_DELETE_CONTACT_FIELD_DESCRIPTION)))
          .addMethod(
            getListContactFieldDescriptionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq,
                com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes>(
                  this, METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS)))
          .addMethod(
            getListContactFieldDescriptionsByCGSidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq,
                com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes>(
                  this, METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS_BY_CGSID)))
          .addMethod(
            getListContactImportTemplatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq,
                com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes>(
                  this, METHODID_LIST_CONTACT_IMPORT_TEMPLATES)))
          .addMethod(
            getUpdatePreviewRecordToFinishedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq,
                com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes>(
                  this, METHODID_UPDATE_PREVIEW_RECORD_TO_FINISHED)))
          .addMethod(
            getUpdateAgentHuntGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes>(
                  this, METHODID_UPDATE_AGENT_HUNT_GROUP)))
          .addMethod(
            getMultiAgentHuntGroupAssignmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq,
                com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes>(
                  this, METHODID_MULTI_AGENT_HUNT_GROUP_ASSIGNMENT)))
          .addMethod(
            getGetAgentProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq,
                com.tcn.cloud.api.api.v0alpha.AgentProfile>(
                  this, METHODID_GET_AGENT_PROFILE)))
          .addMethod(
            getRecalculateBillingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq,
                com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes>(
                  this, METHODID_RECALCULATE_BILLING)))
          .addMethod(
            getListOutboundBroadcastTemplateDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq,
                com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes>(
                  this, METHODID_LIST_OUTBOUND_BROADCAST_TEMPLATE_DATA)))
          .addMethod(
            getMultiAgentSkillAssignmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq,
                com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes>(
                  this, METHODID_MULTI_AGENT_SKILL_ASSIGNMENT)))
          .addMethod(
            getMultiAgentSkillUnassignmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq,
                com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes>(
                  this, METHODID_MULTI_AGENT_SKILL_UNASSIGNMENT)))
          .addMethod(
            getListMAMAgentHuntGroupsByClientSidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq,
                com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes>(
                  this, METHODID_LIST_MAMAGENT_HUNT_GROUPS_BY_CLIENT_SID)))
          .addMethod(
            getListTtsVoicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq,
                com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes>(
                  this, METHODID_LIST_TTS_VOICES)))
          .addMethod(
            getCreateTtsVoiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq,
                com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes>(
                  this, METHODID_CREATE_TTS_VOICE)))
          .addMethod(
            getDeleteTtsVoiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq,
                com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes>(
                  this, METHODID_DELETE_TTS_VOICE)))
          .addMethod(
            getListCustomDataKeysMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq,
                com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes>(
                  this, METHODID_LIST_CUSTOM_DATA_KEYS)))
          .addMethod(
            getCreateCustomDataKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq,
                com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes>(
                  this, METHODID_CREATE_CUSTOM_DATA_KEY)))
          .addMethod(
            getDeleteCustomDataKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq,
                com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes>(
                  this, METHODID_DELETE_CUSTOM_DATA_KEY)))
          .addMethod(
            getUpdateCustomDataKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq,
                com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes>(
                  this, METHODID_UPDATE_CUSTOM_DATA_KEY)))
          .addMethod(
            getGetActivityLogHistoriesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq,
                com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes>(
                  this, METHODID_GET_ACTIVITY_LOG_HISTORIES)))
          .addMethod(
            getListTableTemplatePropertiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq,
                com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes>(
                  this, METHODID_LIST_TABLE_TEMPLATE_PROPERTIES)))
          .addMethod(
            getListAgentSkillsFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq,
                com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes>(
                  this, METHODID_LIST_AGENT_SKILLS_FILTERS)))
          .addMethod(
            getListScheduleRulesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest,
                com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult>(
                  this, METHODID_LIST_SCHEDULE_RULES)))
          .addMethod(
            getListCustomReportFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq,
                com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes>(
                  this, METHODID_LIST_CUSTOM_REPORT_FILTERS)))
          .addMethod(
            getListSmsNumbersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq,
                com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes>(
                  this, METHODID_LIST_SMS_NUMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class P3ApiStub extends io.grpc.stub.AbstractStub<P3ApiStub> {
    private P3ApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private P3ApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P3ApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new P3ApiStub(channel, callOptions);
    }

    /**
     */
    public void getAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentHuntGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgentSession(com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSession> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public void getAgentSkills(com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the client_sid or name in the request is invalid.
     * </pre>
     */
    public void createAgentSkill(com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAgentSkillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid or name in the request is invalid.
     * </pre>
     */
    public void updateAgentSkill(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentSkillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the agent skill with the agent_skill_sid given on the request.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid in the request is invalid.
     * </pre>
     */
    public void deleteAgentSkill(com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAgentSkillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public void listSkillsForCurrentAgent(com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSkillsForCurrentAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public void listSkills(com.tcn.cloud.api.api.v0alpha.ListSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an agents assigned skills as defined by the skills list on
     * the request message.
     * Errors:
     *    - grpc.InvalidArgument: the user_id on the request is invalid.
     * </pre>
     */
    public void updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentAgent(com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Agent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentAgentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientInfoData(com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientInfoDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientInfoDisplayTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentStatisticsData(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentStatisticsDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all agent and hunt group PBX extensions that the requested agent has.
     * </pre>
     */
    public void listPBXExtensions(com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPBXExtensionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists every agent extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public void listAgentExtensions(com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentExtensionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists every hunt group extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public void listHuntGroupExtensions(com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHuntGroupExtensionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new extension as defined by the request message
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request has missing or invalid fields.
     *    - grpc.Internal: An unexpected error occurred while saving the extension.
     * </pre>
     */
    public void createExtension(com.tcn.cloud.api.api.v0alpha.CreateExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a pbx_extension with the given pbx_extension_sid.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     * </pre>
     */
    public void deleteExtension(com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an extension as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     *    - grpc.Internal: An unexpected error occurred updating the extension.
     * </pre>
     */
    public void updateExtension(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePBXExtension(com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePBXExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDNCLNumbers(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDNCLNumbersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the campaign or huntgroup script for the given agent's current hunt
     * group. If no script is found, it gets the hunt group responses for the
     * agent's current hunt group. It also does a mail merge with the found script
     * or responses (if able).
     * </pre>
     */
    public void getScriptOrResponses(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScriptOrResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHuntGroupAgentSettings(com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHuntGroupAgentSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of weblinks for the hunt group in the request.
     * It replaces any parameters of a given weblink with the call data of the call sid and type from the request message or with the callback details (if a scheduled_callback_id is given).
     * </pre>
     */
    public void listHuntGroupWebLinks(com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHuntGroupWebLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHuntGroupPauseCodes(com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHuntGroupPauseCodesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the call history of the requested agent for the past day or
     * session_sid, depending on the filter parameter.
     * </pre>
     */
    public void listAgentCallHistory(com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentCallHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all client phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public void listClientPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListClientPhoneBookEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all hunt group phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public void listHuntGroupPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHuntGroupPhoneBookEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public void createPhoneBookEntry(com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePhoneBookEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public void updatePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePhoneBookEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes the phone_book with the phone_book_sid given on the reques message.
     * Required Permissions:
     *    AGENT_MANAGER
     * </pre>
     */
    public void deletePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePhoneBookEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists caller_id, outbound and transfer phone books for the requesting client and given hunt group sid.
     * Entries will be ordered by entry_name and phone_number.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the client_sid or hunt_group_sid in the request are invalid.
     *   - grpc.Internal: unexpected error occurred when retrieving the phone books.
     * </pre>
     */
    public void listPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPhoneBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentTriggers(com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentTriggersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all running broadcasts (task groups) for the requesting agent and hunt_group_sid in the request.
     * Calculates the percentage of completed tasks for each of those task groups.
     * Calculates the overall task completion percentage of all matching task groups.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request is invalid.
     * </pre>
     */
    public void getCampaignCompletionStatus(com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignCompletionStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uses lost peer call sid and call type from the request to get information about lost call
     * gets the name and hunt group of the agent that was connected to that call and all types of skills the call has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the call_sid in the request in invalid.
     *   - grpc.NotFound: the call sid provided wasn't previously connected to any agent.
     * </pre>
     */
    public void getLostPeerInfo(com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLostPeerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all the available Disposition Keys
     * Required permissions:
     *   NONE
     * </pre>
     */
    public void getDispositionKeys(com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDispositionKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReadyAgents(com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReadyAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns lists with call data of calls that were:
     * Placed on multihold by the requesting agent.
     * Queued, are ready to be handled and require a subset of the agent_skills provided.
     * Placed in the Hold Queue Monitor, haven't been picked up yet and require a subset of the agent_skills provided.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the agent_session_sid provided in the request is invalid.
     * </pre>
     */
    public void listAgentQueueAndOnHoldCallData(com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentQueueAndOnHoldCallDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveAgentCallResponses(com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAgentCallResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentTransferOptions(com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentTransferOptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAgentCallResponseValue(com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentCallResponseValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntercomPeerInfo(com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntercomPeerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the requesting user's org response evaluators.
     * </pre>
     */
    public void listOrgResponseEvaluators(com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOrgResponseEvaluatorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueueConfigurationOptionsArray(com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueueConfigurationOptionsArrayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the rules for conditionally adding a number to the DNCL depending on
     * responses or scripts
     * </pre>
     */
    public void getConditionalDNCLRules(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetConditionalDNCLRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void manualDialStart(com.tcn.cloud.api.api.v0alpha.ManualDialStartReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getManualDialStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExtendedCallHistories(com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetExtendedCallHistoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listWhiteListPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListWhiteListPhoneBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadCallRecording(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadCallRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadCallRecordings(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadCallRecordingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void placePreviewDialCall(com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlacePreviewDialCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelPreviewDialCall(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelPreviewDialCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTaskStatus(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Nil> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCallbackRoutingAgents returns a list of agents that are allowed to make a callback.
     * </pre>
     */
    public void listCallbackRoutingAgents(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCallbackRoutingAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCallbackRoutingSkills(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCallbackRoutingSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleRecordingDelay(com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHandleRecordingDelayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAgentAssignedHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentAssignedHuntGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCallData(com.tcn.cloud.api.api.v0alpha.GetCallDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCallDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listHuntGroups(com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListHuntGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the hunt groups an agent within a given hunt group can reassign
     * themselves to. The reassignment hunt groups can optionally be limited by a
     * hunt group setting. If a hunt group does not allow reassignment, the
     * returned list will be empty.
     * </pre>
     */
    public void listReassignmentHuntGroups(com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListReassignmentHuntGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrgAgentSettings(com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrgAgentSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket
     * </pre>
     */
    public void listCallerIdsFromBucket(com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCallerIdsFromBucketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveLastCallResponse(com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveLastCallResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAgentCallLogsByCallSidAndType(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentCallLogsByCallSidAndTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the keys and values of the latest responses for the given call_sid,
     * call_type and agent_sid
     * </pre>
     */
    public void listAgentCallResponseValues(com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentCallResponseValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get contact schema details based on contact group sid
     * </pre>
     */
    public void getContactSchemaByContactGroup(com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactSchema> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactSchemaByContactGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List contact group details based on client sid from contact_group table
     * </pre>
     */
    public void listContactGroupDetailsByClientSid(com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListContactGroupDetailsByClientSidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get contact group details based on contact group sid from contact_group
     * table
     * </pre>
     */
    public void getContactGroupDetails(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactGroupDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get contact group size based on contacts size
     * </pre>
     */
    public void getContactGroupSize(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactGroupSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create contact field description details
     * </pre>
     */
    public void createContactFieldDescription(com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateContactFieldDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete contact field description details
     * </pre>
     */
    public void deleteContactFieldDescription(com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteContactFieldDescriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List contact field desc details from contact_field_description table
     * </pre>
     */
    public void listContactFieldDescriptions(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListContactFieldDescriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List contact field description details based on contact group sid
     * </pre>
     */
    public void listContactFieldDescriptionsByCGSid(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListContactFieldDescriptionsByCGSidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List contactImportTemplates based on client_sid from
     * contact_import_template table
     * </pre>
     */
    public void listContactImportTemplates(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListContactImportTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates task data for a preview record to finished and logs an agent
     * session event
     * </pre>
     */
    public void updatePreviewRecordToFinished(com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePreviewRecordToFinishedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the requesting agent's hunt_group_sid.
     * </pre>
     */
    public void updateAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentHuntGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates every given user's hunt_group_sid.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.Internal: an error occurred while interacting with the database.
     *    - grpc.InvalidArgument: the hunt_group_sid or the user id list is empty or contains an invalid value.
     * </pre>
     */
    public void multiAgentHuntGroupAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiAgentHuntGroupAssignmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfile returns an agent profile.
     * </pre>
     */
    public void getAgentProfile(com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RecalculateBilling updates statuses for every billing type given on the
     * request message for either the current or previous month.
     * Only data that has already been summed for billing will have it's
     * status updated.
     * Required Permissions:
     *  EDIT_BILLING
     * </pre>
     */
    public void recalculateBilling(com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecalculateBillingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets information of the requesting client's broadcast templates (template_number, name, type, modify_date)
     * It reports if each found template is either STANDARD or LAYERED.
     * Required permissions:
     *   NONE
     * Errors:
     *   NONE
     * </pre>
     */
    public void listOutboundBroadcastTemplateData(com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOutboundBroadcastTemplateDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign every skill to every agent with the given aptitude.
     * Errors:
     *    - grpc.Invalid: the aptitude field is invalid.
     * </pre>
     */
    public void multiAgentSkillAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiAgentSkillAssignmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unassigns every given skill from every given user.
     * Errors:
     *    - grpc.InvalidArgument:
     *        - the user_ids list is empty or contains an empty string.
     *        - one or more of the user_ids does not belong to the client.
     *    - grpc.Internal: an error occurred while deleting the skill assignments.
     * </pre>
     */
    public void multiAgentSkillUnassignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiAgentSkillUnassignmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List of agent hunt groups based on client sid
     * that have manually approved messages enabled
     * </pre>
     */
    public void listMAMAgentHuntGroupsByClientSid(com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMAMAgentHuntGroupsByClientSidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List every tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public void listTtsVoices(com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTtsVoicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the actual_name or port field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to insert the new tts voice.
     * </pre>
     */
    public void createTtsVoice(com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTtsVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a tts voice with the given tts_voice_sid.
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the tts_voice_sid field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to remove the tts voice.
     * </pre>
     */
    public void deleteTtsVoice(com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTtsVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List of account custom data keys based on client sid
     * Required Permissions:
     *   ORG_VIEW
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public void listCustomDataKeys(com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCustomDataKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Data Key as defined by the request message
     * the client_properties_sid should not be set, this is assigned on the backend
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom_data_key field was not set
     *    - grpc.Internal: error creating custom data key
     * </pre>
     */
    public void createCustomDataKey(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomDataKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a Custom Data Key with the sid given on the request message.
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid field is invalid.
     *    - grpc.NotFound: no custom data key was deleted for the client_properties_sid.
     *    - grpc.Internal: an error occurred while trying to remove the custom data key.
     * </pre>
     */
    public void deleteCustomDataKey(com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCustomDataKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a custom data key with the client_properties_sid and data key
     * given on the request
     * Required Permissions;
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid was empty or the data key was not set
     *    - grpc.Internal: error updating custom data key, more than 1 custom data key records affected
     *    - grpc.NotFound: no matching custom data key found
     * </pre>
     */
    public void updateCustomDataKey(com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCustomDataKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Activity logs for given users and by specified time range
     * Required Permissions;
     *   CUSTOMER_SUPPORT
     * </pre>
     */
    public void getActivityLogHistories(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetActivityLogHistoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List agent and queue table template properties by client sid
     * </pre>
     */
    public void listTableTemplateProperties(com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTableTemplatePropertiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List agent skills filters by client sid
     * </pre>
     */
    public void listAgentSkillsFilters(com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentSkillsFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List Schedule Rules
     * </pre>
     */
    public void listScheduleRules(com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListScheduleRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List custom report filters by client sid
     * </pre>
     */
    public void listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCustomReportFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List sms numbers by client sid
     * </pre>
     */
    public void listSmsNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSmsNumbersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class P3ApiBlockingStub extends io.grpc.stub.AbstractStub<P3ApiBlockingStub> {
    private P3ApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private P3ApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P3ApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new P3ApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.HuntGroup getAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentHuntGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.AgentSession getAgentSession(com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes getAgentSkills(com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the client_sid or name in the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes createAgentSkill(com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateAgentSkillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid or name in the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes updateAgentSkill(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentSkillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the agent skill with the agent_skill_sid given on the request.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid in the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes deleteAgentSkill(com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAgentSkillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes listSkillsForCurrentAgent(com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq request) {
      return blockingUnaryCall(
          getChannel(), getListSkillsForCurrentAgentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSkillsRes listSkills(com.tcn.cloud.api.api.v0alpha.ListSkillsReq request) {
      return blockingUnaryCall(
          getChannel(), getListSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an agents assigned skills as defined by the skills list on
     * the request message.
     * Errors:
     *    - grpc.InvalidArgument: the user_id on the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes updateAgentSkills(com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentSkillsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Agent getCurrentAgent(com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentAgentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes getClientInfoData(com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetClientInfoDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes getClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getGetClientInfoDisplayTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes listAgentStatisticsData(com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentStatisticsDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all agent and hunt group PBX extensions that the requested agent has.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes listPBXExtensions(com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListPBXExtensionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every agent extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes listAgentExtensions(com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentExtensionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists every hunt group extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes listHuntGroupExtensions(com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListHuntGroupExtensionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new extension as defined by the request message
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request has missing or invalid fields.
     *    - grpc.Internal: An unexpected error occurred while saving the extension.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateExtensionRes createExtension(com.tcn.cloud.api.api.v0alpha.CreateExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateExtensionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a pbx_extension with the given pbx_extension_sid.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes deleteExtension(com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteExtensionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an extension as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     *    - grpc.Internal: An unexpected error occurred updating the extension.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes updateExtension(com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateExtensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes updatePBXExtension(com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePBXExtensionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes createDNCLNumbers(com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateDNCLNumbersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the campaign or huntgroup script for the given agent's current hunt
     * group. If no script is found, it gets the hunt group responses for the
     * agent's current hunt group. It also does a mail merge with the found script
     * or responses (if able).
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes getScriptOrResponses(com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetScriptOrResponsesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings getHuntGroupAgentSettings(com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetHuntGroupAgentSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of weblinks for the hunt group in the request.
     * It replaces any parameters of a given weblink with the call data of the call sid and type from the request message or with the callback details (if a scheduled_callback_id is given).
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes listHuntGroupWebLinks(com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq request) {
      return blockingUnaryCall(
          getChannel(), getListHuntGroupWebLinksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes getHuntGroupPauseCodes(com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetHuntGroupPauseCodesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the call history of the requested agent for the past day or
     * session_sid, depending on the filter parameter.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes listAgentCallHistory(com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentCallHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all client phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes listClientPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq request) {
      return blockingUnaryCall(
          getChannel(), getListClientPhoneBookEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all hunt group phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes listHuntGroupPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq request) {
      return blockingUnaryCall(
          getChannel(), getListHuntGroupPhoneBookEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes createPhoneBookEntry(com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq request) {
      return blockingUnaryCall(
          getChannel(), getCreatePhoneBookEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes updatePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePhoneBookEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes the phone_book with the phone_book_sid given on the reques message.
     * Required Permissions:
     *    AGENT_MANAGER
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes deletePhoneBookEntry(com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq request) {
      return blockingUnaryCall(
          getChannel(), getDeletePhoneBookEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists caller_id, outbound and transfer phone books for the requesting client and given hunt group sid.
     * Entries will be ordered by entry_name and phone_number.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the client_sid or hunt_group_sid in the request are invalid.
     *   - grpc.Internal: unexpected error occurred when retrieving the phone books.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes listPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq request) {
      return blockingUnaryCall(
          getChannel(), getListPhoneBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes listAgentTriggers(com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentTriggersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all running broadcasts (task groups) for the requesting agent and hunt_group_sid in the request.
     * Calculates the percentage of completed tasks for each of those task groups.
     * Calculates the overall task completion percentage of all matching task groups.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes getCampaignCompletionStatus(com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignCompletionStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uses lost peer call sid and call type from the request to get information about lost call
     * gets the name and hunt group of the agent that was connected to that call and all types of skills the call has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the call_sid in the request in invalid.
     *   - grpc.NotFound: the call sid provided wasn't previously connected to any agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes getLostPeerInfo(com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getGetLostPeerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all the available Disposition Keys
     * Required permissions:
     *   NONE
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes getDispositionKeys(com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq request) {
      return blockingUnaryCall(
          getChannel(), getGetDispositionKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes getReadyAgents(com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetReadyAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns lists with call data of calls that were:
     * Placed on multihold by the requesting agent.
     * Queued, are ready to be handled and require a subset of the agent_skills provided.
     * Placed in the Hold Queue Monitor, haven't been picked up yet and require a subset of the agent_skills provided.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the agent_session_sid provided in the request is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes listAgentQueueAndOnHoldCallData(com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentQueueAndOnHoldCallDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes saveAgentCallResponses(com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq request) {
      return blockingUnaryCall(
          getChannel(), getSaveAgentCallResponsesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes listAgentTransferOptions(com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentTransferOptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes updateAgentCallResponseValue(com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentCallResponseValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes getIntercomPeerInfo(com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getGetIntercomPeerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the requesting user's org response evaluators.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes listOrgResponseEvaluators(com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq request) {
      return blockingUnaryCall(
          getChannel(), getListOrgResponseEvaluatorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes getQueueConfigurationOptionsArray(com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq request) {
      return blockingUnaryCall(
          getChannel(), getGetQueueConfigurationOptionsArrayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the rules for conditionally adding a number to the DNCL depending on
     * responses or scripts
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes getConditionalDNCLRules(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetConditionalDNCLRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ManualDialStartRes manualDialStart(com.tcn.cloud.api.api.v0alpha.ManualDialStartReq request) {
      return blockingUnaryCall(
          getChannel(), getManualDialStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes> getExtendedCallHistories(
        com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetExtendedCallHistoriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes listWhiteListPhoneBooks(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq request) {
      return blockingUnaryCall(
          getChannel(), getListWhiteListPhoneBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes downloadCallRecording(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadCallRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes downloadCallRecordings(com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq request) {
      return blockingUnaryCall(
          getChannel(), getDownloadCallRecordingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes placePreviewDialCall(com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq request) {
      return blockingUnaryCall(
          getChannel(), getPlacePreviewDialCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes cancelPreviewDialCall(com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq request) {
      return blockingUnaryCall(
          getChannel(), getCancelPreviewDialCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.Nil updateTaskStatus(com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTaskStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCallbackRoutingAgents returns a list of agents that are allowed to make a callback.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes listCallbackRoutingAgents(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq request) {
      return blockingUnaryCall(
          getChannel(), getListCallbackRoutingAgentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes listCallbackRoutingSkills(com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq request) {
      return blockingUnaryCall(
          getChannel(), getListCallbackRoutingSkillsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes handleRecordingDelay(com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq request) {
      return blockingUnaryCall(
          getChannel(), getHandleRecordingDelayMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes updateAgentAssignedHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentAssignedHuntGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetCallDataRes getCallData(com.tcn.cloud.api.api.v0alpha.GetCallDataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCallDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes listHuntGroups(com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getListHuntGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the hunt groups an agent within a given hunt group can reassign
     * themselves to. The reassignment hunt groups can optionally be limited by a
     * hunt group setting. If a hunt group does not allow reassignment, the
     * returned list will be empty.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes listReassignmentHuntGroups(com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq request) {
      return blockingUnaryCall(
          getChannel(), getListReassignmentHuntGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes getOrgAgentSettings(com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetOrgAgentSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes listCallerIdsFromBucket(com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq request) {
      return blockingUnaryCall(
          getChannel(), getListCallerIdsFromBucketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes saveLastCallResponse(com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq request) {
      return blockingUnaryCall(
          getChannel(), getSaveLastCallResponseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes listAgentCallLogsByCallSidAndType(com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentCallLogsByCallSidAndTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the keys and values of the latest responses for the given call_sid,
     * call_type and agent_sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes listAgentCallResponseValues(com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentCallResponseValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get contact schema details based on contact group sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactSchema getContactSchemaByContactGroup(com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getGetContactSchemaByContactGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List contact group details based on client sid from contact_group table
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes listContactGroupDetailsByClientSid(com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq request) {
      return blockingUnaryCall(
          getChannel(), getListContactGroupDetailsByClientSidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get contact group details based on contact group sid from contact_group
     * table
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactGroup getContactGroupDetails(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getGetContactGroupDetailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get contact group size based on contacts size
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes getContactGroupSize(com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getGetContactGroupSizeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create contact field description details
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes createContactFieldDescription(com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateContactFieldDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete contact field description details
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes deleteContactFieldDescription(com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteContactFieldDescriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List contact field desc details from contact_field_description table
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes listContactFieldDescriptions(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq request) {
      return blockingUnaryCall(
          getChannel(), getListContactFieldDescriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List contact field description details based on contact group sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes listContactFieldDescriptionsByCGSid(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq request) {
      return blockingUnaryCall(
          getChannel(), getListContactFieldDescriptionsByCGSidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List contactImportTemplates based on client_sid from
     * contact_import_template table
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes listContactImportTemplates(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq request) {
      return blockingUnaryCall(
          getChannel(), getListContactImportTemplatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates task data for a preview record to finished and logs an agent
     * session event
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes updatePreviewRecordToFinished(com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePreviewRecordToFinishedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the requesting agent's hunt_group_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes updateAgentHuntGroup(com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentHuntGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates every given user's hunt_group_sid.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.Internal: an error occurred while interacting with the database.
     *    - grpc.InvalidArgument: the hunt_group_sid or the user id list is empty or contains an invalid value.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes multiAgentHuntGroupAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq request) {
      return blockingUnaryCall(
          getChannel(), getMultiAgentHuntGroupAssignmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentProfile returns an agent profile.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentProfile getAgentProfile(com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RecalculateBilling updates statuses for every billing type given on the
     * request message for either the current or previous month.
     * Only data that has already been summed for billing will have it's
     * status updated.
     * Required Permissions:
     *  EDIT_BILLING
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes recalculateBilling(com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq request) {
      return blockingUnaryCall(
          getChannel(), getRecalculateBillingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets information of the requesting client's broadcast templates (template_number, name, type, modify_date)
     * It reports if each found template is either STANDARD or LAYERED.
     * Required permissions:
     *   NONE
     * Errors:
     *   NONE
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes listOutboundBroadcastTemplateData(com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq request) {
      return blockingUnaryCall(
          getChannel(), getListOutboundBroadcastTemplateDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign every skill to every agent with the given aptitude.
     * Errors:
     *    - grpc.Invalid: the aptitude field is invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes multiAgentSkillAssignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq request) {
      return blockingUnaryCall(
          getChannel(), getMultiAgentSkillAssignmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unassigns every given skill from every given user.
     * Errors:
     *    - grpc.InvalidArgument:
     *        - the user_ids list is empty or contains an empty string.
     *        - one or more of the user_ids does not belong to the client.
     *    - grpc.Internal: an error occurred while deleting the skill assignments.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes multiAgentSkillUnassignment(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq request) {
      return blockingUnaryCall(
          getChannel(), getMultiAgentSkillUnassignmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List of agent hunt groups based on client sid
     * that have manually approved messages enabled
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes listMAMAgentHuntGroupsByClientSid(com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq request) {
      return blockingUnaryCall(
          getChannel(), getListMAMAgentHuntGroupsByClientSidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List every tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes listTtsVoices(com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq request) {
      return blockingUnaryCall(
          getChannel(), getListTtsVoicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the actual_name or port field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to insert the new tts voice.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes createTtsVoice(com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateTtsVoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a tts voice with the given tts_voice_sid.
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the tts_voice_sid field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to remove the tts voice.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes deleteTtsVoice(com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTtsVoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List of account custom data keys based on client sid
     * Required Permissions:
     *   ORG_VIEW
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes listCustomDataKeys(com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq request) {
      return blockingUnaryCall(
          getChannel(), getListCustomDataKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Data Key as defined by the request message
     * the client_properties_sid should not be set, this is assigned on the backend
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom_data_key field was not set
     *    - grpc.Internal: error creating custom data key
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes createCustomDataKey(com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomDataKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a Custom Data Key with the sid given on the request message.
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid field is invalid.
     *    - grpc.NotFound: no custom data key was deleted for the client_properties_sid.
     *    - grpc.Internal: an error occurred while trying to remove the custom data key.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes deleteCustomDataKey(com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCustomDataKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a custom data key with the client_properties_sid and data key
     * given on the request
     * Required Permissions;
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid was empty or the data key was not set
     *    - grpc.Internal: error updating custom data key, more than 1 custom data key records affected
     *    - grpc.NotFound: no matching custom data key found
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes updateCustomDataKey(com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCustomDataKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Activity logs for given users and by specified time range
     * Required Permissions;
     *   CUSTOMER_SUPPORT
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes> getActivityLogHistories(
        com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq request) {
      return blockingServerStreamingCall(
          getChannel(), getGetActivityLogHistoriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List agent and queue table template properties by client sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes listTableTemplateProperties(com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq request) {
      return blockingUnaryCall(
          getChannel(), getListTableTemplatePropertiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List agent skills filters by client sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes listAgentSkillsFilters(com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentSkillsFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List Schedule Rules
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult listScheduleRules(com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListScheduleRulesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List custom report filters by client sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes listCustomReportFilters(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq request) {
      return blockingUnaryCall(
          getChannel(), getListCustomReportFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List sms numbers by client sid
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes listSmsNumbers(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq request) {
      return blockingUnaryCall(
          getChannel(), getListSmsNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class P3ApiFutureStub extends io.grpc.stub.AbstractStub<P3ApiFutureStub> {
    private P3ApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private P3ApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P3ApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new P3ApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.HuntGroup> getAgentHuntGroup(
        com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentHuntGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentSession> getAgentSession(
        com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes> getAgentSkills(
        com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the client_sid or name in the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes> createAgentSkill(
        com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAgentSkillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an agent skill as defined by the request message.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid or name in the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes> updateAgentSkill(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentSkillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the agent skill with the agent_skill_sid given on the request.
     * Errors:
     *    - grpc.InvalidArgument: the agent_skill_sid in the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes> deleteAgentSkill(
        com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAgentSkillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes> listSkillsForCurrentAgent(
        com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSkillsForCurrentAgentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of skills filtered by types given on
     * the request message field type_filter. Leaving the type_filter
     * field empty will return all types of skills.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSkillsRes> listSkills(
        com.tcn.cloud.api.api.v0alpha.ListSkillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an agents assigned skills as defined by the skills list on
     * the request message.
     * Errors:
     *    - grpc.InvalidArgument: the user_id on the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes> updateAgentSkills(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentSkillsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Agent> getCurrentAgent(
        com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentAgentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes> getClientInfoData(
        com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientInfoDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes> getClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientInfoDisplayTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes> listAgentStatisticsData(
        com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentStatisticsDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all agent and hunt group PBX extensions that the requested agent has.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes> listPBXExtensions(
        com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPBXExtensionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists every agent extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes> listAgentExtensions(
        com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentExtensionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists every hunt group extension for the current client
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.Internal: unexpected error getting pbx_extensions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes> listHuntGroupExtensions(
        com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHuntGroupExtensionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new extension as defined by the request message
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request has missing or invalid fields.
     *    - grpc.Internal: An unexpected error occurred while saving the extension.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateExtensionRes> createExtension(
        com.tcn.cloud.api.api.v0alpha.CreateExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateExtensionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a pbx_extension with the given pbx_extension_sid.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes> deleteExtension(
        com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteExtensionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an extension as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: The request had invalid or missing fields.
     *    - grpc.Internal: An unexpected error occurred updating the extension.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes> updateExtension(
        com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateExtensionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes> updatePBXExtension(
        com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePBXExtensionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes> createDNCLNumbers(
        com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDNCLNumbersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the campaign or huntgroup script for the given agent's current hunt
     * group. If no script is found, it gets the hunt group responses for the
     * agent's current hunt group. It also does a mail merge with the found script
     * or responses (if able).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes> getScriptOrResponses(
        com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScriptOrResponsesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings> getHuntGroupAgentSettings(
        com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHuntGroupAgentSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of weblinks for the hunt group in the request.
     * It replaces any parameters of a given weblink with the call data of the call sid and type from the request message or with the callback details (if a scheduled_callback_id is given).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes> listHuntGroupWebLinks(
        com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHuntGroupWebLinksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes> getHuntGroupPauseCodes(
        com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHuntGroupPauseCodesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the call history of the requested agent for the past day or
     * session_sid, depending on the filter parameter.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes> listAgentCallHistory(
        com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentCallHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all client phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes> listClientPhoneBookEntries(
        com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListClientPhoneBookEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all hunt group phone book entries.
     * Required Permissions:
     *  AGENT_MANAGER
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes> listHuntGroupPhoneBookEntries(
        com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHuntGroupPhoneBookEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes> createPhoneBookEntry(
        com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePhoneBookEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing phone_book as defined by the request message.
     * Required Permissions:
     *    AGENT_MANAGER
     * Errors:
     *    - grpc.InvalidArgument: the fields on the request are missing or invalid.
     *    - grpc.Internal: unexpected error occurred when saving the phone book.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes> updatePhoneBookEntry(
        com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePhoneBookEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes the phone_book with the phone_book_sid given on the reques message.
     * Required Permissions:
     *    AGENT_MANAGER
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes> deletePhoneBookEntry(
        com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePhoneBookEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists caller_id, outbound and transfer phone books for the requesting client and given hunt group sid.
     * Entries will be ordered by entry_name and phone_number.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the client_sid or hunt_group_sid in the request are invalid.
     *   - grpc.Internal: unexpected error occurred when retrieving the phone books.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes> listPhoneBooks(
        com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListPhoneBooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes> listAgentTriggers(
        com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentTriggersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all running broadcasts (task groups) for the requesting agent and hunt_group_sid in the request.
     * Calculates the percentage of completed tasks for each of those task groups.
     * Calculates the overall task completion percentage of all matching task groups.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes> getCampaignCompletionStatus(
        com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignCompletionStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Uses lost peer call sid and call type from the request to get information about lost call
     * gets the name and hunt group of the agent that was connected to that call and all types of skills the call has.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the call_sid in the request in invalid.
     *   - grpc.NotFound: the call sid provided wasn't previously connected to any agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes> getLostPeerInfo(
        com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLostPeerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all the available Disposition Keys
     * Required permissions:
     *   NONE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes> getDispositionKeys(
        com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDispositionKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes> getReadyAgents(
        com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReadyAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns lists with call data of calls that were:
     * Placed on multihold by the requesting agent.
     * Queued, are ready to be handled and require a subset of the agent_skills provided.
     * Placed in the Hold Queue Monitor, haven't been picked up yet and require a subset of the agent_skills provided.
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the agent_session_sid provided in the request is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes> listAgentQueueAndOnHoldCallData(
        com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentQueueAndOnHoldCallDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes> saveAgentCallResponses(
        com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAgentCallResponsesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes> listAgentTransferOptions(
        com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentTransferOptionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes> updateAgentCallResponseValue(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentCallResponseValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes> getIntercomPeerInfo(
        com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntercomPeerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the requesting user's org response evaluators.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes> listOrgResponseEvaluators(
        com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListOrgResponseEvaluatorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes> getQueueConfigurationOptionsArray(
        com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueueConfigurationOptionsArrayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the rules for conditionally adding a number to the DNCL depending on
     * responses or scripts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes> getConditionalDNCLRules(
        com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetConditionalDNCLRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ManualDialStartRes> manualDialStart(
        com.tcn.cloud.api.api.v0alpha.ManualDialStartReq request) {
      return futureUnaryCall(
          getChannel().newCall(getManualDialStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes> listWhiteListPhoneBooks(
        com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListWhiteListPhoneBooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> downloadCallRecording(
        com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadCallRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes> downloadCallRecordings(
        com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadCallRecordingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes> placePreviewDialCall(
        com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPlacePreviewDialCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes> cancelPreviewDialCall(
        com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelPreviewDialCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.Nil> updateTaskStatus(
        com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTaskStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCallbackRoutingAgents returns a list of agents that are allowed to make a callback.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes> listCallbackRoutingAgents(
        com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCallbackRoutingAgentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes> listCallbackRoutingSkills(
        com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCallbackRoutingSkillsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes> handleRecordingDelay(
        com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq request) {
      return futureUnaryCall(
          getChannel().newCall(getHandleRecordingDelayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes> updateAgentAssignedHuntGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentAssignedHuntGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetCallDataRes> getCallData(
        com.tcn.cloud.api.api.v0alpha.GetCallDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCallDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes> listHuntGroups(
        com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListHuntGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the hunt groups an agent within a given hunt group can reassign
     * themselves to. The reassignment hunt groups can optionally be limited by a
     * hunt group setting. If a hunt group does not allow reassignment, the
     * returned list will be empty.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes> listReassignmentHuntGroups(
        com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListReassignmentHuntGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes> getOrgAgentSettings(
        com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrgAgentSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists caller id numbers with their associated region codes for the given
     * bucket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes> listCallerIdsFromBucket(
        com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCallerIdsFromBucketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes> saveLastCallResponse(
        com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveLastCallResponseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes> listAgentCallLogsByCallSidAndType(
        com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentCallLogsByCallSidAndTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the keys and values of the latest responses for the given call_sid,
     * call_type and agent_sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes> listAgentCallResponseValues(
        com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentCallResponseValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get contact schema details based on contact group sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContactSchema> getContactSchemaByContactGroup(
        com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactSchemaByContactGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List contact group details based on client sid from contact_group table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes> listContactGroupDetailsByClientSid(
        com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListContactGroupDetailsByClientSidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get contact group details based on contact group sid from contact_group
     * table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ContactGroup> getContactGroupDetails(
        com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactGroupDetailsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get contact group size based on contacts size
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes> getContactGroupSize(
        com.tcn.cloud.api.api.v0alpha.GetContactGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactGroupSizeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create contact field description details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes> createContactFieldDescription(
        com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateContactFieldDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete contact field description details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes> deleteContactFieldDescription(
        com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteContactFieldDescriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List contact field desc details from contact_field_description table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes> listContactFieldDescriptions(
        com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListContactFieldDescriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List contact field description details based on contact group sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes> listContactFieldDescriptionsByCGSid(
        com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListContactFieldDescriptionsByCGSidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List contactImportTemplates based on client_sid from
     * contact_import_template table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes> listContactImportTemplates(
        com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListContactImportTemplatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates task data for a preview record to finished and logs an agent
     * session event
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes> updatePreviewRecordToFinished(
        com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePreviewRecordToFinishedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the requesting agent's hunt_group_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes> updateAgentHuntGroup(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentHuntGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates every given user's hunt_group_sid.
     * Required Permissions:
     *    AGENT_MANAGEMENT
     * Errors:
     *    - grpc.Internal: an error occurred while interacting with the database.
     *    - grpc.InvalidArgument: the hunt_group_sid or the user id list is empty or contains an invalid value.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes> multiAgentHuntGroupAssignment(
        com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiAgentHuntGroupAssignmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentProfile returns an agent profile.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.AgentProfile> getAgentProfile(
        com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RecalculateBilling updates statuses for every billing type given on the
     * request message for either the current or previous month.
     * Only data that has already been summed for billing will have it's
     * status updated.
     * Required Permissions:
     *  EDIT_BILLING
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes> recalculateBilling(
        com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRecalculateBillingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets information of the requesting client's broadcast templates (template_number, name, type, modify_date)
     * It reports if each found template is either STANDARD or LAYERED.
     * Required permissions:
     *   NONE
     * Errors:
     *   NONE
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes> listOutboundBroadcastTemplateData(
        com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListOutboundBroadcastTemplateDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign every skill to every agent with the given aptitude.
     * Errors:
     *    - grpc.Invalid: the aptitude field is invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes> multiAgentSkillAssignment(
        com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiAgentSkillAssignmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unassigns every given skill from every given user.
     * Errors:
     *    - grpc.InvalidArgument:
     *        - the user_ids list is empty or contains an empty string.
     *        - one or more of the user_ids does not belong to the client.
     *    - grpc.Internal: an error occurred while deleting the skill assignments.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes> multiAgentSkillUnassignment(
        com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiAgentSkillUnassignmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List of agent hunt groups based on client sid
     * that have manually approved messages enabled
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes> listMAMAgentHuntGroupsByClientSid(
        com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListMAMAgentHuntGroupsByClientSidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List every tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes> listTtsVoices(
        com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTtsVoicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new tts voice
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the actual_name or port field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to insert the new tts voice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes> createTtsVoice(
        com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTtsVoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a tts voice with the given tts_voice_sid.
     * Required Permissions:
     *    TCN_ADMIN_SETTINGS
     * Errors:
     *    - grpc.InvalidArgument: the tts_voice_sid field on the request is invalid.
     *    - grpc.Internal: an error was returned while trying to remove the tts voice.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes> deleteTtsVoice(
        com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTtsVoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List of account custom data keys based on client sid
     * Required Permissions:
     *   ORG_VIEW
     * Errors:
     *    - grpc.Internal: an error was returned while trying to retrieve the entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes> listCustomDataKeys(
        com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCustomDataKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Data Key as defined by the request message
     * the client_properties_sid should not be set, this is assigned on the backend
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The custom_data_key field was not set
     *    - grpc.Internal: error creating custom data key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes> createCustomDataKey(
        com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomDataKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a Custom Data Key with the sid given on the request message.
     * Required Permission:
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid field is invalid.
     *    - grpc.NotFound: no custom data key was deleted for the client_properties_sid.
     *    - grpc.Internal: an error occurred while trying to remove the custom data key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes> deleteCustomDataKey(
        com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCustomDataKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a custom data key with the client_properties_sid and data key
     * given on the request
     * Required Permissions;
     *   ORG_EDIT
     * Errors:
     *    - grpc.InvalidArgument: The client_properties_sid was empty or the data key was not set
     *    - grpc.Internal: error updating custom data key, more than 1 custom data key records affected
     *    - grpc.NotFound: no matching custom data key found
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes> updateCustomDataKey(
        com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCustomDataKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List agent and queue table template properties by client sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes> listTableTemplateProperties(
        com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTableTemplatePropertiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List agent skills filters by client sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes> listAgentSkillsFilters(
        com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentSkillsFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List Schedule Rules
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult> listScheduleRules(
        com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListScheduleRulesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List custom report filters by client sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes> listCustomReportFilters(
        com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListCustomReportFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List sms numbers by client sid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes> listSmsNumbers(
        com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSmsNumbersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_HUNT_GROUP = 0;
  private static final int METHODID_GET_AGENT_SESSION = 1;
  private static final int METHODID_GET_AGENT_SKILLS = 2;
  private static final int METHODID_CREATE_AGENT_SKILL = 3;
  private static final int METHODID_UPDATE_AGENT_SKILL = 4;
  private static final int METHODID_DELETE_AGENT_SKILL = 5;
  private static final int METHODID_LIST_SKILLS_FOR_CURRENT_AGENT = 6;
  private static final int METHODID_LIST_SKILLS = 7;
  private static final int METHODID_UPDATE_AGENT_SKILLS = 8;
  private static final int METHODID_GET_CURRENT_AGENT = 9;
  private static final int METHODID_GET_CLIENT_INFO_DATA = 10;
  private static final int METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE = 11;
  private static final int METHODID_LIST_AGENT_STATISTICS_DATA = 12;
  private static final int METHODID_LIST_PBXEXTENSIONS = 13;
  private static final int METHODID_LIST_AGENT_EXTENSIONS = 14;
  private static final int METHODID_LIST_HUNT_GROUP_EXTENSIONS = 15;
  private static final int METHODID_CREATE_EXTENSION = 16;
  private static final int METHODID_DELETE_EXTENSION = 17;
  private static final int METHODID_UPDATE_EXTENSION = 18;
  private static final int METHODID_UPDATE_PBXEXTENSION = 19;
  private static final int METHODID_CREATE_DNCLNUMBERS = 20;
  private static final int METHODID_GET_SCRIPT_OR_RESPONSES = 21;
  private static final int METHODID_GET_HUNT_GROUP_AGENT_SETTINGS = 22;
  private static final int METHODID_LIST_HUNT_GROUP_WEB_LINKS = 23;
  private static final int METHODID_GET_HUNT_GROUP_PAUSE_CODES = 24;
  private static final int METHODID_LIST_AGENT_CALL_HISTORY = 25;
  private static final int METHODID_LIST_CLIENT_PHONE_BOOK_ENTRIES = 26;
  private static final int METHODID_LIST_HUNT_GROUP_PHONE_BOOK_ENTRIES = 27;
  private static final int METHODID_CREATE_PHONE_BOOK_ENTRY = 28;
  private static final int METHODID_UPDATE_PHONE_BOOK_ENTRY = 29;
  private static final int METHODID_DELETE_PHONE_BOOK_ENTRY = 30;
  private static final int METHODID_LIST_PHONE_BOOKS = 31;
  private static final int METHODID_LIST_AGENT_TRIGGERS = 32;
  private static final int METHODID_GET_CAMPAIGN_COMPLETION_STATUS = 33;
  private static final int METHODID_GET_LOST_PEER_INFO = 34;
  private static final int METHODID_GET_DISPOSITION_KEYS = 35;
  private static final int METHODID_GET_READY_AGENTS = 36;
  private static final int METHODID_LIST_AGENT_QUEUE_AND_ON_HOLD_CALL_DATA = 37;
  private static final int METHODID_SAVE_AGENT_CALL_RESPONSES = 38;
  private static final int METHODID_LIST_AGENT_TRANSFER_OPTIONS = 39;
  private static final int METHODID_UPDATE_AGENT_CALL_RESPONSE_VALUE = 40;
  private static final int METHODID_GET_INTERCOM_PEER_INFO = 41;
  private static final int METHODID_LIST_ORG_RESPONSE_EVALUATORS = 42;
  private static final int METHODID_GET_QUEUE_CONFIGURATION_OPTIONS_ARRAY = 43;
  private static final int METHODID_GET_CONDITIONAL_DNCLRULES = 44;
  private static final int METHODID_MANUAL_DIAL_START = 45;
  private static final int METHODID_GET_EXTENDED_CALL_HISTORIES = 46;
  private static final int METHODID_LIST_WHITE_LIST_PHONE_BOOKS = 47;
  private static final int METHODID_DOWNLOAD_CALL_RECORDING = 48;
  private static final int METHODID_DOWNLOAD_CALL_RECORDINGS = 49;
  private static final int METHODID_PLACE_PREVIEW_DIAL_CALL = 50;
  private static final int METHODID_CANCEL_PREVIEW_DIAL_CALL = 51;
  private static final int METHODID_UPDATE_TASK_STATUS = 52;
  private static final int METHODID_LIST_CALLBACK_ROUTING_AGENTS = 53;
  private static final int METHODID_LIST_CALLBACK_ROUTING_SKILLS = 54;
  private static final int METHODID_HANDLE_RECORDING_DELAY = 55;
  private static final int METHODID_UPDATE_AGENT_ASSIGNED_HUNT_GROUP = 56;
  private static final int METHODID_GET_CALL_DATA = 57;
  private static final int METHODID_LIST_HUNT_GROUPS = 58;
  private static final int METHODID_LIST_REASSIGNMENT_HUNT_GROUPS = 59;
  private static final int METHODID_GET_ORG_AGENT_SETTINGS = 60;
  private static final int METHODID_LIST_CALLER_IDS_FROM_BUCKET = 61;
  private static final int METHODID_SAVE_LAST_CALL_RESPONSE = 62;
  private static final int METHODID_LIST_AGENT_CALL_LOGS_BY_CALL_SID_AND_TYPE = 63;
  private static final int METHODID_LIST_AGENT_CALL_RESPONSE_VALUES = 64;
  private static final int METHODID_GET_CONTACT_SCHEMA_BY_CONTACT_GROUP = 65;
  private static final int METHODID_LIST_CONTACT_GROUP_DETAILS_BY_CLIENT_SID = 66;
  private static final int METHODID_GET_CONTACT_GROUP_DETAILS = 67;
  private static final int METHODID_GET_CONTACT_GROUP_SIZE = 68;
  private static final int METHODID_CREATE_CONTACT_FIELD_DESCRIPTION = 69;
  private static final int METHODID_DELETE_CONTACT_FIELD_DESCRIPTION = 70;
  private static final int METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS = 71;
  private static final int METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS_BY_CGSID = 72;
  private static final int METHODID_LIST_CONTACT_IMPORT_TEMPLATES = 73;
  private static final int METHODID_UPDATE_PREVIEW_RECORD_TO_FINISHED = 74;
  private static final int METHODID_UPDATE_AGENT_HUNT_GROUP = 75;
  private static final int METHODID_MULTI_AGENT_HUNT_GROUP_ASSIGNMENT = 76;
  private static final int METHODID_GET_AGENT_PROFILE = 77;
  private static final int METHODID_RECALCULATE_BILLING = 78;
  private static final int METHODID_LIST_OUTBOUND_BROADCAST_TEMPLATE_DATA = 79;
  private static final int METHODID_MULTI_AGENT_SKILL_ASSIGNMENT = 80;
  private static final int METHODID_MULTI_AGENT_SKILL_UNASSIGNMENT = 81;
  private static final int METHODID_LIST_MAMAGENT_HUNT_GROUPS_BY_CLIENT_SID = 82;
  private static final int METHODID_LIST_TTS_VOICES = 83;
  private static final int METHODID_CREATE_TTS_VOICE = 84;
  private static final int METHODID_DELETE_TTS_VOICE = 85;
  private static final int METHODID_LIST_CUSTOM_DATA_KEYS = 86;
  private static final int METHODID_CREATE_CUSTOM_DATA_KEY = 87;
  private static final int METHODID_DELETE_CUSTOM_DATA_KEY = 88;
  private static final int METHODID_UPDATE_CUSTOM_DATA_KEY = 89;
  private static final int METHODID_GET_ACTIVITY_LOG_HISTORIES = 90;
  private static final int METHODID_LIST_TABLE_TEMPLATE_PROPERTIES = 91;
  private static final int METHODID_LIST_AGENT_SKILLS_FILTERS = 92;
  private static final int METHODID_LIST_SCHEDULE_RULES = 93;
  private static final int METHODID_LIST_CUSTOM_REPORT_FILTERS = 94;
  private static final int METHODID_LIST_SMS_NUMBERS = 95;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final P3ApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(P3ApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT_HUNT_GROUP:
          serviceImpl.getAgentHuntGroup((com.tcn.cloud.api.api.v0alpha.GetAgentHuntGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroup>) responseObserver);
          break;
        case METHODID_GET_AGENT_SESSION:
          serviceImpl.getAgentSession((com.tcn.cloud.api.api.v0alpha.GetAgentSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentSession>) responseObserver);
          break;
        case METHODID_GET_AGENT_SKILLS:
          serviceImpl.getAgentSkills((com.tcn.cloud.api.api.v0alpha.GetAgentSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentSkillsRes>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_SKILL:
          serviceImpl.createAgentSkill((com.tcn.cloud.api.api.v0alpha.CreateAgentSkillReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateAgentSkillRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_SKILL:
          serviceImpl.updateAgentSkill((com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillRes>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_SKILL:
          serviceImpl.deleteAgentSkill((com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteAgentSkillRes>) responseObserver);
          break;
        case METHODID_LIST_SKILLS_FOR_CURRENT_AGENT:
          serviceImpl.listSkillsForCurrentAgent((com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsForCurrentAgentRes>) responseObserver);
          break;
        case METHODID_LIST_SKILLS:
          serviceImpl.listSkills((com.tcn.cloud.api.api.v0alpha.ListSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSkillsRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_SKILLS:
          serviceImpl.updateAgentSkills((com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentSkillsRes>) responseObserver);
          break;
        case METHODID_GET_CURRENT_AGENT:
          serviceImpl.getCurrentAgent((com.tcn.cloud.api.api.v0alpha.GetCurrentAgentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Agent>) responseObserver);
          break;
        case METHODID_GET_CLIENT_INFO_DATA:
          serviceImpl.getClientInfoData((com.tcn.cloud.api.api.v0alpha.GetClientInfoDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDataRes>) responseObserver);
          break;
        case METHODID_GET_CLIENT_INFO_DISPLAY_TEMPLATE:
          serviceImpl.getClientInfoDisplayTemplate((com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_STATISTICS_DATA:
          serviceImpl.listAgentStatisticsData((com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentStatisticsDataRes>) responseObserver);
          break;
        case METHODID_LIST_PBXEXTENSIONS:
          serviceImpl.listPBXExtensions((com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPBXExtensionsRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_EXTENSIONS:
          serviceImpl.listAgentExtensions((com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentExtensionsRes>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUP_EXTENSIONS:
          serviceImpl.listHuntGroupExtensions((com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupExtensionsRes>) responseObserver);
          break;
        case METHODID_CREATE_EXTENSION:
          serviceImpl.createExtension((com.tcn.cloud.api.api.v0alpha.CreateExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateExtensionRes>) responseObserver);
          break;
        case METHODID_DELETE_EXTENSION:
          serviceImpl.deleteExtension((com.tcn.cloud.api.api.v0alpha.DeleteExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteExtensionRes>) responseObserver);
          break;
        case METHODID_UPDATE_EXTENSION:
          serviceImpl.updateExtension((com.tcn.cloud.api.api.v0alpha.UpdateExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateExtensionRes>) responseObserver);
          break;
        case METHODID_UPDATE_PBXEXTENSION:
          serviceImpl.updatePBXExtension((com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePBXExtensionRes>) responseObserver);
          break;
        case METHODID_CREATE_DNCLNUMBERS:
          serviceImpl.createDNCLNumbers((com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateDNCLNumbersRes>) responseObserver);
          break;
        case METHODID_GET_SCRIPT_OR_RESPONSES:
          serviceImpl.getScriptOrResponses((com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetScriptOrResponsesRes>) responseObserver);
          break;
        case METHODID_GET_HUNT_GROUP_AGENT_SETTINGS:
          serviceImpl.getHuntGroupAgentSettings((com.tcn.cloud.api.api.v0alpha.GetHuntGroupAgentSettingsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HuntGroupAgentSettings>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUP_WEB_LINKS:
          serviceImpl.listHuntGroupWebLinks((com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupWebLinksRes>) responseObserver);
          break;
        case METHODID_GET_HUNT_GROUP_PAUSE_CODES:
          serviceImpl.getHuntGroupPauseCodes((com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetHuntGroupPauseCodesRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_CALL_HISTORY:
          serviceImpl.listAgentCallHistory((com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallHistoryRes>) responseObserver);
          break;
        case METHODID_LIST_CLIENT_PHONE_BOOK_ENTRIES:
          serviceImpl.listClientPhoneBookEntries((com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListClientPhoneBookEntriesRes>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUP_PHONE_BOOK_ENTRIES:
          serviceImpl.listHuntGroupPhoneBookEntries((com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes>) responseObserver);
          break;
        case METHODID_CREATE_PHONE_BOOK_ENTRY:
          serviceImpl.createPhoneBookEntry((com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreatePhoneBookEntryRes>) responseObserver);
          break;
        case METHODID_UPDATE_PHONE_BOOK_ENTRY:
          serviceImpl.updatePhoneBookEntry((com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePhoneBookEntryRes>) responseObserver);
          break;
        case METHODID_DELETE_PHONE_BOOK_ENTRY:
          serviceImpl.deletePhoneBookEntry((com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeletePhoneBookEntryRes>) responseObserver);
          break;
        case METHODID_LIST_PHONE_BOOKS:
          serviceImpl.listPhoneBooks((com.tcn.cloud.api.api.v0alpha.ListPhoneBooksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListPhoneBooksRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_TRIGGERS:
          serviceImpl.listAgentTriggers((com.tcn.cloud.api.api.v0alpha.ListAgentTriggersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTriggersRes>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGN_COMPLETION_STATUS:
          serviceImpl.getCampaignCompletionStatus((com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCampaignCompletionStatusRes>) responseObserver);
          break;
        case METHODID_GET_LOST_PEER_INFO:
          serviceImpl.getLostPeerInfo((com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetLostPeerInfoRes>) responseObserver);
          break;
        case METHODID_GET_DISPOSITION_KEYS:
          serviceImpl.getDispositionKeys((com.tcn.cloud.api.api.v0alpha.GetDispositionKeysReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetDispositionKeysRes>) responseObserver);
          break;
        case METHODID_GET_READY_AGENTS:
          serviceImpl.getReadyAgents((com.tcn.cloud.api.api.v0alpha.GetReadyAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetReadyAgentsRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_QUEUE_AND_ON_HOLD_CALL_DATA:
          serviceImpl.listAgentQueueAndOnHoldCallData((com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentQueueAndOnHoldCallDataRes>) responseObserver);
          break;
        case METHODID_SAVE_AGENT_CALL_RESPONSES:
          serviceImpl.saveAgentCallResponses((com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveAgentCallResponsesRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_TRANSFER_OPTIONS:
          serviceImpl.listAgentTransferOptions((com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentTransferOptionsRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_CALL_RESPONSE_VALUE:
          serviceImpl.updateAgentCallResponseValue((com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentCallResponseValueRes>) responseObserver);
          break;
        case METHODID_GET_INTERCOM_PEER_INFO:
          serviceImpl.getIntercomPeerInfo((com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetIntercomPeerInfoRes>) responseObserver);
          break;
        case METHODID_LIST_ORG_RESPONSE_EVALUATORS:
          serviceImpl.listOrgResponseEvaluators((com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOrgResponseEvaluatorsRes>) responseObserver);
          break;
        case METHODID_GET_QUEUE_CONFIGURATION_OPTIONS_ARRAY:
          serviceImpl.getQueueConfigurationOptionsArray((com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetQueueConfigurationOptionsArrayRes>) responseObserver);
          break;
        case METHODID_GET_CONDITIONAL_DNCLRULES:
          serviceImpl.getConditionalDNCLRules((com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes>) responseObserver);
          break;
        case METHODID_MANUAL_DIAL_START:
          serviceImpl.manualDialStart((com.tcn.cloud.api.api.v0alpha.ManualDialStartReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ManualDialStartRes>) responseObserver);
          break;
        case METHODID_GET_EXTENDED_CALL_HISTORIES:
          serviceImpl.getExtendedCallHistories((com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListExtendedCallHistoryRes>) responseObserver);
          break;
        case METHODID_LIST_WHITE_LIST_PHONE_BOOKS:
          serviceImpl.listWhiteListPhoneBooks((com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_CALL_RECORDING:
          serviceImpl.downloadCallRecording((com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>) responseObserver);
          break;
        case METHODID_DOWNLOAD_CALL_RECORDINGS:
          serviceImpl.downloadCallRecordings((com.tcn.cloud.api.api.v0alpha.DownloadCallRecordingsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DownloadRecordingRes>) responseObserver);
          break;
        case METHODID_PLACE_PREVIEW_DIAL_CALL:
          serviceImpl.placePreviewDialCall((com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.PlacePreviewDialCallRes>) responseObserver);
          break;
        case METHODID_CANCEL_PREVIEW_DIAL_CALL:
          serviceImpl.cancelPreviewDialCall((com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CancelPreviewDialCallRes>) responseObserver);
          break;
        case METHODID_UPDATE_TASK_STATUS:
          serviceImpl.updateTaskStatus((com.tcn.cloud.api.api.v0alpha.UpdateTaskStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.Nil>) responseObserver);
          break;
        case METHODID_LIST_CALLBACK_ROUTING_AGENTS:
          serviceImpl.listCallbackRoutingAgents((com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingAgentsRes>) responseObserver);
          break;
        case METHODID_LIST_CALLBACK_ROUTING_SKILLS:
          serviceImpl.listCallbackRoutingSkills((com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallbackRoutingSkillsRes>) responseObserver);
          break;
        case METHODID_HANDLE_RECORDING_DELAY:
          serviceImpl.handleRecordingDelay((com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.HandleRecordingDelayRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_ASSIGNED_HUNT_GROUP:
          serviceImpl.updateAgentAssignedHuntGroup((com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupRes>) responseObserver);
          break;
        case METHODID_GET_CALL_DATA:
          serviceImpl.getCallData((com.tcn.cloud.api.api.v0alpha.GetCallDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetCallDataRes>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUPS:
          serviceImpl.listHuntGroups((com.tcn.cloud.api.api.v0alpha.ListHuntGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListHuntGroupsRes>) responseObserver);
          break;
        case METHODID_LIST_REASSIGNMENT_HUNT_GROUPS:
          serviceImpl.listReassignmentHuntGroups((com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListReassignmentHuntGroupsRes>) responseObserver);
          break;
        case METHODID_GET_ORG_AGENT_SETTINGS:
          serviceImpl.getOrgAgentSettings((com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetOrgAgentSettingsRes>) responseObserver);
          break;
        case METHODID_LIST_CALLER_IDS_FROM_BUCKET:
          serviceImpl.listCallerIdsFromBucket((com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCallerIdsFromBucketRes>) responseObserver);
          break;
        case METHODID_SAVE_LAST_CALL_RESPONSE:
          serviceImpl.saveLastCallResponse((com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SaveLastCallResponseRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_CALL_LOGS_BY_CALL_SID_AND_TYPE:
          serviceImpl.listAgentCallLogsByCallSidAndType((com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_CALL_RESPONSE_VALUES:
          serviceImpl.listAgentCallResponseValues((com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentCallResponseValuesRes>) responseObserver);
          break;
        case METHODID_GET_CONTACT_SCHEMA_BY_CONTACT_GROUP:
          serviceImpl.getContactSchemaByContactGroup((com.tcn.cloud.api.api.v0alpha.GetContactSchemaByContactGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactSchema>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_GROUP_DETAILS_BY_CLIENT_SID:
          serviceImpl.listContactGroupDetailsByClientSid((com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactGroupDetailsByClientSidRes>) responseObserver);
          break;
        case METHODID_GET_CONTACT_GROUP_DETAILS:
          serviceImpl.getContactGroupDetails((com.tcn.cloud.api.api.v0alpha.GetContactGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ContactGroup>) responseObserver);
          break;
        case METHODID_GET_CONTACT_GROUP_SIZE:
          serviceImpl.getContactGroupSize((com.tcn.cloud.api.api.v0alpha.GetContactGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetContactGroupSizeRes>) responseObserver);
          break;
        case METHODID_CREATE_CONTACT_FIELD_DESCRIPTION:
          serviceImpl.createContactFieldDescription((com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateContactFieldDescriptionRes>) responseObserver);
          break;
        case METHODID_DELETE_CONTACT_FIELD_DESCRIPTION:
          serviceImpl.deleteContactFieldDescription((com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteContactFieldDescriptionRes>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS:
          serviceImpl.listContactFieldDescriptions((com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_FIELD_DESCRIPTIONS_BY_CGSID:
          serviceImpl.listContactFieldDescriptionsByCGSid((com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsByCGSidRes>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_IMPORT_TEMPLATES:
          serviceImpl.listContactImportTemplates((com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes>) responseObserver);
          break;
        case METHODID_UPDATE_PREVIEW_RECORD_TO_FINISHED:
          serviceImpl.updatePreviewRecordToFinished((com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdatePreviewRecordToFinishedRes>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_HUNT_GROUP:
          serviceImpl.updateAgentHuntGroup((com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentHuntGroupRes>) responseObserver);
          break;
        case METHODID_MULTI_AGENT_HUNT_GROUP_ASSIGNMENT:
          serviceImpl.multiAgentHuntGroupAssignment((com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentHuntGroupAssignmentRes>) responseObserver);
          break;
        case METHODID_GET_AGENT_PROFILE:
          serviceImpl.getAgentProfile((com.tcn.cloud.api.api.v0alpha.GetAgentProfileReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.AgentProfile>) responseObserver);
          break;
        case METHODID_RECALCULATE_BILLING:
          serviceImpl.recalculateBilling((com.tcn.cloud.api.api.v0alpha.RecalculateBillingReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.RecalculateBillingRes>) responseObserver);
          break;
        case METHODID_LIST_OUTBOUND_BROADCAST_TEMPLATE_DATA:
          serviceImpl.listOutboundBroadcastTemplateData((com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListOutboundBroadcastTemplateDataRes>) responseObserver);
          break;
        case METHODID_MULTI_AGENT_SKILL_ASSIGNMENT:
          serviceImpl.multiAgentSkillAssignment((com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentRes>) responseObserver);
          break;
        case METHODID_MULTI_AGENT_SKILL_UNASSIGNMENT:
          serviceImpl.multiAgentSkillUnassignment((com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.MultiAgentSkillUnassignmentRes>) responseObserver);
          break;
        case METHODID_LIST_MAMAGENT_HUNT_GROUPS_BY_CLIENT_SID:
          serviceImpl.listMAMAgentHuntGroupsByClientSid((com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListMAMAgentHuntGroupsByClientSidRes>) responseObserver);
          break;
        case METHODID_LIST_TTS_VOICES:
          serviceImpl.listTtsVoices((com.tcn.cloud.api.api.v0alpha.ListTtsVoicesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTtsVoicesRes>) responseObserver);
          break;
        case METHODID_CREATE_TTS_VOICE:
          serviceImpl.createTtsVoice((com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateTtsVoiceRes>) responseObserver);
          break;
        case METHODID_DELETE_TTS_VOICE:
          serviceImpl.deleteTtsVoice((com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteTtsVoiceRes>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_DATA_KEYS:
          serviceImpl.listCustomDataKeys((com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomDataKeysRes>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_DATA_KEY:
          serviceImpl.createCustomDataKey((com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CreateCustomDataKeyRes>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOM_DATA_KEY:
          serviceImpl.deleteCustomDataKey((com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.DeleteCustomDataKeyRes>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOM_DATA_KEY:
          serviceImpl.updateCustomDataKey((com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateCustomDataKeyRes>) responseObserver);
          break;
        case METHODID_GET_ACTIVITY_LOG_HISTORIES:
          serviceImpl.getActivityLogHistories((com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes>) responseObserver);
          break;
        case METHODID_LIST_TABLE_TEMPLATE_PROPERTIES:
          serviceImpl.listTableTemplateProperties((com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListTableTemplatePropertiesRes>) responseObserver);
          break;
        case METHODID_LIST_AGENT_SKILLS_FILTERS:
          serviceImpl.listAgentSkillsFilters((com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListAgentSkillsFiltersRes>) responseObserver);
          break;
        case METHODID_LIST_SCHEDULE_RULES:
          serviceImpl.listScheduleRules((com.tcn.cloud.api.api.v0alpha.ListScheduleRulesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListScheduleRulesResult>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_REPORT_FILTERS:
          serviceImpl.listCustomReportFilters((com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersRes>) responseObserver);
          break;
        case METHODID_LIST_SMS_NUMBERS:
          serviceImpl.listSmsNumbers((com.tcn.cloud.api.api.v0alpha.ListSmsNumbersReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes>) responseObserver);
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

  private static abstract class P3ApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    P3ApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.p3api.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("P3Api");
    }
  }

  private static final class P3ApiFileDescriptorSupplier
      extends P3ApiBaseDescriptorSupplier {
    P3ApiFileDescriptorSupplier() {}
  }

  private static final class P3ApiMethodDescriptorSupplier
      extends P3ApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    P3ApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (P3ApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new P3ApiFileDescriptorSupplier())
              .addMethod(getGetAgentHuntGroupMethod())
              .addMethod(getGetAgentSessionMethod())
              .addMethod(getGetAgentSkillsMethod())
              .addMethod(getCreateAgentSkillMethod())
              .addMethod(getUpdateAgentSkillMethod())
              .addMethod(getDeleteAgentSkillMethod())
              .addMethod(getListSkillsForCurrentAgentMethod())
              .addMethod(getListSkillsMethod())
              .addMethod(getUpdateAgentSkillsMethod())
              .addMethod(getGetCurrentAgentMethod())
              .addMethod(getGetClientInfoDataMethod())
              .addMethod(getGetClientInfoDisplayTemplateMethod())
              .addMethod(getListAgentStatisticsDataMethod())
              .addMethod(getListPBXExtensionsMethod())
              .addMethod(getListAgentExtensionsMethod())
              .addMethod(getListHuntGroupExtensionsMethod())
              .addMethod(getCreateExtensionMethod())
              .addMethod(getDeleteExtensionMethod())
              .addMethod(getUpdateExtensionMethod())
              .addMethod(getUpdatePBXExtensionMethod())
              .addMethod(getCreateDNCLNumbersMethod())
              .addMethod(getGetScriptOrResponsesMethod())
              .addMethod(getGetHuntGroupAgentSettingsMethod())
              .addMethod(getListHuntGroupWebLinksMethod())
              .addMethod(getGetHuntGroupPauseCodesMethod())
              .addMethod(getListAgentCallHistoryMethod())
              .addMethod(getListClientPhoneBookEntriesMethod())
              .addMethod(getListHuntGroupPhoneBookEntriesMethod())
              .addMethod(getCreatePhoneBookEntryMethod())
              .addMethod(getUpdatePhoneBookEntryMethod())
              .addMethod(getDeletePhoneBookEntryMethod())
              .addMethod(getListPhoneBooksMethod())
              .addMethod(getListAgentTriggersMethod())
              .addMethod(getGetCampaignCompletionStatusMethod())
              .addMethod(getGetLostPeerInfoMethod())
              .addMethod(getGetDispositionKeysMethod())
              .addMethod(getGetReadyAgentsMethod())
              .addMethod(getListAgentQueueAndOnHoldCallDataMethod())
              .addMethod(getSaveAgentCallResponsesMethod())
              .addMethod(getListAgentTransferOptionsMethod())
              .addMethod(getUpdateAgentCallResponseValueMethod())
              .addMethod(getGetIntercomPeerInfoMethod())
              .addMethod(getListOrgResponseEvaluatorsMethod())
              .addMethod(getGetQueueConfigurationOptionsArrayMethod())
              .addMethod(getGetConditionalDNCLRulesMethod())
              .addMethod(getManualDialStartMethod())
              .addMethod(getGetExtendedCallHistoriesMethod())
              .addMethod(getListWhiteListPhoneBooksMethod())
              .addMethod(getDownloadCallRecordingMethod())
              .addMethod(getDownloadCallRecordingsMethod())
              .addMethod(getPlacePreviewDialCallMethod())
              .addMethod(getCancelPreviewDialCallMethod())
              .addMethod(getUpdateTaskStatusMethod())
              .addMethod(getListCallbackRoutingAgentsMethod())
              .addMethod(getListCallbackRoutingSkillsMethod())
              .addMethod(getHandleRecordingDelayMethod())
              .addMethod(getUpdateAgentAssignedHuntGroupMethod())
              .addMethod(getGetCallDataMethod())
              .addMethod(getListHuntGroupsMethod())
              .addMethod(getListReassignmentHuntGroupsMethod())
              .addMethod(getGetOrgAgentSettingsMethod())
              .addMethod(getListCallerIdsFromBucketMethod())
              .addMethod(getSaveLastCallResponseMethod())
              .addMethod(getListAgentCallLogsByCallSidAndTypeMethod())
              .addMethod(getListAgentCallResponseValuesMethod())
              .addMethod(getGetContactSchemaByContactGroupMethod())
              .addMethod(getListContactGroupDetailsByClientSidMethod())
              .addMethod(getGetContactGroupDetailsMethod())
              .addMethod(getGetContactGroupSizeMethod())
              .addMethod(getCreateContactFieldDescriptionMethod())
              .addMethod(getDeleteContactFieldDescriptionMethod())
              .addMethod(getListContactFieldDescriptionsMethod())
              .addMethod(getListContactFieldDescriptionsByCGSidMethod())
              .addMethod(getListContactImportTemplatesMethod())
              .addMethod(getUpdatePreviewRecordToFinishedMethod())
              .addMethod(getUpdateAgentHuntGroupMethod())
              .addMethod(getMultiAgentHuntGroupAssignmentMethod())
              .addMethod(getGetAgentProfileMethod())
              .addMethod(getRecalculateBillingMethod())
              .addMethod(getListOutboundBroadcastTemplateDataMethod())
              .addMethod(getMultiAgentSkillAssignmentMethod())
              .addMethod(getMultiAgentSkillUnassignmentMethod())
              .addMethod(getListMAMAgentHuntGroupsByClientSidMethod())
              .addMethod(getListTtsVoicesMethod())
              .addMethod(getCreateTtsVoiceMethod())
              .addMethod(getDeleteTtsVoiceMethod())
              .addMethod(getListCustomDataKeysMethod())
              .addMethod(getCreateCustomDataKeyMethod())
              .addMethod(getDeleteCustomDataKeyMethod())
              .addMethod(getUpdateCustomDataKeyMethod())
              .addMethod(getGetActivityLogHistoriesMethod())
              .addMethod(getListTableTemplatePropertiesMethod())
              .addMethod(getListAgentSkillsFiltersMethod())
              .addMethod(getListScheduleRulesMethod())
              .addMethod(getListCustomReportFiltersMethod())
              .addMethod(getListSmsNumbersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
