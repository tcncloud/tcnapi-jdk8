// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ContactFieldDescOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ContactFieldDesc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contact field description sid
   * </pre>
   *
   * <code>int64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Contact field name
   * </pre>
   *
   * <code>string field_name = 2 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <pre>
   * Contact field name
   * </pre>
   *
   * <code>string field_name = 2 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();
}
