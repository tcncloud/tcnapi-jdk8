// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface SortNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.SortNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Columns to sort
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.SortColumn sort_columns = 1 [json_name = "sortColumns"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.SortColumn> 
      getSortColumnsList();
  /**
   * <pre>
   * Columns to sort
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.SortColumn sort_columns = 1 [json_name = "sortColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.SortColumn getSortColumns(int index);
  /**
   * <pre>
   * Columns to sort
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.SortColumn sort_columns = 1 [json_name = "sortColumns"];</code>
   */
  int getSortColumnsCount();
  /**
   * <pre>
   * Columns to sort
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.SortColumn sort_columns = 1 [json_name = "sortColumns"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.SortColumnOrBuilder> 
      getSortColumnsOrBuilderList();
  /**
   * <pre>
   * Columns to sort
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.SortColumn sort_columns = 1 [json_name = "sortColumns"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.SortColumnOrBuilder getSortColumnsOrBuilder(
      int index);
}
