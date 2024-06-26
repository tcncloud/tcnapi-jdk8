package com.tcn.cloud.api.api.v1alpha1.wfm;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The original plan was to use this for public endpoints to wfm-adherence-app,
 * but we ended up putting them in wfm.proto and wfm-api.
 * This should be unused until we remove wfm-api in favor of using individual services.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/wfm/wfm_adherence_app.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WfmAdherenceAppServiceGrpc {

  private WfmAdherenceAppServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.wfm.WfmAdherenceAppService";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WfmAdherenceAppServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceStub>() {
        @java.lang.Override
        public WfmAdherenceAppServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WfmAdherenceAppServiceStub(channel, callOptions);
        }
      };
    return WfmAdherenceAppServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WfmAdherenceAppServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceBlockingStub>() {
        @java.lang.Override
        public WfmAdherenceAppServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WfmAdherenceAppServiceBlockingStub(channel, callOptions);
        }
      };
    return WfmAdherenceAppServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WfmAdherenceAppServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WfmAdherenceAppServiceFutureStub>() {
        @java.lang.Override
        public WfmAdherenceAppServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WfmAdherenceAppServiceFutureStub(channel, callOptions);
        }
      };
    return WfmAdherenceAppServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The original plan was to use this for public endpoints to wfm-adherence-app,
   * but we ended up putting them in wfm.proto and wfm-api.
   * This should be unused until we remove wfm-api in favor of using individual services.
   * </pre>
   */
  public interface AsyncService {
  }

  /**
   * Base class for the server implementation of the service WfmAdherenceAppService.
   * <pre>
   * The original plan was to use this for public endpoints to wfm-adherence-app,
   * but we ended up putting them in wfm.proto and wfm-api.
   * This should be unused until we remove wfm-api in favor of using individual services.
   * </pre>
   */
  public static abstract class WfmAdherenceAppServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WfmAdherenceAppServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WfmAdherenceAppService.
   * <pre>
   * The original plan was to use this for public endpoints to wfm-adherence-app,
   * but we ended up putting them in wfm.proto and wfm-api.
   * This should be unused until we remove wfm-api in favor of using individual services.
   * </pre>
   */
  public static final class WfmAdherenceAppServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WfmAdherenceAppServiceStub> {
    private WfmAdherenceAppServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WfmAdherenceAppServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WfmAdherenceAppServiceStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WfmAdherenceAppService.
   * <pre>
   * The original plan was to use this for public endpoints to wfm-adherence-app,
   * but we ended up putting them in wfm.proto and wfm-api.
   * This should be unused until we remove wfm-api in favor of using individual services.
   * </pre>
   */
  public static final class WfmAdherenceAppServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WfmAdherenceAppServiceBlockingStub> {
    private WfmAdherenceAppServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WfmAdherenceAppServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WfmAdherenceAppServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WfmAdherenceAppService.
   * <pre>
   * The original plan was to use this for public endpoints to wfm-adherence-app,
   * but we ended up putting them in wfm.proto and wfm-api.
   * This should be unused until we remove wfm-api in favor of using individual services.
   * </pre>
   */
  public static final class WfmAdherenceAppServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WfmAdherenceAppServiceFutureStub> {
    private WfmAdherenceAppServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WfmAdherenceAppServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WfmAdherenceAppServiceFutureStub(channel, callOptions);
    }
  }


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
        .build();
  }

  private static abstract class WfmAdherenceAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WfmAdherenceAppServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmAdherenceAppProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WfmAdherenceAppService");
    }
  }

  private static final class WfmAdherenceAppServiceFileDescriptorSupplier
      extends WfmAdherenceAppServiceBaseDescriptorSupplier {
    WfmAdherenceAppServiceFileDescriptorSupplier() {}
  }

  private static final class WfmAdherenceAppServiceMethodDescriptorSupplier
      extends WfmAdherenceAppServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WfmAdherenceAppServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WfmAdherenceAppServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WfmAdherenceAppServiceFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
