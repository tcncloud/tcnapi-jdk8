// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/service.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ReParseFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseFileRequest_ReParseFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ParseWithHints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseFileRequest_ParseWithHints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ParseFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ParseFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_UpdateFileTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_UpdateFileTemplateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_DeleteFileTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_DeleteFileTemplateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ListFileTemplatesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ListFileTemplatesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_GetFileTemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_GetFileTemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_classifier_GetFileTemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_classifier_GetFileTemplateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%api/v1alpha1/classifier/service.proto\022" +
      "\027api.v1alpha1.classifier\032\027annotations/au" +
      "thz.proto\032&api/v1alpha1/classifier/entit" +
      "ies.proto\032\034google/api/annotations.proto\"" +
      "\230\004\n\020ParseFileRequest\022\033\n\010raw_data\030\003 \001(\014H\000" +
      "R\007rawData\022Z\n\014reparse_file\030\004 \001(\01325.api.v1" +
      "alpha1.classifier.ParseFileRequest.RePar" +
      "seFileH\000R\013reparseFile\022d\n\020parse_with_hint" +
      "s\030\006 \001(\01328.api.v1alpha1.classifier.ParseF" +
      "ileRequest.ParseWithHintsH\000R\016parseWithHi" +
      "nts\022\022\n\004name\030\005 \001(\tR\004name\032\251\001\n\013ReParseFile\022" +
      "(\n\020file_template_id\030\001 \001(\003R\016fileTemplateI" +
      "d\022=\n\005hints\030\002 \001(\0132#.api.v1alpha1.classifi" +
      "er.ParseHintsB\002\030\001R\005hints\0221\n\004opts\030\003 \001(\0132\035" +
      ".api.v1alpha1.classifier.OptsR\004opts\032^\n\016P" +
      "arseWithHints\022\031\n\010raw_data\030\007 \001(\014R\007rawData" +
      "\0221\n\004opts\030\010 \001(\0132\035.api.v1alpha1.classifier" +
      ".OptsR\004optsB\005\n\003opt\"_\n\021ParseFileResponse\022" +
      "J\n\rfile_template\030\001 \001(\0132%.api.v1alpha1.cl" +
      "assifier.FileTemplateR\014fileTemplate\"g\n\031U" +
      "pdateFileTemplateRequest\022J\n\rfile_templat" +
      "e\030\001 \001(\0132%.api.v1alpha1.classifier.FileTe" +
      "mplateR\014fileTemplate\"\034\n\032UpdateFileTempla" +
      "teResponse\"@\n\031DeleteFileTemplateRequest\022" +
      "#\n\rfile_template\030\001 \001(\003R\014fileTemplate\"\034\n\032" +
      "DeleteFileTemplateResponse\"b\n\030ListFileTe" +
      "mplatesRequest\022\027\n\007prev_id\030\001 \001(\003R\006prevId\022" +
      "\020\n\003asc\030\002 \001(\010R\003asc\022\033\n\tpage_size\030\003 \001(\005R\010pa" +
      "geSize\"i\n\031ListFileTemplatesResponse\022L\n\016f" +
      "ile_templates\030\001 \003(\0132%.api.v1alpha1.class" +
      "ifier.FileTemplateR\rfileTemplates\"B\n\026Get" +
      "FileTemplateRequest\022(\n\020file_template_id\030" +
      "\001 \001(\003R\016fileTemplateId\"e\n\027GetFileTemplate" +
      "Response\022J\n\rfile_template\030\001 \001(\0132%.api.v1" +
      "alpha1.classifier.FileTemplateR\014fileTemp" +
      "late2\332\005\n\027ClassifierFileTemplates\022w\n\tPars" +
      "eFile\022).api.v1alpha1.classifier.ParseFil" +
      "eRequest\032*.api.v1alpha1.classifier.Parse" +
      "FileResponse\"\023\272\270\221\002\005\n\003\010\351\007\202\323\344\223\002\003:\001*\022\222\001\n\022Up" +
      "dateFileTemplate\0222.api.v1alpha1.classifi" +
      "er.UpdateFileTemplateRequest\0323.api.v1alp" +
      "ha1.classifier.UpdateFileTemplateRespons" +
      "e\"\023\272\270\221\002\005\n\003\010\351\007\202\323\344\223\002\003:\001*\022\222\001\n\022DeleteFileTem" +
      "plate\0222.api.v1alpha1.classifier.DeleteFi" +
      "leTemplateRequest\0323.api.v1alpha1.classif" +
      "ier.DeleteFileTemplateResponse\"\023\272\270\221\002\005\n\003\010" +
      "\351\007\202\323\344\223\002\003:\001*\022\217\001\n\021ListFileTemplates\0221.api." +
      "v1alpha1.classifier.ListFileTemplatesReq" +
      "uest\0322.api.v1alpha1.classifier.ListFileT" +
      "emplatesResponse\"\023\272\270\221\002\005\n\003\010\351\007\202\323\344\223\002\003:\001*\022\211\001" +
      "\n\017GetFileTemplate\022/.api.v1alpha1.classif" +
      "ier.GetFileTemplateRequest\0320.api.v1alpha" +
      "1.classifier.GetFileTemplateResponse\"\023\272\270" +
      "\221\002\005\n\003\010\351\007\202\323\344\223\002\003:\001*B\267\001\n)com.tcn.cloud.api." +
      "api.v1alpha1.classifierB\014ServiceProtoP\001\242" +
      "\002\003AVC\252\002\027Api.V1alpha1.Classifier\312\002\027Api\\V1" +
      "alpha1\\Classifier\342\002#Api\\V1alpha1\\Classif" +
      "ier\\GPBMetadata\352\002\031Api::V1alpha1::Classif" +
      "ierb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_classifier_ParseFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_classifier_ParseFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseFileRequest_descriptor,
        new java.lang.String[] { "RawData", "ReparseFile", "ParseWithHints", "Name", "Opt", });
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ReParseFile_descriptor =
      internal_static_api_v1alpha1_classifier_ParseFileRequest_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ReParseFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseFileRequest_ReParseFile_descriptor,
        new java.lang.String[] { "FileTemplateId", "Hints", "Opts", });
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ParseWithHints_descriptor =
      internal_static_api_v1alpha1_classifier_ParseFileRequest_descriptor.getNestedTypes().get(1);
    internal_static_api_v1alpha1_classifier_ParseFileRequest_ParseWithHints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseFileRequest_ParseWithHints_descriptor,
        new java.lang.String[] { "RawData", "Opts", });
    internal_static_api_v1alpha1_classifier_ParseFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_classifier_ParseFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ParseFileResponse_descriptor,
        new java.lang.String[] { "FileTemplate", });
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_UpdateFileTemplateRequest_descriptor,
        new java.lang.String[] { "FileTemplate", });
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_classifier_UpdateFileTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_UpdateFileTemplateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_DeleteFileTemplateRequest_descriptor,
        new java.lang.String[] { "FileTemplate", });
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_classifier_DeleteFileTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_DeleteFileTemplateResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_classifier_ListFileTemplatesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_classifier_ListFileTemplatesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ListFileTemplatesRequest_descriptor,
        new java.lang.String[] { "PrevId", "Asc", "PageSize", });
    internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor,
        new java.lang.String[] { "FileTemplates", });
    internal_static_api_v1alpha1_classifier_GetFileTemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_classifier_GetFileTemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_GetFileTemplateRequest_descriptor,
        new java.lang.String[] { "FileTemplateId", });
    internal_static_api_v1alpha1_classifier_GetFileTemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_classifier_GetFileTemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_classifier_GetFileTemplateResponse_descriptor,
        new java.lang.String[] { "FileTemplate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
