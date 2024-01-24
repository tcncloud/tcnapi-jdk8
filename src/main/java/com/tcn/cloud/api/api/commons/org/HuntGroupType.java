// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * HuntGroupType represents the type of a hunt group.
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.HuntGroupType}
 */
public enum HuntGroupType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid; equivalent to unconnected.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_UNSPECIFIED = 0;</code>
   */
  HUNT_GROUP_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Connected hunt group.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_CONNECTED = 1;</code>
   */
  HUNT_GROUP_TYPE_CONNECTED(1),
  /**
   * <pre>
   * Softphone hunt group.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_SOFTPHONE = 2;</code>
   */
  HUNT_GROUP_TYPE_SOFTPHONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid; equivalent to unconnected.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int HUNT_GROUP_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Connected hunt group.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_CONNECTED = 1;</code>
   */
  public static final int HUNT_GROUP_TYPE_CONNECTED_VALUE = 1;
  /**
   * <pre>
   * Softphone hunt group.
   * </pre>
   *
   * <code>HUNT_GROUP_TYPE_SOFTPHONE = 2;</code>
   */
  public static final int HUNT_GROUP_TYPE_SOFTPHONE_VALUE = 2;


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
  public static HuntGroupType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HuntGroupType forNumber(int value) {
    switch (value) {
      case 0: return HUNT_GROUP_TYPE_UNSPECIFIED;
      case 1: return HUNT_GROUP_TYPE_CONNECTED;
      case 2: return HUNT_GROUP_TYPE_SOFTPHONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HuntGroupType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HuntGroupType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HuntGroupType>() {
          public HuntGroupType findValueByNumber(int number) {
            return HuntGroupType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HuntGroupType[] VALUES = values();

  public static HuntGroupType valueOf(
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

  private HuntGroupType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.HuntGroupType)
}
