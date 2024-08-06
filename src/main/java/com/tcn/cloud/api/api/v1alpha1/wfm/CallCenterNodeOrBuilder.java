// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CallCenterNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CallCenterNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node unique id (genereated on the backend when sent for creation).
   * </pre>
   *
   * <code>int64 call_center_node_sid = 1 [json_name = "callCenterNodeSid"];</code>
   * @return The callCenterNodeSid.
   */
  long getCallCenterNodeSid();

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
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   * @return Whether the datetimeSetToInactive field is set.
   */
  boolean hasDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   * @return The datetimeSetToInactive.
   */
  com.google.protobuf.Timestamp getDatetimeSetToInactive();
  /**
   * <pre>
   * Datetime that the node was set to inactive, if not set then the node is currently active.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp datetime_set_to_inactive = 4 [json_name = "datetimeSetToInactive"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatetimeSetToInactiveOrBuilder();

  /**
   * <pre>
   * Call Center TimeZone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 5 [json_name = "timeZoneVal"];</code>
   * @return The enum numeric value on the wire for timeZoneVal.
   */
  int getTimeZoneValValue();
  /**
   * <pre>
   * Call Center TimeZone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 5 [json_name = "timeZoneVal"];</code>
   * @return The timeZoneVal.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZoneVal();

  /**
   * <pre>
   * ID of the schedule scenario that the call center node belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 6 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * client nodes that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ClientNode member_client_nodes = 7 [json_name = "memberClientNodes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ClientNode> 
      getMemberClientNodesList();
  /**
   * <pre>
   * client nodes that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ClientNode member_client_nodes = 7 [json_name = "memberClientNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ClientNode getMemberClientNodes(int index);
  /**
   * <pre>
   * client nodes that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ClientNode member_client_nodes = 7 [json_name = "memberClientNodes"];</code>
   */
  int getMemberClientNodesCount();
  /**
   * <pre>
   * client nodes that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ClientNode member_client_nodes = 7 [json_name = "memberClientNodes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ClientNodeOrBuilder> 
      getMemberClientNodesOrBuilderList();
  /**
   * <pre>
   * client nodes that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ClientNode member_client_nodes = 7 [json_name = "memberClientNodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ClientNodeOrBuilder getMemberClientNodesOrBuilder(
      int index);

  /**
   * <pre>
   * non skill activities that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 8 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity> 
      getMemberNonSkillActivitiesList();
  /**
   * <pre>
   * non skill activities that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 8 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity getMemberNonSkillActivities(int index);
  /**
   * <pre>
   * non skill activities that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 8 [json_name = "memberNonSkillActivities"];</code>
   */
  int getMemberNonSkillActivitiesCount();
  /**
   * <pre>
   * non skill activities that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 8 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder> 
      getMemberNonSkillActivitiesOrBuilderList();
  /**
   * <pre>
   * non skill activities that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 8 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder getMemberNonSkillActivitiesOrBuilder(
      int index);

  /**
   * <pre>
   * open times patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 9 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern> 
      getMemberOpenTimesPatternsList();
  /**
   * <pre>
   * open times patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 9 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern getMemberOpenTimesPatterns(int index);
  /**
   * <pre>
   * open times patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 9 [json_name = "memberOpenTimesPatterns"];</code>
   */
  int getMemberOpenTimesPatternsCount();
  /**
   * <pre>
   * open times patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 9 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder> 
      getMemberOpenTimesPatternsOrBuilderList();
  /**
   * <pre>
   * open times patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 9 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder getMemberOpenTimesPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * agent availability patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 10 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern> 
      getMemberAgentAvailabilityPatternsList();
  /**
   * <pre>
   * agent availability patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 10 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern getMemberAgentAvailabilityPatterns(int index);
  /**
   * <pre>
   * agent availability patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 10 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  int getMemberAgentAvailabilityPatternsCount();
  /**
   * <pre>
   * agent availability patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 10 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder> 
      getMemberAgentAvailabilityPatternsOrBuilderList();
  /**
   * <pre>
   * agent availability patterns that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 10 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder getMemberAgentAvailabilityPatternsOrBuilder(
      int index);

  /**
   * <pre>
   *  constraint rules that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 11 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule> 
      getMemberConstraintRulesList();
  /**
   * <pre>
   *  constraint rules that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 11 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getMemberConstraintRules(int index);
  /**
   * <pre>
   *  constraint rules that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 11 [json_name = "memberConstraintRules"];</code>
   */
  int getMemberConstraintRulesCount();
  /**
   * <pre>
   *  constraint rules that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 11 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
      getMemberConstraintRulesOrBuilderList();
  /**
   * <pre>
   *  constraint rules that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 11 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getMemberConstraintRulesOrBuilder(
      int index);

  /**
   * <pre>
   * agent groups that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 12 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup> 
      getMemberAgentGroupsList();
  /**
   * <pre>
   * agent groups that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 12 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup getMemberAgentGroups(int index);
  /**
   * <pre>
   * agent groups that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 12 [json_name = "memberAgentGroups"];</code>
   */
  int getMemberAgentGroupsCount();
  /**
   * <pre>
   * agent groups that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 12 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder> 
      getMemberAgentGroupsOrBuilderList();
  /**
   * <pre>
   * agent groups that are children of call center node
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 12 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder getMemberAgentGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the original Call Center Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 13 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.CallCenterNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4533
   * @return Whether the originSid field is set.
   */
  @java.lang.Deprecated boolean hasOriginSid();
  /**
   * <pre>
   * ID of the original Call Center Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 13 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.CallCenterNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4533
   * @return The originSid.
   */
  @java.lang.Deprecated com.google.protobuf.Int64Value getOriginSid();
  /**
   * <pre>
   * ID of the original Call Center Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 13 [json_name = "originSid", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.Int64ValueOrBuilder getOriginSidOrBuilder();

  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 14 [json_name = "shrinkage"];</code>
   * @return Whether the shrinkage field is set.
   */
  boolean hasShrinkage();
  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 14 [json_name = "shrinkage"];</code>
   * @return The shrinkage.
   */
  com.google.protobuf.FloatValue getShrinkage();
  /**
   * <pre>
   * the shrinkage percentage [0.0, 100.0]. 0.0 = no shrinkage,  100 = no agents
   * </pre>
   *
   * <code>.google.protobuf.FloatValue shrinkage = 14 [json_name = "shrinkage"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getShrinkageOrBuilder();
}
