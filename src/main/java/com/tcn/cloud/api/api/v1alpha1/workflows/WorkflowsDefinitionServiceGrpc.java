package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowsDefinitionServiceGrpc {

  private WorkflowsDefinitionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.workflows.WorkflowsDefinitionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlowDefinitions",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod;
    if ((getListFlowDefinitionsMethod = WorkflowsDefinitionServiceGrpc.getListFlowDefinitionsMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getListFlowDefinitionsMethod = WorkflowsDefinitionServiceGrpc.getListFlowDefinitionsMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getListFlowDefinitionsMethod = getListFlowDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlowDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("ListFlowDefinitions"))
              .build();
        }
      }
    }
    return getListFlowDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> getSaveFlowDefinitionMethod;
    if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getSaveFlowDefinitionMethod = getSaveFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("SaveFlowDefinition"))
              .build();
        }
      }
    }
    return getSaveFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getGetFlowDefinitionMethod;
    if ((getGetFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getGetFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getGetFlowDefinitionMethod = getGetFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("GetFlowDefinition"))
              .build();
        }
      }
    }
    return getGetFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> getDeleteFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> getDeleteFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> getDeleteFlowDefinitionMethod;
    if ((getDeleteFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getDeleteFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionServiceGrpc.class) {
        if ((getDeleteFlowDefinitionMethod = WorkflowsDefinitionServiceGrpc.getDeleteFlowDefinitionMethod) == null) {
          WorkflowsDefinitionServiceGrpc.getDeleteFlowDefinitionMethod = getDeleteFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionServiceMethodDescriptorSupplier("DeleteFlowDefinition"))
              .build();
        }
      }
    }
    return getDeleteFlowDefinitionMethod;
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
     * <pre>
     * ListFlowDefinitions lists flow definitions
     * </pre>
     */
    default void listFlowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlowDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SaveFlowDefinition creates or updates a flow definition
     * </pre>
     */
    default void saveFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveFlowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFlowDefinition gets a flow definition
     * </pre>
     */
    default void getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFlowDefinition deletes a flow definition
     * </pre>
     */
    default void deleteFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlowDefinitionMethod(), responseObserver);
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
     * <pre>
     * ListFlowDefinitions lists flow definitions
     * </pre>
     */
    public void listFlowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlowDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SaveFlowDefinition creates or updates a flow definition
     * </pre>
     */
    public void saveFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFlowDefinition gets a flow definition
     * </pre>
     */
    public void getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFlowDefinition deletes a flow definition
     * </pre>
     */
    public void deleteFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * ListFlowDefinitions lists flow definitions
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse listFlowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlowDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SaveFlowDefinition creates or updates a flow definition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse saveFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFlowDefinition gets a flow definition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFlowDefinition deletes a flow definition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse deleteFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlowDefinitionMethod(), getCallOptions(), request);
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
     * <pre>
     * ListFlowDefinitions lists flow definitions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> listFlowDefinitions(
        com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlowDefinitionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SaveFlowDefinition creates or updates a flow definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse> saveFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFlowDefinition gets a flow definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFlowDefinition deletes a flow definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse> deleteFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlowDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FLOW_DEFINITIONS = 0;
  private static final int METHODID_SAVE_FLOW_DEFINITION = 1;
  private static final int METHODID_GET_FLOW_DEFINITION = 2;
  private static final int METHODID_DELETE_FLOW_DEFINITION = 3;

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
        case METHODID_LIST_FLOW_DEFINITIONS:
          serviceImpl.listFlowDefinitions((com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>) responseObserver);
          break;
        case METHODID_SAVE_FLOW_DEFINITION:
          serviceImpl.saveFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_FLOW_DEFINITION:
          serviceImpl.getFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_DELETE_FLOW_DEFINITION:
          serviceImpl.deleteFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse>) responseObserver);
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
          getListFlowDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>(
                service, METHODID_LIST_FLOW_DEFINITIONS)))
        .addMethod(
          getSaveFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>(
                service, METHODID_SAVE_FLOW_DEFINITION)))
        .addMethod(
          getGetFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>(
                service, METHODID_GET_FLOW_DEFINITION)))
        .addMethod(
          getDeleteFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionResponse>(
                service, METHODID_DELETE_FLOW_DEFINITION)))
        .build();
  }

  private static abstract class WorkflowsDefinitionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsDefinitionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
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
    private final java.lang.String methodName;

    WorkflowsDefinitionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getListFlowDefinitionsMethod())
              .addMethod(getSaveFlowDefinitionMethod())
              .addMethod(getGetFlowDefinitionMethod())
              .addMethod(getDeleteFlowDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
