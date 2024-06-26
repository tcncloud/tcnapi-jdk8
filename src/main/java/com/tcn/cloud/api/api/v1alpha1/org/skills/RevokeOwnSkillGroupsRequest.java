// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

/**
 * <pre>
 * Request message for the RevokeOwnSkillGroups rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest}
 */
public final class RevokeOwnSkillGroupsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)
    RevokeOwnSkillGroupsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RevokeOwnSkillGroupsRequest.newBuilder() to construct.
  private RevokeOwnSkillGroupsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RevokeOwnSkillGroupsRequest() {
    skillGroupIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RevokeOwnSkillGroupsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RevokeOwnSkillGroupsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RevokeOwnSkillGroupsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.Builder.class);
  }

  public static final int SKILL_GROUP_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList skillGroupIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The ids of the skill groups to be revoked.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @return A list containing the skillGroupIds.
   */
  public com.google.protobuf.ProtocolStringList
      getSkillGroupIdsList() {
    return skillGroupIds_;
  }
  /**
   * <pre>
   * The ids of the skill groups to be revoked.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @return The count of skillGroupIds.
   */
  public int getSkillGroupIdsCount() {
    return skillGroupIds_.size();
  }
  /**
   * <pre>
   * The ids of the skill groups to be revoked.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @param index The index of the element to return.
   * @return The skillGroupIds at the given index.
   */
  public java.lang.String getSkillGroupIds(int index) {
    return skillGroupIds_.get(index);
  }
  /**
   * <pre>
   * The ids of the skill groups to be revoked.
   * </pre>
   *
   * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the skillGroupIds at the given index.
   */
  public com.google.protobuf.ByteString
      getSkillGroupIdsBytes(int index) {
    return skillGroupIds_.getByteString(index);
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
    for (int i = 0; i < skillGroupIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skillGroupIds_.getRaw(i));
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
      for (int i = 0; i < skillGroupIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(skillGroupIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSkillGroupIdsList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest) obj;

    if (!getSkillGroupIdsList()
        .equals(other.getSkillGroupIdsList())) return false;
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
    if (getSkillGroupIdsCount() > 0) {
      hash = (37 * hash) + SKILL_GROUP_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getSkillGroupIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest prototype) {
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
   * Request message for the RevokeOwnSkillGroups rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RevokeOwnSkillGroupsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RevokeOwnSkillGroupsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.newBuilder()
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
      skillGroupIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RevokeOwnSkillGroupsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        skillGroupIds_.makeImmutable();
        result.skillGroupIds_ = skillGroupIds_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest.getDefaultInstance()) return this;
      if (!other.skillGroupIds_.isEmpty()) {
        if (skillGroupIds_.isEmpty()) {
          skillGroupIds_ = other.skillGroupIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureSkillGroupIdsIsMutable();
          skillGroupIds_.addAll(other.skillGroupIds_);
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
              ensureSkillGroupIdsIsMutable();
              skillGroupIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList skillGroupIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSkillGroupIdsIsMutable() {
      if (!skillGroupIds_.isModifiable()) {
        skillGroupIds_ = new com.google.protobuf.LazyStringArrayList(skillGroupIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @return A list containing the skillGroupIds.
     */
    public com.google.protobuf.ProtocolStringList
        getSkillGroupIdsList() {
      skillGroupIds_.makeImmutable();
      return skillGroupIds_;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @return The count of skillGroupIds.
     */
    public int getSkillGroupIdsCount() {
      return skillGroupIds_.size();
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param index The index of the element to return.
     * @return The skillGroupIds at the given index.
     */
    public java.lang.String getSkillGroupIds(int index) {
      return skillGroupIds_.get(index);
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the skillGroupIds at the given index.
     */
    public com.google.protobuf.ByteString
        getSkillGroupIdsBytes(int index) {
      return skillGroupIds_.getByteString(index);
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param index The index to set the value at.
     * @param value The skillGroupIds to set.
     * @return This builder for chaining.
     */
    public Builder setSkillGroupIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkillGroupIdsIsMutable();
      skillGroupIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param value The skillGroupIds to add.
     * @return This builder for chaining.
     */
    public Builder addSkillGroupIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSkillGroupIdsIsMutable();
      skillGroupIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param values The skillGroupIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllSkillGroupIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureSkillGroupIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, skillGroupIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillGroupIds() {
      skillGroupIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ids of the skill groups to be revoked.
     * </pre>
     *
     * <code>repeated string skill_group_ids = 1 [json_name = "skillGroupIds"];</code>
     * @param value The bytes of the skillGroupIds to add.
     * @return This builder for chaining.
     */
    public Builder addSkillGroupIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSkillGroupIdsIsMutable();
      skillGroupIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevokeOwnSkillGroupsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RevokeOwnSkillGroupsRequest>() {
    @java.lang.Override
    public RevokeOwnSkillGroupsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevokeOwnSkillGroupsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevokeOwnSkillGroupsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.RevokeOwnSkillGroupsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

