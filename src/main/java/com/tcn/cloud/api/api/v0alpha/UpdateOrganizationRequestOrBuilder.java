// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * organization id
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * organization id
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * organizations time zone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  int getTimeZoneValue();
  /**
   * <pre>
   * organizations time zone
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 4 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZone();

  /**
   * <pre>
   * organizations name
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * organizations name
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
