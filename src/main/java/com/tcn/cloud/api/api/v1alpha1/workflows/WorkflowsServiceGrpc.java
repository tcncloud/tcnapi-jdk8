package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowsServiceGrpc {

  private WorkflowsServiceGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.workflows.WorkflowsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveFlow",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowMethod;
    if ((getSaveFlowMethod = WorkflowsServiceGrpc.getSaveFlowMethod) == null) {
      synchronized (WorkflowsServiceGrpc.class) {
        if ((getSaveFlowMethod = WorkflowsServiceGrpc.getSaveFlowMethod) == null) {
          WorkflowsServiceGrpc.getSaveFlowMethod = getSaveFlowMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsServiceMethodDescriptorSupplier("SaveFlow"))
              .build();
        }
      }
    }
    return getSaveFlowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlow",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowMethod;
    if ((getGetFlowMethod = WorkflowsServiceGrpc.getGetFlowMethod) == null) {
      synchronized (WorkflowsServiceGrpc.class) {
        if ((getGetFlowMethod = WorkflowsServiceGrpc.getGetFlowMethod) == null) {
          WorkflowsServiceGrpc.getGetFlowMethod = getGetFlowMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsServiceMethodDescriptorSupplier("GetFlow"))
              .build();
        }
      }
    }
    return getGetFlowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceStub>() {
        @java.lang.Override
        public WorkflowsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsServiceStub(channel, callOptions);
        }
      };
    return WorkflowsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsServiceFutureStub>() {
        @java.lang.Override
        public WorkflowsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveFlow(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFlowMethod(), responseObserver);
    }

    /**
     */
    default void getFlow(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlowMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkflowsService.
   */
  public static abstract class WorkflowsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkflowsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkflowsService.
   */
  public static final class WorkflowsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkflowsServiceStub> {
    private WorkflowsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveFlow(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFlowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlow(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkflowsService.
   */
  public static final class WorkflowsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkflowsServiceBlockingStub> {
    private WorkflowsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse saveFlow(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFlowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse getFlow(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlowMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkflowsService.
   */
  public static final class WorkflowsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkflowsServiceFutureStub> {
    private WorkflowsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> saveFlow(
        com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFlowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getFlow(
        com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_FLOW = 0;
  private static final int METHODID_GET_FLOW = 1;

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
        case METHODID_SAVE_FLOW:
          serviceImpl.saveFlow((com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_FLOW:
          serviceImpl.getFlow((com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>) responseObserver);
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
          getSaveFlowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>(
                service, METHODID_SAVE_FLOW)))
        .addMethod(
          getGetFlowMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>(
                service, METHODID_GET_FLOW)))
        .build();
  }

  private static abstract class WorkflowsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowsService");
    }
  }

  private static final class WorkflowsServiceFileDescriptorSupplier
      extends WorkflowsServiceBaseDescriptorSupplier {
    WorkflowsServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowsServiceMethodDescriptorSupplier
      extends WorkflowsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsServiceFileDescriptorSupplier())
              .addMethod(getSaveFlowMethod())
              .addMethod(getGetFlowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
