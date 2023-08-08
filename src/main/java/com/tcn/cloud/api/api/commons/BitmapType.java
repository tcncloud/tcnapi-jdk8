// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum representing the options for bitmap creation.
 * </pre>
 *
 * Protobuf enum {@code api.commons.BitmapType}
 */
public enum BitmapType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The complete bitmap type. Bitmaps will be generated using all relevant pattern data.
   * </pre>
   *
   * <code>COMPLETE = 0;</code>
   */
  COMPLETE(0),
  /**
   * <pre>
   * The bitmaps will be created using only the weekmaps from the patterns.
   * </pre>
   *
   * <code>ONLY_WEEKMAPS = 1;</code>
   */
  ONLY_WEEKMAPS(1),
  /**
   * <pre>
   * The bitmaps will be created using only the calendar items from the patterns.
   * </pre>
   *
   * <code>ONLY_CALENDAR_ITEMS = 2;</code>
   */
  ONLY_CALENDAR_ITEMS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The complete bitmap type. Bitmaps will be generated using all relevant pattern data.
   * </pre>
   *
   * <code>COMPLETE = 0;</code>
   */
  public static final int COMPLETE_VALUE = 0;
  /**
   * <pre>
   * The bitmaps will be created using only the weekmaps from the patterns.
   * </pre>
   *
   * <code>ONLY_WEEKMAPS = 1;</code>
   */
  public static final int ONLY_WEEKMAPS_VALUE = 1;
  /**
   * <pre>
   * The bitmaps will be created using only the calendar items from the patterns.
   * </pre>
   *
   * <code>ONLY_CALENDAR_ITEMS = 2;</code>
   */
  public static final int ONLY_CALENDAR_ITEMS_VALUE = 2;


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
  public static BitmapType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BitmapType forNumber(int value) {
    switch (value) {
      case 0: return COMPLETE;
      case 1: return ONLY_WEEKMAPS;
      case 2: return ONLY_CALENDAR_ITEMS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BitmapType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BitmapType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BitmapType>() {
          public BitmapType findValueByNumber(int number) {
            return BitmapType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(16);
  }

  private static final BitmapType[] VALUES = values();

  public static BitmapType valueOf(
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

  private BitmapType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.BitmapType)
}

