// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/agent_profile_group.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface UpdateAgentProfileGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.UpdateAgentProfileGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agent response group to update
   * </pre>
   *
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 1 [json_name = "agentProfileGroup"];</code>
   * @return Whether the agentProfileGroup field is set.
   */
  boolean hasAgentProfileGroup();
  /**
   * <pre>
   * Agent response group to update
   * </pre>
   *
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 1 [json_name = "agentProfileGroup"];</code>
   * @return The agentProfileGroup.
   */
  com.tcn.cloud.api.api.commons.org.AgentProfileGroup getAgentProfileGroup();
  /**
   * <pre>
   * Agent response group to update
   * </pre>
   *
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 1 [json_name = "agentProfileGroup"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder getAgentProfileGroupOrBuilder();
}
