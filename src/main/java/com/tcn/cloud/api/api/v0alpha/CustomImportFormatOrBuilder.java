// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CustomImportFormatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CustomImportFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Import format name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Import format name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Contact import template sid
   * </pre>
   *
   * <code>int64 id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();
}
