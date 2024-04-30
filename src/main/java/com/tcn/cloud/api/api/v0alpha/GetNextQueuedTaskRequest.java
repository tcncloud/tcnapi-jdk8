// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetNextQueuedTaskRequest}
 */
public final class GetNextQueuedTaskRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetNextQueuedTaskRequest)
    GetNextQueuedTaskRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNextQueuedTaskRequest.newBuilder() to construct.
  private GetNextQueuedTaskRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNextQueuedTaskRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetNextQueuedTaskRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetAgentSkills();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.class, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.Builder.class);
  }

  public static final int SKILLS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.OmniConversationSkills skills_;
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1616
   * @return Whether the skills field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasSkills() {
    return skills_ != null;
  }
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1616
   * @return The skills.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills() {
    return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
  }
  /**
   * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder() {
    return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
  }

  public static final int AGENT_SKILLS_FIELD_NUMBER = 2;
  private static final class AgentSkillsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_AgentSkillsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> agentSkills_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetAgentSkills() {
    if (agentSkills_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AgentSkillsDefaultEntryHolder.defaultEntry);
    }
    return agentSkills_;
  }
  public int getAgentSkillsCount() {
    return internalGetAgentSkills().getMap().size();
  }
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  @java.lang.Override
  public boolean containsAgentSkills(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetAgentSkills().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAgentSkillsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getAgentSkills() {
    return getAgentSkillsMap();
  }
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.Long> getAgentSkillsMap() {
    return internalGetAgentSkills().getMap();
  }
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  @java.lang.Override
  public long getAgentSkillsOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAgentSkills().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
   */
  @java.lang.Override
  public long getAgentSkillsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAgentSkills().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAgentSkills(),
        AgentSkillsDefaultEntryHolder.defaultEntry,
        2);
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
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetAgentSkills().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      agentSkills__ = AgentSkillsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, agentSkills__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest other = (com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest) obj;

    if (hasSkills() != other.hasSkills()) return false;
    if (hasSkills()) {
      if (!getSkills()
          .equals(other.getSkills())) return false;
    }
    if (!internalGetAgentSkills().equals(
        other.internalGetAgentSkills())) return false;
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
    if (!internalGetAgentSkills().getMap().isEmpty()) {
      hash = (37 * hash) + AGENT_SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAgentSkills().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest prototype) {
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
   * Protobuf type {@code api.v0alpha.GetNextQueuedTaskRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetNextQueuedTaskRequest)
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetAgentSkills();
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
          return internalGetMutableAgentSkills();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.class, com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.newBuilder()
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
      internalGetMutableAgentSkills().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetNextQueuedTaskRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest build() {
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest result = new com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skills_ = skillsBuilder_ == null
            ? skills_
            : skillsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agentSkills_ = internalGetAgentSkills();
        result.agentSkills_.makeImmutable();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest.getDefaultInstance()) return this;
      if (other.hasSkills()) {
        mergeSkills(other.getSkills());
      }
      internalGetMutableAgentSkills().mergeFrom(
          other.internalGetAgentSkills());
      bitField0_ |= 0x00000002;
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
              agentSkills__ = input.readMessage(
                  AgentSkillsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableAgentSkills().getMutableMap().put(
                  agentSkills__.getKey(), agentSkills__.getValue());
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

    private com.tcn.cloud.api.api.commons.OmniConversationSkills skills_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniConversationSkills, com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder, com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder> skillsBuilder_;
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
     *     See api/v0alpha/omniapi.proto;l=1616
     * @return Whether the skills field is set.
     */
    @java.lang.Deprecated public boolean hasSkills() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     * @deprecated api.v0alpha.GetNextQueuedTaskRequest.skills is deprecated.
     *     See api/v0alpha/omniapi.proto;l=1616
     * @return The skills.
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.OmniConversationSkills getSkills() {
      if (skillsBuilder_ == null) {
        return skills_ == null ? com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
      } else {
        return skillsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setSkills(com.tcn.cloud.api.api.commons.OmniConversationSkills value) {
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
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setSkills(
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
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeSkills(com.tcn.cloud.api.api.commons.OmniConversationSkills value) {
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
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearSkills() {
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
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.OmniConversationSkills.Builder getSkillsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSkillsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.OmniConversationSkillsOrBuilder getSkillsOrBuilder() {
      if (skillsBuilder_ != null) {
        return skillsBuilder_.getMessageOrBuilder();
      } else {
        return skills_ == null ?
            com.tcn.cloud.api.api.commons.OmniConversationSkills.getDefaultInstance() : skills_;
      }
    }
    /**
     * <code>.api.commons.OmniConversationSkills skills = 1 [json_name = "skills", deprecated = true];</code>
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> agentSkills_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetAgentSkills() {
      if (agentSkills_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AgentSkillsDefaultEntryHolder.defaultEntry);
      }
      return agentSkills_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
        internalGetMutableAgentSkills() {
      if (agentSkills_ == null) {
        agentSkills_ = com.google.protobuf.MapField.newMapField(
            AgentSkillsDefaultEntryHolder.defaultEntry);
      }
      if (!agentSkills_.isMutable()) {
        agentSkills_ = agentSkills_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return agentSkills_;
    }
    public int getAgentSkillsCount() {
      return internalGetAgentSkills().getMap().size();
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    @java.lang.Override
    public boolean containsAgentSkills(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAgentSkills().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAgentSkillsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getAgentSkills() {
      return getAgentSkillsMap();
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Long> getAgentSkillsMap() {
      return internalGetAgentSkills().getMap();
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    @java.lang.Override
    public long getAgentSkillsOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAgentSkills().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    @java.lang.Override
    public long getAgentSkillsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAgentSkills().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearAgentSkills() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableAgentSkills().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    public Builder removeAgentSkills(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableAgentSkills().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
        getMutableAgentSkills() {
      bitField0_ |= 0x00000002;
      return internalGetMutableAgentSkills().getMutableMap();
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    public Builder putAgentSkills(
        java.lang.String key,
        long value) {
      if (key == null) { throw new NullPointerException("map key"); }

      internalGetMutableAgentSkills().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, int64&gt; agent_skills = 2 [json_name = "agentSkills"];</code>
     */
    public Builder putAllAgentSkills(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableAgentSkills().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetNextQueuedTaskRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetNextQueuedTaskRequest)
  private static final com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNextQueuedTaskRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetNextQueuedTaskRequest>() {
    @java.lang.Override
    public GetNextQueuedTaskRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetNextQueuedTaskRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNextQueuedTaskRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetNextQueuedTaskRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

