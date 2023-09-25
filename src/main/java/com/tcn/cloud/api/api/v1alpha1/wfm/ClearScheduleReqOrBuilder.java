// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ClearScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ClearScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The schedule to be cleared.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return Whether the scheduleSelector field is set.
   */
  boolean hasScheduleSelector();
  /**
   * <pre>
   * The schedule to be cleared.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return The scheduleSelector.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getScheduleSelector();
  /**
   * <pre>
   * The schedule to be cleared.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getScheduleSelectorOrBuilder();

  /**
   * <pre>
   * If set, node the shifts to be delete will all be related to.
   * Otherwise, deleted shifts will not be filtered based on the node they are related to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * If set, node the shifts to be delete will all be related to.
   * Otherwise, deleted shifts will not be filtered based on the node they are related to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * If set, node the shifts to be delete will all be related to.
   * Otherwise, deleted shifts will not be filtered based on the node they are related to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 2 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * If set, acts as a range to clear all shifts from.
   * Otherwise, all shifts belonging to &#64;schedule_selector are considered within range to be cleared.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * If set, acts as a range to clear all shifts from.
   * Otherwise, all shifts belonging to &#64;schedule_selector are considered within range to be cleared.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * If set, acts as a range to clear all shifts from.
   * Otherwise, all shifts belonging to &#64;schedule_selector are considered within range to be cleared.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 3 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Set to delete all shifts starting before or ending after the given &#64;datetime range.
   * Otherwise shifts overlapping the &#64;datetime_range will be deleted.
   * Cannot be set to true if no datetime range is provided.
   * </pre>
   *
   * <code>bool invert_datetime_range = 4 [json_name = "invertDatetimeRange"];</code>
   * @return The invertDatetimeRange.
   */
  boolean getInvertDatetimeRange();

  /**
   * <pre>
   * If set to true, only checks the start datetime of shifts when checking the &#64;datetime_range.
   * Otherwise, any shifts that overlap the &#64;datetime_range will be cleared.
   * If &#64;invert_datetime_range is true, any shifts that start before or start after the &#64;datetime_range will be deleted.
   * Cannot be set to true if no datetime range is provided.
   * </pre>
   *
   * <code>bool start_datetimes_only = 5 [json_name = "startDatetimesOnly"];</code>
   * @return The startDatetimesOnly.
   */
  boolean getStartDatetimesOnly();

  /**
   * <pre>
   * Set to true to delete locked and unlocked shifts in the range to be cleared.
   * Otherwise, only shift instances with is_locked set to false will be deleted.
   * </pre>
   *
   * <code>bool delete_locked = 6 [json_name = "deleteLocked"];</code>
   * @return The deleteLocked.
   */
  boolean getDeleteLocked();
}
