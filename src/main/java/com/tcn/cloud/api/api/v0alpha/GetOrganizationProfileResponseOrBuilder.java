// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetOrganizationProfileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetOrganizationProfileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>bool is_manual_only_account = 4 [json_name = "isManualOnlyAccount"];</code>
   * @return The isManualOnlyAccount.
   */
  boolean getIsManualOnlyAccount();

  /**
   * <code>string region_id = 5 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <code>string region_id = 5 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <code>string CRM_ID = 6 [json_name = "CRMID"];</code>
   * @return The cRMID.
   */
  java.lang.String getCRMID();
  /**
   * <code>string CRM_ID = 6 [json_name = "CRMID"];</code>
   * @return The bytes for cRMID.
   */
  com.google.protobuf.ByteString
      getCRMIDBytes();

  /**
   * <code>string billing_id = 8 [json_name = "billingId"];</code>
   * @return The billingId.
   */
  java.lang.String getBillingId();
  /**
   * <code>string billing_id = 8 [json_name = "billingId"];</code>
   * @return The bytes for billingId.
   */
  com.google.protobuf.ByteString
      getBillingIdBytes();

  /**
   * <code>.api.commons.TimeZone timezone = 10 [json_name = "timezone"];</code>
   * @return The enum numeric value on the wire for timezone.
   */
  int getTimezoneValue();
  /**
   * <code>.api.commons.TimeZone timezone = 10 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimezone();

  /**
   * <code>.google.protobuf.Timestamp add_date = 14 [json_name = "addDate"];</code>
   * @return Whether the addDate field is set.
   */
  boolean hasAddDate();
  /**
   * <code>.google.protobuf.Timestamp add_date = 14 [json_name = "addDate"];</code>
   * @return The addDate.
   */
  com.google.protobuf.Timestamp getAddDate();
  /**
   * <code>.google.protobuf.Timestamp add_date = 14 [json_name = "addDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAddDateOrBuilder();

  /**
   * <pre>
   * map of region_id to array of api_endpoints
   * </pre>
   *
   * <code>map&lt;string, .api.v0alpha.RegionUrls&gt; allowed_regions = 16 [json_name = "allowedRegions"];</code>
   */
  int getAllowedRegionsCount();
  /**
   * <pre>
   * map of region_id to array of api_endpoints
   * </pre>
   *
   * <code>map&lt;string, .api.v0alpha.RegionUrls&gt; allowed_regions = 16 [json_name = "allowedRegions"];</code>
   */
  boolean containsAllowedRegions(
      java.lang.String key);
  /**
   * Use {@link #getAllowedRegionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v0alpha.RegionUrls>
  getAllowedRegions();
  /**
   * <pre>
   * map of region_id to array of api_endpoints
   * </pre>
   *
   * <code>map&lt;string, .api.v0alpha.RegionUrls&gt; allowed_regions = 16 [json_name = "allowedRegions"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v0alpha.RegionUrls>
  getAllowedRegionsMap();
  /**
   * <pre>
   * map of region_id to array of api_endpoints
   * </pre>
   *
   * <code>map&lt;string, .api.v0alpha.RegionUrls&gt; allowed_regions = 16 [json_name = "allowedRegions"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v0alpha.RegionUrls getAllowedRegionsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v0alpha.RegionUrls defaultValue);
  /**
   * <pre>
   * map of region_id to array of api_endpoints
   * </pre>
   *
   * <code>map&lt;string, .api.v0alpha.RegionUrls&gt; allowed_regions = 16 [json_name = "allowedRegions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RegionUrls getAllowedRegionsOrThrow(
      java.lang.String key);
}
