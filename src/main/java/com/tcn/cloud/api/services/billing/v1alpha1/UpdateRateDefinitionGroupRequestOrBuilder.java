// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/groups.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

public interface UpdateRateDefinitionGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha1.UpdateRateDefinitionGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The rateDefinitionGroupId.
   */
  java.lang.String getRateDefinitionGroupId();
  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The bytes for rateDefinitionGroupId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionGroupIdBytes();

  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   * @return Whether the rateDefinitionGroup field is set.
   */
  boolean hasRateDefinitionGroup();
  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   * @return The rateDefinitionGroup.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup getRateDefinitionGroup();
  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder getRateDefinitionGroupOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields"];</code>
   * @return Whether the updateFields field is set.
   */
  boolean hasUpdateFields();
  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields"];</code>
   * @return The updateFields.
   */
  com.google.protobuf.FieldMask getUpdateFields();
  /**
   * <code>.google.protobuf.FieldMask update_fields = 3 [json_name = "updateFields"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateFieldsOrBuilder();
}
