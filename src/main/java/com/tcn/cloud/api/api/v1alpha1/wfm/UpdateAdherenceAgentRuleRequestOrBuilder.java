// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdateAdherenceAgentRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdateAdherenceAgentRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agent rule to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRule rule = 1 [json_name = "rule"];</code>
   * @return Whether the rule field is set.
   */
  boolean hasRule();
  /**
   * <pre>
   * Agent rule to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRule rule = 1 [json_name = "rule"];</code>
   * @return The rule.
   */
  com.tcn.cloud.api.api.commons.AdherenceAgentRule getRule();
  /**
   * <pre>
   * Agent rule to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRule rule = 1 [json_name = "rule"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceAgentRuleOrBuilder getRuleOrBuilder();
}
