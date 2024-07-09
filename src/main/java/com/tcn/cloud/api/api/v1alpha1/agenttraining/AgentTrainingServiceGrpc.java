package com.tcn.cloud.api.api.v1alpha1.agenttraining;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> getListAgentLearningOpportunitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentLearningOpportunities",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> getListAgentLearningOpportunitiesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> getListAgentLearningOpportunitiesMethod;
    if ((getListAgentLearningOpportunitiesMethod = AgentTrainingServiceGrpc.getListAgentLearningOpportunitiesMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getListAgentLearningOpportunitiesMethod = AgentTrainingServiceGrpc.getListAgentLearningOpportunitiesMethod) == null) {
          AgentTrainingServiceGrpc.getListAgentLearningOpportunitiesMethod = getListAgentLearningOpportunitiesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentLearningOpportunities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("ListAgentLearningOpportunities"))
              .build();
        }
      }
    }
    return getListAgentLearningOpportunitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> getCompleteAgentLearningOpportunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompleteAgentLearningOpportunity",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> getCompleteAgentLearningOpportunityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> getCompleteAgentLearningOpportunityMethod;
    if ((getCompleteAgentLearningOpportunityMethod = AgentTrainingServiceGrpc.getCompleteAgentLearningOpportunityMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getCompleteAgentLearningOpportunityMethod = AgentTrainingServiceGrpc.getCompleteAgentLearningOpportunityMethod) == null) {
          AgentTrainingServiceGrpc.getCompleteAgentLearningOpportunityMethod = getCompleteAgentLearningOpportunityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CompleteAgentLearningOpportunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("CompleteAgentLearningOpportunity"))
              .build();
        }
      }
    }
    return getCompleteAgentLearningOpportunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> getListDashboardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDashboards",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> getListDashboardsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> getListDashboardsMethod;
    if ((getListDashboardsMethod = AgentTrainingServiceGrpc.getListDashboardsMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getListDashboardsMethod = AgentTrainingServiceGrpc.getListDashboardsMethod) == null) {
          AgentTrainingServiceGrpc.getListDashboardsMethod = getListDashboardsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDashboards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("ListDashboards"))
              .build();
        }
      }
    }
    return getListDashboardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> getUpdateLearningOpportunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLearningOpportunity",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> getUpdateLearningOpportunityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> getUpdateLearningOpportunityMethod;
    if ((getUpdateLearningOpportunityMethod = AgentTrainingServiceGrpc.getUpdateLearningOpportunityMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getUpdateLearningOpportunityMethod = AgentTrainingServiceGrpc.getUpdateLearningOpportunityMethod) == null) {
          AgentTrainingServiceGrpc.getUpdateLearningOpportunityMethod = getUpdateLearningOpportunityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateLearningOpportunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("UpdateLearningOpportunity"))
              .build();
        }
      }
    }
    return getUpdateLearningOpportunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLearningOpportunity",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> getDeleteLearningOpportunityMethod;
    if ((getDeleteLearningOpportunityMethod = AgentTrainingServiceGrpc.getDeleteLearningOpportunityMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getDeleteLearningOpportunityMethod = AgentTrainingServiceGrpc.getDeleteLearningOpportunityMethod) == null) {
          AgentTrainingServiceGrpc.getDeleteLearningOpportunityMethod = getDeleteLearningOpportunityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLearningOpportunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("DeleteLearningOpportunity"))
              .build();
        }
      }
    }
    return getDeleteLearningOpportunityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> getGetLearningOpportunityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLearningOpportunity",
      requestType = com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest,
      com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> getGetLearningOpportunityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> getGetLearningOpportunityMethod;
    if ((getGetLearningOpportunityMethod = AgentTrainingServiceGrpc.getGetLearningOpportunityMethod) == null) {
      synchronized (AgentTrainingServiceGrpc.class) {
        if ((getGetLearningOpportunityMethod = AgentTrainingServiceGrpc.getGetLearningOpportunityMethod) == null) {
          AgentTrainingServiceGrpc.getGetLearningOpportunityMethod = getGetLearningOpportunityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest, com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLearningOpportunity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AgentTrainingServiceMethodDescriptorSupplier("GetLearningOpportunity"))
              .build();
        }
      }
    }
    return getGetLearningOpportunityMethod;
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

    /**
     * <pre>
     * ListAgentLearningOpportunities lists learning opportunities by agent.
     * </pre>
     */
    default void listAgentLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentLearningOpportunitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CompleteAgentLearningOpportunity completes an agent's learning opportunity.
     * </pre>
     */
    default void completeAgentLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteAgentLearningOpportunityMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListDashboards lists dashboards.
     * </pre>
     */
    default void listDashboards(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDashboardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateLearningOpportunity updates a learning opportunity.
     * </pre>
     */
    default void updateLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLearningOpportunityMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteLearningOpportunity deletes a learning opportunity.
     * </pre>
     */
    default void deleteLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLearningOpportunityMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetLearningOpportunity gets a learning opportunity.
     * </pre>
     */
    default void getLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLearningOpportunityMethod(), responseObserver);
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

    /**
     * <pre>
     * ListAgentLearningOpportunities lists learning opportunities by agent.
     * </pre>
     */
    public void listAgentLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentLearningOpportunitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CompleteAgentLearningOpportunity completes an agent's learning opportunity.
     * </pre>
     */
    public void completeAgentLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteAgentLearningOpportunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListDashboards lists dashboards.
     * </pre>
     */
    public void listDashboards(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDashboardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateLearningOpportunity updates a learning opportunity.
     * </pre>
     */
    public void updateLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLearningOpportunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteLearningOpportunity deletes a learning opportunity.
     * </pre>
     */
    public void deleteLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLearningOpportunityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetLearningOpportunity gets a learning opportunity.
     * </pre>
     */
    public void getLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLearningOpportunityMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * ListAgentLearningOpportunities lists learning opportunities by agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse listAgentLearningOpportunities(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentLearningOpportunitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CompleteAgentLearningOpportunity completes an agent's learning opportunity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse completeAgentLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteAgentLearningOpportunityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListDashboards lists dashboards.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse listDashboards(com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDashboardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateLearningOpportunity updates a learning opportunity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse updateLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLearningOpportunityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteLearningOpportunity deletes a learning opportunity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse deleteLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLearningOpportunityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetLearningOpportunity gets a learning opportunity.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse getLearningOpportunity(com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLearningOpportunityMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * ListAgentLearningOpportunities lists learning opportunities by agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse> listAgentLearningOpportunities(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentLearningOpportunitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CompleteAgentLearningOpportunity completes an agent's learning opportunity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse> completeAgentLearningOpportunity(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteAgentLearningOpportunityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListDashboards lists dashboards.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse> listDashboards(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDashboardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateLearningOpportunity updates a learning opportunity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse> updateLearningOpportunity(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLearningOpportunityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteLearningOpportunity deletes a learning opportunity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse> deleteLearningOpportunity(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLearningOpportunityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetLearningOpportunity gets a learning opportunity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse> getLearningOpportunity(
        com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLearningOpportunityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_LEARNING_OPPORTUNITY = 0;
  private static final int METHODID_LIST_LEARNING_OPPORTUNITIES = 1;
  private static final int METHODID_LIST_AGENT_LEARNING_OPPORTUNITIES = 2;
  private static final int METHODID_COMPLETE_AGENT_LEARNING_OPPORTUNITY = 3;
  private static final int METHODID_LIST_DASHBOARDS = 4;
  private static final int METHODID_UPDATE_LEARNING_OPPORTUNITY = 5;
  private static final int METHODID_DELETE_LEARNING_OPPORTUNITY = 6;
  private static final int METHODID_GET_LEARNING_OPPORTUNITY = 7;

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
        case METHODID_LIST_AGENT_LEARNING_OPPORTUNITIES:
          serviceImpl.listAgentLearningOpportunities((com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_AGENT_LEARNING_OPPORTUNITY:
          serviceImpl.completeAgentLearningOpportunity((com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse>) responseObserver);
          break;
        case METHODID_LIST_DASHBOARDS:
          serviceImpl.listDashboards((com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LEARNING_OPPORTUNITY:
          serviceImpl.updateLearningOpportunity((com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse>) responseObserver);
          break;
        case METHODID_DELETE_LEARNING_OPPORTUNITY:
          serviceImpl.deleteLearningOpportunity((com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>) responseObserver);
          break;
        case METHODID_GET_LEARNING_OPPORTUNITY:
          serviceImpl.getLearningOpportunity((com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse>) responseObserver);
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
        .addMethod(
          getListAgentLearningOpportunitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse>(
                service, METHODID_LIST_AGENT_LEARNING_OPPORTUNITIES)))
        .addMethod(
          getCompleteAgentLearningOpportunityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityResponse>(
                service, METHODID_COMPLETE_AGENT_LEARNING_OPPORTUNITY)))
        .addMethod(
          getListDashboardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.ListDashboardsResponse>(
                service, METHODID_LIST_DASHBOARDS)))
        .addMethod(
          getUpdateLearningOpportunityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse>(
                service, METHODID_UPDATE_LEARNING_OPPORTUNITY)))
        .addMethod(
          getDeleteLearningOpportunityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.DeleteLearningOpportunityResponse>(
                service, METHODID_DELETE_LEARNING_OPPORTUNITY)))
        .addMethod(
          getGetLearningOpportunityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityRequest,
              com.tcn.cloud.api.api.v1alpha1.agenttraining.GetLearningOpportunityResponse>(
                service, METHODID_GET_LEARNING_OPPORTUNITY)))
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
              .addMethod(getListAgentLearningOpportunitiesMethod())
              .addMethod(getCompleteAgentLearningOpportunityMethod())
              .addMethod(getListDashboardsMethod())
              .addMethod(getUpdateLearningOpportunityMethod())
              .addMethod(getDeleteLearningOpportunityMethod())
              .addMethod(getGetLearningOpportunityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
