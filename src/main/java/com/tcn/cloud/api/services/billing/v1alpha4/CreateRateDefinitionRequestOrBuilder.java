// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/plan.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

public interface CreateRateDefinitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha4.CreateRateDefinitionRequest)
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
   * <code>.services.billing.entities.v1alpha4.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return Whether the rateDefinition field is set.
   */
  boolean hasRateDefinition();
  /**
   * <code>.services.billing.entities.v1alpha4.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   * @return The rateDefinition.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.RateDefinition getRateDefinition();
  /**
   * <code>.services.billing.entities.v1alpha4.RateDefinition rate_definition = 2 [json_name = "rateDefinition"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha4.RateDefinitionOrBuilder getRateDefinitionOrBuilder();
}
