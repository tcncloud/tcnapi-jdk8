package com.tcn.cloud.api.api.v1alpha1.room303;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/room303/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Room303APIGrpc {

  private Room303APIGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.room303.Room303API";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest,
      com.tcn.cloud.api.api.commons.Member> getAddRoomMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRoomMember",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest,
      com.tcn.cloud.api.api.commons.Member> getAddRoomMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest, com.tcn.cloud.api.api.commons.Member> getAddRoomMemberMethod;
    if ((getAddRoomMemberMethod = Room303APIGrpc.getAddRoomMemberMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getAddRoomMemberMethod = Room303APIGrpc.getAddRoomMemberMethod) == null) {
          Room303APIGrpc.getAddRoomMemberMethod = getAddRoomMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest, com.tcn.cloud.api.api.commons.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRoomMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Member.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("AddRoomMember"))
              .build();
        }
      }
    }
    return getAddRoomMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> getRemoveRoomMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoomMember",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> getRemoveRoomMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> getRemoveRoomMemberMethod;
    if ((getRemoveRoomMemberMethod = Room303APIGrpc.getRemoveRoomMemberMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getRemoveRoomMemberMethod = Room303APIGrpc.getRemoveRoomMemberMethod) == null) {
          Room303APIGrpc.getRemoveRoomMemberMethod = getRemoveRoomMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRoomMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("RemoveRoomMember"))
              .build();
        }
      }
    }
    return getRemoveRoomMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> getListRoomMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoomMembers",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> getListRoomMembersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> getListRoomMembersMethod;
    if ((getListRoomMembersMethod = Room303APIGrpc.getListRoomMembersMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getListRoomMembersMethod = Room303APIGrpc.getListRoomMembersMethod) == null) {
          Room303APIGrpc.getListRoomMembersMethod = getListRoomMembersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoomMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("ListRoomMembers"))
              .build();
        }
      }
    }
    return getListRoomMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> getSetAdminForRoomMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAdminForRoomMember",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> getSetAdminForRoomMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> getSetAdminForRoomMemberMethod;
    if ((getSetAdminForRoomMemberMethod = Room303APIGrpc.getSetAdminForRoomMemberMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getSetAdminForRoomMemberMethod = Room303APIGrpc.getSetAdminForRoomMemberMethod) == null) {
          Room303APIGrpc.getSetAdminForRoomMemberMethod = getSetAdminForRoomMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAdminForRoomMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("SetAdminForRoomMember"))
              .build();
        }
      }
    }
    return getSetAdminForRoomMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getJoinRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinRoom",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getJoinRoomMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest, com.tcn.cloud.api.api.commons.Room> getJoinRoomMethod;
    if ((getJoinRoomMethod = Room303APIGrpc.getJoinRoomMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getJoinRoomMethod = Room303APIGrpc.getJoinRoomMethod) == null) {
          Room303APIGrpc.getJoinRoomMethod = getJoinRoomMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest, com.tcn.cloud.api.api.commons.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Room.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("JoinRoom"))
              .build();
        }
      }
    }
    return getJoinRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest,
      com.tcn.cloud.api.api.commons.Member> getGetRoomMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoomMember",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest,
      com.tcn.cloud.api.api.commons.Member> getGetRoomMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest, com.tcn.cloud.api.api.commons.Member> getGetRoomMemberMethod;
    if ((getGetRoomMemberMethod = Room303APIGrpc.getGetRoomMemberMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getGetRoomMemberMethod = Room303APIGrpc.getGetRoomMemberMethod) == null) {
          Room303APIGrpc.getGetRoomMemberMethod = getGetRoomMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest, com.tcn.cloud.api.api.commons.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoomMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Member.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("GetRoomMember"))
              .build();
        }
      }
    }
    return getGetRoomMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMessage",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> getCreateMessageMethod;
    if ((getCreateMessageMethod = Room303APIGrpc.getCreateMessageMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getCreateMessageMethod = Room303APIGrpc.getCreateMessageMethod) == null) {
          Room303APIGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("CreateMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> getEditMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditMessage",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> getEditMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> getEditMessageMethod;
    if ((getEditMessageMethod = Room303APIGrpc.getEditMessageMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getEditMessageMethod = Room303APIGrpc.getEditMessageMethod) == null) {
          Room303APIGrpc.getEditMessageMethod = getEditMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("EditMessage"))
              .build();
        }
      }
    }
    return getEditMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMessage",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = Room303APIGrpc.getDeleteMessageMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getDeleteMessageMethod = Room303APIGrpc.getDeleteMessageMethod) == null) {
          Room303APIGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest, com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("DeleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> getGetMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessages",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> getGetMessagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> getGetMessagesMethod;
    if ((getGetMessagesMethod = Room303APIGrpc.getGetMessagesMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getGetMessagesMethod = Room303APIGrpc.getGetMessagesMethod) == null) {
          Room303APIGrpc.getGetMessagesMethod = getGetMessagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("GetMessages"))
              .build();
        }
      }
    }
    return getGetMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> getStreamMessageUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamMessageUpdates",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> getStreamMessageUpdatesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest, com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> getStreamMessageUpdatesMethod;
    if ((getStreamMessageUpdatesMethod = Room303APIGrpc.getStreamMessageUpdatesMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getStreamMessageUpdatesMethod = Room303APIGrpc.getStreamMessageUpdatesMethod) == null) {
          Room303APIGrpc.getStreamMessageUpdatesMethod = getStreamMessageUpdatesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest, com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamMessageUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("StreamMessageUpdates"))
              .build();
        }
      }
    }
    return getStreamMessageUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> getGetUnreadStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnreadStats",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> getGetUnreadStatsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> getGetUnreadStatsMethod;
    if ((getGetUnreadStatsMethod = Room303APIGrpc.getGetUnreadStatsMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getGetUnreadStatsMethod = Room303APIGrpc.getGetUnreadStatsMethod) == null) {
          Room303APIGrpc.getGetUnreadStatsMethod = getGetUnreadStatsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnreadStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("GetUnreadStats"))
              .build();
        }
      }
    }
    return getGetUnreadStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> getMarkMessageReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkMessageRead",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> getMarkMessageReadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> getMarkMessageReadMethod;
    if ((getMarkMessageReadMethod = Room303APIGrpc.getMarkMessageReadMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getMarkMessageReadMethod = Room303APIGrpc.getMarkMessageReadMethod) == null) {
          Room303APIGrpc.getMarkMessageReadMethod = getMarkMessageReadMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkMessageRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("MarkMessageRead"))
              .build();
        }
      }
    }
    return getMarkMessageReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> getMarkAllMessagesReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkAllMessagesRead",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> getMarkAllMessagesReadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> getMarkAllMessagesReadMethod;
    if ((getMarkAllMessagesReadMethod = Room303APIGrpc.getMarkAllMessagesReadMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getMarkAllMessagesReadMethod = Room303APIGrpc.getMarkAllMessagesReadMethod) == null) {
          Room303APIGrpc.getMarkAllMessagesReadMethod = getMarkAllMessagesReadMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkAllMessagesRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("MarkAllMessagesRead"))
              .build();
        }
      }
    }
    return getMarkAllMessagesReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> getBulkMarkMessageReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkMarkMessageRead",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> getBulkMarkMessageReadMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> getBulkMarkMessageReadMethod;
    if ((getBulkMarkMessageReadMethod = Room303APIGrpc.getBulkMarkMessageReadMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getBulkMarkMessageReadMethod = Room303APIGrpc.getBulkMarkMessageReadMethod) == null) {
          Room303APIGrpc.getBulkMarkMessageReadMethod = getBulkMarkMessageReadMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest, com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkMarkMessageRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("BulkMarkMessageRead"))
              .build();
        }
      }
    }
    return getBulkMarkMessageReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getCreateRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoom",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getCreateRoomMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest, com.tcn.cloud.api.api.commons.Room> getCreateRoomMethod;
    if ((getCreateRoomMethod = Room303APIGrpc.getCreateRoomMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getCreateRoomMethod = Room303APIGrpc.getCreateRoomMethod) == null) {
          Room303APIGrpc.getCreateRoomMethod = getCreateRoomMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest, com.tcn.cloud.api.api.commons.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Room.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("CreateRoom"))
              .build();
        }
      }
    }
    return getCreateRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getGetRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoom",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getGetRoomMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest, com.tcn.cloud.api.api.commons.Room> getGetRoomMethod;
    if ((getGetRoomMethod = Room303APIGrpc.getGetRoomMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getGetRoomMethod = Room303APIGrpc.getGetRoomMethod) == null) {
          Room303APIGrpc.getGetRoomMethod = getGetRoomMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest, com.tcn.cloud.api.api.commons.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Room.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("GetRoom"))
              .build();
        }
      }
    }
    return getGetRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListAllRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllRooms",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListAllRoomsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListAllRoomsMethod;
    if ((getListAllRoomsMethod = Room303APIGrpc.getListAllRoomsMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getListAllRoomsMethod = Room303APIGrpc.getListAllRoomsMethod) == null) {
          Room303APIGrpc.getListAllRoomsMethod = getListAllRoomsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("ListAllRooms"))
              .build();
        }
      }
    }
    return getListAllRoomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListRoomsForMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoomsForMember",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListRoomsForMemberMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> getListRoomsForMemberMethod;
    if ((getListRoomsForMemberMethod = Room303APIGrpc.getListRoomsForMemberMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getListRoomsForMemberMethod = Room303APIGrpc.getListRoomsForMemberMethod) == null) {
          Room303APIGrpc.getListRoomsForMemberMethod = getListRoomsForMemberMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoomsForMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("ListRoomsForMember"))
              .build();
        }
      }
    }
    return getListRoomsForMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getArchiveRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArchiveRoom",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest,
      com.tcn.cloud.api.api.commons.Room> getArchiveRoomMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest, com.tcn.cloud.api.api.commons.Room> getArchiveRoomMethod;
    if ((getArchiveRoomMethod = Room303APIGrpc.getArchiveRoomMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getArchiveRoomMethod = Room303APIGrpc.getArchiveRoomMethod) == null) {
          Room303APIGrpc.getArchiveRoomMethod = getArchiveRoomMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest, com.tcn.cloud.api.api.commons.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArchiveRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Room.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("ArchiveRoom"))
              .build();
        }
      }
    }
    return getArchiveRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> getListUsersNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersNames",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> getListUsersNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> getListUsersNamesMethod;
    if ((getListUsersNamesMethod = Room303APIGrpc.getListUsersNamesMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getListUsersNamesMethod = Room303APIGrpc.getListUsersNamesMethod) == null) {
          Room303APIGrpc.getListUsersNamesMethod = getListUsersNamesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest, com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("ListUsersNames"))
              .build();
        }
      }
    }
    return getListUsersNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest,
      com.tcn.cloud.api.api.commons.Room> getUpdateRoomConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoomConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest.class,
      responseType = com.tcn.cloud.api.api.commons.Room.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest,
      com.tcn.cloud.api.api.commons.Room> getUpdateRoomConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest, com.tcn.cloud.api.api.commons.Room> getUpdateRoomConfigMethod;
    if ((getUpdateRoomConfigMethod = Room303APIGrpc.getUpdateRoomConfigMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getUpdateRoomConfigMethod = Room303APIGrpc.getUpdateRoomConfigMethod) == null) {
          Room303APIGrpc.getUpdateRoomConfigMethod = getUpdateRoomConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest, com.tcn.cloud.api.api.commons.Room>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoomConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.commons.Room.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("UpdateRoomConfig"))
              .build();
        }
      }
    }
    return getUpdateRoomConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> getUpdateGlobalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGlobalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> getUpdateGlobalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest, com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> getUpdateGlobalConfigMethod;
    if ((getUpdateGlobalConfigMethod = Room303APIGrpc.getUpdateGlobalConfigMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getUpdateGlobalConfigMethod = Room303APIGrpc.getUpdateGlobalConfigMethod) == null) {
          Room303APIGrpc.getUpdateGlobalConfigMethod = getUpdateGlobalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest, com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGlobalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("UpdateGlobalConfig"))
              .build();
        }
      }
    }
    return getUpdateGlobalConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> getGetGlobalConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGlobalConfig",
      requestType = com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest,
      com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> getGetGlobalConfigMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> getGetGlobalConfigMethod;
    if ((getGetGlobalConfigMethod = Room303APIGrpc.getGetGlobalConfigMethod) == null) {
      synchronized (Room303APIGrpc.class) {
        if ((getGetGlobalConfigMethod = Room303APIGrpc.getGetGlobalConfigMethod) == null) {
          Room303APIGrpc.getGetGlobalConfigMethod = getGetGlobalConfigMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest, com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGlobalConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new Room303APIMethodDescriptorSupplier("GetGlobalConfig"))
              .build();
        }
      }
    }
    return getGetGlobalConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Room303APIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room303APIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room303APIStub>() {
        @java.lang.Override
        public Room303APIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room303APIStub(channel, callOptions);
        }
      };
    return Room303APIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Room303APIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room303APIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room303APIBlockingStub>() {
        @java.lang.Override
        public Room303APIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room303APIBlockingStub(channel, callOptions);
        }
      };
    return Room303APIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Room303APIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Room303APIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Room303APIFutureStub>() {
        @java.lang.Override
        public Room303APIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Room303APIFutureStub(channel, callOptions);
        }
      };
    return Room303APIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Member
     * Add a new member to a room, you must be a room admin in order to do that
     * </pre>
     */
    default void addRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRoomMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove room member (kick), the room member will not receive notifications from that room
     * </pre>
     */
    default void removeRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoomMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * List the members of this room
     * </pre>
     */
    default void listRoomMembers(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoomMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a room member as admin, you must be a room admin in order to do this.
     * </pre>
     */
    default void setAdminForRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAdminForRoomMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * adds new member to a room and does not require the member to be admin
     * </pre>
     */
    default void joinRoom(com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     * gets the member entity from the provided room if it exists
     * </pre>
     */
    default void getRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Message
     * </pre>
     */
    default void createMessage(com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     */
    default void editMessage(com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditMessageMethod(), responseObserver);
    }

    /**
     */
    default void deleteMessage(com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     */
    default void getMessages(com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessagesMethod(), responseObserver);
    }

    /**
     */
    default void streamMessageUpdates(com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamMessageUpdatesMethod(), responseObserver);
    }

    /**
     */
    default void getUnreadStats(com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnreadStatsMethod(), responseObserver);
    }

    /**
     */
    default void markMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkMessageReadMethod(), responseObserver);
    }

    /**
     */
    default void markAllMessagesRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkAllMessagesReadMethod(), responseObserver);
    }

    /**
     */
    default void bulkMarkMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkMarkMessageReadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Room
     * </pre>
     */
    default void createRoom(com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoomMethod(), responseObserver);
    }

    /**
     */
    default void getRoom(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomMethod(), responseObserver);
    }

    /**
     */
    default void listAllRooms(com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllRoomsMethod(), responseObserver);
    }

    /**
     */
    default void listRoomsForMember(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoomsForMemberMethod(), responseObserver);
    }

    /**
     */
    default void archiveRoom(com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArchiveRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListUsersNames returns a list of users with names and ids
     * </pre>
     */
    default void listUsersNames(com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * allow room configurations to be updated
     * </pre>
     */
    default void updateRoomConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoomConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * update global configuration
     * </pre>
     */
    default void updateGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGlobalConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * get global configuration
     * </pre>
     */
    default void getGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGlobalConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Room303API.
   */
  public static abstract class Room303APIImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Room303APIGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Room303API.
   */
  public static final class Room303APIStub
      extends io.grpc.stub.AbstractAsyncStub<Room303APIStub> {
    private Room303APIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room303APIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room303APIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Member
     * Add a new member to a room, you must be a room admin in order to do that
     * </pre>
     */
    public void addRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRoomMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove room member (kick), the room member will not receive notifications from that room
     * </pre>
     */
    public void removeRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoomMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List the members of this room
     * </pre>
     */
    public void listRoomMembers(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoomMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a room member as admin, you must be a room admin in order to do this.
     * </pre>
     */
    public void setAdminForRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAdminForRoomMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * adds new member to a room and does not require the member to be admin
     * </pre>
     */
    public void joinRoom(com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * gets the member entity from the provided room if it exists
     * </pre>
     */
    public void getRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Message
     * </pre>
     */
    public void createMessage(com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editMessage(com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessage(com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessages(com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamMessageUpdates(com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamMessageUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUnreadStats(com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnreadStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkMessageReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markAllMessagesRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkAllMessagesReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bulkMarkMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkMarkMessageReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Room
     * </pre>
     */
    public void createRoom(com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoom(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllRooms(com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllRoomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoomsForMember(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoomsForMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void archiveRoom(com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArchiveRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListUsersNames returns a list of users with names and ids
     * </pre>
     */
    public void listUsersNames(com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListUsersNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * allow room configurations to be updated
     * </pre>
     */
    public void updateRoomConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoomConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * update global configuration
     * </pre>
     */
    public void updateGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGlobalConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get global configuration
     * </pre>
     */
    public void getGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGlobalConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Room303API.
   */
  public static final class Room303APIBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Room303APIBlockingStub> {
    private Room303APIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room303APIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room303APIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Member
     * Add a new member to a room, you must be a room admin in order to do that
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Member addRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRoomMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove room member (kick), the room member will not receive notifications from that room
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse removeRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoomMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List the members of this room
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse listRoomMembers(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoomMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a room member as admin, you must be a room admin in order to do this.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse setAdminForRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAdminForRoomMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * adds new member to a room and does not require the member to be admin
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Room joinRoom(com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * gets the member entity from the provided room if it exists
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Member getRoomMember(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Message
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse createMessage(com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse editMessage(com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse deleteMessage(com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse getMessages(com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse> streamMessageUpdates(
        com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamMessageUpdatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse getUnreadStats(com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnreadStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse markMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkMessageReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse markAllMessagesRead(com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkAllMessagesReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse bulkMarkMessageRead(com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkMarkMessageReadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Room
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Room createRoom(com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.commons.Room getRoom(com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse listAllRooms(com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllRoomsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse listRoomsForMember(com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoomsForMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.commons.Room archiveRoom(com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArchiveRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListUsersNames returns a list of users with names and ids
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse> listUsersNames(
        com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListUsersNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * allow room configurations to be updated
     * </pre>
     */
    public com.tcn.cloud.api.api.commons.Room updateRoomConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoomConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * update global configuration
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse updateGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGlobalConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get global configuration
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse getGlobalConfig(com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGlobalConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Room303API.
   */
  public static final class Room303APIFutureStub
      extends io.grpc.stub.AbstractFutureStub<Room303APIFutureStub> {
    private Room303APIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room303APIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Room303APIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Member
     * Add a new member to a room, you must be a room admin in order to do that
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Member> addRoomMember(
        com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRoomMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove room member (kick), the room member will not receive notifications from that room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse> removeRoomMember(
        com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoomMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List the members of this room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse> listRoomMembers(
        com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoomMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a room member as admin, you must be a room admin in order to do this.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse> setAdminForRoomMember(
        com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAdminForRoomMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * adds new member to a room and does not require the member to be admin
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Room> joinRoom(
        com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * gets the member entity from the provided room if it exists
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Member> getRoomMember(
        com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse> createMessage(
        com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse> editMessage(
        com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse> deleteMessage(
        com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse> getMessages(
        com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse> getUnreadStats(
        com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnreadStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse> markMessageRead(
        com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkMessageReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse> markAllMessagesRead(
        com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkAllMessagesReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse> bulkMarkMessageRead(
        com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkMarkMessageReadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Room> createRoom(
        com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Room> getRoom(
        com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> listAllRooms(
        com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllRoomsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse> listRoomsForMember(
        com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoomsForMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Room> archiveRoom(
        com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArchiveRoomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * allow room configurations to be updated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.commons.Room> updateRoomConfig(
        com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoomConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * update global configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse> updateGlobalConfig(
        com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGlobalConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get global configuration
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse> getGlobalConfig(
        com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGlobalConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ROOM_MEMBER = 0;
  private static final int METHODID_REMOVE_ROOM_MEMBER = 1;
  private static final int METHODID_LIST_ROOM_MEMBERS = 2;
  private static final int METHODID_SET_ADMIN_FOR_ROOM_MEMBER = 3;
  private static final int METHODID_JOIN_ROOM = 4;
  private static final int METHODID_GET_ROOM_MEMBER = 5;
  private static final int METHODID_CREATE_MESSAGE = 6;
  private static final int METHODID_EDIT_MESSAGE = 7;
  private static final int METHODID_DELETE_MESSAGE = 8;
  private static final int METHODID_GET_MESSAGES = 9;
  private static final int METHODID_STREAM_MESSAGE_UPDATES = 10;
  private static final int METHODID_GET_UNREAD_STATS = 11;
  private static final int METHODID_MARK_MESSAGE_READ = 12;
  private static final int METHODID_MARK_ALL_MESSAGES_READ = 13;
  private static final int METHODID_BULK_MARK_MESSAGE_READ = 14;
  private static final int METHODID_CREATE_ROOM = 15;
  private static final int METHODID_GET_ROOM = 16;
  private static final int METHODID_LIST_ALL_ROOMS = 17;
  private static final int METHODID_LIST_ROOMS_FOR_MEMBER = 18;
  private static final int METHODID_ARCHIVE_ROOM = 19;
  private static final int METHODID_LIST_USERS_NAMES = 20;
  private static final int METHODID_UPDATE_ROOM_CONFIG = 21;
  private static final int METHODID_UPDATE_GLOBAL_CONFIG = 22;
  private static final int METHODID_GET_GLOBAL_CONFIG = 23;

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
        case METHODID_ADD_ROOM_MEMBER:
          serviceImpl.addRoomMember((com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member>) responseObserver);
          break;
        case METHODID_REMOVE_ROOM_MEMBER:
          serviceImpl.removeRoomMember((com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse>) responseObserver);
          break;
        case METHODID_LIST_ROOM_MEMBERS:
          serviceImpl.listRoomMembers((com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse>) responseObserver);
          break;
        case METHODID_SET_ADMIN_FOR_ROOM_MEMBER:
          serviceImpl.setAdminForRoomMember((com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse>) responseObserver);
          break;
        case METHODID_JOIN_ROOM:
          serviceImpl.joinRoom((com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room>) responseObserver);
          break;
        case METHODID_GET_ROOM_MEMBER:
          serviceImpl.getRoomMember((com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Member>) responseObserver);
          break;
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse>) responseObserver);
          break;
        case METHODID_EDIT_MESSAGE:
          serviceImpl.editMessage((com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse>) responseObserver);
          break;
        case METHODID_GET_MESSAGES:
          serviceImpl.getMessages((com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse>) responseObserver);
          break;
        case METHODID_STREAM_MESSAGE_UPDATES:
          serviceImpl.streamMessageUpdates((com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse>) responseObserver);
          break;
        case METHODID_GET_UNREAD_STATS:
          serviceImpl.getUnreadStats((com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse>) responseObserver);
          break;
        case METHODID_MARK_MESSAGE_READ:
          serviceImpl.markMessageRead((com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse>) responseObserver);
          break;
        case METHODID_MARK_ALL_MESSAGES_READ:
          serviceImpl.markAllMessagesRead((com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse>) responseObserver);
          break;
        case METHODID_BULK_MARK_MESSAGE_READ:
          serviceImpl.bulkMarkMessageRead((com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROOM:
          serviceImpl.createRoom((com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room>) responseObserver);
          break;
        case METHODID_GET_ROOM:
          serviceImpl.getRoom((com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room>) responseObserver);
          break;
        case METHODID_LIST_ALL_ROOMS:
          serviceImpl.listAllRooms((com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>) responseObserver);
          break;
        case METHODID_LIST_ROOMS_FOR_MEMBER:
          serviceImpl.listRoomsForMember((com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>) responseObserver);
          break;
        case METHODID_ARCHIVE_ROOM:
          serviceImpl.archiveRoom((com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room>) responseObserver);
          break;
        case METHODID_LIST_USERS_NAMES:
          serviceImpl.listUsersNames((com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROOM_CONFIG:
          serviceImpl.updateRoomConfig((com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.commons.Room>) responseObserver);
          break;
        case METHODID_UPDATE_GLOBAL_CONFIG:
          serviceImpl.updateGlobalConfig((com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse>) responseObserver);
          break;
        case METHODID_GET_GLOBAL_CONFIG:
          serviceImpl.getGlobalConfig((com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse>) responseObserver);
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
          getAddRoomMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.AddRoomMemberRequest,
              com.tcn.cloud.api.api.commons.Member>(
                service, METHODID_ADD_ROOM_MEMBER)))
        .addMethod(
          getRemoveRoomMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.RemoveRoomMemberResponse>(
                service, METHODID_REMOVE_ROOM_MEMBER)))
        .addMethod(
          getListRoomMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.ListRoomMembersResponse>(
                service, METHODID_LIST_ROOM_MEMBERS)))
        .addMethod(
          getSetAdminForRoomMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.SetAdminForRoomMemberResponse>(
                service, METHODID_SET_ADMIN_FOR_ROOM_MEMBER)))
        .addMethod(
          getJoinRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.JoinRoomRequest,
              com.tcn.cloud.api.api.commons.Room>(
                service, METHODID_JOIN_ROOM)))
        .addMethod(
          getGetRoomMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.GetRoomMemberRequest,
              com.tcn.cloud.api.api.commons.Member>(
                service, METHODID_GET_ROOM_MEMBER)))
        .addMethod(
          getCreateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.CreateMessageResponse>(
                service, METHODID_CREATE_MESSAGE)))
        .addMethod(
          getEditMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.EditMessageRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.EditMessageResponse>(
                service, METHODID_EDIT_MESSAGE)))
        .addMethod(
          getDeleteMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.DeleteMessageResponse>(
                service, METHODID_DELETE_MESSAGE)))
        .addMethod(
          getGetMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.GetMessagesResponse>(
                service, METHODID_GET_MESSAGES)))
        .addMethod(
          getStreamMessageUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.StreamMessageUpdatesResponse>(
                service, METHODID_STREAM_MESSAGE_UPDATES)))
        .addMethod(
          getGetUnreadStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.GetUnreadStatsResponse>(
                service, METHODID_GET_UNREAD_STATS)))
        .addMethod(
          getMarkMessageReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.MarkMessageReadResponse>(
                service, METHODID_MARK_MESSAGE_READ)))
        .addMethod(
          getMarkAllMessagesReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.MarkAllMessagesReadResponse>(
                service, METHODID_MARK_ALL_MESSAGES_READ)))
        .addMethod(
          getBulkMarkMessageReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.BulkMarkMessageReadResponse>(
                service, METHODID_BULK_MARK_MESSAGE_READ)))
        .addMethod(
          getCreateRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.CreateRoomRequest,
              com.tcn.cloud.api.api.commons.Room>(
                service, METHODID_CREATE_ROOM)))
        .addMethod(
          getGetRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.GetRoomRequest,
              com.tcn.cloud.api.api.commons.Room>(
                service, METHODID_GET_ROOM)))
        .addMethod(
          getListAllRoomsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.ListAllRoomsRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>(
                service, METHODID_LIST_ALL_ROOMS)))
        .addMethod(
          getListRoomsForMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsForMemberRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.ListRoomsResponse>(
                service, METHODID_LIST_ROOMS_FOR_MEMBER)))
        .addMethod(
          getArchiveRoomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.ArchiveRoomRequest,
              com.tcn.cloud.api.api.commons.Room>(
                service, METHODID_ARCHIVE_ROOM)))
        .addMethod(
          getListUsersNamesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.ListUsersNamesResponse>(
                service, METHODID_LIST_USERS_NAMES)))
        .addMethod(
          getUpdateRoomConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.UpdateRoomConfigRequest,
              com.tcn.cloud.api.api.commons.Room>(
                service, METHODID_UPDATE_ROOM_CONFIG)))
        .addMethod(
          getUpdateGlobalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.UpdateGlobalConfigResponse>(
                service, METHODID_UPDATE_GLOBAL_CONFIG)))
        .addMethod(
          getGetGlobalConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigRequest,
              com.tcn.cloud.api.api.v1alpha1.room303.GetGlobalConfigResponse>(
                service, METHODID_GET_GLOBAL_CONFIG)))
        .build();
  }

  private static abstract class Room303APIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Room303APIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.room303.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Room303API");
    }
  }

  private static final class Room303APIFileDescriptorSupplier
      extends Room303APIBaseDescriptorSupplier {
    Room303APIFileDescriptorSupplier() {}
  }

  private static final class Room303APIMethodDescriptorSupplier
      extends Room303APIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Room303APIMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (Room303APIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Room303APIFileDescriptorSupplier())
              .addMethod(getAddRoomMemberMethod())
              .addMethod(getRemoveRoomMemberMethod())
              .addMethod(getListRoomMembersMethod())
              .addMethod(getSetAdminForRoomMemberMethod())
              .addMethod(getJoinRoomMethod())
              .addMethod(getGetRoomMemberMethod())
              .addMethod(getCreateMessageMethod())
              .addMethod(getEditMessageMethod())
              .addMethod(getDeleteMessageMethod())
              .addMethod(getGetMessagesMethod())
              .addMethod(getStreamMessageUpdatesMethod())
              .addMethod(getGetUnreadStatsMethod())
              .addMethod(getMarkMessageReadMethod())
              .addMethod(getMarkAllMessagesReadMethod())
              .addMethod(getBulkMarkMessageReadMethod())
              .addMethod(getCreateRoomMethod())
              .addMethod(getGetRoomMethod())
              .addMethod(getListAllRoomsMethod())
              .addMethod(getListRoomsForMemberMethod())
              .addMethod(getArchiveRoomMethod())
              .addMethod(getListUsersNamesMethod())
              .addMethod(getUpdateRoomConfigMethod())
              .addMethod(getUpdateGlobalConfigMethod())
              .addMethod(getGetGlobalConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
