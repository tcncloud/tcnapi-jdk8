// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/skill_group.proto

package com.tcn.cloud.api.api.commons.org;

public interface SkillSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.SkillSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The proficiency of the skill as a percent [1,100].
   * </pre>
   *
   * <code>int32 proficiency = 2 [json_name = "proficiency"];</code>
   * @return The proficiency.
   */
  int getProficiency();

  /**
   * <pre>
   * The sid of the skill
   * </pre>
   *
   * <code>int64 skill_sid = 3 [json_name = "skillSid"];</code>
   * @return The skillSid.
   */
  long getSkillSid();
}