// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/exile_configuration.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

public interface CreateExileConfigurationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the exile configuration that was created.
   * DEPRECATED: Use exile_configuration instead.
   * </pre>
   *
   * <code>string exile_configuration_id = 1 [json_name = "exileConfigurationId", deprecated = true];</code>
   * @deprecated services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse.exile_configuration_id is deprecated.
   *     See services/org/exile_certificate_manager/v1alpha1/exile_configuration.proto;l=25
   * @return The exileConfigurationId.
   */
  @java.lang.Deprecated java.lang.String getExileConfigurationId();
  /**
   * <pre>
   * The id of the exile configuration that was created.
   * DEPRECATED: Use exile_configuration instead.
   * </pre>
   *
   * <code>string exile_configuration_id = 1 [json_name = "exileConfigurationId", deprecated = true];</code>
   * @deprecated services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationResponse.exile_configuration_id is deprecated.
   *     See services/org/exile_certificate_manager/v1alpha1/exile_configuration.proto;l=25
   * @return The bytes for exileConfigurationId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getExileConfigurationIdBytes();

  /**
   * <pre>
   * The newly created exile configuration.
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfiguration exile_configuration = 2 [json_name = "exileConfiguration"];</code>
   * @return Whether the exileConfiguration field is set.
   */
  boolean hasExileConfiguration();
  /**
   * <pre>
   * The newly created exile configuration.
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfiguration exile_configuration = 2 [json_name = "exileConfiguration"];</code>
   * @return The exileConfiguration.
   */
  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfiguration getExileConfiguration();
  /**
   * <pre>
   * The newly created exile configuration.
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfiguration exile_configuration = 2 [json_name = "exileConfiguration"];</code>
   */
  com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationOrBuilder getExileConfigurationOrBuilder();
}
