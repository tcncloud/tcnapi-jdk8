// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/entities.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

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
    internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_FileTemplate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_FileTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_FileTemplate_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_FileTemplate_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Opts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Opts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Opts_DateFormatsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Opts_DateFormatsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Opts_RenameFieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Opts_RenameFieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseOpts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseOpts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsCsv_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsCsv_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsJson_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsJson_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsJsonL_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsJsonL_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsFixed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsFixed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsFixed_FieldOpts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsFixed_FieldOpts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsFixed_PositionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsFixed_PositionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_OptsParquet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_OptsParquet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Constraints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Constraints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Constraints_ForbidEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Constraints_ForbidEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_Constraints_AllowEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_Constraints_AllowEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseHints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseHints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&api/v1alpha1/classifier/entities.proto" +
      "\022\027api.v1alpha1.classifier\032\034api/commons/c" +
      "lassifier.proto\"P\n\025ClassifierEntityTypes" +
      "\0227\n\005types\030\001 \003(\0162!.api.commons.Classifier" +
      "EntityTypeR\005types\"\257\004\n\014FileTemplate\022,\n\020fi" +
      "le_template_id\030\001 \001(\003B\0020\001R\016fileTemplateId" +
      "\022\032\n\010filename\030\002 \001(\tR\010filename\022C\n\006fields\030\003" +
      " \003(\0132+.api.v1alpha1.classifier.FileTempl" +
      "ate.FieldR\006fields\022E\n\nparse_opts\030\004 \001(\0132\"." +
      "api.v1alpha1.classifier.ParseOptsB\002\030\001R\tp" +
      "arseOpts\022J\n\013constraints\030\005 \001(\0132$.api.v1al" +
      "pha1.classifier.ConstraintsB\002\030\001R\013constra" +
      "ints\022\022\n\004foid\030\006 \001(\003R\004foid\0221\n\004opts\030\007 \001(\0132\035" +
      ".api.v1alpha1.classifier.OptsR\004opts\032\265\001\n\005" +
      "Field\022\037\n\013syntax_type\030\001 \001(\tR\nsyntaxType\022B" +
      "\n\013entity_type\030\002 \001(\0162!.api.commons.Classi" +
      "fierEntityTypeR\nentityType\022\022\n\004name\030\003 \001(\t" +
      "R\004name\022\026\n\006format\030\004 \001(\tR\006format\022\033\n\traw_va" +
      "lue\030\005 \001(\tR\010rawValue\"\273\003\n\004Opts\022Q\n\014date_for" +
      "mats\030\001 \003(\0132..api.v1alpha1.classifier.Opt" +
      "s.DateFormatsEntryR\013dateFormats\022T\n\rrenam" +
      "e_fields\030\002 \003(\0132/.api.v1alpha1.classifier" +
      ".Opts.RenameFieldsEntryR\014renameFields\022A\n" +
      "\nparse_opts\030\003 \001(\0132\".api.v1alpha1.classif" +
      "ier.ParseOptsR\tparseOpts\022F\n\013constraints\030" +
      "\004 \001(\0132$.api.v1alpha1.classifier.Constrai" +
      "ntsR\013constraints\032>\n\020DateFormatsEntry\022\020\n\003" +
      "key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:\0028\001" +
      "\032?\n\021RenameFieldsEntry\022\020\n\003key\030\001 \001(\tR\003key\022" +
      "\024\n\005value\030\002 \001(\tR\005value:\0028\001\"\275\002\n\tParseOpts\022" +
      "4\n\003csv\030\001 \001(\0132 .api.v1alpha1.classifier.O" +
      "ptsCsvH\000R\003csv\0227\n\004json\030\002 \001(\0132!.api.v1alph" +
      "a1.classifier.OptsJsonH\000R\004json\022:\n\005jsonl\030" +
      "\003 \001(\0132\".api.v1alpha1.classifier.OptsJson" +
      "LH\000R\005jsonl\022:\n\005fixed\030\004 \001(\0132\".api.v1alpha1" +
      ".classifier.OptsFixedH\000R\005fixed\022@\n\007parque" +
      "t\030\005 \001(\0132$.api.v1alpha1.classifier.OptsPa" +
      "rquetH\000R\007parquetB\007\n\005ftype\"{\n\007OptsCsv\022\035\n\n" +
      "has_header\030\001 \001(\010R\thasHeader\022\033\n\tskip_rows" +
      "\030\002 \001(\003R\010skipRows\022\026\n\006header\030\003 \003(\tR\006header" +
      "\022\034\n\tseparator\030\004 \001(\tR\tseparator\"-\n\010OptsJs" +
      "on\022!\n\014records_root\030\001 \001(\tR\013recordsRoot\"\013\n" +
      "\tOptsJsonL\"\304\002\n\tOptsFixed\022O\n\tpositions\030\001 " +
      "\003(\01321.api.v1alpha1.classifier.OptsFixed." +
      "PositionsEntryR\tpositions\022\035\n\nhas_header\030" +
      "\002 \001(\010R\thasHeader\032[\n\tFieldOpts\022+\n\021startin" +
      "g_position\030\r \001(\005R\020startingPosition\022!\n\014fi" +
      "eld_length\030\016 \001(\005R\013fieldLength\032j\n\016Positio" +
      "nsEntry\022\020\n\003key\030\001 \001(\tR\003key\022B\n\005value\030\002 \001(\013" +
      "2,.api.v1alpha1.classifier.OptsFixed.Fie" +
      "ldOptsR\005value:\0028\001\"\r\n\013OptsParquet\"\363\002\n\013Con" +
      "straints\022H\n\006forbid\030\001 \003(\01320.api.v1alpha1." +
      "classifier.Constraints.ForbidEntryR\006forb" +
      "id\022E\n\005allow\030\002 \003(\0132/.api.v1alpha1.classif" +
      "ier.Constraints.AllowEntryR\005allow\032i\n\013For" +
      "bidEntry\022\020\n\003key\030\001 \001(\tR\003key\022D\n\005value\030\002 \001(" +
      "\0132..api.v1alpha1.classifier.ClassifierEn" +
      "tityTypesR\005value:\0028\001\032h\n\nAllowEntry\022\020\n\003ke" +
      "y\030\001 \001(\tR\003key\022D\n\005value\030\002 \001(\0132..api.v1alph" +
      "a1.classifier.ClassifierEntityTypesR\005val" +
      "ue:\0028\001\"\227\001\n\nParseHints\022A\n\nparse_opts\030\001 \001(" +
      "\0132\".api.v1alpha1.classifier.ParseOptsR\tp" +
      "arseOpts\022F\n\013constraints\030\002 \001(\0132$.api.v1al" +
      "pha1.classifier.ConstraintsR\013constraints" +
      "B\270\001\n)com.tcn.cloud.api.api.v1alpha1.clas" +
      "sifierB\rEntitiesProtoP\001\242\002\003AVC\252\002\027Api.V1al" +
      "pha1.Classifier\312\002\027Api\\V1alpha1\\Classifie" +
      "r\342\002#Api\\V1alpha1\\Classifier\\GPBMetadata\352" +
      "\002\031Api::V1alpha1::Classifierb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ClassifierProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor,
        new java.lang.String[] { "Types", });
    internal_static_api_v1alpha1_classifier_FileTemplate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_classifier_FileTemplate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_FileTemplate_descriptor,
        new java.lang.String[] { "FileTemplateId", "Filename", "Fields", "ParseOpts", "Constraints", "Foid", "Opts", });
    internal_static_api_v1alpha1_classifier_FileTemplate_Field_descriptor =
      internal_static_api_v1alpha1_classifier_FileTemplate_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_classifier_FileTemplate_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_FileTemplate_Field_descriptor,
        new java.lang.String[] { "SyntaxType", "EntityType", "Name", "Format", "RawValue", });
    internal_static_api_v1alpha1_classifier_Opts_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_classifier_Opts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Opts_descriptor,
        new java.lang.String[] { "DateFormats", "RenameFields", "ParseOpts", "Constraints", });
    internal_static_api_v1alpha1_classifier_Opts_DateFormatsEntry_descriptor =
      internal_static_api_v1alpha1_classifier_Opts_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_classifier_Opts_DateFormatsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Opts_DateFormatsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_classifier_Opts_RenameFieldsEntry_descriptor =
      internal_static_api_v1alpha1_classifier_Opts_descriptor.getNestedTypes().get(1);
    internal_static_api_v1alpha1_classifier_Opts_RenameFieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Opts_RenameFieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_classifier_ParseOpts_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_classifier_ParseOpts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseOpts_descriptor,
        new java.lang.String[] { "Csv", "Json", "Jsonl", "Fixed", "Parquet", "Ftype", });
    internal_static_api_v1alpha1_classifier_OptsCsv_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_classifier_OptsCsv_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsCsv_descriptor,
        new java.lang.String[] { "HasHeader", "SkipRows", "Header", "Separator", });
    internal_static_api_v1alpha1_classifier_OptsJson_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_classifier_OptsJson_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsJson_descriptor,
        new java.lang.String[] { "RecordsRoot", });
    internal_static_api_v1alpha1_classifier_OptsJsonL_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_classifier_OptsJsonL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsJsonL_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_classifier_OptsFixed_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_classifier_OptsFixed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsFixed_descriptor,
        new java.lang.String[] { "Positions", "HasHeader", });
    internal_static_api_v1alpha1_classifier_OptsFixed_FieldOpts_descriptor =
      internal_static_api_v1alpha1_classifier_OptsFixed_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_classifier_OptsFixed_FieldOpts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsFixed_FieldOpts_descriptor,
        new java.lang.String[] { "StartingPosition", "FieldLength", });
    internal_static_api_v1alpha1_classifier_OptsFixed_PositionsEntry_descriptor =
      internal_static_api_v1alpha1_classifier_OptsFixed_descriptor.getNestedTypes().get(1);
    internal_static_api_v1alpha1_classifier_OptsFixed_PositionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsFixed_PositionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_classifier_OptsParquet_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_classifier_OptsParquet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_OptsParquet_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_classifier_Constraints_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_classifier_Constraints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Constraints_descriptor,
        new java.lang.String[] { "Forbid", "Allow", });
    internal_static_api_v1alpha1_classifier_Constraints_ForbidEntry_descriptor =
      internal_static_api_v1alpha1_classifier_Constraints_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_classifier_Constraints_ForbidEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Constraints_ForbidEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_classifier_Constraints_AllowEntry_descriptor =
      internal_static_api_v1alpha1_classifier_Constraints_descriptor.getNestedTypes().get(1);
    internal_static_api_v1alpha1_classifier_Constraints_AllowEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_Constraints_AllowEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_v1alpha1_classifier_ParseHints_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_classifier_ParseHints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseHints_descriptor,
        new java.lang.String[] { "ParseOpts", "Constraints", });
    com.tcn.cloud.api.api.commons.ClassifierProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
