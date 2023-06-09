// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * SmsNumbertype
 * </pre>
 *
 * Protobuf enum {@code api.commons.SmsNumberType}
 */
public enum SmsNumberType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * SmsShortCodeType
   * </pre>
   *
   * <code>SMS_SHORT_CODE_TYPE = 0;</code>
   */
  SMS_SHORT_CODE_TYPE(0),
  /**
   * <pre>
   * SmsAlphanumericType
   * </pre>
   *
   * <code>SMS_ALPHANUMERIC_TYPE = 1;</code>
   */
  SMS_ALPHANUMERIC_TYPE(1),
  /**
   * <pre>
   * SmsNumberType
   * </pre>
   *
   * <code>SMS_NUMBER_TYPE = 2;</code>
   */
  SMS_NUMBER_TYPE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * SmsShortCodeType
   * </pre>
   *
   * <code>SMS_SHORT_CODE_TYPE = 0;</code>
   */
  public static final int SMS_SHORT_CODE_TYPE_VALUE = 0;
  /**
   * <pre>
   * SmsAlphanumericType
   * </pre>
   *
   * <code>SMS_ALPHANUMERIC_TYPE = 1;</code>
   */
  public static final int SMS_ALPHANUMERIC_TYPE_VALUE = 1;
  /**
   * <pre>
   * SmsNumberType
   * </pre>
   *
   * <code>SMS_NUMBER_TYPE = 2;</code>
   */
  public static final int SMS_NUMBER_TYPE_VALUE = 2;


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
  public static SmsNumberType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SmsNumberType forNumber(int value) {
    switch (value) {
      case 0: return SMS_SHORT_CODE_TYPE;
      case 1: return SMS_ALPHANUMERIC_TYPE;
      case 2: return SMS_NUMBER_TYPE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SmsNumberType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SmsNumberType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SmsNumberType>() {
          public SmsNumberType findValueByNumber(int number) {
            return SmsNumberType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SmsNumberType[] VALUES = values();

  public static SmsNumberType valueOf(
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

  private SmsNumberType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.SmsNumberType)
}

