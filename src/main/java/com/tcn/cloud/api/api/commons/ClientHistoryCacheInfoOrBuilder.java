// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

public interface ClientHistoryCacheInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ClientHistoryCacheInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Current state that a client's cache is at.
   * </pre>
   *
   * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Current state that a client's cache is at.
   * </pre>
   *
   * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.commons.HistoryCacheState getState();

  /**
   * <pre>
   * Percentage estimate of how much of the cache has been loaded.
   * </pre>
   *
   * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
   * @return The progressPercentage.
   */
  int getProgressPercentage();
}
