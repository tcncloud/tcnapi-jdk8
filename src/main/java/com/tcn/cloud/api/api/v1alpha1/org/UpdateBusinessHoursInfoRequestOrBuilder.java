// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateBusinessHoursInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateBusinessHoursInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The businessHoursId.
   */
  java.lang.String getBusinessHoursId();
  /**
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The bytes for businessHoursId.
   */
  com.google.protobuf.ByteString
      getBusinessHoursIdBytes();

  /**
   * <code>string business_hours_name = 2 [json_name = "businessHoursName"];</code>
   * @return The businessHoursName.
   */
  java.lang.String getBusinessHoursName();
  /**
   * <code>string business_hours_name = 2 [json_name = "businessHoursName"];</code>
   * @return The bytes for businessHoursName.
   */
  com.google.protobuf.ByteString
      getBusinessHoursNameBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();

  /**
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
