// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface GetNewsArticleByIdRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.GetNewsArticleByIdRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the unique news article identifier
   * </pre>
   *
   * <code>int64 new_article_sid = 1 [json_name = "newArticleSid", jstype = JS_STRING];</code>
   * @return The newArticleSid.
   */
  long getNewArticleSid();
}
