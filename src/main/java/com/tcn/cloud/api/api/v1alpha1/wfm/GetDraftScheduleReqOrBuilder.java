// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GetDraftScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GetDraftScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the draft schedule to return.
   * </pre>
   *
   * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
   * @return The draftScheduleSid.
   */
  long getDraftScheduleSid();

  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 2 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Set to true to include shift instances.
   * </pre>
   *
   * <code>bool include_shift_instances = 3 [json_name = "includeShiftInstances", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetDraftScheduleReq.include_shift_instances is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7225
   * @return The includeShiftInstances.
   */
  @java.lang.Deprecated boolean getIncludeShiftInstances();

  /**
   * <pre>
   * Set to true to include shift template in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_template = 4 [json_name = "includeShiftTemplate", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetDraftScheduleReq.include_shift_template is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7228
   * @return The includeShiftTemplate.
   */
  @java.lang.Deprecated boolean getIncludeShiftTemplate();

  /**
   * <pre>
   * Set to true to include shift segments in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_segments = 5 [json_name = "includeShiftSegments", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetDraftScheduleReq.include_shift_segments is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7231
   * @return The includeShiftSegments.
   */
  @java.lang.Deprecated boolean getIncludeShiftSegments();

  /**
   * <pre>
   * Set to true to include scheduling activity in each of the returned shift segments.
   * Only effective when include_shift_instances and include_shift_segments are also set to true.
   * </pre>
   *
   * <code>bool include_scheduling_activity = 6 [json_name = "includeSchedulingActivity", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetDraftScheduleReq.include_scheduling_activity is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7234
   * @return The includeSchedulingActivity.
   */
  @java.lang.Deprecated boolean getIncludeSchedulingActivity();

  /**
   * <pre>
   * Set to true to include non skill activity in each of the returned scheduling activities.
   * Only effective when include_scheduling_activity, include_shift_segments and include_shift_instances are also set to true.
   * </pre>
   *
   * <code>bool include_activity = 7 [json_name = "includeActivity", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetDraftScheduleReq.include_activity is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=7237
   * @return The includeActivity.
   */
  @java.lang.Deprecated boolean getIncludeActivity();

  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 8 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 8 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 8 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();
}
