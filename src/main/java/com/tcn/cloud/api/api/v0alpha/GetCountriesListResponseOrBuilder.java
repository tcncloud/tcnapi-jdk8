// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetCountriesListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetCountriesListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Country> 
      getCountriesList();
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Country getCountries(int index);
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  int getCountriesCount();
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CountryOrBuilder> 
      getCountriesOrBuilderList();
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CountryOrBuilder getCountriesOrBuilder(
      int index);
}
