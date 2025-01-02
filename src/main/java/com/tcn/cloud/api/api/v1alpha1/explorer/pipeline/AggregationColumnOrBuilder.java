// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer.pipeline;

public interface AggregationColumnOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.pipeline.AggregationColumn)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * which columns to group by
   * </pre>
   *
   * <code>repeated string group_by_columns = 2 [json_name = "groupByColumns"];</code>
   * @return A list containing the groupByColumns.
   */
  java.util.List<java.lang.String>
      getGroupByColumnsList();
  /**
   * <pre>
   * which columns to group by
   * </pre>
   *
   * <code>repeated string group_by_columns = 2 [json_name = "groupByColumns"];</code>
   * @return The count of groupByColumns.
   */
  int getGroupByColumnsCount();
  /**
   * <pre>
   * which columns to group by
   * </pre>
   *
   * <code>repeated string group_by_columns = 2 [json_name = "groupByColumns"];</code>
   * @param index The index of the element to return.
   * @return The groupByColumns at the given index.
   */
  java.lang.String getGroupByColumns(int index);
  /**
   * <pre>
   * which columns to group by
   * </pre>
   *
   * <code>repeated string group_by_columns = 2 [json_name = "groupByColumns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the groupByColumns at the given index.
   */
  com.google.protobuf.ByteString
      getGroupByColumnsBytes(int index);

  /**
   * <pre>
   * which column to aggregate
   * </pre>
   *
   * <code>string column_to_aggregate = 3 [json_name = "columnToAggregate"];</code>
   * @return The columnToAggregate.
   */
  java.lang.String getColumnToAggregate();
  /**
   * <pre>
   * which column to aggregate
   * </pre>
   *
   * <code>string column_to_aggregate = 3 [json_name = "columnToAggregate"];</code>
   * @return The bytes for columnToAggregate.
   */
  com.google.protobuf.ByteString
      getColumnToAggregateBytes();

  /**
   * <pre>
   * the aggregation function to apply
   * </pre>
   *
   * <code>string aggregation_function = 4 [json_name = "aggregationFunction"];</code>
   * @return The aggregationFunction.
   */
  java.lang.String getAggregationFunction();
  /**
   * <pre>
   * the aggregation function to apply
   * </pre>
   *
   * <code>string aggregation_function = 4 [json_name = "aggregationFunction"];</code>
   * @return The bytes for aggregationFunction.
   */
  com.google.protobuf.ByteString
      getAggregationFunctionBytes();
}
