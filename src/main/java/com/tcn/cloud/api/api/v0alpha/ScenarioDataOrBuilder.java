// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ScenarioDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ScenarioData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   * @return Whether the commType field is set.
   */
  boolean hasCommType();
  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   * @return The commType.
   */
  com.tcn.cloud.api.api.commons.CommType getCommType();
  /**
   * <code>.api.commons.CommType comm_type = 1 [json_name = "commType"];</code>
   */
  com.tcn.cloud.api.api.commons.CommTypeOrBuilder getCommTypeOrBuilder();

  /**
   * <code>string phone_number = 2 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <code>string phone_number = 2 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <code>string country_code = 3 [json_name = "countryCode", deprecated = true];</code>
   * @deprecated api.v0alpha.ScenarioData.country_code is deprecated.
   *     See api/v0alpha/compliance.proto;l=1230
   * @return The countryCode.
   */
  @java.lang.Deprecated java.lang.String getCountryCode();
  /**
   * <code>string country_code = 3 [json_name = "countryCode", deprecated = true];</code>
   * @deprecated api.v0alpha.ScenarioData.country_code is deprecated.
   *     See api/v0alpha/compliance.proto;l=1230
   * @return The bytes for countryCode.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>map&lt;string, string&gt; call_metadata = 5 [json_name = "callMetadata"];</code>
   */
  int getCallMetadataCount();
  /**
   * <code>map&lt;string, string&gt; call_metadata = 5 [json_name = "callMetadata"];</code>
   */
  boolean containsCallMetadata(
      java.lang.String key);
  /**
   * Use {@link #getCallMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCallMetadata();
  /**
   * <code>map&lt;string, string&gt; call_metadata = 5 [json_name = "callMetadata"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCallMetadataMap();
  /**
   * <code>map&lt;string, string&gt; call_metadata = 5 [json_name = "callMetadata"];</code>
   */
  /* nullable */
java.lang.String getCallMetadataOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; call_metadata = 5 [json_name = "callMetadata"];</code>
   */
  java.lang.String getCallMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>.google.protobuf.Timestamp time_of_call = 6 [json_name = "timeOfCall"];</code>
   * @return Whether the timeOfCall field is set.
   */
  boolean hasTimeOfCall();
  /**
   * <code>.google.protobuf.Timestamp time_of_call = 6 [json_name = "timeOfCall"];</code>
   * @return The timeOfCall.
   */
  com.google.protobuf.Timestamp getTimeOfCall();
  /**
   * <code>.google.protobuf.Timestamp time_of_call = 6 [json_name = "timeOfCall"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOfCallOrBuilder();

  /**
   * <code>int64 frequency_count = 7 [json_name = "frequencyCount"];</code>
   * @return The frequencyCount.
   */
  long getFrequencyCount();

  /**
   * <code>int64 frequency_duration = 8 [json_name = "frequencyDuration"];</code>
   * @return The frequencyDuration.
   */
  long getFrequencyDuration();

  /**
   * <code>bool dncl_blocks = 9 [json_name = "dnclBlocks"];</code>
   * @return The dnclBlocks.
   */
  boolean getDnclBlocks();

  /**
   * <code>string country = 10 [json_name = "country"];</code>
   * @return The country.
   */
  java.lang.String getCountry();
  /**
   * <code>string country = 10 [json_name = "country"];</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <code>string state = 11 [json_name = "state"];</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>string state = 11 [json_name = "state"];</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>string county = 12 [json_name = "county"];</code>
   * @return The county.
   */
  java.lang.String getCounty();
  /**
   * <code>string county = 12 [json_name = "county"];</code>
   * @return The bytes for county.
   */
  com.google.protobuf.ByteString
      getCountyBytes();

  /**
   * <code>string city = 13 [json_name = "city"];</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 13 [json_name = "city"];</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string province = 14 [json_name = "province"];</code>
   * @return The province.
   */
  java.lang.String getProvince();
  /**
   * <code>string province = 14 [json_name = "province"];</code>
   * @return The bytes for province.
   */
  com.google.protobuf.ByteString
      getProvinceBytes();

  /**
   * <code>.api.commons.PhoneType phone_type = 15 [json_name = "phoneType"];</code>
   * @return The enum numeric value on the wire for phoneType.
   */
  int getPhoneTypeValue();
  /**
   * <code>.api.commons.PhoneType phone_type = 15 [json_name = "phoneType"];</code>
   * @return The phoneType.
   */
  com.tcn.cloud.api.api.commons.PhoneType getPhoneType();

  /**
   * <pre>
   * time_zone uses the iana timezone format. Defaults to utc
   * </pre>
   *
   * <code>string time_zone = 16 [json_name = "timeZone"];</code>
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   * <pre>
   * time_zone uses the iana timezone format. Defaults to utc
   * </pre>
   *
   * <code>string time_zone = 16 [json_name = "timeZone"];</code>
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString
      getTimeZoneBytes();

  /**
   * <code>repeated string holidays = 17 [json_name = "holidays"];</code>
   * @return A list containing the holidays.
   */
  java.util.List<java.lang.String>
      getHolidaysList();
  /**
   * <code>repeated string holidays = 17 [json_name = "holidays"];</code>
   * @return The count of holidays.
   */
  int getHolidaysCount();
  /**
   * <code>repeated string holidays = 17 [json_name = "holidays"];</code>
   * @param index The index of the element to return.
   * @return The holidays at the given index.
   */
  java.lang.String getHolidays(int index);
  /**
   * <code>repeated string holidays = 17 [json_name = "holidays"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the holidays at the given index.
   */
  com.google.protobuf.ByteString
      getHolidaysBytes(int index);

  /**
   * <code>.api.v0alpha.CountryCode country_code_data = 18 [json_name = "countryCodeData"];</code>
   * @return Whether the countryCodeData field is set.
   */
  boolean hasCountryCodeData();
  /**
   * <code>.api.v0alpha.CountryCode country_code_data = 18 [json_name = "countryCodeData"];</code>
   * @return The countryCodeData.
   */
  com.tcn.cloud.api.api.v0alpha.CountryCode getCountryCodeData();
  /**
   * <code>.api.v0alpha.CountryCode country_code_data = 18 [json_name = "countryCodeData"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CountryCodeOrBuilder getCountryCodeDataOrBuilder();
}
