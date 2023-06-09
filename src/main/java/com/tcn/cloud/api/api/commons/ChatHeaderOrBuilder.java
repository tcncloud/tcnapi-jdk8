// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/chat.proto

package com.tcn.cloud.api.api.commons;

public interface ChatHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ChatHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the main text to display
   * </pre>
   *
   * <code>string header = 1 [json_name = "header"];</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <pre>
   * the main text to display
   * </pre>
   *
   * <code>string header = 1 [json_name = "header"];</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <pre>
   * the text to display beneath the header
   * </pre>
   *
   * <code>string subheader = 2 [json_name = "subheader"];</code>
   * @return The subheader.
   */
  java.lang.String getSubheader();
  /**
   * <pre>
   * the text to display beneath the header
   * </pre>
   *
   * <code>string subheader = 2 [json_name = "subheader"];</code>
   * @return The bytes for subheader.
   */
  com.google.protobuf.ByteString
      getSubheaderBytes();
}
