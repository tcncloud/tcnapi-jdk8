package com.tcn.cloud.api.api.v1alpha1.asm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: api/v1alpha1/asm/public_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsmGrpc {

  private AsmGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.asm.Asm";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq,
      com.tcn.cloud.api.api.commons.StreamAgentStateRes> getStreamAgentStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAgentState",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.class,
      responseType = com.tcn.cloud.api.api.commons.StreamAgentStateRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq,
      com.tcn.cloud.api.api.commons.StreamAgentStateRes> getStreamAgentStateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq, com.tcn.cloud.api.api.commons.StreamAgentStateRes> getStreamAgentStateMethod;
    if ((getStreamAgentStateMethod = AsmGrpc.getStreamAgentStateMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getStreamAgentStateMethod = AsmGrpc.getStreamAgentStateMethod) == null) {
          AsmGrpc.getStreamAgentStateMethod = getStreamAgentStateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq, com.tcn.cloud.api.api.commons.StreamAgentStateRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAgentState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.StreamAgentStateRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("StreamAgentState"))
              .build();
        }
      }
    }
    return getStreamAgentStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq,
      com.tcn.cloud.api.api.commons.AgentState> getManagerStreamAgentStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ManagerStreamAgentState",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq.class,
      responseType = com.tcn.cloud.api.api.commons.AgentState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq,
      com.tcn.cloud.api.api.commons.AgentState> getManagerStreamAgentStateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq, com.tcn.cloud.api.api.commons.AgentState> getManagerStreamAgentStateMethod;
    if ((getManagerStreamAgentStateMethod = AsmGrpc.getManagerStreamAgentStateMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getManagerStreamAgentStateMethod = AsmGrpc.getManagerStreamAgentStateMethod) == null) {
          AsmGrpc.getManagerStreamAgentStateMethod = getManagerStreamAgentStateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq, com.tcn.cloud.api.api.commons.AgentState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManagerStreamAgentState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.AgentState.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("ManagerStreamAgentState"))
              .build();
        }
      }
    }
    return getManagerStreamAgentStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> getPushEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushEvents",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> getPushEventsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq, com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> getPushEventsMethod;
    if ((getPushEventsMethod = AsmGrpc.getPushEventsMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getPushEventsMethod = AsmGrpc.getPushEventsMethod) == null) {
          AsmGrpc.getPushEventsMethod = getPushEventsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq, com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("PushEvents"))
              .build();
        }
      }
    }
    return getPushEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> getCreateSessionMethod;
    if ((getCreateSessionMethod = AsmGrpc.getCreateSessionMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getCreateSessionMethod = AsmGrpc.getCreateSessionMethod) == null) {
          AsmGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> getEndSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndSession",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> getEndSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> getEndSessionMethod;
    if ((getEndSessionMethod = AsmGrpc.getEndSessionMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getEndSessionMethod = AsmGrpc.getEndSessionMethod) == null) {
          AsmGrpc.getEndSessionMethod = getEndSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("EndSession"))
              .build();
        }
      }
    }
    return getEndSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> getGetCurrentSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentSession",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> getGetCurrentSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> getGetCurrentSessionMethod;
    if ((getGetCurrentSessionMethod = AsmGrpc.getGetCurrentSessionMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getGetCurrentSessionMethod = AsmGrpc.getGetCurrentSessionMethod) == null) {
          AsmGrpc.getGetCurrentSessionMethod = getGetCurrentSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("GetCurrentSession"))
              .build();
        }
      }
    }
    return getGetCurrentSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq,
      com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> getEnableVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableVoice",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq,
      com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> getEnableVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq, com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> getEnableVoiceMethod;
    if ((getEnableVoiceMethod = AsmGrpc.getEnableVoiceMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getEnableVoiceMethod = AsmGrpc.getEnableVoiceMethod) == null) {
          AsmGrpc.getEnableVoiceMethod = getEnableVoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq, com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("EnableVoice"))
              .build();
        }
      }
    }
    return getEnableVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq,
      com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> getDisableVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableVoice",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq,
      com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> getDisableVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq, com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> getDisableVoiceMethod;
    if ((getDisableVoiceMethod = AsmGrpc.getDisableVoiceMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getDisableVoiceMethod = AsmGrpc.getDisableVoiceMethod) == null) {
          AsmGrpc.getDisableVoiceMethod = getDisableVoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq, com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("DisableVoice"))
              .build();
        }
      }
    }
    return getDisableVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> getListConversationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListConversations",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> getListConversationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> getListConversationsMethod;
    if ((getListConversationsMethod = AsmGrpc.getListConversationsMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getListConversationsMethod = AsmGrpc.getListConversationsMethod) == null) {
          AsmGrpc.getListConversationsMethod = getListConversationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("ListConversations"))
              .build();
        }
      }
    }
    return getListConversationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq,
      com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> getAssignNewConversationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignNewConversation",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq,
      com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> getAssignNewConversationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq, com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> getAssignNewConversationMethod;
    if ((getAssignNewConversationMethod = AsmGrpc.getAssignNewConversationMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getAssignNewConversationMethod = AsmGrpc.getAssignNewConversationMethod) == null) {
          AsmGrpc.getAssignNewConversationMethod = getAssignNewConversationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq, com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignNewConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("AssignNewConversation"))
              .build();
        }
      }
    }
    return getAssignNewConversationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> getListAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq,
      com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> getListAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> getListAgentsMethod;
    if ((getListAgentsMethod = AsmGrpc.getListAgentsMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getListAgentsMethod = AsmGrpc.getListAgentsMethod) == null) {
          AsmGrpc.getListAgentsMethod = getListAgentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("ListAgents"))
              .build();
        }
      }
    }
    return getListAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq,
      com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> getSetConversationCollectedDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetConversationCollectedData",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq,
      com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> getSetConversationCollectedDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq, com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> getSetConversationCollectedDataMethod;
    if ((getSetConversationCollectedDataMethod = AsmGrpc.getSetConversationCollectedDataMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getSetConversationCollectedDataMethod = AsmGrpc.getSetConversationCollectedDataMethod) == null) {
          AsmGrpc.getSetConversationCollectedDataMethod = getSetConversationCollectedDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq, com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetConversationCollectedData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("SetConversationCollectedData"))
              .build();
        }
      }
    }
    return getSetConversationCollectedDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq,
      com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> getGetQueuesDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueuesDetails",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq.class,
      responseType = com.tcn.cloud.api.api.commons.GetQueuesDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq,
      com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> getGetQueuesDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq, com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> getGetQueuesDetailsMethod;
    if ((getGetQueuesDetailsMethod = AsmGrpc.getGetQueuesDetailsMethod) == null) {
      synchronized (AsmGrpc.class) {
        if ((getGetQueuesDetailsMethod = AsmGrpc.getGetQueuesDetailsMethod) == null) {
          AsmGrpc.getGetQueuesDetailsMethod = getGetQueuesDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq, com.tcn.cloud.api.api.commons.GetQueuesDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueuesDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.GetQueuesDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmMethodDescriptorSupplier("GetQueuesDetails"))
              .build();
        }
      }
    }
    return getGetQueuesDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsmStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmStub>() {
        @java.lang.Override
        public AsmStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmStub(channel, callOptions);
        }
      };
    return AsmStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsmBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmBlockingStub>() {
        @java.lang.Override
        public AsmBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmBlockingStub(channel, callOptions);
        }
      };
    return AsmBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsmFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmFutureStub>() {
        @java.lang.Override
        public AsmFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmFutureStub(channel, callOptions);
        }
      };
    return AsmFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Streams back status updates for the given asm session
     * only the asm session sid filter is allowed
     * </pre>
     */
    default void streamAgentState(com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.StreamAgentStateRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamAgentStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streams back statuses for the desired filter
     * </pre>
     */
    default void managerStreamAgentState(com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.AgentState> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManagerStreamAgentStateMethod(), responseObserver);
    }

    /**
     */
    default void pushEvents(com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPushEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    default void createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    default void endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    default void getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    default void enableVoice(com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableVoiceMethod(), responseObserver);
    }

    /**
     */
    default void disableVoice(com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableVoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    default void listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    default void assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignNewConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    default void listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    default void setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetConversationCollectedDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    default void getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueuesDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Asm.
   */
  public static abstract class AsmImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AsmGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Asm.
   */
  public static final class AsmStub
      extends io.grpc.stub.AbstractAsyncStub<AsmStub> {
    private AsmStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmStub(channel, callOptions);
    }

    /**
     * <pre>
     * Streams back status updates for the given asm session
     * only the asm session sid filter is allowed
     * </pre>
     */
    public void streamAgentState(com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.StreamAgentStateRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamAgentStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streams back statuses for the desired filter
     * </pre>
     */
    public void managerStreamAgentState(com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.AgentState> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getManagerStreamAgentStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushEvents(com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public void createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public void endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public void getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public void enableVoice(com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableVoice(com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public void listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public void assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignNewConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public void setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetConversationCollectedDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public void getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueuesDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Asm.
   */
  public static final class AsmBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AsmBlockingStub> {
    private AsmBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Streams back status updates for the given asm session
     * only the asm session sid filter is allowed
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.StreamAgentStateRes> streamAgentState(
        com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamAgentStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streams back statuses for the desired filter
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.commons.AgentState> managerStreamAgentState(
        com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getManagerStreamAgentStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes pushEvents(com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes enableVoice(com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableVoiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes disableVoice(com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableVoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignNewConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetConversationCollectedDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.GetQueuesDetailsRes getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueuesDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Asm.
   */
  public static final class AsmFutureStub
      extends io.grpc.stub.AbstractFutureStub<AsmFutureStub> {
    private AsmFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes> pushEvents(
        com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> createSession(
        com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> endSession(
        com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> getCurrentSession(
        com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes> enableVoice(
        com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableVoiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes> disableVoice(
        com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableVoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> listConversations(
        com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> assignNewConversation(
        com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignNewConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> listAgents(
        com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> setConversationCollectedData(
        com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetConversationCollectedDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> getQueuesDetails(
        com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueuesDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STREAM_AGENT_STATE = 0;
  private static final int METHODID_MANAGER_STREAM_AGENT_STATE = 1;
  private static final int METHODID_PUSH_EVENTS = 2;
  private static final int METHODID_CREATE_SESSION = 3;
  private static final int METHODID_END_SESSION = 4;
  private static final int METHODID_GET_CURRENT_SESSION = 5;
  private static final int METHODID_ENABLE_VOICE = 6;
  private static final int METHODID_DISABLE_VOICE = 7;
  private static final int METHODID_LIST_CONVERSATIONS = 8;
  private static final int METHODID_ASSIGN_NEW_CONVERSATION = 9;
  private static final int METHODID_LIST_AGENTS = 10;
  private static final int METHODID_SET_CONVERSATION_COLLECTED_DATA = 11;
  private static final int METHODID_GET_QUEUES_DETAILS = 12;

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
        case METHODID_STREAM_AGENT_STATE:
          serviceImpl.streamAgentState((com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.StreamAgentStateRes>) responseObserver);
          break;
        case METHODID_MANAGER_STREAM_AGENT_STATE:
          serviceImpl.managerStreamAgentState((com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.AgentState>) responseObserver);
          break;
        case METHODID_PUSH_EVENTS:
          serviceImpl.pushEvents((com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>) responseObserver);
          break;
        case METHODID_END_SESSION:
          serviceImpl.endSession((com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>) responseObserver);
          break;
        case METHODID_GET_CURRENT_SESSION:
          serviceImpl.getCurrentSession((com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>) responseObserver);
          break;
        case METHODID_ENABLE_VOICE:
          serviceImpl.enableVoice((com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes>) responseObserver);
          break;
        case METHODID_DISABLE_VOICE:
          serviceImpl.disableVoice((com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes>) responseObserver);
          break;
        case METHODID_LIST_CONVERSATIONS:
          serviceImpl.listConversations((com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes>) responseObserver);
          break;
        case METHODID_ASSIGN_NEW_CONVERSATION:
          serviceImpl.assignNewConversation((com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes>) responseObserver);
          break;
        case METHODID_LIST_AGENTS:
          serviceImpl.listAgents((com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes>) responseObserver);
          break;
        case METHODID_SET_CONVERSATION_COLLECTED_DATA:
          serviceImpl.setConversationCollectedData((com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes>) responseObserver);
          break;
        case METHODID_GET_QUEUES_DETAILS:
          serviceImpl.getQueuesDetails((com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes>) responseObserver);
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
          getStreamAgentStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq,
              com.tcn.cloud.api.api.commons.StreamAgentStateRes>(
                service, METHODID_STREAM_AGENT_STATE)))
        .addMethod(
          getManagerStreamAgentStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.ManagerStreamAgentStateReq,
              com.tcn.cloud.api.api.commons.AgentState>(
                service, METHODID_MANAGER_STREAM_AGENT_STATE)))
        .addMethod(
          getPushEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.PushEventsReq,
              com.tcn.cloud.api.api.v1alpha1.asm.PushEventsRes>(
                service, METHODID_PUSH_EVENTS)))
        .addMethod(
          getCreateSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq,
              com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>(
                service, METHODID_CREATE_SESSION)))
        .addMethod(
          getEndSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq,
              com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>(
                service, METHODID_END_SESSION)))
        .addMethod(
          getGetCurrentSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq,
              com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>(
                service, METHODID_GET_CURRENT_SESSION)))
        .addMethod(
          getEnableVoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceReq,
              com.tcn.cloud.api.api.v1alpha1.asm.EnableVoiceRes>(
                service, METHODID_ENABLE_VOICE)))
        .addMethod(
          getDisableVoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceReq,
              com.tcn.cloud.api.api.v1alpha1.asm.DisableVoiceRes>(
                service, METHODID_DISABLE_VOICE)))
        .addMethod(
          getListConversationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq,
              com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes>(
                service, METHODID_LIST_CONVERSATIONS)))
        .addMethod(
          getAssignNewConversationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq,
              com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes>(
                service, METHODID_ASSIGN_NEW_CONVERSATION)))
        .addMethod(
          getListAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq,
              com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes>(
                service, METHODID_LIST_AGENTS)))
        .addMethod(
          getSetConversationCollectedDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq,
              com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes>(
                service, METHODID_SET_CONVERSATION_COLLECTED_DATA)))
        .addMethod(
          getGetQueuesDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq,
              com.tcn.cloud.api.api.commons.GetQueuesDetailsRes>(
                service, METHODID_GET_QUEUES_DETAILS)))
        .build();
  }

  private static abstract class AsmBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsmBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.PublicServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Asm");
    }
  }

  private static final class AsmFileDescriptorSupplier
      extends AsmBaseDescriptorSupplier {
    AsmFileDescriptorSupplier() {}
  }

  private static final class AsmMethodDescriptorSupplier
      extends AsmBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsmMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsmGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsmFileDescriptorSupplier())
              .addMethod(getStreamAgentStateMethod())
              .addMethod(getManagerStreamAgentStateMethod())
              .addMethod(getPushEventsMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getEndSessionMethod())
              .addMethod(getGetCurrentSessionMethod())
              .addMethod(getEnableVoiceMethod())
              .addMethod(getDisableVoiceMethod())
              .addMethod(getListConversationsMethod())
              .addMethod(getAssignNewConversationMethod())
              .addMethod(getListAgentsMethod())
              .addMethod(getSetConversationCollectedDataMethod())
              .addMethod(getGetQueuesDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
