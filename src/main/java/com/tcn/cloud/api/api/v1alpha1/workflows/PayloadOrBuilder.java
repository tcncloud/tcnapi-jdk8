// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/entities.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface PayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.Payload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 1 [json_name = "data"];</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 2 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
