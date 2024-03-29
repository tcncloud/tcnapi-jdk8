// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface SMSTransportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.SMSTransport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * must include country code and area code
   * </pre>
   *
   * <code>string destination_phone = 1 [json_name = "destinationPhone"];</code>
   * @return The destinationPhone.
   */
  java.lang.String getDestinationPhone();
  /**
   * <pre>
   * must include country code and area code
   * </pre>
   *
   * <code>string destination_phone = 1 [json_name = "destinationPhone"];</code>
   * @return The bytes for destinationPhone.
   */
  com.google.protobuf.ByteString
      getDestinationPhoneBytes();

  /**
   * <pre>
   * the phone number we want this message to come from
   * </pre>
   *
   * <code>string source_phone = 2 [json_name = "sourcePhone"];</code>
   * @return The sourcePhone.
   */
  java.lang.String getSourcePhone();
  /**
   * <pre>
   * the phone number we want this message to come from
   * </pre>
   *
   * <code>string source_phone = 2 [json_name = "sourcePhone"];</code>
   * @return The bytes for sourcePhone.
   */
  com.google.protobuf.ByteString
      getSourcePhoneBytes();
}
