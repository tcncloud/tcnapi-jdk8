// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

/**
 * <pre>
 * Request message for the RemoveSkillFromAllGroups rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest}
 */
public final class RemoveSkillFromAllGroupsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)
    RemoveSkillFromAllGroupsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveSkillFromAllGroupsRequest.newBuilder() to construct.
  private RemoveSkillFromAllGroupsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveSkillFromAllGroupsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveSkillFromAllGroupsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RemoveSkillFromAllGroupsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RemoveSkillFromAllGroupsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.Builder.class);
  }

  public static final int SKILL_SID_FIELD_NUMBER = 1;
  private long skillSid_ = 0L;
  /**
   * <pre>
   * The skill sid of the skill to remove.
   * </pre>
   *
   * <code>int64 skill_sid = 1 [json_name = "skillSid"];</code>
   * @return The skillSid.
   */
  @java.lang.Override
  public long getSkillSid() {
    return skillSid_;
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
    if (skillSid_ != 0L) {
      output.writeInt64(1, skillSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, skillSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest) obj;

    if (getSkillSid()
        != other.getSkillSid()) return false;
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
    hash = (37 * hash) + SKILL_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkillSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest prototype) {
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
   * Request message for the RemoveSkillFromAllGroups rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RemoveSkillFromAllGroupsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RemoveSkillFromAllGroupsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.newBuilder()
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
      skillSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.internal_static_api_v1alpha1_org_skills_RemoveSkillFromAllGroupsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillSid_ = skillSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest.getDefaultInstance()) return this;
      if (other.getSkillSid() != 0L) {
        setSkillSid(other.getSkillSid());
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
              skillSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long skillSid_ ;
    /**
     * <pre>
     * The skill sid of the skill to remove.
     * </pre>
     *
     * <code>int64 skill_sid = 1 [json_name = "skillSid"];</code>
     * @return The skillSid.
     */
    @java.lang.Override
    public long getSkillSid() {
      return skillSid_;
    }
    /**
     * <pre>
     * The skill sid of the skill to remove.
     * </pre>
     *
     * <code>int64 skill_sid = 1 [json_name = "skillSid"];</code>
     * @param value The skillSid to set.
     * @return This builder for chaining.
     */
    public Builder setSkillSid(long value) {

      skillSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The skill sid of the skill to remove.
     * </pre>
     *
     * <code>int64 skill_sid = 1 [json_name = "skillSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      skillSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveSkillFromAllGroupsRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveSkillFromAllGroupsRequest>() {
    @java.lang.Override
    public RemoveSkillFromAllGroupsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveSkillFromAllGroupsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveSkillFromAllGroupsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.skills.RemoveSkillFromAllGroupsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

