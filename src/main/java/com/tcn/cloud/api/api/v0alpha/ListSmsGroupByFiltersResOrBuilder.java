// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListSmsGroupByFiltersResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListSmsGroupByFiltersRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> 
      getSmsGroupWithIntentsList();
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents getSmsGroupWithIntents(int index);
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  int getSmsGroupWithIntentsCount();
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder> 
      getSmsGroupWithIntentsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder getSmsGroupWithIntentsOrBuilder(
      int index);
}
