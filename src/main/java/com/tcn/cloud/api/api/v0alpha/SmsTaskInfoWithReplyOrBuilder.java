// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsTaskInfoWithReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsTaskInfoWithReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   * @return Whether the smsTaskInfoRes field is set.
   */
  boolean hasSmsTaskInfoRes();
  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   * @return The smsTaskInfoRes.
   */
  com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes getSmsTaskInfoRes();
  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder getSmsTaskInfoResOrBuilder();

  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> 
      getSmsReceivedRepliesList();
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies getSmsReceivedReplies(int index);
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  int getSmsReceivedRepliesCount();
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder> 
      getSmsReceivedRepliesOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder getSmsReceivedRepliesOrBuilder(
      int index);
}
