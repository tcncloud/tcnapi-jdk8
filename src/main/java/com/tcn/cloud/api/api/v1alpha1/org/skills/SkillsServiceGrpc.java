package com.tcn.cloud.api.api.v1alpha1.org.skills;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/skills/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SkillsServiceGrpc {

  private SkillsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.skills.SkillsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> getCreateSkillGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSkillGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> getCreateSkillGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> getCreateSkillGroupMethod;
    if ((getCreateSkillGroupMethod = SkillsServiceGrpc.getCreateSkillGroupMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getCreateSkillGroupMethod = SkillsServiceGrpc.getCreateSkillGroupMethod) == null) {
          SkillsServiceGrpc.getCreateSkillGroupMethod = getCreateSkillGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSkillGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("CreateSkillGroup"))
              .build();
        }
      }
    }
    return getCreateSkillGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> getListSkillGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkillGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> getListSkillGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> getListSkillGroupsMethod;
    if ((getListSkillGroupsMethod = SkillsServiceGrpc.getListSkillGroupsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getListSkillGroupsMethod = SkillsServiceGrpc.getListSkillGroupsMethod) == null) {
          SkillsServiceGrpc.getListSkillGroupsMethod = getListSkillGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkillGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("ListSkillGroups"))
              .build();
        }
      }
    }
    return getListSkillGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> getUpdateSkillGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSkillGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> getUpdateSkillGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> getUpdateSkillGroupMethod;
    if ((getUpdateSkillGroupMethod = SkillsServiceGrpc.getUpdateSkillGroupMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getUpdateSkillGroupMethod = SkillsServiceGrpc.getUpdateSkillGroupMethod) == null) {
          SkillsServiceGrpc.getUpdateSkillGroupMethod = getUpdateSkillGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSkillGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("UpdateSkillGroup"))
              .build();
        }
      }
    }
    return getUpdateSkillGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> getGetSkillGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkillGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> getGetSkillGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> getGetSkillGroupMethod;
    if ((getGetSkillGroupMethod = SkillsServiceGrpc.getGetSkillGroupMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getGetSkillGroupMethod = SkillsServiceGrpc.getGetSkillGroupMethod) == null) {
          SkillsServiceGrpc.getGetSkillGroupMethod = getGetSkillGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkillGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("GetSkillGroup"))
              .build();
        }
      }
    }
    return getGetSkillGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> getDeleteSkillGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSkillGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> getDeleteSkillGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> getDeleteSkillGroupMethod;
    if ((getDeleteSkillGroupMethod = SkillsServiceGrpc.getDeleteSkillGroupMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getDeleteSkillGroupMethod = SkillsServiceGrpc.getDeleteSkillGroupMethod) == null) {
          SkillsServiceGrpc.getDeleteSkillGroupMethod = getDeleteSkillGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSkillGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("DeleteSkillGroup"))
              .build();
        }
      }
    }
    return getDeleteSkillGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> getRemoveSkillFromAllGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSkillFromAllGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> getRemoveSkillFromAllGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> getRemoveSkillFromAllGroupsMethod;
    if ((getRemoveSkillFromAllGroupsMethod = SkillsServiceGrpc.getRemoveSkillFromAllGroupsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getRemoveSkillFromAllGroupsMethod = SkillsServiceGrpc.getRemoveSkillFromAllGroupsMethod) == null) {
          SkillsServiceGrpc.getRemoveSkillFromAllGroupsMethod = getRemoveSkillFromAllGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSkillFromAllGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("RemoveSkillFromAllGroups"))
              .build();
        }
      }
    }
    return getRemoveSkillFromAllGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> getAssignSkillGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignSkillGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> getAssignSkillGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> getAssignSkillGroupsMethod;
    if ((getAssignSkillGroupsMethod = SkillsServiceGrpc.getAssignSkillGroupsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getAssignSkillGroupsMethod = SkillsServiceGrpc.getAssignSkillGroupsMethod) == null) {
          SkillsServiceGrpc.getAssignSkillGroupsMethod = getAssignSkillGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignSkillGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("AssignSkillGroups"))
              .build();
        }
      }
    }
    return getAssignSkillGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> getUpdateUsersOnSkillGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUsersOnSkillGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> getUpdateUsersOnSkillGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> getUpdateUsersOnSkillGroupMethod;
    if ((getUpdateUsersOnSkillGroupMethod = SkillsServiceGrpc.getUpdateUsersOnSkillGroupMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getUpdateUsersOnSkillGroupMethod = SkillsServiceGrpc.getUpdateUsersOnSkillGroupMethod) == null) {
          SkillsServiceGrpc.getUpdateUsersOnSkillGroupMethod = getUpdateUsersOnSkillGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUsersOnSkillGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("UpdateUsersOnSkillGroup"))
              .build();
        }
      }
    }
    return getUpdateUsersOnSkillGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> getRevokeSkillGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeSkillGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> getRevokeSkillGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> getRevokeSkillGroupsMethod;
    if ((getRevokeSkillGroupsMethod = SkillsServiceGrpc.getRevokeSkillGroupsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getRevokeSkillGroupsMethod = SkillsServiceGrpc.getRevokeSkillGroupsMethod) == null) {
          SkillsServiceGrpc.getRevokeSkillGroupsMethod = getRevokeSkillGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeSkillGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("RevokeSkillGroups"))
              .build();
        }
      }
    }
    return getRevokeSkillGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> getGetUserSkillGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSkillGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> getGetUserSkillGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> getGetUserSkillGroupsMethod;
    if ((getGetUserSkillGroupsMethod = SkillsServiceGrpc.getGetUserSkillGroupsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getGetUserSkillGroupsMethod = SkillsServiceGrpc.getGetUserSkillGroupsMethod) == null) {
          SkillsServiceGrpc.getGetUserSkillGroupsMethod = getGetUserSkillGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSkillGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("GetUserSkillGroups"))
              .build();
        }
      }
    }
    return getGetUserSkillGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> getGetUserSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSkills",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> getGetUserSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> getGetUserSkillsMethod;
    if ((getGetUserSkillsMethod = SkillsServiceGrpc.getGetUserSkillsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getGetUserSkillsMethod = SkillsServiceGrpc.getGetUserSkillsMethod) == null) {
          SkillsServiceGrpc.getGetUserSkillsMethod = getGetUserSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("GetUserSkills"))
              .build();
        }
      }
    }
    return getGetUserSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> getGetSkillGroupMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSkillGroupMembers",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> getGetSkillGroupMembersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> getGetSkillGroupMembersMethod;
    if ((getGetSkillGroupMembersMethod = SkillsServiceGrpc.getGetSkillGroupMembersMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getGetSkillGroupMembersMethod = SkillsServiceGrpc.getGetSkillGroupMembersMethod) == null) {
          SkillsServiceGrpc.getGetSkillGroupMembersMethod = getGetSkillGroupMembersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSkillGroupMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("GetSkillGroupMembers"))
              .build();
        }
      }
    }
    return getGetSkillGroupMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> getListSkillGroupsMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkillGroupsMembers",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> getListSkillGroupsMembersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> getListSkillGroupsMembersMethod;
    if ((getListSkillGroupsMembersMethod = SkillsServiceGrpc.getListSkillGroupsMembersMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getListSkillGroupsMembersMethod = SkillsServiceGrpc.getListSkillGroupsMembersMethod) == null) {
          SkillsServiceGrpc.getListSkillGroupsMembersMethod = getListSkillGroupsMembersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkillGroupsMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("ListSkillGroupsMembers"))
              .build();
        }
      }
    }
    return getListSkillGroupsMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> getGetAgentSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentSkills",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> getGetAgentSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> getGetAgentSkillsMethod;
    if ((getGetAgentSkillsMethod = SkillsServiceGrpc.getGetAgentSkillsMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getGetAgentSkillsMethod = SkillsServiceGrpc.getGetAgentSkillsMethod) == null) {
          SkillsServiceGrpc.getGetAgentSkillsMethod = getGetAgentSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("GetAgentSkills"))
              .build();
        }
      }
    }
    return getGetAgentSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> getListSkillsForCurrentAgentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkillsForCurrentAgent",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest,
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> getListSkillsForCurrentAgentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> getListSkillsForCurrentAgentMethod;
    if ((getListSkillsForCurrentAgentMethod = SkillsServiceGrpc.getListSkillsForCurrentAgentMethod) == null) {
      synchronized (SkillsServiceGrpc.class) {
        if ((getListSkillsForCurrentAgentMethod = SkillsServiceGrpc.getListSkillsForCurrentAgentMethod) == null) {
          SkillsServiceGrpc.getListSkillsForCurrentAgentMethod = getListSkillsForCurrentAgentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkillsForCurrentAgent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SkillsServiceMethodDescriptorSupplier("ListSkillsForCurrentAgent"))
              .build();
        }
      }
    }
    return getListSkillsForCurrentAgentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SkillsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkillsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkillsServiceStub>() {
        @java.lang.Override
        public SkillsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkillsServiceStub(channel, callOptions);
        }
      };
    return SkillsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SkillsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkillsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkillsServiceBlockingStub>() {
        @java.lang.Override
        public SkillsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkillsServiceBlockingStub(channel, callOptions);
        }
      };
    return SkillsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SkillsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SkillsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SkillsServiceFutureStub>() {
        @java.lang.Override
        public SkillsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SkillsServiceFutureStub(channel, callOptions);
        }
      };
    return SkillsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateSkillGroup creates a new skill group.
     * </pre>
     */
    default void createSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSkillGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSkillGroups lists the skill groups belonging to an organization.
     * </pre>
     */
    default void listSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSkillGroup updates a single skill group.
     * </pre>
     */
    default void updateSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSkillGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSkillGroup gets a single skill group.
     * </pre>
     */
    default void getSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkillGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSkillGroup deletes a skill group.
     * </pre>
     */
    default void deleteSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSkillGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveSkillFromAllGroups removes a skill from all skill groups which contain it.
     * </pre>
     */
    default void removeSkillFromAllGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveSkillFromAllGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignSkillGroups assigns a user to the given skill groups.
     * </pre>
     */
    default void assignSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignSkillGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUsersOnSkillGroup updates a skill groups assigned users.
     * </pre>
     */
    default void updateUsersOnSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUsersOnSkillGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * RevokeSkillGroups revokes the given skill groups from a user.
     * </pre>
     */
    default void revokeSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeSkillGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserSkillGroups gets the skill groups assigned to a user.
     * </pre>
     */
    default void getUserSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSkillGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserSkills gets a user's skill proficiencies.
     * </pre>
     */
    default void getUserSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSkillGroupMembers gets the members of a skill group.
     * </pre>
     */
    default void getSkillGroupMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSkillGroupMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSkillGroupsMembers gets the members of a skill group for each skill group in an Org.
     * </pre>
     */
    default void listSkillGroupsMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillGroupsMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    default void getAgentSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    default void listSkillsForCurrentAgent(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillsForCurrentAgentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SkillsService.
   */
  public static abstract class SkillsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SkillsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SkillsService.
   */
  public static final class SkillsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SkillsServiceStub> {
    private SkillsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkillsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkillsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSkillGroup creates a new skill group.
     * </pre>
     */
    public void createSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSkillGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSkillGroups lists the skill groups belonging to an organization.
     * </pre>
     */
    public void listSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSkillGroup updates a single skill group.
     * </pre>
     */
    public void updateSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSkillGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSkillGroup gets a single skill group.
     * </pre>
     */
    public void getSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkillGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSkillGroup deletes a skill group.
     * </pre>
     */
    public void deleteSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSkillGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveSkillFromAllGroups removes a skill from all skill groups which contain it.
     * </pre>
     */
    public void removeSkillFromAllGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveSkillFromAllGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignSkillGroups assigns a user to the given skill groups.
     * </pre>
     */
    public void assignSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignSkillGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUsersOnSkillGroup updates a skill groups assigned users.
     * </pre>
     */
    public void updateUsersOnSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUsersOnSkillGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RevokeSkillGroups revokes the given skill groups from a user.
     * </pre>
     */
    public void revokeSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeSkillGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserSkillGroups gets the skill groups assigned to a user.
     * </pre>
     */
    public void getUserSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSkillGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserSkills gets a user's skill proficiencies.
     * </pre>
     */
    public void getUserSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSkillGroupMembers gets the members of a skill group.
     * </pre>
     */
    public void getSkillGroupMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSkillGroupMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSkillGroupsMembers gets the members of a skill group for each skill group in an Org.
     * </pre>
     */
    public void listSkillGroupsMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillGroupsMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public void getAgentSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public void listSkillsForCurrentAgent(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillsForCurrentAgentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SkillsService.
   */
  public static final class SkillsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SkillsServiceBlockingStub> {
    private SkillsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkillsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkillsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSkillGroup creates a new skill group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse createSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSkillGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSkillGroups lists the skill groups belonging to an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse listSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSkillGroup updates a single skill group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse updateSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSkillGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSkillGroup gets a single skill group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse getSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkillGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSkillGroup deletes a skill group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse deleteSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSkillGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveSkillFromAllGroups removes a skill from all skill groups which contain it.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse removeSkillFromAllGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveSkillFromAllGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignSkillGroups assigns a user to the given skill groups.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse assignSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignSkillGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUsersOnSkillGroup updates a skill groups assigned users.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse updateUsersOnSkillGroup(com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUsersOnSkillGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RevokeSkillGroups revokes the given skill groups from a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse revokeSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeSkillGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserSkillGroups gets the skill groups assigned to a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse getUserSkillGroups(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSkillGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserSkills gets a user's skill proficiencies.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse getUserSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSkillGroupMembers gets the members of a skill group.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse getSkillGroupMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSkillGroupMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSkillGroupsMembers gets the members of a skill group for each skill group in an Org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse listSkillGroupsMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillGroupsMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse getAgentSkills(com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse listSkillsForCurrentAgent(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillsForCurrentAgentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SkillsService.
   */
  public static final class SkillsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SkillsServiceFutureStub> {
    private SkillsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SkillsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SkillsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateSkillGroup creates a new skill group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse> createSkillGroup(
        com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSkillGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSkillGroups lists the skill groups belonging to an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse> listSkillGroups(
        com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSkillGroup updates a single skill group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse> updateSkillGroup(
        com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSkillGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSkillGroup gets a single skill group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse> getSkillGroup(
        com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkillGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSkillGroup deletes a skill group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse> deleteSkillGroup(
        com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSkillGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveSkillFromAllGroups removes a skill from all skill groups which contain it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse> removeSkillFromAllGroups(
        com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveSkillFromAllGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignSkillGroups assigns a user to the given skill groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse> assignSkillGroups(
        com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignSkillGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUsersOnSkillGroup updates a skill groups assigned users.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse> updateUsersOnSkillGroup(
        com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUsersOnSkillGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RevokeSkillGroups revokes the given skill groups from a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse> revokeSkillGroups(
        com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeSkillGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserSkillGroups gets the skill groups assigned to a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse> getUserSkillGroups(
        com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSkillGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserSkills gets a user's skill proficiencies.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse> getUserSkills(
        com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSkillGroupMembers gets the members of a skill group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse> getSkillGroupMembers(
        com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSkillGroupMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSkillGroupsMembers gets the members of a skill group for each skill group in an Org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse> listSkillGroupsMembers(
        com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillGroupsMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the skills of the requesting agent. This includes agent skills, hunt group skills, and extension skills(PBX).
     * Skills will be returned as a value pair (name, level).
     * For agent skills, the name of each skill will be the agent_skill_sid.
     * All other skills' names (hunt group and PBX) will be given special formats.
     * The requesting agent and hunt_group_sid skills will be defaulted to the max level (1000 and 100 respectively).
     * Required permissions:
     *   NONE
     * Errors:
     *   - grpc.Invalid: the hunt_group_sid in the request in invalid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse> getAgentSkills(
        com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of skills for the current agent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse> listSkillsForCurrentAgent(
        com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillsForCurrentAgentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SKILL_GROUP = 0;
  private static final int METHODID_LIST_SKILL_GROUPS = 1;
  private static final int METHODID_UPDATE_SKILL_GROUP = 2;
  private static final int METHODID_GET_SKILL_GROUP = 3;
  private static final int METHODID_DELETE_SKILL_GROUP = 4;
  private static final int METHODID_REMOVE_SKILL_FROM_ALL_GROUPS = 5;
  private static final int METHODID_ASSIGN_SKILL_GROUPS = 6;
  private static final int METHODID_UPDATE_USERS_ON_SKILL_GROUP = 7;
  private static final int METHODID_REVOKE_SKILL_GROUPS = 8;
  private static final int METHODID_GET_USER_SKILL_GROUPS = 9;
  private static final int METHODID_GET_USER_SKILLS = 10;
  private static final int METHODID_GET_SKILL_GROUP_MEMBERS = 11;
  private static final int METHODID_LIST_SKILL_GROUPS_MEMBERS = 12;
  private static final int METHODID_GET_AGENT_SKILLS = 13;
  private static final int METHODID_LIST_SKILLS_FOR_CURRENT_AGENT = 14;

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
        case METHODID_CREATE_SKILL_GROUP:
          serviceImpl.createSkillGroup((com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_SKILL_GROUPS:
          serviceImpl.listSkillGroups((com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SKILL_GROUP:
          serviceImpl.updateSkillGroup((com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse>) responseObserver);
          break;
        case METHODID_GET_SKILL_GROUP:
          serviceImpl.getSkillGroup((com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_SKILL_GROUP:
          serviceImpl.deleteSkillGroup((com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SKILL_FROM_ALL_GROUPS:
          serviceImpl.removeSkillFromAllGroups((com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_SKILL_GROUPS:
          serviceImpl.assignSkillGroups((com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USERS_ON_SKILL_GROUP:
          serviceImpl.updateUsersOnSkillGroup((com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse>) responseObserver);
          break;
        case METHODID_REVOKE_SKILL_GROUPS:
          serviceImpl.revokeSkillGroups((com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SKILL_GROUPS:
          serviceImpl.getUserSkillGroups((com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SKILLS:
          serviceImpl.getUserSkills((com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse>) responseObserver);
          break;
        case METHODID_GET_SKILL_GROUP_MEMBERS:
          serviceImpl.getSkillGroupMembers((com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse>) responseObserver);
          break;
        case METHODID_LIST_SKILL_GROUPS_MEMBERS:
          serviceImpl.listSkillGroupsMembers((com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_SKILLS:
          serviceImpl.getAgentSkills((com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse>) responseObserver);
          break;
        case METHODID_LIST_SKILLS_FOR_CURRENT_AGENT:
          serviceImpl.listSkillsForCurrentAgent((com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse>) responseObserver);
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
          getCreateSkillGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.CreateSkillGroupResponse>(
                service, METHODID_CREATE_SKILL_GROUP)))
        .addMethod(
          getListSkillGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse>(
                service, METHODID_LIST_SKILL_GROUPS)))
        .addMethod(
          getUpdateSkillGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateSkillGroupResponse>(
                service, METHODID_UPDATE_SKILL_GROUP)))
        .addMethod(
          getGetSkillGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupResponse>(
                service, METHODID_GET_SKILL_GROUP)))
        .addMethod(
          getDeleteSkillGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.DeleteSkillGroupResponse>(
                service, METHODID_DELETE_SKILL_GROUP)))
        .addMethod(
          getRemoveSkillFromAllGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsResponse>(
                service, METHODID_REMOVE_SKILL_FROM_ALL_GROUPS)))
        .addMethod(
          getAssignSkillGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.AssignSkillGroupsResponse>(
                service, METHODID_ASSIGN_SKILL_GROUPS)))
        .addMethod(
          getUpdateUsersOnSkillGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.UpdateUsersOnSkillGroupResponse>(
                service, METHODID_UPDATE_USERS_ON_SKILL_GROUP)))
        .addMethod(
          getRevokeSkillGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeSkillGroupsResponse>(
                service, METHODID_REVOKE_SKILL_GROUPS)))
        .addMethod(
          getGetUserSkillGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillGroupsResponse>(
                service, METHODID_GET_USER_SKILL_GROUPS)))
        .addMethod(
          getGetUserSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetUserSkillsResponse>(
                service, METHODID_GET_USER_SKILLS)))
        .addMethod(
          getGetSkillGroupMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupMembersResponse>(
                service, METHODID_GET_SKILL_GROUP_MEMBERS)))
        .addMethod(
          getListSkillGroupsMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse>(
                service, METHODID_LIST_SKILL_GROUPS_MEMBERS)))
        .addMethod(
          getGetAgentSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetAgentSkillsResponse>(
                service, METHODID_GET_AGENT_SKILLS)))
        .addMethod(
          getListSkillsForCurrentAgentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentRequest,
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse>(
                service, METHODID_LIST_SKILLS_FOR_CURRENT_AGENT)))
        .build();
  }

  private static abstract class SkillsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SkillsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SkillsService");
    }
  }

  private static final class SkillsServiceFileDescriptorSupplier
      extends SkillsServiceBaseDescriptorSupplier {
    SkillsServiceFileDescriptorSupplier() {}
  }

  private static final class SkillsServiceMethodDescriptorSupplier
      extends SkillsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SkillsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SkillsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SkillsServiceFileDescriptorSupplier())
              .addMethod(getCreateSkillGroupMethod())
              .addMethod(getListSkillGroupsMethod())
              .addMethod(getUpdateSkillGroupMethod())
              .addMethod(getGetSkillGroupMethod())
              .addMethod(getDeleteSkillGroupMethod())
              .addMethod(getRemoveSkillFromAllGroupsMethod())
              .addMethod(getAssignSkillGroupsMethod())
              .addMethod(getUpdateUsersOnSkillGroupMethod())
              .addMethod(getRevokeSkillGroupsMethod())
              .addMethod(getGetUserSkillGroupsMethod())
              .addMethod(getGetUserSkillsMethod())
              .addMethod(getGetSkillGroupMembersMethod())
              .addMethod(getListSkillGroupsMembersMethod())
              .addMethod(getGetAgentSkillsMethod())
              .addMethod(getListSkillsForCurrentAgentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
