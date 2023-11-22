// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

/**
 * <pre>
 * Response message for the ListSkillGroups rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.skills.ListSkillGroupsResponse}
 */
public final class ListSkillGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.skills.ListSkillGroupsResponse)
    ListSkillGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSkillGroupsResponse.newBuilder() to construct.
  private ListSkillGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSkillGroupsResponse() {
    skillGroups_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSkillGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.Builder.class);
  }

  public static final int SKILL_GROUPS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.SkillGroup> skillGroups_;
  /**
   * <pre>
   * The skill groups in the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.SkillGroup> getSkillGroupsList() {
    return skillGroups_;
  }
  /**
   * <pre>
   * The skill groups in the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder> 
      getSkillGroupsOrBuilderList() {
    return skillGroups_;
  }
  /**
   * <pre>
   * The skill groups in the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
   */
  @java.lang.Override
  public int getSkillGroupsCount() {
    return skillGroups_.size();
  }
  /**
   * <pre>
   * The skill groups in the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.SkillGroup getSkillGroups(int index) {
    return skillGroups_.get(index);
  }
  /**
   * <pre>
   * The skill groups in the organization.
   * </pre>
   *
   * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder getSkillGroupsOrBuilder(
      int index) {
    return skillGroups_.get(index);
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
    for (int i = 0; i < skillGroups_.size(); i++) {
      output.writeMessage(1, skillGroups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skillGroups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, skillGroups_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse other = (com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse) obj;

    if (!getSkillGroupsList()
        .equals(other.getSkillGroupsList())) return false;
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
    if (getSkillGroupsCount() > 0) {
      hash = (37 * hash) + SKILL_GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getSkillGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse prototype) {
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
   * Response message for the ListSkillGroups rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.skills.ListSkillGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.skills.ListSkillGroupsResponse)
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.newBuilder()
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
      if (skillGroupsBuilder_ == null) {
        skillGroups_ = java.util.Collections.emptyList();
      } else {
        skillGroups_ = null;
        skillGroupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_ListSkillGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse result = new com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse result) {
      if (skillGroupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skillGroups_ = java.util.Collections.unmodifiableList(skillGroups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillGroups_ = skillGroups_;
      } else {
        result.skillGroups_ = skillGroupsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse.getDefaultInstance()) return this;
      if (skillGroupsBuilder_ == null) {
        if (!other.skillGroups_.isEmpty()) {
          if (skillGroups_.isEmpty()) {
            skillGroups_ = other.skillGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillGroupsIsMutable();
            skillGroups_.addAll(other.skillGroups_);
          }
          onChanged();
        }
      } else {
        if (!other.skillGroups_.isEmpty()) {
          if (skillGroupsBuilder_.isEmpty()) {
            skillGroupsBuilder_.dispose();
            skillGroupsBuilder_ = null;
            skillGroups_ = other.skillGroups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skillGroupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkillGroupsFieldBuilder() : null;
          } else {
            skillGroupsBuilder_.addAllMessages(other.skillGroups_);
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
              com.tcn.cloud.api.api.commons.org.SkillGroup m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.SkillGroup.parser(),
                      extensionRegistry);
              if (skillGroupsBuilder_ == null) {
                ensureSkillGroupsIsMutable();
                skillGroups_.add(m);
              } else {
                skillGroupsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.SkillGroup> skillGroups_ =
      java.util.Collections.emptyList();
    private void ensureSkillGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skillGroups_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.SkillGroup>(skillGroups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.SkillGroup, com.tcn.cloud.api.api.commons.org.SkillGroup.Builder, com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder> skillGroupsBuilder_;

    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.SkillGroup> getSkillGroupsList() {
      if (skillGroupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skillGroups_);
      } else {
        return skillGroupsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public int getSkillGroupsCount() {
      if (skillGroupsBuilder_ == null) {
        return skillGroups_.size();
      } else {
        return skillGroupsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.SkillGroup getSkillGroups(int index) {
      if (skillGroupsBuilder_ == null) {
        return skillGroups_.get(index);
      } else {
        return skillGroupsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder setSkillGroups(
        int index, com.tcn.cloud.api.api.commons.org.SkillGroup value) {
      if (skillGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupsIsMutable();
        skillGroups_.set(index, value);
        onChanged();
      } else {
        skillGroupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder setSkillGroups(
        int index, com.tcn.cloud.api.api.commons.org.SkillGroup.Builder builderForValue) {
      if (skillGroupsBuilder_ == null) {
        ensureSkillGroupsIsMutable();
        skillGroups_.set(index, builderForValue.build());
        onChanged();
      } else {
        skillGroupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder addSkillGroups(com.tcn.cloud.api.api.commons.org.SkillGroup value) {
      if (skillGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupsIsMutable();
        skillGroups_.add(value);
        onChanged();
      } else {
        skillGroupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder addSkillGroups(
        int index, com.tcn.cloud.api.api.commons.org.SkillGroup value) {
      if (skillGroupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillGroupsIsMutable();
        skillGroups_.add(index, value);
        onChanged();
      } else {
        skillGroupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder addSkillGroups(
        com.tcn.cloud.api.api.commons.org.SkillGroup.Builder builderForValue) {
      if (skillGroupsBuilder_ == null) {
        ensureSkillGroupsIsMutable();
        skillGroups_.add(builderForValue.build());
        onChanged();
      } else {
        skillGroupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder addSkillGroups(
        int index, com.tcn.cloud.api.api.commons.org.SkillGroup.Builder builderForValue) {
      if (skillGroupsBuilder_ == null) {
        ensureSkillGroupsIsMutable();
        skillGroups_.add(index, builderForValue.build());
        onChanged();
      } else {
        skillGroupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder addAllSkillGroups(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.SkillGroup> values) {
      if (skillGroupsBuilder_ == null) {
        ensureSkillGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillGroups_);
        onChanged();
      } else {
        skillGroupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder clearSkillGroups() {
      if (skillGroupsBuilder_ == null) {
        skillGroups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skillGroupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public Builder removeSkillGroups(int index) {
      if (skillGroupsBuilder_ == null) {
        ensureSkillGroupsIsMutable();
        skillGroups_.remove(index);
        onChanged();
      } else {
        skillGroupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.SkillGroup.Builder getSkillGroupsBuilder(
        int index) {
      return getSkillGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder getSkillGroupsOrBuilder(
        int index) {
      if (skillGroupsBuilder_ == null) {
        return skillGroups_.get(index);  } else {
        return skillGroupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder> 
         getSkillGroupsOrBuilderList() {
      if (skillGroupsBuilder_ != null) {
        return skillGroupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skillGroups_);
      }
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.SkillGroup.Builder addSkillGroupsBuilder() {
      return getSkillGroupsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.SkillGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.SkillGroup.Builder addSkillGroupsBuilder(
        int index) {
      return getSkillGroupsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.SkillGroup.getDefaultInstance());
    }
    /**
     * <pre>
     * The skill groups in the organization.
     * </pre>
     *
     * <code>repeated .api.commons.org.SkillGroup skill_groups = 1 [json_name = "skillGroups"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.SkillGroup.Builder> 
         getSkillGroupsBuilderList() {
      return getSkillGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.SkillGroup, com.tcn.cloud.api.api.commons.org.SkillGroup.Builder, com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder> 
        getSkillGroupsFieldBuilder() {
      if (skillGroupsBuilder_ == null) {
        skillGroupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.SkillGroup, com.tcn.cloud.api.api.commons.org.SkillGroup.Builder, com.tcn.cloud.api.api.commons.org.SkillGroupOrBuilder>(
                skillGroups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        skillGroups_ = null;
      }
      return skillGroupsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.skills.ListSkillGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.skills.ListSkillGroupsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkillGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSkillGroupsResponse>() {
    @java.lang.Override
    public ListSkillGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkillGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkillGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.ListSkillGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

