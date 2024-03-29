// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/delivery_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class DeliveryEventsProto {
  private DeliveryEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_DeliveryFailureEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_DeliveryFailureEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_DeliverySuccessEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_DeliverySuccessEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'api/commons/audit/delivery_events.prot" +
      "o\022\021api.commons.audit\032\037google/protobuf/ti" +
      "mestamp.proto\"\371\002\n\024DeliveryFailureEvent\0228" +
      "\n\030delivery_definition_name\030\001 \001(\003R\026delive" +
      "ryDefinitionName\022\025\n\006org_id\030\002 \001(\tR\005orgId\022" +
      "\'\n\017transaction_sid\030\003 \001(\003R\016transactionSid" +
      "\022)\n\020attachment_names\030\004 \003(\tR\017attachmentNa" +
      "mes\022=\n\014failure_time\030\005 \001(\0132\032.google.proto" +
      "buf.TimestampR\013failureTime\0222\n\025failure_er" +
      "ror_message\030\006 \001(\tR\023failureErrorMessage\022\036" +
      "\n\ndefinition\030\007 \001(\tR\ndefinition\022)\n\020origin" +
      "al_payload\030\010 \001(\tR\017originalPayload\"\243\002\n\024De" +
      "liverySuccessEvent\0228\n\030delivery_definitio" +
      "n_name\030\001 \001(\tR\026deliveryDefinitionName\022\025\n\006" +
      "org_id\030\002 \001(\tR\005orgId\022\'\n\017transaction_sid\030\003" +
      " \001(\003R\016transactionSid\022)\n\020attachment_names" +
      "\030\004 \003(\tR\017attachmentNames\022=\n\014success_time\030" +
      "\005 \001(\0132\032.google.protobuf.TimestampR\013succe" +
      "ssTime\022\'\n\017success_message\030\006 \001(\tR\016success" +
      "MessageB\240\001\n#com.tcn.cloud.api.api.common" +
      "s.auditB\023DeliveryEventsProtoP\001\242\002\003ACA\252\002\021A" +
      "pi.Commons.Audit\312\002\021Api\\Commons\\Audit\342\002\035A" +
      "pi\\Commons\\Audit\\GPBMetadata\352\002\023Api::Comm" +
      "ons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_audit_DeliveryFailureEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_DeliveryFailureEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_DeliveryFailureEvent_descriptor,
        new java.lang.String[] { "DeliveryDefinitionName", "OrgId", "TransactionSid", "AttachmentNames", "FailureTime", "FailureErrorMessage", "Definition", "OriginalPayload", });
    internal_static_api_commons_audit_DeliverySuccessEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_DeliverySuccessEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_DeliverySuccessEvent_descriptor,
        new java.lang.String[] { "DeliveryDefinitionName", "OrgId", "TransactionSid", "AttachmentNames", "SuccessTime", "SuccessMessage", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
