// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/plan.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public final class PlanProto {
  private PlanProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_billing_entities_v1alpha3_BillingPlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha3_BillingPlan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-services/billing/entities/v1alpha3/pla" +
      "n.proto\022\"services.billing.entities.v1alp" +
      "ha3\032\037google/protobuf/timestamp.proto\"\272\003\n" +
      "\013BillingPlan\022&\n\017billing_plan_id\030\001 \001(\tR\rb" +
      "illingPlanId\022\024\n\005title\030\002 \001(\tR\005title\022G\n\004ty" +
      "pe\030\003 \001(\01623.services.billing.entities.v1a" +
      "lpha3.BillingPlanTypeR\004type\022\031\n\010is_draft\030" +
      "\004 \001(\010R\007isDraft\0229\n\nstart_time\030\005 \001(\0132\032.goo" +
      "gle.protobuf.TimestampR\tstartTime\022;\n\013cre" +
      "ate_time\030\006 \001(\0132\032.google.protobuf.Timesta" +
      "mpR\ncreateTime\022;\n\013update_time\030\007 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\nupdateTime\022;\n\013d" +
      "elete_time\030\010 \001(\0132\032.google.protobuf.Times" +
      "tampR\ndeleteTime\022\027\n\007user_id\030\t \001(\tR\006userI" +
      "d*n\n\017BillingPlanType\022!\n\035BILLING_PLAN_TYP" +
      "E_UNSPECIFIED\020\000\022\035\n\031BILLING_PLAN_TYPE_DEF" +
      "AULT\020\001\022\031\n\025BILLING_PLAN_TYPE_ORG\020\002B\354\001\n4co" +
      "m.tcn.cloud.api.services.billing.entitie" +
      "s.v1alpha3B\tPlanProtoP\001\242\002\003SBE\252\002\"Services" +
      ".Billing.Entities.V1alpha3\312\002\"Services\\Bi" +
      "lling\\Entities\\V1alpha3\342\002.Services\\Billi" +
      "ng\\Entities\\V1alpha3\\GPBMetadata\352\002%Servi" +
      "ces::Billing::Entities::V1alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha3_BillingPlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha3_BillingPlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha3_BillingPlan_descriptor,
        new java.lang.String[] { "BillingPlanId", "Title", "Type", "IsDraft", "StartTime", "CreateTime", "UpdateTime", "DeleteTime", "UserId", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}