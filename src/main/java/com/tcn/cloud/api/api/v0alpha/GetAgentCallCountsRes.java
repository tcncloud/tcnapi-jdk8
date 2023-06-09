// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetAgentCallCountsRes}
 */
public final class GetAgentCallCountsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetAgentCallCountsRes)
    GetAgentCallCountsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAgentCallCountsRes.newBuilder() to construct.
  private GetAgentCallCountsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAgentCallCountsRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAgentCallCountsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_GetAgentCallCountsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_GetAgentCallCountsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.class, com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.Builder.class);
  }

  public static final int AGENT_CALLS_FIELD_NUMBER = 1;
  private long agentCalls_ = 0L;
  /**
   * <code>int64 agent_calls = 1 [json_name = "agentCalls"];</code>
   * @return The agentCalls.
   */
  @java.lang.Override
  public long getAgentCalls() {
    return agentCalls_;
  }

  public static final int SKILL_CALLS_FIELD_NUMBER = 2;
  private long skillCalls_ = 0L;
  /**
   * <code>int64 skill_calls = 2 [json_name = "skillCalls"];</code>
   * @return The skillCalls.
   */
  @java.lang.Override
  public long getSkillCalls() {
    return skillCalls_;
  }

  public static final int ON_HOLD_CALLS_FIELD_NUMBER = 3;
  private long onHoldCalls_ = 0L;
  /**
   * <code>int64 on_hold_calls = 3 [json_name = "onHoldCalls"];</code>
   * @return The onHoldCalls.
   */
  @java.lang.Override
  public long getOnHoldCalls() {
    return onHoldCalls_;
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
    if (agentCalls_ != 0L) {
      output.writeInt64(1, agentCalls_);
    }
    if (skillCalls_ != 0L) {
      output.writeInt64(2, skillCalls_);
    }
    if (onHoldCalls_ != 0L) {
      output.writeInt64(3, onHoldCalls_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentCalls_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, agentCalls_);
    }
    if (skillCalls_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, skillCalls_);
    }
    if (onHoldCalls_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, onHoldCalls_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes other = (com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes) obj;

    if (getAgentCalls()
        != other.getAgentCalls()) return false;
    if (getSkillCalls()
        != other.getSkillCalls()) return false;
    if (getOnHoldCalls()
        != other.getOnHoldCalls()) return false;
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
    hash = (37 * hash) + AGENT_CALLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentCalls());
    hash = (37 * hash) + SKILL_CALLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkillCalls());
    hash = (37 * hash) + ON_HOLD_CALLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOnHoldCalls());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetAgentCallCountsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetAgentCallCountsRes)
      com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_GetAgentCallCountsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_GetAgentCallCountsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.class, com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.newBuilder()
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
      agentCalls_ = 0L;
      skillCalls_ = 0L;
      onHoldCalls_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_GetAgentCallCountsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes build() {
      com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes result = new com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentCalls_ = agentCalls_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skillCalls_ = skillCalls_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.onHoldCalls_ = onHoldCalls_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes.getDefaultInstance()) return this;
      if (other.getAgentCalls() != 0L) {
        setAgentCalls(other.getAgentCalls());
      }
      if (other.getSkillCalls() != 0L) {
        setSkillCalls(other.getSkillCalls());
      }
      if (other.getOnHoldCalls() != 0L) {
        setOnHoldCalls(other.getOnHoldCalls());
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
              agentCalls_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              skillCalls_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              onHoldCalls_ = input.readInt64();
              bitField0_ |= 0x00000004;
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

    private long agentCalls_ ;
    /**
     * <code>int64 agent_calls = 1 [json_name = "agentCalls"];</code>
     * @return The agentCalls.
     */
    @java.lang.Override
    public long getAgentCalls() {
      return agentCalls_;
    }
    /**
     * <code>int64 agent_calls = 1 [json_name = "agentCalls"];</code>
     * @param value The agentCalls to set.
     * @return This builder for chaining.
     */
    public Builder setAgentCalls(long value) {

      agentCalls_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 agent_calls = 1 [json_name = "agentCalls"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentCalls() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentCalls_ = 0L;
      onChanged();
      return this;
    }

    private long skillCalls_ ;
    /**
     * <code>int64 skill_calls = 2 [json_name = "skillCalls"];</code>
     * @return The skillCalls.
     */
    @java.lang.Override
    public long getSkillCalls() {
      return skillCalls_;
    }
    /**
     * <code>int64 skill_calls = 2 [json_name = "skillCalls"];</code>
     * @param value The skillCalls to set.
     * @return This builder for chaining.
     */
    public Builder setSkillCalls(long value) {

      skillCalls_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 skill_calls = 2 [json_name = "skillCalls"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillCalls() {
      bitField0_ = (bitField0_ & ~0x00000002);
      skillCalls_ = 0L;
      onChanged();
      return this;
    }

    private long onHoldCalls_ ;
    /**
     * <code>int64 on_hold_calls = 3 [json_name = "onHoldCalls"];</code>
     * @return The onHoldCalls.
     */
    @java.lang.Override
    public long getOnHoldCalls() {
      return onHoldCalls_;
    }
    /**
     * <code>int64 on_hold_calls = 3 [json_name = "onHoldCalls"];</code>
     * @param value The onHoldCalls to set.
     * @return This builder for chaining.
     */
    public Builder setOnHoldCalls(long value) {

      onHoldCalls_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 on_hold_calls = 3 [json_name = "onHoldCalls"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOnHoldCalls() {
      bitField0_ = (bitField0_ & ~0x00000004);
      onHoldCalls_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetAgentCallCountsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetAgentCallCountsRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAgentCallCountsRes>
      PARSER = new com.google.protobuf.AbstractParser<GetAgentCallCountsRes>() {
    @java.lang.Override
    public GetAgentCallCountsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAgentCallCountsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAgentCallCountsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetAgentCallCountsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

