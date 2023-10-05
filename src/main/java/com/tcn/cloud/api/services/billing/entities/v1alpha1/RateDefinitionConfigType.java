// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/config.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

/**
 * <pre>
 * RateDefinitionConfigType defines the type of configuration for a rate definition.
 * </pre>
 *
 * Protobuf enum {@code services.billing.entities.v1alpha1.RateDefinitionConfigType}
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
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_SEATS = 2;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_SEATS(2),
  /**
   * <pre>
   * omni config types
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT = 100;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT(100),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE = 101;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE(101),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_SIZE = 102;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_SIZE(102),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS = 103;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS(103),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_MESSAGE = 104;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_MESSAGE(104),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE = 105;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE(105),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS = 106;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS(106),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_POLL = 107;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_POLL(107),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT = 108;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT(108),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE = 109;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE(109),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_SIZE = 110;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_SIZE(110),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS = 111;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS(111),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT = 112;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT(112),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE = 113;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE(113),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE = 114;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE(114),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS = 115;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS(115),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE = 116;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE(116),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_SIZE = 117;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_SIZE(117),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE = 118;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE(118),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_CREATED = 119;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_CREATED(119),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE = 120;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE(120),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_SIZE = 121;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_SIZE(121),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE = 122;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE(122),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_SIZE = 123;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_SIZE(123),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS = 124;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS(124),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_EMAIL_MESSAGE_UNITS = 125;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_EMAIL_MESSAGE_UNITS(125),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS = 126;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS(126),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT_MESSAGE_UNITS = 127;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT_MESSAGE_UNITS(127),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS = 128;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS(128),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_SMS_MESSAGE_UNITS = 129;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_MANAGER_SMS_MESSAGE_UNITS(129),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS = 130;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS(130),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_EMAIL_MESSAGE_UNITS = 131;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_EMAIL_MESSAGE_UNITS(131),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNITS = 132;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNITS(132),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_CHAT_MESSAGE_UNITS = 133;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_SYSTEM_CHAT_MESSAGE_UNITS(133),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNITS = 134;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNITS(134),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_SMS_MESSAGE_UNITS = 135;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_SYSTEM_SMS_MESSAGE_UNITS(135),
  /**
   * <pre>
   * compliance config types
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY = 200;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY(200),
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED = 201;</code>
   */
  RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED(201),
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
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_SEATS = 2;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_SEATS_VALUE = 2;
  /**
   * <pre>
   * omni config types
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT = 100;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_VALUE = 100;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE = 101;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE_VALUE = 101;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_SIZE = 102;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_SIZE_VALUE = 102;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS = 103;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_VALUE = 103;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_MESSAGE = 104;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_MESSAGE_VALUE = 104;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE = 105;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE_VALUE = 105;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS = 106;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_VALUE = 106;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_POLL = 107;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_POLL_VALUE = 107;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT = 108;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_VALUE = 108;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE = 109;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE_VALUE = 109;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_SIZE = 110;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_SIZE_VALUE = 110;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS = 111;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_VALUE = 111;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT = 112;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_VALUE = 112;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE = 113;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE_VALUE = 113;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE = 114;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE_VALUE = 114;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS = 115;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_VALUE = 115;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE = 116;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE_VALUE = 116;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_SIZE = 117;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_SIZE_VALUE = 117;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE = 118;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE_VALUE = 118;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_CREATED = 119;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_CREATED_VALUE = 119;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE = 120;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE_VALUE = 120;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_SIZE = 121;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_SIZE_VALUE = 121;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE = 122;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE_VALUE = 122;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_SIZE = 123;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_SIZE_VALUE = 123;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS = 124;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS_VALUE = 124;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_EMAIL_MESSAGE_UNITS = 125;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_EMAIL_MESSAGE_UNITS_VALUE = 125;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS = 126;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS_VALUE = 126;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT_MESSAGE_UNITS = 127;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT_MESSAGE_UNITS_VALUE = 127;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS = 128;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS_VALUE = 128;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_MANAGER_SMS_MESSAGE_UNITS = 129;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_MANAGER_SMS_MESSAGE_UNITS_VALUE = 129;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS = 130;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS_VALUE = 130;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_EMAIL_MESSAGE_UNITS = 131;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_EMAIL_MESSAGE_UNITS_VALUE = 131;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNITS = 132;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNITS_VALUE = 132;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_CHAT_MESSAGE_UNITS = 133;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_SYSTEM_CHAT_MESSAGE_UNITS_VALUE = 133;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNITS = 134;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNITS_VALUE = 134;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_SYSTEM_SMS_MESSAGE_UNITS = 135;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_SYSTEM_SMS_MESSAGE_UNITS_VALUE = 135;
  /**
   * <pre>
   * compliance config types
   * </pre>
   *
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY = 200;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_VALUE = 200;
  /**
   * <code>RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED = 201;</code>
   */
  public static final int RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED_VALUE = 201;


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
      case 2: return RATE_DEFINITION_CONFIG_TYPE_AGENT_SEATS;
      case 100: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT;
      case 101: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_MESSAGE;
      case 102: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_EMAIL_SIZE;
      case 103: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS;
      case 104: return RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_MESSAGE;
      case 105: return RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_EMAIL_SIZE;
      case 106: return RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS;
      case 107: return RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_POLL;
      case 108: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT;
      case 109: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_MESSAGE;
      case 110: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_EMAIL_SIZE;
      case 111: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS;
      case 112: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT;
      case 113: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_MESSAGE;
      case 114: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_EMAIL_SIZE;
      case 115: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS;
      case 116: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_CHAT_SIZE;
      case 117: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_CHAT_SIZE;
      case 118: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_CHAT_SIZE;
      case 119: return RATE_DEFINITION_CONFIG_TYPE_CONNECTED_INBOX_CREATED;
      case 120: return RATE_DEFINITION_CONFIG_TYPE_AGENT_TEXT_MESSAGE_SMS_SIZE;
      case 121: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_TEXT_MESSAGE_SMS_SIZE;
      case 122: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_TEXT_MESSAGE_SMS_SIZE;
      case 123: return RATE_DEFINITION_CONFIG_TYPE_TASK_MESSAGE_SENT_SMS_SIZE;
      case 124: return RATE_DEFINITION_CONFIG_TYPE_AGENT_CHAT_MESSAGE_UNITS;
      case 125: return RATE_DEFINITION_CONFIG_TYPE_AGENT_EMAIL_MESSAGE_UNITS;
      case 126: return RATE_DEFINITION_CONFIG_TYPE_AGENT_SMS_MESSAGE_UNITS;
      case 127: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_CHAT_MESSAGE_UNITS;
      case 128: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_EMAIL_MESSAGE_UNITS;
      case 129: return RATE_DEFINITION_CONFIG_TYPE_MANAGER_SMS_MESSAGE_UNITS;
      case 130: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_CHAT_MESSAGE_UNITS;
      case 131: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_EMAIL_MESSAGE_UNITS;
      case 132: return RATE_DEFINITION_CONFIG_TYPE_CUSTOMER_SMS_MESSAGE_UNITS;
      case 133: return RATE_DEFINITION_CONFIG_TYPE_SYSTEM_CHAT_MESSAGE_UNITS;
      case 134: return RATE_DEFINITION_CONFIG_TYPE_SYSTEM_EMAIL_MESSAGE_UNITS;
      case 135: return RATE_DEFINITION_CONFIG_TYPE_SYSTEM_SMS_MESSAGE_UNITS;
      case 200: return RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY;
      case 201: return RATE_DEFINITION_CONFIG_TYPE_COMPLIANCE_RND_QUERY_CACHED;
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
    return com.tcn.cloud.api.services.billing.entities.v1alpha1.ConfigProto.getDescriptor().getEnumTypes().get(0);
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

  // @@protoc_insertion_point(enum_scope:services.billing.entities.v1alpha1.RateDefinitionConfigType)
}

