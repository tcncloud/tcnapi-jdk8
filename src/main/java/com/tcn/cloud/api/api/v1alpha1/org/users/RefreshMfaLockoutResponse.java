// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Response message for the RefreshMfaLockout rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.RefreshMfaLockoutResponse}
 */
public final class RefreshMfaLockoutResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.RefreshMfaLockoutResponse)
    RefreshMfaLockoutResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RefreshMfaLockoutResponse.newBuilder() to construct.
  private RefreshMfaLockoutResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RefreshMfaLockoutResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RefreshMfaLockoutResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_RefreshMfaLockoutResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_RefreshMfaLockoutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.Builder.class);
  }

  public static final int TIMEOUT_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timeout_;
  /**
   * <pre>
   * The new time that the user must setup mfa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   * @return Whether the timeout field is set.
   */
  @java.lang.Override
  public boolean hasTimeout() {
    return timeout_ != null;
  }
  /**
   * <pre>
   * The new time that the user must setup mfa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   * @return The timeout.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimeout() {
    return timeout_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeout_;
  }
  /**
   * <pre>
   * The new time that the user must setup mfa by.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimeoutOrBuilder() {
    return timeout_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeout_;
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
    if (timeout_ != null) {
      output.writeMessage(1, getTimeout());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeout_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimeout());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse other = (com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse) obj;

    if (hasTimeout() != other.hasTimeout()) return false;
    if (hasTimeout()) {
      if (!getTimeout()
          .equals(other.getTimeout())) return false;
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
    if (hasTimeout()) {
      hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeout().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse prototype) {
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
   * Response message for the RefreshMfaLockout rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.RefreshMfaLockoutResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.RefreshMfaLockoutResponse)
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_RefreshMfaLockoutResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_RefreshMfaLockoutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.newBuilder()
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
      timeout_ = null;
      if (timeoutBuilder_ != null) {
        timeoutBuilder_.dispose();
        timeoutBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_RefreshMfaLockoutResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse result = new com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeout_ = timeoutBuilder_ == null
            ? timeout_
            : timeoutBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse.getDefaultInstance()) return this;
      if (other.hasTimeout()) {
        mergeTimeout(other.getTimeout());
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
                  getTimeoutFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp timeout_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timeoutBuilder_;
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     * @return Whether the timeout field is set.
     */
    public boolean hasTimeout() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     * @return The timeout.
     */
    public com.google.protobuf.Timestamp getTimeout() {
      if (timeoutBuilder_ == null) {
        return timeout_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timeout_;
      } else {
        return timeoutBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public Builder setTimeout(com.google.protobuf.Timestamp value) {
      if (timeoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeout_ = value;
      } else {
        timeoutBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public Builder setTimeout(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timeoutBuilder_ == null) {
        timeout_ = builderForValue.build();
      } else {
        timeoutBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public Builder mergeTimeout(com.google.protobuf.Timestamp value) {
      if (timeoutBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          timeout_ != null &&
          timeout_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getTimeoutBuilder().mergeFrom(value);
        } else {
          timeout_ = value;
        }
      } else {
        timeoutBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public Builder clearTimeout() {
      bitField0_ = (bitField0_ & ~0x00000001);
      timeout_ = null;
      if (timeoutBuilder_ != null) {
        timeoutBuilder_.dispose();
        timeoutBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimeoutBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTimeoutFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimeoutOrBuilder() {
      if (timeoutBuilder_ != null) {
        return timeoutBuilder_.getMessageOrBuilder();
      } else {
        return timeout_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timeout_;
      }
    }
    /**
     * <pre>
     * The new time that the user must setup mfa by.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timeout = 1 [json_name = "timeout"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimeoutFieldBuilder() {
      if (timeoutBuilder_ == null) {
        timeoutBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimeout(),
                getParentForChildren(),
                isClean());
        timeout_ = null;
      }
      return timeoutBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.RefreshMfaLockoutResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.RefreshMfaLockoutResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RefreshMfaLockoutResponse>
      PARSER = new com.google.protobuf.AbstractParser<RefreshMfaLockoutResponse>() {
    @java.lang.Override
    public RefreshMfaLockoutResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RefreshMfaLockoutResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RefreshMfaLockoutResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.RefreshMfaLockoutResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

