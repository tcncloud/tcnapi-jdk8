// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Hunt Group Settings options for recording status upon transfer.
 * </pre>
 *
 * Protobuf enum {@code api.commons.TransferRecordingStatus}
 */
public enum TransferRecordingStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRANSFER_RECORDING_STATUS_KEEP_STATUS = 0;</code>
   */
  TRANSFER_RECORDING_STATUS_KEEP_STATUS(0),
  /**
   * <code>TRANSFER_RECORDING_STATUS_START_RECORDING = 1;</code>
   */
  TRANSFER_RECORDING_STATUS_START_RECORDING(1),
  /**
   * <code>TRANSFER_RECORDING_STATUS_STOP_RECORDING = 2;</code>
   */
  TRANSFER_RECORDING_STATUS_STOP_RECORDING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRANSFER_RECORDING_STATUS_KEEP_STATUS = 0;</code>
   */
  public static final int TRANSFER_RECORDING_STATUS_KEEP_STATUS_VALUE = 0;
  /**
   * <code>TRANSFER_RECORDING_STATUS_START_RECORDING = 1;</code>
   */
  public static final int TRANSFER_RECORDING_STATUS_START_RECORDING_VALUE = 1;
  /**
   * <code>TRANSFER_RECORDING_STATUS_STOP_RECORDING = 2;</code>
   */
  public static final int TRANSFER_RECORDING_STATUS_STOP_RECORDING_VALUE = 2;


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
  public static TransferRecordingStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransferRecordingStatus forNumber(int value) {
    switch (value) {
      case 0: return TRANSFER_RECORDING_STATUS_KEEP_STATUS;
      case 1: return TRANSFER_RECORDING_STATUS_START_RECORDING;
      case 2: return TRANSFER_RECORDING_STATUS_STOP_RECORDING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransferRecordingStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransferRecordingStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransferRecordingStatus>() {
          public TransferRecordingStatus findValueByNumber(int number) {
            return TransferRecordingStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(33);
  }

  private static final TransferRecordingStatus[] VALUES = values();

  public static TransferRecordingStatus valueOf(
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

  private TransferRecordingStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.TransferRecordingStatus)
}

