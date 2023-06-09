// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface BuildProfileForecastByIntervalWithStatsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.BuildProfileForecastByIntervalWithStatsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return Whether the callProfileTemplate field is set.
   */
  boolean hasCallProfileTemplate();
  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return The callProfileTemplate.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate();
  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder();

  /**
   * <pre>
   * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
   * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
   * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
   * </pre>
   *
   * <code>bool fixed_averages_forecast = 2 [json_name = "fixedAveragesForecast"];</code>
   * @return The fixedAveragesForecast.
   */
  boolean getFixedAveragesForecast();

  /**
   * <pre>
   * ID of the skill profile to use the training data for stats.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 3 [json_name = "skillProfileSid"];</code>
   * @return The skillProfileSid.
   */
  long getSkillProfileSid();
}
