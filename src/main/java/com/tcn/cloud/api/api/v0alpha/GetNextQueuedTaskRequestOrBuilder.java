// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetNextQueuedTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetNextQueuedTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  boolean hasSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return The skills.
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder();
}
