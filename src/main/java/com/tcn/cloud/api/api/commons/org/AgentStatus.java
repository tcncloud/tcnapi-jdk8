// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * AgentStatus is the status of the agent on which the trigger is based
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.AgentStatus}
 */
public enum AgentStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>AGENT_STATUS_UNSPECIFIED = 0;</code>
   */
  AGENT_STATUS_UNSPECIFIED(0),
  /**
   * <pre>
   * The status for when the agent is logged in
   * </pre>
   *
   * <code>AGENT_STATUS_LOGGED_IN = 1;</code>
   */
  AGENT_STATUS_LOGGED_IN(1),
  /**
   * <pre>
   * The status for when the agent is waiting
   * </pre>
   *
   * <code>AGENT_STATUS_WAITING = 2;</code>
   */
  AGENT_STATUS_WAITING(2),
  /**
   * <pre>
   * The status for when the agent is paused
   * </pre>
   *
   * <code>AGENT_STATUS_PAUSED = 3;</code>
   */
  AGENT_STATUS_PAUSED(3),
  /**
   * <pre>
   * The status for when the agent is on call
   * </pre>
   *
   * <code>AGENT_STATUS_ON_CALL = 4;</code>
   */
  AGENT_STATUS_ON_CALL(4),
  /**
   * <pre>
   * The status for when the agent is on a transfer call
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_CALL = 5;</code>
   */
  AGENT_STATUS_TRANSFER_CALL(5),
  /**
   * <pre>
   * The status for when the agent is on a transfer call and the transfer is lost
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_LOST = 6;</code>
   */
  AGENT_STATUS_TRANSFER_LOST(6),
  /**
   * <pre>
   * The status for when the agent is on a transfer call and the transfer target is lost
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_TARGET_LOST = 7;</code>
   */
  AGENT_STATUS_TRANSFER_TARGET_LOST(7),
  /**
   * <pre>
   * The status for when the agent is on a preview call
   * </pre>
   *
   * <code>AGENT_STATUS_PREVIEW_CALL = 8;</code>
   */
  AGENT_STATUS_PREVIEW_CALL(8),
  /**
   * <pre>
   * The status for when the agent is on a manual dial call
   * </pre>
   *
   * <code>AGENT_STATUS_MANUAL_DIAL_CALL = 9;</code>
   */
  AGENT_STATUS_MANUAL_DIAL_CALL(9),
  /**
   * <pre>
   * The status for when the agent is wrapping up the call
   * </pre>
   *
   * <code>AGENT_STATUS_WRAP_UP = 10;</code>
   */
  AGENT_STATUS_WRAP_UP(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>AGENT_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int AGENT_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The status for when the agent is logged in
   * </pre>
   *
   * <code>AGENT_STATUS_LOGGED_IN = 1;</code>
   */
  public static final int AGENT_STATUS_LOGGED_IN_VALUE = 1;
  /**
   * <pre>
   * The status for when the agent is waiting
   * </pre>
   *
   * <code>AGENT_STATUS_WAITING = 2;</code>
   */
  public static final int AGENT_STATUS_WAITING_VALUE = 2;
  /**
   * <pre>
   * The status for when the agent is paused
   * </pre>
   *
   * <code>AGENT_STATUS_PAUSED = 3;</code>
   */
  public static final int AGENT_STATUS_PAUSED_VALUE = 3;
  /**
   * <pre>
   * The status for when the agent is on call
   * </pre>
   *
   * <code>AGENT_STATUS_ON_CALL = 4;</code>
   */
  public static final int AGENT_STATUS_ON_CALL_VALUE = 4;
  /**
   * <pre>
   * The status for when the agent is on a transfer call
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_CALL = 5;</code>
   */
  public static final int AGENT_STATUS_TRANSFER_CALL_VALUE = 5;
  /**
   * <pre>
   * The status for when the agent is on a transfer call and the transfer is lost
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_LOST = 6;</code>
   */
  public static final int AGENT_STATUS_TRANSFER_LOST_VALUE = 6;
  /**
   * <pre>
   * The status for when the agent is on a transfer call and the transfer target is lost
   * </pre>
   *
   * <code>AGENT_STATUS_TRANSFER_TARGET_LOST = 7;</code>
   */
  public static final int AGENT_STATUS_TRANSFER_TARGET_LOST_VALUE = 7;
  /**
   * <pre>
   * The status for when the agent is on a preview call
   * </pre>
   *
   * <code>AGENT_STATUS_PREVIEW_CALL = 8;</code>
   */
  public static final int AGENT_STATUS_PREVIEW_CALL_VALUE = 8;
  /**
   * <pre>
   * The status for when the agent is on a manual dial call
   * </pre>
   *
   * <code>AGENT_STATUS_MANUAL_DIAL_CALL = 9;</code>
   */
  public static final int AGENT_STATUS_MANUAL_DIAL_CALL_VALUE = 9;
  /**
   * <pre>
   * The status for when the agent is wrapping up the call
   * </pre>
   *
   * <code>AGENT_STATUS_WRAP_UP = 10;</code>
   */
  public static final int AGENT_STATUS_WRAP_UP_VALUE = 10;


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
  public static AgentStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AgentStatus forNumber(int value) {
    switch (value) {
      case 0: return AGENT_STATUS_UNSPECIFIED;
      case 1: return AGENT_STATUS_LOGGED_IN;
      case 2: return AGENT_STATUS_WAITING;
      case 3: return AGENT_STATUS_PAUSED;
      case 4: return AGENT_STATUS_ON_CALL;
      case 5: return AGENT_STATUS_TRANSFER_CALL;
      case 6: return AGENT_STATUS_TRANSFER_LOST;
      case 7: return AGENT_STATUS_TRANSFER_TARGET_LOST;
      case 8: return AGENT_STATUS_PREVIEW_CALL;
      case 9: return AGENT_STATUS_MANUAL_DIAL_CALL;
      case 10: return AGENT_STATUS_WRAP_UP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgentStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgentStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgentStatus>() {
          public AgentStatus findValueByNumber(int number) {
            return AgentStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final AgentStatus[] VALUES = values();

  public static AgentStatus valueOf(
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

  private AgentStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.AgentStatus)
}
