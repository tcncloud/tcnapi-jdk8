// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * SystemPauseCode controls if a system Pause code is being used
 * DEPRECATED: Use services.org.hunt_groups.v1alpha1.SystemPauseCode instead
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.SystemPauseCode}
 */
@java.lang.Deprecated public enum SystemPauseCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_UNSPECIFIED = 0;</code>
   */
  SYSTEM_PAUSE_CODE_UNSPECIFIED(0),
  /**
   * <pre>
   * The code for when the agent triggers the advance to paused action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_AGENT_TRIGGER_ADVANCE_TO_PAUSED = 1;</code>
   */
  SYSTEM_PAUSE_CODE_AGENT_TRIGGER_ADVANCE_TO_PAUSED(1),
  /**
   * <pre>
   * The code for when the agent triggers the change password action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_CHANGE_PASSWORD = 2;</code>
   */
  SYSTEM_PAUSE_CODE_CHANGE_PASSWORD(2),
  /**
   * <pre>
   * The code for when the agent triggers the check voice mail action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_CHECK_VOICE_MAIL = 3;</code>
   */
  SYSTEM_PAUSE_CODE_CHECK_VOICE_MAIL(3),
  /**
   * <pre>
   * The code for when the agent triggers manually approve calls action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_MANUALLY_APPROVE_CALLS = 4;</code>
   */
  SYSTEM_PAUSE_CODE_MANUALLY_APPROVE_CALLS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_UNSPECIFIED = 0;</code>
   */
  public static final int SYSTEM_PAUSE_CODE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The code for when the agent triggers the advance to paused action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_AGENT_TRIGGER_ADVANCE_TO_PAUSED = 1;</code>
   */
  public static final int SYSTEM_PAUSE_CODE_AGENT_TRIGGER_ADVANCE_TO_PAUSED_VALUE = 1;
  /**
   * <pre>
   * The code for when the agent triggers the change password action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_CHANGE_PASSWORD = 2;</code>
   */
  public static final int SYSTEM_PAUSE_CODE_CHANGE_PASSWORD_VALUE = 2;
  /**
   * <pre>
   * The code for when the agent triggers the check voice mail action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_CHECK_VOICE_MAIL = 3;</code>
   */
  public static final int SYSTEM_PAUSE_CODE_CHECK_VOICE_MAIL_VALUE = 3;
  /**
   * <pre>
   * The code for when the agent triggers manually approve calls action
   * </pre>
   *
   * <code>SYSTEM_PAUSE_CODE_MANUALLY_APPROVE_CALLS = 4;</code>
   */
  public static final int SYSTEM_PAUSE_CODE_MANUALLY_APPROVE_CALLS_VALUE = 4;


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
  public static SystemPauseCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SystemPauseCode forNumber(int value) {
    switch (value) {
      case 0: return SYSTEM_PAUSE_CODE_UNSPECIFIED;
      case 1: return SYSTEM_PAUSE_CODE_AGENT_TRIGGER_ADVANCE_TO_PAUSED;
      case 2: return SYSTEM_PAUSE_CODE_CHANGE_PASSWORD;
      case 3: return SYSTEM_PAUSE_CODE_CHECK_VOICE_MAIL;
      case 4: return SYSTEM_PAUSE_CODE_MANUALLY_APPROVE_CALLS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SystemPauseCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SystemPauseCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SystemPauseCode>() {
          public SystemPauseCode findValueByNumber(int number) {
            return SystemPauseCode.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final SystemPauseCode[] VALUES = values();

  public static SystemPauseCode valueOf(
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

  private SystemPauseCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.SystemPauseCode)
}

