// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Used with a format string, and string date value to get a matrix/lms/DateTime
 * proto
 * </pre>
 *
 * Protobuf enum {@code api.commons.DateTimePrecision}
 */
public enum DateTimePrecision
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DATETIME_PRECISION_NOW = 0;</code>
   */
  DATETIME_PRECISION_NOW(0),
  /**
   * <code>DATETIME_PRECISION_TIMESTAMP = 1;</code>
   */
  DATETIME_PRECISION_TIMESTAMP(1),
  /**
   * <code>DATETIME_PRECISION_DATE = 2;</code>
   */
  DATETIME_PRECISION_DATE(2),
  /**
   * <code>DATETIME_PRECISION_MONTH_AND_DAY = 3;</code>
   */
  DATETIME_PRECISION_MONTH_AND_DAY(3),
  /**
   * <code>DATETIME_PRECISION_TIME_OF_DAY = 4;</code>
   */
  DATETIME_PRECISION_TIME_OF_DAY(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DATETIME_PRECISION_NOW = 0;</code>
   */
  public static final int DATETIME_PRECISION_NOW_VALUE = 0;
  /**
   * <code>DATETIME_PRECISION_TIMESTAMP = 1;</code>
   */
  public static final int DATETIME_PRECISION_TIMESTAMP_VALUE = 1;
  /**
   * <code>DATETIME_PRECISION_DATE = 2;</code>
   */
  public static final int DATETIME_PRECISION_DATE_VALUE = 2;
  /**
   * <code>DATETIME_PRECISION_MONTH_AND_DAY = 3;</code>
   */
  public static final int DATETIME_PRECISION_MONTH_AND_DAY_VALUE = 3;
  /**
   * <code>DATETIME_PRECISION_TIME_OF_DAY = 4;</code>
   */
  public static final int DATETIME_PRECISION_TIME_OF_DAY_VALUE = 4;


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
  public static DateTimePrecision valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DateTimePrecision forNumber(int value) {
    switch (value) {
      case 0: return DATETIME_PRECISION_NOW;
      case 1: return DATETIME_PRECISION_TIMESTAMP;
      case 2: return DATETIME_PRECISION_DATE;
      case 3: return DATETIME_PRECISION_MONTH_AND_DAY;
      case 4: return DATETIME_PRECISION_TIME_OF_DAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DateTimePrecision>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DateTimePrecision> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DateTimePrecision>() {
          public DateTimePrecision findValueByNumber(int number) {
            return DateTimePrecision.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(23);
  }

  private static final DateTimePrecision[] VALUES = values();

  public static DateTimePrecision valueOf(
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

  private DateTimePrecision(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DateTimePrecision)
}

