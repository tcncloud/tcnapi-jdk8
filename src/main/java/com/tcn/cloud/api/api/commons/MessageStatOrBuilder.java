// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/room303.proto

package com.tcn.cloud.api.api.commons;

public interface MessageStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.MessageStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string room_id = 1 [json_name = "roomId"];</code>
   * @return The roomId.
   */
  java.lang.String getRoomId();
  /**
   * <code>string room_id = 1 [json_name = "roomId"];</code>
   * @return The bytes for roomId.
   */
  com.google.protobuf.ByteString
      getRoomIdBytes();

  /**
   * <code>int32 unread_messages = 2 [json_name = "unreadMessages"];</code>
   * @return The unreadMessages.
   */
  int getUnreadMessages();
}
