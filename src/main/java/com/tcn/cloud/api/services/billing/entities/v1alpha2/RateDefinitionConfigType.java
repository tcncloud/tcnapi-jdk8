// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/rates.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

/**
 * <pre>
 * RateDefinitionConfigType defines the type of configuration for a rate definition.
 * </pre>
 *
 * Protobuf enum {@code services.billing.entities.v1alpha2.RateDefinitionConfigType}
 */
public enum RateDefinitionConfigType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED = 0;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED(0),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_NOOP = 1;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_NOOP(1),
  /**
   * <pre>
   * omni config types (1000-1999)
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_SEATS = 1000;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_SEATS(1000),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_POLL = 1500;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_POLL(1500),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_CREATED = 1501;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_CREATED(1501),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT = 1600;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT(1600),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_SIZE = 1601;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_SIZE(1601),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS = 1602;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS(1602),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL = 1610;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL(1610),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE = 1611;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE(1611),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_UNITS = 1612;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_UNITS(1612),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS = 1620;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS(1620),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_SIZE = 1621;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_SIZE(1621),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_UNITS = 1622;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_UNITS(1622),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT = 1700;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT(1700),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_SIZE = 1701;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_SIZE(1701),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS = 1702;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS(1702),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL = 1710;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL(1710),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SIZE = 1711;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SIZE(1711),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_UNITS = 1712;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_UNITS(1712),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS = 1720;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS(1720),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_SIZE = 1721;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_SIZE(1721),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_UNITS = 1722;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_UNITS(1722),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT = 1800;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT(1800),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_SIZE = 1801;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_SIZE(1801),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_UNITS = 1802;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_UNITS(1802),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL = 1810;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL(1810),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_SIZE = 1811;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_SIZE(1811),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS = 1812;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS(1812),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS = 1820;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS(1820),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE = 1821;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE(1821),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_UNITS = 1822;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_UNITS(1822),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT = 1900;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT(1900),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_SIZE = 1901;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_SIZE(1901),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_UNITS = 1902;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_UNITS(1902),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL = 1910;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL(1910),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_SIZE = 1911;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_SIZE(1911),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_UNITS = 1912;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_UNITS(1912),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS = 1920;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS(1920),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_SIZE = 1921;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_SIZE(1921),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UNITS = 1922;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UNITS(1922),
  /**
   * <pre>
   * compliance config types (2000-2999)
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY = 2000;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY(2000),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED = 2001;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED(2001),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_NOOP = 1;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_NOOP_VALUE = 1;
  /**
   * <pre>
   * omni config types (1000-1999)
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_SEATS = 1000;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_SEATS_VALUE = 1000;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_POLL = 1500;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_POLL_VALUE = 1500;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_CREATED = 1501;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_CREATED_VALUE = 1501;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT = 1600;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_VALUE = 1600;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_SIZE = 1601;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_SIZE_VALUE = 1601;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS = 1602;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS_VALUE = 1602;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL = 1610;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_VALUE = 1610;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE = 1611;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE_VALUE = 1611;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_UNITS = 1612;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_UNITS_VALUE = 1612;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS = 1620;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_VALUE = 1620;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_SIZE = 1621;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_SIZE_VALUE = 1621;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_UNITS = 1622;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_UNITS_VALUE = 1622;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT = 1700;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_VALUE = 1700;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_SIZE = 1701;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_SIZE_VALUE = 1701;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS = 1702;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS_VALUE = 1702;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL = 1710;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_VALUE = 1710;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SIZE = 1711;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SIZE_VALUE = 1711;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_UNITS = 1712;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_UNITS_VALUE = 1712;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS = 1720;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_VALUE = 1720;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_SIZE = 1721;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_SIZE_VALUE = 1721;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_UNITS = 1722;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_UNITS_VALUE = 1722;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT = 1800;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_VALUE = 1800;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_SIZE = 1801;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_SIZE_VALUE = 1801;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_UNITS = 1802;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_UNITS_VALUE = 1802;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL = 1810;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_VALUE = 1810;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_SIZE = 1811;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_SIZE_VALUE = 1811;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS = 1812;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS_VALUE = 1812;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS = 1820;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_VALUE = 1820;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE = 1821;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE_VALUE = 1821;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_UNITS = 1822;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_UNITS_VALUE = 1822;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT = 1900;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_VALUE = 1900;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_SIZE = 1901;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_SIZE_VALUE = 1901;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_UNITS = 1902;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_UNITS_VALUE = 1902;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL = 1910;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_VALUE = 1910;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_SIZE = 1911;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_SIZE_VALUE = 1911;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_UNITS = 1912;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_UNITS_VALUE = 1912;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS = 1920;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_VALUE = 1920;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_SIZE = 1921;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_SIZE_VALUE = 1921;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UNITS = 1922;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UNITS_VALUE = 1922;
  /**
   * <pre>
   * compliance config types (2000-2999)
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY = 2000;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_VALUE = 2000;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED = 2001;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED_VALUE = 2001;


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
  public static RateDefinitionConfigType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RateDefinitionConfigType forNumber(int value) {
    switch (value) {
      case 0: return RATE_DEFINITION_CONFIG_TYPE_UNSPECIFIED;
      case 1: return RATE_DEFINITION_CONFIG_TYPE_NOOP;
      case 1000: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_SEATS;
      case 1500: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_POLL;
      case 1501: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CONNECTED_INBOX_CREATED;
      case 1600: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT;
      case 1601: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_SIZE;
      case 1602: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_CHAT_UNITS;
      case 1610: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL;
      case 1611: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_SIZE;
      case 1612: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_EMAIL_UNITS;
      case 1620: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS;
      case 1621: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_SIZE;
      case 1622: return RATE_DEFINITION_CONFIG_TYPE_OMNI_AGENT_MESSAGE_SMS_UNITS;
      case 1700: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT;
      case 1701: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_SIZE;
      case 1702: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_CHAT_UNITS;
      case 1710: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL;
      case 1711: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_SIZE;
      case 1712: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_EMAIL_UNITS;
      case 1720: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS;
      case 1721: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_SIZE;
      case 1722: return RATE_DEFINITION_CONFIG_TYPE_OMNI_MANAGER_MESSAGE_SMS_UNITS;
      case 1800: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT;
      case 1801: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_SIZE;
      case 1802: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_CHAT_UNITS;
      case 1810: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL;
      case 1811: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_SIZE;
      case 1812: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_EMAIL_UNITS;
      case 1820: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS;
      case 1821: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_SIZE;
      case 1822: return RATE_DEFINITION_CONFIG_TYPE_OMNI_SYSTEM_MESSAGE_SMS_UNITS;
      case 1900: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT;
      case 1901: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_SIZE;
      case 1902: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_CHAT_UNITS;
      case 1910: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL;
      case 1911: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_SIZE;
      case 1912: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_EMAIL_UNITS;
      case 1920: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS;
      case 1921: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_SIZE;
      case 1922: return RATE_DEFINITION_CONFIG_TYPE_OMNI_CUSTOMER_MESSAGE_SMS_UNITS;
      case 2000: return RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY;
      case 2001: return RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RateDefinitionConfigType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RateDefinitionConfigType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RateDefinitionConfigType>() {
          public RateDefinitionConfigType findValueByNumber(int number) {
            return RateDefinitionConfigType.forNumber(number);
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
    return com.tcn.cloud.api.services.billing.entities.v1alpha2.RatesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RateDefinitionConfigType[] VALUES = values();

  public static RateDefinitionConfigType valueOf(
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

  private RateDefinitionConfigType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.billing.entities.v1alpha2.RateDefinitionConfigType)
}
