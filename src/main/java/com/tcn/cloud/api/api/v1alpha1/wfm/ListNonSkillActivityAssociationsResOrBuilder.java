// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListNonSkillActivityAssociationsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @return A list containing the nonSkillActivitySids.
   */
  java.util.List<java.lang.Long> getNonSkillActivitySidsList();
  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @return The count of nonSkillActivitySids.
   */
  int getNonSkillActivitySidsCount();
  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @param index The index of the element to return.
   * @return The nonSkillActivitySids at the given index.
   */
  long getNonSkillActivitySids(int index);
}
