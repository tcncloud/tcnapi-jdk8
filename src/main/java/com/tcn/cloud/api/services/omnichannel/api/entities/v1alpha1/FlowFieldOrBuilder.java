// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/api/entities/v1alpha1/flows.proto

package com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1;

public interface FlowFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.omnichannel.api.entities.v1alpha1.FlowField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
   * @return The enum numeric value on the wire for name.
   */
  int getNameValue();
  /**
   * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName getName();

  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return Whether the userInput field is set.
   */
  boolean hasUserInput();
  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return The userInput.
   */
  java.lang.String getUserInput();
  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return The bytes for userInput.
   */
  com.google.protobuf.ByteString
      getUserInputBytes();

  com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.ValueCase getValueCase();
}
