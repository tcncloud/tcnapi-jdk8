// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

public final class MatchingProto {
  private MatchingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha1_MatchingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha1_MatchingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1services/billing/entities/v1alpha1/mat" +
      "ching.proto\022\"services.billing.entities.v" +
      "1alpha1\"u\n\016MatchingConfig\022Y\n\tarea_code\030\001" +
      " \001(\0132:.services.billing.entities.v1alpha" +
      "1.MatchingConfigAreaCodeH\000R\010areaCodeB\010\n\006" +
      "config\"K\n\026MatchingConfigAreaCode\022\022\n\004name" +
      "\030\001 \001(\tR\004name\022\035\n\narea_codes\030\002 \003(\tR\tareaCo" +
      "des*J\n\014MatchingRule\022\035\n\031MATCHING_RULE_UNS" +
      "PECIFIED\020\000\022\033\n\027MATCHING_RULE_AREA_CODE\020\001B" +
      "\360\001\n4com.tcn.cloud.api.services.billing.e" +
      "ntities.v1alpha1B\rMatchingProtoP\001\242\002\003SBE\252" +
      "\002\"Services.Billing.Entities.V1alpha1\312\002\"S" +
      "ervices\\Billing\\Entities\\V1alpha1\342\002.Serv" +
      "ices\\Billing\\Entities\\V1alpha1\\GPBMetada" +
      "ta\352\002%Services::Billing::Entities::V1alph" +
      "a1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_services_billing_entities_v1alpha1_MatchingConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha1_MatchingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha1_MatchingConfig_descriptor,
        new java.lang.String[] { "AreaCode", "Config", });
    internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor,
        new java.lang.String[] { "Name", "AreaCodes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}