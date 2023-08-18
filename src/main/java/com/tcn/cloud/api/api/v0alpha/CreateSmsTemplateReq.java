// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateSmsTemplateReq}
 */
public final class CreateSmsTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateSmsTemplateReq)
    CreateSmsTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSmsTemplateReq.newBuilder() to construct.
  private CreateSmsTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSmsTemplateReq() {
    message_ = "";
    smsIntentTemplateSid_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSmsTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 1 [json_name = "message"];</code>
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
   * <code>string message = 1 [json_name = "message"];</code>
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

  public static final int SMS_INTENT_TEMPLATE_SID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList smsIntentTemplateSid_ =
      emptyLongList();
  /**
   * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
   * @return A list containing the smsIntentTemplateSid.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSmsIntentTemplateSidList() {
    return smsIntentTemplateSid_;
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
   * @return The count of smsIntentTemplateSid.
   */
  public int getSmsIntentTemplateSidCount() {
    return smsIntentTemplateSid_.size();
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (getSmsIntentTemplateSidList().size() > 0) {
      output.writeUInt32NoTag(18);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq other = (com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateSmsTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateSmsTemplateReq)
      com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.newBuilder()
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
      message_ = "";
      smsIntentTemplateSid_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq result = new com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        smsIntentTemplateSid_.makeImmutable();
        result.smsIntentTemplateSid_ = smsIntentTemplateSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.smsIntentTemplateSid_.isEmpty()) {
        if (smsIntentTemplateSid_.isEmpty()) {
          smsIntentTemplateSid_ = other.smsIntentTemplateSid_;
          smsIntentTemplateSid_.makeImmutable();
          bitField0_ |= 0x00000002;
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
            case 10: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              long v = input.readInt64();
              ensureSmsIntentTemplateSidIsMutable();
              smsIntentTemplateSid_.addLong(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSmsIntentTemplateSidIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                smsIntentTemplateSid_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1 [json_name = "message"];</code>
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
     * <code>string message = 1 [json_name = "message"];</code>
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
     * <code>string message = 1 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList smsIntentTemplateSid_ = emptyLongList();
    private void ensureSmsIntentTemplateSidIsMutable() {
      if (!smsIntentTemplateSid_.isModifiable()) {
        smsIntentTemplateSid_ = makeMutableCopy(smsIntentTemplateSid_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @return A list containing the smsIntentTemplateSid.
     */
    public java.util.List<java.lang.Long>
        getSmsIntentTemplateSidList() {
      smsIntentTemplateSid_.makeImmutable();
      return smsIntentTemplateSid_;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @return The count of smsIntentTemplateSid.
     */
    public int getSmsIntentTemplateSidCount() {
      return smsIntentTemplateSid_.size();
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index of the element to return.
     * @return The smsIntentTemplateSid at the given index.
     */
    public long getSmsIntentTemplateSid(int index) {
      return smsIntentTemplateSid_.getLong(index);
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index to set the value at.
     * @param value The smsIntentTemplateSid to set.
     * @return This builder for chaining.
     */
    public Builder setSmsIntentTemplateSid(
        int index, long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.setLong(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @param value The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addSmsIntentTemplateSid(long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.addLong(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @param values The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addAllSmsIntentTemplateSid(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSmsIntentTemplateSidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, smsIntentTemplateSid_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 2 [json_name = "smsIntentTemplateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsIntentTemplateSid() {
      smsIntentTemplateSid_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateSmsTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateSmsTemplateReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSmsTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateSmsTemplateReq>() {
    @java.lang.Override
    public CreateSmsTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSmsTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSmsTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateSmsTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

