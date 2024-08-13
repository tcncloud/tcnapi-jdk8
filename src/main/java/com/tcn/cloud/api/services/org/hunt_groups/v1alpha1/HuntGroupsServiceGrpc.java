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

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CopyHuntGroupExileLink",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> getCopyHuntGroupExileLinkMethod;
    if ((getCopyHuntGroupExileLinkMethod = HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getCopyHuntGroupExileLinkMethod = HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod) == null) {
          HuntGroupsServiceGrpc.getCopyHuntGroupExileLinkMethod = getCopyHuntGroupExileLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CopyHuntGroupExileLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("CopyHuntGroupExileLink"))
              .build();
        }
      }
    }
    return getCopyHuntGroupExileLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHuntGroupExileLinks",
      requestType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest.class,
      responseType = com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> getUpdateHuntGroupExileLinksMethod;
    if ((getUpdateHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod) == null) {
      synchronized (HuntGroupsServiceGrpc.class) {
        if ((getUpdateHuntGroupExileLinksMethod = HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod) == null) {
          HuntGroupsServiceGrpc.getUpdateHuntGroupExileLinksMethod = getUpdateHuntGroupExileLinksMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHuntGroupExileLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HuntGroupsServiceMethodDescriptorSupplier("UpdateHuntGroupExileLinks"))
              .build();
        }
      }
    }
    return getUpdateHuntGroupExileLinksMethod;
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
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    default void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHuntGroupExileLinksMethod(), responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    default void copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyHuntGroupExileLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    default void updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHuntGroupExileLinksMethod(), responseObserver);
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
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public void listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public void copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyHuntGroupExileLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public void updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHuntGroupExileLinksMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse listHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHuntGroupExileLinksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse copyHuntGroupExileLink(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyHuntGroupExileLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse updateHuntGroupExileLinks(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHuntGroupExileLinksMethod(), getCallOptions(), request);
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
     * <pre>
     * ListHuntGroupExileLinks returns a list of Exile links for a given hunt group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksResponse> listHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ListHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHuntGroupExileLinksMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CopyHuntGroupExileLink copies an exile link from one hunt group to another.
     * It will create a new exile link in the destination hunt group with the same
     * settings/parameters as the source exile link.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse> copyHuntGroupExileLink(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyHuntGroupExileLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateHuntGroupExileLinks updates the exile links for a hunt group.
     * It will create any new exile links that do not already exist in the hunt group,
     * update any existing exile links with the new settings/parameters, and
     * delete any exile links that are not in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse> updateHuntGroupExileLinks(
        com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHuntGroupExileLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HUNT_GROUP_EXILE_LINKS = 0;
  private static final int METHODID_COPY_HUNT_GROUP_EXILE_LINK = 1;
  private static final int METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS = 2;

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
        case METHODID_COPY_HUNT_GROUP_EXILE_LINK:
          serviceImpl.copyHuntGroupExileLink((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS:
          serviceImpl.updateHuntGroupExileLinks((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>) responseObserver);
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
          getCopyHuntGroupExileLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.CopyHuntGroupExileLinkResponse>(
                service, METHODID_COPY_HUNT_GROUP_EXILE_LINK)))
        .addMethod(
          getUpdateHuntGroupExileLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksRequest,
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.UpdateHuntGroupExileLinksResponse>(
                service, METHODID_UPDATE_HUNT_GROUP_EXILE_LINKS)))
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
              .addMethod(getCopyHuntGroupExileLinkMethod())
              .addMethod(getUpdateHuntGroupExileLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
