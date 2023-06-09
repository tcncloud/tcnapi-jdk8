// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/p3_permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the AssignUsersP3PermissionGroup RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.AssignUsersP3PermissionGroupRequest}
 */
public final class AssignUsersP3PermissionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)
    AssignUsersP3PermissionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignUsersP3PermissionGroupRequest.newBuilder() to construct.
  private AssignUsersP3PermissionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignUsersP3PermissionGroupRequest() {
    p3PermissionGroupId_ = "";
    userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignUsersP3PermissionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.Builder.class);
  }

  public static final int P3_PERMISSION_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object p3PermissionGroupId_ = "";
  /**
   * <pre>
   * The Id of the P3PermissionGroup to be assigned
   * </pre>
   *
   * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
   * @return The p3PermissionGroupId.
   */
  @java.lang.Override
  public java.lang.String getP3PermissionGroupId() {
    java.lang.Object ref = p3PermissionGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      p3PermissionGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Id of the P3PermissionGroup to be assigned
   * </pre>
   *
   * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
   * @return The bytes for p3PermissionGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getP3PermissionGroupIdBytes() {
    java.lang.Object ref = p3PermissionGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      p3PermissionGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of users to assign this group to
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * List of users to assign this group to
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * List of users to assign this group to
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * List of users to assign this group to
   * </pre>
   *
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(p3PermissionGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, p3PermissionGroupId_);
    }
    for (int i = 0; i < userIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(p3PermissionGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, p3PermissionGroupId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(userIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest) obj;

    if (!getP3PermissionGroupId()
        .equals(other.getP3PermissionGroupId())) return false;
    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
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
    hash = (37 * hash) + P3_PERMISSION_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getP3PermissionGroupId().hashCode();
    if (getUserIdsCount() > 0) {
      hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest prototype) {
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
   * Request message for the AssignUsersP3PermissionGroup RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.AssignUsersP3PermissionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.newBuilder()
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
      p3PermissionGroupId_ = "";
      userIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.P3PermissionsProto.internal_static_api_v1alpha1_org_AssignUsersP3PermissionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.p3PermissionGroupId_ = p3PermissionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        userIds_.makeImmutable();
        result.userIds_ = userIds_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest.getDefaultInstance()) return this;
      if (!other.getP3PermissionGroupId().isEmpty()) {
        p3PermissionGroupId_ = other.p3PermissionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.userIds_.isEmpty()) {
        if (userIds_.isEmpty()) {
          userIds_ = other.userIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureUserIdsIsMutable();
          userIds_.addAll(other.userIds_);
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
              p3PermissionGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
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

    private java.lang.Object p3PermissionGroupId_ = "";
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be assigned
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return The p3PermissionGroupId.
     */
    public java.lang.String getP3PermissionGroupId() {
      java.lang.Object ref = p3PermissionGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        p3PermissionGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be assigned
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return The bytes for p3PermissionGroupId.
     */
    public com.google.protobuf.ByteString
        getP3PermissionGroupIdBytes() {
      java.lang.Object ref = p3PermissionGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        p3PermissionGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be assigned
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @param value The p3PermissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setP3PermissionGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      p3PermissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be assigned
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearP3PermissionGroupId() {
      p3PermissionGroupId_ = getDefaultInstance().getP3PermissionGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Id of the P3PermissionGroup to be assigned
     * </pre>
     *
     * <code>string p3_permission_group_id = 1 [json_name = "p3PermissionGroupId"];</code>
     * @param value The bytes for p3PermissionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setP3PermissionGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      p3PermissionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserIdsIsMutable() {
      if (!userIds_.isModifiable()) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      userIds_.makeImmutable();
      return userIds_;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index to set the value at.
     * @param value The userIds to set.
     * @return This builder for chaining.
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param value The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param values The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserIds() {
      userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users to assign this group to
     * </pre>
     *
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param value The bytes of the userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserIdsIsMutable();
      userIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.AssignUsersP3PermissionGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignUsersP3PermissionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignUsersP3PermissionGroupRequest>() {
    @java.lang.Override
    public AssignUsersP3PermissionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignUsersP3PermissionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignUsersP3PermissionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.AssignUsersP3PermissionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

