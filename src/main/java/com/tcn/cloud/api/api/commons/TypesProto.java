// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/types.proto

package com.tcn.cloud.api.api.commons;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int32Nullable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int32Nullable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int64Nullable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int64Nullable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_SomeSidAndDateCompare_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_SomeSidAndDateCompare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int64ArraySql_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int64ArraySql_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int32ArraySql_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int32ArraySql_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_StringArraySql_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_StringArraySql_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_BoolArraySql_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_BoolArraySql_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int32ValueArraySql_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int32ValueArraySql_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Int64Id_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Int64Id_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027api/commons/types.proto\022\013api.commons\032\037" +
      "google/protobuf/timestamp.proto\032\036google/" +
      "protobuf/wrappers.proto\"\007\n\005Empty\">\n\rInt3" +
      "2Nullable\022\027\n\007is_null\030\001 \001(\010R\006isNull\022\024\n\005va" +
      "lue\030\002 \001(\005R\005value\">\n\rInt64Nullable\022\027\n\007is_" +
      "null\030\001 \001(\010R\006isNull\022\024\n\005value\030\002 \001(\003R\005value" +
      "\"\252\001\n\025SomeSidAndDateCompare\022\031\n\010some_sid\030\001" +
      " \001(\003R\007someSid\022=\n\014date_greater\030\002 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\013dateGreater\0227\n\t" +
      "date_less\030\003 \001(\0132\032.google.protobuf.Timest" +
      "ampR\010dateLess\"\'\n\rInt64ArraySql\022\026\n\006values" +
      "\030\001 \003(\003R\006values\"\'\n\rInt32ArraySql\022\026\n\006value" +
      "s\030\001 \003(\005R\006values\"(\n\016StringArraySql\022\026\n\006val" +
      "ues\030\002 \003(\tR\006values\"&\n\014BoolArraySql\022\026\n\006val" +
      "ues\030\001 \003(\010R\006values\"I\n\022Int32ValueArraySql\022" +
      "3\n\006values\030\001 \003(\0132\033.google.protobuf.Int32V" +
      "alueR\006values\"#\n\007Int64Id\022\030\n\005value\030\001 \001(\003B\002" +
      "0\001R\005valueBx\n\035com.tcn.cloud.api.api.commo" +
      "nsB\nTypesProtoP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013A" +
      "pi\\Commons\342\002\027Api\\Commons\\GPBMetadata\352\002\014A" +
      "pi::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_commons_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_Int32Nullable_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_Int32Nullable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int32Nullable_descriptor,
        new java.lang.String[] { "IsNull", "Value", });
    internal_static_api_commons_Int64Nullable_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_Int64Nullable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int64Nullable_descriptor,
        new java.lang.String[] { "IsNull", "Value", });
    internal_static_api_commons_SomeSidAndDateCompare_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_SomeSidAndDateCompare_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_SomeSidAndDateCompare_descriptor,
        new java.lang.String[] { "SomeSid", "DateGreater", "DateLess", });
    internal_static_api_commons_Int64ArraySql_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_Int64ArraySql_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int64ArraySql_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_api_commons_Int32ArraySql_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_Int32ArraySql_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int32ArraySql_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_api_commons_StringArraySql_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_StringArraySql_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_StringArraySql_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_api_commons_BoolArraySql_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_BoolArraySql_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_BoolArraySql_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_api_commons_Int32ValueArraySql_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_Int32ValueArraySql_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int32ValueArraySql_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_api_commons_Int64Id_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_Int64Id_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Int64Id_descriptor,
        new java.lang.String[] { "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
