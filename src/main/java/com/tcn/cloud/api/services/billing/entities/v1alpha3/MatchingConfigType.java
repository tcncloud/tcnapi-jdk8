// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

/**
 * Protobuf enum {@code services.billing.entities.v1alpha3.MatchingConfigType}
 */
public enum MatchingConfigType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MATCHING_CONFIG_TYPE_UNSPECIFIED = 0;</code>
   */
  MATCHING_CONFIG_TYPE_UNSPECIFIED(0),
  /**
   * <code>MATCHING_CONFIG_TYPE_COUNTRY_PREFIX = 1;</code>
   */
  MATCHING_CONFIG_TYPE_COUNTRY_PREFIX(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MATCHING_CONFIG_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MATCHING_CONFIG_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MATCHING_CONFIG_TYPE_COUNTRY_PREFIX = 1;</code>
   */
  public static final int MATCHING_CONFIG_TYPE_COUNTRY_PREFIX_VALUE = 1;


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
  public static MatchingConfigType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchingConfigType forNumber(int value) {
    switch (value) {
      case 0: return MATCHING_CONFIG_TYPE_UNSPECIFIED;
      case 1: return MATCHING_CONFIG_TYPE_COUNTRY_PREFIX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchingConfigType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MatchingConfigType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchingConfigType>() {
          public MatchingConfigType findValueByNumber(int number) {
            return MatchingConfigType.forNumber(number);
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
    return com.tcn.cloud.api.services.billing.entities.v1alpha3.MatchingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MatchingConfigType[] VALUES = values();

  public static MatchingConfigType valueOf(
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

  private MatchingConfigType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.billing.entities.v1alpha3.MatchingConfigType)
}

