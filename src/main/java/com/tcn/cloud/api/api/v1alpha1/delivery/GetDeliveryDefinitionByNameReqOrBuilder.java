// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface GetDeliveryDefinitionByNameReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * obsolete dont use
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
   *     See api/v1alpha1/delivery/service.proto;l=410
   * @return The name.
   */
  @java.lang.Deprecated java.lang.String getName();
  /**
   * <pre>
   * obsolete dont use
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
   *     See api/v1alpha1/delivery/service.proto;l=410
   * @return The bytes for name.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNameBytes();

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

  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition getEntity();
  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder getEntityOrBuilder();
}
