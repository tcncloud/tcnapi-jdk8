// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * TaskConfig -
 * </pre>
 *
 * Protobuf type {@code api.commons.OmniTaskConfig}
 */
public final class OmniTaskConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.OmniTaskConfig)
    OmniTaskConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmniTaskConfig.newBuilder() to construct.
  private OmniTaskConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmniTaskConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmniTaskConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniTaskConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniTaskConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.OmniTaskConfig.class, com.tcn.cloud.api.api.commons.OmniTaskConfig.Builder.class);
  }

  public static final int SKILLS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniConversationSkills skills_;
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  @java.lang.Override
  public boolean hasSkills() {
    return skills_ != null;
  }
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   * @return The skills.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills() {
    return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
  }
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder() {
    return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
  }

  public static final int ABSOLUTE_TIMEOUT_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration absoluteTimeoutDuration_;
  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   * @return Whether the absoluteTimeoutDuration field is set.
   */
  @java.lang.Override
  public boolean hasAbsoluteTimeoutDuration() {
    return absoluteTimeoutDuration_ != null;
  }
  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   * @return The absoluteTimeoutDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getAbsoluteTimeoutDuration() {
    return absoluteTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : absoluteTimeoutDuration_;
  }
  /**
   * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getAbsoluteTimeoutDurationOrBuilder() {
    return absoluteTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : absoluteTimeoutDuration_;
  }

  public static final int AGENT_TIMEOUT_DURATION_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration agentTimeoutDuration_;
  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   * @return Whether the agentTimeoutDuration field is set.
   */
  @java.lang.Override
  public boolean hasAgentTimeoutDuration() {
    return agentTimeoutDuration_ != null;
  }
  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   * @return The agentTimeoutDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getAgentTimeoutDuration() {
    return agentTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : agentTimeoutDuration_;
  }
  /**
   * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getAgentTimeoutDurationOrBuilder() {
    return agentTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : agentTimeoutDuration_;
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
    if (skills_ != null) {
      output.writeMessage(1, getSkills());
    }
    if (absoluteTimeoutDuration_ != null) {
      output.writeMessage(2, getAbsoluteTimeoutDuration());
    }
    if (agentTimeoutDuration_ != null) {
      output.writeMessage(3, getAgentTimeoutDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skills_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSkills());
    }
    if (absoluteTimeoutDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAbsoluteTimeoutDuration());
    }
    if (agentTimeoutDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAgentTimeoutDuration());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.OmniTaskConfig)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.OmniTaskConfig other = (com.tcn.cloud.api.api.commons.OmniTaskConfig) obj;

    if (hasSkills() != other.hasSkills()) return false;
    if (hasSkills()) {
      if (!getSkills()
          .equals(other.getSkills())) return false;
    }
    if (hasAbsoluteTimeoutDuration() != other.hasAbsoluteTimeoutDuration()) return false;
    if (hasAbsoluteTimeoutDuration()) {
      if (!getAbsoluteTimeoutDuration()
          .equals(other.getAbsoluteTimeoutDuration())) return false;
    }
    if (hasAgentTimeoutDuration() != other.hasAgentTimeoutDuration()) return false;
    if (hasAgentTimeoutDuration()) {
      if (!getAgentTimeoutDuration()
          .equals(other.getAgentTimeoutDuration())) return false;
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
    if (hasSkills()) {
      hash = (37 * hash) + SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getSkills().hashCode();
    }
    if (hasAbsoluteTimeoutDuration()) {
      hash = (37 * hash) + ABSOLUTE_TIMEOUT_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getAbsoluteTimeoutDuration().hashCode();
    }
    if (hasAgentTimeoutDuration()) {
      hash = (37 * hash) + AGENT_TIMEOUT_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getAgentTimeoutDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.OmniTaskConfig parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.OmniTaskConfig prototype) {
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
   * TaskConfig -
   * </pre>
   *
   * Protobuf type {@code api.commons.OmniTaskConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.OmniTaskConfig)
      com.tcn.cloud.api.api.commons.OmniTaskConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniTaskConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniTaskConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.OmniTaskConfig.class, com.tcn.cloud.api.api.commons.OmniTaskConfig.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.OmniTaskConfig.newBuilder()
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
      skills_ = null;
      if (skillsBuilder_ != null) {
        skillsBuilder_.dispose();
        skillsBuilder_ = null;
      }
      absoluteTimeoutDuration_ = null;
      if (absoluteTimeoutDurationBuilder_ != null) {
        absoluteTimeoutDurationBuilder_.dispose();
        absoluteTimeoutDurationBuilder_ = null;
      }
      agentTimeoutDuration_ = null;
      if (agentTimeoutDurationBuilder_ != null) {
        agentTimeoutDurationBuilder_.dispose();
        agentTimeoutDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.OmnichannelProto.internal_static_api_commons_OmniTaskConfig_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniTaskConfig getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.OmniTaskConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniTaskConfig build() {
      com.tcn.cloud.api.api.commons.OmniTaskConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniTaskConfig buildPartial() {
      com.tcn.cloud.api.api.commons.OmniTaskConfig result = new com.tcn.cloud.api.api.commons.OmniTaskConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.OmniTaskConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skills_ = skillsBuilder_ == null
            ? skills_
            : skillsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.absoluteTimeoutDuration_ = absoluteTimeoutDurationBuilder_ == null
            ? absoluteTimeoutDuration_
            : absoluteTimeoutDurationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.agentTimeoutDuration_ = agentTimeoutDurationBuilder_ == null
            ? agentTimeoutDuration_
            : agentTimeoutDurationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.OmniTaskConfig) {
        return mergeFrom((com.tcn.cloud.api.api.commons.OmniTaskConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.OmniTaskConfig other) {
      if (other == com.tcn.cloud.api.api.commons.OmniTaskConfig.getDefaultInstance()) return this;
      if (other.hasSkills()) {
        mergeSkills(other.getSkills());
      }
      if (other.hasAbsoluteTimeoutDuration()) {
        mergeAbsoluteTimeoutDuration(other.getAbsoluteTimeoutDuration());
      }
      if (other.hasAgentTimeoutDuration()) {
        mergeAgentTimeoutDuration(other.getAgentTimeoutDuration());
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
                  getSkillsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAbsoluteTimeoutDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAgentTimeoutDurationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private com.tcn.cloud.api.api.commons.OmniConversationSkills skills_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversationSkills, com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder, com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder> skillsBuilder_;
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     * @return Whether the skills field is set.
     */
    public boolean hasSkills() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     * @return The skills.
     */
    public com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills() {
      if (skillsBuilder_ == null) {
        return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
      } else {
        return skillsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public Builder setSkills(com.tcn.cloud.api.api.commons.OmniConversationSkills value) {
      if (skillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skills_ = value;
      } else {
        skillsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public Builder setSkills(
        com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder builderForValue) {
      if (skillsBuilder_ == null) {
        skills_ = builderForValue.build();
      } else {
        skillsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public Builder mergeSkills(com.tcn.cloud.api.api.commons.OmniConversationSkills value) {
      if (skillsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          skills_ != null &&
          skills_ != com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance()) {
          getSkillsBuilder().mergeFrom(value);
        } else {
          skills_ = value;
        }
      } else {
        skillsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public Builder clearSkills() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skills_ = null;
      if (skillsBuilder_ != null) {
        skillsBuilder_.dispose();
        skillsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder getSkillsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSkillsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder() {
      if (skillsBuilder_ != null) {
        return skillsBuilder_.getMessageOrBuilder();
      } else {
        return skills_ == null ?
            com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
      }
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversationSkills, com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder, com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder> 
        getSkillsFieldBuilder() {
      if (skillsBuilder_ == null) {
        skillsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniConversationSkills, com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder, com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder>(
                getSkills(),
                getParentForChildren(),
                isClean());
        skills_ = null;
      }
      return skillsBuilder_;
    }

    private com.google.protobuf.Duration absoluteTimeoutDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> absoluteTimeoutDurationBuilder_;
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     * @return Whether the absoluteTimeoutDuration field is set.
     */
    public boolean hasAbsoluteTimeoutDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     * @return The absoluteTimeoutDuration.
     */
    public com.google.protobuf.Duration getAbsoluteTimeoutDuration() {
      if (absoluteTimeoutDurationBuilder_ == null) {
        return absoluteTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : absoluteTimeoutDuration_;
      } else {
        return absoluteTimeoutDurationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public Builder setAbsoluteTimeoutDuration(com.google.protobuf.Duration value) {
      if (absoluteTimeoutDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        absoluteTimeoutDuration_ = value;
      } else {
        absoluteTimeoutDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public Builder setAbsoluteTimeoutDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (absoluteTimeoutDurationBuilder_ == null) {
        absoluteTimeoutDuration_ = builderForValue.build();
      } else {
        absoluteTimeoutDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public Builder mergeAbsoluteTimeoutDuration(com.google.protobuf.Duration value) {
      if (absoluteTimeoutDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          absoluteTimeoutDuration_ != null &&
          absoluteTimeoutDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getAbsoluteTimeoutDurationBuilder().mergeFrom(value);
        } else {
          absoluteTimeoutDuration_ = value;
        }
      } else {
        absoluteTimeoutDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public Builder clearAbsoluteTimeoutDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      absoluteTimeoutDuration_ = null;
      if (absoluteTimeoutDurationBuilder_ != null) {
        absoluteTimeoutDurationBuilder_.dispose();
        absoluteTimeoutDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public com.google.protobuf.Duration.Builder getAbsoluteTimeoutDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAbsoluteTimeoutDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    public com.google.protobuf.DurationOrBuilder getAbsoluteTimeoutDurationOrBuilder() {
      if (absoluteTimeoutDurationBuilder_ != null) {
        return absoluteTimeoutDurationBuilder_.getMessageOrBuilder();
      } else {
        return absoluteTimeoutDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : absoluteTimeoutDuration_;
      }
    }
    /**
     * <code>.google.protobuf.Duration absolute_timeout_duration = 2 [json_name = "absoluteTimeoutDuration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getAbsoluteTimeoutDurationFieldBuilder() {
      if (absoluteTimeoutDurationBuilder_ == null) {
        absoluteTimeoutDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getAbsoluteTimeoutDuration(),
                getParentForChildren(),
                isClean());
        absoluteTimeoutDuration_ = null;
      }
      return absoluteTimeoutDurationBuilder_;
    }

    private com.google.protobuf.Duration agentTimeoutDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> agentTimeoutDurationBuilder_;
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     * @return Whether the agentTimeoutDuration field is set.
     */
    public boolean hasAgentTimeoutDuration() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     * @return The agentTimeoutDuration.
     */
    public com.google.protobuf.Duration getAgentTimeoutDuration() {
      if (agentTimeoutDurationBuilder_ == null) {
        return agentTimeoutDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : agentTimeoutDuration_;
      } else {
        return agentTimeoutDurationBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public Builder setAgentTimeoutDuration(com.google.protobuf.Duration value) {
      if (agentTimeoutDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentTimeoutDuration_ = value;
      } else {
        agentTimeoutDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public Builder setAgentTimeoutDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (agentTimeoutDurationBuilder_ == null) {
        agentTimeoutDuration_ = builderForValue.build();
      } else {
        agentTimeoutDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public Builder mergeAgentTimeoutDuration(com.google.protobuf.Duration value) {
      if (agentTimeoutDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          agentTimeoutDuration_ != null &&
          agentTimeoutDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getAgentTimeoutDurationBuilder().mergeFrom(value);
        } else {
          agentTimeoutDuration_ = value;
        }
      } else {
        agentTimeoutDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public Builder clearAgentTimeoutDuration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      agentTimeoutDuration_ = null;
      if (agentTimeoutDurationBuilder_ != null) {
        agentTimeoutDurationBuilder_.dispose();
        agentTimeoutDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public com.google.protobuf.Duration.Builder getAgentTimeoutDurationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAgentTimeoutDurationFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    public com.google.protobuf.DurationOrBuilder getAgentTimeoutDurationOrBuilder() {
      if (agentTimeoutDurationBuilder_ != null) {
        return agentTimeoutDurationBuilder_.getMessageOrBuilder();
      } else {
        return agentTimeoutDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : agentTimeoutDuration_;
      }
    }
    /**
     * <code>.google.protobuf.Duration agent_timeout_duration = 3 [json_name = "agentTimeoutDuration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getAgentTimeoutDurationFieldBuilder() {
      if (agentTimeoutDurationBuilder_ == null) {
        agentTimeoutDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getAgentTimeoutDuration(),
                getParentForChildren(),
                isClean());
        agentTimeoutDuration_ = null;
      }
      return agentTimeoutDurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.OmniTaskConfig)
  }

  // @@protoc_insertion_point(class_scope:api.commons.OmniTaskConfig)
  private static final com.tcn.cloud.api.api.commons.OmniTaskConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.OmniTaskConfig();
  }

  public static com.tcn.cloud.api.api.commons.OmniTaskConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmniTaskConfig>
      PARSER = new com.google.protobuf.AbstractParser<OmniTaskConfig>() {
    @java.lang.Override
    public OmniTaskConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmniTaskConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmniTaskConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniTaskConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
