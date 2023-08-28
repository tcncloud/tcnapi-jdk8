// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

public interface SetConversationCollectedDataReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.asm.SetConversationCollectedDataReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * conversation_id
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * channel type - email|sms|chat|voice
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * channel type - email|sms|chat|voice
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * collected data - key/value
   * </pre>
   *
   * <code>map&lt;string, string&gt; collected_data = 3 [json_name = "collectedData"];</code>
   */
  int getCollectedDataCount();
  /**
   * <pre>
   * collected data - key/value
   * </pre>
   *
   * <code>map&lt;string, string&gt; collected_data = 3 [json_name = "collectedData"];</code>
   */
  boolean containsCollectedData(
      java.lang.String key);
  /**
   * Use {@link #getCollectedDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCollectedData();
  /**
   * <pre>
   * collected data - key/value
   * </pre>
   *
   * <code>map&lt;string, string&gt; collected_data = 3 [json_name = "collectedData"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCollectedDataMap();
  /**
   * <pre>
   * collected data - key/value
   * </pre>
   *
   * <code>map&lt;string, string&gt; collected_data = 3 [json_name = "collectedData"];</code>
   */
  /* nullable */
java.lang.String getCollectedDataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * collected data - key/value
   * </pre>
   *
   * <code>map&lt;string, string&gt; collected_data = 3 [json_name = "collectedData"];</code>
   */
  java.lang.String getCollectedDataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * asm session sid
   * </pre>
   *
   * <code>int64 asm_session_sid = 4 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  long getAsmSessionSid();
}
