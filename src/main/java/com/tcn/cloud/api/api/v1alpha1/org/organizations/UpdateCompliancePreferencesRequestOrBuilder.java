// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

public interface UpdateCompliancePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.organizations.UpdateCompliancePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Compliance preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.CompliancePreferences compliance_preferences = 1 [json_name = "compliancePreferences"];</code>
   * @return Whether the compliancePreferences field is set.
   */
  boolean hasCompliancePreferences();
  /**
   * <pre>
   * Compliance preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.CompliancePreferences compliance_preferences = 1 [json_name = "compliancePreferences"];</code>
   * @return The compliancePreferences.
   */
  com.tcn.cloud.api.api.commons.org.CompliancePreferences getCompliancePreferences();
  /**
   * <pre>
   * Compliance preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.CompliancePreferences compliance_preferences = 1 [json_name = "compliancePreferences"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CompliancePreferencesOrBuilder getCompliancePreferencesOrBuilder();

  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
