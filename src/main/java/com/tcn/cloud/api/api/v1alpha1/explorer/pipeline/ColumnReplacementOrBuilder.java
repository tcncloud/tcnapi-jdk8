// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer.pipeline;

public interface ColumnReplacementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.pipeline.ColumnReplacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Column to replace values in
   * </pre>
   *
   * <code>repeated string column_names = 1 [json_name = "columnNames"];</code>
   * @return A list containing the columnNames.
   */
  java.util.List<java.lang.String>
      getColumnNamesList();
  /**
   * <pre>
   * Column to replace values in
   * </pre>
   *
   * <code>repeated string column_names = 1 [json_name = "columnNames"];</code>
   * @return The count of columnNames.
   */
  int getColumnNamesCount();
  /**
   * <pre>
   * Column to replace values in
   * </pre>
   *
   * <code>repeated string column_names = 1 [json_name = "columnNames"];</code>
   * @param index The index of the element to return.
   * @return The columnNames at the given index.
   */
  java.lang.String getColumnNames(int index);
  /**
   * <pre>
   * Column to replace values in
   * </pre>
   *
   * <code>repeated string column_names = 1 [json_name = "columnNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the columnNames at the given index.
   */
  com.google.protobuf.ByteString
      getColumnNamesBytes(int index);

  /**
   * <pre>
   * Values to replace
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.ValuesReplacement values_replacements = 2 [json_name = "valuesReplacements"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ValuesReplacement> 
      getValuesReplacementsList();
  /**
   * <pre>
   * Values to replace
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.ValuesReplacement values_replacements = 2 [json_name = "valuesReplacements"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ValuesReplacement getValuesReplacements(int index);
  /**
   * <pre>
   * Values to replace
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.ValuesReplacement values_replacements = 2 [json_name = "valuesReplacements"];</code>
   */
  int getValuesReplacementsCount();
  /**
   * <pre>
   * Values to replace
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.ValuesReplacement values_replacements = 2 [json_name = "valuesReplacements"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ValuesReplacementOrBuilder> 
      getValuesReplacementsOrBuilderList();
  /**
   * <pre>
   * Values to replace
   * </pre>
   *
   * <code>repeated .api.v1alpha1.explorer.pipeline.ValuesReplacement values_replacements = 2 [json_name = "valuesReplacements"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.ValuesReplacementOrBuilder getValuesReplacementsOrBuilder(
      int index);
}
