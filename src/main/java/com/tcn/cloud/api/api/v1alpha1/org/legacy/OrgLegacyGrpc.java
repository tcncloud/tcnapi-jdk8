package com.tcn.cloud.api.api.v1alpha1.org.legacy;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/org/legacy/service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.org.legacy.OrgLegacy", "RegisterOrganization"))
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
    return new OrgLegacyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrgLegacyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrgLegacyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrgLegacyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrgLegacyFutureStub(channel);
  }

  /**
   */
  public static abstract class OrgLegacyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public void registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterOrganizationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest,
                com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse>(
                  this, METHODID_REGISTER_ORGANIZATION)))
          .build();
    }
  }

  /**
   */
  public static final class OrgLegacyStub extends io.grpc.stub.AbstractStub<OrgLegacyStub> {
    private OrgLegacyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgLegacyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgLegacyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public void registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrgLegacyBlockingStub extends io.grpc.stub.AbstractStub<OrgLegacyBlockingStub> {
    private OrgLegacyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgLegacyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgLegacyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse registerOrganization(com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterOrganizationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrgLegacyFutureStub extends io.grpc.stub.AbstractStub<OrgLegacyFutureStub> {
    private OrgLegacyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrgLegacyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrgLegacyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrgLegacyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Registers a new organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationResponse> registerOrganization(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.RegisterOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterOrganizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ORGANIZATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrgLegacyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrgLegacyImplBase serviceImpl, int methodId) {
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
