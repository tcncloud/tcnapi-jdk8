// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SkillOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Skill)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 level = 1 [json_name = "level"];</code>
   * @return The level.
   */
  long getLevel();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int64 skill_sid = 4 [json_name = "skillSid"];</code>
   * @return The skillSid.
   */
  long getSkillSid();
}
