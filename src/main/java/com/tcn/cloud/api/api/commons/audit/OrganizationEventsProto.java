// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/organization_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class OrganizationEventsProto {
  private OrganizationEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_UsersAccessTokensExpiringEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_UsersAccessTokensExpiringEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+api/commons/audit/organization_events." +
      "proto\022\021api.commons.audit\"O\n\036UsersAccessT" +
      "okensExpiringEvent\022\025\n\006org_id\030\001 \001(\tR\005orgI" +
      "d\022\026\n\006report\030\002 \001(\tR\006reportB\244\001\n#com.tcn.cl" +
      "oud.api.api.commons.auditB\027OrganizationE" +
      "ventsProtoP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312\002" +
      "\021Api\\Commons\\Audit\342\002\035Api\\Commons\\Audit\\G" +
      "PBMetadata\352\002\023Api::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_audit_UsersAccessTokensExpiringEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_UsersAccessTokensExpiringEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_UsersAccessTokensExpiringEvent_descriptor,
        new java.lang.String[] { "OrgId", "Report", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
