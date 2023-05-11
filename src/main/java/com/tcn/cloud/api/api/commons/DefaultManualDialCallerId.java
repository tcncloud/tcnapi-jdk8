// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Hunt Group Settings options for Default Manual Dial Caller ID
 * </pre>
 *
 * Protobuf enum {@code api.commons.DefaultManualDialCallerId}
 */
public enum DefaultManualDialCallerId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_NONE = 0;</code>
   */
  DEFAULT_MANUAL_DIAL_CALLER_ID_NONE(0),
  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_CUSTOM = 1;</code>
   */
  DEFAULT_MANUAL_DIAL_CALLER_ID_CUSTOM(1),
  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_AGENT_CALLER_ID = 2;</code>
   */
  DEFAULT_MANUAL_DIAL_CALLER_ID_AGENT_CALLER_ID(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_NONE = 0;</code>
   */
  public static final int DEFAULT_MANUAL_DIAL_CALLER_ID_NONE_VALUE = 0;
  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_CUSTOM = 1;</code>
   */
  public static final int DEFAULT_MANUAL_DIAL_CALLER_ID_CUSTOM_VALUE = 1;
  /**
   * <code>DEFAULT_MANUAL_DIAL_CALLER_ID_AGENT_CALLER_ID = 2;</code>
   */
  public static final int DEFAULT_MANUAL_DIAL_CALLER_ID_AGENT_CALLER_ID_VALUE = 2;


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
  public static DefaultManualDialCallerId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DefaultManualDialCallerId forNumber(int value) {
    switch (value) {
      case 0: return DEFAULT_MANUAL_DIAL_CALLER_ID_NONE;
      case 1: return DEFAULT_MANUAL_DIAL_CALLER_ID_CUSTOM;
      case 2: return DEFAULT_MANUAL_DIAL_CALLER_ID_AGENT_CALLER_ID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DefaultManualDialCallerId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DefaultManualDialCallerId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DefaultManualDialCallerId>() {
          public DefaultManualDialCallerId findValueByNumber(int number) {
            return DefaultManualDialCallerId.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(36);
  }

  private static final DefaultManualDialCallerId[] VALUES = values();

  public static DefaultManualDialCallerId valueOf(
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

  private DefaultManualDialCallerId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DefaultManualDialCallerId)
}

