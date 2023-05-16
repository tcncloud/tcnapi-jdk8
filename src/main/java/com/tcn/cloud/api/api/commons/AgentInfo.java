// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/manager.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.AgentInfo}
 */
public enum AgentInfo
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGENT_INFO_ACTIVE_AGENTS = 0;</code>
   */
  AGENT_INFO_ACTIVE_AGENTS(0),
  /**
   * <code>AGENT_INFO_IN_CONFERENCE_AGENTS = 1;</code>
   */
  AGENT_INFO_IN_CONFERENCE_AGENTS(1),
  /**
   * <code>AGENT_INFO_MANUAL_AGENTS = 2;</code>
   */
  AGENT_INFO_MANUAL_AGENTS(2),
  /**
   * <code>AGENT_INFO_PAUSED_AGENTS = 3;</code>
   */
  AGENT_INFO_PAUSED_AGENTS(3),
  /**
   * <code>AGENT_INFO_PREVIEW_AGENTS = 4;</code>
   */
  AGENT_INFO_PREVIEW_AGENTS(4),
  /**
   * <code>AGENT_INFO_READY_AGENTS = 5;</code>
   */
  AGENT_INFO_READY_AGENTS(5),
  /**
   * <code>AGENT_INFO_TOTAL_AGENTS = 6;</code>
   */
  AGENT_INFO_TOTAL_AGENTS(6),
  /**
   * <code>AGENT_INFO_TRANSFER_AGENTS = 7;</code>
   */
  AGENT_INFO_TRANSFER_AGENTS(7),
  /**
   * <code>AGENT_INFO_WRAP_UP_AGENTS = 8;</code>
   */
  AGENT_INFO_WRAP_UP_AGENTS(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGENT_INFO_ACTIVE_AGENTS = 0;</code>
   */
  public static final int AGENT_INFO_ACTIVE_AGENTS_VALUE = 0;
  /**
   * <code>AGENT_INFO_IN_CONFERENCE_AGENTS = 1;</code>
   */
  public static final int AGENT_INFO_IN_CONFERENCE_AGENTS_VALUE = 1;
  /**
   * <code>AGENT_INFO_MANUAL_AGENTS = 2;</code>
   */
  public static final int AGENT_INFO_MANUAL_AGENTS_VALUE = 2;
  /**
   * <code>AGENT_INFO_PAUSED_AGENTS = 3;</code>
   */
  public static final int AGENT_INFO_PAUSED_AGENTS_VALUE = 3;
  /**
   * <code>AGENT_INFO_PREVIEW_AGENTS = 4;</code>
   */
  public static final int AGENT_INFO_PREVIEW_AGENTS_VALUE = 4;
  /**
   * <code>AGENT_INFO_READY_AGENTS = 5;</code>
   */
  public static final int AGENT_INFO_READY_AGENTS_VALUE = 5;
  /**
   * <code>AGENT_INFO_TOTAL_AGENTS = 6;</code>
   */
  public static final int AGENT_INFO_TOTAL_AGENTS_VALUE = 6;
  /**
   * <code>AGENT_INFO_TRANSFER_AGENTS = 7;</code>
   */
  public static final int AGENT_INFO_TRANSFER_AGENTS_VALUE = 7;
  /**
   * <code>AGENT_INFO_WRAP_UP_AGENTS = 8;</code>
   */
  public static final int AGENT_INFO_WRAP_UP_AGENTS_VALUE = 8;


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
  public static AgentInfo valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AgentInfo forNumber(int value) {
    switch (value) {
      case 0: return AGENT_INFO_ACTIVE_AGENTS;
      case 1: return AGENT_INFO_IN_CONFERENCE_AGENTS;
      case 2: return AGENT_INFO_MANUAL_AGENTS;
      case 3: return AGENT_INFO_PAUSED_AGENTS;
      case 4: return AGENT_INFO_PREVIEW_AGENTS;
      case 5: return AGENT_INFO_READY_AGENTS;
      case 6: return AGENT_INFO_TOTAL_AGENTS;
      case 7: return AGENT_INFO_TRANSFER_AGENTS;
      case 8: return AGENT_INFO_WRAP_UP_AGENTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgentInfo>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgentInfo> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgentInfo>() {
          public AgentInfo findValueByNumber(int number) {
            return AgentInfo.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ManagerProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AgentInfo[] VALUES = values();

  public static AgentInfo valueOf(
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

  private AgentInfo(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AgentInfo)
}

