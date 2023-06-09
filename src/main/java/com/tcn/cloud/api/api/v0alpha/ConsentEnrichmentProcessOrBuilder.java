// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ConsentEnrichmentProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ConsentEnrichmentProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies which record field contains the content
   * </pre>
   *
   * <code>string content_field = 3 [json_name = "contentField"];</code>
   * @return The contentField.
   */
  java.lang.String getContentField();
  /**
   * <pre>
   * Specifies which record field contains the content
   * </pre>
   *
   * <code>string content_field = 3 [json_name = "contentField"];</code>
   * @return The bytes for contentField.
   */
  com.google.protobuf.ByteString
      getContentFieldBytes();

  /**
   * <pre>
   * Profile to use
   * </pre>
   *
   * <code>string consent_profile = 4 [json_name = "consentProfile"];</code>
   * @return The consentProfile.
   */
  java.lang.String getConsentProfile();
  /**
   * <pre>
   * Profile to use
   * </pre>
   *
   * <code>string consent_profile = 4 [json_name = "consentProfile"];</code>
   * @return The bytes for consentProfile.
   */
  com.google.protobuf.ByteString
      getConsentProfileBytes();

  /**
   * <pre>
   * Profile Id
   * </pre>
   *
   * <code>string consent_profile_id = 5 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  java.lang.String getConsentProfileId();
  /**
   * <pre>
   * Profile Id
   * </pre>
   *
   * <code>string consent_profile_id = 5 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  com.google.protobuf.ByteString
      getConsentProfileIdBytes();
}
