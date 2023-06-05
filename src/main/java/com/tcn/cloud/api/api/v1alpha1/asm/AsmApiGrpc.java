package com.tcn.cloud.api.api.v1alpha1.asm;

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
    comments = "Source: api/v1alpha1/asm/service.proto")
public final class AsmApiGrpc {

  private AsmApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.asm.AsmApi";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getCreateSessionMethod = AsmApiGrpc.getCreateSessionMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getCreateSessionMethod = AsmApiGrpc.getCreateSessionMethod) == null) {
          AsmApiGrpc.getCreateSessionMethod = getCreateSessionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("CreateSession"))
                  .build();
          }
        }
     }
     return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq,
      com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatus",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq,
      com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> getGetStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq, com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> getGetStatusMethod;
    if ((getGetStatusMethod = AsmApiGrpc.getGetStatusMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getGetStatusMethod = AsmApiGrpc.getGetStatusMethod) == null) {
          AsmApiGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq, com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "GetStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("GetStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
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
    if ((getEndSessionMethod = AsmApiGrpc.getEndSessionMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getEndSessionMethod = AsmApiGrpc.getEndSessionMethod) == null) {
          AsmApiGrpc.getEndSessionMethod = getEndSessionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "EndSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("EndSession"))
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
    if ((getGetCurrentSessionMethod = AsmApiGrpc.getGetCurrentSessionMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getGetCurrentSessionMethod = AsmApiGrpc.getGetCurrentSessionMethod) == null) {
          AsmApiGrpc.getGetCurrentSessionMethod = getGetCurrentSessionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq, com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "GetCurrentSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("GetCurrentSession"))
                  .build();
          }
        }
     }
     return getGetCurrentSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> getSwitchSubsessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwitchSubsession",
      requestType = com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq,
      com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> getSwitchSubsessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq, com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> getSwitchSubsessionMethod;
    if ((getSwitchSubsessionMethod = AsmApiGrpc.getSwitchSubsessionMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getSwitchSubsessionMethod = AsmApiGrpc.getSwitchSubsessionMethod) == null) {
          AsmApiGrpc.getSwitchSubsessionMethod = getSwitchSubsessionMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq, com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "SwitchSubsession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("SwitchSubsession"))
                  .build();
          }
        }
     }
     return getSwitchSubsessionMethod;
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
    if ((getListConversationsMethod = AsmApiGrpc.getListConversationsMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getListConversationsMethod = AsmApiGrpc.getListConversationsMethod) == null) {
          AsmApiGrpc.getListConversationsMethod = getListConversationsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "ListConversations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("ListConversations"))
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
    if ((getAssignNewConversationMethod = AsmApiGrpc.getAssignNewConversationMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getAssignNewConversationMethod = AsmApiGrpc.getAssignNewConversationMethod) == null) {
          AsmApiGrpc.getAssignNewConversationMethod = getAssignNewConversationMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq, com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "AssignNewConversation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("AssignNewConversation"))
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
    if ((getListAgentsMethod = AsmApiGrpc.getListAgentsMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getListAgentsMethod = AsmApiGrpc.getListAgentsMethod) == null) {
          AsmApiGrpc.getListAgentsMethod = getListAgentsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq, com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("ListAgents"))
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
    if ((getSetConversationCollectedDataMethod = AsmApiGrpc.getSetConversationCollectedDataMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getSetConversationCollectedDataMethod = AsmApiGrpc.getSetConversationCollectedDataMethod) == null) {
          AsmApiGrpc.getSetConversationCollectedDataMethod = getSetConversationCollectedDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq, com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "SetConversationCollectedData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("SetConversationCollectedData"))
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
    if ((getGetQueuesDetailsMethod = AsmApiGrpc.getGetQueuesDetailsMethod) == null) {
      synchronized (AsmApiGrpc.class) {
        if ((getGetQueuesDetailsMethod = AsmApiGrpc.getGetQueuesDetailsMethod) == null) {
          AsmApiGrpc.getGetQueuesDetailsMethod = getGetQueuesDetailsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq, com.tcn.cloud.api.api.commons.GetQueuesDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.asm.AsmApi", "GetQueuesDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.GetQueuesDetailsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AsmApiMethodDescriptorSupplier("GetQueuesDetails"))
                  .build();
          }
        }
     }
     return getGetQueuesDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsmApiStub newStub(io.grpc.Channel channel) {
    return new AsmApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsmApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AsmApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsmApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AsmApiFutureStub(channel);
  }

  /**
   */
  public static abstract class AsmApiImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public void createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns an aggregate of the statuses of all channels
     * </pre>
     */
    public void getStatus(com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public void endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEndSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public void getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public void switchSubsession(com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSwitchSubsessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public void listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListConversationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public void assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignNewConversationMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public void setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetConversationCollectedDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public void getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueuesDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq,
                com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq,
                com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getEndSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq,
                com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>(
                  this, METHODID_END_SESSION)))
          .addMethod(
            getGetCurrentSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq,
                com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>(
                  this, METHODID_GET_CURRENT_SESSION)))
          .addMethod(
            getSwitchSubsessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq,
                com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes>(
                  this, METHODID_SWITCH_SUBSESSION)))
          .addMethod(
            getListConversationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq,
                com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes>(
                  this, METHODID_LIST_CONVERSATIONS)))
          .addMethod(
            getAssignNewConversationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq,
                com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes>(
                  this, METHODID_ASSIGN_NEW_CONVERSATION)))
          .addMethod(
            getListAgentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq,
                com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes>(
                  this, METHODID_LIST_AGENTS)))
          .addMethod(
            getSetConversationCollectedDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq,
                com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes>(
                  this, METHODID_SET_CONVERSATION_COLLECTED_DATA)))
          .addMethod(
            getGetQueuesDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq,
                com.tcn.cloud.api.api.commons.GetQueuesDetailsRes>(
                  this, METHODID_GET_QUEUES_DETAILS)))
          .build();
    }
  }

  /**
   */
  public static final class AsmApiStub extends io.grpc.stub.AbstractStub<AsmApiStub> {
    private AsmApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsmApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsmApiStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public void createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns an aggregate of the statuses of all channels
     * </pre>
     */
    public void getStatus(com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public void endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public void getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public void switchSubsession(com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSwitchSubsessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public void listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public void assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignNewConversationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public void setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetConversationCollectedDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public void getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueuesDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AsmApiBlockingStub extends io.grpc.stub.AbstractStub<AsmApiBlockingStub> {
    private AsmApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsmApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsmApiBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes createSession(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns an aggregate of the statuses of all channels
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes getStatus(com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes endSession(com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request) {
      return blockingUnaryCall(
          getChannel(), getEndSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession getCurrentSession(com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes switchSubsession(com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq request) {
      return blockingUnaryCall(
          getChannel(), getSwitchSubsessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes listConversations(com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request) {
      return blockingUnaryCall(
          getChannel(), getListConversationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes assignNewConversation(com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request) {
      return blockingUnaryCall(
          getChannel(), getAssignNewConversationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes listAgents(com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request) {
      return blockingUnaryCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes setConversationCollectedData(com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request) {
      return blockingUnaryCall(
          getChannel(), getSetConversationCollectedDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.GetQueuesDetailsRes getQueuesDetails(com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request) {
      return blockingUnaryCall(
          getChannel(), getGetQueuesDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AsmApiFutureStub extends io.grpc.stub.AbstractStub<AsmApiFutureStub> {
    private AsmApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AsmApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AsmApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes> createSession(
        com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns an aggregate of the statuses of all channels
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes> getStatus(
        com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes> endSession(
        com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession> getCurrentSession(
        com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes> switchSubsession(
        com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSwitchSubsessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the conversations for an assigned agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsRes> listConversations(
        com.tcn.cloud.api.api.v1alpha1.asm.ListConversationsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListConversationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign agent to matched conversation based on skills and channelTypes requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationRes> assignNewConversation(
        com.tcn.cloud.api.api.v1alpha1.asm.AssignNewConversationReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignNewConversationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all agents for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsRes> listAgents(
        com.tcn.cloud.api.api.v1alpha1.asm.ListAgentsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set collected data per conversation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataRes> setConversationCollectedData(
        com.tcn.cloud.api.api.v1alpha1.asm.SetConversationCollectedDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetConversationCollectedDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set queue details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.GetQueuesDetailsRes> getQueuesDetails(
        com.tcn.cloud.api.api.v1alpha1.asm.GetQueuesDetailsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueuesDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_GET_STATUS = 1;
  private static final int METHODID_END_SESSION = 2;
  private static final int METHODID_GET_CURRENT_SESSION = 3;
  private static final int METHODID_SWITCH_SUBSESSION = 4;
  private static final int METHODID_LIST_CONVERSATIONS = 5;
  private static final int METHODID_ASSIGN_NEW_CONVERSATION = 6;
  private static final int METHODID_LIST_AGENTS = 7;
  private static final int METHODID_SET_CONVERSATION_COLLECTED_DATA = 8;
  private static final int METHODID_GET_QUEUES_DETAILS = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsmApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AsmApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionRes>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((com.tcn.cloud.api.api.v1alpha1.asm.GetStatusReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.GetStatusRes>) responseObserver);
          break;
        case METHODID_END_SESSION:
          serviceImpl.endSession((com.tcn.cloud.api.api.v1alpha1.asm.EndSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.EndSessionRes>) responseObserver);
          break;
        case METHODID_GET_CURRENT_SESSION:
          serviceImpl.getCurrentSession((com.tcn.cloud.api.api.v1alpha1.asm.GetCurrentSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.AsmSession>) responseObserver);
          break;
        case METHODID_SWITCH_SUBSESSION:
          serviceImpl.switchSubsession((com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.asm.SwitchSubsessionRes>) responseObserver);
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

  private static abstract class AsmApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsmApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsmApi");
    }
  }

  private static final class AsmApiFileDescriptorSupplier
      extends AsmApiBaseDescriptorSupplier {
    AsmApiFileDescriptorSupplier() {}
  }

  private static final class AsmApiMethodDescriptorSupplier
      extends AsmApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AsmApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (AsmApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsmApiFileDescriptorSupplier())
              .addMethod(getCreateSessionMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getEndSessionMethod())
              .addMethod(getGetCurrentSessionMethod())
              .addMethod(getSwitchSubsessionMethod())
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
