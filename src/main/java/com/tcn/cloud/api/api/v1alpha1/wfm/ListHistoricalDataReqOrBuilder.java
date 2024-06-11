// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListHistoricalDataReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListHistoricalDataReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the skill profile used to examine matching calls in the client's historical data.
   * Deprecated as of Sep/8/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ListHistoricalDataReq.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=3644
   * @return The skillProfileSid.
   */
  @java.lang.Deprecated long getSkillProfileSid();

  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}
