// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

public interface OmnichannelManagerTextMessageEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.audit.OmnichannelManagerTextMessageEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique identifier for the conversation
   * </pre>
   *
   * <code>int64 conversation_sid = 3 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   * @return The message.
   */
  com.tcn.cloud.api.api.commons.OmniMessage getMessage();
  /**
   * <pre>
   * the message sent by the agent
   * </pre>
   *
   * <code>.api.commons.OmniMessage message = 4 [json_name = "message"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   * @return The conversation.
   */
  com.tcn.cloud.api.api.commons.OmniConversation getConversation();
  /**
   * <pre>
   * conversation this message belongs to
   * </pre>
   *
   * <code>.api.commons.OmniConversation conversation = 5 [json_name = "conversation"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationOrBuilder getConversationOrBuilder();
}
