// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateTtsVoiceReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateTtsVoiceReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string actual_name = 1 [json_name = "actualName"];</code>
   * @return The actualName.
   */
  java.lang.String getActualName();
  /**
   * <pre>
   * required
   * </pre>
   *
   * <code>string actual_name = 1 [json_name = "actualName"];</code>
   * @return The bytes for actualName.
   */
  com.google.protobuf.ByteString
      getActualNameBytes();

  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <code>string display_name = 2 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>int64 port = 3 [json_name = "port"];</code>
   * @return The port.
   */
  long getPort();
}
