package com.tcn.cloud.api.api.v1alpha1.agentsmith;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
 * to follow agents and/or create virtual agents.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: api/v1alpha1/agentsmith/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
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
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FollowAgent"))
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
    io.grpc.stub.AbstractStub.StubFactory<AgentSmithStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentSmithStub>() {
        @java.lang.Override
        public AgentSmithStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentSmithStub(channel, callOptions);
        }
      };
    return AgentSmithStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentSmithBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentSmithBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentSmithBlockingStub>() {
        @java.lang.Override
        public AgentSmithBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentSmithBlockingStub(channel, callOptions);
        }
      };
    return AgentSmithBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentSmithFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentSmithFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentSmithFutureStub>() {
        @java.lang.Override
        public AgentSmithFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentSmithFutureStub(channel, callOptions);
        }
      };
    return AgentSmithFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * FollowAgent method find an agent identified by user_id or asm_session_id and return a stream of events
     * associated with the current session of the user and long as the session lives regardless if the agent is
     * using the omni interface or neo interface.
     * When the agent is in a voice session one of the first messages received will be AgentVoiceStartEvent that
     * contains a sip dial url that can be used to connect to the agent's voice session.
     * </pre>
     */
    default void followAgent(com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFollowAgentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentSmith.
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static abstract class AgentSmithImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentSmithGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentSmith.
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithStub
      extends io.grpc.stub.AbstractAsyncStub<AgentSmithStub> {
    private AgentSmithStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFollowAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentSmith.
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentSmithBlockingStub> {
    private AgentSmithBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
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
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFollowAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentSmith.
   * <pre>
   * AgentSmith is the Public API for the AgentSmith service. This service provides the methods for public integrations
   * to follow agents and/or create virtual agents.
   * </pre>
   */
  public static final class AgentSmithFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentSmithFutureStub> {
    private AgentSmithFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentSmithFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentSmithFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FOLLOW_AGENT = 0;

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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFollowAgentMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentReq,
              com.tcn.cloud.api.api.v1alpha1.agentsmith.FollowAgentRes>(
                service, METHODID_FOLLOW_AGENT)))
        .build();
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
