// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Conditions compared when evaluating adherence rules.
 * </pre>
 *
 * Protobuf enum {@code api.commons.AdherenceRuleCondition}
 */
public enum AdherenceRuleCondition
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Left operand is greater than right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_GREATER_THAN = 0;</code>
   */
  ADHERENCE_RULE_CONDITION_GREATER_THAN(0),
  /**
   * <pre>
   * Left operand is greater than or equal to right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_GREATER_THAN_EQUAL = 1;</code>
   */
  ADHERENCE_RULE_CONDITION_GREATER_THAN_EQUAL(1),
  /**
   * <pre>
   * Left operand is less than right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_LESS_THAN = 2;</code>
   */
  ADHERENCE_RULE_CONDITION_LESS_THAN(2),
  /**
   * <pre>
   * Left operand is less than or equal to right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_LESS_THAN_EQUAL = 3;</code>
   */
  ADHERENCE_RULE_CONDITION_LESS_THAN_EQUAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Left operand is greater than right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_GREATER_THAN = 0;</code>
   */
  public static final int ADHERENCE_RULE_CONDITION_GREATER_THAN_VALUE = 0;
  /**
   * <pre>
   * Left operand is greater than or equal to right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_GREATER_THAN_EQUAL = 1;</code>
   */
  public static final int ADHERENCE_RULE_CONDITION_GREATER_THAN_EQUAL_VALUE = 1;
  /**
   * <pre>
   * Left operand is less than right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_LESS_THAN = 2;</code>
   */
  public static final int ADHERENCE_RULE_CONDITION_LESS_THAN_VALUE = 2;
  /**
   * <pre>
   * Left operand is less than or equal to right.
   * </pre>
   *
   * <code>ADHERENCE_RULE_CONDITION_LESS_THAN_EQUAL = 3;</code>
   */
  public static final int ADHERENCE_RULE_CONDITION_LESS_THAN_EQUAL_VALUE = 3;


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
  public static AdherenceRuleCondition valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdherenceRuleCondition forNumber(int value) {
    switch (value) {
      case 0: return ADHERENCE_RULE_CONDITION_GREATER_THAN;
      case 1: return ADHERENCE_RULE_CONDITION_GREATER_THAN_EQUAL;
      case 2: return ADHERENCE_RULE_CONDITION_LESS_THAN;
      case 3: return ADHERENCE_RULE_CONDITION_LESS_THAN_EQUAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdherenceRuleCondition>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdherenceRuleCondition> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdherenceRuleCondition>() {
          public AdherenceRuleCondition findValueByNumber(int number) {
            return AdherenceRuleCondition.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(28);
  }

  private static final AdherenceRuleCondition[] VALUES = values();

  public static AdherenceRuleCondition valueOf(
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

  private AdherenceRuleCondition(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AdherenceRuleCondition)
}

