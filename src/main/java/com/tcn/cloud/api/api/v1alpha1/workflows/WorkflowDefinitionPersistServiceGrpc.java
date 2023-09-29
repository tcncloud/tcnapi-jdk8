package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
 * PERMISSION_WORKFLOWS is required for all operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkflowDefinitionPersistServiceGrpc {

  private WorkflowDefinitionPersistServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.workflows.WorkflowDefinitionPersistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> getCreateWorkflowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkflowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> getCreateWorkflowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> getCreateWorkflowDefinitionMethod;
    if ((getCreateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getCreateWorkflowDefinitionMethod) == null) {
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        if ((getCreateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getCreateWorkflowDefinitionMethod) == null) {
          WorkflowDefinitionPersistServiceGrpc.getCreateWorkflowDefinitionMethod = getCreateWorkflowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkflowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceMethodDescriptorSupplier("CreateWorkflowDefinition"))
              .build();
        }
      }
    }
    return getCreateWorkflowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> getGetWorkflowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> getGetWorkflowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> getGetWorkflowDefinitionMethod;
    if ((getGetWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getGetWorkflowDefinitionMethod) == null) {
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        if ((getGetWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getGetWorkflowDefinitionMethod) == null) {
          WorkflowDefinitionPersistServiceGrpc.getGetWorkflowDefinitionMethod = getGetWorkflowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkflowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceMethodDescriptorSupplier("GetWorkflowDefinition"))
              .build();
        }
      }
    }
    return getGetWorkflowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> getListWorkflowDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkflowDefinitions",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> getListWorkflowDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> getListWorkflowDefinitionsMethod;
    if ((getListWorkflowDefinitionsMethod = WorkflowDefinitionPersistServiceGrpc.getListWorkflowDefinitionsMethod) == null) {
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        if ((getListWorkflowDefinitionsMethod = WorkflowDefinitionPersistServiceGrpc.getListWorkflowDefinitionsMethod) == null) {
          WorkflowDefinitionPersistServiceGrpc.getListWorkflowDefinitionsMethod = getListWorkflowDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkflowDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceMethodDescriptorSupplier("ListWorkflowDefinitions"))
              .build();
        }
      }
    }
    return getListWorkflowDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> getUpdateWorkflowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkflowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> getUpdateWorkflowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> getUpdateWorkflowDefinitionMethod;
    if ((getUpdateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getUpdateWorkflowDefinitionMethod) == null) {
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        if ((getUpdateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getUpdateWorkflowDefinitionMethod) == null) {
          WorkflowDefinitionPersistServiceGrpc.getUpdateWorkflowDefinitionMethod = getUpdateWorkflowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkflowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceMethodDescriptorSupplier("UpdateWorkflowDefinition"))
              .build();
        }
      }
    }
    return getUpdateWorkflowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> getValidateWorkflowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateWorkflowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> getValidateWorkflowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> getValidateWorkflowDefinitionMethod;
    if ((getValidateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getValidateWorkflowDefinitionMethod) == null) {
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        if ((getValidateWorkflowDefinitionMethod = WorkflowDefinitionPersistServiceGrpc.getValidateWorkflowDefinitionMethod) == null) {
          WorkflowDefinitionPersistServiceGrpc.getValidateWorkflowDefinitionMethod = getValidateWorkflowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateWorkflowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceMethodDescriptorSupplier("ValidateWorkflowDefinition"))
              .build();
        }
      }
    }
    return getValidateWorkflowDefinitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkflowDefinitionPersistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceStub>() {
        @java.lang.Override
        public WorkflowDefinitionPersistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowDefinitionPersistServiceStub(channel, callOptions);
        }
      };
    return WorkflowDefinitionPersistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkflowDefinitionPersistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceBlockingStub>() {
        @java.lang.Override
        public WorkflowDefinitionPersistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowDefinitionPersistServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkflowDefinitionPersistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkflowDefinitionPersistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkflowDefinitionPersistServiceFutureStub>() {
        @java.lang.Override
        public WorkflowDefinitionPersistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkflowDefinitionPersistServiceFutureStub(channel, callOptions);
        }
      };
    return WorkflowDefinitionPersistServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateWorkflowDefinition creates a new flow definition in the database
     * </pre>
     */
    default void createWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkflowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetWorkflowDefinition retrieves a flow definition from the database
     * </pre>
     */
    default void getWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkflowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListWorkflowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    default void listWorkflowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWorkflowDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateWorkflowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    default void updateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkflowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateWorkflowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    default void validateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateWorkflowDefinitionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkflowDefinitionPersistService.
   * <pre>
   * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static abstract class WorkflowDefinitionPersistServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkflowDefinitionPersistServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkflowDefinitionPersistService.
   * <pre>
   * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class WorkflowDefinitionPersistServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkflowDefinitionPersistServiceStub> {
    private WorkflowDefinitionPersistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowDefinitionPersistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowDefinitionPersistServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateWorkflowDefinition creates a new flow definition in the database
     * </pre>
     */
    public void createWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkflowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetWorkflowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public void getWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkflowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListWorkflowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    public void listWorkflowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListWorkflowDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateWorkflowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public void updateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkflowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateWorkflowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public void validateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateWorkflowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkflowDefinitionPersistService.
   * <pre>
   * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class WorkflowDefinitionPersistServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkflowDefinitionPersistServiceBlockingStub> {
    private WorkflowDefinitionPersistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowDefinitionPersistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowDefinitionPersistServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateWorkflowDefinition creates a new flow definition in the database
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse createWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkflowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetWorkflowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse getWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkflowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListWorkflowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse> listWorkflowDefinitions(
        com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListWorkflowDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateWorkflowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse updateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkflowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateWorkflowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse validateWorkflowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateWorkflowDefinitionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkflowDefinitionPersistService.
   * <pre>
   * WorkflowDefinitionPersistService is the service that provides CRUD operations for workflow definitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class WorkflowDefinitionPersistServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkflowDefinitionPersistServiceFutureStub> {
    private WorkflowDefinitionPersistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkflowDefinitionPersistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkflowDefinitionPersistServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateWorkflowDefinition creates a new flow definition in the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse> createWorkflowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkflowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetWorkflowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse> getWorkflowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkflowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateWorkflowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkflowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateWorkflowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse> validateWorkflowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateWorkflowDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_WORKFLOW_DEFINITION = 0;
  private static final int METHODID_GET_WORKFLOW_DEFINITION = 1;
  private static final int METHODID_LIST_WORKFLOW_DEFINITIONS = 2;
  private static final int METHODID_UPDATE_WORKFLOW_DEFINITION = 3;
  private static final int METHODID_VALIDATE_WORKFLOW_DEFINITION = 4;

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
        case METHODID_CREATE_WORKFLOW_DEFINITION:
          serviceImpl.createWorkflowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_WORKFLOW_DEFINITION:
          serviceImpl.getWorkflowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse>) responseObserver);
          break;
        case METHODID_LIST_WORKFLOW_DEFINITIONS:
          serviceImpl.listWorkflowDefinitions((com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WORKFLOW_DEFINITION:
          serviceImpl.updateWorkflowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_WORKFLOW_DEFINITION:
          serviceImpl.validateWorkflowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse>) responseObserver);
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
          getCreateWorkflowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.CreateWorkflowDefinitionResponse>(
                service, METHODID_CREATE_WORKFLOW_DEFINITION)))
        .addMethod(
          getGetWorkflowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.GetWorkflowDefinitionResponse>(
                service, METHODID_GET_WORKFLOW_DEFINITION)))
        .addMethod(
          getListWorkflowDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.ListWorkflowDefinitionsResponse>(
                service, METHODID_LIST_WORKFLOW_DEFINITIONS)))
        .addMethod(
          getUpdateWorkflowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.UpdateWorkflowDefinitionResponse>(
                service, METHODID_UPDATE_WORKFLOW_DEFINITION)))
        .addMethod(
          getValidateWorkflowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.ValidateWorkflowDefinitionResponse>(
                service, METHODID_VALIDATE_WORKFLOW_DEFINITION)))
        .build();
  }

  private static abstract class WorkflowDefinitionPersistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkflowDefinitionPersistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkflowDefinitionPersistService");
    }
  }

  private static final class WorkflowDefinitionPersistServiceFileDescriptorSupplier
      extends WorkflowDefinitionPersistServiceBaseDescriptorSupplier {
    WorkflowDefinitionPersistServiceFileDescriptorSupplier() {}
  }

  private static final class WorkflowDefinitionPersistServiceMethodDescriptorSupplier
      extends WorkflowDefinitionPersistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WorkflowDefinitionPersistServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WorkflowDefinitionPersistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkflowDefinitionPersistServiceFileDescriptorSupplier())
              .addMethod(getCreateWorkflowDefinitionMethod())
              .addMethod(getGetWorkflowDefinitionMethod())
              .addMethod(getListWorkflowDefinitionsMethod())
              .addMethod(getUpdateWorkflowDefinitionMethod())
              .addMethod(getValidateWorkflowDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
