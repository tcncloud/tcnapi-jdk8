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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/sds.proto")
public final class SdsGrpc {

  private SdsGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Sds";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> getGetAgentResponseDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentResponseData",
      requestType = com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq,
      com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> getGetAgentResponseDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq, com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> getGetAgentResponseDataMethod;
    if ((getGetAgentResponseDataMethod = SdsGrpc.getGetAgentResponseDataMethod) == null) {
      synchronized (SdsGrpc.class) {
        if ((getGetAgentResponseDataMethod = SdsGrpc.getGetAgentResponseDataMethod) == null) {
          SdsGrpc.getGetAgentResponseDataMethod = getGetAgentResponseDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq, com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Sds", "GetAgentResponseData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SdsMethodDescriptorSupplier("GetAgentResponseData"))
                  .build();
          }
        }
     }
     return getGetAgentResponseDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallReq,
      com.tcn.cloud.api.api.v0alpha.CallObject> getGetCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCall",
      requestType = com.tcn.cloud.api.api.v0alpha.GetCallReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.CallObject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallReq,
      com.tcn.cloud.api.api.v0alpha.CallObject> getGetCallMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetCallReq, com.tcn.cloud.api.api.v0alpha.CallObject> getGetCallMethod;
    if ((getGetCallMethod = SdsGrpc.getGetCallMethod) == null) {
      synchronized (SdsGrpc.class) {
        if ((getGetCallMethod = SdsGrpc.getGetCallMethod) == null) {
          SdsGrpc.getGetCallMethod = getGetCallMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetCallReq, com.tcn.cloud.api.api.v0alpha.CallObject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Sds", "GetCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetCallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.CallObject.getDefaultInstance()))
                  .setSchemaDescriptor(new SdsMethodDescriptorSupplier("GetCall"))
                  .build();
          }
        }
     }
     return getGetCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> getUpdateAgentResponseDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentResponseData",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq,
      com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> getUpdateAgentResponseDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> getUpdateAgentResponseDataMethod;
    if ((getUpdateAgentResponseDataMethod = SdsGrpc.getUpdateAgentResponseDataMethod) == null) {
      synchronized (SdsGrpc.class) {
        if ((getUpdateAgentResponseDataMethod = SdsGrpc.getUpdateAgentResponseDataMethod) == null) {
          SdsGrpc.getUpdateAgentResponseDataMethod = getUpdateAgentResponseDataMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq, com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Sds", "UpdateAgentResponseData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SdsMethodDescriptorSupplier("UpdateAgentResponseData"))
                  .build();
          }
        }
     }
     return getUpdateAgentResponseDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq,
      com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> getUpdateVoicemailBoxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVoicemailBox",
      requestType = com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq,
      com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> getUpdateVoicemailBoxMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq, com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> getUpdateVoicemailBoxMethod;
    if ((getUpdateVoicemailBoxMethod = SdsGrpc.getUpdateVoicemailBoxMethod) == null) {
      synchronized (SdsGrpc.class) {
        if ((getUpdateVoicemailBoxMethod = SdsGrpc.getUpdateVoicemailBoxMethod) == null) {
          SdsGrpc.getUpdateVoicemailBoxMethod = getUpdateVoicemailBoxMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq, com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Sds", "UpdateVoicemailBox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SdsMethodDescriptorSupplier("UpdateVoicemailBox"))
                  .build();
          }
        }
     }
     return getUpdateVoicemailBoxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SdsStub newStub(io.grpc.Channel channel) {
    return new SdsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SdsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SdsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SdsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SdsFutureStub(channel);
  }

  /**
   */
  public static abstract class SdsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Gets the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public void getAgentResponseData(com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgentResponseDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a document from the mongodb calls collection.
     * </pre>
     */
    public void getCall(com.tcn.cloud.api.api.v0alpha.GetCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallObject> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCallMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public void updateAgentResponseData(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAgentResponseDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the voicemail_box field for a document in the mongodb calls collection.
     * </pre>
     */
    public void updateVoicemailBox(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVoicemailBoxMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAgentResponseDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq,
                com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes>(
                  this, METHODID_GET_AGENT_RESPONSE_DATA)))
          .addMethod(
            getGetCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.GetCallReq,
                com.tcn.cloud.api.api.v0alpha.CallObject>(
                  this, METHODID_GET_CALL)))
          .addMethod(
            getUpdateAgentResponseDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq,
                com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes>(
                  this, METHODID_UPDATE_AGENT_RESPONSE_DATA)))
          .addMethod(
            getUpdateVoicemailBoxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq,
                com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes>(
                  this, METHODID_UPDATE_VOICEMAIL_BOX)))
          .build();
    }
  }

  /**
   */
  public static final class SdsStub extends io.grpc.stub.AbstractStub<SdsStub> {
    private SdsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SdsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SdsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SdsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public void getAgentResponseData(com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAgentResponseDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a document from the mongodb calls collection.
     * </pre>
     */
    public void getCall(com.tcn.cloud.api.api.v0alpha.GetCallReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallObject> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public void updateAgentResponseData(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAgentResponseDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the voicemail_box field for a document in the mongodb calls collection.
     * </pre>
     */
    public void updateVoicemailBox(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVoicemailBoxMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SdsBlockingStub extends io.grpc.stub.AbstractStub<SdsBlockingStub> {
    private SdsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SdsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SdsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SdsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes getAgentResponseData(com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAgentResponseDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a document from the mongodb calls collection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.CallObject getCall(com.tcn.cloud.api.api.v0alpha.GetCallReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes updateAgentResponseData(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAgentResponseDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the voicemail_box field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes updateVoicemailBox(com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVoicemailBoxMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SdsFutureStub extends io.grpc.stub.AbstractStub<SdsFutureStub> {
    private SdsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SdsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SdsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SdsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes> getAgentResponseData(
        com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAgentResponseDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a document from the mongodb calls collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.CallObject> getCall(
        com.tcn.cloud.api.api.v0alpha.GetCallReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the agent_response_data field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes> updateAgentResponseData(
        com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAgentResponseDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the voicemail_box field for a document in the mongodb calls collection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes> updateVoicemailBox(
        com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVoicemailBoxMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AGENT_RESPONSE_DATA = 0;
  private static final int METHODID_GET_CALL = 1;
  private static final int METHODID_UPDATE_AGENT_RESPONSE_DATA = 2;
  private static final int METHODID_UPDATE_VOICEMAIL_BOX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SdsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SdsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AGENT_RESPONSE_DATA:
          serviceImpl.getAgentResponseData((com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.GetAgentResponseDataRes>) responseObserver);
          break;
        case METHODID_GET_CALL:
          serviceImpl.getCall((com.tcn.cloud.api.api.v0alpha.GetCallReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.CallObject>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_RESPONSE_DATA:
          serviceImpl.updateAgentResponseData((com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataRes>) responseObserver);
          break;
        case METHODID_UPDATE_VOICEMAIL_BOX:
          serviceImpl.updateVoicemailBox((com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.UpdateVoicemailBoxRes>) responseObserver);
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

  private static abstract class SdsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SdsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SdsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sds");
    }
  }

  private static final class SdsFileDescriptorSupplier
      extends SdsBaseDescriptorSupplier {
    SdsFileDescriptorSupplier() {}
  }

  private static final class SdsMethodDescriptorSupplier
      extends SdsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SdsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SdsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SdsFileDescriptorSupplier())
              .addMethod(getGetAgentResponseDataMethod())
              .addMethod(getGetCallMethod())
              .addMethod(getUpdateAgentResponseDataMethod())
              .addMethod(getUpdateVoicemailBoxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
