// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface AdherenceDepartmentalRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AdherenceDepartmentalRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this departmental rule.
   * </pre>
   *
   * <code>int64 adherence_departmental_rule_id = 1 [json_name = "adherenceDepartmentalRuleId"];</code>
   * @return The adherenceDepartmentalRuleId.
   */
  long getAdherenceDepartmentalRuleId();

  /**
   * <pre>
   * Name of this departmental rule.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this departmental rule.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Config entity that the rule applies to, supported ones are:
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, SHIFT_TEMPLATE, AGENT_GROUP.
   * </pre>
   *
   * <code>.api.commons.ConfigEntity selected_entity = 3 [json_name = "selectedEntity"];</code>
   * @return Whether the selectedEntity field is set.
   */
  boolean hasSelectedEntity();
  /**
   * <pre>
   * Config entity that the rule applies to, supported ones are:
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, SHIFT_TEMPLATE, AGENT_GROUP.
   * </pre>
   *
   * <code>.api.commons.ConfigEntity selected_entity = 3 [json_name = "selectedEntity"];</code>
   * @return The selectedEntity.
   */
  com.tcn.cloud.api.api.commons.ConfigEntity getSelectedEntity();
  /**
   * <pre>
   * Config entity that the rule applies to, supported ones are:
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, SHIFT_TEMPLATE, AGENT_GROUP.
   * </pre>
   *
   * <code>.api.commons.ConfigEntity selected_entity = 3 [json_name = "selectedEntity"];</code>
   */
  com.tcn.cloud.api.api.commons.ConfigEntityOrBuilder getSelectedEntityOrBuilder();

  /**
   * <pre>
   * Specifies the requirement type of this rule.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleRequirementType rule_requirement_type = 4 [json_name = "ruleRequirementType"];</code>
   * @return The enum numeric value on the wire for ruleRequirementType.
   */
  int getRuleRequirementTypeValue();
  /**
   * <pre>
   * Specifies the requirement type of this rule.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleRequirementType rule_requirement_type = 4 [json_name = "ruleRequirementType"];</code>
   * @return The ruleRequirementType.
   */
  com.tcn.cloud.api.api.commons.AdherenceRuleRequirementType getRuleRequirementType();

  /**
   * <pre>
   * ID of the notification config that this rule will use/follow.
   * </pre>
   *
   * <code>int64 adherence_rule_notification_config_id = 5 [json_name = "adherenceRuleNotificationConfigId"];</code>
   * @return The adherenceRuleNotificationConfigId.
   */
  long getAdherenceRuleNotificationConfigId();

  /**
   * <pre>
   * Range that this rule will be applied at.
   * </pre>
   *
   * <code>.api.commons.AdherenceDepartmentalRule rule_range = 6 [json_name = "ruleRange"];</code>
   * @return Whether the ruleRange field is set.
   */
  boolean hasRuleRange();
  /**
   * <pre>
   * Range that this rule will be applied at.
   * </pre>
   *
   * <code>.api.commons.AdherenceDepartmentalRule rule_range = 6 [json_name = "ruleRange"];</code>
   * @return The ruleRange.
   */
  com.tcn.cloud.api.api.commons.AdherenceDepartmentalRule getRuleRange();
  /**
   * <pre>
   * Range that this rule will be applied at.
   * </pre>
   *
   * <code>.api.commons.AdherenceDepartmentalRule rule_range = 6 [json_name = "ruleRange"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceDepartmentalRuleOrBuilder getRuleRangeOrBuilder();

  /**
   * <pre>
   * Custom date range to apply the rule, must only be set when &#64;rule_range is CUSTOM_DATE_RANGE.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange custom_range = 7 [json_name = "customRange"];</code>
   * @return Whether the customRange field is set.
   */
  boolean hasCustomRange();
  /**
   * <pre>
   * Custom date range to apply the rule, must only be set when &#64;rule_range is CUSTOM_DATE_RANGE.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange custom_range = 7 [json_name = "customRange"];</code>
   * @return The customRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getCustomRange();
  /**
   * <pre>
   * Custom date range to apply the rule, must only be set when &#64;rule_range is CUSTOM_DATE_RANGE.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange custom_range = 7 [json_name = "customRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getCustomRangeOrBuilder();
}
