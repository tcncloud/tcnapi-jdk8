// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ScenarioRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ScenarioRuleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rule_text = 1 [json_name = "ruleText"];</code>
   * @return The ruleText.
   */
  java.lang.String getRuleText();
  /**
   * <code>string rule_text = 1 [json_name = "ruleText"];</code>
   * @return The bytes for ruleText.
   */
  com.google.protobuf.ByteString
      getRuleTextBytes();

  /**
   * <code>bool permit_value = 3 [json_name = "permitValue"];</code>
   * @return The permitValue.
   */
  boolean getPermitValue();
}
