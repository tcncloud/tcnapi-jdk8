// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/asm/entities/v1alpha1/session.proto

package com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1;

public interface VoiceRegistrationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.asm.entities.v1alpha1.VoiceRegistration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The pin used to log in via a connected phone
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * The pin used to log in via a connected phone
   * </pre>
   *
   * <code>string username = 2 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * The pass used to log in via a connected phone
   * </pre>
   *
   * <code>string password = 3 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * The pass used to log in via a connected phone
   * </pre>
   *
   * <code>string password = 3 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * The extention appended
   * </pre>
   *
   * <code>string dial_url = 4 [json_name = "dialUrl"];</code>
   * @return The dialUrl.
   */
  java.lang.String getDialUrl();
  /**
   * <pre>
   * The extention appended
   * </pre>
   *
   * <code>string dial_url = 4 [json_name = "dialUrl"];</code>
   * @return The bytes for dialUrl.
   */
  com.google.protobuf.ByteString
      getDialUrlBytes();

  /**
   * <pre>
   * pstn phone number that will be used for the agent to dial in
   * if it's an empty string then the voip connection must be used
   * </pre>
   *
   * <code>string pstn_phone = 5 [json_name = "pstnPhone"];</code>
   * @return The pstnPhone.
   */
  java.lang.String getPstnPhone();
  /**
   * <pre>
   * pstn phone number that will be used for the agent to dial in
   * if it's an empty string then the voip connection must be used
   * </pre>
   *
   * <code>string pstn_phone = 5 [json_name = "pstnPhone"];</code>
   * @return The bytes for pstnPhone.
   */
  com.google.protobuf.ByteString
      getPstnPhoneBytes();

  /**
   * <pre>
   * default time zone -
   * </pre>
   *
   * <code>string default_time_zone = 6 [json_name = "defaultTimeZone"];</code>
   * @return The defaultTimeZone.
   */
  java.lang.String getDefaultTimeZone();
  /**
   * <pre>
   * default time zone -
   * </pre>
   *
   * <code>string default_time_zone = 6 [json_name = "defaultTimeZone"];</code>
   * @return The bytes for defaultTimeZone.
   */
  com.google.protobuf.ByteString
      getDefaultTimeZoneBytes();

  /**
   * <pre>
   * expiration Timestamp When the registration will expire
   * </pre>
   *
   * <code>int64 expiration_timestamp = 7 [json_name = "expirationTimestamp"];</code>
   * @return The expirationTimestamp.
   */
  long getExpirationTimestamp();
}
