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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_ResultFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_ResultFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_ExportOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_ExportOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_ResultUrlsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_ResultUrlsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$api/v1alpha1/explorer/entities.proto\022\025" +
      "api.v1alpha1.explorer\"\351\002\n\013SchemaField\022\022\n" +
      "\004name\030\001 \001(\tR\004name\022B\n\013column_type\030\002 \001(\0162!" +
      ".api.v1alpha1.explorer.SchemaTypeR\ncolum" +
      "nType\022$\n\016is_primary_key\030\003 \001(\010R\014isPrimary" +
      "Key\022,\n\022is_low_cardinality\030\004 \001(\010R\020isLowCa" +
      "rdinality\022-\n\022column_description\030\005 \001(\tR\021c" +
      "olumnDescription\022$\n\016is_time_filter\030\006 \001(\010" +
      "R\014isTimeFilter\0223\n\026is_default_time_filter" +
      "\030\007 \001(\010R\023isDefaultTimeFilter\022$\n\016is_join_c" +
      "olumn\030\010 \001(\010R\014isJoinColumn\"\224\002\n\006Schema\022\022\n\004" +
      "name\030\001 \001(\tR\004name\022N\n\017datasource_type\030\002 \001(" +
      "\0162%.api.v1alpha1.explorer.DatasourceType" +
      "R\016datasourceType\022:\n\006fields\030\003 \003(\0132\".api.v" +
      "1alpha1.explorer.SchemaFieldR\006fields\022+\n\021" +
      "table_description\030\004 \001(\tR\020tableDescriptio" +
      "n\022\032\n\010category\030\005 \001(\tR\010category\022!\n\014sub_cat" +
      "egory\030\006 \001(\tR\013subCategory\"\213\002\n\nParameters\022" +
      "Q\n\nparameters\030\001 \003(\01321.api.v1alpha1.explo" +
      "rer.Parameters.ParametersEntryR\nparamete" +
      "rs\032>\n\tParameter\022\024\n\005value\030\002 \001(\tR\005value\022\033\n" +
      "\tdata_type\030\003 \001(\tR\010dataType\032j\n\017Parameters" +
      "Entry\022\020\n\003key\030\001 \001(\tR\003key\022A\n\005value\030\002 \001(\0132+" +
      ".api.v1alpha1.explorer.Parameters.Parame" +
      "terR\005value:\0028\001\"=\n\nResultFile\022\020\n\003url\030\001 \001(" +
      "\tR\003url\022\035\n\nsize_bytes\030\002 \001(\003R\tsizeBytes\"\347\001" +
      "\n\rExportOptions\022\034\n\tdelimiter\030\001 \001(\tR\tdeli" +
      "miter\022N\n\017quote_character\030\002 \001(\0162%.api.v1a" +
      "lpha1.explorer.QuoteCharacterR\016quoteChar" +
      "acter\022\033\n\tno_header\030\003 \001(\010R\010noHeader\022K\n\016fi" +
      "le_extension\030\004 \001(\0162$.api.v1alpha1.explor" +
      "er.FileExtensionR\rfileExtension\"\177\n\017Resul" +
      "tUrlsEntry\0223\n\003key\030\001 \001(\0162!.api.v1alpha1.e" +
      "xplorer.ResultTypeR\003key\0227\n\005value\030\002 \001(\0132!" +
      ".api.v1alpha1.explorer.ResultFileR\005value" +
      "*_\n\014ExportFormat\022\035\n\031REPORT_FORMAT_UNSPEC" +
      "IFIED\020\000\022\025\n\021REPORT_FORMAT_CSV\020\001\022\031\n\025REPORT" +
      "_FORMAT_PARQUET\020\002*\245\002\n\nSchemaType\022\033\n\027SCHE" +
      "MA_TYPE_UNSPECIFIED\020\000\022\023\n\017SCHEMA_TYPE_INT" +
      "\020\002\022\025\n\021SCHEMA_TYPE_FLOAT\020\003\022\026\n\022SCHEMA_TYPE" +
      "_STRING\020\005\022\024\n\020SCHEMA_TYPE_BOOL\020\006\022\031\n\025SCHEM" +
      "A_TYPE_TIMESTAMP\020\007\022\031\n\025SCHEMA_TYPE_INT_AR" +
      "RAY\020\010\022\033\n\027SCHEMA_TYPE_FLOAT_ARRAY\020\t\022\034\n\030SC" +
      "HEMA_TYPE_STRING_ARRAY\020\n\022\032\n\026SCHEMA_TYPE_" +
      "BOOL_ARRAY\020\013\022\023\n\017SCHEMA_TYPE_MAP\020\014*\214\001\n\016Da" +
      "tasourceType\022\037\n\033DATASOURCE_TYPE_UNSPECIF" +
      "IED\020\000\022\027\n\023DATASOURCE_TYPE_VFS\020\001\022\036\n\032DATASO" +
      "URCE_TYPE_CLICKHOUSE\020\002\022 \n\034DATASOURCE_TYP" +
      "E_INSTANT_DATA\020\003*\207\001\n\nResultType\022\033\n\027RESUL" +
      "T_TYPE_UNSPECIFIED\020\000\022\023\n\017RESULT_TYPE_RAW\020" +
      "\001\022\026\n\022RESULT_TYPE_FORMAT\020\002\022\027\n\023RESULT_TYPE" +
      "_SUMMARY\020\003\022\026\n\022RESULT_TYPE_REPORT\020\004*u\n\016Qu" +
      "oteCharacter\022\037\n\033QUOTE_CHARACTER_UNSPECIF" +
      "IED\020\000\022 \n\034QUOTE_CHARACTER_DOUBLE_QUOTE\020\001\022" +
      " \n\034QUOTE_CHARACTER_SINGLE_QUOTE\020\002*\223\001\n\rFi" +
      "leExtension\022\036\n\032FILE_EXTENSION_UNSPECIFIE" +
      "D\020\000\022\032\n\026FILE_EXTENSION_PARQUET\020\001\022\026\n\022FILE_" +
      "EXTENSION_CSV\020\002\022\026\n\022FILE_EXTENSION_TSV\020\003\022" +
      "\026\n\022FILE_EXTENSION_TXT\020\004B\256\001\n\'com.tcn.clou" +
      "d.api.api.v1alpha1.explorerB\rEntitiesPro" +
      "toP\001\242\002\003AVE\252\002\025Api.V1alpha1.Explorer\312\002\025Api" +
      "\\V1alpha1\\Explorer\342\002!Api\\V1alpha1\\Explor" +
      "er\\GPBMetadata\352\002\027Api::V1alpha1::Explorer" +
      "b\006proto3"
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
        new java.lang.String[] { "Name", "ColumnType", "IsPrimaryKey", "IsLowCardinality", "ColumnDescription", "IsTimeFilter", "IsDefaultTimeFilter", "IsJoinColumn", });
    internal_static_api_v1alpha1_explorer_Schema_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_explorer_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_Schema_descriptor,
        new java.lang.String[] { "Name", "DatasourceType", "Fields", "TableDescription", "Category", "SubCategory", });
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
    internal_static_api_v1alpha1_explorer_ResultFile_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_explorer_ResultFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ResultFile_descriptor,
        new java.lang.String[] { "Url", "SizeBytes", });
    internal_static_api_v1alpha1_explorer_ExportOptions_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_explorer_ExportOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ExportOptions_descriptor,
        new java.lang.String[] { "Delimiter", "QuoteCharacter", "NoHeader", "FileExtension", });
    internal_static_api_v1alpha1_explorer_ResultUrlsEntry_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_explorer_ResultUrlsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ResultUrlsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
