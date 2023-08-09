package com.tcn.cloud.api.api.v1alpha1.pbx;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * PBX is responsible for PBX user management and SIP configuration.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/pbx/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PBXGrpc {

  private PBXGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.pbx.PBX";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> getListPbxUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPbxUsers",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> getListPbxUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> getListPbxUsersMethod;
    if ((getListPbxUsersMethod = PBXGrpc.getListPbxUsersMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getListPbxUsersMethod = PBXGrpc.getListPbxUsersMethod) == null) {
          PBXGrpc.getListPbxUsersMethod = getListPbxUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPbxUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("ListPbxUsers"))
              .build();
        }
      }
    }
    return getListPbxUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> getActivatePbxUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivatePbxUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> getActivatePbxUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> getActivatePbxUserMethod;
    if ((getActivatePbxUserMethod = PBXGrpc.getActivatePbxUserMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getActivatePbxUserMethod = PBXGrpc.getActivatePbxUserMethod) == null) {
          PBXGrpc.getActivatePbxUserMethod = getActivatePbxUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivatePbxUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("ActivatePbxUser"))
              .build();
        }
      }
    }
    return getActivatePbxUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> getDeactivatePbxUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivatePbxUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> getDeactivatePbxUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest, com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> getDeactivatePbxUserMethod;
    if ((getDeactivatePbxUserMethod = PBXGrpc.getDeactivatePbxUserMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getDeactivatePbxUserMethod = PBXGrpc.getDeactivatePbxUserMethod) == null) {
          PBXGrpc.getDeactivatePbxUserMethod = getDeactivatePbxUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest, com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivatePbxUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("DeactivatePbxUser"))
              .build();
        }
      }
    }
    return getDeactivatePbxUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> getUpdateUserExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserExtension",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> getUpdateUserExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> getUpdateUserExtensionMethod;
    if ((getUpdateUserExtensionMethod = PBXGrpc.getUpdateUserExtensionMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getUpdateUserExtensionMethod = PBXGrpc.getUpdateUserExtensionMethod) == null) {
          PBXGrpc.getUpdateUserExtensionMethod = getUpdateUserExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("UpdateUserExtension"))
              .build();
        }
      }
    }
    return getUpdateUserExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> getCreateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRingGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> getCreateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> getCreateRingGroupMethod;
    if ((getCreateRingGroupMethod = PBXGrpc.getCreateRingGroupMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getCreateRingGroupMethod = PBXGrpc.getCreateRingGroupMethod) == null) {
          PBXGrpc.getCreateRingGroupMethod = getCreateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("CreateRingGroup"))
              .build();
        }
      }
    }
    return getCreateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> getListRingGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRingGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> getListRingGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> getListRingGroupsMethod;
    if ((getListRingGroupsMethod = PBXGrpc.getListRingGroupsMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getListRingGroupsMethod = PBXGrpc.getListRingGroupsMethod) == null) {
          PBXGrpc.getListRingGroupsMethod = getListRingGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest, com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRingGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("ListRingGroups"))
              .build();
        }
      }
    }
    return getListRingGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> getUpdateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRingGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> getUpdateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> getUpdateRingGroupMethod;
    if ((getUpdateRingGroupMethod = PBXGrpc.getUpdateRingGroupMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getUpdateRingGroupMethod = PBXGrpc.getUpdateRingGroupMethod) == null) {
          PBXGrpc.getUpdateRingGroupMethod = getUpdateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("UpdateRingGroup"))
              .build();
        }
      }
    }
    return getUpdateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> getAddUsersToRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUsersToRingGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> getAddUsersToRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> getAddUsersToRingGroupMethod;
    if ((getAddUsersToRingGroupMethod = PBXGrpc.getAddUsersToRingGroupMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getAddUsersToRingGroupMethod = PBXGrpc.getAddUsersToRingGroupMethod) == null) {
          PBXGrpc.getAddUsersToRingGroupMethod = getAddUsersToRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUsersToRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("AddUsersToRingGroup"))
              .build();
        }
      }
    }
    return getAddUsersToRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> getRemoveUsersFromRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsersFromRingGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> getRemoveUsersFromRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> getRemoveUsersFromRingGroupMethod;
    if ((getRemoveUsersFromRingGroupMethod = PBXGrpc.getRemoveUsersFromRingGroupMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getRemoveUsersFromRingGroupMethod = PBXGrpc.getRemoveUsersFromRingGroupMethod) == null) {
          PBXGrpc.getRemoveUsersFromRingGroupMethod = getRemoveUsersFromRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUsersFromRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("RemoveUsersFromRingGroup"))
              .build();
        }
      }
    }
    return getRemoveUsersFromRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> getDeleteRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRingGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> getDeleteRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> getDeleteRingGroupMethod;
    if ((getDeleteRingGroupMethod = PBXGrpc.getDeleteRingGroupMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getDeleteRingGroupMethod = PBXGrpc.getDeleteRingGroupMethod) == null) {
          PBXGrpc.getDeleteRingGroupMethod = getDeleteRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest, com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("DeleteRingGroup"))
              .build();
        }
      }
    }
    return getDeleteRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> getAssignRandomUserExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRandomUserExtension",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> getAssignRandomUserExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> getAssignRandomUserExtensionMethod;
    if ((getAssignRandomUserExtensionMethod = PBXGrpc.getAssignRandomUserExtensionMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getAssignRandomUserExtensionMethod = PBXGrpc.getAssignRandomUserExtensionMethod) == null) {
          PBXGrpc.getAssignRandomUserExtensionMethod = getAssignRandomUserExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRandomUserExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("AssignRandomUserExtension"))
              .build();
        }
      }
    }
    return getAssignRandomUserExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> getAssignRandomGroupExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRandomGroupExtension",
      requestType = com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest,
      com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> getAssignRandomGroupExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> getAssignRandomGroupExtensionMethod;
    if ((getAssignRandomGroupExtensionMethod = PBXGrpc.getAssignRandomGroupExtensionMethod) == null) {
      synchronized (PBXGrpc.class) {
        if ((getAssignRandomGroupExtensionMethod = PBXGrpc.getAssignRandomGroupExtensionMethod) == null) {
          PBXGrpc.getAssignRandomGroupExtensionMethod = getAssignRandomGroupExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest, com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRandomGroupExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXMethodDescriptorSupplier("AssignRandomGroupExtension"))
              .build();
        }
      }
    }
    return getAssignRandomGroupExtensionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PBXStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXStub>() {
        @java.lang.Override
        public PBXStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXStub(channel, callOptions);
        }
      };
    return PBXStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PBXBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXBlockingStub>() {
        @java.lang.Override
        public PBXBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXBlockingStub(channel, callOptions);
        }
      };
    return PBXBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PBXFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PBXFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PBXFutureStub>() {
        @java.lang.Override
        public PBXFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PBXFutureStub(channel, callOptions);
        }
      };
    return PBXFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * PBX is responsible for PBX user management and SIP configuration.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists all PBX Users for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listPbxUsers(com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPbxUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void activatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivatePbxUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deactivatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivatePbxUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a PBX Users extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format. Or the extension has an invalid length.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.FailedPrecondition: The extension is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserExtensionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all ring groups for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listRingGroups(com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRingGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG || One or more of the users DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The group or one or more of the userIDs have an invalid format.
     *   - grpc.NotFound: The group or a user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void addUsersToRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersToRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void removeUsersFromRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUsersFromRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void deleteRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Randomly assigns a PBX User an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void assignRandomUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRandomUserExtensionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Randomly assigns a PBX group an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void assignRandomGroupExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRandomGroupExtensionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PBX.
   * <pre>
   * PBX is responsible for PBX user management and SIP configuration.
   * </pre>
   */
  public static abstract class PBXImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PBXGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PBX.
   * <pre>
   * PBX is responsible for PBX user management and SIP configuration.
   * </pre>
   */
  public static final class PBXStub
      extends io.grpc.stub.AbstractAsyncStub<PBXStub> {
    private PBXStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all PBX Users for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listPbxUsers(com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPbxUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void activatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivatePbxUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deactivatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivatePbxUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a PBX Users extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format. Or the extension has an invalid length.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.FailedPrecondition: The extension is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all ring groups for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listRingGroups(com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRingGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG || One or more of the users DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The group or one or more of the userIDs have an invalid format.
     *   - grpc.NotFound: The group or a user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void addUsersToRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersToRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void removeUsersFromRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUsersFromRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void deleteRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Randomly assigns a PBX User an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void assignRandomUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRandomUserExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Randomly assigns a PBX group an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void assignRandomGroupExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRandomGroupExtensionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PBX.
   * <pre>
   * PBX is responsible for PBX user management and SIP configuration.
   * </pre>
   */
  public static final class PBXBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PBXBlockingStub> {
    private PBXBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all PBX Users for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse listPbxUsers(com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPbxUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse activatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivatePbxUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse deactivatePbxUser(com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivatePbxUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a PBX Users extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format. Or the extension has an invalid length.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.FailedPrecondition: The extension is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse updateUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserExtensionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse createRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all ring groups for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse listRingGroups(com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRingGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG || One or more of the users DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse updateRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The group or one or more of the userIDs have an invalid format.
     *   - grpc.NotFound: The group or a user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse addUsersToRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersToRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse removeUsersFromRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUsersFromRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse deleteRingGroup(com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Randomly assigns a PBX User an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse assignRandomUserExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRandomUserExtensionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Randomly assigns a PBX group an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse assignRandomGroupExtension(com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRandomGroupExtensionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PBX.
   * <pre>
   * PBX is responsible for PBX user management and SIP configuration.
   * </pre>
   */
  public static final class PBXFutureStub
      extends io.grpc.stub.AbstractFutureStub<PBXFutureStub> {
    private PBXFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PBXFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PBXFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists all PBX Users for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse> listPbxUsers(
        com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPbxUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse> activatePbxUser(
        com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivatePbxUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivates a given PBX User for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse> deactivatePbxUser(
        com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivatePbxUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a PBX Users extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format. Or the extension has an invalid length.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.FailedPrecondition: The extension is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse> updateUserExtension(
        com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserExtensionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse> createRingGroup(
        com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists all ring groups for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse> listRingGroups(
        com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRingGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The name is blank, has invalid characters, or the extension has an invalid length.
     *   - grpc.FailedPrecondition: The extension or name is already in use.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG || One or more of the users DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse> updateRingGroup(
        com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The group or one or more of the userIDs have an invalid format.
     *   - grpc.NotFound: The group or a user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse> addUsersToRingGroup(
        com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersToRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes users to a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse> removeUsersFromRingGroup(
        com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUsersFromRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a ring group for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse> deleteRingGroup(
        com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Randomly assigns a PBX User an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The userID is an invalid format.
     *   - grpc.NotFound: The user DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse> assignRandomUserExtension(
        com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRandomUserExtensionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Randomly assigns a PBX group an extension for the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The groupID is an invalid format.
     *   - grpc.NotFound: The group DNE or is not in the callers ORG.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse> assignRandomGroupExtension(
        com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRandomGroupExtensionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PBX_USERS = 0;
  private static final int METHODID_ACTIVATE_PBX_USER = 1;
  private static final int METHODID_DEACTIVATE_PBX_USER = 2;
  private static final int METHODID_UPDATE_USER_EXTENSION = 3;
  private static final int METHODID_CREATE_RING_GROUP = 4;
  private static final int METHODID_LIST_RING_GROUPS = 5;
  private static final int METHODID_UPDATE_RING_GROUP = 6;
  private static final int METHODID_ADD_USERS_TO_RING_GROUP = 7;
  private static final int METHODID_REMOVE_USERS_FROM_RING_GROUP = 8;
  private static final int METHODID_DELETE_RING_GROUP = 9;
  private static final int METHODID_ASSIGN_RANDOM_USER_EXTENSION = 10;
  private static final int METHODID_ASSIGN_RANDOM_GROUP_EXTENSION = 11;

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
        case METHODID_LIST_PBX_USERS:
          serviceImpl.listPbxUsers((com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_PBX_USER:
          serviceImpl.activatePbxUser((com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_PBX_USER:
          serviceImpl.deactivatePbxUser((com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_EXTENSION:
          serviceImpl.updateUserExtension((com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse>) responseObserver);
          break;
        case METHODID_CREATE_RING_GROUP:
          serviceImpl.createRingGroup((com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_RING_GROUPS:
          serviceImpl.listRingGroups((com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RING_GROUP:
          serviceImpl.updateRingGroup((com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse>) responseObserver);
          break;
        case METHODID_ADD_USERS_TO_RING_GROUP:
          serviceImpl.addUsersToRingGroup((com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USERS_FROM_RING_GROUP:
          serviceImpl.removeUsersFromRingGroup((com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_RING_GROUP:
          serviceImpl.deleteRingGroup((com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_RANDOM_USER_EXTENSION:
          serviceImpl.assignRandomUserExtension((com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_RANDOM_GROUP_EXTENSION:
          serviceImpl.assignRandomGroupExtension((com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse>) responseObserver);
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
          getListPbxUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.ListPbxUsersResponse>(
                service, METHODID_LIST_PBX_USERS)))
        .addMethod(
          getActivatePbxUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.ActivatePbxUserResponse>(
                service, METHODID_ACTIVATE_PBX_USER)))
        .addMethod(
          getDeactivatePbxUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.DeactivatePbxUserResponse>(
                service, METHODID_DEACTIVATE_PBX_USER)))
        .addMethod(
          getUpdateUserExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.UpdateUserExtensionResponse>(
                service, METHODID_UPDATE_USER_EXTENSION)))
        .addMethod(
          getCreateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.CreateRingGroupResponse>(
                service, METHODID_CREATE_RING_GROUP)))
        .addMethod(
          getListRingGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.ListRingGroupsResponse>(
                service, METHODID_LIST_RING_GROUPS)))
        .addMethod(
          getUpdateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.UpdateRingGroupResponse>(
                service, METHODID_UPDATE_RING_GROUP)))
        .addMethod(
          getAddUsersToRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.AddUsersToRingGroupResponse>(
                service, METHODID_ADD_USERS_TO_RING_GROUP)))
        .addMethod(
          getRemoveUsersFromRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.RemoveUsersFromRingGroupResponse>(
                service, METHODID_REMOVE_USERS_FROM_RING_GROUP)))
        .addMethod(
          getDeleteRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.DeleteRingGroupResponse>(
                service, METHODID_DELETE_RING_GROUP)))
        .addMethod(
          getAssignRandomUserExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomUserExtensionResponse>(
                service, METHODID_ASSIGN_RANDOM_USER_EXTENSION)))
        .addMethod(
          getAssignRandomGroupExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionRequest,
              com.tcn.cloud.api.api.v1alpha1.pbx.AssignRandomGroupExtensionResponse>(
                service, METHODID_ASSIGN_RANDOM_GROUP_EXTENSION)))
        .build();
  }

  private static abstract class PBXBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PBXBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.pbx.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PBX");
    }
  }

  private static final class PBXFileDescriptorSupplier
      extends PBXBaseDescriptorSupplier {
    PBXFileDescriptorSupplier() {}
  }

  private static final class PBXMethodDescriptorSupplier
      extends PBXBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PBXMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PBXGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PBXFileDescriptorSupplier())
              .addMethod(getListPbxUsersMethod())
              .addMethod(getActivatePbxUserMethod())
              .addMethod(getDeactivatePbxUserMethod())
              .addMethod(getUpdateUserExtensionMethod())
              .addMethod(getCreateRingGroupMethod())
              .addMethod(getListRingGroupsMethod())
              .addMethod(getUpdateRingGroupMethod())
              .addMethod(getAddUsersToRingGroupMethod())
              .addMethod(getRemoveUsersFromRingGroupMethod())
              .addMethod(getDeleteRingGroupMethod())
              .addMethod(getAssignRandomUserExtensionMethod())
              .addMethod(getAssignRandomGroupExtensionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
