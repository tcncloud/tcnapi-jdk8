// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface ResponseEvaluatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ResponseEvaluator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the response evaluator.
   * </pre>
   *
   * <code>string response_evaluator_id = 1 [json_name = "responseEvaluatorId"];</code>
   * @return The responseEvaluatorId.
   */
  java.lang.String getResponseEvaluatorId();
  /**
   * <pre>
   * ID of the response evaluator.
   * </pre>
   *
   * <code>string response_evaluator_id = 1 [json_name = "responseEvaluatorId"];</code>
   * @return The bytes for responseEvaluatorId.
   */
  com.google.protobuf.ByteString
      getResponseEvaluatorIdBytes();

  /**
   * <pre>
   * Org ID the response evaluator is associated with.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID the response evaluator is associated with.
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Name of the evaluator.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the evaluator.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The evaluator description, optional.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The evaluator description, optional.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Regex pattern.
   * </pre>
   *
   * <code>string regular_expression = 5 [json_name = "regularExpression"];</code>
   * @return The regularExpression.
   */
  java.lang.String getRegularExpression();
  /**
   * <pre>
   * Regex pattern.
   * </pre>
   *
   * <code>string regular_expression = 5 [json_name = "regularExpression"];</code>
   * @return The bytes for regularExpression.
   */
  com.google.protobuf.ByteString
      getRegularExpressionBytes();
}
