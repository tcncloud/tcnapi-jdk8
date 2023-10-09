// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListTourShiftInstanceConfigsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListTourShiftInstanceConfigsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of the tour week patterns to get the child Tour Shift Instance Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_week_pattern_sids = 1 [json_name = "tourWeekPatternSids", jstype = JS_STRING];</code>
   * @return A list containing the tourWeekPatternSids.
   */
  java.util.List<java.lang.Long> getTourWeekPatternSidsList();
  /**
   * <pre>
   * IDs of the tour week patterns to get the child Tour Shift Instance Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_week_pattern_sids = 1 [json_name = "tourWeekPatternSids", jstype = JS_STRING];</code>
   * @return The count of tourWeekPatternSids.
   */
  int getTourWeekPatternSidsCount();
  /**
   * <pre>
   * IDs of the tour week patterns to get the child Tour Shift Instance Configs for.
   * </pre>
   *
   * <code>repeated int64 tour_week_pattern_sids = 1 [json_name = "tourWeekPatternSids", jstype = JS_STRING];</code>
   * @param index The index of the element to return.
   * @return The tourWeekPatternSids at the given index.
   */
  long getTourWeekPatternSids(int index);
}
