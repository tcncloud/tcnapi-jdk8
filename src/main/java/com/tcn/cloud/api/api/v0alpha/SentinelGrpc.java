package com.tcn.cloud.api.api.v0alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * A service for internal observability utilities.
 * service UIEventLogging {
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v0alpha/sentinel.proto")
public final class SentinelGrpc {

  private SentinelGrpc() {}

  public static final String SERVICE_NAME = "api.v0alpha.Sentinel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEventsReq,
      com.tcn.cloud.api.api.v0alpha.SendEventsRes> getSendEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEvents",
      requestType = com.tcn.cloud.api.api.v0alpha.SendEventsReq.class,
      responseType = com.tcn.cloud.api.api.v0alpha.SendEventsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEventsReq,
      com.tcn.cloud.api.api.v0alpha.SendEventsRes> getSendEventsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v0alpha.SendEventsReq, com.tcn.cloud.api.api.v0alpha.SendEventsRes> getSendEventsMethod;
    if ((getSendEventsMethod = SentinelGrpc.getSendEventsMethod) == null) {
      synchronized (SentinelGrpc.class) {
        if ((getSendEventsMethod = SentinelGrpc.getSendEventsMethod) == null) {
          SentinelGrpc.getSendEventsMethod = getSendEventsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v0alpha.SendEventsReq, com.tcn.cloud.api.api.v0alpha.SendEventsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v0alpha.Sentinel", "SendEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendEventsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v0alpha.SendEventsRes.getDefaultInstance()))
                  .setSchemaDescriptor(new SentinelMethodDescriptorSupplier("SendEvents"))
                  .build();
          }
        }
     }
     return getSendEventsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SentinelStub newStub(io.grpc.Channel channel) {
    return new SentinelStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SentinelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SentinelBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SentinelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SentinelFutureStub(channel);
  }

  /**
   * <pre>
   * A service for internal observability utilities.
   * service UIEventLogging {
   * </pre>
   */
  public static abstract class SentinelImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public void sendEvents(com.tcn.cloud.api.api.v0alpha.SendEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEventsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEventsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v0alpha.SendEventsReq,
                com.tcn.cloud.api.api.v0alpha.SendEventsRes>(
                  this, METHODID_SEND_EVENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * A service for internal observability utilities.
   * service UIEventLogging {
   * </pre>
   */
  public static final class SentinelStub extends io.grpc.stub.AbstractStub<SentinelStub> {
    private SentinelStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SentinelStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SentinelStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public void sendEvents(com.tcn.cloud.api.api.v0alpha.SendEventsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEventsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEventsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * A service for internal observability utilities.
   * service UIEventLogging {
   * </pre>
   */
  public static final class SentinelBlockingStub extends io.grpc.stub.AbstractStub<SentinelBlockingStub> {
    private SentinelBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SentinelBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SentinelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public com.tcn.cloud.api.api.v0alpha.SendEventsRes sendEvents(com.tcn.cloud.api.api.v0alpha.SendEventsReq request) {
      return blockingUnaryCall(
          getChannel(), getSendEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * A service for internal observability utilities.
   * service UIEventLogging {
   * </pre>
   */
  public static final class SentinelFutureStub extends io.grpc.stub.AbstractStub<SentinelFutureStub> {
    private SentinelFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SentinelFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SentinelFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SentinelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a json blob of ui events and logs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v0alpha.SendEventsRes> sendEvents(
        com.tcn.cloud.api.api.v0alpha.SendEventsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EVENTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SentinelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SentinelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EVENTS:
          serviceImpl.sendEvents((com.tcn.cloud.api.api.v0alpha.SendEventsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v0alpha.SendEventsRes>) responseObserver);
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

  private static abstract class SentinelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SentinelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SentinelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sentinel");
    }
  }

  private static final class SentinelFileDescriptorSupplier
      extends SentinelBaseDescriptorSupplier {
    SentinelFileDescriptorSupplier() {}
  }

  private static final class SentinelMethodDescriptorSupplier
      extends SentinelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SentinelMethodDescriptorSupplier(String methodName) {
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
      synchronized (SentinelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SentinelFileDescriptorSupplier())
              .addMethod(getSendEventsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
