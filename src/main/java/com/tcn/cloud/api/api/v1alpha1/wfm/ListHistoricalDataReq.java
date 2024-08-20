// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListHistoricalData RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListHistoricalDataReq}
 */
public final class ListHistoricalDataReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListHistoricalDataReq)
    ListHistoricalDataReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHistoricalDataReq.newBuilder() to construct.
  private ListHistoricalDataReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHistoricalDataReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHistoricalDataReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListHistoricalDataReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListHistoricalDataReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.Builder.class);
  }

  public static final int SKILL_PROFILE_SID_FIELD_NUMBER = 1;
  private long skillProfileSid_ = 0L;
  /**
   * <pre>
   * ID of the skill profile used to examine matching calls in the client's historical data.
   * Deprecated as of Sep/8/2023: use skill_profile_category instead.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.wfm.ListHistoricalDataReq.skill_profile_sid is deprecated.
   *     See api/v1alpha1/wfm/wfm.proto;l=3999
   * @return The skillProfileSid.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getSkillProfileSid() {
    return skillProfileSid_;
  }

  public static final int SKILL_PROFILE_CATEGORY_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.SkillProfileCategory skillProfileCategory_;
  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
   * @return Whether the skillProfileCategory field is set.
   */
  @java.lang.Override
  public boolean hasSkillProfileCategory() {
    return skillProfileCategory_ != null;
  }
  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
   * @return The skillProfileCategory.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategory getSkillProfileCategory() {
    return skillProfileCategory_ == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance() : skillProfileCategory_;
  }
  /**
   * <pre>
   * Skill profile category that the desired calls will belong to.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
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
    if (skillProfileSid_ != 0L) {
      output.writeInt64(1, skillProfileSid_);
    }
    if (skillProfileCategory_ != null) {
      output.writeMessage(2, getSkillProfileCategory());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillProfileSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, skillProfileSid_);
    }
    if (skillProfileCategory_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSkillProfileCategory());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq) obj;

    if (getSkillProfileSid()
        != other.getSkillProfileSid()) return false;
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
    hash = (37 * hash) + SKILL_PROFILE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkillProfileSid());
    if (hasSkillProfileCategory()) {
      hash = (37 * hash) + SKILL_PROFILE_CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getSkillProfileCategory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq prototype) {
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
   * Request message for the ListHistoricalData RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListHistoricalDataReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListHistoricalDataReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListHistoricalDataReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListHistoricalDataReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.newBuilder()
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
      skillProfileSid_ = 0L;
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
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListHistoricalDataReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillProfileSid_ = skillProfileSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq.getDefaultInstance()) return this;
      if (other.getSkillProfileSid() != 0L) {
        setSkillProfileSid(other.getSkillProfileSid());
      }
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
            case 8: {
              skillProfileSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getSkillProfileCategoryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private long skillProfileSid_ ;
    /**
     * <pre>
     * ID of the skill profile used to examine matching calls in the client's historical data.
     * Deprecated as of Sep/8/2023: use skill_profile_category instead.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.ListHistoricalDataReq.skill_profile_sid is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=3999
     * @return The skillProfileSid.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getSkillProfileSid() {
      return skillProfileSid_;
    }
    /**
     * <pre>
     * ID of the skill profile used to examine matching calls in the client's historical data.
     * Deprecated as of Sep/8/2023: use skill_profile_category instead.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.ListHistoricalDataReq.skill_profile_sid is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=3999
     * @param value The skillProfileSid to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSkillProfileSid(long value) {

      skillProfileSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the skill profile used to examine matching calls in the client's historical data.
     * Deprecated as of Sep/8/2023: use skill_profile_category instead.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 1 [json_name = "skillProfileSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.wfm.ListHistoricalDataReq.skill_profile_sid is deprecated.
     *     See api/v1alpha1/wfm/wfm.proto;l=3999
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearSkillProfileSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skillProfileSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.SkillProfileCategory skillProfileCategory_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SkillProfileCategory, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder, com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder> skillProfileCategoryBuilder_;
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
     * @return Whether the skillProfileCategory field is set.
     */
    public boolean hasSkillProfileCategory() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
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
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
     */
    public Builder setSkillProfileCategory(
        com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder builderForValue) {
      if (skillProfileCategoryBuilder_ == null) {
        skillProfileCategory_ = builderForValue.build();
      } else {
        skillProfileCategoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
     */
    public Builder mergeSkillProfileCategory(com.tcn.cloud.api.api.commons.SkillProfileCategory value) {
      if (skillProfileCategoryBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          skillProfileCategory_ != null &&
          skillProfileCategory_ != com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance()) {
          getSkillProfileCategoryBuilder().mergeFrom(value);
        } else {
          skillProfileCategory_ = value;
        }
      } else {
        skillProfileCategoryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
     */
    public Builder clearSkillProfileCategory() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
     */
    public com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder getSkillProfileCategoryBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSkillProfileCategoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
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
     * Skill profile category that the desired calls will belong to.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory skill_profile_category = 2 [json_name = "skillProfileCategory"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListHistoricalDataReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListHistoricalDataReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHistoricalDataReq>
      PARSER = new com.google.protobuf.AbstractParser<ListHistoricalDataReq>() {
    @java.lang.Override
    public ListHistoricalDataReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHistoricalDataReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHistoricalDataReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListHistoricalDataReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

