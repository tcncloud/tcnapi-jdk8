// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/agent_profile_group.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public final class AgentProfileGroupProto {
  private AgentProfileGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_GetAgentProfileGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_GetAgentProfileGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0api/v1alpha1/org/users/agent_profile_g" +
      "roup.proto\022\026api.v1alpha1.org.users\032)api/" +
      "commons/org/agent_profile_group.proto\"R\n" +
      "\033GetAgentProfileGroupRequest\0223\n\026agent_pr" +
      "ofile_group_id\030\001 \001(\tR\023agentProfileGroupI" +
      "d\"r\n\034GetAgentProfileGroupResponse\022R\n\023age" +
      "nt_profile_group\030\001 \001(\0132\".api.commons.org" +
      ".AgentProfileGroupR\021agentProfileGroup\"t\n" +
      "\036UpdateAgentProfileGroupRequest\022R\n\023agent" +
      "_profile_group\030\001 \001(\0132\".api.commons.org.A" +
      "gentProfileGroupR\021agentProfileGroup\"!\n\037U" +
      "pdateAgentProfileGroupResponse\"\037\n\035ListAg" +
      "entProfileGroupsRequest\"v\n\036ListAgentProf" +
      "ileGroupsResponse\022T\n\024agent_profile_group" +
      "s\030\001 \003(\0132\".api.commons.org.AgentProfileGr" +
      "oupR\022agentProfileGroups\"t\n\036CreateAgentPr" +
      "ofileGroupRequest\022R\n\023agent_profile_group" +
      "\030\001 \001(\0132\".api.commons.org.AgentProfileGro" +
      "upR\021agentProfileGroup\"V\n\037CreateAgentProf" +
      "ileGroupResponse\0223\n\026agent_profile_group_" +
      "id\030\001 \001(\tR\023agentProfileGroupId\"U\n\036DeleteA" +
      "gentProfileGroupRequest\0223\n\026agent_profile" +
      "_group_id\030\001 \001(\tR\023agentProfileGroupId\"!\n\037" +
      "DeleteAgentProfileGroupResponse\"q\n\037Assig" +
      "nAgentProfileGroupsRequest\0223\n\026agent_prof" +
      "ile_group_id\030\001 \001(\tR\023agentProfileGroupId\022" +
      "\031\n\010user_ids\030\002 \003(\tR\007userIds\"\"\n AssignAgen" +
      "tProfileGroupsResponseB\276\001\n(com.tcn.cloud" +
      ".api.api.v1alpha1.org.usersB\026AgentProfil" +
      "eGroupProtoP\001\242\002\004AVOU\252\002\026Api.V1alpha1.Org." +
      "Users\312\002\026Api\\V1alpha1\\Org\\Users\342\002\"Api\\V1a" +
      "lpha1\\Org\\Users\\GPBMetadata\352\002\031Api::V1alp" +
      "ha1::Org::Usersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_GetAgentProfileGroupRequest_descriptor,
        new java.lang.String[] { "AgentProfileGroupId", });
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_org_users_GetAgentProfileGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_GetAgentProfileGroupResponse_descriptor,
        new java.lang.String[] { "AgentProfileGroup", });
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupRequest_descriptor,
        new java.lang.String[] { "AgentProfileGroup", });
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_UpdateAgentProfileGroupResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_ListAgentProfileGroupsResponse_descriptor,
        new java.lang.String[] { "AgentProfileGroups", });
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupRequest_descriptor,
        new java.lang.String[] { "AgentProfileGroup", });
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_CreateAgentProfileGroupResponse_descriptor,
        new java.lang.String[] { "AgentProfileGroupId", });
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupRequest_descriptor,
        new java.lang.String[] { "AgentProfileGroupId", });
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_DeleteAgentProfileGroupResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsRequest_descriptor,
        new java.lang.String[] { "AgentProfileGroupId", "UserIds", });
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_users_AssignAgentProfileGroupsResponse_descriptor,
        new java.lang.String[] { });
    com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
