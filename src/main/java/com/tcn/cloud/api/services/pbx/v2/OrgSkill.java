// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

/**
 * Protobuf type {@code services.pbx.v2.OrgSkill}
 */
public final class OrgSkill extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v2.OrgSkill)
    OrgSkillOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrgSkill.newBuilder() to construct.
  private OrgSkill(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrgSkill() {
    skillSid_ = "";
    skillName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrgSkill();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgSkill_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgSkill_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v2.OrgSkill.class, com.tcn.cloud.api.services.pbx.v2.OrgSkill.Builder.class);
  }

  public static final int SKILL_SID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object skillSid_ = "";
  /**
   * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
   * @return The skillSid.
   */
  @java.lang.Override
  public java.lang.String getSkillSid() {
    java.lang.Object ref = skillSid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillSid_ = s;
      return s;
    }
  }
  /**
   * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
   * @return The bytes for skillSid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkillSidBytes() {
    java.lang.Object ref = skillSid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillSid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKILL_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object skillName_ = "";
  /**
   * <code>string skill_name = 2 [json_name = "skillName"];</code>
   * @return The skillName.
   */
  @java.lang.Override
  public java.lang.String getSkillName() {
    java.lang.Object ref = skillName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillName_ = s;
      return s;
    }
  }
  /**
   * <code>string skill_name = 2 [json_name = "skillName"];</code>
   * @return The bytes for skillName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkillNameBytes() {
    java.lang.Object ref = skillName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillSid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, skillSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, skillName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillSid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, skillSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skillName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, skillName_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v2.OrgSkill)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v2.OrgSkill other = (com.tcn.cloud.api.services.pbx.v2.OrgSkill) obj;

    if (!getSkillSid()
        .equals(other.getSkillSid())) return false;
    if (!getSkillName()
        .equals(other.getSkillName())) return false;
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
    hash = (53 * hash) + getSkillSid().hashCode();
    hash = (37 * hash) + SKILL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSkillName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v2.OrgSkill prototype) {
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
   * Protobuf type {@code services.pbx.v2.OrgSkill}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v2.OrgSkill)
      com.tcn.cloud.api.services.pbx.v2.OrgSkillOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgSkill_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgSkill_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v2.OrgSkill.class, com.tcn.cloud.api.services.pbx.v2.OrgSkill.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v2.OrgSkill.newBuilder()
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
      skillSid_ = "";
      skillName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgSkill_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgSkill getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v2.OrgSkill.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgSkill build() {
      com.tcn.cloud.api.services.pbx.v2.OrgSkill result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgSkill buildPartial() {
      com.tcn.cloud.api.services.pbx.v2.OrgSkill result = new com.tcn.cloud.api.services.pbx.v2.OrgSkill(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v2.OrgSkill result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillSid_ = skillSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skillName_ = skillName_;
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v2.OrgSkill) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v2.OrgSkill)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v2.OrgSkill other) {
      if (other == com.tcn.cloud.api.services.pbx.v2.OrgSkill.getDefaultInstance()) return this;
      if (!other.getSkillSid().isEmpty()) {
        skillSid_ = other.skillSid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSkillName().isEmpty()) {
        skillName_ = other.skillName_;
        bitField0_ |= 0x00000002;
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
              skillSid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              skillName_ = input.readStringRequireUtf8();
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

    private java.lang.Object skillSid_ = "";
    /**
     * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
     * @return The skillSid.
     */
    public java.lang.String getSkillSid() {
      java.lang.Object ref = skillSid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillSid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
     * @return The bytes for skillSid.
     */
    public com.google.protobuf.ByteString
        getSkillSidBytes() {
      java.lang.Object ref = skillSid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillSid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
     * @param value The skillSid to set.
     * @return This builder for chaining.
     */
    public Builder setSkillSid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      skillSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillSid() {
      skillSid_ = getDefaultInstance().getSkillSid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string skill_sid = 1 [json_name = "skillSid"];</code>
     * @param value The bytes for skillSid to set.
     * @return This builder for chaining.
     */
    public Builder setSkillSidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      skillSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object skillName_ = "";
    /**
     * <code>string skill_name = 2 [json_name = "skillName"];</code>
     * @return The skillName.
     */
    public java.lang.String getSkillName() {
      java.lang.Object ref = skillName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string skill_name = 2 [json_name = "skillName"];</code>
     * @return The bytes for skillName.
     */
    public com.google.protobuf.ByteString
        getSkillNameBytes() {
      java.lang.Object ref = skillName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string skill_name = 2 [json_name = "skillName"];</code>
     * @param value The skillName to set.
     * @return This builder for chaining.
     */
    public Builder setSkillName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      skillName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string skill_name = 2 [json_name = "skillName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillName() {
      skillName_ = getDefaultInstance().getSkillName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string skill_name = 2 [json_name = "skillName"];</code>
     * @param value The bytes for skillName to set.
     * @return This builder for chaining.
     */
    public Builder setSkillNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      skillName_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v2.OrgSkill)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v2.OrgSkill)
  private static final com.tcn.cloud.api.services.pbx.v2.OrgSkill DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v2.OrgSkill();
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgSkill getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrgSkill>
      PARSER = new com.google.protobuf.AbstractParser<OrgSkill>() {
    @java.lang.Override
    public OrgSkill parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrgSkill> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrgSkill> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.OrgSkill getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

