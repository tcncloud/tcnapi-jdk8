// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface AdherenceAgentStateViolationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AdherenceAgentStateViolation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * WFM agent sid that the state belongs to.
   * </pre>
   *
   * <code>int64 wfm_agent_sid = 1 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  long getWfmAgentSid();

  /**
   * <pre>
   * The datetime that the violation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * The datetime that the violation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * The datetime that the violation starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * The expected adherence states that the agent should be at at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState expected_rtm_states = 3 [json_name = "expectedRtmStates"];</code>
   * @return A list containing the expectedRtmStates.
   */
  java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getExpectedRtmStatesList();
  /**
   * <pre>
   * The expected adherence states that the agent should be at at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState expected_rtm_states = 3 [json_name = "expectedRtmStates"];</code>
   * @return The count of expectedRtmStates.
   */
  int getExpectedRtmStatesCount();
  /**
   * <pre>
   * The expected adherence states that the agent should be at at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState expected_rtm_states = 3 [json_name = "expectedRtmStates"];</code>
   * @param index The index of the element to return.
   * @return The expectedRtmStates at the given index.
   */
  com.tcn.cloud.api.api.commons.RealTimeManagementState getExpectedRtmStates(int index);
  /**
   * <pre>
   * The expected adherence states that the agent should be at at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState expected_rtm_states = 3 [json_name = "expectedRtmStates"];</code>
   * @return A list containing the enum numeric values on the wire for expectedRtmStates.
   */
  java.util.List<java.lang.Integer>
  getExpectedRtmStatesValueList();
  /**
   * <pre>
   * The expected adherence states that the agent should be at at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState expected_rtm_states = 3 [json_name = "expectedRtmStates"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of expectedRtmStates at the given index.
   */
  int getExpectedRtmStatesValue(int index);

  /**
   * <pre>
   * Expected pause Code that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>string expected_pause_code = 4 [json_name = "expectedPauseCode", deprecated = true];</code>
   * @deprecated api.commons.AdherenceAgentStateViolation.expected_pause_code is deprecated.
   *     See api/commons/wfm.proto;l=875
   * @return The expectedPauseCode.
   */
  @java.lang.Deprecated java.lang.String getExpectedPauseCode();
  /**
   * <pre>
   * Expected pause Code that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>string expected_pause_code = 4 [json_name = "expectedPauseCode", deprecated = true];</code>
   * @deprecated api.commons.AdherenceAgentStateViolation.expected_pause_code is deprecated.
   *     See api/commons/wfm.proto;l=875
   * @return The bytes for expectedPauseCode.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getExpectedPauseCodeBytes();

  /**
   * <pre>
   * The actual adherence states that the agent is at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState actual_rtm_states = 5 [json_name = "actualRtmStates"];</code>
   * @return A list containing the actualRtmStates.
   */
  java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getActualRtmStatesList();
  /**
   * <pre>
   * The actual adherence states that the agent is at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState actual_rtm_states = 5 [json_name = "actualRtmStates"];</code>
   * @return The count of actualRtmStates.
   */
  int getActualRtmStatesCount();
  /**
   * <pre>
   * The actual adherence states that the agent is at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState actual_rtm_states = 5 [json_name = "actualRtmStates"];</code>
   * @param index The index of the element to return.
   * @return The actualRtmStates at the given index.
   */
  com.tcn.cloud.api.api.commons.RealTimeManagementState getActualRtmStates(int index);
  /**
   * <pre>
   * The actual adherence states that the agent is at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState actual_rtm_states = 5 [json_name = "actualRtmStates"];</code>
   * @return A list containing the enum numeric values on the wire for actualRtmStates.
   */
  java.util.List<java.lang.Integer>
  getActualRtmStatesValueList();
  /**
   * <pre>
   * The actual adherence states that the agent is at this point in time.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState actual_rtm_states = 5 [json_name = "actualRtmStates"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of actualRtmStates at the given index.
   */
  int getActualRtmStatesValue(int index);

  /**
   * <pre>
   * Actual pause Code that the agent is using if they are on Pause.
   * </pre>
   *
   * <code>string actual_pause_code = 6 [json_name = "actualPauseCode"];</code>
   * @return The actualPauseCode.
   */
  java.lang.String getActualPauseCode();
  /**
   * <pre>
   * Actual pause Code that the agent is using if they are on Pause.
   * </pre>
   *
   * <code>string actual_pause_code = 6 [json_name = "actualPauseCode"];</code>
   * @return The bytes for actualPauseCode.
   */
  com.google.protobuf.ByteString
      getActualPauseCodeBytes();

  /**
   * <pre>
   * Number of seconds that this violation took.
   * </pre>
   *
   * <code>int32 violation_duration_seconds = 7 [json_name = "violationDurationSeconds"];</code>
   * @return The violationDurationSeconds.
   */
  int getViolationDurationSeconds();

  /**
   * <pre>
   * Expected pause codes that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>repeated string expected_pause_codes = 8 [json_name = "expectedPauseCodes"];</code>
   * @return A list containing the expectedPauseCodes.
   */
  java.util.List<java.lang.String>
      getExpectedPauseCodesList();
  /**
   * <pre>
   * Expected pause codes that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>repeated string expected_pause_codes = 8 [json_name = "expectedPauseCodes"];</code>
   * @return The count of expectedPauseCodes.
   */
  int getExpectedPauseCodesCount();
  /**
   * <pre>
   * Expected pause codes that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>repeated string expected_pause_codes = 8 [json_name = "expectedPauseCodes"];</code>
   * @param index The index of the element to return.
   * @return The expectedPauseCodes at the given index.
   */
  java.lang.String getExpectedPauseCodes(int index);
  /**
   * <pre>
   * Expected pause codes that the agent should be using if they were on Pause.
   * </pre>
   *
   * <code>repeated string expected_pause_codes = 8 [json_name = "expectedPauseCodes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the expectedPauseCodes at the given index.
   */
  com.google.protobuf.ByteString
      getExpectedPauseCodesBytes(int index);

  /**
   * <pre>
   * ID of the violation.
   * </pre>
   *
   * <code>int64 adherence_agent_state_violation_id = 9 [json_name = "adherenceAgentStateViolationId", jstype = JS_STRING];</code>
   * @return The adherenceAgentStateViolationId.
   */
  long getAdherenceAgentStateViolationId();
}
