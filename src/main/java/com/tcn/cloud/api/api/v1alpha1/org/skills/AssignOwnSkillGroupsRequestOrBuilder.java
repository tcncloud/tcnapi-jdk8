// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

public interface AssignOwnSkillGroupsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.skills.AssignOwnSkillGroupsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ids of the skill groups to be assigned.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @return A list containing the skillGroupIds.
   */
  java.util.List<java.lang.String>
      getSkillGroupIdsList();
  /**
   * <pre>
   * The ids of the skill groups to be assigned.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @return The count of skillGroupIds.
   */
  int getSkillGroupIdsCount();
  /**
   * <pre>
   * The ids of the skill groups to be assigned.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The skillGroupIds at the given index.
   */
  java.lang.String getSkillGroupIds(int index);
  /**
   * <pre>
   * The ids of the skill groups to be assigned.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the skillGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getSkillGroupIdsBytes(int index);
}
