// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/sku.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

public final class SkuProto {
  private SkuProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_CreateSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_CreateSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_CreateSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_CreateSkuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_DeleteSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_DeleteSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_DeleteSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_DeleteSkuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_GetSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_GetSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_GetSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_GetSkuResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_ListSkusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_ListSkusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_ListSkusResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_ListSkusResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_UpdateSkuRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_UpdateSkuRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha3_UpdateSkuResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha3_UpdateSkuResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#services/billing/v1alpha3/sku.proto\022\031s" +
      "ervices.billing.v1alpha3\032 google/protobu" +
      "f/field_mask.proto\032,services/billing/ent" +
      "ities/v1alpha3/sku.proto\032$services/billi" +
      "ng/v1alpha3/core.proto\"d\n\020CreateSkuReque" +
      "st\022\025\n\006sku_id\030\001 \001(\tR\005skuId\0229\n\003sku\030\002 \001(\0132\'" +
      ".services.billing.entities.v1alpha3.SkuR" +
      "\003sku\"*\n\021CreateSkuResponse\022\025\n\006sku_id\030\001 \001(" +
      "\tR\005skuId\")\n\020DeleteSkuRequest\022\025\n\006sku_id\030\001" +
      " \001(\tR\005skuId\"\023\n\021DeleteSkuResponse\"&\n\rGetS" +
      "kuRequest\022\025\n\006sku_id\030\001 \001(\tR\005skuId\"K\n\016GetS" +
      "kuResponse\0229\n\003sku\030\001 \001(\0132\'.services.billi" +
      "ng.entities.v1alpha3.SkuR\003sku\"\336\001\n\017ListSk" +
      "usRequest\022\025\n\006sku_id\030\001 \001(\tR\005skuId\022\026\n\006filt" +
      "er\030\002 \001(\tR\006filter\0222\n\006fields\030\003 \001(\0132\032.googl" +
      "e.protobuf.FieldMaskR\006fields\0223\n\004sort\030\004 \003" +
      "(\0132\037.services.billing.v1alpha3.SortR\004sor" +
      "t\0223\n\004page\030\005 \001(\0132\037.services.billing.v1alp" +
      "ha3.PageR\004page\"e\n\020ListSkusResponse\022;\n\004sk" +
      "us\030\001 \003(\0132\'.services.billing.entities.v1a" +
      "lpha3.SkuR\004skus\022\024\n\005token\030\002 \001(\tR\005token\"\245\001" +
      "\n\020UpdateSkuRequest\022\025\n\006sku_id\030\001 \001(\tR\005skuI" +
      "d\0229\n\003sku\030\002 \001(\0132\'.services.billing.entiti" +
      "es.v1alpha3.SkuR\003sku\022?\n\rupdate_fields\030\003 " +
      "\001(\0132\032.google.protobuf.FieldMaskR\014updateF" +
      "ields\"\023\n\021UpdateSkuResponseB\275\001\n+com.tcn.c" +
      "loud.api.services.billing.v1alpha3B\010SkuP" +
      "rotoP\001\242\002\003SBX\252\002\031Services.Billing.V1alpha3" +
      "\312\002\031Services\\Billing\\V1alpha3\342\002%Services\\" +
      "Billing\\V1alpha3\\GPBMetadata\352\002\033Services:" +
      ":Billing::V1alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha3.SkuProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha3.CoreProto.getDescriptor(),
        });
    internal_static_services_billing_v1alpha3_CreateSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_v1alpha3_CreateSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_CreateSkuRequest_descriptor,
        new java.lang.String[] { "SkuId", "Sku", });
    internal_static_services_billing_v1alpha3_CreateSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_v1alpha3_CreateSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_CreateSkuResponse_descriptor,
        new java.lang.String[] { "SkuId", });
    internal_static_services_billing_v1alpha3_DeleteSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_billing_v1alpha3_DeleteSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_DeleteSkuRequest_descriptor,
        new java.lang.String[] { "SkuId", });
    internal_static_services_billing_v1alpha3_DeleteSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_billing_v1alpha3_DeleteSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_DeleteSkuResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_billing_v1alpha3_GetSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_billing_v1alpha3_GetSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_GetSkuRequest_descriptor,
        new java.lang.String[] { "SkuId", });
    internal_static_services_billing_v1alpha3_GetSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_services_billing_v1alpha3_GetSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_GetSkuResponse_descriptor,
        new java.lang.String[] { "Sku", });
    internal_static_services_billing_v1alpha3_ListSkusRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_services_billing_v1alpha3_ListSkusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_ListSkusRequest_descriptor,
        new java.lang.String[] { "SkuId", "Filter", "Fields", "Sort", "Page", });
    internal_static_services_billing_v1alpha3_ListSkusResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_services_billing_v1alpha3_ListSkusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_ListSkusResponse_descriptor,
        new java.lang.String[] { "Skus", "Token", });
    internal_static_services_billing_v1alpha3_UpdateSkuRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_services_billing_v1alpha3_UpdateSkuRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_UpdateSkuRequest_descriptor,
        new java.lang.String[] { "SkuId", "Sku", "UpdateFields", });
    internal_static_services_billing_v1alpha3_UpdateSkuResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_services_billing_v1alpha3_UpdateSkuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha3_UpdateSkuResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha3.SkuProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha3.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
