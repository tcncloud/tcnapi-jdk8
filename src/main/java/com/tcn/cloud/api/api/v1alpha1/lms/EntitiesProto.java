// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/lms/entities.proto

package com.tcn.cloud.api.api.v1alpha1.lms;

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
    internal_static_api_v1alpha1_lms_FileTemplateV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_FileTemplateV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_FileTemplates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_FileTemplates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_FileTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_FileTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_ParseOpts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_ParseOpts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsCsv_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsCsv_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsJson_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsJson_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsJsonL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsJsonL_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsFixed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsFixed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsFixed_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsFixed_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_OptsParquet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_OptsParquet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_NewTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_NewTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_lms_ExistingTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_lms_ExistingTemplate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037api/v1alpha1/lms/entities.proto\022\020api.v" +
      "1alpha1.lms\032\025api/v0alpha/lms.proto\"\251\001\n\016F" +
      "ileTemplateV2\022D\n\017legacy_template\030\001 \001(\0132\031" +
      ".api.v0alpha.FileTemplateH\000R\016legacyTempl" +
      "ate\022E\n\rdock_template\030\002 \001(\0132\036.api.v1alpha" +
      "1.lms.FileTemplateH\000R\014dockTemplateB\n\n\010te" +
      "mplate\"O\n\rFileTemplates\022>\n\ttemplates\030\001 \003" +
      "(\0132 .api.v1alpha1.lms.FileTemplateV2R\tte" +
      "mplates\"\354\001\n\014FileTemplate\022\025\n\006org_id\030\001 \001(\t" +
      "R\005orgId\022(\n\020file_template_id\030\002 \001(\003R\016fileT" +
      "emplateId\022\032\n\010filename\030\003 \001(\tR\010filename\022/\n" +
      "\006fields\030\004 \003(\0132\027.api.v1alpha1.lms.FieldR\006" +
      "fields\022:\n\nparse_opts\030\005 \001(\0132\033.api.v1alpha" +
      "1.lms.ParseOptsR\tparseOpts\022\022\n\004foid\030\006 \001(\003" +
      "R\004foid\"\220\001\n\005Field\022\037\n\013syntax_type\030\001 \001(\tR\ns" +
      "yntaxType\022\035\n\npresi_type\030\002 \001(\tR\tpresiType" +
      "\022\022\n\004name\030\003 \001(\tR\004name\022\026\n\006format\030\004 \001(\tR\006fo" +
      "rmat\022\033\n\traw_value\030\005 \001(\tR\010rawValue\"\232\002\n\tPa" +
      "rseOpts\022-\n\003csv\030\001 \001(\0132\031.api.v1alpha1.lms." +
      "OptsCsvH\000R\003csv\0220\n\004json\030\002 \001(\0132\032.api.v1alp" +
      "ha1.lms.OptsJsonH\000R\004json\0223\n\005jsonl\030\003 \001(\0132" +
      "\033.api.v1alpha1.lms.OptsJsonLH\000R\005jsonl\0223\n" +
      "\005fixed\030\004 \001(\0132\033.api.v1alpha1.lms.OptsFixe" +
      "dH\000R\005fixed\0229\n\007parquet\030\005 \001(\0132\035.api.v1alph" +
      "a1.lms.OptsParquetH\000R\007parquetB\007\n\005ftype\"{" +
      "\n\007OptsCsv\022\035\n\nhas_header\030\001 \001(\010R\thasHeader" +
      "\022\033\n\tskip_rows\030\002 \001(\003R\010skipRows\022\026\n\006header\030" +
      "\003 \003(\tR\006header\022\034\n\tseparator\030\004 \001(\tR\tsepara" +
      "tor\"-\n\010OptsJson\022!\n\014records_root\030\001 \001(\tR\013r" +
      "ecordsRoot\"\013\n\tOptsJsonL\"\276\001\n\tOptsFixed\022\035\n" +
      "\nhas_header\030\001 \001(\010R\thasHeader\0229\n\006header\030\002" +
      " \003(\0132!.api.v1alpha1.lms.OptsFixed.FieldR" +
      "\006header\032W\n\005Field\022+\n\021starting_position\030\r " +
      "\001(\005R\020startingPosition\022!\n\014field_length\030\016 " +
      "\001(\005R\013fieldLength\"\r\n\013OptsParquet\"T\n\013NewTe" +
      "mplate\022\025\n\006org_id\030\001 \001(\tR\005orgId\022\032\n\010filenam" +
      "e\030\002 \001(\tR\010filename\022\022\n\004data\030\003 \001(\014R\004data\"x\n" +
      "\020ExistingTemplate\022(\n\020file_template_id\030\001 " +
      "\001(\003R\016fileTemplateId\022:\n\nparse_opts\030\002 \001(\0132" +
      "\033.api.v1alpha1.lms.ParseOptsR\tparseOptsB" +
      "\225\001\n\"com.tcn.cloud.api.api.v1alpha1.lmsB\r" +
      "EntitiesProtoP\001\242\002\003AVL\252\002\020Api.V1alpha1.Lms" +
      "\312\002\020Api\\V1alpha1\\Lms\342\002\034Api\\V1alpha1\\Lms\\G" +
      "PBMetadata\352\002\022Api::V1alpha1::Lmsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.v0alpha.LmsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_lms_FileTemplateV2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_lms_FileTemplateV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_FileTemplateV2_descriptor,
        new java.lang.String[] { "LegacyTemplate", "DockTemplate", "Template", });
    internal_static_api_v1alpha1_lms_FileTemplates_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_lms_FileTemplates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_FileTemplates_descriptor,
        new java.lang.String[] { "Templates", });
    internal_static_api_v1alpha1_lms_FileTemplate_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_lms_FileTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_FileTemplate_descriptor,
        new java.lang.String[] { "OrgId", "FileTemplateId", "Filename", "Fields", "ParseOpts", "Foid", });
    internal_static_api_v1alpha1_lms_Field_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_lms_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_Field_descriptor,
        new java.lang.String[] { "SyntaxType", "PresiType", "Name", "Format", "RawValue", });
    internal_static_api_v1alpha1_lms_ParseOpts_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_lms_ParseOpts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_ParseOpts_descriptor,
        new java.lang.String[] { "Csv", "Json", "Jsonl", "Fixed", "Parquet", "Ftype", });
    internal_static_api_v1alpha1_lms_OptsCsv_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_lms_OptsCsv_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsCsv_descriptor,
        new java.lang.String[] { "HasHeader", "SkipRows", "Header", "Separator", });
    internal_static_api_v1alpha1_lms_OptsJson_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_lms_OptsJson_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsJson_descriptor,
        new java.lang.String[] { "RecordsRoot", });
    internal_static_api_v1alpha1_lms_OptsJsonL_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_lms_OptsJsonL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsJsonL_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_lms_OptsFixed_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_lms_OptsFixed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsFixed_descriptor,
        new java.lang.String[] { "HasHeader", "Header", });
    internal_static_api_v1alpha1_lms_OptsFixed_Field_descriptor =
      internal_static_api_v1alpha1_lms_OptsFixed_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_lms_OptsFixed_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsFixed_Field_descriptor,
        new java.lang.String[] { "StartingPosition", "FieldLength", });
    internal_static_api_v1alpha1_lms_OptsParquet_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_lms_OptsParquet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_OptsParquet_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_lms_NewTemplate_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_lms_NewTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_NewTemplate_descriptor,
        new java.lang.String[] { "OrgId", "Filename", "Data", });
    internal_static_api_v1alpha1_lms_ExistingTemplate_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_lms_ExistingTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_lms_ExistingTemplate_descriptor,
        new java.lang.String[] { "FileTemplateId", "ParseOpts", });
    com.tcn.cloud.api.api.v0alpha.LmsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
