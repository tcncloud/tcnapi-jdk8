// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface AssignRuleSetReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.AssignRuleSetReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   * @return Whether the commType field is set.
   */
  boolean hasCommType();
  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   * @return The commType.
   */
  com.tcn.cloud.api.api.commons.CommType getCommType();
  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   */
  com.tcn.cloud.api.api.commons.CommTypeOrBuilder getCommTypeOrBuilder();

  /**
   * <code>string comm_id = 2 [json_name = "commId"];</code>
   * @return The commId.
   */
  java.lang.String getCommId();
  /**
   * <code>string comm_id = 2 [json_name = "commId"];</code>
   * @return The bytes for commId.
   */
  com.google.protobuf.ByteString
      getCommIdBytes();

  /**
   * <code>string rule_set_id = 3 [json_name = "ruleSetId"];</code>
   * @return The ruleSetId.
   */
  java.lang.String getRuleSetId();
  /**
   * <code>string rule_set_id = 3 [json_name = "ruleSetId"];</code>
   * @return The bytes for ruleSetId.
   */
  com.google.protobuf.ByteString
      getRuleSetIdBytes();
}
