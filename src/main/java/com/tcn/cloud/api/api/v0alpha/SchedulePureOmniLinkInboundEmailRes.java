// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 *response to schedule pure inbound email group for omnilink
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.SchedulePureOmniLinkInboundEmailRes}
 */
public final class SchedulePureOmniLinkInboundEmailRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SchedulePureOmniLinkInboundEmailRes)
    SchedulePureOmniLinkInboundEmailResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulePureOmniLinkInboundEmailRes.newBuilder() to construct.
  private SchedulePureOmniLinkInboundEmailRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulePureOmniLinkInboundEmailRes() {
    inboundEmailGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulePureOmniLinkInboundEmailRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_SchedulePureOmniLinkInboundEmailRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_SchedulePureOmniLinkInboundEmailRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.class, com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.Builder.class);
  }

  public static final int INBOUND_EMAIL_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inboundEmailGroupId_ = "";
  /**
   * <pre>
   *result of generated inbound email group id
   * </pre>
   *
   * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
   * @return The inboundEmailGroupId.
   */
  @java.lang.Override
  public java.lang.String getInboundEmailGroupId() {
    java.lang.Object ref = inboundEmailGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inboundEmailGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *result of generated inbound email group id
   * </pre>
   *
   * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
   * @return The bytes for inboundEmailGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInboundEmailGroupIdBytes() {
    java.lang.Object ref = inboundEmailGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inboundEmailGroupId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inboundEmailGroupId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inboundEmailGroupId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes other = (com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes) obj;

    if (!getInboundEmailGroupId()
        .equals(other.getInboundEmailGroupId())) return false;
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
    hash = (37 * hash) + INBOUND_EMAIL_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInboundEmailGroupId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes prototype) {
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
   *response to schedule pure inbound email group for omnilink
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.SchedulePureOmniLinkInboundEmailRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SchedulePureOmniLinkInboundEmailRes)
      com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_SchedulePureOmniLinkInboundEmailRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_SchedulePureOmniLinkInboundEmailRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.class, com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.newBuilder()
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
      inboundEmailGroupId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_SchedulePureOmniLinkInboundEmailRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes build() {
      com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes result = new com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inboundEmailGroupId_ = inboundEmailGroupId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes.getDefaultInstance()) return this;
      if (!other.getInboundEmailGroupId().isEmpty()) {
        inboundEmailGroupId_ = other.inboundEmailGroupId_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              inboundEmailGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object inboundEmailGroupId_ = "";
    /**
     * <pre>
     *result of generated inbound email group id
     * </pre>
     *
     * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
     * @return The inboundEmailGroupId.
     */
    public java.lang.String getInboundEmailGroupId() {
      java.lang.Object ref = inboundEmailGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inboundEmailGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *result of generated inbound email group id
     * </pre>
     *
     * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
     * @return The bytes for inboundEmailGroupId.
     */
    public com.google.protobuf.ByteString
        getInboundEmailGroupIdBytes() {
      java.lang.Object ref = inboundEmailGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inboundEmailGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *result of generated inbound email group id
     * </pre>
     *
     * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
     * @param value The inboundEmailGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inboundEmailGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *result of generated inbound email group id
     * </pre>
     *
     * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInboundEmailGroupId() {
      inboundEmailGroupId_ = getDefaultInstance().getInboundEmailGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *result of generated inbound email group id
     * </pre>
     *
     * <code>string inbound_email_group_id = 1 [json_name = "inboundEmailGroupId"];</code>
     * @param value The bytes for inboundEmailGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inboundEmailGroupId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SchedulePureOmniLinkInboundEmailRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SchedulePureOmniLinkInboundEmailRes)
  private static final com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulePureOmniLinkInboundEmailRes>
      PARSER = new com.google.protobuf.AbstractParser<SchedulePureOmniLinkInboundEmailRes>() {
    @java.lang.Override
    public SchedulePureOmniLinkInboundEmailRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchedulePureOmniLinkInboundEmailRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulePureOmniLinkInboundEmailRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SchedulePureOmniLinkInboundEmailRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

