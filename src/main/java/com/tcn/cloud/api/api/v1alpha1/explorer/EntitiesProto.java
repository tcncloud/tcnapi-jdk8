// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

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
    internal_static_api_v1alpha1_explorer_SchemaField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_SchemaField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_Parameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_Parameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_Parameters_Parameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_Parameters_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_Parameters_ParametersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_Parameters_ParametersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$api/v1alpha1/explorer/entities.proto\022\025" +
      "api.v1alpha1.explorer\"\350\001\n\013SchemaField\022\022\n" +
      "\004name\030\001 \001(\tR\004name\022B\n\013column_type\030\002 \001(\0162!" +
      ".api.v1alpha1.explorer.SchemaTypeR\ncolum" +
      "nType\022$\n\016is_primary_key\030\003 \001(\010R\014isPrimary" +
      "Key\022,\n\022is_low_cardinality\030\004 \001(\010R\020isLowCa" +
      "rdinality\022-\n\022column_description\030\005 \001(\tR\021c" +
      "olumnDescription\"\325\001\n\006Schema\022\022\n\004name\030\001 \001(" +
      "\tR\004name\022N\n\017datasource_type\030\002 \001(\0162%.api.v" +
      "1alpha1.explorer.DatasourceTypeR\016datasou" +
      "rceType\022:\n\006fields\030\003 \003(\0132\".api.v1alpha1.e" +
      "xplorer.SchemaFieldR\006fields\022+\n\021table_des" +
      "cription\030\004 \001(\tR\020tableDescription\"\213\002\n\nPar" +
      "ameters\022Q\n\nparameters\030\001 \003(\01321.api.v1alph" +
      "a1.explorer.Parameters.ParametersEntryR\n" +
      "parameters\032>\n\tParameter\022\024\n\005value\030\002 \001(\tR\005" +
      "value\022\033\n\tdata_type\030\003 \001(\tR\010dataType\032j\n\017Pa" +
      "rametersEntry\022\020\n\003key\030\001 \001(\tR\003key\022A\n\005value" +
      "\030\002 \001(\0132+.api.v1alpha1.explorer.Parameter" +
      "s.ParameterR\005value:\0028\001*\220\002\n\nSchemaType\022\033\n" +
      "\027SCHEMA_TYPE_UNSPECIFIED\020\000\022\023\n\017SCHEMA_TYP" +
      "E_INT\020\002\022\025\n\021SCHEMA_TYPE_FLOAT\020\003\022\026\n\022SCHEMA" +
      "_TYPE_STRING\020\005\022\024\n\020SCHEMA_TYPE_BOOL\020\006\022\031\n\025" +
      "SCHEMA_TYPE_TIMESTAMP\020\007\022\031\n\025SCHEMA_TYPE_I" +
      "NT_ARRAY\020\010\022\033\n\027SCHEMA_TYPE_FLOAT_ARRAY\020\t\022" +
      "\034\n\030SCHEMA_TYPE_STRING_ARRAY\020\n\022\032\n\026SCHEMA_" +
      "TYPE_BOOL_ARRAY\020\013*j\n\016DatasourceType\022\037\n\033D" +
      "ATASOURCE_TYPE_UNSPECIFIED\020\000\022\027\n\023DATASOUR" +
      "CE_TYPE_VFS\020\001\022\036\n\032DATASOURCE_TYPE_CLICKHO" +
      "USE\020\002B\256\001\n\'com.tcn.cloud.api.api.v1alpha1" +
      ".explorerB\rEntitiesProtoP\001\242\002\003AVE\252\002\025Api.V" +
      "1alpha1.Explorer\312\002\025Api\\V1alpha1\\Explorer" +
      "\342\002!Api\\V1alpha1\\Explorer\\GPBMetadata\352\002\027A" +
      "pi::V1alpha1::Explorerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_v1alpha1_explorer_SchemaField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_explorer_SchemaField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_SchemaField_descriptor,
        new java.lang.String[] { "Name", "ColumnType", "IsPrimaryKey", "IsLowCardinality", "ColumnDescription", });
    internal_static_api_v1alpha1_explorer_Schema_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_explorer_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_Schema_descriptor,
        new java.lang.String[] { "Name", "DatasourceType", "Fields", "TableDescription", });
    internal_static_api_v1alpha1_explorer_Parameters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_explorer_Parameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_Parameters_descriptor,
        new java.lang.String[] { "Parameters", });
    internal_static_api_v1alpha1_explorer_Parameters_Parameter_descriptor =
      internal_static_api_v1alpha1_explorer_Parameters_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_explorer_Parameters_Parameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_Parameters_Parameter_descriptor,
        new java.lang.String[] { "Value", "DataType", });
    internal_static_api_v1alpha1_explorer_Parameters_ParametersEntry_descriptor =
      internal_static_api_v1alpha1_explorer_Parameters_descriptor.getNestedTypes().get(1);
    internal_static_api_v1alpha1_explorer_Parameters_ParametersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_Parameters_ParametersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
