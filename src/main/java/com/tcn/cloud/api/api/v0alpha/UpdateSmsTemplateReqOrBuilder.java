// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateSmsTemplateReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateSmsTemplateReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 sms_template_sid = 1 [json_name = "smsTemplateSid"];</code>
   * @return The smsTemplateSid.
   */
  long getSmsTemplateSid();

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
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @return A list containing the smsIntentTemplateSid.
   */
  java.util.List<java.lang.Long> getSmsIntentTemplateSidList();
  /**
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @return The count of smsIntentTemplateSid.
   */
  int getSmsIntentTemplateSidCount();
  /**
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @param index The index of the element to return.
   * @return The smsIntentTemplateSid at the given index.
   */
  long getSmsIntentTemplateSid(int index);
}
