package com.tcn.cloud.api.services.callmonitor.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/callmonitor/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CallMonitorServiceGrpc {

  private CallMonitorServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.callmonitor.v1alpha1.CallMonitorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest,
      com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> getGetStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStats",
      requestType = com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest.class,
      responseType = com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest,
      com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> getGetStatsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest, com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> getGetStatsMethod;
    if ((getGetStatsMethod = CallMonitorServiceGrpc.getGetStatsMethod) == null) {
      synchronized (CallMonitorServiceGrpc.class) {
        if ((getGetStatsMethod = CallMonitorServiceGrpc.getGetStatsMethod) == null) {
          CallMonitorServiceGrpc.getGetStatsMethod = getGetStatsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest, com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CallMonitorServiceMethodDescriptorSupplier("GetStats"))
              .build();
        }
      }
    }
    return getGetStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CallMonitorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceStub>() {
        @java.lang.Override
        public CallMonitorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallMonitorServiceStub(channel, callOptions);
        }
      };
    return CallMonitorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CallMonitorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceBlockingStub>() {
        @java.lang.Override
        public CallMonitorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallMonitorServiceBlockingStub(channel, callOptions);
        }
      };
    return CallMonitorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CallMonitorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CallMonitorServiceFutureStub>() {
        @java.lang.Override
        public CallMonitorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CallMonitorServiceFutureStub(channel, callOptions);
        }
      };
    return CallMonitorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStats(com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CallMonitorService.
   */
  public static abstract class CallMonitorServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CallMonitorServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CallMonitorService.
   */
  public static final class CallMonitorServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CallMonitorServiceStub> {
    private CallMonitorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallMonitorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallMonitorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStats(com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CallMonitorService.
   */
  public static final class CallMonitorServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CallMonitorServiceBlockingStub> {
    private CallMonitorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallMonitorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallMonitorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse getStats(com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CallMonitorService.
   */
  public static final class CallMonitorServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CallMonitorServiceFutureStub> {
    private CallMonitorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CallMonitorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CallMonitorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse> getStats(
        com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATS = 0;

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
        case METHODID_GET_STATS:
          serviceImpl.getStats((com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse>) responseObserver);
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
          getGetStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsRequest,
              com.tcn.cloud.api.services.callmonitor.v1alpha1.GetStatsResponse>(
                service, METHODID_GET_STATS)))
        .build();
  }

  private static abstract class CallMonitorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CallMonitorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.callmonitor.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CallMonitorService");
    }
  }

  private static final class CallMonitorServiceFileDescriptorSupplier
      extends CallMonitorServiceBaseDescriptorSupplier {
    CallMonitorServiceFileDescriptorSupplier() {}
  }

  private static final class CallMonitorServiceMethodDescriptorSupplier
      extends CallMonitorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CallMonitorServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CallMonitorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CallMonitorServiceFileDescriptorSupplier())
              .addMethod(getGetStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
