// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListSmsNumbersResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListSmsNumbersRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.SmsNumber> 
      getSmsNumbersList();
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  com.tcn.cloud.api.api.commons.SmsNumber getSmsNumbers(int index);
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  int getSmsNumbersCount();
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SmsNumberOrBuilder> 
      getSmsNumbersOrBuilderList();
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  com.tcn.cloud.api.api.commons.SmsNumberOrBuilder getSmsNumbersOrBuilder(
      int index);
}
