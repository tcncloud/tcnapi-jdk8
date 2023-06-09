// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ListPortalsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ListPortalsReq)
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

  /**
   * <code>int32 page_size = 3 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>int32 page = 4 [json_name = "page"];</code>
   * @return The page.
   */
  int getPage();

  /**
   * <code>repeated .api.v1alpha1.integrations.PortalType ptypes = 5 [json_name = "ptypes"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalType> 
      getPtypesList();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalType ptypes = 5 [json_name = "ptypes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalType getPtypes(int index);
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalType ptypes = 5 [json_name = "ptypes"];</code>
   */
  int getPtypesCount();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalType ptypes = 5 [json_name = "ptypes"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PortalTypeOrBuilder> 
      getPtypesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalType ptypes = 5 [json_name = "ptypes"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalTypeOrBuilder getPtypesOrBuilder(
      int index);
}
