// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/projects/v1/projects.proto

package com.tcn.cloud.api.tcnapi.omni.projects.v1;

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
    internal_static_tcnapi_omni_projects_v1_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tcnapi_omni_projects_v1_Project_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&tcnapi/omni/projects/v1/projects.proto" +
      "\022\027tcnapi.omni.projects.v1\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\032\037google/protobuf/timestamp.proto\"\215" +
      "\003\n\007Project\022\027\n\004name\030\001 \001(\tB\003\340A\010R\004name\022\024\n\005t" +
      "itle\030\002 \001(\tR\005title\022 \n\013description\030\003 \001(\tR\013" +
      "description\022A\n\005state\030\004 \001(\0162&.tcnapi.omni" +
      ".projects.v1.Project.StateB\003\340A\003R\005state\022@" +
      "\n\013create_time\030\005 \001(\0132\032.google.protobuf.Ti" +
      "mestampB\003\340A\003R\ncreateTime\"D\n\005State\022\025\n\021STA" +
      "TE_UNSPECIFIED\020\000\022\020\n\nSTATE_OPEN\020\350\204\001\022\022\n\014ST" +
      "ATE_CLOSED\020\362\204\001:f\352Ac\n projects.omni.tcnap" +
      "i.com/Project\022,org/{org}/region/{region}" +
      "/projects/{project}*\010projects2\007projectB\271" +
      "\001\n)com.tcn.cloud.api.tcnapi.omni.project" +
      "s.v1B\rProjectsProtoP\001\242\002\003TOP\252\002\027Tcnapi.Omn" +
      "i.Projects.V1\312\002\027Tcnapi\\Omni\\Projects\\V1\342" +
      "\002#Tcnapi\\Omni\\Projects\\V1\\GPBMetadata\352\002\032" +
      "Tcnapi::Omni::Projects::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tcnapi_omni_projects_v1_Project_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tcnapi_omni_projects_v1_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tcnapi_omni_projects_v1_Project_descriptor,
        new java.lang.String[] { "Name", "Title", "Description", "State", "CreateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
