// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/message.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public interface StreamMessageUpdatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.room303.StreamMessageUpdatesRequest)
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
   * <code>string member_id = 2 [json_name = "memberId"];</code>
   * @return The memberId.
   */
  java.lang.String getMemberId();
  /**
   * <code>string member_id = 2 [json_name = "memberId"];</code>
   * @return The bytes for memberId.
   */
  com.google.protobuf.ByteString
      getMemberIdBytes();
}
