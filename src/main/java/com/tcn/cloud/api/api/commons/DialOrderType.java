// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.DialOrderType}
 */
public enum DialOrderType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DIAL_ORDER_TYPE_FIRST = 0;</code>
   */
  DIAL_ORDER_TYPE_FIRST(0),
  /**
   * <code>DIAL_ORDER_TYPE_NATURAL = 1;</code>
   */
  DIAL_ORDER_TYPE_NATURAL(1),
  /**
   * <code>DIAL_ORDER_TYPE_CUSTOM = 2;</code>
   */
  DIAL_ORDER_TYPE_CUSTOM(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DIAL_ORDER_TYPE_FIRST = 0;</code>
   */
  public static final int DIAL_ORDER_TYPE_FIRST_VALUE = 0;
  /**
   * <code>DIAL_ORDER_TYPE_NATURAL = 1;</code>
   */
  public static final int DIAL_ORDER_TYPE_NATURAL_VALUE = 1;
  /**
   * <code>DIAL_ORDER_TYPE_CUSTOM = 2;</code>
   */
  public static final int DIAL_ORDER_TYPE_CUSTOM_VALUE = 2;


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
  public static DialOrderType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DialOrderType forNumber(int value) {
    switch (value) {
      case 0: return DIAL_ORDER_TYPE_FIRST;
      case 1: return DIAL_ORDER_TYPE_NATURAL;
      case 2: return DIAL_ORDER_TYPE_CUSTOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DialOrderType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DialOrderType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DialOrderType>() {
          public DialOrderType findValueByNumber(int number) {
            return DialOrderType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(13);
  }

  private static final DialOrderType[] VALUES = values();

  public static DialOrderType valueOf(
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

  private DialOrderType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DialOrderType)
}

