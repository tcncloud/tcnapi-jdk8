// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SpeedometerChartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SpeedometerChart)
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
   * <code>.api.v0alpha.Threshold warning_threshold = 3 [json_name = "warningThreshold"];</code>
   * @return Whether the warningThreshold field is set.
   */
  boolean hasWarningThreshold();
  /**
   * <code>.api.v0alpha.Threshold warning_threshold = 3 [json_name = "warningThreshold"];</code>
   * @return The warningThreshold.
   */
  com.tcn.cloud.api.api.v0alpha.Threshold getWarningThreshold();
  /**
   * <code>.api.v0alpha.Threshold warning_threshold = 3 [json_name = "warningThreshold"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder getWarningThresholdOrBuilder();

  /**
   * <code>.api.v0alpha.Threshold danger_threshold = 4 [json_name = "dangerThreshold"];</code>
   * @return Whether the dangerThreshold field is set.
   */
  boolean hasDangerThreshold();
  /**
   * <code>.api.v0alpha.Threshold danger_threshold = 4 [json_name = "dangerThreshold"];</code>
   * @return The dangerThreshold.
   */
  com.tcn.cloud.api.api.v0alpha.Threshold getDangerThreshold();
  /**
   * <code>.api.v0alpha.Threshold danger_threshold = 4 [json_name = "dangerThreshold"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder getDangerThresholdOrBuilder();

  /**
   * <code>.api.v0alpha.Threshold max_threshold = 5 [json_name = "maxThreshold"];</code>
   * @return Whether the maxThreshold field is set.
   */
  boolean hasMaxThreshold();
  /**
   * <code>.api.v0alpha.Threshold max_threshold = 5 [json_name = "maxThreshold"];</code>
   * @return The maxThreshold.
   */
  com.tcn.cloud.api.api.v0alpha.Threshold getMaxThreshold();
  /**
   * <code>.api.v0alpha.Threshold max_threshold = 5 [json_name = "maxThreshold"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ThresholdOrBuilder getMaxThresholdOrBuilder();

  /**
   * <code>string suffix_label = 6 [json_name = "suffixLabel"];</code>
   * @return The suffixLabel.
   */
  java.lang.String getSuffixLabel();
  /**
   * <code>string suffix_label = 6 [json_name = "suffixLabel"];</code>
   * @return The bytes for suffixLabel.
   */
  com.google.protobuf.ByteString
      getSuffixLabelBytes();
}
