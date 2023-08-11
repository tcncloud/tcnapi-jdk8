// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CopyScheduleToScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CopyScheduleToScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The schedule that shifts will be copied from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector source_schedule_selector = 1 [json_name = "sourceScheduleSelector"];</code>
   * @return Whether the sourceScheduleSelector field is set.
   */
  boolean hasSourceScheduleSelector();
  /**
   * <pre>
   * The schedule that shifts will be copied from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector source_schedule_selector = 1 [json_name = "sourceScheduleSelector"];</code>
   * @return The sourceScheduleSelector.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getSourceScheduleSelector();
  /**
   * <pre>
   * The schedule that shifts will be copied from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector source_schedule_selector = 1 [json_name = "sourceScheduleSelector"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getSourceScheduleSelectorOrBuilder();

  /**
   * <pre>
   * The schedule that the shifts will be copied to.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule_selector = 2 [json_name = "destinationScheduleSelector"];</code>
   * @return Whether the destinationScheduleSelector field is set.
   */
  boolean hasDestinationScheduleSelector();
  /**
   * <pre>
   * The schedule that the shifts will be copied to.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule_selector = 2 [json_name = "destinationScheduleSelector"];</code>
   * @return The destinationScheduleSelector.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getDestinationScheduleSelector();
  /**
   * <pre>
   * The schedule that the shifts will be copied to.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector destination_schedule_selector = 2 [json_name = "destinationScheduleSelector"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getDestinationScheduleSelectorOrBuilder();

  /**
   * <pre>
   * The node that the shifts to copy should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * The node that the shifts to copy should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * The node that the shifts to copy should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * If no range is provided, the scheduling range for the &#64;destination_schedule_selector will be used if it is a draft schedule, otherwise the range of the &#64;source_schedule_selector will be used.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * If no range is provided, the scheduling range for the &#64;destination_schedule_selector will be used if it is a draft schedule, otherwise the range of the &#64;source_schedule_selector will be used.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * If no range is provided, the scheduling range for the &#64;destination_schedule_selector will be used if it is a draft schedule, otherwise the range of the &#64;source_schedule_selector will be used.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 4 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Set to true to copy shifts that start within the range being copied, otherwise any shift that overlaps the range will be copied.
   * </pre>
   *
   * <code>bool start_datetimes_only = 5 [json_name = "startDatetimesOnly"];</code>
   * @return The startDatetimesOnly.
   */
  boolean getStartDatetimesOnly();

  /**
   * <pre>
   * Set to true to allow the shifts to be copied when there is a resulting overlap conflict for an agents shifts, with diagnostic warnings being returned after.
   * Otherwise, overlap conflicts will return diagnostic errors and cause no shifts to be copied.
   * </pre>
   *
   * <code>bool overlap_as_warning = 6 [json_name = "overlapAsWarning"];</code>
   * @return The overlapAsWarning.
   */
  boolean getOverlapAsWarning();
}
