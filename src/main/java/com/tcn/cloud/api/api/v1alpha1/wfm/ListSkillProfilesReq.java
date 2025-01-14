// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListSkillProfiles RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListSkillProfilesReq}
 */
public final class ListSkillProfilesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListSkillProfilesReq)
    ListSkillProfilesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSkillProfilesReq.newBuilder() to construct.
  private ListSkillProfilesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSkillProfilesReq() {
    channelTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSkillProfilesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.Builder.class);
  }

  public static final int ACTIVE_ONLY_FIELD_NUMBER = 1;
  private boolean activeOnly_ = false;
  /**
   * <pre>
   * If set to true only active skill profiles will be returned, otherwise active and inactive skill profiles will be returned.
   * </pre>
   *
   * <code>bool active_only = 1 [json_name = "activeOnly"];</code>
   * @return The activeOnly.
   */
  @java.lang.Override
  public boolean getActiveOnly() {
    return activeOnly_;
  }

  public static final int WITH_SKILLS_FIELD_NUMBER = 2;
  private boolean withSkills_ = false;
  /**
   * <pre>
   * If set to true the skills of skill profiles will be returned, otherwise they will not.
   * </pre>
   *
   * <code>bool with_skills = 2 [json_name = "withSkills"];</code>
   * @return The withSkills.
   */
  @java.lang.Override
  public boolean getWithSkills() {
    return withSkills_;
  }

  public static final int CHANNEL_TYPES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> channelTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.ChannelType> channelTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.ChannelType>() {
            public com.tcn.cloud.api.api.commons.ChannelType convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * If set, will filter skill profiles by the given channel types.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
   * @return A list containing the channelTypes.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.ChannelType> getChannelTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.ChannelType>(channelTypes_, channelTypes_converter_);
  }
  /**
   * <pre>
   * If set, will filter skill profiles by the given channel types.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
   * @return The count of channelTypes.
   */
  @java.lang.Override
  public int getChannelTypesCount() {
    return channelTypes_.size();
  }
  /**
   * <pre>
   * If set, will filter skill profiles by the given channel types.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
   * @param index The index of the element to return.
   * @return The channelTypes at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ChannelType getChannelTypes(int index) {
    return channelTypes_converter_.convert(channelTypes_.get(index));
  }
  /**
   * <pre>
   * If set, will filter skill profiles by the given channel types.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
   * @return A list containing the enum numeric values on the wire for channelTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getChannelTypesValueList() {
    return channelTypes_;
  }
  /**
   * <pre>
   * If set, will filter skill profiles by the given channel types.
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of channelTypes at the given index.
   */
  @java.lang.Override
  public int getChannelTypesValue(int index) {
    return channelTypes_.get(index);
  }
  private int channelTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (activeOnly_ != false) {
      output.writeBool(1, activeOnly_);
    }
    if (withSkills_ != false) {
      output.writeBool(2, withSkills_);
    }
    if (getChannelTypesList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(channelTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < channelTypes_.size(); i++) {
      output.writeEnumNoTag(channelTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (activeOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, activeOnly_);
    }
    if (withSkills_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, withSkills_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < channelTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(channelTypes_.get(i));
      }
      size += dataSize;
      if (!getChannelTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }channelTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq) obj;

    if (getActiveOnly()
        != other.getActiveOnly()) return false;
    if (getWithSkills()
        != other.getWithSkills()) return false;
    if (!channelTypes_.equals(other.channelTypes_)) return false;
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
    hash = (37 * hash) + ACTIVE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActiveOnly());
    hash = (37 * hash) + WITH_SKILLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithSkills());
    if (getChannelTypesCount() > 0) {
      hash = (37 * hash) + CHANNEL_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + channelTypes_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq prototype) {
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
   * Request message for the ListSkillProfiles RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListSkillProfilesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListSkillProfilesReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.newBuilder()
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
      activeOnly_ = false;
      withSkills_ = false;
      channelTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListSkillProfilesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        channelTypes_ = java.util.Collections.unmodifiableList(channelTypes_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.channelTypes_ = channelTypes_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.activeOnly_ = activeOnly_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withSkills_ = withSkills_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq.getDefaultInstance()) return this;
      if (other.getActiveOnly() != false) {
        setActiveOnly(other.getActiveOnly());
      }
      if (other.getWithSkills() != false) {
        setWithSkills(other.getWithSkills());
      }
      if (!other.channelTypes_.isEmpty()) {
        if (channelTypes_.isEmpty()) {
          channelTypes_ = other.channelTypes_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureChannelTypesIsMutable();
          channelTypes_.addAll(other.channelTypes_);
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
            case 8: {
              activeOnly_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              withSkills_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              int tmpRaw = input.readEnum();
              ensureChannelTypesIsMutable();
              channelTypes_.add(tmpRaw);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureChannelTypesIsMutable();
                channelTypes_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private boolean activeOnly_ ;
    /**
     * <pre>
     * If set to true only active skill profiles will be returned, otherwise active and inactive skill profiles will be returned.
     * </pre>
     *
     * <code>bool active_only = 1 [json_name = "activeOnly"];</code>
     * @return The activeOnly.
     */
    @java.lang.Override
    public boolean getActiveOnly() {
      return activeOnly_;
    }
    /**
     * <pre>
     * If set to true only active skill profiles will be returned, otherwise active and inactive skill profiles will be returned.
     * </pre>
     *
     * <code>bool active_only = 1 [json_name = "activeOnly"];</code>
     * @param value The activeOnly to set.
     * @return This builder for chaining.
     */
    public Builder setActiveOnly(boolean value) {

      activeOnly_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true only active skill profiles will be returned, otherwise active and inactive skill profiles will be returned.
     * </pre>
     *
     * <code>bool active_only = 1 [json_name = "activeOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveOnly() {
      bitField0_ = (bitField0_ & ~0x00000001);
      activeOnly_ = false;
      onChanged();
      return this;
    }

    private boolean withSkills_ ;
    /**
     * <pre>
     * If set to true the skills of skill profiles will be returned, otherwise they will not.
     * </pre>
     *
     * <code>bool with_skills = 2 [json_name = "withSkills"];</code>
     * @return The withSkills.
     */
    @java.lang.Override
    public boolean getWithSkills() {
      return withSkills_;
    }
    /**
     * <pre>
     * If set to true the skills of skill profiles will be returned, otherwise they will not.
     * </pre>
     *
     * <code>bool with_skills = 2 [json_name = "withSkills"];</code>
     * @param value The withSkills to set.
     * @return This builder for chaining.
     */
    public Builder setWithSkills(boolean value) {

      withSkills_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true the skills of skill profiles will be returned, otherwise they will not.
     * </pre>
     *
     * <code>bool with_skills = 2 [json_name = "withSkills"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithSkills() {
      bitField0_ = (bitField0_ & ~0x00000002);
      withSkills_ = false;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> channelTypes_ =
      java.util.Collections.emptyList();
    private void ensureChannelTypesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        channelTypes_ = new java.util.ArrayList<java.lang.Integer>(channelTypes_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @return A list containing the channelTypes.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.ChannelType> getChannelTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.ChannelType>(channelTypes_, channelTypes_converter_);
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @return The count of channelTypes.
     */
    public int getChannelTypesCount() {
      return channelTypes_.size();
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param index The index of the element to return.
     * @return The channelTypes at the given index.
     */
    public com.tcn.cloud.api.api.commons.ChannelType getChannelTypes(int index) {
      return channelTypes_converter_.convert(channelTypes_.get(index));
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param index The index to set the value at.
     * @param value The channelTypes to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTypes(
        int index, com.tcn.cloud.api.api.commons.ChannelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChannelTypesIsMutable();
      channelTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param value The channelTypes to add.
     * @return This builder for chaining.
     */
    public Builder addChannelTypes(com.tcn.cloud.api.api.commons.ChannelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChannelTypesIsMutable();
      channelTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param values The channelTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllChannelTypes(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.ChannelType> values) {
      ensureChannelTypesIsMutable();
      for (com.tcn.cloud.api.api.commons.ChannelType value : values) {
        channelTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelTypes() {
      channelTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @return A list containing the enum numeric values on the wire for channelTypes.
     */
    public java.util.List<java.lang.Integer>
    getChannelTypesValueList() {
      return java.util.Collections.unmodifiableList(channelTypes_);
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of channelTypes at the given index.
     */
    public int getChannelTypesValue(int index) {
      return channelTypes_.get(index);
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for channelTypes to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTypesValue(
        int index, int value) {
      ensureChannelTypesIsMutable();
      channelTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param value The enum numeric value on the wire for channelTypes to add.
     * @return This builder for chaining.
     */
    public Builder addChannelTypesValue(int value) {
      ensureChannelTypesIsMutable();
      channelTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, will filter skill profiles by the given channel types.
     * </pre>
     *
     * <code>repeated .api.commons.ChannelType channel_types = 3 [json_name = "channelTypes"];</code>
     * @param values The enum numeric values on the wire for channelTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllChannelTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureChannelTypesIsMutable();
      for (int value : values) {
        channelTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListSkillProfilesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListSkillProfilesReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkillProfilesReq>
      PARSER = new com.google.protobuf.AbstractParser<ListSkillProfilesReq>() {
    @java.lang.Override
    public ListSkillProfilesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSkillProfilesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkillProfilesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListSkillProfilesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

