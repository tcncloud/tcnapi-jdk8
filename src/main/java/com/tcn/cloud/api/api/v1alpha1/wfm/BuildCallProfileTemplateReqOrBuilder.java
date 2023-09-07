// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface BuildCallProfileTemplateReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.BuildCallProfileTemplateReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  boolean hasSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory();
  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder();
}