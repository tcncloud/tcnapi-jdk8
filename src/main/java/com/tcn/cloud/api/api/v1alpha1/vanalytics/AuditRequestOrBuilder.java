// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/service.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

public interface AuditRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.vanalytics.AuditRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp since = 2 [json_name = "since"];</code>
   * @return Whether the since field is set.
   */
  boolean hasSince();
  /**
   * <code>.google.protobuf.Timestamp since = 2 [json_name = "since"];</code>
   * @return The since.
   */
  com.google.protobuf.Timestamp getSince();
  /**
   * <code>.google.protobuf.Timestamp since = 2 [json_name = "since"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getSinceOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp until = 3 [json_name = "until"];</code>
   * @return Whether the until field is set.
   */
  boolean hasUntil();
  /**
   * <code>.google.protobuf.Timestamp until = 3 [json_name = "until"];</code>
   * @return The until.
   */
  com.google.protobuf.Timestamp getUntil();
  /**
   * <code>.google.protobuf.Timestamp until = 3 [json_name = "until"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUntilOrBuilder();
}
