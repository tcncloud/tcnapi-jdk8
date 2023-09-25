// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface CreateNewsArticleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.CreateNewsArticleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * news article title
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * news article title
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 2 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 2 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();
}
