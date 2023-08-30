// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Message type specifying information regarding the skill that will associated with
 * SkillProfile and other entities.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.Skill}
 */
public final class Skill extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.Skill)
    SkillOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Skill.newBuilder() to construct.
  private Skill(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Skill() {
    clientSkillType_ = 0;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Skill();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_Skill_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_Skill_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.Skill.class, com.tcn.cloud.api.api.v1alpha1.wfm.Skill.Builder.class);
  }

  public static final int SKILL_SID_FIELD_NUMBER = 1;
  private long skillSid_ = 0L;
  /**
   * <pre>
   * ID of the skill profile skill.
   * </pre>
   *
   * <code>int64 skill_sid = 1 [json_name = "skillSid"];</code>
   * @return The skillSid.
   */
  @java.lang.Override
  public long getSkillSid() {
    return skillSid_;
  }

  public static final int CLIENT_SKILL_TYPE_FIELD_NUMBER = 2;
  private int clientSkillType_ = 0;
  /**
   * <pre>
   * type of the skill.
   * </pre>
   *
   * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
   * @return The enum numeric value on the wire for clientSkillType.
   */
  @java.lang.Override public int getClientSkillTypeValue() {
    return clientSkillType_;
  }
  /**
   * <pre>
   * type of the skill.
   * </pre>
   *
   * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
   * @return The clientSkillType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.SkillType.Enum getClientSkillType() {
    com.tcn.cloud.api.api.commons.SkillType.Enum result = com.tcn.cloud.api.api.commons.SkillType.Enum.forNumber(clientSkillType_);
    return result == null ? com.tcn.cloud.api.api.commons.SkillType.Enum.UNRECOGNIZED : result;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * skill name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * skill name.
   * </pre>
   *
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELETE_DATE_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp deleteDate_;
  /**
   * <pre>
   * approximate date that the skill was deleted, if absent, the skill has not been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
   * @return Whether the deleteDate field is set.
   */
  @java.lang.Override
  public boolean hasDeleteDate() {
    return deleteDate_ != null;
  }
  /**
   * <pre>
   * approximate date that the skill was deleted, if absent, the skill has not been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
   * @return The deleteDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDeleteDate() {
    return deleteDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : deleteDate_;
  }
  /**
   * <pre>
   * approximate date that the skill was deleted, if absent, the skill has not been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDeleteDateOrBuilder() {
    return deleteDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : deleteDate_;
  }

  public static final int CLIENT_SKILL_SID_FIELD_NUMBER = 5;
  private long clientSkillSid_ = 0L;
  /**
   * <pre>
   * ID of the skill (as shown in backoffice) for the given skill type (agent, PBX, hunt_group, etc).
   * </pre>
   *
   * <code>int64 client_skill_sid = 5 [json_name = "clientSkillSid"];</code>
   * @return The clientSkillSid.
   */
  @java.lang.Override
  public long getClientSkillSid() {
    return clientSkillSid_;
  }

  public static final int PROFICIENCY_FIELD_NUMBER = 6;
  private int proficiency_ = 0;
  /**
   * <pre>
   * Proficiency that this skill has for the skill profile containing it.
   * This field will only be set when this skill is contained within a SkillProfile.
   * </pre>
   *
   * <code>int32 proficiency = 6 [json_name = "proficiency"];</code>
   * @return The proficiency.
   */
  @java.lang.Override
  public int getProficiency() {
    return proficiency_;
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
    if (clientSkillType_ != com.tcn.cloud.api.api.commons.SkillType.Enum.AGENT_SKILL.getNumber()) {
      output.writeEnum(2, clientSkillType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (deleteDate_ != null) {
      output.writeMessage(4, getDeleteDate());
    }
    if (clientSkillSid_ != 0L) {
      output.writeInt64(5, clientSkillSid_);
    }
    if (proficiency_ != 0) {
      output.writeInt32(6, proficiency_);
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
    if (clientSkillType_ != com.tcn.cloud.api.api.commons.SkillType.Enum.AGENT_SKILL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, clientSkillType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (deleteDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDeleteDate());
    }
    if (clientSkillSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, clientSkillSid_);
    }
    if (proficiency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, proficiency_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.Skill)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.Skill other = (com.tcn.cloud.api.api.v1alpha1.wfm.Skill) obj;

    if (getSkillSid()
        != other.getSkillSid()) return false;
    if (clientSkillType_ != other.clientSkillType_) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasDeleteDate() != other.hasDeleteDate()) return false;
    if (hasDeleteDate()) {
      if (!getDeleteDate()
          .equals(other.getDeleteDate())) return false;
    }
    if (getClientSkillSid()
        != other.getClientSkillSid()) return false;
    if (getProficiency()
        != other.getProficiency()) return false;
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
    hash = (37 * hash) + CLIENT_SKILL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + clientSkillType_;
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDeleteDate()) {
      hash = (37 * hash) + DELETE_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeleteDate().hashCode();
    }
    hash = (37 * hash) + CLIENT_SKILL_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientSkillSid());
    hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
    hash = (53 * hash) + getProficiency();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.Skill prototype) {
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
   * Message type specifying information regarding the skill that will associated with
   * SkillProfile and other entities.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.Skill}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.Skill)
      com.tcn.cloud.api.api.v1alpha1.wfm.SkillOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_Skill_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_Skill_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.Skill.class, com.tcn.cloud.api.api.v1alpha1.wfm.Skill.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.Skill.newBuilder()
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
      clientSkillType_ = 0;
      name_ = "";
      deleteDate_ = null;
      if (deleteDateBuilder_ != null) {
        deleteDateBuilder_.dispose();
        deleteDateBuilder_ = null;
      }
      clientSkillSid_ = 0L;
      proficiency_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_Skill_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.Skill getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.Skill.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.Skill build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.Skill result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.Skill buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.Skill result = new com.tcn.cloud.api.api.v1alpha1.wfm.Skill(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.Skill result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.skillSid_ = skillSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientSkillType_ = clientSkillType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.deleteDate_ = deleteDateBuilder_ == null
            ? deleteDate_
            : deleteDateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.clientSkillSid_ = clientSkillSid_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.proficiency_ = proficiency_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.Skill) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.Skill)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.Skill other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.Skill.getDefaultInstance()) return this;
      if (other.getSkillSid() != 0L) {
        setSkillSid(other.getSkillSid());
      }
      if (other.clientSkillType_ != 0) {
        setClientSkillTypeValue(other.getClientSkillTypeValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasDeleteDate()) {
        mergeDeleteDate(other.getDeleteDate());
      }
      if (other.getClientSkillSid() != 0L) {
        setClientSkillSid(other.getClientSkillSid());
      }
      if (other.getProficiency() != 0) {
        setProficiency(other.getProficiency());
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
            case 16: {
              clientSkillType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getDeleteDateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              clientSkillSid_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              proficiency_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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
     * ID of the skill profile skill.
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
     * ID of the skill profile skill.
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
     * ID of the skill profile skill.
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

    private int clientSkillType_ = 0;
    /**
     * <pre>
     * type of the skill.
     * </pre>
     *
     * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
     * @return The enum numeric value on the wire for clientSkillType.
     */
    @java.lang.Override public int getClientSkillTypeValue() {
      return clientSkillType_;
    }
    /**
     * <pre>
     * type of the skill.
     * </pre>
     *
     * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
     * @param value The enum numeric value on the wire for clientSkillType to set.
     * @return This builder for chaining.
     */
    public Builder setClientSkillTypeValue(int value) {
      clientSkillType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type of the skill.
     * </pre>
     *
     * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
     * @return The clientSkillType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.SkillType.Enum getClientSkillType() {
      com.tcn.cloud.api.api.commons.SkillType.Enum result = com.tcn.cloud.api.api.commons.SkillType.Enum.forNumber(clientSkillType_);
      return result == null ? com.tcn.cloud.api.api.commons.SkillType.Enum.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * type of the skill.
     * </pre>
     *
     * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
     * @param value The clientSkillType to set.
     * @return This builder for chaining.
     */
    public Builder setClientSkillType(com.tcn.cloud.api.api.commons.SkillType.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      clientSkillType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type of the skill.
     * </pre>
     *
     * <code>.api.commons.SkillType.Enum client_skill_type = 2 [json_name = "clientSkillType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSkillType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clientSkillType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * skill name.
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * skill name.
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * skill name.
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * skill name.
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * skill name.
     * </pre>
     *
     * <code>string name = 3 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp deleteDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> deleteDateBuilder_;
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     * @return Whether the deleteDate field is set.
     */
    public boolean hasDeleteDate() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     * @return The deleteDate.
     */
    public com.google.protobuf.Timestamp getDeleteDate() {
      if (deleteDateBuilder_ == null) {
        return deleteDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : deleteDate_;
      } else {
        return deleteDateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public Builder setDeleteDate(com.google.protobuf.Timestamp value) {
      if (deleteDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deleteDate_ = value;
      } else {
        deleteDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public Builder setDeleteDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (deleteDateBuilder_ == null) {
        deleteDate_ = builderForValue.build();
      } else {
        deleteDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public Builder mergeDeleteDate(com.google.protobuf.Timestamp value) {
      if (deleteDateBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          deleteDate_ != null &&
          deleteDate_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDeleteDateBuilder().mergeFrom(value);
        } else {
          deleteDate_ = value;
        }
      } else {
        deleteDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public Builder clearDeleteDate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      deleteDate_ = null;
      if (deleteDateBuilder_ != null) {
        deleteDateBuilder_.dispose();
        deleteDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDeleteDateBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDeleteDateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDeleteDateOrBuilder() {
      if (deleteDateBuilder_ != null) {
        return deleteDateBuilder_.getMessageOrBuilder();
      } else {
        return deleteDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : deleteDate_;
      }
    }
    /**
     * <pre>
     * approximate date that the skill was deleted, if absent, the skill has not been deleted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp delete_date = 4 [json_name = "deleteDate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDeleteDateFieldBuilder() {
      if (deleteDateBuilder_ == null) {
        deleteDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDeleteDate(),
                getParentForChildren(),
                isClean());
        deleteDate_ = null;
      }
      return deleteDateBuilder_;
    }

    private long clientSkillSid_ ;
    /**
     * <pre>
     * ID of the skill (as shown in backoffice) for the given skill type (agent, PBX, hunt_group, etc).
     * </pre>
     *
     * <code>int64 client_skill_sid = 5 [json_name = "clientSkillSid"];</code>
     * @return The clientSkillSid.
     */
    @java.lang.Override
    public long getClientSkillSid() {
      return clientSkillSid_;
    }
    /**
     * <pre>
     * ID of the skill (as shown in backoffice) for the given skill type (agent, PBX, hunt_group, etc).
     * </pre>
     *
     * <code>int64 client_skill_sid = 5 [json_name = "clientSkillSid"];</code>
     * @param value The clientSkillSid to set.
     * @return This builder for chaining.
     */
    public Builder setClientSkillSid(long value) {

      clientSkillSid_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the skill (as shown in backoffice) for the given skill type (agent, PBX, hunt_group, etc).
     * </pre>
     *
     * <code>int64 client_skill_sid = 5 [json_name = "clientSkillSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSkillSid() {
      bitField0_ = (bitField0_ & ~0x00000010);
      clientSkillSid_ = 0L;
      onChanged();
      return this;
    }

    private int proficiency_ ;
    /**
     * <pre>
     * Proficiency that this skill has for the skill profile containing it.
     * This field will only be set when this skill is contained within a SkillProfile.
     * </pre>
     *
     * <code>int32 proficiency = 6 [json_name = "proficiency"];</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
    }
    /**
     * <pre>
     * Proficiency that this skill has for the skill profile containing it.
     * This field will only be set when this skill is contained within a SkillProfile.
     * </pre>
     *
     * <code>int32 proficiency = 6 [json_name = "proficiency"];</code>
     * @param value The proficiency to set.
     * @return This builder for chaining.
     */
    public Builder setProficiency(int value) {

      proficiency_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Proficiency that this skill has for the skill profile containing it.
     * This field will only be set when this skill is contained within a SkillProfile.
     * </pre>
     *
     * <code>int32 proficiency = 6 [json_name = "proficiency"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProficiency() {
      bitField0_ = (bitField0_ & ~0x00000020);
      proficiency_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.Skill)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.Skill)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.Skill DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.Skill();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.Skill getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Skill>
      PARSER = new com.google.protobuf.AbstractParser<Skill>() {
    @java.lang.Override
    public Skill parsePartialFrom(
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

  public static com.google.protobuf.Parser<Skill> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Skill> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.Skill getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

