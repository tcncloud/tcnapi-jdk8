// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface InsertPrivateFieldReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.InsertPrivateFieldReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string server = 2 [json_name = "server"];</code>
   * @return The server.
   */
  java.lang.String getServer();
  /**
   * <code>string server = 2 [json_name = "server"];</code>
   * @return The bytes for server.
   */
  com.google.protobuf.ByteString
      getServerBytes();

  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 3 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.api.v1alpha1.integrations.PrivateFieldType private_field_type = 4 [json_name = "privateFieldType"];</code>
   * @return The enum numeric value on the wire for privateFieldType.
   */
  int getPrivateFieldTypeValue();
  /**
   * <code>.api.v1alpha1.integrations.PrivateFieldType private_field_type = 4 [json_name = "privateFieldType"];</code>
   * @return The privateFieldType.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PrivateFieldType getPrivateFieldType();
}
