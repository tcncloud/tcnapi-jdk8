// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface GetOutputConfigurationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.GetOutputConfigurationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The requested output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 1 [json_name = "outputConfiguration"];</code>
   * @return Whether the outputConfiguration field is set.
   */
  boolean hasOutputConfiguration();
  /**
   * <pre>
   * The requested output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 1 [json_name = "outputConfiguration"];</code>
   * @return The outputConfiguration.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration getOutputConfiguration();
  /**
   * <pre>
   * The requested output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfiguration output_configuration = 1 [json_name = "outputConfiguration"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder getOutputConfigurationOrBuilder();
}