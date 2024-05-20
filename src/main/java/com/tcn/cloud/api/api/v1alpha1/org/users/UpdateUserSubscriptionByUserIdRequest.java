// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/notifications.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Request for updating a user subscription.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest}
 */
public final class UpdateUserSubscriptionByUserIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)
    UpdateUserSubscriptionByUserIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserSubscriptionByUserIdRequest.newBuilder() to construct.
  private UpdateUserSubscriptionByUserIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserSubscriptionByUserIdRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserSubscriptionByUserIdRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_UpdateUserSubscriptionByUserIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_UpdateUserSubscriptionByUserIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.class, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription subscription_;
  /**
   * <pre>
   * Required.
   * Must have org id, user id, and subscription id.
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
   * Must have org id, user id, and subscription id.
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
   * Must have org id, user id, and subscription id.
   * </pre>
   *
   * <code>.api.v1alpha1.org.users.UserSubscription subscription = 1 [json_name = "subscription"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder getSubscriptionOrBuilder() {
    return subscription_ == null ? com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.getDefaultInstance() : subscription_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * Required. Only fields in field mask will be updated.
   * Valid fields include: "filters", "room303"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
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
    if (fieldMask_ != null) {
      output.writeMessage(2, getFieldMask());
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
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest other = (com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest) obj;

    if (hasSubscription() != other.hasSubscription()) return false;
    if (hasSubscription()) {
      if (!getSubscription()
          .equals(other.getSubscription())) return false;
    }
    if (hasFieldMask() != other.hasFieldMask()) return false;
    if (hasFieldMask()) {
      if (!getFieldMask()
          .equals(other.getFieldMask())) return false;
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
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest prototype) {
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
   * Request for updating a user subscription.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_UpdateUserSubscriptionByUserIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_UpdateUserSubscriptionByUserIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.class, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.newBuilder()
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
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.internal_static_api_v1alpha1_org_users_UpdateUserSubscriptionByUserIdRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest result = new com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscriptionBuilder_ == null
            ? subscription_
            : subscriptionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest.getDefaultInstance()) return this;
      if (other.hasSubscription()) {
        mergeSubscription(other.getSubscription());
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
            case 18: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription subscription_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscription.Builder, com.tcn.cloud.api.api.v1alpha1.org.users.UserSubscriptionOrBuilder> subscriptionBuilder_;
    /**
     * <pre>
     * Required.
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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
     * Must have org id, user id, and subscription id.
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

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     * @return The fieldMask.
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
      } else {
        fieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <pre>
     * Required. Only fields in field mask will be updated.
     * Valid fields include: "filters", "room303"
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserSubscriptionByUserIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserSubscriptionByUserIdRequest>() {
    @java.lang.Override
    public UpdateUserSubscriptionByUserIdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUserSubscriptionByUserIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserSubscriptionByUserIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateUserSubscriptionByUserIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

