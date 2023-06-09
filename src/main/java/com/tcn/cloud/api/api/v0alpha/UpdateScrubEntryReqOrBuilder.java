// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateScrubEntryReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateScrubEntryReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * keys
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The listId.
   */
  java.lang.String getListId();
  /**
   * <pre>
   * keys
   * </pre>
   *
   * <code>string list_id = 2 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  com.google.protobuf.ByteString
      getListIdBytes();

  /**
   * <pre>
   * updateable fields
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 10 [json_name = "notes"];</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <pre>
   * updateable fields
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 10 [json_name = "notes"];</code>
   * @return The notes.
   */
  com.google.protobuf.StringValue getNotes();
  /**
   * <pre>
   * updateable fields
   * </pre>
   *
   * <code>.google.protobuf.StringValue notes = 10 [json_name = "notes"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNotesOrBuilder();

  /**
   * <code>.google.protobuf.StringValue content = 11 [json_name = "content"];</code>
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   * <code>.google.protobuf.StringValue content = 11 [json_name = "content"];</code>
   * @return The content.
   */
  com.google.protobuf.StringValue getContent();
  /**
   * <code>.google.protobuf.StringValue content = 11 [json_name = "content"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getContentOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp expiration_date = 12 [json_name = "expirationDate"];</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <code>.google.protobuf.Timestamp expiration_date = 12 [json_name = "expirationDate"];</code>
   * @return The expirationDate.
   */
  com.google.protobuf.Timestamp getExpirationDate();
  /**
   * <code>.google.protobuf.Timestamp expiration_date = 12 [json_name = "expirationDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationDateOrBuilder();

  /**
   * <code>.google.protobuf.StringValue country_code = 13 [json_name = "countryCode"];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <code>.google.protobuf.StringValue country_code = 13 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <code>.google.protobuf.StringValue country_code = 13 [json_name = "countryCode"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();
}
