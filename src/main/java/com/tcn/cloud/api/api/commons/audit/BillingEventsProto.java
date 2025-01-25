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
    internal_static_api_commons_audit_BillingAccumulatedItemEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingAccumulatedItemEvent_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_RatedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_RatedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&api/commons/audit/billing_events.proto" +
      "\022\021api.commons.audit\"\221\001\n\033BillingAccumulat" +
      "edItemEvent\022\025\n\006org_id\030\001 \001(\tR\005orgId\022!\n\014pr" +
      "oduct_type\030\002 \001(\005R\013productType\022\"\n\revent_l" +
      "og_ids\030\003 \003(\003R\013eventLogIds\022\024\n\005cycle\030\004 \001(\t" +
      "R\005cycle\"d\n\035BillingCommitBillingPlanEvent" +
      "\022&\n\017billing_plan_id\030\001 \001(\tR\rbillingPlanId" +
      "\022\027\n\007user_id\030\002 \001(\tR\006userId:\002\030\001\"_\n\035Billing" +
      "CreateBillingPlanEvent\022!\n\014billing_plan\030\001" +
      " \001(\tR\013billingPlan\022\027\n\007user_id\030\002 \001(\tR\006user" +
      "Id:\002\030\001\"Z\n\031BillingCreateInvoiceEvent\022\034\n\007i" +
      "nvoice\030\001 \001(\tB\002\030\001R\007invoice\022\033\n\007user_id\030\002 \001" +
      "(\tB\002\030\001R\006userId:\002\030\001\"h\n BillingCreateRateD" +
      "efinitionEvent\022\'\n\017rate_definition\030\001 \001(\tR" +
      "\016rateDefinition\022\027\n\007user_id\030\002 \001(\tR\006userId" +
      ":\002\030\001\"d\n\035BillingDeleteBillingPlanEvent\022&\n" +
      "\017billing_plan_id\030\001 \001(\tR\rbillingPlanId\022\027\n" +
      "\007user_id\030\002 \001(\tR\006userId:\002\030\001\"_\n\031BillingDel" +
      "eteInvoiceEvent\022!\n\ninvoice_id\030\001 \001(\tB\002\030\001R" +
      "\tinvoiceId\022\033\n\007user_id\030\002 \001(\tB\002\030\001R\006userId:" +
      "\002\030\001\"m\n BillingDeleteRateDefinitionEvent\022" +
      ",\n\022rate_definition_id\030\001 \001(\tR\020rateDefinit" +
      "ionId\022\027\n\007user_id\030\002 \001(\tR\006userId:\002\030\001\"W\n\031Bi" +
      "llingExportInvoiceEvent\022\035\n\ninvoice_id\030\001 " +
      "\001(\tR\tinvoiceId\022\027\n\007user_id\030\002 \001(\tR\006userId:" +
      "\002\030\001\"_\n\035BillingUpdateBillingPlanEvent\022!\n\014" +
      "billing_plan\030\001 \001(\tR\013billingPlan\022\027\n\007user_" +
      "id\030\002 \001(\tR\006userId:\002\030\001\"Z\n\031BillingUpdateInv" +
      "oiceEvent\022\034\n\007invoice\030\001 \001(\tB\002\030\001R\007invoice\022" +
      "\033\n\007user_id\030\002 \001(\tB\002\030\001R\006userId:\002\030\001\"h\n Bill" +
      "ingUpdateRateDefinitionEvent\022\'\n\017rate_def" +
      "inition\030\001 \001(\tR\016rateDefinition\022\027\n\007user_id" +
      "\030\002 \001(\tR\006userId:\002\030\001\"\366\002\n\037BillingRatedItems" +
      "GeneratedEvent\022]\n\013rated_items\030\001 \003(\0132<.ap" +
      "i.commons.audit.BillingRatedItemsGenerat" +
      "edEvent.RatedItemR\nratedItems\032\363\001\n\tRatedI" +
      "tem\022\"\n\rrated_item_id\030\001 \001(\tR\013ratedItemId\022" +
      "#\n\rbilling_cycle\030\002 \001(\tR\014billingCycle\022 \n\014" +
      "event_log_id\030\003 \001(\tR\neventLogId\022\037\n\013module" +
      "_name\030\004 \001(\tR\nmoduleName\022\025\n\006org_id\030\005 \001(\tR" +
      "\005orgId\022,\n\022rate_definition_id\030\006 \001(\tR\020rate" +
      "DefinitionId\022\025\n\006sku_id\030\007 \001(\tR\005skuIdB\237\001\n#" +
      "com.tcn.cloud.api.api.commons.auditB\022Bil" +
      "lingEventsProtoP\001\242\002\003ACA\252\002\021Api.Commons.Au" +
      "dit\312\002\021Api\\Commons\\Audit\342\002\035Api\\Commons\\Au" +
      "dit\\GPBMetadata\352\002\023Api::Commons::Auditb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_audit_BillingAccumulatedItemEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_BillingAccumulatedItemEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingAccumulatedItemEvent_descriptor,
        new java.lang.String[] { "OrgId", "ProductType", "EventLogIds", "Cycle", });
    internal_static_api_commons_audit_BillingCommitBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_BillingCommitBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCommitBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlanId", "UserId", });
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlanId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor,
        new java.lang.String[] { "InvoiceId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinitionId", "UserId", });
    internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_audit_BillingExportInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor,
        new java.lang.String[] { "InvoiceId", "UserId", });
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_descriptor,
        new java.lang.String[] { "RatedItems", });
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_RatedItem_descriptor =
      internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_RatedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingRatedItemsGeneratedEvent_RatedItem_descriptor,
        new java.lang.String[] { "RatedItemId", "BillingCycle", "EventLogId", "ModuleName", "OrgId", "RateDefinitionId", "SkuId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
