// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface GetPublishedArticleByIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.GetPublishedArticleByIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.newsroom.GetPublishedArticleByIdRequest.new_article_sid is deprecated.
   *     See api/v1alpha1/newsroom/entities.proto;l=134
   * @return The newArticleSid.
   */
  @java.lang.Deprecated long getNewArticleSid();

  /**
   * <pre>
   * the unique published article sid
   * </pre>
   *
   * <code>int64 published_article_sid = 2 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
   * @return The publishedArticleSid.
   */
  long getPublishedArticleSid();
}
