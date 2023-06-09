// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateCustomUnsubscribeLinkReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateCustomUnsubscribeLinkReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * custom unsubscribe link sid
   * </pre>
   *
   * <code>int64 custom_unsubscribe_link_sid = 1 [json_name = "customUnsubscribeLinkSid", jstype = JS_STRING];</code>
   * @return The customUnsubscribeLinkSid.
   */
  long getCustomUnsubscribeLinkSid();

  /**
   * <pre>
   * link name
   * </pre>
   *
   * <code>string link_name = 2 [json_name = "linkName"];</code>
   * @return The linkName.
   */
  java.lang.String getLinkName();
  /**
   * <pre>
   * link name
   * </pre>
   *
   * <code>string link_name = 2 [json_name = "linkName"];</code>
   * @return The bytes for linkName.
   */
  com.google.protobuf.ByteString
      getLinkNameBytes();

  /**
   * <pre>
   * link url
   * </pre>
   *
   * <code>string link_url = 3 [json_name = "linkUrl"];</code>
   * @return The linkUrl.
   */
  java.lang.String getLinkUrl();
  /**
   * <pre>
   * link url
   * </pre>
   *
   * <code>string link_url = 3 [json_name = "linkUrl"];</code>
   * @return The bytes for linkUrl.
   */
  com.google.protobuf.ByteString
      getLinkUrlBytes();

  /**
   * <pre>
   * link description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * link description
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
