// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ExportDeliveryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ExportDelivery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.EmailDelivery email = 1 [json_name = "email"];</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>.api.v0alpha.EmailDelivery email = 1 [json_name = "email"];</code>
   * @return The email.
   */
  com.tcn.cloud.api.api.v0alpha.EmailDelivery getEmail();
  /**
   * <code>.api.v0alpha.EmailDelivery email = 1 [json_name = "email"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EmailDeliveryOrBuilder getEmailOrBuilder();

  /**
   * <code>.api.v0alpha.SftpDelivery sftp = 2 [json_name = "sftp"];</code>
   * @return Whether the sftp field is set.
   */
  boolean hasSftp();
  /**
   * <code>.api.v0alpha.SftpDelivery sftp = 2 [json_name = "sftp"];</code>
   * @return The sftp.
   */
  com.tcn.cloud.api.api.v0alpha.SftpDelivery getSftp();
  /**
   * <code>.api.v0alpha.SftpDelivery sftp = 2 [json_name = "sftp"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SftpDeliveryOrBuilder getSftpOrBuilder();

  /**
   * <code>.api.v0alpha.HttpsDelivery https = 3 [json_name = "https"];</code>
   * @return Whether the https field is set.
   */
  boolean hasHttps();
  /**
   * <code>.api.v0alpha.HttpsDelivery https = 3 [json_name = "https"];</code>
   * @return The https.
   */
  com.tcn.cloud.api.api.v0alpha.HttpsDelivery getHttps();
  /**
   * <code>.api.v0alpha.HttpsDelivery https = 3 [json_name = "https"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.HttpsDeliveryOrBuilder getHttpsOrBuilder();

  /**
   * <code>repeated string failure_email_addreses = 10 [json_name = "failureEmailAddreses"];</code>
   * @return A list containing the failureEmailAddreses.
   */
  java.util.List<java.lang.String>
      getFailureEmailAddresesList();
  /**
   * <code>repeated string failure_email_addreses = 10 [json_name = "failureEmailAddreses"];</code>
   * @return The count of failureEmailAddreses.
   */
  int getFailureEmailAddresesCount();
  /**
   * <code>repeated string failure_email_addreses = 10 [json_name = "failureEmailAddreses"];</code>
   * @param index The index of the element to return.
   * @return The failureEmailAddreses at the given index.
   */
  java.lang.String getFailureEmailAddreses(int index);
  /**
   * <code>repeated string failure_email_addreses = 10 [json_name = "failureEmailAddreses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the failureEmailAddreses at the given index.
   */
  com.google.protobuf.ByteString
      getFailureEmailAddresesBytes(int index);

  com.tcn.cloud.api.api.v0alpha.ExportDelivery.DeliveryTypeCase getDeliveryTypeCase();
}
