// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * The request for api.v0alpha.AssignUsersPermissionGroup.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.AssignUsersPermissionGroupRequest}
 */
public final class AssignUsersPermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AssignUsersPermissionGroupRequest)
    AssignUsersPermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignUsersPermissionGroupRequest.newBuilder() to construct.
  private AssignUsersPermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignUsersPermissionGroupRequest() {
    permissionGroupId_ = "";
    assignUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignUsersPermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AssignUsersPermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AssignUsersPermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.class, com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.Builder.class);
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

  public static final int ASSIGN_USER_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList assignUserIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Required. The ids of the users the permission group is being assigned to.
   * </pre>
   *
   * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
   * @return A list containing the assignUserIds.
   */
  public com.google.protobuf.ProtocolStringList
      getAssignUserIdsList() {
    return assignUserIds_;
  }
  /**
   * <pre>
   * Required. The ids of the users the permission group is being assigned to.
   * </pre>
   *
   * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
   * @return The count of assignUserIds.
   */
  public int getAssignUserIdsCount() {
    return assignUserIds_.size();
  }
  /**
   * <pre>
   * Required. The ids of the users the permission group is being assigned to.
   * </pre>
   *
   * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
   * @param index The index of the element to return.
   * @return The assignUserIds at the given index.
   */
  public java.lang.String getAssignUserIds(int index) {
    return assignUserIds_.get(index);
  }
  /**
   * <pre>
   * Required. The ids of the users the permission group is being assigned to.
   * </pre>
   *
   * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the assignUserIds at the given index.
   */
  public com.google.protobuf.ByteString
      getAssignUserIdsBytes(int index) {
    return assignUserIds_.getByteString(index);
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
    for (int i = 0; i < assignUserIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assignUserIds_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < assignUserIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(assignUserIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAssignUserIdsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest other = (com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest) obj;

    if (!getPermissionGroupId()
        .equals(other.getPermissionGroupId())) return false;
    if (!getAssignUserIdsList()
        .equals(other.getAssignUserIdsList())) return false;
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
    if (getAssignUserIdsCount() > 0) {
      hash = (37 * hash) + ASSIGN_USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAssignUserIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest prototype) {
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
   * The request for api.v0alpha.AssignUsersPermissionGroup.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.AssignUsersPermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AssignUsersPermissionGroupRequest)
      com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AssignUsersPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AssignUsersPermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.class, com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.newBuilder()
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
      assignUserIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_AssignUsersPermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest build() {
      com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest result = new com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.permissionGroupId_ = permissionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        assignUserIds_.makeImmutable();
        result.assignUserIds_ = assignUserIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest.getDefaultInstance()) return this;
      if (!other.getPermissionGroupId().isEmpty()) {
        permissionGroupId_ = other.permissionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.assignUserIds_.isEmpty()) {
        if (assignUserIds_.isEmpty()) {
          assignUserIds_ = other.assignUserIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAssignUserIdsIsMutable();
          assignUserIds_.addAll(other.assignUserIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAssignUserIdsIsMutable();
              assignUserIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList assignUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAssignUserIdsIsMutable() {
      if (!assignUserIds_.isModifiable()) {
        assignUserIds_ = new com.google.protobuf.LazyStringArrayList(assignUserIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @return A list containing the assignUserIds.
     */
    public com.google.protobuf.ProtocolStringList
        getAssignUserIdsList() {
      assignUserIds_.makeImmutable();
      return assignUserIds_;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @return The count of assignUserIds.
     */
    public int getAssignUserIdsCount() {
      return assignUserIds_.size();
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param index The index of the element to return.
     * @return The assignUserIds at the given index.
     */
    public java.lang.String getAssignUserIds(int index) {
      return assignUserIds_.get(index);
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the assignUserIds at the given index.
     */
    public com.google.protobuf.ByteString
        getAssignUserIdsBytes(int index) {
      return assignUserIds_.getByteString(index);
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param index The index to set the value at.
     * @param value The assignUserIds to set.
     * @return This builder for chaining.
     */
    public Builder setAssignUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAssignUserIdsIsMutable();
      assignUserIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param value The assignUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addAssignUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAssignUserIdsIsMutable();
      assignUserIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param values The assignUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAssignUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureAssignUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, assignUserIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignUserIds() {
      assignUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ids of the users the permission group is being assigned to.
     * </pre>
     *
     * <code>repeated string assign_user_ids = 2 [json_name = "assignUserIds"];</code>
     * @param value The bytes of the assignUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addAssignUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAssignUserIdsIsMutable();
      assignUserIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AssignUsersPermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AssignUsersPermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignUsersPermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignUsersPermissionGroupRequest>() {
    @java.lang.Override
    public AssignUsersPermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignUsersPermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignUsersPermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AssignUsersPermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

