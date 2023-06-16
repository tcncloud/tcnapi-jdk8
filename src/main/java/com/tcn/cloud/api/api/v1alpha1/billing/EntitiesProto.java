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
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_UpdateReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_UpdateReq_fieldAccessorTable;
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
      "/timestamp.proto\"\023\n\021GetBillingPlanReq\"Q\n" +
      "\021GetBillingPlanRes\022<\n\014billing_plan\030\001 \001(\013" +
      "2\031.api.commons.billing.PlanR\013billingPlan" +
      "\"\317\001\n\024UpdateBillingPlanReq\022N\n\007updates\030\001 \003" +
      "(\01324.api.v1alpha1.billing.UpdateBillingP" +
      "lanReq.UpdateReqR\007updates\032g\n\tUpdateReq\022B" +
      "\n\016billing_detail\030\001 \001(\0132\033.api.commons.bil" +
      "ling.DetailR\rbillingDetail\022\026\n\006fields\030\002 \003" +
      "(\tR\006fields\"T\n\024UpdateBillingPlanRes\022<\n\014bi" +
      "lling_plan\030\001 \001(\0132\031.api.commons.billing.P" +
      "lanR\013billingPlan\"N\n\rGetInvoiceReq\022=\n\014inv" +
      "oice_date\030\001 \001(\0132\032.google.protobuf.Timest" +
      "ampR\013invoiceDate\"G\n\rGetInvoiceRes\0226\n\007inv" +
      "oice\030\001 \001(\0132\034.api.commons.billing.Invoice" +
      "R\007invoiceB\251\001\n&com.tcn.cloud.api.api.v1al" +
      "pha1.billingB\rEntitiesProtoP\001\242\002\003AVB\252\002\024Ap" +
      "i.V1alpha1.Billing\312\002\024Api\\V1alpha1\\Billin" +
      "g\342\002 Api\\V1alpha1\\Billing\\GPBMetadata\352\002\026A" +
      "pi::V1alpha1::Billingb\006proto3"
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
        new java.lang.String[] { });
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
        new java.lang.String[] { "Updates", });
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_UpdateReq_descriptor =
      internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_UpdateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_UpdateBillingPlanReq_UpdateReq_descriptor,
        new java.lang.String[] { "BillingDetail", "Fields", });
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
        new java.lang.String[] { "InvoiceDate", });
    internal_static_api_v1alpha1_billing_GetInvoiceRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_billing_GetInvoiceRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_billing_GetInvoiceRes_descriptor,
        new java.lang.String[] { "Invoice", });
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.DetailProto.getDescriptor();
    com.tcn.cloud.api.api.commons.billing.InvoiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
