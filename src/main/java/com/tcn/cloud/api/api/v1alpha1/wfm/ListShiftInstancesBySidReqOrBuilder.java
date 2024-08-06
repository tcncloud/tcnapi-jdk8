// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListShiftInstancesBySidReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListShiftInstancesBySidReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the shift instances to list.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return A list containing the shiftInstanceSids.
   */
  java.util.List<java.lang.Long> getShiftInstanceSidsList();
  /**
   * <pre>
   * ID of the shift instances to list.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return The count of shiftInstanceSids.
   */
  int getShiftInstanceSidsCount();
  /**
   * <pre>
   * ID of the shift instances to list.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @param index The index of the element to return.
   * @return The shiftInstanceSids at the given index.
   */
  long getShiftInstanceSids(int index);

  /**
   * <pre>
   * If true, the shift segments will be included in the returned shift instances.
   * If false, the instances will be returned without any shift segments.
   * </pre>
   *
   * <code>bool include_shift_segments = 2 [json_name = "includeShiftSegments"];</code>
   * @return The includeShiftSegments.
   */
  boolean getIncludeShiftSegments();

  /**
   * <pre>
   * Set to true to include shift template in the returned shift instance.
   * </pre>
   *
   * <code>bool include_shift_template = 3 [json_name = "includeShiftTemplate"];</code>
   * @return The includeShiftTemplate.
   */
  boolean getIncludeShiftTemplate();

  /**
   * <pre>
   * Set to true to include scheduling activity in each of the returned shift segments.
   * Only effective when include_shift_segments is also set to true.
   * </pre>
   *
   * <code>bool include_scheduling_activity = 4 [json_name = "includeSchedulingActivity"];</code>
   * @return The includeSchedulingActivity.
   */
  boolean getIncludeSchedulingActivity();

  /**
   * <pre>
   * Set to true to include non skill activity in each of the returned scheduling activities.
   * Only effective when include_scheduling_activity and include_shift_segments are also set to true.
   * </pre>
   *
   * <code>bool include_activity = 5 [json_name = "includeActivity"];</code>
   * @return The includeActivity.
   */
  boolean getIncludeActivity();

  /**
   * <pre>
   * Set to true to include shift segment call stats in each of the returned shift segments.
   * Only effective when &#64;include_shift_segments is also set to true.
   * </pre>
   *
   * <code>bool include_shift_segment_call_stats = 6 [json_name = "includeShiftSegmentCallStats"];</code>
   * @return The includeShiftSegmentCallStats.
   */
  boolean getIncludeShiftSegmentCallStats();
}
