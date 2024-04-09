// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniDataMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniDataMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Data for flows, should always be json
   * </pre>
   *
   * <code>string message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Data for flows, should always be json
   * </pre>
   *
   * <code>string message = 1 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * Message id of the html form this is in reply to
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The messageId.
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   * Message id of the html form this is in reply to
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The bytes for messageId.
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();
}
