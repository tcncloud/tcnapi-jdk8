// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/expr.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public final class ExprProto {
  private ExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_Uint32Expr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_Uint32Expr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_Uint32Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_TimestampExpr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_Moment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_Moment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_TimestampRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_TimestampRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/v1alpha1/vanalytics/expr.proto\022\027ap" +
      "i.v1alpha1.vanalytics\032\034api/commons/vanal" +
      "ytics.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\312\001\n\nUint32Expr\022\020\n\002gt\030\001 \001(\rH\000R\002gt\022\022\n" +
      "\003gte\030\002 \001(\rH\000R\003gte\022\020\n\002lt\030\003 \001(\rH\000R\002lt\022\022\n\003l" +
      "te\030\004 \001(\rH\000R\003lte\022\020\n\002eq\030\005 \001(\rH\000R\002eq\022\027\n\006not" +
      "_eq\030\006 \001(\rH\000R\005notEq\022<\n\005range\030\007 \001(\0132$.api." +
      "v1alpha1.vanalytics.Uint32RangeH\000R\005range" +
      "B\007\n\005where\"s\n\013Uint32Range\022\022\n\004from\030\001 \001(\rR\004" +
      "from\022\016\n\002to\030\002 \001(\rR\002to\022!\n\014include_from\030\003 \001" +
      "(\010R\013includeFrom\022\035\n\ninclude_to\030\004 \001(\010R\tinc" +
      "ludeTo\"\224\001\n\rTimestampExpr\022?\n\005range\030\001 \001(\0132" +
      "\'.api.v1alpha1.vanalytics.TimestampRange" +
      "H\000R\005range\0229\n\006moment\030\002 \001(\0132\037.api.v1alpha1" +
      ".vanalytics.MomentH\000R\006momentB\007\n\005where\"X\n" +
      "\006Moment\022\033\n\ttime_zone\030\001 \001(\tR\010timeZone\0221\n\010" +
      "interval\030\002 \001(\0162\025.api.commons.IntervalR\010i" +
      "nterval\"\256\001\n\016TimestampRange\022.\n\004from\030\001 \001(\013" +
      "2\032.google.protobuf.TimestampR\004from\022*\n\002to" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampR\002to\022!" +
      "\n\014include_from\030\003 \001(\010R\013includeFrom\022\035\n\ninc" +
      "lude_to\030\004 \001(\010R\tincludeToB\264\001\n)com.tcn.clo" +
      "ud.api.api.v1alpha1.vanalyticsB\tExprProt" +
      "oP\001\242\002\003AVV\252\002\027Api.V1alpha1.Vanalytics\312\002\027Ap" +
      "i\\V1alpha1\\Vanalytics\342\002#Api\\V1alpha1\\Van" +
      "alytics\\GPBMetadata\352\002\031Api::V1alpha1::Van" +
      "alyticsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.VanalyticsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_vanalytics_Uint32Expr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_vanalytics_Uint32Expr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_Uint32Expr_descriptor,
        new java.lang.String[] { "Gt", "Gte", "Lt", "Lte", "Eq", "NotEq", "Range", "Where", });
    internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_vanalytics_Uint32Range_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_Uint32Range_descriptor,
        new java.lang.String[] { "From", "To", "IncludeFrom", "IncludeTo", });
    internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_vanalytics_TimestampExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor,
        new java.lang.String[] { "Range", "Moment", "Where", });
    internal_static_api_v1alpha1_vanalytics_Moment_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_vanalytics_Moment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_Moment_descriptor,
        new java.lang.String[] { "TimeZone", "Interval", });
    internal_static_api_v1alpha1_vanalytics_TimestampRange_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_vanalytics_TimestampRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_TimestampRange_descriptor,
        new java.lang.String[] { "From", "To", "IncludeFrom", "IncludeTo", });
    com.tcn.cloud.api.api.commons.VanalyticsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
