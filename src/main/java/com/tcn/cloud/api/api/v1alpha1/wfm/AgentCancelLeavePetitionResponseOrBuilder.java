// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface AgentCancelLeavePetitionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.AgentCancelLeavePetitionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The canceled Agent Leave Petition.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetition agent_leave_petition = 1 [json_name = "agentLeavePetition"];</code>
   * @return Whether the agentLeavePetition field is set.
   */
  boolean hasAgentLeavePetition();
  /**
   * <pre>
   * The canceled Agent Leave Petition.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetition agent_leave_petition = 1 [json_name = "agentLeavePetition"];</code>
   * @return The agentLeavePetition.
   */
  com.tcn.cloud.api.api.commons.AgentLeavePetition getAgentLeavePetition();
  /**
   * <pre>
   * The canceled Agent Leave Petition.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetition agent_leave_petition = 1 [json_name = "agentLeavePetition"];</code>
   */
  com.tcn.cloud.api.api.commons.AgentLeavePetitionOrBuilder getAgentLeavePetitionOrBuilder();
}
