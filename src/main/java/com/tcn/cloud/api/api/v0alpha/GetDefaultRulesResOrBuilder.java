// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetDefaultRulesResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetDefaultRulesRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string rules = 1 [json_name = "rules"];</code>
   * @return A list containing the rules.
   */
  java.util.List<java.lang.String>
      getRulesList();
  /**
   * <code>repeated string rules = 1 [json_name = "rules"];</code>
   * @return The count of rules.
   */
  int getRulesCount();
  /**
   * <code>repeated string rules = 1 [json_name = "rules"];</code>
   * @param index The index of the element to return.
   * @return The rules at the given index.
   */
  java.lang.String getRules(int index);
  /**
   * <code>repeated string rules = 1 [json_name = "rules"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the rules at the given index.
   */
  com.google.protobuf.ByteString
      getRulesBytes(int index);
}
