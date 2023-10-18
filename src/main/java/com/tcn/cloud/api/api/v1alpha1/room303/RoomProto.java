// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/room.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public final class RoomProto {
  private RoomProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_CreateRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_CreateRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ListAllRoomsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ListAllRoomsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ListRoomsForMemberRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ListRoomsForMemberRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ListRoomsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ListRoomsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ArchiveRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ArchiveRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ListUsersNamesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ListUsersNamesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_ListUsersNamesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_ListUsersNamesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_UserDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_UserDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_UpdateRoomConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_UpdateRoomConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_UpdateGlobalConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_UpdateGlobalConfigResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetGlobalConfigRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetGlobalConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_room303_GetGlobalConfigResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_room303_GetGlobalConfigResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037api/v1alpha1/room303/room.proto\022\024api.v" +
      "1alpha1.room303\032\031api/commons/room303.pro" +
      "to\032\026api/commons/user.proto\032 google/proto" +
      "buf/field_mask.proto\"l\n\021CreateRoomReques" +
      "t\022\022\n\004name\030\001 \001(\tR\004name\022)\n\004type\030\002 \001(\0162\025.ap" +
      "i.commons.RoomTypeR\004type\022\030\n\007members\030\003 \003(" +
      "\tR\007members\")\n\016GetRoomRequest\022\027\n\007room_id\030" +
      "\001 \001(\tR\006roomId\"\025\n\023ListAllRoomsRequest\"\033\n\031" +
      "ListRoomsForMemberRequest\"<\n\021ListRoomsRe" +
      "sponse\022\'\n\005rooms\030\001 \003(\0132\021.api.commons.Room" +
      "R\005rooms\"-\n\022ArchiveRoomRequest\022\027\n\007room_id" +
      "\030\001 \001(\tR\006roomId\"\223\001\n\025ListUsersNamesRequest" +
      "\022\025\n\006org_id\030\001 \001(\tR\005orgId\022\024\n\005agent\030\002 \001(\010R\005" +
      "agent\022M\n\017archived_filter\030\003 \001(\0162$.api.com" +
      "mons.UserArchivedStateFilterR\016archivedFi" +
      "lter\"^\n\026ListUsersNamesResponse\022D\n\014user_d" +
      "etails\030\001 \003(\0132!.api.v1alpha1.room303.User" +
      "DetailsR\013userDetails\"\177\n\013UserDetails\022\027\n\007u" +
      "ser_id\030\001 \001(\tR\006userId\022\033\n\tuser_name\030\002 \001(\tR" +
      "\010userName\022\035\n\nfirst_name\030\003 \001(\tR\tfirstName" +
      "\022\033\n\tlast_name\030\004 \001(\tR\010lastName\"\236\001\n\027Update" +
      "RoomConfigRequest\022\027\n\007room_id\030\001 \001(\tR\006room" +
      "Id\022/\n\006config\030\002 \001(\0132\027.api.commons.RoomCon" +
      "figR\006config\0229\n\nfield_mask\030d \001(\0132\032.google" +
      ".protobuf.FieldMaskR\tfieldMask\"\211\001\n\031Updat" +
      "eGlobalConfigRequest\0221\n\006config\030\001 \001(\0132\031.a" +
      "pi.commons.GlobalConfigR\006config\0229\n\nfield" +
      "_mask\030d \001(\0132\032.google.protobuf.FieldMaskR" +
      "\tfieldMask\"O\n\032UpdateGlobalConfigResponse" +
      "\0221\n\006config\030\001 \001(\0132\031.api.commons.GlobalCon" +
      "figR\006config\"K\n\026GetGlobalConfigRequest\0221\n" +
      "\006config\030\001 \001(\0132\031.api.commons.GlobalConfig" +
      "R\006config\"L\n\027GetGlobalConfigResponse\0221\n\006c" +
      "onfig\030\001 \001(\0132\031.api.commons.GlobalConfigR\006" +
      "configB\245\001\n&com.tcn.cloud.api.api.v1alpha" +
      "1.room303B\tRoomProtoP\001\242\002\003AVR\252\002\024Api.V1alp" +
      "ha1.Room303\312\002\024Api\\V1alpha1\\Room303\342\002 Api" +
      "\\V1alpha1\\Room303\\GPBMetadata\352\002\026Api::V1a" +
      "lpha1::Room303b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.Room303Proto.getDescriptor(),
          com.tcn.cloud.api.api.commons.UserProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_room303_CreateRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_room303_CreateRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_CreateRoomRequest_descriptor,
        new java.lang.String[] { "Name", "Type", "Members", });
    internal_static_api_v1alpha1_room303_GetRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_room303_GetRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetRoomRequest_descriptor,
        new java.lang.String[] { "RoomId", });
    internal_static_api_v1alpha1_room303_ListAllRoomsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_room303_ListAllRoomsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ListAllRoomsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_room303_ListRoomsForMemberRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_room303_ListRoomsForMemberRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ListRoomsForMemberRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_room303_ListRoomsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_room303_ListRoomsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ListRoomsResponse_descriptor,
        new java.lang.String[] { "Rooms", });
    internal_static_api_v1alpha1_room303_ArchiveRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_room303_ArchiveRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ArchiveRoomRequest_descriptor,
        new java.lang.String[] { "RoomId", });
    internal_static_api_v1alpha1_room303_ListUsersNamesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_room303_ListUsersNamesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ListUsersNamesRequest_descriptor,
        new java.lang.String[] { "OrgId", "Agent", "ArchivedFilter", });
    internal_static_api_v1alpha1_room303_ListUsersNamesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_room303_ListUsersNamesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_ListUsersNamesResponse_descriptor,
        new java.lang.String[] { "UserDetails", });
    internal_static_api_v1alpha1_room303_UserDetails_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_room303_UserDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_UserDetails_descriptor,
        new java.lang.String[] { "UserId", "UserName", "FirstName", "LastName", });
    internal_static_api_v1alpha1_room303_UpdateRoomConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_room303_UpdateRoomConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_UpdateRoomConfigRequest_descriptor,
        new java.lang.String[] { "RoomId", "Config", "FieldMask", });
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_UpdateGlobalConfigRequest_descriptor,
        new java.lang.String[] { "Config", "FieldMask", });
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_room303_UpdateGlobalConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_UpdateGlobalConfigResponse_descriptor,
        new java.lang.String[] { "Config", });
    internal_static_api_v1alpha1_room303_GetGlobalConfigRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_room303_GetGlobalConfigRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetGlobalConfigRequest_descriptor,
        new java.lang.String[] { "Config", });
    internal_static_api_v1alpha1_room303_GetGlobalConfigResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_room303_GetGlobalConfigResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_room303_GetGlobalConfigResponse_descriptor,
        new java.lang.String[] { "Config", });
    com.tcn.cloud.api.api.commons.Room303Proto.getDescriptor();
    com.tcn.cloud.api.api.commons.UserProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
