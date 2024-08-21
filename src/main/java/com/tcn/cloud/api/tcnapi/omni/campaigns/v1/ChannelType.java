// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/campaigns/v1/campaigns.proto

package com.tcn.cloud.api.tcnapi.omni.campaigns.v1;

/**
 * <pre>
 * This enum represents the channel type
 * </pre>
 *
 * Protobuf enum {@code tcnapi.omni.campaigns.v1.ChannelType}
 */
public enum ChannelType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CHANNEL_TYPE_EMAIL = 0;</code>
   */
  CHANNEL_TYPE_EMAIL(0),
  /**
   * <code>CHANNEL_TYPE_SMS = 1;</code>
   */
  CHANNEL_TYPE_SMS(1),
  /**
   * <code>CHANNEL_TYPE_CHAT = 2;</code>
   */
  CHANNEL_TYPE_CHAT(2),
  /**
   * <code>CHANNEL_TYPE_VOICE = 3;</code>
   */
  CHANNEL_TYPE_VOICE(3),
  /**
   * <code>CHANNEL_TYPE_WHATSAPP = 4;</code>
   */
  CHANNEL_TYPE_WHATSAPP(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CHANNEL_TYPE_EMAIL = 0;</code>
   */
  public static final int CHANNEL_TYPE_EMAIL_VALUE = 0;
  /**
   * <code>CHANNEL_TYPE_SMS = 1;</code>
   */
  public static final int CHANNEL_TYPE_SMS_VALUE = 1;
  /**
   * <code>CHANNEL_TYPE_CHAT = 2;</code>
   */
  public static final int CHANNEL_TYPE_CHAT_VALUE = 2;
  /**
   * <code>CHANNEL_TYPE_VOICE = 3;</code>
   */
  public static final int CHANNEL_TYPE_VOICE_VALUE = 3;
  /**
   * <code>CHANNEL_TYPE_WHATSAPP = 4;</code>
   */
  public static final int CHANNEL_TYPE_WHATSAPP_VALUE = 4;


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
  public static ChannelType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChannelType forNumber(int value) {
    switch (value) {
      case 0: return CHANNEL_TYPE_EMAIL;
      case 1: return CHANNEL_TYPE_SMS;
      case 2: return CHANNEL_TYPE_CHAT;
      case 3: return CHANNEL_TYPE_VOICE;
      case 4: return CHANNEL_TYPE_WHATSAPP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChannelType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChannelType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChannelType>() {
          public ChannelType findValueByNumber(int number) {
            return ChannelType.forNumber(number);
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
    return com.tcn.cloud.api.tcnapi.omni.campaigns.v1.CampaignsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChannelType[] VALUES = values();

  public static ChannelType valueOf(
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

  private ChannelType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tcnapi.omni.campaigns.v1.ChannelType)
}

