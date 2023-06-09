// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface WFMAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.WFMAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID for this object.
   * </pre>
   *
   * <code>int64 wfm_agent_sid = 1 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  long getWfmAgentSid();

  /**
   * <pre>
   * Reference to the affiliated tcn agent.
   * If set to nil, that means that this WFM Agent is not assigned to a TCN agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value tcn_agent_sid = 2 [json_name = "tcnAgentSid"];</code>
   * @return Whether the tcnAgentSid field is set.
   */
  boolean hasTcnAgentSid();
  /**
   * <pre>
   * Reference to the affiliated tcn agent.
   * If set to nil, that means that this WFM Agent is not assigned to a TCN agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value tcn_agent_sid = 2 [json_name = "tcnAgentSid"];</code>
   * @return The tcnAgentSid.
   */
  com.google.protobuf.Int64Value getTcnAgentSid();
  /**
   * <pre>
   * Reference to the affiliated tcn agent.
   * If set to nil, that means that this WFM Agent is not assigned to a TCN agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value tcn_agent_sid = 2 [json_name = "tcnAgentSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTcnAgentSidOrBuilder();

  /**
   * <pre>
   * Name for WFM Agent.
   * If it's for a TCN agent this value will always match that TCN agent's name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name for WFM Agent.
   * If it's for a TCN agent this value will always match that TCN agent's name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Null by default, indicates date which agent was removed or deactivated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   * @return Whether the datetimeSetToInactive field is set.
   */
  boolean hasDatetimeSetToInactive();
  /**
   * <pre>
   * Null by default, indicates date which agent was removed or deactivated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   * @return The datetimeSetToInactive.
   */
  com.google.protobuf.Timestamp getDatetimeSetToInactive();
  /**
   * <pre>
   * Null by default, indicates date which agent was removed or deactivated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatetimeSetToInactiveOrBuilder();

  /**
   * <pre>
   * The constraint rules associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 5 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule> 
      getMemberConstraintRulesList();
  /**
   * <pre>
   * The constraint rules associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 5 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getMemberConstraintRules(int index);
  /**
   * <pre>
   * The constraint rules associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 5 [json_name = "memberConstraintRules"];</code>
   */
  int getMemberConstraintRulesCount();
  /**
   * <pre>
   * The constraint rules associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 5 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
      getMemberConstraintRulesOrBuilderList();
  /**
   * <pre>
   * The constraint rules associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 5 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getMemberConstraintRulesOrBuilder(
      int index);

  /**
   * <pre>
   * List of skill proficiencies associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 6 [json_name = "memberSkillProficiencies"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiency> 
      getMemberSkillProficienciesList();
  /**
   * <pre>
   * List of skill proficiencies associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 6 [json_name = "memberSkillProficiencies"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiency getMemberSkillProficiencies(int index);
  /**
   * <pre>
   * List of skill proficiencies associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 6 [json_name = "memberSkillProficiencies"];</code>
   */
  int getMemberSkillProficienciesCount();
  /**
   * <pre>
   * List of skill proficiencies associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 6 [json_name = "memberSkillProficiencies"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiencyOrBuilder> 
      getMemberSkillProficienciesOrBuilderList();
  /**
   * <pre>
   * List of skill proficiencies associated with &#64;wfm_agent_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 6 [json_name = "memberSkillProficiencies"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiencyOrBuilder getMemberSkillProficienciesOrBuilder(
      int index);

  /**
   * <pre>
   * List of agent availability patterns associated with this wfm agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 7 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern> 
      getMemberAgentAvailabilityPatternsList();
  /**
   * <pre>
   * List of agent availability patterns associated with this wfm agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 7 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern getMemberAgentAvailabilityPatterns(int index);
  /**
   * <pre>
   * List of agent availability patterns associated with this wfm agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 7 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  int getMemberAgentAvailabilityPatternsCount();
  /**
   * <pre>
   * List of agent availability patterns associated with this wfm agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 7 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder> 
      getMemberAgentAvailabilityPatternsOrBuilderList();
  /**
   * <pre>
   * List of agent availability patterns associated with this wfm agent.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 7 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder getMemberAgentAvailabilityPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Date of creation of the agent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Date of creation of the agent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Date of creation of the agent.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 8 [json_name = "createdAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * If this WFM agent is for a TCN agent, it indicates whether or not this TCN Agent is enabled or not.
   * Field is read only and cannot be modified.
   * </pre>
   *
   * <code>bool tcn_agent_is_enabled = 9 [json_name = "tcnAgentIsEnabled"];</code>
   * @return The tcnAgentIsEnabled.
   */
  boolean getTcnAgentIsEnabled();
}
