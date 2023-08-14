package com.tcn.cloud.api.api.v1alpha1.idp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/idp/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IdentityProviderServiceGrpc {

  private IdentityProviderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.idp.IdentityProviderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> getCreateAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;
    if ((getCreateAuthConnectionMethod = IdentityProviderServiceGrpc.getCreateAuthConnectionMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getCreateAuthConnectionMethod = IdentityProviderServiceGrpc.getCreateAuthConnectionMethod) == null) {
          IdentityProviderServiceGrpc.getCreateAuthConnectionMethod = getCreateAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("CreateAuthConnection"))
              .build();
        }
      }
    }
    return getCreateAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthConnectionSettings",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;
    if ((getGetAuthConnectionSettingsMethod = IdentityProviderServiceGrpc.getGetAuthConnectionSettingsMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getGetAuthConnectionSettingsMethod = IdentityProviderServiceGrpc.getGetAuthConnectionSettingsMethod) == null) {
          IdentityProviderServiceGrpc.getGetAuthConnectionSettingsMethod = getGetAuthConnectionSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnectionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("GetAuthConnectionSettings"))
              .build();
        }
      }
    }
    return getGetAuthConnectionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> getGetAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> getGetAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> getGetAuthConnectionMethod;
    if ((getGetAuthConnectionMethod = IdentityProviderServiceGrpc.getGetAuthConnectionMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getGetAuthConnectionMethod = IdentityProviderServiceGrpc.getGetAuthConnectionMethod) == null) {
          IdentityProviderServiceGrpc.getGetAuthConnectionMethod = getGetAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("GetAuthConnection"))
              .build();
        }
      }
    }
    return getGetAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;
    if ((getDeleteAuthConnectionMethod = IdentityProviderServiceGrpc.getDeleteAuthConnectionMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getDeleteAuthConnectionMethod = IdentityProviderServiceGrpc.getDeleteAuthConnectionMethod) == null) {
          IdentityProviderServiceGrpc.getDeleteAuthConnectionMethod = getDeleteAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("DeleteAuthConnection"))
              .build();
        }
      }
    }
    return getDeleteAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthConnectionSecret",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest, com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod;
    if ((getUpdateAuthConnectionSecretMethod = IdentityProviderServiceGrpc.getUpdateAuthConnectionSecretMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getUpdateAuthConnectionSecretMethod = IdentityProviderServiceGrpc.getUpdateAuthConnectionSecretMethod) == null) {
          IdentityProviderServiceGrpc.getUpdateAuthConnectionSecretMethod = getUpdateAuthConnectionSecretMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest, com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("UpdateAuthConnectionSecret"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthConnectionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod;
    if ((getUpdateAuthConnectionGroupsMethod = IdentityProviderServiceGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
      synchronized (IdentityProviderServiceGrpc.class) {
        if ((getUpdateAuthConnectionGroupsMethod = IdentityProviderServiceGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
          IdentityProviderServiceGrpc.getUpdateAuthConnectionGroupsMethod = getUpdateAuthConnectionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IdentityProviderServiceMethodDescriptorSupplier("UpdateAuthConnectionGroups"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityProviderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceStub>() {
        @java.lang.Override
        public IdentityProviderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityProviderServiceStub(channel, callOptions);
        }
      };
    return IdentityProviderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityProviderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceBlockingStub>() {
        @java.lang.Override
        public IdentityProviderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityProviderServiceBlockingStub(channel, callOptions);
        }
      };
    return IdentityProviderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityProviderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IdentityProviderServiceFutureStub>() {
        @java.lang.Override
        public IdentityProviderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IdentityProviderServiceFutureStub(channel, callOptions);
        }
      };
    return IdentityProviderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    default void createAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    default void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    default void getAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    default void deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    default void updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthConnectionSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    default void updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthConnectionGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IdentityProviderService.
   */
  public static abstract class IdentityProviderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IdentityProviderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IdentityProviderService.
   */
  public static final class IdentityProviderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<IdentityProviderServiceStub> {
    private IdentityProviderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityProviderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityProviderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public void createAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public void getAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public void deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public void updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public void updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IdentityProviderService.
   */
  public static final class IdentityProviderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IdentityProviderServiceBlockingStub> {
    private IdentityProviderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityProviderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityProviderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse createAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse getAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthConnectionSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthConnectionGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IdentityProviderService.
   */
  public static final class IdentityProviderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<IdentityProviderServiceFutureStub> {
    private IdentityProviderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityProviderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IdentityProviderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse> createAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse> getAuthConnectionSettings(
        com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse> getAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse> deleteAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse> updateAuthConnectionSecret(
        com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse> updateAuthConnectionGroups(
        com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionGroupsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AUTH_CONNECTION = 0;
  private static final int METHODID_GET_AUTH_CONNECTION_SETTINGS = 1;
  private static final int METHODID_GET_AUTH_CONNECTION = 2;
  private static final int METHODID_DELETE_AUTH_CONNECTION = 3;
  private static final int METHODID_UPDATE_AUTH_CONNECTION_SECRET = 4;
  private static final int METHODID_UPDATE_AUTH_CONNECTION_GROUPS = 5;

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
        case METHODID_CREATE_AUTH_CONNECTION:
          serviceImpl.createAuthConnection((com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_CONNECTION_SETTINGS:
          serviceImpl.getAuthConnectionSettings((com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_CONNECTION:
          serviceImpl.getAuthConnection((com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_CONNECTION:
          serviceImpl.deleteAuthConnection((com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_CONNECTION_SECRET:
          serviceImpl.updateAuthConnectionSecret((com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_CONNECTION_GROUPS:
          serviceImpl.updateAuthConnectionGroups((com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse>) responseObserver);
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
          getCreateAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.CreateAuthConnectionResponse>(
                service, METHODID_CREATE_AUTH_CONNECTION)))
        .addMethod(
          getGetAuthConnectionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionSettingsResponse>(
                service, METHODID_GET_AUTH_CONNECTION_SETTINGS)))
        .addMethod(
          getGetAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.GetAuthConnectionResponse>(
                service, METHODID_GET_AUTH_CONNECTION)))
        .addMethod(
          getDeleteAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.DeleteAuthConnectionResponse>(
                service, METHODID_DELETE_AUTH_CONNECTION)))
        .addMethod(
          getUpdateAuthConnectionSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionSecretResponse>(
                service, METHODID_UPDATE_AUTH_CONNECTION_SECRET)))
        .addMethod(
          getUpdateAuthConnectionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.idp.UpdateAuthConnectionGroupsResponse>(
                service, METHODID_UPDATE_AUTH_CONNECTION_GROUPS)))
        .build();
  }

  private static abstract class IdentityProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityProviderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.idp.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityProviderService");
    }
  }

  private static final class IdentityProviderServiceFileDescriptorSupplier
      extends IdentityProviderServiceBaseDescriptorSupplier {
    IdentityProviderServiceFileDescriptorSupplier() {}
  }

  private static final class IdentityProviderServiceMethodDescriptorSupplier
      extends IdentityProviderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IdentityProviderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IdentityProviderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityProviderServiceFileDescriptorSupplier())
              .addMethod(getCreateAuthConnectionMethod())
              .addMethod(getGetAuthConnectionSettingsMethod())
              .addMethod(getGetAuthConnectionMethod())
              .addMethod(getDeleteAuthConnectionMethod())
              .addMethod(getUpdateAuthConnectionSecretMethod())
              .addMethod(getUpdateAuthConnectionGroupsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
