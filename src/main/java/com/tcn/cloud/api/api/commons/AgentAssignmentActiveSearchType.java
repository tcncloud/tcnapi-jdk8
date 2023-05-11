// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * indicates if we want to pull conversations that are assigned
 * actively, not actively, or both
 * </pre>
 *
 * Protobuf enum {@code api.commons.AgentAssignmentActiveSearchType}
 */
public enum AgentAssignmentActiveSearchType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The conversations that are actively assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ACTIVE = 0;</code>
   */
  AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ACTIVE(0),
  /**
   * <pre>
   * The conversations that are not actively assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_INACTIVE = 1;</code>
   */
  AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_INACTIVE(1),
  /**
   * <pre>
   * All conversations that are assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ALL = 2;</code>
   */
  AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ALL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The conversations that are actively assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ACTIVE = 0;</code>
   */
  public static final int AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ACTIVE_VALUE = 0;
  /**
   * <pre>
   * The conversations that are not actively assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_INACTIVE = 1;</code>
   */
  public static final int AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_INACTIVE_VALUE = 1;
  /**
   * <pre>
   * All conversations that are assigned to the agent
   * </pre>
   *
   * <code>AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ALL = 2;</code>
   */
  public static final int AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ALL_VALUE = 2;


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
  public static AgentAssignmentActiveSearchType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AgentAssignmentActiveSearchType forNumber(int value) {
    switch (value) {
      case 0: return AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ACTIVE;
      case 1: return AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_INACTIVE;
      case 2: return AGENT_ASSIGNMENT_ACTIVE_SEARCH_TYPE_ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgentAssignmentActiveSearchType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgentAssignmentActiveSearchType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgentAssignmentActiveSearchType>() {
          public AgentAssignmentActiveSearchType findValueByNumber(int number) {
            return AgentAssignmentActiveSearchType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final AgentAssignmentActiveSearchType[] VALUES = values();

  public static AgentAssignmentActiveSearchType valueOf(
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

  private AgentAssignmentActiveSearchType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AgentAssignmentActiveSearchType)
}

