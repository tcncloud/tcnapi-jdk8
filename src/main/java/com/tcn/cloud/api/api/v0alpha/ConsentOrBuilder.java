// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ConsentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Consent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 consent_id = 1 [json_name = "consentId"];</code>
   * @return The consentId.
   */
  long getConsentId();

  /**
   * <code>string consent_profile_id = 2 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  java.lang.String getConsentProfileId();
  /**
   * <code>string consent_profile_id = 2 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  com.google.protobuf.ByteString
      getConsentProfileIdBytes();

  /**
   * <code>bool deleted = 4 [json_name = "deleted"];</code>
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   * @return Whether the deletedOn field is set.
   */
  boolean hasDeletedOn();
  /**
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   * @return The deletedOn.
   */
  com.google.protobuf.Timestamp getDeletedOn();
  /**
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedOnOrBuilder();

  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string content = 10 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string content = 10 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * date consent granted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp recorded = 11 [json_name = "recorded"];</code>
   * @return Whether the recorded field is set.
   */
  boolean hasRecorded();
  /**
   * <pre>
   * date consent granted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp recorded = 11 [json_name = "recorded"];</code>
   * @return The recorded.
   */
  com.google.protobuf.Timestamp getRecorded();
  /**
   * <pre>
   * date consent granted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp recorded = 11 [json_name = "recorded"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRecordedOrBuilder();

  /**
   * <pre>
   * date consent revoked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revoked = 12 [json_name = "revoked"];</code>
   * @return Whether the revoked field is set.
   */
  boolean hasRevoked();
  /**
   * <pre>
   * date consent revoked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revoked = 12 [json_name = "revoked"];</code>
   * @return The revoked.
   */
  com.google.protobuf.Timestamp getRevoked();
  /**
   * <pre>
   * date consent revoked
   * </pre>
   *
   * <code>.google.protobuf.Timestamp revoked = 12 [json_name = "revoked"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getRevokedOrBuilder();

  /**
   * <pre>
   * expiration of consent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire = 13 [json_name = "expire"];</code>
   * @return Whether the expire field is set.
   */
  boolean hasExpire();
  /**
   * <pre>
   * expiration of consent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire = 13 [json_name = "expire"];</code>
   * @return The expire.
   */
  com.google.protobuf.Timestamp getExpire();
  /**
   * <pre>
   * expiration of consent
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire = 13 [json_name = "expire"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireOrBuilder();

  /**
   * <code>string referring_url = 14 [json_name = "referringUrl"];</code>
   * @return The referringUrl.
   */
  java.lang.String getReferringUrl();
  /**
   * <code>string referring_url = 14 [json_name = "referringUrl"];</code>
   * @return The bytes for referringUrl.
   */
  com.google.protobuf.ByteString
      getReferringUrlBytes();

  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 15 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1358
   * @return Whether the channel field is set.
   */
  @java.lang.Deprecated boolean hasChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 15 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1358
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommType getChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 15 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * topic (future payment vs payment reminder vs account reminders vs receipts)
   * </pre>
   *
   * <code>string topic = 16 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * topic (future payment vs payment reminder vs account reminders vs receipts)
   * </pre>
   *
   * <code>string topic = 16 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * notate revocation (reason)
   * </pre>
   *
   * <code>string revoked_reason = 17 [json_name = "revokedReason"];</code>
   * @return The revokedReason.
   */
  java.lang.String getRevokedReason();
  /**
   * <pre>
   * notate revocation (reason)
   * </pre>
   *
   * <code>string revoked_reason = 17 [json_name = "revokedReason"];</code>
   * @return The bytes for revokedReason.
   */
  com.google.protobuf.ByteString
      getRevokedReasonBytes();

  /**
   * <pre>
   * notate grant reason
   * </pre>
   *
   * <code>string granted_reason = 18 [json_name = "grantedReason"];</code>
   * @return The grantedReason.
   */
  java.lang.String getGrantedReason();
  /**
   * <pre>
   * notate grant reason
   * </pre>
   *
   * <code>string granted_reason = 18 [json_name = "grantedReason"];</code>
   * @return The bytes for grantedReason.
   */
  com.google.protobuf.ByteString
      getGrantedReasonBytes();

  /**
   * <pre>
   * proof of consent (pdf, voice recording etc) this will be filename which can be retrieved via matrix-fts
   * </pre>
   *
   * <code>string proof = 19 [json_name = "proof"];</code>
   * @return The proof.
   */
  java.lang.String getProof();
  /**
   * <pre>
   * proof of consent (pdf, voice recording etc) this will be filename which can be retrieved via matrix-fts
   * </pre>
   *
   * <code>string proof = 19 [json_name = "proof"];</code>
   * @return The bytes for proof.
   */
  com.google.protobuf.ByteString
      getProofBytes();

  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 20 [json_name = "conditionDaysOfTheWeek", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_days_of_the_week is deprecated.
   *     See api/v0alpha/compliance.proto;l=1368
   * @return A list containing the conditionDaysOfTheWeek.
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.commons.Weekday.Enum> getConditionDaysOfTheWeekList();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 20 [json_name = "conditionDaysOfTheWeek", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_days_of_the_week is deprecated.
   *     See api/v0alpha/compliance.proto;l=1368
   * @return The count of conditionDaysOfTheWeek.
   */
  @java.lang.Deprecated int getConditionDaysOfTheWeekCount();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 20 [json_name = "conditionDaysOfTheWeek", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_days_of_the_week is deprecated.
   *     See api/v0alpha/compliance.proto;l=1368
   * @param index The index of the element to return.
   * @return The conditionDaysOfTheWeek at the given index.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.Weekday.Enum getConditionDaysOfTheWeek(int index);
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 20 [json_name = "conditionDaysOfTheWeek", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_days_of_the_week is deprecated.
   *     See api/v0alpha/compliance.proto;l=1368
   * @return A list containing the enum numeric values on the wire for conditionDaysOfTheWeek.
   */
  @java.lang.Deprecated java.util.List<java.lang.Integer>
  getConditionDaysOfTheWeekValueList();
  /**
   * <pre>
   * consent conditions
   * </pre>
   *
   * <code>repeated .api.commons.Weekday.Enum condition_days_of_the_week = 20 [json_name = "conditionDaysOfTheWeek", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_days_of_the_week is deprecated.
   *     See api/v0alpha/compliance.proto;l=1368
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of conditionDaysOfTheWeek at the given index.
   */
  @java.lang.Deprecated int getConditionDaysOfTheWeekValue(int index);

  /**
   * <code>string condition_time_of_day_from = 21 [json_name = "conditionTimeOfDayFrom", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_time_of_day_from is deprecated.
   *     See api/v0alpha/compliance.proto;l=1369
   * @return The conditionTimeOfDayFrom.
   */
  @java.lang.Deprecated java.lang.String getConditionTimeOfDayFrom();
  /**
   * <code>string condition_time_of_day_from = 21 [json_name = "conditionTimeOfDayFrom", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_time_of_day_from is deprecated.
   *     See api/v0alpha/compliance.proto;l=1369
   * @return The bytes for conditionTimeOfDayFrom.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getConditionTimeOfDayFromBytes();

  /**
   * <code>string condition_time_of_day_to = 22 [json_name = "conditionTimeOfDayTo", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_time_of_day_to is deprecated.
   *     See api/v0alpha/compliance.proto;l=1370
   * @return The conditionTimeOfDayTo.
   */
  @java.lang.Deprecated java.lang.String getConditionTimeOfDayTo();
  /**
   * <code>string condition_time_of_day_to = 22 [json_name = "conditionTimeOfDayTo", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_time_of_day_to is deprecated.
   *     See api/v0alpha/compliance.proto;l=1370
   * @return The bytes for conditionTimeOfDayTo.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getConditionTimeOfDayToBytes();

  /**
   * <code>.google.protobuf.Timestamp condition_from = 23 [json_name = "conditionFrom", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_from is deprecated.
   *     See api/v0alpha/compliance.proto;l=1371
   * @return Whether the conditionFrom field is set.
   */
  @java.lang.Deprecated boolean hasConditionFrom();
  /**
   * <code>.google.protobuf.Timestamp condition_from = 23 [json_name = "conditionFrom", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_from is deprecated.
   *     See api/v0alpha/compliance.proto;l=1371
   * @return The conditionFrom.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getConditionFrom();
  /**
   * <code>.google.protobuf.Timestamp condition_from = 23 [json_name = "conditionFrom", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getConditionFromOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp condition_to = 24 [json_name = "conditionTo", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_to is deprecated.
   *     See api/v0alpha/compliance.proto;l=1372
   * @return Whether the conditionTo field is set.
   */
  @java.lang.Deprecated boolean hasConditionTo();
  /**
   * <code>.google.protobuf.Timestamp condition_to = 24 [json_name = "conditionTo", deprecated = true];</code>
   * @deprecated api.v0alpha.Consent.condition_to is deprecated.
   *     See api/v0alpha/compliance.proto;l=1372
   * @return The conditionTo.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getConditionTo();
  /**
   * <code>.google.protobuf.Timestamp condition_to = 24 [json_name = "conditionTo", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getConditionToOrBuilder();

  /**
   * <code>string notes = 25 [json_name = "notes"];</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <code>string notes = 25 [json_name = "notes"];</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.commons.ConsentCondition conditions = 26 [json_name = "conditions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ConsentCondition> 
      getConditionsList();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.commons.ConsentCondition conditions = 26 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.commons.ConsentCondition getConditions(int index);
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.commons.ConsentCondition conditions = 26 [json_name = "conditions"];</code>
   */
  int getConditionsCount();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.commons.ConsentCondition conditions = 26 [json_name = "conditions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ConsentConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <pre>
   * Consent Conditions
   * </pre>
   *
   * <code>repeated .api.commons.ConsentCondition conditions = 26 [json_name = "conditions"];</code>
   */
  com.tcn.cloud.api.api.commons.ConsentConditionOrBuilder getConditionsOrBuilder(
      int index);

  /**
   * <pre>
   * content_type (call, email, sms, account number)
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 27 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <pre>
   * content_type (call, email, sms, account number)
   * </pre>
   *
   * <code>.api.commons.ContentType content_type = 27 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <code>.api.commons.Channel channel_type = 28 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <code>.api.commons.Channel channel_type = 28 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.Channel getChannelType();
}
