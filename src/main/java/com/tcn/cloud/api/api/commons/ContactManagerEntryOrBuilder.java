// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/contactmanager.proto

package com.tcn.cloud.api.api.commons;

public interface ContactManagerEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ContactManagerEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 contact_manager_entry_id = 1 [json_name = "contactManagerEntryId", jstype = JS_STRING];</code>
   * @return The contactManagerEntryId.
   */
  long getContactManagerEntryId();

  /**
   * <code>int64 contact_manager_entry_list_id = 2 [json_name = "contactManagerEntryListId", jstype = JS_STRING];</code>
   * @return The contactManagerEntryListId.
   */
  long getContactManagerEntryListId();

  /**
   * <code>string key = 3 [json_name = "key"];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <code>string key = 3 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>string value = 4 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 4 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string type = 5 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 5 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <code>.google.protobuf.Timestamp date_created = 6 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();
}
