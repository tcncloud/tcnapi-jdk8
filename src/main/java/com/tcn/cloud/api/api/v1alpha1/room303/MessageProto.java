// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/message.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_CreateMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_CreateMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_CreateMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_CreateMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_EditMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_EditMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_EditMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_EditMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetMessagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetMessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetMessagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_StreamMessageUpdatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_StreamMessageUpdatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_MarkMessageReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_MarkMessageReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_MarkMessageReadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_MarkMessageReadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_MarkAllMessagesReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_MarkAllMessagesReadResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetUnreadStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetUnreadStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetUnreadStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetUnreadStatsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_DeleteMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_DeleteMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_DeleteMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_DeleteMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_BulkMarkMessageReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_BulkMarkMessageReadResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/v1alpha1/room303/message.proto\022\024ap" +
      "i.v1alpha1.room303\032\031api/commons/room303." +
      "proto\032\037google/protobuf/timestamp.proto\"_" +
      "\n\024CreateMessageRequest\022\027\n\007room_id\030\001 \001(\tR" +
      "\006roomId\022\030\n\007payload\030\002 \001(\tR\007payload\022\024\n\005non" +
      "ce\030\003 \001(\tR\005nonce\"G\n\025CreateMessageResponse" +
      "\022.\n\007message\030\001 \001(\0132\024.api.commons.MessageR" +
      "\007message\"|\n\022EditMessageRequest\022\035\n\nmessag" +
      "e_id\030\001 \001(\tR\tmessageId\022\030\n\007payload\030\002 \001(\tR\007" +
      "payload\022\027\n\007room_id\030\003 \001(\tR\006roomId\022\024\n\005nonc" +
      "e\030\004 \001(\tR\005nonce\"E\n\023EditMessageResponse\022.\n" +
      "\007message\030\001 \001(\0132\024.api.commons.MessageR\007me" +
      "ssage\"g\n\022GetMessagesRequest\022\027\n\007room_id\030\002" +
      " \001(\tR\006roomId\0222\n\006offset\030\003 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\006offsetJ\004\010\001\020\002\"G\n\023GetMes" +
      "sagesResponse\0220\n\010messages\030\001 \003(\0132\024.api.co" +
      "mmons.MessageR\010messages\"S\n\033StreamMessage" +
      "UpdatesRequest\022\027\n\007room_id\030\001 \001(\tR\006roomId\022" +
      "\033\n\tmember_id\030\002 \001(\tR\010memberId\"N\n\034StreamMe" +
      "ssageUpdatesResponse\022.\n\007message\030\001 \001(\0132\024." +
      "api.commons.MessageR\007message\"T\n\026MarkMess" +
      "ageReadRequest\022\035\n\nmessage_id\030\001 \001(\tR\tmess" +
      "ageId\022\033\n\tmember_id\030\002 \001(\tR\010memberId\"\031\n\027Ma" +
      "rkMessageReadResponse\"5\n\032MarkAllMessages" +
      "ReadRequest\022\027\n\007room_id\030\001 \001(\tR\006roomId\"V\n\033" +
      "MarkAllMessagesReadResponse\0227\n\014rows_upda" +
      "ted\030\001 \003(\0132\024.api.commons.MessageR\013rowsUpd" +
      "ated\"\027\n\025GetUnreadStatsRequest\"H\n\026GetUnre" +
      "adStatsResponse\022.\n\005stats\030\001 \003(\0132\030.api.com" +
      "mons.MessageStatR\005stats\"d\n\024DeleteMessage" +
      "Request\022\035\n\nmessage_id\030\001 \001(\tR\tmessageId\022\027" +
      "\n\007room_id\030\002 \001(\tR\006roomId\022\024\n\005nonce\030\003 \001(\tR\005" +
      "nonce\"G\n\025DeleteMessageResponse\022.\n\007messag" +
      "e\030\001 \001(\0132\024.api.commons.MessageR\007message\"V" +
      "\n\032BulkMarkMessageReadRequest\022\027\n\007room_id\030" +
      "\001 \001(\tR\006roomId\022\037\n\013message_ids\030\002 \003(\tR\nmess" +
      "ageIds\"O\n\033BulkMarkMessageReadResponse\0220\n" +
      "\010messages\030\001 \003(\0132\024.api.commons.MessageR\010m" +
      "essagesB\250\001\n&com.tcn.cloud.api.api.v1alph" +
      "a1.room303B\014MessageProtoP\001\242\002\003AVR\252\002\024Api.V" +
      "1alpha1.Room303\312\002\024Api\\V1alpha1\\Room303\342\002" +
      " Api\\V1alpha1\\Room303\\GPBMetadata\352\002\026Api:" +
      ":V1alpha1::Room303b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.Room303Proto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_room303_CreateMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_room303_CreateMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_CreateMessageRequest_descriptor,
        new java.lang.String[] { "RoomId", "Payload", "Nonce", });
    internal_static_api_v1alpha1_room303_CreateMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_room303_CreateMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_CreateMessageResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_v1alpha1_room303_EditMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_room303_EditMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_EditMessageRequest_descriptor,
        new java.lang.String[] { "MessageId", "Payload", "RoomId", "Nonce", });
    internal_static_api_v1alpha1_room303_EditMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_room303_EditMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_EditMessageResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_v1alpha1_room303_GetMessagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_room303_GetMessagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetMessagesRequest_descriptor,
        new java.lang.String[] { "RoomId", "Offset", });
    internal_static_api_v1alpha1_room303_GetMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_room303_GetMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetMessagesResponse_descriptor,
        new java.lang.String[] { "Messages", });
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_StreamMessageUpdatesRequest_descriptor,
        new java.lang.String[] { "RoomId", "MemberId", });
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_room303_StreamMessageUpdatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_StreamMessageUpdatesResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_v1alpha1_room303_MarkMessageReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_room303_MarkMessageReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_MarkMessageReadRequest_descriptor,
        new java.lang.String[] { "MessageId", "MemberId", });
    internal_static_api_v1alpha1_room303_MarkMessageReadResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_room303_MarkMessageReadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_MarkMessageReadResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_MarkAllMessagesReadRequest_descriptor,
        new java.lang.String[] { "RoomId", });
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_room303_MarkAllMessagesReadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_MarkAllMessagesReadResponse_descriptor,
        new java.lang.String[] { "RowsUpdated", });
    internal_static_api_v1alpha1_room303_GetUnreadStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_room303_GetUnreadStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetUnreadStatsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_room303_GetUnreadStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_room303_GetUnreadStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetUnreadStatsResponse_descriptor,
        new java.lang.String[] { "Stats", });
    internal_static_api_v1alpha1_room303_DeleteMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_v1alpha1_room303_DeleteMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_DeleteMessageRequest_descriptor,
        new java.lang.String[] { "MessageId", "RoomId", "Nonce", });
    internal_static_api_v1alpha1_room303_DeleteMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_v1alpha1_room303_DeleteMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_DeleteMessageResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_BulkMarkMessageReadRequest_descriptor,
        new java.lang.String[] { "RoomId", "MessageIds", });
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_api_v1alpha1_room303_BulkMarkMessageReadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_BulkMarkMessageReadResponse_descriptor,
        new java.lang.String[] { "Messages", });
    com.tcn.cloud.api.api.commons.Room303Proto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
