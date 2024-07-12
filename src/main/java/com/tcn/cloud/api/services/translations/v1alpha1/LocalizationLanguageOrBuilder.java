// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

public interface LocalizationLanguageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.translations.v1alpha1.LocalizationLanguage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The BCP 47 language tag.
   * </pre>
   *
   * <code>string language_tag = 1 [json_name = "languageTag"];</code>
   * @return The languageTag.
   */
  java.lang.String getLanguageTag();
  /**
   * <pre>
   * The BCP 47 language tag.
   * </pre>
   *
   * <code>string language_tag = 1 [json_name = "languageTag"];</code>
   * @return The bytes for languageTag.
   */
  com.google.protobuf.ByteString
      getLanguageTagBytes();

  /**
   * <pre>
   * The name of the language.
   * </pre>
   *
   * <code>string english_name = 2 [json_name = "englishName"];</code>
   * @return The englishName.
   */
  java.lang.String getEnglishName();
  /**
   * <pre>
   * The name of the language.
   * </pre>
   *
   * <code>string english_name = 2 [json_name = "englishName"];</code>
   * @return The bytes for englishName.
   */
  com.google.protobuf.ByteString
      getEnglishNameBytes();
}