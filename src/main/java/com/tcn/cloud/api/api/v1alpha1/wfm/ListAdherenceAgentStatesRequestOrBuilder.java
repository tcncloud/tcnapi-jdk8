// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListAdherenceAgentStatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListAdherenceAgentStatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the wfm agents to get the agent states for.
   * All IDs must be for TCN agents.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @return A list containing the wfmAgentSids.
   */
  java.util.List<java.lang.Long> getWfmAgentSidsList();
  /**
   * <pre>
   * ID of the wfm agents to get the agent states for.
   * All IDs must be for TCN agents.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @return The count of wfmAgentSids.
   */
  int getWfmAgentSidsCount();
  /**
   * <pre>
   * ID of the wfm agents to get the agent states for.
   * All IDs must be for TCN agents.
   * </pre>
   *
   * <code>repeated int64 wfm_agent_sids = 1 [json_name = "wfmAgentSids"];</code>
   * @param index The index of the element to return.
   * @return The wfmAgentSids at the given index.
   */
  long getWfmAgentSids(int index);

  /**
   * <pre>
   * The datetime to start getting agent states from.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * The datetime to start getting agent states from.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * The datetime to start getting agent states from.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 2 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();
}
