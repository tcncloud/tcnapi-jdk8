// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateUnassignedWFMAgentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   * @return Whether the wfmAgentSidToCopyAgentGroupAssociations field is set.
   */
  boolean hasWfmAgentSidToCopyAgentGroupAssociations();
  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   * @return The wfmAgentSidToCopyAgentGroupAssociations.
   */
  com.google.protobuf.Int64Value getWfmAgentSidToCopyAgentGroupAssociations();
  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getWfmAgentSidToCopyAgentGroupAssociationsOrBuilder();

  /**
   * <pre>
   * Optional: name to give the agent, it will always have the following random string postfixed to it:
   * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
   * If left blank, the name will have 'Unassigned Agent' as its prefix.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional: name to give the agent, it will always have the following random string postfixed to it:
   * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
   * If left blank, the name will have 'Unassigned Agent' as its prefix.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
