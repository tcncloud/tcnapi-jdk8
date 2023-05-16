// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/broadcasts.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.BroadcastType}
 */
public enum BroadcastType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TYPE_UNKNOWN = 0;</code>
   */
  TYPE_UNKNOWN(0),
  /**
   * <code>TYPE_OUTBOUND = 1000;</code>
   */
  TYPE_OUTBOUND(1000),
  /**
   * <code>TYPE_OUTBOUND_PREVIEW_ONLY = 1100;</code>
   */
  TYPE_OUTBOUND_PREVIEW_ONLY(1100),
  /**
   * <code>TYPE_OUTBOUND_MAC_ONLY = 1200;</code>
   */
  TYPE_OUTBOUND_MAC_ONLY(1200),
  /**
   * <code>TYPE_OUTBOUND_RINGLESS_VOICEMAIL = 1300;</code>
   */
  TYPE_OUTBOUND_RINGLESS_VOICEMAIL(1300),
  /**
   * <code>TYPE_INBOUND = 2000;</code>
   */
  TYPE_INBOUND(2000),
  /**
   * <code>TYPE_MANUAL = 3000;</code>
   */
  TYPE_MANUAL(3000),
  /**
   * <code>TYPE_SMS = 4000;</code>
   */
  TYPE_SMS(4000),
  /**
   * <code>TYPE_EMAIL = 5000;</code>
   */
  TYPE_EMAIL(5000),
  /**
   * <code>TYPE_OUTBOUND_INBOUND = 7000;</code>
   */
  TYPE_OUTBOUND_INBOUND(7000),
  /**
   * <code>TYPE_OUTBOUND_MANUAL = 8000;</code>
   */
  TYPE_OUTBOUND_MANUAL(8000),
  /**
   * <code>TYPE_INBOUND_MANUAL = 9000;</code>
   */
  TYPE_INBOUND_MANUAL(9000),
  /**
   * <code>TYPE_OUTBOUND_INBOUND_MANUAL = 10000;</code>
   */
  TYPE_OUTBOUND_INBOUND_MANUAL(10000),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TYPE_UNKNOWN = 0;</code>
   */
  public static final int TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>TYPE_OUTBOUND = 1000;</code>
   */
  public static final int TYPE_OUTBOUND_VALUE = 1000;
  /**
   * <code>TYPE_OUTBOUND_PREVIEW_ONLY = 1100;</code>
   */
  public static final int TYPE_OUTBOUND_PREVIEW_ONLY_VALUE = 1100;
  /**
   * <code>TYPE_OUTBOUND_MAC_ONLY = 1200;</code>
   */
  public static final int TYPE_OUTBOUND_MAC_ONLY_VALUE = 1200;
  /**
   * <code>TYPE_OUTBOUND_RINGLESS_VOICEMAIL = 1300;</code>
   */
  public static final int TYPE_OUTBOUND_RINGLESS_VOICEMAIL_VALUE = 1300;
  /**
   * <code>TYPE_INBOUND = 2000;</code>
   */
  public static final int TYPE_INBOUND_VALUE = 2000;
  /**
   * <code>TYPE_MANUAL = 3000;</code>
   */
  public static final int TYPE_MANUAL_VALUE = 3000;
  /**
   * <code>TYPE_SMS = 4000;</code>
   */
  public static final int TYPE_SMS_VALUE = 4000;
  /**
   * <code>TYPE_EMAIL = 5000;</code>
   */
  public static final int TYPE_EMAIL_VALUE = 5000;
  /**
   * <code>TYPE_OUTBOUND_INBOUND = 7000;</code>
   */
  public static final int TYPE_OUTBOUND_INBOUND_VALUE = 7000;
  /**
   * <code>TYPE_OUTBOUND_MANUAL = 8000;</code>
   */
  public static final int TYPE_OUTBOUND_MANUAL_VALUE = 8000;
  /**
   * <code>TYPE_INBOUND_MANUAL = 9000;</code>
   */
  public static final int TYPE_INBOUND_MANUAL_VALUE = 9000;
  /**
   * <code>TYPE_OUTBOUND_INBOUND_MANUAL = 10000;</code>
   */
  public static final int TYPE_OUTBOUND_INBOUND_MANUAL_VALUE = 10000;


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
  public static BroadcastType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BroadcastType forNumber(int value) {
    switch (value) {
      case 0: return TYPE_UNKNOWN;
      case 1000: return TYPE_OUTBOUND;
      case 1100: return TYPE_OUTBOUND_PREVIEW_ONLY;
      case 1200: return TYPE_OUTBOUND_MAC_ONLY;
      case 1300: return TYPE_OUTBOUND_RINGLESS_VOICEMAIL;
      case 2000: return TYPE_INBOUND;
      case 3000: return TYPE_MANUAL;
      case 4000: return TYPE_SMS;
      case 5000: return TYPE_EMAIL;
      case 7000: return TYPE_OUTBOUND_INBOUND;
      case 8000: return TYPE_OUTBOUND_MANUAL;
      case 9000: return TYPE_INBOUND_MANUAL;
      case 10000: return TYPE_OUTBOUND_INBOUND_MANUAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BroadcastType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BroadcastType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BroadcastType>() {
          public BroadcastType findValueByNumber(int number) {
            return BroadcastType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.BroadcastsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final BroadcastType[] VALUES = values();

  public static BroadcastType valueOf(
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

  private BroadcastType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.BroadcastType)
}

