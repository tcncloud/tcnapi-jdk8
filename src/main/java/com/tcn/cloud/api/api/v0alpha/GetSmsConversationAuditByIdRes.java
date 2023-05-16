// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetSmsConversationAuditByIdRes}
 */
public final class GetSmsConversationAuditByIdRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetSmsConversationAuditByIdRes)
    GetSmsConversationAuditByIdResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSmsConversationAuditByIdRes.newBuilder() to construct.
  private GetSmsConversationAuditByIdRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSmsConversationAuditByIdRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSmsConversationAuditByIdRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAuditByIdRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAuditByIdRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.class, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.Builder.class);
  }

  public static final int SMS_CONVERSATION_AUDIT_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.SmsConversationAudit smsConversationAudit_;
  /**
   * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
   * @return Whether the smsConversationAudit field is set.
   */
  @java.lang.Override
  public boolean hasSmsConversationAudit() {
    return smsConversationAudit_ != null;
  }
  /**
   * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
   * @return The smsConversationAudit.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsConversationAudit getSmsConversationAudit() {
    return smsConversationAudit_ == null ? com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance() : smsConversationAudit_;
  }
  /**
   * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsConversationAuditOrBuilder getSmsConversationAuditOrBuilder() {
    return smsConversationAudit_ == null ? com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance() : smsConversationAudit_;
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
    if (smsConversationAudit_ != null) {
      output.writeMessage(1, getSmsConversationAudit());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (smsConversationAudit_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSmsConversationAudit());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes other = (com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes) obj;

    if (hasSmsConversationAudit() != other.hasSmsConversationAudit()) return false;
    if (hasSmsConversationAudit()) {
      if (!getSmsConversationAudit()
          .equals(other.getSmsConversationAudit())) return false;
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
    if (hasSmsConversationAudit()) {
      hash = (37 * hash) + SMS_CONVERSATION_AUDIT_FIELD_NUMBER;
      hash = (53 * hash) + getSmsConversationAudit().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetSmsConversationAuditByIdRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetSmsConversationAuditByIdRes)
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAuditByIdRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAuditByIdRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.class, com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.newBuilder()
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
      smsConversationAudit_ = null;
      if (smsConversationAuditBuilder_ != null) {
        smsConversationAuditBuilder_.dispose();
        smsConversationAuditBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_GetSmsConversationAuditByIdRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes build() {
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes result = new com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsConversationAudit_ = smsConversationAuditBuilder_ == null
            ? smsConversationAudit_
            : smsConversationAuditBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes.getDefaultInstance()) return this;
      if (other.hasSmsConversationAudit()) {
        mergeSmsConversationAudit(other.getSmsConversationAudit());
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
              input.readMessage(
                  getSmsConversationAuditFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.tcn.cloud.api.api.v0alpha.SmsConversationAudit smsConversationAudit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsConversationAudit, com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.Builder, com.tcn.cloud.api.api.v0alpha.SmsConversationAuditOrBuilder> smsConversationAuditBuilder_;
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     * @return Whether the smsConversationAudit field is set.
     */
    public boolean hasSmsConversationAudit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     * @return The smsConversationAudit.
     */
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAudit getSmsConversationAudit() {
      if (smsConversationAuditBuilder_ == null) {
        return smsConversationAudit_ == null ? com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance() : smsConversationAudit_;
      } else {
        return smsConversationAuditBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public Builder setSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit value) {
      if (smsConversationAuditBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        smsConversationAudit_ = value;
      } else {
        smsConversationAuditBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public Builder setSmsConversationAudit(
        com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.Builder builderForValue) {
      if (smsConversationAuditBuilder_ == null) {
        smsConversationAudit_ = builderForValue.build();
      } else {
        smsConversationAuditBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public Builder mergeSmsConversationAudit(com.tcn.cloud.api.api.v0alpha.SmsConversationAudit value) {
      if (smsConversationAuditBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          smsConversationAudit_ != null &&
          smsConversationAudit_ != com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance()) {
          getSmsConversationAuditBuilder().mergeFrom(value);
        } else {
          smsConversationAudit_ = value;
        }
      } else {
        smsConversationAuditBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public Builder clearSmsConversationAudit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      smsConversationAudit_ = null;
      if (smsConversationAuditBuilder_ != null) {
        smsConversationAuditBuilder_.dispose();
        smsConversationAuditBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.Builder getSmsConversationAuditBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSmsConversationAuditFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsConversationAuditOrBuilder getSmsConversationAuditOrBuilder() {
      if (smsConversationAuditBuilder_ != null) {
        return smsConversationAuditBuilder_.getMessageOrBuilder();
      } else {
        return smsConversationAudit_ == null ?
            com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.getDefaultInstance() : smsConversationAudit_;
      }
    }
    /**
     * <code>.api.v0alpha.SmsConversationAudit sms_conversation_audit = 1 [json_name = "smsConversationAudit"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsConversationAudit, com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.Builder, com.tcn.cloud.api.api.v0alpha.SmsConversationAuditOrBuilder> 
        getSmsConversationAuditFieldBuilder() {
      if (smsConversationAuditBuilder_ == null) {
        smsConversationAuditBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SmsConversationAudit, com.tcn.cloud.api.api.v0alpha.SmsConversationAudit.Builder, com.tcn.cloud.api.api.v0alpha.SmsConversationAuditOrBuilder>(
                getSmsConversationAudit(),
                getParentForChildren(),
                isClean());
        smsConversationAudit_ = null;
      }
      return smsConversationAuditBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetSmsConversationAuditByIdRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetSmsConversationAuditByIdRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSmsConversationAuditByIdRes>
      PARSER = new com.google.protobuf.AbstractParser<GetSmsConversationAuditByIdRes>() {
    @java.lang.Override
    public GetSmsConversationAuditByIdRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSmsConversationAuditByIdRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSmsConversationAuditByIdRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetSmsConversationAuditByIdRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

