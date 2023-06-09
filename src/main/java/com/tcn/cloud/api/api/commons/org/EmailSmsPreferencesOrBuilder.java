// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface EmailSmsPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.EmailSmsPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Whether to use custom unsubscribe links (all email templates must contain
   * one if enabled).
   * </pre>
   *
   * <code>bool use_custom_links = 10 [json_name = "useCustomLinks"];</code>
   * @return The useCustomLinks.
   */
  boolean getUseCustomLinks();

  /**
   * <pre>
   * Whether the client acknowledges that they are responsible for opt outs.
   * </pre>
   *
   * <code>bool client_acknowledgement = 11 [json_name = "clientAcknowledgement"];</code>
   * @return The clientAcknowledgement.
   */
  boolean getClientAcknowledgement();

  /**
   * <pre>
   * Return email addresses that will be available in broadcasts.
   * </pre>
   *
   * <code>repeated string email_from_addresses = 12 [json_name = "emailFromAddresses"];</code>
   * @return A list containing the emailFromAddresses.
   */
  java.util.List<java.lang.String>
      getEmailFromAddressesList();
  /**
   * <pre>
   * Return email addresses that will be available in broadcasts.
   * </pre>
   *
   * <code>repeated string email_from_addresses = 12 [json_name = "emailFromAddresses"];</code>
   * @return The count of emailFromAddresses.
   */
  int getEmailFromAddressesCount();
  /**
   * <pre>
   * Return email addresses that will be available in broadcasts.
   * </pre>
   *
   * <code>repeated string email_from_addresses = 12 [json_name = "emailFromAddresses"];</code>
   * @param index The index of the element to return.
   * @return The emailFromAddresses at the given index.
   */
  java.lang.String getEmailFromAddresses(int index);
  /**
   * <pre>
   * Return email addresses that will be available in broadcasts.
   * </pre>
   *
   * <code>repeated string email_from_addresses = 12 [json_name = "emailFromAddresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the emailFromAddresses at the given index.
   */
  com.google.protobuf.ByteString
      getEmailFromAddressesBytes(int index);
}
