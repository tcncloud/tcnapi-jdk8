// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * TriggerAction is the action to take when the trigger is activated
 * DEPRECATED: Use services.org.hunt_groups.v1alpha1.TriggerAction instead
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.TriggerAction}
 */
@java.lang.Deprecated public enum TriggerAction
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>TRIGGER_ACTION_UNSPECIFIED = 0;</code>
   */
  TRIGGER_ACTION_UNSPECIFIED(0),
  /**
   * <pre>
   * The action to advance the agent to a status
   * Used for agent status: all but Logged In and all Transfer statuses
   * </pre>
   *
   * <code>TRIGGER_ACTION_ADVANCE_TO_STATUS = 1;</code>
   */
  TRIGGER_ACTION_ADVANCE_TO_STATUS(1),
  /**
   * <pre>
   * The action to display a message
   * </pre>
   *
   * <code>TRIGGER_ACTION_DISPLAY_MESSAGE = 2;</code>
   */
  TRIGGER_ACTION_DISPLAY_MESSAGE(2),
  /**
   * <pre>
   * The action to eject the agent
   * </pre>
   *
   * <code>TRIGGER_ACTION_EJECT_AGENT = 3;</code>
   */
  TRIGGER_ACTION_EJECT_AGENT(3),
  /**
   * <pre>
   * The action to execute a web link
   * </pre>
   *
   * <code>TRIGGER_ACTION_EXECUTE_WEB_LINK = 4;</code>
   */
  TRIGGER_ACTION_EXECUTE_WEB_LINK(4),
  /**
   * <pre>
   * The action to execute an integration link
   * </pre>
   *
   * <code>TRIGGER_ACTION_EXECUTE_INTEGRATION_LINK = 5;</code>
   */
  TRIGGER_ACTION_EXECUTE_INTEGRATION_LINK(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>TRIGGER_ACTION_UNSPECIFIED = 0;</code>
   */
  public static final int TRIGGER_ACTION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The action to advance the agent to a status
   * Used for agent status: all but Logged In and all Transfer statuses
   * </pre>
   *
   * <code>TRIGGER_ACTION_ADVANCE_TO_STATUS = 1;</code>
   */
  public static final int TRIGGER_ACTION_ADVANCE_TO_STATUS_VALUE = 1;
  /**
   * <pre>
   * The action to display a message
   * </pre>
   *
   * <code>TRIGGER_ACTION_DISPLAY_MESSAGE = 2;</code>
   */
  public static final int TRIGGER_ACTION_DISPLAY_MESSAGE_VALUE = 2;
  /**
   * <pre>
   * The action to eject the agent
   * </pre>
   *
   * <code>TRIGGER_ACTION_EJECT_AGENT = 3;</code>
   */
  public static final int TRIGGER_ACTION_EJECT_AGENT_VALUE = 3;
  /**
   * <pre>
   * The action to execute a web link
   * </pre>
   *
   * <code>TRIGGER_ACTION_EXECUTE_WEB_LINK = 4;</code>
   */
  public static final int TRIGGER_ACTION_EXECUTE_WEB_LINK_VALUE = 4;
  /**
   * <pre>
   * The action to execute an integration link
   * </pre>
   *
   * <code>TRIGGER_ACTION_EXECUTE_INTEGRATION_LINK = 5;</code>
   */
  public static final int TRIGGER_ACTION_EXECUTE_INTEGRATION_LINK_VALUE = 5;


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
  public static TriggerAction valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TriggerAction forNumber(int value) {
    switch (value) {
      case 0: return TRIGGER_ACTION_UNSPECIFIED;
      case 1: return TRIGGER_ACTION_ADVANCE_TO_STATUS;
      case 2: return TRIGGER_ACTION_DISPLAY_MESSAGE;
      case 3: return TRIGGER_ACTION_EJECT_AGENT;
      case 4: return TRIGGER_ACTION_EXECUTE_WEB_LINK;
      case 5: return TRIGGER_ACTION_EXECUTE_INTEGRATION_LINK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TriggerAction>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TriggerAction> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TriggerAction>() {
          public TriggerAction findValueByNumber(int number) {
            return TriggerAction.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final TriggerAction[] VALUES = values();

  public static TriggerAction valueOf(
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

  private TriggerAction(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.TriggerAction)
}

