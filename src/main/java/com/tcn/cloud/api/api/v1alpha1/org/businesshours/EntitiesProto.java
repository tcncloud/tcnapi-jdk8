// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

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
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/v1alpha1/org/businesshours/entitie" +
      "s.proto\022\036api.v1alpha1.org.businesshours\032" +
      "\025api/commons/org.proto\032!api/commons/org/" +
      "preferences.proto\032 google/protobuf/field" +
      "_mask.proto\"\032\n\030ListBusinessHoursRequest\"" +
      "~\n\031ListBusinessHoursResponse\022E\n\016business" +
      "_hours\030\002 \003(\0132\036.api.commons.org.BusinessH" +
      "oursR\rbusinessHoursJ\004\010\001\020\002R\024business_hour" +
      "s_lists\"E\n\027GetBusinessHoursRequest\022*\n\021bu" +
      "siness_hours_id\030\001 \001(\tR\017businessHoursId\"a" +
      "\n\030GetBusinessHoursResponse\022E\n\016business_h" +
      "ours\030\001 \001(\0132\036.api.commons.org.BusinessHou" +
      "rsR\rbusinessHours\"\341\001\n\027SetBusinessHoursRe" +
      "quest\022.\n\023business_hours_name\030\001 \001(\tR\021busi" +
      "nessHoursName\022 \n\013description\030\002 \001(\tR\013desc" +
      "ription\022A\n\rday_intervals\030\003 \003(\0132\034.api.com" +
      "mons.org.DayIntervalR\014dayIntervals\0221\n\010ti" +
      "mezone\030\004 \001(\0162\025.api.commons.TimeZoneR\010tim" +
      "ezone\"F\n\030SetBusinessHoursResponse\022*\n\021bus" +
      "iness_hours_id\030\001 \001(\tR\017businessHoursId\"\220\001" +
      "\n!AddIntervalToBusinessHoursRequest\022*\n\021b" +
      "usiness_hours_id\030\001 \001(\tR\017businessHoursId\022" +
      "?\n\014day_interval\030\002 \001(\0132\034.api.commons.org." +
      "DayIntervalR\013dayInterval\"$\n\"AddIntervalT" +
      "oBusinessHoursResponse\"\225\001\n&RemoveInterva" +
      "lFromBusinessHoursRequest\022*\n\021business_ho" +
      "urs_id\030\001 \001(\tR\017businessHoursId\022?\n\014day_int" +
      "erval\030\002 \001(\0132\034.api.commons.org.DayInterva" +
      "lR\013dayInterval\")\n\'RemoveIntervalFromBusi" +
      "nessHoursResponse\"\214\002\n\036UpdateBusinessHour" +
      "sInfoRequest\022*\n\021business_hours_id\030\001 \001(\tR" +
      "\017businessHoursId\022.\n\023business_hours_name\030" +
      "\002 \001(\tR\021businessHoursName\022 \n\013description\030" +
      "\003 \001(\tR\013description\0221\n\010timezone\030\004 \001(\0162\025.a" +
      "pi.commons.TimeZoneR\010timezone\0229\n\nfield_m" +
      "ask\030\005 \001(\0132\032.google.protobuf.FieldMaskR\tf" +
      "ieldMask\"!\n\037UpdateBusinessHoursInfoRespo" +
      "nse\"H\n\032DeleteBusinessHoursRequest\022*\n\021bus" +
      "iness_hours_id\030\001 \001(\tR\017businessHoursId\"\035\n" +
      "\033DeleteBusinessHoursResponse\"J\n\034Evaluate" +
      "BusinessHoursRequest\022*\n\021business_hours_i" +
      "d\030\001 \001(\tR\017businessHoursId\"B\n\035EvaluateBusi" +
      "nessHoursResponse\022!\n\014within_range\030\001 \001(\010R" +
      "\013withinRangeB\335\001\n0com.tcn.cloud.api.api.v" +
      "1alpha1.org.businesshoursB\rEntitiesProto" +
      "P\001\242\002\004AVOB\252\002\036Api.V1alpha1.Org.Businesshou" +
      "rs\312\002\036Api\\V1alpha1\\Org\\Businesshours\342\002*Ap" +
      "i\\V1alpha1\\Org\\Businesshours\\GPBMetadata" +
      "\352\002!Api::V1alpha1::Org::Businesshoursb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.OrgProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.org.PreferencesProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_ListBusinessHoursResponse_descriptor,
        new java.lang.String[] { "BusinessHours", });
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", });
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_GetBusinessHoursResponse_descriptor,
        new java.lang.String[] { "BusinessHours", });
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursName", "Description", "DayIntervals", "Timezone", });
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_SetBusinessHoursResponse_descriptor,
        new java.lang.String[] { "BusinessHoursId", });
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", "DayInterval", });
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_AddIntervalToBusinessHoursResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", "DayInterval", });
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_RemoveIntervalFromBusinessHoursResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", "BusinessHoursName", "Description", "Timezone", "FieldMask", });
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_UpdateBusinessHoursInfoResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", });
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_DeleteBusinessHoursResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursRequest_descriptor,
        new java.lang.String[] { "BusinessHoursId", });
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor,
        new java.lang.String[] { "WithinRange", });
    com.tcn.cloud.api.api.commons.OrgProto.getDescriptor();
    com.tcn.cloud.api.api.commons.org.PreferencesProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
