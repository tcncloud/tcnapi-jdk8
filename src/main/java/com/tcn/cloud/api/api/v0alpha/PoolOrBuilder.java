// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Pool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string desc = 3 [json_name = "desc", deprecated = true];</code>
   * @deprecated api.v0alpha.Pool.desc is deprecated.
   *     See api/v0alpha/lms.proto;l=641
   * @return The desc.
   */
  @java.lang.Deprecated java.lang.String getDesc();
  /**
   * <code>string desc = 3 [json_name = "desc", deprecated = true];</code>
   * @deprecated api.v0alpha.Pool.desc is deprecated.
   *     See api/v0alpha/lms.proto;l=641
   * @return The bytes for desc.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getDescBytes();
}
