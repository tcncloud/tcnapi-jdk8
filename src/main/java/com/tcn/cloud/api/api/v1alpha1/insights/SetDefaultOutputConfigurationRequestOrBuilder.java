// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface SetDefaultOutputConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.SetDefaultOutputConfigurationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string insight_id = 1 [json_name = "insightId"];</code>
   * @return The insightId.
   */
  java.lang.String getInsightId();
  /**
   * <code>string insight_id = 1 [json_name = "insightId"];</code>
   * @return The bytes for insightId.
   */
  com.google.protobuf.ByteString
      getInsightIdBytes();

  /**
   * <code>string output_configuration_id = 2 [json_name = "outputConfigurationId"];</code>
   * @return The outputConfigurationId.
   */
  java.lang.String getOutputConfigurationId();
  /**
   * <code>string output_configuration_id = 2 [json_name = "outputConfigurationId"];</code>
   * @return The bytes for outputConfigurationId.
   */
  com.google.protobuf.ByteString
      getOutputConfigurationIdBytes();
}