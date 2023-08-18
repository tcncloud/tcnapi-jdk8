package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: api/v0alpha/cfg.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CfgGrpc {

  private CfgGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v0alpha.Cfg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConfigReq,
      com.tcn.cloud.api.api.v0alpha.WebAgent> getGetWebAgentConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWebAgentConfig",
      requestType = com.tcn.cloud.api.api.v0alpha.GetConfigReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.WebAgent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConfigReq,
      com.tcn.cloud.api.api.v0alpha.WebAgent> getGetWebAgentConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.GetConfigReq, com.tcn.cloud.api.api.v0alpha.WebAgent> getGetWebAgentConfigMethod;
    if ((getGetWebAgentConfigMethod = CfgGrpc.getGetWebAgentConfigMethod) == null) {
      synchronized (CfgGrpc.class) {
        if ((getGetWebAgentConfigMethod = CfgGrpc.getGetWebAgentConfigMethod) == null) {
          CfgGrpc.getGetWebAgentConfigMethod = getGetWebAgentConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.GetConfigReq, com.tcn.cloud.api.api.v0alpha.WebAgent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWebAgentConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.GetConfigReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.WebAgent.getDefaultInstance()))
              .setSchemaDescriptor(new CfgMethodDescriptorSupplier("GetWebAgentConfig"))
              .build();
        }
      }
    }
    return getGetWebAgentConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CfgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CfgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CfgStub>() {
        @java.lang.Override
        public CfgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CfgStub(channel, callOptions);
        }
      };
    return CfgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CfgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CfgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CfgBlockingStub>() {
        @java.lang.Override
        public CfgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CfgBlockingStub(channel, callOptions);
        }
      };
    return CfgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CfgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CfgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CfgFutureStub>() {
        @java.lang.Override
        public CfgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CfgFutureStub(channel, callOptions);
        }
      };
    return CfgFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getWebAgentConfig(com.tcn.cloud.api.api.v0alpha.GetConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WebAgent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWebAgentConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Cfg.
   */
  public static abstract class CfgImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CfgGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Cfg.
   */
  public static final class CfgStub
      extends io.grpc.stub.AbstractAsyncStub<CfgStub> {
    private CfgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CfgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CfgStub(channel, callOptions);
    }

    /**
     */
    public void getWebAgentConfig(com.tcn.cloud.api.api.v0alpha.GetConfigReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WebAgent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWebAgentConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Cfg.
   */
  public static final class CfgBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CfgBlockingStub> {
    private CfgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CfgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CfgBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v0alpha.WebAgent getWebAgentConfig(com.tcn.cloud.api.api.v0alpha.GetConfigReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWebAgentConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Cfg.
   */
  public static final class CfgFutureStub
      extends io.grpc.stub.AbstractFutureStub<CfgFutureStub> {
    private CfgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CfgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CfgFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.WebAgent> getWebAgentConfig(
        com.tcn.cloud.api.api.v0alpha.GetConfigReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWebAgentConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WEB_AGENT_CONFIG = 0;

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
        case METHODID_GET_WEB_AGENT_CONFIG:
          serviceImpl.getWebAgentConfig((com.tcn.cloud.api.api.v0alpha.GetConfigReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.WebAgent>) responseObserver);
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
          getGetWebAgentConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v0alpha.GetConfigReq,
              com.tcn.cloud.api.api.v0alpha.WebAgent>(
                service, METHODID_GET_WEB_AGENT_CONFIG)))
        .build();
  }

  private static abstract class CfgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CfgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CfgProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cfg");
    }
  }

  private static final class CfgFileDescriptorSupplier
      extends CfgBaseDescriptorSupplier {
    CfgFileDescriptorSupplier() {}
  }

  private static final class CfgMethodDescriptorSupplier
      extends CfgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CfgMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CfgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CfgFileDescriptorSupplier())
              .addMethod(getGetWebAgentConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
