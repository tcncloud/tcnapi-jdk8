// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface JsonNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.JsonNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of operation
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type of operation
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Json column to apply the operation to
   * </pre>
   *
   * <code>string json_column = 2 [json_name = "jsonColumn"];</code>
   * @return The jsonColumn.
   */
  java.lang.String getJsonColumn();
  /**
   * <pre>
   * Json column to apply the operation to
   * </pre>
   *
   * <code>string json_column = 2 [json_name = "jsonColumn"];</code>
   * @return The bytes for jsonColumn.
   */
  com.google.protobuf.ByteString
      getJsonColumnBytes();

  /**
   * <pre>
   * List of json targets
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.JsonTarget targets = 3 [json_name = "targets"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.JsonTarget> 
      getTargetsList();
  /**
   * <pre>
   * List of json targets
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.JsonTarget targets = 3 [json_name = "targets"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.JsonTarget getTargets(int index);
  /**
   * <pre>
   * List of json targets
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.JsonTarget targets = 3 [json_name = "targets"];</code>
   */
  int getTargetsCount();
  /**
   * <pre>
   * List of json targets
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.JsonTarget targets = 3 [json_name = "targets"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.JsonTargetOrBuilder> 
      getTargetsOrBuilderList();
  /**
   * <pre>
   * List of json targets
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.JsonTarget targets = 3 [json_name = "targets"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.JsonTargetOrBuilder getTargetsOrBuilder(
      int index);

  /**
   * <pre>
   * Unnest to column node
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.UnnestToColumnsNode unnest_to_columns_node = 4 [json_name = "unnestToColumnsNode"];</code>
   * @return Whether the unnestToColumnsNode field is set.
   */
  boolean hasUnnestToColumnsNode();
  /**
   * <pre>
   * Unnest to column node
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.UnnestToColumnsNode unnest_to_columns_node = 4 [json_name = "unnestToColumnsNode"];</code>
   * @return The unnestToColumnsNode.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.UnnestToColumnsNode getUnnestToColumnsNode();
  /**
   * <pre>
   * Unnest to column node
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.UnnestToColumnsNode unnest_to_columns_node = 4 [json_name = "unnestToColumnsNode"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.UnnestToColumnsNodeOrBuilder getUnnestToColumnsNodeOrBuilder();
}
