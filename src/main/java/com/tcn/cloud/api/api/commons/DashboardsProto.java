// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/dashboards.proto

package com.tcn.cloud.api.api.commons;

public final class DashboardsProto {
  private DashboardsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_DashboardSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_DashboardSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034api/commons/dashboards.proto\022\013api.comm" +
      "ons\"\336\001\n\020DashboardSummary\022!\n\014dashboard_id" +
      "\030\001 \001(\tR\013dashboardId\022\024\n\005title\030\002 \001(\tR\005titl" +
      "e\022 \n\013description\030\003 \001(\tR\013description\022\037\n\013p" +
      "anel_count\030\004 \001(\005R\npanelCount\022\037\n\013resource" +
      "_id\030\005 \001(\tR\nresourceId\022-\n\022standard_dashbo" +
      "ard\030\006 \001(\010R\021standardDashboardB}\n\035com.tcn." +
      "cloud.api.api.commonsB\017DashboardsProtoP\001" +
      "\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons\342\002\027Api" +
      "\\Commons\\GPBMetadata\352\002\014Api::Commonsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_DashboardSummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_DashboardSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_DashboardSummary_descriptor,
        new java.lang.String[] { "DashboardId", "Title", "Description", "PanelCount", "ResourceId", "StandardDashboard", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
