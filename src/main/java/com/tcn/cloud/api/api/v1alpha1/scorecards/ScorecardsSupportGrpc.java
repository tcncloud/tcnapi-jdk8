package com.tcn.cloud.api.api.v1alpha1.scorecards;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ScorecardsSupport provies customer support
 * specific endpoints for Scorecards.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/scorecards/support_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScorecardsSupportGrpc {

  private ScorecardsSupportGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.scorecards.ScorecardsSupport";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvaluationsByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsByOrgIdMethod;
    if ((getListEvaluationsByOrgIdMethod = ScorecardsSupportGrpc.getListEvaluationsByOrgIdMethod) == null) {
      synchronized (ScorecardsSupportGrpc.class) {
        if ((getListEvaluationsByOrgIdMethod = ScorecardsSupportGrpc.getListEvaluationsByOrgIdMethod) == null) {
          ScorecardsSupportGrpc.getListEvaluationsByOrgIdMethod = getListEvaluationsByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvaluationsByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsSupportMethodDescriptorSupplier("ListEvaluationsByOrgId"))
              .build();
        }
      }
    }
    return getListEvaluationsByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAutoEvaluationsByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsByOrgIdMethod;
    if ((getListAutoEvaluationsByOrgIdMethod = ScorecardsSupportGrpc.getListAutoEvaluationsByOrgIdMethod) == null) {
      synchronized (ScorecardsSupportGrpc.class) {
        if ((getListAutoEvaluationsByOrgIdMethod = ScorecardsSupportGrpc.getListAutoEvaluationsByOrgIdMethod) == null) {
          ScorecardsSupportGrpc.getListAutoEvaluationsByOrgIdMethod = getListAutoEvaluationsByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAutoEvaluationsByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsSupportMethodDescriptorSupplier("ListAutoEvaluationsByOrgId"))
              .build();
        }
      }
    }
    return getListAutoEvaluationsByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvaluationByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationByOrgIdMethod;
    if ((getDeleteEvaluationByOrgIdMethod = ScorecardsSupportGrpc.getDeleteEvaluationByOrgIdMethod) == null) {
      synchronized (ScorecardsSupportGrpc.class) {
        if ((getDeleteEvaluationByOrgIdMethod = ScorecardsSupportGrpc.getDeleteEvaluationByOrgIdMethod) == null) {
          ScorecardsSupportGrpc.getDeleteEvaluationByOrgIdMethod = getDeleteEvaluationByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvaluationByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsSupportMethodDescriptorSupplier("DeleteEvaluationByOrgId"))
              .build();
        }
      }
    }
    return getDeleteEvaluationByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAutoEvaluationByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationByOrgIdMethod;
    if ((getDeleteAutoEvaluationByOrgIdMethod = ScorecardsSupportGrpc.getDeleteAutoEvaluationByOrgIdMethod) == null) {
      synchronized (ScorecardsSupportGrpc.class) {
        if ((getDeleteAutoEvaluationByOrgIdMethod = ScorecardsSupportGrpc.getDeleteAutoEvaluationByOrgIdMethod) == null) {
          ScorecardsSupportGrpc.getDeleteAutoEvaluationByOrgIdMethod = getDeleteAutoEvaluationByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAutoEvaluationByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsSupportMethodDescriptorSupplier("DeleteAutoEvaluationByOrgId"))
              .build();
        }
      }
    }
    return getDeleteAutoEvaluationByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScorecardsByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsByOrgIdMethod;
    if ((getListScorecardsByOrgIdMethod = ScorecardsSupportGrpc.getListScorecardsByOrgIdMethod) == null) {
      synchronized (ScorecardsSupportGrpc.class) {
        if ((getListScorecardsByOrgIdMethod = ScorecardsSupportGrpc.getListScorecardsByOrgIdMethod) == null) {
          ScorecardsSupportGrpc.getListScorecardsByOrgIdMethod = getListScorecardsByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScorecardsByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsSupportMethodDescriptorSupplier("ListScorecardsByOrgId"))
              .build();
        }
      }
    }
    return getListScorecardsByOrgIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScorecardsSupportStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportStub>() {
        @java.lang.Override
        public ScorecardsSupportStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsSupportStub(channel, callOptions);
        }
      };
    return ScorecardsSupportStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScorecardsSupportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportBlockingStub>() {
        @java.lang.Override
        public ScorecardsSupportBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsSupportBlockingStub(channel, callOptions);
        }
      };
    return ScorecardsSupportBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScorecardsSupportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsSupportFutureStub>() {
        @java.lang.Override
        public ScorecardsSupportFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsSupportFutureStub(channel, callOptions);
        }
      };
    return ScorecardsSupportFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ScorecardsSupport provies customer support
   * specific endpoints for Scorecards.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListEvaluationsByOrgId gets a list of evaluations by org id
     * </pre>
     */
    default void listEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEvaluationsByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAutoEvaluationsByOrgId gets a list of auto evaluations
     * </pre>
     */
    default void listAutoEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAutoEvaluationsByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluationByOrgId delete an evaluation in a specific org
     * </pre>
     */
    default void deleteEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEvaluationByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoEvaluationByOrgId deletes an auto evaluations
     * </pre>
     */
    default void deleteAutoEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAutoEvaluationByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListScorecardsByOrgId lists scorecards
     * </pre>
     */
    default void listScorecardsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScorecardsByOrgIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ScorecardsSupport.
   * <pre>
   * ScorecardsSupport provies customer support
   * specific endpoints for Scorecards.
   * </pre>
   */
  public static abstract class ScorecardsSupportImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ScorecardsSupportGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ScorecardsSupport.
   * <pre>
   * ScorecardsSupport provies customer support
   * specific endpoints for Scorecards.
   * </pre>
   */
  public static final class ScorecardsSupportStub
      extends io.grpc.stub.AbstractAsyncStub<ScorecardsSupportStub> {
    private ScorecardsSupportStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsSupportStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsSupportStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvaluationsByOrgId gets a list of evaluations by org id
     * </pre>
     */
    public void listEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEvaluationsByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAutoEvaluationsByOrgId gets a list of auto evaluations
     * </pre>
     */
    public void listAutoEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAutoEvaluationsByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluationByOrgId delete an evaluation in a specific org
     * </pre>
     */
    public void deleteEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEvaluationByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoEvaluationByOrgId deletes an auto evaluations
     * </pre>
     */
    public void deleteAutoEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAutoEvaluationByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListScorecardsByOrgId lists scorecards
     * </pre>
     */
    public void listScorecardsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScorecardsByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ScorecardsSupport.
   * <pre>
   * ScorecardsSupport provies customer support
   * specific endpoints for Scorecards.
   * </pre>
   */
  public static final class ScorecardsSupportBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ScorecardsSupportBlockingStub> {
    private ScorecardsSupportBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsSupportBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsSupportBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvaluationsByOrgId gets a list of evaluations by org id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse listEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEvaluationsByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAutoEvaluationsByOrgId gets a list of auto evaluations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse listAutoEvaluationsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAutoEvaluationsByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEvaluationByOrgId delete an evaluation in a specific org
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse deleteEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEvaluationByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAutoEvaluationByOrgId deletes an auto evaluations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse deleteAutoEvaluationByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAutoEvaluationByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListScorecardsByOrgId lists scorecards
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse listScorecardsByOrgId(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScorecardsByOrgIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ScorecardsSupport.
   * <pre>
   * ScorecardsSupport provies customer support
   * specific endpoints for Scorecards.
   * </pre>
   */
  public static final class ScorecardsSupportFutureStub
      extends io.grpc.stub.AbstractFutureStub<ScorecardsSupportFutureStub> {
    private ScorecardsSupportFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsSupportFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsSupportFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvaluationsByOrgId gets a list of evaluations by org id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> listEvaluationsByOrgId(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEvaluationsByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAutoEvaluationsByOrgId gets a list of auto evaluations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> listAutoEvaluationsByOrgId(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAutoEvaluationsByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEvaluationByOrgId delete an evaluation in a specific org
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> deleteEvaluationByOrgId(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEvaluationByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAutoEvaluationByOrgId deletes an auto evaluations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> deleteAutoEvaluationByOrgId(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAutoEvaluationByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListScorecardsByOrgId lists scorecards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> listScorecardsByOrgId(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScorecardsByOrgIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EVALUATIONS_BY_ORG_ID = 0;
  private static final int METHODID_LIST_AUTO_EVALUATIONS_BY_ORG_ID = 1;
  private static final int METHODID_DELETE_EVALUATION_BY_ORG_ID = 2;
  private static final int METHODID_DELETE_AUTO_EVALUATION_BY_ORG_ID = 3;
  private static final int METHODID_LIST_SCORECARDS_BY_ORG_ID = 4;

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
        case METHODID_LIST_EVALUATIONS_BY_ORG_ID:
          serviceImpl.listEvaluationsByOrgId((com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTO_EVALUATIONS_BY_ORG_ID:
          serviceImpl.listAutoEvaluationsByOrgId((com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVALUATION_BY_ORG_ID:
          serviceImpl.deleteEvaluationByOrgId((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTO_EVALUATION_BY_ORG_ID:
          serviceImpl.deleteAutoEvaluationByOrgId((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>) responseObserver);
          break;
        case METHODID_LIST_SCORECARDS_BY_ORG_ID:
          serviceImpl.listScorecardsByOrgId((com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>) responseObserver);
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
          getListEvaluationsByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>(
                service, METHODID_LIST_EVALUATIONS_BY_ORG_ID)))
        .addMethod(
          getListAutoEvaluationsByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>(
                service, METHODID_LIST_AUTO_EVALUATIONS_BY_ORG_ID)))
        .addMethod(
          getDeleteEvaluationByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>(
                service, METHODID_DELETE_EVALUATION_BY_ORG_ID)))
        .addMethod(
          getDeleteAutoEvaluationByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>(
                service, METHODID_DELETE_AUTO_EVALUATION_BY_ORG_ID)))
        .addMethod(
          getListScorecardsByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>(
                service, METHODID_LIST_SCORECARDS_BY_ORG_ID)))
        .build();
  }

  private static abstract class ScorecardsSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScorecardsSupportBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.SupportServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScorecardsSupport");
    }
  }

  private static final class ScorecardsSupportFileDescriptorSupplier
      extends ScorecardsSupportBaseDescriptorSupplier {
    ScorecardsSupportFileDescriptorSupplier() {}
  }

  private static final class ScorecardsSupportMethodDescriptorSupplier
      extends ScorecardsSupportBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ScorecardsSupportMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ScorecardsSupportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScorecardsSupportFileDescriptorSupplier())
              .addMethod(getListEvaluationsByOrgIdMethod())
              .addMethod(getListAutoEvaluationsByOrgIdMethod())
              .addMethod(getDeleteEvaluationByOrgIdMethod())
              .addMethod(getDeleteAutoEvaluationByOrgIdMethod())
              .addMethod(getListScorecardsByOrgIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
