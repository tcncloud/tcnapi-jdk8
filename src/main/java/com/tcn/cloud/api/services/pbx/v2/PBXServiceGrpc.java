package com.tcn.cloud.api.services.pbx.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/pbx/v2/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PBXServiceGrpc {

  private PBXServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.pbx.v2.PBXService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest,
      com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> getListPBXUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPBXUsers",
      requestType = com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest,
      com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> getListPBXUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest, com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> getListPBXUsersMethod;
    if ((getListPBXUsersMethod = PBXServiceGrpc.getListPBXUsersMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getListPBXUsersMethod = PBXServiceGrpc.getListPBXUsersMethod) == null) {
          PBXServiceGrpc.getListPBXUsersMethod = getListPBXUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest, com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPBXUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("ListPBXUsers"))
              .build();
        }
      }
    }
    return getListPBXUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest,
      com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> getGetDialUrlByExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDialUrlByExtension",
      requestType = com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest,
      com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> getGetDialUrlByExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest, com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> getGetDialUrlByExtensionMethod;
    if ((getGetDialUrlByExtensionMethod = PBXServiceGrpc.getGetDialUrlByExtensionMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getGetDialUrlByExtensionMethod = PBXServiceGrpc.getGetDialUrlByExtensionMethod) == null) {
          PBXServiceGrpc.getGetDialUrlByExtensionMethod = getGetDialUrlByExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest, com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDialUrlByExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("GetDialUrlByExtension"))
              .build();
        }
      }
    }
    return getGetDialUrlByExtensionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest,
      com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> getGetPBXUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPBXUser",
      requestType = com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest,
      com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> getGetPBXUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest, com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> getGetPBXUserMethod;
    if ((getGetPBXUserMethod = PBXServiceGrpc.getGetPBXUserMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getGetPBXUserMethod = PBXServiceGrpc.getGetPBXUserMethod) == null) {
          PBXServiceGrpc.getGetPBXUserMethod = getGetPBXUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest, com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPBXUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("GetPBXUser"))
              .build();
        }
      }
    }
    return getGetPBXUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest,
      com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> getListActivePBXProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListActivePBXProfiles",
      requestType = com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest,
      com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> getListActivePBXProfilesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest, com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> getListActivePBXProfilesMethod;
    if ((getListActivePBXProfilesMethod = PBXServiceGrpc.getListActivePBXProfilesMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getListActivePBXProfilesMethod = PBXServiceGrpc.getListActivePBXProfilesMethod) == null) {
          PBXServiceGrpc.getListActivePBXProfilesMethod = getListActivePBXProfilesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest, com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListActivePBXProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("ListActivePBXProfiles"))
              .build();
        }
      }
    }
    return getListActivePBXProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest,
      com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> getListRingGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRingGroups",
      requestType = com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest,
      com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> getListRingGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest, com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> getListRingGroupsMethod;
    if ((getListRingGroupsMethod = PBXServiceGrpc.getListRingGroupsMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getListRingGroupsMethod = PBXServiceGrpc.getListRingGroupsMethod) == null) {
          PBXServiceGrpc.getListRingGroupsMethod = getListRingGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest, com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRingGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("ListRingGroups"))
              .build();
        }
      }
    }
    return getListRingGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> getGetRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> getGetRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> getGetRingGroupMethod;
    if ((getGetRingGroupMethod = PBXServiceGrpc.getGetRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getGetRingGroupMethod = PBXServiceGrpc.getGetRingGroupMethod) == null) {
          PBXServiceGrpc.getGetRingGroupMethod = getGetRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("GetRingGroup"))
              .build();
        }
      }
    }
    return getGetRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest,
      com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> getGetSIPAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSIPAccount",
      requestType = com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest,
      com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> getGetSIPAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest, com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> getGetSIPAccountMethod;
    if ((getGetSIPAccountMethod = PBXServiceGrpc.getGetSIPAccountMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getGetSIPAccountMethod = PBXServiceGrpc.getGetSIPAccountMethod) == null) {
          PBXServiceGrpc.getGetSIPAccountMethod = getGetSIPAccountMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest, com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSIPAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("GetSIPAccount"))
              .build();
        }
      }
    }
    return getGetSIPAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest,
      com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> getListSIPAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSIPAccounts",
      requestType = com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest,
      com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> getListSIPAccountsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest, com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> getListSIPAccountsMethod;
    if ((getListSIPAccountsMethod = PBXServiceGrpc.getListSIPAccountsMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getListSIPAccountsMethod = PBXServiceGrpc.getListSIPAccountsMethod) == null) {
          PBXServiceGrpc.getListSIPAccountsMethod = getListSIPAccountsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest, com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSIPAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("ListSIPAccounts"))
              .build();
        }
      }
    }
    return getListSIPAccountsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest,
      com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> getUpdateSIPAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSIPAccount",
      requestType = com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest,
      com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> getUpdateSIPAccountMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest, com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> getUpdateSIPAccountMethod;
    if ((getUpdateSIPAccountMethod = PBXServiceGrpc.getUpdateSIPAccountMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getUpdateSIPAccountMethod = PBXServiceGrpc.getUpdateSIPAccountMethod) == null) {
          PBXServiceGrpc.getUpdateSIPAccountMethod = getUpdateSIPAccountMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest, com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSIPAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("UpdateSIPAccount"))
              .build();
        }
      }
    }
    return getUpdateSIPAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> getUpdateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> getUpdateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> getUpdateRingGroupMethod;
    if ((getUpdateRingGroupMethod = PBXServiceGrpc.getUpdateRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getUpdateRingGroupMethod = PBXServiceGrpc.getUpdateRingGroupMethod) == null) {
          PBXServiceGrpc.getUpdateRingGroupMethod = getUpdateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("UpdateRingGroup"))
              .build();
        }
      }
    }
    return getUpdateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> getCreateRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> getCreateRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> getCreateRingGroupMethod;
    if ((getCreateRingGroupMethod = PBXServiceGrpc.getCreateRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getCreateRingGroupMethod = PBXServiceGrpc.getCreateRingGroupMethod) == null) {
          PBXServiceGrpc.getCreateRingGroupMethod = getCreateRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("CreateRingGroup"))
              .build();
        }
      }
    }
    return getCreateRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> getDeleteRingGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRingGroup",
      requestType = com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest,
      com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> getDeleteRingGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> getDeleteRingGroupMethod;
    if ((getDeleteRingGroupMethod = PBXServiceGrpc.getDeleteRingGroupMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getDeleteRingGroupMethod = PBXServiceGrpc.getDeleteRingGroupMethod) == null) {
          PBXServiceGrpc.getDeleteRingGroupMethod = getDeleteRingGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest, com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRingGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PBXServiceMethodDescriptorSupplier("DeleteRingGroup"))
              .build();
        }
      }
    }
    return getDeleteRingGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest,
      com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> getAssignRandomExtensionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRandomExtension",
      requestType = com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest.class,
      responseType = com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest,
      com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> getAssignRandomExtensionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest, com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> getAssignRandomExtensionMethod;
    if ((getAssignRandomExtensionMethod = PBXServiceGrpc.getAssignRandomExtensionMethod) == null) {
      synchronized (PBXServiceGrpc.class) {
        if ((getAssignRandomExtensionMethod = PBXServiceGrpc.getAssignRandomExtensionMethod) == null) {
          PBXServiceGrpc.getAssignRandomExtensionMethod = getAssignRandomExtensionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest, com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRandomExtension"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse.getDefaultInstance()))
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
     * Returns details of all PBX Users associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listPBXUsers(com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPBXUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the dial URL for a PBX User based on their extension
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getDialUrlByExtension(com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDialUrlByExtensionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns details of the PBX User associated with the pbx_user_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getPBXUser(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPBXUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns info about active extensions and name of active users
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listActivePBXProfiles(com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListActivePBXProfilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns details of all Ring Groups associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listRingGroups(com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRingGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns details of the Ring Group associated with the ring_group_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getRingGroup(com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns details of the SIP Account associated with the sip_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void getSIPAccount(com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSIPAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns details of all SIP Accounts associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void listSIPAccounts(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSIPAccountsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates details of the SIP Account for the specific SIP Account within the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.AlreadyExists: The extension already exists
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateSIPAccount(com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSIPAccountMethod(), responseObserver);
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
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void updateRingGroup(com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a ring group for the authenticated caller's ORG.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.OutOfRange: The request has fields that are out of range of constraints
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void createRingGroup(com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> responseObserver) {
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
    default void deleteRingGroup(com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRingGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assigns a random extension either to a PBX user or a Ring Group
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.NotFound: No free extension found.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    default void assignRandomExtension(com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> responseObserver) {
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
     * Returns details of all PBX Users associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listPBXUsers(com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPBXUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the dial URL for a PBX User based on their extension
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getDialUrlByExtension(com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDialUrlByExtensionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns details of the PBX User associated with the pbx_user_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getPBXUser(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPBXUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns info about active extensions and name of active users
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listActivePBXProfiles(com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListActivePBXProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns details of all Ring Groups associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listRingGroups(com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRingGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns details of the Ring Group associated with the ring_group_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getRingGroup(com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRingGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns details of the SIP Account associated with the sip_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void getSIPAccount(com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSIPAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns details of all SIP Accounts associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void listSIPAccounts(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSIPAccountsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates details of the SIP Account for the specific SIP Account within the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.AlreadyExists: The extension already exists
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateSIPAccount(com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSIPAccountMethod(), getCallOptions()), request, responseObserver);
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
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void updateRingGroup(com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> responseObserver) {
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
     *   - grpc.OutOfRange: The request has fields that are out of range of constraints
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void createRingGroup(com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> responseObserver) {
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
    public void deleteRingGroup(com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> responseObserver) {
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
     *   - grpc.NotFound: No free extension found.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public void assignRandomExtension(com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> responseObserver) {
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
     * Returns details of all PBX Users associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse listPBXUsers(com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPBXUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the dial URL for a PBX User based on their extension
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse getDialUrlByExtension(com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDialUrlByExtensionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns details of the PBX User associated with the pbx_user_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse getPBXUser(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPBXUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns info about active extensions and name of active users
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse listActivePBXProfiles(com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListActivePBXProfilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns details of all Ring Groups associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse listRingGroups(com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRingGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns details of the Ring Group associated with the ring_group_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse getRingGroup(com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRingGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns details of the SIP Account associated with the sip_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse getSIPAccount(com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSIPAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns details of all SIP Accounts associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse listSIPAccounts(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSIPAccountsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates details of the SIP Account for the specific SIP Account within the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.AlreadyExists: The extension already exists
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse updateSIPAccount(com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSIPAccountMethod(), getCallOptions(), request);
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
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse updateRingGroup(com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest request) {
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
     *   - grpc.OutOfRange: The request has fields that are out of range of constraints
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse createRingGroup(com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest request) {
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
    public com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse deleteRingGroup(com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest request) {
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
     *   - grpc.NotFound: No free extension found.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse assignRandomExtension(com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest request) {
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
     * Returns details of all PBX Users associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse> listPBXUsers(
        com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPBXUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the dial URL for a PBX User based on their extension
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse> getDialUrlByExtension(
        com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDialUrlByExtensionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns details of the PBX User associated with the pbx_user_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The user does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse> getPBXUser(
        com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPBXUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns info about active extensions and name of active users
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse> listActivePBXProfiles(
        com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListActivePBXProfilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns details of all Ring Groups associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse> listRingGroups(
        com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRingGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns details of the Ring Group associated with the ring_group_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse> getRingGroup(
        com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRingGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns details of the SIP Account associated with the sip_id
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.NotFound: The group does not exist or is not in the caller's ORG.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse> getSIPAccount(
        com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSIPAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns details of all SIP Accounts associated with the authenticated callers ORG
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse> listSIPAccounts(
        com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSIPAccountsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates details of the SIP Account for the specific SIP Account within the authenticated callers ORG.
     * Allows for updating, activating, and deactivating a user.
     * Required permissions:
     *   PBX-MANAGER
     * Errors:
     *   - grpc.InvalidArgument: The request is invalid.
     *   - grpc.AlreadyExists: The extension already exists
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse> updateSIPAccount(
        com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSIPAccountMethod(), getCallOptions()), request);
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
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse> updateRingGroup(
        com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest request) {
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
     *   - grpc.OutOfRange: The request has fields that are out of range of constraints
     *   - grpc.AlreadyExists: The extension or name already exists.
     *   - grpc.PermissionDenied: Caller doesn't have the required permissions.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse> createRingGroup(
        com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse> deleteRingGroup(
        com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest request) {
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
     *   - grpc.NotFound: No free extension found.
     *   - grpc.Internal: An internal error occurred.
     *   - grpc.Unavailable: The operation is currently unavailable. Likely a transient issue with a downstream service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse> assignRandomExtension(
        com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRandomExtensionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_PBXUSERS = 0;
  private static final int METHODID_GET_DIAL_URL_BY_EXTENSION = 1;
  private static final int METHODID_GET_PBXUSER = 2;
  private static final int METHODID_LIST_ACTIVE_PBXPROFILES = 3;
  private static final int METHODID_LIST_RING_GROUPS = 4;
  private static final int METHODID_GET_RING_GROUP = 5;
  private static final int METHODID_GET_SIPACCOUNT = 6;
  private static final int METHODID_LIST_SIPACCOUNTS = 7;
  private static final int METHODID_UPDATE_SIPACCOUNT = 8;
  private static final int METHODID_UPDATE_RING_GROUP = 9;
  private static final int METHODID_CREATE_RING_GROUP = 10;
  private static final int METHODID_DELETE_RING_GROUP = 11;
  private static final int METHODID_ASSIGN_RANDOM_EXTENSION = 12;

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
        case METHODID_LIST_PBXUSERS:
          serviceImpl.listPBXUsers((com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse>) responseObserver);
          break;
        case METHODID_GET_DIAL_URL_BY_EXTENSION:
          serviceImpl.getDialUrlByExtension((com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse>) responseObserver);
          break;
        case METHODID_GET_PBXUSER:
          serviceImpl.getPBXUser((com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse>) responseObserver);
          break;
        case METHODID_LIST_ACTIVE_PBXPROFILES:
          serviceImpl.listActivePBXProfiles((com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse>) responseObserver);
          break;
        case METHODID_LIST_RING_GROUPS:
          serviceImpl.listRingGroups((com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_RING_GROUP:
          serviceImpl.getRingGroup((com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse>) responseObserver);
          break;
        case METHODID_GET_SIPACCOUNT:
          serviceImpl.getSIPAccount((com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse>) responseObserver);
          break;
        case METHODID_LIST_SIPACCOUNTS:
          serviceImpl.listSIPAccounts((com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SIPACCOUNT:
          serviceImpl.updateSIPAccount((com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RING_GROUP:
          serviceImpl.updateRingGroup((com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse>) responseObserver);
          break;
        case METHODID_CREATE_RING_GROUP:
          serviceImpl.createRingGroup((com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_RING_GROUP:
          serviceImpl.deleteRingGroup((com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_RANDOM_EXTENSION:
          serviceImpl.assignRandomExtension((com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse>) responseObserver);
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
          getListPBXUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.ListPBXUsersRequest,
              com.tcn.cloud.api.services.pbx.v2.ListPBXUsersResponse>(
                service, METHODID_LIST_PBXUSERS)))
        .addMethod(
          getGetDialUrlByExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionRequest,
              com.tcn.cloud.api.services.pbx.v2.GetDialUrlByExtensionResponse>(
                service, METHODID_GET_DIAL_URL_BY_EXTENSION)))
        .addMethod(
          getGetPBXUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest,
              com.tcn.cloud.api.services.pbx.v2.GetPBXUserResponse>(
                service, METHODID_GET_PBXUSER)))
        .addMethod(
          getListActivePBXProfilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesRequest,
              com.tcn.cloud.api.services.pbx.v2.ListActivePBXProfilesResponse>(
                service, METHODID_LIST_ACTIVE_PBXPROFILES)))
        .addMethod(
          getListRingGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.ListRingGroupsRequest,
              com.tcn.cloud.api.services.pbx.v2.ListRingGroupsResponse>(
                service, METHODID_LIST_RING_GROUPS)))
        .addMethod(
          getGetRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.GetRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v2.GetRingGroupResponse>(
                service, METHODID_GET_RING_GROUP)))
        .addMethod(
          getGetSIPAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.GetSIPAccountRequest,
              com.tcn.cloud.api.services.pbx.v2.GetSIPAccountResponse>(
                service, METHODID_GET_SIPACCOUNT)))
        .addMethod(
          getListSIPAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsRequest,
              com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse>(
                service, METHODID_LIST_SIPACCOUNTS)))
        .addMethod(
          getUpdateSIPAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountRequest,
              com.tcn.cloud.api.services.pbx.v2.UpdateSIPAccountResponse>(
                service, METHODID_UPDATE_SIPACCOUNT)))
        .addMethod(
          getUpdateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v2.UpdateRingGroupResponse>(
                service, METHODID_UPDATE_RING_GROUP)))
        .addMethod(
          getCreateRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.CreateRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v2.CreateRingGroupResponse>(
                service, METHODID_CREATE_RING_GROUP)))
        .addMethod(
          getDeleteRingGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupRequest,
              com.tcn.cloud.api.services.pbx.v2.DeleteRingGroupResponse>(
                service, METHODID_DELETE_RING_GROUP)))
        .addMethod(
          getAssignRandomExtensionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionRequest,
              com.tcn.cloud.api.services.pbx.v2.AssignRandomExtensionResponse>(
                service, METHODID_ASSIGN_RANDOM_EXTENSION)))
        .build();
  }

  private static abstract class PBXServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PBXServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.getDescriptor();
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
              .addMethod(getListPBXUsersMethod())
              .addMethod(getGetDialUrlByExtensionMethod())
              .addMethod(getGetPBXUserMethod())
              .addMethod(getListActivePBXProfilesMethod())
              .addMethod(getListRingGroupsMethod())
              .addMethod(getGetRingGroupMethod())
              .addMethod(getGetSIPAccountMethod())
              .addMethod(getListSIPAccountsMethod())
              .addMethod(getUpdateSIPAccountMethod())
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
