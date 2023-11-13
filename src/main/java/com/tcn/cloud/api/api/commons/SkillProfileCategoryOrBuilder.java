// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface SkillProfileCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.SkillProfileCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of either a skill profile or a skill profile group determined by &#64;skill_profile_category_type.
   * </pre>
   *
   * <code>int64 skill_profile_category_sid = 1 [json_name = "skillProfileCategorySid"];</code>
   * @return The skillProfileCategorySid.
   */
  long getSkillProfileCategorySid();

  /**
   * <pre>
   * Category type for &#64;skill_profile_category_sid.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
   * @return The enum numeric value on the wire for skillProfileCategoryType.
   */
  int getSkillProfileCategoryTypeValue();
  /**
   * <pre>
   * Category type for &#64;skill_profile_category_sid.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
   * @return The skillProfileCategoryType.
   */
  com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType getSkillProfileCategoryType();
}
