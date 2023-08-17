// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * AgentCallLogQuery is a query for the agent call log.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.AgentCallLogQuery}
 */
public final class AgentCallLogQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.AgentCallLogQuery)
    AgentCallLogQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentCallLogQuery.newBuilder() to construct.
  private AgentCallLogQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentCallLogQuery() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentCallLogQuery();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_AgentCallLogQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_AgentCallLogQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.Builder.class);
  }

  private int bitField0_;
  public static final int CALL_SKILLS_INITIAL_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery callSkillsInitial_;
  /**
   * <pre>
   * call skills initial will query the initial call skills.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   * @return Whether the callSkillsInitial field is set.
   */
  @java.lang.Override
  public boolean hasCallSkillsInitial() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * call skills initial will query the initial call skills.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   * @return The callSkillsInitial.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery getCallSkillsInitial() {
    return callSkillsInitial_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.getDefaultInstance() : callSkillsInitial_;
  }
  /**
   * <pre>
   * call skills initial will query the initial call skills.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQueryOrBuilder getCallSkillsInitialOrBuilder() {
    return callSkillsInitial_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.getDefaultInstance() : callSkillsInitial_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCallSkillsInitial());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCallSkillsInitial());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery) obj;

    if (hasCallSkillsInitial() != other.hasCallSkillsInitial()) return false;
    if (hasCallSkillsInitial()) {
      if (!getCallSkillsInitial()
          .equals(other.getCallSkillsInitial())) return false;
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
    if (hasCallSkillsInitial()) {
      hash = (37 * hash) + CALL_SKILLS_INITIAL_FIELD_NUMBER;
      hash = (53 * hash) + getCallSkillsInitial().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery prototype) {
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
   * AgentCallLogQuery is a query for the agent call log.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.AgentCallLogQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.AgentCallLogQuery)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_AgentCallLogQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_AgentCallLogQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCallSkillsInitialFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      callSkillsInitial_ = null;
      if (callSkillsInitialBuilder_ != null) {
        callSkillsInitialBuilder_.dispose();
        callSkillsInitialBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_AgentCallLogQuery_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callSkillsInitial_ = callSkillsInitialBuilder_ == null
            ? callSkillsInitial_
            : callSkillsInitialBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery.getDefaultInstance()) return this;
      if (other.hasCallSkillsInitial()) {
        mergeCallSkillsInitial(other.getCallSkillsInitial());
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
                  getCallSkillsInitialFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery callSkillsInitial_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQueryOrBuilder> callSkillsInitialBuilder_;
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     * @return Whether the callSkillsInitial field is set.
     */
    public boolean hasCallSkillsInitial() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     * @return The callSkillsInitial.
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery getCallSkillsInitial() {
      if (callSkillsInitialBuilder_ == null) {
        return callSkillsInitial_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.getDefaultInstance() : callSkillsInitial_;
      } else {
        return callSkillsInitialBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public Builder setCallSkillsInitial(com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery value) {
      if (callSkillsInitialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callSkillsInitial_ = value;
      } else {
        callSkillsInitialBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public Builder setCallSkillsInitial(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.Builder builderForValue) {
      if (callSkillsInitialBuilder_ == null) {
        callSkillsInitial_ = builderForValue.build();
      } else {
        callSkillsInitialBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public Builder mergeCallSkillsInitial(com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery value) {
      if (callSkillsInitialBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          callSkillsInitial_ != null &&
          callSkillsInitial_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.getDefaultInstance()) {
          getCallSkillsInitialBuilder().mergeFrom(value);
        } else {
          callSkillsInitial_ = value;
        }
      } else {
        callSkillsInitialBuilder_.mergeFrom(value);
      }
      if (callSkillsInitial_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public Builder clearCallSkillsInitial() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callSkillsInitial_ = null;
      if (callSkillsInitialBuilder_ != null) {
        callSkillsInitialBuilder_.dispose();
        callSkillsInitialBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.Builder getCallSkillsInitialBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallSkillsInitialFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQueryOrBuilder getCallSkillsInitialOrBuilder() {
      if (callSkillsInitialBuilder_ != null) {
        return callSkillsInitialBuilder_.getMessageOrBuilder();
      } else {
        return callSkillsInitial_ == null ?
            com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.getDefaultInstance() : callSkillsInitial_;
      }
    }
    /**
     * <pre>
     * call skills initial will query the initial call skills.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.CallSkillsInitialQuery call_skills_initial = 1 [json_name = "callSkillsInitial"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQueryOrBuilder> 
        getCallSkillsInitialFieldBuilder() {
      if (callSkillsInitialBuilder_ == null) {
        callSkillsInitialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQuery.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.CallSkillsInitialQueryOrBuilder>(
                getCallSkillsInitial(),
                getParentForChildren(),
                isClean());
        callSkillsInitial_ = null;
      }
      return callSkillsInitialBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.AgentCallLogQuery)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.AgentCallLogQuery)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentCallLogQuery>
      PARSER = new com.google.protobuf.AbstractParser<AgentCallLogQuery>() {
    @java.lang.Override
    public AgentCallLogQuery parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentCallLogQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentCallLogQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.AgentCallLogQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

