// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface GetCredentialReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.GetCredentialReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.delivery.Credential entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.api.v1alpha1.delivery.Credential entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.Credential getEntity();
  /**
   * <code>.api.v1alpha1.delivery.Credential entity = 1 [json_name = "entity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder getEntityOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   * @return Whether the mask field is set.
   */
  boolean hasMask();
  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   * @return The mask.
   */
  com.google.protobuf.FieldMask getMask();
  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder();
}
