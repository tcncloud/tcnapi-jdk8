package com.tcn.cloud.api.services.omnichannel.instant.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/omnichannel/instant/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InstantDataServiceGrpc {

  private InstantDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.omnichannel.instant.v1alpha1.InstantDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> getStreamAgentEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAgentEvents",
      requestType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest.class,
      responseType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> getStreamAgentEventsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> getStreamAgentEventsMethod;
    if ((getStreamAgentEventsMethod = InstantDataServiceGrpc.getStreamAgentEventsMethod) == null) {
      synchronized (InstantDataServiceGrpc.class) {
        if ((getStreamAgentEventsMethod = InstantDataServiceGrpc.getStreamAgentEventsMethod) == null) {
          InstantDataServiceGrpc.getStreamAgentEventsMethod = getStreamAgentEventsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAgentEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstantDataServiceMethodDescriptorSupplier("StreamAgentEvents"))
              .build();
        }
      }
    }
    return getStreamAgentEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> getStreamCallerEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamCallerEvents",
      requestType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest.class,
      responseType = com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest,
      com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> getStreamCallerEventsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> getStreamCallerEventsMethod;
    if ((getStreamCallerEventsMethod = InstantDataServiceGrpc.getStreamCallerEventsMethod) == null) {
      synchronized (InstantDataServiceGrpc.class) {
        if ((getStreamCallerEventsMethod = InstantDataServiceGrpc.getStreamCallerEventsMethod) == null) {
          InstantDataServiceGrpc.getStreamCallerEventsMethod = getStreamCallerEventsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest, com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamCallerEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InstantDataServiceMethodDescriptorSupplier("StreamCallerEvents"))
              .build();
        }
      }
    }
    return getStreamCallerEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstantDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceStub>() {
        @java.lang.Override
        public InstantDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstantDataServiceStub(channel, callOptions);
        }
      };
    return InstantDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstantDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceBlockingStub>() {
        @java.lang.Override
        public InstantDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstantDataServiceBlockingStub(channel, callOptions);
        }
      };
    return InstantDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstantDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InstantDataServiceFutureStub>() {
        @java.lang.Override
        public InstantDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InstantDataServiceFutureStub(channel, callOptions);
        }
      };
    return InstantDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void streamAgentEvents(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamAgentEventsMethod(), responseObserver);
    }

    /**
     */
    default void streamCallerEvents(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamCallerEventsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InstantDataService.
   */
  public static abstract class InstantDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InstantDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InstantDataService.
   */
  public static final class InstantDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InstantDataServiceStub> {
    private InstantDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstantDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstantDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamAgentEvents(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamAgentEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamCallerEvents(com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamCallerEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InstantDataService.
   */
  public static final class InstantDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InstantDataServiceBlockingStub> {
    private InstantDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstantDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstantDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse> streamAgentEvents(
        com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamAgentEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse> streamCallerEvents(
        com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamCallerEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InstantDataService.
   */
  public static final class InstantDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InstantDataServiceFutureStub> {
    private InstantDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstantDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InstantDataServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_AGENT_EVENTS = 0;
  private static final int METHODID_STREAM_CALLER_EVENTS = 1;

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
        case METHODID_STREAM_AGENT_EVENTS:
          serviceImpl.streamAgentEvents((com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse>) responseObserver);
          break;
        case METHODID_STREAM_CALLER_EVENTS:
          serviceImpl.streamCallerEvents((com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse>) responseObserver);
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
          getStreamAgentEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsRequest,
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamAgentEventsResponse>(
                service, METHODID_STREAM_AGENT_EVENTS)))
        .addMethod(
          getStreamCallerEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsRequest,
              com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.StreamCallerEventsResponse>(
                service, METHODID_STREAM_CALLER_EVENTS)))
        .build();
  }

  private static abstract class InstantDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstantDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.instant.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstantDataService");
    }
  }

  private static final class InstantDataServiceFileDescriptorSupplier
      extends InstantDataServiceBaseDescriptorSupplier {
    InstantDataServiceFileDescriptorSupplier() {}
  }

  private static final class InstantDataServiceMethodDescriptorSupplier
      extends InstantDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InstantDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InstantDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstantDataServiceFileDescriptorSupplier())
              .addMethod(getStreamAgentEventsMethod())
              .addMethod(getStreamCallerEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
