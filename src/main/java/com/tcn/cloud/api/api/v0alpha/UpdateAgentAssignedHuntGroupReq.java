// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateAgentAssignedHuntGroupReq}
 */
public final class UpdateAgentAssignedHuntGroupReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateAgentAssignedHuntGroupReq)
    UpdateAgentAssignedHuntGroupReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAgentAssignedHuntGroupReq.newBuilder() to construct.
  private UpdateAgentAssignedHuntGroupReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAgentAssignedHuntGroupReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAgentAssignedHuntGroupReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetSkills();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.class, com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.Builder.class);
  }

  public static final int HUNT_GROUP_SID_FIELD_NUMBER = 3;
  private long huntGroupSid_ = 0L;
  /**
   * <code>int64 hunt_group_sid = 3 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  @java.lang.Override
  public long getHuntGroupSid() {
    return huntGroupSid_;
  }

  public static final int SKILLS_FIELD_NUMBER = 4;
  private static final class SkillsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_SkillsEntry_descriptor, 
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
   * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
   * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getSkillsMap() {
    return internalGetSkills().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
   * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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

  public static final int REPLACE_SKILLS_FIELD_NUMBER = 5;
  private boolean replaceSkills_ = false;
  /**
   * <code>bool replace_skills = 5 [json_name = "replaceSkills"];</code>
   * @return The replaceSkills.
   */
  @java.lang.Override
  public boolean getReplaceSkills() {
    return replaceSkills_;
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
      output.writeInt64(3, huntGroupSid_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSkills(),
        SkillsDefaultEntryHolder.defaultEntry,
        4);
    if (replaceSkills_ != false) {
      output.writeBool(5, replaceSkills_);
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
        .computeInt64Size(3, huntGroupSid_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetSkills().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      skills__ = SkillsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, skills__);
    }
    if (replaceSkills_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, replaceSkills_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq other = (com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq) obj;

    if (getHuntGroupSid()
        != other.getHuntGroupSid()) return false;
    if (!internalGetSkills().equals(
        other.internalGetSkills())) return false;
    if (getReplaceSkills()
        != other.getReplaceSkills()) return false;
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
    hash = (37 * hash) + REPLACE_SKILLS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReplaceSkills());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateAgentAssignedHuntGroupReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateAgentAssignedHuntGroupReq)
      com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
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
        case 4:
          return internalGetMutableSkills();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.class, com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.newBuilder()
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
      replaceSkills_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_UpdateAgentAssignedHuntGroupReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq result = new com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.huntGroupSid_ = huntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skills_ = internalGetSkills();
        result.skills_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.replaceSkills_ = replaceSkills_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq.getDefaultInstance()) return this;
      if (other.getHuntGroupSid() != 0L) {
        setHuntGroupSid(other.getHuntGroupSid());
      }
      internalGetMutableSkills().mergeFrom(
          other.internalGetSkills());
      bitField0_ |= 0x00000002;
      if (other.getReplaceSkills() != false) {
        setReplaceSkills(other.getReplaceSkills());
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
            case 24: {
              huntGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 34: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              skills__ = input.readMessage(
                  SkillsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSkills().getMutableMap().put(
                  skills__.getKey(), skills__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 40: {
              replaceSkills_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
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
     * <code>int64 hunt_group_sid = 3 [json_name = "huntGroupSid"];</code>
     * @return The huntGroupSid.
     */
    @java.lang.Override
    public long getHuntGroupSid() {
      return huntGroupSid_;
    }
    /**
     * <code>int64 hunt_group_sid = 3 [json_name = "huntGroupSid"];</code>
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
     * <code>int64 hunt_group_sid = 3 [json_name = "huntGroupSid"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getSkillsMap() {
      return internalGetSkills().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
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
     * <code>map&lt;string, int64&gt; skills = 4 [json_name = "skills"];</code>
     */
    public Builder putAllSkills(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableSkills().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    private boolean replaceSkills_ ;
    /**
     * <code>bool replace_skills = 5 [json_name = "replaceSkills"];</code>
     * @return The replaceSkills.
     */
    @java.lang.Override
    public boolean getReplaceSkills() {
      return replaceSkills_;
    }
    /**
     * <code>bool replace_skills = 5 [json_name = "replaceSkills"];</code>
     * @param value The replaceSkills to set.
     * @return This builder for chaining.
     */
    public Builder setReplaceSkills(boolean value) {

      replaceSkills_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool replace_skills = 5 [json_name = "replaceSkills"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReplaceSkills() {
      bitField0_ = (bitField0_ & ~0x00000004);
      replaceSkills_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateAgentAssignedHuntGroupReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateAgentAssignedHuntGroupReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAgentAssignedHuntGroupReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAgentAssignedHuntGroupReq>() {
    @java.lang.Override
    public UpdateAgentAssignedHuntGroupReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAgentAssignedHuntGroupReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAgentAssignedHuntGroupReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateAgentAssignedHuntGroupReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

