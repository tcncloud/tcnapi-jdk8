package com.tcn.cloud.api.services.org.users.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * UsersService is the service for managing users and their related entities.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/org/users/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.org.users.v1alpha1.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> getGetUserLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> getGetUserLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> getGetUserLocalePreferencesMethod;
    if ((getGetUserLocalePreferencesMethod = UsersServiceGrpc.getGetUserLocalePreferencesMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserLocalePreferencesMethod = UsersServiceGrpc.getGetUserLocalePreferencesMethod) == null) {
          UsersServiceGrpc.getGetUserLocalePreferencesMethod = getGetUserLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserLocalePreferences"))
              .build();
        }
      }
    }
    return getGetUserLocalePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> getUpdateUserLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> getUpdateUserLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> getUpdateUserLocalePreferencesMethod;
    if ((getUpdateUserLocalePreferencesMethod = UsersServiceGrpc.getUpdateUserLocalePreferencesMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserLocalePreferencesMethod = UsersServiceGrpc.getUpdateUserLocalePreferencesMethod) == null) {
          UsersServiceGrpc.getUpdateUserLocalePreferencesMethod = getUpdateUserLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserLocalePreferences"))
              .build();
        }
      }
    }
    return getUpdateUserLocalePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> getGetMyUserLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> getGetMyUserLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> getGetMyUserLocalePreferencesMethod;
    if ((getGetMyUserLocalePreferencesMethod = UsersServiceGrpc.getGetMyUserLocalePreferencesMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyUserLocalePreferencesMethod = UsersServiceGrpc.getGetMyUserLocalePreferencesMethod) == null) {
          UsersServiceGrpc.getGetMyUserLocalePreferencesMethod = getGetMyUserLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUserLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyUserLocalePreferences"))
              .build();
        }
      }
    }
    return getGetMyUserLocalePreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> getUpdateMyUserLocalePreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMyUserLocalePreferences",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> getUpdateMyUserLocalePreferencesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> getUpdateMyUserLocalePreferencesMethod;
    if ((getUpdateMyUserLocalePreferencesMethod = UsersServiceGrpc.getUpdateMyUserLocalePreferencesMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateMyUserLocalePreferencesMethod = UsersServiceGrpc.getUpdateMyUserLocalePreferencesMethod) == null) {
          UsersServiceGrpc.getUpdateMyUserLocalePreferencesMethod = getUpdateMyUserLocalePreferencesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMyUserLocalePreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateMyUserLocalePreferences"))
              .build();
        }
      }
    }
    return getUpdateMyUserLocalePreferencesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * UsersService is the service for managing users and their related entities.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * GetUserLocalePreferences retrieves a user's locale preferences.
     * </pre>
     */
    default void getUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLocalePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferences updates a user's locale preferences.
     * </pre>
     */
    default void updateUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserLocalePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferences retrieves the authenticated user's locale preferences.
     * </pre>
     */
    default void getMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserLocalePreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferences updates the authenticated user's locale preferences.
     * </pre>
     */
    default void updateMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMyUserLocalePreferencesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   * <pre>
   * UsersService is the service for managing users and their related entities.
   * </pre>
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
   * <pre>
   * UsersService is the service for managing users and their related entities.
   * </pre>
   */
  public static final class UsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUserLocalePreferences retrieves a user's locale preferences.
     * </pre>
     */
    public void getUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferences updates a user's locale preferences.
     * </pre>
     */
    public void updateUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferences retrieves the authenticated user's locale preferences.
     * </pre>
     */
    public void getMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferences updates the authenticated user's locale preferences.
     * </pre>
     */
    public void updateMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMyUserLocalePreferencesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
   * <pre>
   * UsersService is the service for managing users and their related entities.
   * </pre>
   */
  public static final class UsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUserLocalePreferences retrieves a user's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse getUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLocalePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferences updates a user's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse updateUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserLocalePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferences retrieves the authenticated user's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse getMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserLocalePreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferences updates the authenticated user's locale preferences.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse updateMyUserLocalePreferences(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMyUserLocalePreferencesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
   * <pre>
   * UsersService is the service for managing users and their related entities.
   * </pre>
   */
  public static final class UsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GetUserLocalePreferences retrieves a user's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse> getUserLocalePreferences(
        com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLocalePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferences updates a user's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse> updateUserLocalePreferences(
        com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserLocalePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferences retrieves the authenticated user's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse> getMyUserLocalePreferences(
        com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserLocalePreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferences updates the authenticated user's locale preferences.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse> updateMyUserLocalePreferences(
        com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMyUserLocalePreferencesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LOCALE_PREFERENCES = 0;
  private static final int METHODID_UPDATE_USER_LOCALE_PREFERENCES = 1;
  private static final int METHODID_GET_MY_USER_LOCALE_PREFERENCES = 2;
  private static final int METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES = 3;

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
        case METHODID_GET_USER_LOCALE_PREFERENCES:
          serviceImpl.getUserLocalePreferences((com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_LOCALE_PREFERENCES:
          serviceImpl.updateUserLocalePreferences((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_LOCALE_PREFERENCES:
          serviceImpl.getMyUserLocalePreferences((com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES:
          serviceImpl.updateMyUserLocalePreferences((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse>) responseObserver);
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
          getGetUserLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesResponse>(
                service, METHODID_GET_USER_LOCALE_PREFERENCES)))
        .addMethod(
          getUpdateUserLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesResponse>(
                service, METHODID_UPDATE_USER_LOCALE_PREFERENCES)))
        .addMethod(
          getGetMyUserLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesResponse>(
                service, METHODID_GET_MY_USER_LOCALE_PREFERENCES)))
        .addMethod(
          getUpdateMyUserLocalePreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesResponse>(
                service, METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getGetUserLocalePreferencesMethod())
              .addMethod(getUpdateUserLocalePreferencesMethod())
              .addMethod(getGetMyUserLocalePreferencesMethod())
              .addMethod(getUpdateMyUserLocalePreferencesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
