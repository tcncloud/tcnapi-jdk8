// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListSkillProfiles RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListSkillProfilesRes}
 */
public final class ListSkillProfilesRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListSkillProfilesRes)
    ListSkillProfilesResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSkillProfilesRes.newBuilder() to construct.
  private ListSkillProfilesRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSkillProfilesRes() {
    skillProfiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSkillProfilesRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.Builder.class);
  }

  public static final int SKILL_PROFILES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile> skillProfiles_;
  /**
   * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile> getSkillProfilesList() {
    return skillProfiles_;
  }
  /**
   * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder> 
      getSkillProfilesOrBuilderList() {
    return skillProfiles_;
  }
  /**
   * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
   */
  @java.lang.Override
  public int getSkillProfilesCount() {
    return skillProfiles_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile getSkillProfiles(int index) {
    return skillProfiles_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder getSkillProfilesOrBuilder(
      int index) {
    return skillProfiles_.get(index);
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
    for (int i = 0; i < skillProfiles_.size(); i++) {
      output.writeMessage(1, skillProfiles_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < skillProfiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, skillProfiles_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes) obj;

    if (!getSkillProfilesList()
        .equals(other.getSkillProfilesList())) return false;
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
    if (getSkillProfilesCount() > 0) {
      hash = (37 * hash) + SKILL_PROFILES_FIELD_NUMBER;
      hash = (53 * hash) + getSkillProfilesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes prototype) {
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
   * Response message for the ListSkillProfiles RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListSkillProfilesRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListSkillProfilesRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.newBuilder()
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
      if (skillProfilesBuilder_ == null) {
        skillProfiles_ = java.util.Collections.emptyList();
      } else {
        skillProfiles_ = null;
        skillProfilesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes result) {
      if (skillProfilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          skillProfiles_ = java.util.Collections.unmodifiableList(skillProfiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.skillProfiles_ = skillProfiles_;
      } else {
        result.skillProfiles_ = skillProfilesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes.getDefaultInstance()) return this;
      if (skillProfilesBuilder_ == null) {
        if (!other.skillProfiles_.isEmpty()) {
          if (skillProfiles_.isEmpty()) {
            skillProfiles_ = other.skillProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSkillProfilesIsMutable();
            skillProfiles_.addAll(other.skillProfiles_);
          }
          onChanged();
        }
      } else {
        if (!other.skillProfiles_.isEmpty()) {
          if (skillProfilesBuilder_.isEmpty()) {
            skillProfilesBuilder_.dispose();
            skillProfilesBuilder_ = null;
            skillProfiles_ = other.skillProfiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            skillProfilesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkillProfilesFieldBuilder() : null;
          } else {
            skillProfilesBuilder_.addAllMessages(other.skillProfiles_);
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
              com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.parser(),
                      extensionRegistry);
              if (skillProfilesBuilder_ == null) {
                ensureSkillProfilesIsMutable();
                skillProfiles_.add(m);
              } else {
                skillProfilesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile> skillProfiles_ =
      java.util.Collections.emptyList();
    private void ensureSkillProfilesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        skillProfiles_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile>(skillProfiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder> skillProfilesBuilder_;

    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile> getSkillProfilesList() {
      if (skillProfilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skillProfiles_);
      } else {
        return skillProfilesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public int getSkillProfilesCount() {
      if (skillProfilesBuilder_ == null) {
        return skillProfiles_.size();
      } else {
        return skillProfilesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile getSkillProfiles(int index) {
      if (skillProfilesBuilder_ == null) {
        return skillProfiles_.get(index);
      } else {
        return skillProfilesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder setSkillProfiles(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile value) {
      if (skillProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillProfilesIsMutable();
        skillProfiles_.set(index, value);
        onChanged();
      } else {
        skillProfilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder setSkillProfiles(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder builderForValue) {
      if (skillProfilesBuilder_ == null) {
        ensureSkillProfilesIsMutable();
        skillProfiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        skillProfilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder addSkillProfiles(com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile value) {
      if (skillProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillProfilesIsMutable();
        skillProfiles_.add(value);
        onChanged();
      } else {
        skillProfilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder addSkillProfiles(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile value) {
      if (skillProfilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkillProfilesIsMutable();
        skillProfiles_.add(index, value);
        onChanged();
      } else {
        skillProfilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder addSkillProfiles(
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder builderForValue) {
      if (skillProfilesBuilder_ == null) {
        ensureSkillProfilesIsMutable();
        skillProfiles_.add(builderForValue.build());
        onChanged();
      } else {
        skillProfilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder addSkillProfiles(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder builderForValue) {
      if (skillProfilesBuilder_ == null) {
        ensureSkillProfilesIsMutable();
        skillProfiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        skillProfilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder addAllSkillProfiles(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile> values) {
      if (skillProfilesBuilder_ == null) {
        ensureSkillProfilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillProfiles_);
        onChanged();
      } else {
        skillProfilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder clearSkillProfiles() {
      if (skillProfilesBuilder_ == null) {
        skillProfiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        skillProfilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public Builder removeSkillProfiles(int index) {
      if (skillProfilesBuilder_ == null) {
        ensureSkillProfilesIsMutable();
        skillProfiles_.remove(index);
        onChanged();
      } else {
        skillProfilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder getSkillProfilesBuilder(
        int index) {
      return getSkillProfilesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder getSkillProfilesOrBuilder(
        int index) {
      if (skillProfilesBuilder_ == null) {
        return skillProfiles_.get(index);  } else {
        return skillProfilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder> 
         getSkillProfilesOrBuilderList() {
      if (skillProfilesBuilder_ != null) {
        return skillProfilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skillProfiles_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder addSkillProfilesBuilder() {
      return getSkillProfilesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder addSkillProfilesBuilder(
        int index) {
      return getSkillProfilesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.wfm.SkillProfile skill_profiles = 1 [json_name = "skillProfiles"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder> 
         getSkillProfilesBuilderList() {
      return getSkillProfilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder> 
        getSkillProfilesFieldBuilder() {
      if (skillProfilesBuilder_ == null) {
        skillProfilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfile.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileOrBuilder>(
                skillProfiles_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        skillProfiles_ = null;
      }
      return skillProfilesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListSkillProfilesRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListSkillProfilesRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkillProfilesRes>
      PARSER = new com.google.protobuf.AbstractParser<ListSkillProfilesRes>() {
    @java.lang.Override
    public ListSkillProfilesRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkillProfilesRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkillProfilesRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

