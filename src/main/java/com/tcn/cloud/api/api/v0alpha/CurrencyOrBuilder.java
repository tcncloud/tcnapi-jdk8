// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CurrencyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Currency)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string raw_value = 2 [json_name = "rawValue"];</code>
   * @return The rawValue.
   */
  java.lang.String getRawValue();
  /**
   * <code>string raw_value = 2 [json_name = "rawValue"];</code>
   * @return The bytes for rawValue.
   */
  com.google.protobuf.ByteString
      getRawValueBytes();

  /**
   * <code>double value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  double getValue();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool invalid = 5 [json_name = "invalid"];</code>
   * @return The invalid.
   */
  boolean getInvalid();
}
