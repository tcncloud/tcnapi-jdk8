// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface Room303DestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.Room303Destination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * which room or user to sned the file to
   * </pre>
   *
   * <code>string room = 1 [json_name = "room"];</code>
   * @return The room.
   */
  java.lang.String getRoom();
  /**
   * <pre>
   * which room or user to sned the file to
   * </pre>
   *
   * <code>string room = 1 [json_name = "room"];</code>
   * @return The bytes for room.
   */
  com.google.protobuf.ByteString
      getRoomBytes();

  /**
   * <pre>
   * will lookup user_sid through org if not provided
   * username of the intended user
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * will lookup user_sid through org if not provided
   * username of the intended user
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * user_id of the intended user
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * user_id of the intended user
   * </pre>
   *
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}
