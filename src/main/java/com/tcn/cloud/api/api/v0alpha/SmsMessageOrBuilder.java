// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 sms_message_sid = 1 [json_name = "smsMessageSid"];</code>
   * @return The smsMessageSid.
   */
  long getSmsMessageSid();

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
}
