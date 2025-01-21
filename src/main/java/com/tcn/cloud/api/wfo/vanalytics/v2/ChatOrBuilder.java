// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ChatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Chat)
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
   * <code>repeated .wfo.vanalytics.v2.Chat.Thread threads = 2 [json_name = "threads"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.Chat.Thread> 
      getThreadsList();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Chat.Thread threads = 2 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.Thread getThreads(int index);
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Chat.Thread threads = 2 [json_name = "threads"];</code>
   */
  int getThreadsCount();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Chat.Thread threads = 2 [json_name = "threads"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.Chat.ThreadOrBuilder> 
      getThreadsOrBuilderList();
  /**
   * <pre>
   * The text from the sms in threads.
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.Chat.Thread threads = 2 [json_name = "threads"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.ThreadOrBuilder getThreadsOrBuilder(
      int index);

  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Phone phone = 3 [json_name = "phone"];</code>
   * @return Whether the phone field is set.
   */
  boolean hasPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Phone phone = 3 [json_name = "phone"];</code>
   * @return The phone.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.Phone getPhone();
  /**
   * <pre>
   * The phone data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Phone phone = 3 [json_name = "phone"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.PhoneOrBuilder getPhoneOrBuilder();

  /**
   * <pre>
   * The email data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Email email = 4 [json_name = "email"];</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <pre>
   * The email data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Email email = 4 [json_name = "email"];</code>
   * @return The email.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.Email getEmail();
  /**
   * <pre>
   * The email data.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Chat.Email email = 4 [json_name = "email"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Chat.EmailOrBuilder getEmailOrBuilder();

  /**
   * <pre>
   * The customer name.
   * </pre>
   *
   * <code>string customer_name = 5 [json_name = "customerName"];</code>
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   * <pre>
   * The customer name.
   * </pre>
   *
   * <code>string customer_name = 5 [json_name = "customerName"];</code>
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString
      getCustomerNameBytes();

  /**
   * <pre>
   * The omni campain this sms belongs to.
   * </pre>
   *
   * <code>int64 campaign_sid = 6 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();
}
