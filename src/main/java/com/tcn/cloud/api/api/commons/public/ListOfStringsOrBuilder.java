// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/public/integrations.proto

package com.tcn.cloud.api.api.commons.public;

public interface ListOfStringsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.public.ListOfStrings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <code>repeated string values = 1 [json_name = "values"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
