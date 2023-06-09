// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface ComplianceRuleSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ComplianceRuleSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the compliance rule set identifier
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * the compliance rule set identifier
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * name of the compliance rule set
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of the compliance rule set
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the SHA indicating the version of the rule set
   * </pre>
   *
   * <code>string sha = 3 [json_name = "sha"];</code>
   * @return The sha.
   */
  java.lang.String getSha();
  /**
   * <pre>
   * the SHA indicating the version of the rule set
   * </pre>
   *
   * <code>string sha = 3 [json_name = "sha"];</code>
   * @return The bytes for sha.
   */
  com.google.protobuf.ByteString
      getShaBytes();

  /**
   * <pre>
   * list of compliance rules ran in this version of the
   * rule set.
   * </pre>
   *
   * <code>repeated .api.commons.ComplianceRule rules = 4 [json_name = "rules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.ComplianceRule> 
      getRulesList();
  /**
   * <pre>
   * list of compliance rules ran in this version of the
   * rule set.
   * </pre>
   *
   * <code>repeated .api.commons.ComplianceRule rules = 4 [json_name = "rules"];</code>
   */
  com.tcn.cloud.api.api.commons.ComplianceRule getRules(int index);
  /**
   * <pre>
   * list of compliance rules ran in this version of the
   * rule set.
   * </pre>
   *
   * <code>repeated .api.commons.ComplianceRule rules = 4 [json_name = "rules"];</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * list of compliance rules ran in this version of the
   * rule set.
   * </pre>
   *
   * <code>repeated .api.commons.ComplianceRule rules = 4 [json_name = "rules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.ComplianceRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * list of compliance rules ran in this version of the
   * rule set.
   * </pre>
   *
   * <code>repeated .api.commons.ComplianceRule rules = 4 [json_name = "rules"];</code>
   */
  com.tcn.cloud.api.api.commons.ComplianceRuleOrBuilder getRulesOrBuilder(
      int index);
}
