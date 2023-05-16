// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface BuildDraftScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.BuildDraftScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the draft schedule.
   * </pre>
   *
   * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
   * @return The draftScheduleSid.
   */
  long getDraftScheduleSid();

  /**
   * <pre>
   * ID of the node's schedule scenario sid.
   * </pre>
   *
   * <code>int64 schedule_scenario_sid = 2 [json_name = "scheduleScenarioSid"];</code>
   * @return The scheduleScenarioSid.
   */
  long getScheduleScenarioSid();

  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_scenario_scheduling_range = 3 [json_name = "scheduleScenarioSchedulingRange"];</code>
   * @return Whether the scheduleScenarioSchedulingRange field is set.
   */
  boolean hasScheduleScenarioSchedulingRange();
  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_scenario_scheduling_range = 3 [json_name = "scheduleScenarioSchedulingRange"];</code>
   * @return The scheduleScenarioSchedulingRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getScheduleScenarioSchedulingRange();
  /**
   * <pre>
   * Datetime range to set for the schedule scenario used to make the draft schedule.
   * If left blank, the current scheduling range for the scenario will be used
   * </pre>
   *
   * <code>.api.commons.DatetimeRange schedule_scenario_scheduling_range = 3 [json_name = "scheduleScenarioSchedulingRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getScheduleScenarioSchedulingRangeOrBuilder();

  /**
   * <pre>
   * The node that the shifts should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 4 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * The node that the shifts should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 4 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * The node that the shifts should be associated with.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 4 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();

  /**
   * <pre>
   * Set to true to include shift instances.
   * </pre>
   *
   * <code>bool include_shift_instances = 5 [json_name = "includeShiftInstances"];</code>
   * @return The includeShiftInstances.
   */
  boolean getIncludeShiftInstances();

  /**
   * <pre>
   * Set to true to include shift template in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_template = 6 [json_name = "includeShiftTemplate"];</code>
   * @return The includeShiftTemplate.
   */
  boolean getIncludeShiftTemplate();

  /**
   * <pre>
   * Set to true to include shift segments in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_segments = 7 [json_name = "includeShiftSegments"];</code>
   * @return The includeShiftSegments.
   */
  boolean getIncludeShiftSegments();

  /**
   * <pre>
   * Set to true to include scheduling activity in each of the returned shift segments.
   * Only effective when include_shift_instances and include_shift_segments are also set to true.
   * </pre>
   *
   * <code>bool include_scheduling_activity = 8 [json_name = "includeSchedulingActivity"];</code>
   * @return The includeSchedulingActivity.
   */
  boolean getIncludeSchedulingActivity();

  /**
   * <pre>
   * Set to true to include non skill activity in each of the returned scheduling activities.
   * Only effective when include_scheduling_activity, include_shift_segments and include_shift_instances are also set to true.
   * </pre>
   *
   * <code>bool include_activity = 9 [json_name = "includeActivity"];</code>
   * @return The includeActivity.
   */
  boolean getIncludeActivity();
}
