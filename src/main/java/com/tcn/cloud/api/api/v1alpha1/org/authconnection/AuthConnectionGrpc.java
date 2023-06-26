package com.tcn.cloud.api.api.v1alpha1.org.authconnection;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: api/v1alpha1/org/authconnection/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthConnectionGrpc {

  private AuthConnectionGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.org.authconnection.AuthConnection";

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
    if ((getCreateAuthConnectionMethod = AuthConnectionGrpc.getCreateAuthConnectionMethod) == null) {
      synchronized (AuthConnectionGrpc.class) {
        if ((getCreateAuthConnectionMethod = AuthConnectionGrpc.getCreateAuthConnectionMethod) == null) {
          AuthConnectionGrpc.getCreateAuthConnectionMethod = getCreateAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.CreateAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionMethodDescriptorSupplier("CreateAuthConnection"))
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
    if ((getGetAuthConnectionSettingsMethod = AuthConnectionGrpc.getGetAuthConnectionSettingsMethod) == null) {
      synchronized (AuthConnectionGrpc.class) {
        if ((getGetAuthConnectionSettingsMethod = AuthConnectionGrpc.getGetAuthConnectionSettingsMethod) == null) {
          AuthConnectionGrpc.getGetAuthConnectionSettingsMethod = getGetAuthConnectionSettingsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAuthConnectionSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionMethodDescriptorSupplier("GetAuthConnectionSettings"))
              .build();
        }
      }
    }
    return getGetAuthConnectionSettingsMethod;
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
    if ((getDeleteAuthConnectionMethod = AuthConnectionGrpc.getDeleteAuthConnectionMethod) == null) {
      synchronized (AuthConnectionGrpc.class) {
        if ((getDeleteAuthConnectionMethod = AuthConnectionGrpc.getDeleteAuthConnectionMethod) == null) {
          AuthConnectionGrpc.getDeleteAuthConnectionMethod = getDeleteAuthConnectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.DeleteAuthConnectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionMethodDescriptorSupplier("DeleteAuthConnection"))
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
    if ((getUpdateAuthConnectionSecretMethod = AuthConnectionGrpc.getUpdateAuthConnectionSecretMethod) == null) {
      synchronized (AuthConnectionGrpc.class) {
        if ((getUpdateAuthConnectionSecretMethod = AuthConnectionGrpc.getUpdateAuthConnectionSecretMethod) == null) {
          AuthConnectionGrpc.getUpdateAuthConnectionSecretMethod = getUpdateAuthConnectionSecretMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionSecretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionMethodDescriptorSupplier("UpdateAuthConnectionSecret"))
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
    if ((getUpdateAuthConnectionGroupsMethod = AuthConnectionGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
      synchronized (AuthConnectionGrpc.class) {
        if ((getUpdateAuthConnectionGroupsMethod = AuthConnectionGrpc.getUpdateAuthConnectionGroupsMethod) == null) {
          AuthConnectionGrpc.getUpdateAuthConnectionGroupsMethod = getUpdateAuthConnectionGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthConnectionGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.authconnection.UpdateAuthConnectionGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthConnectionMethodDescriptorSupplier("UpdateAuthConnectionGroups"))
              .build();
        }
      }
    }
    return getUpdateAuthConnectionGroupsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthConnectionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionStub>() {
        @java.lang.Override
        public AuthConnectionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionStub(channel, callOptions);
        }
      };
    return AuthConnectionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthConnectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionBlockingStub>() {
        @java.lang.Override
        public AuthConnectionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionBlockingStub(channel, callOptions);
        }
      };
    return AuthConnectionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthConnectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthConnectionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthConnectionFutureStub>() {
        @java.lang.Override
        public AuthConnectionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthConnectionFutureStub(channel, callOptions);
        }
      };
    return AuthConnectionFutureStub.newStub(factory, channel);
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
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    default void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAuthConnectionSettingsMethod(), responseObserver);
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
   * Base class for the server implementation of the service AuthConnection.
   */
  public static abstract class AuthConnectionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthConnectionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthConnection.
   */
  public static final class AuthConnectionStub
      extends io.grpc.stub.AbstractAsyncStub<AuthConnectionStub> {
    private AuthConnectionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionStub(channel, callOptions);
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
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public void getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request, responseObserver);
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
   * A stub to allow clients to do synchronous rpc calls to service AuthConnection.
   */
  public static final class AuthConnectionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthConnectionBlockingStub> {
    private AuthConnectionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionBlockingStub(channel, callOptions);
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
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse getAuthConnectionSettings(com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAuthConnectionSettingsMethod(), getCallOptions(), request);
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
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthConnection.
   */
  public static final class AuthConnectionFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthConnectionFutureStub> {
    private AuthConnectionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthConnectionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthConnectionFutureStub(channel, callOptions);
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
     * GetAuthConnectionSettings gets auth0 connection settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsResponse> getAuthConnectionSettings(
        com.tcn.cloud.api.api.v1alpha1.org.authconnection.GetAuthConnectionSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAuthConnectionSettingsMethod(), getCallOptions()), request);
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
  private static final int METHODID_DELETE_AUTH_CONNECTION = 2;
  private static final int METHODID_UPDATE_AUTH_CONNECTION_SECRET = 3;
  private static final int METHODID_UPDATE_AUTH_CONNECTION_GROUPS = 4;

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

  private static abstract class AuthConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthConnectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.authconnection.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthConnection");
    }
  }

  private static final class AuthConnectionFileDescriptorSupplier
      extends AuthConnectionBaseDescriptorSupplier {
    AuthConnectionFileDescriptorSupplier() {}
  }

  private static final class AuthConnectionMethodDescriptorSupplier
      extends AuthConnectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthConnectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthConnectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthConnectionFileDescriptorSupplier())
              .addMethod(getCreateAuthConnectionMethod())
              .addMethod(getGetAuthConnectionSettingsMethod())
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
