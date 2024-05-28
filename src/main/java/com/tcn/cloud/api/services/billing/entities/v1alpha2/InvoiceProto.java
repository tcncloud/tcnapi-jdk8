// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/invoice.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

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
    internal_static_services_billing_entities_v1alpha2_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_InvoiceItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_InvoiceItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_InvoiceItemColumn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_InvoiceItemColumn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0services/billing/entities/v1alpha2/inv" +
      "oice.proto\022\"services.billing.entities.v1" +
      "alpha2\032\037google/protobuf/timestamp.proto\032" +
      "\036google/protobuf/wrappers.proto\032\031google/" +
      "type/decimal.proto\"\363\001\n\007Invoice\022#\n\rbillin" +
      "g_cycle\030\001 \001(\tR\014billingCycle\022;\n\013create_ti" +
      "me\030\002 \001(\0132\032.google.protobuf.TimestampR\ncr" +
      "eateTime\022E\n\005items\030\003 \003(\0132/.services.billi" +
      "ng.entities.v1alpha2.InvoiceItemR\005items\022" +
      "?\n\014download_url\030\004 \001(\0132\034.google.protobuf." +
      "StringValueR\013downloadUrl\"\212\003\n\013InvoiceItem" +
      "\022\033\n\tclient_id\030\001 \001(\tR\010clientId\022I\n\007product" +
      "\030\002 \001(\0162+.services.billing.entities.v1alp" +
      "ha2.ProductB\002\030\001R\007product\022 \n\013description\030" +
      "\003 \001(\tR\013description\022.\n\004date\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampR\004date\022\030\n\005price\030\005 \001(" +
      "\001B\002\030\001R\005price\022O\n\007columns\030\006 \003(\01325.services" +
      ".billing.entities.v1alpha2.InvoiceItemCo" +
      "lumnR\007columns\0227\n\014rated_amount\030\007 \001(\0132\024.go" +
      "ogle.type.DecimalR\013ratedAmount\022\035\n\nproduc" +
      "t_id\030\010 \001(\tR\tproductId\"=\n\021InvoiceItemColu" +
      "mn\022\022\n\004name\030\001 \001(\tR\004name\022\024\n\005value\030\002 \001(\tR\005v" +
      "alue*\247\002\n\007Product\022\027\n\023PRODUCT_UNSPECIFIED\020" +
      "\000\022\021\n\014PRODUCT_OMNI\020\310\001\022\027\n\022PRODUCT_OMNI_SEA" +
      "TS\020\311\001\022\033\n\026PRODUCT_OMNI_CHAT_SENT\020\312\001\022\037\n\032PR" +
      "ODUCT_OMNI_CHAT_RECEIVED\020\313\001\022\035\n\030PRODUCT_O" +
      "MNI_EMAILS_SENT\020\314\001\022!\n\034PRODUCT_OMNI_EMAIL" +
      "S_RECEIVED\020\315\001\022\032\n\025PRODUCT_OMNI_SMS_SENT\020\316" +
      "\001\022\036\n\031PRODUCT_OMNI_SMS_RECEIVED\020\317\001\022\027\n\022PRO" +
      "DUCT_COMPLIANCE\020\254\002\032\002\030\001B\357\001\n4com.tcn.cloud" +
      ".api.services.billing.entities.v1alpha2B" +
      "\014InvoiceProtoP\001\242\002\003SBE\252\002\"Services.Billing" +
      ".Entities.V1alpha2\312\002\"Services\\Billing\\En" +
      "tities\\V1alpha2\342\002.Services\\Billing\\Entit" +
      "ies\\V1alpha2\\GPBMetadata\352\002%Services::Bil" +
      "ling::Entities::V1alpha2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.DecimalProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha2_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha2_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_Invoice_descriptor,
        new java.lang.String[] { "BillingCycle", "CreateTime", "Items", "DownloadUrl", });
    internal_static_services_billing_entities_v1alpha2_InvoiceItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha2_InvoiceItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_InvoiceItem_descriptor,
        new java.lang.String[] { "ClientId", "Product", "Description", "Date", "Price", "Columns", "RatedAmount", "ProductId", });
    internal_static_services_billing_entities_v1alpha2_InvoiceItemColumn_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_billing_entities_v1alpha2_InvoiceItemColumn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_InvoiceItemColumn_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.DecimalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
