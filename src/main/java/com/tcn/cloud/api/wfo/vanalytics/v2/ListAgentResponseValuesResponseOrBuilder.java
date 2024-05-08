// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface ListAgentResponseValuesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.ListAgentResponseValuesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Values are the transcript agent response values.
   * </pre>
   *
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * Values are the transcript agent response values.
   * </pre>
   *
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Values are the transcript agent response values.
   * </pre>
   *
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * Values are the transcript agent response values.
   * </pre>
   *
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}