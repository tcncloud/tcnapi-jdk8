// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UpdateUserSubscriptionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.UpdateUserSubscriptionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.
   * Must have org id, user id, and subscription id.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return Whether the subscription field is set.
   */
  boolean hasSubscription();
  /**
   * <pre>
   * Required.
   * Must have org id, user id, and subscription id.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return The subscription.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.UserSubscription getSubscription();
  /**
   * <pre>
   * Required.
   * Must have org id, user id, and subscription id.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.UserSubscriptionOrBuilder getSubscriptionOrBuilder();

  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
