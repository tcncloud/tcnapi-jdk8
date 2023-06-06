// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/asm_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * AsmAgentStateChangedEvent - whenever an agent's state changes
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.AsmAgentStateChangedEvent}
 */
public final class AsmAgentStateChangedEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.AsmAgentStateChangedEvent)
    AsmAgentStateChangedEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsmAgentStateChangedEvent.newBuilder() to construct.
  private AsmAgentStateChangedEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsmAgentStateChangedEvent() {
    userId_ = "";
    newStatus_ = 0;
    oldStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsmAgentStateChangedEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmAgentStateChangedEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.class, com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the id of the agent
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASM_SESSION_SID_FIELD_NUMBER = 2;
  private long asmSessionSid_ = 0L;
  /**
   * <pre>
   * the session sid generated when the agent logged into asm
   * </pre>
   *
   * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  @java.lang.Override
  public long getAsmSessionSid() {
    return asmSessionSid_;
  }

  public static final int NEW_STATUS_FIELD_NUMBER = 3;
  private int newStatus_ = 0;
  /**
   * <pre>
   * the agent's new status
   * </pre>
   *
   * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
   * @return The enum numeric value on the wire for newStatus.
   */
  @java.lang.Override public int getNewStatusValue() {
    return newStatus_;
  }
  /**
   * <pre>
   * the agent's new status
   * </pre>
   *
   * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
   * @return The newStatus.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.StatusState getNewStatus() {
    com.tcn.cloud.api.api.commons.StatusState result = com.tcn.cloud.api.api.commons.StatusState.forNumber(newStatus_);
    return result == null ? com.tcn.cloud.api.api.commons.StatusState.UNRECOGNIZED : result;
  }

  public static final int OLD_STATUS_FIELD_NUMBER = 4;
  private int oldStatus_ = 0;
  /**
   * <pre>
   * the agent's old status
   * </pre>
   *
   * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
   * @return The enum numeric value on the wire for oldStatus.
   */
  @java.lang.Override public int getOldStatusValue() {
    return oldStatus_;
  }
  /**
   * <pre>
   * the agent's old status
   * </pre>
   *
   * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
   * @return The oldStatus.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.StatusState getOldStatus() {
    com.tcn.cloud.api.api.commons.StatusState result = com.tcn.cloud.api.api.commons.StatusState.forNumber(oldStatus_);
    return result == null ? com.tcn.cloud.api.api.commons.StatusState.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (asmSessionSid_ != 0L) {
      output.writeInt64(2, asmSessionSid_);
    }
    if (newStatus_ != com.tcn.cloud.api.api.commons.StatusState.STATUS_STATE_UNKNOWN.getNumber()) {
      output.writeEnum(3, newStatus_);
    }
    if (oldStatus_ != com.tcn.cloud.api.api.commons.StatusState.STATUS_STATE_UNKNOWN.getNumber()) {
      output.writeEnum(4, oldStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (asmSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, asmSessionSid_);
    }
    if (newStatus_ != com.tcn.cloud.api.api.commons.StatusState.STATUS_STATE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, newStatus_);
    }
    if (oldStatus_ != com.tcn.cloud.api.api.commons.StatusState.STATUS_STATE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, oldStatus_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent other = (com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (getAsmSessionSid()
        != other.getAsmSessionSid()) return false;
    if (newStatus_ != other.newStatus_) return false;
    if (oldStatus_ != other.oldStatus_) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + ASM_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAsmSessionSid());
    hash = (37 * hash) + NEW_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + newStatus_;
    hash = (37 * hash) + OLD_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + oldStatus_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent prototype) {
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
   * <pre>
   * AsmAgentStateChangedEvent - whenever an agent's state changes
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.AsmAgentStateChangedEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.AsmAgentStateChangedEvent)
      com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmAgentStateChangedEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.class, com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = "";
      asmSessionSid_ = 0L;
      newStatus_ = 0;
      oldStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.AsmEventsProto.internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent build() {
      com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent result = new com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asmSessionSid_ = asmSessionSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newStatus_ = newStatus_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.oldStatus_ = oldStatus_;
      }
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAsmSessionSid() != 0L) {
        setAsmSessionSid(other.getAsmSessionSid());
      }
      if (other.newStatus_ != 0) {
        setNewStatusValue(other.getNewStatusValue());
      }
      if (other.oldStatus_ != 0) {
        setOldStatusValue(other.getOldStatusValue());
      }
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
            case 10: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              asmSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              newStatus_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              oldStatus_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
    private int bitField0_;

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the id of the agent
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long asmSessionSid_ ;
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @return The asmSessionSid.
     */
    @java.lang.Override
    public long getAsmSessionSid() {
      return asmSessionSid_;
    }
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @param value The asmSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAsmSessionSid(long value) {

      asmSessionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the session sid generated when the agent logged into asm
     * </pre>
     *
     * <code>int64 asm_session_sid = 2 [json_name = "asmSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsmSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asmSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private int newStatus_ = 0;
    /**
     * <pre>
     * the agent's new status
     * </pre>
     *
     * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
     * @return The enum numeric value on the wire for newStatus.
     */
    @java.lang.Override public int getNewStatusValue() {
      return newStatus_;
    }
    /**
     * <pre>
     * the agent's new status
     * </pre>
     *
     * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
     * @param value The enum numeric value on the wire for newStatus to set.
     * @return This builder for chaining.
     */
    public Builder setNewStatusValue(int value) {
      newStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the agent's new status
     * </pre>
     *
     * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
     * @return The newStatus.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.StatusState getNewStatus() {
      com.tcn.cloud.api.api.commons.StatusState result = com.tcn.cloud.api.api.commons.StatusState.forNumber(newStatus_);
      return result == null ? com.tcn.cloud.api.api.commons.StatusState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the agent's new status
     * </pre>
     *
     * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
     * @param value The newStatus to set.
     * @return This builder for chaining.
     */
    public Builder setNewStatus(com.tcn.cloud.api.api.commons.StatusState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      newStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the agent's new status
     * </pre>
     *
     * <code>.api.commons.StatusState new_status = 3 [json_name = "newStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      newStatus_ = 0;
      onChanged();
      return this;
    }

    private int oldStatus_ = 0;
    /**
     * <pre>
     * the agent's old status
     * </pre>
     *
     * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
     * @return The enum numeric value on the wire for oldStatus.
     */
    @java.lang.Override public int getOldStatusValue() {
      return oldStatus_;
    }
    /**
     * <pre>
     * the agent's old status
     * </pre>
     *
     * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
     * @param value The enum numeric value on the wire for oldStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOldStatusValue(int value) {
      oldStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the agent's old status
     * </pre>
     *
     * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
     * @return The oldStatus.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.StatusState getOldStatus() {
      com.tcn.cloud.api.api.commons.StatusState result = com.tcn.cloud.api.api.commons.StatusState.forNumber(oldStatus_);
      return result == null ? com.tcn.cloud.api.api.commons.StatusState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the agent's old status
     * </pre>
     *
     * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
     * @param value The oldStatus to set.
     * @return This builder for chaining.
     */
    public Builder setOldStatus(com.tcn.cloud.api.api.commons.StatusState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      oldStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the agent's old status
     * </pre>
     *
     * <code>.api.commons.StatusState old_status = 4 [json_name = "oldStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOldStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      oldStatus_ = 0;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.AsmAgentStateChangedEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.AsmAgentStateChangedEvent)
  private static final com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsmAgentStateChangedEvent>
      PARSER = new com.google.protobuf.AbstractParser<AsmAgentStateChangedEvent>() {
    @java.lang.Override
    public AsmAgentStateChangedEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<AsmAgentStateChangedEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsmAgentStateChangedEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.AsmAgentStateChangedEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

