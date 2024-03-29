// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * ConnectedInboxOAuthConfig -
 * </pre>
 *
 * Protobuf type {@code api.commons.ConnectedInboxOAuthConfig}
 */
public final class ConnectedInboxOAuthConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.ConnectedInboxOAuthConfig)
    ConnectedInboxOAuthConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectedInboxOAuthConfig.newBuilder() to construct.
  private ConnectedInboxOAuthConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectedInboxOAuthConfig() {
    accessToken_ = "";
    refreshToken_ = "";
    referenceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectedInboxOAuthConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_ConnectedInboxOAuthConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_ConnectedInboxOAuthConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.class, com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.Builder.class);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object accessToken_ = "";
  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFRESH_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object refreshToken_ = "";
  /**
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  @java.lang.Override
  public java.lang.String getRefreshToken() {
    java.lang.Object ref = refreshToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      refreshToken_ = s;
      return s;
    }
  }
  /**
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRefreshTokenBytes() {
    java.lang.Object ref = refreshToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      refreshToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRES_AT_FIELD_NUMBER = 3;
  private long expiresAt_ = 0L;
  /**
   * <code>int64 expires_at = 3 [json_name = "expiresAt"];</code>
   * @return The expiresAt.
   */
  @java.lang.Override
  public long getExpiresAt() {
    return expiresAt_;
  }

  public static final int REFERENCE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceId_ = "";
  /**
   * <code>string reference_id = 4 [json_name = "referenceId"];</code>
   * @return The referenceId.
   */
  @java.lang.Override
  public java.lang.String getReferenceId() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceId_ = s;
      return s;
    }
  }
  /**
   * <code>string reference_id = 4 [json_name = "referenceId"];</code>
   * @return The bytes for referenceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceIdBytes() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, accessToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(refreshToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, refreshToken_);
    }
    if (expiresAt_ != 0L) {
      output.writeInt64(3, expiresAt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, referenceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, accessToken_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(refreshToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, refreshToken_);
    }
    if (expiresAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, expiresAt_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, referenceId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig other = (com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig) obj;

    if (!getAccessToken()
        .equals(other.getAccessToken())) return false;
    if (!getRefreshToken()
        .equals(other.getRefreshToken())) return false;
    if (getExpiresAt()
        != other.getExpiresAt()) return false;
    if (!getReferenceId()
        .equals(other.getReferenceId())) return false;
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
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    hash = (37 * hash) + REFRESH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getRefreshToken().hashCode();
    hash = (37 * hash) + EXPIRES_AT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpiresAt());
    hash = (37 * hash) + REFERENCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig prototype) {
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
   * ConnectedInboxOAuthConfig -
   * </pre>
   *
   * Protobuf type {@code api.commons.ConnectedInboxOAuthConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.ConnectedInboxOAuthConfig)
      com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_ConnectedInboxOAuthConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_ConnectedInboxOAuthConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.class, com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.newBuilder()
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
      accessToken_ = "";
      refreshToken_ = "";
      expiresAt_ = 0L;
      referenceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_ConnectedInboxOAuthConfig_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig build() {
      com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig buildPartial() {
      com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig result = new com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.accessToken_ = accessToken_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.refreshToken_ = refreshToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expiresAt_ = expiresAt_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.referenceId_ = referenceId_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig) {
        return mergeFrom((com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig other) {
      if (other == com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig.getDefaultInstance()) return this;
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRefreshToken().isEmpty()) {
        refreshToken_ = other.refreshToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getExpiresAt() != 0L) {
        setExpiresAt(other.getExpiresAt());
      }
      if (!other.getReferenceId().isEmpty()) {
        referenceId_ = other.referenceId_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              accessToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              refreshToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              expiresAt_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              referenceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object accessToken_ = "";
    /**
     * <code>string access_token = 1 [json_name = "accessToken"];</code>
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string access_token = 1 [json_name = "accessToken"];</code>
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string access_token = 1 [json_name = "accessToken"];</code>
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      accessToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string access_token = 1 [json_name = "accessToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {
      accessToken_ = getDefaultInstance().getAccessToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string access_token = 1 [json_name = "accessToken"];</code>
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      accessToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object refreshToken_ = "";
    /**
     * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
     * @return The refreshToken.
     */
    public java.lang.String getRefreshToken() {
      java.lang.Object ref = refreshToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        refreshToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
     * @return The bytes for refreshToken.
     */
    public com.google.protobuf.ByteString
        getRefreshTokenBytes() {
      java.lang.Object ref = refreshToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        refreshToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
     * @param value The refreshToken to set.
     * @return This builder for chaining.
     */
    public Builder setRefreshToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      refreshToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRefreshToken() {
      refreshToken_ = getDefaultInstance().getRefreshToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
     * @param value The bytes for refreshToken to set.
     * @return This builder for chaining.
     */
    public Builder setRefreshTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      refreshToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long expiresAt_ ;
    /**
     * <code>int64 expires_at = 3 [json_name = "expiresAt"];</code>
     * @return The expiresAt.
     */
    @java.lang.Override
    public long getExpiresAt() {
      return expiresAt_;
    }
    /**
     * <code>int64 expires_at = 3 [json_name = "expiresAt"];</code>
     * @param value The expiresAt to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresAt(long value) {

      expiresAt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expires_at = 3 [json_name = "expiresAt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiresAt() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expiresAt_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object referenceId_ = "";
    /**
     * <code>string reference_id = 4 [json_name = "referenceId"];</code>
     * @return The referenceId.
     */
    public java.lang.String getReferenceId() {
      java.lang.Object ref = referenceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reference_id = 4 [json_name = "referenceId"];</code>
     * @return The bytes for referenceId.
     */
    public com.google.protobuf.ByteString
        getReferenceIdBytes() {
      java.lang.Object ref = referenceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reference_id = 4 [json_name = "referenceId"];</code>
     * @param value The referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      referenceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string reference_id = 4 [json_name = "referenceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceId() {
      referenceId_ = getDefaultInstance().getReferenceId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string reference_id = 4 [json_name = "referenceId"];</code>
     * @param value The bytes for referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      referenceId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:api.commons.ConnectedInboxOAuthConfig)
  }

  // @@protoc_insertion_point(class_scope:api.commons.ConnectedInboxOAuthConfig)
  private static final com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig();
  }

  public static com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectedInboxOAuthConfig>
      PARSER = new com.google.protobuf.AbstractParser<ConnectedInboxOAuthConfig>() {
    @java.lang.Override
    public ConnectedInboxOAuthConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConnectedInboxOAuthConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConnectedInboxOAuthConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ConnectedInboxOAuthConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

