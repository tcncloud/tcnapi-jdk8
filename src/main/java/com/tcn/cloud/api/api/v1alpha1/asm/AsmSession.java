// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

/**
 * Protobuf type {@code api.v1alpha1.asm.AsmSession}
 */
public final class AsmSession extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.asm.AsmSession)
    AsmSessionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AsmSession.newBuilder() to construct.
  private AsmSession(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AsmSession() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AsmSession();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AsmSession_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AsmSession_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.class, com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.Builder.class);
  }

  public static final int ASM_SESSION_SID_FIELD_NUMBER = 1;
  private long asmSessionSid_ = 0L;
  /**
   * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  @java.lang.Override
  public long getAsmSessionSid() {
    return asmSessionSid_;
  }

  public static final int ASM_SESSION_START_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp asmSessionStart_;
  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return Whether the asmSessionStart field is set.
   */
  @java.lang.Override
  public boolean hasAsmSessionStart() {
    return asmSessionStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   * @return The asmSessionStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAsmSessionStart() {
    return asmSessionStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAsmSessionStartOrBuilder() {
    return asmSessionStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionStart_;
  }

  public static final int ASM_SESSION_END_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp asmSessionEnd_;
  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return Whether the asmSessionEnd field is set.
   */
  @java.lang.Override
  public boolean hasAsmSessionEnd() {
    return asmSessionEnd_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   * @return The asmSessionEnd.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAsmSessionEnd() {
    return asmSessionEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionEnd_;
  }
  /**
   * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAsmSessionEndOrBuilder() {
    return asmSessionEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionEnd_;
  }

  public static final int VOICE_SESSION_FIELD_NUMBER = 6;
  private com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession voiceSession_;
  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return Whether the voiceSession field is set.
   */
  @java.lang.Override
  public boolean hasVoiceSession() {
    return voiceSession_ != null;
  }
  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   * @return The voiceSession.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession getVoiceSession() {
    return voiceSession_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.getDefaultInstance() : voiceSession_;
  }
  /**
   * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder getVoiceSessionOrBuilder() {
    return voiceSession_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.getDefaultInstance() : voiceSession_;
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
    if (asmSessionSid_ != 0L) {
      output.writeInt64(1, asmSessionSid_);
    }
    if (asmSessionStart_ != null) {
      output.writeMessage(4, getAsmSessionStart());
    }
    if (asmSessionEnd_ != null) {
      output.writeMessage(5, getAsmSessionEnd());
    }
    if (voiceSession_ != null) {
      output.writeMessage(6, getVoiceSession());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (asmSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, asmSessionSid_);
    }
    if (asmSessionStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAsmSessionStart());
    }
    if (asmSessionEnd_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getAsmSessionEnd());
    }
    if (voiceSession_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getVoiceSession());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.asm.AsmSession)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.asm.AsmSession other = (com.tcn.cloud.api.api.v1alpha1.asm.AsmSession) obj;

    if (getAsmSessionSid()
        != other.getAsmSessionSid()) return false;
    if (hasAsmSessionStart() != other.hasAsmSessionStart()) return false;
    if (hasAsmSessionStart()) {
      if (!getAsmSessionStart()
          .equals(other.getAsmSessionStart())) return false;
    }
    if (hasAsmSessionEnd() != other.hasAsmSessionEnd()) return false;
    if (hasAsmSessionEnd()) {
      if (!getAsmSessionEnd()
          .equals(other.getAsmSessionEnd())) return false;
    }
    if (hasVoiceSession() != other.hasVoiceSession()) return false;
    if (hasVoiceSession()) {
      if (!getVoiceSession()
          .equals(other.getVoiceSession())) return false;
    }
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
    hash = (37 * hash) + ASM_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAsmSessionSid());
    if (hasAsmSessionStart()) {
      hash = (37 * hash) + ASM_SESSION_START_FIELD_NUMBER;
      hash = (53 * hash) + getAsmSessionStart().hashCode();
    }
    if (hasAsmSessionEnd()) {
      hash = (37 * hash) + ASM_SESSION_END_FIELD_NUMBER;
      hash = (53 * hash) + getAsmSessionEnd().hashCode();
    }
    if (hasVoiceSession()) {
      hash = (37 * hash) + VOICE_SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getVoiceSession().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.asm.AsmSession prototype) {
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
   * Protobuf type {@code api.v1alpha1.asm.AsmSession}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.asm.AsmSession)
      com.tcn.cloud.api.api.v1alpha1.asm.AsmSessionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AsmSession_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AsmSession_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.class, com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.newBuilder()
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
      asmSessionSid_ = 0L;
      asmSessionStart_ = null;
      if (asmSessionStartBuilder_ != null) {
        asmSessionStartBuilder_.dispose();
        asmSessionStartBuilder_ = null;
      }
      asmSessionEnd_ = null;
      if (asmSessionEndBuilder_ != null) {
        asmSessionEndBuilder_.dispose();
        asmSessionEndBuilder_ = null;
      }
      voiceSession_ = null;
      if (voiceSessionBuilder_ != null) {
        voiceSessionBuilder_.dispose();
        voiceSessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_AsmSession_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession build() {
      com.tcn.cloud.api.api.v1alpha1.asm.AsmSession result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.asm.AsmSession result = new com.tcn.cloud.api.api.v1alpha1.asm.AsmSession(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.asm.AsmSession result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asmSessionSid_ = asmSessionSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asmSessionStart_ = asmSessionStartBuilder_ == null
            ? asmSessionStart_
            : asmSessionStartBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.asmSessionEnd_ = asmSessionEndBuilder_ == null
            ? asmSessionEnd_
            : asmSessionEndBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.voiceSession_ = voiceSessionBuilder_ == null
            ? voiceSession_
            : voiceSessionBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.asm.AsmSession) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.asm.AsmSession)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.asm.AsmSession other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.asm.AsmSession.getDefaultInstance()) return this;
      if (other.getAsmSessionSid() != 0L) {
        setAsmSessionSid(other.getAsmSessionSid());
      }
      if (other.hasAsmSessionStart()) {
        mergeAsmSessionStart(other.getAsmSessionStart());
      }
      if (other.hasAsmSessionEnd()) {
        mergeAsmSessionEnd(other.getAsmSessionEnd());
      }
      if (other.hasVoiceSession()) {
        mergeVoiceSession(other.getVoiceSession());
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
            case 8: {
              asmSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 34: {
              input.readMessage(
                  getAsmSessionStartFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getAsmSessionEndFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getVoiceSessionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 50
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

    private long asmSessionSid_ ;
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @return The asmSessionSid.
     */
    @java.lang.Override
    public long getAsmSessionSid() {
      return asmSessionSid_;
    }
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @param value The asmSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAsmSessionSid(long value) {

      asmSessionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsmSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      asmSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp asmSessionStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> asmSessionStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     * @return Whether the asmSessionStart field is set.
     */
    public boolean hasAsmSessionStart() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     * @return The asmSessionStart.
     */
    public com.google.protobuf.Timestamp getAsmSessionStart() {
      if (asmSessionStartBuilder_ == null) {
        return asmSessionStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionStart_;
      } else {
        return asmSessionStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public Builder setAsmSessionStart(com.google.protobuf.Timestamp value) {
      if (asmSessionStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asmSessionStart_ = value;
      } else {
        asmSessionStartBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public Builder setAsmSessionStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (asmSessionStartBuilder_ == null) {
        asmSessionStart_ = builderForValue.build();
      } else {
        asmSessionStartBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public Builder mergeAsmSessionStart(com.google.protobuf.Timestamp value) {
      if (asmSessionStartBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          asmSessionStart_ != null &&
          asmSessionStart_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getAsmSessionStartBuilder().mergeFrom(value);
        } else {
          asmSessionStart_ = value;
        }
      } else {
        asmSessionStartBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public Builder clearAsmSessionStart() {
      bitField0_ = (bitField0_ & ~0x00000002);
      asmSessionStart_ = null;
      if (asmSessionStartBuilder_ != null) {
        asmSessionStartBuilder_.dispose();
        asmSessionStartBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getAsmSessionStartBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAsmSessionStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAsmSessionStartOrBuilder() {
      if (asmSessionStartBuilder_ != null) {
        return asmSessionStartBuilder_.getMessageOrBuilder();
      } else {
        return asmSessionStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_start = 4 [json_name = "asmSessionStart"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAsmSessionStartFieldBuilder() {
      if (asmSessionStartBuilder_ == null) {
        asmSessionStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAsmSessionStart(),
                getParentForChildren(),
                isClean());
        asmSessionStart_ = null;
      }
      return asmSessionStartBuilder_;
    }

    private com.google.protobuf.Timestamp asmSessionEnd_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> asmSessionEndBuilder_;
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     * @return Whether the asmSessionEnd field is set.
     */
    public boolean hasAsmSessionEnd() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     * @return The asmSessionEnd.
     */
    public com.google.protobuf.Timestamp getAsmSessionEnd() {
      if (asmSessionEndBuilder_ == null) {
        return asmSessionEnd_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionEnd_;
      } else {
        return asmSessionEndBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public Builder setAsmSessionEnd(com.google.protobuf.Timestamp value) {
      if (asmSessionEndBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asmSessionEnd_ = value;
      } else {
        asmSessionEndBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public Builder setAsmSessionEnd(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (asmSessionEndBuilder_ == null) {
        asmSessionEnd_ = builderForValue.build();
      } else {
        asmSessionEndBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public Builder mergeAsmSessionEnd(com.google.protobuf.Timestamp value) {
      if (asmSessionEndBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          asmSessionEnd_ != null &&
          asmSessionEnd_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getAsmSessionEndBuilder().mergeFrom(value);
        } else {
          asmSessionEnd_ = value;
        }
      } else {
        asmSessionEndBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public Builder clearAsmSessionEnd() {
      bitField0_ = (bitField0_ & ~0x00000004);
      asmSessionEnd_ = null;
      if (asmSessionEndBuilder_ != null) {
        asmSessionEndBuilder_.dispose();
        asmSessionEndBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getAsmSessionEndBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAsmSessionEndFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAsmSessionEndOrBuilder() {
      if (asmSessionEndBuilder_ != null) {
        return asmSessionEndBuilder_.getMessageOrBuilder();
      } else {
        return asmSessionEnd_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : asmSessionEnd_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp asm_session_end = 5 [json_name = "asmSessionEnd"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAsmSessionEndFieldBuilder() {
      if (asmSessionEndBuilder_ == null) {
        asmSessionEndBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAsmSessionEnd(),
                getParentForChildren(),
                isClean());
        asmSessionEnd_ = null;
      }
      return asmSessionEndBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession voiceSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.Builder, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder> voiceSessionBuilder_;
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     * @return Whether the voiceSession field is set.
     */
    public boolean hasVoiceSession() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     * @return The voiceSession.
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession getVoiceSession() {
      if (voiceSessionBuilder_ == null) {
        return voiceSession_ == null ? com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.getDefaultInstance() : voiceSession_;
      } else {
        return voiceSessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public Builder setVoiceSession(com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession value) {
      if (voiceSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        voiceSession_ = value;
      } else {
        voiceSessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public Builder setVoiceSession(
        com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.Builder builderForValue) {
      if (voiceSessionBuilder_ == null) {
        voiceSession_ = builderForValue.build();
      } else {
        voiceSessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public Builder mergeVoiceSession(com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession value) {
      if (voiceSessionBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          voiceSession_ != null &&
          voiceSession_ != com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.getDefaultInstance()) {
          getVoiceSessionBuilder().mergeFrom(value);
        } else {
          voiceSession_ = value;
        }
      } else {
        voiceSessionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public Builder clearVoiceSession() {
      bitField0_ = (bitField0_ & ~0x00000008);
      voiceSession_ = null;
      if (voiceSessionBuilder_ != null) {
        voiceSessionBuilder_.dispose();
        voiceSessionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.Builder getVoiceSessionBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getVoiceSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder getVoiceSessionOrBuilder() {
      if (voiceSessionBuilder_ != null) {
        return voiceSessionBuilder_.getMessageOrBuilder();
      } else {
        return voiceSession_ == null ?
            com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.getDefaultInstance() : voiceSession_;
      }
    }
    /**
     * <code>.api.v1alpha1.asm.VoiceSession voice_session = 6 [json_name = "voiceSession"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.Builder, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder> 
        getVoiceSessionFieldBuilder() {
      if (voiceSessionBuilder_ == null) {
        voiceSessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSession.Builder, com.tcn.cloud.api.api.v1alpha1.asm.VoiceSessionOrBuilder>(
                getVoiceSession(),
                getParentForChildren(),
                isClean());
        voiceSession_ = null;
      }
      return voiceSessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.asm.AsmSession)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.asm.AsmSession)
  private static final com.tcn.cloud.api.api.v1alpha1.asm.AsmSession DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.asm.AsmSession();
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.AsmSession getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsmSession>
      PARSER = new com.google.protobuf.AbstractParser<AsmSession>() {
    @java.lang.Override
    public AsmSession parsePartialFrom(
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

  public static com.google.protobuf.Parser<AsmSession> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsmSession> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.AsmSession getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

