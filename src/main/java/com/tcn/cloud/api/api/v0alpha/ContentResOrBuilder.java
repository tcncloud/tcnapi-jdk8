// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ContentResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ContentRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 2 [json_name = "lastEditedTimestamp"];</code>
   * @return Whether the lastEditedTimestamp field is set.
   */
  boolean hasLastEditedTimestamp();
  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 2 [json_name = "lastEditedTimestamp"];</code>
   * @return The lastEditedTimestamp.
   */
  com.google.protobuf.Timestamp getLastEditedTimestamp();
  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 2 [json_name = "lastEditedTimestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedTimestampOrBuilder();

  /**
   * <pre>
   * List containing static file links from parsing markdown
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage> 
      getImagesList();
  /**
   * <pre>
   * List containing static file links from parsing markdown
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.LearnImage getImages(int index);
  /**
   * <pre>
   * List containing static file links from parsing markdown
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  int getImagesCount();
  /**
   * <pre>
   * List containing static file links from parsing markdown
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder> 
      getImagesOrBuilderList();
  /**
   * <pre>
   * List containing static file links from parsing markdown
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder getImagesOrBuilder(
      int index);

  /**
   * <pre>
   * title of the article
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title of the article
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * view total count
   * </pre>
   *
   * <code>int64 total_view_count = 5 [json_name = "totalViewCount"];</code>
   * @return The totalViewCount.
   */
  long getTotalViewCount();

  /**
   * <pre>
   * The user who edited the content last
   * </pre>
   *
   * <code>string last_edited_user = 6 [json_name = "lastEditedUser"];</code>
   * @return The lastEditedUser.
   */
  java.lang.String getLastEditedUser();
  /**
   * <pre>
   * The user who edited the content last
   * </pre>
   *
   * <code>string last_edited_user = 6 [json_name = "lastEditedUser"];</code>
   * @return The bytes for lastEditedUser.
   */
  com.google.protobuf.ByteString
      getLastEditedUserBytes();
}
