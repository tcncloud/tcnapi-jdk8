// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/sentinel/entities.proto

package com.tcn.cloud.api.api.v1alpha1.sentinel;

public final class EntitiesProto {
  private EntitiesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_sentinel_SentinelEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_sentinel_SentinelEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_sentinel_LogEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_sentinel_LogEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_sentinel_LogEvent_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_sentinel_LogEvent_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_sentinel_SendEventsReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_sentinel_SendEventsReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_sentinel_SendEventsRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_sentinel_SendEventsRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$api/v1alpha1/sentinel/entities.proto\022\025" +
      "api.v1alpha1.sentinel\032\031api/commons/loggi" +
      "ng.proto\032\037google/protobuf/timestamp.prot" +
      "o\"X\n\rSentinelEvent\022>\n\tlog_event\030\001 \001(\0132\037." +
      "api.v1alpha1.sentinel.LogEventH\000R\010logEve" +
      "ntB\007\n\005event\"\215\003\n\010LogEvent\022\031\n\010trace_id\030\003 \001" +
      "(\tR\007traceId\022\035\n\nsession_id\030\004 \001(\tR\tsession" +
      "Id\022\030\n\007message\030\005 \001(\tR\007message\022\032\n\010location" +
      "\030\006 \001(\tR\010location\022\037\n\013stack_trace\030\007 \001(\tR\ns" +
      "tackTrace\0228\n\ttimestamp\030\010 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\ttimestamp\022I\n\010metadata\030" +
      "\t \003(\0132-.api.v1alpha1.sentinel.LogEvent.M" +
      "etadataEntryR\010metadata\022.\n\010severity\030\n \001(\016" +
      "2\022.api.commons.LevelR\010severity\032;\n\rMetada" +
      "taEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\t" +
      "R\005value:\0028\001\"M\n\rSendEventsReq\022<\n\006events\030\001" +
      " \003(\0132$.api.v1alpha1.sentinel.SentinelEve" +
      "ntR\006events\"\017\n\rSendEventsResB\256\001\n\'com.tcn." +
      "cloud.api.api.v1alpha1.sentinelB\rEntitie" +
      "sProtoP\001\242\002\003AVS\252\002\025Api.V1alpha1.Sentinel\312\002" +
      "\025Api\\V1alpha1\\Sentinel\342\002!Api\\V1alpha1\\Se" +
      "ntinel\\GPBMetadata\352\002\027Api::V1alpha1::Sent" +
      "inelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.LoggingProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_sentinel_SentinelEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_sentinel_SentinelEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_sentinel_SentinelEvent_descriptor,
        new java.lang.String[] { "LogEvent", "Event", });
    internal_static_api_v1alpha1_sentinel_LogEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_sentinel_LogEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_sentinel_LogEvent_descriptor,
        new java.lang.String[] { "TraceId", "SessionId", "Message", "Location", "StackTrace", "Timestamp", "Metadata", "Severity", });
    internal_static_api_v1alpha1_sentinel_LogEvent_MetadataEntry_descriptor =
      internal_static_api_v1alpha1_sentinel_LogEvent_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_sentinel_LogEvent_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_sentinel_LogEvent_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_sentinel_SendEventsReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_sentinel_SendEventsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_sentinel_SendEventsReq_descriptor,
        new java.lang.String[] { "Events", });
    internal_static_api_v1alpha1_sentinel_SendEventsRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_sentinel_SendEventsRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_sentinel_SendEventsRes_descriptor,
        new java.lang.String[] { });
    com.tcn.cloud.api.api.commons.LoggingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
