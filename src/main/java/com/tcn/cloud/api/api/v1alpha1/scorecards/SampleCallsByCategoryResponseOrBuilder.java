// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/category.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface SampleCallsByCategoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.SampleCallsByCategoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.scorecards.SampleAgentCall agent_calls = 1 [json_name = "agentCalls"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleAgentCall> 
      getAgentCallsList();
  /**
   * <code>repeated .api.v1alpha1.scorecards.SampleAgentCall agent_calls = 1 [json_name = "agentCalls"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.scorecards.SampleAgentCall getAgentCalls(int index);
  /**
   * <code>repeated .api.v1alpha1.scorecards.SampleAgentCall agent_calls = 1 [json_name = "agentCalls"];</code>
   */
  int getAgentCallsCount();
  /**
   * <code>repeated .api.v1alpha1.scorecards.SampleAgentCall agent_calls = 1 [json_name = "agentCalls"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.scorecards.SampleAgentCallOrBuilder> 
      getAgentCallsOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.scorecards.SampleAgentCall agent_calls = 1 [json_name = "agentCalls"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.scorecards.SampleAgentCallOrBuilder getAgentCallsOrBuilder(
      int index);
}
