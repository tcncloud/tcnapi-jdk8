// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListResponseEvaluatorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListResponseEvaluatorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of response evaluators for the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.ResponseEvaluator evaluators = 1 [json_name = "evaluators"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ResponseEvaluator> 
      getEvaluatorsList();
  /**
   * <pre>
   * List of response evaluators for the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.ResponseEvaluator evaluators = 1 [json_name = "evaluators"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ResponseEvaluator getEvaluators(int index);
  /**
   * <pre>
   * List of response evaluators for the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.ResponseEvaluator evaluators = 1 [json_name = "evaluators"];</code>
   */
  int getEvaluatorsCount();
  /**
   * <pre>
   * List of response evaluators for the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.ResponseEvaluator evaluators = 1 [json_name = "evaluators"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder> 
      getEvaluatorsOrBuilderList();
  /**
   * <pre>
   * List of response evaluators for the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.ResponseEvaluator evaluators = 1 [json_name = "evaluators"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder getEvaluatorsOrBuilder(
      int index);
}
