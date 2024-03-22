// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/history.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

public interface GetRateHistoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.v1alpha1.GetRateHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>repeated .api.commons.audit.EventType event_types = 2 [json_name = "eventTypes"];</code>
   * @return A list containing the eventTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.audit.EventType> getEventTypesList();
  /**
   * <code>repeated .api.commons.audit.EventType event_types = 2 [json_name = "eventTypes"];</code>
   * @return The count of eventTypes.
   */
  int getEventTypesCount();
  /**
   * <code>repeated .api.commons.audit.EventType event_types = 2 [json_name = "eventTypes"];</code>
   * @param index The index of the element to return.
   * @return The eventTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.audit.EventType getEventTypes(int index);
  /**
   * <code>repeated .api.commons.audit.EventType event_types = 2 [json_name = "eventTypes"];</code>
   * @return A list containing the enum numeric values on the wire for eventTypes.
   */
  java.util.List<java.lang.Integer>
  getEventTypesValueList();
  /**
   * <code>repeated .api.commons.audit.EventType event_types = 2 [json_name = "eventTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of eventTypes at the given index.
   */
  int getEventTypesValue(int index);

  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinitionConfigType config_types = 3 [json_name = "configTypes"];</code>
   * @return A list containing the configTypes.
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionConfigType> getConfigTypesList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinitionConfigType config_types = 3 [json_name = "configTypes"];</code>
   * @return The count of configTypes.
   */
  int getConfigTypesCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinitionConfigType config_types = 3 [json_name = "configTypes"];</code>
   * @param index The index of the element to return.
   * @return The configTypes at the given index.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionConfigType getConfigTypes(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinitionConfigType config_types = 3 [json_name = "configTypes"];</code>
   * @return A list containing the enum numeric values on the wire for configTypes.
   */
  java.util.List<java.lang.Integer>
  getConfigTypesValueList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.RateDefinitionConfigType config_types = 3 [json_name = "configTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of configTypes at the given index.
   */
  int getConfigTypesValue(int index);

  /**
   * <code>repeated .services.billing.entities.v1alpha1.MatchingRule matching_rules = 4 [json_name = "matchingRules"];</code>
   * @return A list containing the matchingRules.
   */
  java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingRule> getMatchingRulesList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.MatchingRule matching_rules = 4 [json_name = "matchingRules"];</code>
   * @return The count of matchingRules.
   */
  int getMatchingRulesCount();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.MatchingRule matching_rules = 4 [json_name = "matchingRules"];</code>
   * @param index The index of the element to return.
   * @return The matchingRules at the given index.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingRule getMatchingRules(int index);
  /**
   * <code>repeated .services.billing.entities.v1alpha1.MatchingRule matching_rules = 4 [json_name = "matchingRules"];</code>
   * @return A list containing the enum numeric values on the wire for matchingRules.
   */
  java.util.List<java.lang.Integer>
  getMatchingRulesValueList();
  /**
   * <code>repeated .services.billing.entities.v1alpha1.MatchingRule matching_rules = 4 [json_name = "matchingRules"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of matchingRules at the given index.
   */
  int getMatchingRulesValue(int index);

  /**
   * <code>repeated string matching_shas = 5 [json_name = "matchingShas"];</code>
   * @return A list containing the matchingShas.
   */
  java.util.List<java.lang.String>
      getMatchingShasList();
  /**
   * <code>repeated string matching_shas = 5 [json_name = "matchingShas"];</code>
   * @return The count of matchingShas.
   */
  int getMatchingShasCount();
  /**
   * <code>repeated string matching_shas = 5 [json_name = "matchingShas"];</code>
   * @param index The index of the element to return.
   * @return The matchingShas at the given index.
   */
  java.lang.String getMatchingShas(int index);
  /**
   * <code>repeated string matching_shas = 5 [json_name = "matchingShas"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the matchingShas at the given index.
   */
  com.google.protobuf.ByteString
      getMatchingShasBytes(int index);
}
