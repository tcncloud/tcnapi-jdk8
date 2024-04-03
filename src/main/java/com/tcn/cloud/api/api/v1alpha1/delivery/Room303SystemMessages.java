// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.Room303SystemMessages}
 */
public final class Room303SystemMessages extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.Room303SystemMessages)
    Room303SystemMessagesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Room303SystemMessages.newBuilder() to construct.
  private Room303SystemMessages(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Room303SystemMessages() {
    systemMessages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Room303SystemMessages();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Room303SystemMessages_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Room303SystemMessages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.class, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.Builder.class);
  }

  public static final int SYSTEM_MESSAGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage> systemMessages_;
  /**
   * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage> getSystemMessagesList() {
    return systemMessages_;
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder> 
      getSystemMessagesOrBuilderList() {
    return systemMessages_;
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
   */
  @java.lang.Override
  public int getSystemMessagesCount() {
    return systemMessages_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage getSystemMessages(int index) {
    return systemMessages_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder getSystemMessagesOrBuilder(
      int index) {
    return systemMessages_.get(index);
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
    for (int i = 0; i < systemMessages_.size(); i++) {
      output.writeMessage(1, systemMessages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < systemMessages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, systemMessages_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages other = (com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages) obj;

    if (!getSystemMessagesList()
        .equals(other.getSystemMessagesList())) return false;
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
    if (getSystemMessagesCount() > 0) {
      hash = (37 * hash) + SYSTEM_MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getSystemMessagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.Room303SystemMessages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.Room303SystemMessages)
      com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessagesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Room303SystemMessages_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Room303SystemMessages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.class, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.newBuilder()
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
      if (systemMessagesBuilder_ == null) {
        systemMessages_ = java.util.Collections.emptyList();
      } else {
        systemMessages_ = null;
        systemMessagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Room303SystemMessages_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages result = new com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages result) {
      if (systemMessagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          systemMessages_ = java.util.Collections.unmodifiableList(systemMessages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.systemMessages_ = systemMessages_;
      } else {
        result.systemMessages_ = systemMessagesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages.getDefaultInstance()) return this;
      if (systemMessagesBuilder_ == null) {
        if (!other.systemMessages_.isEmpty()) {
          if (systemMessages_.isEmpty()) {
            systemMessages_ = other.systemMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSystemMessagesIsMutable();
            systemMessages_.addAll(other.systemMessages_);
          }
          onChanged();
        }
      } else {
        if (!other.systemMessages_.isEmpty()) {
          if (systemMessagesBuilder_.isEmpty()) {
            systemMessagesBuilder_.dispose();
            systemMessagesBuilder_ = null;
            systemMessages_ = other.systemMessages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            systemMessagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSystemMessagesFieldBuilder() : null;
          } else {
            systemMessagesBuilder_.addAllMessages(other.systemMessages_);
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
              com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.parser(),
                      extensionRegistry);
              if (systemMessagesBuilder_ == null) {
                ensureSystemMessagesIsMutable();
                systemMessages_.add(m);
              } else {
                systemMessagesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage> systemMessages_ =
      java.util.Collections.emptyList();
    private void ensureSystemMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        systemMessages_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage>(systemMessages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder> systemMessagesBuilder_;

    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage> getSystemMessagesList() {
      if (systemMessagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(systemMessages_);
      } else {
        return systemMessagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public int getSystemMessagesCount() {
      if (systemMessagesBuilder_ == null) {
        return systemMessages_.size();
      } else {
        return systemMessagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage getSystemMessages(int index) {
      if (systemMessagesBuilder_ == null) {
        return systemMessages_.get(index);
      } else {
        return systemMessagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder setSystemMessages(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage value) {
      if (systemMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSystemMessagesIsMutable();
        systemMessages_.set(index, value);
        onChanged();
      } else {
        systemMessagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder setSystemMessages(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder builderForValue) {
      if (systemMessagesBuilder_ == null) {
        ensureSystemMessagesIsMutable();
        systemMessages_.set(index, builderForValue.build());
        onChanged();
      } else {
        systemMessagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder addSystemMessages(com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage value) {
      if (systemMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSystemMessagesIsMutable();
        systemMessages_.add(value);
        onChanged();
      } else {
        systemMessagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder addSystemMessages(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage value) {
      if (systemMessagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSystemMessagesIsMutable();
        systemMessages_.add(index, value);
        onChanged();
      } else {
        systemMessagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder addSystemMessages(
        com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder builderForValue) {
      if (systemMessagesBuilder_ == null) {
        ensureSystemMessagesIsMutable();
        systemMessages_.add(builderForValue.build());
        onChanged();
      } else {
        systemMessagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder addSystemMessages(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder builderForValue) {
      if (systemMessagesBuilder_ == null) {
        ensureSystemMessagesIsMutable();
        systemMessages_.add(index, builderForValue.build());
        onChanged();
      } else {
        systemMessagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder addAllSystemMessages(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage> values) {
      if (systemMessagesBuilder_ == null) {
        ensureSystemMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, systemMessages_);
        onChanged();
      } else {
        systemMessagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder clearSystemMessages() {
      if (systemMessagesBuilder_ == null) {
        systemMessages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        systemMessagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public Builder removeSystemMessages(int index) {
      if (systemMessagesBuilder_ == null) {
        ensureSystemMessagesIsMutable();
        systemMessages_.remove(index);
        onChanged();
      } else {
        systemMessagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder getSystemMessagesBuilder(
        int index) {
      return getSystemMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder getSystemMessagesOrBuilder(
        int index) {
      if (systemMessagesBuilder_ == null) {
        return systemMessages_.get(index);  } else {
        return systemMessagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder> 
         getSystemMessagesOrBuilderList() {
      if (systemMessagesBuilder_ != null) {
        return systemMessagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(systemMessages_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder addSystemMessagesBuilder() {
      return getSystemMessagesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder addSystemMessagesBuilder(
        int index) {
      return getSystemMessagesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Room303SystemMessage system_messages = 1 [json_name = "systemMessages"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder> 
         getSystemMessagesBuilderList() {
      return getSystemMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder> 
        getSystemMessagesFieldBuilder() {
      if (systemMessagesBuilder_ == null) {
        systemMessagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessage.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessageOrBuilder>(
                systemMessages_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        systemMessages_ = null;
      }
      return systemMessagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.Room303SystemMessages)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.Room303SystemMessages)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Room303SystemMessages>
      PARSER = new com.google.protobuf.AbstractParser<Room303SystemMessages>() {
    @java.lang.Override
    public Room303SystemMessages parsePartialFrom(
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

  public static com.google.protobuf.Parser<Room303SystemMessages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Room303SystemMessages> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Room303SystemMessages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
