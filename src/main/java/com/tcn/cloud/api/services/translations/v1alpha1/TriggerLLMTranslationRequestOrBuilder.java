// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

public interface TriggerLLMTranslationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.translations.v1alpha1.TriggerLLMTranslationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the translation to trigger the LLM translation.
   * </pre>
   *
   * <code>string translation_id = 1 [json_name = "translationId"];</code>
   * @return The translationId.
   */
  java.lang.String getTranslationId();
  /**
   * <pre>
   * The ID of the translation to trigger the LLM translation.
   * </pre>
   *
   * <code>string translation_id = 1 [json_name = "translationId"];</code>
   * @return The bytes for translationId.
   */
  com.google.protobuf.ByteString
      getTranslationIdBytes();
}
