// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

/**
 * <pre>
 * MatchingRule represents a rule for matching an event to a
 * rate definition.
 * </pre>
 *
 * Protobuf enum {@code services.billing.entities.v1alpha1.MatchingRule}
 */
public enum MatchingRule
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MATCHING_RULE_UNSPECIFIED = 0;</code>
   */
  MATCHING_RULE_UNSPECIFIED(0),
  /**
   * <code>MATCHING_RULE_AREA_CODE = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  MATCHING_RULE_AREA_CODE(1),
  /**
   * <code>MATCHING_RULE_COUNTRY_PREFIX = 2;</code>
   */
  MATCHING_RULE_COUNTRY_PREFIX(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MATCHING_RULE_UNSPECIFIED = 0;</code>
   */
  public static final int MATCHING_RULE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>MATCHING_RULE_AREA_CODE = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int MATCHING_RULE_AREA_CODE_VALUE = 1;
  /**
   * <code>MATCHING_RULE_COUNTRY_PREFIX = 2;</code>
   */
  public static final int MATCHING_RULE_COUNTRY_PREFIX_VALUE = 2;


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
  public static MatchingRule valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MatchingRule forNumber(int value) {
    switch (value) {
      case 0: return MATCHING_RULE_UNSPECIFIED;
      case 1: return MATCHING_RULE_AREA_CODE;
      case 2: return MATCHING_RULE_COUNTRY_PREFIX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MatchingRule>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MatchingRule> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MatchingRule>() {
          public MatchingRule findValueByNumber(int number) {
            return MatchingRule.forNumber(number);
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
    return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MatchingRule[] VALUES = values();

  public static MatchingRule valueOf(
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

  private MatchingRule(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.billing.entities.v1alpha1.MatchingRule)
}

