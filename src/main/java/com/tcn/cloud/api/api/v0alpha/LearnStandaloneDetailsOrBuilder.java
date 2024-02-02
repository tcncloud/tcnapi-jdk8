// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface LearnStandaloneDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.LearnStandaloneDetails)
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
   * deprecated
   * </pre>
   *
   * <code>string content = 2 [json_name = "content", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
   *     See api/v0alpha/learn.proto;l=354
   * @return The content.
   */
  @java.lang.Deprecated java.lang.String getContent();
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>string content = 2 [json_name = "content", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
   *     See api/v0alpha/learn.proto;l=354
   * @return The bytes for content.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
   *     See api/v0alpha/learn.proto;l=356
   * @return Whether the lastEditedTimestamp field is set.
   */
  @java.lang.Deprecated boolean hasLastEditedTimestamp();
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
   *     See api/v0alpha/learn.proto;l=356
   * @return The lastEditedTimestamp.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getLastEditedTimestamp();
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getLastEditedTimestampOrBuilder();

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
