// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface PipelineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.Pipeline)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.Node> 
      getNodesList();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Node nodes = 1 [json_name = "nodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.Node getNodes(int index);
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Node nodes = 1 [json_name = "nodes"];</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.Node nodes = 1 [json_name = "nodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.NodeOrBuilder getNodesOrBuilder(
      int index);
}
