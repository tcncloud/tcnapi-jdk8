// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateShiftInstanceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateShiftInstanceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the draft schedule for the shift instance.
   * </pre>
   *
   * <code>int64 draft_schedule_sid = 1 [json_name = "draftScheduleSid"];</code>
   * @return The draftScheduleSid.
   */
  long getDraftScheduleSid();

  /**
   * <pre>
   * ID of the shift template for the shift instance.
   * </pre>
   *
   * <code>int64 shift_template_sid = 2 [json_name = "shiftTemplateSid"];</code>
   * @return The shiftTemplateSid.
   */
  long getShiftTemplateSid();

  /**
   * <pre>
   * Start datetime of the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 3 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * Start datetime of the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 3 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * Start datetime of the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 3 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * Width in minutes of the shift instance.
   * </pre>
   *
   * <code>int32 width_in_minutes = 4 [json_name = "widthInMinutes"];</code>
   * @return The widthInMinutes.
   */
  int getWidthInMinutes();

  /**
   * <pre>
   * Indicates whether the shift instance is locked.
   * </pre>
   *
   * <code>bool is_locked = 5 [json_name = "isLocked"];</code>
   * @return The isLocked.
   */
  boolean getIsLocked();

  /**
   * <pre>
   * ID of the wfm agent for the shift instance. If null it will
   * create a new unassigned WfmAgent for the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid = 6 [json_name = "wfmAgentSid"];</code>
   * @return Whether the wfmAgentSid field is set.
   */
  boolean hasWfmAgentSid();
  /**
   * <pre>
   * ID of the wfm agent for the shift instance. If null it will
   * create a new unassigned WfmAgent for the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid = 6 [json_name = "wfmAgentSid"];</code>
   * @return The wfmAgentSid.
   */
  com.google.protobuf.Int64Value getWfmAgentSid();
  /**
   * <pre>
   * ID of the wfm agent for the shift instance. If null it will
   * create a new unassigned WfmAgent for the shift instance.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid = 6 [json_name = "wfmAgentSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getWfmAgentSidOrBuilder();

  /**
   * <pre>
   * Metric types for the shift instance.
   * </pre>
   *
   * <code>repeated .api.commons.PerformanceMetricType metric_types = 7 [json_name = "metricTypes"];</code>
   * @return A list containing the metricTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.PerformanceMetricType> getMetricTypesList();
  /**
   * <pre>
   * Metric types for the shift instance.
   * </pre>
   *
   * <code>repeated .api.commons.PerformanceMetricType metric_types = 7 [json_name = "metricTypes"];</code>
   * @return The count of metricTypes.
   */
  int getMetricTypesCount();
  /**
   * <pre>
   * Metric types for the shift instance.
   * </pre>
   *
   * <code>repeated .api.commons.PerformanceMetricType metric_types = 7 [json_name = "metricTypes"];</code>
   * @param index The index of the element to return.
   * @return The metricTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.PerformanceMetricType getMetricTypes(int index);
  /**
   * <pre>
   * Metric types for the shift instance.
   * </pre>
   *
   * <code>repeated .api.commons.PerformanceMetricType metric_types = 7 [json_name = "metricTypes"];</code>
   * @return A list containing the enum numeric values on the wire for metricTypes.
   */
  java.util.List<java.lang.Integer>
  getMetricTypesValueList();
  /**
   * <pre>
   * Metric types for the shift instance.
   * </pre>
   *
   * <code>repeated .api.commons.PerformanceMetricType metric_types = 7 [json_name = "metricTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of metricTypes at the given index.
   */
  int getMetricTypesValue(int index);
}
