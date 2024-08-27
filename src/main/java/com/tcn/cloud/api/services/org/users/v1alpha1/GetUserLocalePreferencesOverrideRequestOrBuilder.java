// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

public interface GetUserLocalePreferencesOverrideRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.users.v1alpha1.GetUserLocalePreferencesOverrideRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the user to retrieve the locale preferences override for.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * The ID of the user to retrieve the locale preferences override for.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
