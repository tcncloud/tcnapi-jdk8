// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateHuntGroupGeneralDetailsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateHuntGroupGeneralDetailsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The hunt group sid.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * The hunt group name.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The hunt group name.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The hunt group description.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The hunt group description.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The hunt group type.
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupType type = 4 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The hunt group type.
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupType type = 4 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.org.HuntGroupType getType();
}
