// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * The request for api.v0alpha.AssignUserPermissionGroup.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest}
 */
public final class AssignUserPermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)
    AssignUserPermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignUserPermissionGroupRequest.newBuilder() to construct.
  private AssignUserPermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignUserPermissionGroupRequest() {
    permissionGroupId_ = "";
    assignUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignUserPermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AssignUserPermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AssignUserPermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.Builder.class);
  }

  public static final int PERMISSION_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object permissionGroupId_ = "";
  /**
   * <pre>
   * Required. The id of the permission group that is being assigned.
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
   * Required. The id of the permission group that is being assigned.
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

  public static final int ASSIGN_USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assignUserId_ = "";
  /**
   * <pre>
   * Required. The id of the user the permission group is being assigned to.
   * </pre>
   *
   * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
   * @return The assignUserId.
   */
  @java.lang.Override
  public java.lang.String getAssignUserId() {
    java.lang.Object ref = assignUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assignUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The id of the user the permission group is being assigned to.
   * </pre>
   *
   * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
   * @return The bytes for assignUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssignUserIdBytes() {
    java.lang.Object ref = assignUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assignUserId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assignUserId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assignUserId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest) obj;

    if (!getPermissionGroupId()
        .equals(other.getPermissionGroupId())) return false;
    if (!getAssignUserId()
        .equals(other.getAssignUserId())) return false;
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
    hash = (37 * hash) + ASSIGN_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssignUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest prototype) {
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
   * The request for api.v0alpha.AssignUserPermissionGroup.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AssignUserPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AssignUserPermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.newBuilder()
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
      assignUserId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_AssignUserPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.permissionGroupId_ = permissionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assignUserId_ = assignUserId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest.getDefaultInstance()) return this;
      if (!other.getPermissionGroupId().isEmpty()) {
        permissionGroupId_ = other.permissionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAssignUserId().isEmpty()) {
        assignUserId_ = other.assignUserId_;
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
              assignUserId_ = input.readStringRequireUtf8();
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
     * Required. The id of the permission group that is being assigned.
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
     * Required. The id of the permission group that is being assigned.
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
     * Required. The id of the permission group that is being assigned.
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
     * Required. The id of the permission group that is being assigned.
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
     * Required. The id of the permission group that is being assigned.
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

    private java.lang.Object assignUserId_ = "";
    /**
     * <pre>
     * Required. The id of the user the permission group is being assigned to.
     * </pre>
     *
     * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
     * @return The assignUserId.
     */
    public java.lang.String getAssignUserId() {
      java.lang.Object ref = assignUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assignUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is being assigned to.
     * </pre>
     *
     * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
     * @return The bytes for assignUserId.
     */
    public com.google.protobuf.ByteString
        getAssignUserIdBytes() {
      java.lang.Object ref = assignUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assignUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is being assigned to.
     * </pre>
     *
     * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
     * @param value The assignUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assignUserId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is being assigned to.
     * </pre>
     *
     * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignUserId() {
      assignUserId_ = getDefaultInstance().getAssignUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The id of the user the permission group is being assigned to.
     * </pre>
     *
     * <code>string assign_user_id = 2 [json_name = "assignUserId"];</code>
     * @param value The bytes for assignUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assignUserId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignUserPermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignUserPermissionGroupRequest>() {
    @java.lang.Override
    public AssignUserPermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignUserPermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignUserPermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AssignUserPermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

