// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ConsentExportProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ConsentExportProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies which record field is the content
   * </pre>
   *
   * <code>string content_field = 3 [json_name = "contentField"];</code>
   * @return The contentField.
   */
  java.lang.String getContentField();
  /**
   * <pre>
   * Specifies which record field is the content
   * </pre>
   *
   * <code>string content_field = 3 [json_name = "contentField"];</code>
   * @return The bytes for contentField.
   */
  com.google.protobuf.ByteString
      getContentFieldBytes();

  /**
   * <pre>
   * Profile to use
   * </pre>
   *
   * <code>string consent_profile = 4 [json_name = "consentProfile"];</code>
   * @return The consentProfile.
   */
  java.lang.String getConsentProfile();
  /**
   * <pre>
   * Profile to use
   * </pre>
   *
   * <code>string consent_profile = 4 [json_name = "consentProfile"];</code>
   * @return The bytes for consentProfile.
   */
  com.google.protobuf.ByteString
      getConsentProfileBytes();

  /**
   * <pre>
   * Profile ID of profile to use
   * </pre>
   *
   * <code>string consent_profile_id = 5 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  java.lang.String getConsentProfileId();
  /**
   * <pre>
   * Profile ID of profile to use
   * </pre>
   *
   * <code>string consent_profile_id = 5 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  com.google.protobuf.ByteString
      getConsentProfileIdBytes();

  /**
   * <pre>
   * Run as test, disabled, or normal
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The enum numeric value on the wire for runType.
   */
  int getRunTypeValue();
  /**
   * <pre>
   * Run as test, disabled, or normal
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The runType.
   */
  com.tcn.cloud.api.api.commons.RunType getRunType();

  /**
   * <pre>
   * Type of consent action to do: ADD/REVOKE
   * </pre>
   *
   * <code>.api.commons.ConsentActionType action = 7 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * Type of consent action to do: ADD/REVOKE
   * </pre>
   *
   * <code>.api.commons.ConsentActionType action = 7 [json_name = "action"];</code>
   * @return The action.
   */
  com.tcn.cloud.api.api.commons.ConsentActionType getAction();

  /**
   * <pre>
   * Field name or literal value for referring url when creating consent
   * </pre>
   *
   * <code>string referring_url = 8 [json_name = "referringUrl"];</code>
   * @return The referringUrl.
   */
  java.lang.String getReferringUrl();
  /**
   * <pre>
   * Field name or literal value for referring url when creating consent
   * </pre>
   *
   * <code>string referring_url = 8 [json_name = "referringUrl"];</code>
   * @return The bytes for referringUrl.
   */
  com.google.protobuf.ByteString
      getReferringUrlBytes();

  /**
   * <pre>
   * Field name or literal value for topic when creating consent
   * </pre>
   *
   * <code>string topic = 9 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * Field name or literal value for topic when creating consent
   * </pre>
   *
   * <code>string topic = 9 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Field name or literal value for revoked reason when creating consent
   * </pre>
   *
   * <code>string revoked_reason = 10 [json_name = "revokedReason"];</code>
   * @return The revokedReason.
   */
  java.lang.String getRevokedReason();
  /**
   * <pre>
   * Field name or literal value for revoked reason when creating consent
   * </pre>
   *
   * <code>string revoked_reason = 10 [json_name = "revokedReason"];</code>
   * @return The bytes for revokedReason.
   */
  com.google.protobuf.ByteString
      getRevokedReasonBytes();

  /**
   * <pre>
   * Field name or literal value for granted reason when creating consent
   * </pre>
   *
   * <code>string granted_reason = 11 [json_name = "grantedReason"];</code>
   * @return The grantedReason.
   */
  java.lang.String getGrantedReason();
  /**
   * <pre>
   * Field name or literal value for granted reason when creating consent
   * </pre>
   *
   * <code>string granted_reason = 11 [json_name = "grantedReason"];</code>
   * @return The bytes for grantedReason.
   */
  com.google.protobuf.ByteString
      getGrantedReasonBytes();

  /**
   * <pre>
   * Field name or literal value for proof when creating consent
   * </pre>
   *
   * <code>string proof = 12 [json_name = "proof"];</code>
   * @return The proof.
   */
  java.lang.String getProof();
  /**
   * <pre>
   * Field name or literal value for proof when creating consent
   * </pre>
   *
   * <code>string proof = 12 [json_name = "proof"];</code>
   * @return The bytes for proof.
   */
  com.google.protobuf.ByteString
      getProofBytes();

  /**
   * <pre>
   * Field name or literal value for "condition time of day from" when creating consent
   * </pre>
   *
   * <code>string condition_time_of_day_from = 13 [json_name = "conditionTimeOfDayFrom"];</code>
   * @return The conditionTimeOfDayFrom.
   */
  java.lang.String getConditionTimeOfDayFrom();
  /**
   * <pre>
   * Field name or literal value for "condition time of day from" when creating consent
   * </pre>
   *
   * <code>string condition_time_of_day_from = 13 [json_name = "conditionTimeOfDayFrom"];</code>
   * @return The bytes for conditionTimeOfDayFrom.
   */
  com.google.protobuf.ByteString
      getConditionTimeOfDayFromBytes();

  /**
   * <pre>
   * Field name or literal value for "condition time of day to" when creating consent
   * </pre>
   *
   * <code>string condition_time_of_day_to = 14 [json_name = "conditionTimeOfDayTo"];</code>
   * @return The conditionTimeOfDayTo.
   */
  java.lang.String getConditionTimeOfDayTo();
  /**
   * <pre>
   * Field name or literal value for "condition time of day to" when creating consent
   * </pre>
   *
   * <code>string condition_time_of_day_to = 14 [json_name = "conditionTimeOfDayTo"];</code>
   * @return The bytes for conditionTimeOfDayTo.
   */
  com.google.protobuf.ByteString
      getConditionTimeOfDayToBytes();

  /**
   * <pre>
   * Field name or literal value for notes when creating consent
   * </pre>
   *
   * <code>string notes = 15 [json_name = "notes"];</code>
   * @return The notes.
   */
  java.lang.String getNotes();
  /**
   * <pre>
   * Field name or literal value for notes when creating consent
   * </pre>
   *
   * <code>string notes = 15 [json_name = "notes"];</code>
   * @return The bytes for notes.
   */
  com.google.protobuf.ByteString
      getNotesBytes();

  /**
   * <pre>
   * Field name for expire timestamp when creating consent
   * replaced by expiration
   * </pre>
   *
   * <code>string expire = 16 [json_name = "expire", deprecated = true];</code>
   * @deprecated api.v0alpha.ConsentExportProcess.expire is deprecated.
   *     See api/v0alpha/lms.proto;l=1330
   * @return The expire.
   */
  @java.lang.Deprecated java.lang.String getExpire();
  /**
   * <pre>
   * Field name for expire timestamp when creating consent
   * replaced by expiration
   * </pre>
   *
   * <code>string expire = 16 [json_name = "expire", deprecated = true];</code>
   * @deprecated api.v0alpha.ConsentExportProcess.expire is deprecated.
   *     See api/v0alpha/lms.proto;l=1330
   * @return The bytes for expire.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getExpireBytes();

  /**
   * <pre>
   * Field name for "condition from" timestamp when creating consent
   * </pre>
   *
   * <code>string condition_from = 17 [json_name = "conditionFrom"];</code>
   * @return The conditionFrom.
   */
  java.lang.String getConditionFrom();
  /**
   * <pre>
   * Field name for "condition from" timestamp when creating consent
   * </pre>
   *
   * <code>string condition_from = 17 [json_name = "conditionFrom"];</code>
   * @return The bytes for conditionFrom.
   */
  com.google.protobuf.ByteString
      getConditionFromBytes();

  /**
   * <pre>
   * Field name for "condition to" timestamp when creating consent
   * </pre>
   *
   * <code>string condition_to = 18 [json_name = "conditionTo"];</code>
   * @return The conditionTo.
   */
  java.lang.String getConditionTo();
  /**
   * <pre>
   * Field name for "condition to" timestamp when creating consent
   * </pre>
   *
   * <code>string condition_to = 18 [json_name = "conditionTo"];</code>
   * @return The bytes for conditionTo.
   */
  com.google.protobuf.ByteString
      getConditionToBytes();

  /**
   * <code>.api.commons.ContentType content_type_val = 27 [json_name = "contentTypeVal"];</code>
   * @return Whether the contentTypeVal field is set.
   */
  boolean hasContentTypeVal();
  /**
   * <code>.api.commons.ContentType content_type_val = 27 [json_name = "contentTypeVal"];</code>
   * @return The enum numeric value on the wire for contentTypeVal.
   */
  int getContentTypeValValue();
  /**
   * <code>.api.commons.ContentType content_type_val = 27 [json_name = "contentTypeVal"];</code>
   * @return The contentTypeVal.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentTypeVal();

  /**
   * <code>string content_type_field_name = 28 [json_name = "contentTypeFieldName"];</code>
   * @return Whether the contentTypeFieldName field is set.
   */
  boolean hasContentTypeFieldName();
  /**
   * <code>string content_type_field_name = 28 [json_name = "contentTypeFieldName"];</code>
   * @return The contentTypeFieldName.
   */
  java.lang.String getContentTypeFieldName();
  /**
   * <code>string content_type_field_name = 28 [json_name = "contentTypeFieldName"];</code>
   * @return The bytes for contentTypeFieldName.
   */
  com.google.protobuf.ByteString
      getContentTypeFieldNameBytes();

  /**
   * <code>.api.commons.Channel channel_type_val = 29 [json_name = "channelTypeVal"];</code>
   * @return Whether the channelTypeVal field is set.
   */
  boolean hasChannelTypeVal();
  /**
   * <code>.api.commons.Channel channel_type_val = 29 [json_name = "channelTypeVal"];</code>
   * @return The enum numeric value on the wire for channelTypeVal.
   */
  int getChannelTypeValValue();
  /**
   * <code>.api.commons.Channel channel_type_val = 29 [json_name = "channelTypeVal"];</code>
   * @return The channelTypeVal.
   */
  com.tcn.cloud.api.api.commons.Channel getChannelTypeVal();

  /**
   * <code>string channel_type_field_name = 30 [json_name = "channelTypeFieldName"];</code>
   * @return Whether the channelTypeFieldName field is set.
   */
  boolean hasChannelTypeFieldName();
  /**
   * <code>string channel_type_field_name = 30 [json_name = "channelTypeFieldName"];</code>
   * @return The channelTypeFieldName.
   */
  java.lang.String getChannelTypeFieldName();
  /**
   * <code>string channel_type_field_name = 30 [json_name = "channelTypeFieldName"];</code>
   * @return The bytes for channelTypeFieldName.
   */
  com.google.protobuf.ByteString
      getChannelTypeFieldNameBytes();

  /**
   * <pre>
   * the static time that consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 31 [json_name = "expirationDate"];</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * the static time that consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 31 [json_name = "expirationDate"];</code>
   * @return The expirationDate.
   */
  com.google.protobuf.Timestamp getExpirationDate();
  /**
   * <pre>
   * the static time that consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 31 [json_name = "expirationDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * the field name that holds info about the static time consent will expire at
   * </pre>
   *
   * <code>string expiration_field_name = 32 [json_name = "expirationFieldName"];</code>
   * @return Whether the expirationFieldName field is set.
   */
  boolean hasExpirationFieldName();
  /**
   * <pre>
   * the field name that holds info about the static time consent will expire at
   * </pre>
   *
   * <code>string expiration_field_name = 32 [json_name = "expirationFieldName"];</code>
   * @return The expirationFieldName.
   */
  java.lang.String getExpirationFieldName();
  /**
   * <pre>
   * the field name that holds info about the static time consent will expire at
   * </pre>
   *
   * <code>string expiration_field_name = 32 [json_name = "expirationFieldName"];</code>
   * @return The bytes for expirationFieldName.
   */
  com.google.protobuf.ByteString
      getExpirationFieldNameBytes();

  /**
   * <pre>
   * the relative time consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration_after_duration = 33 [json_name = "expirationAfterDuration"];</code>
   * @return Whether the expirationAfterDuration field is set.
   */
  boolean hasExpirationAfterDuration();
  /**
   * <pre>
   * the relative time consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration_after_duration = 33 [json_name = "expirationAfterDuration"];</code>
   * @return The expirationAfterDuration.
   */
  com.google.protobuf.Duration getExpirationAfterDuration();
  /**
   * <pre>
   * the relative time consent will expire at
   * </pre>
   *
   * <code>.google.protobuf.Duration expiration_after_duration = 33 [json_name = "expirationAfterDuration"];</code>
   */
  com.google.protobuf.DurationOrBuilder getExpirationAfterDurationOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ConsentExportProcess.ContentTypeCase getContentTypeCase();

  com.tcn.cloud.api.api.v0alpha.ConsentExportProcess.ChannelTypeCase getChannelTypeCase();

  com.tcn.cloud.api.api.v0alpha.ConsentExportProcess.ExpirationCase getExpirationCase();
}
