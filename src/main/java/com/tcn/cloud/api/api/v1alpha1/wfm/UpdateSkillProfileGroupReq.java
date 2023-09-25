// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the UpdateSkillProfileGroup RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpdateSkillProfileGroupReq}
 */
public final class UpdateSkillProfileGroupReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpdateSkillProfileGroupReq)
    UpdateSkillProfileGroupReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSkillProfileGroupReq.newBuilder() to construct.
  private UpdateSkillProfileGroupReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSkillProfileGroupReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSkillProfileGroupReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateSkillProfileGroupReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateSkillProfileGroupReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.Builder.class);
  }

  public static final int SKILL_PROFILE_GROUP_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup skillProfileGroup_;
  /**
   * <pre>
   * Skill profile group to update.
   * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
   * @return Whether the skillProfileGroup field is set.
   */
  @java.lang.Override
  public boolean hasSkillProfileGroup() {
    return skillProfileGroup_ != null;
  }
  /**
   * <pre>
   * Skill profile group to update.
   * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
   * @return The skillProfileGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup getSkillProfileGroup() {
    return skillProfileGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.getDefaultInstance() : skillProfileGroup_;
  }
  /**
   * <pre>
   * Skill profile group to update.
   * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroupOrBuilder getSkillProfileGroupOrBuilder() {
    return skillProfileGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.getDefaultInstance() : skillProfileGroup_;
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
    if (skillProfileGroup_ != null) {
      output.writeMessage(1, getSkillProfileGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillProfileGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSkillProfileGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq) obj;

    if (hasSkillProfileGroup() != other.hasSkillProfileGroup()) return false;
    if (hasSkillProfileGroup()) {
      if (!getSkillProfileGroup()
          .equals(other.getSkillProfileGroup())) return false;
    }
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
    if (hasSkillProfileGroup()) {
      hash = (37 * hash) + SKILL_PROFILE_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getSkillProfileGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq prototype) {
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
   * Request message for the UpdateSkillProfileGroup RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpdateSkillProfileGroupReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpdateSkillProfileGroupReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateSkillProfileGroupReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateSkillProfileGroupReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.newBuilder()
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
      skillProfileGroup_ = null;
      if (skillProfileGroupBuilder_ != null) {
        skillProfileGroupBuilder_.dispose();
        skillProfileGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdateSkillProfileGroupReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillProfileGroup_ = skillProfileGroupBuilder_ == null
            ? skillProfileGroup_
            : skillProfileGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq.getDefaultInstance()) return this;
      if (other.hasSkillProfileGroup()) {
        mergeSkillProfileGroup(other.getSkillProfileGroup());
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
              input.readMessage(
                  getSkillProfileGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup skillProfileGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroupOrBuilder> skillProfileGroupBuilder_;
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     * @return Whether the skillProfileGroup field is set.
     */
    public boolean hasSkillProfileGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     * @return The skillProfileGroup.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup getSkillProfileGroup() {
      if (skillProfileGroupBuilder_ == null) {
        return skillProfileGroup_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.getDefaultInstance() : skillProfileGroup_;
      } else {
        return skillProfileGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public Builder setSkillProfileGroup(com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup value) {
      if (skillProfileGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skillProfileGroup_ = value;
      } else {
        skillProfileGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public Builder setSkillProfileGroup(
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.Builder builderForValue) {
      if (skillProfileGroupBuilder_ == null) {
        skillProfileGroup_ = builderForValue.build();
      } else {
        skillProfileGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public Builder mergeSkillProfileGroup(com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup value) {
      if (skillProfileGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          skillProfileGroup_ != null &&
          skillProfileGroup_ != com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.getDefaultInstance()) {
          getSkillProfileGroupBuilder().mergeFrom(value);
        } else {
          skillProfileGroup_ = value;
        }
      } else {
        skillProfileGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public Builder clearSkillProfileGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skillProfileGroup_ = null;
      if (skillProfileGroupBuilder_ != null) {
        skillProfileGroupBuilder_.dispose();
        skillProfileGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.Builder getSkillProfileGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSkillProfileGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroupOrBuilder getSkillProfileGroupOrBuilder() {
      if (skillProfileGroupBuilder_ != null) {
        return skillProfileGroupBuilder_.getMessageOrBuilder();
      } else {
        return skillProfileGroup_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.getDefaultInstance() : skillProfileGroup_;
      }
    }
    /**
     * <pre>
     * Skill profile group to update.
     * &#64;skill_profile_group_sids will be ignored since associations cannot be updated by this method.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.SkillProfileGroup skill_profile_group = 1 [json_name = "skillProfileGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroupOrBuilder> 
        getSkillProfileGroupFieldBuilder() {
      if (skillProfileGroupBuilder_ == null) {
        skillProfileGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroup.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.SkillProfileGroupOrBuilder>(
                getSkillProfileGroup(),
                getParentForChildren(),
                isClean());
        skillProfileGroup_ = null;
      }
      return skillProfileGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpdateSkillProfileGroupReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpdateSkillProfileGroupReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSkillProfileGroupReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSkillProfileGroupReq>() {
    @java.lang.Override
    public UpdateSkillProfileGroupReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSkillProfileGroupReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSkillProfileGroupReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpdateSkillProfileGroupReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

