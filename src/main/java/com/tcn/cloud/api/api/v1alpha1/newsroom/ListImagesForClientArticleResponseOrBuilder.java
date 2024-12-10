// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface ListImagesForClientArticleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.ListImagesForClientArticleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * images for the client news article
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleImage news_article_images = 1 [json_name = "newsArticleImages"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage> 
      getNewsArticleImagesList();
  /**
   * <pre>
   * images for the client news article
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleImage news_article_images = 1 [json_name = "newsArticleImages"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImage getNewsArticleImages(int index);
  /**
   * <pre>
   * images for the client news article
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleImage news_article_images = 1 [json_name = "newsArticleImages"];</code>
   */
  int getNewsArticleImagesCount();
  /**
   * <pre>
   * images for the client news article
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleImage news_article_images = 1 [json_name = "newsArticleImages"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImageOrBuilder> 
      getNewsArticleImagesOrBuilderList();
  /**
   * <pre>
   * images for the client news article
   * </pre>
   *
   * <code>repeated .api.v1alpha1.newsroom.NewsArticleImage news_article_images = 1 [json_name = "newsArticleImages"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleImageOrBuilder getNewsArticleImagesOrBuilder(
      int index);
}
