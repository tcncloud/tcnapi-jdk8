// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetEmailMessageResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetEmailMessageRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 email_message_sid = 1 [json_name = "emailMessageSid"];</code>
   * @return The emailMessageSid.
   */
  long getEmailMessageSid();

  /**
   * <code>string email_subject = 4 [json_name = "emailSubject"];</code>
   * @return The emailSubject.
   */
  java.lang.String getEmailSubject();
  /**
   * <code>string email_subject = 4 [json_name = "emailSubject"];</code>
   * @return The bytes for emailSubject.
   */
  com.google.protobuf.ByteString
      getEmailSubjectBytes();

  /**
   * <code>string email_body = 5 [json_name = "emailBody"];</code>
   * @return The emailBody.
   */
  java.lang.String getEmailBody();
  /**
   * <code>string email_body = 5 [json_name = "emailBody"];</code>
   * @return The bytes for emailBody.
   */
  com.google.protobuf.ByteString
      getEmailBodyBytes();
}
