// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * The request for api.v0alpha.RevokeUserPermissionGroup.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.RevokeUserPermissionGroupRequest}
 */
public final class RevokeUserPermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.RevokeUserPermissionGroupRequest)
    RevokeUserPermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RevokeUserPermissionGroupRequest.newBuilder() to construct.
  private RevokeUserPermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RevokeUserPermissionGroupRequest() {
    permissionGroupId_ = "";
    revokeUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RevokeUserPermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RevokeUserPermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RevokeUserPermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.class, com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.Builder.class);
  }

  public static final int PERMISSION_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object permissionGroupId_ = "";
  /**
   * <pre>
   * Required. The id of the permission group that is being revoked.
   * </pre>
   *
   * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
   * @return The permissionGroupId.
   */
  @java.lang.Override
  public java.lang.String getPermissionGroupId() {
    java.lang.Object ref = permissionGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      permissionGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The id of the permission group that is being revoked.
   * </pre>
   *
   * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
   * @return The bytes for permissionGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPermissionGroupIdBytes() {
    java.lang.Object ref = permissionGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      permissionGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVOKE_USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object revokeUserId_ = "";
  /**
   * <pre>
   * Required. The id of the user the permission group is to be removed from.
   * </pre>
   *
   * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
   * @return The revokeUserId.
   */
  @java.lang.Override
  public java.lang.String getRevokeUserId() {
    java.lang.Object ref = revokeUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revokeUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The id of the user the permission group is to be removed from.
   * </pre>
   *
   * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
   * @return The bytes for revokeUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRevokeUserIdBytes() {
    java.lang.Object ref = revokeUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      revokeUserId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(permissionGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, permissionGroupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revokeUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, revokeUserId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(permissionGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, permissionGroupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revokeUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, revokeUserId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest other = (com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest) obj;

    if (!getPermissionGroupId()
        .equals(other.getPermissionGroupId())) return false;
    if (!getRevokeUserId()
        .equals(other.getRevokeUserId())) return false;
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
    hash = (37 * hash) + PERMISSION_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPermissionGroupId().hashCode();
    hash = (37 * hash) + REVOKE_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRevokeUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest prototype) {
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
   * The request for api.v0alpha.RevokeUserPermissionGroup.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.RevokeUserPermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.RevokeUserPermissionGroupRequest)
      com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RevokeUserPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RevokeUserPermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.class, com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.newBuilder()
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
      permissionGroupId_ = "";
      revokeUserId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RevokeUserPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest build() {
      com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest result = new com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.permissionGroupId_ = permissionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.revokeUserId_ = revokeUserId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest.getDefaultInstance()) return this;
      if (!other.getPermissionGroupId().isEmpty()) {
        permissionGroupId_ = other.permissionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRevokeUserId().isEmpty()) {
        revokeUserId_ = other.revokeUserId_;
        bitField0_ |= 0x00000002;
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
              permissionGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              revokeUserId_ = input.readStringRequireUtf8();
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

    private java.lang.Object permissionGroupId_ = "";
    /**
     * <pre>
     * Required. The id of the permission group that is being revoked.
     * </pre>
     *
     * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
     * @return The permissionGroupId.
     */
    public java.lang.String getPermissionGroupId() {
      java.lang.Object ref = permissionGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        permissionGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the permission group that is being revoked.
     * </pre>
     *
     * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
     * @return The bytes for permissionGroupId.
     */
    public com.google.protobuf.ByteString
        getPermissionGroupIdBytes() {
      java.lang.Object ref = permissionGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        permissionGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the permission group that is being revoked.
     * </pre>
     *
     * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
     * @param value The permissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      permissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the permission group that is being revoked.
     * </pre>
     *
     * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissionGroupId() {
      permissionGroupId_ = getDefaultInstance().getPermissionGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the permission group that is being revoked.
     * </pre>
     *
     * <code>string permission_group_id = 1 [json_name = "permissionGroupId"];</code>
     * @param value The bytes for permissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      permissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object revokeUserId_ = "";
    /**
     * <pre>
     * Required. The id of the user the permission group is to be removed from.
     * </pre>
     *
     * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
     * @return The revokeUserId.
     */
    public java.lang.String getRevokeUserId() {
      java.lang.Object ref = revokeUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revokeUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is to be removed from.
     * </pre>
     *
     * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
     * @return The bytes for revokeUserId.
     */
    public com.google.protobuf.ByteString
        getRevokeUserIdBytes() {
      java.lang.Object ref = revokeUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        revokeUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is to be removed from.
     * </pre>
     *
     * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
     * @param value The revokeUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRevokeUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      revokeUserId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is to be removed from.
     * </pre>
     *
     * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRevokeUserId() {
      revokeUserId_ = getDefaultInstance().getRevokeUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is to be removed from.
     * </pre>
     *
     * <code>string revoke_user_id = 2 [json_name = "revokeUserId"];</code>
     * @param value The bytes for revokeUserId to set.
     * @return This builder for chaining.
     */
    public Builder setRevokeUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      revokeUserId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.RevokeUserPermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.RevokeUserPermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevokeUserPermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<RevokeUserPermissionGroupRequest>() {
    @java.lang.Override
    public RevokeUserPermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevokeUserPermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevokeUserPermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RevokeUserPermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

