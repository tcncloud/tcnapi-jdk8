// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.TimeScale}
 */
public enum TimeScale
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TIME_SCALE_MINUTE = 0;</code>
   */
  TIME_SCALE_MINUTE(0),
  /**
   * <code>TIME_SCALE_HOUR = 1;</code>
   */
  TIME_SCALE_HOUR(1),
  /**
   * <code>TIME_SCALE_DAY = 2;</code>
   */
  TIME_SCALE_DAY(2),
  /**
   * <code>TIME_SCALE_WEEK = 3;</code>
   */
  TIME_SCALE_WEEK(3),
  /**
   * <code>TIME_SCALE_MONTH = 4;</code>
   */
  TIME_SCALE_MONTH(4),
  /**
   * <code>TIME_SCALE_YEAR = 5;</code>
   */
  TIME_SCALE_YEAR(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TIME_SCALE_MINUTE = 0;</code>
   */
  public static final int TIME_SCALE_MINUTE_VALUE = 0;
  /**
   * <code>TIME_SCALE_HOUR = 1;</code>
   */
  public static final int TIME_SCALE_HOUR_VALUE = 1;
  /**
   * <code>TIME_SCALE_DAY = 2;</code>
   */
  public static final int TIME_SCALE_DAY_VALUE = 2;
  /**
   * <code>TIME_SCALE_WEEK = 3;</code>
   */
  public static final int TIME_SCALE_WEEK_VALUE = 3;
  /**
   * <code>TIME_SCALE_MONTH = 4;</code>
   */
  public static final int TIME_SCALE_MONTH_VALUE = 4;
  /**
   * <code>TIME_SCALE_YEAR = 5;</code>
   */
  public static final int TIME_SCALE_YEAR_VALUE = 5;


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
  public static TimeScale valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TimeScale forNumber(int value) {
    switch (value) {
      case 0: return TIME_SCALE_MINUTE;
      case 1: return TIME_SCALE_HOUR;
      case 2: return TIME_SCALE_DAY;
      case 3: return TIME_SCALE_WEEK;
      case 4: return TIME_SCALE_MONTH;
      case 5: return TIME_SCALE_YEAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TimeScale>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TimeScale> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TimeScale>() {
          public TimeScale findValueByNumber(int number) {
            return TimeScale.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.TicketsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TimeScale[] VALUES = values();

  public static TimeScale valueOf(
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

  private TimeScale(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.TimeScale)
}

