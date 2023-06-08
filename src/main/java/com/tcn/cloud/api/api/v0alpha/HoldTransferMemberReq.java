// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.HoldTransferMemberReq}
 */
public final class HoldTransferMemberReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.HoldTransferMemberReq)
    HoldTransferMemberReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HoldTransferMemberReq.newBuilder() to construct.
  private HoldTransferMemberReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HoldTransferMemberReq() {
    memberIdentifier_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HoldTransferMemberReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_HoldTransferMemberReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_HoldTransferMemberReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.class, com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.Builder.class);
  }

  public static final int SESSION_SID_FIELD_NUMBER = 1;
  private long sessionSid_ = 0L;
  /**
   * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  @java.lang.Override
  public long getSessionSid() {
    return sessionSid_;
  }

  public static final int MEMBER_IDENTIFIER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object memberIdentifier_ = "";
  /**
   * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
   * @return The memberIdentifier.
   */
  @java.lang.Override
  public java.lang.String getMemberIdentifier() {
    java.lang.Object ref = memberIdentifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      memberIdentifier_ = s;
      return s;
    }
  }
  /**
   * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
   * @return The bytes for memberIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemberIdentifierBytes() {
    java.lang.Object ref = memberIdentifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      memberIdentifier_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (sessionSid_ != 0L) {
      output.writeInt64(1, sessionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memberIdentifier_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, memberIdentifier_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sessionSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memberIdentifier_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, memberIdentifier_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq other = (com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq) obj;

    if (getSessionSid()
        != other.getSessionSid()) return false;
    if (!getMemberIdentifier()
        .equals(other.getMemberIdentifier())) return false;
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
    hash = (37 * hash) + SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionSid());
    hash = (37 * hash) + MEMBER_IDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getMemberIdentifier().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq prototype) {
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
   * Protobuf type {@code api.v0alpha.HoldTransferMemberReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.HoldTransferMemberReq)
      com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_HoldTransferMemberReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_HoldTransferMemberReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.class, com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.newBuilder()
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
      sessionSid_ = 0L;
      memberIdentifier_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_HoldTransferMemberReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq build() {
      com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq result = new com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionSid_ = sessionSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.memberIdentifier_ = memberIdentifier_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq.getDefaultInstance()) return this;
      if (other.getSessionSid() != 0L) {
        setSessionSid(other.getSessionSid());
      }
      if (!other.getMemberIdentifier().isEmpty()) {
        memberIdentifier_ = other.memberIdentifier_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              sessionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              memberIdentifier_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private long sessionSid_ ;
    /**
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @return The sessionSid.
     */
    @java.lang.Override
    public long getSessionSid() {
      return sessionSid_;
    }
    /**
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @param value The sessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSid(long value) {

      sessionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object memberIdentifier_ = "";
    /**
     * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
     * @return The memberIdentifier.
     */
    public java.lang.String getMemberIdentifier() {
      java.lang.Object ref = memberIdentifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        memberIdentifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
     * @return The bytes for memberIdentifier.
     */
    public com.google.protobuf.ByteString
        getMemberIdentifierBytes() {
      java.lang.Object ref = memberIdentifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        memberIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
     * @param value The memberIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setMemberIdentifier(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      memberIdentifier_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberIdentifier() {
      memberIdentifier_ = getDefaultInstance().getMemberIdentifier();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string member_identifier = 2 [json_name = "memberIdentifier"];</code>
     * @param value The bytes for memberIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setMemberIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      memberIdentifier_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.HoldTransferMemberReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.HoldTransferMemberReq)
  private static final com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HoldTransferMemberReq>
      PARSER = new com.google.protobuf.AbstractParser<HoldTransferMemberReq>() {
    @java.lang.Override
    public HoldTransferMemberReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<HoldTransferMemberReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HoldTransferMemberReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.HoldTransferMemberReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

