// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface BargeInFilteringOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.BargeInFiltering)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hunt group filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.HuntGroup hunt_group = 1 [json_name = "huntGroup"];</code>
   * @return Whether the huntGroup field is set.
   */
  boolean hasHuntGroup();
  /**
   * <pre>
   * Hunt group filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.HuntGroup hunt_group = 1 [json_name = "huntGroup"];</code>
   * @return The huntGroup.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BargeInFiltering.HuntGroup getHuntGroup();
  /**
   * <pre>
   * Hunt group filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.HuntGroup hunt_group = 1 [json_name = "huntGroup"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BargeInFiltering.HuntGroupOrBuilder getHuntGroupOrBuilder();

  /**
   * <pre>
   * Agent status filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.AgentStatus agent_status = 2 [json_name = "agentStatus"];</code>
   * @return Whether the agentStatus field is set.
   */
  boolean hasAgentStatus();
  /**
   * <pre>
   * Agent status filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.AgentStatus agent_status = 2 [json_name = "agentStatus"];</code>
   * @return The agentStatus.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BargeInFiltering.AgentStatus getAgentStatus();
  /**
   * <pre>
   * Agent status filtering parameters
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.BargeInFiltering.AgentStatus agent_status = 2 [json_name = "agentStatus"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.BargeInFiltering.AgentStatusOrBuilder getAgentStatusOrBuilder();
}
