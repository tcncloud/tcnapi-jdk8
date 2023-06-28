package com.tcn.cloud.api.api.commons.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/commons/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowsDefinitionServiceGrpc {

  private WorkflowsDefinitionServiceGrpc() {}

  public static final String SERVICE_NAME = "api.commons.workflows.WorkflowsDefinitionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveFlowDefinition",
      requestType = com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod;
    if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod = getSaveFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("SaveFlowDefinition"))
              .build();
        }
      }
    }
    return getSaveFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlowDefinition",
      requestType = com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod;
    if ((getGetFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getGetFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod = getGetFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("GetFlowDefinition"))
              .build();
        }
      }
    }
    return getGetFlowDefinitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsDefinitionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceStub>() {
        @java.lang.Override
        public WorkflowsDefinitionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionServiceStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsDefinitionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowsDefinitionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsDefinitionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionServiceFutureStub>() {
        @java.lang.Override
        public WorkflowsDefinitionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveFlowDefinition(com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFlowDefinitionMethod(), responseObserver);
    }

    /**
     */
    default void getFlowDefinition(com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlowDefinitionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkflowsDefinitionService.
   */
  public static abstract class WorkflowsDefinitionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkflowsDefinitionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkflowsDefinitionService.
   */
  public static final class WorkflowsDefinitionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkflowsDefinitionServiceStub> {
    private WorkflowsDefinitionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveFlowDefinition(com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlowDefinition(com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkflowsDefinitionService.
   */
  public static final class WorkflowsDefinitionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkflowsDefinitionServiceBlockingStub> {
    private WorkflowsDefinitionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse saveFlowDefinition(com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse getFlowDefinition(com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlowDefinitionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkflowsDefinitionService.
   */
  public static final class WorkflowsDefinitionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkflowsDefinitionServiceFutureStub> {
    private WorkflowsDefinitionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse> saveFlowDefinition(
        com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse> getFlowDefinition(
        com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_FLOW_DEFINITION = 0;
  private static final int METHODID_GET_FLOW_DEFINITION = 1;

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
        case METHODID_SAVE_FLOW_DEFINITION:
          serviceImpl.saveFlowDefinition((com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_FLOW_DEFINITION:
          serviceImpl.getFlowDefinition((com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse>) responseObserver);
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
          getSaveFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionRequest,
              com.tcn.cloud.api.api.commons.workflows.SaveFlowDefinitionResponse>(
                service, METHODID_SAVE_FLOW_DEFINITION)))
        .addMethod(
          getGetFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionRequest,
              com.tcn.cloud.api.api.commons.workflows.GetFlowDefinitionResponse>(
                service, METHODID_GET_FLOW_DEFINITION)))
        .build();
  }

  private static abstract class WorkflowsDefinitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsDefinitionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowsDefinitionService");
    }
  }

  private static final class WorkflowsDefinitionServiceFileDescriptorSupplier
      extends WorkflowsDefinitionServiceBaseDescriptorSupplier {
    WorkflowsDefinitionServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowsDefinitionServiceMethodDescriptorSupplier
      extends WorkflowsDefinitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsDefinitionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsDefinitionServiceFileDescriptorSupplier())
              .addMethod(getSaveFlowDefinitionMethod())
              .addMethod(getGetFlowDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
