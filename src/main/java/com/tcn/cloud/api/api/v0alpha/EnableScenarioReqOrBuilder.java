// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EnableScenarioReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EnableScenarioReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cpl_rule_set_id = 3 [json_name = "cplRuleSetId"];</code>
   * @return The cplRuleSetId.
   */
  java.lang.String getCplRuleSetId();
  /**
   * <code>string cpl_rule_set_id = 3 [json_name = "cplRuleSetId"];</code>
   * @return The bytes for cplRuleSetId.
   */
  com.google.protobuf.ByteString
      getCplRuleSetIdBytes();

  /**
   * <code>int64 cpl_scenario_id = 4 [json_name = "cplScenarioId"];</code>
   * @return The cplScenarioId.
   */
  long getCplScenarioId();
}
