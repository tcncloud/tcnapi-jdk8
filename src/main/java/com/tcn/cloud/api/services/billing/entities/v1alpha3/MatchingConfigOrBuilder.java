// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public interface MatchingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha3.MatchingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.billing.entities.v1alpha3.MatchingConfigType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.services.billing.entities.v1alpha3.MatchingConfigType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.MatchingConfigType getType();

  /**
   * <code>.services.billing.entities.v1alpha3.CountryPrefixMatchingConfig country_prefix = 2 [json_name = "countryPrefix"];</code>
   * @return Whether the countryPrefix field is set.
   */
  boolean hasCountryPrefix();
  /**
   * <code>.services.billing.entities.v1alpha3.CountryPrefixMatchingConfig country_prefix = 2 [json_name = "countryPrefix"];</code>
   * @return The countryPrefix.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.CountryPrefixMatchingConfig getCountryPrefix();
  /**
   * <code>.services.billing.entities.v1alpha3.CountryPrefixMatchingConfig country_prefix = 2 [json_name = "countryPrefix"];</code>
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.CountryPrefixMatchingConfigOrBuilder getCountryPrefixOrBuilder();

  com.tcn.cloud.api.services.billing.entities.v1alpha3.MatchingConfig.ConfigCase getConfigCase();
}
