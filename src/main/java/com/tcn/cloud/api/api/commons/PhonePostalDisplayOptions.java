// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * An enum for the keys used to specify what Phone/Zip metadata to display in the Agent app.
 * </pre>
 *
 * Protobuf enum {@code api.commons.PhonePostalDisplayOptions}
 */
public enum PhonePostalDisplayOptions
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * KEY adminCode1
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_1 = 0;</code>
   */
  DISPLAY_OPTION_ADMIN_CODE_1(0),
  /**
   * <pre>
   * KEY adminCode2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_2 = 1;</code>
   */
  DISPLAY_OPTION_ADMIN_CODE_2(1),
  /**
   * <pre>
   * KEY adminCode3
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_3 = 2;</code>
   */
  DISPLAY_OPTION_ADMIN_CODE_3(2),
  /**
   * <pre>
   * KEY adminName1
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_1 = 3;</code>
   */
  DISPLAY_OPTION_ADMIN_NAME_1(3),
  /**
   * <pre>
   * KEY adminName2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_2 = 4;</code>
   */
  DISPLAY_OPTION_ADMIN_NAME_2(4),
  /**
   * <pre>
   * KEY adminName3
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_3 = 5;</code>
   */
  DISPLAY_OPTION_ADMIN_NAME_3(5),
  /**
   * <pre>
   * KEY areaCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_AREA_CODE = 6;</code>
   */
  DISPLAY_OPTION_AREA_CODE(6),
  /**
   * <pre>
   * KEY carrier
   * </pre>
   *
   * <code>DISPLAY_OPTION_CARRIER = 7;</code>
   */
  DISPLAY_OPTION_CARRIER(7),
  /**
   * <pre>
   * cocType
   * </pre>
   *
   * <code>DISPLAY_OPTION_CENTRAL_OFFICE_CODE_TYPE = 8;</code>
   */
  DISPLAY_OPTION_CENTRAL_OFFICE_CODE_TYPE(8),
  /**
   * <pre>
   * KEY city
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY = 9;</code>
   */
  DISPLAY_OPTION_CITY(9),
  /**
   * <pre>
   * KEY cityName
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY_NAME = 10;</code>
   */
  DISPLAY_OPTION_CITY_NAME(10),
  /**
   * <pre>
   * KEY cityType
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY_TYPE = 11;</code>
   */
  DISPLAY_OPTION_CITY_TYPE(11),
  /**
   * <pre>
   * KEY countryCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTRY_CODE = 12;</code>
   */
  DISPLAY_OPTION_COUNTRY_CODE(12),
  /**
   * <pre>
   * KEY ccnsn
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTRY_CODE_SUBSCRIBER_NUMBER = 13;</code>
   */
  DISPLAY_OPTION_COUNTRY_CODE_SUBSCRIBER_NUMBER(13),
  /**
   * <pre>
   * KEY iso2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ISO_2 = 14;</code>
   */
  DISPLAY_OPTION_ISO_2(14),
  /**
   * <pre>
   * KEY countyName
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTY_NAME = 15;</code>
   */
  DISPLAY_OPTION_COUNTY_NAME(15),
  /**
   * <pre>
   * KEY countyFips
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTY_FIPS = 16;</code>
   */
  DISPLAY_OPTION_COUNTY_FIPS(16),
  /**
   * <pre>
   * KEY internationalPrefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_INTERNATIONAL_PREFIX = 17;</code>
   */
  DISPLAY_OPTION_INTERNATIONAL_PREFIX(17),
  /**
   * <pre>
   * KEY language
   * </pre>
   *
   * <code>DISPLAY_OPTION_LANGUAGE = 18;</code>
   */
  DISPLAY_OPTION_LANGUAGE(18),
  /**
   * <pre>
   * KEY latitude
   * </pre>
   *
   * <code>DISPLAY_OPTION_LATITUDE = 19;</code>
   */
  DISPLAY_OPTION_LATITUDE(19),
  /**
   * <pre>
   * KEY accuracy
   * </pre>
   *
   * <code>DISPLAY_OPTION_LONGITUDE_LATITUDE_ACCURACY = 20;</code>
   */
  DISPLAY_OPTION_LONGITUDE_LATITUDE_ACCURACY(20),
  /**
   * <pre>
   * KEY longitude
   * </pre>
   *
   * <code>DISPLAY_OPTION_LONGITUDE = 21;</code>
   */
  DISPLAY_OPTION_LONGITUDE(21),
  /**
   * <pre>
   * KEY max
   * </pre>
   *
   * <code>DISPLAY_OPTION_MAXIMUM_BLOCK_NUMBER = 22;</code>
   */
  DISPLAY_OPTION_MAXIMUM_BLOCK_NUMBER(22),
  /**
   * <pre>
   * KEY msaCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_METROPOLITAN_STATISTICAL_AREA = 23;</code>
   */
  DISPLAY_OPTION_METROPOLITAN_STATISTICAL_AREA(23),
  /**
   * <pre>
   * KEY min
   * </pre>
   *
   * <code>DISPLAY_OPTION_MINIMUM_BLOCK_NUMBER = 24;</code>
   */
  DISPLAY_OPTION_MINIMUM_BLOCK_NUMBER(24),
  /**
   * <pre>
   * KEY ndc
   * </pre>
   *
   * <code>DISPLAY_OPTION_NATIONAL_DESTINATION_CODE = 25;</code>
   */
  DISPLAY_OPTION_NATIONAL_DESTINATION_CODE(25),
  /**
   * <pre>
   * KEY nationalPrefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_NATIONAL_PREFIX = 26;</code>
   */
  DISPLAY_OPTION_NATIONAL_PREFIX(26),
  /**
   * <pre>
   * KEY prefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_PREFIX = 27;</code>
   */
  DISPLAY_OPTION_NUMBER_PREFIX(27),
  /**
   * <pre>
   * KEY type
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_TYPE = 28;</code>
   */
  DISPLAY_OPTION_NUMBER_TYPE(28),
  /**
   * <pre>
   * KEY usesNdc
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_USES_NDC = 29;</code>
   */
  DISPLAY_OPTION_NUMBER_USES_NDC(29),
  /**
   * <pre>
   * KEY dst
   * </pre>
   *
   * <code>DISPLAY_OPTION_OBSERVES_DAYLIGHT_SAVINGS_TIME = 30;</code>
   */
  DISPLAY_OPTION_OBSERVES_DAYLIGHT_SAVINGS_TIME(30),
  /**
   * <pre>
   * KEY placeName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PLACE_NAME = 31;</code>
   */
  DISPLAY_OPTION_PLACE_NAME(31),
  /**
   * <pre>
   * KEY postalCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_CODE = 32;</code>
   */
  DISPLAY_OPTION_POSTAL_CODE(32),
  /**
   * <pre>
   * KEY postalCodeKey
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_CODE_ALPHANUMERIC = 33;</code>
   */
  DISPLAY_OPTION_POSTAL_CODE_ALPHANUMERIC(33),
  /**
   * <pre>
   * KEY postalType
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_TYPE = 34;</code>
   */
  DISPLAY_OPTION_POSTAL_TYPE(34),
  /**
   * <pre>
   * KEY regionCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_ABBREVIATION = 35;</code>
   */
  DISPLAY_OPTION_PROVINCE_ABBREVIATION(35),
  /**
   * <pre>
   * KEY regionName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_NAME = 36;</code>
   */
  DISPLAY_OPTION_PROVINCE_NAME(36),
  /**
   * <pre>
   * KEY ssc1
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_1 = 37;</code>
   */
  DISPLAY_OPTION_SPECIAL_SERVICE_CODE_1(37),
  /**
   * <pre>
   * KEY ssc2
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_2 = 38;</code>
   */
  DISPLAY_OPTION_SPECIAL_SERVICE_CODE_2(38),
  /**
   * <pre>
   * KEY ssc3
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_3 = 39;</code>
   */
  DISPLAY_OPTION_SPECIAL_SERVICE_CODE_3(39),
  /**
   * <pre>
   * KEY ssc4
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_4 = 40;</code>
   */
  DISPLAY_OPTION_SPECIAL_SERVICE_CODE_4(40),
  /**
   * <pre>
   * KEY provinceName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_STATE_NAME = 41;</code>
   */
  DISPLAY_OPTION_PROVINCE_STATE_NAME(41),
  /**
   * <pre>
   * KEY stateFips
   * </pre>
   *
   * <code>DISPLAY_OPTION_STATE_FIPS_CODE = 42;</code>
   */
  DISPLAY_OPTION_STATE_FIPS_CODE(42),
  /**
   * <pre>
   * KEY timeZone
   * </pre>
   *
   * <code>DISPLAY_OPTION_TIME_ZONE = 43;</code>
   */
  DISPLAY_OPTION_TIME_ZONE(43),
  /**
   * <pre>
   * KEY utc
   * </pre>
   *
   * <code>DISPLAY_OPTION_UTC_OFFSET = 44;</code>
   */
  DISPLAY_OPTION_UTC_OFFSET(44),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * KEY adminCode1
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_1 = 0;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_CODE_1_VALUE = 0;
  /**
   * <pre>
   * KEY adminCode2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_2 = 1;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_CODE_2_VALUE = 1;
  /**
   * <pre>
   * KEY adminCode3
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_CODE_3 = 2;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_CODE_3_VALUE = 2;
  /**
   * <pre>
   * KEY adminName1
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_1 = 3;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_NAME_1_VALUE = 3;
  /**
   * <pre>
   * KEY adminName2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_2 = 4;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_NAME_2_VALUE = 4;
  /**
   * <pre>
   * KEY adminName3
   * </pre>
   *
   * <code>DISPLAY_OPTION_ADMIN_NAME_3 = 5;</code>
   */
  public static final int DISPLAY_OPTION_ADMIN_NAME_3_VALUE = 5;
  /**
   * <pre>
   * KEY areaCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_AREA_CODE = 6;</code>
   */
  public static final int DISPLAY_OPTION_AREA_CODE_VALUE = 6;
  /**
   * <pre>
   * KEY carrier
   * </pre>
   *
   * <code>DISPLAY_OPTION_CARRIER = 7;</code>
   */
  public static final int DISPLAY_OPTION_CARRIER_VALUE = 7;
  /**
   * <pre>
   * cocType
   * </pre>
   *
   * <code>DISPLAY_OPTION_CENTRAL_OFFICE_CODE_TYPE = 8;</code>
   */
  public static final int DISPLAY_OPTION_CENTRAL_OFFICE_CODE_TYPE_VALUE = 8;
  /**
   * <pre>
   * KEY city
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY = 9;</code>
   */
  public static final int DISPLAY_OPTION_CITY_VALUE = 9;
  /**
   * <pre>
   * KEY cityName
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY_NAME = 10;</code>
   */
  public static final int DISPLAY_OPTION_CITY_NAME_VALUE = 10;
  /**
   * <pre>
   * KEY cityType
   * </pre>
   *
   * <code>DISPLAY_OPTION_CITY_TYPE = 11;</code>
   */
  public static final int DISPLAY_OPTION_CITY_TYPE_VALUE = 11;
  /**
   * <pre>
   * KEY countryCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTRY_CODE = 12;</code>
   */
  public static final int DISPLAY_OPTION_COUNTRY_CODE_VALUE = 12;
  /**
   * <pre>
   * KEY ccnsn
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTRY_CODE_SUBSCRIBER_NUMBER = 13;</code>
   */
  public static final int DISPLAY_OPTION_COUNTRY_CODE_SUBSCRIBER_NUMBER_VALUE = 13;
  /**
   * <pre>
   * KEY iso2
   * </pre>
   *
   * <code>DISPLAY_OPTION_ISO_2 = 14;</code>
   */
  public static final int DISPLAY_OPTION_ISO_2_VALUE = 14;
  /**
   * <pre>
   * KEY countyName
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTY_NAME = 15;</code>
   */
  public static final int DISPLAY_OPTION_COUNTY_NAME_VALUE = 15;
  /**
   * <pre>
   * KEY countyFips
   * </pre>
   *
   * <code>DISPLAY_OPTION_COUNTY_FIPS = 16;</code>
   */
  public static final int DISPLAY_OPTION_COUNTY_FIPS_VALUE = 16;
  /**
   * <pre>
   * KEY internationalPrefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_INTERNATIONAL_PREFIX = 17;</code>
   */
  public static final int DISPLAY_OPTION_INTERNATIONAL_PREFIX_VALUE = 17;
  /**
   * <pre>
   * KEY language
   * </pre>
   *
   * <code>DISPLAY_OPTION_LANGUAGE = 18;</code>
   */
  public static final int DISPLAY_OPTION_LANGUAGE_VALUE = 18;
  /**
   * <pre>
   * KEY latitude
   * </pre>
   *
   * <code>DISPLAY_OPTION_LATITUDE = 19;</code>
   */
  public static final int DISPLAY_OPTION_LATITUDE_VALUE = 19;
  /**
   * <pre>
   * KEY accuracy
   * </pre>
   *
   * <code>DISPLAY_OPTION_LONGITUDE_LATITUDE_ACCURACY = 20;</code>
   */
  public static final int DISPLAY_OPTION_LONGITUDE_LATITUDE_ACCURACY_VALUE = 20;
  /**
   * <pre>
   * KEY longitude
   * </pre>
   *
   * <code>DISPLAY_OPTION_LONGITUDE = 21;</code>
   */
  public static final int DISPLAY_OPTION_LONGITUDE_VALUE = 21;
  /**
   * <pre>
   * KEY max
   * </pre>
   *
   * <code>DISPLAY_OPTION_MAXIMUM_BLOCK_NUMBER = 22;</code>
   */
  public static final int DISPLAY_OPTION_MAXIMUM_BLOCK_NUMBER_VALUE = 22;
  /**
   * <pre>
   * KEY msaCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_METROPOLITAN_STATISTICAL_AREA = 23;</code>
   */
  public static final int DISPLAY_OPTION_METROPOLITAN_STATISTICAL_AREA_VALUE = 23;
  /**
   * <pre>
   * KEY min
   * </pre>
   *
   * <code>DISPLAY_OPTION_MINIMUM_BLOCK_NUMBER = 24;</code>
   */
  public static final int DISPLAY_OPTION_MINIMUM_BLOCK_NUMBER_VALUE = 24;
  /**
   * <pre>
   * KEY ndc
   * </pre>
   *
   * <code>DISPLAY_OPTION_NATIONAL_DESTINATION_CODE = 25;</code>
   */
  public static final int DISPLAY_OPTION_NATIONAL_DESTINATION_CODE_VALUE = 25;
  /**
   * <pre>
   * KEY nationalPrefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_NATIONAL_PREFIX = 26;</code>
   */
  public static final int DISPLAY_OPTION_NATIONAL_PREFIX_VALUE = 26;
  /**
   * <pre>
   * KEY prefix
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_PREFIX = 27;</code>
   */
  public static final int DISPLAY_OPTION_NUMBER_PREFIX_VALUE = 27;
  /**
   * <pre>
   * KEY type
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_TYPE = 28;</code>
   */
  public static final int DISPLAY_OPTION_NUMBER_TYPE_VALUE = 28;
  /**
   * <pre>
   * KEY usesNdc
   * </pre>
   *
   * <code>DISPLAY_OPTION_NUMBER_USES_NDC = 29;</code>
   */
  public static final int DISPLAY_OPTION_NUMBER_USES_NDC_VALUE = 29;
  /**
   * <pre>
   * KEY dst
   * </pre>
   *
   * <code>DISPLAY_OPTION_OBSERVES_DAYLIGHT_SAVINGS_TIME = 30;</code>
   */
  public static final int DISPLAY_OPTION_OBSERVES_DAYLIGHT_SAVINGS_TIME_VALUE = 30;
  /**
   * <pre>
   * KEY placeName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PLACE_NAME = 31;</code>
   */
  public static final int DISPLAY_OPTION_PLACE_NAME_VALUE = 31;
  /**
   * <pre>
   * KEY postalCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_CODE = 32;</code>
   */
  public static final int DISPLAY_OPTION_POSTAL_CODE_VALUE = 32;
  /**
   * <pre>
   * KEY postalCodeKey
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_CODE_ALPHANUMERIC = 33;</code>
   */
  public static final int DISPLAY_OPTION_POSTAL_CODE_ALPHANUMERIC_VALUE = 33;
  /**
   * <pre>
   * KEY postalType
   * </pre>
   *
   * <code>DISPLAY_OPTION_POSTAL_TYPE = 34;</code>
   */
  public static final int DISPLAY_OPTION_POSTAL_TYPE_VALUE = 34;
  /**
   * <pre>
   * KEY regionCode
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_ABBREVIATION = 35;</code>
   */
  public static final int DISPLAY_OPTION_PROVINCE_ABBREVIATION_VALUE = 35;
  /**
   * <pre>
   * KEY regionName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_NAME = 36;</code>
   */
  public static final int DISPLAY_OPTION_PROVINCE_NAME_VALUE = 36;
  /**
   * <pre>
   * KEY ssc1
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_1 = 37;</code>
   */
  public static final int DISPLAY_OPTION_SPECIAL_SERVICE_CODE_1_VALUE = 37;
  /**
   * <pre>
   * KEY ssc2
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_2 = 38;</code>
   */
  public static final int DISPLAY_OPTION_SPECIAL_SERVICE_CODE_2_VALUE = 38;
  /**
   * <pre>
   * KEY ssc3
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_3 = 39;</code>
   */
  public static final int DISPLAY_OPTION_SPECIAL_SERVICE_CODE_3_VALUE = 39;
  /**
   * <pre>
   * KEY ssc4
   * </pre>
   *
   * <code>DISPLAY_OPTION_SPECIAL_SERVICE_CODE_4 = 40;</code>
   */
  public static final int DISPLAY_OPTION_SPECIAL_SERVICE_CODE_4_VALUE = 40;
  /**
   * <pre>
   * KEY provinceName
   * </pre>
   *
   * <code>DISPLAY_OPTION_PROVINCE_STATE_NAME = 41;</code>
   */
  public static final int DISPLAY_OPTION_PROVINCE_STATE_NAME_VALUE = 41;
  /**
   * <pre>
   * KEY stateFips
   * </pre>
   *
   * <code>DISPLAY_OPTION_STATE_FIPS_CODE = 42;</code>
   */
  public static final int DISPLAY_OPTION_STATE_FIPS_CODE_VALUE = 42;
  /**
   * <pre>
   * KEY timeZone
   * </pre>
   *
   * <code>DISPLAY_OPTION_TIME_ZONE = 43;</code>
   */
  public static final int DISPLAY_OPTION_TIME_ZONE_VALUE = 43;
  /**
   * <pre>
   * KEY utc
   * </pre>
   *
   * <code>DISPLAY_OPTION_UTC_OFFSET = 44;</code>
   */
  public static final int DISPLAY_OPTION_UTC_OFFSET_VALUE = 44;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PhonePostalDisplayOptions valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PhonePostalDisplayOptions forNumber(int value) {
    switch (value) {
      case 0: return DISPLAY_OPTION_ADMIN_CODE_1;
      case 1: return DISPLAY_OPTION_ADMIN_CODE_2;
      case 2: return DISPLAY_OPTION_ADMIN_CODE_3;
      case 3: return DISPLAY_OPTION_ADMIN_NAME_1;
      case 4: return DISPLAY_OPTION_ADMIN_NAME_2;
      case 5: return DISPLAY_OPTION_ADMIN_NAME_3;
      case 6: return DISPLAY_OPTION_AREA_CODE;
      case 7: return DISPLAY_OPTION_CARRIER;
      case 8: return DISPLAY_OPTION_CENTRAL_OFFICE_CODE_TYPE;
      case 9: return DISPLAY_OPTION_CITY;
      case 10: return DISPLAY_OPTION_CITY_NAME;
      case 11: return DISPLAY_OPTION_CITY_TYPE;
      case 12: return DISPLAY_OPTION_COUNTRY_CODE;
      case 13: return DISPLAY_OPTION_COUNTRY_CODE_SUBSCRIBER_NUMBER;
      case 14: return DISPLAY_OPTION_ISO_2;
      case 15: return DISPLAY_OPTION_COUNTY_NAME;
      case 16: return DISPLAY_OPTION_COUNTY_FIPS;
      case 17: return DISPLAY_OPTION_INTERNATIONAL_PREFIX;
      case 18: return DISPLAY_OPTION_LANGUAGE;
      case 19: return DISPLAY_OPTION_LATITUDE;
      case 20: return DISPLAY_OPTION_LONGITUDE_LATITUDE_ACCURACY;
      case 21: return DISPLAY_OPTION_LONGITUDE;
      case 22: return DISPLAY_OPTION_MAXIMUM_BLOCK_NUMBER;
      case 23: return DISPLAY_OPTION_METROPOLITAN_STATISTICAL_AREA;
      case 24: return DISPLAY_OPTION_MINIMUM_BLOCK_NUMBER;
      case 25: return DISPLAY_OPTION_NATIONAL_DESTINATION_CODE;
      case 26: return DISPLAY_OPTION_NATIONAL_PREFIX;
      case 27: return DISPLAY_OPTION_NUMBER_PREFIX;
      case 28: return DISPLAY_OPTION_NUMBER_TYPE;
      case 29: return DISPLAY_OPTION_NUMBER_USES_NDC;
      case 30: return DISPLAY_OPTION_OBSERVES_DAYLIGHT_SAVINGS_TIME;
      case 31: return DISPLAY_OPTION_PLACE_NAME;
      case 32: return DISPLAY_OPTION_POSTAL_CODE;
      case 33: return DISPLAY_OPTION_POSTAL_CODE_ALPHANUMERIC;
      case 34: return DISPLAY_OPTION_POSTAL_TYPE;
      case 35: return DISPLAY_OPTION_PROVINCE_ABBREVIATION;
      case 36: return DISPLAY_OPTION_PROVINCE_NAME;
      case 37: return DISPLAY_OPTION_SPECIAL_SERVICE_CODE_1;
      case 38: return DISPLAY_OPTION_SPECIAL_SERVICE_CODE_2;
      case 39: return DISPLAY_OPTION_SPECIAL_SERVICE_CODE_3;
      case 40: return DISPLAY_OPTION_SPECIAL_SERVICE_CODE_4;
      case 41: return DISPLAY_OPTION_PROVINCE_STATE_NAME;
      case 42: return DISPLAY_OPTION_STATE_FIPS_CODE;
      case 43: return DISPLAY_OPTION_TIME_ZONE;
      case 44: return DISPLAY_OPTION_UTC_OFFSET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PhonePostalDisplayOptions>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PhonePostalDisplayOptions> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PhonePostalDisplayOptions>() {
          public PhonePostalDisplayOptions findValueByNumber(int number) {
            return PhonePostalDisplayOptions.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(12);
  }

  private static final PhonePostalDisplayOptions[] VALUES = values();

  public static PhonePostalDisplayOptions valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PhonePostalDisplayOptions(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.PhonePostalDisplayOptions)
}

