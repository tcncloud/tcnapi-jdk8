// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/nodes.proto

package com.tcn.cloud.api.api.commons.workflows;

public final class NodesProto {
  private NodesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!api/commons/workflows/nodes.proto\022\025api" +
      ".commons.workflows\032 api/commons/workflow" +
      "s/omni.proto\"\326\003\n\016NodeDefinition\022\016\n\002id\030\001 " +
      "\001(\tR\002id\022\022\n\004name\030\003 \001(\tR\004name\022 \n\013descripti" +
      "on\030\004 \001(\tR\013description\022\030\n\007outputs\030\005 \003(\tR\007" +
      "outputs\022\"\n\rerror_node_id\030\006 \001(\tR\013errorNod" +
      "eId\022I\n\013omni_prompt\030\311\001 \001(\0132%.api.commons." +
      "workflows.OmniNodePromptH\000R\nomniPrompt\022P" +
      "\n\016omni_set_skill\030\312\001 \001(\0132\'.api.commons.wo" +
      "rkflows.OmniNodeSetSkillH\000R\014omniSetSkill" +
      "\022M\n\romni_to_agent\030\313\001 \001(\0132&.api.commons.w" +
      "orkflows.OmniNodeToAgentH\000R\013omniToAgent\022" +
      "F\n\nomni_error\030\314\001 \001(\0132$.api.commons.workf" +
      "lows.OmniNodeErrorH\000R\tomniErrorB\014\n\ndefin" +
      "itionB\253\001\n\'com.tcn.cloud.api.api.commons." +
      "workflowsB\nNodesProtoP\001\242\002\003ACW\252\002\025Api.Comm" +
      "ons.Workflows\312\002\025Api\\Commons\\Workflows\342\002!" +
      "Api\\Commons\\Workflows\\GPBMetadata\352\002\027Api:" +
      ":Commons::Workflowsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.workflows.OmniProto.getDescriptor(),
        });
    internal_static_api_commons_workflows_NodeDefinition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_workflows_NodeDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeDefinition_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "Outputs", "ErrorNodeId", "OmniPrompt", "OmniSetSkill", "OmniToAgent", "OmniError", "Definition", });
    com.tcn.cloud.api.api.commons.workflows.OmniProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
