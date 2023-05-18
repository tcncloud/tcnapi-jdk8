// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetConsentByProfileAndContentReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetConsentByProfileAndContentReq)
    com.google.protobuf.MessageOrBuilder {

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
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>string profile_id = 4 [json_name = "profileId"];</code>
   * @return The profileId.
   */
  java.lang.String getProfileId();
  /**
   * <code>string profile_id = 4 [json_name = "profileId"];</code>
   * @return The bytes for profileId.
   */
  com.google.protobuf.ByteString
      getProfileIdBytes();

  /**
   * <code>.api.commons.ContentType content_type = 5 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <code>.api.commons.ContentType content_type = 5 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <code>.api.commons.Channel channel_type = 6 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  int getChannelTypeValue();
  /**
   * <code>.api.commons.Channel channel_type = 6 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  com.tcn.cloud.api.api.commons.Channel getChannelType();
}
