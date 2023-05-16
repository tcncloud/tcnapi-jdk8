// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request message for the MultiAgentSkillAssignment RPC.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.MultiAgentSkillAssignmentReq}
 */
public final class MultiAgentSkillAssignmentReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.MultiAgentSkillAssignmentReq)
    MultiAgentSkillAssignmentReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiAgentSkillAssignmentReq.newBuilder() to construct.
  private MultiAgentSkillAssignmentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiAgentSkillAssignmentReq() {
    userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    skills_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiAgentSkillAssignmentReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_MultiAgentSkillAssignmentReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_MultiAgentSkillAssignmentReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.class, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.Builder.class);
  }

  public static final int USER_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList userIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return A list containing the userIds.
   */
  public com.google.protobuf.ProtocolStringList
      getUserIdsList() {
    return userIds_;
  }
  /**
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @return The count of userIds.
   */
  public int getUserIdsCount() {
    return userIds_.size();
  }
  /**
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the element to return.
   * @return The userIds at the given index.
   */
  public java.lang.String getUserIds(int index) {
    return userIds_.get(index);
  }
  /**
   * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userIds at the given index.
   */
  public com.google.protobuf.ByteString
      getUserIdsBytes(int index) {
    return userIds_.getByteString(index);
  }

  public static final int SKILLS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.SkillUpdate> skills_;
  /**
   * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.SkillUpdate> getSkillsList() {
    return skills_;
  }
  /**
   * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder> 
      getSkillsOrBuilderList() {
    return skills_;
  }
  /**
   * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public int getSkillsCount() {
    return skills_.size();
  }
  /**
   * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SkillUpdate getSkills(int index) {
    return skills_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder getSkillsOrBuilder(
      int index) {
    return skills_.get(index);
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userIds_.getRaw(i));
    }
    for (int i = 0; i < skills_.size(); i++) {
      output.writeMessage(3, skills_.get(i));
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
    for (int i = 0; i < skills_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, skills_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq other = (com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq) obj;

    if (!getUserIdsList()
        .equals(other.getUserIdsList())) return false;
    if (!getSkillsList()
        .equals(other.getSkillsList())) return false;
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
    if (getSkillsCount() > 0) {
      hash = (37 * hash) + SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getSkillsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq prototype) {
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
   * Request message for the MultiAgentSkillAssignment RPC.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.MultiAgentSkillAssignmentReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.MultiAgentSkillAssignmentReq)
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_MultiAgentSkillAssignmentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_MultiAgentSkillAssignmentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.class, com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.newBuilder()
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
      if (skillsBuilder_ == null) {
        skills_ = java.util.Collections.emptyList();
      } else {
        skills_ = null;
        skillsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_MultiAgentSkillAssignmentReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq build() {
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq result = new com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq result) {
      if (skillsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          skills_ = java.util.Collections.unmodifiableList(skills_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.skills_ = skills_;
      } else {
        result.skills_ = skillsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        userIds_.makeImmutable();
        result.userIds_ = userIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq.getDefaultInstance()) return this;
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
      if (skillsBuilder_ == null) {
        if (!other.skills_.isEmpty()) {
          if (skills_.isEmpty()) {
            skills_ = other.skills_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSkillsIsMutable();
            skills_.addAll(other.skills_);
          }
          onChanged();
        }
      } else {
        if (!other.skills_.isEmpty()) {
          if (skillsBuilder_.isEmpty()) {
            skillsBuilder_.dispose();
            skillsBuilder_ = null;
            skills_ = other.skills_;
            bitField0_ = (bitField0_ & ~0x00000002);
            skillsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkillsFieldBuilder() : null;
          } else {
            skillsBuilder_.addAllMessages(other.skills_);
          }
        }
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUserIdsIsMutable();
              userIds_.add(s);
              break;
            } // case 18
            case 26: {
              com.tcn.cloud.api.api.v0alpha.SkillUpdate m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.SkillUpdate.parser(),
                      extensionRegistry);
              if (skillsBuilder_ == null) {
                ensureSkillsIsMutable();
                skills_.add(m);
              } else {
                skillsBuilder_.addMessage(m);
              }
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

    private com.google.protobuf.LazyStringArrayList userIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureUserIdsIsMutable() {
      if (!userIds_.isModifiable()) {
        userIds_ = new com.google.protobuf.LazyStringArrayList(userIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return A list containing the userIds.
     */
    public com.google.protobuf.ProtocolStringList
        getUserIdsList() {
      userIds_.makeImmutable();
      return userIds_;
    }
    /**
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
      return userIds_.size();
    }
    /**
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public java.lang.String getUserIds(int index) {
      return userIds_.get(index);
    }
    /**
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the userIds at the given index.
     */
    public com.google.protobuf.ByteString
        getUserIdsBytes(int index) {
      return userIds_.getByteString(index);
    }
    /**
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
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
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
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
     * <code>repeated string user_ids = 2 [json_name = "userIds"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.SkillUpdate> skills_ =
      java.util.Collections.emptyList();
    private void ensureSkillsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        skills_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.SkillUpdate>(skills_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SkillUpdate, com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder, com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder> skillsBuilder_;

    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SkillUpdate> getSkillsList() {
      if (skillsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skills_);
      } else {
        return skillsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public int getSkillsCount() {
      if (skillsBuilder_ == null) {
        return skills_.size();
      } else {
        return skillsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SkillUpdate getSkills(int index) {
      if (skillsBuilder_ == null) {
        return skills_.get(index);
      } else {
        return skillsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder setSkills(
        int index, com.tcn.cloud.api.api.v0alpha.SkillUpdate value) {
      if (skillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillsIsMutable();
        skills_.set(index, value);
        onChanged();
      } else {
        skillsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder setSkills(
        int index, com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder builderForValue) {
      if (skillsBuilder_ == null) {
        ensureSkillsIsMutable();
        skills_.set(index, builderForValue.build());
        onChanged();
      } else {
        skillsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder addSkills(com.tcn.cloud.api.api.v0alpha.SkillUpdate value) {
      if (skillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillsIsMutable();
        skills_.add(value);
        onChanged();
      } else {
        skillsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder addSkills(
        int index, com.tcn.cloud.api.api.v0alpha.SkillUpdate value) {
      if (skillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillsIsMutable();
        skills_.add(index, value);
        onChanged();
      } else {
        skillsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder addSkills(
        com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder builderForValue) {
      if (skillsBuilder_ == null) {
        ensureSkillsIsMutable();
        skills_.add(builderForValue.build());
        onChanged();
      } else {
        skillsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder addSkills(
        int index, com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder builderForValue) {
      if (skillsBuilder_ == null) {
        ensureSkillsIsMutable();
        skills_.add(index, builderForValue.build());
        onChanged();
      } else {
        skillsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder addAllSkills(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.SkillUpdate> values) {
      if (skillsBuilder_ == null) {
        ensureSkillsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skills_);
        onChanged();
      } else {
        skillsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder clearSkills() {
      if (skillsBuilder_ == null) {
        skills_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        skillsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public Builder removeSkills(int index) {
      if (skillsBuilder_ == null) {
        ensureSkillsIsMutable();
        skills_.remove(index);
        onChanged();
      } else {
        skillsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder getSkillsBuilder(
        int index) {
      return getSkillsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder getSkillsOrBuilder(
        int index) {
      if (skillsBuilder_ == null) {
        return skills_.get(index);  } else {
        return skillsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder> 
         getSkillsOrBuilderList() {
      if (skillsBuilder_ != null) {
        return skillsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skills_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder addSkillsBuilder() {
      return getSkillsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.SkillUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder addSkillsBuilder(
        int index) {
      return getSkillsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.SkillUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.SkillUpdate skills = 3 [json_name = "skills"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder> 
         getSkillsBuilderList() {
      return getSkillsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SkillUpdate, com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder, com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder> 
        getSkillsFieldBuilder() {
      if (skillsBuilder_ == null) {
        skillsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SkillUpdate, com.tcn.cloud.api.api.v0alpha.SkillUpdate.Builder, com.tcn.cloud.api.api.v0alpha.SkillUpdateOrBuilder>(
                skills_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        skills_ = null;
      }
      return skillsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.MultiAgentSkillAssignmentReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.MultiAgentSkillAssignmentReq)
  private static final com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiAgentSkillAssignmentReq>
      PARSER = new com.google.protobuf.AbstractParser<MultiAgentSkillAssignmentReq>() {
    @java.lang.Override
    public MultiAgentSkillAssignmentReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiAgentSkillAssignmentReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiAgentSkillAssignmentReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MultiAgentSkillAssignmentReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

