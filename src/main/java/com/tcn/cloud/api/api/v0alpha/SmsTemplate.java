// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SmsTemplate}
 */
public final class SmsTemplate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SmsTemplate)
    SmsTemplateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmsTemplate.newBuilder() to construct.
  private SmsTemplate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsTemplate() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmsTemplate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTemplate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTemplate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SmsTemplate.class, com.tcn.cloud.api.api.v0alpha.SmsTemplate.Builder.class);
  }

  private int bitField0_;
  public static final int SMS_TEMPLATE_SID_FIELD_NUMBER = 1;
  private long smsTemplateSid_ = 0L;
  /**
   * <code>int64 sms_template_sid = 1 [json_name = "smsTemplateSid"];</code>
   * @return The smsTemplateSid.
   */
  @java.lang.Override
  public long getSmsTemplateSid() {
    return smsTemplateSid_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 4 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 4 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_UPDATED_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp lastUpdated_;
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdated() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastUpdated() {
    return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder() {
    return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
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
    if (smsTemplateSid_ != 0L) {
      output.writeInt64(1, smsTemplateSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getLastUpdated());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (smsTemplateSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, smsTemplateSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, message_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getLastUpdated());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SmsTemplate)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SmsTemplate other = (com.tcn.cloud.api.api.v0alpha.SmsTemplate) obj;

    if (getSmsTemplateSid()
        != other.getSmsTemplateSid()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasLastUpdated() != other.hasLastUpdated()) return false;
    if (hasLastUpdated()) {
      if (!getLastUpdated()
          .equals(other.getLastUpdated())) return false;
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
    hash = (37 * hash) + SMS_TEMPLATE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSmsTemplateSid());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasLastUpdated()) {
      hash = (37 * hash) + LAST_UPDATED_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdated().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SmsTemplate prototype) {
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
   * Protobuf type {@code api.v0alpha.SmsTemplate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SmsTemplate)
      com.tcn.cloud.api.api.v0alpha.SmsTemplateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTemplate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTemplate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SmsTemplate.class, com.tcn.cloud.api.api.v0alpha.SmsTemplate.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SmsTemplate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getLastUpdatedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      smsTemplateSid_ = 0L;
      message_ = "";
      lastUpdated_ = null;
      if (lastUpdatedBuilder_ != null) {
        lastUpdatedBuilder_.dispose();
        lastUpdatedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTemplate_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTemplate getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsTemplate.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTemplate build() {
      com.tcn.cloud.api.api.v0alpha.SmsTemplate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTemplate buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SmsTemplate result = new com.tcn.cloud.api.api.v0alpha.SmsTemplate(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SmsTemplate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsTemplateSid_ = smsTemplateSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastUpdated_ = lastUpdatedBuilder_ == null
            ? lastUpdated_
            : lastUpdatedBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SmsTemplate) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SmsTemplate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SmsTemplate other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SmsTemplate.getDefaultInstance()) return this;
      if (other.getSmsTemplateSid() != 0L) {
        setSmsTemplateSid(other.getSmsTemplateSid());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLastUpdated()) {
        mergeLastUpdated(other.getLastUpdated());
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
              smsTemplateSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 34: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getLastUpdatedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 42
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

    private long smsTemplateSid_ ;
    /**
     * <code>int64 sms_template_sid = 1 [json_name = "smsTemplateSid"];</code>
     * @return The smsTemplateSid.
     */
    @java.lang.Override
    public long getSmsTemplateSid() {
      return smsTemplateSid_;
    }
    /**
     * <code>int64 sms_template_sid = 1 [json_name = "smsTemplateSid"];</code>
     * @param value The smsTemplateSid to set.
     * @return This builder for chaining.
     */
    public Builder setSmsTemplateSid(long value) {

      smsTemplateSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sms_template_sid = 1 [json_name = "smsTemplateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsTemplateSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      smsTemplateSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 4 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 4 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 4 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 4 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 4 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastUpdated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastUpdatedBuilder_;
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     * @return Whether the lastUpdated field is set.
     */
    public boolean hasLastUpdated() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     * @return The lastUpdated.
     */
    public com.google.protobuf.Timestamp getLastUpdated() {
      if (lastUpdatedBuilder_ == null) {
        return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
      } else {
        return lastUpdatedBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public Builder setLastUpdated(com.google.protobuf.Timestamp value) {
      if (lastUpdatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdated_ = value;
      } else {
        lastUpdatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public Builder setLastUpdated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUpdatedBuilder_ == null) {
        lastUpdated_ = builderForValue.build();
      } else {
        lastUpdatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public Builder mergeLastUpdated(com.google.protobuf.Timestamp value) {
      if (lastUpdatedBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          lastUpdated_ != null &&
          lastUpdated_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastUpdatedBuilder().mergeFrom(value);
        } else {
          lastUpdated_ = value;
        }
      } else {
        lastUpdatedBuilder_.mergeFrom(value);
      }
      if (lastUpdated_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public Builder clearLastUpdated() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastUpdated_ = null;
      if (lastUpdatedBuilder_ != null) {
        lastUpdatedBuilder_.dispose();
        lastUpdatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUpdatedBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLastUpdatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder() {
      if (lastUpdatedBuilder_ != null) {
        return lastUpdatedBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 5 [json_name = "lastUpdated"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastUpdatedFieldBuilder() {
      if (lastUpdatedBuilder_ == null) {
        lastUpdatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastUpdated(),
                getParentForChildren(),
                isClean());
        lastUpdated_ = null;
      }
      return lastUpdatedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SmsTemplate)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SmsTemplate)
  private static final com.tcn.cloud.api.api.v0alpha.SmsTemplate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SmsTemplate();
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTemplate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsTemplate>
      PARSER = new com.google.protobuf.AbstractParser<SmsTemplate>() {
    @java.lang.Override
    public SmsTemplate parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsTemplate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsTemplate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsTemplate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

