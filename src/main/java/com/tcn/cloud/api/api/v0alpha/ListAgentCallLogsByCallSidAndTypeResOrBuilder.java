// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListAgentCallLogsByCallSidAndTypeResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListAgentCallLogsByCallSidAndTypeRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.AgentCallLog> 
      getAgentCallLogsList();
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentCallLog getAgentCallLogs(int index);
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  int getAgentCallLogsCount();
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder> 
      getAgentCallLogsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.AgentCallLog agent_call_logs = 1 [json_name = "agentCallLogs"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AgentCallLogOrBuilder getAgentCallLogsOrBuilder(
      int index);
}
