// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/callmonitor.proto

package com.tcn.cloud.api.api.commons;

public final class CallmonitorProto {
  private CallmonitorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_HoldQueueCallStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_HoldQueueCallStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035api/commons/callmonitor.proto\022\013api.com" +
      "mons\032\037google/protobuf/timestamp.proto\"\215\003" +
      "\n\022HoldQueueCallStats\022\027\n\007call_id\030\001 \001(\tR\006c" +
      "allId\022\025\n\006org_id\030\002 \001(\tR\005orgId\022\037\n\013campaign" +
      "_id\030\003 \001(\tR\ncampaignId\022!\n\014phone_number\030\004 " +
      "\001(\tR\013phoneNumber\022;\n\006status\030\005 \001(\0162#.api.c" +
      "ommons.HoldQueueMonitorStatusR\006status\0226\n" +
      "\027monitor_duration_millis\030\007 \001(\003R\025monitorD" +
      "urationMillis\022H\n\022monitor_start_time\030\010 \001(" +
      "\0132\032.google.protobuf.TimestampR\020monitorSt" +
      "artTime\022D\n\020monitor_end_time\030\t \001(\0132\032.goog" +
      "le.protobuf.TimestampR\016monitorEndTime*\337\001" +
      "\n\026HoldQueueMonitorStatus\022)\n%HOLD_QUEUE_M" +
      "ONITOR_STATUS_UNSPECIFIED\020\000\022(\n$HOLD_QUEU" +
      "E_MONITOR_STATUS_MONITORING\020\001\022%\n!HOLD_QU" +
      "EUE_MONITOR_STATUS_SUCCESS\020\002\022$\n HOLD_QUE" +
      "UE_MONITOR_STATUS_FAILED\020\003\022#\n\037HOLD_QUEUE" +
      "_MONITOR_STATUS_ENDED\020\004B~\n\035com.tcn.cloud" +
      ".api.api.commonsB\020CallmonitorProtoP\001\242\002\003A" +
      "CX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002\027Api\\Com" +
      "mons\\GPBMetadata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_HoldQueueCallStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_HoldQueueCallStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_HoldQueueCallStats_descriptor,
        new java.lang.String[] { "CallId", "OrgId", "CampaignId", "PhoneNumber", "Status", "MonitorDurationMillis", "MonitorStartTime", "MonitorEndTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
