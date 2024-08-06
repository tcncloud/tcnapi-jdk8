// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha4/tags.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha4;

public final class TagsProto {
  private TagsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha4_BillingTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha4_BillingTag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-services/billing/entities/v1alpha4/tag" +
      "s.proto\022\"services.billing.entities.v1alp" +
      "ha4\032\037google/protobuf/timestamp.proto\"\366\002\n" +
      "\nBillingTag\022$\n\016billing_tag_id\030\001 \001(\tR\014bil" +
      "lingTagId\022\022\n\004name\030\002 \001(\tR\004name\022;\n\013create_" +
      "time\030\003 \001(\0132\032.google.protobuf.TimestampR\n" +
      "createTime\022;\n\013update_time\030\004 \001(\0132\032.google" +
      ".protobuf.TimestampR\nupdateTime\022;\n\013delet" +
      "e_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "R\ndeleteTime\022\036\n\010category\030\006 \001(\tB\002\030\001R\010cate" +
      "gory\022W\n\020billing_category\030\007 \001(\0162,.service" +
      "s.billing.entities.v1alpha4.CategoryR\017bi" +
      "llingCategory*\242\002\n\010Category\022\030\n\024CATEGORY_U" +
      "NSPECIFIED\020\000\022%\n!CATEGORY_COMMUNICATIONS_" +
      "OMNI_CHAT\020d\022&\n\"CATEGORY_COMMUNICATIONS_O" +
      "MNI_EMAIL\020e\022$\n CATEGORY_COMMUNICATIONS_O" +
      "MNI_SMS\020f\022&\n\"CATEGORY_COMMUNICATIONS_OMN" +
      "I_AGENT\020g\022*\n&CATEGORY_COMMUNICATIONS_OMN" +
      "I_RESOURCES\020h\0223\n.CATEGORY_DATA_MANAGEMEN" +
      "T_COMPLIANCE_COMPLIANCE\020\310\001B\354\001\n4com.tcn.c" +
      "loud.api.services.billing.entities.v1alp" +
      "ha4B\tTagsProtoP\001\242\002\003SBE\252\002\"Services.Billin" +
      "g.Entities.V1alpha4\312\002\"Services\\Billing\\E" +
      "ntities\\V1alpha4\342\002.Services\\Billing\\Enti" +
      "ties\\V1alpha4\\GPBMetadata\352\002%Services::Bi" +
      "lling::Entities::V1alpha4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha4_BillingTag_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha4_BillingTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha4_BillingTag_descriptor,
        new java.lang.String[] { "BillingTagId", "Name", "CreateTime", "UpdateTime", "DeleteTime", "Category", "BillingCategory", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
