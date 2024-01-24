// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface AgentTriggerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.AgentTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sid of the agent trigger
   * </pre>
   *
   * <code>int64 agent_trigger_sid = 1 [json_name = "agentTriggerSid"];</code>
   * @return The agentTriggerSid.
   */
  long getAgentTriggerSid();

  /**
   * <pre>
   * The description of the agent trigger
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the agent trigger
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The agent status option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.AgentStatusOption agent_status_option = 3 [json_name = "agentStatusOption"];</code>
   * @return Whether the agentStatusOption field is set.
   */
  boolean hasAgentStatusOption();
  /**
   * <pre>
   * The agent status option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.AgentStatusOption agent_status_option = 3 [json_name = "agentStatusOption"];</code>
   * @return The agentStatusOption.
   */
  com.tcn.cloud.api.api.commons.org.AgentStatusOption getAgentStatusOption();
  /**
   * <pre>
   * The agent status option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.AgentStatusOption agent_status_option = 3 [json_name = "agentStatusOption"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AgentStatusOptionOrBuilder getAgentStatusOptionOrBuilder();

  /**
   * <pre>
   * The action option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.TriggerActionOption trigger_action_option = 4 [json_name = "triggerActionOption"];</code>
   * @return Whether the triggerActionOption field is set.
   */
  boolean hasTriggerActionOption();
  /**
   * <pre>
   * The action option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.TriggerActionOption trigger_action_option = 4 [json_name = "triggerActionOption"];</code>
   * @return The triggerActionOption.
   */
  com.tcn.cloud.api.api.commons.org.TriggerActionOption getTriggerActionOption();
  /**
   * <pre>
   * The action option to use for the trigger
   * </pre>
   *
   * <code>.api.commons.org.TriggerActionOption trigger_action_option = 4 [json_name = "triggerActionOption"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TriggerActionOptionOrBuilder getTriggerActionOptionOrBuilder();
}