// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListAgentResponseAutoRulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListAgentResponseAutoRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All Agent Response Auto Rule sets for the requested Org
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentResponseAutoRuleSet rulesets = 1 [json_name = "rulesets"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet> 
      getRulesetsList();
  /**
   * <pre>
   * All Agent Response Auto Rule sets for the requested Org
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentResponseAutoRuleSet rulesets = 1 [json_name = "rulesets"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSet getRulesets(int index);
  /**
   * <pre>
   * All Agent Response Auto Rule sets for the requested Org
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentResponseAutoRuleSet rulesets = 1 [json_name = "rulesets"];</code>
   */
  int getRulesetsCount();
  /**
   * <pre>
   * All Agent Response Auto Rule sets for the requested Org
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentResponseAutoRuleSet rulesets = 1 [json_name = "rulesets"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder> 
      getRulesetsOrBuilderList();
  /**
   * <pre>
   * All Agent Response Auto Rule sets for the requested Org
   * </pre>
   *
   * <code>repeated .api.commons.org.AgentResponseAutoRuleSet rulesets = 1 [json_name = "rulesets"];</code>
   */
  com.tcn.cloud.api.api.commons.org.AgentResponseAutoRuleSetOrBuilder getRulesetsOrBuilder(
      int index);
}
