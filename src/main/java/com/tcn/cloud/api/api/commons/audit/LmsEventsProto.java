// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/lms_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class LmsEventsProto {
  private LmsEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_LMSPipelineFailureEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/commons/audit/lms_events.proto\022\021ap" +
      "i.commons.audit\"\241\001\n\027LMSPipelineFailureEv" +
      "ent\022\035\n\nelement_id\030\001 \001(\tR\telementId\022!\n\014el" +
      "ement_name\030\002 \001(\tR\013elementName\022\033\n\tfile_na" +
      "me\030\003 \001(\tR\010fileName\022\'\n\017failure_message\030\004 " +
      "\001(\tR\016failureMessageB\233\001\n#com.tcn.cloud.ap" +
      "i.api.commons.auditB\016LmsEventsProtoP\001\242\002\003" +
      "ACA\252\002\021Api.Commons.Audit\312\002\021Api\\Commons\\Au" +
      "dit\342\002\035Api\\Commons\\Audit\\GPBMetadata\352\002\023Ap" +
      "i::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_LMSPipelineFailureEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor,
        new java.lang.String[] { "ElementId", "ElementName", "FileName", "FailureMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}