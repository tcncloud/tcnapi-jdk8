// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/asm.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.QueueType}
 */
public enum QueueType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGENT_QUEUE_CALL = 0;</code>
   */
  AGENT_QUEUE_CALL(0),
  /**
   * <code>ON_HOLD_CALL = 1;</code>
   */
  ON_HOLD_CALL(1),
  /**
   * <code>HQM_CALL = 2;</code>
   */
  HQM_CALL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGENT_QUEUE_CALL = 0;</code>
   */
  public static final int AGENT_QUEUE_CALL_VALUE = 0;
  /**
   * <code>ON_HOLD_CALL = 1;</code>
   */
  public static final int ON_HOLD_CALL_VALUE = 1;
  /**
   * <code>HQM_CALL = 2;</code>
   */
  public static final int HQM_CALL_VALUE = 2;


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
  public static QueueType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static QueueType forNumber(int value) {
    switch (value) {
      case 0: return AGENT_QUEUE_CALL;
      case 1: return ON_HOLD_CALL;
      case 2: return HQM_CALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<QueueType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      QueueType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<QueueType>() {
          public QueueType findValueByNumber(int number) {
            return QueueType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AsmProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final QueueType[] VALUES = values();

  public static QueueType valueOf(
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

  private QueueType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.QueueType)
}

