// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ManualDialStartReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ManualDialStartReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.SimpleCallData simple_call_data = 1 [json_name = "simpleCallData"];</code>
   * @return Whether the simpleCallData field is set.
   */
  boolean hasSimpleCallData();
  /**
   * <code>.api.commons.SimpleCallData simple_call_data = 1 [json_name = "simpleCallData"];</code>
   * @return The simpleCallData.
   */
  com.tcn.cloud.api.api.commons.SimpleCallData getSimpleCallData();
  /**
   * <code>.api.commons.SimpleCallData simple_call_data = 1 [json_name = "simpleCallData"];</code>
   */
  com.tcn.cloud.api.api.commons.SimpleCallDataOrBuilder getSimpleCallDataOrBuilder();

  /**
   * <code>int64 hunt_group_sid = 6 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <code>int64 agent_session_sid = 7 [json_name = "agentSessionSid"];</code>
   * @return The agentSessionSid.
   */
  long getAgentSessionSid();
}
