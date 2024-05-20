// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/notifications.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Response for listing subscriptions for a given user.
 * Contains a user subscriptions (plural) object.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse}
 */
public final class ListUserSubscriptionsByUserIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)
    ListUserSubscriptionsByUserIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUserSubscriptionsByUserIdResponse.newBuilder() to construct.
  private ListUserSubscriptionsByUserIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUserSubscriptionsByUserIdResponse() {
    subscriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUserSubscriptionsByUserIdResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_ListUserSubscriptionsByUserIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_ListUserSubscriptionsByUserIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.Builder.class);
  }

  public static final int SUBSCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription> subscriptions_;
  /**
   * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription> getSubscriptionsList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public int getSubscriptionsCount() {
    return subscriptions_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription getSubscriptions(int index) {
    return subscriptions_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionsOrBuilder(
      int index) {
    return subscriptions_.get(index);
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
    for (int i = 0; i < subscriptions_.size(); i++) {
      output.writeMessage(1, subscriptions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subscriptions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subscriptions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse other = (com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse) obj;

    if (!getSubscriptionsList()
        .equals(other.getSubscriptionsList())) return false;
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
    if (getSubscriptionsCount() > 0) {
      hash = (37 * hash) + SUBSCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSubscriptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse prototype) {
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
   * Response for listing subscriptions for a given user.
   * Contains a user subscriptions (plural) object.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_ListUserSubscriptionsByUserIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_ListUserSubscriptionsByUserIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.newBuilder()
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
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
      } else {
        subscriptions_ = null;
        subscriptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_ListUserSubscriptionsByUserIdResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse result = new com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse result) {
      if (subscriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subscriptions_ = java.util.Collections.unmodifiableList(subscriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subscriptions_ = subscriptions_;
      } else {
        result.subscriptions_ = subscriptionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse.getDefaultInstance()) return this;
      if (subscriptionsBuilder_ == null) {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptions_.isEmpty()) {
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubscriptionsIsMutable();
            subscriptions_.addAll(other.subscriptions_);
          }
          onChanged();
        }
      } else {
        if (!other.subscriptions_.isEmpty()) {
          if (subscriptionsBuilder_.isEmpty()) {
            subscriptionsBuilder_.dispose();
            subscriptionsBuilder_ = null;
            subscriptions_ = other.subscriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subscriptionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubscriptionsFieldBuilder() : null;
          } else {
            subscriptionsBuilder_.addAllMessages(other.subscriptions_);
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
              com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.parser(),
                      extensionRegistry);
              if (subscriptionsBuilder_ == null) {
                ensureSubscriptionsIsMutable();
                subscriptions_.add(m);
              } else {
                subscriptionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription> subscriptions_ =
      java.util.Collections.emptyList();
    private void ensureSubscriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription>(subscriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> subscriptionsBuilder_;

    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription> getSubscriptionsList() {
      if (subscriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subscriptions_);
      } else {
        return subscriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public int getSubscriptionsCount() {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.size();
      } else {
        return subscriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription getSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);
      } else {
        return subscriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription value) {
      if (subscriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, value);
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder builderForValue) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        subscriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addAllSubscriptions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription> values) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subscriptions_);
        onChanged();
      } else {
        subscriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder clearSubscriptions() {
      if (subscriptionsBuilder_ == null) {
        subscriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subscriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder removeSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        ensureSubscriptionsIsMutable();
        subscriptions_.remove(index);
        onChanged();
      } else {
        subscriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder getSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionsOrBuilder(
        int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);  } else {
        return subscriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> 
         getSubscriptionsOrBuilderList() {
      if (subscriptionsBuilder_ != null) {
        return subscriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subscriptions_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder addSubscriptionsBuilder() {
      return getSubscriptionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder addSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.users.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder> 
         getSubscriptionsBuilderList() {
      return getSubscriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> 
        getSubscriptionsFieldBuilder() {
      if (subscriptionsBuilder_ == null) {
        subscriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder>(
                subscriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subscriptions_ = null;
      }
      return subscriptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUserSubscriptionsByUserIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUserSubscriptionsByUserIdResponse>() {
    @java.lang.Override
    public ListUserSubscriptionsByUserIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUserSubscriptionsByUserIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUserSubscriptionsByUserIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.ListUserSubscriptionsByUserIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

