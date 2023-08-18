package com.tcn.cloud.api.api.v1alpha1.agenttraining;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: api/v1alpha1/agenttraining/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentTrainingServiceGrpc {

  private AgentTrainingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.agenttraining.AgentTrainingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> getCreateLearningOpportunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateLearningOpportunity",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> getCreateLearningOpportunityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> getCreateLearningOpportunityMethod;
    if ((getCreateLearningOpportunityMethod = AgentTrainingServiceGrpc.getCreateLearningOpportunityMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getCreateLearningOpportunityMethod = AgentTrainingServiceGrpc.getCreateLearningOpportunityMethod) == null) {
          AgentTrainingServiceGrpc.getCreateLearningOpportunityMethod = getCreateLearningOpportunityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateLearningOpportunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("CreateLearningOpportunity"))
              .build();
        }
      }
    }
    return getCreateLearningOpportunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLearningOpportunities",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesMethod;
    if ((getListLearningOpportunitiesMethod = AgentTrainingServiceGrpc.getListLearningOpportunitiesMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getListLearningOpportunitiesMethod = AgentTrainingServiceGrpc.getListLearningOpportunitiesMethod) == null) {
          AgentTrainingServiceGrpc.getListLearningOpportunitiesMethod = getListLearningOpportunitiesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLearningOpportunities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("ListLearningOpportunities"))
              .build();
        }
      }
    }
    return getListLearningOpportunitiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentTrainingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceStub>() {
        @java.lang.Override
        public AgentTrainingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingServiceStub(channel, callOptions);
        }
      };
    return AgentTrainingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentTrainingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceBlockingStub>() {
        @java.lang.Override
        public AgentTrainingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentTrainingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentTrainingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingServiceFutureStub>() {
        @java.lang.Override
        public AgentTrainingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingServiceFutureStub(channel, callOptions);
        }
      };
    return AgentTrainingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateLearningOpportunity creates a new learning opportunity.
     * </pre>
     */
    default void createLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLearningOpportunityMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListLearningOpportunities lists learning opportunities.
     * </pre>
     */
    default void listLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLearningOpportunitiesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentTrainingService.
   */
  public static abstract class AgentTrainingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentTrainingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentTrainingService.
   */
  public static final class AgentTrainingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentTrainingServiceStub> {
    private AgentTrainingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLearningOpportunity creates a new learning opportunity.
     * </pre>
     */
    public void createLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLearningOpportunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListLearningOpportunities lists learning opportunities.
     * </pre>
     */
    public void listLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLearningOpportunitiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentTrainingService.
   */
  public static final class AgentTrainingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentTrainingServiceBlockingStub> {
    private AgentTrainingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLearningOpportunity creates a new learning opportunity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse createLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLearningOpportunityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListLearningOpportunities lists learning opportunities.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse listLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLearningOpportunitiesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentTrainingService.
   */
  public static final class AgentTrainingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentTrainingServiceFutureStub> {
    private AgentTrainingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateLearningOpportunity creates a new learning opportunity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse> createLearningOpportunity(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLearningOpportunityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListLearningOpportunities lists learning opportunities.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> listLearningOpportunities(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLearningOpportunitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LEARNING_OPPORTUNITY = 0;
  private static final int METHODID_LIST_LEARNING_OPPORTUNITIES = 1;

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
        case METHODID_CREATE_LEARNING_OPPORTUNITY:
          serviceImpl.createLearningOpportunity((com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse>) responseObserver);
          break;
        case METHODID_LIST_LEARNING_OPPORTUNITIES:
          serviceImpl.listLearningOpportunities((com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>) responseObserver);
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
          getCreateLearningOpportunityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.CreateLearningOpportunityResponse>(
                service, METHODID_CREATE_LEARNING_OPPORTUNITY)))
        .addMethod(
          getListLearningOpportunitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>(
                service, METHODID_LIST_LEARNING_OPPORTUNITIES)))
        .build();
  }

  private static abstract class AgentTrainingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentTrainingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentTrainingService");
    }
  }

  private static final class AgentTrainingServiceFileDescriptorSupplier
      extends AgentTrainingServiceBaseDescriptorSupplier {
    AgentTrainingServiceFileDescriptorSupplier() {}
  }

  private static final class AgentTrainingServiceMethodDescriptorSupplier
      extends AgentTrainingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentTrainingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentTrainingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentTrainingServiceFileDescriptorSupplier())
              .addMethod(getCreateLearningOpportunityMethod())
              .addMethod(getListLearningOpportunitiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
