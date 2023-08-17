// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListNonSkillActivityAssociations RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes}
 */
public final class ListNonSkillActivityAssociationsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)
    ListNonSkillActivityAssociationsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNonSkillActivityAssociationsRes.newBuilder() to construct.
  private ListNonSkillActivityAssociationsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNonSkillActivityAssociationsRes() {
    nonSkillActivitySids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNonSkillActivityAssociationsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.Builder.class);
  }

  public static final int NON_SKILL_ACTIVITY_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList nonSkillActivitySids_ =
      emptyLongList();
  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @return A list containing the nonSkillActivitySids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getNonSkillActivitySidsList() {
    return nonSkillActivitySids_;
  }
  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @return The count of nonSkillActivitySids.
   */
  public int getNonSkillActivitySidsCount() {
    return nonSkillActivitySids_.size();
  }
  /**
   * <pre>
   * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
   * </pre>
   *
   * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
   * @param index The index of the element to return.
   * @return The nonSkillActivitySids at the given index.
   */
  public long getNonSkillActivitySids(int index) {
    return nonSkillActivitySids_.getLong(index);
  }
  private int nonSkillActivitySidsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getNonSkillActivitySidsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(nonSkillActivitySidsMemoizedSerializedSize);
    }
    for (int i = 0; i < nonSkillActivitySids_.size(); i++) {
      output.writeInt64NoTag(nonSkillActivitySids_.getLong(i));
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
      for (int i = 0; i < nonSkillActivitySids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(nonSkillActivitySids_.getLong(i));
      }
      size += dataSize;
      if (!getNonSkillActivitySidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nonSkillActivitySidsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes) obj;

    if (!getNonSkillActivitySidsList()
        .equals(other.getNonSkillActivitySidsList())) return false;
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
    if (getNonSkillActivitySidsCount() > 0) {
      hash = (37 * hash) + NON_SKILL_ACTIVITY_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNonSkillActivitySidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes prototype) {
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
   * Response message for the ListNonSkillActivityAssociations RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.newBuilder()
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
      nonSkillActivitySids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        nonSkillActivitySids_.makeImmutable();
        result.nonSkillActivitySids_ = nonSkillActivitySids_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes.getDefaultInstance()) return this;
      if (!other.nonSkillActivitySids_.isEmpty()) {
        if (nonSkillActivitySids_.isEmpty()) {
          nonSkillActivitySids_ = other.nonSkillActivitySids_;
          nonSkillActivitySids_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureNonSkillActivitySidsIsMutable();
          nonSkillActivitySids_.addAll(other.nonSkillActivitySids_);
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
            case 8: {
              long v = input.readInt64();
              ensureNonSkillActivitySidsIsMutable();
              nonSkillActivitySids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureNonSkillActivitySidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                nonSkillActivitySids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList nonSkillActivitySids_ = emptyLongList();
    private void ensureNonSkillActivitySidsIsMutable() {
      if (!nonSkillActivitySids_.isModifiable()) {
        nonSkillActivitySids_ = makeMutableCopy(nonSkillActivitySids_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @return A list containing the nonSkillActivitySids.
     */
    public java.util.List<java.lang.Long>
        getNonSkillActivitySidsList() {
      nonSkillActivitySids_.makeImmutable();
      return nonSkillActivitySids_;
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @return The count of nonSkillActivitySids.
     */
    public int getNonSkillActivitySidsCount() {
      return nonSkillActivitySids_.size();
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @param index The index of the element to return.
     * @return The nonSkillActivitySids at the given index.
     */
    public long getNonSkillActivitySids(int index) {
      return nonSkillActivitySids_.getLong(index);
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @param index The index to set the value at.
     * @param value The nonSkillActivitySids to set.
     * @return This builder for chaining.
     */
    public Builder setNonSkillActivitySids(
        int index, long value) {

      ensureNonSkillActivitySidsIsMutable();
      nonSkillActivitySids_.setLong(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @param value The nonSkillActivitySids to add.
     * @return This builder for chaining.
     */
    public Builder addNonSkillActivitySids(long value) {

      ensureNonSkillActivitySidsIsMutable();
      nonSkillActivitySids_.addLong(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @param values The nonSkillActivitySids to add.
     * @return This builder for chaining.
     */
    public Builder addAllNonSkillActivitySids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureNonSkillActivitySidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nonSkillActivitySids_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the non skill activities found to have the &#64;relationship_type with the &#64;associated_entity in the request.
     * </pre>
     *
     * <code>repeated int64 non_skill_activity_sids = 1 [json_name = "nonSkillActivitySids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNonSkillActivitySids() {
      nonSkillActivitySids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNonSkillActivityAssociationsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListNonSkillActivityAssociationsRes>() {
    @java.lang.Override
    public ListNonSkillActivityAssociationsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNonSkillActivityAssociationsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNonSkillActivityAssociationsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

