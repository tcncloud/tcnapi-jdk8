// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface GetPublishedArticleByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.GetPublishedArticleByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * published article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.PublishedArticleDetails published_article_details = 1 [json_name = "publishedArticleDetails"];</code>
   * @return Whether the publishedArticleDetails field is set.
   */
  boolean hasPublishedArticleDetails();
  /**
   * <pre>
   * published article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.PublishedArticleDetails published_article_details = 1 [json_name = "publishedArticleDetails"];</code>
   * @return The publishedArticleDetails.
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetails getPublishedArticleDetails();
  /**
   * <pre>
   * published article details
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.PublishedArticleDetails published_article_details = 1 [json_name = "publishedArticleDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.PublishedArticleDetailsOrBuilder getPublishedArticleDetailsOrBuilder();
}
