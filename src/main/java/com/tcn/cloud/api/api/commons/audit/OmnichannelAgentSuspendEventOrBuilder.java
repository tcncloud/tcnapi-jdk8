// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelAgentSuspendEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelAgentSuspendEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the suspend message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the suspend message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   * @return The message.
   */
  com.tcn.cloud.api.api.commons.OmniMessage getMessage();
  /**
   * <pre>
   * the suspend message
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 1 [json_name = "message"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  com.tcn.cloud.api.api.commons.OmniConversation getConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 2 [json_name = "conversation"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * asm Session sid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 3 [json_name = "asmSessionSid"];</code>
   * @return Whether the asmSessionSid field is set.
   */
  boolean hasAsmSessionSid();
  /**
   * <pre>
   * asm Session sid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 3 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  com.google.protobuf.Int64Value getAsmSessionSid();
  /**
   * <pre>
   * asm Session sid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 3 [json_name = "asmSessionSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAsmSessionSidOrBuilder();

  /**
   * <pre>
   * customer name
   * </pre>
   *
   * <code>string customer_name = 4 [json_name = "customerName"];</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <pre>
   * customer name
   * </pre>
   *
   * <code>string customer_name = 4 [json_name = "customerName"];</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();
}
