// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface LearnSnippetDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.LearnSnippetDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * storage bucket
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * storage bucket
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 2 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * markdown content
   * </pre>
   *
   * <code>string content = 2 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp"];</code>
   * @return Whether the lastEditedTimestamp field is set.
   */
  boolean hasLastEditedTimestamp();
  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp"];</code>
   * @return The lastEditedTimestamp.
   */
  com.google.protobuf.Timestamp getLastEditedTimestamp();
  /**
   * <pre>
   * The last time this learning content was edited.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastEditedTimestampOrBuilder();

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
}
