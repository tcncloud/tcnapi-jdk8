// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

public interface ExileConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.exile_certificate_manager.v1alpha1.ExileConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the exile configuration
   * </pre>
   *
   * <code>string exile_configuration_id = 1 [json_name = "exileConfigurationId"];</code>
   * @return The exileConfigurationId.
   */
  java.lang.String getExileConfigurationId();
  /**
   * <pre>
   * The id of the exile configuration
   * </pre>
   *
   * <code>string exile_configuration_id = 1 [json_name = "exileConfigurationId"];</code>
   * @return The bytes for exileConfigurationId.
   */
  com.google.protobuf.ByteString
      getExileConfigurationIdBytes();

  /**
   * <pre>
   * The id of the organization.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * The id of the organization.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * The configuration name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The configuration name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The configuration description.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The configuration description.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The type of exile configuration
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 5 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of exile configuration
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 5 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType getType();

  /**
   * <pre>
   * The parameters of the exile configuration
   * This is a JSON string with the following information:
   *   1. Database Host
   *   2. Database URL
   *   3. Database Port
   *   4. Database Username
   *   5. Database Password
   *   6. Max Number Connections
   *   7. Max Number Exile Jobs
   * </pre>
   *
   * <code>string parameters = 6 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  java.lang.String getParameters();
  /**
   * <pre>
   * The parameters of the exile configuration
   * This is a JSON string with the following information:
   *   1. Database Host
   *   2. Database URL
   *   3. Database Port
   *   4. Database Username
   *   5. Database Password
   *   6. Max Number Connections
   *   7. Max Number Exile Jobs
   * </pre>
   *
   * <code>string parameters = 6 [json_name = "parameters"];</code>
   * @return The bytes for parameters.
   */
  com.google.protobuf.ByteString
      getParametersBytes();
}
