// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

public interface DrillThroughParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.insights.DrillThroughParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string parameter_name = 1 [json_name = "parameterName"];</code>
   * @return The parameterName.
   */
  java.lang.String getParameterName();
  /**
   * <code>string parameter_name = 1 [json_name = "parameterName"];</code>
   * @return The bytes for parameterName.
   */
  com.google.protobuf.ByteString
      getParameterNameBytes();

  /**
   * <code>string column_name = 2 [json_name = "columnName"];</code>
   * @return The columnName.
   */
  java.lang.String getColumnName();
  /**
   * <code>string column_name = 2 [json_name = "columnName"];</code>
   * @return The bytes for columnName.
   */
  com.google.protobuf.ByteString
      getColumnNameBytes();
}
