// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * SmsNumberProvider
 * </pre>
 *
 * Protobuf enum {@code api.commons.SmsNumberProvider}
 */
public enum SmsNumberProvider
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown provider
   * </pre>
   *
   * <code>UNKNOWN_PROVIDER = 0;</code>
   */
  UNKNOWN_PROVIDER(0),
  /**
   * <pre>
   * BandwidthProvder
   * </pre>
   *
   * <code>BANDWIDTH_PROVIDER = 1;</code>
   */
  BANDWIDTH_PROVIDER(1),
  /**
   * <pre>
   * BurstSMSProvider
   * </pre>
   *
   * <code>BURST_SMS_PROVIDER = 2;</code>
   */
  BURST_SMS_PROVIDER(2),
  /**
   * <pre>
   * PlivoProvider
   * </pre>
   *
   * <code>PLIVO_PROVIDER = 3;</code>
   */
  PLIVO_PROVIDER(3),
  /**
   * <pre>
   * ApeironProvider
   * </pre>
   *
   * <code>APEIRON_PROVIDER = 4;</code>
   */
  APEIRON_PROVIDER(4),
  /**
   * <pre>
   * AusburstSMSProvider
   * </pre>
   *
   * <code>AUSBURST_SMS_PROVIDER = 5;</code>
   */
  AUSBURST_SMS_PROVIDER(5),
  /**
   * <pre>
   * MediaSat sms provider
   * </pre>
   *
   * <code>MEDIASAT_SMS_PROVIDER = 6;</code>
   */
  MEDIASAT_SMS_PROVIDER(6),
  /**
   * <pre>
   * TextLocal sms provider
   * </pre>
   *
   * <code>TEXTLOCAL_SMS_PROVIDER = 7;</code>
   */
  TEXTLOCAL_SMS_PROVIDER(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown provider
   * </pre>
   *
   * <code>UNKNOWN_PROVIDER = 0;</code>
   */
  public static final int UNKNOWN_PROVIDER_VALUE = 0;
  /**
   * <pre>
   * BandwidthProvder
   * </pre>
   *
   * <code>BANDWIDTH_PROVIDER = 1;</code>
   */
  public static final int BANDWIDTH_PROVIDER_VALUE = 1;
  /**
   * <pre>
   * BurstSMSProvider
   * </pre>
   *
   * <code>BURST_SMS_PROVIDER = 2;</code>
   */
  public static final int BURST_SMS_PROVIDER_VALUE = 2;
  /**
   * <pre>
   * PlivoProvider
   * </pre>
   *
   * <code>PLIVO_PROVIDER = 3;</code>
   */
  public static final int PLIVO_PROVIDER_VALUE = 3;
  /**
   * <pre>
   * ApeironProvider
   * </pre>
   *
   * <code>APEIRON_PROVIDER = 4;</code>
   */
  public static final int APEIRON_PROVIDER_VALUE = 4;
  /**
   * <pre>
   * AusburstSMSProvider
   * </pre>
   *
   * <code>AUSBURST_SMS_PROVIDER = 5;</code>
   */
  public static final int AUSBURST_SMS_PROVIDER_VALUE = 5;
  /**
   * <pre>
   * MediaSat sms provider
   * </pre>
   *
   * <code>MEDIASAT_SMS_PROVIDER = 6;</code>
   */
  public static final int MEDIASAT_SMS_PROVIDER_VALUE = 6;
  /**
   * <pre>
   * TextLocal sms provider
   * </pre>
   *
   * <code>TEXTLOCAL_SMS_PROVIDER = 7;</code>
   */
  public static final int TEXTLOCAL_SMS_PROVIDER_VALUE = 7;


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
  public static SmsNumberProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SmsNumberProvider forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_PROVIDER;
      case 1: return BANDWIDTH_PROVIDER;
      case 2: return BURST_SMS_PROVIDER;
      case 3: return PLIVO_PROVIDER;
      case 4: return APEIRON_PROVIDER;
      case 5: return AUSBURST_SMS_PROVIDER;
      case 6: return MEDIASAT_SMS_PROVIDER;
      case 7: return TEXTLOCAL_SMS_PROVIDER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SmsNumberProvider>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SmsNumberProvider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SmsNumberProvider>() {
          public SmsNumberProvider findValueByNumber(int number) {
            return SmsNumberProvider.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final SmsNumberProvider[] VALUES = values();

  public static SmsNumberProvider valueOf(
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

  private SmsNumberProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.SmsNumberProvider)
}

