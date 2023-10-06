// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/newsroom/entities.proto

package com.tcn.cloud.api.api.v1alpha1.newsroom;

public interface NewsArticleDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.newsroom.NewsArticleDetails)
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

  /**
   * <pre>
   * news article title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * news article title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 3 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * article status
   * </pre>
   *
   * <code>.api.commons.ArticleStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * article status
   * </pre>
   *
   * <code>.api.commons.ArticleStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.ArticleStatus getStatus();

  /**
   * <pre>
   * news article creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * news article creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * news article creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * news article last updated date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited = 6 [json_name = "lastEdited"];</code>
   * @return Whether the lastEdited field is set.
   */
  boolean hasLastEdited();
  /**
   * <pre>
   * news article last updated date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited = 6 [json_name = "lastEdited"];</code>
   * @return The lastEdited.
   */
  com.google.protobuf.Timestamp getLastEdited();
  /**
   * <pre>
   * news article last updated date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited = 6 [json_name = "lastEdited"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedOrBuilder();

  /**
   * <pre>
   * article author
   * </pre>
   *
   * <code>string author = 7 [json_name = "author"];</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <pre>
   * article author
   * </pre>
   *
   * <code>string author = 7 [json_name = "author"];</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <pre>
   * image reference id
   * </pre>
   *
   * <code>string image_reference_id = 8 [json_name = "imageReferenceId"];</code>
   * @return The imageReferenceId.
   */
  java.lang.String getImageReferenceId();
  /**
   * <pre>
   * image reference id
   * </pre>
   *
   * <code>string image_reference_id = 8 [json_name = "imageReferenceId"];</code>
   * @return The bytes for imageReferenceId.
   */
  com.google.protobuf.ByteString
      getImageReferenceIdBytes();
}
