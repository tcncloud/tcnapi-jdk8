// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateScrubListReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateScrubListReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The listId.
   */
  java.lang.String getListId();
  /**
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  com.google.protobuf.ByteString
      getListIdBytes();

  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>repeated string list = 10 [json_name = "list"];</code>
   * @return A list containing the list.
   */
  java.util.List<java.lang.String>
      getListList();
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>repeated string list = 10 [json_name = "list"];</code>
   * @return The count of list.
   */
  int getListCount();
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>repeated string list = 10 [json_name = "list"];</code>
   * @param index The index of the element to return.
   * @return The list at the given index.
   */
  java.lang.String getList(int index);
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>repeated string list = 10 [json_name = "list"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the list at the given index.
   */
  com.google.protobuf.ByteString
      getListBytes(int index);

  /**
   * <code>.api.commons.ContentType content_type = 11 [json_name = "contentType"];</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <code>.api.commons.ContentType content_type = 11 [json_name = "contentType"];</code>
   * @return The contentType.
   */
  com.tcn.cloud.api.api.commons.ContentType getContentType();

  /**
   * <code>string country_code = 12 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <code>string country_code = 12 [json_name = "countryCode"];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>repeated .api.v0alpha.ScrubEntryDetails scrub_entry_details = 13 [json_name = "scrubEntryDetails"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.ScrubEntryDetails> 
      getScrubEntryDetailsList();
  /**
   * <code>repeated .api.v0alpha.ScrubEntryDetails scrub_entry_details = 13 [json_name = "scrubEntryDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ScrubEntryDetails getScrubEntryDetails(int index);
  /**
   * <code>repeated .api.v0alpha.ScrubEntryDetails scrub_entry_details = 13 [json_name = "scrubEntryDetails"];</code>
   */
  int getScrubEntryDetailsCount();
  /**
   * <code>repeated .api.v0alpha.ScrubEntryDetails scrub_entry_details = 13 [json_name = "scrubEntryDetails"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ScrubEntryDetailsOrBuilder> 
      getScrubEntryDetailsOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.ScrubEntryDetails scrub_entry_details = 13 [json_name = "scrubEntryDetails"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ScrubEntryDetailsOrBuilder getScrubEntryDetailsOrBuilder(
      int index);
}
