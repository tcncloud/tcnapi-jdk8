package com.tcn.cloud.api.api.v1alpha1.agentsmith;

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
 * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
 * to follow agents and/or create virtual agents.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/agentsmith/service.proto")
public final class AgentSmithGrpc {

  private AgentSmithGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.agentsmith.AgentSmith";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq,
      com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> getFollowAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FollowAgent",
      requestType = com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq,
      com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> getFollowAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq, com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> getFollowAgentMethod;
    if ((getFollowAgentMethod = AgentSmithGrpc.getFollowAgentMethod) == null) {
      synchronized (AgentSmithGrpc.class) {
        if ((getFollowAgentMethod = AgentSmithGrpc.getFollowAgentMethod) == null) {
          AgentSmithGrpc.getFollowAgentMethod = getFollowAgentMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq, com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.agentsmith.AgentSmith", "FollowAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes.getDefaultInstance()))
                  .setSchemaDescriptor(new AgentSmithMethodDescriptorSupplier("FollowAgent"))
                  .build();
          }
        }
     }
     return getFollowAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentSmithStub newStub(io.grpc.Channel channel) {
    return new AgentSmithStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentSmithBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AgentSmithBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentSmithFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AgentSmithFutureStub(channel);
  }

  /**
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static abstract class AgentSmithImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * FollowAgent method find an agent identified by user_id or asm_session_id and return a stream of events
     * associated with the current session of the user and long as the session lives regardless if the agent is
     * using the omni interface or neo interface.
     * When the agent is in a voice session one of the first messages received will be AgentVoiceStartEvent that
     * contains a sip dial url that can be used to connect to the agent's voice session.
     * </pre>
     */
    public void followAgent(com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFollowAgentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFollowAgentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq,
                com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes>(
                  this, METHODID_FOLLOW_AGENT)))
          .build();
    }
  }

  /**
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithStub extends io.grpc.stub.AbstractStub<AgentSmithStub> {
    private AgentSmithStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSmithStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSmithStub(channel, callOptions);
    }

    /**
     * <pre>
     * FollowAgent method find an agent identified by user_id or asm_session_id and return a stream of events
     * associated with the current session of the user and long as the session lives regardless if the agent is
     * using the omni interface or neo interface.
     * When the agent is in a voice session one of the first messages received will be AgentVoiceStartEvent that
     * contains a sip dial url that can be used to connect to the agent's voice session.
     * </pre>
     */
    public void followAgent(com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFollowAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithBlockingStub extends io.grpc.stub.AbstractStub<AgentSmithBlockingStub> {
    private AgentSmithBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSmithBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSmithBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * FollowAgent method find an agent identified by user_id or asm_session_id and return a stream of events
     * associated with the current session of the user and long as the session lives regardless if the agent is
     * using the omni interface or neo interface.
     * When the agent is in a voice session one of the first messages received will be AgentVoiceStartEvent that
     * contains a sip dial url that can be used to connect to the agent's voice session.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> followAgent(
        com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq request) {
      return blockingServerStreamingCall(
          getChannel(), getFollowAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithFutureStub extends io.grpc.stub.AbstractStub<AgentSmithFutureStub> {
    private AgentSmithFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AgentSmithFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AgentSmithFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FOLLOW_AGENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AgentSmithImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AgentSmithImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FOLLOW_AGENT:
          serviceImpl.followAgent((com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes>) responseObserver);
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

  private static abstract class AgentSmithBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentSmithBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.agentsmith.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentSmith");
    }
  }

  private static final class AgentSmithFileDescriptorSupplier
      extends AgentSmithBaseDescriptorSupplier {
    AgentSmithFileDescriptorSupplier() {}
  }

  private static final class AgentSmithMethodDescriptorSupplier
      extends AgentSmithBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AgentSmithMethodDescriptorSupplier(String methodName) {
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
      synchronized (AgentSmithGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentSmithFileDescriptorSupplier())
              .addMethod(getFollowAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
