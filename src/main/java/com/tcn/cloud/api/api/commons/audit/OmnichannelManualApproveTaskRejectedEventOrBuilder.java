// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelManualApproveTaskRejectedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelManualApproveTaskRejectedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the task that sent the message
   * </pre>
   *
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * the task that sent the message
   * </pre>
   *
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   * @return The task.
   */
  com.tcn.cloud.api.api.commons.OmniTask getTask();
  /**
   * <pre>
   * the task that sent the message
   * </pre>
   *
   * <code>.api.commons.OmniTask task = 1 [json_name = "task"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniTaskOrBuilder getTaskOrBuilder();

  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * asm session sid
   * </pre>
   *
   * <code>int64 asm_session_sid = 3 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();
}
