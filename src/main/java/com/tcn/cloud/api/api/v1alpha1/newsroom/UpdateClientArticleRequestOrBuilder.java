// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface UpdateClientArticleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.UpdateClientArticleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the client news article fields specified to be updated
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   * @return Whether the articleDetails field is set.
   */
  boolean hasArticleDetails();
  /**
   * <pre>
   * the client news article fields specified to be updated
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   * @return The articleDetails.
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetails getArticleDetails();
  /**
   * <pre>
   * the client news article fields specified to be updated
   * </pre>
   *
   * <code>.api.v1alpha1.newsroom.NewsArticleDetails article_details = 1 [json_name = "articleDetails"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.newsroom.NewsArticleDetailsOrBuilder getArticleDetailsOrBuilder();

  /**
   * <pre>
   * list of fields Requested to be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * list of fields Requested to be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * list of fields Requested to be updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
