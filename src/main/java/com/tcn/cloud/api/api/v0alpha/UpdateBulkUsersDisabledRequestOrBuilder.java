// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateBulkUsersDisabledRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateBulkUsersDisabledRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  java.util.List<java.lang.String>
      getUserIdsList();
  /**
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  int getUserIdsCount();
  /**
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  java.lang.String getUserIds(int index);
  /**
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  com.google.protobuf.ByteString
      getUserIdsBytes(int index);

  /**
   * <pre>
   * directly into User.login_disabled for every given user.
   * </pre>
   *
   * <code>bool disable = 2 [json_name = "disable"];</code>
   * @return The disable.
   */
  boolean getDisable();
}
