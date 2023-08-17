package com.tcn.cloud.api.api.v1alpha1.vmds;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: api/v1alpha1/vmds/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VmdsServiceGrpc {

  private VmdsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.vmds.VmdsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest,
      com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> getDownloadSpecifiedMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadSpecifiedMessages",
      requestType = com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest,
      com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> getDownloadSpecifiedMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest, com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> getDownloadSpecifiedMessagesMethod;
    if ((getDownloadSpecifiedMessagesMethod = VmdsServiceGrpc.getDownloadSpecifiedMessagesMethod) == null) {
      synchronized (VmdsServiceGrpc.class) {
        if ((getDownloadSpecifiedMessagesMethod = VmdsServiceGrpc.getDownloadSpecifiedMessagesMethod) == null) {
          VmdsServiceGrpc.getDownloadSpecifiedMessagesMethod = getDownloadSpecifiedMessagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest, com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadSpecifiedMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VmdsServiceMethodDescriptorSupplier("DownloadSpecifiedMessages"))
              .build();
        }
      }
    }
    return getDownloadSpecifiedMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VmdsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VmdsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VmdsServiceStub>() {
        @java.lang.Override
        public VmdsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VmdsServiceStub(channel, callOptions);
        }
      };
    return VmdsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VmdsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VmdsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VmdsServiceBlockingStub>() {
        @java.lang.Override
        public VmdsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VmdsServiceBlockingStub(channel, callOptions);
        }
      };
    return VmdsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VmdsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VmdsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VmdsServiceFutureStub>() {
        @java.lang.Override
        public VmdsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VmdsServiceFutureStub(channel, callOptions);
        }
      };
    return VmdsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void downloadSpecifiedMessages(com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadSpecifiedMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VmdsService.
   */
  public static abstract class VmdsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VmdsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VmdsService.
   */
  public static final class VmdsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VmdsServiceStub> {
    private VmdsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VmdsServiceStub(channel, callOptions);
    }

    /**
     */
    public void downloadSpecifiedMessages(com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadSpecifiedMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VmdsService.
   */
  public static final class VmdsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VmdsServiceBlockingStub> {
    private VmdsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VmdsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse downloadSpecifiedMessages(com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadSpecifiedMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VmdsService.
   */
  public static final class VmdsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VmdsServiceFutureStub> {
    private VmdsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VmdsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VmdsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse> downloadSpecifiedMessages(
        com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadSpecifiedMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DOWNLOAD_SPECIFIED_MESSAGES = 0;

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
        case METHODID_DOWNLOAD_SPECIFIED_MESSAGES:
          serviceImpl.downloadSpecifiedMessages((com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse>) responseObserver);
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
          getDownloadSpecifiedMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesRequest,
              com.tcn.cloud.api.api.v1alpha1.vmds.DownloadSpecifiedMessagesResponse>(
                service, METHODID_DOWNLOAD_SPECIFIED_MESSAGES)))
        .build();
  }

  private static abstract class VmdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VmdsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vmds.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VmdsService");
    }
  }

  private static final class VmdsServiceFileDescriptorSupplier
      extends VmdsServiceBaseDescriptorSupplier {
    VmdsServiceFileDescriptorSupplier() {}
  }

  private static final class VmdsServiceMethodDescriptorSupplier
      extends VmdsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VmdsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VmdsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VmdsServiceFileDescriptorSupplier())
              .addMethod(getDownloadSpecifiedMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
