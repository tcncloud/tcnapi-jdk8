// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/projects/projects.proto

package com.tcn.cloud.api.api.v1alpha1.projects;

public final class ProjectsProto {
  private ProjectsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_ListProjectsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_ListProjectsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_ListProjectsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_ListProjectsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_GetProjectByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_GetProjectByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_GetProjectByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_GetProjectByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_Project_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_OmniProjectComplianceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_OmniProjectComplianceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_OmniComplianceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_OmniComplianceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_projects_OmniComplianceAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_projects_OmniComplianceAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$api/v1alpha1/projects/projects.proto\022\025" +
      "api.v1alpha1.projects\032%google/api/expr/v" +
      "1alpha1/syntax.proto\032 google/protobuf/fi" +
      "eld_mask.proto\032\037google/protobuf/timestam" +
      "p.proto\032\036google/protobuf/wrappers.proto\"" +
      "S\n\023ListProjectsRequest\022<\n\006filter\030\001 \001(\0132$" +
      ".google.api.expr.v1alpha1.ParsedExprR\006fi" +
      "lter\"R\n\024ListProjectsResponse\022:\n\010projects" +
      "\030\001 \003(\0132\036.api.v1alpha1.projects.ProjectR\010" +
      "projects\"w\n\025GetProjectByIdRequest\022#\n\013pro" +
      "ject_sid\030\001 \001(\003B\0020\001R\nprojectSid\0229\n\nfield_" +
      "mask\030\002 \001(\0132\032.google.protobuf.FieldMaskR\t" +
      "fieldMask\"R\n\026GetProjectByIdResponse\0228\n\007p" +
      "roject\030\001 \001(\0132\036.api.v1alpha1.projects.Pro" +
      "jectR\007project\"\302\002\n\007Project\022#\n\013project_sid" +
      "\030\001 \001(\003B\0020\001R\nprojectSid\022\022\n\004name\030\002 \001(\tR\004na" +
      "me\022 \n\013description\030\003 \001(\tR\013description\022<\n\006" +
      "status\030\004 \001(\0162$.api.v1alpha1.projects.Pro" +
      "jectStatusR\006status\022=\n\014date_created\030\005 \001(\013" +
      "2\032.google.protobuf.TimestampR\013dateCreate" +
      "d\022_\n\021compliance_config\030\006 \001(\01322.api.v1alp" +
      "ha1.projects.OmniProjectComplianceConfig" +
      "R\020complianceConfig\"\350\001\n\033OmniProjectCompli" +
      "anceConfig\022A\n\005email\030\001 \001(\0132+.api.v1alpha1" +
      ".projects.OmniComplianceConfigR\005email\022=\n" +
      "\003sms\030\002 \001(\0132+.api.v1alpha1.projects.OmniC" +
      "omplianceConfigR\003sms\022G\n\010whatsapp\030\003 \001(\0132+" +
      ".api.v1alpha1.projects.OmniComplianceCon" +
      "figR\010whatsapp\"\222\003\n\024OmniComplianceConfig\022B" +
      "\n\006opt_in\030\001 \001(\0132+.api.v1alpha1.projects.O" +
      "mniComplianceActionR\005optIn\022D\n\007opt_out\030\002 " +
      "\001(\0132+.api.v1alpha1.projects.OmniComplian" +
      "ceActionR\006optOut\022?\n\004help\030\003 \001(\0132+.api.v1a" +
      "lpha1.projects.OmniComplianceActionR\004hel" +
      "p\022M\n\013information\030\004 \001(\0132+.api.v1alpha1.pr" +
      "ojects.OmniComplianceActionR\013information" +
      "\022\"\n\rscrub_list_id\030\005 \001(\tR\013scrubListId\022<\n\013" +
      "rule_set_id\030\006 \001(\0132\034.google.protobuf.Stri" +
      "ngValueR\truleSetId\"\213\001\n\024OmniComplianceAct" +
      "ion\022\032\n\010keywords\030\001 \003(\tR\010keywords\0221\n\024confi" +
      "rmation_message\030\002 \001(\tR\023confirmationMessa" +
      "ge\022$\n\016is_fuzzy_match\030\003 \001(\010R\014isFuzzyMatch" +
      "*c\n\rProjectStatus\022\032\n\026PROJECT_STATUS_UNKN" +
      "OWN\020\000\022\031\n\023PROJECT_STATUS_OPEN\020\350\204\001\022\033\n\025PROJ" +
      "ECT_STATUS_CLOSED\020\362\204\001B\256\001\n\'com.tcn.cloud." +
      "api.api.v1alpha1.projectsB\rProjectsProto" +
      "P\001\242\002\003AVP\252\002\025Api.V1alpha1.Projects\312\002\025Api\\V" +
      "1alpha1\\Projects\342\002!Api\\V1alpha1\\Projects" +
      "\\GPBMetadata\352\002\027Api::V1alpha1::Projectsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_projects_ListProjectsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_projects_ListProjectsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_ListProjectsRequest_descriptor,
        new java.lang.String[] { "Filter", });
    internal_static_api_v1alpha1_projects_ListProjectsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_projects_ListProjectsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_ListProjectsResponse_descriptor,
        new java.lang.String[] { "Projects", });
    internal_static_api_v1alpha1_projects_GetProjectByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_projects_GetProjectByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_GetProjectByIdRequest_descriptor,
        new java.lang.String[] { "ProjectSid", "FieldMask", });
    internal_static_api_v1alpha1_projects_GetProjectByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_projects_GetProjectByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_GetProjectByIdResponse_descriptor,
        new java.lang.String[] { "Project", });
    internal_static_api_v1alpha1_projects_Project_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_projects_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_Project_descriptor,
        new java.lang.String[] { "ProjectSid", "Name", "Description", "Status", "DateCreated", "ComplianceConfig", });
    internal_static_api_v1alpha1_projects_OmniProjectComplianceConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_projects_OmniProjectComplianceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_OmniProjectComplianceConfig_descriptor,
        new java.lang.String[] { "Email", "Sms", "Whatsapp", });
    internal_static_api_v1alpha1_projects_OmniComplianceConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_projects_OmniComplianceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_OmniComplianceConfig_descriptor,
        new java.lang.String[] { "OptIn", "OptOut", "Help", "Information", "ScrubListId", "RuleSetId", });
    internal_static_api_v1alpha1_projects_OmniComplianceAction_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_projects_OmniComplianceAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_projects_OmniComplianceAction_descriptor,
        new java.lang.String[] { "Keywords", "ConfirmationMessage", "IsFuzzyMatch", });
    com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
