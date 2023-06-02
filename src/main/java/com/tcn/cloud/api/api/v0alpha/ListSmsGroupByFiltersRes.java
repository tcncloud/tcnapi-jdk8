// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListSmsGroupByFiltersRes}
 */
public final class ListSmsGroupByFiltersRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListSmsGroupByFiltersRes)
    ListSmsGroupByFiltersResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSmsGroupByFiltersRes.newBuilder() to construct.
  private ListSmsGroupByFiltersRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSmsGroupByFiltersRes() {
    smsGroupWithIntents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSmsGroupByFiltersRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListSmsGroupByFiltersRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListSmsGroupByFiltersRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.class, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.Builder.class);
  }

  public static final int SMS_GROUP_WITH_INTENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> smsGroupWithIntents_;
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> getSmsGroupWithIntentsList() {
    return smsGroupWithIntents_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder> 
      getSmsGroupWithIntentsOrBuilderList() {
    return smsGroupWithIntents_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public int getSmsGroupWithIntentsCount() {
    return smsGroupWithIntents_.size();
  }
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents getSmsGroupWithIntents(int index) {
    return smsGroupWithIntents_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder getSmsGroupWithIntentsOrBuilder(
      int index) {
    return smsGroupWithIntents_.get(index);
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
    for (int i = 0; i < smsGroupWithIntents_.size(); i++) {
      output.writeMessage(1, smsGroupWithIntents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < smsGroupWithIntents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, smsGroupWithIntents_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes other = (com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes) obj;

    if (!getSmsGroupWithIntentsList()
        .equals(other.getSmsGroupWithIntentsList())) return false;
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
    if (getSmsGroupWithIntentsCount() > 0) {
      hash = (37 * hash) + SMS_GROUP_WITH_INTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSmsGroupWithIntentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListSmsGroupByFiltersRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListSmsGroupByFiltersRes)
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListSmsGroupByFiltersRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListSmsGroupByFiltersRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.class, com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.newBuilder()
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
      if (smsGroupWithIntentsBuilder_ == null) {
        smsGroupWithIntents_ = java.util.Collections.emptyList();
      } else {
        smsGroupWithIntents_ = null;
        smsGroupWithIntentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_ListSmsGroupByFiltersRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes build() {
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes result = new com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes result) {
      if (smsGroupWithIntentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          smsGroupWithIntents_ = java.util.Collections.unmodifiableList(smsGroupWithIntents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.smsGroupWithIntents_ = smsGroupWithIntents_;
      } else {
        result.smsGroupWithIntents_ = smsGroupWithIntentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes.getDefaultInstance()) return this;
      if (smsGroupWithIntentsBuilder_ == null) {
        if (!other.smsGroupWithIntents_.isEmpty()) {
          if (smsGroupWithIntents_.isEmpty()) {
            smsGroupWithIntents_ = other.smsGroupWithIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSmsGroupWithIntentsIsMutable();
            smsGroupWithIntents_.addAll(other.smsGroupWithIntents_);
          }
          onChanged();
        }
      } else {
        if (!other.smsGroupWithIntents_.isEmpty()) {
          if (smsGroupWithIntentsBuilder_.isEmpty()) {
            smsGroupWithIntentsBuilder_.dispose();
            smsGroupWithIntentsBuilder_ = null;
            smsGroupWithIntents_ = other.smsGroupWithIntents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            smsGroupWithIntentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSmsGroupWithIntentsFieldBuilder() : null;
          } else {
            smsGroupWithIntentsBuilder_.addAllMessages(other.smsGroupWithIntents_);
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
              com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.parser(),
                      extensionRegistry);
              if (smsGroupWithIntentsBuilder_ == null) {
                ensureSmsGroupWithIntentsIsMutable();
                smsGroupWithIntents_.add(m);
              } else {
                smsGroupWithIntentsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> smsGroupWithIntents_ =
      java.util.Collections.emptyList();
    private void ensureSmsGroupWithIntentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        smsGroupWithIntents_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents>(smsGroupWithIntents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder> smsGroupWithIntentsBuilder_;

    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> getSmsGroupWithIntentsList() {
      if (smsGroupWithIntentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(smsGroupWithIntents_);
      } else {
        return smsGroupWithIntentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public int getSmsGroupWithIntentsCount() {
      if (smsGroupWithIntentsBuilder_ == null) {
        return smsGroupWithIntents_.size();
      } else {
        return smsGroupWithIntentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents getSmsGroupWithIntents(int index) {
      if (smsGroupWithIntentsBuilder_ == null) {
        return smsGroupWithIntents_.get(index);
      } else {
        return smsGroupWithIntentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder setSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents value) {
      if (smsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.set(index, value);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder setSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder builderForValue) {
      if (smsGroupWithIntentsBuilder_ == null) {
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.set(index, builderForValue.build());
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder addSmsGroupWithIntents(com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents value) {
      if (smsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.add(value);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder addSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents value) {
      if (smsGroupWithIntentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.add(index, value);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder addSmsGroupWithIntents(
        com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder builderForValue) {
      if (smsGroupWithIntentsBuilder_ == null) {
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.add(builderForValue.build());
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder addSmsGroupWithIntents(
        int index, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder builderForValue) {
      if (smsGroupWithIntentsBuilder_ == null) {
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.add(index, builderForValue.build());
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder addAllSmsGroupWithIntents(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents> values) {
      if (smsGroupWithIntentsBuilder_ == null) {
        ensureSmsGroupWithIntentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, smsGroupWithIntents_);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder clearSmsGroupWithIntents() {
      if (smsGroupWithIntentsBuilder_ == null) {
        smsGroupWithIntents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public Builder removeSmsGroupWithIntents(int index) {
      if (smsGroupWithIntentsBuilder_ == null) {
        ensureSmsGroupWithIntentsIsMutable();
        smsGroupWithIntents_.remove(index);
        onChanged();
      } else {
        smsGroupWithIntentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder getSmsGroupWithIntentsBuilder(
        int index) {
      return getSmsGroupWithIntentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder getSmsGroupWithIntentsOrBuilder(
        int index) {
      if (smsGroupWithIntentsBuilder_ == null) {
        return smsGroupWithIntents_.get(index);  } else {
        return smsGroupWithIntentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder> 
         getSmsGroupWithIntentsOrBuilderList() {
      if (smsGroupWithIntentsBuilder_ != null) {
        return smsGroupWithIntentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(smsGroupWithIntents_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder addSmsGroupWithIntentsBuilder() {
      return getSmsGroupWithIntentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder addSmsGroupWithIntentsBuilder(
        int index) {
      return getSmsGroupWithIntentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsGroupWithIntents sms_group_with_intents = 1 [json_name = "smsGroupWithIntents"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder> 
         getSmsGroupWithIntentsBuilderList() {
      return getSmsGroupWithIntentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder> 
        getSmsGroupWithIntentsFieldBuilder() {
      if (smsGroupWithIntentsBuilder_ == null) {
        smsGroupWithIntentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntents.Builder, com.tcn.cloud.api.api.v0alpha.SmsGroupWithIntentsOrBuilder>(
                smsGroupWithIntents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        smsGroupWithIntents_ = null;
      }
      return smsGroupWithIntentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListSmsGroupByFiltersRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListSmsGroupByFiltersRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSmsGroupByFiltersRes>
      PARSER = new com.google.protobuf.AbstractParser<ListSmsGroupByFiltersRes>() {
    @java.lang.Override
    public ListSmsGroupByFiltersRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSmsGroupByFiltersRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSmsGroupByFiltersRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListSmsGroupByFiltersRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

