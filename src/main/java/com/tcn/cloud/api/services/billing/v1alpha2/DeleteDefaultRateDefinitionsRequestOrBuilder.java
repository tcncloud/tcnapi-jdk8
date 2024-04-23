// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.v1alpha2;

public interface DeleteDefaultRateDefinitionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha2.DeleteDefaultRateDefinitionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string rate_definition_ids = 1 [json_name = "rateDefinitionIds"];</code>
   * @return A list containing the rateDefinitionIds.
   */
  java.util.List<java.lang.String>
      getRateDefinitionIdsList();
  /**
   * <code>repeated string rate_definition_ids = 1 [json_name = "rateDefinitionIds"];</code>
   * @return The count of rateDefinitionIds.
   */
  int getRateDefinitionIdsCount();
  /**
   * <code>repeated string rate_definition_ids = 1 [json_name = "rateDefinitionIds"];</code>
   * @param index The index of the element to return.
   * @return The rateDefinitionIds at the given index.
   */
  java.lang.String getRateDefinitionIds(int index);
  /**
   * <code>repeated string rate_definition_ids = 1 [json_name = "rateDefinitionIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the rateDefinitionIds at the given index.
   */
  com.google.protobuf.ByteString
      getRateDefinitionIdsBytes(int index);
}