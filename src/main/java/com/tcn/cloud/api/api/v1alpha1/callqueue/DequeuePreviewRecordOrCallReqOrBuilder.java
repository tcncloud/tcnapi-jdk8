// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/callqueue/service.proto

package com.tcn.cloud.api.api.v1alpha1.callqueue;

public interface DequeuePreviewRecordOrCallReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.callqueue.DequeuePreviewRecordOrCallReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 timeout_minutes = 1 [json_name = "timeoutMinutes"];</code>
   * @return The timeoutMinutes.
   */
  int getTimeoutMinutes();

  /**
   * <code>int64 agent_session_sid = 2 [json_name = "agentSessionSid"];</code>
   * @return The agentSessionSid.
   */
  long getAgentSessionSid();
}
