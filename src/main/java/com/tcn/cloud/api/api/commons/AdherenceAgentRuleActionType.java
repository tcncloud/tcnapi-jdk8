// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Types of agent rule actions.
 * </pre>
 *
 * Protobuf enum {@code api.commons.AdherenceAgentRuleActionType}
 */
public enum AdherenceAgentRuleActionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Action type for the agent state of wrap up.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_WRAP_UP = 0;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_WRAP_UP(0),
  /**
   * <pre>
   * Action type for the agent state of waiting.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_WAITING = 1;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_WAITING(1),
  /**
   * <pre>
   * Action type for the agent state of manual dial.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_MANUAL_DIAL = 2;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_MANUAL_DIAL(2),
  /**
   * <pre>
   * Action type for the agent state of preview dial.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_PREVIEW_DIAL = 3;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_PREVIEW_DIAL(3),
  /**
   * <pre>
   * Action type for answering calls.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ANSWER_CALLS = 4;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_ANSWER_CALLS(4),
  /**
   * <pre>
   * Action type for the agent state of on call.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_CALL = 5;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_CALL(5),
  /**
   * <pre>
   * Action type for the agent state of on hold.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_HOLD = 6;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_HOLD(6),
  /**
   * <pre>
   * Action type for the agent state of start of shift.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START = 7;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START(7),
  /**
   * <pre>
   * Action type for starting a shift late.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_LATE = 8;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_LATE(8),
  /**
   * <pre>
   * Action type for ending a shift early.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_END_EARLY = 9;</code>
   */
  ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_END_EARLY(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Action type for the agent state of wrap up.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_WRAP_UP = 0;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_WRAP_UP_VALUE = 0;
  /**
   * <pre>
   * Action type for the agent state of waiting.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_WAITING = 1;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_WAITING_VALUE = 1;
  /**
   * <pre>
   * Action type for the agent state of manual dial.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_MANUAL_DIAL = 2;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_MANUAL_DIAL_VALUE = 2;
  /**
   * <pre>
   * Action type for the agent state of preview dial.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_PREVIEW_DIAL = 3;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_PREVIEW_DIAL_VALUE = 3;
  /**
   * <pre>
   * Action type for answering calls.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ANSWER_CALLS = 4;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_ANSWER_CALLS_VALUE = 4;
  /**
   * <pre>
   * Action type for the agent state of on call.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_CALL = 5;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_CALL_VALUE = 5;
  /**
   * <pre>
   * Action type for the agent state of on hold.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_HOLD = 6;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_HOLD_VALUE = 6;
  /**
   * <pre>
   * Action type for the agent state of start of shift.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START = 7;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_VALUE = 7;
  /**
   * <pre>
   * Action type for starting a shift late.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_LATE = 8;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_LATE_VALUE = 8;
  /**
   * <pre>
   * Action type for ending a shift early.
   * </pre>
   *
   * <code>ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_END_EARLY = 9;</code>
   */
  public static final int ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_END_EARLY_VALUE = 9;


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
  public static AdherenceAgentRuleActionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdherenceAgentRuleActionType forNumber(int value) {
    switch (value) {
      case 0: return ADHERENCE_AGENT_RULE_ACTION_TYPE_WRAP_UP;
      case 1: return ADHERENCE_AGENT_RULE_ACTION_TYPE_WAITING;
      case 2: return ADHERENCE_AGENT_RULE_ACTION_TYPE_MANUAL_DIAL;
      case 3: return ADHERENCE_AGENT_RULE_ACTION_TYPE_PREVIEW_DIAL;
      case 4: return ADHERENCE_AGENT_RULE_ACTION_TYPE_ANSWER_CALLS;
      case 5: return ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_CALL;
      case 6: return ADHERENCE_AGENT_RULE_ACTION_TYPE_ON_HOLD;
      case 7: return ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START;
      case 8: return ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_START_LATE;
      case 9: return ADHERENCE_AGENT_RULE_ACTION_TYPE_SHIFT_END_EARLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdherenceAgentRuleActionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdherenceAgentRuleActionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdherenceAgentRuleActionType>() {
          public AdherenceAgentRuleActionType findValueByNumber(int number) {
            return AdherenceAgentRuleActionType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(30);
  }

  private static final AdherenceAgentRuleActionType[] VALUES = values();

  public static AdherenceAgentRuleActionType valueOf(
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

  private AdherenceAgentRuleActionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AdherenceAgentRuleActionType)
}

