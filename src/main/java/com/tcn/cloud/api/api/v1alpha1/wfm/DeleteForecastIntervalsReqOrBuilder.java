// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface DeleteForecastIntervalsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.DeleteForecastIntervalsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the skill profile of which to delete the intervas/deltas.
   * Deprecated as of Sep/13/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.DeleteForecastIntervalsReq.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=3862
   * @return Whether the skillProfileSid field is set.
   */
  @java.lang.Deprecated boolean hasSkillProfileSid();
  /**
   * <pre>
   * ID of the skill profile of which to delete the intervas/deltas.
   * Deprecated as of Sep/13/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.DeleteForecastIntervalsReq.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=3862
   * @return The skillProfileSid.
   */
  @java.lang.Deprecated long getSkillProfileSid();

  /**
   * <pre>
   * Wrapper for SIDs of intervals to be deleted
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DeleteForecastIntervalsReq.IntervalSids forecast_interval_sids = 2 [json_name = "forecastIntervalSids"];</code>
   * @return Whether the forecastIntervalSids field is set.
   */
  boolean hasForecastIntervalSids();
  /**
   * <pre>
   * Wrapper for SIDs of intervals to be deleted
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DeleteForecastIntervalsReq.IntervalSids forecast_interval_sids = 2 [json_name = "forecastIntervalSids"];</code>
   * @return The forecastIntervalSids.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.IntervalSids getForecastIntervalSids();
  /**
   * <pre>
   * Wrapper for SIDs of intervals to be deleted
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DeleteForecastIntervalsReq.IntervalSids forecast_interval_sids = 2 [json_name = "forecastIntervalSids"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.IntervalSidsOrBuilder getForecastIntervalSidsOrBuilder();

  /**
   * <pre>
   * Skill profile category of which to delete the intervals/deltas.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category of which to delete the intervals/deltas.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category of which to delete the intervals/deltas.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();

  /**
   * <pre>
   * Type of interval to delete
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DeleteForecastIntervalsReq.ForecastIntervalDeleteType forecast_interval_delete_type = 3 [json_name = "forecastIntervalDeleteType"];</code>
   * @return The enum numeric value on the wire for forecastIntervalDeleteType.
   */
  int getForecastIntervalDeleteTypeValue();
  /**
   * <pre>
   * Type of interval to delete
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DeleteForecastIntervalsReq.ForecastIntervalDeleteType forecast_interval_delete_type = 3 [json_name = "forecastIntervalDeleteType"];</code>
   * @return The forecastIntervalDeleteType.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.ForecastIntervalDeleteType getForecastIntervalDeleteType();

  com.tcn.cloud.api.api.v1alpha1.wfm.DeleteForecastIntervalsReq.DeleteParamCase getDeleteParamCase();
}
