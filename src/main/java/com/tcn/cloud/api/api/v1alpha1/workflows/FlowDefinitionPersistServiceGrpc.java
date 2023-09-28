package com.tcn.cloud.api.api.v1alpha1.workflows;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
 * PERMISSION_WORKFLOWS is required for all operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/workflows/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlowDefinitionPersistServiceGrpc {

  private FlowDefinitionPersistServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.workflows.FlowDefinitionPersistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> getCreateFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> getCreateFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> getCreateFlowDefinitionMethod;
    if ((getCreateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getCreateFlowDefinitionMethod) == null) {
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        if ((getCreateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getCreateFlowDefinitionMethod) == null) {
          FlowDefinitionPersistServiceGrpc.getCreateFlowDefinitionMethod = getCreateFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlowDefinitionPersistServiceMethodDescriptorSupplier("CreateFlowDefinition"))
              .build();
        }
      }
    }
    return getCreateFlowDefinitionMethod;
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
    if ((getGetFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getGetFlowDefinitionMethod) == null) {
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        if ((getGetFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getGetFlowDefinitionMethod) == null) {
          FlowDefinitionPersistServiceGrpc.getGetFlowDefinitionMethod = getGetFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlowDefinitionPersistServiceMethodDescriptorSupplier("GetFlowDefinition"))
              .build();
        }
      }
    }
    return getGetFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlowDefinitions",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> getListFlowDefinitionsMethod;
    if ((getListFlowDefinitionsMethod = FlowDefinitionPersistServiceGrpc.getListFlowDefinitionsMethod) == null) {
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        if ((getListFlowDefinitionsMethod = FlowDefinitionPersistServiceGrpc.getListFlowDefinitionsMethod) == null) {
          FlowDefinitionPersistServiceGrpc.getListFlowDefinitionsMethod = getListFlowDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlowDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlowDefinitionPersistServiceMethodDescriptorSupplier("ListFlowDefinitions"))
              .build();
        }
      }
    }
    return getListFlowDefinitionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> getUpdateFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> getUpdateFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> getUpdateFlowDefinitionMethod;
    if ((getUpdateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getUpdateFlowDefinitionMethod) == null) {
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        if ((getUpdateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getUpdateFlowDefinitionMethod) == null) {
          FlowDefinitionPersistServiceGrpc.getUpdateFlowDefinitionMethod = getUpdateFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlowDefinitionPersistServiceMethodDescriptorSupplier("UpdateFlowDefinition"))
              .build();
        }
      }
    }
    return getUpdateFlowDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> getValidateFlowDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateFlowDefinition",
      requestType = com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest,
      com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> getValidateFlowDefinitionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> getValidateFlowDefinitionMethod;
    if ((getValidateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getValidateFlowDefinitionMethod) == null) {
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        if ((getValidateFlowDefinitionMethod = FlowDefinitionPersistServiceGrpc.getValidateFlowDefinitionMethod) == null) {
          FlowDefinitionPersistServiceGrpc.getValidateFlowDefinitionMethod = getValidateFlowDefinitionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest, com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateFlowDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlowDefinitionPersistServiceMethodDescriptorSupplier("ValidateFlowDefinition"))
              .build();
        }
      }
    }
    return getValidateFlowDefinitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlowDefinitionPersistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceStub>() {
        @java.lang.Override
        public FlowDefinitionPersistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlowDefinitionPersistServiceStub(channel, callOptions);
        }
      };
    return FlowDefinitionPersistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlowDefinitionPersistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceBlockingStub>() {
        @java.lang.Override
        public FlowDefinitionPersistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlowDefinitionPersistServiceBlockingStub(channel, callOptions);
        }
      };
    return FlowDefinitionPersistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlowDefinitionPersistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlowDefinitionPersistServiceFutureStub>() {
        @java.lang.Override
        public FlowDefinitionPersistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlowDefinitionPersistServiceFutureStub(channel, callOptions);
        }
      };
    return FlowDefinitionPersistServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateFlowDefinition creates a new flow definition in the database
     * </pre>
     */
    default void createFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFlowDefinition retrieves a flow definition from the database
     * </pre>
     */
    default void getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    default void listFlowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlowDefinitionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFlowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    default void updateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlowDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateFlowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    default void validateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateFlowDefinitionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FlowDefinitionPersistService.
   * <pre>
   * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static abstract class FlowDefinitionPersistServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FlowDefinitionPersistServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FlowDefinitionPersistService.
   * <pre>
   * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class FlowDefinitionPersistServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FlowDefinitionPersistServiceStub> {
    private FlowDefinitionPersistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowDefinitionPersistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlowDefinitionPersistServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFlowDefinition creates a new flow definition in the database
     * </pre>
     */
    public void createFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFlowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public void getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    public void listFlowDefinitions(com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListFlowDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFlowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public void updateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateFlowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public void validateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateFlowDefinitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FlowDefinitionPersistService.
   * <pre>
   * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class FlowDefinitionPersistServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FlowDefinitionPersistServiceBlockingStub> {
    private FlowDefinitionPersistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowDefinitionPersistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlowDefinitionPersistServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFlowDefinition creates a new flow definition in the database
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse createFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFlowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse getFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlowDefinitions retrieves a list of flow definitions from the database optionally filtered by the owning application
     * if application is not specified, all flow definitions for the org are returned
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse> listFlowDefinitions(
        com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListFlowDefinitionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFlowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse updateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlowDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateFlowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse validateFlowDefinition(com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateFlowDefinitionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FlowDefinitionPersistService.
   * <pre>
   * FlowDefinitionPersistService is the service that provides CRUD operations for FlowDefinitions.
   * PERMISSION_WORKFLOWS is required for all operations
   * </pre>
   */
  public static final class FlowDefinitionPersistServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FlowDefinitionPersistServiceFutureStub> {
    private FlowDefinitionPersistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlowDefinitionPersistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlowDefinitionPersistServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFlowDefinition creates a new flow definition in the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse> createFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFlowDefinition retrieves a flow definition from the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse> getFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFlowDefinition updates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse> updateFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlowDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateFlowDefinition validates a flow definition in the database. Only the name, description and definition graph itself are updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse> validateFlowDefinition(
        com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateFlowDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FLOW_DEFINITION = 0;
  private static final int METHODID_GET_FLOW_DEFINITION = 1;
  private static final int METHODID_LIST_FLOW_DEFINITIONS = 2;
  private static final int METHODID_UPDATE_FLOW_DEFINITION = 3;
  private static final int METHODID_VALIDATE_FLOW_DEFINITION = 4;

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
        case METHODID_CREATE_FLOW_DEFINITION:
          serviceImpl.createFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_GET_FLOW_DEFINITION:
          serviceImpl.getFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_LIST_FLOW_DEFINITIONS:
          serviceImpl.listFlowDefinitions((com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FLOW_DEFINITION:
          serviceImpl.updateFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_FLOW_DEFINITION:
          serviceImpl.validateFlowDefinition((com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse>) responseObserver);
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
          getCreateFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.CreateFlowDefinitionResponse>(
                service, METHODID_CREATE_FLOW_DEFINITION)))
        .addMethod(
          getGetFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.GetFlowDefinitionResponse>(
                service, METHODID_GET_FLOW_DEFINITION)))
        .addMethod(
          getListFlowDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.ListFlowDefinitionsResponse>(
                service, METHODID_LIST_FLOW_DEFINITIONS)))
        .addMethod(
          getUpdateFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.UpdateFlowDefinitionResponse>(
                service, METHODID_UPDATE_FLOW_DEFINITION)))
        .addMethod(
          getValidateFlowDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionRequest,
              com.tcn.cloud.api.api.v1alpha1.workflows.ValidateFlowDefinitionResponse>(
                service, METHODID_VALIDATE_FLOW_DEFINITION)))
        .build();
  }

  private static abstract class FlowDefinitionPersistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlowDefinitionPersistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlowDefinitionPersistService");
    }
  }

  private static final class FlowDefinitionPersistServiceFileDescriptorSupplier
      extends FlowDefinitionPersistServiceBaseDescriptorSupplier {
    FlowDefinitionPersistServiceFileDescriptorSupplier() {}
  }

  private static final class FlowDefinitionPersistServiceMethodDescriptorSupplier
      extends FlowDefinitionPersistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FlowDefinitionPersistServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FlowDefinitionPersistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlowDefinitionPersistServiceFileDescriptorSupplier())
              .addMethod(getCreateFlowDefinitionMethod())
              .addMethod(getGetFlowDefinitionMethod())
              .addMethod(getListFlowDefinitionsMethod())
              .addMethod(getUpdateFlowDefinitionMethod())
              .addMethod(getValidateFlowDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
