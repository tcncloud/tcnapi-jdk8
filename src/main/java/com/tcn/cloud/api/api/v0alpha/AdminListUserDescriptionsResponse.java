// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AdminListUserDescriptionsResponse}
 */
public final class AdminListUserDescriptionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AdminListUserDescriptionsResponse)
    AdminListUserDescriptionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdminListUserDescriptionsResponse.newBuilder() to construct.
  private AdminListUserDescriptionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdminListUserDescriptionsResponse() {
    userDescriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdminListUserDescriptionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AdminListUserDescriptionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AdminListUserDescriptionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.class, com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.Builder.class);
  }

  public static final int USER_DESCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.UserDescription> userDescriptions_;
  /**
   * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.UserDescription> getUserDescriptionsList() {
    return userDescriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder> 
      getUserDescriptionsOrBuilderList() {
    return userDescriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
   */
  @java.lang.Override
  public int getUserDescriptionsCount() {
    return userDescriptions_.size();
  }
  /**
   * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UserDescription getUserDescriptions(int index) {
    return userDescriptions_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder getUserDescriptionsOrBuilder(
      int index) {
    return userDescriptions_.get(index);
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
    for (int i = 0; i < userDescriptions_.size(); i++) {
      output.writeMessage(1, userDescriptions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < userDescriptions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, userDescriptions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse other = (com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse) obj;

    if (!getUserDescriptionsList()
        .equals(other.getUserDescriptionsList())) return false;
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
    if (getUserDescriptionsCount() > 0) {
      hash = (37 * hash) + USER_DESCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getUserDescriptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.AdminListUserDescriptionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AdminListUserDescriptionsResponse)
      com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AdminListUserDescriptionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AdminListUserDescriptionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.class, com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.newBuilder()
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
      if (userDescriptionsBuilder_ == null) {
        userDescriptions_ = java.util.Collections.emptyList();
      } else {
        userDescriptions_ = null;
        userDescriptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AdminListUserDescriptionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse build() {
      com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse result = new com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse result) {
      if (userDescriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          userDescriptions_ = java.util.Collections.unmodifiableList(userDescriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.userDescriptions_ = userDescriptions_;
      } else {
        result.userDescriptions_ = userDescriptionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse.getDefaultInstance()) return this;
      if (userDescriptionsBuilder_ == null) {
        if (!other.userDescriptions_.isEmpty()) {
          if (userDescriptions_.isEmpty()) {
            userDescriptions_ = other.userDescriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserDescriptionsIsMutable();
            userDescriptions_.addAll(other.userDescriptions_);
          }
          onChanged();
        }
      } else {
        if (!other.userDescriptions_.isEmpty()) {
          if (userDescriptionsBuilder_.isEmpty()) {
            userDescriptionsBuilder_.dispose();
            userDescriptionsBuilder_ = null;
            userDescriptions_ = other.userDescriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userDescriptionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserDescriptionsFieldBuilder() : null;
          } else {
            userDescriptionsBuilder_.addAllMessages(other.userDescriptions_);
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
              com.tcn.cloud.api.api.v0alpha.UserDescription m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.UserDescription.parser(),
                      extensionRegistry);
              if (userDescriptionsBuilder_ == null) {
                ensureUserDescriptionsIsMutable();
                userDescriptions_.add(m);
              } else {
                userDescriptionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.UserDescription> userDescriptions_ =
      java.util.Collections.emptyList();
    private void ensureUserDescriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        userDescriptions_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.UserDescription>(userDescriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.UserDescription, com.tcn.cloud.api.api.v0alpha.UserDescription.Builder, com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder> userDescriptionsBuilder_;

    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.UserDescription> getUserDescriptionsList() {
      if (userDescriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userDescriptions_);
      } else {
        return userDescriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public int getUserDescriptionsCount() {
      if (userDescriptionsBuilder_ == null) {
        return userDescriptions_.size();
      } else {
        return userDescriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserDescription getUserDescriptions(int index) {
      if (userDescriptionsBuilder_ == null) {
        return userDescriptions_.get(index);
      } else {
        return userDescriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder setUserDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserDescription value) {
      if (userDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDescriptionsIsMutable();
        userDescriptions_.set(index, value);
        onChanged();
      } else {
        userDescriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder setUserDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserDescription.Builder builderForValue) {
      if (userDescriptionsBuilder_ == null) {
        ensureUserDescriptionsIsMutable();
        userDescriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        userDescriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder addUserDescriptions(com.tcn.cloud.api.api.v0alpha.UserDescription value) {
      if (userDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDescriptionsIsMutable();
        userDescriptions_.add(value);
        onChanged();
      } else {
        userDescriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder addUserDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserDescription value) {
      if (userDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserDescriptionsIsMutable();
        userDescriptions_.add(index, value);
        onChanged();
      } else {
        userDescriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder addUserDescriptions(
        com.tcn.cloud.api.api.v0alpha.UserDescription.Builder builderForValue) {
      if (userDescriptionsBuilder_ == null) {
        ensureUserDescriptionsIsMutable();
        userDescriptions_.add(builderForValue.build());
        onChanged();
      } else {
        userDescriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder addUserDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserDescription.Builder builderForValue) {
      if (userDescriptionsBuilder_ == null) {
        ensureUserDescriptionsIsMutable();
        userDescriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        userDescriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder addAllUserDescriptions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.UserDescription> values) {
      if (userDescriptionsBuilder_ == null) {
        ensureUserDescriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userDescriptions_);
        onChanged();
      } else {
        userDescriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder clearUserDescriptions() {
      if (userDescriptionsBuilder_ == null) {
        userDescriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userDescriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public Builder removeUserDescriptions(int index) {
      if (userDescriptionsBuilder_ == null) {
        ensureUserDescriptionsIsMutable();
        userDescriptions_.remove(index);
        onChanged();
      } else {
        userDescriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserDescription.Builder getUserDescriptionsBuilder(
        int index) {
      return getUserDescriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder getUserDescriptionsOrBuilder(
        int index) {
      if (userDescriptionsBuilder_ == null) {
        return userDescriptions_.get(index);  } else {
        return userDescriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder> 
         getUserDescriptionsOrBuilderList() {
      if (userDescriptionsBuilder_ != null) {
        return userDescriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userDescriptions_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserDescription.Builder addUserDescriptionsBuilder() {
      return getUserDescriptionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.UserDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserDescription.Builder addUserDescriptionsBuilder(
        int index) {
      return getUserDescriptionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.UserDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.UserDescription user_descriptions = 1 [json_name = "userDescriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.UserDescription.Builder> 
         getUserDescriptionsBuilderList() {
      return getUserDescriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.UserDescription, com.tcn.cloud.api.api.v0alpha.UserDescription.Builder, com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder> 
        getUserDescriptionsFieldBuilder() {
      if (userDescriptionsBuilder_ == null) {
        userDescriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.UserDescription, com.tcn.cloud.api.api.v0alpha.UserDescription.Builder, com.tcn.cloud.api.api.v0alpha.UserDescriptionOrBuilder>(
                userDescriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        userDescriptions_ = null;
      }
      return userDescriptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AdminListUserDescriptionsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AdminListUserDescriptionsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdminListUserDescriptionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AdminListUserDescriptionsResponse>() {
    @java.lang.Override
    public AdminListUserDescriptionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdminListUserDescriptionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdminListUserDescriptionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AdminListUserDescriptionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

