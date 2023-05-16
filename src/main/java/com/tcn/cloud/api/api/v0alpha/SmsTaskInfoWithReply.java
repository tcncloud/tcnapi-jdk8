// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SmsTaskInfoWithReply}
 */
public final class SmsTaskInfoWithReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SmsTaskInfoWithReply)
    SmsTaskInfoWithReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmsTaskInfoWithReply.newBuilder() to construct.
  private SmsTaskInfoWithReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsTaskInfoWithReply() {
    smsReceivedReplies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmsTaskInfoWithReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTaskInfoWithReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTaskInfoWithReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.class, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.Builder.class);
  }

  public static final int SMS_TASK_INFO_RES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes smsTaskInfoRes_;
  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   * @return Whether the smsTaskInfoRes field is set.
   */
  @java.lang.Override
  public boolean hasSmsTaskInfoRes() {
    return smsTaskInfoRes_ != null;
  }
  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   * @return The smsTaskInfoRes.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes getSmsTaskInfoRes() {
    return smsTaskInfoRes_ == null ? com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.getDefaultInstance() : smsTaskInfoRes_;
  }
  /**
   * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder getSmsTaskInfoResOrBuilder() {
    return smsTaskInfoRes_ == null ? com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.getDefaultInstance() : smsTaskInfoRes_;
  }

  public static final int SMS_RECEIVED_REPLIES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> smsReceivedReplies_;
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> getSmsReceivedRepliesList() {
    return smsReceivedReplies_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder> 
      getSmsReceivedRepliesOrBuilderList() {
    return smsReceivedReplies_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  @java.lang.Override
  public int getSmsReceivedRepliesCount() {
    return smsReceivedReplies_.size();
  }
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies getSmsReceivedReplies(int index) {
    return smsReceivedReplies_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder getSmsReceivedRepliesOrBuilder(
      int index) {
    return smsReceivedReplies_.get(index);
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
    if (smsTaskInfoRes_ != null) {
      output.writeMessage(1, getSmsTaskInfoRes());
    }
    for (int i = 0; i < smsReceivedReplies_.size(); i++) {
      output.writeMessage(2, smsReceivedReplies_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (smsTaskInfoRes_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSmsTaskInfoRes());
    }
    for (int i = 0; i < smsReceivedReplies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, smsReceivedReplies_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply other = (com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply) obj;

    if (hasSmsTaskInfoRes() != other.hasSmsTaskInfoRes()) return false;
    if (hasSmsTaskInfoRes()) {
      if (!getSmsTaskInfoRes()
          .equals(other.getSmsTaskInfoRes())) return false;
    }
    if (!getSmsReceivedRepliesList()
        .equals(other.getSmsReceivedRepliesList())) return false;
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
    if (hasSmsTaskInfoRes()) {
      hash = (37 * hash) + SMS_TASK_INFO_RES_FIELD_NUMBER;
      hash = (53 * hash) + getSmsTaskInfoRes().hashCode();
    }
    if (getSmsReceivedRepliesCount() > 0) {
      hash = (37 * hash) + SMS_RECEIVED_REPLIES_FIELD_NUMBER;
      hash = (53 * hash) + getSmsReceivedRepliesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply prototype) {
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
   * Protobuf type {@code api.v0alpha.SmsTaskInfoWithReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SmsTaskInfoWithReply)
      com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTaskInfoWithReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTaskInfoWithReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.class, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.newBuilder()
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
      smsTaskInfoRes_ = null;
      if (smsTaskInfoResBuilder_ != null) {
        smsTaskInfoResBuilder_.dispose();
        smsTaskInfoResBuilder_ = null;
      }
      if (smsReceivedRepliesBuilder_ == null) {
        smsReceivedReplies_ = java.util.Collections.emptyList();
      } else {
        smsReceivedReplies_ = null;
        smsReceivedRepliesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsTaskInfoWithReply_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply build() {
      com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply result = new com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply result) {
      if (smsReceivedRepliesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          smsReceivedReplies_ = java.util.Collections.unmodifiableList(smsReceivedReplies_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.smsReceivedReplies_ = smsReceivedReplies_;
      } else {
        result.smsReceivedReplies_ = smsReceivedRepliesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsTaskInfoRes_ = smsTaskInfoResBuilder_ == null
            ? smsTaskInfoRes_
            : smsTaskInfoResBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply.getDefaultInstance()) return this;
      if (other.hasSmsTaskInfoRes()) {
        mergeSmsTaskInfoRes(other.getSmsTaskInfoRes());
      }
      if (smsReceivedRepliesBuilder_ == null) {
        if (!other.smsReceivedReplies_.isEmpty()) {
          if (smsReceivedReplies_.isEmpty()) {
            smsReceivedReplies_ = other.smsReceivedReplies_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSmsReceivedRepliesIsMutable();
            smsReceivedReplies_.addAll(other.smsReceivedReplies_);
          }
          onChanged();
        }
      } else {
        if (!other.smsReceivedReplies_.isEmpty()) {
          if (smsReceivedRepliesBuilder_.isEmpty()) {
            smsReceivedRepliesBuilder_.dispose();
            smsReceivedRepliesBuilder_ = null;
            smsReceivedReplies_ = other.smsReceivedReplies_;
            bitField0_ = (bitField0_ & ~0x00000002);
            smsReceivedRepliesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSmsReceivedRepliesFieldBuilder() : null;
          } else {
            smsReceivedRepliesBuilder_.addAllMessages(other.smsReceivedReplies_);
          }
        }
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
                  getSmsTaskInfoResFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.parser(),
                      extensionRegistry);
              if (smsReceivedRepliesBuilder_ == null) {
                ensureSmsReceivedRepliesIsMutable();
                smsReceivedReplies_.add(m);
              } else {
                smsReceivedRepliesBuilder_.addMessage(m);
              }
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

    private com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes smsTaskInfoRes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.Builder, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder> smsTaskInfoResBuilder_;
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     * @return Whether the smsTaskInfoRes field is set.
     */
    public boolean hasSmsTaskInfoRes() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     * @return The smsTaskInfoRes.
     */
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes getSmsTaskInfoRes() {
      if (smsTaskInfoResBuilder_ == null) {
        return smsTaskInfoRes_ == null ? com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.getDefaultInstance() : smsTaskInfoRes_;
      } else {
        return smsTaskInfoResBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public Builder setSmsTaskInfoRes(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes value) {
      if (smsTaskInfoResBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        smsTaskInfoRes_ = value;
      } else {
        smsTaskInfoResBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public Builder setSmsTaskInfoRes(
        com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.Builder builderForValue) {
      if (smsTaskInfoResBuilder_ == null) {
        smsTaskInfoRes_ = builderForValue.build();
      } else {
        smsTaskInfoResBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public Builder mergeSmsTaskInfoRes(com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes value) {
      if (smsTaskInfoResBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          smsTaskInfoRes_ != null &&
          smsTaskInfoRes_ != com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.getDefaultInstance()) {
          getSmsTaskInfoResBuilder().mergeFrom(value);
        } else {
          smsTaskInfoRes_ = value;
        }
      } else {
        smsTaskInfoResBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public Builder clearSmsTaskInfoRes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      smsTaskInfoRes_ = null;
      if (smsTaskInfoResBuilder_ != null) {
        smsTaskInfoResBuilder_.dispose();
        smsTaskInfoResBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.Builder getSmsTaskInfoResBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSmsTaskInfoResFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder getSmsTaskInfoResOrBuilder() {
      if (smsTaskInfoResBuilder_ != null) {
        return smsTaskInfoResBuilder_.getMessageOrBuilder();
      } else {
        return smsTaskInfoRes_ == null ?
            com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.getDefaultInstance() : smsTaskInfoRes_;
      }
    }
    /**
     * <code>.api.v0alpha.SmsTaskInfoRes sms_task_info_res = 1 [json_name = "smsTaskInfoRes"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.Builder, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder> 
        getSmsTaskInfoResFieldBuilder() {
      if (smsTaskInfoResBuilder_ == null) {
        smsTaskInfoResBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoRes.Builder, com.tcn.cloud.api.api.v0alpha.SmsTaskInfoResOrBuilder>(
                getSmsTaskInfoRes(),
                getParentForChildren(),
                isClean());
        smsTaskInfoRes_ = null;
      }
      return smsTaskInfoResBuilder_;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> smsReceivedReplies_ =
      java.util.Collections.emptyList();
    private void ensureSmsReceivedRepliesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        smsReceivedReplies_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies>(smsReceivedReplies_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder, com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder> smsReceivedRepliesBuilder_;

    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> getSmsReceivedRepliesList() {
      if (smsReceivedRepliesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(smsReceivedReplies_);
      } else {
        return smsReceivedRepliesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public int getSmsReceivedRepliesCount() {
      if (smsReceivedRepliesBuilder_ == null) {
        return smsReceivedReplies_.size();
      } else {
        return smsReceivedRepliesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies getSmsReceivedReplies(int index) {
      if (smsReceivedRepliesBuilder_ == null) {
        return smsReceivedReplies_.get(index);
      } else {
        return smsReceivedRepliesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder setSmsReceivedReplies(
        int index, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies value) {
      if (smsReceivedRepliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.set(index, value);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder setSmsReceivedReplies(
        int index, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder builderForValue) {
      if (smsReceivedRepliesBuilder_ == null) {
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.set(index, builderForValue.build());
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder addSmsReceivedReplies(com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies value) {
      if (smsReceivedRepliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.add(value);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder addSmsReceivedReplies(
        int index, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies value) {
      if (smsReceivedRepliesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.add(index, value);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder addSmsReceivedReplies(
        com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder builderForValue) {
      if (smsReceivedRepliesBuilder_ == null) {
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.add(builderForValue.build());
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder addSmsReceivedReplies(
        int index, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder builderForValue) {
      if (smsReceivedRepliesBuilder_ == null) {
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.add(index, builderForValue.build());
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder addAllSmsReceivedReplies(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies> values) {
      if (smsReceivedRepliesBuilder_ == null) {
        ensureSmsReceivedRepliesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, smsReceivedReplies_);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder clearSmsReceivedReplies() {
      if (smsReceivedRepliesBuilder_ == null) {
        smsReceivedReplies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public Builder removeSmsReceivedReplies(int index) {
      if (smsReceivedRepliesBuilder_ == null) {
        ensureSmsReceivedRepliesIsMutable();
        smsReceivedReplies_.remove(index);
        onChanged();
      } else {
        smsReceivedRepliesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder getSmsReceivedRepliesBuilder(
        int index) {
      return getSmsReceivedRepliesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder getSmsReceivedRepliesOrBuilder(
        int index) {
      if (smsReceivedRepliesBuilder_ == null) {
        return smsReceivedReplies_.get(index);  } else {
        return smsReceivedRepliesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder> 
         getSmsReceivedRepliesOrBuilderList() {
      if (smsReceivedRepliesBuilder_ != null) {
        return smsReceivedRepliesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(smsReceivedReplies_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder addSmsReceivedRepliesBuilder() {
      return getSmsReceivedRepliesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder addSmsReceivedRepliesBuilder(
        int index) {
      return getSmsReceivedRepliesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsReceivedReplies sms_received_replies = 2 [json_name = "smsReceivedReplies"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder> 
         getSmsReceivedRepliesBuilderList() {
      return getSmsReceivedRepliesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder, com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder> 
        getSmsReceivedRepliesFieldBuilder() {
      if (smsReceivedRepliesBuilder_ == null) {
        smsReceivedRepliesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies, com.tcn.cloud.api.api.v0alpha.SmsReceivedReplies.Builder, com.tcn.cloud.api.api.v0alpha.SmsReceivedRepliesOrBuilder>(
                smsReceivedReplies_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        smsReceivedReplies_ = null;
      }
      return smsReceivedRepliesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SmsTaskInfoWithReply)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SmsTaskInfoWithReply)
  private static final com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply();
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsTaskInfoWithReply>
      PARSER = new com.google.protobuf.AbstractParser<SmsTaskInfoWithReply>() {
    @java.lang.Override
    public SmsTaskInfoWithReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsTaskInfoWithReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsTaskInfoWithReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsTaskInfoWithReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

