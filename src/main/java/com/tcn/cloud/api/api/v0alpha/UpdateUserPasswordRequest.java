// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateUserPasswordRequest}
 */
public final class UpdateUserPasswordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateUserPasswordRequest)
    UpdateUserPasswordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserPasswordRequest.newBuilder() to construct.
  private UpdateUserPasswordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserPasswordRequest() {
    userId_ = "";
    password_ = "";
    currentPassword_ = "";
    orgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserPasswordRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateUserPasswordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateUserPasswordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * the USER_EDIT permission is require
   * to update another user's password
   * in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the USER_EDIT permission is require
   * to update another user's password
   * in the same org as the current user.
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object password_ = "";
  /**
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CURRENT_PASSWORD_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object currentPassword_ = "";
  /**
   * <code>string current_password = 3 [json_name = "currentPassword"];</code>
   * @return The currentPassword.
   */
  @java.lang.Override
  public java.lang.String getCurrentPassword() {
    java.lang.Object ref = currentPassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentPassword_ = s;
      return s;
    }
  }
  /**
   * <code>string current_password = 3 [json_name = "currentPassword"];</code>
   * @return The bytes for currentPassword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrentPasswordBytes() {
    java.lang.Object ref = currentPassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currentPassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORG_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5374
   * @return The orgId.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * DEPRECATED: org_id was previously optional,
   * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
   *     See api/v0alpha/org.proto;l=5374
   * @return The bytes for orgId.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currentPassword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currentPassword_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, orgId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(currentPassword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currentPassword_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, orgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest other = (com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getCurrentPassword()
        .equals(other.getCurrentPassword())) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + CURRENT_PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentPassword().hashCode();
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateUserPasswordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateUserPasswordRequest)
      com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateUserPasswordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateUserPasswordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.newBuilder()
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
      userId_ = "";
      password_ = "";
      currentPassword_ = "";
      orgId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateUserPasswordRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest build() {
      com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest result = new com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.password_ = password_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.currentPassword_ = currentPassword_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.orgId_ = orgId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCurrentPassword().isEmpty()) {
        currentPassword_ = other.currentPassword_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              password_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              currentPassword_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              orgId_ = input.readStringRequireUtf8();
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

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * the USER_EDIT permission is require
     * to update another user's password
     * in the same org as the current user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the USER_EDIT permission is require
     * to update another user's password
     * in the same org as the current user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the USER_EDIT permission is require
     * to update another user's password
     * in the same org as the current user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the USER_EDIT permission is require
     * to update another user's password
     * in the same org as the current user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the USER_EDIT permission is require
     * to update another user's password
     * in the same org as the current user.
     * </pre>
     *
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 2 [json_name = "password"];</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 2 [json_name = "password"];</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 2 [json_name = "password"];</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 2 [json_name = "password"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string password = 2 [json_name = "password"];</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object currentPassword_ = "";
    /**
     * <code>string current_password = 3 [json_name = "currentPassword"];</code>
     * @return The currentPassword.
     */
    public java.lang.String getCurrentPassword() {
      java.lang.Object ref = currentPassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentPassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string current_password = 3 [json_name = "currentPassword"];</code>
     * @return The bytes for currentPassword.
     */
    public com.google.protobuf.ByteString
        getCurrentPasswordBytes() {
      java.lang.Object ref = currentPassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currentPassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string current_password = 3 [json_name = "currentPassword"];</code>
     * @param value The currentPassword to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentPassword(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      currentPassword_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string current_password = 3 [json_name = "currentPassword"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentPassword() {
      currentPassword_ = getDefaultInstance().getCurrentPassword();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string current_password = 3 [json_name = "currentPassword"];</code>
     * @param value The bytes for currentPassword to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      currentPassword_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * DEPRECATED: org_id was previously optional,
     * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
     * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
     *     See api/v0alpha/org.proto;l=5374
     * @return The orgId.
     */
    @java.lang.Deprecated public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * DEPRECATED: org_id was previously optional,
     * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
     * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
     *     See api/v0alpha/org.proto;l=5374
     * @return The bytes for orgId.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * DEPRECATED: org_id was previously optional,
     * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
     * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
     *     See api/v0alpha/org.proto;l=5374
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED: org_id was previously optional,
     * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
     * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
     *     See api/v0alpha/org.proto;l=5374
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DEPRECATED: org_id was previously optional,
     * if org_id needs to be provided, use UpdateUserPasswordByOrgId rpc
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId", deprecated = true];</code>
     * @deprecated api.v0alpha.UpdateUserPasswordRequest.org_id is deprecated.
     *     See api/v0alpha/org.proto;l=5374
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateUserPasswordRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateUserPasswordRequest)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserPasswordRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserPasswordRequest>() {
    @java.lang.Override
    public UpdateUserPasswordRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUserPasswordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserPasswordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateUserPasswordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

