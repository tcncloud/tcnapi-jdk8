// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/member.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public interface GetRoomMemberRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.room303.GetRoomMemberRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string room_id = 2 [json_name = "roomId"];</code>
   * @return The roomId.
   */
  java.lang.String getRoomId();
  /**
   * <code>string room_id = 2 [json_name = "roomId"];</code>
   * @return The bytes for roomId.
   */
  com.google.protobuf.ByteString
      getRoomIdBytes();

  /**
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
