// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.WfmExportProcess}
 */
public final class WfmExportProcess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.WfmExportProcess)
    WfmExportProcessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WfmExportProcess.newBuilder() to construct.
  private WfmExportProcess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WfmExportProcess() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WfmExportProcess();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_WfmExportProcess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_WfmExportProcess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.WfmExportProcess.class, com.tcn.cloud.api.api.v0alpha.WfmExportProcess.Builder.class);
  }

  private int skillProfileCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object skillProfile_;
  public enum SkillProfileCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SINGLE(1),
    MULTI(2),
    SKILLPROFILE_NOT_SET(0);
    private final int value;
    private SkillProfileCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SkillProfileCase valueOf(int value) {
      return forNumber(value);
    }

    public static SkillProfileCase forNumber(int value) {
      switch (value) {
        case 1: return SINGLE;
        case 2: return MULTI;
        case 0: return SKILLPROFILE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SkillProfileCase
  getSkillProfileCase() {
    return SkillProfileCase.forNumber(
        skillProfileCase_);
  }

  public static final int SINGLE_FIELD_NUMBER = 1;
  /**
   * <code>int64 single = 1 [json_name = "single"];</code>
   * @return Whether the single field is set.
   */
  @java.lang.Override
  public boolean hasSingle() {
    return skillProfileCase_ == 1;
  }
  /**
   * <code>int64 single = 1 [json_name = "single"];</code>
   * @return The single.
   */
  @java.lang.Override
  public long getSingle() {
    if (skillProfileCase_ == 1) {
      return (java.lang.Long) skillProfile_;
    }
    return 0L;
  }

  public static final int MULTI_FIELD_NUMBER = 2;
  /**
   * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
   * @return Whether the multi field is set.
   */
  @java.lang.Override
  public boolean hasMulti() {
    return skillProfileCase_ == 2;
  }
  /**
   * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
   * @return The multi.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WfmMultiSkill getMulti() {
    if (skillProfileCase_ == 2) {
       return (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_;
    }
    return com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WfmMultiSkillOrBuilder getMultiOrBuilder() {
    if (skillProfileCase_ == 2) {
       return (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_;
    }
    return com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
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
    if (skillProfileCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) skillProfile_));
    }
    if (skillProfileCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillProfileCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) skillProfile_));
    }
    if (skillProfileCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.WfmExportProcess)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.WfmExportProcess other = (com.tcn.cloud.api.api.v0alpha.WfmExportProcess) obj;

    if (!getSkillProfileCase().equals(other.getSkillProfileCase())) return false;
    switch (skillProfileCase_) {
      case 1:
        if (getSingle()
            != other.getSingle()) return false;
        break;
      case 2:
        if (!getMulti()
            .equals(other.getMulti())) return false;
        break;
      case 0:
      default:
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
    switch (skillProfileCase_) {
      case 1:
        hash = (37 * hash) + SINGLE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSingle());
        break;
      case 2:
        hash = (37 * hash) + MULTI_FIELD_NUMBER;
        hash = (53 * hash) + getMulti().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.WfmExportProcess prototype) {
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
   * Protobuf type {@code api.v0alpha.WfmExportProcess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.WfmExportProcess)
      com.tcn.cloud.api.api.v0alpha.WfmExportProcessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_WfmExportProcess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_WfmExportProcess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.WfmExportProcess.class, com.tcn.cloud.api.api.v0alpha.WfmExportProcess.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.WfmExportProcess.newBuilder()
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
      if (multiBuilder_ != null) {
        multiBuilder_.clear();
      }
      skillProfileCase_ = 0;
      skillProfile_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_WfmExportProcess_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WfmExportProcess getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.WfmExportProcess.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WfmExportProcess build() {
      com.tcn.cloud.api.api.v0alpha.WfmExportProcess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WfmExportProcess buildPartial() {
      com.tcn.cloud.api.api.v0alpha.WfmExportProcess result = new com.tcn.cloud.api.api.v0alpha.WfmExportProcess(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.WfmExportProcess result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.WfmExportProcess result) {
      result.skillProfileCase_ = skillProfileCase_;
      result.skillProfile_ = this.skillProfile_;
      if (skillProfileCase_ == 2 &&
          multiBuilder_ != null) {
        result.skillProfile_ = multiBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.WfmExportProcess) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.WfmExportProcess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.WfmExportProcess other) {
      if (other == com.tcn.cloud.api.api.v0alpha.WfmExportProcess.getDefaultInstance()) return this;
      switch (other.getSkillProfileCase()) {
        case SINGLE: {
          setSingle(other.getSingle());
          break;
        }
        case MULTI: {
          mergeMulti(other.getMulti());
          break;
        }
        case SKILLPROFILE_NOT_SET: {
          break;
        }
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
              skillProfile_ = input.readInt64();
              skillProfileCase_ = 1;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMultiFieldBuilder().getBuilder(),
                  extensionRegistry);
              skillProfileCase_ = 2;
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
    private int skillProfileCase_ = 0;
    private java.lang.Object skillProfile_;
    public SkillProfileCase
        getSkillProfileCase() {
      return SkillProfileCase.forNumber(
          skillProfileCase_);
    }

    public Builder clearSkillProfile() {
      skillProfileCase_ = 0;
      skillProfile_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>int64 single = 1 [json_name = "single"];</code>
     * @return Whether the single field is set.
     */
    public boolean hasSingle() {
      return skillProfileCase_ == 1;
    }
    /**
     * <code>int64 single = 1 [json_name = "single"];</code>
     * @return The single.
     */
    public long getSingle() {
      if (skillProfileCase_ == 1) {
        return (java.lang.Long) skillProfile_;
      }
      return 0L;
    }
    /**
     * <code>int64 single = 1 [json_name = "single"];</code>
     * @param value The single to set.
     * @return This builder for chaining.
     */
    public Builder setSingle(long value) {

      skillProfileCase_ = 1;
      skillProfile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 single = 1 [json_name = "single"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSingle() {
      if (skillProfileCase_ == 1) {
        skillProfileCase_ = 0;
        skillProfile_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.WfmMultiSkill, com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.Builder, com.tcn.cloud.api.api.v0alpha.WfmMultiSkillOrBuilder> multiBuilder_;
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     * @return Whether the multi field is set.
     */
    @java.lang.Override
    public boolean hasMulti() {
      return skillProfileCase_ == 2;
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     * @return The multi.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WfmMultiSkill getMulti() {
      if (multiBuilder_ == null) {
        if (skillProfileCase_ == 2) {
          return (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_;
        }
        return com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
      } else {
        if (skillProfileCase_ == 2) {
          return multiBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    public Builder setMulti(com.tcn.cloud.api.api.v0alpha.WfmMultiSkill value) {
      if (multiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skillProfile_ = value;
        onChanged();
      } else {
        multiBuilder_.setMessage(value);
      }
      skillProfileCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    public Builder setMulti(
        com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.Builder builderForValue) {
      if (multiBuilder_ == null) {
        skillProfile_ = builderForValue.build();
        onChanged();
      } else {
        multiBuilder_.setMessage(builderForValue.build());
      }
      skillProfileCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    public Builder mergeMulti(com.tcn.cloud.api.api.v0alpha.WfmMultiSkill value) {
      if (multiBuilder_ == null) {
        if (skillProfileCase_ == 2 &&
            skillProfile_ != com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance()) {
          skillProfile_ = com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.newBuilder((com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_)
              .mergeFrom(value).buildPartial();
        } else {
          skillProfile_ = value;
        }
        onChanged();
      } else {
        if (skillProfileCase_ == 2) {
          multiBuilder_.mergeFrom(value);
        } else {
          multiBuilder_.setMessage(value);
        }
      }
      skillProfileCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    public Builder clearMulti() {
      if (multiBuilder_ == null) {
        if (skillProfileCase_ == 2) {
          skillProfileCase_ = 0;
          skillProfile_ = null;
          onChanged();
        }
      } else {
        if (skillProfileCase_ == 2) {
          skillProfileCase_ = 0;
          skillProfile_ = null;
        }
        multiBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.Builder getMultiBuilder() {
      return getMultiFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WfmMultiSkillOrBuilder getMultiOrBuilder() {
      if ((skillProfileCase_ == 2) && (multiBuilder_ != null)) {
        return multiBuilder_.getMessageOrBuilder();
      } else {
        if (skillProfileCase_ == 2) {
          return (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_;
        }
        return com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.WfmMultiSkill multi = 2 [json_name = "multi"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.WfmMultiSkill, com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.Builder, com.tcn.cloud.api.api.v0alpha.WfmMultiSkillOrBuilder> 
        getMultiFieldBuilder() {
      if (multiBuilder_ == null) {
        if (!(skillProfileCase_ == 2)) {
          skillProfile_ = com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.getDefaultInstance();
        }
        multiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.WfmMultiSkill, com.tcn.cloud.api.api.v0alpha.WfmMultiSkill.Builder, com.tcn.cloud.api.api.v0alpha.WfmMultiSkillOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.WfmMultiSkill) skillProfile_,
                getParentForChildren(),
                isClean());
        skillProfile_ = null;
      }
      skillProfileCase_ = 2;
      onChanged();
      return multiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.WfmExportProcess)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.WfmExportProcess)
  private static final com.tcn.cloud.api.api.v0alpha.WfmExportProcess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.WfmExportProcess();
  }

  public static com.tcn.cloud.api.api.v0alpha.WfmExportProcess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WfmExportProcess>
      PARSER = new com.google.protobuf.AbstractParser<WfmExportProcess>() {
    @java.lang.Override
    public WfmExportProcess parsePartialFrom(
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

  public static com.google.protobuf.Parser<WfmExportProcess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WfmExportProcess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WfmExportProcess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

