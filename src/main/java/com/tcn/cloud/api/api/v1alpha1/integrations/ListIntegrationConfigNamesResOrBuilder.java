// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ListIntegrationConfigNamesResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.ListIntegrationConfigNamesRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 3 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  int getIntegrationIdValue();
  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 3 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId();

  /**
   * <code>repeated string names = 4 [json_name = "names"];</code>
   * @return A list containing the names.
   */
  java.util.List<java.lang.String>
      getNamesList();
  /**
   * <code>repeated string names = 4 [json_name = "names"];</code>
   * @return The count of names.
   */
  int getNamesCount();
  /**
   * <code>repeated string names = 4 [json_name = "names"];</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);
  /**
   * <code>repeated string names = 4 [json_name = "names"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);
}
