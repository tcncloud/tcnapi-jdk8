// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.AgentCallLogActionKey}
 */
public final class AgentCallLogActionKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AgentCallLogActionKey)
    AgentCallLogActionKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentCallLogActionKey.newBuilder() to construct.
  private AgentCallLogActionKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentCallLogActionKey() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentCallLogActionKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentCallLogActionKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentCallLogActionKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AgentCallLogActionKey.class, com.tcn.cloud.api.api.commons.AgentCallLogActionKey.Builder.class);
  }

  /**
   * Protobuf enum {@code api.commons.AgentCallLogActionKey.Enum}
   */
  public enum Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DNCL_ADD = 0;</code>
     */
    DNCL_ADD(0),
    /**
     * <code>CALL_ENDED = 1;</code>
     */
    CALL_ENDED(1),
    /**
     * <code>CALL_DISCONNECT = 2;</code>
     */
    CALL_DISCONNECT(2),
    /**
     * <code>CALLER_HUNGUP = 3;</code>
     */
    CALLER_HUNGUP(3),
    /**
     * <pre>
     * WARM TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL = 4;</code>
     */
    WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL(4),
    /**
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER = 5;</code>
     */
    WARM_TRANSFER_AGENT_INVITE_CALLER(5),
    /**
     * <code>WARM_TRANSFER_AGENT_START = 6;</code>
     */
    WARM_TRANSFER_AGENT_START(6),
    /**
     * <code>WARM_TRANSFER_AGENT_END = 7;</code>
     */
    WARM_TRANSFER_AGENT_END(7),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER = 8;</code>
     */
    WARM_TRANSFER_OUTBOUND_INVITE_CALLER(8),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL = 9;</code>
     */
    WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL(9),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_START = 10;</code>
     */
    WARM_TRANSFER_OUTBOUND_START(10),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_END = 11;</code>
     */
    WARM_TRANSFER_OUTBOUND_END(11),
    /**
     * <pre>
     * COLD TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_AGENT_START = 12;</code>
     */
    COLD_TRANSFER_AGENT_START(12),
    /**
     * <code>COLD_TRANSFER_AGENT_END = 13;</code>
     */
    COLD_TRANSFER_AGENT_END(13),
    /**
     * <code>COLD_TRANSFER_OUTBOUND_START = 14;</code>
     */
    COLD_TRANSFER_OUTBOUND_START(14),
    /**
     * <pre>
     * CALLBACK SUSPEND
     * </pre>
     *
     * <code>CALLBACK_SUSPEND_START = 15;</code>
     */
    CALLBACK_SUSPEND_START(15),
    /**
     * <code>CALLBACK_RESUMING = 16;</code>
     */
    CALLBACK_RESUMING(16),
    /**
     * <pre>
     * VOICEMAIL
     * </pre>
     *
     * <code>VOICEMAIL_END = 17;</code>
     */
    VOICEMAIL_END(17),
    /**
     * <code>CALLER_SENT_TO_VOICEMAIL = 18;</code>
     */
    CALLER_SENT_TO_VOICEMAIL(18),
    /**
     * <pre>
     * HOLD
     * </pre>
     *
     * <code>HOLD_START = 19;</code>
     */
    HOLD_START(19),
    /**
     * <code>HOLD_END = 20;</code>
     */
    HOLD_END(20),
    /**
     * <pre>
     * RECORDING
     * </pre>
     *
     * <code>RECORDING_START = 21;</code>
     */
    RECORDING_START(21),
    /**
     * <code>RECORDING_STOP = 22;</code>
     */
    RECORDING_STOP(22),
    /**
     * <pre>
     * SKILLS
     * </pre>
     *
     * <code>CALL_SKILLS_SCORE = 23;</code>
     */
    CALL_SKILLS_SCORE(23),
    /**
     * <code>CALL_SKILLS_MATCHED = 24;</code>
     */
    CALL_SKILLS_MATCHED(24),
    /**
     * <code>CALL_SKILLS_CURRENT = 25;</code>
     */
    CALL_SKILLS_CURRENT(25),
    /**
     * <code>CALL_SKILLS_INITIAL = 26;</code>
     */
    CALL_SKILLS_INITIAL(26),
    /**
     * <code>SKILLS_CHANGED_DROPSKILLS = 27;</code>
     */
    SKILLS_CHANGED_DROPSKILLS(27),
    /**
     * <code>SKILLS_CHANGED_ADDSKILLS = 28;</code>
     */
    SKILLS_CHANGED_ADDSKILLS(28),
    /**
     * <pre>
     * QUEUEING
     * </pre>
     *
     * <code>REQUEUE = 29;</code>
     */
    REQUEUE(29),
    /**
     * <code>SKILLS_CHANGED_REQUEUE = 30;</code>
     */
    SKILLS_CHANGED_REQUEUE(30),
    /**
     * <pre>
     * SCRUBBING
     * </pre>
     *
     * <code>SCRUB_OVERRIDE = 31;</code>
     */
    SCRUB_OVERRIDE(31),
    /**
     * <pre>
     * More CALLBACK SUSPEND
     * </pre>
     *
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_START = 32;</code>
     */
    CALLBACK_RESUMING_WITH_MANUAL_CALL_START(32),
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH = 33;</code>
     */
    CALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH(33),
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_TIMEDOUT = 34;</code>
     */
    CALLBACK_RESUMING_WITH_MANUAL_CALL_TIMEDOUT(34),
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_REPLACED = 35;</code>
     */
    CALLBACK_RESUMING_WITH_MANUAL_CALL_REPLACED(35),
    /**
     * <pre>
     * Tranfer Hold and Unhold
     * </pre>
     *
     * <code>TRANSFER_HOLD = 36;</code>
     */
    TRANSFER_HOLD(36),
    /**
     * <code>TRANSFER_UNHOLD = 37;</code>
     */
    TRANSFER_UNHOLD(37),
    /**
     * <pre>
     * when the transfer starts for the source caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_SOURCE_START = 38;</code>
     */
    WARM_CALLER_TRANSFER_SOURCE_START(38),
    /**
     * <pre>
     * when the transfer starts for the destination caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_DESTINATION_START = 39;</code>
     */
    WARM_CALLER_TRANSFER_DESTINATION_START(39),
    /**
     * <pre>
     * when the transfer starts and the source caller is not on hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL = 40;</code>
     */
    WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL(40),
    /**
     * <pre>
     * when during transfer and the source caller is taken of hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER = 41;</code>
     */
    WARM_CALLER_TRANSFER_INVITE_CALLER(41),
    /**
     * <pre>
     * when the transfer ends for a caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_END = 42;</code>
     */
    WARM_CALLER_TRANSFER_END(42),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DNCL_ADD = 0;</code>
     */
    public static final int DNCL_ADD_VALUE = 0;
    /**
     * <code>CALL_ENDED = 1;</code>
     */
    public static final int CALL_ENDED_VALUE = 1;
    /**
     * <code>CALL_DISCONNECT = 2;</code>
     */
    public static final int CALL_DISCONNECT_VALUE = 2;
    /**
     * <code>CALLER_HUNGUP = 3;</code>
     */
    public static final int CALLER_HUNGUP_VALUE = 3;
    /**
     * <pre>
     * WARM TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL = 4;</code>
     */
    public static final int WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL_VALUE = 4;
    /**
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER = 5;</code>
     */
    public static final int WARM_TRANSFER_AGENT_INVITE_CALLER_VALUE = 5;
    /**
     * <code>WARM_TRANSFER_AGENT_START = 6;</code>
     */
    public static final int WARM_TRANSFER_AGENT_START_VALUE = 6;
    /**
     * <code>WARM_TRANSFER_AGENT_END = 7;</code>
     */
    public static final int WARM_TRANSFER_AGENT_END_VALUE = 7;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER = 8;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_INVITE_CALLER_VALUE = 8;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL = 9;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL_VALUE = 9;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_START = 10;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_START_VALUE = 10;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_END = 11;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_END_VALUE = 11;
    /**
     * <pre>
     * COLD TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_AGENT_START = 12;</code>
     */
    public static final int COLD_TRANSFER_AGENT_START_VALUE = 12;
    /**
     * <code>COLD_TRANSFER_AGENT_END = 13;</code>
     */
    public static final int COLD_TRANSFER_AGENT_END_VALUE = 13;
    /**
     * <code>COLD_TRANSFER_OUTBOUND_START = 14;</code>
     */
    public static final int COLD_TRANSFER_OUTBOUND_START_VALUE = 14;
    /**
     * <pre>
     * CALLBACK SUSPEND
     * </pre>
     *
     * <code>CALLBACK_SUSPEND_START = 15;</code>
     */
    public static final int CALLBACK_SUSPEND_START_VALUE = 15;
    /**
     * <code>CALLBACK_RESUMING = 16;</code>
     */
    public static final int CALLBACK_RESUMING_VALUE = 16;
    /**
     * <pre>
     * VOICEMAIL
     * </pre>
     *
     * <code>VOICEMAIL_END = 17;</code>
     */
    public static final int VOICEMAIL_END_VALUE = 17;
    /**
     * <code>CALLER_SENT_TO_VOICEMAIL = 18;</code>
     */
    public static final int CALLER_SENT_TO_VOICEMAIL_VALUE = 18;
    /**
     * <pre>
     * HOLD
     * </pre>
     *
     * <code>HOLD_START = 19;</code>
     */
    public static final int HOLD_START_VALUE = 19;
    /**
     * <code>HOLD_END = 20;</code>
     */
    public static final int HOLD_END_VALUE = 20;
    /**
     * <pre>
     * RECORDING
     * </pre>
     *
     * <code>RECORDING_START = 21;</code>
     */
    public static final int RECORDING_START_VALUE = 21;
    /**
     * <code>RECORDING_STOP = 22;</code>
     */
    public static final int RECORDING_STOP_VALUE = 22;
    /**
     * <pre>
     * SKILLS
     * </pre>
     *
     * <code>CALL_SKILLS_SCORE = 23;</code>
     */
    public static final int CALL_SKILLS_SCORE_VALUE = 23;
    /**
     * <code>CALL_SKILLS_MATCHED = 24;</code>
     */
    public static final int CALL_SKILLS_MATCHED_VALUE = 24;
    /**
     * <code>CALL_SKILLS_CURRENT = 25;</code>
     */
    public static final int CALL_SKILLS_CURRENT_VALUE = 25;
    /**
     * <code>CALL_SKILLS_INITIAL = 26;</code>
     */
    public static final int CALL_SKILLS_INITIAL_VALUE = 26;
    /**
     * <code>SKILLS_CHANGED_DROPSKILLS = 27;</code>
     */
    public static final int SKILLS_CHANGED_DROPSKILLS_VALUE = 27;
    /**
     * <code>SKILLS_CHANGED_ADDSKILLS = 28;</code>
     */
    public static final int SKILLS_CHANGED_ADDSKILLS_VALUE = 28;
    /**
     * <pre>
     * QUEUEING
     * </pre>
     *
     * <code>REQUEUE = 29;</code>
     */
    public static final int REQUEUE_VALUE = 29;
    /**
     * <code>SKILLS_CHANGED_REQUEUE = 30;</code>
     */
    public static final int SKILLS_CHANGED_REQUEUE_VALUE = 30;
    /**
     * <pre>
     * SCRUBBING
     * </pre>
     *
     * <code>SCRUB_OVERRIDE = 31;</code>
     */
    public static final int SCRUB_OVERRIDE_VALUE = 31;
    /**
     * <pre>
     * More CALLBACK SUSPEND
     * </pre>
     *
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_START = 32;</code>
     */
    public static final int CALLBACK_RESUMING_WITH_MANUAL_CALL_START_VALUE = 32;
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH = 33;</code>
     */
    public static final int CALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH_VALUE = 33;
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_TIMEDOUT = 34;</code>
     */
    public static final int CALLBACK_RESUMING_WITH_MANUAL_CALL_TIMEDOUT_VALUE = 34;
    /**
     * <code>CALLBACK_RESUMING_WITH_MANUAL_CALL_REPLACED = 35;</code>
     */
    public static final int CALLBACK_RESUMING_WITH_MANUAL_CALL_REPLACED_VALUE = 35;
    /**
     * <pre>
     * Tranfer Hold and Unhold
     * </pre>
     *
     * <code>TRANSFER_HOLD = 36;</code>
     */
    public static final int TRANSFER_HOLD_VALUE = 36;
    /**
     * <code>TRANSFER_UNHOLD = 37;</code>
     */
    public static final int TRANSFER_UNHOLD_VALUE = 37;
    /**
     * <pre>
     * when the transfer starts for the source caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_SOURCE_START = 38;</code>
     */
    public static final int WARM_CALLER_TRANSFER_SOURCE_START_VALUE = 38;
    /**
     * <pre>
     * when the transfer starts for the destination caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_DESTINATION_START = 39;</code>
     */
    public static final int WARM_CALLER_TRANSFER_DESTINATION_START_VALUE = 39;
    /**
     * <pre>
     * when the transfer starts and the source caller is not on hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL = 40;</code>
     */
    public static final int WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL_VALUE = 40;
    /**
     * <pre>
     * when during transfer and the source caller is taken of hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER = 41;</code>
     */
    public static final int WARM_CALLER_TRANSFER_INVITE_CALLER_VALUE = 41;
    /**
     * <pre>
     * when the transfer ends for a caller
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_END = 42;</code>
     */
    public static final int WARM_CALLER_TRANSFER_END_VALUE = 42;


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
    public static Enum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Enum forNumber(int value) {
      switch (value) {
        case 0: return DNCL_ADD;
        case 1: return CALL_ENDED;
        case 2: return CALL_DISCONNECT;
        case 3: return CALLER_HUNGUP;
        case 4: return WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL;
        case 5: return WARM_TRANSFER_AGENT_INVITE_CALLER;
        case 6: return WARM_TRANSFER_AGENT_START;
        case 7: return WARM_TRANSFER_AGENT_END;
        case 8: return WARM_TRANSFER_OUTBOUND_INVITE_CALLER;
        case 9: return WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL;
        case 10: return WARM_TRANSFER_OUTBOUND_START;
        case 11: return WARM_TRANSFER_OUTBOUND_END;
        case 12: return COLD_TRANSFER_AGENT_START;
        case 13: return COLD_TRANSFER_AGENT_END;
        case 14: return COLD_TRANSFER_OUTBOUND_START;
        case 15: return CALLBACK_SUSPEND_START;
        case 16: return CALLBACK_RESUMING;
        case 17: return VOICEMAIL_END;
        case 18: return CALLER_SENT_TO_VOICEMAIL;
        case 19: return HOLD_START;
        case 20: return HOLD_END;
        case 21: return RECORDING_START;
        case 22: return RECORDING_STOP;
        case 23: return CALL_SKILLS_SCORE;
        case 24: return CALL_SKILLS_MATCHED;
        case 25: return CALL_SKILLS_CURRENT;
        case 26: return CALL_SKILLS_INITIAL;
        case 27: return SKILLS_CHANGED_DROPSKILLS;
        case 28: return SKILLS_CHANGED_ADDSKILLS;
        case 29: return REQUEUE;
        case 30: return SKILLS_CHANGED_REQUEUE;
        case 31: return SCRUB_OVERRIDE;
        case 32: return CALLBACK_RESUMING_WITH_MANUAL_CALL_START;
        case 33: return CALLBACK_RESUMING_WITH_MANUAL_CALL_FINISH;
        case 34: return CALLBACK_RESUMING_WITH_MANUAL_CALL_TIMEDOUT;
        case 35: return CALLBACK_RESUMING_WITH_MANUAL_CALL_REPLACED;
        case 36: return TRANSFER_HOLD;
        case 37: return TRANSFER_UNHOLD;
        case 38: return WARM_CALLER_TRANSFER_SOURCE_START;
        case 39: return WARM_CALLER_TRANSFER_DESTINATION_START;
        case 40: return WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL;
        case 41: return WARM_CALLER_TRANSFER_INVITE_CALLER;
        case 42: return WARM_CALLER_TRANSFER_END;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Enum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Enum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Enum>() {
            public Enum findValueByNumber(int number) {
              return Enum.forNumber(number);
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
      return com.tcn.cloud.api.api.commons.AgentCallLogActionKey.getDescriptor().getEnumTypes().get(0);
    }

    private static final Enum[] VALUES = values();

    public static Enum valueOf(
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

    private Enum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api.commons.AgentCallLogActionKey.Enum)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AgentCallLogActionKey)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AgentCallLogActionKey other = (com.tcn.cloud.api.api.commons.AgentCallLogActionKey) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AgentCallLogActionKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.commons.AgentCallLogActionKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AgentCallLogActionKey)
      com.tcn.cloud.api.api.commons.AgentCallLogActionKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentCallLogActionKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentCallLogActionKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AgentCallLogActionKey.class, com.tcn.cloud.api.api.commons.AgentCallLogActionKey.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AgentCallLogActionKey.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentCallLogActionKey_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentCallLogActionKey getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AgentCallLogActionKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentCallLogActionKey build() {
      com.tcn.cloud.api.api.commons.AgentCallLogActionKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentCallLogActionKey buildPartial() {
      com.tcn.cloud.api.api.commons.AgentCallLogActionKey result = new com.tcn.cloud.api.api.commons.AgentCallLogActionKey(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.AgentCallLogActionKey) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AgentCallLogActionKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AgentCallLogActionKey other) {
      if (other == com.tcn.cloud.api.api.commons.AgentCallLogActionKey.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.commons.AgentCallLogActionKey)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AgentCallLogActionKey)
  private static final com.tcn.cloud.api.api.commons.AgentCallLogActionKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AgentCallLogActionKey();
  }

  public static com.tcn.cloud.api.api.commons.AgentCallLogActionKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentCallLogActionKey>
      PARSER = new com.google.protobuf.AbstractParser<AgentCallLogActionKey>() {
    @java.lang.Override
    public AgentCallLogActionKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AgentCallLogActionKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentCallLogActionKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentCallLogActionKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

