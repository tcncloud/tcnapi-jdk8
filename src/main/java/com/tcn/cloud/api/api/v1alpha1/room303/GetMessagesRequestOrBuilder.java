// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/room303/message.proto

package com.tcn.cloud.api.api.v1alpha1.room303;

public interface GetMessagesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.room303.GetMessagesRequest)
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
   * <code>.google.protobuf.Timestamp offset = 3 [json_name = "offset"];</code>
   * @return Whether the offset field is set.
   */
  boolean hasOffset();
  /**
   * <code>.google.protobuf.Timestamp offset = 3 [json_name = "offset"];</code>
   * @return The offset.
   */
  com.google.protobuf.Timestamp getOffset();
  /**
   * <code>.google.protobuf.Timestamp offset = 3 [json_name = "offset"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getOffsetOrBuilder();
}
