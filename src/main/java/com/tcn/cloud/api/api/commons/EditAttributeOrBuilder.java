// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

public interface EditAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.EditAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Column Descripter
   * </pre>
   *
   * <code>int64 col_desc = 1 [json_name = "colDesc", jstype = JS_STRING];</code>
   * @return The colDesc.
   */
  long getColDesc();

  /**
   * <code>string from_val = 2 [json_name = "fromVal"];</code>
   * @return The fromVal.
   */
  java.lang.String getFromVal();
  /**
   * <code>string from_val = 2 [json_name = "fromVal"];</code>
   * @return The bytes for fromVal.
   */
  com.google.protobuf.ByteString
      getFromValBytes();

  /**
   * <code>string to_val = 3 [json_name = "toVal"];</code>
   * @return The toVal.
   */
  java.lang.String getToVal();
  /**
   * <code>string to_val = 3 [json_name = "toVal"];</code>
   * @return The bytes for toVal.
   */
  com.google.protobuf.ByteString
      getToValBytes();

  /**
   * <pre>
   *EditColumnType edit_column_type = 5;
   * </pre>
   *
   * <code>bool is_edited = 4 [json_name = "isEdited"];</code>
   * @return The isEdited.
   */
  boolean getIsEdited();
}
