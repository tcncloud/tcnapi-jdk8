// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * OmniConversationMetadataName -
 * </pre>
 *
 * Protobuf enum {@code api.commons.OmniConversationMetadataName}
 */
public enum OmniConversationMetadataName
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGENT_RESPONSE_TIME = 0;</code>
   */
  AGENT_RESPONSE_TIME(0),
  /**
   * <code>CUSTOMER_WAIT_TIME = 1;</code>
   */
  CUSTOMER_WAIT_TIME(1),
  /**
   * <code>HANDLE_TIME = 2;</code>
   */
  HANDLE_TIME(2),
  /**
   * <code>TRANSCRIPT_PATH = 3;</code>
   */
  TRANSCRIPT_PATH(3),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_FLOW_DATA = 4;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_FLOW_DATA(4),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_VOICE_DATA = 5;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_VOICE_DATA(5),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_WAIT = 10;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_WAIT(10),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK = 100;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK(100),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_INITIAL_AGENT_RESPONSE = 101;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_INITIAL_AGENT_RESPONSE(101),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_AGENT_RESPONSE = 102;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_AGENT_RESPONSE(102),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_CUSTOMER_RESPONSE = 103;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_CUSTOMER_RESPONSE(103),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_SUSPENDED = 104;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_SUSPENDED(104),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_WRAP_UP = 200;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_WRAP_UP(200),
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_IDLE = 300;</code>
   */
  OMNI_CONVERSATION_METADATA_NAME_TIMER_IDLE(300),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGENT_RESPONSE_TIME = 0;</code>
   */
  public static final int AGENT_RESPONSE_TIME_VALUE = 0;
  /**
   * <code>CUSTOMER_WAIT_TIME = 1;</code>
   */
  public static final int CUSTOMER_WAIT_TIME_VALUE = 1;
  /**
   * <code>HANDLE_TIME = 2;</code>
   */
  public static final int HANDLE_TIME_VALUE = 2;
  /**
   * <code>TRANSCRIPT_PATH = 3;</code>
   */
  public static final int TRANSCRIPT_PATH_VALUE = 3;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_FLOW_DATA = 4;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_FLOW_DATA_VALUE = 4;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_VOICE_DATA = 5;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_VOICE_DATA_VALUE = 5;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_WAIT = 10;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_WAIT_VALUE = 10;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK = 100;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_VALUE = 100;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_INITIAL_AGENT_RESPONSE = 101;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_INITIAL_AGENT_RESPONSE_VALUE = 101;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_AGENT_RESPONSE = 102;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_AGENT_RESPONSE_VALUE = 102;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_CUSTOMER_RESPONSE = 103;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_CUSTOMER_RESPONSE_VALUE = 103;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_SUSPENDED = 104;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_SUSPENDED_VALUE = 104;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_WRAP_UP = 200;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_WRAP_UP_VALUE = 200;
  /**
   * <code>OMNI_CONVERSATION_METADATA_NAME_TIMER_IDLE = 300;</code>
   */
  public static final int OMNI_CONVERSATION_METADATA_NAME_TIMER_IDLE_VALUE = 300;


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
  public static OmniConversationMetadataName valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniConversationMetadataName forNumber(int value) {
    switch (value) {
      case 0: return AGENT_RESPONSE_TIME;
      case 1: return CUSTOMER_WAIT_TIME;
      case 2: return HANDLE_TIME;
      case 3: return TRANSCRIPT_PATH;
      case 4: return OMNI_CONVERSATION_METADATA_NAME_FLOW_DATA;
      case 5: return OMNI_CONVERSATION_METADATA_NAME_VOICE_DATA;
      case 10: return OMNI_CONVERSATION_METADATA_NAME_TIMER_WAIT;
      case 100: return OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK;
      case 101: return OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_INITIAL_AGENT_RESPONSE;
      case 102: return OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_AGENT_RESPONSE;
      case 103: return OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_CUSTOMER_RESPONSE;
      case 104: return OMNI_CONVERSATION_METADATA_NAME_TIMER_TALK_SUSPENDED;
      case 200: return OMNI_CONVERSATION_METADATA_NAME_TIMER_WRAP_UP;
      case 300: return OMNI_CONVERSATION_METADATA_NAME_TIMER_IDLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniConversationMetadataName>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniConversationMetadataName> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniConversationMetadataName>() {
          public OmniConversationMetadataName findValueByNumber(int number) {
            return OmniConversationMetadataName.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(18);
  }

  private static final OmniConversationMetadataName[] VALUES = values();

  public static OmniConversationMetadataName valueOf(
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

  private OmniConversationMetadataName(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OmniConversationMetadataName)
}

