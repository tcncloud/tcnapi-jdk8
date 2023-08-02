package com.tcn.cloud.api.api.v1alpha1.org.authconnection;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: api/v1alpha1/org/authconnection/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthConnectionServiceGrpc {

  private AuthConnectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.authconnection.AuthConnectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> getCreateAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> getCreateAuthConnectionMethod;
    if ((getCreateAuthConnectionMethod = AuthConnectionServiceGrpc.getCreateAuthConnectionMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getCreateAuthConnectionMethod = AuthConnectionServiceGrpc.getCreateAuthConnectionMethod) == null) {
          AuthConnectionServiceGrpc.getCreateAuthConnectionMethod = getCreateAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("CreateAuthConnection"))
              .build();
        }
      }
    }
    return getCreateAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthConnectionSettings",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> getGetAuthConnectionSettingsMethod;
    if ((getGetAuthConnectionSettingsMethod = AuthConnectionServiceGrpc.getGetAuthConnectionSettingsMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getGetAuthConnectionSettingsMethod = AuthConnectionServiceGrpc.getGetAuthConnectionSettingsMethod) == null) {
          AuthConnectionServiceGrpc.getGetAuthConnectionSettingsMethod = getGetAuthConnectionSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnectionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("GetAuthConnectionSettings"))
              .build();
        }
      }
    }
    return getGetAuthConnectionSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> getGetAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> getGetAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> getGetAuthConnectionMethod;
    if ((getGetAuthConnectionMethod = AuthConnectionServiceGrpc.getGetAuthConnectionMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getGetAuthConnectionMethod = AuthConnectionServiceGrpc.getGetAuthConnectionMethod) == null) {
          AuthConnectionServiceGrpc.getGetAuthConnectionMethod = getGetAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("GetAuthConnection"))
              .build();
        }
      }
    }
    return getGetAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthConnection",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> getDeleteAuthConnectionMethod;
    if ((getDeleteAuthConnectionMethod = AuthConnectionServiceGrpc.getDeleteAuthConnectionMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getDeleteAuthConnectionMethod = AuthConnectionServiceGrpc.getDeleteAuthConnectionMethod) == null) {
          AuthConnectionServiceGrpc.getDeleteAuthConnectionMethod = getDeleteAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("DeleteAuthConnection"))
              .build();
        }
      }
    }
    return getDeleteAuthConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthConnectionSecret",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> getUpdateAuthConnectionSecretMethod;
    if ((getUpdateAuthConnectionSecretMethod = AuthConnectionServiceGrpc.getUpdateAuthConnectionSecretMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getUpdateAuthConnectionSecretMethod = AuthConnectionServiceGrpc.getUpdateAuthConnectionSecretMethod) == null) {
          AuthConnectionServiceGrpc.getUpdateAuthConnectionSecretMethod = getUpdateAuthConnectionSecretMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("UpdateAuthConnectionSecret"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthConnectionGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> getUpdateAuthConnectionGroupsMethod;
    if ((getUpdateAuthConnectionGroupsMethod = AuthConnectionServiceGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
      synchronized (AuthConnectionServiceGrpc.class) {
        if ((getUpdateAuthConnectionGroupsMethod = AuthConnectionServiceGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
          AuthConnectionServiceGrpc.getUpdateAuthConnectionGroupsMethod = getUpdateAuthConnectionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionServiceMethodDescriptorSupplier("UpdateAuthConnectionGroups"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthConnectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceStub>() {
        @java.lang.Override
        public AuthConnectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionServiceStub(channel, callOptions);
        }
      };
    return AuthConnectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthConnectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceBlockingStub>() {
        @java.lang.Override
        public AuthConnectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthConnectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthConnectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionServiceFutureStub>() {
        @java.lang.Override
        public AuthConnectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionServiceFutureStub(channel, callOptions);
        }
      };
    return AuthConnectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    default void createAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    default void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    default void getAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    default void deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    default void updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthConnectionSecretMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    default void updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthConnectionGroupsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthConnectionService.
   */
  public static abstract class AuthConnectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthConnectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthConnectionService.
   */
  public static final class AuthConnectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthConnectionServiceStub> {
    private AuthConnectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public void createAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public void getAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public void deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public void updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public void updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionGroupsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthConnectionService.
   */
  public static final class AuthConnectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthConnectionServiceBlockingStub> {
    private AuthConnectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse createAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse getAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse deleteAuthConnection(com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse updateAuthConnectionSecret(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthConnectionSecretMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse updateAuthConnectionGroups(com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthConnectionGroupsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthConnectionService.
   */
  public static final class AuthConnectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthConnectionServiceFutureStub> {
    private AuthConnectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAuthConnection creates a new auth0 connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse> createAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthConnectionSettings gets auth connection settings.
     * DEPRECATED: use GetAuthConnection
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> getAuthConnectionSettings(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAuthConnection gets an existing auth connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse> getAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthConnection removes the current orgs auth settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse> deleteAuthConnection(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionSecret updates a connections secret.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse> updateAuthConnectionSecret(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthConnectionSecretMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAuthConnectionGroups updates a connections groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse> updateAuthConnectionGroups(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest request) {
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
          serviceImpl.createAuthConnection((com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_CONNECTION_SETTINGS:
          serviceImpl.getAuthConnectionSettings((com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_AUTH_CONNECTION:
          serviceImpl.getAuthConnection((com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_CONNECTION:
          serviceImpl.deleteAuthConnection((com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_CONNECTION_SECRET:
          serviceImpl.updateAuthConnectionSecret((com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_CONNECTION_GROUPS:
          serviceImpl.updateAuthConnectionGroups((com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse>) responseObserver);
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
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse>(
                service, METHODID_CREATE_AUTH_CONNECTION)))
        .addMethod(
          getGetAuthConnectionSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse>(
                service, METHODID_GET_AUTH_CONNECTION_SETTINGS)))
        .addMethod(
          getGetAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionResponse>(
                service, METHODID_GET_AUTH_CONNECTION)))
        .addMethod(
          getDeleteAuthConnectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse>(
                service, METHODID_DELETE_AUTH_CONNECTION)))
        .addMethod(
          getUpdateAuthConnectionSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse>(
                service, METHODID_UPDATE_AUTH_CONNECTION_SECRET)))
        .addMethod(
          getUpdateAuthConnectionGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse>(
                service, METHODID_UPDATE_AUTH_CONNECTION_GROUPS)))
        .build();
  }

  private static abstract class AuthConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthConnectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.authconnection.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthConnectionService");
    }
  }

  private static final class AuthConnectionServiceFileDescriptorSupplier
      extends AuthConnectionServiceBaseDescriptorSupplier {
    AuthConnectionServiceFileDescriptorSupplier() {}
  }

  private static final class AuthConnectionServiceMethodDescriptorSupplier
      extends AuthConnectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthConnectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthConnectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthConnectionServiceFileDescriptorSupplier())
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
