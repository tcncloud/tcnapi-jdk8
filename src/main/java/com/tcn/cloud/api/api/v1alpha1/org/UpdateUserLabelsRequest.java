// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the UpdateUserLabels rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateUserLabelsRequest}
 */
public final class UpdateUserLabelsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateUserLabelsRequest)
    UpdateUserLabelsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateUserLabelsRequest.newBuilder() to construct.
  private UpdateUserLabelsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateUserLabelsRequest() {
    userId_ = "";
    orgId_ = "";
    labelIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateUserLabelsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_UpdateUserLabelsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_UpdateUserLabelsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * The ID of the user whose labels will be updated.
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
   * The ID of the user whose labels will be updated.
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

  public static final int ORG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * The organization ID of the user
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
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
   * The organization ID of the user
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
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

  public static final int LABEL_IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList labelIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Labels to update user to
   * </pre>
   *
   * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
   * @return A list containing the labelIds.
   */
  public com.google.protobuf.ProtocolStringList
      getLabelIdsList() {
    return labelIds_;
  }
  /**
   * <pre>
   * Labels to update user to
   * </pre>
   *
   * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
   * @return The count of labelIds.
   */
  public int getLabelIdsCount() {
    return labelIds_.size();
  }
  /**
   * <pre>
   * Labels to update user to
   * </pre>
   *
   * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
   * @param index The index of the element to return.
   * @return The labelIds at the given index.
   */
  public java.lang.String getLabelIds(int index) {
    return labelIds_.get(index);
  }
  /**
   * <pre>
   * Labels to update user to
   * </pre>
   *
   * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelIds at the given index.
   */
  public com.google.protobuf.ByteString
      getLabelIdsBytes(int index) {
    return labelIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orgId_);
    }
    for (int i = 0; i < labelIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, labelIds_.getRaw(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orgId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < labelIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(labelIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLabelIdsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (!getLabelIdsList()
        .equals(other.getLabelIdsList())) return false;
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
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    if (getLabelIdsCount() > 0) {
      hash = (37 * hash) + LABEL_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest prototype) {
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
   * Request message for the UpdateUserLabels rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateUserLabelsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateUserLabelsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_UpdateUserLabelsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_UpdateUserLabelsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.newBuilder()
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
      orgId_ = "";
      labelIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_UpdateUserLabelsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        labelIds_.makeImmutable();
        result.labelIds_ = labelIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.labelIds_.isEmpty()) {
        if (labelIds_.isEmpty()) {
          labelIds_ = other.labelIds_;
          bitField0_ |= 0x00000004;
        } else {
          ensureLabelIdsIsMutable();
          labelIds_.addAll(other.labelIds_);
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureLabelIdsIsMutable();
              labelIds_.add(s);
              break;
            } // case 26
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
     * The ID of the user whose labels will be updated.
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
     * The ID of the user whose labels will be updated.
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
     * The ID of the user whose labels will be updated.
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
     * The ID of the user whose labels will be updated.
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
     * The ID of the user whose labels will be updated.
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

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * The organization ID of the user
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
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
     * The organization ID of the user
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
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
     * The organization ID of the user
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The organization ID of the user
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The organization ID of the user
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList labelIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureLabelIdsIsMutable() {
      if (!labelIds_.isModifiable()) {
        labelIds_ = new com.google.protobuf.LazyStringArrayList(labelIds_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @return A list containing the labelIds.
     */
    public com.google.protobuf.ProtocolStringList
        getLabelIdsList() {
      labelIds_.makeImmutable();
      return labelIds_;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @return The count of labelIds.
     */
    public int getLabelIdsCount() {
      return labelIds_.size();
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param index The index of the element to return.
     * @return The labelIds at the given index.
     */
    public java.lang.String getLabelIds(int index) {
      return labelIds_.get(index);
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the labelIds at the given index.
     */
    public com.google.protobuf.ByteString
        getLabelIdsBytes(int index) {
      return labelIds_.getByteString(index);
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param index The index to set the value at.
     * @param value The labelIds to set.
     * @return This builder for chaining.
     */
    public Builder setLabelIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelIdsIsMutable();
      labelIds_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param value The labelIds to add.
     * @return This builder for chaining.
     */
    public Builder addLabelIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureLabelIdsIsMutable();
      labelIds_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param values The labelIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabelIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureLabelIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, labelIds_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLabelIds() {
      labelIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Labels to update user to
     * </pre>
     *
     * <code>repeated string label_ids = 3 [json_name = "labelIds"];</code>
     * @param value The bytes of the labelIds to add.
     * @return This builder for chaining.
     */
    public Builder addLabelIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureLabelIdsIsMutable();
      labelIds_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateUserLabelsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateUserLabelsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateUserLabelsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateUserLabelsRequest>() {
    @java.lang.Override
    public UpdateUserLabelsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateUserLabelsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateUserLabelsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateUserLabelsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

