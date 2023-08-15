// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/omni.proto

package com.tcn.cloud.api.api.commons.workflows;

public interface OmniNodeOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.workflows.OmniNodeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string options_id = 1 [json_name = "optionsId"];</code>
   * @return The optionsId.
   */
  java.lang.String getOptionsId();
  /**
   * <code>string options_id = 1 [json_name = "optionsId"];</code>
   * @return The bytes for optionsId.
   */
  com.google.protobuf.ByteString
      getOptionsIdBytes();

  /**
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @return A list containing the options.
   */
  java.util.List<java.lang.String>
      getOptionsList();
  /**
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @return The count of options.
   */
  int getOptionsCount();
  /**
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @param index The index of the element to return.
   * @return The options at the given index.
   */
  java.lang.String getOptions(int index);
  /**
   * <code>repeated string options = 2 [json_name = "options"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the options at the given index.
   */
  com.google.protobuf.ByteString
      getOptionsBytes(int index);
}
