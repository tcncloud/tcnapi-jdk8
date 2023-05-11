// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for listing subscriptions for a user.
 * Contains a user subscriptions (plural) object.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListUserSubscriptionsResponse}
 */
public final class ListUserSubscriptionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListUserSubscriptionsResponse)
    ListUserSubscriptionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUserSubscriptionsResponse.newBuilder() to construct.
  private ListUserSubscriptionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUserSubscriptionsResponse() {
    subscriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUserSubscriptionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListUserSubscriptionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListUserSubscriptionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.class, com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.Builder.class);
  }

  public static final int SUBSCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.UserSubscription> subscriptions_;
  /**
   * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.UserSubscription> getSubscriptionsList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder> 
      getSubscriptionsOrBuilderList() {
    return subscriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public int getSubscriptionsCount() {
    return subscriptions_.size();
  }
  /**
   * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UserSubscription getSubscriptions(int index) {
    return subscriptions_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder getSubscriptionsOrBuilder(
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse other = (com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse prototype) {
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
   * Response for listing subscriptions for a user.
   * Contains a user subscriptions (plural) object.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListUserSubscriptionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListUserSubscriptionsResponse)
      com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListUserSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListUserSubscriptionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.class, com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.newBuilder()
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListUserSubscriptionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse result = new com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse result) {
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

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse.getDefaultInstance()) return this;
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
              com.tcn.cloud.api.api.v0alpha.UserSubscription m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.UserSubscription.parser(),
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.UserSubscription> subscriptions_ =
      java.util.Collections.emptyList();
    private void ensureSubscriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subscriptions_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.UserSubscription>(subscriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.UserSubscription, com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder, com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder> subscriptionsBuilder_;

    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.UserSubscription> getSubscriptionsList() {
      if (subscriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subscriptions_);
      } else {
        return subscriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public int getSubscriptionsCount() {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.size();
      } else {
        return subscriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserSubscription getSubscriptions(int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);
      } else {
        return subscriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserSubscription value) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder setSubscriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(com.tcn.cloud.api.api.v0alpha.UserSubscription value) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserSubscription value) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addSubscriptions(
        int index, com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public Builder addAllSubscriptions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.UserSubscription> values) {
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
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
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder getSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder getSubscriptionsOrBuilder(
        int index) {
      if (subscriptionsBuilder_ == null) {
        return subscriptions_.get(index);  } else {
        return subscriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder> 
         getSubscriptionsOrBuilderList() {
      if (subscriptionsBuilder_ != null) {
        return subscriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subscriptions_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder addSubscriptionsBuilder() {
      return getSubscriptionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.UserSubscription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder addSubscriptionsBuilder(
        int index) {
      return getSubscriptionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.UserSubscription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.UserSubscription subscriptions = 1 [json_name = "subscriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder> 
         getSubscriptionsBuilderList() {
      return getSubscriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.UserSubscription, com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder, com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder> 
        getSubscriptionsFieldBuilder() {
      if (subscriptionsBuilder_ == null) {
        subscriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.UserSubscription, com.tcn.cloud.api.api.v0alpha.UserSubscription.Builder, com.tcn.cloud.api.api.v0alpha.UserSubscriptionOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListUserSubscriptionsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListUserSubscriptionsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUserSubscriptionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUserSubscriptionsResponse>() {
    @java.lang.Override
    public ListUserSubscriptionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUserSubscriptionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUserSubscriptionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListUserSubscriptionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

