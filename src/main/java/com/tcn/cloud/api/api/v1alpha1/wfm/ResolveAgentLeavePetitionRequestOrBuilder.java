// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ResolveAgentLeavePetitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ResolveAgentLeavePetitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the agent leave petition to approve or deny.
   * </pre>
   *
   * <code>int64 agent_leave_petition_id = 1 [json_name = "agentLeavePetitionId"];</code>
   * @return The agentLeavePetitionId.
   */
  long getAgentLeavePetitionId();

  /**
   * <pre>
   * The status to resolve the petition to.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
   * @return The enum numeric value on the wire for petitionStatus.
   */
  int getPetitionStatusValue();
  /**
   * <pre>
   * The status to resolve the petition to.
   * </pre>
   *
   * <code>.api.commons.AgentLeavePetitionStatus petition_status = 2 [json_name = "petitionStatus"];</code>
   * @return The petitionStatus.
   */
  com.tcn.cloud.api.api.commons.AgentLeavePetitionStatus getPetitionStatus();

  /**
   * <pre>
   * An optional comment to explain the approval or denial of the leave petition.
   * </pre>
   *
   * <code>string response_comment = 3 [json_name = "responseComment"];</code>
   * @return The responseComment.
   */
  java.lang.String getResponseComment();
  /**
   * <pre>
   * An optional comment to explain the approval or denial of the leave petition.
   * </pre>
   *
   * <code>string response_comment = 3 [json_name = "responseComment"];</code>
   * @return The bytes for responseComment.
   */
  com.google.protobuf.ByteString
      getResponseCommentBytes();

  /**
   * <pre>
   * If true, partial shifts overlapping the requested_datetime_ranges will have the remaining portion of the shift retained.
   * If false, the entirety of shifts overlapping the requested_datetime_ranges will be deleted.
   * </pre>
   *
   * <code>bool retain_partial_shifts = 4 [json_name = "retainPartialShifts"];</code>
   * @return The retainPartialShifts.
   */
  boolean getRetainPartialShifts();
}
