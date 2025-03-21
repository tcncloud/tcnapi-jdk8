// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface LocationNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.LocationNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node unique id
   * </pre>
   *
   * <code>int64 location_node_sid = 1 [json_name = "locationNodeSid"];</code>
   * @return The locationNodeSid.
   */
  long getLocationNodeSid();

  /**
   * <pre>
   * Node name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Node name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Node description.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Node description.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * ID of the parent client node.
   * </pre>
   *
   * <code>int64 client_node_sid = 4 [json_name = "clientNodeSid"];</code>
   * @return The clientNodeSid.
   */
  long getClientNodeSid();

  /**
   * <pre>
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 5 [json_name = "datetimeSetToInactive"];</code>
   * @return Whether the datetimeSetToInactive field is set.
   */
  boolean hasDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 5 [json_name = "datetimeSetToInactive"];</code>
   * @return The datetimeSetToInactive.
   */
  com.google.protobuf.Timestamp getDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 5 [json_name = "datetimeSetToInactive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatetimeSetToInactiveOrBuilder();

  /**
   * <pre>
   * Timezone of this node.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 6 [json_name = "timeZoneVal"];</code>
   * @return The enum numeric value on the wire for timeZoneVal.
   */
  int getTimeZoneValValue();
  /**
   * <pre>
   * Timezone of this node.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 6 [json_name = "timeZoneVal"];</code>
   * @return The timeZoneVal.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZoneVal();

  /**
   * <pre>
   * Indicates whether on not the &#64;shrinkage_value is a percentage (true=percentage, false=agents).
   * </pre>
   *
   * <code>bool shrinkage_is_percentage = 7 [json_name = "shrinkageIsPercentage", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.LocationNode.shrinkage_is_percentage is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5548
   * @return The shrinkageIsPercentage.
   */
  @java.lang.Deprecated boolean getShrinkageIsPercentage();

  /**
   * <pre>
   * Value of the shrinkage.
   * </pre>
   *
   * <code>int32 shrinkage_value = 8 [json_name = "shrinkageValue", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.LocationNode.shrinkage_value is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5550
   * @return The shrinkageValue.
   */
  @java.lang.Deprecated int getShrinkageValue();

  /**
   * <pre>
   * ID of the schedule scenario that the location node belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 9 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * Program Nodes associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ProgramNode member_program_nodes = 10 [json_name = "memberProgramNodes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ProgramNode> 
      getMemberProgramNodesList();
  /**
   * <pre>
   * Program Nodes associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ProgramNode member_program_nodes = 10 [json_name = "memberProgramNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ProgramNode getMemberProgramNodes(int index);
  /**
   * <pre>
   * Program Nodes associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ProgramNode member_program_nodes = 10 [json_name = "memberProgramNodes"];</code>
   */
  int getMemberProgramNodesCount();
  /**
   * <pre>
   * Program Nodes associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ProgramNode member_program_nodes = 10 [json_name = "memberProgramNodes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ProgramNodeOrBuilder> 
      getMemberProgramNodesOrBuilderList();
  /**
   * <pre>
   * Program Nodes associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ProgramNode member_program_nodes = 10 [json_name = "memberProgramNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ProgramNodeOrBuilder getMemberProgramNodesOrBuilder(
      int index);

  /**
   * <pre>
   * Non Skill Activities associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 11 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity> 
      getMemberNonSkillActivitiesList();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 11 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity getMemberNonSkillActivities(int index);
  /**
   * <pre>
   * Non Skill Activities associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 11 [json_name = "memberNonSkillActivities"];</code>
   */
  int getMemberNonSkillActivitiesCount();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 11 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder> 
      getMemberNonSkillActivitiesOrBuilderList();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 11 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder getMemberNonSkillActivitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Open Times Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 12 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern> 
      getMemberOpenTimesPatternsList();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 12 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern getMemberOpenTimesPatterns(int index);
  /**
   * <pre>
   * Open Times Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 12 [json_name = "memberOpenTimesPatterns"];</code>
   */
  int getMemberOpenTimesPatternsCount();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 12 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder> 
      getMemberOpenTimesPatternsOrBuilderList();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 12 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder getMemberOpenTimesPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 13 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern> 
      getMemberAgentAvailabilityPatternsList();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 13 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern getMemberAgentAvailabilityPatterns(int index);
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 13 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  int getMemberAgentAvailabilityPatternsCount();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 13 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder> 
      getMemberAgentAvailabilityPatternsOrBuilderList();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 13 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder getMemberAgentAvailabilityPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Constraint Rules associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 14 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule> 
      getMemberConstraintRulesList();
  /**
   * <pre>
   * Constraint Rules associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 14 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getMemberConstraintRules(int index);
  /**
   * <pre>
   * Constraint Rules associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 14 [json_name = "memberConstraintRules"];</code>
   */
  int getMemberConstraintRulesCount();
  /**
   * <pre>
   * Constraint Rules associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 14 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
      getMemberConstraintRulesOrBuilderList();
  /**
   * <pre>
   * Constraint Rules associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 14 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getMemberConstraintRulesOrBuilder(
      int index);

  /**
   * <pre>
   * Agent Groups associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 15 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup> 
      getMemberAgentGroupsList();
  /**
   * <pre>
   * Agent Groups associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 15 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup getMemberAgentGroups(int index);
  /**
   * <pre>
   * Agent Groups associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 15 [json_name = "memberAgentGroups"];</code>
   */
  int getMemberAgentGroupsCount();
  /**
   * <pre>
   * Agent Groups associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 15 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder> 
      getMemberAgentGroupsOrBuilderList();
  /**
   * <pre>
   * Agent Groups associated with &#64;location_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 15 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder getMemberAgentGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the original Location Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.LocationNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5567
   * @return Whether the originSid field is set.
   */
  @java.lang.Deprecated boolean hasOriginSid();
  /**
   * <pre>
   * ID of the original Location Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.LocationNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=5567
   * @return The originSid.
   */
  @java.lang.Deprecated com.google.protobuf.Int64Value getOriginSid();
  /**
   * <pre>
   * ID of the original Location Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.Int64ValueOrBuilder getOriginSidOrBuilder();

  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 17 [json_name = "shrinkage"];</code>
   * @return Whether the shrinkage field is set.
   */
  boolean hasShrinkage();
  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 17 [json_name = "shrinkage"];</code>
   * @return The shrinkage.
   */
  com.google.protobuf.FloatValue getShrinkage();
  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 17 [json_name = "shrinkage"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getShrinkageOrBuilder();
}
