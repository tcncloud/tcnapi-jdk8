// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/billing/modules/modules.proto

package com.tcn.cloud.api.api.commons.billing.modules;

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
    internal_static_api_commons_billing_modules_BasicConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_billing_modules_BasicConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_billing_modules_BasicAmountConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_billing_modules_BasicAmountConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)api/commons/billing/modules/modules.pr" +
      "oto\022\033api.commons.billing.modules\032\036google" +
      "/protobuf/wrappers.proto\"!\n\013BasicConfig\022" +
      "\022\n\004rate\030\001 \001(\001R\004rate\"\303\001\n\021BasicAmountConfi" +
      "g\022\026\n\006amount\030\001 \001(\003R\006amount\022\022\n\004rate\030\002 \001(\001R" +
      "\004rate\022@\n\rmin_increment\030\003 \001(\0132\033.google.pr" +
      "otobuf.Int64ValueR\014minIncrement\022@\n\rmax_i" +
      "ncrement\030\004 \001(\0132\033.google.protobuf.Int64Va" +
      "lueR\014maxIncrementB\315\001\n-com.tcn.cloud.api." +
      "api.commons.billing.modulesB\014ModulesProt" +
      "oP\001\242\002\004ACBM\252\002\033Api.Commons.Billing.Modules" +
      "\312\002\033Api\\Commons\\Billing\\Modules\342\002\'Api\\Com" +
      "mons\\Billing\\Modules\\GPBMetadata\352\002\036Api::" +
      "Commons::Billing::Modulesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_commons_billing_modules_BasicConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_billing_modules_BasicConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_billing_modules_BasicConfig_descriptor,
        new java.lang.String[] { "Rate", });
    internal_static_api_commons_billing_modules_BasicAmountConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_billing_modules_BasicAmountConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_billing_modules_BasicAmountConfig_descriptor,
        new java.lang.String[] { "Amount", "Rate", "MinIncrement", "MaxIncrement", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
