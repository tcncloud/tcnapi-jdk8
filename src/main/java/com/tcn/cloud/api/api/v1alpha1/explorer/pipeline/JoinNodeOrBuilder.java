// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer.pipeline;

public interface JoinNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.pipeline.JoinNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of join
   * </pre>
   *
   * <code>string side = 1 [json_name = "side"];</code>
   * @return The side.
   */
  java.lang.String getSide();
  /**
   * <pre>
   * The type of join
   * </pre>
   *
   * <code>string side = 1 [json_name = "side"];</code>
   * @return The bytes for side.
   */
  com.google.protobuf.ByteString
      getSideBytes();

  /**
   * <pre>
   * The join columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.JoinColumn join_columns = 2 [json_name = "joinColumns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn> 
      getJoinColumnsList();
  /**
   * <pre>
   * The join columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.JoinColumn join_columns = 2 [json_name = "joinColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn getJoinColumns(int index);
  /**
   * <pre>
   * The join columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.JoinColumn join_columns = 2 [json_name = "joinColumns"];</code>
   */
  int getJoinColumnsCount();
  /**
   * <pre>
   * The join columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.JoinColumn join_columns = 2 [json_name = "joinColumns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumnOrBuilder> 
      getJoinColumnsOrBuilderList();
  /**
   * <pre>
   * The join columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.JoinColumn join_columns = 2 [json_name = "joinColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumnOrBuilder getJoinColumnsOrBuilder(
      int index);

  /**
   * <pre>
   * First parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent first_parent = 3 [json_name = "firstParent"];</code>
   * @return Whether the firstParent field is set.
   */
  boolean hasFirstParent();
  /**
   * <pre>
   * First parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent first_parent = 3 [json_name = "firstParent"];</code>
   * @return The firstParent.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.Parent getFirstParent();
  /**
   * <pre>
   * First parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent first_parent = 3 [json_name = "firstParent"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ParentOrBuilder getFirstParentOrBuilder();

  /**
   * <pre>
   * Second parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent second_parent = 4 [json_name = "secondParent"];</code>
   * @return Whether the secondParent field is set.
   */
  boolean hasSecondParent();
  /**
   * <pre>
   * Second parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent second_parent = 4 [json_name = "secondParent"];</code>
   * @return The secondParent.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.Parent getSecondParent();
  /**
   * <pre>
   * Second parent
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.pipeline.Parent second_parent = 4 [json_name = "secondParent"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ParentOrBuilder getSecondParentOrBuilder();
}
