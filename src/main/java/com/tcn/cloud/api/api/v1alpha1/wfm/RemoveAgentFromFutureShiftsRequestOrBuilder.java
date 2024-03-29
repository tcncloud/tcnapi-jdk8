// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface RemoveAgentFromFutureShiftsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.RemoveAgentFromFutureShiftsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the wfm agent sid to remove from the future schedules.
   * </pre>
   *
   * <code>int64 wfm_agent_sid_to_remove = 1 [json_name = "wfmAgentSidToRemove"];</code>
   * @return The wfmAgentSidToRemove.
   */
  long getWfmAgentSidToRemove();

  /**
   * <pre>
   * If set to true, a new unassigned agent will be created and it will be assigned to the shifts and agent groups from &#64;wfm_agent_sid_to_remove.
   * If set to false, the shifts will just be deleted.
   * </pre>
   *
   * <code>bool replace_with_new_unassigned_agent = 2 [json_name = "replaceWithNewUnassignedAgent"];</code>
   * @return The replaceWithNewUnassignedAgent.
   */
  boolean getReplaceWithNewUnassignedAgent();
}
