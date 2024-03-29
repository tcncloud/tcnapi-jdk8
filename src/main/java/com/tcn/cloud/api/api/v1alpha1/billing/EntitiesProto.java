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
      "/timestamp.proto\"2\n\021GetBillingPlanReq\022\031\n" +
      "\006org_id\030\001 \001(\tB\002\030\001R\005orgId:\002\030\001\"Y\n\021GetBilli" +
      "ngPlanRes\022@\n\014billing_plan\030\001 \001(\0132\031.api.co" +
      "mmons.billing.PlanB\002\030\001R\013billingPlan:\002\030\001\"" +
      "\177\n\024UpdateBillingPlanReq\022H\n\017billing_detai" +
      "ls\030\001 \003(\0132\033.api.commons.billing.DetailB\002\030" +
      "\001R\016billingDetails\022\031\n\006org_id\030\002 \001(\tB\002\030\001R\005o" +
      "rgId:\002\030\001\"\\\n\024UpdateBillingPlanRes\022@\n\014bill" +
      "ing_plan\030\001 \001(\0132\031.api.commons.billing.Pla" +
      "nB\002\030\001R\013billingPlan:\002\030\001\"\201\002\n\rGetInvoiceReq" +
      "\022A\n\014invoice_date\030\001 \001(\0132\032.google.protobuf" +
      ".TimestampB\002\030\001R\013invoiceDate\022\031\n\006org_id\030\002 " +
      "\001(\tB\002\030\001R\005orgId\022?\n\006format\030\003 \001(\0162#.api.v1a" +
      "lpha1.billing.InvoiceFormatB\002\030\001R\006format\022" +
      "M\n\016invoice_format\030\004 \001(\0162\".api.commons.bi" +
      "lling.InvoiceFormatB\002\030\001R\rinvoiceFormat:\002" +
      "\030\001\"\342\002\n\rGetInvoiceRes\022:\n\007invoice\030\001 \001(\0132\034." +
      "api.commons.billing.InvoiceB\002\030\001R\007invoice" +
      "\0228\n\005proto\030\002 \001(\0132\034.api.commons.billing.In" +
      "voiceB\002\030\001H\000R\005proto\022\035\n\007csv_url\030\003 \001(\tB\002\030\001H" +
      "\000R\006csvUrl\022G\n\rinvoice_proto\030d \001(\0132\034.api.c" +
      "ommons.billing.InvoiceB\002\030\001H\001R\014invoicePro" +
      "to\022,\n\017invoice_csv_url\030e \001(\tB\002\030\001H\001R\rinvoi" +
      "ceCsvUrl\022\'\n\rbilling_cycle\030\004 \001(\tB\002\030\001R\014bil" +
      "lingCycle:\002\030\001B\010\n\006formatB\016\n\014invoice_data\"" +
      "\215\002\n\031ExportGeneratedInvoiceReq\022A\n\014invoice" +
      "_date\030\001 \001(\0132\032.google.protobuf.TimestampB" +
      "\002\030\001R\013invoiceDate\022\031\n\006org_id\030\002 \001(\tB\002\030\001R\005or" +
      "gId\022?\n\006format\030\003 \001(\0162#.api.v1alpha1.billi" +
      "ng.InvoiceFormatB\002\030\001R\006format\022M\n\016invoice_" +
      "format\030\004 \001(\0162\".api.commons.billing.Invoi" +
      "ceFormatB\002\030\001R\rinvoiceFormat:\002\030\001\"\262\002\n\031Expo" +
      "rtGeneratedInvoiceRes\0228\n\005proto\030\001 \001(\0132\034.a" +
      "pi.commons.billing.InvoiceB\002\030\001H\000R\005proto\022" +
      "\035\n\007csv_url\030\002 \001(\tB\002\030\001H\000R\006csvUrl\022G\n\rinvoic" +
      "e_proto\030d \001(\0132\034.api.commons.billing.Invo" +
      "iceB\002\030\001H\001R\014invoiceProto\022,\n\017invoice_csv_u" +
      "rl\030e \001(\tB\002\030\001H\001R\rinvoiceCsvUrl\022\'\n\rbilling" +
      "_cycle\030\004 \001(\tB\002\030\001R\014billingCycle:\002\030\001B\010\n\006fo" +
      "rmatB\016\n\014invoice_data*e\n\rInvoiceFormat\022\036\n" +
      "\032INVOICE_FORMAT_UNSPECIFIED\020\000\022\030\n\024INVOICE" +
      "_FORMAT_PROTO\020\001\022\026\n\022INVOICE_FORMAT_CSV\020\002\032" +
      "\002\030\001B\251\001\n&com.tcn.cloud.api.api.v1alpha1.b" +
      "illingB\rEntitiesProtoP\001\242\002\003AVB\252\002\024Api.V1al" +
      "pha1.Billing\312\002\024Api\\V1alpha1\\Billing\342\002 Ap" +
      "i\\V1alpha1\\Billing\\GPBMetadata\352\002\026Api::V1" +
      "alpha1::Billingb\006proto3"
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
        new java.lang.String[] { "Invoice", "Proto", "CsvUrl", "InvoiceProto", "InvoiceCsvUrl", "BillingCycle", "Format", "InvoiceData", });
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
        new java.lang.String[] { "Proto", "CsvUrl", "InvoiceProto", "InvoiceCsvUrl", "BillingCycle", "Format", "InvoiceData", });
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.DetailProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.InvoiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
