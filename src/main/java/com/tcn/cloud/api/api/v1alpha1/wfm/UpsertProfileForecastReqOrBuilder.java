// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpsertProfileForecastReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpsertProfileForecastReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the skill profile that the forecast will belong to.
   * Deprecated as of Sep/8/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.UpsertProfileForecastReq.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=4008
   * @return The skillProfileSid.
   */
  @java.lang.Deprecated long getSkillProfileSid();

  /**
   * <pre>
   * Template to use to generate the forecast that will be stored.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 2 [json_name = "callProfileTemplate"];</code>
   * @return Whether the callProfileTemplate field is set.
   */
  boolean hasCallProfileTemplate();
  /**
   * <pre>
   * Template to use to generate the forecast that will be stored.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 2 [json_name = "callProfileTemplate"];</code>
   * @return The callProfileTemplate.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate();
  /**
   * <pre>
   * Template to use to generate the forecast that will be stored.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 2 [json_name = "callProfileTemplate"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder();

  /**
   * <pre>
   * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
   * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
   * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
   * </pre>
   *
   * <code>bool fixed_averages_forecast = 3 [json_name = "fixedAveragesForecast"];</code>
   * @return The fixedAveragesForecast.
   */
  boolean getFixedAveragesForecast();

  /**
   * <pre>
   * Skill profile category that the forecast belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the forecast belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the forecast belongs to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 4 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}
