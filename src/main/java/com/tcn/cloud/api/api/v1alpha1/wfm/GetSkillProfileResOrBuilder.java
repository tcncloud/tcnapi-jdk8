// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface GetSkillProfileResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.GetSkillProfileRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.wfm.SkillProfile skill_profile = 1 [json_name = "skillProfile"];</code>
   * @return Whether the skillProfile field is set.
   */
  boolean hasSkillProfile();
  /**
   * <code>.api.v1alpha1.wfm.SkillProfile skill_profile = 1 [json_name = "skillProfile"];</code>
   * @return The skillProfile.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile getSkillProfile();
  /**
   * <code>.api.v1alpha1.wfm.SkillProfile skill_profile = 1 [json_name = "skillProfile"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder getSkillProfileOrBuilder();

  /**
   * <pre>
   * Inactive skill profile mappings that the requested skill profile has.
   * If the profile's &#64;inactive_as_of_date is nil then the mapping is of inactive profiles to this one.
   * If the profile's &#64;inactive_as_of_date is NOT nil then the mapping is of this profile to an active one.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.GetSkillProfileRes.Mapping mappings = 2 [json_name = "mappings"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.Mapping> 
      getMappingsList();
  /**
   * <pre>
   * Inactive skill profile mappings that the requested skill profile has.
   * If the profile's &#64;inactive_as_of_date is nil then the mapping is of inactive profiles to this one.
   * If the profile's &#64;inactive_as_of_date is NOT nil then the mapping is of this profile to an active one.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.GetSkillProfileRes.Mapping mappings = 2 [json_name = "mappings"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.Mapping getMappings(int index);
  /**
   * <pre>
   * Inactive skill profile mappings that the requested skill profile has.
   * If the profile's &#64;inactive_as_of_date is nil then the mapping is of inactive profiles to this one.
   * If the profile's &#64;inactive_as_of_date is NOT nil then the mapping is of this profile to an active one.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.GetSkillProfileRes.Mapping mappings = 2 [json_name = "mappings"];</code>
   */
  int getMappingsCount();
  /**
   * <pre>
   * Inactive skill profile mappings that the requested skill profile has.
   * If the profile's &#64;inactive_as_of_date is nil then the mapping is of inactive profiles to this one.
   * If the profile's &#64;inactive_as_of_date is NOT nil then the mapping is of this profile to an active one.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.GetSkillProfileRes.Mapping mappings = 2 [json_name = "mappings"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.MappingOrBuilder> 
      getMappingsOrBuilderList();
  /**
   * <pre>
   * Inactive skill profile mappings that the requested skill profile has.
   * If the profile's &#64;inactive_as_of_date is nil then the mapping is of inactive profiles to this one.
   * If the profile's &#64;inactive_as_of_date is NOT nil then the mapping is of this profile to an active one.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.GetSkillProfileRes.Mapping mappings = 2 [json_name = "mappings"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.GetSkillProfileRes.MappingOrBuilder getMappingsOrBuilder(
      int index);
}
