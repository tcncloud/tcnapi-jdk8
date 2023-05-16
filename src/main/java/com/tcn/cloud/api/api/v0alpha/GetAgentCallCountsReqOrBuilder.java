// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetAgentCallCountsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetAgentCallCountsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string agent_skills = 1 [json_name = "agentSkills"];</code>
   * @return A list containing the agentSkills.
   */
  java.util.List<java.lang.String>
      getAgentSkillsList();
  /**
   * <code>repeated string agent_skills = 1 [json_name = "agentSkills"];</code>
   * @return The count of agentSkills.
   */
  int getAgentSkillsCount();
  /**
   * <code>repeated string agent_skills = 1 [json_name = "agentSkills"];</code>
   * @param index The index of the element to return.
   * @return The agentSkills at the given index.
   */
  java.lang.String getAgentSkills(int index);
  /**
   * <code>repeated string agent_skills = 1 [json_name = "agentSkills"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentSkills at the given index.
   */
  com.google.protobuf.ByteString
      getAgentSkillsBytes(int index);

  /**
   * <code>repeated string agent_pbx_extensions = 2 [json_name = "agentPbxExtensions"];</code>
   * @return A list containing the agentPbxExtensions.
   */
  java.util.List<java.lang.String>
      getAgentPbxExtensionsList();
  /**
   * <code>repeated string agent_pbx_extensions = 2 [json_name = "agentPbxExtensions"];</code>
   * @return The count of agentPbxExtensions.
   */
  int getAgentPbxExtensionsCount();
  /**
   * <code>repeated string agent_pbx_extensions = 2 [json_name = "agentPbxExtensions"];</code>
   * @param index The index of the element to return.
   * @return The agentPbxExtensions at the given index.
   */
  java.lang.String getAgentPbxExtensions(int index);
  /**
   * <code>repeated string agent_pbx_extensions = 2 [json_name = "agentPbxExtensions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentPbxExtensions at the given index.
   */
  com.google.protobuf.ByteString
      getAgentPbxExtensionsBytes(int index);
}
