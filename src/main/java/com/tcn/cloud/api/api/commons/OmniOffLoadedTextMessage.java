// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.OmniOffLoadedTextMessage}
 */
public final class OmniOffLoadedTextMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.OmniOffLoadedTextMessage)
    OmniOffLoadedTextMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniOffLoadedTextMessage.newBuilder() to construct.
  private OmniOffLoadedTextMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniOffLoadedTextMessage() {
    location_ = "";
    attachments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniOffLoadedTextMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniOffLoadedTextMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniOffLoadedTextMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.class, com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 1 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACHMENTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> attachments_;
  /**
   * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> getAttachmentsList() {
    return attachments_;
  }
  /**
   * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> 
      getAttachmentsOrBuilderList() {
    return attachments_;
  }
  /**
   * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  @java.lang.Override
  public int getAttachmentsCount() {
    return attachments_.size();
  }
  /**
   * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniAttachment getAttachments(int index) {
    return attachments_.get(index);
  }
  /**
   * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder getAttachmentsOrBuilder(
      int index) {
    return attachments_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    for (int i = 0; i < attachments_.size(); i++) {
      output.writeMessage(2, attachments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    for (int i = 0; i < attachments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, attachments_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage other = (com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage) obj;

    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (!getAttachmentsList()
        .equals(other.getAttachmentsList())) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    if (getAttachmentsCount() > 0) {
      hash = (37 * hash) + ATTACHMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getAttachmentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage prototype) {
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
   * Protobuf type {@code api.commons.OmniOffLoadedTextMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.OmniOffLoadedTextMessage)
      com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniOffLoadedTextMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniOffLoadedTextMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.class, com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.newBuilder()
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
      location_ = "";
      if (attachmentsBuilder_ == null) {
        attachments_ = java.util.Collections.emptyList();
      } else {
        attachments_ = null;
        attachmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniOffLoadedTextMessage_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage build() {
      com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage buildPartial() {
      com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage result = new com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage result) {
      if (attachmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          attachments_ = java.util.Collections.unmodifiableList(attachments_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.attachments_ = attachments_;
      } else {
        result.attachments_ = attachmentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage) {
        return mergeFrom((com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage other) {
      if (other == com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage.getDefaultInstance()) return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (attachmentsBuilder_ == null) {
        if (!other.attachments_.isEmpty()) {
          if (attachments_.isEmpty()) {
            attachments_ = other.attachments_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAttachmentsIsMutable();
            attachments_.addAll(other.attachments_);
          }
          onChanged();
        }
      } else {
        if (!other.attachments_.isEmpty()) {
          if (attachmentsBuilder_.isEmpty()) {
            attachmentsBuilder_.dispose();
            attachmentsBuilder_ = null;
            attachments_ = other.attachments_;
            bitField0_ = (bitField0_ & ~0x00000002);
            attachmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttachmentsFieldBuilder() : null;
          } else {
            attachmentsBuilder_.addAllMessages(other.attachments_);
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
              location_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.commons.OmniAttachment m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.OmniAttachment.parser(),
                      extensionRegistry);
              if (attachmentsBuilder_ == null) {
                ensureAttachmentsIsMutable();
                attachments_.add(m);
              } else {
                attachmentsBuilder_.addMessage(m);
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

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string location = 1 [json_name = "location"];</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> attachments_ =
      java.util.Collections.emptyList();
    private void ensureAttachmentsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        attachments_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.OmniAttachment>(attachments_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniAttachment, com.tcn.cloud.api.api.commons.OmniAttachment.Builder, com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> attachmentsBuilder_;

    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment> getAttachmentsList() {
      if (attachmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attachments_);
      } else {
        return attachmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public int getAttachmentsCount() {
      if (attachmentsBuilder_ == null) {
        return attachments_.size();
      } else {
        return attachmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachment getAttachments(int index) {
      if (attachmentsBuilder_ == null) {
        return attachments_.get(index);
      } else {
        return attachmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder setAttachments(
        int index, com.tcn.cloud.api.api.commons.OmniAttachment value) {
      if (attachmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentsIsMutable();
        attachments_.set(index, value);
        onChanged();
      } else {
        attachmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder setAttachments(
        int index, com.tcn.cloud.api.api.commons.OmniAttachment.Builder builderForValue) {
      if (attachmentsBuilder_ == null) {
        ensureAttachmentsIsMutable();
        attachments_.set(index, builderForValue.build());
        onChanged();
      } else {
        attachmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder addAttachments(com.tcn.cloud.api.api.commons.OmniAttachment value) {
      if (attachmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentsIsMutable();
        attachments_.add(value);
        onChanged();
      } else {
        attachmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder addAttachments(
        int index, com.tcn.cloud.api.api.commons.OmniAttachment value) {
      if (attachmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentsIsMutable();
        attachments_.add(index, value);
        onChanged();
      } else {
        attachmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder addAttachments(
        com.tcn.cloud.api.api.commons.OmniAttachment.Builder builderForValue) {
      if (attachmentsBuilder_ == null) {
        ensureAttachmentsIsMutable();
        attachments_.add(builderForValue.build());
        onChanged();
      } else {
        attachmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder addAttachments(
        int index, com.tcn.cloud.api.api.commons.OmniAttachment.Builder builderForValue) {
      if (attachmentsBuilder_ == null) {
        ensureAttachmentsIsMutable();
        attachments_.add(index, builderForValue.build());
        onChanged();
      } else {
        attachmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder addAllAttachments(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.OmniAttachment> values) {
      if (attachmentsBuilder_ == null) {
        ensureAttachmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attachments_);
        onChanged();
      } else {
        attachmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder clearAttachments() {
      if (attachmentsBuilder_ == null) {
        attachments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        attachmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public Builder removeAttachments(int index) {
      if (attachmentsBuilder_ == null) {
        ensureAttachmentsIsMutable();
        attachments_.remove(index);
        onChanged();
      } else {
        attachmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachment.Builder getAttachmentsBuilder(
        int index) {
      return getAttachmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder getAttachmentsOrBuilder(
        int index) {
      if (attachmentsBuilder_ == null) {
        return attachments_.get(index);  } else {
        return attachmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> 
         getAttachmentsOrBuilderList() {
      if (attachmentsBuilder_ != null) {
        return attachmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attachments_);
      }
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachment.Builder addAttachmentsBuilder() {
      return getAttachmentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.OmniAttachment.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniAttachment.Builder addAttachmentsBuilder(
        int index) {
      return getAttachmentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.OmniAttachment.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.OmniAttachment attachments = 2 [json_name = "attachments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.OmniAttachment.Builder> 
         getAttachmentsBuilderList() {
      return getAttachmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniAttachment, com.tcn.cloud.api.api.commons.OmniAttachment.Builder, com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder> 
        getAttachmentsFieldBuilder() {
      if (attachmentsBuilder_ == null) {
        attachmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniAttachment, com.tcn.cloud.api.api.commons.OmniAttachment.Builder, com.tcn.cloud.api.api.commons.OmniAttachmentOrBuilder>(
                attachments_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        attachments_ = null;
      }
      return attachmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.OmniOffLoadedTextMessage)
  }

  // @@protoc_insertion_point(class_scope:api.commons.OmniOffLoadedTextMessage)
  private static final com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage();
  }

  public static com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniOffLoadedTextMessage>
      PARSER = new com.google.protobuf.AbstractParser<OmniOffLoadedTextMessage>() {
    @java.lang.Override
    public OmniOffLoadedTextMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmniOffLoadedTextMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniOffLoadedTextMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniOffLoadedTextMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

