// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EmailMessageReplyWithAttachmentsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EmailMessageReplyWithAttachments)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.EmailMessageReply email_message_reply = 1 [json_name = "emailMessageReply"];</code>
   * @return Whether the emailMessageReply field is set.
   */
  boolean hasEmailMessageReply();
  /**
   * <code>.api.v0alpha.EmailMessageReply email_message_reply = 1 [json_name = "emailMessageReply"];</code>
   * @return The emailMessageReply.
   */
  com.tcn.cloud.api.api.v0alpha.EmailMessageReply getEmailMessageReply();
  /**
   * <code>.api.v0alpha.EmailMessageReply email_message_reply = 1 [json_name = "emailMessageReply"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EmailMessageReplyOrBuilder getEmailMessageReplyOrBuilder();

  /**
   * <code>repeated .api.v0alpha.EmailMessageReplyAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.EmailMessageReplyAttachment> 
      getAttachmentsList();
  /**
   * <code>repeated .api.v0alpha.EmailMessageReplyAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EmailMessageReplyAttachment getAttachments(int index);
  /**
   * <code>repeated .api.v0alpha.EmailMessageReplyAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  int getAttachmentsCount();
  /**
   * <code>repeated .api.v0alpha.EmailMessageReplyAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.EmailMessageReplyAttachmentOrBuilder> 
      getAttachmentsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.EmailMessageReplyAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EmailMessageReplyAttachmentOrBuilder getAttachmentsOrBuilder(
      int index);
}
