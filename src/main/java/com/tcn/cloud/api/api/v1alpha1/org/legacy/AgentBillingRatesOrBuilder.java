// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface AgentBillingRatesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.AgentBillingRates)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double agent_toll_free_ppi = 4 [json_name = "agentTollFreePpi"];</code>
   * @return The agentTollFreePpi.
   */
  double getAgentTollFreePpi();

  /**
   * <code>double agent_softphone_ppi = 5 [json_name = "agentSoftphonePpi"];</code>
   * @return The agentSoftphonePpi.
   */
  double getAgentSoftphonePpi();

  /**
   * <code>double agent_local_ppi = 6 [json_name = "agentLocalPpi"];</code>
   * @return The agentLocalPpi.
   */
  double getAgentLocalPpi();
}
