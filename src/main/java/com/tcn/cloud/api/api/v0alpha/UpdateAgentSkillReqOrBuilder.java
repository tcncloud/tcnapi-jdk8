// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateAgentSkillReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateAgentSkillReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 agent_skill_sid = 1 [json_name = "agentSkillSid"];</code>
   * @return The agentSkillSid.
   */
  long getAgentSkillSid();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
