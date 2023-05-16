// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AgentPutCallOnHoldRequest}
 */
public final class AgentPutCallOnHoldRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AgentPutCallOnHoldRequest)
    AgentPutCallOnHoldRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentPutCallOnHoldRequest.newBuilder() to construct.
  private AgentPutCallOnHoldRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentPutCallOnHoldRequest() {
    holdType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentPutCallOnHoldRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentPutCallOnHoldRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentPutCallOnHoldRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.class, com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.Builder.class);
  }

  public static final int HOLD_TYPE_FIELD_NUMBER = 1;
  private int holdType_ = 0;
  /**
   * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
   * @return The enum numeric value on the wire for holdType.
   */
  @java.lang.Override public int getHoldTypeValue() {
    return holdType_;
  }
  /**
   * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
   * @return The holdType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.HoldType getHoldType() {
    com.tcn.cloud.api.api.commons.HoldType result = com.tcn.cloud.api.api.commons.HoldType.forNumber(holdType_);
    return result == null ? com.tcn.cloud.api.api.commons.HoldType.UNRECOGNIZED : result;
  }

  public static final int SESSION_SID_FIELD_NUMBER = 2;
  private long sessionSid_ = 0L;
  /**
   * <code>int64 session_sid = 2 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  @java.lang.Override
  public long getSessionSid() {
    return sessionSid_;
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
    if (holdType_ != com.tcn.cloud.api.api.commons.HoldType.UNKNOWN.getNumber()) {
      output.writeEnum(1, holdType_);
    }
    if (sessionSid_ != 0L) {
      output.writeInt64(2, sessionSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (holdType_ != com.tcn.cloud.api.api.commons.HoldType.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, holdType_);
    }
    if (sessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, sessionSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest other = (com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest) obj;

    if (holdType_ != other.holdType_) return false;
    if (getSessionSid()
        != other.getSessionSid()) return false;
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
    hash = (37 * hash) + HOLD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + holdType_;
    hash = (37 * hash) + SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest prototype) {
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
   * Protobuf type {@code api.v0alpha.AgentPutCallOnHoldRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AgentPutCallOnHoldRequest)
      com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentPutCallOnHoldRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentPutCallOnHoldRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.class, com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.newBuilder()
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
      holdType_ = 0;
      sessionSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_AgentPutCallOnHoldRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest build() {
      com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest result = new com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.holdType_ = holdType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionSid_ = sessionSid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest.getDefaultInstance()) return this;
      if (other.holdType_ != 0) {
        setHoldTypeValue(other.getHoldTypeValue());
      }
      if (other.getSessionSid() != 0L) {
        setSessionSid(other.getSessionSid());
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
              holdType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              sessionSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int holdType_ = 0;
    /**
     * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
     * @return The enum numeric value on the wire for holdType.
     */
    @java.lang.Override public int getHoldTypeValue() {
      return holdType_;
    }
    /**
     * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
     * @param value The enum numeric value on the wire for holdType to set.
     * @return This builder for chaining.
     */
    public Builder setHoldTypeValue(int value) {
      holdType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
     * @return The holdType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.HoldType getHoldType() {
      com.tcn.cloud.api.api.commons.HoldType result = com.tcn.cloud.api.api.commons.HoldType.forNumber(holdType_);
      return result == null ? com.tcn.cloud.api.api.commons.HoldType.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
     * @param value The holdType to set.
     * @return This builder for chaining.
     */
    public Builder setHoldType(com.tcn.cloud.api.api.commons.HoldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      holdType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.HoldType hold_type = 1 [json_name = "holdType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHoldType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      holdType_ = 0;
      onChanged();
      return this;
    }

    private long sessionSid_ ;
    /**
     * <code>int64 session_sid = 2 [json_name = "sessionSid"];</code>
     * @return The sessionSid.
     */
    @java.lang.Override
    public long getSessionSid() {
      return sessionSid_;
    }
    /**
     * <code>int64 session_sid = 2 [json_name = "sessionSid"];</code>
     * @param value The sessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSid(long value) {

      sessionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 session_sid = 2 [json_name = "sessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AgentPutCallOnHoldRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AgentPutCallOnHoldRequest)
  private static final com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentPutCallOnHoldRequest>
      PARSER = new com.google.protobuf.AbstractParser<AgentPutCallOnHoldRequest>() {
    @java.lang.Override
    public AgentPutCallOnHoldRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentPutCallOnHoldRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentPutCallOnHoldRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentPutCallOnHoldRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

