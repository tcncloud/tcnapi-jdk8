package com.tcn.cloud.api.services.org.hunt_group.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * HuntGroupService
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/hunt_group/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HuntGroupServiceGrpc {

  private HuntGroupServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.hunt_group.v1alpha1.HuntGroupService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHuntGroupExileLinks",
      requestType = com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> getListHuntGroupExileLinksMethod;
    if ((getListHuntGroupExileLinksMethod = HuntGroupServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
      synchronized (HuntGroupServiceGrpc.class) {
        if ((getListHuntGroupExileLinksMethod = HuntGroupServiceGrpc.getListHuntGroupExileLinksMethod) == null) {
          HuntGroupServiceGrpc.getListHuntGroupExileLinksMethod = getListHuntGroupExileLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHuntGroupExileLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupServiceMethodDescriptorSupplier("ListHuntGroupExileLinks"))
              .build();
        }
      }
    }
    return getListHuntGroupExileLinksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HuntGroupServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceStub>() {
        @java.lang.Override
        public HuntGroupServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupServiceStub(channel, callOptions);
        }
      };
    return HuntGroupServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HuntGroupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceBlockingStub>() {
        @java.lang.Override
        public HuntGroupServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupServiceBlockingStub(channel, callOptions);
        }
      };
    return HuntGroupServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HuntGroupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HuntGroupServiceFutureStub>() {
        @java.lang.Override
        public HuntGroupServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HuntGroupServiceFutureStub(channel, callOptions);
        }
      };
    return HuntGroupServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * HuntGroupService
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupExileLinksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HuntGroupService.
   * <pre>
   * HuntGroupService
   * </pre>
   */
  public static abstract class HuntGroupServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HuntGroupServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HuntGroupService.
   * <pre>
   * HuntGroupService
   * </pre>
   */
  public static final class HuntGroupServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HuntGroupServiceStub> {
    private HuntGroupServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupServiceStub(channel, callOptions);
    }

    /**
     */
    public void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HuntGroupService.
   * <pre>
   * HuntGroupService
   * </pre>
   */
  public static final class HuntGroupServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HuntGroupServiceBlockingStub> {
    private HuntGroupServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupExileLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HuntGroupService.
   * <pre>
   * HuntGroupService
   * </pre>
   */
  public static final class HuntGroupServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HuntGroupServiceFutureStub> {
    private HuntGroupServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HuntGroupServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HuntGroupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse> listHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HUNT_GROUP_EXILE_LINKS = 0;

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
          serviceImpl.listHuntGroupExileLinks((com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse>) responseObserver);
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
              com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksRequest,
              com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ListHuntGroupExileLinksResponse>(
                service, METHODID_LIST_HUNT_GROUP_EXILE_LINKS)))
        .build();
  }

  private static abstract class HuntGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HuntGroupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.hunt_group.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HuntGroupService");
    }
  }

  private static final class HuntGroupServiceFileDescriptorSupplier
      extends HuntGroupServiceBaseDescriptorSupplier {
    HuntGroupServiceFileDescriptorSupplier() {}
  }

  private static final class HuntGroupServiceMethodDescriptorSupplier
      extends HuntGroupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HuntGroupServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HuntGroupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HuntGroupServiceFileDescriptorSupplier())
              .addMethod(getListHuntGroupExileLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
