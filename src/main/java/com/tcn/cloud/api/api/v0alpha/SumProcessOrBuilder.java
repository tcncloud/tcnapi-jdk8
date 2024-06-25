// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SumProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SumProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * field to sum
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <pre>
   * field to sum
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <pre>
   * new_name for the summed field
   * </pre>
   *
   * <code>string new_name = 2 [json_name = "newName"];</code>
   * @return The newName.
   */
  java.lang.String getNewName();
  /**
   * <pre>
   * new_name for the summed field
   * </pre>
   *
   * <code>string new_name = 2 [json_name = "newName"];</code>
   * @return The bytes for newName.
   */
  com.google.protobuf.ByteString
      getNewNameBytes();

  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   * @return Whether the groupBy field is set.
   */
  boolean hasGroupBy();
  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   * @return The groupBy.
   */
  com.tcn.cloud.api.api.v0alpha.GroupBy getGroupBy();
  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder getGroupByOrBuilder();

  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.tcn.cloud.api.api.v0alpha.FilterOperation getFilter();
  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder getFilterOrBuilder();
}