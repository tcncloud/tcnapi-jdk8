// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.AgentStatus}
 */
public final class AgentStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AgentStatus)
    AgentStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentStatus.newBuilder() to construct.
  private AgentStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentStatus() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AgentStatus.class, com.tcn.cloud.api.api.commons.AgentStatus.Builder.class);
  }

  /**
   * Protobuf enum {@code api.commons.AgentStatus.Enum}
   */
  public enum Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNAVALIABLE = 0;</code>
     */
    UNAVALIABLE(0),
    /**
     * <code>IDLE = 1;</code>
     */
    IDLE(1),
    /**
     * <code>READY = 2;</code>
     */
    READY(2),
    /**
     * <code>HUNGUP = 3;</code>
     */
    HUNGUP(3),
    /**
     * <code>DESTROYED = 4;</code>
     */
    DESTROYED(4),
    /**
     * <code>PEERED = 5;</code>
     */
    PEERED(5),
    /**
     * <code>PAUSED = 6;</code>
     */
    PAUSED(6),
    /**
     * <code>WRAPUP = 7;</code>
     */
    WRAPUP(7),
    /**
     * <code>PREPARING_AFTER_IDLE = 8;</code>
     */
    PREPARING_AFTER_IDLE(8),
    /**
     * <code>PREPARING_AFTER_WRAPUP = 9;</code>
     */
    PREPARING_AFTER_WRAPUP(9),
    /**
     * <code>PREPARING_AFTER_PAUSE = 10;</code>
     */
    PREPARING_AFTER_PAUSE(10),
    /**
     * <code>PREPARING_AFTER_DIAL_CANCEL = 11;</code>
     */
    PREPARING_AFTER_DIAL_CANCEL(11),
    /**
     * <code>PREPARING_AFTER_PBX_REJECT = 12;</code>
     */
    PREPARING_AFTER_PBX_REJECT(12),
    /**
     * <code>PREPARING_AFTER_PBX_HANGUP = 13;</code>
     */
    PREPARING_AFTER_PBX_HANGUP(13),
    /**
     * <code>PREPARING_AFTER_PBX_WAS_TAKEN = 14;</code>
     */
    PREPARING_AFTER_PBX_WAS_TAKEN(14),
    /**
     * <code>PREPARING_AFTER_GUI_BUSY = 15;</code>
     */
    PREPARING_AFTER_GUI_BUSY(15),
    /**
     * <code>MANUAL_DIAL_PREPARED = 16;</code>
     */
    MANUAL_DIAL_PREPARED(16),
    /**
     * <code>PREVIEW_DIAL_PREPARED = 17;</code>
     */
    PREVIEW_DIAL_PREPARED(17),
    /**
     * <code>MANUAL_DIAL_STARTED = 18;</code>
     */
    MANUAL_DIAL_STARTED(18),
    /**
     * <code>PREVIEW_DIAL_STARTED = 19;</code>
     */
    PREVIEW_DIAL_STARTED(19),
    /**
     * <code>OUTBOUND_LOCKED = 20;</code>
     */
    OUTBOUND_LOCKED(20),
    /**
     * <code>WARM_AGENT_TRANSFER_STARTED_SOURCE = 21;</code>
     */
    WARM_AGENT_TRANSFER_STARTED_SOURCE(21),
    /**
     * <code>WARM_AGENT_TRANSFER_STARTED_DESTINATION = 22;</code>
     */
    WARM_AGENT_TRANSFER_STARTED_DESTINATION(22),
    /**
     * <code>WARM_OUTBOUND_TRANSFER_STARTED = 23;</code>
     */
    WARM_OUTBOUND_TRANSFER_STARTED(23),
    /**
     * <code>WARM_OUTBOUND_TRANSFER_PEER_LOST = 24;</code>
     */
    WARM_OUTBOUND_TRANSFER_PEER_LOST(24),
    /**
     * <code>PBX_POPUP_LOCKED = 25;</code>
     */
    PBX_POPUP_LOCKED(25),
    /**
     * <code>PEERED_WITH_CALL_ON_HOLD = 26;</code>
     */
    PEERED_WITH_CALL_ON_HOLD(26),
    /**
     * <code>CALLBACK_RESUMING = 27;</code>
     */
    CALLBACK_RESUMING(27),
    /**
     * <code>GUI_BUSY = 28;</code>
     */
    GUI_BUSY(28),
    /**
     * <code>INTERCOM = 29;</code>
     */
    INTERCOM(29),
    /**
     * <code>INTERCOM_RINGING_SOURCE = 30;</code>
     */
    INTERCOM_RINGING_SOURCE(30),
    /**
     * <code>INTERCOM_RINGING_DESTINATION = 31;</code>
     */
    INTERCOM_RINGING_DESTINATION(31),
    /**
     * <code>WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST = 32;</code>
     */
    WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST(32),
    /**
     * <code>PREPARED_TO_PEER = 33;</code>
     */
    PREPARED_TO_PEER(33),
    /**
     * <code>WARM_SKILL_TRANSFER_SOURCE_PENDING = 34;</code>
     */
    WARM_SKILL_TRANSFER_SOURCE_PENDING(34),
    /**
     * <pre>
     * when the transfer has started
     * </pre>
     *
     * <code>CALLER_TRANSFER_STARTED = 35;</code>
     */
    CALLER_TRANSFER_STARTED(35),
    /**
     * <pre>
     * when the transfer is running and the peer hangs up
     * </pre>
     *
     * <code>CALLER_TRANSFER_LOST_PEER = 36;</code>
     */
    CALLER_TRANSFER_LOST_PEER(36),
    /**
     * <pre>
     * when the transfer is running and the dest caller hangs up
     * </pre>
     *
     * <code>CALLER_TRANSFER_LOST_MERGED_CALLER = 37;</code>
     */
    CALLER_TRANSFER_LOST_MERGED_CALLER(37),
    /**
     * <pre>
     * interim state for cold outbound transfer
     * </pre>
     *
     * <code>COLD_OUTBOUND_TRANSFER_STARTED = 38;</code>
     */
    COLD_OUTBOUND_TRANSFER_STARTED(38),
    /**
     * <pre>
     * interim state for cold agent transfer
     * </pre>
     *
     * <code>COLD_AGENT_TRANSFER_STARTED = 39;</code>
     */
    COLD_AGENT_TRANSFER_STARTED(39),
    /**
     * <pre>
     * ready to select which portal to be processed
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_PREPARED = 40;</code>
     */
    SECURE_FORM_HANDLING_PREPARED(40),
    /**
     * <pre>
     * agent can fill out form fields on the portal
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_AGENT_PROCESSING = 41;</code>
     */
    SECURE_FORM_HANDLING_AGENT_PROCESSING(41),
    /**
     * <pre>
     * the caller inputting forms on portal using dtmf tones
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_CALLER_COLLECT = 42;</code>
     */
    SECURE_FORM_HANDLING_CALLER_COLLECT(42),
    /**
     * <pre>
     * portal did not finish
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_CANCELLED = 43;</code>
     */
    SECURE_FORM_HANDLING_CANCELLED(43),
    /**
     * <pre>
     * portal finished
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_FINISHED = 44;</code>
     */
    SECURE_FORM_HANDLING_FINISHED(44),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNAVALIABLE = 0;</code>
     */
    public static final int UNAVALIABLE_VALUE = 0;
    /**
     * <code>IDLE = 1;</code>
     */
    public static final int IDLE_VALUE = 1;
    /**
     * <code>READY = 2;</code>
     */
    public static final int READY_VALUE = 2;
    /**
     * <code>HUNGUP = 3;</code>
     */
    public static final int HUNGUP_VALUE = 3;
    /**
     * <code>DESTROYED = 4;</code>
     */
    public static final int DESTROYED_VALUE = 4;
    /**
     * <code>PEERED = 5;</code>
     */
    public static final int PEERED_VALUE = 5;
    /**
     * <code>PAUSED = 6;</code>
     */
    public static final int PAUSED_VALUE = 6;
    /**
     * <code>WRAPUP = 7;</code>
     */
    public static final int WRAPUP_VALUE = 7;
    /**
     * <code>PREPARING_AFTER_IDLE = 8;</code>
     */
    public static final int PREPARING_AFTER_IDLE_VALUE = 8;
    /**
     * <code>PREPARING_AFTER_WRAPUP = 9;</code>
     */
    public static final int PREPARING_AFTER_WRAPUP_VALUE = 9;
    /**
     * <code>PREPARING_AFTER_PAUSE = 10;</code>
     */
    public static final int PREPARING_AFTER_PAUSE_VALUE = 10;
    /**
     * <code>PREPARING_AFTER_DIAL_CANCEL = 11;</code>
     */
    public static final int PREPARING_AFTER_DIAL_CANCEL_VALUE = 11;
    /**
     * <code>PREPARING_AFTER_PBX_REJECT = 12;</code>
     */
    public static final int PREPARING_AFTER_PBX_REJECT_VALUE = 12;
    /**
     * <code>PREPARING_AFTER_PBX_HANGUP = 13;</code>
     */
    public static final int PREPARING_AFTER_PBX_HANGUP_VALUE = 13;
    /**
     * <code>PREPARING_AFTER_PBX_WAS_TAKEN = 14;</code>
     */
    public static final int PREPARING_AFTER_PBX_WAS_TAKEN_VALUE = 14;
    /**
     * <code>PREPARING_AFTER_GUI_BUSY = 15;</code>
     */
    public static final int PREPARING_AFTER_GUI_BUSY_VALUE = 15;
    /**
     * <code>MANUAL_DIAL_PREPARED = 16;</code>
     */
    public static final int MANUAL_DIAL_PREPARED_VALUE = 16;
    /**
     * <code>PREVIEW_DIAL_PREPARED = 17;</code>
     */
    public static final int PREVIEW_DIAL_PREPARED_VALUE = 17;
    /**
     * <code>MANUAL_DIAL_STARTED = 18;</code>
     */
    public static final int MANUAL_DIAL_STARTED_VALUE = 18;
    /**
     * <code>PREVIEW_DIAL_STARTED = 19;</code>
     */
    public static final int PREVIEW_DIAL_STARTED_VALUE = 19;
    /**
     * <code>OUTBOUND_LOCKED = 20;</code>
     */
    public static final int OUTBOUND_LOCKED_VALUE = 20;
    /**
     * <code>WARM_AGENT_TRANSFER_STARTED_SOURCE = 21;</code>
     */
    public static final int WARM_AGENT_TRANSFER_STARTED_SOURCE_VALUE = 21;
    /**
     * <code>WARM_AGENT_TRANSFER_STARTED_DESTINATION = 22;</code>
     */
    public static final int WARM_AGENT_TRANSFER_STARTED_DESTINATION_VALUE = 22;
    /**
     * <code>WARM_OUTBOUND_TRANSFER_STARTED = 23;</code>
     */
    public static final int WARM_OUTBOUND_TRANSFER_STARTED_VALUE = 23;
    /**
     * <code>WARM_OUTBOUND_TRANSFER_PEER_LOST = 24;</code>
     */
    public static final int WARM_OUTBOUND_TRANSFER_PEER_LOST_VALUE = 24;
    /**
     * <code>PBX_POPUP_LOCKED = 25;</code>
     */
    public static final int PBX_POPUP_LOCKED_VALUE = 25;
    /**
     * <code>PEERED_WITH_CALL_ON_HOLD = 26;</code>
     */
    public static final int PEERED_WITH_CALL_ON_HOLD_VALUE = 26;
    /**
     * <code>CALLBACK_RESUMING = 27;</code>
     */
    public static final int CALLBACK_RESUMING_VALUE = 27;
    /**
     * <code>GUI_BUSY = 28;</code>
     */
    public static final int GUI_BUSY_VALUE = 28;
    /**
     * <code>INTERCOM = 29;</code>
     */
    public static final int INTERCOM_VALUE = 29;
    /**
     * <code>INTERCOM_RINGING_SOURCE = 30;</code>
     */
    public static final int INTERCOM_RINGING_SOURCE_VALUE = 30;
    /**
     * <code>INTERCOM_RINGING_DESTINATION = 31;</code>
     */
    public static final int INTERCOM_RINGING_DESTINATION_VALUE = 31;
    /**
     * <code>WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST = 32;</code>
     */
    public static final int WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST_VALUE = 32;
    /**
     * <code>PREPARED_TO_PEER = 33;</code>
     */
    public static final int PREPARED_TO_PEER_VALUE = 33;
    /**
     * <code>WARM_SKILL_TRANSFER_SOURCE_PENDING = 34;</code>
     */
    public static final int WARM_SKILL_TRANSFER_SOURCE_PENDING_VALUE = 34;
    /**
     * <pre>
     * when the transfer has started
     * </pre>
     *
     * <code>CALLER_TRANSFER_STARTED = 35;</code>
     */
    public static final int CALLER_TRANSFER_STARTED_VALUE = 35;
    /**
     * <pre>
     * when the transfer is running and the peer hangs up
     * </pre>
     *
     * <code>CALLER_TRANSFER_LOST_PEER = 36;</code>
     */
    public static final int CALLER_TRANSFER_LOST_PEER_VALUE = 36;
    /**
     * <pre>
     * when the transfer is running and the dest caller hangs up
     * </pre>
     *
     * <code>CALLER_TRANSFER_LOST_MERGED_CALLER = 37;</code>
     */
    public static final int CALLER_TRANSFER_LOST_MERGED_CALLER_VALUE = 37;
    /**
     * <pre>
     * interim state for cold outbound transfer
     * </pre>
     *
     * <code>COLD_OUTBOUND_TRANSFER_STARTED = 38;</code>
     */
    public static final int COLD_OUTBOUND_TRANSFER_STARTED_VALUE = 38;
    /**
     * <pre>
     * interim state for cold agent transfer
     * </pre>
     *
     * <code>COLD_AGENT_TRANSFER_STARTED = 39;</code>
     */
    public static final int COLD_AGENT_TRANSFER_STARTED_VALUE = 39;
    /**
     * <pre>
     * ready to select which portal to be processed
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_PREPARED = 40;</code>
     */
    public static final int SECURE_FORM_HANDLING_PREPARED_VALUE = 40;
    /**
     * <pre>
     * agent can fill out form fields on the portal
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_AGENT_PROCESSING = 41;</code>
     */
    public static final int SECURE_FORM_HANDLING_AGENT_PROCESSING_VALUE = 41;
    /**
     * <pre>
     * the caller inputting forms on portal using dtmf tones
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_CALLER_COLLECT = 42;</code>
     */
    public static final int SECURE_FORM_HANDLING_CALLER_COLLECT_VALUE = 42;
    /**
     * <pre>
     * portal did not finish
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_CANCELLED = 43;</code>
     */
    public static final int SECURE_FORM_HANDLING_CANCELLED_VALUE = 43;
    /**
     * <pre>
     * portal finished
     * </pre>
     *
     * <code>SECURE_FORM_HANDLING_FINISHED = 44;</code>
     */
    public static final int SECURE_FORM_HANDLING_FINISHED_VALUE = 44;


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
        case 0: return UNAVALIABLE;
        case 1: return IDLE;
        case 2: return READY;
        case 3: return HUNGUP;
        case 4: return DESTROYED;
        case 5: return PEERED;
        case 6: return PAUSED;
        case 7: return WRAPUP;
        case 8: return PREPARING_AFTER_IDLE;
        case 9: return PREPARING_AFTER_WRAPUP;
        case 10: return PREPARING_AFTER_PAUSE;
        case 11: return PREPARING_AFTER_DIAL_CANCEL;
        case 12: return PREPARING_AFTER_PBX_REJECT;
        case 13: return PREPARING_AFTER_PBX_HANGUP;
        case 14: return PREPARING_AFTER_PBX_WAS_TAKEN;
        case 15: return PREPARING_AFTER_GUI_BUSY;
        case 16: return MANUAL_DIAL_PREPARED;
        case 17: return PREVIEW_DIAL_PREPARED;
        case 18: return MANUAL_DIAL_STARTED;
        case 19: return PREVIEW_DIAL_STARTED;
        case 20: return OUTBOUND_LOCKED;
        case 21: return WARM_AGENT_TRANSFER_STARTED_SOURCE;
        case 22: return WARM_AGENT_TRANSFER_STARTED_DESTINATION;
        case 23: return WARM_OUTBOUND_TRANSFER_STARTED;
        case 24: return WARM_OUTBOUND_TRANSFER_PEER_LOST;
        case 25: return PBX_POPUP_LOCKED;
        case 26: return PEERED_WITH_CALL_ON_HOLD;
        case 27: return CALLBACK_RESUMING;
        case 28: return GUI_BUSY;
        case 29: return INTERCOM;
        case 30: return INTERCOM_RINGING_SOURCE;
        case 31: return INTERCOM_RINGING_DESTINATION;
        case 32: return WARM_OUTBOUND_TRANSFER_OUTBOUND_LOST;
        case 33: return PREPARED_TO_PEER;
        case 34: return WARM_SKILL_TRANSFER_SOURCE_PENDING;
        case 35: return CALLER_TRANSFER_STARTED;
        case 36: return CALLER_TRANSFER_LOST_PEER;
        case 37: return CALLER_TRANSFER_LOST_MERGED_CALLER;
        case 38: return COLD_OUTBOUND_TRANSFER_STARTED;
        case 39: return COLD_AGENT_TRANSFER_STARTED;
        case 40: return SECURE_FORM_HANDLING_PREPARED;
        case 41: return SECURE_FORM_HANDLING_AGENT_PROCESSING;
        case 42: return SECURE_FORM_HANDLING_CALLER_COLLECT;
        case 43: return SECURE_FORM_HANDLING_CANCELLED;
        case 44: return SECURE_FORM_HANDLING_FINISHED;
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
      return com.tcn.cloud.api.api.commons.AgentStatus.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:api.commons.AgentStatus.Enum)
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AgentStatus)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AgentStatus other = (com.tcn.cloud.api.api.commons.AgentStatus) obj;

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

  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AgentStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AgentStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentStatus parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AgentStatus prototype) {
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
   * Protobuf type {@code api.commons.AgentStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AgentStatus)
      com.tcn.cloud.api.api.commons.AgentStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AgentStatus.class, com.tcn.cloud.api.api.commons.AgentStatus.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AgentStatus.newBuilder()
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
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentStatus_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStatus getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AgentStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStatus build() {
      com.tcn.cloud.api.api.commons.AgentStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStatus buildPartial() {
      com.tcn.cloud.api.api.commons.AgentStatus result = new com.tcn.cloud.api.api.commons.AgentStatus(this);
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
      if (other instanceof com.tcn.cloud.api.api.commons.AgentStatus) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AgentStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AgentStatus other) {
      if (other == com.tcn.cloud.api.api.commons.AgentStatus.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AgentStatus)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AgentStatus)
  private static final com.tcn.cloud.api.api.commons.AgentStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AgentStatus();
  }

  public static com.tcn.cloud.api.api.commons.AgentStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentStatus>
      PARSER = new com.google.protobuf.AbstractParser<AgentStatus>() {
    @java.lang.Override
    public AgentStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

