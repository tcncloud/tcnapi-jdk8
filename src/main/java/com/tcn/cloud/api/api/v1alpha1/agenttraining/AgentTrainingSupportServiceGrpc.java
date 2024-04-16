package com.tcn.cloud.api.api.v1alpha1.agenttraining;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AgentTrainingSupportService provides customer support
 * endpoints for agent training.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/agenttraining/support_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AgentTrainingSupportServiceGrpc {

  private AgentTrainingSupportServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.agenttraining.AgentTrainingSupportService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLearningOpportunitiesByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> getListLearningOpportunitiesByOrgIdMethod;
    if ((getListLearningOpportunitiesByOrgIdMethod = AgentTrainingSupportServiceGrpc.getListLearningOpportunitiesByOrgIdMethod) == null) {
      synchronized (AgentTrainingSupportServiceGrpc.class) {
        if ((getListLearningOpportunitiesByOrgIdMethod = AgentTrainingSupportServiceGrpc.getListLearningOpportunitiesByOrgIdMethod) == null) {
          AgentTrainingSupportServiceGrpc.getListLearningOpportunitiesByOrgIdMethod = getListLearningOpportunitiesByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLearningOpportunitiesByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingSupportServiceMethodDescriptorSupplier("ListLearningOpportunitiesByOrgId"))
              .build();
        }
      }
    }
    return getListLearningOpportunitiesByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLearningOpportunityByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityByOrgIdMethod;
    if ((getDeleteLearningOpportunityByOrgIdMethod = AgentTrainingSupportServiceGrpc.getDeleteLearningOpportunityByOrgIdMethod) == null) {
      synchronized (AgentTrainingSupportServiceGrpc.class) {
        if ((getDeleteLearningOpportunityByOrgIdMethod = AgentTrainingSupportServiceGrpc.getDeleteLearningOpportunityByOrgIdMethod) == null) {
          AgentTrainingSupportServiceGrpc.getDeleteLearningOpportunityByOrgIdMethod = getDeleteLearningOpportunityByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLearningOpportunityByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingSupportServiceMethodDescriptorSupplier("DeleteLearningOpportunityByOrgId"))
              .build();
        }
      }
    }
    return getDeleteLearningOpportunityByOrgIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AgentTrainingSupportServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceStub>() {
        @java.lang.Override
        public AgentTrainingSupportServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingSupportServiceStub(channel, callOptions);
        }
      };
    return AgentTrainingSupportServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AgentTrainingSupportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceBlockingStub>() {
        @java.lang.Override
        public AgentTrainingSupportServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingSupportServiceBlockingStub(channel, callOptions);
        }
      };
    return AgentTrainingSupportServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AgentTrainingSupportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AgentTrainingSupportServiceFutureStub>() {
        @java.lang.Override
        public AgentTrainingSupportServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AgentTrainingSupportServiceFutureStub(channel, callOptions);
        }
      };
    return AgentTrainingSupportServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AgentTrainingSupportService provides customer support
   * endpoints for agent training.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListLearningOpportunitiesByOrgId lists learning opportunities for a specific org.
     * </pre>
     */
    default void listLearningOpportunitiesByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLearningOpportunitiesByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLearningOpportunityByOrgId deletes a learning opportunity in a specific org.
     * </pre>
     */
    default void deleteLearningOpportunityByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLearningOpportunityByOrgIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AgentTrainingSupportService.
   * <pre>
   * AgentTrainingSupportService provides customer support
   * endpoints for agent training.
   * </pre>
   */
  public static abstract class AgentTrainingSupportServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AgentTrainingSupportServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AgentTrainingSupportService.
   * <pre>
   * AgentTrainingSupportService provides customer support
   * endpoints for agent training.
   * </pre>
   */
  public static final class AgentTrainingSupportServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AgentTrainingSupportServiceStub> {
    private AgentTrainingSupportServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingSupportServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingSupportServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLearningOpportunitiesByOrgId lists learning opportunities for a specific org.
     * </pre>
     */
    public void listLearningOpportunitiesByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLearningOpportunitiesByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLearningOpportunityByOrgId deletes a learning opportunity in a specific org.
     * </pre>
     */
    public void deleteLearningOpportunityByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLearningOpportunityByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AgentTrainingSupportService.
   * <pre>
   * AgentTrainingSupportService provides customer support
   * endpoints for agent training.
   * </pre>
   */
  public static final class AgentTrainingSupportServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AgentTrainingSupportServiceBlockingStub> {
    private AgentTrainingSupportServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingSupportServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingSupportServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLearningOpportunitiesByOrgId lists learning opportunities for a specific org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse listLearningOpportunitiesByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLearningOpportunitiesByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLearningOpportunityByOrgId deletes a learning opportunity in a specific org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse deleteLearningOpportunityByOrgId(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLearningOpportunityByOrgIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AgentTrainingSupportService.
   * <pre>
   * AgentTrainingSupportService provides customer support
   * endpoints for agent training.
   * </pre>
   */
  public static final class AgentTrainingSupportServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AgentTrainingSupportServiceFutureStub> {
    private AgentTrainingSupportServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AgentTrainingSupportServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AgentTrainingSupportServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListLearningOpportunitiesByOrgId lists learning opportunities for a specific org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse> listLearningOpportunitiesByOrgId(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLearningOpportunitiesByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLearningOpportunityByOrgId deletes a learning opportunity in a specific org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> deleteLearningOpportunityByOrgId(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLearningOpportunityByOrgIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_LEARNING_OPPORTUNITIES_BY_ORG_ID = 0;
  private static final int METHODID_DELETE_LEARNING_OPPORTUNITY_BY_ORG_ID = 1;

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
        case METHODID_LIST_LEARNING_OPPORTUNITIES_BY_ORG_ID:
          serviceImpl.listLearningOpportunitiesByOrgId((com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>) responseObserver);
          break;
        case METHODID_DELETE_LEARNING_OPPORTUNITY_BY_ORG_ID:
          serviceImpl.deleteLearningOpportunityByOrgId((com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>) responseObserver);
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
          getListLearningOpportunitiesByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListLearningOpportunitiesResponse>(
                service, METHODID_LIST_LEARNING_OPPORTUNITIES_BY_ORG_ID)))
        .addMethod(
          getDeleteLearningOpportunityByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>(
                service, METHODID_DELETE_LEARNING_OPPORTUNITY_BY_ORG_ID)))
        .build();
  }

  private static abstract class AgentTrainingSupportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AgentTrainingSupportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.SupportServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AgentTrainingSupportService");
    }
  }

  private static final class AgentTrainingSupportServiceFileDescriptorSupplier
      extends AgentTrainingSupportServiceBaseDescriptorSupplier {
    AgentTrainingSupportServiceFileDescriptorSupplier() {}
  }

  private static final class AgentTrainingSupportServiceMethodDescriptorSupplier
      extends AgentTrainingSupportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AgentTrainingSupportServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AgentTrainingSupportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AgentTrainingSupportServiceFileDescriptorSupplier())
              .addMethod(getListLearningOpportunitiesByOrgIdMethod())
              .addMethod(getDeleteLearningOpportunityByOrgIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
