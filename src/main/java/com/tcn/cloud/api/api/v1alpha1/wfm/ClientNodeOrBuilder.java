// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ClientNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ClientNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node unique id
   * </pre>
   *
   * <code>int64 client_node_sid = 1 [json_name = "clientNodeSid"];</code>
   * @return The clientNodeSid.
   */
  long getClientNodeSid();

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
   * Parent node id -- should only have CallCenter nodes as parents
   * </pre>
   *
   * <code>int64 parent_sid = 4 [json_name = "parentSid"];</code>
   * @return The parentSid.
   */
  long getParentSid();

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
   * Client TimeZone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 6 [json_name = "timeZoneVal"];</code>
   * @return The enum numeric value on the wire for timeZoneVal.
   */
  int getTimeZoneValValue();
  /**
   * <pre>
   * Client TimeZone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 6 [json_name = "timeZoneVal"];</code>
   * @return The timeZoneVal.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZoneVal();

  /**
   * <pre>
   * ID of the schedule scenario that the client node belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 7 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * Location Nodes associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.LocationNode member_location_nodes = 8 [json_name = "memberLocationNodes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode> 
      getMemberLocationNodesList();
  /**
   * <pre>
   * Location Nodes associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.LocationNode member_location_nodes = 8 [json_name = "memberLocationNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode getMemberLocationNodes(int index);
  /**
   * <pre>
   * Location Nodes associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.LocationNode member_location_nodes = 8 [json_name = "memberLocationNodes"];</code>
   */
  int getMemberLocationNodesCount();
  /**
   * <pre>
   * Location Nodes associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.LocationNode member_location_nodes = 8 [json_name = "memberLocationNodes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder> 
      getMemberLocationNodesOrBuilderList();
  /**
   * <pre>
   * Location Nodes associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.LocationNode member_location_nodes = 8 [json_name = "memberLocationNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder getMemberLocationNodesOrBuilder(
      int index);

  /**
   * <pre>
   * Non Skill Activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 9 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity> 
      getMemberNonSkillActivitiesList();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 9 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity getMemberNonSkillActivities(int index);
  /**
   * <pre>
   * Non Skill Activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 9 [json_name = "memberNonSkillActivities"];</code>
   */
  int getMemberNonSkillActivitiesCount();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 9 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder> 
      getMemberNonSkillActivitiesOrBuilderList();
  /**
   * <pre>
   * Non Skill Activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 9 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder getMemberNonSkillActivitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Open Times Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 10 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern> 
      getMemberOpenTimesPatternsList();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 10 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern getMemberOpenTimesPatterns(int index);
  /**
   * <pre>
   * Open Times Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 10 [json_name = "memberOpenTimesPatterns"];</code>
   */
  int getMemberOpenTimesPatternsCount();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 10 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder> 
      getMemberOpenTimesPatternsOrBuilderList();
  /**
   * <pre>
   * Open Times Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 10 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder getMemberOpenTimesPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 11 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern> 
      getMemberAgentAvailabilityPatternsList();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 11 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern getMemberAgentAvailabilityPatterns(int index);
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 11 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  int getMemberAgentAvailabilityPatternsCount();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 11 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder> 
      getMemberAgentAvailabilityPatternsOrBuilderList();
  /**
   * <pre>
   * Agent Availability Patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 11 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder getMemberAgentAvailabilityPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Constraint Rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 12 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule> 
      getMemberConstraintRulesList();
  /**
   * <pre>
   * Constraint Rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 12 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getMemberConstraintRules(int index);
  /**
   * <pre>
   * Constraint Rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 12 [json_name = "memberConstraintRules"];</code>
   */
  int getMemberConstraintRulesCount();
  /**
   * <pre>
   * Constraint Rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 12 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
      getMemberConstraintRulesOrBuilderList();
  /**
   * <pre>
   * Constraint Rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 12 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getMemberConstraintRulesOrBuilder(
      int index);

  /**
   * <pre>
   * Agent Groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 13 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup> 
      getMemberAgentGroupsList();
  /**
   * <pre>
   * Agent Groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 13 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup getMemberAgentGroups(int index);
  /**
   * <pre>
   * Agent Groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 13 [json_name = "memberAgentGroups"];</code>
   */
  int getMemberAgentGroupsCount();
  /**
   * <pre>
   * Agent Groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 13 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder> 
      getMemberAgentGroupsOrBuilderList();
  /**
   * <pre>
   * Agent Groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 13 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder getMemberAgentGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the original Client Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 14 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ClientNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4574
   * @return Whether the originSid field is set.
   */
  @java.lang.Deprecated boolean hasOriginSid();
  /**
   * <pre>
   * ID of the original Client Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 14 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ClientNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4574
   * @return The originSid.
   */
  @java.lang.Deprecated com.google.protobuf.Int64Value getOriginSid();
  /**
   * <pre>
   * ID of the original Client Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 14 [json_name = "originSid", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.Int64ValueOrBuilder getOriginSidOrBuilder();
}
