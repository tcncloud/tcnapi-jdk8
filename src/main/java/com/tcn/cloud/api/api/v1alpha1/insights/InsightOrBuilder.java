// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface InsightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.Insight)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required - unique insight snowflake id
   * </pre>
   *
   * <code>int64 insight_id = 2 [json_name = "insightId", jstype = JS_STRING];</code>
   * @return The insightId.
   */
  long getInsightId();

  /**
   * <pre>
   * Required - name of the insight
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required - name of the insight
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required - description of the insight
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Required - description of the insight
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Required - enum type used to deserialize body
   * </pre>
   *
   * <code>.api.commons.InsightType insight_type = 5 [json_name = "insightType"];</code>
   * @return The enum numeric value on the wire for insightType.
   */
  int getInsightTypeValue();
  /**
   * <pre>
   * Required - enum type used to deserialize body
   * </pre>
   *
   * <code>.api.commons.InsightType insight_type = 5 [json_name = "insightType"];</code>
   * @return The insightType.
   */
  com.tcn.cloud.api.api.commons.InsightType getInsightType();

  /**
   * <pre>
   * Required - version of the insight
   * </pre>
   *
   * <code>uint32 insight_version = 6 [json_name = "insightVersion"];</code>
   * @return The insightVersion.
   */
  int getInsightVersion();

  /**
   * <pre>
   * Required - serialized json of the insight body
   * </pre>
   *
   * <code>string body = 7 [json_name = "body"];</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <pre>
   * Required - serialized json of the insight body
   * </pre>
   *
   * <code>string body = 7 [json_name = "body"];</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Required - enum type used to deserialize body
   * </pre>
   *
   * <code>.api.commons.InsightPermissionType insight_permission_type = 8 [json_name = "insightPermissionType"];</code>
   * @return The enum numeric value on the wire for insightPermissionType.
   */
  int getInsightPermissionTypeValue();
  /**
   * <pre>
   * Required - enum type used to deserialize body
   * </pre>
   *
   * <code>.api.commons.InsightPermissionType insight_permission_type = 8 [json_name = "insightPermissionType"];</code>
   * @return The insightPermissionType.
   */
  com.tcn.cloud.api.api.commons.InsightPermissionType getInsightPermissionType();

  /**
   * <pre>
   * unique resource id of the insight
   * </pre>
   *
   * <code>string resource_id = 9 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  java.lang.String getResourceId();
  /**
   * <pre>
   * unique resource id of the insight
   * </pre>
   *
   * <code>string resource_id = 9 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  com.google.protobuf.ByteString
      getResourceIdBytes();

  /**
   * <pre>
   * whether the insight is a standard insight
   * </pre>
   *
   * <code>bool standard_insight = 10 [json_name = "standardInsight"];</code>
   * @return The standardInsight.
   */
  boolean getStandardInsight();

  /**
   * <pre>
   * datasource type of the insight
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 11 [json_name = "datasourceType"];</code>
   * @return The enum numeric value on the wire for datasourceType.
   */
  int getDatasourceTypeValue();
  /**
   * <pre>
   * datasource type of the insight
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 11 [json_name = "datasourceType"];</code>
   * @return The datasourceType.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.DatasourceType getDatasourceType();
}
