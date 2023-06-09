// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.GetUserDirectoryResponse}
 */
public final class GetUserDirectoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetUserDirectoryResponse)
    GetUserDirectoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetUserDirectoryResponse.newBuilder() to construct.
  private GetUserDirectoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetUserDirectoryResponse() {
    userDirectory_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetUserDirectoryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetUserDirectoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetUserDirectoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.Builder.class);
  }

  public static final int USER_DIRECTORY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> userDirectory_;
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> getUserDirectoryList() {
    return userDirectory_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder> 
      getUserDirectoryOrBuilderList() {
    return userDirectory_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  @java.lang.Override
  public int getUserDirectoryCount() {
    return userDirectory_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry getUserDirectory(int index) {
    return userDirectory_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder getUserDirectoryOrBuilder(
      int index) {
    return userDirectory_.get(index);
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
    for (int i = 0; i < userDirectory_.size(); i++) {
      output.writeMessage(1, userDirectory_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userDirectory_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userDirectory_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse) obj;

    if (!getUserDirectoryList()
        .equals(other.getUserDirectoryList())) return false;
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
    if (getUserDirectoryCount() > 0) {
      hash = (37 * hash) + USER_DIRECTORY_FIELD_NUMBER;
      hash = (53 * hash) + getUserDirectoryList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.GetUserDirectoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetUserDirectoryResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetUserDirectoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetUserDirectoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.newBuilder()
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
      if (userDirectoryBuilder_ == null) {
        userDirectory_ = java.util.Collections.emptyList();
      } else {
        userDirectory_ = null;
        userDirectoryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetUserDirectoryResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse result) {
      if (userDirectoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userDirectory_ = java.util.Collections.unmodifiableList(userDirectory_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userDirectory_ = userDirectory_;
      } else {
        result.userDirectory_ = userDirectoryBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse.getDefaultInstance()) return this;
      if (userDirectoryBuilder_ == null) {
        if (!other.userDirectory_.isEmpty()) {
          if (userDirectory_.isEmpty()) {
            userDirectory_ = other.userDirectory_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserDirectoryIsMutable();
            userDirectory_.addAll(other.userDirectory_);
          }
          onChanged();
        }
      } else {
        if (!other.userDirectory_.isEmpty()) {
          if (userDirectoryBuilder_.isEmpty()) {
            userDirectoryBuilder_.dispose();
            userDirectoryBuilder_ = null;
            userDirectory_ = other.userDirectory_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userDirectoryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserDirectoryFieldBuilder() : null;
          } else {
            userDirectoryBuilder_.addAllMessages(other.userDirectory_);
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
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.parser(),
                      extensionRegistry);
              if (userDirectoryBuilder_ == null) {
                ensureUserDirectoryIsMutable();
                userDirectory_.add(m);
              } else {
                userDirectoryBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> userDirectory_ =
      java.util.Collections.emptyList();
    private void ensureUserDirectoryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userDirectory_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry>(userDirectory_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder> userDirectoryBuilder_;

    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> getUserDirectoryList() {
      if (userDirectoryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userDirectory_);
      } else {
        return userDirectoryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public int getUserDirectoryCount() {
      if (userDirectoryBuilder_ == null) {
        return userDirectory_.size();
      } else {
        return userDirectoryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry getUserDirectory(int index) {
      if (userDirectoryBuilder_ == null) {
        return userDirectory_.get(index);
      } else {
        return userDirectoryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder setUserDirectory(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry value) {
      if (userDirectoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDirectoryIsMutable();
        userDirectory_.set(index, value);
        onChanged();
      } else {
        userDirectoryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder setUserDirectory(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder builderForValue) {
      if (userDirectoryBuilder_ == null) {
        ensureUserDirectoryIsMutable();
        userDirectory_.set(index, builderForValue.build());
        onChanged();
      } else {
        userDirectoryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder addUserDirectory(com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry value) {
      if (userDirectoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDirectoryIsMutable();
        userDirectory_.add(value);
        onChanged();
      } else {
        userDirectoryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder addUserDirectory(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry value) {
      if (userDirectoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDirectoryIsMutable();
        userDirectory_.add(index, value);
        onChanged();
      } else {
        userDirectoryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder addUserDirectory(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder builderForValue) {
      if (userDirectoryBuilder_ == null) {
        ensureUserDirectoryIsMutable();
        userDirectory_.add(builderForValue.build());
        onChanged();
      } else {
        userDirectoryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder addUserDirectory(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder builderForValue) {
      if (userDirectoryBuilder_ == null) {
        ensureUserDirectoryIsMutable();
        userDirectory_.add(index, builderForValue.build());
        onChanged();
      } else {
        userDirectoryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder addAllUserDirectory(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry> values) {
      if (userDirectoryBuilder_ == null) {
        ensureUserDirectoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userDirectory_);
        onChanged();
      } else {
        userDirectoryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder clearUserDirectory() {
      if (userDirectoryBuilder_ == null) {
        userDirectory_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userDirectoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public Builder removeUserDirectory(int index) {
      if (userDirectoryBuilder_ == null) {
        ensureUserDirectoryIsMutable();
        userDirectory_.remove(index);
        onChanged();
      } else {
        userDirectoryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder getUserDirectoryBuilder(
        int index) {
      return getUserDirectoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder getUserDirectoryOrBuilder(
        int index) {
      if (userDirectoryBuilder_ == null) {
        return userDirectory_.get(index);  } else {
        return userDirectoryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder> 
         getUserDirectoryOrBuilderList() {
      if (userDirectoryBuilder_ != null) {
        return userDirectoryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userDirectory_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder addUserDirectoryBuilder() {
      return getUserDirectoryFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder addUserDirectoryBuilder(
        int index) {
      return getUserDirectoryFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.legacy.UserDirectoryEntry user_directory = 1 [json_name = "userDirectory"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder> 
         getUserDirectoryBuilderList() {
      return getUserDirectoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder> 
        getUserDirectoryFieldBuilder() {
      if (userDirectoryBuilder_ == null) {
        userDirectoryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntry.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.UserDirectoryEntryOrBuilder>(
                userDirectory_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userDirectory_ = null;
      }
      return userDirectoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetUserDirectoryResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetUserDirectoryResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetUserDirectoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetUserDirectoryResponse>() {
    @java.lang.Override
    public GetUserDirectoryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetUserDirectoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetUserDirectoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetUserDirectoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

