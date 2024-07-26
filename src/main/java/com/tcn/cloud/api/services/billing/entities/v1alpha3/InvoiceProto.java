// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public final class InvoiceProto {
  private InvoiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha3_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha3_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha3_InvoiceRow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha3_InvoiceRow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha3_InvoiceColumn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha3_InvoiceColumn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0services/billing/entities/v1alpha3/inv" +
      "oice.proto\022\"services.billing.entities.v1" +
      "alpha3\032\037google/protobuf/timestamp.proto\032" +
      "\036google/protobuf/wrappers.proto\032\031google/" +
      "type/decimal.proto\"\360\001\n\007Invoice\022#\n\rbillin" +
      "g_cycle\030\001 \001(\tR\014billingCycle\022;\n\013create_ti" +
      "me\030\002 \001(\0132\032.google.protobuf.TimestampR\ncr" +
      "eateTime\022B\n\004rows\030\003 \003(\0132..services.billin" +
      "g.entities.v1alpha3.InvoiceRowR\004rows\022?\n\014" +
      "download_url\030\004 \001(\0132\034.google.protobuf.Str" +
      "ingValueR\013downloadUrl\"\264\002\n\nInvoiceRow\022\037\n\t" +
      "client_id\030\001 \001(\tB\002\030\001R\010clientId\022!\n\nproduct" +
      "_id\030\002 \001(\tB\002\030\001R\tproductId\022$\n\013description\030" +
      "\003 \001(\tB\002\030\001R\013description\0222\n\004date\030\004 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\002\030\001R\004date\022K\n\007co" +
      "lumns\030\005 \003(\01321.services.billing.entities." +
      "v1alpha3.InvoiceColumnR\007columns\022;\n\014rated" +
      "_amount\030\006 \001(\0132\024.google.type.DecimalB\002\030\001R" +
      "\013ratedAmount\"9\n\rInvoiceColumn\022\022\n\004name\030\001 " +
      "\001(\tR\004name\022\024\n\005value\030\002 \001(\tR\005valueB\357\001\n4com." +
      "tcn.cloud.api.services.billing.entities." +
      "v1alpha3B\014InvoiceProtoP\001\242\002\003SBE\252\002\"Service" +
      "s.Billing.Entities.V1alpha3\312\002\"Services\\B" +
      "illing\\Entities\\V1alpha3\342\002.Services\\Bill" +
      "ing\\Entities\\V1alpha3\\GPBMetadata\352\002%Serv" +
      "ices::Billing::Entities::V1alpha3b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DecimalProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha3_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha3_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha3_Invoice_descriptor,
        new java.lang.String[] { "BillingCycle", "CreateTime", "Rows", "DownloadUrl", });
    internal_static_services_billing_entities_v1alpha3_InvoiceRow_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha3_InvoiceRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha3_InvoiceRow_descriptor,
        new java.lang.String[] { "ClientId", "ProductId", "Description", "Date", "Columns", "RatedAmount", });
    internal_static_services_billing_entities_v1alpha3_InvoiceColumn_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_billing_entities_v1alpha3_InvoiceColumn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha3_InvoiceColumn_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DecimalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
