// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SingleValueChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SingleValueChart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data_point_id = 1 [json_name = "dataPointId"];</code>
   * @return The dataPointId.
   */
  java.lang.String getDataPointId();
  /**
   * <code>string data_point_id = 1 [json_name = "dataPointId"];</code>
   * @return The bytes for dataPointId.
   */
  com.google.protobuf.ByteString
      getDataPointIdBytes();

  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 2 [json_name = "label"];</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>.api.commons.SuffixChoices suffix = 3 [json_name = "suffix"];</code>
   * @return The enum numeric value on the wire for suffix.
   */
  int getSuffixValue();
  /**
   * <code>.api.commons.SuffixChoices suffix = 3 [json_name = "suffix"];</code>
   * @return The suffix.
   */
  com.tcn.cloud.api.api.commons.SuffixChoices getSuffix();

  /**
   * <code>bool show_label = 4 [json_name = "showLabel"];</code>
   * @return The showLabel.
   */
  boolean getShowLabel();
}
