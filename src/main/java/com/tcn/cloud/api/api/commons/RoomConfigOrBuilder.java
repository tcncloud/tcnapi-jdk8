// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/room303.proto

package com.tcn.cloud.api.api.commons;

public interface RoomConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.RoomConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
   * @return The enum numeric value on the wire for addUser.
   */
  int getAddUserValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
   * @return The addUser.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getAddUser();

  /**
   * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
   * @return The enum numeric value on the wire for removeUser.
   */
  int getRemoveUserValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
   * @return The removeUser.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getRemoveUser();

  /**
   * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
   * @return The enum numeric value on the wire for promoteToAdmin.
   */
  int getPromoteToAdminValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
   * @return The promoteToAdmin.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getPromoteToAdmin();

  /**
   * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
   * @return The enum numeric value on the wire for readMessages.
   */
  int getReadMessagesValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
   * @return The readMessages.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getReadMessages();

  /**
   * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
   * @return The enum numeric value on the wire for sendMessage.
   */
  int getSendMessageValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
   * @return The sendMessage.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getSendMessage();

  /**
   * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
   * @return The enum numeric value on the wire for archiveRoom.
   */
  int getArchiveRoomValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
   * @return The archiveRoom.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getArchiveRoom();
}
