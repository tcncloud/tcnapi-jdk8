// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface UpdateOutputConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.UpdateOutputConfigurationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output configuration identifier
   * </pre>
   *
   * <code>string output_configuration_id = 1 [json_name = "outputConfigurationId"];</code>
   * @return The outputConfigurationId.
   */
  java.lang.String getOutputConfigurationId();
  /**
   * <pre>
   * Output configuration identifier
   * </pre>
   *
   * <code>string output_configuration_id = 1 [json_name = "outputConfigurationId"];</code>
   * @return The bytes for outputConfigurationId.
   */
  com.google.protobuf.ByteString
      getOutputConfigurationIdBytes();

  /**
   * <pre>
   * Updated output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 3 [json_name = "outputConfiguration"];</code>
   * @return Whether the outputConfiguration field is set.
   */
  boolean hasOutputConfiguration();
  /**
   * <pre>
   * Updated output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 3 [json_name = "outputConfiguration"];</code>
   * @return The outputConfiguration.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration getOutputConfiguration();
  /**
   * <pre>
   * Updated output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 3 [json_name = "outputConfiguration"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder getOutputConfigurationOrBuilder();
}
