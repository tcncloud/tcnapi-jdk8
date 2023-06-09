// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.CompareType}
 */
public enum CompareType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMPARE_TYPE_STRING = 0;</code>
   */
  COMPARE_TYPE_STRING(0),
  /**
   * <code>COMPARE_TYPE_NUMBER = 1;</code>
   */
  COMPARE_TYPE_NUMBER(1),
  /**
   * <code>COMPARE_TYPE_BOOL = 2;</code>
   */
  COMPARE_TYPE_BOOL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMPARE_TYPE_STRING = 0;</code>
   */
  public static final int COMPARE_TYPE_STRING_VALUE = 0;
  /**
   * <code>COMPARE_TYPE_NUMBER = 1;</code>
   */
  public static final int COMPARE_TYPE_NUMBER_VALUE = 1;
  /**
   * <code>COMPARE_TYPE_BOOL = 2;</code>
   */
  public static final int COMPARE_TYPE_BOOL_VALUE = 2;


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
  public static CompareType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CompareType forNumber(int value) {
    switch (value) {
      case 0: return COMPARE_TYPE_STRING;
      case 1: return COMPARE_TYPE_NUMBER;
      case 2: return COMPARE_TYPE_BOOL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompareType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CompareType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CompareType>() {
          public CompareType findValueByNumber(int number) {
            return CompareType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(16);
  }

  private static final CompareType[] VALUES = values();

  public static CompareType valueOf(
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

  private CompareType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.CompareType)
}

