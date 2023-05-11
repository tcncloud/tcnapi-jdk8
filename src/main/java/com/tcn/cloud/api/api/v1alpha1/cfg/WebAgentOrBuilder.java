// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/cfg/service.proto

package com.tcn.cloud.api.api.v1alpha1.cfg;

public interface WebAgentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.cfg.WebAgent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.cfg.WebAgent.OpenSips open_sips = 1 [json_name = "openSips"];</code>
   * @return Whether the openSips field is set.
   */
  boolean hasOpenSips();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.OpenSips open_sips = 1 [json_name = "openSips"];</code>
   * @return The openSips.
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.OpenSips getOpenSips();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.OpenSips open_sips = 1 [json_name = "openSips"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.OpenSipsOrBuilder getOpenSipsOrBuilder();

  /**
   * <code>.api.v1alpha1.cfg.WebAgent.EnginePriority engine_priority = 2 [json_name = "enginePriority"];</code>
   * @return Whether the enginePriority field is set.
   */
  boolean hasEnginePriority();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.EnginePriority engine_priority = 2 [json_name = "enginePriority"];</code>
   * @return The enginePriority.
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.EnginePriority getEnginePriority();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.EnginePriority engine_priority = 2 [json_name = "enginePriority"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.EnginePriorityOrBuilder getEnginePriorityOrBuilder();

  /**
   * <code>int64 log_level = 3 [json_name = "logLevel"];</code>
   * @return The logLevel.
   */
  long getLogLevel();

  /**
   * <code>int64 use_stun = 4 [json_name = "useStun"];</code>
   * @return The useStun.
   */
  long getUseStun();

  /**
   * <code>int64 use_fast_stun = 5 [json_name = "useFastStun"];</code>
   * @return The useFastStun.
   */
  long getUseFastStun();

  /**
   * <code>int64 use_fast_ice = 6 [json_name = "useFastIce"];</code>
   * @return The useFastIce.
   */
  long getUseFastIce();

  /**
   * <code>int64 ice_timeout = 7 [json_name = "iceTimeout"];</code>
   * @return The iceTimeout.
   */
  long getIceTimeout();

  /**
   * <code>int64 set_final_codec = 8 [json_name = "setFinalCodec"];</code>
   * @return The setFinalCodec.
   */
  long getSetFinalCodec();

  /**
   * <code>int64 use_rport = 9 [json_name = "useRport"];</code>
   * @return The useRport.
   */
  long getUseRport();

  /**
   * <code>.api.v1alpha1.cfg.WebAgent.Server server = 10 [json_name = "server"];</code>
   * @return Whether the server field is set.
   */
  boolean hasServer();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.Server server = 10 [json_name = "server"];</code>
   * @return The server.
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.Server getServer();
  /**
   * <code>.api.v1alpha1.cfg.WebAgent.Server server = 10 [json_name = "server"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.cfg.WebAgent.ServerOrBuilder getServerOrBuilder();

  /**
   * <code>string base_url = 11 [json_name = "baseUrl"];</code>
   * @return The baseUrl.
   */
  java.lang.String getBaseUrl();
  /**
   * <code>string base_url = 11 [json_name = "baseUrl"];</code>
   * @return The bytes for baseUrl.
   */
  com.google.protobuf.ByteString
      getBaseUrlBytes();

  /**
   * <code>string stun_server_address = 12 [json_name = "stunServerAddress"];</code>
   * @return The stunServerAddress.
   */
  java.lang.String getStunServerAddress();
  /**
   * <code>string stun_server_address = 12 [json_name = "stunServerAddress"];</code>
   * @return The bytes for stunServerAddress.
   */
  com.google.protobuf.ByteString
      getStunServerAddressBytes();
}
