// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

/**
 * Protobuf type {@code api.v1alpha1.asm.CreateSessionReq}
 */
public final class CreateSessionReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.asm.CreateSessionReq)
    CreateSessionReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSessionReq.newBuilder() to construct.
  private CreateSessionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSessionReq() {
    subsessionType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSessionReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetSkills();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.class, com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.Builder.class);
  }

  public static final int HUNT_GROUP_SID_FIELD_NUMBER = 1;
  private long huntGroupSid_ = 0L;
  /**
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  @java.lang.Override
  public long getHuntGroupSid() {
    return huntGroupSid_;
  }

  public static final int SKILLS_FIELD_NUMBER = 2;
  private static final class SkillsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_SkillsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> skills_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetSkills() {
    if (skills_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SkillsDefaultEntryHolder.defaultEntry);
    }
    return skills_;
  }
  public int getSkillsCount() {
    return internalGetSkills().getMap().size();
  }
  /**
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public boolean containsSkills(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetSkills().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSkillsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getSkills() {
    return getSkillsMap();
  }
  /**
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getSkillsMap() {
    return internalGetSkills().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public long getSkillsOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetSkills().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public long getSkillsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetSkills().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SUBSESSION_TYPE_FIELD_NUMBER = 3;
  private int subsessionType_ = 0;
  /**
   * <pre>
   * we are no longer using the subsession type.
   * </pre>
   *
   * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
   * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
   *     See api/v1alpha1/asm/service.proto;l=132
   * @return The enum numeric value on the wire for subsessionType.
   */
  @java.lang.Override @java.lang.Deprecated public int getSubsessionTypeValue() {
    return subsessionType_;
  }
  /**
   * <pre>
   * we are no longer using the subsession type.
   * </pre>
   *
   * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
   * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
   *     See api/v1alpha1/asm/service.proto;l=132
   * @return The subsessionType.
   */
  @java.lang.Override @java.lang.Deprecated public com.tcn.cloud.api.api.commons.AsmSubsessionType getSubsessionType() {
    com.tcn.cloud.api.api.commons.AsmSubsessionType result = com.tcn.cloud.api.api.commons.AsmSubsessionType.forNumber(subsessionType_);
    return result == null ? com.tcn.cloud.api.api.commons.AsmSubsessionType.UNRECOGNIZED : result;
  }

  public static final int ENABLE_VOICE_FIELD_NUMBER = 4;
  private boolean enableVoice_ = false;
  /**
   * <pre>
   * enabe voice or omni voice.
   * </pre>
   *
   * <code>bool enable_voice = 4 [json_name = "enableVoice"];</code>
   * @return The enableVoice.
   */
  @java.lang.Override
  public boolean getEnableVoice() {
    return enableVoice_;
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
    if (huntGroupSid_ != 0L) {
      output.writeInt64(1, huntGroupSid_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSkills(),
        SkillsDefaultEntryHolder.defaultEntry,
        2);
    if (subsessionType_ != com.tcn.cloud.api.api.commons.AsmSubsessionType.VOICE.getNumber()) {
      output.writeEnum(3, subsessionType_);
    }
    if (enableVoice_ != false) {
      output.writeBool(4, enableVoice_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (huntGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, huntGroupSid_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetSkills().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      skills__ = SkillsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, skills__);
    }
    if (subsessionType_ != com.tcn.cloud.api.api.commons.AsmSubsessionType.VOICE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, subsessionType_);
    }
    if (enableVoice_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, enableVoice_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq other = (com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq) obj;

    if (getHuntGroupSid()
        != other.getHuntGroupSid()) return false;
    if (!internalGetSkills().equals(
        other.internalGetSkills())) return false;
    if (subsessionType_ != other.subsessionType_) return false;
    if (getEnableVoice()
        != other.getEnableVoice()) return false;
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
    hash = (37 * hash) + HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHuntGroupSid());
    if (!internalGetSkills().getMap().isEmpty()) {
      hash = (37 * hash) + SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSkills().hashCode();
    }
    hash = (37 * hash) + SUBSESSION_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + subsessionType_;
    hash = (37 * hash) + ENABLE_VOICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableVoice());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.asm.CreateSessionReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.asm.CreateSessionReq)
      com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetSkills();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableSkills();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.class, com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.newBuilder()
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
      huntGroupSid_ = 0L;
      internalGetMutableSkills().clear();
      subsessionType_ = 0;
      enableVoice_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_CreateSessionReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq build() {
      com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq result = new com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.huntGroupSid_ = huntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skills_ = internalGetSkills();
        result.skills_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subsessionType_ = subsessionType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.enableVoice_ = enableVoice_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq.getDefaultInstance()) return this;
      if (other.getHuntGroupSid() != 0L) {
        setHuntGroupSid(other.getHuntGroupSid());
      }
      internalGetMutableSkills().mergeFrom(
          other.internalGetSkills());
      bitField0_ |= 0x00000002;
      if (other.subsessionType_ != 0) {
        setSubsessionTypeValue(other.getSubsessionTypeValue());
      }
      if (other.getEnableVoice() != false) {
        setEnableVoice(other.getEnableVoice());
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
              huntGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              skills__ = input.readMessage(
                  SkillsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSkills().getMutableMap().put(
                  skills__.getKey(), skills__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              subsessionType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              enableVoice_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long huntGroupSid_ ;
    /**
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @return The huntGroupSid.
     */
    @java.lang.Override
    public long getHuntGroupSid() {
      return huntGroupSid_;
    }
    /**
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @param value The huntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupSid(long value) {

      huntGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHuntGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      huntGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> skills_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetSkills() {
      if (skills_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SkillsDefaultEntryHolder.defaultEntry);
      }
      return skills_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableSkills() {
      if (skills_ == null) {
        skills_ = com.google.protobuf.MapField.newMapField(
            SkillsDefaultEntryHolder.defaultEntry);
      }
      if (!skills_.isMutable()) {
        skills_ = skills_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return skills_;
    }
    public int getSkillsCount() {
      return internalGetSkills().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    @java.lang.Override
    public boolean containsSkills(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetSkills().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSkillsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getSkills() {
      return getSkillsMap();
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getSkillsMap() {
      return internalGetSkills().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    @java.lang.Override
    public long getSkillsOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetSkills().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    @java.lang.Override
    public long getSkillsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetSkills().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearSkills() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableSkills().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    public Builder removeSkills(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableSkills().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
        getMutableSkills() {
      bitField0_ |= 0x00000002;
      return internalGetMutableSkills().getMutableMap();
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    public Builder putSkills(
        java.lang.String key,
        long value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableSkills().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
     */
    public Builder putAllSkills(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableSkills().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    private int subsessionType_ = 0;
    /**
     * <pre>
     * we are no longer using the subsession type.
     * </pre>
     *
     * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
     * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
     *     See api/v1alpha1/asm/service.proto;l=132
     * @return The enum numeric value on the wire for subsessionType.
     */
    @java.lang.Override @java.lang.Deprecated public int getSubsessionTypeValue() {
      return subsessionType_;
    }
    /**
     * <pre>
     * we are no longer using the subsession type.
     * </pre>
     *
     * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
     * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
     *     See api/v1alpha1/asm/service.proto;l=132
     * @param value The enum numeric value on the wire for subsessionType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSubsessionTypeValue(int value) {
      subsessionType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * we are no longer using the subsession type.
     * </pre>
     *
     * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
     * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
     *     See api/v1alpha1/asm/service.proto;l=132
     * @return The subsessionType.
     */
    @java.lang.Override
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.AsmSubsessionType getSubsessionType() {
      com.tcn.cloud.api.api.commons.AsmSubsessionType result = com.tcn.cloud.api.api.commons.AsmSubsessionType.forNumber(subsessionType_);
      return result == null ? com.tcn.cloud.api.api.commons.AsmSubsessionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * we are no longer using the subsession type.
     * </pre>
     *
     * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
     * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
     *     See api/v1alpha1/asm/service.proto;l=132
     * @param value The subsessionType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSubsessionType(com.tcn.cloud.api.api.commons.AsmSubsessionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      subsessionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * we are no longer using the subsession type.
     * </pre>
     *
     * <code>.api.commons.AsmSubsessionType subsession_type = 3 [json_name = "subsessionType", deprecated = true];</code>
     * @deprecated api.v1alpha1.asm.CreateSessionReq.subsession_type is deprecated.
     *     See api/v1alpha1/asm/service.proto;l=132
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearSubsessionType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      subsessionType_ = 0;
      onChanged();
      return this;
    }

    private boolean enableVoice_ ;
    /**
     * <pre>
     * enabe voice or omni voice.
     * </pre>
     *
     * <code>bool enable_voice = 4 [json_name = "enableVoice"];</code>
     * @return The enableVoice.
     */
    @java.lang.Override
    public boolean getEnableVoice() {
      return enableVoice_;
    }
    /**
     * <pre>
     * enabe voice or omni voice.
     * </pre>
     *
     * <code>bool enable_voice = 4 [json_name = "enableVoice"];</code>
     * @param value The enableVoice to set.
     * @return This builder for chaining.
     */
    public Builder setEnableVoice(boolean value) {

      enableVoice_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * enabe voice or omni voice.
     * </pre>
     *
     * <code>bool enable_voice = 4 [json_name = "enableVoice"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableVoice() {
      bitField0_ = (bitField0_ & ~0x00000008);
      enableVoice_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.asm.CreateSessionReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.asm.CreateSessionReq)
  private static final com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSessionReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateSessionReq>() {
    @java.lang.Override
    public CreateSessionReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSessionReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSessionReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.CreateSessionReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

