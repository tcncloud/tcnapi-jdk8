// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface OutputConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.OutputConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for the output configuration
   * </pre>
   *
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * Unique identifier for the output configuration
   * </pre>
   *
   * <code>string resource_id = 1 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   * Title of the output configuration
   * </pre>
   *
   * <code>string output_configuration_title = 3 [json_name = "outputConfigurationTitle"];</code>
   * @return The outputConfigurationTitle.
   */
  java.lang.String getOutputConfigurationTitle();
  /**
   * <pre>
   * Title of the output configuration
   * </pre>
   *
   * <code>string output_configuration_title = 3 [json_name = "outputConfigurationTitle"];</code>
   * @return The bytes for outputConfigurationTitle.
   */
  com.google.protobuf.ByteString
      getOutputConfigurationTitleBytes();

  /**
   * <pre>
   * Type of the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfigurationType output_configuration_type = 4 [json_name = "outputConfigurationType"];</code>
   * @return The enum numeric value on the wire for outputConfigurationType.
   */
  int getOutputConfigurationTypeValue();
  /**
   * <pre>
   * Type of the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.OutputConfigurationType output_configuration_type = 4 [json_name = "outputConfigurationType"];</code>
   * @return The outputConfigurationType.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationType getOutputConfigurationType();

  /**
   * <pre>
   * Insight resource ID associated with the output configuration
   * </pre>
   *
   * <code>string insight_resource_id = 5 [json_name = "insightResourceId"];</code>
   * @return The insightResourceId.
   */
  java.lang.String getInsightResourceId();
  /**
   * <pre>
   * Insight resource ID associated with the output configuration
   * </pre>
   *
   * <code>string insight_resource_id = 5 [json_name = "insightResourceId"];</code>
   * @return The bytes for insightResourceId.
   */
  com.google.protobuf.ByteString
      getInsightResourceIdBytes();

  /**
   * <pre>
   * is_default flag for the output configuration
   * </pre>
   *
   * <code>bool is_default = 6 [json_name = "isDefault"];</code>
   * @return The isDefault.
   */
  boolean getIsDefault();

  /**
   * <pre>
   * Blob data for the output configuration
   * </pre>
   *
   * <code>string blob = 7 [json_name = "blob"];</code>
   * @return Whether the blob field is set.
   */
  boolean hasBlob();
  /**
   * <pre>
   * Blob data for the output configuration
   * </pre>
   *
   * <code>string blob = 7 [json_name = "blob"];</code>
   * @return The blob.
   */
  java.lang.String getBlob();
  /**
   * <pre>
   * Blob data for the output configuration
   * </pre>
   *
   * <code>string blob = 7 [json_name = "blob"];</code>
   * @return The bytes for blob.
   */
  com.google.protobuf.ByteString
      getBlobBytes();

  /**
   * <pre>
   * Table visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TableVisualization table_visualization = 8 [json_name = "tableVisualization"];</code>
   * @return Whether the tableVisualization field is set.
   */
  boolean hasTableVisualization();
  /**
   * <pre>
   * Table visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TableVisualization table_visualization = 8 [json_name = "tableVisualization"];</code>
   * @return The tableVisualization.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TableVisualization getTableVisualization();
  /**
   * <pre>
   * Table visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.TableVisualization table_visualization = 8 [json_name = "tableVisualization"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.TableVisualizationOrBuilder getTableVisualizationOrBuilder();

  /**
   * <pre>
   * Card visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.CardVisualization card_visualization = 11 [json_name = "cardVisualization"];</code>
   * @return Whether the cardVisualization field is set.
   */
  boolean hasCardVisualization();
  /**
   * <pre>
   * Card visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.CardVisualization card_visualization = 11 [json_name = "cardVisualization"];</code>
   * @return The cardVisualization.
   */
  com.tcn.cloud.api.api.v1alpha1.insights.CardVisualization getCardVisualization();
  /**
   * <pre>
   * Card visualization data for the output configuration
   * </pre>
   *
   * <code>.api.v1alpha1.insights.CardVisualization card_visualization = 11 [json_name = "cardVisualization"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.insights.CardVisualizationOrBuilder getCardVisualizationOrBuilder();

  /**
   * <pre>
   * create time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * create time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * create time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * update time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * update time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * update time of output configuration
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.BodyCase getBodyCase();
}
