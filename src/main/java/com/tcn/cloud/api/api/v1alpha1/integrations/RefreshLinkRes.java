// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.RefreshLinkRes}
 */
public final class RefreshLinkRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.RefreshLinkRes)
    RefreshLinkResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RefreshLinkRes.newBuilder() to construct.
  private RefreshLinkRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RefreshLinkRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RefreshLinkRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RefreshLinkRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RefreshLinkRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.Builder.class);
  }

  public static final int NEW_EXPIRY_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp newExpiry_;
  /**
   * <pre>
   * when the new link will expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
   * @return Whether the newExpiry field is set.
   */
  @java.lang.Override
  public boolean hasNewExpiry() {
    return newExpiry_ != null;
  }
  /**
   * <pre>
   * when the new link will expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
   * @return The newExpiry.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getNewExpiry() {
    return newExpiry_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newExpiry_;
  }
  /**
   * <pre>
   * when the new link will expire
   * </pre>
   *
   * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getNewExpiryOrBuilder() {
    return newExpiry_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newExpiry_;
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
    if (newExpiry_ != null) {
      output.writeMessage(1, getNewExpiry());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newExpiry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewExpiry());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes other = (com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes) obj;

    if (hasNewExpiry() != other.hasNewExpiry()) return false;
    if (hasNewExpiry()) {
      if (!getNewExpiry()
          .equals(other.getNewExpiry())) return false;
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
    if (hasNewExpiry()) {
      hash = (37 * hash) + NEW_EXPIRY_FIELD_NUMBER;
      hash = (53 * hash) + getNewExpiry().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.RefreshLinkRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.RefreshLinkRes)
      com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RefreshLinkRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RefreshLinkRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.newBuilder()
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
      newExpiry_ = null;
      if (newExpiryBuilder_ != null) {
        newExpiryBuilder_.dispose();
        newExpiryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RefreshLinkRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes result = new com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newExpiry_ = newExpiryBuilder_ == null
            ? newExpiry_
            : newExpiryBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes.getDefaultInstance()) return this;
      if (other.hasNewExpiry()) {
        mergeNewExpiry(other.getNewExpiry());
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
                  getNewExpiryFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp newExpiry_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> newExpiryBuilder_;
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     * @return Whether the newExpiry field is set.
     */
    public boolean hasNewExpiry() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     * @return The newExpiry.
     */
    public com.google.protobuf.Timestamp getNewExpiry() {
      if (newExpiryBuilder_ == null) {
        return newExpiry_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : newExpiry_;
      } else {
        return newExpiryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public Builder setNewExpiry(com.google.protobuf.Timestamp value) {
      if (newExpiryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newExpiry_ = value;
      } else {
        newExpiryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public Builder setNewExpiry(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (newExpiryBuilder_ == null) {
        newExpiry_ = builderForValue.build();
      } else {
        newExpiryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public Builder mergeNewExpiry(com.google.protobuf.Timestamp value) {
      if (newExpiryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          newExpiry_ != null &&
          newExpiry_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getNewExpiryBuilder().mergeFrom(value);
        } else {
          newExpiry_ = value;
        }
      } else {
        newExpiryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public Builder clearNewExpiry() {
      bitField0_ = (bitField0_ & ~0x00000001);
      newExpiry_ = null;
      if (newExpiryBuilder_ != null) {
        newExpiryBuilder_.dispose();
        newExpiryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getNewExpiryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNewExpiryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getNewExpiryOrBuilder() {
      if (newExpiryBuilder_ != null) {
        return newExpiryBuilder_.getMessageOrBuilder();
      } else {
        return newExpiry_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : newExpiry_;
      }
    }
    /**
     * <pre>
     * when the new link will expire
     * </pre>
     *
     * <code>.google.protobuf.Timestamp new_expiry = 1 [json_name = "newExpiry"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getNewExpiryFieldBuilder() {
      if (newExpiryBuilder_ == null) {
        newExpiryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getNewExpiry(),
                getParentForChildren(),
                isClean());
        newExpiry_ = null;
      }
      return newExpiryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.RefreshLinkRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.RefreshLinkRes)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RefreshLinkRes>
      PARSER = new com.google.protobuf.AbstractParser<RefreshLinkRes>() {
    @java.lang.Override
    public RefreshLinkRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<RefreshLinkRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RefreshLinkRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.RefreshLinkRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

