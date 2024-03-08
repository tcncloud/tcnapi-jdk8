// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ProgramNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ProgramNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node unique id
   * </pre>
   *
   * <code>int64 program_node_sid = 1 [json_name = "programNodeSid"];</code>
   * @return The programNodeSid.
   */
  long getProgramNodeSid();

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
   * ID of the parent location node.
   * </pre>
   *
   * <code>int64 location_node_sid = 4 [json_name = "locationNodeSid"];</code>
   * @return The locationNodeSid.
   */
  long getLocationNodeSid();

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
   * Indicates whether on not the &#64;shrinkage_value is a percentage (true=percentage, false=agents).
   * </pre>
   *
   * <code>bool shrinkage_is_percentage = 6 [json_name = "shrinkageIsPercentage"];</code>
   * @return The shrinkageIsPercentage.
   */
  boolean getShrinkageIsPercentage();

  /**
   * <pre>
   * Value of the shrinkage. Either 0-100 if &#64;shrinkage_is_percentage is true, or a value greater than 0 otherwise.
   * </pre>
   *
   * <code>int32 shrinkage_value = 7 [json_name = "shrinkageValue"];</code>
   * @return The shrinkageValue.
   */
  int getShrinkageValue();

  /**
   * <pre>
   * ID of the schedule scenario that the program node belongs to.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 8 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * Any shift templates associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate member_shift_templates = 9 [json_name = "memberShiftTemplates"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> 
      getMemberShiftTemplatesList();
  /**
   * <pre>
   * Any shift templates associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate member_shift_templates = 9 [json_name = "memberShiftTemplates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getMemberShiftTemplates(int index);
  /**
   * <pre>
   * Any shift templates associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate member_shift_templates = 9 [json_name = "memberShiftTemplates"];</code>
   */
  int getMemberShiftTemplatesCount();
  /**
   * <pre>
   * Any shift templates associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate member_shift_templates = 9 [json_name = "memberShiftTemplates"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> 
      getMemberShiftTemplatesOrBuilderList();
  /**
   * <pre>
   * Any shift templates associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate member_shift_templates = 9 [json_name = "memberShiftTemplates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getMemberShiftTemplatesOrBuilder(
      int index);

  /**
   * <pre>
   * Any non skill activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 10 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity> 
      getMemberNonSkillActivitiesList();
  /**
   * <pre>
   * Any non skill activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 10 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivity getMemberNonSkillActivities(int index);
  /**
   * <pre>
   * Any non skill activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 10 [json_name = "memberNonSkillActivities"];</code>
   */
  int getMemberNonSkillActivitiesCount();
  /**
   * <pre>
   * Any non skill activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 10 [json_name = "memberNonSkillActivities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder> 
      getMemberNonSkillActivitiesOrBuilderList();
  /**
   * <pre>
   * Any non skill activities associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.NonSkillActivity member_non_skill_activities = 10 [json_name = "memberNonSkillActivities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.NonSkillActivityOrBuilder getMemberNonSkillActivitiesOrBuilder(
      int index);

  /**
   * <pre>
   * Any open times patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 11 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern> 
      getMemberOpenTimesPatternsList();
  /**
   * <pre>
   * Any open times patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 11 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPattern getMemberOpenTimesPatterns(int index);
  /**
   * <pre>
   * Any open times patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 11 [json_name = "memberOpenTimesPatterns"];</code>
   */
  int getMemberOpenTimesPatternsCount();
  /**
   * <pre>
   * Any open times patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 11 [json_name = "memberOpenTimesPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder> 
      getMemberOpenTimesPatternsOrBuilderList();
  /**
   * <pre>
   * Any open times patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.OpenTimesPattern member_open_times_patterns = 11 [json_name = "memberOpenTimesPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.OpenTimesPatternOrBuilder getMemberOpenTimesPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Any agent availability patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 12 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern> 
      getMemberAgentAvailabilityPatternsList();
  /**
   * <pre>
   * Any agent availability patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 12 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPattern getMemberAgentAvailabilityPatterns(int index);
  /**
   * <pre>
   * Any agent availability patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 12 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  int getMemberAgentAvailabilityPatternsCount();
  /**
   * <pre>
   * Any agent availability patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 12 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder> 
      getMemberAgentAvailabilityPatternsOrBuilderList();
  /**
   * <pre>
   * Any agent availability patterns associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentAvailabilityPattern member_agent_availability_patterns = 12 [json_name = "memberAgentAvailabilityPatterns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentAvailabilityPatternOrBuilder getMemberAgentAvailabilityPatternsOrBuilder(
      int index);

  /**
   * <pre>
   * Any constraint rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 13 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule> 
      getMemberConstraintRulesList();
  /**
   * <pre>
   * Any constraint rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 13 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRule getMemberConstraintRules(int index);
  /**
   * <pre>
   * Any constraint rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 13 [json_name = "memberConstraintRules"];</code>
   */
  int getMemberConstraintRulesCount();
  /**
   * <pre>
   * Any constraint rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 13 [json_name = "memberConstraintRules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder> 
      getMemberConstraintRulesOrBuilderList();
  /**
   * <pre>
   * Any constraint rules associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ConstraintRule member_constraint_rules = 13 [json_name = "memberConstraintRules"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ConstraintRuleOrBuilder getMemberConstraintRulesOrBuilder(
      int index);

  /**
   * <pre>
   * Any agent groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 14 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup> 
      getMemberAgentGroupsList();
  /**
   * <pre>
   * Any agent groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 14 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroup getMemberAgentGroups(int index);
  /**
   * <pre>
   * Any agent groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 14 [json_name = "memberAgentGroups"];</code>
   */
  int getMemberAgentGroupsCount();
  /**
   * <pre>
   * Any agent groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 14 [json_name = "memberAgentGroups"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder> 
      getMemberAgentGroupsOrBuilderList();
  /**
   * <pre>
   * Any agent groups associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.AgentGroup member_agent_groups = 14 [json_name = "memberAgentGroups"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.AgentGroupOrBuilder getMemberAgentGroupsOrBuilder(
      int index);

  /**
   * <pre>
   * Any skill proficiencies associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 15 [json_name = "memberSkillProficiencies"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiency> 
      getMemberSkillProficienciesList();
  /**
   * <pre>
   * Any skill proficiencies associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 15 [json_name = "memberSkillProficiencies"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiency getMemberSkillProficiencies(int index);
  /**
   * <pre>
   * Any skill proficiencies associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 15 [json_name = "memberSkillProficiencies"];</code>
   */
  int getMemberSkillProficienciesCount();
  /**
   * <pre>
   * Any skill proficiencies associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 15 [json_name = "memberSkillProficiencies"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiencyOrBuilder> 
      getMemberSkillProficienciesOrBuilderList();
  /**
   * <pre>
   * Any skill proficiencies associated with &#64;program_node_sid.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.SkillProficiency member_skill_proficiencies = 15 [json_name = "memberSkillProficiencies"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProficiencyOrBuilder getMemberSkillProficienciesOrBuilder(
      int index);

  /**
   * <pre>
   * ID of the original Program Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ProgramNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4556
   * @return Whether the originSid field is set.
   */
  @java.lang.Deprecated boolean hasOriginSid();
  /**
   * <pre>
   * ID of the original Program Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ProgramNode.origin_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4556
   * @return The originSid.
   */
  @java.lang.Deprecated com.google.protobuf.Int64Value getOriginSid();
  /**
   * <pre>
   * ID of the original Program Node that this node was copied from.
   * If this node is the original, field will be set as nil.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value origin_sid = 16 [json_name = "originSid", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.Int64ValueOrBuilder getOriginSidOrBuilder();

  /**
   * <pre>
   * The predicted calls of this skill profile category will be used when scheduling.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 17 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * The predicted calls of this skill profile category will be used when scheduling.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 17 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * The predicted calls of this skill profile category will be used when scheduling.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 17 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}
