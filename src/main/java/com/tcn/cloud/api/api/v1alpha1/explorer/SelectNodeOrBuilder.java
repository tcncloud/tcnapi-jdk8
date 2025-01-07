// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface SelectNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.SelectNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Column names to select
   * </pre>
   *
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @return A list containing the columns.
   */
  java.util.List<java.lang.String>
      getColumnsList();
  /**
   * <pre>
   * Column names to select
   * </pre>
   *
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @return The count of columns.
   */
  int getColumnsCount();
  /**
   * <pre>
   * Column names to select
   * </pre>
   *
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @param index The index of the element to return.
   * @return The columns at the given index.
   */
  java.lang.String getColumns(int index);
  /**
   * <pre>
   * Column names to select
   * </pre>
   *
   * <code>repeated string columns = 1 [json_name = "columns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the columns at the given index.
   */
  com.google.protobuf.ByteString
      getColumnsBytes(int index);

  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 2 [json_name = "renamedColumns"];</code>
   */
  int getRenamedColumnsCount();
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 2 [json_name = "renamedColumns"];</code>
   */
  boolean containsRenamedColumns(
      java.lang.String key);
  /**
   * Use {@link #getRenamedColumnsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRenamedColumns();
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 2 [json_name = "renamedColumns"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRenamedColumnsMap();
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 2 [json_name = "renamedColumns"];</code>
   */
  /* nullable */
java.lang.String getRenamedColumnsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 2 [json_name = "renamedColumns"];</code>
   */
  java.lang.String getRenamedColumnsOrThrow(
      java.lang.String key);
}
