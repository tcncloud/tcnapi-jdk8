// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface SkillsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Skills)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string skill_id = 1 [json_name = "skillId"];</code>
   * @return The skillId.
   */
  java.lang.String getSkillId();
  /**
   * <code>string skill_id = 1 [json_name = "skillId"];</code>
   * @return The bytes for skillId.
   */
  com.google.protobuf.ByteString
      getSkillIdBytes();

  /**
   * <pre>
   * Mandatory = 1, Preferred = 2
   * </pre>
   *
   * <code>int64 mandatory_preferred = 2 [json_name = "mandatoryPreferred"];</code>
   * @return The mandatoryPreferred.
   */
  long getMandatoryPreferred();
}
