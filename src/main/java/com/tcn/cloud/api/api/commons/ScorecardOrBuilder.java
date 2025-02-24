// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

public interface ScorecardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Scorecard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id of the scorecard
   * </pre>
   *
   * <code>int64 scorecard_id = 2 [json_name = "scorecardId"];</code>
   * @return The scorecardId.
   */
  long getScorecardId();

  /**
   * <pre>
   * user_id of the scorecard creator
   * </pre>
   *
   * <code>string author_id = 3 [json_name = "authorId"];</code>
   * @return The authorId.
   */
  java.lang.String getAuthorId();
  /**
   * <pre>
   * user_id of the scorecard creator
   * </pre>
   *
   * <code>string author_id = 3 [json_name = "authorId"];</code>
   * @return The bytes for authorId.
   */
  com.google.protobuf.ByteString
      getAuthorIdBytes();

  /**
   * <pre>
   * title, or name, of scorecard
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title, or name, of scorecard
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * description of scorecard (i.e. purpose and use)
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description of scorecard (i.e. purpose and use)
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * percentage to two decimal places between (0 or 1?) and 100
   * </pre>
   *
   * <code>double pass_score = 6 [json_name = "passScore"];</code>
   * @return The passScore.
   */
  double getPassScore();

  /**
   * <pre>
   * how a score is calculated (i.e. simple sum)
   * </pre>
   *
   * <code>.api.commons.ScoreType score_type = 7 [json_name = "scoreType"];</code>
   * @return The enum numeric value on the wire for scoreType.
   */
  int getScoreTypeValue();
  /**
   * <pre>
   * how a score is calculated (i.e. simple sum)
   * </pre>
   *
   * <code>.api.commons.ScoreType score_type = 7 [json_name = "scoreType"];</code>
   * @return The scoreType.
   */
  com.tcn.cloud.api.api.commons.ScoreType getScoreType();

  /**
   * <pre>
   * how the scorecard gets evaluated (i.e. manual)
   * </pre>
   *
   * <code>.api.commons.EvaluationType evaluation_type = 8 [json_name = "evaluationType"];</code>
   * @return The enum numeric value on the wire for evaluationType.
   */
  int getEvaluationTypeValue();
  /**
   * <pre>
   * how the scorecard gets evaluated (i.e. manual)
   * </pre>
   *
   * <code>.api.commons.EvaluationType evaluation_type = 8 [json_name = "evaluationType"];</code>
   * @return The evaluationType.
   */
  com.tcn.cloud.api.api.commons.EvaluationType getEvaluationType();

  /**
   * <pre>
   * default false (disable agent feedback)
   * </pre>
   *
   * <code>bool allow_feedback = 10 [json_name = "allowFeedback"];</code>
   * @return The allowFeedback.
   */
  boolean getAllowFeedback();

  /**
   * <pre>
   * FE only; if true, weights are evenly distributed and locked
   * </pre>
   *
   * <code>bool distribute_weights = 11 [json_name = "distributeWeights"];</code>
   * @return The distributeWeights.
   */
  boolean getDistributeWeights();

  /**
   * <pre>
   * sets the required agent skills
   * </pre>
   *
   * <code>.api.commons.Category category = 12 [json_name = "category"];</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * sets the required agent skills
   * </pre>
   *
   * <code>.api.commons.Category category = 12 [json_name = "category"];</code>
   * @return The category.
   */
  com.tcn.cloud.api.api.commons.Category getCategory();
  /**
   * <pre>
   * sets the required agent skills
   * </pre>
   *
   * <code>.api.commons.Category category = 12 [json_name = "category"];</code>
   */
  com.tcn.cloud.api.api.commons.CategoryOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * logical groupings of questions
   * </pre>
   *
   * <code>repeated .api.commons.Section sections = 13 [json_name = "sections"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.Section> 
      getSectionsList();
  /**
   * <pre>
   * logical groupings of questions
   * </pre>
   *
   * <code>repeated .api.commons.Section sections = 13 [json_name = "sections"];</code>
   */
  com.tcn.cloud.api.api.commons.Section getSections(int index);
  /**
   * <pre>
   * logical groupings of questions
   * </pre>
   *
   * <code>repeated .api.commons.Section sections = 13 [json_name = "sections"];</code>
   */
  int getSectionsCount();
  /**
   * <pre>
   * logical groupings of questions
   * </pre>
   *
   * <code>repeated .api.commons.Section sections = 13 [json_name = "sections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.SectionOrBuilder> 
      getSectionsOrBuilderList();
  /**
   * <pre>
   * logical groupings of questions
   * </pre>
   *
   * <code>repeated .api.commons.Section sections = 13 [json_name = "sections"];</code>
   */
  com.tcn.cloud.api.api.commons.SectionOrBuilder getSectionsOrBuilder(
      int index);

  /**
   * <pre>
   * current version of the scorecard
   * </pre>
   *
   * <code>int32 version = 14 [json_name = "version"];</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * determines how a scorecard can be used
   * </pre>
   *
   * <code>.api.commons.ScorecardState state = 15 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * determines how a scorecard can be used
   * </pre>
   *
   * <code>.api.commons.ScorecardState state = 15 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.commons.ScorecardState getState();

  /**
   * <pre>
   * Deprecated. Use Ad Hoc category.
   * </pre>
   *
   * <code>bool is_ad_hoc = 16 [json_name = "isAdHoc", deprecated = true];</code>
   * @deprecated api.commons.Scorecard.is_ad_hoc is deprecated.
   *     See api/commons/scorecards.proto;l=326
   * @return The isAdHoc.
   */
  @java.lang.Deprecated boolean getIsAdHoc();

  /**
   * <pre>
   * Optional. Set of unique keys for custom key-value fields.
   * </pre>
   *
   * <code>repeated string custom_field_keys = 19 [json_name = "customFieldKeys"];</code>
   * @return A list containing the customFieldKeys.
   */
  java.util.List<java.lang.String>
      getCustomFieldKeysList();
  /**
   * <pre>
   * Optional. Set of unique keys for custom key-value fields.
   * </pre>
   *
   * <code>repeated string custom_field_keys = 19 [json_name = "customFieldKeys"];</code>
   * @return The count of customFieldKeys.
   */
  int getCustomFieldKeysCount();
  /**
   * <pre>
   * Optional. Set of unique keys for custom key-value fields.
   * </pre>
   *
   * <code>repeated string custom_field_keys = 19 [json_name = "customFieldKeys"];</code>
   * @param index The index of the element to return.
   * @return The customFieldKeys at the given index.
   */
  java.lang.String getCustomFieldKeys(int index);
  /**
   * <pre>
   * Optional. Set of unique keys for custom key-value fields.
   * </pre>
   *
   * <code>repeated string custom_field_keys = 19 [json_name = "customFieldKeys"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the customFieldKeys at the given index.
   */
  com.google.protobuf.ByteString
      getCustomFieldKeysBytes(int index);

  /**
   * <pre>
   * call types supported by scorecard
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 20 [json_name = "callTypes"];</code>
   * @return A list containing the callTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.CallType.Enum> getCallTypesList();
  /**
   * <pre>
   * call types supported by scorecard
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 20 [json_name = "callTypes"];</code>
   * @return The count of callTypes.
   */
  int getCallTypesCount();
  /**
   * <pre>
   * call types supported by scorecard
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 20 [json_name = "callTypes"];</code>
   * @param index The index of the element to return.
   * @return The callTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallTypes(int index);
  /**
   * <pre>
   * call types supported by scorecard
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 20 [json_name = "callTypes"];</code>
   * @return A list containing the enum numeric values on the wire for callTypes.
   */
  java.util.List<java.lang.Integer>
  getCallTypesValueList();
  /**
   * <pre>
   * call types supported by scorecard
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 20 [json_name = "callTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of callTypes at the given index.
   */
  int getCallTypesValue(int index);

  /**
   * <pre>
   * time scorecard was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * time scorecard was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * time scorecard was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 21 [json_name = "updatedAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * Channels supported by the scorecard.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channels = 22 [json_name = "channels"];</code>
   * @return A list containing the channels.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ChannelType> getChannelsList();
  /**
   * <pre>
   * Channels supported by the scorecard.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channels = 22 [json_name = "channels"];</code>
   * @return The count of channels.
   */
  int getChannelsCount();
  /**
   * <pre>
   * Channels supported by the scorecard.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channels = 22 [json_name = "channels"];</code>
   * @param index The index of the element to return.
   * @return The channels at the given index.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannels(int index);
  /**
   * <pre>
   * Channels supported by the scorecard.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channels = 22 [json_name = "channels"];</code>
   * @return A list containing the enum numeric values on the wire for channels.
   */
  java.util.List<java.lang.Integer>
  getChannelsValueList();
  /**
   * <pre>
   * Channels supported by the scorecard.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channels = 22 [json_name = "channels"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of channels at the given index.
   */
  int getChannelsValue(int index);

  /**
   * <pre>
   * Optional. Required length for voice conversations.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_call_length = 23 [json_name = "minimumCallLength"];</code>
   * @return Whether the minimumCallLength field is set.
   */
  boolean hasMinimumCallLength();
  /**
   * <pre>
   * Optional. Required length for voice conversations.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_call_length = 23 [json_name = "minimumCallLength"];</code>
   * @return The minimumCallLength.
   */
  com.google.protobuf.Duration getMinimumCallLength();
  /**
   * <pre>
   * Optional. Required length for voice conversations.
   * </pre>
   *
   * <code>.google.protobuf.Duration minimum_call_length = 23 [json_name = "minimumCallLength"];</code>
   */
  com.google.protobuf.DurationOrBuilder getMinimumCallLengthOrBuilder();

  /**
   * <pre>
   * Optional. Required number of messages for sms conversations.
   * </pre>
   *
   * <code>int32 minimum_sms_message_count = 24 [json_name = "minimumSmsMessageCount"];</code>
   * @return The minimumSmsMessageCount.
   */
  int getMinimumSmsMessageCount();
}
