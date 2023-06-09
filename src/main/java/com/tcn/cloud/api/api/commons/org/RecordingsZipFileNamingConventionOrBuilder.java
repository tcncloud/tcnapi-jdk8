// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface RecordingsZipFileNamingConventionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.RecordingsZipFileNamingConvention)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * XML client property SID.
   * </pre>
   *
   * <code>int64 xml_client_property_sid = 1 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  long getXmlClientPropertySid();

  /**
   * <pre>
   * Convention for inbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention inbound = 2 [json_name = "inbound"];</code>
   * @return Whether the inbound field is set.
   */
  boolean hasInbound();
  /**
   * <pre>
   * Convention for inbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention inbound = 2 [json_name = "inbound"];</code>
   * @return The inbound.
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConvention getInbound();
  /**
   * <pre>
   * Convention for inbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention inbound = 2 [json_name = "inbound"];</code>
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConventionOrBuilder getInboundOrBuilder();

  /**
   * <pre>
   * Convention for manual call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention manual = 3 [json_name = "manual"];</code>
   * @return Whether the manual field is set.
   */
  boolean hasManual();
  /**
   * <pre>
   * Convention for manual call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention manual = 3 [json_name = "manual"];</code>
   * @return The manual.
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConvention getManual();
  /**
   * <pre>
   * Convention for manual call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention manual = 3 [json_name = "manual"];</code>
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConventionOrBuilder getManualOrBuilder();

  /**
   * <pre>
   * Convention for outbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention outbound = 4 [json_name = "outbound"];</code>
   * @return Whether the outbound field is set.
   */
  boolean hasOutbound();
  /**
   * <pre>
   * Convention for outbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention outbound = 4 [json_name = "outbound"];</code>
   * @return The outbound.
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConvention getOutbound();
  /**
   * <pre>
   * Convention for outbound call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention outbound = 4 [json_name = "outbound"];</code>
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConventionOrBuilder getOutboundOrBuilder();

  /**
   * <pre>
   * Convention for combined (all) call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention combined = 5 [json_name = "combined"];</code>
   * @return Whether the combined field is set.
   */
  boolean hasCombined();
  /**
   * <pre>
   * Convention for combined (all) call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention combined = 5 [json_name = "combined"];</code>
   * @return The combined.
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConvention getCombined();
  /**
   * <pre>
   * Convention for combined (all) call recordings.
   * </pre>
   *
   * <code>.api.commons.org.FileNamingConvention combined = 5 [json_name = "combined"];</code>
   */
  com.tcn.cloud.api.api.commons.org.FileNamingConventionOrBuilder getCombinedOrBuilder();
}
