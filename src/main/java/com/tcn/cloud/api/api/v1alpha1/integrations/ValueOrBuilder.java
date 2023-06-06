// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string str_val = 1 [json_name = "strVal"];</code>
   * @return Whether the strVal field is set.
   */
  boolean hasStrVal();
  /**
   * <code>string str_val = 1 [json_name = "strVal"];</code>
   * @return The strVal.
   */
  java.lang.String getStrVal();
  /**
   * <code>string str_val = 1 [json_name = "strVal"];</code>
   * @return The bytes for strVal.
   */
  com.google.protobuf.ByteString
      getStrValBytes();

  /**
   * <code>double num_val = 2 [json_name = "numVal"];</code>
   * @return Whether the numVal field is set.
   */
  boolean hasNumVal();
  /**
   * <code>double num_val = 2 [json_name = "numVal"];</code>
   * @return The numVal.
   */
  double getNumVal();

  /**
   * <code>bool bool_val = 3 [json_name = "boolVal"];</code>
   * @return Whether the boolVal field is set.
   */
  boolean hasBoolVal();
  /**
   * <code>bool bool_val = 3 [json_name = "boolVal"];</code>
   * @return The boolVal.
   */
  boolean getBoolVal();

  /**
   * <code>.google.protobuf.Timestamp time_val = 4 [json_name = "timeVal"];</code>
   * @return Whether the timeVal field is set.
   */
  boolean hasTimeVal();
  /**
   * <code>.google.protobuf.Timestamp time_val = 4 [json_name = "timeVal"];</code>
   * @return The timeVal.
   */
  com.google.protobuf.Timestamp getTimeVal();
  /**
   * <code>.google.protobuf.Timestamp time_val = 4 [json_name = "timeVal"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeValOrBuilder();

  /**
   * <code>.api.v1alpha1.integrations.CompositeVal comp_val = 6 [json_name = "compVal"];</code>
   * @return Whether the compVal field is set.
   */
  boolean hasCompVal();
  /**
   * <code>.api.v1alpha1.integrations.CompositeVal comp_val = 6 [json_name = "compVal"];</code>
   * @return The compVal.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CompositeVal getCompVal();
  /**
   * <code>.api.v1alpha1.integrations.CompositeVal comp_val = 6 [json_name = "compVal"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.CompositeValOrBuilder getCompValOrBuilder();

  /**
   * <code>int64 int_val = 7 [json_name = "intVal"];</code>
   * @return Whether the intVal field is set.
   */
  boolean hasIntVal();
  /**
   * <code>int64 int_val = 7 [json_name = "intVal"];</code>
   * @return The intVal.
   */
  long getIntVal();

  /**
   * <pre>
   * whether this value should be allowed to be stored
   * </pre>
   *
   * <code>bool sensitive = 5 [json_name = "sensitive"];</code>
   * @return The sensitive.
   */
  boolean getSensitive();

  /**
   * <pre>
   * what type of data value we *want* to validate as.
   * a value does *not* have to match the validation enum.
   * a value that does not match its validation enum is just invalid.
   * </pre>
   *
   * <code>.api.commons.integrations.Validation validation = 8 [json_name = "validation"];</code>
   * @return The enum numeric value on the wire for validation.
   */
  int getValidationValue();
  /**
   * <pre>
   * what type of data value we *want* to validate as.
   * a value does *not* have to match the validation enum.
   * a value that does not match its validation enum is just invalid.
   * </pre>
   *
   * <code>.api.commons.integrations.Validation validation = 8 [json_name = "validation"];</code>
   * @return The validation.
   */
  com.tcn.cloud.api.api.commons.integrations.Validation getValidation();

  com.tcn.cloud.api.api.v1alpha1.integrations.Value.ValCase getValCase();
}
