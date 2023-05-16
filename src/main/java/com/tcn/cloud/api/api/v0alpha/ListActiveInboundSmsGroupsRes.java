// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListActiveInboundSmsGroupsRes}
 */
public final class ListActiveInboundSmsGroupsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListActiveInboundSmsGroupsRes)
    ListActiveInboundSmsGroupsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListActiveInboundSmsGroupsRes.newBuilder() to construct.
  private ListActiveInboundSmsGroupsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListActiveInboundSmsGroupsRes() {
    inboundSmsGroupWithIntents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListActiveInboundSmsGroupsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListActiveInboundSmsGroupsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListActiveInboundSmsGroupsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.class, com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.Builder.class);
  }

  public static final int INBOUND_SMS_GROUP_WITH_INTENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents> inboundSmsGroupWithIntents_;
  /**
   * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents> getInboundSmsGroupWithIntentsList() {
    return inboundSmsGroupWithIntents_;
  }
  /**
   * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder> 
      getInboundSmsGroupWithIntentsOrBuilderList() {
    return inboundSmsGroupWithIntents_;
  }
  /**
   * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public int getInboundSmsGroupWithIntentsCount() {
    return inboundSmsGroupWithIntents_.size();
  }
  /**
   * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents getInboundSmsGroupWithIntents(int index) {
    return inboundSmsGroupWithIntents_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder getInboundSmsGroupWithIntentsOrBuilder(
      int index) {
    return inboundSmsGroupWithIntents_.get(index);
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
    for (int i = 0; i < inboundSmsGroupWithIntents_.size(); i++) {
      output.writeMessage(1, inboundSmsGroupWithIntents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inboundSmsGroupWithIntents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inboundSmsGroupWithIntents_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes other = (com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes) obj;

    if (!getInboundSmsGroupWithIntentsList()
        .equals(other.getInboundSmsGroupWithIntentsList())) return false;
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
    if (getInboundSmsGroupWithIntentsCount() > 0) {
      hash = (37 * hash) + INBOUND_SMS_GROUP_WITH_INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getInboundSmsGroupWithIntentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListActiveInboundSmsGroupsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListActiveInboundSmsGroupsRes)
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListActiveInboundSmsGroupsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListActiveInboundSmsGroupsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.class, com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.newBuilder()
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
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        inboundSmsGroupWithIntents_ = java.util.Collections.emptyList();
      } else {
        inboundSmsGroupWithIntents_ = null;
        inboundSmsGroupWithIntentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListActiveInboundSmsGroupsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes build() {
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes result = new com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes result) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inboundSmsGroupWithIntents_ = java.util.Collections.unmodifiableList(inboundSmsGroupWithIntents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inboundSmsGroupWithIntents_ = inboundSmsGroupWithIntents_;
      } else {
        result.inboundSmsGroupWithIntents_ = inboundSmsGroupWithIntentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes.getDefaultInstance()) return this;
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        if (!other.inboundSmsGroupWithIntents_.isEmpty()) {
          if (inboundSmsGroupWithIntents_.isEmpty()) {
            inboundSmsGroupWithIntents_ = other.inboundSmsGroupWithIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInboundSmsGroupWithIntentsIsMutable();
            inboundSmsGroupWithIntents_.addAll(other.inboundSmsGroupWithIntents_);
          }
          onChanged();
        }
      } else {
        if (!other.inboundSmsGroupWithIntents_.isEmpty()) {
          if (inboundSmsGroupWithIntentsBuilder_.isEmpty()) {
            inboundSmsGroupWithIntentsBuilder_.dispose();
            inboundSmsGroupWithIntentsBuilder_ = null;
            inboundSmsGroupWithIntents_ = other.inboundSmsGroupWithIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inboundSmsGroupWithIntentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInboundSmsGroupWithIntentsFieldBuilder() : null;
          } else {
            inboundSmsGroupWithIntentsBuilder_.addAllMessages(other.inboundSmsGroupWithIntents_);
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
              com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.parser(),
                      extensionRegistry);
              if (inboundSmsGroupWithIntentsBuilder_ == null) {
                ensureInboundSmsGroupWithIntentsIsMutable();
                inboundSmsGroupWithIntents_.add(m);
              } else {
                inboundSmsGroupWithIntentsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents> inboundSmsGroupWithIntents_ =
      java.util.Collections.emptyList();
    private void ensureInboundSmsGroupWithIntentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inboundSmsGroupWithIntents_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents>(inboundSmsGroupWithIntents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder> inboundSmsGroupWithIntentsBuilder_;

    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents> getInboundSmsGroupWithIntentsList() {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inboundSmsGroupWithIntents_);
      } else {
        return inboundSmsGroupWithIntentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public int getInboundSmsGroupWithIntentsCount() {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        return inboundSmsGroupWithIntents_.size();
      } else {
        return inboundSmsGroupWithIntentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents getInboundSmsGroupWithIntents(int index) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        return inboundSmsGroupWithIntents_.get(index);
      } else {
        return inboundSmsGroupWithIntentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder setInboundSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents value) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.set(index, value);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder setInboundSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder builderForValue) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.set(index, builderForValue.build());
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder addInboundSmsGroupWithIntents(com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents value) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.add(value);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder addInboundSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents value) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.add(index, value);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder addInboundSmsGroupWithIntents(
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder builderForValue) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.add(builderForValue.build());
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder addInboundSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder builderForValue) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.add(index, builderForValue.build());
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder addAllInboundSmsGroupWithIntents(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents> values) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        ensureInboundSmsGroupWithIntentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inboundSmsGroupWithIntents_);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder clearInboundSmsGroupWithIntents() {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        inboundSmsGroupWithIntents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public Builder removeInboundSmsGroupWithIntents(int index) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        ensureInboundSmsGroupWithIntentsIsMutable();
        inboundSmsGroupWithIntents_.remove(index);
        onChanged();
      } else {
        inboundSmsGroupWithIntentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder getInboundSmsGroupWithIntentsBuilder(
        int index) {
      return getInboundSmsGroupWithIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder getInboundSmsGroupWithIntentsOrBuilder(
        int index) {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        return inboundSmsGroupWithIntents_.get(index);  } else {
        return inboundSmsGroupWithIntentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder> 
         getInboundSmsGroupWithIntentsOrBuilderList() {
      if (inboundSmsGroupWithIntentsBuilder_ != null) {
        return inboundSmsGroupWithIntentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inboundSmsGroupWithIntents_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder addInboundSmsGroupWithIntentsBuilder() {
      return getInboundSmsGroupWithIntentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder addInboundSmsGroupWithIntentsBuilder(
        int index) {
      return getInboundSmsGroupWithIntentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.InboundSmsGroupWithIntents inbound_sms_group_with_intents = 1 [json_name = "inboundSmsGroupWithIntents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder> 
         getInboundSmsGroupWithIntentsBuilderList() {
      return getInboundSmsGroupWithIntentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder> 
        getInboundSmsGroupWithIntentsFieldBuilder() {
      if (inboundSmsGroupWithIntentsBuilder_ == null) {
        inboundSmsGroupWithIntentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder>(
                inboundSmsGroupWithIntents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inboundSmsGroupWithIntents_ = null;
      }
      return inboundSmsGroupWithIntentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListActiveInboundSmsGroupsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListActiveInboundSmsGroupsRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListActiveInboundSmsGroupsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListActiveInboundSmsGroupsRes>() {
    @java.lang.Override
    public ListActiveInboundSmsGroupsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListActiveInboundSmsGroupsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListActiveInboundSmsGroupsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListActiveInboundSmsGroupsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

