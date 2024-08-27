package com.tcn.cloud.api.services.org.organizations.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * OrganizationsService is the service for managing organizations and their related entities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/organizations/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrganizationsServiceGrpc {

  private OrganizationsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.organizations.v1alpha1.OrganizationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> getGetOrganizationLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganizationLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> getGetOrganizationLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest, com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> getGetOrganizationLocalePreferencesMethod;
    if ((getGetOrganizationLocalePreferencesMethod = OrganizationsServiceGrpc.getGetOrganizationLocalePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getGetOrganizationLocalePreferencesMethod = OrganizationsServiceGrpc.getGetOrganizationLocalePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getGetOrganizationLocalePreferencesMethod = getGetOrganizationLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest, com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganizationLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("GetOrganizationLocalePreferences"))
              .build();
        }
      }
    }
    return getGetOrganizationLocalePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> getUpdateOrganizationLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganizationLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> getUpdateOrganizationLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest, com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> getUpdateOrganizationLocalePreferencesMethod;
    if ((getUpdateOrganizationLocalePreferencesMethod = OrganizationsServiceGrpc.getUpdateOrganizationLocalePreferencesMethod) == null) {
      synchronized (OrganizationsServiceGrpc.class) {
        if ((getUpdateOrganizationLocalePreferencesMethod = OrganizationsServiceGrpc.getUpdateOrganizationLocalePreferencesMethod) == null) {
          OrganizationsServiceGrpc.getUpdateOrganizationLocalePreferencesMethod = getUpdateOrganizationLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest, com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganizationLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrganizationsServiceMethodDescriptorSupplier("UpdateOrganizationLocalePreferences"))
              .build();
        }
      }
    }
    return getUpdateOrganizationLocalePreferencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrganizationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceStub>() {
        @java.lang.Override
        public OrganizationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceStub(channel, callOptions);
        }
      };
    return OrganizationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrganizationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceBlockingStub>() {
        @java.lang.Override
        public OrganizationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceBlockingStub(channel, callOptions);
        }
      };
    return OrganizationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrganizationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrganizationsServiceFutureStub>() {
        @java.lang.Override
        public OrganizationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrganizationsServiceFutureStub(channel, callOptions);
        }
      };
    return OrganizationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * OrganizationsService is the service for managing organizations and their related entities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetOrganizationLocalePreferences retrieves an organization's locale preferences.
     * </pre>
     */
    default void getOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationLocalePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationLocalePreferences updates an organization's locale preferences.
     * </pre>
     */
    default void updateOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateOrganizationLocalePreferencesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrganizationsService.
   * <pre>
   * OrganizationsService is the service for managing organizations and their related entities.
   * </pre>
   */
  public static abstract class OrganizationsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrganizationsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrganizationsService.
   * <pre>
   * OrganizationsService is the service for managing organizations and their related entities.
   * </pre>
   */
  public static final class OrganizationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrganizationsServiceStub> {
    private OrganizationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetOrganizationLocalePreferences retrieves an organization's locale preferences.
     * </pre>
     */
    public void getOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateOrganizationLocalePreferences updates an organization's locale preferences.
     * </pre>
     */
    public void updateOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrganizationsService.
   * <pre>
   * OrganizationsService is the service for managing organizations and their related entities.
   * </pre>
   */
  public static final class OrganizationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrganizationsServiceBlockingStub> {
    private OrganizationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetOrganizationLocalePreferences retrieves an organization's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse getOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationLocalePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateOrganizationLocalePreferences updates an organization's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse updateOrganizationLocalePreferences(com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateOrganizationLocalePreferencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrganizationsService.
   * <pre>
   * OrganizationsService is the service for managing organizations and their related entities.
   * </pre>
   */
  public static final class OrganizationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrganizationsServiceFutureStub> {
    private OrganizationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrganizationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrganizationsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetOrganizationLocalePreferences retrieves an organization's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse> getOrganizationLocalePreferences(
        com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationLocalePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateOrganizationLocalePreferences updates an organization's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse> updateOrganizationLocalePreferences(
        com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationLocalePreferencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORGANIZATION_LOCALE_PREFERENCES = 0;
  private static final int METHODID_UPDATE_ORGANIZATION_LOCALE_PREFERENCES = 1;

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
        case METHODID_GET_ORGANIZATION_LOCALE_PREFERENCES:
          serviceImpl.getOrganizationLocalePreferences((com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION_LOCALE_PREFERENCES:
          serviceImpl.updateOrganizationLocalePreferences((com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse>) responseObserver);
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
          getGetOrganizationLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.organizations.v1alpha1.GetOrganizationLocalePreferencesResponse>(
                service, METHODID_GET_ORGANIZATION_LOCALE_PREFERENCES)))
        .addMethod(
          getUpdateOrganizationLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.organizations.v1alpha1.UpdateOrganizationLocalePreferencesResponse>(
                service, METHODID_UPDATE_ORGANIZATION_LOCALE_PREFERENCES)))
        .build();
  }

  private static abstract class OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrganizationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.organizations.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrganizationsService");
    }
  }

  private static final class OrganizationsServiceFileDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier {
    OrganizationsServiceFileDescriptorSupplier() {}
  }

  private static final class OrganizationsServiceMethodDescriptorSupplier
      extends OrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrganizationsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrganizationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrganizationsServiceFileDescriptorSupplier())
              .addMethod(getGetOrganizationLocalePreferencesMethod())
              .addMethod(getUpdateOrganizationLocalePreferencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
