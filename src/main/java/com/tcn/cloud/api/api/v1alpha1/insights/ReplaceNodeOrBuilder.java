// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface ReplaceNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ReplaceNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> 
      getColumnReplacementsList();
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement getColumnReplacements(int index);
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  int getColumnReplacementsCount();
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder> 
      getColumnReplacementsOrBuilderList();
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder getColumnReplacementsOrBuilder(
      int index);

  /**
   * <pre>
   * Is complex
   * </pre>
   *
   * <code>bool is_complex = 2 [json_name = "isComplex"];</code>
   * @return The isComplex.
   */
  boolean getIsComplex();
}
