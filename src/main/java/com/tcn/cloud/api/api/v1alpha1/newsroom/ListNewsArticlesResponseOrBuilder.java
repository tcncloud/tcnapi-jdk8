// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface ListNewsArticlesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.ListNewsArticlesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * article details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails> 
      getArticleDetailsList();
  /**
   * <pre>
   * article details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails getArticleDetails(int index);
  /**
   * <pre>
   * article details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  int getArticleDetailsCount();
  /**
   * <pre>
   * article details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder> 
      getArticleDetailsOrBuilderList();
  /**
   * <pre>
   * article details
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder getArticleDetailsOrBuilder(
      int index);
}