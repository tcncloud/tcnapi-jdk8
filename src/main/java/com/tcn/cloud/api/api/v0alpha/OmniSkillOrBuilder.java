// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface OmniSkillOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.OmniSkill)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * region
   * </pre>
   *
   * <code>string region = 1 [json_name = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * region
   * </pre>
   *
   * <code>string region = 1 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * p3 id
   * </pre>
   *
   * <code>string p3_id = 2 [json_name = "p3Id"];</code>
   * @return The p3Id.
   */
  java.lang.String getP3Id();
  /**
   * <pre>
   * p3 id
   * </pre>
   *
   * <code>string p3_id = 2 [json_name = "p3Id"];</code>
   * @return The bytes for p3Id.
   */
  com.google.protobuf.ByteString
      getP3IdBytes();

  /**
   * <pre>
   * skill name
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * skill name
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * skill description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * skill description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.api.commons.SkillType.Enum type = 5 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.api.commons.SkillType.Enum type = 5 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.SkillType.Enum getType();
}
