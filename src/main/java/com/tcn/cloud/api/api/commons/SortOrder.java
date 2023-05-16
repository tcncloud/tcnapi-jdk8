// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.SortOrder}
 */
public enum SortOrder
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SORT_ORDER_ASCENDING = 0;</code>
   */
  SORT_ORDER_ASCENDING(0),
  /**
   * <code>SORT_ORDER_DESCENDING = 1;</code>
   */
  SORT_ORDER_DESCENDING(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SORT_ORDER_ASCENDING = 0;</code>
   */
  public static final int SORT_ORDER_ASCENDING_VALUE = 0;
  /**
   * <code>SORT_ORDER_DESCENDING = 1;</code>
   */
  public static final int SORT_ORDER_DESCENDING_VALUE = 1;


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
  public static SortOrder valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SortOrder forNumber(int value) {
    switch (value) {
      case 0: return SORT_ORDER_ASCENDING;
      case 1: return SORT_ORDER_DESCENDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SortOrder>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SortOrder> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SortOrder>() {
          public SortOrder findValueByNumber(int number) {
            return SortOrder.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(15);
  }

  private static final SortOrder[] VALUES = values();

  public static SortOrder valueOf(
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

  private SortOrder(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.SortOrder)
}

