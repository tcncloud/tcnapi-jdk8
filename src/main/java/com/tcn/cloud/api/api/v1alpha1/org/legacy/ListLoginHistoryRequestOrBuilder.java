// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface ListLoginHistoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.ListLoginHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string origination_ip = 2 [json_name = "originationIp"];</code>
   * @return Whether the originationIp field is set.
   */
  boolean hasOriginationIp();
  /**
   * <code>string origination_ip = 2 [json_name = "originationIp"];</code>
   * @return The originationIp.
   */
  java.lang.String getOriginationIp();
  /**
   * <code>string origination_ip = 2 [json_name = "originationIp"];</code>
   * @return The bytes for originationIp.
   */
  com.google.protobuf.ByteString
      getOriginationIpBytes();

  /**
   * <pre>
   * Number of days to grab login events from
   * </pre>
   *
   * <code>int64 duration = 3 [json_name = "duration"];</code>
   * @return The duration.
   */
  long getDuration();

  /**
   * <code>bool strikes_only = 4 [json_name = "strikesOnly"];</code>
   * @return The strikesOnly.
   */
  boolean getStrikesOnly();

  com.tcn.cloud.api.api.v1alpha1.org.legacy.ListLoginHistoryRequest.FilterTypeCase getFilterTypeCase();
}
