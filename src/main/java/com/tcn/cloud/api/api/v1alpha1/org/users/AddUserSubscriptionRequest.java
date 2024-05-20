// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/notifications.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Request to add a user subscription.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.AddUserSubscriptionRequest}
 */
public final class AddUserSubscriptionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.AddUserSubscriptionRequest)
    AddUserSubscriptionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddUserSubscriptionRequest.newBuilder() to construct.
  private AddUserSubscriptionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddUserSubscriptionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddUserSubscriptionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_AddUserSubscriptionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_AddUserSubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.class, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription subscription_;
  /**
   * <pre>
   * Required.
   * All fields (except subscription id) must be set.
   * </pre>
   *
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return Whether the subscription field is set.
   */
  @java.lang.Override
  public boolean hasSubscription() {
    return subscription_ != null;
  }
  /**
   * <pre>
   * Required.
   * All fields (except subscription id) must be set.
   * </pre>
   *
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   * @return The subscription.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription getSubscription() {
    return subscription_ == null ? com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance() : subscription_;
  }
  /**
   * <pre>
   * Required.
   * All fields (except subscription id) must be set.
   * </pre>
   *
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionOrBuilder() {
    return subscription_ == null ? com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance() : subscription_;
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
    if (subscription_ != null) {
      output.writeMessage(1, getSubscription());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscription_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubscription());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest other = (com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription()
          .equals(other.getSubscription())) return false;
    }
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
    if (hasSubscription()) {
      hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getSubscription().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest prototype) {
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
   * Request to add a user subscription.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.AddUserSubscriptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.AddUserSubscriptionRequest)
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_AddUserSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_AddUserSubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.class, com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.newBuilder()
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
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_AddUserSubscriptionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest result = new com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscriptionBuilder_ == null
            ? subscription_
            : subscriptionBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest.getDefaultInstance()) return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
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
                  getSubscriptionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> subscriptionBuilder_;
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     * @return Whether the subscription field is set.
     */
    public boolean hasSubscription() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     * @return The subscription.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription getSubscription() {
      if (subscriptionBuilder_ == null) {
        return subscription_ == null ? com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance() : subscription_;
      } else {
        return subscriptionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder setSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription value) {
      if (subscriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subscription_ = value;
      } else {
        subscriptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder setSubscription(
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder builderForValue) {
      if (subscriptionBuilder_ == null) {
        subscription_ = builderForValue.build();
      } else {
        subscriptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder mergeSubscription(com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription value) {
      if (subscriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          subscription_ != null &&
          subscription_ != com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance()) {
          getSubscriptionBuilder().mergeFrom(value);
        } else {
          subscription_ = value;
        }
      } else {
        subscriptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public Builder clearSubscription() {
      bitField0_ = (bitField0_ & ~0x00000001);
      subscription_ = null;
      if (subscriptionBuilder_ != null) {
        subscriptionBuilder_.dispose();
        subscriptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder getSubscriptionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSubscriptionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionOrBuilder() {
      if (subscriptionBuilder_ != null) {
        return subscriptionBuilder_.getMessageOrBuilder();
      } else {
        return subscription_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance() : subscription_;
      }
    }
    /**
     * <pre>
     * Required.
     * All fields (except subscription id) must be set.
     * </pre>
     *
     * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> 
        getSubscriptionFieldBuilder() {
      if (subscriptionBuilder_ == null) {
        subscriptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder>(
                getSubscription(),
                getParentForChildren(),
                isClean());
        subscription_ = null;
      }
      return subscriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.AddUserSubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.AddUserSubscriptionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddUserSubscriptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddUserSubscriptionRequest>() {
    @java.lang.Override
    public AddUserSubscriptionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddUserSubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddUserSubscriptionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.AddUserSubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

