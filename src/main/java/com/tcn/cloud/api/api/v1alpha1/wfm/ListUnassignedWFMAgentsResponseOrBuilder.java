// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListUnassignedWFMAgentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListUnassignedWFMAgentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent> 
      getWfmAgentsList();
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgent getWfmAgents(int index);
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  int getWfmAgentsCount();
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder> 
      getWfmAgentsOrBuilderList();
  /**
   * <pre>
   * List of found wfm agents.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.WFMAgent wfm_agents = 1 [json_name = "wfmAgents"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.WFMAgentOrBuilder getWfmAgentsOrBuilder(
      int index);
}
