// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface GetFlagRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.GetFlagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The unique id of the flag.
   * </pre>
   *
   * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
   * @return Whether the flagSid field is set.
   */
  boolean hasFlagSid();
  /**
   * <pre>
   * The unique id of the flag.
   * </pre>
   *
   * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  long getFlagSid();

  com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.WhereCase getWhereCase();
}