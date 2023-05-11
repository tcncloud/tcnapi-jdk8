// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 *response to schedule outbound email group
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ScheduleOutboundEmailGroupRes}
 */
public final class ScheduleOutboundEmailGroupRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ScheduleOutboundEmailGroupRes)
    ScheduleOutboundEmailGroupResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScheduleOutboundEmailGroupRes.newBuilder() to construct.
  private ScheduleOutboundEmailGroupRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScheduleOutboundEmailGroupRes() {
    emailGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScheduleOutboundEmailGroupRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_ScheduleOutboundEmailGroupRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_ScheduleOutboundEmailGroupRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.class, com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.Builder.class);
  }

  public static final int EMAIL_GROUP_SID_FIELD_NUMBER = 1;
  private long emailGroupSid_ = 0L;
  /**
   * <pre>
   *newly created email group sid
   * </pre>
   *
   * <code>int64 email_group_sid = 1 [json_name = "emailGroupSid"];</code>
   * @return The emailGroupSid.
   */
  @java.lang.Override
  public long getEmailGroupSid() {
    return emailGroupSid_;
  }

  public static final int EMAIL_GROUP_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object emailGroupId_ = "";
  /**
   * <pre>
   *newly created email group id
   * </pre>
   *
   * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
   * @return The emailGroupId.
   */
  @java.lang.Override
  public java.lang.String getEmailGroupId() {
    java.lang.Object ref = emailGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *newly created email group id
   * </pre>
   *
   * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
   * @return The bytes for emailGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailGroupIdBytes() {
    java.lang.Object ref = emailGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailGroupId_ = b;
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
    if (emailGroupSid_ != 0L) {
      output.writeInt64(1, emailGroupSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, emailGroupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (emailGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, emailGroupSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, emailGroupId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes other = (com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes) obj;

    if (getEmailGroupSid()
        != other.getEmailGroupSid()) return false;
    if (!getEmailGroupId()
        .equals(other.getEmailGroupId())) return false;
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
    hash = (37 * hash) + EMAIL_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEmailGroupSid());
    hash = (37 * hash) + EMAIL_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailGroupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes prototype) {
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
   *response to schedule outbound email group
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ScheduleOutboundEmailGroupRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ScheduleOutboundEmailGroupRes)
      com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_ScheduleOutboundEmailGroupRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_ScheduleOutboundEmailGroupRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.class, com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.newBuilder()
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
      emailGroupSid_ = 0L;
      emailGroupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_ScheduleOutboundEmailGroupRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes build() {
      com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes result = new com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailGroupSid_ = emailGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.emailGroupId_ = emailGroupId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes.getDefaultInstance()) return this;
      if (other.getEmailGroupSid() != 0L) {
        setEmailGroupSid(other.getEmailGroupSid());
      }
      if (!other.getEmailGroupId().isEmpty()) {
        emailGroupId_ = other.emailGroupId_;
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
              emailGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              emailGroupId_ = input.readStringRequireUtf8();
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

    private long emailGroupSid_ ;
    /**
     * <pre>
     *newly created email group sid
     * </pre>
     *
     * <code>int64 email_group_sid = 1 [json_name = "emailGroupSid"];</code>
     * @return The emailGroupSid.
     */
    @java.lang.Override
    public long getEmailGroupSid() {
      return emailGroupSid_;
    }
    /**
     * <pre>
     *newly created email group sid
     * </pre>
     *
     * <code>int64 email_group_sid = 1 [json_name = "emailGroupSid"];</code>
     * @param value The emailGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setEmailGroupSid(long value) {

      emailGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *newly created email group sid
     * </pre>
     *
     * <code>int64 email_group_sid = 1 [json_name = "emailGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emailGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object emailGroupId_ = "";
    /**
     * <pre>
     *newly created email group id
     * </pre>
     *
     * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
     * @return The emailGroupId.
     */
    public java.lang.String getEmailGroupId() {
      java.lang.Object ref = emailGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *newly created email group id
     * </pre>
     *
     * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
     * @return The bytes for emailGroupId.
     */
    public com.google.protobuf.ByteString
        getEmailGroupIdBytes() {
      java.lang.Object ref = emailGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *newly created email group id
     * </pre>
     *
     * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
     * @param value The emailGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      emailGroupId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *newly created email group id
     * </pre>
     *
     * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailGroupId() {
      emailGroupId_ = getDefaultInstance().getEmailGroupId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *newly created email group id
     * </pre>
     *
     * <code>string email_group_id = 2 [json_name = "emailGroupId"];</code>
     * @param value The bytes for emailGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      emailGroupId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ScheduleOutboundEmailGroupRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ScheduleOutboundEmailGroupRes)
  private static final com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScheduleOutboundEmailGroupRes>
      PARSER = new com.google.protobuf.AbstractParser<ScheduleOutboundEmailGroupRes>() {
    @java.lang.Override
    public ScheduleOutboundEmailGroupRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScheduleOutboundEmailGroupRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScheduleOutboundEmailGroupRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScheduleOutboundEmailGroupRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

