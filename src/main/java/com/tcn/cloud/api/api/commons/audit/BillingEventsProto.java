// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/billing_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class BillingEventsProto {
  private BillingEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingCommitBillingPlanEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingCommitBillingPlanEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingCreateBillingPlanEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingDeleteInvoiceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingExportInvoiceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingUpdateInvoiceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&api/commons/audit/billing_events.proto" +
      "\022\021api.commons.audit\"`\n\035BillingCommitBill" +
      "ingPlanEvent\022&\n\017billing_plan_id\030\001 \001(\tR\rb" +
      "illingPlanId\022\027\n\007user_id\030\002 \001(\tR\006userId\"[\n" +
      "\035BillingCreateBillingPlanEvent\022!\n\014billin" +
      "g_plan\030\001 \001(\tR\013billingPlan\022\027\n\007user_id\030\002 \001" +
      "(\tR\006userId\"N\n\031BillingCreateInvoiceEvent\022" +
      "\030\n\007invoice\030\001 \001(\tR\007invoice\022\027\n\007user_id\030\002 \001" +
      "(\tR\006userId\"d\n BillingCreateRateDefinitio" +
      "nEvent\022\'\n\017rate_definition\030\001 \001(\tR\016rateDef" +
      "inition\022\027\n\007user_id\030\002 \001(\tR\006userId\"`\n\035Bill" +
      "ingDeleteBillingPlanEvent\022&\n\017billing_pla" +
      "n_id\030\001 \001(\tR\rbillingPlanId\022\027\n\007user_id\030\002 \001" +
      "(\tR\006userId\"S\n\031BillingDeleteInvoiceEvent\022" +
      "\035\n\ninvoice_id\030\001 \001(\tR\tinvoiceId\022\027\n\007user_i" +
      "d\030\002 \001(\tR\006userId\"i\n BillingDeleteRateDefi" +
      "nitionEvent\022,\n\022rate_definition_id\030\001 \001(\tR" +
      "\020rateDefinitionId\022\027\n\007user_id\030\002 \001(\tR\006user" +
      "Id\"S\n\031BillingExportInvoiceEvent\022\035\n\ninvoi" +
      "ce_id\030\001 \001(\tR\tinvoiceId\022\027\n\007user_id\030\002 \001(\tR" +
      "\006userId\"[\n\035BillingUpdateBillingPlanEvent" +
      "\022!\n\014billing_plan\030\001 \001(\tR\013billingPlan\022\027\n\007u" +
      "ser_id\030\002 \001(\tR\006userId\"N\n\031BillingUpdateInv" +
      "oiceEvent\022\030\n\007invoice\030\001 \001(\tR\007invoice\022\027\n\007u" +
      "ser_id\030\002 \001(\tR\006userId\"d\n BillingUpdateRat" +
      "eDefinitionEvent\022\'\n\017rate_definition\030\001 \001(" +
      "\tR\016rateDefinition\022\027\n\007user_id\030\002 \001(\tR\006user" +
      "IdB\237\001\n#com.tcn.cloud.api.api.commons.aud" +
      "itB\022BillingEventsProtoP\001\242\002\003ACA\252\002\021Api.Com" +
      "mons.Audit\312\002\021Api\\Commons\\Audit\342\002\035Api\\Com" +
      "mons\\Audit\\GPBMetadata\352\002\023Api::Commons::A" +
      "uditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_audit_BillingCommitBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_BillingCommitBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCommitBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlanId", "UserId", });
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlanId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor,
        new java.lang.String[] { "InvoiceId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinitionId", "UserId", });
    internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_audit_BillingExportInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor,
        new java.lang.String[] { "InvoiceId", "UserId", });
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}