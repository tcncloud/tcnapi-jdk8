// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ScrubListResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ScrubListRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string list_id = 1 [json_name = "listId"];</code>
   * @return The listId.
   */
  java.lang.String getListId();
  /**
   * <code>string list_id = 1 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  com.google.protobuf.ByteString
      getListIdBytes();

  /**
   * <code>bool read_only = 2 [json_name = "readOnly"];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();

  /**
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <code>.api.commons.ContentType content_type = 3 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <code>int64 entries_added = 4 [json_name = "entriesAdded"];</code>
   * @return The entriesAdded.
   */
  long getEntriesAdded();

  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries", deprecated = true];</code>
   * @deprecated api.v0alpha.ScrubListRes.invalid_entries is deprecated.
   *     See api/v0alpha/compliance.proto;l=1075
   * @return A list containing the invalidEntries.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getInvalidEntriesList();
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries", deprecated = true];</code>
   * @deprecated api.v0alpha.ScrubListRes.invalid_entries is deprecated.
   *     See api/v0alpha/compliance.proto;l=1075
   * @return The count of invalidEntries.
   */
  @java.lang.Deprecated int getInvalidEntriesCount();
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries", deprecated = true];</code>
   * @deprecated api.v0alpha.ScrubListRes.invalid_entries is deprecated.
   *     See api/v0alpha/compliance.proto;l=1075
   * @param index The index of the element to return.
   * @return The invalidEntries at the given index.
   */
  @java.lang.Deprecated java.lang.String getInvalidEntries(int index);
  /**
   * <code>repeated string invalid_entries = 5 [json_name = "invalidEntries", deprecated = true];</code>
   * @deprecated api.v0alpha.ScrubListRes.invalid_entries is deprecated.
   *     See api/v0alpha/compliance.proto;l=1075
   * @param index The index of the value to return.
   * @return The bytes of the invalidEntries at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getInvalidEntriesBytes(int index);

  /**
   * <code>int64 total_invalid = 6 [json_name = "totalInvalid"];</code>
   * @return The totalInvalid.
   */
  long getTotalInvalid();

  /**
   * <code>repeated .api.commons.InvalidScrubListEntry invalid_list = 7 [json_name = "invalidList"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.InvalidScrubListEntry> 
      getInvalidListList();
  /**
   * <code>repeated .api.commons.InvalidScrubListEntry invalid_list = 7 [json_name = "invalidList"];</code>
   */
  com.tcn.cloud.api.api.commons.InvalidScrubListEntry getInvalidList(int index);
  /**
   * <code>repeated .api.commons.InvalidScrubListEntry invalid_list = 7 [json_name = "invalidList"];</code>
   */
  int getInvalidListCount();
  /**
   * <code>repeated .api.commons.InvalidScrubListEntry invalid_list = 7 [json_name = "invalidList"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.InvalidScrubListEntryOrBuilder> 
      getInvalidListOrBuilderList();
  /**
   * <code>repeated .api.commons.InvalidScrubListEntry invalid_list = 7 [json_name = "invalidList"];</code>
   */
  com.tcn.cloud.api.api.commons.InvalidScrubListEntryOrBuilder getInvalidListOrBuilder(
      int index);
}
