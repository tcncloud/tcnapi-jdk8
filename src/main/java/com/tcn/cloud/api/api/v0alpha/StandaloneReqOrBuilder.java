// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface StandaloneReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.StandaloneReq)
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
   * categorize the articles
   * </pre>
   *
   * <code>string category = 2 [json_name = "category"];</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <pre>
   * categorize the articles
   * </pre>
   *
   * <code>string category = 2 [json_name = "category"];</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();
}
