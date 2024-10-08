// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SearchCollectionsPaginatedReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SearchCollectionsPaginatedReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies which collections we are searching in
   * If empty it will search all collections.
   * </pre>
   *
   * <code>repeated string collection_ids = 3 [json_name = "collectionIds"];</code>
   * @return A list containing the collectionIds.
   */
  java.util.List<java.lang.String>
      getCollectionIdsList();
  /**
   * <pre>
   * Specifies which collections we are searching in
   * If empty it will search all collections.
   * </pre>
   *
   * <code>repeated string collection_ids = 3 [json_name = "collectionIds"];</code>
   * @return The count of collectionIds.
   */
  int getCollectionIdsCount();
  /**
   * <pre>
   * Specifies which collections we are searching in
   * If empty it will search all collections.
   * </pre>
   *
   * <code>repeated string collection_ids = 3 [json_name = "collectionIds"];</code>
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  java.lang.String getCollectionIds(int index);
  /**
   * <pre>
   * Specifies which collections we are searching in
   * If empty it will search all collections.
   * </pre>
   *
   * <code>repeated string collection_ids = 3 [json_name = "collectionIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  com.google.protobuf.ByteString
      getCollectionIdsBytes(int index);

  /**
   * <pre>
   * Specifies what we are searching for
   * </pre>
   *
   * <code>.api.v0alpha.Search search = 4 [json_name = "search"];</code>
   * @return Whether the search field is set.
   */
  boolean hasSearch();
  /**
   * <pre>
   * Specifies what we are searching for
   * </pre>
   *
   * <code>.api.v0alpha.Search search = 4 [json_name = "search"];</code>
   * @return The search.
   */
  com.tcn.cloud.api.api.v0alpha.Search getSearch();
  /**
   * <pre>
   * Specifies what we are searching for
   * </pre>
   *
   * <code>.api.v0alpha.Search search = 4 [json_name = "search"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SearchOrBuilder getSearchOrBuilder();

  /**
   * <pre>
   * Specifies where to start in the results
   * </pre>
   *
   * <code>int64 from = 5 [json_name = "from"];</code>
   * @return The from.
   */
  long getFrom();

  /**
   * <pre>
   * How many results to include in a page
   * </pre>
   *
   * <code>int64 page_size = 6 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  long getPageSize();

  /**
   * <pre>
   * The last entry ID in the most recently returned page
   * </pre>
   *
   * <code>string last_id = 7 [json_name = "lastId"];</code>
   * @return The lastId.
   */
  java.lang.String getLastId();
  /**
   * <pre>
   * The last entry ID in the most recently returned page
   * </pre>
   *
   * <code>string last_id = 7 [json_name = "lastId"];</code>
   * @return The bytes for lastId.
   */
  com.google.protobuf.ByteString
      getLastIdBytes();
}
