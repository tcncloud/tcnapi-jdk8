// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface ListAutoEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.ListAutoEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @return A list containing the scorecardIds.
   */
  java.util.List<java.lang.Long> getScorecardIdsList();
  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @return The count of scorecardIds.
   */
  int getScorecardIdsCount();
  /**
   * <pre>
   * Optional - filter by scorecard ids.
   * </pre>
   *
   * <code>repeated int64 scorecard_ids = 2 [json_name = "scorecardIds"];</code>
   * @param index The index of the element to return.
   * @return The scorecardIds at the given index.
   */
  long getScorecardIds(int index);

  /**
   * <pre>
   * Optional, filter completed timestamp by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return Whether the completedAt field is set.
   */
  boolean hasCompletedAt();
  /**
   * <pre>
   * Optional, filter completed timestamp by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   * @return The completedAt.
   */
  com.tcn.cloud.api.api.commons.TimeFilter getCompletedAt();
  /**
   * <pre>
   * Optional, filter completed timestamp by a specific range
   * </pre>
   *
   * <code>.api.commons.TimeFilter completed_at = 3 [json_name = "completedAt"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeFilterOrBuilder getCompletedAtOrBuilder();

  /**
   * <pre>
   * Optional - filter by category ids.
   * </pre>
   *
   * <code>repeated int64 category_ids = 5 [json_name = "categoryIds"];</code>
   * @return A list containing the categoryIds.
   */
  java.util.List<java.lang.Long> getCategoryIdsList();
  /**
   * <pre>
   * Optional - filter by category ids.
   * </pre>
   *
   * <code>repeated int64 category_ids = 5 [json_name = "categoryIds"];</code>
   * @return The count of categoryIds.
   */
  int getCategoryIdsCount();
  /**
   * <pre>
   * Optional - filter by category ids.
   * </pre>
   *
   * <code>repeated int64 category_ids = 5 [json_name = "categoryIds"];</code>
   * @param index The index of the element to return.
   * @return The categoryIds at the given index.
   */
  long getCategoryIds(int index);

  /**
   * <pre>
   * Optional - filter by call sid.
   * </pre>
   *
   * <code>.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.CallSidFilter call_sid = 6 [json_name = "callSid"];</code>
   * @return Whether the callSid field is set.
   */
  boolean hasCallSid();
  /**
   * <pre>
   * Optional - filter by call sid.
   * </pre>
   *
   * <code>.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.CallSidFilter call_sid = 6 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.CallSidFilter getCallSid();
  /**
   * <pre>
   * Optional - filter by call sid.
   * </pre>
   *
   * <code>.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.CallSidFilter call_sid = 6 [json_name = "callSid"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.CallSidFilterOrBuilder getCallSidOrBuilder();

  /**
   * <pre>
   * Optional - filter by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 7 [json_name = "agentUserIds"];</code>
   * @return A list containing the agentUserIds.
   */
  java.util.List<java.lang.String>
      getAgentUserIdsList();
  /**
   * <pre>
   * Optional - filter by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 7 [json_name = "agentUserIds"];</code>
   * @return The count of agentUserIds.
   */
  int getAgentUserIdsCount();
  /**
   * <pre>
   * Optional - filter by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 7 [json_name = "agentUserIds"];</code>
   * @param index The index of the element to return.
   * @return The agentUserIds at the given index.
   */
  java.lang.String getAgentUserIds(int index);
  /**
   * <pre>
   * Optional - filter by agent user ids.
   * </pre>
   *
   * <code>repeated string agent_user_ids = 7 [json_name = "agentUserIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentUserIds at the given index.
   */
  com.google.protobuf.ByteString
      getAgentUserIdsBytes(int index);

  /**
   * <pre>
   * Optional - number of auto evaluations included in response.
   * </pre>
   *
   * <code>int32 page_size = 8 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The order by which auto evaluations will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "completed_at DESC".
   * </pre>
   *
   * <code>string order_by = 9 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order by which auto evaluations will be listed. Follows sql order by
   * syntax. When not provided the order defaults to "completed_at DESC".
   * </pre>
   *
   * <code>string order_by = 9 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 10 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 10 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional - filter by risk level.
   * </pre>
   *
   * <code>repeated .api.commons.RiskLevel risk_levels = 11 [json_name = "riskLevels"];</code>
   * @return A list containing the riskLevels.
   */
  java.util.List<com.tcn.cloud.api.api.commons.RiskLevel> getRiskLevelsList();
  /**
   * <pre>
   * Optional - filter by risk level.
   * </pre>
   *
   * <code>repeated .api.commons.RiskLevel risk_levels = 11 [json_name = "riskLevels"];</code>
   * @return The count of riskLevels.
   */
  int getRiskLevelsCount();
  /**
   * <pre>
   * Optional - filter by risk level.
   * </pre>
   *
   * <code>repeated .api.commons.RiskLevel risk_levels = 11 [json_name = "riskLevels"];</code>
   * @param index The index of the element to return.
   * @return The riskLevels at the given index.
   */
  com.tcn.cloud.api.api.commons.RiskLevel getRiskLevels(int index);
  /**
   * <pre>
   * Optional - filter by risk level.
   * </pre>
   *
   * <code>repeated .api.commons.RiskLevel risk_levels = 11 [json_name = "riskLevels"];</code>
   * @return A list containing the enum numeric values on the wire for riskLevels.
   */
  java.util.List<java.lang.Integer>
  getRiskLevelsValueList();
  /**
   * <pre>
   * Optional - filter by risk level.
   * </pre>
   *
   * <code>repeated .api.commons.RiskLevel risk_levels = 11 [json_name = "riskLevels"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of riskLevels at the given index.
   */
  int getRiskLevelsValue(int index);

  /**
   * <pre>
   * Optional. Filter by channel type.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 12 [json_name = "channelTypes"];</code>
   * @return A list containing the channelTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ChannelType> getChannelTypesList();
  /**
   * <pre>
   * Optional. Filter by channel type.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 12 [json_name = "channelTypes"];</code>
   * @return The count of channelTypes.
   */
  int getChannelTypesCount();
  /**
   * <pre>
   * Optional. Filter by channel type.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 12 [json_name = "channelTypes"];</code>
   * @param index The index of the element to return.
   * @return The channelTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelTypes(int index);
  /**
   * <pre>
   * Optional. Filter by channel type.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 12 [json_name = "channelTypes"];</code>
   * @return A list containing the enum numeric values on the wire for channelTypes.
   */
  java.util.List<java.lang.Integer>
  getChannelTypesValueList();
  /**
   * <pre>
   * Optional. Filter by channel type.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 12 [json_name = "channelTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of channelTypes at the given index.
   */
  int getChannelTypesValue(int index);
}
