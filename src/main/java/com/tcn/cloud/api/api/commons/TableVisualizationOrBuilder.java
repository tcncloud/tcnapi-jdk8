// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/insights.proto

package com.tcn.cloud.api.api.commons;

public interface TableVisualizationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.TableVisualization)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>map&lt;string, .api.commons.TableColumnConfig&gt; table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  int getTableColumnDetailsCount();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>map&lt;string, .api.commons.TableColumnConfig&gt; table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  boolean containsTableColumnDetails(
      java.lang.String key);
  /**
   * Use {@link #getTableColumnDetailsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.commons.TableColumnConfig>
  getTableColumnDetails();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>map&lt;string, .api.commons.TableColumnConfig&gt; table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.commons.TableColumnConfig>
  getTableColumnDetailsMap();
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>map&lt;string, .api.commons.TableColumnConfig&gt; table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.commons.TableColumnConfig getTableColumnDetailsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.commons.TableColumnConfig defaultValue);
  /**
   * <pre>
   * Map of table column details
   * </pre>
   *
   * <code>map&lt;string, .api.commons.TableColumnConfig&gt; table_column_details = 1 [json_name = "tableColumnDetails"];</code>
   */
  com.tcn.cloud.api.api.commons.TableColumnConfig getTableColumnDetailsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Default width for columns in the table
   * </pre>
   *
   * <code>int64 default_column_width = 2 [json_name = "defaultColumnWidth"];</code>
   * @return The defaultColumnWidth.
   */
  long getDefaultColumnWidth();
}
