// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

public interface GetMyUserLocalePreferencesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
