// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SendEmailNotificationReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SendEmailNotificationReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * email subject
   * </pre>
   *
   * <code>string subject = 2 [json_name = "subject"];</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * email subject
   * </pre>
   *
   * <code>string subject = 2 [json_name = "subject"];</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * data
   * </pre>
   *
   * <code>string data = 3 [json_name = "data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <pre>
   * data
   * </pre>
   *
   * <code>string data = 3 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <pre>
   * email message
   * </pre>
   *
   * <code>string message = 4 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * email message
   * </pre>
   *
   * <code>string message = 4 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * to email addresses
   * </pre>
   *
   * <code>repeated string to_email_address_arr = 5 [json_name = "toEmailAddressArr"];</code>
   * @return A list containing the toEmailAddressArr.
   */
  java.util.List<java.lang.String>
      getToEmailAddressArrList();
  /**
   * <pre>
   * to email addresses
   * </pre>
   *
   * <code>repeated string to_email_address_arr = 5 [json_name = "toEmailAddressArr"];</code>
   * @return The count of toEmailAddressArr.
   */
  int getToEmailAddressArrCount();
  /**
   * <pre>
   * to email addresses
   * </pre>
   *
   * <code>repeated string to_email_address_arr = 5 [json_name = "toEmailAddressArr"];</code>
   * @param index The index of the element to return.
   * @return The toEmailAddressArr at the given index.
   */
  java.lang.String getToEmailAddressArr(int index);
  /**
   * <pre>
   * to email addresses
   * </pre>
   *
   * <code>repeated string to_email_address_arr = 5 [json_name = "toEmailAddressArr"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the toEmailAddressArr at the given index.
   */
  com.google.protobuf.ByteString
      getToEmailAddressArrBytes(int index);
}
