// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListShiftInstanceSidsForScheduleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListShiftInstanceSidsForScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schedule to get the shift instance sids from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return Whether the scheduleSelector field is set.
   */
  boolean hasScheduleSelector();
  /**
   * <pre>
   * Schedule to get the shift instance sids from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   * @return The scheduleSelector.
   */
  com.tcn.cloud.api.api.commons.ScheduleSelector getScheduleSelector();
  /**
   * <pre>
   * Schedule to get the shift instance sids from.
   * </pre>
   *
   * <code>.api.commons.ScheduleSelector schedule_selector = 1 [json_name = "scheduleSelector"];</code>
   */
  com.tcn.cloud.api.api.commons.ScheduleSelectorOrBuilder getScheduleSelectorOrBuilder();

  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * The datetime range over which to get the shift instance sids.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Optional field, if left nil all shift sids matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all shift sids matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all shift sids matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 3 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * Only required if &#64;node_selector is not nil.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 4 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();
}
