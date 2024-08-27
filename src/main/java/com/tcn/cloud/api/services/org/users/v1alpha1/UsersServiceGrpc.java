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
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> getGetUserLocalePreferencesOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLocalePreferencesOverride",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> getGetUserLocalePreferencesOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> getGetUserLocalePreferencesOverrideMethod;
    if ((getGetUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getGetUserLocalePreferencesOverrideMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getGetUserLocalePreferencesOverrideMethod) == null) {
          UsersServiceGrpc.getGetUserLocalePreferencesOverrideMethod = getGetUserLocalePreferencesOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLocalePreferencesOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserLocalePreferencesOverride"))
              .build();
        }
      }
    }
    return getGetUserLocalePreferencesOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> getUpdateUserLocalePreferencesOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserLocalePreferencesOverride",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> getUpdateUserLocalePreferencesOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> getUpdateUserLocalePreferencesOverrideMethod;
    if ((getUpdateUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getUpdateUserLocalePreferencesOverrideMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getUpdateUserLocalePreferencesOverrideMethod) == null) {
          UsersServiceGrpc.getUpdateUserLocalePreferencesOverrideMethod = getUpdateUserLocalePreferencesOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserLocalePreferencesOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserLocalePreferencesOverride"))
              .build();
        }
      }
    }
    return getUpdateUserLocalePreferencesOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> getGetMyUserLocalePreferencesOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserLocalePreferencesOverride",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> getGetMyUserLocalePreferencesOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> getGetMyUserLocalePreferencesOverrideMethod;
    if ((getGetMyUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getGetMyUserLocalePreferencesOverrideMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getGetMyUserLocalePreferencesOverrideMethod) == null) {
          UsersServiceGrpc.getGetMyUserLocalePreferencesOverrideMethod = getGetMyUserLocalePreferencesOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUserLocalePreferencesOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyUserLocalePreferencesOverride"))
              .build();
        }
      }
    }
    return getGetMyUserLocalePreferencesOverrideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> getUpdateMyUserLocalePreferencesOverrideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMyUserLocalePreferencesOverride",
      requestType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest.class,
      responseType = com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest,
      com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> getUpdateMyUserLocalePreferencesOverrideMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> getUpdateMyUserLocalePreferencesOverrideMethod;
    if ((getUpdateMyUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getUpdateMyUserLocalePreferencesOverrideMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateMyUserLocalePreferencesOverrideMethod = UsersServiceGrpc.getUpdateMyUserLocalePreferencesOverrideMethod) == null) {
          UsersServiceGrpc.getUpdateMyUserLocalePreferencesOverrideMethod = getUpdateMyUserLocalePreferencesOverrideMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest, com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMyUserLocalePreferencesOverride"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateMyUserLocalePreferencesOverride"))
              .build();
        }
      }
    }
    return getUpdateMyUserLocalePreferencesOverrideMethod;
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
     * GetUserLocalePreferencesOverride retrieves a user's locale preferences override.
     * </pre>
     */
    default void getUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLocalePreferencesOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferencesOverride updates a user's locale preferences override.
     * </pre>
     */
    default void updateUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserLocalePreferencesOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferencesOverride retrieves the authenticated user's locale preferences override.
     * </pre>
     */
    default void getMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserLocalePreferencesOverrideMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferencesOverride updates the authenticated user's locale preferences override.
     * </pre>
     */
    default void updateMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMyUserLocalePreferencesOverrideMethod(), responseObserver);
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
     * GetUserLocalePreferencesOverride retrieves a user's locale preferences override.
     * </pre>
     */
    public void getUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLocalePreferencesOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferencesOverride updates a user's locale preferences override.
     * </pre>
     */
    public void updateUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserLocalePreferencesOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferencesOverride retrieves the authenticated user's locale preferences override.
     * </pre>
     */
    public void getMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserLocalePreferencesOverrideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferencesOverride updates the authenticated user's locale preferences override.
     * </pre>
     */
    public void updateMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMyUserLocalePreferencesOverrideMethod(), getCallOptions()), request, responseObserver);
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
     * GetUserLocalePreferencesOverride retrieves a user's locale preferences override.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse getUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLocalePreferencesOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferencesOverride updates a user's locale preferences override.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse updateUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserLocalePreferencesOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferencesOverride retrieves the authenticated user's locale preferences override.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse getMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserLocalePreferencesOverrideMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferencesOverride updates the authenticated user's locale preferences override.
     * </pre>
     */
    public com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse updateMyUserLocalePreferencesOverride(com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMyUserLocalePreferencesOverrideMethod(), getCallOptions(), request);
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
     * GetUserLocalePreferencesOverride retrieves a user's locale preferences override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse> getUserLocalePreferencesOverride(
        com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLocalePreferencesOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserLocalePreferencesOverride updates a user's locale preferences override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse> updateUserLocalePreferencesOverride(
        com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserLocalePreferencesOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUserLocalePreferencesOverride retrieves the authenticated user's locale preferences override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse> getMyUserLocalePreferencesOverride(
        com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserLocalePreferencesOverrideMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMyUserLocalePreferencesOverride updates the authenticated user's locale preferences override.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse> updateMyUserLocalePreferencesOverride(
        com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMyUserLocalePreferencesOverrideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LOCALE_PREFERENCES_OVERRIDE = 0;
  private static final int METHODID_UPDATE_USER_LOCALE_PREFERENCES_OVERRIDE = 1;
  private static final int METHODID_GET_MY_USER_LOCALE_PREFERENCES_OVERRIDE = 2;
  private static final int METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES_OVERRIDE = 3;

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
        case METHODID_GET_USER_LOCALE_PREFERENCES_OVERRIDE:
          serviceImpl.getUserLocalePreferencesOverride((com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_LOCALE_PREFERENCES_OVERRIDE:
          serviceImpl.updateUserLocalePreferencesOverride((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_LOCALE_PREFERENCES_OVERRIDE:
          serviceImpl.getMyUserLocalePreferencesOverride((com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES_OVERRIDE:
          serviceImpl.updateMyUserLocalePreferencesOverride((com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse>) responseObserver);
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
          getGetUserLocalePreferencesOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.GetUserLocalePreferencesOverrideResponse>(
                service, METHODID_GET_USER_LOCALE_PREFERENCES_OVERRIDE)))
        .addMethod(
          getUpdateUserLocalePreferencesOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateUserLocalePreferencesOverrideResponse>(
                service, METHODID_UPDATE_USER_LOCALE_PREFERENCES_OVERRIDE)))
        .addMethod(
          getGetMyUserLocalePreferencesOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesOverrideResponse>(
                service, METHODID_GET_MY_USER_LOCALE_PREFERENCES_OVERRIDE)))
        .addMethod(
          getUpdateMyUserLocalePreferencesOverrideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideRequest,
              com.tcn.cloud.api.services.org.users.v1alpha1.UpdateMyUserLocalePreferencesOverrideResponse>(
                service, METHODID_UPDATE_MY_USER_LOCALE_PREFERENCES_OVERRIDE)))
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
              .addMethod(getGetUserLocalePreferencesOverrideMethod())
              .addMethod(getUpdateUserLocalePreferencesOverrideMethod())
              .addMethod(getGetMyUserLocalePreferencesOverrideMethod())
              .addMethod(getUpdateMyUserLocalePreferencesOverrideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
