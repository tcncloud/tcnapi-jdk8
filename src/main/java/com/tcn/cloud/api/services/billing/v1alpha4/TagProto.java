// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/tag.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

public final class TagProto {
  private TagProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_CreateBillingTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_CreateBillingTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_CreateBillingTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_CreateBillingTagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_DeleteBillingTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_DeleteBillingTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_DeleteBillingTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_DeleteBillingTagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_GetBillingTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_GetBillingTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_GetBillingTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_GetBillingTagResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_ListBillingTagsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_ListBillingTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_ListBillingTagsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_ListBillingTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_v1alpha4_UpdateBillingTagResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_v1alpha4_UpdateBillingTagResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#services/billing/v1alpha4/tag.proto\022\031s" +
      "ervices.billing.v1alpha4\032 google/protobu" +
      "f/field_mask.proto\032-services/billing/ent" +
      "ities/v1alpha4/tags.proto\032$services/bill" +
      "ing/v1alpha4/core.proto\"\220\001\n\027CreateBillin" +
      "gTagRequest\022$\n\016billing_tag_id\030\001 \001(\tR\014bil" +
      "lingTagId\022O\n\013billing_tag\030\002 \001(\0132..service" +
      "s.billing.entities.v1alpha4.BillingTagR\n" +
      "billingTag\"@\n\030CreateBillingTagResponse\022$" +
      "\n\016billing_tag_id\030\001 \001(\tR\014billingTagId\"?\n\027" +
      "DeleteBillingTagRequest\022$\n\016billing_tag_i" +
      "d\030\001 \001(\tR\014billingTagId\"\032\n\030DeleteBillingTa" +
      "gResponse\"<\n\024GetBillingTagRequest\022$\n\016bil" +
      "ling_tag_id\030\001 \001(\tR\014billingTagId\"h\n\025GetBi" +
      "llingTagResponse\022O\n\013billing_tag\030\001 \001(\0132.." +
      "services.billing.entities.v1alpha4.Billi" +
      "ngTagR\nbillingTag\"\364\001\n\026ListBillingTagsReq" +
      "uest\022$\n\016billing_tag_id\030\001 \001(\tR\014billingTag" +
      "Id\022\026\n\006filter\030\002 \001(\tR\006filter\0222\n\006fields\030\003 \001" +
      "(\0132\032.google.protobuf.FieldMaskR\006fields\0223" +
      "\n\004sort\030\004 \003(\0132\037.services.billing.v1alpha4" +
      ".SortR\004sort\0223\n\004page\030\005 \001(\0132\037.services.bil" +
      "ling.v1alpha4.PageR\004page\"\202\001\n\027ListBilling" +
      "TagsResponse\022Q\n\014billing_tags\030\001 \003(\0132..ser" +
      "vices.billing.entities.v1alpha4.BillingT" +
      "agR\013billingTags\022\024\n\005token\030\002 \001(\tR\005token\"\315\001" +
      "\n\027UpdateBillingTagRequest\022$\n\016billing_tag" +
      "_id\030\001 \001(\tR\014billingTagId\022O\n\013billing_tag\030\002" +
      " \001(\0132..services.billing.entities.v1alpha" +
      "4.BillingTagR\nbillingTag\022;\n\013update_mask\030" +
      "\003 \001(\0132\032.google.protobuf.FieldMaskR\nupdat" +
      "eMask\"\032\n\030UpdateBillingTagResponseB\275\001\n+co" +
      "m.tcn.cloud.api.services.billing.v1alpha" +
      "4B\010TagProtoP\001\242\002\003SBX\252\002\031Services.Billing.V" +
      "1alpha4\312\002\031Services\\Billing\\V1alpha4\342\002%Se" +
      "rvices\\Billing\\V1alpha4\\GPBMetadata\352\002\033Se" +
      "rvices::Billing::V1alpha4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha4.TagsProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha4.CoreProto.getDescriptor(),
        });
    internal_static_services_billing_v1alpha4_CreateBillingTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_v1alpha4_CreateBillingTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_CreateBillingTagRequest_descriptor,
        new java.lang.String[] { "BillingTagId", "BillingTag", });
    internal_static_services_billing_v1alpha4_CreateBillingTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_v1alpha4_CreateBillingTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_CreateBillingTagResponse_descriptor,
        new java.lang.String[] { "BillingTagId", });
    internal_static_services_billing_v1alpha4_DeleteBillingTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_billing_v1alpha4_DeleteBillingTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_DeleteBillingTagRequest_descriptor,
        new java.lang.String[] { "BillingTagId", });
    internal_static_services_billing_v1alpha4_DeleteBillingTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_billing_v1alpha4_DeleteBillingTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_DeleteBillingTagResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_billing_v1alpha4_GetBillingTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_billing_v1alpha4_GetBillingTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_GetBillingTagRequest_descriptor,
        new java.lang.String[] { "BillingTagId", });
    internal_static_services_billing_v1alpha4_GetBillingTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_services_billing_v1alpha4_GetBillingTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_GetBillingTagResponse_descriptor,
        new java.lang.String[] { "BillingTag", });
    internal_static_services_billing_v1alpha4_ListBillingTagsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_services_billing_v1alpha4_ListBillingTagsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_ListBillingTagsRequest_descriptor,
        new java.lang.String[] { "BillingTagId", "Filter", "Fields", "Sort", "Page", });
    internal_static_services_billing_v1alpha4_ListBillingTagsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_services_billing_v1alpha4_ListBillingTagsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_ListBillingTagsResponse_descriptor,
        new java.lang.String[] { "BillingTags", "Token", });
    internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_UpdateBillingTagRequest_descriptor,
        new java.lang.String[] { "BillingTagId", "BillingTag", "UpdateMask", });
    internal_static_services_billing_v1alpha4_UpdateBillingTagResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_services_billing_v1alpha4_UpdateBillingTagResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_v1alpha4_UpdateBillingTagResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha4.TagsProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha4.CoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
