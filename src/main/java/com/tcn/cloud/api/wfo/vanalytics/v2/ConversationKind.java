// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * An enumeration of the kind of conversation that a transcript can have.
 * </pre>
 *
 * Protobuf enum {@code wfo.vanalytics.v2.ConversationKind}
 */
public enum ConversationKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONVERSATION_KIND_CALL = 0;</code>
   */
  CONVERSATION_KIND_CALL(0),
  /**
   * <code>CONVERSATION_KIND_SMS = 1;</code>
   */
  CONVERSATION_KIND_SMS(1),
  /**
   * <code>CONVERSATION_KIND_CHAT = 2;</code>
   */
  CONVERSATION_KIND_CHAT(2),
  /**
   * <code>CONVERSATION_KIND_EMAIL = 3;</code>
   */
  CONVERSATION_KIND_EMAIL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONVERSATION_KIND_CALL = 0;</code>
   */
  public static final int CONVERSATION_KIND_CALL_VALUE = 0;
  /**
   * <code>CONVERSATION_KIND_SMS = 1;</code>
   */
  public static final int CONVERSATION_KIND_SMS_VALUE = 1;
  /**
   * <code>CONVERSATION_KIND_CHAT = 2;</code>
   */
  public static final int CONVERSATION_KIND_CHAT_VALUE = 2;
  /**
   * <code>CONVERSATION_KIND_EMAIL = 3;</code>
   */
  public static final int CONVERSATION_KIND_EMAIL_VALUE = 3;


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
  public static ConversationKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConversationKind forNumber(int value) {
    switch (value) {
      case 0: return CONVERSATION_KIND_CALL;
      case 1: return CONVERSATION_KIND_SMS;
      case 2: return CONVERSATION_KIND_CHAT;
      case 3: return CONVERSATION_KIND_EMAIL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConversationKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConversationKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConversationKind>() {
          public ConversationKind findValueByNumber(int number) {
            return ConversationKind.forNumber(number);
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
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ConversationKind[] VALUES = values();

  public static ConversationKind valueOf(
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

  private ConversationKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:wfo.vanalytics.v2.ConversationKind)
}

