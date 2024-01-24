// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

public interface SIPAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.pbx.v2.SIPAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sip_id = 1 [json_name = "sipId"];</code>
   * @return The sipId.
   */
  java.lang.String getSipId();
  /**
   * <code>string sip_id = 1 [json_name = "sipId"];</code>
   * @return The bytes for sipId.
   */
  com.google.protobuf.ByteString
      getSipIdBytes();

  /**
   * <code>bool is_active = 2 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  boolean getIsActive();

  /**
   * <code>string extension = 3 [json_name = "extension"];</code>
   * @return The extension.
   */
  java.lang.String getExtension();
  /**
   * <code>string extension = 3 [json_name = "extension"];</code>
   * @return The bytes for extension.
   */
  com.google.protobuf.ByteString
      getExtensionBytes();

  /**
   * <code>repeated string ring_group_ids = 4 [json_name = "ringGroupIds"];</code>
   * @return A list containing the ringGroupIds.
   */
  java.util.List<java.lang.String>
      getRingGroupIdsList();
  /**
   * <code>repeated string ring_group_ids = 4 [json_name = "ringGroupIds"];</code>
   * @return The count of ringGroupIds.
   */
  int getRingGroupIdsCount();
  /**
   * <code>repeated string ring_group_ids = 4 [json_name = "ringGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The ringGroupIds at the given index.
   */
  java.lang.String getRingGroupIds(int index);
  /**
   * <code>repeated string ring_group_ids = 4 [json_name = "ringGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ringGroupIds at the given index.
   */
  com.google.protobuf.ByteString
      getRingGroupIdsBytes(int index);
}