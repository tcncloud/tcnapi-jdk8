// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListShiftSegmentsByShiftInstanceSidsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListShiftSegmentsByShiftInstanceSidsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of shift instances referenced by requested shift segments.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return A list containing the shiftInstanceSids.
   */
  java.util.List<java.lang.Long> getShiftInstanceSidsList();
  /**
   * <pre>
   * IDs of shift instances referenced by requested shift segments.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return The count of shiftInstanceSids.
   */
  int getShiftInstanceSidsCount();
  /**
   * <pre>
   * IDs of shift instances referenced by requested shift segments.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @param index The index of the element to return.
   * @return The shiftInstanceSids at the given index.
   */
  long getShiftInstanceSids(int index);

  /**
   * <pre>
   * Set to true to include the scheduling activity in each of the returned shift segments.
   * </pre>
   *
   * <code>bool include_scheduling_activity = 2 [json_name = "includeSchedulingActivity"];</code>
   * @return The includeSchedulingActivity.
   */
  boolean getIncludeSchedulingActivity();

  /**
   * <pre>
   * Set to true to include the non skill activity for the scheduling activities returned (if those are set to be included).
   * </pre>
   *
   * <code>bool include_activity = 3 [json_name = "includeActivity"];</code>
   * @return The includeActivity.
   */
  boolean getIncludeActivity();
}
