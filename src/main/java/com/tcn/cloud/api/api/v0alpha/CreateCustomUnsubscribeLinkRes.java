// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * CreateUnsubscribeLinkRes - result to creating unsubscribe link
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateCustomUnsubscribeLinkRes}
 */
public final class CreateCustomUnsubscribeLinkRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateCustomUnsubscribeLinkRes)
    CreateCustomUnsubscribeLinkResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomUnsubscribeLinkRes.newBuilder() to construct.
  private CreateCustomUnsubscribeLinkRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomUnsubscribeLinkRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomUnsubscribeLinkRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateCustomUnsubscribeLinkRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateCustomUnsubscribeLinkRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.class, com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.Builder.class);
  }

  public static final int CUSTOM_UNSUBSCRIBE_LINK_SID_FIELD_NUMBER = 1;
  private long customUnsubscribeLinkSid_ = 0L;
  /**
   * <pre>
   * custom unsubscribe link sid
   * </pre>
   *
   * <code>int64 custom_unsubscribe_link_sid = 1 [json_name = "customUnsubscribeLinkSid", jstype = JS_STRING];</code>
   * @return The customUnsubscribeLinkSid.
   */
  @java.lang.Override
  public long getCustomUnsubscribeLinkSid() {
    return customUnsubscribeLinkSid_;
  }

  public static final int VALIDATED_FIELD_NUMBER = 2;
  private boolean validated_ = false;
  /**
   * <pre>
   * validation of link url
   * </pre>
   *
   * <code>bool validated = 2 [json_name = "validated"];</code>
   * @return The validated.
   */
  @java.lang.Override
  public boolean getValidated() {
    return validated_;
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
    if (customUnsubscribeLinkSid_ != 0L) {
      output.writeInt64(1, customUnsubscribeLinkSid_);
    }
    if (validated_ != false) {
      output.writeBool(2, validated_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customUnsubscribeLinkSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, customUnsubscribeLinkSid_);
    }
    if (validated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, validated_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes other = (com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes) obj;

    if (getCustomUnsubscribeLinkSid()
        != other.getCustomUnsubscribeLinkSid()) return false;
    if (getValidated()
        != other.getValidated()) return false;
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
    hash = (37 * hash) + CUSTOM_UNSUBSCRIBE_LINK_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCustomUnsubscribeLinkSid());
    hash = (37 * hash) + VALIDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidated());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes prototype) {
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
   * CreateUnsubscribeLinkRes - result to creating unsubscribe link
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateCustomUnsubscribeLinkRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateCustomUnsubscribeLinkRes)
      com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateCustomUnsubscribeLinkRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateCustomUnsubscribeLinkRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.class, com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.newBuilder()
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
      customUnsubscribeLinkSid_ = 0L;
      validated_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateCustomUnsubscribeLinkRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes build() {
      com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes result = new com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customUnsubscribeLinkSid_ = customUnsubscribeLinkSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validated_ = validated_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes.getDefaultInstance()) return this;
      if (other.getCustomUnsubscribeLinkSid() != 0L) {
        setCustomUnsubscribeLinkSid(other.getCustomUnsubscribeLinkSid());
      }
      if (other.getValidated() != false) {
        setValidated(other.getValidated());
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
              customUnsubscribeLinkSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              validated_ = input.readBool();
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

    private long customUnsubscribeLinkSid_ ;
    /**
     * <pre>
     * custom unsubscribe link sid
     * </pre>
     *
     * <code>int64 custom_unsubscribe_link_sid = 1 [json_name = "customUnsubscribeLinkSid", jstype = JS_STRING];</code>
     * @return The customUnsubscribeLinkSid.
     */
    @java.lang.Override
    public long getCustomUnsubscribeLinkSid() {
      return customUnsubscribeLinkSid_;
    }
    /**
     * <pre>
     * custom unsubscribe link sid
     * </pre>
     *
     * <code>int64 custom_unsubscribe_link_sid = 1 [json_name = "customUnsubscribeLinkSid", jstype = JS_STRING];</code>
     * @param value The customUnsubscribeLinkSid to set.
     * @return This builder for chaining.
     */
    public Builder setCustomUnsubscribeLinkSid(long value) {

      customUnsubscribeLinkSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * custom unsubscribe link sid
     * </pre>
     *
     * <code>int64 custom_unsubscribe_link_sid = 1 [json_name = "customUnsubscribeLinkSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomUnsubscribeLinkSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customUnsubscribeLinkSid_ = 0L;
      onChanged();
      return this;
    }

    private boolean validated_ ;
    /**
     * <pre>
     * validation of link url
     * </pre>
     *
     * <code>bool validated = 2 [json_name = "validated"];</code>
     * @return The validated.
     */
    @java.lang.Override
    public boolean getValidated() {
      return validated_;
    }
    /**
     * <pre>
     * validation of link url
     * </pre>
     *
     * <code>bool validated = 2 [json_name = "validated"];</code>
     * @param value The validated to set.
     * @return This builder for chaining.
     */
    public Builder setValidated(boolean value) {

      validated_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * validation of link url
     * </pre>
     *
     * <code>bool validated = 2 [json_name = "validated"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidated() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validated_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateCustomUnsubscribeLinkRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateCustomUnsubscribeLinkRes)
  private static final com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomUnsubscribeLinkRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomUnsubscribeLinkRes>() {
    @java.lang.Override
    public CreateCustomUnsubscribeLinkRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomUnsubscribeLinkRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomUnsubscribeLinkRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateCustomUnsubscribeLinkRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

