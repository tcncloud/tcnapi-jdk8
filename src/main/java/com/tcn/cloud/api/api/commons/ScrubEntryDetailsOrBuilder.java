// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

public interface ScrubEntryDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ScrubEntryDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * entry content (phone number, sms, email ...)
   * </pre>
   *
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * entry content (phone number, sms, email ...)
   * </pre>
   *
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * date when entry should expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 2 [json_name = "expirationDate"];</code>
   * @return Whether the expirationDate field is set.
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * date when entry should expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 2 [json_name = "expirationDate"];</code>
   * @return The expirationDate.
   */
  com.google.protobuf.Timestamp getExpirationDate();
  /**
   * <pre>
   * date when entry should expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_date = 2 [json_name = "expirationDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationDateOrBuilder();

  /**
   * <code>.google.protobuf.StringValue notes = 3 [json_name = "notes"];</code>
   * @return Whether the notes field is set.
   */
  boolean hasNotes();
  /**
   * <code>.google.protobuf.StringValue notes = 3 [json_name = "notes"];</code>
   * @return The notes.
   */
  com.google.protobuf.StringValue getNotes();
  /**
   * <code>.google.protobuf.StringValue notes = 3 [json_name = "notes"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNotesOrBuilder();
}
