// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListAdherenceDepartmentalRulesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListAdherenceDepartmentalRulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Departmental rules found for the org sending the request.
   * </pre>
   *
   * <code>repeated .api.commons.AdherenceDepartmentalRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.AdherenceDepartmentalRule> 
      getRulesList();
  /**
   * <pre>
   * Departmental rules found for the org sending the request.
   * </pre>
   *
   * <code>repeated .api.commons.AdherenceDepartmentalRule rules = 1 [json_name = "rules"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceDepartmentalRule getRules(int index);
  /**
   * <pre>
   * Departmental rules found for the org sending the request.
   * </pre>
   *
   * <code>repeated .api.commons.AdherenceDepartmentalRule rules = 1 [json_name = "rules"];</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * Departmental rules found for the org sending the request.
   * </pre>
   *
   * <code>repeated .api.commons.AdherenceDepartmentalRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.AdherenceDepartmentalRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * Departmental rules found for the org sending the request.
   * </pre>
   *
   * <code>repeated .api.commons.AdherenceDepartmentalRule rules = 1 [json_name = "rules"];</code>
   */
  com.tcn.cloud.api.api.commons.AdherenceDepartmentalRuleOrBuilder getRulesOrBuilder(
      int index);
}
