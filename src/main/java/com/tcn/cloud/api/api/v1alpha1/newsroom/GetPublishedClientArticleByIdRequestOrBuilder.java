// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface GetPublishedClientArticleByIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.GetPublishedClientArticleByIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique published article sid
   * </pre>
   *
   * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
   * @return The publishedArticleSid.
   */
  long getPublishedArticleSid();
}
