// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.InboundSmsGroupWithIntents}
 */
public final class InboundSmsGroupWithIntents extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.InboundSmsGroupWithIntents)
    InboundSmsGroupWithIntentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InboundSmsGroupWithIntents.newBuilder() to construct.
  private InboundSmsGroupWithIntents(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InboundSmsGroupWithIntents() {
    smsIntentTemplates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InboundSmsGroupWithIntents();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_InboundSmsGroupWithIntents_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_InboundSmsGroupWithIntents_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.class, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder.class);
  }

  public static final int INBOUND_SMS_GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.InboundSmsGroup inboundSmsGroup_;
  /**
   * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
   * @return Whether the inboundSmsGroup field is set.
   */
  @java.lang.Override
  public boolean hasInboundSmsGroup() {
    return inboundSmsGroup_ != null;
  }
  /**
   * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
   * @return The inboundSmsGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.InboundSmsGroup getInboundSmsGroup() {
    return inboundSmsGroup_ == null ? com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.getDefaultInstance() : inboundSmsGroup_;
  }
  /**
   * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupOrBuilder getInboundSmsGroupOrBuilder() {
    return inboundSmsGroup_ == null ? com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.getDefaultInstance() : inboundSmsGroup_;
  }

  public static final int SMS_INTENT_TEMPLATES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> smsIntentTemplates_;
  /**
   * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getSmsIntentTemplatesList() {
    return smsIntentTemplates_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder> 
      getSmsIntentTemplatesOrBuilderList() {
    return smsIntentTemplates_;
  }
  /**
   * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
   */
  @java.lang.Override
  public int getSmsIntentTemplatesCount() {
    return smsIntentTemplates_.size();
  }
  /**
   * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate getSmsIntentTemplates(int index) {
    return smsIntentTemplates_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder getSmsIntentTemplatesOrBuilder(
      int index) {
    return smsIntentTemplates_.get(index);
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
    if (inboundSmsGroup_ != null) {
      output.writeMessage(1, getInboundSmsGroup());
    }
    for (int i = 0; i < smsIntentTemplates_.size(); i++) {
      output.writeMessage(2, smsIntentTemplates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inboundSmsGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInboundSmsGroup());
    }
    for (int i = 0; i < smsIntentTemplates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, smsIntentTemplates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents other = (com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents) obj;

    if (hasInboundSmsGroup() != other.hasInboundSmsGroup()) return false;
    if (hasInboundSmsGroup()) {
      if (!getInboundSmsGroup()
          .equals(other.getInboundSmsGroup())) return false;
    }
    if (!getSmsIntentTemplatesList()
        .equals(other.getSmsIntentTemplatesList())) return false;
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
    if (hasInboundSmsGroup()) {
      hash = (37 * hash) + INBOUND_SMS_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getInboundSmsGroup().hashCode();
    }
    if (getSmsIntentTemplatesCount() > 0) {
      hash = (37 * hash) + SMS_INTENT_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getSmsIntentTemplatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents prototype) {
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
   * Protobuf type {@code api.v0alpha.InboundSmsGroupWithIntents}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.InboundSmsGroupWithIntents)
      com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_InboundSmsGroupWithIntents_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_InboundSmsGroupWithIntents_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.class, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.newBuilder()
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
      inboundSmsGroup_ = null;
      if (inboundSmsGroupBuilder_ != null) {
        inboundSmsGroupBuilder_.dispose();
        inboundSmsGroupBuilder_ = null;
      }
      if (smsIntentTemplatesBuilder_ == null) {
        smsIntentTemplates_ = java.util.Collections.emptyList();
      } else {
        smsIntentTemplates_ = null;
        smsIntentTemplatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_InboundSmsGroupWithIntents_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents build() {
      com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents buildPartial() {
      com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents result = new com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents result) {
      if (smsIntentTemplatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          smsIntentTemplates_ = java.util.Collections.unmodifiableList(smsIntentTemplates_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.smsIntentTemplates_ = smsIntentTemplates_;
      } else {
        result.smsIntentTemplates_ = smsIntentTemplatesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inboundSmsGroup_ = inboundSmsGroupBuilder_ == null
            ? inboundSmsGroup_
            : inboundSmsGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents other) {
      if (other == com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents.getDefaultInstance()) return this;
      if (other.hasInboundSmsGroup()) {
        mergeInboundSmsGroup(other.getInboundSmsGroup());
      }
      if (smsIntentTemplatesBuilder_ == null) {
        if (!other.smsIntentTemplates_.isEmpty()) {
          if (smsIntentTemplates_.isEmpty()) {
            smsIntentTemplates_ = other.smsIntentTemplates_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSmsIntentTemplatesIsMutable();
            smsIntentTemplates_.addAll(other.smsIntentTemplates_);
          }
          onChanged();
        }
      } else {
        if (!other.smsIntentTemplates_.isEmpty()) {
          if (smsIntentTemplatesBuilder_.isEmpty()) {
            smsIntentTemplatesBuilder_.dispose();
            smsIntentTemplatesBuilder_ = null;
            smsIntentTemplates_ = other.smsIntentTemplates_;
            bitField0_ = (bitField0_ & ~0x00000002);
            smsIntentTemplatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSmsIntentTemplatesFieldBuilder() : null;
          } else {
            smsIntentTemplatesBuilder_.addAllMessages(other.smsIntentTemplates_);
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
                  getInboundSmsGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.parser(),
                      extensionRegistry);
              if (smsIntentTemplatesBuilder_ == null) {
                ensureSmsIntentTemplatesIsMutable();
                smsIntentTemplates_.add(m);
              } else {
                smsIntentTemplatesBuilder_.addMessage(m);
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

    private com.tcn.cloud.api.api.v0alpha.InboundSmsGroup inboundSmsGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroup, com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupOrBuilder> inboundSmsGroupBuilder_;
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     * @return Whether the inboundSmsGroup field is set.
     */
    public boolean hasInboundSmsGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     * @return The inboundSmsGroup.
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroup getInboundSmsGroup() {
      if (inboundSmsGroupBuilder_ == null) {
        return inboundSmsGroup_ == null ? com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.getDefaultInstance() : inboundSmsGroup_;
      } else {
        return inboundSmsGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public Builder setInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.InboundSmsGroup value) {
      if (inboundSmsGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inboundSmsGroup_ = value;
      } else {
        inboundSmsGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public Builder setInboundSmsGroup(
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.Builder builderForValue) {
      if (inboundSmsGroupBuilder_ == null) {
        inboundSmsGroup_ = builderForValue.build();
      } else {
        inboundSmsGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public Builder mergeInboundSmsGroup(com.tcn.cloud.api.api.v0alpha.InboundSmsGroup value) {
      if (inboundSmsGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          inboundSmsGroup_ != null &&
          inboundSmsGroup_ != com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.getDefaultInstance()) {
          getInboundSmsGroupBuilder().mergeFrom(value);
        } else {
          inboundSmsGroup_ = value;
        }
      } else {
        inboundSmsGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public Builder clearInboundSmsGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      inboundSmsGroup_ = null;
      if (inboundSmsGroupBuilder_ != null) {
        inboundSmsGroupBuilder_.dispose();
        inboundSmsGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.Builder getInboundSmsGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInboundSmsGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupOrBuilder getInboundSmsGroupOrBuilder() {
      if (inboundSmsGroupBuilder_ != null) {
        return inboundSmsGroupBuilder_.getMessageOrBuilder();
      } else {
        return inboundSmsGroup_ == null ?
            com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.getDefaultInstance() : inboundSmsGroup_;
      }
    }
    /**
     * <code>.api.v0alpha.InboundSmsGroup inbound_sms_group = 1 [json_name = "inboundSmsGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.InboundSmsGroup, com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupOrBuilder> 
        getInboundSmsGroupFieldBuilder() {
      if (inboundSmsGroupBuilder_ == null) {
        inboundSmsGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.InboundSmsGroup, com.tcn.cloud.api.api.v0alpha.InboundSmsGroup.Builder, com.tcn.cloud.api.api.v0alpha.InboundSmsGroupOrBuilder>(
                getInboundSmsGroup(),
                getParentForChildren(),
                isClean());
        inboundSmsGroup_ = null;
      }
      return inboundSmsGroupBuilder_;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> smsIntentTemplates_ =
      java.util.Collections.emptyList();
    private void ensureSmsIntentTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        smsIntentTemplates_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate>(smsIntentTemplates_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder> smsIntentTemplatesBuilder_;

    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> getSmsIntentTemplatesList() {
      if (smsIntentTemplatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(smsIntentTemplates_);
      } else {
        return smsIntentTemplatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public int getSmsIntentTemplatesCount() {
      if (smsIntentTemplatesBuilder_ == null) {
        return smsIntentTemplates_.size();
      } else {
        return smsIntentTemplatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate getSmsIntentTemplates(int index) {
      if (smsIntentTemplatesBuilder_ == null) {
        return smsIntentTemplates_.get(index);
      } else {
        return smsIntentTemplatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder setSmsIntentTemplates(
        int index, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate value) {
      if (smsIntentTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.set(index, value);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder setSmsIntentTemplates(
        int index, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder builderForValue) {
      if (smsIntentTemplatesBuilder_ == null) {
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.set(index, builderForValue.build());
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder addSmsIntentTemplates(com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate value) {
      if (smsIntentTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.add(value);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder addSmsIntentTemplates(
        int index, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate value) {
      if (smsIntentTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.add(index, value);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder addSmsIntentTemplates(
        com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder builderForValue) {
      if (smsIntentTemplatesBuilder_ == null) {
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.add(builderForValue.build());
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder addSmsIntentTemplates(
        int index, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder builderForValue) {
      if (smsIntentTemplatesBuilder_ == null) {
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.add(index, builderForValue.build());
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder addAllSmsIntentTemplates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate> values) {
      if (smsIntentTemplatesBuilder_ == null) {
        ensureSmsIntentTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, smsIntentTemplates_);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder clearSmsIntentTemplates() {
      if (smsIntentTemplatesBuilder_ == null) {
        smsIntentTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public Builder removeSmsIntentTemplates(int index) {
      if (smsIntentTemplatesBuilder_ == null) {
        ensureSmsIntentTemplatesIsMutable();
        smsIntentTemplates_.remove(index);
        onChanged();
      } else {
        smsIntentTemplatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder getSmsIntentTemplatesBuilder(
        int index) {
      return getSmsIntentTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder getSmsIntentTemplatesOrBuilder(
        int index) {
      if (smsIntentTemplatesBuilder_ == null) {
        return smsIntentTemplates_.get(index);  } else {
        return smsIntentTemplatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder> 
         getSmsIntentTemplatesOrBuilderList() {
      if (smsIntentTemplatesBuilder_ != null) {
        return smsIntentTemplatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(smsIntentTemplates_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder addSmsIntentTemplatesBuilder() {
      return getSmsIntentTemplatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder addSmsIntentTemplatesBuilder(
        int index) {
      return getSmsIntentTemplatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SmsIntentTemplate sms_intent_templates = 2 [json_name = "smsIntentTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder> 
         getSmsIntentTemplatesBuilderList() {
      return getSmsIntentTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder> 
        getSmsIntentTemplatesFieldBuilder() {
      if (smsIntentTemplatesBuilder_ == null) {
        smsIntentTemplatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplate.Builder, com.tcn.cloud.api.api.v0alpha.SmsIntentTemplateOrBuilder>(
                smsIntentTemplates_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        smsIntentTemplates_ = null;
      }
      return smsIntentTemplatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.InboundSmsGroupWithIntents)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.InboundSmsGroupWithIntents)
  private static final com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents();
  }

  public static com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InboundSmsGroupWithIntents>
      PARSER = new com.google.protobuf.AbstractParser<InboundSmsGroupWithIntents>() {
    @java.lang.Override
    public InboundSmsGroupWithIntents parsePartialFrom(
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

  public static com.google.protobuf.Parser<InboundSmsGroupWithIntents> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InboundSmsGroupWithIntents> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.InboundSmsGroupWithIntents getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

