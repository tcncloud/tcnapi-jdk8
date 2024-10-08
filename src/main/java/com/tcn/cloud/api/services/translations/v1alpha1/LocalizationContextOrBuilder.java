// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

public interface LocalizationContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.translations.v1alpha1.LocalizationContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The context.
   * </pre>
   *
   * <code>string context = 1 [json_name = "context"];</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <pre>
   * The context.
   * </pre>
   *
   * <code>string context = 1 [json_name = "context"];</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();

  /**
   * <pre>
   * The system message.
   * </pre>
   *
   * <code>string system_message = 2 [json_name = "systemMessage"];</code>
   * @return The systemMessage.
   */
  java.lang.String getSystemMessage();
  /**
   * <pre>
   * The system message.
   * </pre>
   *
   * <code>string system_message = 2 [json_name = "systemMessage"];</code>
   * @return The bytes for systemMessage.
   */
  com.google.protobuf.ByteString
      getSystemMessageBytes();

  /**
   * <pre>
   * The enabled status of the context.
   * </pre>
   *
   * <code>bool enabled = 3 [json_name = "enabled"];</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
