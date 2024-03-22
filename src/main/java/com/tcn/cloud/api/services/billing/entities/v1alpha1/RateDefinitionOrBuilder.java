// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/rates.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

public interface RateDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha1.RateDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the resource identifier
   * </pre>
   *
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The rateDefinitionId.
   */
  java.lang.String getRateDefinitionId();
  /**
   * <pre>
   * the resource identifier
   * </pre>
   *
   * <code>string rate_definition_id = 1 [json_name = "rateDefinitionId"];</code>
   * @return The bytes for rateDefinitionId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionIdBytes();

  /**
   * <pre>
   * unused
   * </pre>
   *
   * <code>string rate_definition_feature_id = 2 [json_name = "rateDefinitionFeatureId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.RateDefinition.rate_definition_feature_id is deprecated.
   *     See services/billing/entities/v1alpha1/rates.proto;l=14
   * @return The rateDefinitionFeatureId.
   */
  @java.lang.Deprecated java.lang.String getRateDefinitionFeatureId();
  /**
   * <pre>
   * unused
   * </pre>
   *
   * <code>string rate_definition_feature_id = 2 [json_name = "rateDefinitionFeatureId", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.RateDefinition.rate_definition_feature_id is deprecated.
   *     See services/billing/entities/v1alpha1/rates.proto;l=14
   * @return The bytes for rateDefinitionFeatureId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getRateDefinitionFeatureIdBytes();

  /**
   * <pre>
   * a group identifier for this rate definition; optional
   * </pre>
   *
   * <code>string rate_definition_group_id = 3 [json_name = "rateDefinitionGroupId"];</code>
   * @return The rateDefinitionGroupId.
   */
  java.lang.String getRateDefinitionGroupId();
  /**
   * <pre>
   * a group identifier for this rate definition; optional
   * </pre>
   *
   * <code>string rate_definition_group_id = 3 [json_name = "rateDefinitionGroupId"];</code>
   * @return The bytes for rateDefinitionGroupId.
   */
  com.google.protobuf.ByteString
      getRateDefinitionGroupIdBytes();

  /**
   * <pre>
   * the event type this definition rates
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 4 [json_name = "eventType"];</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * the event type this definition rates
   * </pre>
   *
   * <code>.api.commons.audit.EventType event_type = 4 [json_name = "eventType"];</code>
   * @return The eventType.
   */
  com.tcn.cloud.api.api.commons.audit.EventType getEventType();

  /**
   * <pre>
   * the config type of this definitioin
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.RateDefinitionConfigType config_type = 5 [json_name = "configType"];</code>
   * @return The enum numeric value on the wire for configType.
   */
  int getConfigTypeValue();
  /**
   * <pre>
   * the config type of this definitioin
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.RateDefinitionConfigType config_type = 5 [json_name = "configType"];</code>
   * @return The configType.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionConfigType getConfigType();

  /**
   * <pre>
   * the matching rule for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.MatchingRule matching_rule = 6 [json_name = "matchingRule"];</code>
   * @return The enum numeric value on the wire for matchingRule.
   */
  int getMatchingRuleValue();
  /**
   * <pre>
   * the matching rule for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.MatchingRule matching_rule = 6 [json_name = "matchingRule"];</code>
   * @return The matchingRule.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingRule getMatchingRule();

  /**
   * <pre>
   * the matching config for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.MatchingConfig matching_config = 7 [json_name = "matchingConfig"];</code>
   * @return Whether the matchingConfig field is set.
   */
  boolean hasMatchingConfig();
  /**
   * <pre>
   * the matching config for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.MatchingConfig matching_config = 7 [json_name = "matchingConfig"];</code>
   * @return The matchingConfig.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfig getMatchingConfig();
  /**
   * <pre>
   * the matching config for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.MatchingConfig matching_config = 7 [json_name = "matchingConfig"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigOrBuilder getMatchingConfigOrBuilder();

  /**
   * <pre>
   * the configuration for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.RateDefinitionConfig config = 8 [json_name = "config"];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * the configuration for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.RateDefinitionConfig config = 8 [json_name = "config"];</code>
   * @return The config.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionConfig getConfig();
  /**
   * <pre>
   * the configuration for this definition
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.RateDefinitionConfig config = 8 [json_name = "config"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * the time the rate definition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * the time the rate definition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * the time the rate definition was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * the time the rate definition was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * the time the rate definition was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * the time the rate definition was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * the time this rate definition was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * the time this rate definition was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * the time this rate definition was deleted (if applicable)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * the matching sha for this definition
   * </pre>
   *
   * <code>string matching_sha = 12 [json_name = "matchingSha"];</code>
   * @return The matchingSha.
   */
  java.lang.String getMatchingSha();
  /**
   * <pre>
   * the matching sha for this definition
   * </pre>
   *
   * <code>string matching_sha = 12 [json_name = "matchingSha"];</code>
   * @return The bytes for matchingSha.
   */
  com.google.protobuf.ByteString
      getMatchingShaBytes();
}
