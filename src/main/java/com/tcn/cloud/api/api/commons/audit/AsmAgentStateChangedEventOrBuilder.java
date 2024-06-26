// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/asm_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface AsmAgentStateChangedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.AsmAgentStateChangedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * the session sid generated when the agent logged into asm
   * </pre>
   *
   * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();

  /**
   * <pre>
   * the agent's new status
   * </pre>
   *
   * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
   * @return The enum numeric value on the wire for newStatus.
   */
  int getNewStatusValue();
  /**
   * <pre>
   * the agent's new status
   * </pre>
   *
   * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
   * @return The newStatus.
   */
  com.tcn.cloud.api.api.commons.StatusState getNewStatus();

  /**
   * <pre>
   * the agent's old status
   * </pre>
   *
   * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
   * @return The enum numeric value on the wire for oldStatus.
   */
  int getOldStatusValue();
  /**
   * <pre>
   * the agent's old status
   * </pre>
   *
   * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
   * @return The oldStatus.
   */
  com.tcn.cloud.api.api.commons.StatusState getOldStatus();

  /**
   * <pre>
   * duration of old status in milliseconds
   * </pre>
   *
   * <code>int64 old_status_duration_milliseconds = 5 [json_name = "oldStatusDurationMilliseconds"];</code>
   * @return The oldStatusDurationMilliseconds.
   */
  long getOldStatusDurationMilliseconds();
}
