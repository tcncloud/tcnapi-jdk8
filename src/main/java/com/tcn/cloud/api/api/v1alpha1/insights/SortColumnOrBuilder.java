// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

@java.lang.Deprecated public interface SortColumnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.SortColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Column name to sort
   * </pre>
   *
   * <code>string column_name = 1 [json_name = "columnName"];</code>
   * @return The columnName.
   */
  java.lang.String getColumnName();
  /**
   * <pre>
   * Column name to sort
   * </pre>
   *
   * <code>string column_name = 1 [json_name = "columnName"];</code>
   * @return The bytes for columnName.
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();

  /**
   * <pre>
   * Will determine sort direction
   * </pre>
   *
   * <code>bool ascending = 2 [json_name = "ascending"];</code>
   * @return The ascending.
   */
  boolean getAscending();
}
