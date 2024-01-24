// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface AgentStatusOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.AgentStatusOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The status of the agent on which the trigger is based
   * </pre>
   *
   * <code>.api.commons.org.AgentStatus agent_status = 1 [json_name = "agentStatus"];</code>
   * @return The enum numeric value on the wire for agentStatus.
   */
  int getAgentStatusValue();
  /**
   * <pre>
   * The status of the agent on which the trigger is based
   * </pre>
   *
   * <code>.api.commons.org.AgentStatus agent_status = 1 [json_name = "agentStatus"];</code>
   * @return The agentStatus.
   */
  com.tcn.cloud.api.api.commons.org.AgentStatus getAgentStatus();

  /**
   * <pre>
   * The duration of the trigger (in seconds)
   * Used for agent status: all but Logged In
   * </pre>
   *
   * <code>int64 duration = 2 [json_name = "duration"];</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <pre>
   * The pause code to use for the trigger
   * Use pause code only if either system_pause_code or custom_pause_code is set
   * Used for agent status: Paused
   * </pre>
   *
   * <code>.api.commons.org.TriggerPauseCode pause_code = 3 [json_name = "pauseCode"];</code>
   * @return Whether the pauseCode field is set.
   */
  boolean hasPauseCode();
  /**
   * <pre>
   * The pause code to use for the trigger
   * Use pause code only if either system_pause_code or custom_pause_code is set
   * Used for agent status: Paused
   * </pre>
   *
   * <code>.api.commons.org.TriggerPauseCode pause_code = 3 [json_name = "pauseCode"];</code>
   * @return The pauseCode.
   */
  com.tcn.cloud.api.api.commons.org.TriggerPauseCode getPauseCode();
  /**
   * <pre>
   * The pause code to use for the trigger
   * Use pause code only if either system_pause_code or custom_pause_code is set
   * Used for agent status: Paused
   * </pre>
   *
   * <code>.api.commons.org.TriggerPauseCode pause_code = 3 [json_name = "pauseCode"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TriggerPauseCodeOrBuilder getPauseCodeOrBuilder();

  /**
   * <pre>
   * The call types to use for the trigger
   * Used for agent status: On Call, Wrap Up
   * </pre>
   *
   * <code>.api.commons.org.TriggerCallTypes call_types = 4 [json_name = "callTypes"];</code>
   * @return Whether the callTypes field is set.
   */
  boolean hasCallTypes();
  /**
   * <pre>
   * The call types to use for the trigger
   * Used for agent status: On Call, Wrap Up
   * </pre>
   *
   * <code>.api.commons.org.TriggerCallTypes call_types = 4 [json_name = "callTypes"];</code>
   * @return The callTypes.
   */
  com.tcn.cloud.api.api.commons.org.TriggerCallTypes getCallTypes();
  /**
   * <pre>
   * The call types to use for the trigger
   * Used for agent status: On Call, Wrap Up
   * </pre>
   *
   * <code>.api.commons.org.TriggerCallTypes call_types = 4 [json_name = "callTypes"];</code>
   */
  com.tcn.cloud.api.api.commons.org.TriggerCallTypesOrBuilder getCallTypesOrBuilder();

  /**
   * <pre>
   * Whether to use the scheduled callback for the trigger
   * Used for agent status: Manual Dial Call
   * </pre>
   *
   * <code>bool scheduled_callback_present = 5 [json_name = "scheduledCallbackPresent"];</code>
   * @return The scheduledCallbackPresent.
   */
  boolean getScheduledCallbackPresent();
}