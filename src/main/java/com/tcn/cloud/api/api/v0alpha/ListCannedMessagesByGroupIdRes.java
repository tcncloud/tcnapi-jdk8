// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * response holding the list of CannedMessages with group details for the group
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListCannedMessagesByGroupIdRes}
 */
public final class ListCannedMessagesByGroupIdRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListCannedMessagesByGroupIdRes)
    ListCannedMessagesByGroupIdResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCannedMessagesByGroupIdRes.newBuilder() to construct.
  private ListCannedMessagesByGroupIdRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCannedMessagesByGroupIdRes() {
    cannedMessagesWithGroup_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCannedMessagesByGroupIdRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ListCannedMessagesByGroupIdRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ListCannedMessagesByGroupIdRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.class, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.Builder.class);
  }

  public static final int CANNED_MESSAGES_WITH_GROUP_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> cannedMessagesWithGroup_;
  /**
   * <pre>
   * the list of cannedMessages with group details
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getCannedMessagesWithGroupList() {
    return cannedMessagesWithGroup_;
  }
  /**
   * <pre>
   * the list of cannedMessages with group details
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder> 
      getCannedMessagesWithGroupOrBuilderList() {
    return cannedMessagesWithGroup_;
  }
  /**
   * <pre>
   * the list of cannedMessages with group details
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
   */
  @java.lang.Override
  public int getCannedMessagesWithGroupCount() {
    return cannedMessagesWithGroup_.size();
  }
  /**
   * <pre>
   * the list of cannedMessages with group details
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup getCannedMessagesWithGroup(int index) {
    return cannedMessagesWithGroup_.get(index);
  }
  /**
   * <pre>
   * the list of cannedMessages with group details
   * </pre>
   *
   * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder getCannedMessagesWithGroupOrBuilder(
      int index) {
    return cannedMessagesWithGroup_.get(index);
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
    for (int i = 0; i < cannedMessagesWithGroup_.size(); i++) {
      output.writeMessage(1, cannedMessagesWithGroup_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cannedMessagesWithGroup_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cannedMessagesWithGroup_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes other = (com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes) obj;

    if (!getCannedMessagesWithGroupList()
        .equals(other.getCannedMessagesWithGroupList())) return false;
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
    if (getCannedMessagesWithGroupCount() > 0) {
      hash = (37 * hash) + CANNED_MESSAGES_WITH_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getCannedMessagesWithGroupList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes prototype) {
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
   * <pre>
   * response holding the list of CannedMessages with group details for the group
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListCannedMessagesByGroupIdRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListCannedMessagesByGroupIdRes)
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ListCannedMessagesByGroupIdRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ListCannedMessagesByGroupIdRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.class, com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.newBuilder()
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
      if (cannedMessagesWithGroupBuilder_ == null) {
        cannedMessagesWithGroup_ = java.util.Collections.emptyList();
      } else {
        cannedMessagesWithGroup_ = null;
        cannedMessagesWithGroupBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ListCannedMessagesByGroupIdRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes build() {
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes result = new com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes result) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cannedMessagesWithGroup_ = java.util.Collections.unmodifiableList(cannedMessagesWithGroup_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cannedMessagesWithGroup_ = cannedMessagesWithGroup_;
      } else {
        result.cannedMessagesWithGroup_ = cannedMessagesWithGroupBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes.getDefaultInstance()) return this;
      if (cannedMessagesWithGroupBuilder_ == null) {
        if (!other.cannedMessagesWithGroup_.isEmpty()) {
          if (cannedMessagesWithGroup_.isEmpty()) {
            cannedMessagesWithGroup_ = other.cannedMessagesWithGroup_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCannedMessagesWithGroupIsMutable();
            cannedMessagesWithGroup_.addAll(other.cannedMessagesWithGroup_);
          }
          onChanged();
        }
      } else {
        if (!other.cannedMessagesWithGroup_.isEmpty()) {
          if (cannedMessagesWithGroupBuilder_.isEmpty()) {
            cannedMessagesWithGroupBuilder_.dispose();
            cannedMessagesWithGroupBuilder_ = null;
            cannedMessagesWithGroup_ = other.cannedMessagesWithGroup_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cannedMessagesWithGroupBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCannedMessagesWithGroupFieldBuilder() : null;
          } else {
            cannedMessagesWithGroupBuilder_.addAllMessages(other.cannedMessagesWithGroup_);
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
              com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.parser(),
                      extensionRegistry);
              if (cannedMessagesWithGroupBuilder_ == null) {
                ensureCannedMessagesWithGroupIsMutable();
                cannedMessagesWithGroup_.add(m);
              } else {
                cannedMessagesWithGroupBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> cannedMessagesWithGroup_ =
      java.util.Collections.emptyList();
    private void ensureCannedMessagesWithGroupIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cannedMessagesWithGroup_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup>(cannedMessagesWithGroup_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder> cannedMessagesWithGroupBuilder_;

    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> getCannedMessagesWithGroupList() {
      if (cannedMessagesWithGroupBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cannedMessagesWithGroup_);
      } else {
        return cannedMessagesWithGroupBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public int getCannedMessagesWithGroupCount() {
      if (cannedMessagesWithGroupBuilder_ == null) {
        return cannedMessagesWithGroup_.size();
      } else {
        return cannedMessagesWithGroupBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup getCannedMessagesWithGroup(int index) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        return cannedMessagesWithGroup_.get(index);
      } else {
        return cannedMessagesWithGroupBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder setCannedMessagesWithGroup(
        int index, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup value) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.set(index, value);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder setCannedMessagesWithGroup(
        int index, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder builderForValue) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.set(index, builderForValue.build());
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder addCannedMessagesWithGroup(com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup value) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.add(value);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder addCannedMessagesWithGroup(
        int index, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup value) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.add(index, value);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder addCannedMessagesWithGroup(
        com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder builderForValue) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.add(builderForValue.build());
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder addCannedMessagesWithGroup(
        int index, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder builderForValue) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.add(index, builderForValue.build());
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder addAllCannedMessagesWithGroup(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup> values) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        ensureCannedMessagesWithGroupIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cannedMessagesWithGroup_);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder clearCannedMessagesWithGroup() {
      if (cannedMessagesWithGroupBuilder_ == null) {
        cannedMessagesWithGroup_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public Builder removeCannedMessagesWithGroup(int index) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        ensureCannedMessagesWithGroupIsMutable();
        cannedMessagesWithGroup_.remove(index);
        onChanged();
      } else {
        cannedMessagesWithGroupBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder getCannedMessagesWithGroupBuilder(
        int index) {
      return getCannedMessagesWithGroupFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder getCannedMessagesWithGroupOrBuilder(
        int index) {
      if (cannedMessagesWithGroupBuilder_ == null) {
        return cannedMessagesWithGroup_.get(index);  } else {
        return cannedMessagesWithGroupBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder> 
         getCannedMessagesWithGroupOrBuilderList() {
      if (cannedMessagesWithGroupBuilder_ != null) {
        return cannedMessagesWithGroupBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cannedMessagesWithGroup_);
      }
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder addCannedMessagesWithGroupBuilder() {
      return getCannedMessagesWithGroupFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder addCannedMessagesWithGroupBuilder(
        int index) {
      return getCannedMessagesWithGroupFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * the list of cannedMessages with group details
     * </pre>
     *
     * <code>repeated .api.v0alpha.CannedMessageWithGroup canned_messages_with_group = 1 [json_name = "cannedMessagesWithGroup"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder> 
         getCannedMessagesWithGroupBuilderList() {
      return getCannedMessagesWithGroupFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder> 
        getCannedMessagesWithGroupFieldBuilder() {
      if (cannedMessagesWithGroupBuilder_ == null) {
        cannedMessagesWithGroupBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroup.Builder, com.tcn.cloud.api.api.v0alpha.CannedMessageWithGroupOrBuilder>(
                cannedMessagesWithGroup_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cannedMessagesWithGroup_ = null;
      }
      return cannedMessagesWithGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListCannedMessagesByGroupIdRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListCannedMessagesByGroupIdRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCannedMessagesByGroupIdRes>
      PARSER = new com.google.protobuf.AbstractParser<ListCannedMessagesByGroupIdRes>() {
    @java.lang.Override
    public ListCannedMessagesByGroupIdRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCannedMessagesByGroupIdRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCannedMessagesByGroupIdRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListCannedMessagesByGroupIdRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

