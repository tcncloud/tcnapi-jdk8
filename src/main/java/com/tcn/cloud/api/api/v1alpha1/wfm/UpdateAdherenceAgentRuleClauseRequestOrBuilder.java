// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface UpdateAdherenceAgentRuleClauseRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.UpdateAdherenceAgentRuleClauseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Agent rule clause to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleClause clause = 1 [json_name = "clause"];</code>
   * @return Whether the clause field is set.
   */
  boolean hasClause();
  /**
   * <pre>
   * Agent rule clause to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleClause clause = 1 [json_name = "clause"];</code>
   * @return The clause.
   */
  com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause getClause();
  /**
   * <pre>
   * Agent rule clause to update.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleClause clause = 1 [json_name = "clause"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceAgentRuleClauseOrBuilder getClauseOrBuilder();
}
