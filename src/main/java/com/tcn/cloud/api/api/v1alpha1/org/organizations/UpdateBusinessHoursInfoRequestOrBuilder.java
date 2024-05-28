// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

@java.lang.Deprecated public interface UpdateBusinessHoursInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.organizations.UpdateBusinessHoursInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the business hours object
   * </pre>
   *
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The businessHoursId.
   */
  java.lang.String getBusinessHoursId();
  /**
   * <pre>
   * The id of the business hours object
   * </pre>
   *
   * <code>string business_hours_id = 1 [json_name = "businessHoursId"];</code>
   * @return The bytes for businessHoursId.
   */
  com.google.protobuf.ByteString
      getBusinessHoursIdBytes();

  /**
   * <pre>
   * The updated name of the business hours
   * </pre>
   *
   * <code>string business_hours_name = 2 [json_name = "businessHoursName"];</code>
   * @return The businessHoursName.
   */
  java.lang.String getBusinessHoursName();
  /**
   * <pre>
   * The updated name of the business hours
   * </pre>
   *
   * <code>string business_hours_name = 2 [json_name = "businessHoursName"];</code>
   * @return The bytes for businessHoursName.
   */
  com.google.protobuf.ByteString
      getBusinessHoursNameBytes();

  /**
   * <pre>
   * The updated description of the business hours
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The updated description of the business hours
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The updated timezone of the business hours
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <pre>
   * The updated timezone of the business hours
   * </pre>
   *
   * <code>.api.commons.TimeZone timezone = 4 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();

  /**
   * <pre>
   * Field mask for the update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for the update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for the update request
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 5 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
