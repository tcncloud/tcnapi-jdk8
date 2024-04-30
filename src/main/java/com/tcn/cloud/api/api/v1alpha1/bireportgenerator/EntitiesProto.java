// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/entities.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

public final class EntitiesProto {
  private EntitiesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_ReportJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_ReportJob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/v1alpha1/bireportgenerator/entitie" +
      "s.proto\022\036api.v1alpha1.bireportgenerator\032" +
      "#api/commons/bireportgenerator.proto\032\027ap" +
      "i/commons/enums.proto\032\025api/commons/org.p" +
      "roto\032\027api/commons/types.proto\"\337\007\n\tReport" +
      "Job\022\"\n\rreport_job_id\030\001 \001(\tR\013reportJobId\022" +
      "\022\n\004name\030\002 \001(\tR\004name\022 \n\013description\030\003 \001(\t" +
      "R\013description\022%\n\014dashboard_id\030\004 \001(\tB\002\030\001R" +
      "\013dashboardId\022\037\n\ttime_zone\030\005 \001(\tB\002\030\001R\010tim" +
      "eZone\0228\n\013time_period\030\006 \001(\0162\027.api.commons" +
      ".TimePeriodR\ntimePeriod\022E\n\016delivery_time" +
      "s\030\007 \001(\0132\032.api.commons.DeliveryTimesB\002\030\001R" +
      "\rdeliveryTimes\0229\n\nday_filter\030\010 \001(\0132\026.api" +
      ".commons.DayFilterB\002\030\001R\tdayFilter\022.\n\006mon" +
      "ths\030\t \003(\0162\022.api.commons.MonthB\002\030\001R\006month" +
      "s\022E\n\016format_options\030\n \001(\0132\032.api.commons." +
      "FormatOptionsB\002\030\001R\rformatOptions\022K\n\020deli" +
      "very_options\030\013 \001(\0132\034.api.commons.Deliver" +
      "yOptionsB\002\030\001R\017deliveryOptions\022\033\n\tis_acti" +
      "ve\030\014 \001(\010R\010isActive\022*\n\021send_empty_report\030" +
      "\r \001(\010R\017sendEmptyReport\0222\n\025dashboard_reso" +
      "urce_id\030\016 \001(\tR\023dashboardResourceId\022H\n\021ti" +
      "me_zone_wrapper\030\017 \001(\0132\034.api.commons.Time" +
      "ZoneWrapperR\017timeZoneWrapper\022&\n\017hide_csv" +
      "_footer\030\020 \001(\010R\rhideCsvFooter\0222\n\023transfer" +
      "_config_sid\030\021 \001(\003B\002\030\001R\021transferConfigSid" +
      "\022D\n\017cron_expression\030\022 \001(\0132\033.api.commons." +
      "CronExpressionR\016cronExpression\022G\n\020transf" +
      "er_options\030\023 \001(\0132\034.api.commons.TransferO" +
      "ptionsR\017transferOptionsB\333\001\n0com.tcn.clou" +
      "d.api.api.v1alpha1.bireportgeneratorB\rEn" +
      "titiesProtoP\001\242\002\003AVB\252\002\036Api.V1alpha1.Birep" +
      "ortgenerator\312\002\036Api\\V1alpha1\\Bireportgene" +
      "rator\342\002*Api\\V1alpha1\\Bireportgenerator\\G" +
      "PBMetadata\352\002 Api::V1alpha1::Bireportgene" +
      "ratorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.BireportgeneratorProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.EnumsProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.OrgProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.TypesProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_bireportgenerator_ReportJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_bireportgenerator_ReportJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_ReportJob_descriptor,
        new java.lang.String[] { "ReportJobId", "Name", "Description", "DashboardId", "TimeZone", "TimePeriod", "DeliveryTimes", "DayFilter", "Months", "FormatOptions", "DeliveryOptions", "IsActive", "SendEmptyReport", "DashboardResourceId", "TimeZoneWrapper", "HideCsvFooter", "TransferConfigSid", "CronExpression", "TransferOptions", });
    com.tcn.cloud.api.api.commons.BireportgeneratorProto.getDescriptor();
    com.tcn.cloud.api.api.commons.EnumsProto.getDescriptor();
    com.tcn.cloud.api.api.commons.OrgProto.getDescriptor();
    com.tcn.cloud.api.api.commons.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
