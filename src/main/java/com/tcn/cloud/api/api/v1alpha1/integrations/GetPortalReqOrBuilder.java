// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface GetPortalReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.GetPortalReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.integrations.PortalId entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.api.v1alpha1.integrations.PortalId entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalId getEntity();
  /**
   * <code>.api.v1alpha1.integrations.PortalId entity = 1 [json_name = "entity"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalIdOrBuilder getEntityOrBuilder();

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
