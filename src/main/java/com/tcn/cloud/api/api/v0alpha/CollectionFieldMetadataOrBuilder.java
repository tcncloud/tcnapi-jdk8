// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CollectionFieldMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CollectionFieldMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  java.lang.String getFieldName();
  /**
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <code>.api.commons.FieldType field_type = 2 [json_name = "fieldType"];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <code>.api.commons.FieldType field_type = 2 [json_name = "fieldType"];</code>
   * @return The fieldType.
   */
  com.tcn.cloud.api.api.commons.FieldType getFieldType();

  /**
   * <pre>
   * Optional field
   * Specifies formating for the field
   * e.g. for a datetime it might be
   * something like "MM/DD/YYYY hh:mm:ss"
   * </pre>
   *
   * <code>string field_format = 3 [json_name = "fieldFormat"];</code>
   * @return The fieldFormat.
   */
  java.lang.String getFieldFormat();
  /**
   * <pre>
   * Optional field
   * Specifies formating for the field
   * e.g. for a datetime it might be
   * something like "MM/DD/YYYY hh:mm:ss"
   * </pre>
   *
   * <code>string field_format = 3 [json_name = "fieldFormat"];</code>
   * @return The bytes for fieldFormat.
   */
  com.google.protobuf.ByteString
      getFieldFormatBytes();
}
