// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

/**
 * <pre>
 * Response message for the UpdateUsersBulkDisabled rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse}
 */
public final class UpdateBulkUsersDisabledResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)
    UpdateBulkUsersDisabledResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBulkUsersDisabledResponse.newBuilder() to construct.
  private UpdateBulkUsersDisabledResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBulkUsersDisabledResponse() {
    updatedIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBulkUsersDisabledResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_UpdateBulkUsersDisabledResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_UpdateBulkUsersDisabledResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.Builder.class);
  }

  public static final int UPDATED_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList updatedIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * updated_ids is a list of every id that was updated.
   * </pre>
   *
   * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
   * @return A list containing the updatedIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUpdatedIdsList() {
    return updatedIds_;
  }
  /**
   * <pre>
   * updated_ids is a list of every id that was updated.
   * </pre>
   *
   * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
   * @return The count of updatedIds.
   */
  public int getUpdatedIdsCount() {
    return updatedIds_.size();
  }
  /**
   * <pre>
   * updated_ids is a list of every id that was updated.
   * </pre>
   *
   * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
   * @param index The index of the element to return.
   * @return The updatedIds at the given index.
   */
  public java.lang.String getUpdatedIds(int index) {
    return updatedIds_.get(index);
  }
  /**
   * <pre>
   * updated_ids is a list of every id that was updated.
   * </pre>
   *
   * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the updatedIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUpdatedIdsBytes(int index) {
    return updatedIds_.getByteString(index);
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
    for (int i = 0; i < updatedIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, updatedIds_.getRaw(i));
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
      for (int i = 0; i < updatedIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(updatedIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUpdatedIdsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse other = (com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse) obj;

    if (!getUpdatedIdsList()
        .equals(other.getUpdatedIdsList())) return false;
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
    if (getUpdatedIdsCount() > 0) {
      hash = (37 * hash) + UPDATED_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse prototype) {
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
   * Response message for the UpdateUsersBulkDisabled rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_UpdateBulkUsersDisabledResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_UpdateBulkUsersDisabledResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.class, com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.newBuilder()
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
      updatedIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.internal_static_api_v1alpha1_org_users_UpdateBulkUsersDisabledResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse result = new com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        updatedIds_.makeImmutable();
        result.updatedIds_ = updatedIds_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse.getDefaultInstance()) return this;
      if (!other.updatedIds_.isEmpty()) {
        if (updatedIds_.isEmpty()) {
          updatedIds_ = other.updatedIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureUpdatedIdsIsMutable();
          updatedIds_.addAll(other.updatedIds_);
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
              ensureUpdatedIdsIsMutable();
              updatedIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList updatedIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUpdatedIdsIsMutable() {
      if (!updatedIds_.isModifiable()) {
        updatedIds_ = new com.google.protobuf.LazyStringArrayList(updatedIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @return A list containing the updatedIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUpdatedIdsList() {
      updatedIds_.makeImmutable();
      return updatedIds_;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @return The count of updatedIds.
     */
    public int getUpdatedIdsCount() {
      return updatedIds_.size();
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param index The index of the element to return.
     * @return The updatedIds at the given index.
     */
    public java.lang.String getUpdatedIds(int index) {
      return updatedIds_.get(index);
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the updatedIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUpdatedIdsBytes(int index) {
      return updatedIds_.getByteString(index);
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param index The index to set the value at.
     * @param value The updatedIds to set.
     * @return This builder for chaining.
     */
    public Builder setUpdatedIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUpdatedIdsIsMutable();
      updatedIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param value The updatedIds to add.
     * @return This builder for chaining.
     */
    public Builder addUpdatedIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureUpdatedIdsIsMutable();
      updatedIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param values The updatedIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllUpdatedIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureUpdatedIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, updatedIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdatedIds() {
      updatedIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated_ids is a list of every id that was updated.
     * </pre>
     *
     * <code>repeated string updated_ids = 1 [json_name = "updatedIds"];</code>
     * @param value The bytes of the updatedIds to add.
     * @return This builder for chaining.
     */
    public Builder addUpdatedIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureUpdatedIdsIsMutable();
      updatedIds_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBulkUsersDisabledResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBulkUsersDisabledResponse>() {
    @java.lang.Override
    public UpdateBulkUsersDisabledResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBulkUsersDisabledResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBulkUsersDisabledResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.users.UpdateBulkUsersDisabledResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

