// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface EmailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.EmailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string subject = 1 [json_name = "subject"];</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <code>string subject = 1 [json_name = "subject"];</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <code>string body = 2 [json_name = "body"];</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <code>string body = 2 [json_name = "body"];</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 3 [json_name = "addresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}
