// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListConsentProfileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListConsentProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  java.lang.String getConsentProfileId();
  /**
   * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  com.google.protobuf.ByteString
      getConsentProfileIdBytes();

  /**
   * <code>string profile_name = 2 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  java.lang.String getProfileName();
  /**
   * <code>string profile_name = 2 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  com.google.protobuf.ByteString
      getProfileNameBytes();

  /**
   * <code>int64 count = 3 [json_name = "count"];</code>
   * @return The count.
   */
  long getCount();

  /**
   * <code>bool disabled = 4 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 5 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.ListConsentProfile.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1513
   * @return Whether the channel field is set.
   */
  @java.lang.Deprecated boolean hasChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 5 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.ListConsentProfile.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1513
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommType getChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 5 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder();
}
