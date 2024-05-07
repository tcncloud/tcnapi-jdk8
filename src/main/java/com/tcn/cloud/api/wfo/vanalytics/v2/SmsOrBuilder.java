// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface SmsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Sms)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the sms conversation.
   * </pre>
   *
   * <code>int64 conversation_sid = 1 [json_name = "conversationSid", jstype = JS_STRING];</code>
   * @return The conversationSid.
   */
  long getConversationSid();

  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Sms.Thread threads = 2 [json_name = "threads"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.Sms.Thread> 
      getThreadsList();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Sms.Thread threads = 2 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms.Thread getThreads(int index);
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Sms.Thread threads = 2 [json_name = "threads"];</code>
   */
  int getThreadsCount();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Sms.Thread threads = 2 [json_name = "threads"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.Sms.ThreadOrBuilder> 
      getThreadsOrBuilderList();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Sms.Thread threads = 2 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms.ThreadOrBuilder getThreadsOrBuilder(
      int index);

  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms.Phone phone = 3 [json_name = "phone"];</code>
   * @return Whether the phone field is set.
   */
  boolean hasPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms.Phone phone = 3 [json_name = "phone"];</code>
   * @return The phone.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms.Phone getPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Sms.Phone phone = 3 [json_name = "phone"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms.PhoneOrBuilder getPhoneOrBuilder();

  /**
   * <pre>
   * The phone number of the agent.
   * </pre>
   *
   * <code>string caller_id = 4 [json_name = "callerId"];</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <pre>
   * The phone number of the agent.
   * </pre>
   *
   * <code>string caller_id = 4 [json_name = "callerId"];</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();

  /**
   * <pre>
   * The omni campain this sms belongs to.
   * </pre>
   *
   * <code>int64 campaign_sid = 5 [json_name = "campaignSid"];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();
}
