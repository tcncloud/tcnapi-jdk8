// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CopyShiftInstancesToScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CopyShiftInstancesToScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schedule that the &#64;shift_instance_sids will be copied into.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule = 1 [json_name = "destinationSchedule"];</code>
   * @return Whether the destinationSchedule field is set.
   */
  boolean hasDestinationSchedule();
  /**
   * <pre>
   * Schedule that the &#64;shift_instance_sids will be copied into.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule = 1 [json_name = "destinationSchedule"];</code>
   * @return The destinationSchedule.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getDestinationSchedule();
  /**
   * <pre>
   * Schedule that the &#64;shift_instance_sids will be copied into.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule = 1 [json_name = "destinationSchedule"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getDestinationScheduleOrBuilder();

  /**
   * <pre>
   * IDs of the shift instances to copy into &#64;destination_schedule.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 2 [json_name = "shiftInstanceSids"];</code>
   * @return A list containing the shiftInstanceSids.
   */
  java.util.List<java.lang.Long> getShiftInstanceSidsList();
  /**
   * <pre>
   * IDs of the shift instances to copy into &#64;destination_schedule.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 2 [json_name = "shiftInstanceSids"];</code>
   * @return The count of shiftInstanceSids.
   */
  int getShiftInstanceSidsCount();
  /**
   * <pre>
   * IDs of the shift instances to copy into &#64;destination_schedule.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 2 [json_name = "shiftInstanceSids"];</code>
   * @param index The index of the element to return.
   * @return The shiftInstanceSids at the given index.
   */
  long getShiftInstanceSids(int index);

  /**
   * <pre>
   * If set to true, overlapping shifts will be permitted, and return a warning diagnostic after persisting.
   * Otherwise, any overlapping shifts for agents in the &#64;destination_schedule will return an error diagnostic and no shifts will be copied.
   * </pre>
   *
   * <code>bool overlap_as_warning = 3 [json_name = "overlapAsWarning"];</code>
   * @return The overlapAsWarning.
   */
  boolean getOverlapAsWarning();
}
