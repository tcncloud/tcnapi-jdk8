// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface HistoricalDataIntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.HistoricalDataInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * time that this interval starts at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return Whether the startDatetime field is set.
   */
  boolean hasStartDatetime();
  /**
   * <pre>
   * time that this interval starts at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   * @return The startDatetime.
   */
  com.google.protobuf.Timestamp getStartDatetime();
  /**
   * <pre>
   * time that this interval starts at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_datetime = 1 [json_name = "startDatetime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDatetimeOrBuilder();

  /**
   * <pre>
   * ID of the skill profile that this interval belongs to.
   * Deprecated as of Sep/8/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 2 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.HistoricalDataInterval.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=3429
   * @return The skillProfileSid.
   */
  @java.lang.Deprecated long getSkillProfileSid();

  /**
   * <pre>
   * the following are averages for all the calls found for this interval.
   * average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_speed_of_answer_in_seconds = 3 [json_name = "averageSpeedOfAnswerInSeconds"];</code>
   * @return Whether the averageSpeedOfAnswerInSeconds field is set.
   */
  boolean hasAverageSpeedOfAnswerInSeconds();
  /**
   * <pre>
   * the following are averages for all the calls found for this interval.
   * average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_speed_of_answer_in_seconds = 3 [json_name = "averageSpeedOfAnswerInSeconds"];</code>
   * @return The averageSpeedOfAnswerInSeconds.
   */
  com.google.protobuf.FloatValue getAverageSpeedOfAnswerInSeconds();
  /**
   * <pre>
   * the following are averages for all the calls found for this interval.
   * average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_speed_of_answer_in_seconds = 3 [json_name = "averageSpeedOfAnswerInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getAverageSpeedOfAnswerInSecondsOrBuilder();

  /**
   * <pre>
   * average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_handle_time_in_seconds = 4 [json_name = "averageHandleTimeInSeconds"];</code>
   * @return Whether the averageHandleTimeInSeconds field is set.
   */
  boolean hasAverageHandleTimeInSeconds();
  /**
   * <pre>
   * average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_handle_time_in_seconds = 4 [json_name = "averageHandleTimeInSeconds"];</code>
   * @return The averageHandleTimeInSeconds.
   */
  com.google.protobuf.FloatValue getAverageHandleTimeInSeconds();
  /**
   * <pre>
   * average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_handle_time_in_seconds = 4 [json_name = "averageHandleTimeInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getAverageHandleTimeInSecondsOrBuilder();

  /**
   * <pre>
   * average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_after_call_work_in_seconds = 5 [json_name = "averageAfterCallWorkInSeconds"];</code>
   * @return Whether the averageAfterCallWorkInSeconds field is set.
   */
  boolean hasAverageAfterCallWorkInSeconds();
  /**
   * <pre>
   * average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_after_call_work_in_seconds = 5 [json_name = "averageAfterCallWorkInSeconds"];</code>
   * @return The averageAfterCallWorkInSeconds.
   */
  com.google.protobuf.FloatValue getAverageAfterCallWorkInSeconds();
  /**
   * <pre>
   * average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_after_call_work_in_seconds = 5 [json_name = "averageAfterCallWorkInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getAverageAfterCallWorkInSecondsOrBuilder();

  /**
   * <pre>
   * average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_time_to_abort_in_seconds = 6 [json_name = "averageTimeToAbortInSeconds"];</code>
   * @return Whether the averageTimeToAbortInSeconds field is set.
   */
  boolean hasAverageTimeToAbortInSeconds();
  /**
   * <pre>
   * average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_time_to_abort_in_seconds = 6 [json_name = "averageTimeToAbortInSeconds"];</code>
   * @return The averageTimeToAbortInSeconds.
   */
  com.google.protobuf.FloatValue getAverageTimeToAbortInSeconds();
  /**
   * <pre>
   * average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue average_time_to_abort_in_seconds = 6 [json_name = "averageTimeToAbortInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getAverageTimeToAbortInSecondsOrBuilder();

  /**
   * <pre>
   * total calls found for this interval (answered + unanswered).
   * </pre>
   *
   * <code>int32 total_calls = 7 [json_name = "totalCalls"];</code>
   * @return The totalCalls.
   */
  int getTotalCalls();

  /**
   * <pre>
   * total number of calls that were abandoned
   * </pre>
   *
   * <code>int32 total_abandoned_calls = 8 [json_name = "totalAbandonedCalls"];</code>
   * @return The totalAbandonedCalls.
   */
  int getTotalAbandonedCalls();

  /**
   * <pre>
   * true=interval w/ delta applied, false=historical interval
   * </pre>
   *
   * <code>bool is_delta = 9 [json_name = "isDelta"];</code>
   * @return The isDelta.
   */
  boolean getIsDelta();

  /**
   * <pre>
   * The following are only set by the server when requesting the training data intervals and the interval is a delta.
   * They will contain the non delta values for that interval.
   * original average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_speed_of_answer_in_seconds = 10 [json_name = "originalAverageSpeedOfAnswerInSeconds"];</code>
   * @return Whether the originalAverageSpeedOfAnswerInSeconds field is set.
   */
  boolean hasOriginalAverageSpeedOfAnswerInSeconds();
  /**
   * <pre>
   * The following are only set by the server when requesting the training data intervals and the interval is a delta.
   * They will contain the non delta values for that interval.
   * original average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_speed_of_answer_in_seconds = 10 [json_name = "originalAverageSpeedOfAnswerInSeconds"];</code>
   * @return The originalAverageSpeedOfAnswerInSeconds.
   */
  com.google.protobuf.FloatValue getOriginalAverageSpeedOfAnswerInSeconds();
  /**
   * <pre>
   * The following are only set by the server when requesting the training data intervals and the interval is a delta.
   * They will contain the non delta values for that interval.
   * original average time that calls took to be answered.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_speed_of_answer_in_seconds = 10 [json_name = "originalAverageSpeedOfAnswerInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getOriginalAverageSpeedOfAnswerInSecondsOrBuilder();

  /**
   * <pre>
   * original average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_handle_time_in_seconds = 11 [json_name = "originalAverageHandleTimeInSeconds"];</code>
   * @return Whether the originalAverageHandleTimeInSeconds field is set.
   */
  boolean hasOriginalAverageHandleTimeInSeconds();
  /**
   * <pre>
   * original average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_handle_time_in_seconds = 11 [json_name = "originalAverageHandleTimeInSeconds"];</code>
   * @return The originalAverageHandleTimeInSeconds.
   */
  com.google.protobuf.FloatValue getOriginalAverageHandleTimeInSeconds();
  /**
   * <pre>
   * original average duration of answered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_handle_time_in_seconds = 11 [json_name = "originalAverageHandleTimeInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getOriginalAverageHandleTimeInSecondsOrBuilder();

  /**
   * <pre>
   * original average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_after_call_work_in_seconds = 12 [json_name = "originalAverageAfterCallWorkInSeconds"];</code>
   * @return Whether the originalAverageAfterCallWorkInSeconds field is set.
   */
  boolean hasOriginalAverageAfterCallWorkInSeconds();
  /**
   * <pre>
   * original average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_after_call_work_in_seconds = 12 [json_name = "originalAverageAfterCallWorkInSeconds"];</code>
   * @return The originalAverageAfterCallWorkInSeconds.
   */
  com.google.protobuf.FloatValue getOriginalAverageAfterCallWorkInSeconds();
  /**
   * <pre>
   * original average time that agents spent in wrap up.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_after_call_work_in_seconds = 12 [json_name = "originalAverageAfterCallWorkInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getOriginalAverageAfterCallWorkInSecondsOrBuilder();

  /**
   * <pre>
   * original average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_time_to_abort_in_seconds = 13 [json_name = "originalAverageTimeToAbortInSeconds"];</code>
   * @return Whether the originalAverageTimeToAbortInSeconds field is set.
   */
  boolean hasOriginalAverageTimeToAbortInSeconds();
  /**
   * <pre>
   * original average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_time_to_abort_in_seconds = 13 [json_name = "originalAverageTimeToAbortInSeconds"];</code>
   * @return The originalAverageTimeToAbortInSeconds.
   */
  com.google.protobuf.FloatValue getOriginalAverageTimeToAbortInSeconds();
  /**
   * <pre>
   * original average time that callers waited before hanging unanswered calls.
   * </pre>
   *
   * <code>.google.protobuf.FloatValue original_average_time_to_abort_in_seconds = 13 [json_name = "originalAverageTimeToAbortInSeconds"];</code>
   */
  com.google.protobuf.FloatValueOrBuilder getOriginalAverageTimeToAbortInSecondsOrBuilder();

  /**
   * <pre>
   * original total calls found for this interval (answered + unanswered).
   * </pre>
   *
   * <code>int32 original_total_calls = 14 [json_name = "originalTotalCalls"];</code>
   * @return The originalTotalCalls.
   */
  int getOriginalTotalCalls();

  /**
   * <pre>
   * original total number of calls that were abandoned
   * </pre>
   *
   * <code>int32 original_total_abandoned_calls = 15 [json_name = "originalTotalAbandonedCalls"];</code>
   * @return The originalTotalAbandonedCalls.
   */
  int getOriginalTotalAbandonedCalls();

  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 16 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 16 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the interval belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 16 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}
