// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

public interface AgentReceiveMessageReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.AgentReceiveMessageReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int64 timestamp = 3 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
