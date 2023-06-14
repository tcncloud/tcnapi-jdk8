package com.tcn.cloud.api.api.v1alpha1.org.legacy;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/org/legacy/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrgLegacyGrpc {

  private OrgLegacyGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.org.legacy.OrgLegacy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> getRegisterOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterOrganization",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> getRegisterOrganizationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> getRegisterOrganizationMethod;
    if ((getRegisterOrganizationMethod = OrgLegacyGrpc.getRegisterOrganizationMethod) == null) {
      synchronized (OrgLegacyGrpc.class) {
        if ((getRegisterOrganizationMethod = OrgLegacyGrpc.getRegisterOrganizationMethod) == null) {
          OrgLegacyGrpc.getRegisterOrganizationMethod = getRegisterOrganizationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest, com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrgLegacyMethodDescriptorSupplier("RegisterOrganization"))
              .build();
        }
      }
    }
    return getRegisterOrganizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrgLegacyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgLegacyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgLegacyStub>() {
        @java.lang.Override
        public OrgLegacyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgLegacyStub(channel, callOptions);
        }
      };
    return OrgLegacyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrgLegacyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgLegacyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgLegacyBlockingStub>() {
        @java.lang.Override
        public OrgLegacyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgLegacyBlockingStub(channel, callOptions);
        }
      };
    return OrgLegacyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrgLegacyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrgLegacyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrgLegacyFutureStub>() {
        @java.lang.Override
        public OrgLegacyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrgLegacyFutureStub(channel, callOptions);
        }
      };
    return OrgLegacyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    default void registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterOrganizationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrgLegacy.
   */
  public static abstract class OrgLegacyImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrgLegacyGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrgLegacy.
   */
  public static final class OrgLegacyStub
      extends io.grpc.stub.AbstractAsyncStub<OrgLegacyStub> {
    private OrgLegacyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgLegacyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public void registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrgLegacy.
   */
  public static final class OrgLegacyBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrgLegacyBlockingStub> {
    private OrgLegacyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgLegacyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterOrganizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrgLegacy.
   */
  public static final class OrgLegacyFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrgLegacyFutureStub> {
    private OrgLegacyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrgLegacyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> registerOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORGANIZATION = 0;

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
        case METHODID_REGISTER_ORGANIZATION:
          serviceImpl.registerOrganization((com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse>) responseObserver);
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
          getRegisterOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse>(
                service, METHODID_REGISTER_ORGANIZATION)))
        .build();
  }

  private static abstract class OrgLegacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrgLegacyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrgLegacy");
    }
  }

  private static final class OrgLegacyFileDescriptorSupplier
      extends OrgLegacyBaseDescriptorSupplier {
    OrgLegacyFileDescriptorSupplier() {}
  }

  private static final class OrgLegacyMethodDescriptorSupplier
      extends OrgLegacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrgLegacyMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrgLegacyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrgLegacyFileDescriptorSupplier())
              .addMethod(getRegisterOrganizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
