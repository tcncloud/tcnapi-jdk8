// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface IntegrationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.IntegrationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 4 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  int getIntegrationIdValue();
  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 4 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId();

  /**
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.api.v1alpha1.integrations.Values params = 9 [json_name = "params"];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.api.v1alpha1.integrations.Values params = 9 [json_name = "params"];</code>
   * @return The params.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Values getParams();
  /**
   * <code>.api.v1alpha1.integrations.Values params = 9 [json_name = "params"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ValuesOrBuilder getParamsOrBuilder();

  /**
   * <code>bool deleted = 10 [json_name = "deleted"];</code>
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   * <code>.google.protobuf.Timestamp created_on = 11 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  boolean hasCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 11 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  com.google.protobuf.Timestamp getCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 11 [json_name = "createdOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder();

  /**
   * <pre>
   * alternative names that map to parameter names.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.MapString alias = 13 [json_name = "alias"];</code>
   * @return Whether the alias field is set.
   */
  boolean hasAlias();
  /**
   * <pre>
   * alternative names that map to parameter names.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.MapString alias = 13 [json_name = "alias"];</code>
   * @return The alias.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.MapString getAlias();
  /**
   * <pre>
   * alternative names that map to parameter names.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.MapString alias = 13 [json_name = "alias"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.MapStringOrBuilder getAliasOrBuilder();

  /**
   * <pre>
   * these conditions will be checked on the integration's response. If any evaluate to false, the integration method will fail
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Conditions conds = 14 [json_name = "conds"];</code>
   * @return Whether the conds field is set.
   */
  boolean hasConds();
  /**
   * <pre>
   * these conditions will be checked on the integration's response. If any evaluate to false, the integration method will fail
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Conditions conds = 14 [json_name = "conds"];</code>
   * @return The conds.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Conditions getConds();
  /**
   * <pre>
   * these conditions will be checked on the integration's response. If any evaluate to false, the integration method will fail
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Conditions conds = 14 [json_name = "conds"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ConditionsOrBuilder getCondsOrBuilder();

  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 15 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  int getMethodIdValue();
  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 15 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();
}
