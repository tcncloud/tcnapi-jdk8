package com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/omnichannel/tasks/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TasksServiceGrpc {

  private TasksServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.omnichannel.tasks.v1alpha1.TasksService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest,
      com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> getCancelTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTasks",
      requestType = com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest.class,
      responseType = com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest,
      com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> getCancelTasksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest, com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> getCancelTasksMethod;
    if ((getCancelTasksMethod = TasksServiceGrpc.getCancelTasksMethod) == null) {
      synchronized (TasksServiceGrpc.class) {
        if ((getCancelTasksMethod = TasksServiceGrpc.getCancelTasksMethod) == null) {
          TasksServiceGrpc.getCancelTasksMethod = getCancelTasksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest, com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksServiceMethodDescriptorSupplier("CancelTasks"))
              .build();
        }
      }
    }
    return getCancelTasksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest,
      com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> getBulkCancelTasksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkCancelTasks",
      requestType = com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest.class,
      responseType = com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest,
      com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> getBulkCancelTasksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest, com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> getBulkCancelTasksMethod;
    if ((getBulkCancelTasksMethod = TasksServiceGrpc.getBulkCancelTasksMethod) == null) {
      synchronized (TasksServiceGrpc.class) {
        if ((getBulkCancelTasksMethod = TasksServiceGrpc.getBulkCancelTasksMethod) == null) {
          TasksServiceGrpc.getBulkCancelTasksMethod = getBulkCancelTasksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest, com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkCancelTasks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TasksServiceMethodDescriptorSupplier("BulkCancelTasks"))
              .build();
        }
      }
    }
    return getBulkCancelTasksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TasksServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksServiceStub>() {
        @java.lang.Override
        public TasksServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksServiceStub(channel, callOptions);
        }
      };
    return TasksServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TasksServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksServiceBlockingStub>() {
        @java.lang.Override
        public TasksServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksServiceBlockingStub(channel, callOptions);
        }
      };
    return TasksServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TasksServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TasksServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TasksServiceFutureStub>() {
        @java.lang.Override
        public TasksServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TasksServiceFutureStub(channel, callOptions);
        }
      };
    return TasksServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void cancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTasksMethod(), responseObserver);
    }

    /**
     */
    default void bulkCancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkCancelTasksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TasksService.
   */
  public static abstract class TasksServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TasksServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TasksService.
   */
  public static final class TasksServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TasksServiceStub> {
    private TasksServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksServiceStub(channel, callOptions);
    }

    /**
     */
    public void cancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTasksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bulkCancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkCancelTasksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TasksService.
   */
  public static final class TasksServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TasksServiceBlockingStub> {
    private TasksServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse cancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTasksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse bulkCancelTasks(com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkCancelTasksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TasksService.
   */
  public static final class TasksServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TasksServiceFutureStub> {
    private TasksServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TasksServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TasksServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse> cancelTasks(
        com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTasksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse> bulkCancelTasks(
        com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkCancelTasksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCEL_TASKS = 0;
  private static final int METHODID_BULK_CANCEL_TASKS = 1;

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
        case METHODID_CANCEL_TASKS:
          serviceImpl.cancelTasks((com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse>) responseObserver);
          break;
        case METHODID_BULK_CANCEL_TASKS:
          serviceImpl.bulkCancelTasks((com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse>) responseObserver);
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
          getCancelTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksRequest,
              com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.CancelTasksResponse>(
                service, METHODID_CANCEL_TASKS)))
        .addMethod(
          getBulkCancelTasksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksRequest,
              com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.BulkCancelTasksResponse>(
                service, METHODID_BULK_CANCEL_TASKS)))
        .build();
  }

  private static abstract class TasksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TasksServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TasksService");
    }
  }

  private static final class TasksServiceFileDescriptorSupplier
      extends TasksServiceBaseDescriptorSupplier {
    TasksServiceFileDescriptorSupplier() {}
  }

  private static final class TasksServiceMethodDescriptorSupplier
      extends TasksServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TasksServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TasksServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TasksServiceFileDescriptorSupplier())
              .addMethod(getCancelTasksMethod())
              .addMethod(getBulkCancelTasksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
