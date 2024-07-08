// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface UserActivityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.UserActivityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique published article identifier
   * </pre>
   *
   * <code>int64 published_article_sid = 1 [json_name = "publishedArticleSid", jstype = JS_STRING];</code>
   * @return The publishedArticleSid.
   */
  long getPublishedArticleSid();

  /**
   * <pre>
   * this flag determines whether to allow news article popups while imitating/impersonating
   * </pre>
   *
   * <code>bool force = 2 [json_name = "force"];</code>
   * @return The force.
   */
  boolean getForce();
}
