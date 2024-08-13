package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HuntGroupsService
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/hunt_groups/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HuntGroupsServiceGrpc {

  private HuntGroupsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.hunt_groups.v1alpha1.HuntGroupsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupExileLinks",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;
    if ((getListHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
          HuntGroupsServiceGrpc.getListHuntGroupExileLinksMethod = getListHuntGroupExileLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHuntGroupExileLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListHuntGroupExileLinks"))
              .build();
        }
      }
    }
    return getListHuntGroupExileLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupAgentTriggers",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> getListHuntGroupAgentTriggersMethod;
    if ((getListHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getListHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod) == null) {
          HuntGroupsServiceGrpc.getListHuntGroupAgentTriggersMethod = getListHuntGroupAgentTriggersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHuntGroupAgentTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("ListHuntGroupAgentTriggers"))
              .build();
        }
      }
    }
    return getListHuntGroupAgentTriggersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyHuntGroupAgentTrigger",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> getCopyHuntGroupAgentTriggerMethod;
    if ((getCopyHuntGroupAgentTriggerMethod = HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCopyHuntGroupAgentTriggerMethod = HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod) == null) {
          HuntGroupsServiceGrpc.getCopyHuntGroupAgentTriggerMethod = getCopyHuntGroupAgentTriggerMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyHuntGroupAgentTrigger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CopyHuntGroupAgentTrigger"))
              .build();
        }
      }
    }
    return getCopyHuntGroupAgentTriggerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHuntGroupAgentTriggers",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> getUpdateHuntGroupAgentTriggersMethod;
    if ((getUpdateHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUpdateHuntGroupAgentTriggersMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod) == null) {
          HuntGroupsServiceGrpc.getUpdateHuntGroupAgentTriggersMethod = getUpdateHuntGroupAgentTriggersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHuntGroupAgentTriggers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UpdateHuntGroupAgentTriggers"))
              .build();
        }
      }
    }
    return getUpdateHuntGroupAgentTriggersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HuntGroupsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceStub>() {
        @java.lang.Override
        public HuntGroupsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HuntGroupsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceBlockingStub>() {
        @java.lang.Override
        public HuntGroupsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceBlockingStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HuntGroupsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupsServiceFutureStub>() {
        @java.lang.Override
        public HuntGroupsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupsServiceFutureStub(channel, callOptions);
        }
      };
    return HuntGroupsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HuntGroupsService
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupExileLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    default void listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupAgentTriggersMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    default void copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyHuntGroupAgentTriggerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    default void updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHuntGroupAgentTriggersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HuntGroupsService.
   * <pre>
   * HuntGroupsService
   * </pre>
   */
  public static abstract class HuntGroupsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HuntGroupsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService
   * </pre>
   */
  public static final class HuntGroupsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HuntGroupsServiceStub> {
    private HuntGroupsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceStub(channel, callOptions);
    }

    /**
     */
    public void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public void listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupAgentTriggersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public void copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyHuntGroupAgentTriggerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public void updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHuntGroupAgentTriggersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService
   * </pre>
   */
  public static final class HuntGroupsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HuntGroupsServiceBlockingStub> {
    private HuntGroupsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupExileLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse listHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupAgentTriggersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse copyHuntGroupAgentTrigger(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyHuntGroupAgentTriggerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse updateHuntGroupAgentTriggers(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHuntGroupAgentTriggersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HuntGroupsService.
   * <pre>
   * HuntGroupsService
   * </pre>
   */
  public static final class HuntGroupsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HuntGroupsServiceFutureStub> {
    private HuntGroupsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> listHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListHuntGroupAgentTriggers returns a list of agent triggers for the given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse> listHuntGroupAgentTriggers(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupAgentTriggersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CopyHuntGroupAgentTrigger copys an agent trigger to the given hunt group in the same org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse> copyHuntGroupAgentTrigger(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyHuntGroupAgentTriggerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupAgentTriggers updates all agent triggers for the given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse> updateHuntGroupAgentTriggers(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHuntGroupAgentTriggersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HUNT_GROUP_EXILE_LINKS = 0;
  private static final int METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS = 1;
  private static final int METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER = 2;
  private static final int METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS = 3;

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
        case METHODID_LIST_HUNT_GROUP_EXILE_LINKS:
          serviceImpl.listHuntGroupExileLinks((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>) responseObserver);
          break;
        case METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS:
          serviceImpl.listHuntGroupAgentTriggers((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>) responseObserver);
          break;
        case METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER:
          serviceImpl.copyHuntGroupAgentTrigger((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS:
          serviceImpl.updateHuntGroupAgentTriggers((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>) responseObserver);
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
          getListHuntGroupExileLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse>(
                service, METHODID_LIST_HUNT_GROUP_EXILE_LINKS)))
        .addMethod(
          getListHuntGroupAgentTriggersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupAgentTriggersResponse>(
                service, METHODID_LIST_HUNT_GROUP_AGENT_TRIGGERS)))
        .addMethod(
          getCopyHuntGroupAgentTriggerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupAgentTriggerResponse>(
                service, METHODID_COPY_HUNT_GROUP_AGENT_TRIGGER)))
        .addMethod(
          getUpdateHuntGroupAgentTriggersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupAgentTriggersResponse>(
                service, METHODID_UPDATE_HUNT_GROUP_AGENT_TRIGGERS)))
        .build();
  }

  private static abstract class HuntGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HuntGroupsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HuntGroupsService");
    }
  }

  private static final class HuntGroupsServiceFileDescriptorSupplier
      extends HuntGroupsServiceBaseDescriptorSupplier {
    HuntGroupsServiceFileDescriptorSupplier() {}
  }

  private static final class HuntGroupsServiceMethodDescriptorSupplier
      extends HuntGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HuntGroupsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HuntGroupsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HuntGroupsServiceFileDescriptorSupplier())
              .addMethod(getListHuntGroupExileLinksMethod())
              .addMethod(getListHuntGroupAgentTriggersMethod())
              .addMethod(getCopyHuntGroupAgentTriggerMethod())
              .addMethod(getUpdateHuntGroupAgentTriggersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
