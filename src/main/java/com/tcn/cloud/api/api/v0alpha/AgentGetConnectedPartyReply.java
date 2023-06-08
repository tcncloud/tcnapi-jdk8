// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AgentGetConnectedPartyReply}
 */
public final class AgentGetConnectedPartyReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AgentGetConnectedPartyReply)
    AgentGetConnectedPartyReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentGetConnectedPartyReply.newBuilder() to construct.
  private AgentGetConnectedPartyReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentGetConnectedPartyReply() {
    callType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentGetConnectedPartyReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentGetConnectedPartyReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentGetConnectedPartyReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.class, com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.Builder.class);
  }

  public static final int CALL_ID_FIELD_NUMBER = 2;
  private long callId_ = 0L;
  /**
   * <code>int64 call_id = 2 [json_name = "callId"];</code>
   * @return The callId.
   */
  @java.lang.Override
  public long getCallId() {
    return callId_;
  }

  public static final int CALL_TYPE_FIELD_NUMBER = 3;
  private int callType_ = 0;
  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  @java.lang.Override public int getCallTypeValue() {
    return callType_;
  }
  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The callType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
    com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
    return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
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
    if (callId_ != 0L) {
      output.writeInt64(2, callId_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      output.writeEnum(3, callType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, callId_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, callType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply other = (com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply) obj;

    if (getCallId()
        != other.getCallId()) return false;
    if (callType_ != other.callType_) return false;
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
    hash = (37 * hash) + CALL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCallId());
    hash = (37 * hash) + CALL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + callType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply prototype) {
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
   * Protobuf type {@code api.v0alpha.AgentGetConnectedPartyReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AgentGetConnectedPartyReply)
      com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentGetConnectedPartyReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentGetConnectedPartyReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.class, com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.newBuilder()
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
      callId_ = 0L;
      callType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentGetConnectedPartyReply_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply build() {
      com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply result = new com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callId_ = callId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.callType_ = callType_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply.getDefaultInstance()) return this;
      if (other.getCallId() != 0L) {
        setCallId(other.getCallId());
      }
      if (other.callType_ != 0) {
        setCallTypeValue(other.getCallTypeValue());
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
            case 16: {
              callId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              callType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private long callId_ ;
    /**
     * <code>int64 call_id = 2 [json_name = "callId"];</code>
     * @return The callId.
     */
    @java.lang.Override
    public long getCallId() {
      return callId_;
    }
    /**
     * <code>int64 call_id = 2 [json_name = "callId"];</code>
     * @param value The callId to set.
     * @return This builder for chaining.
     */
    public Builder setCallId(long value) {

      callId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 call_id = 2 [json_name = "callId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callId_ = 0L;
      onChanged();
      return this;
    }

    private int callType_ = 0;
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return The enum numeric value on the wire for callType.
     */
    @java.lang.Override public int getCallTypeValue() {
      return callType_;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @param value The enum numeric value on the wire for callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallTypeValue(int value) {
      callType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return The callType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
      com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
      return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @param value The callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallType(com.tcn.cloud.api.api.commons.CallType.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      callType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      callType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AgentGetConnectedPartyReply)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AgentGetConnectedPartyReply)
  private static final com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply();
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentGetConnectedPartyReply>
      PARSER = new com.google.protobuf.AbstractParser<AgentGetConnectedPartyReply>() {
    @java.lang.Override
    public AgentGetConnectedPartyReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentGetConnectedPartyReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentGetConnectedPartyReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentGetConnectedPartyReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

