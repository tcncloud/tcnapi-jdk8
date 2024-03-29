// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Indetifier for a skill profile category.
 * </pre>
 *
 * Protobuf type {@code api.commons.SkillProfileCategory}
 */
public final class SkillProfileCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.SkillProfileCategory)
    SkillProfileCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkillProfileCategory.newBuilder() to construct.
  private SkillProfileCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkillProfileCategory() {
    skillProfileCategoryType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SkillProfileCategory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_SkillProfileCategory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_SkillProfileCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.SkillProfileCategory.class, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder.class);
  }

  /**
   * <pre>
   * enum representing the type of a of skill profile category.
   * </pre>
   *
   * Protobuf enum {@code api.commons.SkillProfileCategory.CategoryType}
   */
  public enum CategoryType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Single skill profile.
     * </pre>
     *
     * <code>SINGLE_SKILL_PROFILE = 0;</code>
     */
    SINGLE_SKILL_PROFILE(0),
    /**
     * <pre>
     * Skill profile group.
     * </pre>
     *
     * <code>SKILL_PROFILE_GROUP = 1;</code>
     */
    SKILL_PROFILE_GROUP(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Single skill profile.
     * </pre>
     *
     * <code>SINGLE_SKILL_PROFILE = 0;</code>
     */
    public static final int SINGLE_SKILL_PROFILE_VALUE = 0;
    /**
     * <pre>
     * Skill profile group.
     * </pre>
     *
     * <code>SKILL_PROFILE_GROUP = 1;</code>
     */
    public static final int SKILL_PROFILE_GROUP_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CategoryType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CategoryType forNumber(int value) {
      switch (value) {
        case 0: return SINGLE_SKILL_PROFILE;
        case 1: return SKILL_PROFILE_GROUP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CategoryType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CategoryType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CategoryType>() {
            public CategoryType findValueByNumber(int number) {
              return CategoryType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.SkillProfileCategory.getDescriptor().getEnumTypes().get(0);
    }

    private static final CategoryType[] VALUES = values();

    public static CategoryType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CategoryType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api.commons.SkillProfileCategory.CategoryType)
  }

  public static final int SKILL_PROFILE_CATEGORY_SID_FIELD_NUMBER = 1;
  private long skillProfileCategorySid_ = 0L;
  /**
   * <pre>
   * ID of either a skill profile or a skill profile group determined by &#64;skill_profile_category_type.
   * </pre>
   *
   * <code>int64 skill_profile_category_sid = 1 [json_name = "skillProfileCategorySid", jstype = JS_STRING];</code>
   * @return The skillProfileCategorySid.
   */
  @java.lang.Override
  public long getSkillProfileCategorySid() {
    return skillProfileCategorySid_;
  }

  public static final int SKILL_PROFILE_CATEGORY_TYPE_FIELD_NUMBER = 2;
  private int skillProfileCategoryType_ = 0;
  /**
   * <pre>
   * Category type for &#64;skill_profile_category_sid.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
   * @return The enum numeric value on the wire for skillProfileCategoryType.
   */
  @java.lang.Override public int getSkillProfileCategoryTypeValue() {
    return skillProfileCategoryType_;
  }
  /**
   * <pre>
   * Category type for &#64;skill_profile_category_sid.
   * </pre>
   *
   * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
   * @return The skillProfileCategoryType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType getSkillProfileCategoryType() {
    com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType result = com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.forNumber(skillProfileCategoryType_);
    return result == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.UNRECOGNIZED : result;
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
    if (skillProfileCategorySid_ != 0L) {
      output.writeInt64(1, skillProfileCategorySid_);
    }
    if (skillProfileCategoryType_ != com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.SINGLE_SKILL_PROFILE.getNumber()) {
      output.writeEnum(2, skillProfileCategoryType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillProfileCategorySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, skillProfileCategorySid_);
    }
    if (skillProfileCategoryType_ != com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.SINGLE_SKILL_PROFILE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, skillProfileCategoryType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.SkillProfileCategory)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.SkillProfileCategory other = (com.tcn.cloud.api.api.commons.SkillProfileCategory) obj;

    if (getSkillProfileCategorySid()
        != other.getSkillProfileCategorySid()) return false;
    if (skillProfileCategoryType_ != other.skillProfileCategoryType_) return false;
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
    hash = (37 * hash) + SKILL_PROFILE_CATEGORY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkillProfileCategorySid());
    hash = (37 * hash) + SKILL_PROFILE_CATEGORY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + skillProfileCategoryType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.SkillProfileCategory parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.SkillProfileCategory prototype) {
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
   * Indetifier for a skill profile category.
   * </pre>
   *
   * Protobuf type {@code api.commons.SkillProfileCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.SkillProfileCategory)
      com.tcn.cloud.api.api.commons.SkillProfileCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_SkillProfileCategory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_SkillProfileCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.SkillProfileCategory.class, com.tcn.cloud.api.api.commons.SkillProfileCategory.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.SkillProfileCategory.newBuilder()
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
      skillProfileCategorySid_ = 0L;
      skillProfileCategoryType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_SkillProfileCategory_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SkillProfileCategory getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SkillProfileCategory build() {
      com.tcn.cloud.api.api.commons.SkillProfileCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SkillProfileCategory buildPartial() {
      com.tcn.cloud.api.api.commons.SkillProfileCategory result = new com.tcn.cloud.api.api.commons.SkillProfileCategory(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.SkillProfileCategory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillProfileCategorySid_ = skillProfileCategorySid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skillProfileCategoryType_ = skillProfileCategoryType_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.SkillProfileCategory) {
        return mergeFrom((com.tcn.cloud.api.api.commons.SkillProfileCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.SkillProfileCategory other) {
      if (other == com.tcn.cloud.api.api.commons.SkillProfileCategory.getDefaultInstance()) return this;
      if (other.getSkillProfileCategorySid() != 0L) {
        setSkillProfileCategorySid(other.getSkillProfileCategorySid());
      }
      if (other.skillProfileCategoryType_ != 0) {
        setSkillProfileCategoryTypeValue(other.getSkillProfileCategoryTypeValue());
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
              skillProfileCategorySid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              skillProfileCategoryType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long skillProfileCategorySid_ ;
    /**
     * <pre>
     * ID of either a skill profile or a skill profile group determined by &#64;skill_profile_category_type.
     * </pre>
     *
     * <code>int64 skill_profile_category_sid = 1 [json_name = "skillProfileCategorySid", jstype = JS_STRING];</code>
     * @return The skillProfileCategorySid.
     */
    @java.lang.Override
    public long getSkillProfileCategorySid() {
      return skillProfileCategorySid_;
    }
    /**
     * <pre>
     * ID of either a skill profile or a skill profile group determined by &#64;skill_profile_category_type.
     * </pre>
     *
     * <code>int64 skill_profile_category_sid = 1 [json_name = "skillProfileCategorySid", jstype = JS_STRING];</code>
     * @param value The skillProfileCategorySid to set.
     * @return This builder for chaining.
     */
    public Builder setSkillProfileCategorySid(long value) {

      skillProfileCategorySid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of either a skill profile or a skill profile group determined by &#64;skill_profile_category_type.
     * </pre>
     *
     * <code>int64 skill_profile_category_sid = 1 [json_name = "skillProfileCategorySid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillProfileCategorySid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skillProfileCategorySid_ = 0L;
      onChanged();
      return this;
    }

    private int skillProfileCategoryType_ = 0;
    /**
     * <pre>
     * Category type for &#64;skill_profile_category_sid.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
     * @return The enum numeric value on the wire for skillProfileCategoryType.
     */
    @java.lang.Override public int getSkillProfileCategoryTypeValue() {
      return skillProfileCategoryType_;
    }
    /**
     * <pre>
     * Category type for &#64;skill_profile_category_sid.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
     * @param value The enum numeric value on the wire for skillProfileCategoryType to set.
     * @return This builder for chaining.
     */
    public Builder setSkillProfileCategoryTypeValue(int value) {
      skillProfileCategoryType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Category type for &#64;skill_profile_category_sid.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
     * @return The skillProfileCategoryType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType getSkillProfileCategoryType() {
      com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType result = com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.forNumber(skillProfileCategoryType_);
      return result == null ? com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Category type for &#64;skill_profile_category_sid.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
     * @param value The skillProfileCategoryType to set.
     * @return This builder for chaining.
     */
    public Builder setSkillProfileCategoryType(com.tcn.cloud.api.api.commons.SkillProfileCategory.CategoryType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      skillProfileCategoryType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Category type for &#64;skill_profile_category_sid.
     * </pre>
     *
     * <code>.api.commons.SkillProfileCategory.CategoryType skill_profile_category_type = 2 [json_name = "skillProfileCategoryType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillProfileCategoryType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      skillProfileCategoryType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.SkillProfileCategory)
  }

  // @@protoc_insertion_point(class_scope:api.commons.SkillProfileCategory)
  private static final com.tcn.cloud.api.api.commons.SkillProfileCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.SkillProfileCategory();
  }

  public static com.tcn.cloud.api.api.commons.SkillProfileCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkillProfileCategory>
      PARSER = new com.google.protobuf.AbstractParser<SkillProfileCategory>() {
    @java.lang.Override
    public SkillProfileCategory parsePartialFrom(
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

  public static com.google.protobuf.Parser<SkillProfileCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkillProfileCategory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SkillProfileCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

