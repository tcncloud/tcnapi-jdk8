// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetNextQueuedTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetNextQueuedTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1595
   * @return Whether the skills field is set.
   */
  @java.lang.Deprecated boolean hasSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1595
   * @return The skills.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills();
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder();

  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  int getAgentSkillsCount();
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  boolean containsAgentSkills(
      java.lang.String key);
  /**
   * Use {@link #getAgentSkillsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getAgentSkills();
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getAgentSkillsMap();
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  long getAgentSkillsOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  long getAgentSkillsOrThrow(
      java.lang.String key);
}
