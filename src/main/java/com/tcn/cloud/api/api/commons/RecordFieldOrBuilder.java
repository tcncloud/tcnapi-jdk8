// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

public interface RecordFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.RecordField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.api.commons.RecordType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.api.commons.RecordType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.api.commons.RecordType getType();
}
