// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

public interface ListSkillsForCurrentAgentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The returned list of skills belonging to the current agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill skills = 1 [json_name = "skills"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill> 
      getSkillsList();
  /**
   * <pre>
   * The returned list of skills belonging to the current agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill skills = 1 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill getSkills(int index);
  /**
   * <pre>
   * The returned list of skills belonging to the current agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill skills = 1 [json_name = "skills"];</code>
   */
  int getSkillsCount();
  /**
   * <pre>
   * The returned list of skills belonging to the current agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill skills = 1 [json_name = "skills"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkillOrBuilder> 
      getSkillsOrBuilderList();
  /**
   * <pre>
   * The returned list of skills belonging to the current agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkill skills = 1 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillsForCurrentAgentResponse.AgentSkillOrBuilder getSkillsOrBuilder(
      int index);
}