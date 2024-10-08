// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PaginatedSearchResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.PaginatedSearchRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A page of results
   * </pre>
   *
   * <code>repeated .api.v0alpha.CollectionEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry> 
      getEntriesList();
  /**
   * <pre>
   * A page of results
   * </pre>
   *
   * <code>repeated .api.v0alpha.CollectionEntry entries = 1 [json_name = "entries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CollectionEntry getEntries(int index);
  /**
   * <pre>
   * A page of results
   * </pre>
   *
   * <code>repeated .api.v0alpha.CollectionEntry entries = 1 [json_name = "entries"];</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * A page of results
   * </pre>
   *
   * <code>repeated .api.v0alpha.CollectionEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * A page of results
   * </pre>
   *
   * <code>repeated .api.v0alpha.CollectionEntry entries = 1 [json_name = "entries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Specifies the total number of results
   * </pre>
   *
   * <code>int64 total = 2 [json_name = "total"];</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <pre>
   * Whether or not there is another page of results
   * </pre>
   *
   * <code>bool more_results = 3 [json_name = "moreResults"];</code>
   * @return The moreResults.
   */
  boolean getMoreResults();

  /**
   * <pre>
   * The last entry ID in the most recently grabbed page of results
   * </pre>
   *
   * <code>string last_id = 4 [json_name = "lastId"];</code>
   * @return The lastId.
   */
  java.lang.String getLastId();
  /**
   * <pre>
   * The last entry ID in the most recently grabbed page of results
   * </pre>
   *
   * <code>string last_id = 4 [json_name = "lastId"];</code>
   * @return The bytes for lastId.
   */
  com.google.protobuf.ByteString
      getLastIdBytes();
}
