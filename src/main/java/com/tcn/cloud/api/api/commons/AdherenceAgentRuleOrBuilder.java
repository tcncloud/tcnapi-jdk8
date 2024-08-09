// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface AdherenceAgentRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AdherenceAgentRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of this agent rule.
   * </pre>
   *
   * <code>int64 adherence_agent_rule_id = 1 [json_name = "adherenceAgentRuleId"];</code>
   * @return The adherenceAgentRuleId.
   */
  long getAdherenceAgentRuleId();

  /**
   * <pre>
   * Name of this agent rule.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of this agent rule.
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
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, AGENT_GROUP, WFM_AGENT, SHIFT_TEMPLATE.
   * </pre>
   *
   * <code>.api.commons.ConfigEntity selected_entity = 3 [json_name = "selectedEntity"];</code>
   * @return Whether the selectedEntity field is set.
   */
  boolean hasSelectedEntity();
  /**
   * <pre>
   * Config entity that the rule applies to, supported ones are:
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, AGENT_GROUP, WFM_AGENT, SHIFT_TEMPLATE.
   * </pre>
   *
   * <code>.api.commons.ConfigEntity selected_entity = 3 [json_name = "selectedEntity"];</code>
   * @return The selectedEntity.
   */
  com.tcn.cloud.api.api.commons.ConfigEntity getSelectedEntity();
  /**
   * <pre>
   * Config entity that the rule applies to, supported ones are:
   * CALL_CENTER_NODE, CLIENT_NODE, LOCATION_NODE, PROGRAM_NODE, AGENT_GROUP, WFM_AGENT, SHIFT_TEMPLATE.
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
}
