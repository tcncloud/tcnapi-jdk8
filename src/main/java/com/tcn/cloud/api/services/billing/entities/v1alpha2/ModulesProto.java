// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/modules.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

public final class ModulesProto {
  private ModulesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_BasicConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_BasicConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha2_BasicUnitConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha2_BasicUnitConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0services/billing/entities/v1alpha2/mod" +
      "ules.proto\022\"services.billing.entities.v1" +
      "alpha2\032\036google/protobuf/wrappers.proto\"!" +
      "\n\013BasicConfig\022\022\n\004rate\030\001 \001(\001R\004rate\"\375\002\n\017Ba" +
      "sicUnitConfig\022\033\n\tunit_size\030\001 \001(\003R\010unitSi" +
      "ze\022\022\n\004rate\030\002 \001(\001R\004rate\0228\n\tmin_units\030\003 \001(" +
      "\0132\033.google.protobuf.Int64ValueR\010minUnits" +
      "\0228\n\tmax_units\030\004 \001(\0132\033.google.protobuf.In" +
      "t64ValueR\010maxUnits\022J\n\023min_units_per_cycl" +
      "e\030\005 \001(\0132\033.google.protobuf.Int64ValueR\020mi" +
      "nUnitsPerCycle\022J\n\023max_units_per_cycle\030\006 " +
      "\001(\0132\033.google.protobuf.Int64ValueR\020maxUni" +
      "tsPerCycle\022-\n\023unit_size_per_cycle\030\007 \001(\003R" +
      "\020unitSizePerCycleB\357\001\n4com.tcn.cloud.api." +
      "services.billing.entities.v1alpha2B\014Modu" +
      "lesProtoP\001\242\002\003SBE\252\002\"Services.Billing.Enti" +
      "ties.V1alpha2\312\002\"Services\\Billing\\Entitie" +
      "s\\V1alpha2\342\002.Services\\Billing\\Entities\\V" +
      "1alpha2\\GPBMetadata\352\002%Services::Billing:" +
      ":Entities::V1alpha2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha2_BasicConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha2_BasicConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_BasicConfig_descriptor,
        new java.lang.String[] { "Rate", });
    internal_static_services_billing_entities_v1alpha2_BasicUnitConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_billing_entities_v1alpha2_BasicUnitConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha2_BasicUnitConfig_descriptor,
        new java.lang.String[] { "UnitSize", "Rate", "MinUnits", "MaxUnits", "MinUnitsPerCycle", "MaxUnitsPerCycle", "UnitSizePerCycle", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
