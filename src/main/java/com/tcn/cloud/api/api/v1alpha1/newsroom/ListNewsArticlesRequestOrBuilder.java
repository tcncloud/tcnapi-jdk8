// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface ListNewsArticlesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.ListNewsArticlesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the statuses to select by when listing articles (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.ArticleStatus statuses = 1 [json_name = "statuses"];</code>
   * @return A list containing the statuses.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ArticleStatus> getStatusesList();
  /**
   * <pre>
   * the statuses to select by when listing articles (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.ArticleStatus statuses = 1 [json_name = "statuses"];</code>
   * @return The count of statuses.
   */
  int getStatusesCount();
  /**
   * <pre>
   * the statuses to select by when listing articles (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.ArticleStatus statuses = 1 [json_name = "statuses"];</code>
   * @param index The index of the element to return.
   * @return The statuses at the given index.
   */
  com.tcn.cloud.api.api.commons.ArticleStatus getStatuses(int index);
  /**
   * <pre>
   * the statuses to select by when listing articles (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.ArticleStatus statuses = 1 [json_name = "statuses"];</code>
   * @return A list containing the enum numeric values on the wire for statuses.
   */
  java.util.List<java.lang.Integer>
  getStatusesValueList();
  /**
   * <pre>
   * the statuses to select by when listing articles (if empty, selects all)
   * </pre>
   *
   * <code>repeated .api.commons.ArticleStatus statuses = 1 [json_name = "statuses"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of statuses at the given index.
   */
  int getStatusesValue(int index);

  /**
   * <pre>
   * list of article details to be Requested
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * list of article details to be Requested
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * list of article details to be Requested
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}