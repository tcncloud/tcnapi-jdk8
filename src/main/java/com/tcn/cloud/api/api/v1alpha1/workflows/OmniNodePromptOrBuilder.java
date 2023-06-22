// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/omni.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface OmniNodePromptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.OmniNodePrompt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The prompt.
   */
  java.lang.String getPrompt();
  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The bytes for prompt.
   */
  com.google.protobuf.ByteString
      getPromptBytes();

  /**
   * <code>string store_to = 2 [json_name = "storeTo"];</code>
   * @return The storeTo.
   */
  java.lang.String getStoreTo();
  /**
   * <code>string store_to = 2 [json_name = "storeTo"];</code>
   * @return The bytes for storeTo.
   */
  com.google.protobuf.ByteString
      getStoreToBytes();

  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @return A list containing the options.
   */
  java.util.List<java.lang.String>
      getOptionsList();
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @return The count of options.
   */
  int getOptionsCount();
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @param index The index of the element to return.
   * @return The options at the given index.
   */
  java.lang.String getOptions(int index);
  /**
   * <code>repeated string options = 3 [json_name = "options"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the options at the given index.
   */
  com.google.protobuf.ByteString
      getOptionsBytes(int index);
}
