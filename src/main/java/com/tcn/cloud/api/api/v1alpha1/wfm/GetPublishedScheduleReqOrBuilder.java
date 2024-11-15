// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GetPublishedScheduleReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GetPublishedScheduleReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Date range to of the published to return.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   * @return Whether the datetimeRange field is set.
   */
  boolean hasDatetimeRange();
  /**
   * <pre>
   * Date range to of the published to return.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   * @return The datetimeRange.
   */
  com.tcn.cloud.api.api.commons.DatetimeRange getDatetimeRange();
  /**
   * <pre>
   * Date range to of the published to return.
   * </pre>
   *
   * <code>.api.commons.DatetimeRange datetime_range = 1 [json_name = "datetimeRange"];</code>
   */
  com.tcn.cloud.api.api.commons.DatetimeRangeOrBuilder getDatetimeRangeOrBuilder();

  /**
   * <pre>
   * Set to true to include shift instances.
   * </pre>
   *
   * <code>bool include_shift_instances = 2 [json_name = "includeShiftInstances", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetPublishedScheduleReq.include_shift_instances is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6877
   * @return The includeShiftInstances.
   */
  @java.lang.Deprecated boolean getIncludeShiftInstances();

  /**
   * <pre>
   * Set to true to include shift template in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_template = 3 [json_name = "includeShiftTemplate", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetPublishedScheduleReq.include_shift_template is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6880
   * @return The includeShiftTemplate.
   */
  @java.lang.Deprecated boolean getIncludeShiftTemplate();

  /**
   * <pre>
   * Set to true to include shift segments in each of the returned shift instances.
   * Only effective when include_shift_instances is also set to true.
   * </pre>
   *
   * <code>bool include_shift_segments = 4 [json_name = "includeShiftSegments", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetPublishedScheduleReq.include_shift_segments is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6883
   * @return The includeShiftSegments.
   */
  @java.lang.Deprecated boolean getIncludeShiftSegments();

  /**
   * <pre>
   * Set to true to include scheduling activity in each of the returned shift segments.
   * Only effective when include_shift_instances and include_shift_segments are also set to true.
   * </pre>
   *
   * <code>bool include_scheduling_activity = 5 [json_name = "includeSchedulingActivity", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetPublishedScheduleReq.include_scheduling_activity is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6886
   * @return The includeSchedulingActivity.
   */
  @java.lang.Deprecated boolean getIncludeSchedulingActivity();

  /**
   * <pre>
   * Set to true to include non skill activity in each of the returned scheduling activities.
   * Only effective when include_scheduling_activity, include_shift_segments and include_shift_instances are also set to true.
   * </pre>
   *
   * <code>bool include_activity = 6 [json_name = "includeActivity", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.GetPublishedScheduleReq.include_activity is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=6889
   * @return The includeActivity.
   */
  @java.lang.Deprecated boolean getIncludeActivity();

  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 7 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 7 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * Optional field, if left nil all matching the given parameters will be included.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 7 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();
}
