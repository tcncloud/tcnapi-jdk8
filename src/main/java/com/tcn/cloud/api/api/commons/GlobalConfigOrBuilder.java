// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/room303.proto

package com.tcn.cloud.api.api.commons;

public interface GlobalConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.GlobalConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.ConfigPermissionEnum create_room = 1 [json_name = "createRoom"];</code>
   * @return The enum numeric value on the wire for createRoom.
   */
  int getCreateRoomValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum create_room = 1 [json_name = "createRoom"];</code>
   * @return The createRoom.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getCreateRoom();

  /**
   * <code>.api.commons.ConfigPermissionEnum join_existing_room = 2 [json_name = "joinExistingRoom"];</code>
   * @return The enum numeric value on the wire for joinExistingRoom.
   */
  int getJoinExistingRoomValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum join_existing_room = 2 [json_name = "joinExistingRoom"];</code>
   * @return The joinExistingRoom.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getJoinExistingRoom();

  /**
   * <code>.api.commons.ConfigPermissionEnum send_message_to_supervisor = 3 [json_name = "sendMessageToSupervisor"];</code>
   * @return The enum numeric value on the wire for sendMessageToSupervisor.
   */
  int getSendMessageToSupervisorValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum send_message_to_supervisor = 3 [json_name = "sendMessageToSupervisor"];</code>
   * @return The sendMessageToSupervisor.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getSendMessageToSupervisor();

  /**
   * <code>.api.commons.ConfigPermissionEnum send_message_to_non_supervisor = 4 [json_name = "sendMessageToNonSupervisor"];</code>
   * @return The enum numeric value on the wire for sendMessageToNonSupervisor.
   */
  int getSendMessageToNonSupervisorValue();
  /**
   * <code>.api.commons.ConfigPermissionEnum send_message_to_non_supervisor = 4 [json_name = "sendMessageToNonSupervisor"];</code>
   * @return The sendMessageToNonSupervisor.
   */
  com.tcn.cloud.api.api.commons.ConfigPermissionEnum getSendMessageToNonSupervisor();
}