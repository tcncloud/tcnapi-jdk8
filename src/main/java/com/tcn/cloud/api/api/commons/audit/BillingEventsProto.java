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
      "\022\021api.commons.audit\032\036google/protobuf/wra" +
      "ppers.proto\0320services/billing/entities/v" +
      "1alpha1/invoice.proto\032-services/billing/" +
      "entities/v1alpha1/plan.proto\032.services/b" +
      "illing/entities/v1alpha1/rates.proto\"\214\001\n" +
      "\035BillingCreateBillingPlanEvent\022R\n\014billin" +
      "g_plan\030\001 \001(\0132/.services.billing.entities" +
      ".v1alpha1.BillingPlanR\013billingPlan\022\027\n\007us" +
      "er_id\030\002 \001(\tR\006userId\"{\n\031BillingCreateInvo" +
      "iceEvent\022E\n\007invoice\030\001 \001(\0132+.services.bil" +
      "ling.entities.v1alpha1.InvoiceR\007invoice\022" +
      "\027\n\007user_id\030\002 \001(\tR\006userId\"\230\001\n BillingCrea" +
      "teRateDefinitionEvent\022[\n\017rate_definition" +
      "\030\001 \001(\01322.services.billing.entities.v1alp" +
      "ha1.RateDefinitionR\016rateDefinition\022\027\n\007us" +
      "er_id\030\002 \001(\tR\006userId\"~\n\035BillingDeleteBill" +
      "ingPlanEvent\022D\n\017billing_plan_id\030\001 \001(\0132\034." +
      "google.protobuf.StringValueR\rbillingPlan" +
      "Id\022\027\n\007user_id\030\002 \001(\tR\006userId\"q\n\031BillingDe" +
      "leteInvoiceEvent\022;\n\ninvoice_id\030\001 \001(\0132\034.g" +
      "oogle.protobuf.StringValueR\tinvoiceId\022\027\n" +
      "\007user_id\030\002 \001(\tR\006userId\"\207\001\n BillingDelete" +
      "RateDefinitionEvent\022J\n\022rate_definition_i" +
      "d\030\001 \001(\0132\034.google.protobuf.StringValueR\020r" +
      "ateDefinitionId\022\027\n\007user_id\030\002 \001(\tR\006userId" +
      "\"{\n\031BillingExportInvoiceEvent\022E\n\007invoice" +
      "\030\001 \001(\0132+.services.billing.entities.v1alp" +
      "ha1.InvoiceR\007invoice\022\027\n\007user_id\030\002 \001(\tR\006u" +
      "serId\"\214\001\n\035BillingUpdateBillingPlanEvent\022" +
      "R\n\014billing_plan\030\001 \001(\0132/.services.billing" +
      ".entities.v1alpha1.BillingPlanR\013billingP" +
      "lan\022\027\n\007user_id\030\002 \001(\tR\006userId\"{\n\031BillingU" +
      "pdateInvoiceEvent\022E\n\007invoice\030\001 \001(\0132+.ser" +
      "vices.billing.entities.v1alpha1.InvoiceR" +
      "\007invoice\022\027\n\007user_id\030\002 \001(\tR\006userId\"\230\001\n Bi" +
      "llingUpdateRateDefinitionEvent\022[\n\017rate_d" +
      "efinition\030\001 \001(\01322.services.billing.entit" +
      "ies.v1alpha1.RateDefinitionR\016rateDefinit" +
      "ion\022\027\n\007user_id\030\002 \001(\tR\006userIdB\237\001\n#com.tcn" +
      ".cloud.api.api.commons.auditB\022BillingEve" +
      "ntsProtoP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312\002\021A" +
      "pi\\Commons\\Audit\342\002\035Api\\Commons\\Audit\\GPB" +
      "Metadata\352\002\023Api::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.PlanProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.RatesProto.getDescriptor(),
        });
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_BillingCreateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingCreateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlanId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_BillingDeleteInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteInvoiceEvent_descriptor,
        new java.lang.String[] { "InvoiceId", "UserId", });
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingDeleteRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinitionId", "UserId", });
    internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_audit_BillingExportInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingExportInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateBillingPlanEvent_descriptor,
        new java.lang.String[] { "BillingPlan", "UserId", });
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_audit_BillingUpdateInvoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateInvoiceEvent_descriptor,
        new java.lang.String[] { "Invoice", "UserId", });
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_BillingUpdateRateDefinitionEvent_descriptor,
        new java.lang.String[] { "RateDefinition", "UserId", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.InvoiceProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.PlanProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.RatesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
