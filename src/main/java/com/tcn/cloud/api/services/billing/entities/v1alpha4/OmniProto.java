// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha4/omni.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha4;

public final class OmniProto {
  private OmniProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha4_OmniSmsConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha4_OmniSmsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha4_OmniSmsUnitConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha4_OmniSmsUnitConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-services/billing/entities/v1alpha4/omn" +
      "i.proto\022\"services.billing.entities.v1alp" +
      "ha4\0321services/billing/entities/v1alpha4/" +
      "matching.proto\0320services/billing/entitie" +
      "s/v1alpha4/modules.proto\"\303\001\n\rOmniSmsConf" +
      "ig\022\026\n\004name\030\001 \001(\tB\002\030\001R\004name\022Q\n\010prefixes\030\002" +
      " \001(\01325.services.billing.entities.v1alpha" +
      "4.CountryCodePrefixR\010prefixes\022G\n\006config\030" +
      "\003 \001(\0132/.services.billing.entities.v1alph" +
      "a4.BasicConfigR\006config\"\313\001\n\021OmniSmsUnitCo" +
      "nfig\022\026\n\004name\030\001 \001(\tB\002\030\001R\004name\022Q\n\010prefixes" +
      "\030\002 \001(\01325.services.billing.entities.v1alp" +
      "ha4.CountryCodePrefixR\010prefixes\022K\n\006confi" +
      "g\030\003 \001(\01323.services.billing.entities.v1al" +
      "pha4.BasicUnitConfigR\006configB\354\001\n4com.tcn" +
      ".cloud.api.services.billing.entities.v1a" +
      "lpha4B\tOmniProtoP\001\242\002\003SBE\252\002\"Services.Bill" +
      "ing.Entities.V1alpha4\312\002\"Services\\Billing" +
      "\\Entities\\V1alpha4\342\002.Services\\Billing\\En" +
      "tities\\V1alpha4\\GPBMetadata\352\002%Services::" +
      "Billing::Entities::V1alpha4b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha4.ModulesProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha4_OmniSmsConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha4_OmniSmsConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha4_OmniSmsConfig_descriptor,
        new java.lang.String[] { "Name", "Prefixes", "Config", });
    internal_static_services_billing_entities_v1alpha4_OmniSmsUnitConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha4_OmniSmsUnitConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha4_OmniSmsUnitConfig_descriptor,
        new java.lang.String[] { "Name", "Prefixes", "Config", });
    com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha4.ModulesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
