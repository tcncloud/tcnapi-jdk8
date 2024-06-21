// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

public interface TranslateTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.translations.v1alpha1.TranslateTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The template to translate.
   * </pre>
   *
   * <code>string template = 1 [json_name = "template"];</code>
   * @return The template.
   */
  java.lang.String getTemplate();
  /**
   * <pre>
   * The template to translate.
   * </pre>
   *
   * <code>string template = 1 [json_name = "template"];</code>
   * @return The bytes for template.
   */
  com.google.protobuf.ByteString
      getTemplateBytes();

  /**
   * <pre>
   * The context of the template.
   * </pre>
   *
   * <code>string context = 2 [json_name = "context"];</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <pre>
   * The context of the template.
   * </pre>
   *
   * <code>string context = 2 [json_name = "context"];</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();
}
