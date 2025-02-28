// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelFinishWrapUpEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelFinishWrapUpEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique identifier for the conversation
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * the campaign identifier the event is associated with
   * </pre>
   *
   * <code>int64 campaign_sid = 2 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * the channel type i.e. chat|email|sms|etc.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 3 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * the channel type i.e. chat|email|sms|etc.
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 3 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 4 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 4 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  com.tcn.cloud.api.api.commons.OmniConversation getConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 4 [json_name = "conversation"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder();

  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 5 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 5 [json_name = "message"];</code>
   * @return The message.
   */
  com.tcn.cloud.api.api.commons.OmniMessage getMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 5 [json_name = "message"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * AsmSessionSid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 6 [json_name = "asmSessionSid"];</code>
   * @return Whether the asmSessionSid field is set.
   */
  boolean hasAsmSessionSid();
  /**
   * <pre>
   * AsmSessionSid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 6 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  com.google.protobuf.Int64Value getAsmSessionSid();
  /**
   * <pre>
   * AsmSessionSid
   * </pre>
   *
   * <code>.google.protobuf.Int64Value asm_session_sid = 6 [json_name = "asmSessionSid"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAsmSessionSidOrBuilder();

  /**
   * <pre>
   * customer name
   * </pre>
   *
   * <code>string customer_name = 7 [json_name = "customerName"];</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <pre>
   * customer name
   * </pre>
   *
   * <code>string customer_name = 7 [json_name = "customerName"];</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();
}
