// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CallDataByIntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CallDataByInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start time of the interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * Start time of the interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * Start time of the interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * ID of the skill profile to forecast for (not set in profile forecasts).
   * Deprecated: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 2 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.CallDataByInterval.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=2921
   * @return The skillProfileSid.
   */
  @java.lang.Deprecated long getSkillProfileSid();

  /**
   * <pre>
   * the number of calls in this interval with this skill profile (answered + unanswered).
   * </pre>
   *
   * <code>int32 total_calls = 3 [json_name = "totalCalls"];</code>
   * @return The totalCalls.
   */
  int getTotalCalls();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>float average_speed_of_answer_in_seconds = 4 [json_name = "averageSpeedOfAnswerInSeconds"];</code>
   * @return The averageSpeedOfAnswerInSeconds.
   */
  float getAverageSpeedOfAnswerInSeconds();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>float average_handle_time_in_seconds = 5 [json_name = "averageHandleTimeInSeconds"];</code>
   * @return The averageHandleTimeInSeconds.
   */
  float getAverageHandleTimeInSeconds();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>float average_after_call_work_in_seconds = 6 [json_name = "averageAfterCallWorkInSeconds"];</code>
   * @return The averageAfterCallWorkInSeconds.
   */
  float getAverageAfterCallWorkInSeconds();

  /**
   * <pre>
   * optional
   * </pre>
   *
   * <code>float average_time_to_abort_in_seconds = 7 [json_name = "averageTimeToAbortInSeconds"];</code>
   * @return The averageTimeToAbortInSeconds.
   */
  float getAverageTimeToAbortInSeconds();

  /**
   * <pre>
   * the number of abandoned calls in this interval for this skill profile.
   * </pre>
   *
   * <code>int32 total_abandoned_calls = 8 [json_name = "totalAbandonedCalls"];</code>
   * @return The totalAbandonedCalls.
   */
  int getTotalAbandonedCalls();

  /**
   * <pre>
   * Whether the interval has been modified or not
   * </pre>
   *
   * <code>bool is_delta = 9 [json_name = "isDelta"];</code>
   * @return The isDelta.
   */
  boolean getIsDelta();

  /**
   * <pre>
   * ID of the forecast interval that the delta/interval belongs to
   * </pre>
   *
   * <code>int64 forecast_data_interval_sid = 10 [json_name = "forecastDataIntervalSid"];</code>
   * @return The forecastDataIntervalSid.
   */
  long getForecastDataIntervalSid();

  /**
   * <pre>
   * Interval width minutes that the interval used on creation.
   * Only set for forecast intervals.
   * </pre>
   *
   * <code>int32 interval_width_in_minutes = 11 [json_name = "intervalWidthInMinutes"];</code>
   * @return The intervalWidthInMinutes.
   */
  int getIntervalWidthInMinutes();

  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 12 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 12 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 12 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}
