// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ElementErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ElementError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.ElementError.InvalidExpression invalid_expression = 4 [json_name = "invalidExpression"];</code>
   * @return Whether the invalidExpression field is set.
   */
  boolean hasInvalidExpression();
  /**
   * <code>.api.v0alpha.ElementError.InvalidExpression invalid_expression = 4 [json_name = "invalidExpression"];</code>
   * @return The invalidExpression.
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.InvalidExpression getInvalidExpression();
  /**
   * <code>.api.v0alpha.ElementError.InvalidExpression invalid_expression = 4 [json_name = "invalidExpression"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.InvalidExpressionOrBuilder getInvalidExpressionOrBuilder();

  /**
   * <code>.api.v0alpha.ElementError.MissingField missing_field = 5 [json_name = "missingField"];</code>
   * @return Whether the missingField field is set.
   */
  boolean hasMissingField();
  /**
   * <code>.api.v0alpha.ElementError.MissingField missing_field = 5 [json_name = "missingField"];</code>
   * @return The missingField.
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.MissingField getMissingField();
  /**
   * <code>.api.v0alpha.ElementError.MissingField missing_field = 5 [json_name = "missingField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.MissingFieldOrBuilder getMissingFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ElementError.BadFieldType bad_field_type = 6 [json_name = "badFieldType"];</code>
   * @return Whether the badFieldType field is set.
   */
  boolean hasBadFieldType();
  /**
   * <code>.api.v0alpha.ElementError.BadFieldType bad_field_type = 6 [json_name = "badFieldType"];</code>
   * @return The badFieldType.
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.BadFieldType getBadFieldType();
  /**
   * <code>.api.v0alpha.ElementError.BadFieldType bad_field_type = 6 [json_name = "badFieldType"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ElementError.BadFieldTypeOrBuilder getBadFieldTypeOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ElementError.ReasonCase getReasonCase();
}
