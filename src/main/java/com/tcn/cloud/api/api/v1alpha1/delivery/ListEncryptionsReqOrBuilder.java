// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface ListEncryptionsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.ListEncryptionsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.delivery.ListReq entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.api.v1alpha1.delivery.ListReq entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.ListReq getEntity();
  /**
   * <code>.api.v1alpha1.delivery.ListReq entity = 1 [json_name = "entity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.ListReqOrBuilder getEntityOrBuilder();

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