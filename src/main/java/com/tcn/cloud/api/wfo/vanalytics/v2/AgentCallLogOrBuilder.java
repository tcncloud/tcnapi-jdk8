// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/agent_call_log.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface AgentCallLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.AgentCallLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * actions are the agent call log actions.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.AgentCallLog.Action actions = 1 [json_name = "actions"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLog.Action> 
      getActionsList();
  /**
   * <pre>
   * actions are the agent call log actions.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.AgentCallLog.Action actions = 1 [json_name = "actions"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLog.Action getActions(int index);
  /**
   * <pre>
   * actions are the agent call log actions.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.AgentCallLog.Action actions = 1 [json_name = "actions"];</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * actions are the agent call log actions.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.AgentCallLog.Action actions = 1 [json_name = "actions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLog.ActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * actions are the agent call log actions.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.AgentCallLog.Action actions = 1 [json_name = "actions"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.AgentCallLog.ActionOrBuilder getActionsOrBuilder(
      int index);
}
