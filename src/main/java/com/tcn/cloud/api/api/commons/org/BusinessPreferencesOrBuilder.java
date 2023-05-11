// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface BusinessPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.BusinessPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * Org ID.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * Number of weeks of past data that are accessible.
   * </pre>
   *
   * <code>int32 weeks_of_data = 10 [json_name = "weeksOfData"];</code>
   * @return The weeksOfData.
   */
  int getWeeksOfData();

  /**
   * <pre>
   * Default time zone for business intelligence.
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The enum numeric value on the wire for timeZone.
   */
  int getTimeZoneValue();
  /**
   * <pre>
   * Default time zone for business intelligence.
   * </pre>
   *
   * <code>.api.commons.AnaTimeZone time_zone = 11 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  com.tcn.cloud.api.api.commons.AnaTimeZone getTimeZone();

  /**
   * <pre>
   * Whether to allow multi-client access.
   * </pre>
   *
   * <code>bool multi_client_access = 12 [json_name = "multiClientAccess"];</code>
   * @return The multiClientAccess.
   */
  boolean getMultiClientAccess();

  /**
   * <pre>
   * Enable/disable of custom visualizations in BI.
   * </pre>
   *
   * <code>bool custom_visualizations = 13 [json_name = "customVisualizations"];</code>
   * @return The customVisualizations.
   */
  boolean getCustomVisualizations();

  /**
   * <pre>
   * Time filter for custom dashboard and visualizations.
   * </pre>
   *
   * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
   * @return The timeFilter.
   */
  java.lang.String getTimeFilter();
  /**
   * <pre>
   * Time filter for custom dashboard and visualizations.
   * </pre>
   *
   * <code>string time_filter = 14 [json_name = "timeFilter"];</code>
   * @return The bytes for timeFilter.
   */
  com.google.protobuf.ByteString
      getTimeFilterBytes();
}
