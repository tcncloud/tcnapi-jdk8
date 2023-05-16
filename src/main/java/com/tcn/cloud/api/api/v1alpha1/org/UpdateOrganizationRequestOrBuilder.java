// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface UpdateOrganizationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.UpdateOrganizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of organization to update.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Id of organization to update.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * TimeZone to set.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 2 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  int getTimeZoneValue();
  /**
   * <pre>
   * TimeZone to set.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone = 2 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZone();

  /**
   * <pre>
   * BillingId to set.
   * </pre>
   *
   * <code>string billing_id = 3 [json_name = "billingId"];</code>
   * @return The billingId.
   */
  java.lang.String getBillingId();
  /**
   * <pre>
   * BillingId to set.
   * </pre>
   *
   * <code>string billing_id = 3 [json_name = "billingId"];</code>
   * @return The bytes for billingId.
   */
  com.google.protobuf.ByteString
      getBillingIdBytes();

  /**
   * <pre>
   * Name to set.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name to set.
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Update the P3 owning org
   * </pre>
   *
   * <code>string p3_owner_id = 5 [json_name = "p3OwnerId"];</code>
   * @return The p3OwnerId.
   */
  java.lang.String getP3OwnerId();
  /**
   * <pre>
   * Update the P3 owning org
   * </pre>
   *
   * <code>string p3_owner_id = 5 [json_name = "p3OwnerId"];</code>
   * @return The bytes for p3OwnerId.
   */
  com.google.protobuf.ByteString
      getP3OwnerIdBytes();

  /**
   * <pre>
   * Status of being archived to set
   * </pre>
   *
   * <code>bool archived = 6 [json_name = "archived"];</code>
   * @return The archived.
   */
  boolean getArchived();

  /**
   * <code>repeated string field_mask = 10 [json_name = "fieldMask"];</code>
   * @return A list containing the fieldMask.
   */
  java.util.List<java.lang.String>
      getFieldMaskList();
  /**
   * <code>repeated string field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The count of fieldMask.
   */
  int getFieldMaskCount();
  /**
   * <code>repeated string field_mask = 10 [json_name = "fieldMask"];</code>
   * @param index The index of the element to return.
   * @return The fieldMask at the given index.
   */
  java.lang.String getFieldMask(int index);
  /**
   * <code>repeated string field_mask = 10 [json_name = "fieldMask"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldMask at the given index.
   */
  com.google.protobuf.ByteString
      getFieldMaskBytes(int index);
}
