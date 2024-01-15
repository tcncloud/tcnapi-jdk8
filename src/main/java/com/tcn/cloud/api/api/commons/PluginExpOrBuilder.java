// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

public interface PluginExpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.PluginExp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.PluginType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.api.commons.PluginType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.PluginType getType();

  /**
   * <pre>
   * true/false deny on errors
   * </pre>
   *
   * <code>bool tcn_strict = 4 [json_name = "tcnStrict"];</code>
   * @return The tcnStrict.
   */
  boolean getTcnStrict();

  /**
   * <pre>
   * gryphon
   * </pre>
   *
   * <code>string license_id = 2 [json_name = "licenseId"];</code>
   * @return The licenseId.
   */
  java.lang.String getLicenseId();
  /**
   * <pre>
   * gryphon
   * </pre>
   *
   * <code>string license_id = 2 [json_name = "licenseId"];</code>
   * @return The bytes for licenseId.
   */
  com.google.protobuf.ByteString
      getLicenseIdBytes();

  /**
   * <code>string reference_key = 3 [json_name = "referenceKey"];</code>
   * @return The referenceKey.
   */
  java.lang.String getReferenceKey();
  /**
   * <code>string reference_key = 3 [json_name = "referenceKey"];</code>
   * @return The bytes for referenceKey.
   */
  com.google.protobuf.ByteString
      getReferenceKeyBytes();

  /**
   * <code>string from_number = 5 [json_name = "fromNumber"];</code>
   * @return The fromNumber.
   */
  java.lang.String getFromNumber();
  /**
   * <code>string from_number = 5 [json_name = "fromNumber"];</code>
   * @return The bytes for fromNumber.
   */
  com.google.protobuf.ByteString
      getFromNumberBytes();

  /**
   * <code>.api.commons.Environment env = 6 [json_name = "env"];</code>
   * @return The enum numeric value on the wire for env.
   */
  int getEnvValue();
  /**
   * <code>.api.commons.Environment env = 6 [json_name = "env"];</code>
   * @return The env.
   */
  com.tcn.cloud.api.api.commons.Environment getEnv();

  /**
   * <pre>
   * tcn_consent
   * </pre>
   *
   * <code>string profile_name = 7 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  java.lang.String getProfileName();
  /**
   * <pre>
   * tcn_consent
   * </pre>
   *
   * <code>string profile_name = 7 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  com.google.protobuf.ByteString
      getProfileNameBytes();

  /**
   * <code>string content_field = 8 [json_name = "contentField"];</code>
   * @return The contentField.
   */
  java.lang.String getContentField();
  /**
   * <code>string content_field = 8 [json_name = "contentField"];</code>
   * @return The bytes for contentField.
   */
  com.google.protobuf.ByteString
      getContentFieldBytes();

  /**
   * <code>string topic = 9 [json_name = "topic"];</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 9 [json_name = "topic"];</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>.api.commons.ConsentAbsentAction absent_action = 11 [json_name = "absentAction"];</code>
   * @return The enum numeric value on the wire for absentAction.
   */
  int getAbsentActionValue();
  /**
   * <code>.api.commons.ConsentAbsentAction absent_action = 11 [json_name = "absentAction"];</code>
   * @return The absentAction.
   */
  com.tcn.cloud.api.api.commons.ConsentAbsentAction getAbsentAction();

  /**
   * <pre>
   * rnd
   * </pre>
   *
   * <code>string date_last_contact = 10 [json_name = "dateLastContact"];</code>
   * @return The dateLastContact.
   */
  java.lang.String getDateLastContact();
  /**
   * <pre>
   * rnd
   * </pre>
   *
   * <code>string date_last_contact = 10 [json_name = "dateLastContact"];</code>
   * @return The bytes for dateLastContact.
   */
  com.google.protobuf.ByteString
      getDateLastContactBytes();

  /**
   * <pre>
   * mrs compliance
   * </pre>
   *
   * <code>string lu = 12 [json_name = "lu"];</code>
   * @return The lu.
   */
  java.lang.String getLu();
  /**
   * <pre>
   * mrs compliance
   * </pre>
   *
   * <code>string lu = 12 [json_name = "lu"];</code>
   * @return The bytes for lu.
   */
  com.google.protobuf.ByteString
      getLuBytes();

  /**
   * <code>string account = 13 [json_name = "account"];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <code>string account = 13 [json_name = "account"];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <code>string master = 14 [json_name = "master"];</code>
   * @return The master.
   */
  java.lang.String getMaster();
  /**
   * <code>string master = 14 [json_name = "master"];</code>
   * @return The bytes for master.
   */
  com.google.protobuf.ByteString
      getMasterBytes();

  /**
   * <code>string client = 15 [json_name = "client"];</code>
   * @return The client.
   */
  java.lang.String getClient();
  /**
   * <code>string client = 15 [json_name = "client"];</code>
   * @return The bytes for client.
   */
  com.google.protobuf.ByteString
      getClientBytes();
}
