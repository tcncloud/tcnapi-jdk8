// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

@java.lang.Deprecated public interface AgentStateSequenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AgentStateSequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the agent that the real time state sequence relates to.
   * </pre>
   *
   * <code>int64 wfm_agent_sid = 1 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  long getWfmAgentSid();

  /**
   * <pre>
   * The datetime where the agent state sequence starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * The datetime where the agent state sequence starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * The datetime where the agent state sequence starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * The list of agent state segments that cover the length of the sequence.
   * </pre>
   *
   * <code>repeated .api.commons.AgentStateSegment state_segments = 3 [json_name = "stateSegments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.AgentStateSegment> 
      getStateSegmentsList();
  /**
   * <pre>
   * The list of agent state segments that cover the length of the sequence.
   * </pre>
   *
   * <code>repeated .api.commons.AgentStateSegment state_segments = 3 [json_name = "stateSegments"];</code>
   */
  com.tcn.cloud.api.api.commons.AgentStateSegment getStateSegments(int index);
  /**
   * <pre>
   * The list of agent state segments that cover the length of the sequence.
   * </pre>
   *
   * <code>repeated .api.commons.AgentStateSegment state_segments = 3 [json_name = "stateSegments"];</code>
   */
  int getStateSegmentsCount();
  /**
   * <pre>
   * The list of agent state segments that cover the length of the sequence.
   * </pre>
   *
   * <code>repeated .api.commons.AgentStateSegment state_segments = 3 [json_name = "stateSegments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.AgentStateSegmentOrBuilder> 
      getStateSegmentsOrBuilderList();
  /**
   * <pre>
   * The list of agent state segments that cover the length of the sequence.
   * </pre>
   *
   * <code>repeated .api.commons.AgentStateSegment state_segments = 3 [json_name = "stateSegments"];</code>
   */
  com.tcn.cloud.api.api.commons.AgentStateSegmentOrBuilder getStateSegmentsOrBuilder(
      int index);
}
