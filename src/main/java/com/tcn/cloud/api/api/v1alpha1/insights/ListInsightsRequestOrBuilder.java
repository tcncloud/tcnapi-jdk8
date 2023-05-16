// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface ListInsightsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.ListInsightsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return A list containing the insightPermissionTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.InsightPermissionType> getInsightPermissionTypesList();
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return The count of insightPermissionTypes.
   */
  int getInsightPermissionTypesCount();
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @param index The index of the element to return.
   * @return The insightPermissionTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.InsightPermissionType getInsightPermissionTypes(int index);
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return A list containing the enum numeric values on the wire for insightPermissionTypes.
   */
  java.util.List<java.lang.Integer>
  getInsightPermissionTypesValueList();
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of insightPermissionTypes at the given index.
   */
  int getInsightPermissionTypesValue(int index);
}
