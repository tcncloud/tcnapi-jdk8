// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface RecordFieldMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.RecordFieldMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .api.v0alpha.RecordFieldProto&gt; fields = 1 [json_name = "fields"];</code>
   */
  int getFieldsCount();
  /**
   * <code>map&lt;string, .api.v0alpha.RecordFieldProto&gt; fields = 1 [json_name = "fields"];</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v0alpha.RecordFieldProto>
  getFields();
  /**
   * <code>map&lt;string, .api.v0alpha.RecordFieldProto&gt; fields = 1 [json_name = "fields"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v0alpha.RecordFieldProto>
  getFieldsMap();
  /**
   * <code>map&lt;string, .api.v0alpha.RecordFieldProto&gt; fields = 1 [json_name = "fields"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v0alpha.RecordFieldProto getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v0alpha.RecordFieldProto defaultValue);
  /**
   * <code>map&lt;string, .api.v0alpha.RecordFieldProto&gt; fields = 1 [json_name = "fields"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RecordFieldProto getFieldsOrThrow(
      java.lang.String key);
}
