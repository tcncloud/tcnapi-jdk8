// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string phone_numbers = 1 [json_name = "phoneNumbers"];</code>
   * @return A list containing the phoneNumbers.
   */
  java.util.List<java.lang.String>
      getPhoneNumbersList();
  /**
   * <code>repeated string phone_numbers = 1 [json_name = "phoneNumbers"];</code>
   * @return The count of phoneNumbers.
   */
  int getPhoneNumbersCount();
  /**
   * <code>repeated string phone_numbers = 1 [json_name = "phoneNumbers"];</code>
   * @param index The index of the element to return.
   * @return The phoneNumbers at the given index.
   */
  java.lang.String getPhoneNumbers(int index);
  /**
   * <code>repeated string phone_numbers = 1 [json_name = "phoneNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the phoneNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getPhoneNumbersBytes(int index);

  /**
   * <code>string src_number = 2 [json_name = "srcNumber"];</code>
   * @return The srcNumber.
   */
  java.lang.String getSrcNumber();
  /**
   * <code>string src_number = 2 [json_name = "srcNumber"];</code>
   * @return The bytes for srcNumber.
   */
  com.google.protobuf.ByteString
      getSrcNumberBytes();
}
