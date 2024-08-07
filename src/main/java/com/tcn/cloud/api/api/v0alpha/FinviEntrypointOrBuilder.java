// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface FinviEntrypointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.FinviEntrypoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the pool we are going to pull into the lms pipeline
   * </pre>
   *
   * <code>string pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  java.lang.String getPoolId();
  /**
   * <pre>
   * the pool we are going to pull into the lms pipeline
   * </pre>
   *
   * <code>string pool_id = 1 [json_name = "poolId"];</code>
   * @return The bytes for poolId.
   */
  com.google.protobuf.ByteString
      getPoolIdBytes();

  /**
   * <pre>
   * how often we attempt to pull in data if the pool is OK status, and we don't have a  pull in progress
   * </pre>
   *
   * <code>string cron_interval = 2 [json_name = "cronInterval"];</code>
   * @return The cronInterval.
   */
  java.lang.String getCronInterval();
  /**
   * <pre>
   * how often we attempt to pull in data if the pool is OK status, and we don't have a  pull in progress
   * </pre>
   *
   * <code>string cron_interval = 2 [json_name = "cronInterval"];</code>
   * @return The bytes for cronInterval.
   */
  com.google.protobuf.ByteString
      getCronIntervalBytes();

  /**
   * <pre>
   * if true we do not do anything when cron rings
   * </pre>
   *
   * <code>bool disabled = 3 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * Specifies the timezone to be used by the cron
   * </pre>
   *
   * <code>string timezone = 4 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <pre>
   * Specifies the timezone to be used by the cron
   * </pre>
   *
   * <code>string timezone = 4 [json_name = "timezone"];</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();
}
