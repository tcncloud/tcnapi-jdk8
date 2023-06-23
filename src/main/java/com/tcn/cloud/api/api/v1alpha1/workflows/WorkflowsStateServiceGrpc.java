package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowsStateServiceGrpc {

  private WorkflowsStateServiceGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.workflows.WorkflowsStateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> getGetFlowStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlowState",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> getGetFlowStateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> getGetFlowStateMethod;
    if ((getGetFlowStateMethod = WorkflowsStateServiceGrpc.getGetFlowStateMethod) == null) {
      synchronized (WorkflowsStateServiceGrpc.class) {
        if ((getGetFlowStateMethod = WorkflowsStateServiceGrpc.getGetFlowStateMethod) == null) {
          WorkflowsStateServiceGrpc.getGetFlowStateMethod = getGetFlowStateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlowState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsStateServiceMethodDescriptorSupplier("GetFlowState"))
              .build();
        }
      }
    }
    return getGetFlowStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> getSaveFlowStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveFlowState",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> getSaveFlowStateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> getSaveFlowStateMethod;
    if ((getSaveFlowStateMethod = WorkflowsStateServiceGrpc.getSaveFlowStateMethod) == null) {
      synchronized (WorkflowsStateServiceGrpc.class) {
        if ((getSaveFlowStateMethod = WorkflowsStateServiceGrpc.getSaveFlowStateMethod) == null) {
          WorkflowsStateServiceGrpc.getSaveFlowStateMethod = getSaveFlowStateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveFlowState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsStateServiceMethodDescriptorSupplier("SaveFlowState"))
              .build();
        }
      }
    }
    return getSaveFlowStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsStateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceStub>() {
        @java.lang.Override
        public WorkflowsStateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsStateServiceStub(channel, callOptions);
        }
      };
    return WorkflowsStateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsStateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowsStateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsStateServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsStateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsStateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsStateServiceFutureStub>() {
        @java.lang.Override
        public WorkflowsStateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsStateServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowsStateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetFlowState lists flow state
     * </pre>
     */
    default void getFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlowStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SaveFlowState saves flow state
     * </pre>
     */
    default void saveFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFlowStateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkflowsStateService.
   */
  public static abstract class WorkflowsStateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkflowsStateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkflowsStateService.
   */
  public static final class WorkflowsStateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkflowsStateServiceStub> {
    private WorkflowsStateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsStateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsStateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFlowState lists flow state
     * </pre>
     */
    public void getFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlowStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SaveFlowState saves flow state
     * </pre>
     */
    public void saveFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFlowStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkflowsStateService.
   */
  public static final class WorkflowsStateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkflowsStateServiceBlockingStub> {
    private WorkflowsStateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsStateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsStateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFlowState lists flow state
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse getFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlowStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SaveFlowState saves flow state
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse saveFlowState(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFlowStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkflowsStateService.
   */
  public static final class WorkflowsStateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkflowsStateServiceFutureStub> {
    private WorkflowsStateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsStateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsStateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetFlowState lists flow state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse> getFlowState(
        com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlowStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SaveFlowState saves flow state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse> saveFlowState(
        com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFlowStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FLOW_STATE = 0;
  private static final int METHODID_SAVE_FLOW_STATE = 1;

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
        case METHODID_GET_FLOW_STATE:
          serviceImpl.getFlowState((com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse>) responseObserver);
          break;
        case METHODID_SAVE_FLOW_STATE:
          serviceImpl.saveFlowState((com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse>) responseObserver);
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
          getGetFlowStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowStateResponse>(
                service, METHODID_GET_FLOW_STATE)))
        .addMethod(
          getSaveFlowStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowStateResponse>(
                service, METHODID_SAVE_FLOW_STATE)))
        .build();
  }

  private static abstract class WorkflowsStateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsStateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowsStateService");
    }
  }

  private static final class WorkflowsStateServiceFileDescriptorSupplier
      extends WorkflowsStateServiceBaseDescriptorSupplier {
    WorkflowsStateServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowsStateServiceMethodDescriptorSupplier
      extends WorkflowsStateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsStateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsStateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsStateServiceFileDescriptorSupplier())
              .addMethod(getGetFlowStateMethod())
              .addMethod(getSaveFlowStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
