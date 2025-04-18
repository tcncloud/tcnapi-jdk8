// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface PipelineOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.Pipeline)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.Node> 
      getNodesList();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.Node nodes = 1 [json_name = "nodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.Node getNodes(int index);
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.Node nodes = 1 [json_name = "nodes"];</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.Node nodes = 1 [json_name = "nodes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.NodeOrBuilder> 
      getNodesOrBuilderList();
  /**
   * <pre>
   * Pipeline nodes
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.Node nodes = 1 [json_name = "nodes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.NodeOrBuilder getNodesOrBuilder(
      int index);

  /**
   * <pre>
   * Format query returns a query to format the data in post processing
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FormatQuery format_query = 2 [json_name = "formatQuery"];</code>
   * @return Whether the formatQuery field is set.
   */
  boolean hasFormatQuery();
  /**
   * <pre>
   * Format query returns a query to format the data in post processing
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FormatQuery format_query = 2 [json_name = "formatQuery"];</code>
   * @return The formatQuery.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.FormatQuery getFormatQuery();
  /**
   * <pre>
   * Format query returns a query to format the data in post processing
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FormatQuery format_query = 2 [json_name = "formatQuery"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.FormatQueryOrBuilder getFormatQueryOrBuilder();
}
