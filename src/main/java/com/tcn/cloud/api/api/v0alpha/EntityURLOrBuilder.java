// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EntityURLOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EntityURL)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.EpicEntityType entity_type = 1 [json_name = "entityType"];</code>
   * @return The enum numeric value on the wire for entityType.
   */
  int getEntityTypeValue();
  /**
   * <code>.api.v0alpha.EpicEntityType entity_type = 1 [json_name = "entityType"];</code>
   * @return The entityType.
   */
  com.tcn.cloud.api.api.v0alpha.EpicEntityType getEntityType();

  /**
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 2 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
