// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateSmsTemplateReq}
 */
public final class UpdateSmsTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateSmsTemplateReq)
    UpdateSmsTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSmsTemplateReq.newBuilder() to construct.
  private UpdateSmsTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSmsTemplateReq() {
    message_ = "";
    smsIntentTemplateSid_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSmsTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_UpdateSmsTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_UpdateSmsTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.Builder.class);
  }

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

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2 [json_name = "message"];</code>
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
   * <code>string message = 2 [json_name = "message"];</code>
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

  public static final int SMS_INTENT_TEMPLATE_SID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList smsIntentTemplateSid_;
  /**
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @return A list containing the smsIntentTemplateSid.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSmsIntentTemplateSidList() {
    return smsIntentTemplateSid_;
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @return The count of smsIntentTemplateSid.
   */
  public int getSmsIntentTemplateSidCount() {
    return smsIntentTemplateSid_.size();
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
   * @param index The index of the element to return.
   * @return The smsIntentTemplateSid at the given index.
   */
  public long getSmsIntentTemplateSid(int index) {
    return smsIntentTemplateSid_.getLong(index);
  }
  private int smsIntentTemplateSidMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (smsTemplateSid_ != 0L) {
      output.writeInt64(1, smsTemplateSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (getSmsIntentTemplateSidList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(smsIntentTemplateSidMemoizedSerializedSize);
    }
    for (int i = 0; i < smsIntentTemplateSid_.size(); i++) {
      output.writeInt64NoTag(smsIntentTemplateSid_.getLong(i));
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < smsIntentTemplateSid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(smsIntentTemplateSid_.getLong(i));
      }
      size += dataSize;
      if (!getSmsIntentTemplateSidList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      smsIntentTemplateSidMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq other = (com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq) obj;

    if (getSmsTemplateSid()
        != other.getSmsTemplateSid()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getSmsIntentTemplateSidList()
        .equals(other.getSmsIntentTemplateSidList())) return false;
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
    if (getSmsIntentTemplateSidCount() > 0) {
      hash = (37 * hash) + SMS_INTENT_TEMPLATE_SID_FIELD_NUMBER;
      hash = (53 * hash) + getSmsIntentTemplateSidList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateSmsTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateSmsTemplateReq)
      com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_UpdateSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_UpdateSmsTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.newBuilder()
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
      smsTemplateSid_ = 0L;
      message_ = "";
      smsIntentTemplateSid_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_UpdateSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq result = new com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        smsIntentTemplateSid_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.smsIntentTemplateSid_ = smsIntentTemplateSid_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsTemplateSid_ = smsTemplateSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq.getDefaultInstance()) return this;
      if (other.getSmsTemplateSid() != 0L) {
        setSmsTemplateSid(other.getSmsTemplateSid());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.smsIntentTemplateSid_.isEmpty()) {
        if (smsIntentTemplateSid_.isEmpty()) {
          smsIntentTemplateSid_ = other.smsIntentTemplateSid_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureSmsIntentTemplateSidIsMutable();
          smsIntentTemplateSid_.addAll(other.smsIntentTemplateSid_);
        }
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
              smsTemplateSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              long v = input.readInt64();
              ensureSmsIntentTemplateSidIsMutable();
              smsIntentTemplateSid_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSmsIntentTemplateSidIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                smsIntentTemplateSid_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 26
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
     * <code>string message = 2 [json_name = "message"];</code>
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
     * <code>string message = 2 [json_name = "message"];</code>
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
     * <code>string message = 2 [json_name = "message"];</code>
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
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
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

    private com.google.protobuf.Internal.LongList smsIntentTemplateSid_ = emptyLongList();
    private void ensureSmsIntentTemplateSidIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        smsIntentTemplateSid_ = mutableCopy(smsIntentTemplateSid_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @return A list containing the smsIntentTemplateSid.
     */
    public java.util.List<java.lang.Long>
        getSmsIntentTemplateSidList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(smsIntentTemplateSid_) : smsIntentTemplateSid_;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @return The count of smsIntentTemplateSid.
     */
    public int getSmsIntentTemplateSidCount() {
      return smsIntentTemplateSid_.size();
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index of the element to return.
     * @return The smsIntentTemplateSid at the given index.
     */
    public long getSmsIntentTemplateSid(int index) {
      return smsIntentTemplateSid_.getLong(index);
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index to set the value at.
     * @param value The smsIntentTemplateSid to set.
     * @return This builder for chaining.
     */
    public Builder setSmsIntentTemplateSid(
        int index, long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @param value The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addSmsIntentTemplateSid(long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @param values The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addAllSmsIntentTemplateSid(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSmsIntentTemplateSidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, smsIntentTemplateSid_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 3 [json_name = "smsIntentTemplateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsIntentTemplateSid() {
      smsIntentTemplateSid_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateSmsTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateSmsTemplateReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSmsTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSmsTemplateReq>() {
    @java.lang.Override
    public UpdateSmsTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSmsTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSmsTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateSmsTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

