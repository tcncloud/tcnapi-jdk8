// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface EmailbackContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.EmailbackContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string contact_name = 1 [json_name = "contactName"];</code>
   * @return The contactName.
   */
  java.lang.String getContactName();
  /**
   * <code>string contact_name = 1 [json_name = "contactName"];</code>
   * @return The bytes for contactName.
   */
  com.google.protobuf.ByteString
      getContactNameBytes();

  /**
   * <code>string to_email = 2 [json_name = "toEmail"];</code>
   * @return The toEmail.
   */
  java.lang.String getToEmail();
  /**
   * <code>string to_email = 2 [json_name = "toEmail"];</code>
   * @return The bytes for toEmail.
   */
  com.google.protobuf.ByteString
      getToEmailBytes();

  /**
   * <code>string from_email = 3 [json_name = "fromEmail"];</code>
   * @return The fromEmail.
   */
  java.lang.String getFromEmail();
  /**
   * <code>string from_email = 3 [json_name = "fromEmail"];</code>
   * @return The bytes for fromEmail.
   */
  com.google.protobuf.ByteString
      getFromEmailBytes();
}