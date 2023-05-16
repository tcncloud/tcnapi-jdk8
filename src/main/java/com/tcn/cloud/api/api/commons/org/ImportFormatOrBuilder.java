// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface ImportFormatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ImportFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return Whether the standard field is set.
   */
  boolean hasStandard();
  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return The enum numeric value on the wire for standard.
   */
  int getStandardValue();
  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return The standard.
   */
  com.tcn.cloud.api.api.commons.StandardImportFormat getStandard();

  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   * @return The custom.
   */
  com.tcn.cloud.api.api.commons.org.CustomImportFormat getCustom();
  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder getCustomOrBuilder();

  com.tcn.cloud.api.api.commons.org.ImportFormat.FormatCase getFormatCase();
}
