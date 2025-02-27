// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface StringManipulationNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.StringManipulationNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * split | replace | lower | upper
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * split | replace | lower | upper
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Column to replace with
   * </pre>
   *
   * <code>string source_column_name = 2 [json_name = "sourceColumnName"];</code>
   * @return The sourceColumnName.
   */
  java.lang.String getSourceColumnName();
  /**
   * <pre>
   * Column to replace with
   * </pre>
   *
   * <code>string source_column_name = 2 [json_name = "sourceColumnName"];</code>
   * @return The bytes for sourceColumnName.
   */
  com.google.protobuf.ByteString
      getSourceColumnNameBytes();

  /**
   * <pre>
   * Target column to replace
   * </pre>
   *
   * <code>string target_column_name = 3 [json_name = "targetColumnName"];</code>
   * @return The targetColumnName.
   */
  java.lang.String getTargetColumnName();
  /**
   * <pre>
   * Target column to replace
   * </pre>
   *
   * <code>string target_column_name = 3 [json_name = "targetColumnName"];</code>
   * @return The bytes for targetColumnName.
   */
  com.google.protobuf.ByteString
      getTargetColumnNameBytes();

  /**
   * <pre>
   * Split operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationSplit string_manipulation_split = 4 [json_name = "stringManipulationSplit"];</code>
   * @return Whether the stringManipulationSplit field is set.
   */
  boolean hasStringManipulationSplit();
  /**
   * <pre>
   * Split operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationSplit string_manipulation_split = 4 [json_name = "stringManipulationSplit"];</code>
   * @return The stringManipulationSplit.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.StringManipulationSplit getStringManipulationSplit();
  /**
   * <pre>
   * Split operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationSplit string_manipulation_split = 4 [json_name = "stringManipulationSplit"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.StringManipulationSplitOrBuilder getStringManipulationSplitOrBuilder();

  /**
   * <pre>
   * Replace operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationReplace string_manipulation_replace = 5 [json_name = "stringManipulationReplace"];</code>
   * @return Whether the stringManipulationReplace field is set.
   */
  boolean hasStringManipulationReplace();
  /**
   * <pre>
   * Replace operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationReplace string_manipulation_replace = 5 [json_name = "stringManipulationReplace"];</code>
   * @return The stringManipulationReplace.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.StringManipulationReplace getStringManipulationReplace();
  /**
   * <pre>
   * Replace operation
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.StringManipulationReplace string_manipulation_replace = 5 [json_name = "stringManipulationReplace"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.StringManipulationReplaceOrBuilder getStringManipulationReplaceOrBuilder();
}
