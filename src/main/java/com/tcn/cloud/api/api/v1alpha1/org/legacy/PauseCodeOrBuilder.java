// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface PauseCodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.PauseCode)
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
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @return A list containing the codes.
   */
  java.util.List<java.lang.String>
      getCodesList();
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @return The count of codes.
   */
  int getCodesCount();
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @param index The index of the element to return.
   * @return The codes at the given index.
   */
  java.lang.String getCodes(int index);
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the codes at the given index.
   */
  com.google.protobuf.ByteString
      getCodesBytes(int index);

  /**
   * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  long getXmlClientPropertySid();
}
