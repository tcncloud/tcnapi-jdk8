// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SnippetReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SnippetReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * locale used for the markdown contents
   * </pre>
   *
   * <code>string locale = 1 [json_name = "locale"];</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * locale used for the markdown contents
   * </pre>
   *
   * <code>string locale = 1 [json_name = "locale"];</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * version
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * version
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
