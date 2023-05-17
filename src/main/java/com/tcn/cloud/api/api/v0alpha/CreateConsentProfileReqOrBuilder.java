// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateConsentProfileReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateConsentProfileReq)
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
   * <pre>
   * payload
   * </pre>
   *
   * <code>string profile_name = 10 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  java.lang.String getProfileName();
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string profile_name = 10 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  com.google.protobuf.ByteString
      getProfileNameBytes();

  /**
   * <code>bool disabled = 11 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1322
   * @return Whether the channel field is set.
   */
  @java.lang.Deprecated boolean hasChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1322
   * @return The channel.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommType getChannel();
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder();

  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>string created_by = 50 [json_name = "createdBy"];</code>
   * @return The createdBy.
   */
  java.lang.String getCreatedBy();
  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>string created_by = 50 [json_name = "createdBy"];</code>
   * @return The bytes for createdBy.
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();
}
