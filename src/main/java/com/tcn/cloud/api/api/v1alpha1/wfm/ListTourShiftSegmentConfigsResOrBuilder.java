// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListTourShiftSegmentConfigsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListTourShiftSegmentConfigsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requested Tour Shift Segment Configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig tour_shift_segment_configs = 1 [json_name = "tourShiftSegmentConfigs"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.TourShiftSegmentConfig> 
      getTourShiftSegmentConfigsList();
  /**
   * <pre>
   * Requested Tour Shift Segment Configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig tour_shift_segment_configs = 1 [json_name = "tourShiftSegmentConfigs"];</code>
   */
  com.tcn.cloud.api.api.commons.TourShiftSegmentConfig getTourShiftSegmentConfigs(int index);
  /**
   * <pre>
   * Requested Tour Shift Segment Configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig tour_shift_segment_configs = 1 [json_name = "tourShiftSegmentConfigs"];</code>
   */
  int getTourShiftSegmentConfigsCount();
  /**
   * <pre>
   * Requested Tour Shift Segment Configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig tour_shift_segment_configs = 1 [json_name = "tourShiftSegmentConfigs"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.TourShiftSegmentConfigOrBuilder> 
      getTourShiftSegmentConfigsOrBuilderList();
  /**
   * <pre>
   * Requested Tour Shift Segment Configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftSegmentConfig tour_shift_segment_configs = 1 [json_name = "tourShiftSegmentConfigs"];</code>
   */
  com.tcn.cloud.api.api.commons.TourShiftSegmentConfigOrBuilder getTourShiftSegmentConfigsOrBuilder(
      int index);
}
