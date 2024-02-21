package com.tcn.cloud.api.services.omnichannel.asm.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/omnichannel/asm/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AsmServiceGrpc {

  private AsmServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.omnichannel.asm.v1alpha1.AsmService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> getCreateSessionMethod;
    if ((getCreateSessionMethod = AsmServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getCreateSessionMethod = AsmServiceGrpc.getCreateSessionMethod) == null) {
          AsmServiceGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> getEndSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndSession",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> getEndSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> getEndSessionMethod;
    if ((getEndSessionMethod = AsmServiceGrpc.getEndSessionMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getEndSessionMethod = AsmServiceGrpc.getEndSessionMethod) == null) {
          AsmServiceGrpc.getEndSessionMethod = getEndSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("EndSession"))
              .build();
        }
      }
    }
    return getEndSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> getGetCurrentSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentSession",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> getGetCurrentSessionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> getGetCurrentSessionMethod;
    if ((getGetCurrentSessionMethod = AsmServiceGrpc.getGetCurrentSessionMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getGetCurrentSessionMethod = AsmServiceGrpc.getGetCurrentSessionMethod) == null) {
          AsmServiceGrpc.getGetCurrentSessionMethod = getGetCurrentSessionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("GetCurrentSession"))
              .build();
        }
      }
    }
    return getGetCurrentSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> getEnableVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableVoice",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> getEnableVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> getEnableVoiceMethod;
    if ((getEnableVoiceMethod = AsmServiceGrpc.getEnableVoiceMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getEnableVoiceMethod = AsmServiceGrpc.getEnableVoiceMethod) == null) {
          AsmServiceGrpc.getEnableVoiceMethod = getEnableVoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("EnableVoice"))
              .build();
        }
      }
    }
    return getEnableVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> getDisableVoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableVoice",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> getDisableVoiceMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> getDisableVoiceMethod;
    if ((getDisableVoiceMethod = AsmServiceGrpc.getDisableVoiceMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getDisableVoiceMethod = AsmServiceGrpc.getDisableVoiceMethod) == null) {
          AsmServiceGrpc.getDisableVoiceMethod = getDisableVoiceMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableVoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("DisableVoice"))
              .build();
        }
      }
    }
    return getDisableVoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> getListAsmUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAsmUserDetails",
      requestType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq.class,
      responseType = com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq,
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> getListAsmUserDetailsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> getListAsmUserDetailsMethod;
    if ((getListAsmUserDetailsMethod = AsmServiceGrpc.getListAsmUserDetailsMethod) == null) {
      synchronized (AsmServiceGrpc.class) {
        if ((getListAsmUserDetailsMethod = AsmServiceGrpc.getListAsmUserDetailsMethod) == null) {
          AsmServiceGrpc.getListAsmUserDetailsMethod = getListAsmUserDetailsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAsmUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes.getDefaultInstance()))
              .setSchemaDescriptor(new AsmServiceMethodDescriptorSupplier("ListAsmUserDetails"))
              .build();
        }
      }
    }
    return getListAsmUserDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AsmServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmServiceStub>() {
        @java.lang.Override
        public AsmServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmServiceStub(channel, callOptions);
        }
      };
    return AsmServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AsmServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmServiceBlockingStub>() {
        @java.lang.Override
        public AsmServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmServiceBlockingStub(channel, callOptions);
        }
      };
    return AsmServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AsmServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AsmServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AsmServiceFutureStub>() {
        @java.lang.Override
        public AsmServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AsmServiceFutureStub(channel, callOptions);
        }
      };
    return AsmServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    default void createSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    default void endSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    default void getCurrentSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    default void enableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableVoiceMethod(), responseObserver);
    }

    /**
     */
    default void disableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableVoiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all Sessions for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    default void listAsmUserDetails(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAsmUserDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AsmService.
   */
  public static abstract class AsmServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AsmServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AsmService.
   */
  public static final class AsmServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AsmServiceStub> {
    private AsmServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public void createSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public void endSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public void getCurrentSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public void enableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableVoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all Sessions for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public void listAsmUserDetails(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAsmUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AsmService.
   */
  public static final class AsmServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AsmServiceBlockingStub> {
    private AsmServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes createSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes endSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes getCurrentSession(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes enableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableVoiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes disableVoice(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableVoiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all Sessions for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes listAsmUserDetails(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAsmUserDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AsmService.
   */
  public static final class AsmServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AsmServiceFutureStub> {
    private AsmServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AsmServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AsmServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates an agent session and enables the voice channel
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes> createSession(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes an asm session and all sub sessions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes> endSession(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets an agent's current asm session
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes> getCurrentSession(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the currently active subsession
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes> enableVoice(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableVoiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes> disableVoice(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableVoiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all Sessions for the given user. Contains statistical enrichments for each agent and their conversations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes> listAsmUserDetails(
        com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAsmUserDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION = 0;
  private static final int METHODID_END_SESSION = 1;
  private static final int METHODID_GET_CURRENT_SESSION = 2;
  private static final int METHODID_ENABLE_VOICE = 3;
  private static final int METHODID_DISABLE_VOICE = 4;
  private static final int METHODID_LIST_ASM_USER_DETAILS = 5;

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
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes>) responseObserver);
          break;
        case METHODID_END_SESSION:
          serviceImpl.endSession((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes>) responseObserver);
          break;
        case METHODID_GET_CURRENT_SESSION:
          serviceImpl.getCurrentSession((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes>) responseObserver);
          break;
        case METHODID_ENABLE_VOICE:
          serviceImpl.enableVoice((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes>) responseObserver);
          break;
        case METHODID_DISABLE_VOICE:
          serviceImpl.disableVoice((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes>) responseObserver);
          break;
        case METHODID_LIST_ASM_USER_DETAILS:
          serviceImpl.listAsmUserDetails((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes>) responseObserver);
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
          getCreateSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.CreateSessionRes>(
                service, METHODID_CREATE_SESSION)))
        .addMethod(
          getEndSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EndSessionRes>(
                service, METHODID_END_SESSION)))
        .addMethod(
          getGetCurrentSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes>(
                service, METHODID_GET_CURRENT_SESSION)))
        .addMethod(
          getEnableVoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EnableVoiceRes>(
                service, METHODID_ENABLE_VOICE)))
        .addMethod(
          getDisableVoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.DisableVoiceRes>(
                service, METHODID_DISABLE_VOICE)))
        .addMethod(
          getListAsmUserDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsReq,
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ListAsmUserDetailsRes>(
                service, METHODID_LIST_ASM_USER_DETAILS)))
        .build();
  }

  private static abstract class AsmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AsmServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AsmService");
    }
  }

  private static final class AsmServiceFileDescriptorSupplier
      extends AsmServiceBaseDescriptorSupplier {
    AsmServiceFileDescriptorSupplier() {}
  }

  private static final class AsmServiceMethodDescriptorSupplier
      extends AsmServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AsmServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AsmServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AsmServiceFileDescriptorSupplier())
              .addMethod(getCreateSessionMethod())
              .addMethod(getEndSessionMethod())
              .addMethod(getGetCurrentSessionMethod())
              .addMethod(getEnableVoiceMethod())
              .addMethod(getDisableVoiceMethod())
              .addMethod(getListAsmUserDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
