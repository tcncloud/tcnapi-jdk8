// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * OmniTaskStatus -
 * </pre>
 *
 * Protobuf enum {@code api.commons.OmniTaskStatus}
 */
public enum OmniTaskStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * initial task created waiting to be processed
   * </pre>
   *
   * <code>OMNI_TASK_WAITING = 0;</code>
   */
  OMNI_TASK_WAITING(0),
  /**
   * <pre>
   * the task is currently being sent
   * </pre>
   *
   * <code>OMNI_TASK_SENDING = 100;</code>
   */
  OMNI_TASK_SENDING(100),
  /**
   * <pre>
   * the task attempted to send but failed
   * </pre>
   *
   * <code>OMNI_TASK_SENDING_FAILED = 110;</code>
   */
  OMNI_TASK_SENDING_FAILED(110),
  /**
   * <pre>
   * the task began the process of sending but did not complete
   * </pre>
   *
   * <code>OMNI_TASK_SENDING_INCOMPLETE = 111;</code>
   */
  OMNI_TASK_SENDING_INCOMPLETE(111),
  /**
   * <pre>
   * the task successfully sent
   * </pre>
   *
   * <code>OMNI_TASK_SENT = 120;</code>
   */
  OMNI_TASK_SENT(120),
  /**
   * <pre>
   * the task was received by the destination
   * </pre>
   *
   * <code>OMNI_TASK_RECEIVED = 130;</code>
   */
  OMNI_TASK_RECEIVED(130),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * initial task created waiting to be processed
   * </pre>
   *
   * <code>OMNI_TASK_WAITING = 0;</code>
   */
  public static final int OMNI_TASK_WAITING_VALUE = 0;
  /**
   * <pre>
   * the task is currently being sent
   * </pre>
   *
   * <code>OMNI_TASK_SENDING = 100;</code>
   */
  public static final int OMNI_TASK_SENDING_VALUE = 100;
  /**
   * <pre>
   * the task attempted to send but failed
   * </pre>
   *
   * <code>OMNI_TASK_SENDING_FAILED = 110;</code>
   */
  public static final int OMNI_TASK_SENDING_FAILED_VALUE = 110;
  /**
   * <pre>
   * the task began the process of sending but did not complete
   * </pre>
   *
   * <code>OMNI_TASK_SENDING_INCOMPLETE = 111;</code>
   */
  public static final int OMNI_TASK_SENDING_INCOMPLETE_VALUE = 111;
  /**
   * <pre>
   * the task successfully sent
   * </pre>
   *
   * <code>OMNI_TASK_SENT = 120;</code>
   */
  public static final int OMNI_TASK_SENT_VALUE = 120;
  /**
   * <pre>
   * the task was received by the destination
   * </pre>
   *
   * <code>OMNI_TASK_RECEIVED = 130;</code>
   */
  public static final int OMNI_TASK_RECEIVED_VALUE = 130;


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
  public static OmniTaskStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniTaskStatus forNumber(int value) {
    switch (value) {
      case 0: return OMNI_TASK_WAITING;
      case 100: return OMNI_TASK_SENDING;
      case 110: return OMNI_TASK_SENDING_FAILED;
      case 111: return OMNI_TASK_SENDING_INCOMPLETE;
      case 120: return OMNI_TASK_SENT;
      case 130: return OMNI_TASK_RECEIVED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniTaskStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniTaskStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniTaskStatus>() {
          public OmniTaskStatus findValueByNumber(int number) {
            return OmniTaskStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(13);
  }

  private static final OmniTaskStatus[] VALUES = values();

  public static OmniTaskStatus valueOf(
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

  private OmniTaskStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OmniTaskStatus)
}

