// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListAdherenceAgentStatesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListAdherenceAgentStatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The found agent states, grouped by wfm_agent_sid and ordered in ascending order by start_datetime.
   * Key: &#64;wfm_agent_sid - Value: List of agent states that the agent has.
   * </pre>
   *
   * <code>map&lt;int64, .api.commons.AdherenceAgentStates&gt; agent_states = 1 [json_name = "agentStates"];</code>
   */
  int getAgentStatesCount();
  /**
   * <pre>
   * The found agent states, grouped by wfm_agent_sid and ordered in ascending order by start_datetime.
   * Key: &#64;wfm_agent_sid - Value: List of agent states that the agent has.
   * </pre>
   *
   * <code>map&lt;int64, .api.commons.AdherenceAgentStates&gt; agent_states = 1 [json_name = "agentStates"];</code>
   */
  boolean containsAgentStates(
      long key);
  /**
   * Use {@link #getAgentStatesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.tcn.cloud.api.api.commons.AdherenceAgentStates>
  getAgentStates();
  /**
   * <pre>
   * The found agent states, grouped by wfm_agent_sid and ordered in ascending order by start_datetime.
   * Key: &#64;wfm_agent_sid - Value: List of agent states that the agent has.
   * </pre>
   *
   * <code>map&lt;int64, .api.commons.AdherenceAgentStates&gt; agent_states = 1 [json_name = "agentStates"];</code>
   */
  java.util.Map<java.lang.Long, com.tcn.cloud.api.api.commons.AdherenceAgentStates>
  getAgentStatesMap();
  /**
   * <pre>
   * The found agent states, grouped by wfm_agent_sid and ordered in ascending order by start_datetime.
   * Key: &#64;wfm_agent_sid - Value: List of agent states that the agent has.
   * </pre>
   *
   * <code>map&lt;int64, .api.commons.AdherenceAgentStates&gt; agent_states = 1 [json_name = "agentStates"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.commons.AdherenceAgentStates getAgentStatesOrDefault(
      long key,
      /* nullable */
com.tcn.cloud.api.api.commons.AdherenceAgentStates defaultValue);
  /**
   * <pre>
   * The found agent states, grouped by wfm_agent_sid and ordered in ascending order by start_datetime.
   * Key: &#64;wfm_agent_sid - Value: List of agent states that the agent has.
   * </pre>
   *
   * <code>map&lt;int64, .api.commons.AdherenceAgentStates&gt; agent_states = 1 [json_name = "agentStates"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceAgentStates getAgentStatesOrThrow(
      long key);
}
