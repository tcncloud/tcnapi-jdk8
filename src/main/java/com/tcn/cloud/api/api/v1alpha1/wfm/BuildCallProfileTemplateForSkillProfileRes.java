// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the BuildCallProfileTemplateForSkillProfile RPC.
 * DEPRECATED as of Sep/7/2023 - Use BuildCallProfileTemplate instead.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes}
 */
@java.lang.Deprecated public final class BuildCallProfileTemplateForSkillProfileRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)
    BuildCallProfileTemplateForSkillProfileResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildCallProfileTemplateForSkillProfileRes.newBuilder() to construct.
  private BuildCallProfileTemplateForSkillProfileRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildCallProfileTemplateForSkillProfileRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildCallProfileTemplateForSkillProfileRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateForSkillProfileRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateForSkillProfileRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.Builder.class);
  }

  public static final int CALL_PROFILE_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate callProfileTemplate_;
  /**
   * <pre>
   * call profile template found in the training data set.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return Whether the callProfileTemplate field is set.
   */
  @java.lang.Override
  public boolean hasCallProfileTemplate() {
    return callProfileTemplate_ != null;
  }
  /**
   * <pre>
   * call profile template found in the training data set.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return The callProfileTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate() {
    return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
  }
  /**
   * <pre>
   * call profile template found in the training data set.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder() {
    return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
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
    if (callProfileTemplate_ != null) {
      output.writeMessage(1, getCallProfileTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callProfileTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCallProfileTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes) obj;

    if (hasCallProfileTemplate() != other.hasCallProfileTemplate()) return false;
    if (hasCallProfileTemplate()) {
      if (!getCallProfileTemplate()
          .equals(other.getCallProfileTemplate())) return false;
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
    if (hasCallProfileTemplate()) {
      hash = (37 * hash) + CALL_PROFILE_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getCallProfileTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes prototype) {
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
   * Response message for the BuildCallProfileTemplateForSkillProfile RPC.
   * DEPRECATED as of Sep/7/2023 - Use BuildCallProfileTemplate instead.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateForSkillProfileRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateForSkillProfileRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.newBuilder()
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
      callProfileTemplate_ = null;
      if (callProfileTemplateBuilder_ != null) {
        callProfileTemplateBuilder_.dispose();
        callProfileTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildCallProfileTemplateForSkillProfileRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callProfileTemplate_ = callProfileTemplateBuilder_ == null
            ? callProfileTemplate_
            : callProfileTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes.getDefaultInstance()) return this;
      if (other.hasCallProfileTemplate()) {
        mergeCallProfileTemplate(other.getCallProfileTemplate());
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
                  getCallProfileTemplateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate callProfileTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder> callProfileTemplateBuilder_;
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     * @return Whether the callProfileTemplate field is set.
     */
    public boolean hasCallProfileTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     * @return The callProfileTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate() {
      if (callProfileTemplateBuilder_ == null) {
        return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
      } else {
        return callProfileTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder setCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate value) {
      if (callProfileTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callProfileTemplate_ = value;
      } else {
        callProfileTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder setCallProfileTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder builderForValue) {
      if (callProfileTemplateBuilder_ == null) {
        callProfileTemplate_ = builderForValue.build();
      } else {
        callProfileTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder mergeCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate value) {
      if (callProfileTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          callProfileTemplate_ != null &&
          callProfileTemplate_ != com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance()) {
          getCallProfileTemplateBuilder().mergeFrom(value);
        } else {
          callProfileTemplate_ = value;
        }
      } else {
        callProfileTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder clearCallProfileTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callProfileTemplate_ = null;
      if (callProfileTemplateBuilder_ != null) {
        callProfileTemplateBuilder_.dispose();
        callProfileTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder getCallProfileTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallProfileTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder() {
      if (callProfileTemplateBuilder_ != null) {
        return callProfileTemplateBuilder_.getMessageOrBuilder();
      } else {
        return callProfileTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
      }
    }
    /**
     * <pre>
     * call profile template found in the training data set.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder> 
        getCallProfileTemplateFieldBuilder() {
      if (callProfileTemplateBuilder_ == null) {
        callProfileTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder>(
                getCallProfileTemplate(),
                getParentForChildren(),
                isClean());
        callProfileTemplate_ = null;
      }
      return callProfileTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildCallProfileTemplateForSkillProfileRes>
      PARSER = new com.google.protobuf.AbstractParser<BuildCallProfileTemplateForSkillProfileRes>() {
    @java.lang.Override
    public BuildCallProfileTemplateForSkillProfileRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildCallProfileTemplateForSkillProfileRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildCallProfileTemplateForSkillProfileRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BuildCallProfileTemplateForSkillProfileRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

