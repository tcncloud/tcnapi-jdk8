// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SmsActivitySearchReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SmsActivitySearchReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string to_number = 1 [json_name = "toNumber"];</code>
   * @return The toNumber.
   */
  java.lang.String getToNumber();
  /**
   * <code>string to_number = 1 [json_name = "toNumber"];</code>
   * @return The bytes for toNumber.
   */
  com.google.protobuf.ByteString
      getToNumberBytes();

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

  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   * @return Whether the fromDate field is set.
   */
  boolean hasFromDate();
  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   * @return The fromDate.
   */
  com.google.protobuf.Timestamp getFromDate();
  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getFromDateOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   * @return Whether the toDate field is set.
   */
  boolean hasToDate();
  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   * @return The toDate.
   */
  com.google.protobuf.Timestamp getToDate();
  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getToDateOrBuilder();

  /**
   * <code>bool entire_history = 5 [json_name = "entireHistory"];</code>
   * @return The entireHistory.
   */
  boolean getEntireHistory();

  /**
   * <code>bool sent_only = 6 [json_name = "sentOnly"];</code>
   * @return The sentOnly.
   */
  boolean getSentOnly();
}
