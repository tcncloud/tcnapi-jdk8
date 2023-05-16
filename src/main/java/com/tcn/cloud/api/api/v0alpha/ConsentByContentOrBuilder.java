// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ConsentByContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ConsentByContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string profile_id = 2 [json_name = "profileId"];</code>
   * @return The profileId.
   */
  java.lang.String getProfileId();
  /**
   * <code>string profile_id = 2 [json_name = "profileId"];</code>
   * @return The bytes for profileId.
   */
  com.google.protobuf.ByteString
      getProfileIdBytes();

  /**
   * <code>string profile_name = 3 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  java.lang.String getProfileName();
  /**
   * <code>string profile_name = 3 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  com.google.protobuf.ByteString
      getProfileNameBytes();

  /**
   * <code>int64 consent_id = 4 [json_name = "consentId"];</code>
   * @return The consentId.
   */
  long getConsentId();

  /**
   * <pre>
   * consent content (phone number, email address, account number, etc.)
   * </pre>
   *
   * <code>string content = 5 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * consent content (phone number, email address, account number, etc.)
   * </pre>
   *
   * <code>string content = 5 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>.google.protobuf.Timestamp revoked = 10 [json_name = "revoked"];</code>
   * @return Whether the revoked field is set.
   */
  boolean hasRevoked();
  /**
   * <code>.google.protobuf.Timestamp revoked = 10 [json_name = "revoked"];</code>
   * @return The revoked.
   */
  com.google.protobuf.Timestamp getRevoked();
  /**
   * <code>.google.protobuf.Timestamp revoked = 10 [json_name = "revoked"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRevokedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp expire = 11 [json_name = "expire"];</code>
   * @return Whether the expire field is set.
   */
  boolean hasExpire();
  /**
   * <code>.google.protobuf.Timestamp expire = 11 [json_name = "expire"];</code>
   * @return The expire.
   */
  com.google.protobuf.Timestamp getExpire();
  /**
   * <code>.google.protobuf.Timestamp expire = 11 [json_name = "expire"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireOrBuilder();

  /**
   * <code>bool disabled = 12 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 13 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.ConsentByContent.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1701
   * @return Whether the channel field is set.
   */
  @java.lang.Deprecated boolean hasChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 13 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.ConsentByContent.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1701
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommType getChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 13 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * topic (future payment vs payment reminder vs account reminders vs receipts)
   * </pre>
   *
   * <code>string topic = 14 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * topic (future payment vs payment reminder vs account reminders vs receipts)
   * </pre>
   *
   * <code>string topic = 14 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 15 [json_name = "conditionDaysOfTheWeek"];</code>
   * @return A list containing the conditionDaysOfTheWeek.
   */
  java.util.List<com.tcn.cloud.api.api.commons.Weekday.Enum> getConditionDaysOfTheWeekList();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 15 [json_name = "conditionDaysOfTheWeek"];</code>
   * @return The count of conditionDaysOfTheWeek.
   */
  int getConditionDaysOfTheWeekCount();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 15 [json_name = "conditionDaysOfTheWeek"];</code>
   * @param index The index of the element to return.
   * @return The conditionDaysOfTheWeek at the given index.
   */
  com.tcn.cloud.api.api.commons.Weekday.Enum getConditionDaysOfTheWeek(int index);
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 15 [json_name = "conditionDaysOfTheWeek"];</code>
   * @return A list containing the enum numeric values on the wire for conditionDaysOfTheWeek.
   */
  java.util.List<java.lang.Integer>
  getConditionDaysOfTheWeekValueList();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 15 [json_name = "conditionDaysOfTheWeek"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of conditionDaysOfTheWeek at the given index.
   */
  int getConditionDaysOfTheWeekValue(int index);

  /**
   * <code>string condition_time_of_day_from = 16 [json_name = "conditionTimeOfDayFrom"];</code>
   * @return The conditionTimeOfDayFrom.
   */
  java.lang.String getConditionTimeOfDayFrom();
  /**
   * <code>string condition_time_of_day_from = 16 [json_name = "conditionTimeOfDayFrom"];</code>
   * @return The bytes for conditionTimeOfDayFrom.
   */
  com.google.protobuf.ByteString
      getConditionTimeOfDayFromBytes();

  /**
   * <code>string condition_time_of_day_to = 17 [json_name = "conditionTimeOfDayTo"];</code>
   * @return The conditionTimeOfDayTo.
   */
  java.lang.String getConditionTimeOfDayTo();
  /**
   * <code>string condition_time_of_day_to = 17 [json_name = "conditionTimeOfDayTo"];</code>
   * @return The bytes for conditionTimeOfDayTo.
   */
  com.google.protobuf.ByteString
      getConditionTimeOfDayToBytes();

  /**
   * <code>.google.protobuf.Timestamp condition_from = 18 [json_name = "conditionFrom"];</code>
   * @return Whether the conditionFrom field is set.
   */
  boolean hasConditionFrom();
  /**
   * <code>.google.protobuf.Timestamp condition_from = 18 [json_name = "conditionFrom"];</code>
   * @return The conditionFrom.
   */
  com.google.protobuf.Timestamp getConditionFrom();
  /**
   * <code>.google.protobuf.Timestamp condition_from = 18 [json_name = "conditionFrom"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getConditionFromOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp condition_to = 19 [json_name = "conditionTo"];</code>
   * @return Whether the conditionTo field is set.
   */
  boolean hasConditionTo();
  /**
   * <code>.google.protobuf.Timestamp condition_to = 19 [json_name = "conditionTo"];</code>
   * @return The conditionTo.
   */
  com.google.protobuf.Timestamp getConditionTo();
  /**
   * <code>.google.protobuf.Timestamp condition_to = 19 [json_name = "conditionTo"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getConditionToOrBuilder();

  /**
   * <code>string notes = 20 [json_name = "notes"];</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <code>string notes = 20 [json_name = "notes"];</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * content_type (call, email, sms, account number)
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 21 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <pre>
   * content_type (call, email, sms, account number)
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 21 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.v0alpha.ConsentCondition conditions = 22 [json_name = "conditions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ConsentCondition> 
      getConditionsList();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.v0alpha.ConsentCondition conditions = 22 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ConsentCondition getConditions(int index);
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.v0alpha.ConsentCondition conditions = 22 [json_name = "conditions"];</code>
   */
  int getConditionsCount();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.v0alpha.ConsentCondition conditions = 22 [json_name = "conditions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ConsentConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.v0alpha.ConsentCondition conditions = 22 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ConsentConditionOrBuilder getConditionsOrBuilder(
      int index);

  /**
   * <code>.api.commons.Channel channel_type = 23 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <code>.api.commons.Channel channel_type = 23 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.Channel getChannelType();
}
