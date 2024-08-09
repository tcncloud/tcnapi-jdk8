// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Units supported in adherence rule condition evaluations.
 * </pre>
 *
 * Protobuf enum {@code api.commons.AdherenceRuleUnit}
 */
public enum AdherenceRuleUnit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Represents number of seconds.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_SECONDS = 0;</code>
   */
  ADHERENCE_RULE_UNIT_SECONDS(0),
  /**
   * <pre>
   * Represents number of minutes.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_MINUTES = 1;</code>
   */
  ADHERENCE_RULE_UNIT_MINUTES(1),
  /**
   * <pre>
   * Represents number of calls.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_CALLS = 2;</code>
   */
  ADHERENCE_RULE_UNIT_CALLS(2),
  /**
   * <pre>
   * Represents a percentage.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_PERCENTAGE = 3;</code>
   */
  ADHERENCE_RULE_UNIT_PERCENTAGE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Represents number of seconds.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_SECONDS = 0;</code>
   */
  public static final int ADHERENCE_RULE_UNIT_SECONDS_VALUE = 0;
  /**
   * <pre>
   * Represents number of minutes.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_MINUTES = 1;</code>
   */
  public static final int ADHERENCE_RULE_UNIT_MINUTES_VALUE = 1;
  /**
   * <pre>
   * Represents number of calls.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_CALLS = 2;</code>
   */
  public static final int ADHERENCE_RULE_UNIT_CALLS_VALUE = 2;
  /**
   * <pre>
   * Represents a percentage.
   * </pre>
   *
   * <code>ADHERENCE_RULE_UNIT_PERCENTAGE = 3;</code>
   */
  public static final int ADHERENCE_RULE_UNIT_PERCENTAGE_VALUE = 3;


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
  public static AdherenceRuleUnit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdherenceRuleUnit forNumber(int value) {
    switch (value) {
      case 0: return ADHERENCE_RULE_UNIT_SECONDS;
      case 1: return ADHERENCE_RULE_UNIT_MINUTES;
      case 2: return ADHERENCE_RULE_UNIT_CALLS;
      case 3: return ADHERENCE_RULE_UNIT_PERCENTAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdherenceRuleUnit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdherenceRuleUnit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdherenceRuleUnit>() {
          public AdherenceRuleUnit findValueByNumber(int number) {
            return AdherenceRuleUnit.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(27);
  }

  private static final AdherenceRuleUnit[] VALUES = values();

  public static AdherenceRuleUnit valueOf(
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

  private AdherenceRuleUnit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AdherenceRuleUnit)
}

