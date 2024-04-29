// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListCampaignsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListCampaignsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the statuses to select by when listing campaigns (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignStatus statuses = 1 [json_name = "statuses"];</code>
   * @return A list containing the statuses.
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniCampaignStatus> getStatusesList();
  /**
   * <pre>
   * the statuses to select by when listing campaigns (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignStatus statuses = 1 [json_name = "statuses"];</code>
   * @return The count of statuses.
   */
  int getStatusesCount();
  /**
   * <pre>
   * the statuses to select by when listing campaigns (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignStatus statuses = 1 [json_name = "statuses"];</code>
   * @param index The index of the element to return.
   * @return The statuses at the given index.
   */
  com.tcn.cloud.api.api.commons.OmniCampaignStatus getStatuses(int index);
  /**
   * <pre>
   * the statuses to select by when listing campaigns (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignStatus statuses = 1 [json_name = "statuses"];</code>
   * @return A list containing the enum numeric values on the wire for statuses.
   */
  java.util.List<java.lang.Integer>
  getStatusesValueList();
  /**
   * <pre>
   * the statuses to select by when listing campaigns (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.OmniCampaignStatus statuses = 1 [json_name = "statuses"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of statuses at the given index.
   */
  int getStatusesValue(int index);

  /**
   * <pre>
   * field mask for selecting extra campaign module details (if empty, does not select any details)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * field mask for selecting extra campaign module details (if empty, does not select any details)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * field mask for selecting extra campaign module details (if empty, does not select any details)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByIds by_ids = 100 [json_name = "byIds"];</code>
   * @return Whether the byIds field is set.
   */
  boolean hasByIds();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByIds by_ids = 100 [json_name = "byIds"];</code>
   * @return The byIds.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByIds getByIds();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByIds by_ids = 100 [json_name = "byIds"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByIdsOrBuilder getByIdsOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByProject by_project = 101 [json_name = "byProject"];</code>
   * @return Whether the byProject field is set.
   */
  boolean hasByProject();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByProject by_project = 101 [json_name = "byProject"];</code>
   * @return The byProject.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByProject getByProject();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByProject by_project = 101 [json_name = "byProject"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByProjectOrBuilder getByProjectOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByTime by_time = 102 [json_name = "byTime"];</code>
   * @return Whether the byTime field is set.
   */
  boolean hasByTime();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByTime by_time = 102 [json_name = "byTime"];</code>
   * @return The byTime.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByTime getByTime();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByTime by_time = 102 [json_name = "byTime"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByTimeOrBuilder getByTimeOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByUnsubscribeLink by_unsubscribe_link = 103 [json_name = "byUnsubscribeLink"];</code>
   * @return Whether the byUnsubscribeLink field is set.
   */
  boolean hasByUnsubscribeLink();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByUnsubscribeLink by_unsubscribe_link = 103 [json_name = "byUnsubscribeLink"];</code>
   * @return The byUnsubscribeLink.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByUnsubscribeLink getByUnsubscribeLink();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByUnsubscribeLink by_unsubscribe_link = 103 [json_name = "byUnsubscribeLink"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByUnsubscribeLinkOrBuilder getByUnsubscribeLinkOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByConnectedInbox by_connected_inbox = 104 [json_name = "byConnectedInbox"];</code>
   * @return Whether the byConnectedInbox field is set.
   */
  boolean hasByConnectedInbox();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByConnectedInbox by_connected_inbox = 104 [json_name = "byConnectedInbox"];</code>
   * @return The byConnectedInbox.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByConnectedInbox getByConnectedInbox();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByConnectedInbox by_connected_inbox = 104 [json_name = "byConnectedInbox"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByConnectedInboxOrBuilder getByConnectedInboxOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByVerifiedEmail by_verified_email = 105 [json_name = "byVerifiedEmail"];</code>
   * @return Whether the byVerifiedEmail field is set.
   */
  boolean hasByVerifiedEmail();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByVerifiedEmail by_verified_email = 105 [json_name = "byVerifiedEmail"];</code>
   * @return The byVerifiedEmail.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByVerifiedEmail getByVerifiedEmail();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByVerifiedEmail by_verified_email = 105 [json_name = "byVerifiedEmail"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByVerifiedEmailOrBuilder getByVerifiedEmailOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.BySmsNumber by_sms_number = 106 [json_name = "bySmsNumber"];</code>
   * @return Whether the bySmsNumber field is set.
   */
  boolean hasBySmsNumber();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.BySmsNumber by_sms_number = 106 [json_name = "bySmsNumber"];</code>
   * @return The bySmsNumber.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.BySmsNumber getBySmsNumber();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.BySmsNumber by_sms_number = 106 [json_name = "bySmsNumber"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.BySmsNumberOrBuilder getBySmsNumberOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsAppNumber by_whatsapp_number = 107 [json_name = "byWhatsappNumber", deprecated = true];</code>
   * @deprecated api.v0alpha.ListCampaignsReq.by_whatsapp_number is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1191
   * @return Whether the byWhatsappNumber field is set.
   */
  @java.lang.Deprecated boolean hasByWhatsappNumber();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsAppNumber by_whatsapp_number = 107 [json_name = "byWhatsappNumber", deprecated = true];</code>
   * @deprecated api.v0alpha.ListCampaignsReq.by_whatsapp_number is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1191
   * @return The byWhatsappNumber.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByWhatsAppNumber getByWhatsappNumber();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsAppNumber by_whatsapp_number = 107 [json_name = "byWhatsappNumber", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByWhatsAppNumberOrBuilder getByWhatsappNumberOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsApp by_whats_app = 108 [json_name = "byWhatsApp"];</code>
   * @return Whether the byWhatsApp field is set.
   */
  boolean hasByWhatsApp();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsApp by_whats_app = 108 [json_name = "byWhatsApp"];</code>
   * @return The byWhatsApp.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByWhatsApp getByWhatsApp();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByWhatsApp by_whats_app = 108 [json_name = "byWhatsApp"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByWhatsAppOrBuilder getByWhatsAppOrBuilder();

  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByModuleType by_module_type = 109 [json_name = "byModuleType"];</code>
   * @return Whether the byModuleType field is set.
   */
  boolean hasByModuleType();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByModuleType by_module_type = 109 [json_name = "byModuleType"];</code>
   * @return The byModuleType.
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByModuleType getByModuleType();
  /**
   * <code>.api.v0alpha.ListCampaignsReq.ByModuleType by_module_type = 109 [json_name = "byModuleType"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.ByModuleTypeOrBuilder getByModuleTypeOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ListCampaignsReq.FilterCase getFilterCase();
}
