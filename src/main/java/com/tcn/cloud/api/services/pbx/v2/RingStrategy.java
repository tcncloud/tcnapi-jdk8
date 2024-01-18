// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

/**
 * <pre>
 * -------------------------
 * Enums
 * -------------------------
 * </pre>
 *
 * Protobuf enum {@code services.pbx.v2.RingStrategy}
 */
public enum RingStrategy
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RING_STRATEGY_UNSPECIFIED = 0;</code>
   */
  RING_STRATEGY_UNSPECIFIED(0),
  /**
   * <code>RING_STRATEGY_RING_ALL = 1;</code>
   */
  RING_STRATEGY_RING_ALL(1),
  /**
   * <code>RING_STRATEGY_ROUND_ROBIN = 2;</code>
   */
  RING_STRATEGY_ROUND_ROBIN(2),
  /**
   * <code>RING_STRATEGY_RANDOM = 3;</code>
   */
  RING_STRATEGY_RANDOM(3),
  /**
   * <code>RING_STRATEGY_ORDERED = 4;</code>
   */
  RING_STRATEGY_ORDERED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RING_STRATEGY_UNSPECIFIED = 0;</code>
   */
  public static final int RING_STRATEGY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RING_STRATEGY_RING_ALL = 1;</code>
   */
  public static final int RING_STRATEGY_RING_ALL_VALUE = 1;
  /**
   * <code>RING_STRATEGY_ROUND_ROBIN = 2;</code>
   */
  public static final int RING_STRATEGY_ROUND_ROBIN_VALUE = 2;
  /**
   * <code>RING_STRATEGY_RANDOM = 3;</code>
   */
  public static final int RING_STRATEGY_RANDOM_VALUE = 3;
  /**
   * <code>RING_STRATEGY_ORDERED = 4;</code>
   */
  public static final int RING_STRATEGY_ORDERED_VALUE = 4;


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
  public static RingStrategy valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RingStrategy forNumber(int value) {
    switch (value) {
      case 0: return RING_STRATEGY_UNSPECIFIED;
      case 1: return RING_STRATEGY_RING_ALL;
      case 2: return RING_STRATEGY_ROUND_ROBIN;
      case 3: return RING_STRATEGY_RANDOM;
      case 4: return RING_STRATEGY_ORDERED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RingStrategy>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RingStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RingStrategy>() {
          public RingStrategy findValueByNumber(int number) {
            return RingStrategy.forNumber(number);
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
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RingStrategy[] VALUES = values();

  public static RingStrategy valueOf(
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

  private RingStrategy(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.pbx.v2.RingStrategy)
}

