// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the AddGroupedUserIPRestrictions rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest}
 */
public final class AddGroupedUserIPRestrictionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)
    AddGroupedUserIPRestrictionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddGroupedUserIPRestrictionsRequest.newBuilder() to construct.
  private AddGroupedUserIPRestrictionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddGroupedUserIPRestrictionsRequest() {
    userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    ips_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddGroupedUserIPRestrictionsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_AddGroupedUserIPRestrictionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_AddGroupedUserIPRestrictionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.Builder.class);
  }

  public static final int USER_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of users that can only use the provided IPs.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <pre>
   * List of users that can only use the provided IPs.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <pre>
   * List of users that can only use the provided IPs.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <pre>
   * List of users that can only use the provided IPs.
   * </pre>
   *
   * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
  }

  public static final int IPS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ips_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of IPs to whitelist for the associated group of users.
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @return A list containing the ips.
   */
  public com.google.protobuf.ProtocolStringList
      getIpsList() {
    return ips_;
  }
  /**
   * <pre>
   * List of IPs to whitelist for the associated group of users.
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @return The count of ips.
   */
  public int getIpsCount() {
    return ips_.size();
  }
  /**
   * <pre>
   * List of IPs to whitelist for the associated group of users.
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @param index The index of the element to return.
   * @return The ips at the given index.
   */
  public java.lang.String getIps(int index) {
    return ips_.get(index);
  }
  /**
   * <pre>
   * List of IPs to whitelist for the associated group of users.
   * </pre>
   *
   * <code>repeated string ips = 2 [json_name = "ips"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ips at the given index.
   */
  public com.google.protobuf.ByteString
      getIpsBytes(int index) {
    return ips_.getByteString(index);
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
    for (int i = 0; i < userIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userIds_.getRaw(i));
    }
    for (int i = 0; i < ips_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ips_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < userIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(userIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUserIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ips_.size(); i++) {
        dataSize += computeStringSizeNoTag(ips_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIpsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest) obj;

    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
    if (!getIpsList()
        .equals(other.getIpsList())) return false;
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
    if (getUserIdsCount() > 0) {
      hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUserIdsList().hashCode();
    }
    if (getIpsCount() > 0) {
      hash = (37 * hash) + IPS_FIELD_NUMBER;
      hash = (53 * hash) + getIpsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest prototype) {
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
   * Request message for the AddGroupedUserIPRestrictions rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_AddGroupedUserIPRestrictionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_AddGroupedUserIPRestrictionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.newBuilder()
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
      userIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      ips_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_AddGroupedUserIPRestrictionsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        userIds_.makeImmutable();
        result.userIds_ = userIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        ips_.makeImmutable();
        result.ips_ = ips_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest.getDefaultInstance()) return this;
      if (!other.userIds_.isEmpty()) {
        if (userIds_.isEmpty()) {
          userIds_ = other.userIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUserIdsIsMutable();
          userIds_.addAll(other.userIds_);
        }
        onChanged();
      }
      if (!other.ips_.isEmpty()) {
        if (ips_.isEmpty()) {
          ips_ = other.ips_;
          bitField0_ |= 0x00000002;
        } else {
          ensureIpsIsMutable();
          ips_.addAll(other.ips_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureIpsIsMutable();
              ips_.add(s);
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

    private com.google.protobuf.LazyStringArrayList userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserIdsIsMutable() {
      if (!userIds_.isModifiable()) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      userIds_.makeImmutable();
      return userIds_;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param index The index to set the value at.
     * @param value The userIds to set.
     * @return This builder for chaining.
     */
    public Builder setUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param value The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param values The userIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, userIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserIds() {
      userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of users that can only use the provided IPs.
     * </pre>
     *
     * <code>repeated string user_ids = 1 [json_name = "userIds"];</code>
     * @param value The bytes of the userIds to add.
     * @return This builder for chaining.
     */
    public Builder addUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUserIdsIsMutable();
      userIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList ips_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureIpsIsMutable() {
      if (!ips_.isModifiable()) {
        ips_ = new com.google.protobuf.LazyStringArrayList(ips_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @return A list containing the ips.
     */
    public com.google.protobuf.ProtocolStringList
        getIpsList() {
      ips_.makeImmutable();
      return ips_;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @return The count of ips.
     */
    public int getIpsCount() {
      return ips_.size();
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param index The index of the element to return.
     * @return The ips at the given index.
     */
    public java.lang.String getIps(int index) {
      return ips_.get(index);
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the ips at the given index.
     */
    public com.google.protobuf.ByteString
        getIpsBytes(int index) {
      return ips_.getByteString(index);
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param index The index to set the value at.
     * @param value The ips to set.
     * @return This builder for chaining.
     */
    public Builder setIps(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIpsIsMutable();
      ips_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param value The ips to add.
     * @return This builder for chaining.
     */
    public Builder addIps(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureIpsIsMutable();
      ips_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param values The ips to add.
     * @return This builder for chaining.
     */
    public Builder addAllIps(
        java.lang.Iterable<java.lang.String> values) {
      ensureIpsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ips_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIps() {
      ips_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of IPs to whitelist for the associated group of users.
     * </pre>
     *
     * <code>repeated string ips = 2 [json_name = "ips"];</code>
     * @param value The bytes of the ips to add.
     * @return This builder for chaining.
     */
    public Builder addIpsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureIpsIsMutable();
      ips_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddGroupedUserIPRestrictionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddGroupedUserIPRestrictionsRequest>() {
    @java.lang.Override
    public AddGroupedUserIPRestrictionsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddGroupedUserIPRestrictionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddGroupedUserIPRestrictionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.AddGroupedUserIPRestrictionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

