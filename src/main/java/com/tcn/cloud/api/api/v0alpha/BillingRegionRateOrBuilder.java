// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface BillingRegionRateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.BillingRegionRate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v0alpha.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   * @return Whether the billingRegion field is set.
   */
  boolean hasBillingRegion();
  /**
   * <code>.api.v0alpha.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   * @return The billingRegion.
   */
  com.tcn.cloud.api.api.v0alpha.BillingRegion getBillingRegion();
  /**
   * <code>.api.v0alpha.BillingRegion billing_region = 1 [json_name = "billingRegion"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.BillingRegionOrBuilder getBillingRegionOrBuilder();

  /**
   * <code>.api.v0alpha.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   * @return Whether the billingRate field is set.
   */
  boolean hasBillingRate();
  /**
   * <code>.api.v0alpha.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   * @return The billingRate.
   */
  com.tcn.cloud.api.api.v0alpha.BillingRate getBillingRate();
  /**
   * <code>.api.v0alpha.BillingRate billing_rate = 2 [json_name = "billingRate"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.BillingRateOrBuilder getBillingRateOrBuilder();

  /**
   * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
   * @return The billingRegionId.
   */
  java.lang.String getBillingRegionId();
  /**
   * <code>string billing_region_id = 3 [json_name = "billingRegionId"];</code>
   * @return The bytes for billingRegionId.
   */
  com.google.protobuf.ByteString
      getBillingRegionIdBytes();

  /**
   * <code>string country_id = 4 [json_name = "countryId"];</code>
   * @return The countryId.
   */
  java.lang.String getCountryId();
  /**
   * <code>string country_id = 4 [json_name = "countryId"];</code>
   * @return The bytes for countryId.
   */
  com.google.protobuf.ByteString
      getCountryIdBytes();

  /**
   * <code>bool is_custom = 5 [json_name = "isCustom"];</code>
   * @return The isCustom.
   */
  boolean getIsCustom();
}
