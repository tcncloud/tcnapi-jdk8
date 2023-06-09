// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/chat.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ChatMessageSenderType}
 */
public enum ChatMessageSenderType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_AGENT = 0;</code>
   */
  CHAT_MESSAGE_SENDER_TYPE_AGENT(0),
  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_CUSTOMER = 1;</code>
   */
  CHAT_MESSAGE_SENDER_TYPE_CUSTOMER(1),
  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_MANAGER = 2;</code>
   */
  CHAT_MESSAGE_SENDER_TYPE_MANAGER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_AGENT = 0;</code>
   */
  public static final int CHAT_MESSAGE_SENDER_TYPE_AGENT_VALUE = 0;
  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_CUSTOMER = 1;</code>
   */
  public static final int CHAT_MESSAGE_SENDER_TYPE_CUSTOMER_VALUE = 1;
  /**
   * <code>CHAT_MESSAGE_SENDER_TYPE_MANAGER = 2;</code>
   */
  public static final int CHAT_MESSAGE_SENDER_TYPE_MANAGER_VALUE = 2;


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
  public static ChatMessageSenderType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ChatMessageSenderType forNumber(int value) {
    switch (value) {
      case 0: return CHAT_MESSAGE_SENDER_TYPE_AGENT;
      case 1: return CHAT_MESSAGE_SENDER_TYPE_CUSTOMER;
      case 2: return CHAT_MESSAGE_SENDER_TYPE_MANAGER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ChatMessageSenderType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ChatMessageSenderType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ChatMessageSenderType>() {
          public ChatMessageSenderType findValueByNumber(int number) {
            return ChatMessageSenderType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ChatProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ChatMessageSenderType[] VALUES = values();

  public static ChatMessageSenderType valueOf(
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

  private ChatMessageSenderType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ChatMessageSenderType)
}

