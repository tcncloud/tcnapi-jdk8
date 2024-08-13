// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface AgentStateSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AgentStateSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The order that this agent state segment fits into the AgentStateSequence.
   * Sequence starts at 0.
   * </pre>
   *
   * <code>int32 order_in_rts = 1 [json_name = "orderInRts"];</code>
   * @return The orderInRts.
   */
  int getOrderInRts();

  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return A list containing the states.
   */
  java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getStatesList();
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return The count of states.
   */
  int getStatesCount();
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @param index The index of the element to return.
   * @return The states at the given index.
   */
  com.tcn.cloud.api.api.commons.RealTimeManagementState getStates(int index);
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return A list containing the enum numeric values on the wire for states.
   */
  java.util.List<java.lang.Integer>
  getStatesValueList();
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of states at the given index.
   */
  int getStatesValue(int index);

  /**
   * <pre>
   * The width of this segment in minutes.
   * </pre>
   *
   * <code>int32 width_in_minutes = 3 [json_name = "widthInMinutes", deprecated = true];</code>
   * @deprecated api.commons.AgentStateSegment.width_in_minutes is deprecated.
   *     See api/commons/wfm.proto;l=797
   * @return The widthInMinutes.
   */
  @java.lang.Deprecated int getWidthInMinutes();

  /**
   * <pre>
   * The width of this segment in seconds.
   * </pre>
   *
   * <code>int32 width_in_seconds = 4 [json_name = "widthInSeconds"];</code>
   * @return The widthInSeconds.
   */
  int getWidthInSeconds();
}
