// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.v1alpha2;

public interface UpdateDefaultRateDefinitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha2.UpdateDefaultRateDefinitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The rateDefinitionId.
   */
  java.lang.String getRateDefinitionId();
  /**
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The bytes for rateDefinitionId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionIdBytes();

  /**
   * <code>.services.billing.entities.v1alpha2.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return Whether the rateDefinition field is set.
   */
  boolean hasRateDefinition();
  /**
   * <code>.services.billing.entities.v1alpha2.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return The rateDefinition.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.RateDefinition getRateDefinition();
  /**
   * <code>.services.billing.entities.v1alpha2.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha2.RateDefinitionOrBuilder getRateDefinitionOrBuilder();

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
