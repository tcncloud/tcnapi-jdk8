package com.tcn.cloud.api.api.v1alpha1.org.users;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/org/users/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.org.users.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateUserMethod = UsersServiceGrpc.getCreateUserMethod) == null) {
          UsersServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDelegatedUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> getCreateDelegatedUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> getCreateDelegatedUserMethod;
    if ((getCreateDelegatedUserMethod = UsersServiceGrpc.getCreateDelegatedUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateDelegatedUserMethod = UsersServiceGrpc.getCreateDelegatedUserMethod) == null) {
          UsersServiceGrpc.getCreateDelegatedUserMethod = getCreateDelegatedUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDelegatedUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateDelegatedUser"))
              .build();
        }
      }
    }
    return getCreateDelegatedUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> getGetMyUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> getGetMyUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> getGetMyUserMethod;
    if ((getGetMyUserMethod = UsersServiceGrpc.getGetMyUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyUserMethod = UsersServiceGrpc.getGetMyUserMethod) == null) {
          UsersServiceGrpc.getGetMyUserMethod = getGetMyUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyUser"))
              .build();
        }
      }
    }
    return getGetMyUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UsersServiceGrpc.getGetUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserMethod = UsersServiceGrpc.getGetUserMethod) == null) {
          UsersServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> getGetUserByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> getGetUserByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> getGetUserByOrgIdMethod;
    if ((getGetUserByOrgIdMethod = UsersServiceGrpc.getGetUserByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserByOrgIdMethod = UsersServiceGrpc.getGetUserByOrgIdMethod) == null) {
          UsersServiceGrpc.getGetUserByOrgIdMethod = getGetUserByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserByOrgId"))
              .build();
        }
      }
    }
    return getGetUserByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> getListAgentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgents",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> getListAgentsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> getListAgentsMethod;
    if ((getListAgentsMethod = UsersServiceGrpc.getListAgentsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListAgentsMethod = UsersServiceGrpc.getListAgentsMethod) == null) {
          UsersServiceGrpc.getListAgentsMethod = getListAgentsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListAgents"))
              .build();
        }
      }
    }
    return getListAgentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> getListPublicUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPublicUsers",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> getListPublicUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> getListPublicUsersMethod;
    if ((getListPublicUsersMethod = UsersServiceGrpc.getListPublicUsersMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListPublicUsersMethod = UsersServiceGrpc.getListPublicUsersMethod) == null) {
          UsersServiceGrpc.getListPublicUsersMethod = getListPublicUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPublicUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListPublicUsers"))
              .build();
        }
      }
    }
    return getListPublicUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
          UsersServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> getListUsersByOrgIdMethod;
    if ((getListUsersByOrgIdMethod = UsersServiceGrpc.getListUsersByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersByOrgIdMethod = UsersServiceGrpc.getListUsersByOrgIdMethod) == null) {
          UsersServiceGrpc.getListUsersByOrgIdMethod = getListUsersByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUsersByOrgId"))
              .build();
        }
      }
    }
    return getListUsersByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> getListUsersByRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersByRegion",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> getListUsersByRegionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> getListUsersByRegionMethod;
    if ((getListUsersByRegionMethod = UsersServiceGrpc.getListUsersByRegionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersByRegionMethod = UsersServiceGrpc.getListUsersByRegionMethod) == null) {
          UsersServiceGrpc.getListUsersByRegionMethod = getListUsersByRegionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersByRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUsersByRegion"))
              .build();
        }
      }
    }
    return getListUsersByRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> getUpdateMyUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMyUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> getUpdateMyUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> getUpdateMyUserMethod;
    if ((getUpdateMyUserMethod = UsersServiceGrpc.getUpdateMyUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateMyUserMethod = UsersServiceGrpc.getUpdateMyUserMethod) == null) {
          UsersServiceGrpc.getUpdateMyUserMethod = getUpdateMyUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMyUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateMyUser"))
              .build();
        }
      }
    }
    return getUpdateMyUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
          UsersServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> getUpdateUserLabelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserLabels",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> getUpdateUserLabelsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> getUpdateUserLabelsMethod;
    if ((getUpdateUserLabelsMethod = UsersServiceGrpc.getUpdateUserLabelsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserLabelsMethod = UsersServiceGrpc.getUpdateUserLabelsMethod) == null) {
          UsersServiceGrpc.getUpdateUserLabelsMethod = getUpdateUserLabelsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserLabels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserLabels"))
              .build();
        }
      }
    }
    return getUpdateUserLabelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserCallerId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> getUpdateUserCallerIdMethod;
    if ((getUpdateUserCallerIdMethod = UsersServiceGrpc.getUpdateUserCallerIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserCallerIdMethod = UsersServiceGrpc.getUpdateUserCallerIdMethod) == null) {
          UsersServiceGrpc.getUpdateUserCallerIdMethod = getUpdateUserCallerIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserCallerId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserCallerId"))
              .build();
        }
      }
    }
    return getUpdateUserCallerIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisabled",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> getUpdateUserDisabledMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> getUpdateUserDisabledMethod;
    if ((getUpdateUserDisabledMethod = UsersServiceGrpc.getUpdateUserDisabledMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserDisabledMethod = UsersServiceGrpc.getUpdateUserDisabledMethod) == null) {
          UsersServiceGrpc.getUpdateUserDisabledMethod = getUpdateUserDisabledMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserDisabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserDisabled"))
              .build();
        }
      }
    }
    return getUpdateUserDisabledMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserDisabledByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> getUpdateUserDisabledByOrgIdMethod;
    if ((getUpdateUserDisabledByOrgIdMethod = UsersServiceGrpc.getUpdateUserDisabledByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserDisabledByOrgIdMethod = UsersServiceGrpc.getUpdateUserDisabledByOrgIdMethod) == null) {
          UsersServiceGrpc.getUpdateUserDisabledByOrgIdMethod = getUpdateUserDisabledByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserDisabledByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserDisabledByOrgId"))
              .build();
        }
      }
    }
    return getUpdateUserDisabledByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserPasswordResetLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> getGetMyUserPasswordResetLinkMethod;
    if ((getGetMyUserPasswordResetLinkMethod = UsersServiceGrpc.getGetMyUserPasswordResetLinkMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyUserPasswordResetLinkMethod = UsersServiceGrpc.getGetMyUserPasswordResetLinkMethod) == null) {
          UsersServiceGrpc.getGetMyUserPasswordResetLinkMethod = getGetMyUserPasswordResetLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUserPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyUserPasswordResetLink"))
              .build();
        }
      }
    }
    return getGetMyUserPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPasswordResetLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> getGetUserPasswordResetLinkMethod;
    if ((getGetUserPasswordResetLinkMethod = UsersServiceGrpc.getGetUserPasswordResetLinkMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserPasswordResetLinkMethod = UsersServiceGrpc.getGetUserPasswordResetLinkMethod) == null) {
          UsersServiceGrpc.getGetUserPasswordResetLinkMethod = getGetUserPasswordResetLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserPasswordResetLink"))
              .build();
        }
      }
    }
    return getGetUserPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPasswordResetLinkByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> getGetUserPasswordResetLinkByOrgIdMethod;
    if ((getGetUserPasswordResetLinkByOrgIdMethod = UsersServiceGrpc.getGetUserPasswordResetLinkByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserPasswordResetLinkByOrgIdMethod = UsersServiceGrpc.getGetUserPasswordResetLinkByOrgIdMethod) == null) {
          UsersServiceGrpc.getGetUserPasswordResetLinkByOrgIdMethod = getGetUserPasswordResetLinkByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPasswordResetLinkByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserPasswordResetLinkByOrgId"))
              .build();
        }
      }
    }
    return getGetUserPasswordResetLinkByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> getCreatePasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePasswordResetLink",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> getCreatePasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> getCreatePasswordResetLinkMethod;
    if ((getCreatePasswordResetLinkMethod = UsersServiceGrpc.getCreatePasswordResetLinkMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreatePasswordResetLinkMethod = UsersServiceGrpc.getCreatePasswordResetLinkMethod) == null) {
          UsersServiceGrpc.getCreatePasswordResetLinkMethod = getCreatePasswordResetLinkMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreatePasswordResetLink"))
              .build();
        }
      }
    }
    return getCreatePasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> getCreatePasswordResetLinkByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePasswordResetLinkByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> getCreatePasswordResetLinkByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> getCreatePasswordResetLinkByOrgIdMethod;
    if ((getCreatePasswordResetLinkByOrgIdMethod = UsersServiceGrpc.getCreatePasswordResetLinkByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreatePasswordResetLinkByOrgIdMethod = UsersServiceGrpc.getCreatePasswordResetLinkByOrgIdMethod) == null) {
          UsersServiceGrpc.getCreatePasswordResetLinkByOrgIdMethod = getCreatePasswordResetLinkByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePasswordResetLinkByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreatePasswordResetLinkByOrgId"))
              .build();
        }
      }
    }
    return getCreatePasswordResetLinkByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> getGetUserLoginInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLoginInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> getGetUserLoginInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> getGetUserLoginInfoMethod;
    if ((getGetUserLoginInfoMethod = UsersServiceGrpc.getGetUserLoginInfoMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserLoginInfoMethod = UsersServiceGrpc.getGetUserLoginInfoMethod) == null) {
          UsersServiceGrpc.getGetUserLoginInfoMethod = getGetUserLoginInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLoginInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserLoginInfo"))
              .build();
        }
      }
    }
    return getGetUserLoginInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEmailVerified",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> getGetUserEmailVerifiedMethod;
    if ((getGetUserEmailVerifiedMethod = UsersServiceGrpc.getGetUserEmailVerifiedMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserEmailVerifiedMethod = UsersServiceGrpc.getGetUserEmailVerifiedMethod) == null) {
          UsersServiceGrpc.getGetUserEmailVerifiedMethod = getGetUserEmailVerifiedMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEmailVerified"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserEmailVerified"))
              .build();
        }
      }
    }
    return getGetUserEmailVerifiedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserEmailVerifiedByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> getGetUserEmailVerifiedByOrgIdMethod;
    if ((getGetUserEmailVerifiedByOrgIdMethod = UsersServiceGrpc.getGetUserEmailVerifiedByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserEmailVerifiedByOrgIdMethod = UsersServiceGrpc.getGetUserEmailVerifiedByOrgIdMethod) == null) {
          UsersServiceGrpc.getGetUserEmailVerifiedByOrgIdMethod = getGetUserEmailVerifiedByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserEmailVerifiedByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserEmailVerifiedByOrgId"))
              .build();
        }
      }
    }
    return getGetUserEmailVerifiedByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> getResetMyPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetMyPassword",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> getResetMyPasswordMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> getResetMyPasswordMethod;
    if ((getResetMyPasswordMethod = UsersServiceGrpc.getResetMyPasswordMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getResetMyPasswordMethod = UsersServiceGrpc.getResetMyPasswordMethod) == null) {
          UsersServiceGrpc.getResetMyPasswordMethod = getResetMyPasswordMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetMyPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ResetMyPassword"))
              .build();
        }
      }
    }
    return getResetMyPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> getResetUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetUserPassword",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> getResetUserPasswordMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> getResetUserPasswordMethod;
    if ((getResetUserPasswordMethod = UsersServiceGrpc.getResetUserPasswordMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getResetUserPasswordMethod = UsersServiceGrpc.getResetUserPasswordMethod) == null) {
          UsersServiceGrpc.getResetUserPasswordMethod = getResetUserPasswordMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ResetUserPassword"))
              .build();
        }
      }
    }
    return getResetUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> getResetUserPasswordByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetUserPasswordByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> getResetUserPasswordByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> getResetUserPasswordByOrgIdMethod;
    if ((getResetUserPasswordByOrgIdMethod = UsersServiceGrpc.getResetUserPasswordByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getResetUserPasswordByOrgIdMethod = UsersServiceGrpc.getResetUserPasswordByOrgIdMethod) == null) {
          UsersServiceGrpc.getResetUserPasswordByOrgIdMethod = getResetUserPasswordByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetUserPasswordByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ResetUserPasswordByOrgId"))
              .build();
        }
      }
    }
    return getResetUserPasswordByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserEmailVerification",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> getSendUserEmailVerificationMethod;
    if ((getSendUserEmailVerificationMethod = UsersServiceGrpc.getSendUserEmailVerificationMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendUserEmailVerificationMethod = UsersServiceGrpc.getSendUserEmailVerificationMethod) == null) {
          UsersServiceGrpc.getSendUserEmailVerificationMethod = getSendUserEmailVerificationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendUserEmailVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendUserEmailVerification"))
              .build();
        }
      }
    }
    return getSendUserEmailVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserEmailVerificationByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> getSendUserEmailVerificationByOrgIdMethod;
    if ((getSendUserEmailVerificationByOrgIdMethod = UsersServiceGrpc.getSendUserEmailVerificationByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendUserEmailVerificationByOrgIdMethod = UsersServiceGrpc.getSendUserEmailVerificationByOrgIdMethod) == null) {
          UsersServiceGrpc.getSendUserEmailVerificationByOrgIdMethod = getSendUserEmailVerificationByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendUserEmailVerificationByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendUserEmailVerificationByOrgId"))
              .build();
        }
      }
    }
    return getSendUserEmailVerificationByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> getSendPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPasswordReset",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> getSendPasswordResetMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> getSendPasswordResetMethod;
    if ((getSendPasswordResetMethod = UsersServiceGrpc.getSendPasswordResetMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendPasswordResetMethod = UsersServiceGrpc.getSendPasswordResetMethod) == null) {
          UsersServiceGrpc.getSendPasswordResetMethod = getSendPasswordResetMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendPasswordReset"))
              .build();
        }
      }
    }
    return getSendPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> getSendPasswordResetByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPasswordResetByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> getSendPasswordResetByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> getSendPasswordResetByOrgIdMethod;
    if ((getSendPasswordResetByOrgIdMethod = UsersServiceGrpc.getSendPasswordResetByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSendPasswordResetByOrgIdMethod = UsersServiceGrpc.getSendPasswordResetByOrgIdMethod) == null) {
          UsersServiceGrpc.getSendPasswordResetByOrgIdMethod = getSendPasswordResetByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPasswordResetByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SendPasswordResetByOrgId"))
              .build();
        }
      }
    }
    return getSendPasswordResetByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> getGetUserSessionDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSessionData",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> getGetUserSessionDataMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> getGetUserSessionDataMethod;
    if ((getGetUserSessionDataMethod = UsersServiceGrpc.getGetUserSessionDataMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserSessionDataMethod = UsersServiceGrpc.getGetUserSessionDataMethod) == null) {
          UsersServiceGrpc.getGetUserSessionDataMethod = getGetUserSessionDataMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSessionData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserSessionData"))
              .build();
        }
      }
    }
    return getGetUserSessionDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> getGetAgentProfileGroupMethod;
    if ((getGetAgentProfileGroupMethod = UsersServiceGrpc.getGetAgentProfileGroupMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetAgentProfileGroupMethod = UsersServiceGrpc.getGetAgentProfileGroupMethod) == null) {
          UsersServiceGrpc.getGetAgentProfileGroupMethod = getGetAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetAgentProfileGroup"))
              .build();
        }
      }
    }
    return getGetAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> getListAgentProfileGroupsMethod;
    if ((getListAgentProfileGroupsMethod = UsersServiceGrpc.getListAgentProfileGroupsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListAgentProfileGroupsMethod = UsersServiceGrpc.getListAgentProfileGroupsMethod) == null) {
          UsersServiceGrpc.getListAgentProfileGroupsMethod = getListAgentProfileGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListAgentProfileGroups"))
              .build();
        }
      }
    }
    return getListAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> getUpdateAgentProfileGroupMethod;
    if ((getUpdateAgentProfileGroupMethod = UsersServiceGrpc.getUpdateAgentProfileGroupMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateAgentProfileGroupMethod = UsersServiceGrpc.getUpdateAgentProfileGroupMethod) == null) {
          UsersServiceGrpc.getUpdateAgentProfileGroupMethod = getUpdateAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateAgentProfileGroup"))
              .build();
        }
      }
    }
    return getUpdateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> getCreateAgentProfileGroupMethod;
    if ((getCreateAgentProfileGroupMethod = UsersServiceGrpc.getCreateAgentProfileGroupMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateAgentProfileGroupMethod = UsersServiceGrpc.getCreateAgentProfileGroupMethod) == null) {
          UsersServiceGrpc.getCreateAgentProfileGroupMethod = getCreateAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateAgentProfileGroup"))
              .build();
        }
      }
    }
    return getCreateAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgentProfileGroup",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> getDeleteAgentProfileGroupMethod;
    if ((getDeleteAgentProfileGroupMethod = UsersServiceGrpc.getDeleteAgentProfileGroupMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteAgentProfileGroupMethod = UsersServiceGrpc.getDeleteAgentProfileGroupMethod) == null) {
          UsersServiceGrpc.getDeleteAgentProfileGroupMethod = getDeleteAgentProfileGroupMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgentProfileGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("DeleteAgentProfileGroup"))
              .build();
        }
      }
    }
    return getDeleteAgentProfileGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignAgentProfileGroups",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> getAssignAgentProfileGroupsMethod;
    if ((getAssignAgentProfileGroupsMethod = UsersServiceGrpc.getAssignAgentProfileGroupsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getAssignAgentProfileGroupsMethod = UsersServiceGrpc.getAssignAgentProfileGroupsMethod) == null) {
          UsersServiceGrpc.getAssignAgentProfileGroupsMethod = getAssignAgentProfileGroupsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignAgentProfileGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("AssignAgentProfileGroups"))
              .build();
        }
      }
    }
    return getAssignAgentProfileGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> getAddUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> getAddUserSubscriptionMethod;
    if ((getAddUserSubscriptionMethod = UsersServiceGrpc.getAddUserSubscriptionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getAddUserSubscriptionMethod = UsersServiceGrpc.getAddUserSubscriptionMethod) == null) {
          UsersServiceGrpc.getAddUserSubscriptionMethod = getAddUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("AddUserSubscription"))
              .build();
        }
      }
    }
    return getAddUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> getAddUserSubscriptionByUserIdMethod;
    if ((getAddUserSubscriptionByUserIdMethod = UsersServiceGrpc.getAddUserSubscriptionByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getAddUserSubscriptionByUserIdMethod = UsersServiceGrpc.getAddUserSubscriptionByUserIdMethod) == null) {
          UsersServiceGrpc.getAddUserSubscriptionByUserIdMethod = getAddUserSubscriptionByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("AddUserSubscriptionByUserId"))
              .build();
        }
      }
    }
    return getAddUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> getGetUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> getGetUserSubscriptionMethod;
    if ((getGetUserSubscriptionMethod = UsersServiceGrpc.getGetUserSubscriptionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserSubscriptionMethod = UsersServiceGrpc.getGetUserSubscriptionMethod) == null) {
          UsersServiceGrpc.getGetUserSubscriptionMethod = getGetUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserSubscription"))
              .build();
        }
      }
    }
    return getGetUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> getGetUserSubscriptionByUserIdMethod;
    if ((getGetUserSubscriptionByUserIdMethod = UsersServiceGrpc.getGetUserSubscriptionByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserSubscriptionByUserIdMethod = UsersServiceGrpc.getGetUserSubscriptionByUserIdMethod) == null) {
          UsersServiceGrpc.getGetUserSubscriptionByUserIdMethod = getGetUserSubscriptionByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserSubscriptionByUserId"))
              .build();
        }
      }
    }
    return getGetUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> getUpdateUserSubscriptionMethod;
    if ((getUpdateUserSubscriptionMethod = UsersServiceGrpc.getUpdateUserSubscriptionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserSubscriptionMethod = UsersServiceGrpc.getUpdateUserSubscriptionMethod) == null) {
          UsersServiceGrpc.getUpdateUserSubscriptionMethod = getUpdateUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserSubscription"))
              .build();
        }
      }
    }
    return getUpdateUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> getUpdateUserSubscriptionByUserIdMethod;
    if ((getUpdateUserSubscriptionByUserIdMethod = UsersServiceGrpc.getUpdateUserSubscriptionByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserSubscriptionByUserIdMethod = UsersServiceGrpc.getUpdateUserSubscriptionByUserIdMethod) == null) {
          UsersServiceGrpc.getUpdateUserSubscriptionByUserIdMethod = getUpdateUserSubscriptionByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUserSubscriptionByUserId"))
              .build();
        }
      }
    }
    return getUpdateUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscription",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> getRemoveUserSubscriptionMethod;
    if ((getRemoveUserSubscriptionMethod = UsersServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRemoveUserSubscriptionMethod = UsersServiceGrpc.getRemoveUserSubscriptionMethod) == null) {
          UsersServiceGrpc.getRemoveUserSubscriptionMethod = getRemoveUserSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RemoveUserSubscription"))
              .build();
        }
      }
    }
    return getRemoveUserSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUserSubscriptionByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> getRemoveUserSubscriptionByUserIdMethod;
    if ((getRemoveUserSubscriptionByUserIdMethod = UsersServiceGrpc.getRemoveUserSubscriptionByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRemoveUserSubscriptionByUserIdMethod = UsersServiceGrpc.getRemoveUserSubscriptionByUserIdMethod) == null) {
          UsersServiceGrpc.getRemoveUserSubscriptionByUserIdMethod = getRemoveUserSubscriptionByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveUserSubscriptionByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RemoveUserSubscriptionByUserId"))
              .build();
        }
      }
    }
    return getRemoveUserSubscriptionByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> getListUserSubscriptionsMethod;
    if ((getListUserSubscriptionsMethod = UsersServiceGrpc.getListUserSubscriptionsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUserSubscriptionsMethod = UsersServiceGrpc.getListUserSubscriptionsMethod) == null) {
          UsersServiceGrpc.getListUserSubscriptionsMethod = getListUserSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUserSubscriptions"))
              .build();
        }
      }
    }
    return getListUserSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUserSubscriptionsByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> getListUserSubscriptionsByUserIdMethod;
    if ((getListUserSubscriptionsByUserIdMethod = UsersServiceGrpc.getListUserSubscriptionsByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUserSubscriptionsByUserIdMethod = UsersServiceGrpc.getListUserSubscriptionsByUserIdMethod) == null) {
          UsersServiceGrpc.getListUserSubscriptionsByUserIdMethod = getListUserSubscriptionsByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUserSubscriptionsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUserSubscriptionsByUserId"))
              .build();
        }
      }
    }
    return getListUserSubscriptionsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrgSubscriptions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> getListOrgSubscriptionsMethod;
    if ((getListOrgSubscriptionsMethod = UsersServiceGrpc.getListOrgSubscriptionsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListOrgSubscriptionsMethod = UsersServiceGrpc.getListOrgSubscriptionsMethod) == null) {
          UsersServiceGrpc.getListOrgSubscriptionsMethod = getListOrgSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrgSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListOrgSubscriptions"))
              .build();
        }
      }
    }
    return getListOrgSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> getCreateAuthTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthToken",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> getCreateAuthTokenMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> getCreateAuthTokenMethod;
    if ((getCreateAuthTokenMethod = UsersServiceGrpc.getCreateAuthTokenMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateAuthTokenMethod = UsersServiceGrpc.getCreateAuthTokenMethod) == null) {
          UsersServiceGrpc.getCreateAuthTokenMethod = getCreateAuthTokenMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateAuthToken"))
              .build();
        }
      }
    }
    return getCreateAuthTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> getCreateAuthTokenByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthTokenByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> getCreateAuthTokenByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> getCreateAuthTokenByUserIdMethod;
    if ((getCreateAuthTokenByUserIdMethod = UsersServiceGrpc.getCreateAuthTokenByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getCreateAuthTokenByUserIdMethod = UsersServiceGrpc.getCreateAuthTokenByUserIdMethod) == null) {
          UsersServiceGrpc.getCreateAuthTokenByUserIdMethod = getCreateAuthTokenByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthTokenByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("CreateAuthTokenByUserId"))
              .build();
        }
      }
    }
    return getCreateAuthTokenByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> getListAuthTokensMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthTokens",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> getListAuthTokensMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> getListAuthTokensMethod;
    if ((getListAuthTokensMethod = UsersServiceGrpc.getListAuthTokensMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListAuthTokensMethod = UsersServiceGrpc.getListAuthTokensMethod) == null) {
          UsersServiceGrpc.getListAuthTokensMethod = getListAuthTokensMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthTokens"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListAuthTokens"))
              .build();
        }
      }
    }
    return getListAuthTokensMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> getListAuthTokensByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthTokensByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> getListAuthTokensByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> getListAuthTokensByUserIdMethod;
    if ((getListAuthTokensByUserIdMethod = UsersServiceGrpc.getListAuthTokensByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListAuthTokensByUserIdMethod = UsersServiceGrpc.getListAuthTokensByUserIdMethod) == null) {
          UsersServiceGrpc.getListAuthTokensByUserIdMethod = getListAuthTokensByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthTokensByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListAuthTokensByUserId"))
              .build();
        }
      }
    }
    return getListAuthTokensByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> getSetAuthTokenExpirationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAuthTokenExpiration",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> getSetAuthTokenExpirationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> getSetAuthTokenExpirationMethod;
    if ((getSetAuthTokenExpirationMethod = UsersServiceGrpc.getSetAuthTokenExpirationMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSetAuthTokenExpirationMethod = UsersServiceGrpc.getSetAuthTokenExpirationMethod) == null) {
          UsersServiceGrpc.getSetAuthTokenExpirationMethod = getSetAuthTokenExpirationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAuthTokenExpiration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SetAuthTokenExpiration"))
              .build();
        }
      }
    }
    return getSetAuthTokenExpirationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> getSetAuthTokenExpirationByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAuthTokenExpirationByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> getSetAuthTokenExpirationByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> getSetAuthTokenExpirationByUserIdMethod;
    if ((getSetAuthTokenExpirationByUserIdMethod = UsersServiceGrpc.getSetAuthTokenExpirationByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSetAuthTokenExpirationByUserIdMethod = UsersServiceGrpc.getSetAuthTokenExpirationByUserIdMethod) == null) {
          UsersServiceGrpc.getSetAuthTokenExpirationByUserIdMethod = getSetAuthTokenExpirationByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAuthTokenExpirationByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SetAuthTokenExpirationByUserId"))
              .build();
        }
      }
    }
    return getSetAuthTokenExpirationByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> getDeleteAuthTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthToken",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> getDeleteAuthTokenMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> getDeleteAuthTokenMethod;
    if ((getDeleteAuthTokenMethod = UsersServiceGrpc.getDeleteAuthTokenMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteAuthTokenMethod = UsersServiceGrpc.getDeleteAuthTokenMethod) == null) {
          UsersServiceGrpc.getDeleteAuthTokenMethod = getDeleteAuthTokenMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("DeleteAuthToken"))
              .build();
        }
      }
    }
    return getDeleteAuthTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> getDeleteAuthTokenByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthTokenByUserId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> getDeleteAuthTokenByUserIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> getDeleteAuthTokenByUserIdMethod;
    if ((getDeleteAuthTokenByUserIdMethod = UsersServiceGrpc.getDeleteAuthTokenByUserIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteAuthTokenByUserIdMethod = UsersServiceGrpc.getDeleteAuthTokenByUserIdMethod) == null) {
          UsersServiceGrpc.getDeleteAuthTokenByUserIdMethod = getDeleteAuthTokenByUserIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthTokenByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("DeleteAuthTokenByUserId"))
              .build();
        }
      }
    }
    return getDeleteAuthTokenByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> getRefreshMfaLockoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshMfaLockout",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> getRefreshMfaLockoutMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> getRefreshMfaLockoutMethod;
    if ((getRefreshMfaLockoutMethod = UsersServiceGrpc.getRefreshMfaLockoutMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRefreshMfaLockoutMethod = UsersServiceGrpc.getRefreshMfaLockoutMethod) == null) {
          UsersServiceGrpc.getRefreshMfaLockoutMethod = getRefreshMfaLockoutMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshMfaLockout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RefreshMfaLockout"))
              .build();
        }
      }
    }
    return getRefreshMfaLockoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> getRefreshMfaLockoutByOrgIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshMfaLockoutByOrgId",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> getRefreshMfaLockoutByOrgIdMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> getRefreshMfaLockoutByOrgIdMethod;
    if ((getRefreshMfaLockoutByOrgIdMethod = UsersServiceGrpc.getRefreshMfaLockoutByOrgIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRefreshMfaLockoutByOrgIdMethod = UsersServiceGrpc.getRefreshMfaLockoutByOrgIdMethod) == null) {
          UsersServiceGrpc.getRefreshMfaLockoutByOrgIdMethod = getRefreshMfaLockoutByOrgIdMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshMfaLockoutByOrgId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RefreshMfaLockoutByOrgId"))
              .build();
        }
      }
    }
    return getRefreshMfaLockoutByOrgIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> getSetMfaTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMfaType",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> getSetMfaTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> getSetMfaTypeMethod;
    if ((getSetMfaTypeMethod = UsersServiceGrpc.getSetMfaTypeMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSetMfaTypeMethod = UsersServiceGrpc.getSetMfaTypeMethod) == null) {
          UsersServiceGrpc.getSetMfaTypeMethod = getSetMfaTypeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMfaType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SetMfaType"))
              .build();
        }
      }
    }
    return getSetMfaTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> getSetMyMfaTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMyMfaType",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> getSetMyMfaTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> getSetMyMfaTypeMethod;
    if ((getSetMyMfaTypeMethod = UsersServiceGrpc.getSetMyMfaTypeMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getSetMyMfaTypeMethod = UsersServiceGrpc.getSetMyMfaTypeMethod) == null) {
          UsersServiceGrpc.getSetMyMfaTypeMethod = getSetMyMfaTypeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest, com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMyMfaType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("SetMyMfaType"))
              .build();
        }
      }
    }
    return getSetMyMfaTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> getEnableUserMfaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableUserMfa",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> getEnableUserMfaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest, com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> getEnableUserMfaMethod;
    if ((getEnableUserMfaMethod = UsersServiceGrpc.getEnableUserMfaMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getEnableUserMfaMethod = UsersServiceGrpc.getEnableUserMfaMethod) == null) {
          UsersServiceGrpc.getEnableUserMfaMethod = getEnableUserMfaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest, com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableUserMfa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("EnableUserMfa"))
              .build();
        }
      }
    }
    return getEnableUserMfaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> getEnableMyUserMfaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableMyUserMfa",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> getEnableMyUserMfaMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest, com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> getEnableMyUserMfaMethod;
    if ((getEnableMyUserMfaMethod = UsersServiceGrpc.getEnableMyUserMfaMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getEnableMyUserMfaMethod = UsersServiceGrpc.getEnableMyUserMfaMethod) == null) {
          UsersServiceGrpc.getEnableMyUserMfaMethod = getEnableMyUserMfaMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest, com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableMyUserMfa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("EnableMyUserMfa"))
              .build();
        }
      }
    }
    return getEnableMyUserMfaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> getGetUserMfaInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserMfaInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> getGetUserMfaInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> getGetUserMfaInfoMethod;
    if ((getGetUserMfaInfoMethod = UsersServiceGrpc.getGetUserMfaInfoMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserMfaInfoMethod = UsersServiceGrpc.getGetUserMfaInfoMethod) == null) {
          UsersServiceGrpc.getGetUserMfaInfoMethod = getGetUserMfaInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserMfaInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUserMfaInfo"))
              .build();
        }
      }
    }
    return getGetUserMfaInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> getGetMyUserMfaInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyUserMfaInfo",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> getGetMyUserMfaInfoMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> getGetMyUserMfaInfoMethod;
    if ((getGetMyUserMfaInfoMethod = UsersServiceGrpc.getGetMyUserMfaInfoMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyUserMfaInfoMethod = UsersServiceGrpc.getGetMyUserMfaInfoMethod) == null) {
          UsersServiceGrpc.getGetMyUserMfaInfoMethod = getGetMyUserMfaInfoMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest, com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyUserMfaInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyUserMfaInfo"))
              .build();
        }
      }
    }
    return getGetMyUserMfaInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> getAddGroupedUserIPRestrictionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGroupedUserIPRestrictions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> getAddGroupedUserIPRestrictionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> getAddGroupedUserIPRestrictionsMethod;
    if ((getAddGroupedUserIPRestrictionsMethod = UsersServiceGrpc.getAddGroupedUserIPRestrictionsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getAddGroupedUserIPRestrictionsMethod = UsersServiceGrpc.getAddGroupedUserIPRestrictionsMethod) == null) {
          UsersServiceGrpc.getAddGroupedUserIPRestrictionsMethod = getAddGroupedUserIPRestrictionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGroupedUserIPRestrictions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("AddGroupedUserIPRestrictions"))
              .build();
        }
      }
    }
    return getAddGroupedUserIPRestrictionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> getRemoveGroupedUserIPRestrictionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveGroupedUserIPRestrictions",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> getRemoveGroupedUserIPRestrictionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> getRemoveGroupedUserIPRestrictionsMethod;
    if ((getRemoveGroupedUserIPRestrictionsMethod = UsersServiceGrpc.getRemoveGroupedUserIPRestrictionsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getRemoveGroupedUserIPRestrictionsMethod = UsersServiceGrpc.getRemoveGroupedUserIPRestrictionsMethod) == null) {
          UsersServiceGrpc.getRemoveGroupedUserIPRestrictionsMethod = getRemoveGroupedUserIPRestrictionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveGroupedUserIPRestrictions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("RemoveGroupedUserIPRestrictions"))
              .build();
        }
      }
    }
    return getRemoveGroupedUserIPRestrictionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> getListUsersAllowedIpsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersAllowedIps",
      requestType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest,
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> getListUsersAllowedIpsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> getListUsersAllowedIpsMethod;
    if ((getListUsersAllowedIpsMethod = UsersServiceGrpc.getListUsersAllowedIpsMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersAllowedIpsMethod = UsersServiceGrpc.getListUsersAllowedIpsMethod) == null) {
          UsersServiceGrpc.getListUsersAllowedIpsMethod = getListUsersAllowedIpsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest, com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersAllowedIps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUsersAllowedIps"))
              .build();
        }
      }
    }
    return getListUsersAllowedIpsMethod;
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
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    default void createUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    default void createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDelegatedUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    default void getMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    default void getUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    default void getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    default void listAgents(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListPublicUsers returns a list of users with limited data for most applications.
     * </pre>
     */
    default void listPublicUsers(com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPublicUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    default void listUsers(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    default void listUsersByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    default void listUsersByRegion(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersByRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    default void updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMyUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    default void updateUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    default void updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserLabelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    default void updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserCallerIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    default void updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserDisabledMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    default void updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserDisabledByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    default void getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserPasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    default void getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    default void getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPasswordResetLinkByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePasswordResetLink creates a password reset link for the given user id.
     * </pre>
     */
    default void createPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePasswordResetLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreatePasswordResetLinkByOrgId creates a password reset link for the given user id.
     * </pre>
     */
    default void createPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePasswordResetLinkByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    default void getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserLoginInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    default void getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEmailVerifiedMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    default void getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserEmailVerifiedByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetMyPassword resets the user's password.
     * </pre>
     */
    default void resetMyPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMyPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetUserPassword resets the user's password.
     * </pre>
     */
    default void resetUserPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUserPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResetUserPasswordByOrgId resets the user's password.
     * </pre>
     */
    default void resetUserPasswordByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUserPasswordByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    default void sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUserEmailVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    default void sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUserEmailVerificationByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendPasswordReset sends a password reset email to the user.
     * </pre>
     */
    default void sendPasswordReset(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * SendPasswordResetByOrgId sends a password reset email to the user.
     * </pre>
     */
    default void sendPasswordResetByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPasswordResetByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    default void getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSessionDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    default void getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    default void listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    default void updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    default void createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    default void deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgentProfileGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    default void assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignAgentProfileGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    default void addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    default void addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    default void getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    default void getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    default void updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    default void updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    default void removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserSubscriptionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    default void removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveUserSubscriptionByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    default void listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    default void listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUserSubscriptionsByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    default void listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrgSubscriptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AUTH TOKEN
     * CreateAuthToken creates an auth token for the current user.
     * </pre>
     */
    default void createAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAuthTokenByUserId creates an auth token for the given user.
     * </pre>
     */
    default void createAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthTokenByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAuthTokens list tokens of current user.
     * </pre>
     */
    default void listAuthTokens(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthTokensMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAuthTokensByUserId list tokens of given user.
     * </pre>
     */
    default void listAuthTokensByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthTokensByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAuthTokenExpiration sets expiration back one year for current user.
     * </pre>
     */
    default void setAuthTokenExpiration(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAuthTokenExpirationMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetAuthTokenExpirationByUserId sets expiration back one year for given user.
     * </pre>
     */
    default void setAuthTokenExpirationByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAuthTokenExpirationByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthToken deletes a given auth token for the current user.
     * </pre>
     */
    default void deleteAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthTokenByUserId deletes a given auth token for the given user.
     * </pre>
     */
    default void deleteAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthTokenByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefreshMfaLockout resets the lockout timer for the given user.
     * </pre>
     */
    default void refreshMfaLockout(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshMfaLockoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefreshMfaLockoutByOrgId resets the lockout timer for the given user and org id.
     * </pre>
     */
    default void refreshMfaLockoutByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshMfaLockoutByOrgIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetMfaType sets the given user's mfa type.
     * </pre>
     */
    default void setMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMfaTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetMyMfaType sets the current user's mfa type.
     * </pre>
     */
    default void setMyMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMyMfaTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableUserMfa enables or disables mfa for the given user
     * </pre>
     */
    default void enableUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableUserMfaMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableMyUserMfa enables mfa for the current user
     * </pre>
     */
    default void enableMyUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMyUserMfaMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetUserMfaInfo returns the mfa info for the given user.
     * </pre>
     */
    default void getUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMfaInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetMyUserMfaInfo returns the mfa info for the current user.
     * </pre>
     */
    default void getMyUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyUserMfaInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddGroupedUserIPRestrictions adds a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    default void addGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGroupedUserIPRestrictionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveGroupedUserIPRestrictions removes a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    default void removeGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveGroupedUserIPRestrictionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersAllowedIps returns the list of allowed IPs for the user.
     * </pre>
     */
    default void listUsersAllowedIps(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersAllowedIpsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
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
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public void createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public void getUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public void getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    public void listAgents(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAgentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListPublicUsers returns a list of users with limited data for most applications.
     * </pre>
     */
    public void listPublicUsers(com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListPublicUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public void listUsers(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    public void listUsersByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListUsersByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    public void listUsersByRegion(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListUsersByRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public void updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMyUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public void updateUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public void updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserLabelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public void updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserCallerIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public void updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public void updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserDisabledByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public void getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public void getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePasswordResetLink creates a password reset link for the given user id.
     * </pre>
     */
    public void createPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreatePasswordResetLinkByOrgId creates a password reset link for the given user id.
     * </pre>
     */
    public void createPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePasswordResetLinkByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public void getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserLoginInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public void getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetMyPassword resets the user's password.
     * </pre>
     */
    public void resetMyPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMyPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetUserPassword resets the user's password.
     * </pre>
     */
    public void resetUserPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResetUserPasswordByOrgId resets the user's password.
     * </pre>
     */
    public void resetUserPasswordByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUserPasswordByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public void sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendPasswordReset sends a password reset email to the user.
     * </pre>
     */
    public void sendPasswordReset(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SendPasswordResetByOrgId sends a password reset email to the user.
     * </pre>
     */
    public void sendPasswordResetByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPasswordResetByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public void getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSessionDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public void getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public void listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public void deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public void assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public void addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public void getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public void getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public void updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public void updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public void removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public void removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public void listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUserSubscriptionsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public void listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AUTH TOKEN
     * CreateAuthToken creates an auth token for the current user.
     * </pre>
     */
    public void createAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAuthTokenByUserId creates an auth token for the given user.
     * </pre>
     */
    public void createAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthTokenByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAuthTokens list tokens of current user.
     * </pre>
     */
    public void listAuthTokens(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthTokensMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAuthTokensByUserId list tokens of given user.
     * </pre>
     */
    public void listAuthTokensByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthTokensByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAuthTokenExpiration sets expiration back one year for current user.
     * </pre>
     */
    public void setAuthTokenExpiration(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAuthTokenExpirationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetAuthTokenExpirationByUserId sets expiration back one year for given user.
     * </pre>
     */
    public void setAuthTokenExpirationByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAuthTokenExpirationByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthToken deletes a given auth token for the current user.
     * </pre>
     */
    public void deleteAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAuthTokenByUserId deletes a given auth token for the given user.
     * </pre>
     */
    public void deleteAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthTokenByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefreshMfaLockout resets the lockout timer for the given user.
     * </pre>
     */
    public void refreshMfaLockout(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshMfaLockoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefreshMfaLockoutByOrgId resets the lockout timer for the given user and org id.
     * </pre>
     */
    public void refreshMfaLockoutByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshMfaLockoutByOrgIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetMfaType sets the given user's mfa type.
     * </pre>
     */
    public void setMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMfaTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetMyMfaType sets the current user's mfa type.
     * </pre>
     */
    public void setMyMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMyMfaTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableUserMfa enables or disables mfa for the given user
     * </pre>
     */
    public void enableUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableUserMfaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableMyUserMfa enables mfa for the current user
     * </pre>
     */
    public void enableMyUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMyUserMfaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetUserMfaInfo returns the mfa info for the given user.
     * </pre>
     */
    public void getUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMfaInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetMyUserMfaInfo returns the mfa info for the current user.
     * </pre>
     */
    public void getMyUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyUserMfaInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddGroupedUserIPRestrictions adds a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public void addGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGroupedUserIPRestrictionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveGroupedUserIPRestrictions removes a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public void removeGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveGroupedUserIPRestrictionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersAllowedIps returns the list of allowed IPs for the user.
     * </pre>
     */
    public void listUsersAllowedIps(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersAllowedIpsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
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
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse createUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse createDelegatedUser(com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDelegatedUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse getMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse getUser(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse getUserByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgents returns a list of Agents.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse> listAgents(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAgentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListPublicUsers returns a list of users with limited data for most applications.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse> listPublicUsers(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListPublicUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsers returns a list of users.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse> listUsers(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersByOrgId returns a list of users.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse> listUsersByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListUsersByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersByRegion returns a list of usersByRegion.
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse> listUsersByRegion(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListUsersByRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse updateMyUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMyUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse updateUser(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse updateUserLabels(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserLabelsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse updateUserCallerId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserCallerIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse updateUserDisabled(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserDisabledMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse updateUserDisabledByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserDisabledByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse getMyUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse getUserPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse getUserPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePasswordResetLink creates a password reset link for the given user id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse createPasswordResetLink(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreatePasswordResetLinkByOrgId creates a password reset link for the given user id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse createPasswordResetLinkByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePasswordResetLinkByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse getUserLoginInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserLoginInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse getUserEmailVerified(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEmailVerifiedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse getUserEmailVerifiedByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetMyPassword resets the user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse resetMyPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMyPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetUserPassword resets the user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse resetUserPassword(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResetUserPasswordByOrgId resets the user's password.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse resetUserPasswordByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUserPasswordByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse sendUserEmailVerification(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUserEmailVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse sendUserEmailVerificationByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUserEmailVerificationByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendPasswordReset sends a password reset email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse sendPasswordReset(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SendPasswordResetByOrgId sends a password reset email to the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse sendPasswordResetByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPasswordResetByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse getUserSessionData(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSessionDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse getAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse listAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse updateAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse createAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse deleteAgentProfileGroup(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgentProfileGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse assignAgentProfileGroups(com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignAgentProfileGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse addUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse addUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse getUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse getUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse updateUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse updateUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse removeUserSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse removeUserSubscriptionByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveUserSubscriptionByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse listUserSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse listUserSubscriptionsByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUserSubscriptionsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse listOrgSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrgSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AUTH TOKEN
     * CreateAuthToken creates an auth token for the current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse createAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAuthTokenByUserId creates an auth token for the given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse createAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthTokenByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAuthTokens list tokens of current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse listAuthTokens(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthTokensMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAuthTokensByUserId list tokens of given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse listAuthTokensByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthTokensByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAuthTokenExpiration sets expiration back one year for current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse setAuthTokenExpiration(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAuthTokenExpirationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetAuthTokenExpirationByUserId sets expiration back one year for given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse setAuthTokenExpirationByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAuthTokenExpirationByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthToken deletes a given auth token for the current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse deleteAuthToken(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAuthTokenByUserId deletes a given auth token for the given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse deleteAuthTokenByUserId(com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthTokenByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefreshMfaLockout resets the lockout timer for the given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse refreshMfaLockout(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshMfaLockoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefreshMfaLockoutByOrgId resets the lockout timer for the given user and org id.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse refreshMfaLockoutByOrgId(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshMfaLockoutByOrgIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetMfaType sets the given user's mfa type.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse setMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMfaTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetMyMfaType sets the current user's mfa type.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse setMyMfaType(com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMyMfaTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableUserMfa enables or disables mfa for the given user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse enableUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableUserMfaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableMyUserMfa enables mfa for the current user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse enableMyUserMfa(com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMyUserMfaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetUserMfaInfo returns the mfa info for the given user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse getUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMfaInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetMyUserMfaInfo returns the mfa info for the current user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse getMyUserMfaInfo(com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyUserMfaInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddGroupedUserIPRestrictions adds a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse addGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGroupedUserIPRestrictionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveGroupedUserIPRestrictions removes a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse removeGroupedUserIPRestrictions(com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveGroupedUserIPRestrictionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersAllowedIps returns the list of allowed IPs for the user.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse listUsersAllowedIps(com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersAllowedIpsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
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
     * CreateUser creates a new user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse> createUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateDelegatedUser creates a new delegated user and enables it for the region it is getting created in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse> createDelegatedUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDelegatedUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse> getMyUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUser returns a single user by UserId or by AgentSid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse> getUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserByOrgId returns a single user by UserId and OrgId
     * Requires Customer Support permission and allows cross Org requests.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse> getUserByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateMyUser updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse> updateMyUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMyUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUser updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse> updateUser(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserLabels updates a user's labels to be the passed in set of labels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse> updateUserLabels(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserLabelsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserCallerId updates a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse> updateUserCallerId(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserCallerIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisabled updates whether a user is disabled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse> updateUserDisabled(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserDisabledMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateUserDisabledByOrgId updates a user is disabled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse> updateUserDisabledByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserDisabledByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUserPasswordResetLink updates a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse> getMyUserPasswordResetLink(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLink gets a link to update a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse> getUserPasswordResetLink(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserPasswordResetLinkByOrgId gets a link to update a user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse> getUserPasswordResetLinkByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPasswordResetLinkByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePasswordResetLink creates a password reset link for the given user id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse> createPasswordResetLink(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreatePasswordResetLinkByOrgId creates a password reset link for the given user id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse> createPasswordResetLinkByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePasswordResetLinkByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Used to be called GetUserBlocked
     * GetUserLoginInfo gets information about a user's login.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse> getUserLoginInfo(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserLoginInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserEmailVerified gets whether the user's email is verified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse> getUserEmailVerified(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserEmailVerifiedByOrgId gets whether the user's email is verified.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse> getUserEmailVerifiedByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserEmailVerifiedByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetMyPassword resets the user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse> resetMyPassword(
        com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMyPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetUserPassword resets the user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse> resetUserPassword(
        com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResetUserPasswordByOrgId resets the user's password.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse> resetUserPasswordByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUserPasswordByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendUserEmailVerification sends a verification email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse> sendUserEmailVerification(
        com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendUserEmailVerificationByOrgId sends a verification email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse> sendUserEmailVerificationByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUserEmailVerificationByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendPasswordReset sends a password reset email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse> sendPasswordReset(
        com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SendPasswordResetByOrgId sends a password reset email to the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse> sendPasswordResetByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPasswordResetByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserSessionData returns data for the front end's session state
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse> getUserSessionData(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSessionDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgentProfileGroup returns an agent profile group by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse> getAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgentProfileGroups returns the agent profile groups associated with the current organization
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse> listAgentProfileGroups(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgentProfileGroup updates an AgentProfileGroup. Can only update if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse> updateAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAgentProfileGroup creates an AgentProfileGroup. Can only create if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse> createAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAgentProfileGroup deletes an AgentProfileGroup. Can only delete if user is in same org as AgentProfileGroup
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse> deleteAgentProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgentProfileGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignAgentProfileGroups assigns a list of users to an AgentProfileGroup. Can only use if everything is in the same organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse> assignAgentProfileGroups(
        com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignAgentProfileGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse> addUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse> addUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse> getUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a user subscription for a specified user with in requested users org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse> getUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user subscription for the current user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse> updateUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user subscription for a given user id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse> updateUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a user subscription.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse> removeUserSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a user subscription by a given user id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse> removeUserSubscriptionByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveUserSubscriptionByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse> listUserSubscriptions(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists user subscriptions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse> listUserSubscriptionsByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUserSubscriptionsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists subscriptions for multiple users in an org.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse> listOrgSubscriptions(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrgSubscriptionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AUTH TOKEN
     * CreateAuthToken creates an auth token for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse> createAuthToken(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAuthTokenByUserId creates an auth token for the given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse> createAuthTokenByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthTokenByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAuthTokens list tokens of current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse> listAuthTokens(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthTokensMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAuthTokensByUserId list tokens of given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse> listAuthTokensByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthTokensByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAuthTokenExpiration sets expiration back one year for current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse> setAuthTokenExpiration(
        com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAuthTokenExpirationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetAuthTokenExpirationByUserId sets expiration back one year for given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse> setAuthTokenExpirationByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAuthTokenExpirationByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthToken deletes a given auth token for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse> deleteAuthToken(
        com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAuthTokenByUserId deletes a given auth token for the given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse> deleteAuthTokenByUserId(
        com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthTokenByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefreshMfaLockout resets the lockout timer for the given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse> refreshMfaLockout(
        com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshMfaLockoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefreshMfaLockoutByOrgId resets the lockout timer for the given user and org id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse> refreshMfaLockoutByOrgId(
        com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshMfaLockoutByOrgIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetMfaType sets the given user's mfa type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse> setMfaType(
        com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMfaTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetMyMfaType sets the current user's mfa type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse> setMyMfaType(
        com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMyMfaTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableUserMfa enables or disables mfa for the given user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse> enableUserMfa(
        com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableUserMfaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableMyUserMfa enables mfa for the current user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse> enableMyUserMfa(
        com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMyUserMfaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetUserMfaInfo returns the mfa info for the given user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse> getUserMfaInfo(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMfaInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetMyUserMfaInfo returns the mfa info for the current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse> getMyUserMfaInfo(
        com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyUserMfaInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddGroupedUserIPRestrictions adds a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse> addGroupedUserIPRestrictions(
        com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGroupedUserIPRestrictionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveGroupedUserIPRestrictions removes a user or list of user's IPs they
     * are required to authenticate with
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse> removeGroupedUserIPRestrictions(
        com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveGroupedUserIPRestrictionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListUsersAllowedIps returns the list of allowed IPs for the user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse> listUsersAllowedIps(
        com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersAllowedIpsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_CREATE_DELEGATED_USER = 1;
  private static final int METHODID_GET_MY_USER = 2;
  private static final int METHODID_GET_USER = 3;
  private static final int METHODID_GET_USER_BY_ORG_ID = 4;
  private static final int METHODID_LIST_AGENTS = 5;
  private static final int METHODID_LIST_PUBLIC_USERS = 6;
  private static final int METHODID_LIST_USERS = 7;
  private static final int METHODID_LIST_USERS_BY_ORG_ID = 8;
  private static final int METHODID_LIST_USERS_BY_REGION = 9;
  private static final int METHODID_UPDATE_MY_USER = 10;
  private static final int METHODID_UPDATE_USER = 11;
  private static final int METHODID_UPDATE_USER_LABELS = 12;
  private static final int METHODID_UPDATE_USER_CALLER_ID = 13;
  private static final int METHODID_UPDATE_USER_DISABLED = 14;
  private static final int METHODID_UPDATE_USER_DISABLED_BY_ORG_ID = 15;
  private static final int METHODID_GET_MY_USER_PASSWORD_RESET_LINK = 16;
  private static final int METHODID_GET_USER_PASSWORD_RESET_LINK = 17;
  private static final int METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID = 18;
  private static final int METHODID_CREATE_PASSWORD_RESET_LINK = 19;
  private static final int METHODID_CREATE_PASSWORD_RESET_LINK_BY_ORG_ID = 20;
  private static final int METHODID_GET_USER_LOGIN_INFO = 21;
  private static final int METHODID_GET_USER_EMAIL_VERIFIED = 22;
  private static final int METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID = 23;
  private static final int METHODID_RESET_MY_PASSWORD = 24;
  private static final int METHODID_RESET_USER_PASSWORD = 25;
  private static final int METHODID_RESET_USER_PASSWORD_BY_ORG_ID = 26;
  private static final int METHODID_SEND_USER_EMAIL_VERIFICATION = 27;
  private static final int METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID = 28;
  private static final int METHODID_SEND_PASSWORD_RESET = 29;
  private static final int METHODID_SEND_PASSWORD_RESET_BY_ORG_ID = 30;
  private static final int METHODID_GET_USER_SESSION_DATA = 31;
  private static final int METHODID_GET_AGENT_PROFILE_GROUP = 32;
  private static final int METHODID_LIST_AGENT_PROFILE_GROUPS = 33;
  private static final int METHODID_UPDATE_AGENT_PROFILE_GROUP = 34;
  private static final int METHODID_CREATE_AGENT_PROFILE_GROUP = 35;
  private static final int METHODID_DELETE_AGENT_PROFILE_GROUP = 36;
  private static final int METHODID_ASSIGN_AGENT_PROFILE_GROUPS = 37;
  private static final int METHODID_ADD_USER_SUBSCRIPTION = 38;
  private static final int METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID = 39;
  private static final int METHODID_GET_USER_SUBSCRIPTION = 40;
  private static final int METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID = 41;
  private static final int METHODID_UPDATE_USER_SUBSCRIPTION = 42;
  private static final int METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID = 43;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION = 44;
  private static final int METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID = 45;
  private static final int METHODID_LIST_USER_SUBSCRIPTIONS = 46;
  private static final int METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID = 47;
  private static final int METHODID_LIST_ORG_SUBSCRIPTIONS = 48;
  private static final int METHODID_CREATE_AUTH_TOKEN = 49;
  private static final int METHODID_CREATE_AUTH_TOKEN_BY_USER_ID = 50;
  private static final int METHODID_LIST_AUTH_TOKENS = 51;
  private static final int METHODID_LIST_AUTH_TOKENS_BY_USER_ID = 52;
  private static final int METHODID_SET_AUTH_TOKEN_EXPIRATION = 53;
  private static final int METHODID_SET_AUTH_TOKEN_EXPIRATION_BY_USER_ID = 54;
  private static final int METHODID_DELETE_AUTH_TOKEN = 55;
  private static final int METHODID_DELETE_AUTH_TOKEN_BY_USER_ID = 56;
  private static final int METHODID_REFRESH_MFA_LOCKOUT = 57;
  private static final int METHODID_REFRESH_MFA_LOCKOUT_BY_ORG_ID = 58;
  private static final int METHODID_SET_MFA_TYPE = 59;
  private static final int METHODID_SET_MY_MFA_TYPE = 60;
  private static final int METHODID_ENABLE_USER_MFA = 61;
  private static final int METHODID_ENABLE_MY_USER_MFA = 62;
  private static final int METHODID_GET_USER_MFA_INFO = 63;
  private static final int METHODID_GET_MY_USER_MFA_INFO = 64;
  private static final int METHODID_ADD_GROUPED_USER_IPRESTRICTIONS = 65;
  private static final int METHODID_REMOVE_GROUPED_USER_IPRESTRICTIONS = 66;
  private static final int METHODID_LIST_USERS_ALLOWED_IPS = 67;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_DELEGATED_USER:
          serviceImpl.createDelegatedUser((com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER:
          serviceImpl.getMyUser((com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ORG_ID:
          serviceImpl.getUserByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENTS:
          serviceImpl.listAgents((com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse>) responseObserver);
          break;
        case METHODID_LIST_PUBLIC_USERS:
          serviceImpl.listPublicUsers((com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS_BY_ORG_ID:
          serviceImpl.listUsersByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS_BY_REGION:
          serviceImpl.listUsersByRegion((com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MY_USER:
          serviceImpl.updateMyUser((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_LABELS:
          serviceImpl.updateUserLabels((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_CALLER_ID:
          serviceImpl.updateUserCallerId((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISABLED:
          serviceImpl.updateUserDisabled((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_DISABLED_BY_ORG_ID:
          serviceImpl.updateUserDisabledByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_PASSWORD_RESET_LINK:
          serviceImpl.getMyUserPasswordResetLink((com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PASSWORD_RESET_LINK:
          serviceImpl.getUserPasswordResetLink((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID:
          serviceImpl.getUserPasswordResetLinkByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_PASSWORD_RESET_LINK:
          serviceImpl.createPasswordResetLink((com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse>) responseObserver);
          break;
        case METHODID_CREATE_PASSWORD_RESET_LINK_BY_ORG_ID:
          serviceImpl.createPasswordResetLinkByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_LOGIN_INFO:
          serviceImpl.getUserLoginInfo((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EMAIL_VERIFIED:
          serviceImpl.getUserEmailVerified((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse>) responseObserver);
          break;
        case METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID:
          serviceImpl.getUserEmailVerifiedByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse>) responseObserver);
          break;
        case METHODID_RESET_MY_PASSWORD:
          serviceImpl.resetMyPassword((com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_USER_PASSWORD:
          serviceImpl.resetUserPassword((com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_USER_PASSWORD_BY_ORG_ID:
          serviceImpl.resetUserPasswordByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse>) responseObserver);
          break;
        case METHODID_SEND_USER_EMAIL_VERIFICATION:
          serviceImpl.sendUserEmailVerification((com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse>) responseObserver);
          break;
        case METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID:
          serviceImpl.sendUserEmailVerificationByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse>) responseObserver);
          break;
        case METHODID_SEND_PASSWORD_RESET:
          serviceImpl.sendPasswordReset((com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse>) responseObserver);
          break;
        case METHODID_SEND_PASSWORD_RESET_BY_ORG_ID:
          serviceImpl.sendPasswordResetByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SESSION_DATA:
          serviceImpl.getUserSessionData((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse>) responseObserver);
          break;
        case METHODID_GET_AGENT_PROFILE_GROUP:
          serviceImpl.getAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_PROFILE_GROUPS:
          serviceImpl.listAgentProfileGroups((com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENT_PROFILE_GROUP:
          serviceImpl.updateAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_CREATE_AGENT_PROFILE_GROUP:
          serviceImpl.createAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_AGENT_PROFILE_GROUP:
          serviceImpl.deleteAgentProfileGroup((com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_AGENT_PROFILE_GROUPS:
          serviceImpl.assignAgentProfileGroups((com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION:
          serviceImpl.addUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.addUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SUBSCRIPTION:
          serviceImpl.getUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.getUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SUBSCRIPTION:
          serviceImpl.updateUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.updateUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION:
          serviceImpl.removeUserSubscription((com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID:
          serviceImpl.removeUserSubscriptionByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_SUBSCRIPTIONS:
          serviceImpl.listUserSubscriptions((com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID:
          serviceImpl.listUserSubscriptionsByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_ORG_SUBSCRIPTIONS:
          serviceImpl.listOrgSubscriptions((com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUTH_TOKEN:
          serviceImpl.createAuthToken((com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUTH_TOKEN_BY_USER_ID:
          serviceImpl.createAuthTokenByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTH_TOKENS:
          serviceImpl.listAuthTokens((com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTH_TOKENS_BY_USER_ID:
          serviceImpl.listAuthTokensByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse>) responseObserver);
          break;
        case METHODID_SET_AUTH_TOKEN_EXPIRATION:
          serviceImpl.setAuthTokenExpiration((com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse>) responseObserver);
          break;
        case METHODID_SET_AUTH_TOKEN_EXPIRATION_BY_USER_ID:
          serviceImpl.setAuthTokenExpirationByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_TOKEN:
          serviceImpl.deleteAuthToken((com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_TOKEN_BY_USER_ID:
          serviceImpl.deleteAuthTokenByUserId((com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse>) responseObserver);
          break;
        case METHODID_REFRESH_MFA_LOCKOUT:
          serviceImpl.refreshMfaLockout((com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse>) responseObserver);
          break;
        case METHODID_REFRESH_MFA_LOCKOUT_BY_ORG_ID:
          serviceImpl.refreshMfaLockoutByOrgId((com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse>) responseObserver);
          break;
        case METHODID_SET_MFA_TYPE:
          serviceImpl.setMfaType((com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse>) responseObserver);
          break;
        case METHODID_SET_MY_MFA_TYPE:
          serviceImpl.setMyMfaType((com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse>) responseObserver);
          break;
        case METHODID_ENABLE_USER_MFA:
          serviceImpl.enableUserMfa((com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse>) responseObserver);
          break;
        case METHODID_ENABLE_MY_USER_MFA:
          serviceImpl.enableMyUserMfa((com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse>) responseObserver);
          break;
        case METHODID_GET_USER_MFA_INFO:
          serviceImpl.getUserMfaInfo((com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse>) responseObserver);
          break;
        case METHODID_GET_MY_USER_MFA_INFO:
          serviceImpl.getMyUserMfaInfo((com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse>) responseObserver);
          break;
        case METHODID_ADD_GROUPED_USER_IPRESTRICTIONS:
          serviceImpl.addGroupedUserIPRestrictions((com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_GROUPED_USER_IPRESTRICTIONS:
          serviceImpl.removeGroupedUserIPRestrictions((com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS_ALLOWED_IPS:
          serviceImpl.listUsersAllowedIps((com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse>) responseObserver);
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
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getCreateDelegatedUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateDelegatedUserResponse>(
                service, METHODID_CREATE_DELEGATED_USER)))
        .addMethod(
          getGetMyUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserResponse>(
                service, METHODID_GET_MY_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetUserByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserByOrgIdResponse>(
                service, METHODID_GET_USER_BY_ORG_ID)))
        .addMethod(
          getListAgentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentsResponse>(
                service, METHODID_LIST_AGENTS)))
        .addMethod(
          getListPublicUsersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListPublicUsersResponse>(
                service, METHODID_LIST_PUBLIC_USERS)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getListUsersByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByOrgIdResponse>(
                service, METHODID_LIST_USERS_BY_ORG_ID)))
        .addMethod(
          getListUsersByRegionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersByRegionResponse>(
                service, METHODID_LIST_USERS_BY_REGION)))
        .addMethod(
          getUpdateMyUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateMyUserResponse>(
                service, METHODID_UPDATE_MY_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getUpdateUserLabelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserLabelsResponse>(
                service, METHODID_UPDATE_USER_LABELS)))
        .addMethod(
          getUpdateUserCallerIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserCallerIdResponse>(
                service, METHODID_UPDATE_USER_CALLER_ID)))
        .addMethod(
          getUpdateUserDisabledMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledResponse>(
                service, METHODID_UPDATE_USER_DISABLED)))
        .addMethod(
          getUpdateUserDisabledByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserDisabledByOrgIdResponse>(
                service, METHODID_UPDATE_USER_DISABLED_BY_ORG_ID)))
        .addMethod(
          getGetMyUserPasswordResetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserPasswordResetLinkResponse>(
                service, METHODID_GET_MY_USER_PASSWORD_RESET_LINK)))
        .addMethod(
          getGetUserPasswordResetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkResponse>(
                service, METHODID_GET_USER_PASSWORD_RESET_LINK)))
        .addMethod(
          getGetUserPasswordResetLinkByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserPasswordResetLinkByOrgIdResponse>(
                service, METHODID_GET_USER_PASSWORD_RESET_LINK_BY_ORG_ID)))
        .addMethod(
          getCreatePasswordResetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkResponse>(
                service, METHODID_CREATE_PASSWORD_RESET_LINK)))
        .addMethod(
          getCreatePasswordResetLinkByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreatePasswordResetLinkByOrgIdResponse>(
                service, METHODID_CREATE_PASSWORD_RESET_LINK_BY_ORG_ID)))
        .addMethod(
          getGetUserLoginInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserLoginInfoResponse>(
                service, METHODID_GET_USER_LOGIN_INFO)))
        .addMethod(
          getGetUserEmailVerifiedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedResponse>(
                service, METHODID_GET_USER_EMAIL_VERIFIED)))
        .addMethod(
          getGetUserEmailVerifiedByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserEmailVerifiedByOrgIdResponse>(
                service, METHODID_GET_USER_EMAIL_VERIFIED_BY_ORG_ID)))
        .addMethod(
          getResetMyPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetMyPasswordResponse>(
                service, METHODID_RESET_MY_PASSWORD)))
        .addMethod(
          getResetUserPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordResponse>(
                service, METHODID_RESET_USER_PASSWORD)))
        .addMethod(
          getResetUserPasswordByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ResetUserPasswordByOrgIdResponse>(
                service, METHODID_RESET_USER_PASSWORD_BY_ORG_ID)))
        .addMethod(
          getSendUserEmailVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationResponse>(
                service, METHODID_SEND_USER_EMAIL_VERIFICATION)))
        .addMethod(
          getSendUserEmailVerificationByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SendUserEmailVerificationByOrgIdResponse>(
                service, METHODID_SEND_USER_EMAIL_VERIFICATION_BY_ORG_ID)))
        .addMethod(
          getSendPasswordResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetResponse>(
                service, METHODID_SEND_PASSWORD_RESET)))
        .addMethod(
          getSendPasswordResetByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SendPasswordResetByOrgIdResponse>(
                service, METHODID_SEND_PASSWORD_RESET_BY_ORG_ID)))
        .addMethod(
          getGetUserSessionDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSessionDataResponse>(
                service, METHODID_GET_USER_SESSION_DATA)))
        .addMethod(
          getGetAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetAgentProfileGroupResponse>(
                service, METHODID_GET_AGENT_PROFILE_GROUP)))
        .addMethod(
          getListAgentProfileGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAgentProfileGroupsResponse>(
                service, METHODID_LIST_AGENT_PROFILE_GROUPS)))
        .addMethod(
          getUpdateAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateAgentProfileGroupResponse>(
                service, METHODID_UPDATE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getCreateAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAgentProfileGroupResponse>(
                service, METHODID_CREATE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getDeleteAgentProfileGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAgentProfileGroupResponse>(
                service, METHODID_DELETE_AGENT_PROFILE_GROUP)))
        .addMethod(
          getAssignAgentProfileGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.AssignAgentProfileGroupsResponse>(
                service, METHODID_ASSIGN_AGENT_PROFILE_GROUPS)))
        .addMethod(
          getAddUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionResponse>(
                service, METHODID_ADD_USER_SUBSCRIPTION)))
        .addMethod(
          getAddUserSubscriptionByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionByUserIdResponse>(
                service, METHODID_ADD_USER_SUBSCRIPTION_BY_USER_ID)))
        .addMethod(
          getGetUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionResponse>(
                service, METHODID_GET_USER_SUBSCRIPTION)))
        .addMethod(
          getGetUserSubscriptionByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserSubscriptionByUserIdResponse>(
                service, METHODID_GET_USER_SUBSCRIPTION_BY_USER_ID)))
        .addMethod(
          getUpdateUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionResponse>(
                service, METHODID_UPDATE_USER_SUBSCRIPTION)))
        .addMethod(
          getUpdateUserSubscriptionByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdResponse>(
                service, METHODID_UPDATE_USER_SUBSCRIPTION_BY_USER_ID)))
        .addMethod(
          getRemoveUserSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionResponse>(
                service, METHODID_REMOVE_USER_SUBSCRIPTION)))
        .addMethod(
          getRemoveUserSubscriptionByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveUserSubscriptionByUserIdResponse>(
                service, METHODID_REMOVE_USER_SUBSCRIPTION_BY_USER_ID)))
        .addMethod(
          getListUserSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsResponse>(
                service, METHODID_LIST_USER_SUBSCRIPTIONS)))
        .addMethod(
          getListUserSubscriptionsByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse>(
                service, METHODID_LIST_USER_SUBSCRIPTIONS_BY_USER_ID)))
        .addMethod(
          getListOrgSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListOrgSubscriptionsResponse>(
                service, METHODID_LIST_ORG_SUBSCRIPTIONS)))
        .addMethod(
          getCreateAuthTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse>(
                service, METHODID_CREATE_AUTH_TOKEN)))
        .addMethod(
          getCreateAuthTokenByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenByUserIdResponse>(
                service, METHODID_CREATE_AUTH_TOKEN_BY_USER_ID)))
        .addMethod(
          getListAuthTokensMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensResponse>(
                service, METHODID_LIST_AUTH_TOKENS)))
        .addMethod(
          getListAuthTokensByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListAuthTokensByUserIdResponse>(
                service, METHODID_LIST_AUTH_TOKENS_BY_USER_ID)))
        .addMethod(
          getSetAuthTokenExpirationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationResponse>(
                service, METHODID_SET_AUTH_TOKEN_EXPIRATION)))
        .addMethod(
          getSetAuthTokenExpirationByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SetAuthTokenExpirationByUserIdResponse>(
                service, METHODID_SET_AUTH_TOKEN_EXPIRATION_BY_USER_ID)))
        .addMethod(
          getDeleteAuthTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenResponse>(
                service, METHODID_DELETE_AUTH_TOKEN)))
        .addMethod(
          getDeleteAuthTokenByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.DeleteAuthTokenByUserIdResponse>(
                service, METHODID_DELETE_AUTH_TOKEN_BY_USER_ID)))
        .addMethod(
          getRefreshMfaLockoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse>(
                service, METHODID_REFRESH_MFA_LOCKOUT)))
        .addMethod(
          getRefreshMfaLockoutByOrgIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutByOrgIdResponse>(
                service, METHODID_REFRESH_MFA_LOCKOUT_BY_ORG_ID)))
        .addMethod(
          getSetMfaTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SetMfaTypeResponse>(
                service, METHODID_SET_MFA_TYPE)))
        .addMethod(
          getSetMyMfaTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.SetMyMfaTypeResponse>(
                service, METHODID_SET_MY_MFA_TYPE)))
        .addMethod(
          getEnableUserMfaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.EnableUserMfaResponse>(
                service, METHODID_ENABLE_USER_MFA)))
        .addMethod(
          getEnableMyUserMfaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.EnableMyUserMfaResponse>(
                service, METHODID_ENABLE_MY_USER_MFA)))
        .addMethod(
          getGetUserMfaInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetUserMfaInfoResponse>(
                service, METHODID_GET_USER_MFA_INFO)))
        .addMethod(
          getGetMyUserMfaInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.GetMyUserMfaInfoResponse>(
                service, METHODID_GET_MY_USER_MFA_INFO)))
        .addMethod(
          getAddGroupedUserIPRestrictionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.AddGroupedUserIPRestrictionsResponse>(
                service, METHODID_ADD_GROUPED_USER_IPRESTRICTIONS)))
        .addMethod(
          getRemoveGroupedUserIPRestrictionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.RemoveGroupedUserIPRestrictionsResponse>(
                service, METHODID_REMOVE_GROUPED_USER_IPRESTRICTIONS)))
        .addMethod(
          getListUsersAllowedIpsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsRequest,
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUsersAllowedIpsResponse>(
                service, METHODID_LIST_USERS_ALLOWED_IPS)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.ServiceProto.getDescriptor();
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
              .addMethod(getCreateUserMethod())
              .addMethod(getCreateDelegatedUserMethod())
              .addMethod(getGetMyUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getGetUserByOrgIdMethod())
              .addMethod(getListAgentsMethod())
              .addMethod(getListPublicUsersMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getListUsersByOrgIdMethod())
              .addMethod(getListUsersByRegionMethod())
              .addMethod(getUpdateMyUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getUpdateUserLabelsMethod())
              .addMethod(getUpdateUserCallerIdMethod())
              .addMethod(getUpdateUserDisabledMethod())
              .addMethod(getUpdateUserDisabledByOrgIdMethod())
              .addMethod(getGetMyUserPasswordResetLinkMethod())
              .addMethod(getGetUserPasswordResetLinkMethod())
              .addMethod(getGetUserPasswordResetLinkByOrgIdMethod())
              .addMethod(getCreatePasswordResetLinkMethod())
              .addMethod(getCreatePasswordResetLinkByOrgIdMethod())
              .addMethod(getGetUserLoginInfoMethod())
              .addMethod(getGetUserEmailVerifiedMethod())
              .addMethod(getGetUserEmailVerifiedByOrgIdMethod())
              .addMethod(getResetMyPasswordMethod())
              .addMethod(getResetUserPasswordMethod())
              .addMethod(getResetUserPasswordByOrgIdMethod())
              .addMethod(getSendUserEmailVerificationMethod())
              .addMethod(getSendUserEmailVerificationByOrgIdMethod())
              .addMethod(getSendPasswordResetMethod())
              .addMethod(getSendPasswordResetByOrgIdMethod())
              .addMethod(getGetUserSessionDataMethod())
              .addMethod(getGetAgentProfileGroupMethod())
              .addMethod(getListAgentProfileGroupsMethod())
              .addMethod(getUpdateAgentProfileGroupMethod())
              .addMethod(getCreateAgentProfileGroupMethod())
              .addMethod(getDeleteAgentProfileGroupMethod())
              .addMethod(getAssignAgentProfileGroupsMethod())
              .addMethod(getAddUserSubscriptionMethod())
              .addMethod(getAddUserSubscriptionByUserIdMethod())
              .addMethod(getGetUserSubscriptionMethod())
              .addMethod(getGetUserSubscriptionByUserIdMethod())
              .addMethod(getUpdateUserSubscriptionMethod())
              .addMethod(getUpdateUserSubscriptionByUserIdMethod())
              .addMethod(getRemoveUserSubscriptionMethod())
              .addMethod(getRemoveUserSubscriptionByUserIdMethod())
              .addMethod(getListUserSubscriptionsMethod())
              .addMethod(getListUserSubscriptionsByUserIdMethod())
              .addMethod(getListOrgSubscriptionsMethod())
              .addMethod(getCreateAuthTokenMethod())
              .addMethod(getCreateAuthTokenByUserIdMethod())
              .addMethod(getListAuthTokensMethod())
              .addMethod(getListAuthTokensByUserIdMethod())
              .addMethod(getSetAuthTokenExpirationMethod())
              .addMethod(getSetAuthTokenExpirationByUserIdMethod())
              .addMethod(getDeleteAuthTokenMethod())
              .addMethod(getDeleteAuthTokenByUserIdMethod())
              .addMethod(getRefreshMfaLockoutMethod())
              .addMethod(getRefreshMfaLockoutByOrgIdMethod())
              .addMethod(getSetMfaTypeMethod())
              .addMethod(getSetMyMfaTypeMethod())
              .addMethod(getEnableUserMfaMethod())
              .addMethod(getEnableMyUserMfaMethod())
              .addMethod(getGetUserMfaInfoMethod())
              .addMethod(getGetMyUserMfaInfoMethod())
              .addMethod(getAddGroupedUserIPRestrictionsMethod())
              .addMethod(getRemoveGroupedUserIPRestrictionsMethod())
              .addMethod(getListUsersAllowedIpsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
