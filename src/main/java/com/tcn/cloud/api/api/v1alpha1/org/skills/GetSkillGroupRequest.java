// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

/**
 * <pre>
 * Request message for the GetSkillGroup rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.skills.GetSkillGroupRequest}
 */
public final class GetSkillGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.skills.GetSkillGroupRequest)
    GetSkillGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSkillGroupRequest.newBuilder() to construct.
  private GetSkillGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSkillGroupRequest() {
    skillGroupId_ = "";
    fieldMask_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSkillGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_GetSkillGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_GetSkillGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.Builder.class);
  }

  public static final int SKILL_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object skillGroupId_ = "";
  /**
   * <pre>
   * The skill group id of the skill group
   * </pre>
   *
   * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
   * @return The skillGroupId.
   */
  @java.lang.Override
  public java.lang.String getSkillGroupId() {
    java.lang.Object ref = skillGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillGroupId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The skill group id of the skill group
   * </pre>
   *
   * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
   * @return The bytes for skillGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkillGroupIdBytes() {
    java.lang.Object ref = skillGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList fieldMask_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Mask to filter fields on skill group entity in response.
   * </pre>
   *
   * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
   * @return A list containing the fieldMask.
   */
  public com.google.protobuf.ProtocolStringList
      getFieldMaskList() {
    return fieldMask_;
  }
  /**
   * <pre>
   * Mask to filter fields on skill group entity in response.
   * </pre>
   *
   * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The count of fieldMask.
   */
  public int getFieldMaskCount() {
    return fieldMask_.size();
  }
  /**
   * <pre>
   * Mask to filter fields on skill group entity in response.
   * </pre>
   *
   * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
   * @param index The index of the element to return.
   * @return The fieldMask at the given index.
   */
  public java.lang.String getFieldMask(int index) {
    return fieldMask_.get(index);
  }
  /**
   * <pre>
   * Mask to filter fields on skill group entity in response.
   * </pre>
   *
   * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldMask at the given index.
   */
  public com.google.protobuf.ByteString
      getFieldMaskBytes(int index) {
    return fieldMask_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skillGroupId_);
    }
    for (int i = 0; i < fieldMask_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldMask_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skillGroupId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fieldMask_.size(); i++) {
        dataSize += computeStringSizeNoTag(fieldMask_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFieldMaskList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest) obj;

    if (!getSkillGroupId()
        .equals(other.getSkillGroupId())) return false;
    if (!getFieldMaskList()
        .equals(other.getFieldMaskList())) return false;
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
    hash = (37 * hash) + SKILL_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSkillGroupId().hashCode();
    if (getFieldMaskCount() > 0) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMaskList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest prototype) {
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
   * Request message for the GetSkillGroup rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.skills.GetSkillGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.skills.GetSkillGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_GetSkillGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_GetSkillGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.newBuilder()
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
      skillGroupId_ = "";
      fieldMask_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_GetSkillGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillGroupId_ = skillGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        fieldMask_.makeImmutable();
        result.fieldMask_ = fieldMask_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest.getDefaultInstance()) return this;
      if (!other.getSkillGroupId().isEmpty()) {
        skillGroupId_ = other.skillGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.fieldMask_.isEmpty()) {
        if (fieldMask_.isEmpty()) {
          fieldMask_ = other.fieldMask_;
          bitField0_ |= 0x00000002;
        } else {
          ensureFieldMaskIsMutable();
          fieldMask_.addAll(other.fieldMask_);
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
              skillGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureFieldMaskIsMutable();
              fieldMask_.add(s);
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

    private java.lang.Object skillGroupId_ = "";
    /**
     * <pre>
     * The skill group id of the skill group
     * </pre>
     *
     * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
     * @return The skillGroupId.
     */
    public java.lang.String getSkillGroupId() {
      java.lang.Object ref = skillGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The skill group id of the skill group
     * </pre>
     *
     * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
     * @return The bytes for skillGroupId.
     */
    public com.google.protobuf.ByteString
        getSkillGroupIdBytes() {
      java.lang.Object ref = skillGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The skill group id of the skill group
     * </pre>
     *
     * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
     * @param value The skillGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setSkillGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      skillGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The skill group id of the skill group
     * </pre>
     *
     * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillGroupId() {
      skillGroupId_ = getDefaultInstance().getSkillGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The skill group id of the skill group
     * </pre>
     *
     * <code>string skill_group_id = 1 [json_name = "skillGroupId"];</code>
     * @param value The bytes for skillGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setSkillGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      skillGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList fieldMask_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureFieldMaskIsMutable() {
      if (!fieldMask_.isModifiable()) {
        fieldMask_ = new com.google.protobuf.LazyStringArrayList(fieldMask_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @return A list containing the fieldMask.
     */
    public com.google.protobuf.ProtocolStringList
        getFieldMaskList() {
      fieldMask_.makeImmutable();
      return fieldMask_;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @return The count of fieldMask.
     */
    public int getFieldMaskCount() {
      return fieldMask_.size();
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param index The index of the element to return.
     * @return The fieldMask at the given index.
     */
    public java.lang.String getFieldMask(int index) {
      return fieldMask_.get(index);
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the fieldMask at the given index.
     */
    public com.google.protobuf.ByteString
        getFieldMaskBytes(int index) {
      return fieldMask_.getByteString(index);
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param index The index to set the value at.
     * @param value The fieldMask to set.
     * @return This builder for chaining.
     */
    public Builder setFieldMask(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldMaskIsMutable();
      fieldMask_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param value The fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addFieldMask(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param values The fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addAllFieldMask(
        java.lang.Iterable<java.lang.String> values) {
      ensureFieldMaskIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fieldMask_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldMask() {
      fieldMask_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mask to filter fields on skill group entity in response.
     * </pre>
     *
     * <code>repeated string field_mask = 2 [json_name = "fieldMask"];</code>
     * @param value The bytes of the fieldMask to add.
     * @return This builder for chaining.
     */
    public Builder addFieldMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFieldMaskIsMutable();
      fieldMask_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.skills.GetSkillGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.skills.GetSkillGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSkillGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetSkillGroupRequest>() {
    @java.lang.Override
    public GetSkillGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSkillGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSkillGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.GetSkillGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

