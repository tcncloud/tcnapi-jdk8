// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface AgentSessionEventReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.AgentSessionEventReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 agent_session_sid = 3 [json_name = "agentSessionSid"];</code>
   * @return The agentSessionSid.
   */
  long getAgentSessionSid();

  /**
   * <code>.api.commons.AgentSessionLogActionKey.Enum action_key = 10 [json_name = "actionKey"];</code>
   * @return The enum numeric value on the wire for actionKey.
   */
  int getActionKeyValue();
  /**
   * <code>.api.commons.AgentSessionLogActionKey.Enum action_key = 10 [json_name = "actionKey"];</code>
   * @return The actionKey.
   */
  com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.Enum getActionKey();

  /**
   * <code>string action_value = 11 [json_name = "actionValue"];</code>
   * @return The actionValue.
   */
  java.lang.String getActionValue();
  /**
   * <code>string action_value = 11 [json_name = "actionValue"];</code>
   * @return The bytes for actionValue.
   */
  com.google.protobuf.ByteString
      getActionValueBytes();
}
