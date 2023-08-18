package com.tcn.cloud.api.services.pbx.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: services/pbx/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PBXServiceGrpc {

  private PBXServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.pbx.v1.PBXService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest,
      com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> getQueryPbxUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryPbxUsers",
      requestType = com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest,
      com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> getQueryPbxUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest, com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> getQueryPbxUsersMethod;
    if ((getQueryPbxUsersMethod = PBXServiceGrpc.getQueryPbxUsersMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getQueryPbxUsersMethod = PBXServiceGrpc.getQueryPbxUsersMethod) == null) {
          PBXServiceGrpc.getQueryPbxUsersMethod = getQueryPbxUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest, com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryPbxUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("QueryPbxUsers"))
              .build();
        }
      }
    }
    return getQueryPbxUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest,
      com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> getQueryRingGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryRingGroups",
      requestType = com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest,
      com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> getQueryRingGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest, com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> getQueryRingGroupsMethod;
    if ((getQueryRingGroupsMethod = PBXServiceGrpc.getQueryRingGroupsMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getQueryRingGroupsMethod = PBXServiceGrpc.getQueryRingGroupsMethod) == null) {
          PBXServiceGrpc.getQueryRingGroupsMethod = getQueryRingGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest, com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryRingGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("QueryRingGroups"))
              .build();
        }
      }
    }
    return getQueryRingGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest,
      com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> getUpdatePbxUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePbxUser",
      requestType = com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest,
      com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> getUpdatePbxUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest, com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> getUpdatePbxUserMethod;
    if ((getUpdatePbxUserMethod = PBXServiceGrpc.getUpdatePbxUserMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getUpdatePbxUserMethod = PBXServiceGrpc.getUpdatePbxUserMethod) == null) {
          PBXServiceGrpc.getUpdatePbxUserMethod = getUpdatePbxUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest, com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePbxUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("UpdatePbxUser"))
              .build();
        }
      }
    }
    return getUpdatePbxUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> getUpdateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> getUpdateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> getUpdateRingGroupMethod;
    if ((getUpdateRingGroupMethod = PBXServiceGrpc.getUpdateRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getUpdateRingGroupMethod = PBXServiceGrpc.getUpdateRingGroupMethod) == null) {
          PBXServiceGrpc.getUpdateRingGroupMethod = getUpdateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("UpdateRingGroup"))
              .build();
        }
      }
    }
    return getUpdateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> getCreateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> getCreateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> getCreateRingGroupMethod;
    if ((getCreateRingGroupMethod = PBXServiceGrpc.getCreateRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getCreateRingGroupMethod = PBXServiceGrpc.getCreateRingGroupMethod) == null) {
          PBXServiceGrpc.getCreateRingGroupMethod = getCreateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("CreateRingGroup"))
              .build();
        }
      }
    }
    return getCreateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> getDeleteRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> getDeleteRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> getDeleteRingGroupMethod;
    if ((getDeleteRingGroupMethod = PBXServiceGrpc.getDeleteRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getDeleteRingGroupMethod = PBXServiceGrpc.getDeleteRingGroupMethod) == null) {
          PBXServiceGrpc.getDeleteRingGroupMethod = getDeleteRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest, com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("DeleteRingGroup"))
              .build();
        }
      }
    }
    return getDeleteRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest,
      com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> getAssignRandomExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRandomExtension",
      requestType = com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest,
      com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> getAssignRandomExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest, com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> getAssignRandomExtensionMethod;
    if ((getAssignRandomExtensionMethod = PBXServiceGrpc.getAssignRandomExtensionMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getAssignRandomExtensionMethod = PBXServiceGrpc.getAssignRandomExtensionMethod) == null) {
          PBXServiceGrpc.getAssignRandomExtensionMethod = getAssignRandomExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest, com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRandomExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("AssignRandomExtension"))
              .build();
        }
      }
    }
    return getAssignRandomExtensionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PBXServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXServiceStub>() {
        @java.lang.Override
        public PBXServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXServiceStub(channel, callOptions);
        }
      };
    return PBXServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PBXServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXServiceBlockingStub>() {
        @java.lang.Override
        public PBXServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXServiceBlockingStub(channel, callOptions);
        }
      };
    return PBXServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PBXServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXServiceFutureStub>() {
        @java.lang.Override
        public PBXServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXServiceFutureStub(channel, callOptions);
        }
      };
    return PBXServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Queries details of PBX Users based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void queryPbxUsers(com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryPbxUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Queries details of Ring Groups based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void queryRingGroups(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryRingGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates details of a PBX User for the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updatePbxUser(com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePbxUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates details of a Ring Group for the authenticated callers ORG. This operation acts as an "upsert".
     *   - If the groupID is in the update mask and the group exists, the group will be updated.
     *   - If the groupID is not in the update mask a group will be created.
     * Allows for creating and updating a ring group.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateRingGroup(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createRingGroup(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific Ring Group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deleteRingGroup(com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns a random extension either to a PBX user or a Ring Group
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void assignRandomExtension(com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRandomExtensionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PBXService.
   */
  public static abstract class PBXServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PBXServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PBXService.
   */
  public static final class PBXServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PBXServiceStub> {
    private PBXServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries details of PBX Users based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void queryPbxUsers(com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryPbxUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Queries details of Ring Groups based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void queryRingGroups(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryRingGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates details of a PBX User for the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updatePbxUser(com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePbxUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates details of a Ring Group for the authenticated callers ORG. This operation acts as an "upsert".
     *   - If the groupID is in the update mask and the group exists, the group will be updated.
     *   - If the groupID is not in the update mask a group will be created.
     * Allows for creating and updating a ring group.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateRingGroup(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createRingGroup(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific Ring Group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deleteRingGroup(com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assigns a random extension either to a PBX user or a Ring Group
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void assignRandomExtension(com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRandomExtensionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PBXService.
   */
  public static final class PBXServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PBXServiceBlockingStub> {
    private PBXServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries details of PBX Users based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse queryPbxUsers(com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryPbxUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Queries details of Ring Groups based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse queryRingGroups(com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryRingGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates details of a PBX User for the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse updatePbxUser(com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePbxUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates details of a Ring Group for the authenticated callers ORG. This operation acts as an "upsert".
     *   - If the groupID is in the update mask and the group exists, the group will be updated.
     *   - If the groupID is not in the update mask a group will be created.
     * Allows for creating and updating a ring group.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse updateRingGroup(com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse createRingGroup(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a specific Ring Group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse deleteRingGroup(com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assigns a random extension either to a PBX user or a Ring Group
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse assignRandomExtension(com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRandomExtensionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PBXService.
   */
  public static final class PBXServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PBXServiceFutureStub> {
    private PBXServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Queries details of PBX Users based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse> queryPbxUsers(
        com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryPbxUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Queries details of Ring Groups based on specified criteria for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse> queryRingGroups(
        com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryRingGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates details of a PBX User for the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse> updatePbxUser(
        com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePbxUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates details of a Ring Group for the authenticated callers ORG. This operation acts as an "upsert".
     *   - If the groupID is in the update mask and the group exists, the group will be updated.
     *   - If the groupID is not in the update mask a group will be created.
     * Allows for creating and updating a ring group.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse> updateRingGroup(
        com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse> createRingGroup(
        com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a specific Ring Group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse> deleteRingGroup(
        com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assigns a random extension either to a PBX user or a Ring Group
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse> assignRandomExtension(
        com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRandomExtensionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_PBX_USERS = 0;
  private static final int METHODID_QUERY_RING_GROUPS = 1;
  private static final int METHODID_UPDATE_PBX_USER = 2;
  private static final int METHODID_UPDATE_RING_GROUP = 3;
  private static final int METHODID_CREATE_RING_GROUP = 4;
  private static final int METHODID_DELETE_RING_GROUP = 5;
  private static final int METHODID_ASSIGN_RANDOM_EXTENSION = 6;

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
        case METHODID_QUERY_PBX_USERS:
          serviceImpl.queryPbxUsers((com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse>) responseObserver);
          break;
        case METHODID_QUERY_RING_GROUPS:
          serviceImpl.queryRingGroups((com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PBX_USER:
          serviceImpl.updatePbxUser((com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RING_GROUP:
          serviceImpl.updateRingGroup((com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse>) responseObserver);
          break;
        case METHODID_CREATE_RING_GROUP:
          serviceImpl.createRingGroup((com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_RING_GROUP:
          serviceImpl.deleteRingGroup((com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_RANDOM_EXTENSION:
          serviceImpl.assignRandomExtension((com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse>) responseObserver);
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
          getQueryPbxUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersRequest,
              com.tcn.cloud.api.services.pbx.v1.QueryPbxUsersResponse>(
                service, METHODID_QUERY_PBX_USERS)))
        .addMethod(
          getQueryRingGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsRequest,
              com.tcn.cloud.api.services.pbx.v1.QueryRingGroupsResponse>(
                service, METHODID_QUERY_RING_GROUPS)))
        .addMethod(
          getUpdatePbxUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserRequest,
              com.tcn.cloud.api.services.pbx.v1.UpdatePbxUserResponse>(
                service, METHODID_UPDATE_PBX_USER)))
        .addMethod(
          getUpdateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v1.UpdateRingGroupResponse>(
                service, METHODID_UPDATE_RING_GROUP)))
        .addMethod(
          getCreateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v1.CreateRingGroupResponse>(
                service, METHODID_CREATE_RING_GROUP)))
        .addMethod(
          getDeleteRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v1.DeleteRingGroupResponse>(
                service, METHODID_DELETE_RING_GROUP)))
        .addMethod(
          getAssignRandomExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionRequest,
              com.tcn.cloud.api.services.pbx.v1.AssignRandomExtensionResponse>(
                service, METHODID_ASSIGN_RANDOM_EXTENSION)))
        .build();
  }

  private static abstract class PBXServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PBXServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PBXService");
    }
  }

  private static final class PBXServiceFileDescriptorSupplier
      extends PBXServiceBaseDescriptorSupplier {
    PBXServiceFileDescriptorSupplier() {}
  }

  private static final class PBXServiceMethodDescriptorSupplier
      extends PBXServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PBXServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PBXServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PBXServiceFileDescriptorSupplier())
              .addMethod(getQueryPbxUsersMethod())
              .addMethod(getQueryRingGroupsMethod())
              .addMethod(getUpdatePbxUserMethod())
              .addMethod(getUpdateRingGroupMethod())
              .addMethod(getCreateRingGroupMethod())
              .addMethod(getDeleteRingGroupMethod())
              .addMethod(getAssignRandomExtensionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
