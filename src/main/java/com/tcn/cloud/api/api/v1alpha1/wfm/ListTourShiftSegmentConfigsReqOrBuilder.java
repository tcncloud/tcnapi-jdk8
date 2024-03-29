// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListTourShiftSegmentConfigsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListTourShiftSegmentConfigsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of the Tour Shift Instance Configs to get the child Tour Shift Segment Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_shift_instance_config_sids = 1 [json_name = "tourShiftInstanceConfigSids", jstype = JS_STRING];</code>
   * @return A list containing the tourShiftInstanceConfigSids.
   */
  java.util.List<java.lang.Long> getTourShiftInstanceConfigSidsList();
  /**
   * <pre>
   * IDs of the Tour Shift Instance Configs to get the child Tour Shift Segment Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_shift_instance_config_sids = 1 [json_name = "tourShiftInstanceConfigSids", jstype = JS_STRING];</code>
   * @return The count of tourShiftInstanceConfigSids.
   */
  int getTourShiftInstanceConfigSidsCount();
  /**
   * <pre>
   * IDs of the Tour Shift Instance Configs to get the child Tour Shift Segment Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_shift_instance_config_sids = 1 [json_name = "tourShiftInstanceConfigSids", jstype = JS_STRING];</code>
   * @param index The index of the element to return.
   * @return The tourShiftInstanceConfigSids at the given index.
   */
  long getTourShiftInstanceConfigSids(int index);
}
