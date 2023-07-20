// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/billing/entities.proto

package com.tcn.cloud.api.api.v1alpha1.billing;

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
    internal_static_api_v1alpha1_billing_GetBillingPlanReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_GetBillingPlanReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_GetBillingPlanRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_GetBillingPlanRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_UpdateBillingPlanRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_UpdateBillingPlanRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_GetInvoiceReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_GetInvoiceReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_GetInvoiceRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_GetInvoiceRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/v1alpha1/billing/entities.proto\022\024a" +
      "pi.v1alpha1.billing\032\027annotations/authz.p" +
      "roto\032 api/commons/billing/detail.proto\032!" +
      "api/commons/billing/invoice.proto\032\034googl" +
      "e/api/annotations.proto\032\037google/protobuf" +
      "/timestamp.proto\"*\n\021GetBillingPlanReq\022\025\n" +
      "\006org_id\030\001 \001(\tR\005orgId\"Q\n\021GetBillingPlanRe" +
      "s\022<\n\014billing_plan\030\001 \001(\0132\031.api.commons.bi" +
      "lling.PlanR\013billingPlan\"s\n\024UpdateBilling" +
      "PlanReq\022D\n\017billing_details\030\001 \003(\0132\033.api.c" +
      "ommons.billing.DetailR\016billingDetails\022\025\n" +
      "\006org_id\030\002 \001(\tR\005orgId\"T\n\024UpdateBillingPla" +
      "nRes\022<\n\014billing_plan\030\001 \001(\0132\031.api.commons" +
      ".billing.PlanR\013billingPlan\"\361\001\n\rGetInvoic" +
      "eReq\022=\n\014invoice_date\030\001 \001(\0132\032.google.prot" +
      "obuf.TimestampR\013invoiceDate\022\025\n\006org_id\030\002 " +
      "\001(\tR\005orgId\022?\n\006format\030\003 \001(\0162#.api.v1alpha" +
      "1.billing.InvoiceFormatB\002\030\001R\006format\022I\n\016i" +
      "nvoice_format\030\004 \001(\0162\".api.commons.billin" +
      "g.InvoiceFormatR\rinvoiceFormat\"\307\001\n\rGetIn" +
      "voiceRes\0226\n\007invoice\030\001 \001(\0132\034.api.commons." +
      "billing.InvoiceR\007invoice\0224\n\005proto\030\002 \001(\0132" +
      "\034.api.commons.billing.InvoiceH\000R\005proto\022\031" +
      "\n\007csv_url\030\003 \001(\tH\000R\006csvUrl\022#\n\rbilling_cyc" +
      "le\030\004 \001(\tR\014billingCycleB\010\n\006format\"\375\001\n\031Exp" +
      "ortGeneratedInvoiceReq\022=\n\014invoice_date\030\001" +
      " \001(\0132\032.google.protobuf.TimestampR\013invoic" +
      "eDate\022\025\n\006org_id\030\002 \001(\tR\005orgId\022?\n\006format\030\003" +
      " \001(\0162#.api.v1alpha1.billing.InvoiceForma" +
      "tB\002\030\001R\006format\022I\n\016invoice_format\030\004 \001(\0162\"." +
      "api.commons.billing.InvoiceFormatR\rinvoi" +
      "ceFormat\"\233\001\n\031ExportGeneratedInvoiceRes\0224" +
      "\n\005proto\030\001 \001(\0132\034.api.commons.billing.Invo" +
      "iceH\000R\005proto\022\031\n\007csv_url\030\002 \001(\tH\000R\006csvUrl\022" +
      "#\n\rbilling_cycle\030\003 \001(\tR\014billingCycleB\010\n\006" +
      "format*a\n\rInvoiceFormat\022\036\n\032INVOICE_FORMA" +
      "T_UNSPECIFIED\020\000\022\030\n\024INVOICE_FORMAT_PROTO\020" +
      "\001\022\026\n\022INVOICE_FORMAT_CSV\020\002B\251\001\n&com.tcn.cl" +
      "oud.api.api.v1alpha1.billingB\rEntitiesPr" +
      "otoP\001\242\002\003AVB\252\002\024Api.V1alpha1.Billing\312\002\024Api" +
      "\\V1alpha1\\Billing\342\002 Api\\V1alpha1\\Billing" +
      "\\GPBMetadata\352\002\026Api::V1alpha1::Billingb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.billing.DetailProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.billing.InvoiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_billing_GetBillingPlanReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_billing_GetBillingPlanReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_GetBillingPlanReq_descriptor,
        new java.lang.String[] { "OrgId", });
    internal_static_api_v1alpha1_billing_GetBillingPlanRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_billing_GetBillingPlanRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_GetBillingPlanRes_descriptor,
        new java.lang.String[] { "BillingPlan", });
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_descriptor,
        new java.lang.String[] { "BillingDetails", "OrgId", });
    internal_static_api_v1alpha1_billing_UpdateBillingPlanRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_billing_UpdateBillingPlanRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_UpdateBillingPlanRes_descriptor,
        new java.lang.String[] { "BillingPlan", });
    internal_static_api_v1alpha1_billing_GetInvoiceReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_billing_GetInvoiceReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_GetInvoiceReq_descriptor,
        new java.lang.String[] { "InvoiceDate", "OrgId", "Format", "InvoiceFormat", });
    internal_static_api_v1alpha1_billing_GetInvoiceRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_billing_GetInvoiceRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_GetInvoiceRes_descriptor,
        new java.lang.String[] { "Invoice", "Proto", "CsvUrl", "BillingCycle", "Format", });
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceReq_descriptor,
        new java.lang.String[] { "InvoiceDate", "OrgId", "Format", "InvoiceFormat", });
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceRes_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_ExportGeneratedInvoiceRes_descriptor,
        new java.lang.String[] { "Proto", "CsvUrl", "BillingCycle", "Format", });
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.DetailProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.InvoiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
