package com.tcn.cloud.api.api.v1alpha1.acd;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * rpc here
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: api/v1alpha1/acd/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AcdApiGrpc {

  private AcdApiGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.acd.AcdApi";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AcdApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdApiStub>() {
        @java.lang.Override
        public AcdApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdApiStub(channel, callOptions);
        }
      };
    return AcdApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AcdApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdApiBlockingStub>() {
        @java.lang.Override
        public AcdApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdApiBlockingStub(channel, callOptions);
        }
      };
    return AcdApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AcdApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AcdApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AcdApiFutureStub>() {
        @java.lang.Override
        public AcdApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AcdApiFutureStub(channel, callOptions);
        }
      };
    return AcdApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * rpc here
   * </pre>
   */
  public interface AsyncService {
  }

  /**
   * Base class for the server implementation of the service AcdApi.
   * <pre>
   * rpc here
   * </pre>
   */
  public static abstract class AcdApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AcdApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AcdApi.
   * <pre>
   * rpc here
   * </pre>
   */
  public static final class AcdApiStub
      extends io.grpc.stub.AbstractAsyncStub<AcdApiStub> {
    private AcdApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdApiStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AcdApi.
   * <pre>
   * rpc here
   * </pre>
   */
  public static final class AcdApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AcdApiBlockingStub> {
    private AcdApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdApiBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AcdApi.
   * <pre>
   * rpc here
   * </pre>
   */
  public static final class AcdApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<AcdApiFutureStub> {
    private AcdApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AcdApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AcdApiFutureStub(channel, callOptions);
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

  private static abstract class AcdApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AcdApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.acd.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AcdApi");
    }
  }

  private static final class AcdApiFileDescriptorSupplier
      extends AcdApiBaseDescriptorSupplier {
    AcdApiFileDescriptorSupplier() {}
  }

  private static final class AcdApiMethodDescriptorSupplier
      extends AcdApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AcdApiMethodDescriptorSupplier(String methodName) {
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
      synchronized (AcdApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AcdApiFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
