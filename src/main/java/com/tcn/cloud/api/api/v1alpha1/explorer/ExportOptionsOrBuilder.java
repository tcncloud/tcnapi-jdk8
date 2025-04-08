// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface ExportOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.ExportOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Delimiter for file exports
   * </pre>
   *
   * <code>string delimiter = 1 [json_name = "delimiter"];</code>
   * @return The delimiter.
   */
  java.lang.String getDelimiter();
  /**
   * <pre>
   * Delimiter for file exports
   * </pre>
   *
   * <code>string delimiter = 1 [json_name = "delimiter"];</code>
   * @return The bytes for delimiter.
   */
  com.google.protobuf.ByteString
      getDelimiterBytes();

  /**
   * <pre>
   * Quote character for file exports
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
   * @return The enum numeric value on the wire for quoteCharacter.
   */
  int getQuoteCharacterValue();
  /**
   * <pre>
   * Quote character for file exports
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
   * @return The quoteCharacter.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter getQuoteCharacter();

  /**
   * <pre>
   * Flag to include header in file exports
   * </pre>
   *
   * <code>bool no_header = 3 [json_name = "noHeader"];</code>
   * @return The noHeader.
   */
  boolean getNoHeader();

  /**
   * <pre>
   * File extension for exporting
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
   * @return The enum numeric value on the wire for fileExtension.
   */
  int getFileExtensionValue();
  /**
   * <pre>
   * File extension for exporting
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
   * @return The fileExtension.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension getFileExtension();
}
