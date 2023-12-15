// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

/**
 * <pre>
 * Response message for the ListSkillGroupsMembers rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.skills.ListSkillGroupsMembersResponse}
 */
public final class ListSkillGroupsMembersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)
    ListSkillGroupsMembersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSkillGroupsMembersResponse.newBuilder() to construct.
  private ListSkillGroupsMembersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSkillGroupsMembersResponse() {
    skillGroupMembers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSkillGroupsMembersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsMembersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsMembersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.class, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.Builder.class);
  }

  public static final int SKILL_GROUP_MEMBERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers> skillGroupMembers_;
  /**
   * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers> getSkillGroupMembersList() {
    return skillGroupMembers_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder> 
      getSkillGroupMembersOrBuilderList() {
    return skillGroupMembers_;
  }
  /**
   * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
   */
  @java.lang.Override
  public int getSkillGroupMembersCount() {
    return skillGroupMembers_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers getSkillGroupMembers(int index) {
    return skillGroupMembers_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder getSkillGroupMembersOrBuilder(
      int index) {
    return skillGroupMembers_.get(index);
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
    for (int i = 0; i < skillGroupMembers_.size(); i++) {
      output.writeMessage(1, skillGroupMembers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skillGroupMembers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, skillGroupMembers_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse other = (com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse) obj;

    if (!getSkillGroupMembersList()
        .equals(other.getSkillGroupMembersList())) return false;
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
    if (getSkillGroupMembersCount() > 0) {
      hash = (37 * hash) + SKILL_GROUP_MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getSkillGroupMembersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse prototype) {
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
   * Response message for the ListSkillGroupsMembers rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.skills.ListSkillGroupsMembersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsMembersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsMembersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.class, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.newBuilder()
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
      if (skillGroupMembersBuilder_ == null) {
        skillGroupMembers_ = java.util.Collections.emptyList();
      } else {
        skillGroupMembers_ = null;
        skillGroupMembersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsMembersResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse result = new com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse result) {
      if (skillGroupMembersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skillGroupMembers_ = java.util.Collections.unmodifiableList(skillGroupMembers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillGroupMembers_ = skillGroupMembers_;
      } else {
        result.skillGroupMembers_ = skillGroupMembersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse.getDefaultInstance()) return this;
      if (skillGroupMembersBuilder_ == null) {
        if (!other.skillGroupMembers_.isEmpty()) {
          if (skillGroupMembers_.isEmpty()) {
            skillGroupMembers_ = other.skillGroupMembers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillGroupMembersIsMutable();
            skillGroupMembers_.addAll(other.skillGroupMembers_);
          }
          onChanged();
        }
      } else {
        if (!other.skillGroupMembers_.isEmpty()) {
          if (skillGroupMembersBuilder_.isEmpty()) {
            skillGroupMembersBuilder_.dispose();
            skillGroupMembersBuilder_ = null;
            skillGroupMembers_ = other.skillGroupMembers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skillGroupMembersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkillGroupMembersFieldBuilder() : null;
          } else {
            skillGroupMembersBuilder_.addAllMessages(other.skillGroupMembers_);
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
            case 10: {
              com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.parser(),
                      extensionRegistry);
              if (skillGroupMembersBuilder_ == null) {
                ensureSkillGroupMembersIsMutable();
                skillGroupMembers_.add(m);
              } else {
                skillGroupMembersBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers> skillGroupMembers_ =
      java.util.Collections.emptyList();
    private void ensureSkillGroupMembersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skillGroupMembers_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers>(skillGroupMembers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder> skillGroupMembersBuilder_;

    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers> getSkillGroupMembersList() {
      if (skillGroupMembersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skillGroupMembers_);
      } else {
        return skillGroupMembersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public int getSkillGroupMembersCount() {
      if (skillGroupMembersBuilder_ == null) {
        return skillGroupMembers_.size();
      } else {
        return skillGroupMembersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers getSkillGroupMembers(int index) {
      if (skillGroupMembersBuilder_ == null) {
        return skillGroupMembers_.get(index);
      } else {
        return skillGroupMembersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder setSkillGroupMembers(
        int index, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers value) {
      if (skillGroupMembersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.set(index, value);
        onChanged();
      } else {
        skillGroupMembersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder setSkillGroupMembers(
        int index, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder builderForValue) {
      if (skillGroupMembersBuilder_ == null) {
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.set(index, builderForValue.build());
        onChanged();
      } else {
        skillGroupMembersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder addSkillGroupMembers(com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers value) {
      if (skillGroupMembersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.add(value);
        onChanged();
      } else {
        skillGroupMembersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder addSkillGroupMembers(
        int index, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers value) {
      if (skillGroupMembersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.add(index, value);
        onChanged();
      } else {
        skillGroupMembersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder addSkillGroupMembers(
        com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder builderForValue) {
      if (skillGroupMembersBuilder_ == null) {
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.add(builderForValue.build());
        onChanged();
      } else {
        skillGroupMembersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder addSkillGroupMembers(
        int index, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder builderForValue) {
      if (skillGroupMembersBuilder_ == null) {
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.add(index, builderForValue.build());
        onChanged();
      } else {
        skillGroupMembersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder addAllSkillGroupMembers(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers> values) {
      if (skillGroupMembersBuilder_ == null) {
        ensureSkillGroupMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillGroupMembers_);
        onChanged();
      } else {
        skillGroupMembersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder clearSkillGroupMembers() {
      if (skillGroupMembersBuilder_ == null) {
        skillGroupMembers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skillGroupMembersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public Builder removeSkillGroupMembers(int index) {
      if (skillGroupMembersBuilder_ == null) {
        ensureSkillGroupMembersIsMutable();
        skillGroupMembers_.remove(index);
        onChanged();
      } else {
        skillGroupMembersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder getSkillGroupMembersBuilder(
        int index) {
      return getSkillGroupMembersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder getSkillGroupMembersOrBuilder(
        int index) {
      if (skillGroupMembersBuilder_ == null) {
        return skillGroupMembers_.get(index);  } else {
        return skillGroupMembersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder> 
         getSkillGroupMembersOrBuilderList() {
      if (skillGroupMembersBuilder_ != null) {
        return skillGroupMembersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skillGroupMembers_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder addSkillGroupMembersBuilder() {
      return getSkillGroupMembersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder addSkillGroupMembersBuilder(
        int index) {
      return getSkillGroupMembersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.org.skills.SkillGroupMembers skill_group_members = 1 [json_name = "skillGroupMembers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder> 
         getSkillGroupMembersBuilderList() {
      return getSkillGroupMembersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder> 
        getSkillGroupMembersFieldBuilder() {
      if (skillGroupMembersBuilder_ == null) {
        skillGroupMembersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembers.Builder, com.tcn.cloud.api.api.v1alpha1.org.skills.SkillGroupMembersOrBuilder>(
                skillGroupMembers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        skillGroupMembers_ = null;
      }
      return skillGroupMembersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.skills.ListSkillGroupsMembersResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkillGroupsMembersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSkillGroupsMembersResponse>() {
    @java.lang.Override
    public ListSkillGroupsMembersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkillGroupsMembersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkillGroupsMembersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsMembersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
