package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowsDefinitionsServiceGrpc {

  private WorkflowsDefinitionsServiceGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.workflows.WorkflowsDefinitionsService";

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
    if ((getListFlowDefinitionsMethod = WorkflowsDefinitionsServiceGrpc.getListFlowDefinitionsMethod) == null) {
      synchronized (WorkflowsDefinitionsServiceGrpc.class) {
        if ((getListFlowDefinitionsMethod = WorkflowsDefinitionsServiceGrpc.getListFlowDefinitionsMethod) == null) {
          WorkflowsDefinitionsServiceGrpc.getListFlowDefinitionsMethod = getListFlowDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlowDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionsServiceMethodDescriptorSupplier("ListFlowDefinitions"))
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
    if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionsServiceGrpc.getSaveFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionsServiceGrpc.class) {
        if ((getSaveFlowDefinitionMethod = WorkflowsDefinitionsServiceGrpc.getSaveFlowDefinitionMethod) == null) {
          WorkflowsDefinitionsServiceGrpc.getSaveFlowDefinitionMethod = getSaveFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionsServiceMethodDescriptorSupplier("SaveFlowDefinition"))
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
    if ((getGetFlowDefinitionMethod = WorkflowsDefinitionsServiceGrpc.getGetFlowDefinitionMethod) == null) {
      synchronized (WorkflowsDefinitionsServiceGrpc.class) {
        if ((getGetFlowDefinitionMethod = WorkflowsDefinitionsServiceGrpc.getGetFlowDefinitionMethod) == null) {
          WorkflowsDefinitionsServiceGrpc.getGetFlowDefinitionMethod = getGetFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionsServiceMethodDescriptorSupplier("GetFlowDefinition"))
              .build();
        }
      }
    }
    return getGetFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> getDeleteFlowDefinitionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlowDefinitionById",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> getDeleteFlowDefinitionByIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest, com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> getDeleteFlowDefinitionByIdMethod;
    if ((getDeleteFlowDefinitionByIdMethod = WorkflowsDefinitionsServiceGrpc.getDeleteFlowDefinitionByIdMethod) == null) {
      synchronized (WorkflowsDefinitionsServiceGrpc.class) {
        if ((getDeleteFlowDefinitionByIdMethod = WorkflowsDefinitionsServiceGrpc.getDeleteFlowDefinitionByIdMethod) == null) {
          WorkflowsDefinitionsServiceGrpc.getDeleteFlowDefinitionByIdMethod = getDeleteFlowDefinitionByIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest, com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlowDefinitionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowsDefinitionsServiceMethodDescriptorSupplier("DeleteFlowDefinitionById"))
              .build();
        }
      }
    }
    return getDeleteFlowDefinitionByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowsDefinitionsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceStub>() {
        @java.lang.Override
        public WorkflowsDefinitionsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionsServiceStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowsDefinitionsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowsDefinitionsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionsServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowsDefinitionsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowsDefinitionsServiceFutureStub>() {
        @java.lang.Override
        public WorkflowsDefinitionsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowsDefinitionsServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowsDefinitionsServiceFutureStub.newStub(factory, channel);
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
    default void deleteFlowDefinitionById(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlowDefinitionByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkflowsDefinitionsService.
   */
  public static abstract class WorkflowsDefinitionsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkflowsDefinitionsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkflowsDefinitionsService.
   */
  public static final class WorkflowsDefinitionsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkflowsDefinitionsServiceStub> {
    private WorkflowsDefinitionsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionsServiceStub(channel, callOptions);
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
    public void deleteFlowDefinitionById(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlowDefinitionByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkflowsDefinitionsService.
   */
  public static final class WorkflowsDefinitionsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkflowsDefinitionsServiceBlockingStub> {
    private WorkflowsDefinitionsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionsServiceBlockingStub(channel, callOptions);
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
    public com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse deleteFlowDefinitionById(com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlowDefinitionByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkflowsDefinitionsService.
   */
  public static final class WorkflowsDefinitionsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkflowsDefinitionsServiceFutureStub> {
    private WorkflowsDefinitionsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowsDefinitionsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowsDefinitionsServiceFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse> deleteFlowDefinitionById(
        com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlowDefinitionByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FLOW_DEFINITIONS = 0;
  private static final int METHODID_SAVE_FLOW_DEFINITION = 1;
  private static final int METHODID_GET_FLOW_DEFINITION = 2;
  private static final int METHODID_DELETE_FLOW_DEFINITION_BY_ID = 3;

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
        case METHODID_DELETE_FLOW_DEFINITION_BY_ID:
          serviceImpl.deleteFlowDefinitionById((com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse>) responseObserver);
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
          getDeleteFlowDefinitionByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.DeleteFlowDefinitionByIdResponse>(
                service, METHODID_DELETE_FLOW_DEFINITION_BY_ID)))
        .build();
  }

  private static abstract class WorkflowsDefinitionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowsDefinitionsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowsDefinitionsService");
    }
  }

  private static final class WorkflowsDefinitionsServiceFileDescriptorSupplier
      extends WorkflowsDefinitionsServiceBaseDescriptorSupplier {
    WorkflowsDefinitionsServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowsDefinitionsServiceMethodDescriptorSupplier
      extends WorkflowsDefinitionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkflowsDefinitionsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkflowsDefinitionsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowsDefinitionsServiceFileDescriptorSupplier())
              .addMethod(getListFlowDefinitionsMethod())
              .addMethod(getSaveFlowDefinitionMethod())
              .addMethod(getGetFlowDefinitionMethod())
              .addMethod(getDeleteFlowDefinitionByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
