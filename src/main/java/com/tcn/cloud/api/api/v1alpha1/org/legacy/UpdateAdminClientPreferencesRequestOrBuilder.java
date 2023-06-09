// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateAdminClientPreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateAdminClientPreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * OrgId
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * OrgId
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return Whether the adminClientPreferences field is set.
   */
  boolean hasAdminClientPreferences();
  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return The adminClientPreferences.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AdminClientPreferences getAdminClientPreferences();
  /**
   * <pre>
   * Filter preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.AdminClientPreferencesOrBuilder getAdminClientPreferencesOrBuilder();

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
