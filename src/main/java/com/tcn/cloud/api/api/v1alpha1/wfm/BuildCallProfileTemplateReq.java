// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the BuildCallProfileTemplate RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.BuildCallProfileTemplateReq}
 */
public final class BuildCallProfileTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.BuildCallProfileTemplateReq)
    BuildCallProfileTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildCallProfileTemplateReq.newBuilder() to construct.
  private BuildCallProfileTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildCallProfileTemplateReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildCallProfileTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.Builder.class);
  }

  public static final int SKILL_PROFILE_CATEGORY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.SkillProfileCategory skillProfileCategory_;
  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  @java.lang.Override
  public boolean hasSkillProfileCategory() {
    return skillProfileCategory_ != null;
  }
  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory() {
    return skillProfileCategory_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : skillProfileCategory_;
  }
  /**
   * <pre>
   * Skill profile category of the training data used to generate the template.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder() {
    return skillProfileCategory_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : skillProfileCategory_;
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
    if (skillProfileCategory_ != null) {
      output.writeMessage(1, getSkillProfileCategory());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillProfileCategory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSkillProfileCategory());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq) obj;

    if (hasSkillProfileCategory() != other.hasSkillProfileCategory()) return false;
    if (hasSkillProfileCategory()) {
      if (!getSkillProfileCategory()
          .equals(other.getSkillProfileCategory())) return false;
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
    if (hasSkillProfileCategory()) {
      hash = (37 * hash) + SKILL_PROFILE_CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getSkillProfileCategory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq prototype) {
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
   * Request message for the BuildCallProfileTemplate RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.BuildCallProfileTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.BuildCallProfileTemplateReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.newBuilder()
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
      skillProfileCategory_ = null;
      if (skillProfileCategoryBuilder_ != null) {
        skillProfileCategoryBuilder_.dispose();
        skillProfileCategoryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillProfileCategory_ = skillProfileCategoryBuilder_ == null
            ? skillProfileCategory_
            : skillProfileCategoryBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq.getDefaultInstance()) return this;
      if (other.hasSkillProfileCategory()) {
        mergeSkillProfileCategory(other.getSkillProfileCategory());
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
                  getSkillProfileCategoryFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.SkillProfileCategory skillProfileCategory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder> skillProfileCategoryBuilder_;
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     * @return Whether the skillProfileCategory field is set.
     */
    public boolean hasSkillProfileCategory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     * @return The skillProfileCategory.
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory() {
      if (skillProfileCategoryBuilder_ == null) {
        return skillProfileCategory_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : skillProfileCategory_;
      } else {
        return skillProfileCategoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public Builder setSkillProfileCategory(com.tcn.cloud.api.api.commons.SkillProfileCategory value) {
      if (skillProfileCategoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skillProfileCategory_ = value;
      } else {
        skillProfileCategoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public Builder setSkillProfileCategory(
        com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder builderForValue) {
      if (skillProfileCategoryBuilder_ == null) {
        skillProfileCategory_ = builderForValue.build();
      } else {
        skillProfileCategoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public Builder mergeSkillProfileCategory(com.tcn.cloud.api.api.commons.SkillProfileCategory value) {
      if (skillProfileCategoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          skillProfileCategory_ != null &&
          skillProfileCategory_ != com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance()) {
          getSkillProfileCategoryBuilder().mergeFrom(value);
        } else {
          skillProfileCategory_ = value;
        }
      } else {
        skillProfileCategoryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public Builder clearSkillProfileCategory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skillProfileCategory_ = null;
      if (skillProfileCategoryBuilder_ != null) {
        skillProfileCategoryBuilder_.dispose();
        skillProfileCategoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder getSkillProfileCategoryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSkillProfileCategoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder getSkillProfileCategoryOrBuilder() {
      if (skillProfileCategoryBuilder_ != null) {
        return skillProfileCategoryBuilder_.getMessageOrBuilder();
      } else {
        return skillProfileCategory_ == null ?
            com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : skillProfileCategory_;
      }
    }
    /**
     * <pre>
     * Skill profile category of the training data used to generate the template.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 1 [json_name = "skillProfileCategory"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder> 
        getSkillProfileCategoryFieldBuilder() {
      if (skillProfileCategoryBuilder_ == null) {
        skillProfileCategoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder>(
                getSkillProfileCategory(),
                getParentForChildren(),
                isClean());
        skillProfileCategory_ = null;
      }
      return skillProfileCategoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.BuildCallProfileTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.BuildCallProfileTemplateReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildCallProfileTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<BuildCallProfileTemplateReq>() {
    @java.lang.Override
    public BuildCallProfileTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildCallProfileTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildCallProfileTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

