// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/auth_token.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Response message for the CreateAuthToken rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.CreateAuthTokenResponse}
 */
public final class CreateAuthTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.CreateAuthTokenResponse)
    CreateAuthTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAuthTokenResponse.newBuilder() to construct.
  private CreateAuthTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAuthTokenResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAuthTokenResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.internal_static_api_v1alpha1_org_users_CreateAuthTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.internal_static_api_v1alpha1_org_users_CreateAuthTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.Builder.class);
  }

  public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.AuthToken authToken_;
  /**
   * <pre>
   * newly generated auth token
   * </pre>
   *
   * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
   * @return Whether the authToken field is set.
   */
  @java.lang.Override
  public boolean hasAuthToken() {
    return authToken_ != null;
  }
  /**
   * <pre>
   * newly generated auth token
   * </pre>
   *
   * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
   * @return The authToken.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AuthToken getAuthToken() {
    return authToken_ == null ? com.tcn.cloud.api.api.commons.org.AuthToken.getDefaultInstance() : authToken_;
  }
  /**
   * <pre>
   * newly generated auth token
   * </pre>
   *
   * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AuthTokenOrBuilder getAuthTokenOrBuilder() {
    return authToken_ == null ? com.tcn.cloud.api.api.commons.org.AuthToken.getDefaultInstance() : authToken_;
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
    if (authToken_ != null) {
      output.writeMessage(1, getAuthToken());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authToken_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuthToken());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse other = (com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse) obj;

    if (hasAuthToken() != other.hasAuthToken()) return false;
    if (hasAuthToken()) {
      if (!getAuthToken()
          .equals(other.getAuthToken())) return false;
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
    if (hasAuthToken()) {
      hash = (37 * hash) + AUTH_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getAuthToken().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse prototype) {
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
   * Response message for the CreateAuthToken rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.CreateAuthTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.CreateAuthTokenResponse)
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.internal_static_api_v1alpha1_org_users_CreateAuthTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.internal_static_api_v1alpha1_org_users_CreateAuthTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.newBuilder()
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
      authToken_ = null;
      if (authTokenBuilder_ != null) {
        authTokenBuilder_.dispose();
        authTokenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.internal_static_api_v1alpha1_org_users_CreateAuthTokenResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse result = new com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authToken_ = authTokenBuilder_ == null
            ? authToken_
            : authTokenBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse.getDefaultInstance()) return this;
      if (other.hasAuthToken()) {
        mergeAuthToken(other.getAuthToken());
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
                  getAuthTokenFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.AuthToken authToken_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AuthToken, com.tcn.cloud.api.api.commons.org.AuthToken.Builder, com.tcn.cloud.api.api.commons.org.AuthTokenOrBuilder> authTokenBuilder_;
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     * @return Whether the authToken field is set.
     */
    public boolean hasAuthToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     * @return The authToken.
     */
    public com.tcn.cloud.api.api.commons.org.AuthToken getAuthToken() {
      if (authTokenBuilder_ == null) {
        return authToken_ == null ? com.tcn.cloud.api.api.commons.org.AuthToken.getDefaultInstance() : authToken_;
      } else {
        return authTokenBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public Builder setAuthToken(com.tcn.cloud.api.api.commons.org.AuthToken value) {
      if (authTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authToken_ = value;
      } else {
        authTokenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public Builder setAuthToken(
        com.tcn.cloud.api.api.commons.org.AuthToken.Builder builderForValue) {
      if (authTokenBuilder_ == null) {
        authToken_ = builderForValue.build();
      } else {
        authTokenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public Builder mergeAuthToken(com.tcn.cloud.api.api.commons.org.AuthToken value) {
      if (authTokenBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          authToken_ != null &&
          authToken_ != com.tcn.cloud.api.api.commons.org.AuthToken.getDefaultInstance()) {
          getAuthTokenBuilder().mergeFrom(value);
        } else {
          authToken_ = value;
        }
      } else {
        authTokenBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public Builder clearAuthToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authToken_ = null;
      if (authTokenBuilder_ != null) {
        authTokenBuilder_.dispose();
        authTokenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AuthToken.Builder getAuthTokenBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthTokenFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AuthTokenOrBuilder getAuthTokenOrBuilder() {
      if (authTokenBuilder_ != null) {
        return authTokenBuilder_.getMessageOrBuilder();
      } else {
        return authToken_ == null ?
            com.tcn.cloud.api.api.commons.org.AuthToken.getDefaultInstance() : authToken_;
      }
    }
    /**
     * <pre>
     * newly generated auth token
     * </pre>
     *
     * <code>.api.commons.org.AuthToken auth_token = 1 [json_name = "authToken"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AuthToken, com.tcn.cloud.api.api.commons.org.AuthToken.Builder, com.tcn.cloud.api.api.commons.org.AuthTokenOrBuilder> 
        getAuthTokenFieldBuilder() {
      if (authTokenBuilder_ == null) {
        authTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AuthToken, com.tcn.cloud.api.api.commons.org.AuthToken.Builder, com.tcn.cloud.api.api.commons.org.AuthTokenOrBuilder>(
                getAuthToken(),
                getParentForChildren(),
                isClean());
        authToken_ = null;
      }
      return authTokenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.CreateAuthTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.CreateAuthTokenResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAuthTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateAuthTokenResponse>() {
    @java.lang.Override
    public CreateAuthTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAuthTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAuthTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.CreateAuthTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

