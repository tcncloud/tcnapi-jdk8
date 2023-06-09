// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateCannedMessageReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateCannedMessageReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * canned_message_id
   * </pre>
   *
   * <code>string canned_message_id = 1 [json_name = "cannedMessageId"];</code>
   * @return The cannedMessageId.
   */
  java.lang.String getCannedMessageId();
  /**
   * <pre>
   * canned_message_id
   * </pre>
   *
   * <code>string canned_message_id = 1 [json_name = "cannedMessageId"];</code>
   * @return The bytes for cannedMessageId.
   */
  com.google.protobuf.ByteString
      getCannedMessageIdBytes();

  /**
   * <pre>
   * canned message name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * canned message name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * message details
   * </pre>
   *
   * <code>string message_body = 4 [json_name = "messageBody"];</code>
   * @return The messageBody.
   */
  java.lang.String getMessageBody();
  /**
   * <pre>
   * message details
   * </pre>
   *
   * <code>string message_body = 4 [json_name = "messageBody"];</code>
   * @return The bytes for messageBody.
   */
  com.google.protobuf.ByteString
      getMessageBodyBytes();

  /**
   * <pre>
   * canned message group id
   * </pre>
   *
   * <code>string canned_message_group_id = 5 [json_name = "cannedMessageGroupId"];</code>
   * @return The cannedMessageGroupId.
   */
  java.lang.String getCannedMessageGroupId();
  /**
   * <pre>
   * canned message group id
   * </pre>
   *
   * <code>string canned_message_group_id = 5 [json_name = "cannedMessageGroupId"];</code>
   * @return The bytes for cannedMessageGroupId.
   */
  com.google.protobuf.ByteString
      getCannedMessageGroupIdBytes();

  /**
   * <pre>
   * allows html
   * </pre>
   *
   * <code>bool allows_html = 6 [json_name = "allowsHtml"];</code>
   * @return The allowsHtml.
   */
  boolean getAllowsHtml();

  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 7 [json_name = "attachments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> 
      getAttachmentsList();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 7 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniAttachment getAttachments(int index);
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 7 [json_name = "attachments"];</code>
   */
  int getAttachmentsCount();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 7 [json_name = "attachments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> 
      getAttachmentsOrBuilderList();
  /**
   * <pre>
   * attachments
   * </pre>
   *
   * <code>repeated .api.commons.OmniAttachment attachments = 7 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder getAttachmentsOrBuilder(
      int index);
}
