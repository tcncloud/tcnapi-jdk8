// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * this is the primary key or internal tcn identifier for the message
   * </pre>
   *
   * <code>int64 message_sid = 1 [json_name = "messageSid", jstype = JS_STRING];</code>
   * @return The messageSid.
   */
  long getMessageSid();

  /**
   * <pre>
   * this is the user id that sent the message - this can be not set which would
   * be the case if it's not an agent message
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_id = 4 [json_name = "userId"];</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <pre>
   * this is the user id that sent the message - this can be not set which would
   * be the case if it's not an agent message
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_id = 4 [json_name = "userId"];</code>
   * @return The userId.
   */
  com.google.protobuf.StringValue getUserId();
  /**
   * <pre>
   * this is the user id that sent the message - this can be not set which would
   * be the case if it's not an agent message
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_id = 4 [json_name = "userId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserIdOrBuilder();

  /**
   * <pre>
   * this is who the message is from
   * chat = if agent then user_id, if customer then name
   * email = email address
   * sms = phone number
   * whatsapp = phone number
   * </pre>
   *
   * <code>string sent_from = 5 [json_name = "sentFrom"];</code>
   * @return The sentFrom.
   */
  java.lang.String getSentFrom();
  /**
   * <pre>
   * this is who the message is from
   * chat = if agent then user_id, if customer then name
   * email = email address
   * sms = phone number
   * whatsapp = phone number
   * </pre>
   *
   * <code>string sent_from = 5 [json_name = "sentFrom"];</code>
   * @return The bytes for sentFrom.
   */
  com.google.protobuf.ByteString
      getSentFromBytes();

  /**
   * <pre>
   * this is who the message is to
   * chat = if customer then name, otherwise leave as an empty string
   * email = email address
   * sms = phone number
   * whatsapp = phone number
   * </pre>
   *
   * <code>string sent_to = 6 [json_name = "sentTo"];</code>
   * @return The sentTo.
   */
  java.lang.String getSentTo();
  /**
   * <pre>
   * this is who the message is to
   * chat = if customer then name, otherwise leave as an empty string
   * email = email address
   * sms = phone number
   * whatsapp = phone number
   * </pre>
   *
   * <code>string sent_to = 6 [json_name = "sentTo"];</code>
   * @return The bytes for sentTo.
   */
  com.google.protobuf.ByteString
      getSentToBytes();

  /**
   * <pre>
   * the message channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 7 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <pre>
   * the message channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 7 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelType();

  /**
   * <pre>
   * this is how the message is referenced by the outside world
   * chat = not set
   * email = email message header
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue reference_id = 8 [json_name = "referenceId"];</code>
   * @return Whether the referenceId field is set.
   */
  boolean hasReferenceId();
  /**
   * <pre>
   * this is how the message is referenced by the outside world
   * chat = not set
   * email = email message header
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue reference_id = 8 [json_name = "referenceId"];</code>
   * @return The referenceId.
   */
  com.google.protobuf.StringValue getReferenceId();
  /**
   * <pre>
   * this is how the message is referenced by the outside world
   * chat = not set
   * email = email message header
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue reference_id = 8 [json_name = "referenceId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getReferenceIdOrBuilder();

  /**
   * <pre>
   * this is an id that the UI generates so it's able to identify it when it sees it again
   * </pre>
   *
   * <code>string ui_reference_id = 10 [json_name = "uiReferenceId"];</code>
   * @return The uiReferenceId.
   */
  java.lang.String getUiReferenceId();
  /**
   * <pre>
   * this is an id that the UI generates so it's able to identify it when it sees it again
   * </pre>
   *
   * <code>string ui_reference_id = 10 [json_name = "uiReferenceId"];</code>
   * @return The bytes for uiReferenceId.
   */
  com.google.protobuf.ByteString
      getUiReferenceIdBytes();

  /**
   * <pre>
   * this is the payload of the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 11 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * this is the payload of the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 11 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayload getPayload();
  /**
   * <pre>
   * this is the payload of the message
   * </pre>
   *
   * <code>.api.commons.OmniMessagePayload payload = 11 [json_name = "payload"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniMessagePayloadOrBuilder getPayloadOrBuilder();

  /**
   * <pre>
   * the id of the conversation. This is not required to be set because the message could
   * belong to a outbound campaign only
   * </pre>
   *
   * <code>.api.commons.Int64Id conversation_sid = 12 [json_name = "conversationSid"];</code>
   * @return Whether the conversationSid field is set.
   */
  boolean hasConversationSid();
  /**
   * <pre>
   * the id of the conversation. This is not required to be set because the message could
   * belong to a outbound campaign only
   * </pre>
   *
   * <code>.api.commons.Int64Id conversation_sid = 12 [json_name = "conversationSid"];</code>
   * @return The conversationSid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getConversationSid();
  /**
   * <pre>
   * the id of the conversation. This is not required to be set because the message could
   * belong to a outbound campaign only
   * </pre>
   *
   * <code>.api.commons.Int64Id conversation_sid = 12 [json_name = "conversationSid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getConversationSidOrBuilder();

  /**
   * <pre>
   * the current status of the message.
   * </pre>
   *
   * <code>.api.commons.OmniMessageStatus status = 14 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * the current status of the message.
   * </pre>
   *
   * <code>.api.commons.OmniMessageStatus status = 14 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.OmniMessageStatus getStatus();

  /**
   * <pre>
   * the time the message was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 15 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * the time the message was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 15 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * the time the message was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 15 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * the time the message was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 16 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * the time the message was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 16 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * the time the message was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 16 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * identifier of the campaign the message belongs to
   * </pre>
   *
   * <code>int64 campaign_sid = 17 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  long getCampaignSid();

  /**
   * <pre>
   * The subject of the conversation
   * chat = not set
   * email = the email subject line
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue subject = 19 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * The subject of the conversation
   * chat = not set
   * email = the email subject line
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue subject = 19 [json_name = "subject"];</code>
   * @return The subject.
   */
  com.google.protobuf.StringValue getSubject();
  /**
   * <pre>
   * The subject of the conversation
   * chat = not set
   * email = the email subject line
   * sms = not set
   * whatsapp = not set
   * </pre>
   *
   * <code>.google.protobuf.StringValue subject = 19 [json_name = "subject"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getSubjectOrBuilder();

  /**
   * <pre>
   * if this message is coming from omni boss is a manager message
   * </pre>
   *
   * <code>.api.commons.OmniSenderType sender_type = 21 [json_name = "senderType"];</code>
   * @return The enum numeric value on the wire for senderType.
   */
  int getSenderTypeValue();
  /**
   * <pre>
   * if this message is coming from omni boss is a manager message
   * </pre>
   *
   * <code>.api.commons.OmniSenderType sender_type = 21 [json_name = "senderType"];</code>
   * @return The senderType.
   */
  com.tcn.cloud.api.api.commons.OmniSenderType getSenderType();

  /**
   * <pre>
   * status message
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 22 [json_name = "statusMessage"];</code>
   * @return Whether the statusMessage field is set.
   */
  boolean hasStatusMessage();
  /**
   * <pre>
   * status message
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 22 [json_name = "statusMessage"];</code>
   * @return The statusMessage.
   */
  com.google.protobuf.StringValue getStatusMessage();
  /**
   * <pre>
   * status message
   * </pre>
   *
   * <code>.google.protobuf.StringValue status_message = 22 [json_name = "statusMessage"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getStatusMessageOrBuilder();

  /**
   * <pre>
   * the message format
   * </pre>
   *
   * <code>.api.commons.MessageFormat message_format = 23 [json_name = "messageFormat"];</code>
   * @return The enum numeric value on the wire for messageFormat.
   */
  int getMessageFormatValue();
  /**
   * <pre>
   * the message format
   * </pre>
   *
   * <code>.api.commons.MessageFormat message_format = 23 [json_name = "messageFormat"];</code>
   * @return The messageFormat.
   */
  com.tcn.cloud.api.api.commons.MessageFormat getMessageFormat();
}
