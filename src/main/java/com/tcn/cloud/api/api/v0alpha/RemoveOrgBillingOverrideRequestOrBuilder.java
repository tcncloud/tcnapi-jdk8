// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface RemoveOrgBillingOverrideRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.RemoveOrgBillingOverrideRequest)
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
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <code>string region = 2 [json_name = "region"];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <code>.api.commons.Country country = 3 [json_name = "country"];</code>
   * @return The enum numeric value on the wire for country.
   */
  int getCountryValue();
  /**
   * <code>.api.commons.Country country = 3 [json_name = "country"];</code>
   * @return The country.
   */
  com.tcn.cloud.api.api.commons.Country getCountry();
}
