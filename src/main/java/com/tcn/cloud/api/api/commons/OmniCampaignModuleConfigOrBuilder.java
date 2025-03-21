// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniCampaignModuleConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniCampaignModuleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * primary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_primary = 1 [json_name = "apiKeyPrimary"];</code>
   * @return Whether the apiKeyPrimary field is set.
   */
  boolean hasApiKeyPrimary();
  /**
   * <pre>
   * primary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_primary = 1 [json_name = "apiKeyPrimary"];</code>
   * @return The apiKeyPrimary.
   */
  com.google.protobuf.StringValue getApiKeyPrimary();
  /**
   * <pre>
   * primary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_primary = 1 [json_name = "apiKeyPrimary"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getApiKeyPrimaryOrBuilder();

  /**
   * <pre>
   * secondary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_secondary = 2 [json_name = "apiKeySecondary"];</code>
   * @return Whether the apiKeySecondary field is set.
   */
  boolean hasApiKeySecondary();
  /**
   * <pre>
   * secondary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_secondary = 2 [json_name = "apiKeySecondary"];</code>
   * @return The apiKeySecondary.
   */
  com.google.protobuf.StringValue getApiKeySecondary();
  /**
   * <pre>
   * secondary api key for chat widget
   * </pre>
   *
   * <code>.google.protobuf.StringValue api_key_secondary = 2 [json_name = "apiKeySecondary"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getApiKeySecondaryOrBuilder();

  /**
   * <pre>
   * chat widget color properties
   * </pre>
   *
   * <code>.api.commons.ChatColorProperties color_properties = 3 [json_name = "colorProperties"];</code>
   * @return Whether the colorProperties field is set.
   */
  boolean hasColorProperties();
  /**
   * <pre>
   * chat widget color properties
   * </pre>
   *
   * <code>.api.commons.ChatColorProperties color_properties = 3 [json_name = "colorProperties"];</code>
   * @return The colorProperties.
   */
  com.tcn.cloud.api.api.commons.ChatColorProperties getColorProperties();
  /**
   * <pre>
   * chat widget color properties
   * </pre>
   *
   * <code>.api.commons.ChatColorProperties color_properties = 3 [json_name = "colorProperties"];</code>
   */
  com.tcn.cloud.api.api.commons.ChatColorPropertiesOrBuilder getColorPropertiesOrBuilder();

  /**
   * <pre>
   * identifier of the connected inbox associated to the CampaignModule
   * </pre>
   *
   * <code>.api.commons.Int64Id connected_inbox_sid = 4 [json_name = "connectedInboxSid"];</code>
   * @return Whether the connectedInboxSid field is set.
   */
  boolean hasConnectedInboxSid();
  /**
   * <pre>
   * identifier of the connected inbox associated to the CampaignModule
   * </pre>
   *
   * <code>.api.commons.Int64Id connected_inbox_sid = 4 [json_name = "connectedInboxSid"];</code>
   * @return The connectedInboxSid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getConnectedInboxSid();
  /**
   * <pre>
   * identifier of the connected inbox associated to the CampaignModule
   * </pre>
   *
   * <code>.api.commons.Int64Id connected_inbox_sid = 4 [json_name = "connectedInboxSid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getConnectedInboxSidOrBuilder();

  /**
   * <pre>
   * list of dispositions associated to the CampaignModule
   * </pre>
   *
   * <code>repeated .api.commons.Disposition dispositions = 5 [json_name = "dispositions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Disposition> 
      getDispositionsList();
  /**
   * <pre>
   * list of dispositions associated to the CampaignModule
   * </pre>
   *
   * <code>repeated .api.commons.Disposition dispositions = 5 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.commons.Disposition getDispositions(int index);
  /**
   * <pre>
   * list of dispositions associated to the CampaignModule
   * </pre>
   *
   * <code>repeated .api.commons.Disposition dispositions = 5 [json_name = "dispositions"];</code>
   */
  int getDispositionsCount();
  /**
   * <pre>
   * list of dispositions associated to the CampaignModule
   * </pre>
   *
   * <code>repeated .api.commons.Disposition dispositions = 5 [json_name = "dispositions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.DispositionOrBuilder> 
      getDispositionsOrBuilderList();
  /**
   * <pre>
   * list of dispositions associated to the CampaignModule
   * </pre>
   *
   * <code>repeated .api.commons.Disposition dispositions = 5 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.commons.DispositionOrBuilder getDispositionsOrBuilder(
      int index);

  /**
   * <pre>
   * email associated to the CampaignModule
   * </pre>
   *
   * <code>.google.protobuf.StringValue email = 6 [json_name = "email"];</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <pre>
   * email associated to the CampaignModule
   * </pre>
   *
   * <code>.google.protobuf.StringValue email = 6 [json_name = "email"];</code>
   * @return The email.
   */
  com.google.protobuf.StringValue getEmail();
  /**
   * <pre>
   * email associated to the CampaignModule
   * </pre>
   *
   * <code>.google.protobuf.StringValue email = 6 [json_name = "email"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailOrBuilder();

  /**
   * <pre>
   * message body
   * </pre>
   *
   * <code>.google.protobuf.StringValue message_body = 7 [json_name = "messageBody"];</code>
   * @return Whether the messageBody field is set.
   */
  boolean hasMessageBody();
  /**
   * <pre>
   * message body
   * </pre>
   *
   * <code>.google.protobuf.StringValue message_body = 7 [json_name = "messageBody"];</code>
   * @return The messageBody.
   */
  com.google.protobuf.StringValue getMessageBody();
  /**
   * <pre>
   * message body
   * </pre>
   *
   * <code>.google.protobuf.StringValue message_body = 7 [json_name = "messageBody"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getMessageBodyOrBuilder();

  /**
   * <pre>
   * email subject
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_subject = 8 [json_name = "emailSubject"];</code>
   * @return Whether the emailSubject field is set.
   */
  boolean hasEmailSubject();
  /**
   * <pre>
   * email subject
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_subject = 8 [json_name = "emailSubject"];</code>
   * @return The emailSubject.
   */
  com.google.protobuf.StringValue getEmailSubject();
  /**
   * <pre>
   * email subject
   * </pre>
   *
   * <code>.google.protobuf.StringValue email_subject = 8 [json_name = "emailSubject"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getEmailSubjectOrBuilder();

  /**
   * <pre>
   * sms number
   * </pre>
   *
   * <code>.api.commons.SmsNumber sms_number = 9 [json_name = "smsNumber"];</code>
   * @return Whether the smsNumber field is set.
   */
  boolean hasSmsNumber();
  /**
   * <pre>
   * sms number
   * </pre>
   *
   * <code>.api.commons.SmsNumber sms_number = 9 [json_name = "smsNumber"];</code>
   * @return The smsNumber.
   */
  com.tcn.cloud.api.api.commons.SmsNumber getSmsNumber();
  /**
   * <pre>
   * sms number
   * </pre>
   *
   * <code>.api.commons.SmsNumber sms_number = 9 [json_name = "smsNumber"];</code>
   */
  com.tcn.cloud.api.api.commons.SmsNumberOrBuilder getSmsNumberOrBuilder();

  /**
   * <pre>
   * chat widget header
   * </pre>
   *
   * <code>.api.commons.ChatHeader header = 10 [json_name = "header"];</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * chat widget header
   * </pre>
   *
   * <code>.api.commons.ChatHeader header = 10 [json_name = "header"];</code>
   * @return The header.
   */
  com.tcn.cloud.api.api.commons.ChatHeader getHeader();
  /**
   * <pre>
   * chat widget header
   * </pre>
   *
   * <code>.api.commons.ChatHeader header = 10 [json_name = "header"];</code>
   */
  com.tcn.cloud.api.api.commons.ChatHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * sla timeouts associated with the CampaignModule
   * </pre>
   *
   * <code>.api.commons.SLATimeouts sla_timeouts = 11 [json_name = "slaTimeouts"];</code>
   * @return Whether the slaTimeouts field is set.
   */
  boolean hasSlaTimeouts();
  /**
   * <pre>
   * sla timeouts associated with the CampaignModule
   * </pre>
   *
   * <code>.api.commons.SLATimeouts sla_timeouts = 11 [json_name = "slaTimeouts"];</code>
   * @return The slaTimeouts.
   */
  com.tcn.cloud.api.api.commons.SLATimeouts getSlaTimeouts();
  /**
   * <pre>
   * sla timeouts associated with the CampaignModule
   * </pre>
   *
   * <code>.api.commons.SLATimeouts sla_timeouts = 11 [json_name = "slaTimeouts"];</code>
   */
  com.tcn.cloud.api.api.commons.SLATimeoutsOrBuilder getSlaTimeoutsOrBuilder();

  /**
   * <pre>
   * maximum number of sends per hour for outbound CampaignModules
   * </pre>
   *
   * <code>.google.protobuf.Int64Value sends_per_hour = 12 [json_name = "sendsPerHour"];</code>
   * @return Whether the sendsPerHour field is set.
   */
  boolean hasSendsPerHour();
  /**
   * <pre>
   * maximum number of sends per hour for outbound CampaignModules
   * </pre>
   *
   * <code>.google.protobuf.Int64Value sends_per_hour = 12 [json_name = "sendsPerHour"];</code>
   * @return The sendsPerHour.
   */
  com.google.protobuf.Int64Value getSendsPerHour();
  /**
   * <pre>
   * maximum number of sends per hour for outbound CampaignModules
   * </pre>
   *
   * <code>.google.protobuf.Int64Value sends_per_hour = 12 [json_name = "sendsPerHour"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getSendsPerHourOrBuilder();

  /**
   * <pre>
   * identifier of associated custom unsubscribe link
   * </pre>
   *
   * <code>.api.commons.Int64Id unsubscribe_link_sid = 13 [json_name = "unsubscribeLinkSid"];</code>
   * @return Whether the unsubscribeLinkSid field is set.
   */
  boolean hasUnsubscribeLinkSid();
  /**
   * <pre>
   * identifier of associated custom unsubscribe link
   * </pre>
   *
   * <code>.api.commons.Int64Id unsubscribe_link_sid = 13 [json_name = "unsubscribeLinkSid"];</code>
   * @return The unsubscribeLinkSid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getUnsubscribeLinkSid();
  /**
   * <pre>
   * identifier of associated custom unsubscribe link
   * </pre>
   *
   * <code>.api.commons.Int64Id unsubscribe_link_sid = 13 [json_name = "unsubscribeLinkSid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getUnsubscribeLinkSidOrBuilder();

  /**
   * <pre>
   * verified email identifier
   * </pre>
   *
   * <code>.api.commons.Int64Id verified_email_sid = 15 [json_name = "verifiedEmailSid"];</code>
   * @return Whether the verifiedEmailSid field is set.
   */
  boolean hasVerifiedEmailSid();
  /**
   * <pre>
   * verified email identifier
   * </pre>
   *
   * <code>.api.commons.Int64Id verified_email_sid = 15 [json_name = "verifiedEmailSid"];</code>
   * @return The verifiedEmailSid.
   */
  com.tcn.cloud.api.api.commons.Int64Id getVerifiedEmailSid();
  /**
   * <pre>
   * verified email identifier
   * </pre>
   *
   * <code>.api.commons.Int64Id verified_email_sid = 15 [json_name = "verifiedEmailSid"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getVerifiedEmailSidOrBuilder();

  /**
   * <pre>
   * stop module with all tasks are completed
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stop_on_task_deplete = 16 [json_name = "stopOnTaskDeplete"];</code>
   * @return Whether the stopOnTaskDeplete field is set.
   */
  boolean hasStopOnTaskDeplete();
  /**
   * <pre>
   * stop module with all tasks are completed
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stop_on_task_deplete = 16 [json_name = "stopOnTaskDeplete"];</code>
   * @return The stopOnTaskDeplete.
   */
  com.google.protobuf.BoolValue getStopOnTaskDeplete();
  /**
   * <pre>
   * stop module with all tasks are completed
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stop_on_task_deplete = 16 [json_name = "stopOnTaskDeplete"];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getStopOnTaskDepleteOrBuilder();

  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 17 [json_name = "attachments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> 
      getAttachmentsList();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 17 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniAttachment getAttachments(int index);
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 17 [json_name = "attachments"];</code>
   */
  int getAttachmentsCount();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 17 [json_name = "attachments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> 
      getAttachmentsOrBuilderList();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 17 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder getAttachmentsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. compliance rule set to use for this campaign
   * </pre>
   *
   * <code>.google.protobuf.StringValue compliance_rule_set_id = 18 [json_name = "complianceRuleSetId"];</code>
   * @return Whether the complianceRuleSetId field is set.
   */
  boolean hasComplianceRuleSetId();
  /**
   * <pre>
   * Optional. compliance rule set to use for this campaign
   * </pre>
   *
   * <code>.google.protobuf.StringValue compliance_rule_set_id = 18 [json_name = "complianceRuleSetId"];</code>
   * @return The complianceRuleSetId.
   */
  com.google.protobuf.StringValue getComplianceRuleSetId();
  /**
   * <pre>
   * Optional. compliance rule set to use for this campaign
   * </pre>
   *
   * <code>.google.protobuf.StringValue compliance_rule_set_id = 18 [json_name = "complianceRuleSetId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getComplianceRuleSetIdOrBuilder();

  /**
   * <pre>
   * Payment Portal Ids
   * </pre>
   *
   * <code>repeated string payment_portal_ids = 19 [json_name = "paymentPortalIds"];</code>
   * @return A list containing the paymentPortalIds.
   */
  java.util.List<java.lang.String>
      getPaymentPortalIdsList();
  /**
   * <pre>
   * Payment Portal Ids
   * </pre>
   *
   * <code>repeated string payment_portal_ids = 19 [json_name = "paymentPortalIds"];</code>
   * @return The count of paymentPortalIds.
   */
  int getPaymentPortalIdsCount();
  /**
   * <pre>
   * Payment Portal Ids
   * </pre>
   *
   * <code>repeated string payment_portal_ids = 19 [json_name = "paymentPortalIds"];</code>
   * @param index The index of the element to return.
   * @return The paymentPortalIds at the given index.
   */
  java.lang.String getPaymentPortalIds(int index);
  /**
   * <pre>
   * Payment Portal Ids
   * </pre>
   *
   * <code>repeated string payment_portal_ids = 19 [json_name = "paymentPortalIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the paymentPortalIds at the given index.
   */
  com.google.protobuf.ByteString
      getPaymentPortalIdsBytes(int index);

  /**
   * <pre>
   * Flow Id
   * </pre>
   *
   * <code>.api.commons.Int64Id flow_id = 20 [json_name = "flowId"];</code>
   * @return Whether the flowId field is set.
   */
  boolean hasFlowId();
  /**
   * <pre>
   * Flow Id
   * </pre>
   *
   * <code>.api.commons.Int64Id flow_id = 20 [json_name = "flowId"];</code>
   * @return The flowId.
   */
  com.tcn.cloud.api.api.commons.Int64Id getFlowId();
  /**
   * <pre>
   * Flow Id
   * </pre>
   *
   * <code>.api.commons.Int64Id flow_id = 20 [json_name = "flowId"];</code>
   */
  com.tcn.cloud.api.api.commons.Int64IdOrBuilder getFlowIdOrBuilder();

  /**
   * <pre>
   * skills
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 21 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  boolean hasSkills();
  /**
   * <pre>
   * skills
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 21 [json_name = "skills"];</code>
   * @return The skills.
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills();
  /**
   * <pre>
   * skills
   * </pre>
   *
   * <code>.api.commons.OmniConversationSkills skills = 21 [json_name = "skills"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder();

  /**
   * <pre>
   * whatsapp number
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 22 [json_name = "whatsappNumber"];</code>
   * @return Whether the whatsappNumber field is set.
   */
  boolean hasWhatsappNumber();
  /**
   * <pre>
   * whatsapp number
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 22 [json_name = "whatsappNumber"];</code>
   * @return The whatsappNumber.
   */
  com.tcn.cloud.api.api.commons.WhatsAppNumber getWhatsappNumber();
  /**
   * <pre>
   * whatsapp number
   * </pre>
   *
   * <code>.api.commons.WhatsAppNumber whatsapp_number = 22 [json_name = "whatsappNumber"];</code>
   */
  com.tcn.cloud.api.api.commons.WhatsAppNumberOrBuilder getWhatsappNumberOrBuilder();

  /**
   * <pre>
   * ProviderMetadata
   *  - SmartPing
   *      content_id - the id of the premade message in the smartping system
   * </pre>
   *
   * <code>map&lt;string, string&gt; provider_metadata = 23 [json_name = "providerMetadata"];</code>
   */
  int getProviderMetadataCount();
  /**
   * <pre>
   * ProviderMetadata
   *  - SmartPing
   *      content_id - the id of the premade message in the smartping system
   * </pre>
   *
   * <code>map&lt;string, string&gt; provider_metadata = 23 [json_name = "providerMetadata"];</code>
   */
  boolean containsProviderMetadata(
      java.lang.String key);
  /**
   * Use {@link #getProviderMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProviderMetadata();
  /**
   * <pre>
   * ProviderMetadata
   *  - SmartPing
   *      content_id - the id of the premade message in the smartping system
   * </pre>
   *
   * <code>map&lt;string, string&gt; provider_metadata = 23 [json_name = "providerMetadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getProviderMetadataMap();
  /**
   * <pre>
   * ProviderMetadata
   *  - SmartPing
   *      content_id - the id of the premade message in the smartping system
   * </pre>
   *
   * <code>map&lt;string, string&gt; provider_metadata = 23 [json_name = "providerMetadata"];</code>
   */
  /* nullable */
java.lang.String getProviderMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * ProviderMetadata
   *  - SmartPing
   *      content_id - the id of the premade message in the smartping system
   * </pre>
   *
   * <code>map&lt;string, string&gt; provider_metadata = 23 [json_name = "providerMetadata"];</code>
   */
  java.lang.String getProviderMetadataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The country code and postal code field together determine timezone for email time based compliance rulesets
   * country code
   * </pre>
   *
   * <code>int32 country_code = 24 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  int getCountryCode();

  /**
   * <pre>
   * country code sid
   * </pre>
   *
   * <code>int64 country_code_sid = 27 [json_name = "countryCodeSid"];</code>
   * @return The countryCodeSid.
   */
  long getCountryCodeSid();

  /**
   * <pre>
   * postal code field
   * </pre>
   *
   * <code>string postal_code_field = 25 [json_name = "postalCodeField"];</code>
   * @return The postalCodeField.
   */
  java.lang.String getPostalCodeField();
  /**
   * <pre>
   * postal code field
   * </pre>
   *
   * <code>string postal_code_field = 25 [json_name = "postalCodeField"];</code>
   * @return The bytes for postalCodeField.
   */
  com.google.protobuf.ByteString
      getPostalCodeFieldBytes();

  /**
   * <pre>
   * allows the user to configure a custom message for when a conversation times out, or to disable the message all together
   * </pre>
   *
   * <code>.api.commons.ConversationTimeoutMessageConfig timeout_message_config = 26 [json_name = "timeoutMessageConfig"];</code>
   * @return Whether the timeoutMessageConfig field is set.
   */
  boolean hasTimeoutMessageConfig();
  /**
   * <pre>
   * allows the user to configure a custom message for when a conversation times out, or to disable the message all together
   * </pre>
   *
   * <code>.api.commons.ConversationTimeoutMessageConfig timeout_message_config = 26 [json_name = "timeoutMessageConfig"];</code>
   * @return The timeoutMessageConfig.
   */
  com.tcn.cloud.api.api.commons.ConversationTimeoutMessageConfig getTimeoutMessageConfig();
  /**
   * <pre>
   * allows the user to configure a custom message for when a conversation times out, or to disable the message all together
   * </pre>
   *
   * <code>.api.commons.ConversationTimeoutMessageConfig timeout_message_config = 26 [json_name = "timeoutMessageConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.ConversationTimeoutMessageConfigOrBuilder getTimeoutMessageConfigOrBuilder();
}
