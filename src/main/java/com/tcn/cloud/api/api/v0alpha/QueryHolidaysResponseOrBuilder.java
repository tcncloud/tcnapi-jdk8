// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface QueryHolidaysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.QueryHolidaysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.Row rows = 1 [json_name = "rows"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Row> 
      getRowsList();
  /**
   * <code>repeated .api.v0alpha.Row rows = 1 [json_name = "rows"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Row getRows(int index);
  /**
   * <code>repeated .api.v0alpha.Row rows = 1 [json_name = "rows"];</code>
   */
  int getRowsCount();
  /**
   * <code>repeated .api.v0alpha.Row rows = 1 [json_name = "rows"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.RowOrBuilder> 
      getRowsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Row rows = 1 [json_name = "rows"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RowOrBuilder getRowsOrBuilder(
      int index);
}
