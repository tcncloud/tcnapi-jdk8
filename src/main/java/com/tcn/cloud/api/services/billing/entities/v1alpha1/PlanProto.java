// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/plan.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

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
    internal_static_services_billing_entities_v1alpha1_BillingPlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_billing_entities_v1alpha1_BillingPlan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-services/billing/entities/v1alpha1/pla" +
      "n.proto\022\"services.billing.entities.v1alp" +
      "ha1\032\037google/protobuf/timestamp.proto\032.se" +
      "rvices/billing/entities/v1alpha1/rates.p" +
      "roto\"\335\003\n\013BillingPlan\022&\n\017billing_plan_id\030" +
      "\001 \001(\tR\rbillingPlanId\022;\n\013create_time\030\002 \001(" +
      "\0132\032.google.protobuf.TimestampR\ncreateTim" +
      "e\022;\n\013update_time\030\003 \001(\0132\032.google.protobuf" +
      ".TimestampR\nupdateTime\0229\n\nstart_time\030\004 \001" +
      "(\0132\032.google.protobuf.TimestampR\tstartTim" +
      "e\0225\n\010end_time\030\005 \001(\0132\032.google.protobuf.Ti" +
      "mestampR\007endTime\022;\n\013delete_time\030\006 \001(\0132\032." +
      "google.protobuf.TimestampR\ndeleteTime\022.\n" +
      "\023rate_definition_ids\030\007 \003(\tR\021rateDefiniti" +
      "onIds\022M\n\006status\030\010 \001(\01625.services.billing" +
      ".entities.v1alpha1.BillingPlanStatusR\006st" +
      "atus*|\n\021BillingPlanStatus\022#\n\037BILLING_PLA" +
      "N_STATUS_UNSPECIFIED\020\000\022 \n\034BILLING_PLAN_S" +
      "TATUS_CREATING\020d\022 \n\033BILLING_PLAN_STATUS_" +
      "CREATED\020\310\001B\354\001\n4com.tcn.cloud.api.service" +
      "s.billing.entities.v1alpha1B\tPlanProtoP\001" +
      "\242\002\003SBE\252\002\"Services.Billing.Entities.V1alp" +
      "ha1\312\002\"Services\\Billing\\Entities\\V1alpha1" +
      "\342\002.Services\\Billing\\Entities\\V1alpha1\\GP" +
      "BMetadata\352\002%Services::Billing::Entities:" +
      ":V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.entities.v1alpha1.RatesProto.getDescriptor(),
        });
    internal_static_services_billing_entities_v1alpha1_BillingPlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_billing_entities_v1alpha1_BillingPlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_billing_entities_v1alpha1_BillingPlan_descriptor,
        new java.lang.String[] { "BillingPlanId", "CreateTime", "UpdateTime", "StartTime", "EndTime", "DeleteTime", "RateDefinitionIds", "Status", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.tcn.cloud.api.services.billing.entities.v1alpha1.RatesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}